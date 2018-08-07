/**
 *
 */
package de.hybris.training.core.service.impl;



import de.hybris.platform.cms2.servicelayer.services.CMSSiteService;
import de.hybris.platform.servicelayer.session.SessionService;
import de.hybris.platform.util.Config;
import de.hybris.training.core.dao.TrainingDao;
import de.hybris.training.core.model.TrainingEmployeeModel;
import de.hybris.training.core.service.TrainingService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;



/**
 * @author Lalith
 *
 */
public class DefaultTrainingService implements TrainingService
{

	private static final Logger LOG = Logger.getLogger(DefaultTrainingService.class);

	@Autowired
	private SessionService sessionService;


	private static final String catalogId = Config.getParameter("corsairContentCatalog");

	private TrainingDao trainingDao;


	@Resource
	private CMSSiteService cmsSiteService;

	public void setTrainingDao(final TrainingDao trainingDao)
	{
		this.trainingDao = trainingDao;
	}


	@Override
	public List<TrainingEmployeeModel> getAllEmployee(final int pageid)
	{

		return trainingDao.getAllEmployee(pageid);
	}

	@Override
	public int getTotal() {
		return trainingDao.getTotal();
	}



	@Override
	public TrainingEmployeeModel getEmployeeWithId(final String pressId)
	{

		final TrainingEmployeeModel pressList = trainingDao.getEmployeeWithId(pressId);
		if (pressList != null)
		{
			return pressList;
		}
		return null;
	}


	public CMSSiteService getCmsSiteService()
	{
		return cmsSiteService;
	}

	public void setCmsSiteService(final CMSSiteService cmsSiteService)
	{
		this.cmsSiteService = cmsSiteService;
	}


}
