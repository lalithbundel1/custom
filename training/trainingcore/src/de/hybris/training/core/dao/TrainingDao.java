/**
 *
 */


/**
* @author Intuser
 *
 */

package de.hybris.training.core.dao;


import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.training.core.model.TrainingEmployeeModel;

import java.util.List;


public interface TrainingDao
{
	public List<TrainingEmployeeModel> getAllEmployee(int pageid);

	public TrainingEmployeeModel getEmployeeWithId(String pressId);

	public int getTotal();

}
