/**
 *
 */


/**
* @author Intuser
 *
 */

package de.hybris.training.core.service;


import de.hybris.training.core.model.TrainingEmployeeModel;

import java.util.List;


public interface TrainingService
{
	public List<TrainingEmployeeModel> getAllEmployee(int pageid);

	public TrainingEmployeeModel getEmployeeWithId(String pressId);

	public int getTotal();





}
