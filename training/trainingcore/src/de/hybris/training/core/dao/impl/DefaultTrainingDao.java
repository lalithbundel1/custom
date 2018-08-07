/**
 * @author Intuser
 *
 */

package de.hybris.training.core.dao.impl;


import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.training.core.dao.TrainingDao;
import de.hybris.training.core.model.TrainingEmployeeModel;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class DefaultTrainingDao implements TrainingDao
{

	@Autowired
	private FlexibleSearchService flexibleSearchService;

	private static final Logger LOG = Logger.getLogger(DefaultTrainingDao.class);


	@Override
	public List<TrainingEmployeeModel> getAllEmployee(final int pageid)
	{

		int start = 0;
		final int range = 6;
		int total; //total no of records
		final int pageNo;
		String nsearch = null;
		

		if (pageid == 1)
		{
			start = 0;
		}
		else
		{
			pageNo = pageid - 1;
			start = pageNo * range;
		}


		final StringBuilder builder = new StringBuilder();

		builder.append("SELECT {n:").append(TrainingEmployeeModel.PK).append("} ");
		builder.append("FROM {").append(TrainingEmployeeModel._TYPECODE).append(" AS n} ");



		final FlexibleSearchQuery query = new FlexibleSearchQuery(builder.toString());



		query.setCount(range);
		query.setNeedTotal(true);
		total = flexibleSearchService.search(query).getTotalCount();
		do
		{
			query.setStart(start);
			start += range;
			return flexibleSearchService.<TrainingEmployeeModel> search(query).getResult();

		}
		while (start < total);


	}




	@Override
	public int getTotal()
	{
		int total;
		String nsearch = null;
		
		final StringBuilder builder = new StringBuilder();
		builder.append("SELECT {n:").append(TrainingEmployeeModel.PK).append("} ");
		builder.append("FROM {").append(TrainingEmployeeModel._TYPECODE).append(" AS n} ");
		
		final FlexibleSearchQuery query = new FlexibleSearchQuery(builder.toString());
		
		total = flexibleSearchService.search(query).getTotalCount();
		total = total / 6;
		total = total % 6 >= 0 ? total + 1 : total;

		return total;

	}


	@Override
	public TrainingEmployeeModel getEmployeeWithId(final String Id)
	{
		final StringBuilder builder = new StringBuilder();
		builder.append("SELECT {n:").append(TrainingEmployeeModel.PK).append("} ");
		builder.append("FROM {").append(TrainingEmployeeModel._TYPECODE).append(" AS n} ");
		builder.append("WHERE {n:").append(TrainingEmployeeModel.CODE).append("}=?Id ");

		final FlexibleSearchQuery query = new FlexibleSearchQuery(builder.toString());
		query.addQueryParameter("Id", Id);

		return flexibleSearchService.<TrainingEmployeeModel> search(query).getResult().get(0);
	}
}
