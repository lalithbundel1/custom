/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Aug 3, 2018 10:32:39 AM                     ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 *  
 */
package de.hybris.training.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.training.core.constants.TrainingCoreConstants;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem TrainingEmployee}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTrainingEmployee extends GenericItem
{
	/** Qualifier of the <code>TrainingEmployee.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>TrainingEmployee.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>TrainingEmployee.designation</code> attribute **/
	public static final String DESIGNATION = "designation";
	/** Qualifier of the <code>TrainingEmployee.Pfnumber</code> attribute **/
	public static final String PFNUMBER = "Pfnumber";
	/** Qualifier of the <code>TrainingEmployee.reportingManager</code> attribute **/
	public static final String REPORTINGMANAGER = "reportingManager";
	/** Qualifier of the <code>TrainingEmployee.joiningDate</code> attribute **/
	public static final String JOININGDATE = "joiningDate";
	/** Qualifier of the <code>TrainingEmployee.confDate</code> attribute **/
	public static final String CONFDATE = "confDate";
	/** Qualifier of the <code>TrainingEmployee.active</code> attribute **/
	public static final String ACTIVE = "active";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(DESIGNATION, AttributeMode.INITIAL);
		tmp.put(PFNUMBER, AttributeMode.INITIAL);
		tmp.put(REPORTINGMANAGER, AttributeMode.INITIAL);
		tmp.put(JOININGDATE, AttributeMode.INITIAL);
		tmp.put(CONFDATE, AttributeMode.INITIAL);
		tmp.put(ACTIVE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingEmployee.active</code> attribute.
	 * @return the active
	 */
	public Boolean isActive(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ACTIVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingEmployee.active</code> attribute.
	 * @return the active
	 */
	public Boolean isActive()
	{
		return isActive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingEmployee.active</code> attribute. 
	 * @return the active
	 */
	public boolean isActiveAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isActive( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingEmployee.active</code> attribute. 
	 * @return the active
	 */
	public boolean isActiveAsPrimitive()
	{
		return isActiveAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingEmployee.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ACTIVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingEmployee.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final Boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingEmployee.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final SessionContext ctx, final boolean value)
	{
		setActive( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingEmployee.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingEmployee.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingEmployee.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingEmployee.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingEmployee.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingEmployee.confDate</code> attribute.
	 * @return the confDate
	 */
	public Date getConfDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CONFDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingEmployee.confDate</code> attribute.
	 * @return the confDate
	 */
	public Date getConfDate()
	{
		return getConfDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingEmployee.confDate</code> attribute. 
	 * @param value the confDate
	 */
	public void setConfDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CONFDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingEmployee.confDate</code> attribute. 
	 * @param value the confDate
	 */
	public void setConfDate(final Date value)
	{
		setConfDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingEmployee.designation</code> attribute.
	 * @return the designation
	 */
	public String getDesignation(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESIGNATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingEmployee.designation</code> attribute.
	 * @return the designation
	 */
	public String getDesignation()
	{
		return getDesignation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingEmployee.designation</code> attribute. 
	 * @param value the designation
	 */
	public void setDesignation(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESIGNATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingEmployee.designation</code> attribute. 
	 * @param value the designation
	 */
	public void setDesignation(final String value)
	{
		setDesignation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingEmployee.joiningDate</code> attribute.
	 * @return the joiningDate
	 */
	public Date getJoiningDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, JOININGDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingEmployee.joiningDate</code> attribute.
	 * @return the joiningDate
	 */
	public Date getJoiningDate()
	{
		return getJoiningDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingEmployee.joiningDate</code> attribute. 
	 * @param value the joiningDate
	 */
	public void setJoiningDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, JOININGDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingEmployee.joiningDate</code> attribute. 
	 * @param value the joiningDate
	 */
	public void setJoiningDate(final Date value)
	{
		setJoiningDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingEmployee.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingEmployee.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingEmployee.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingEmployee.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingEmployee.Pfnumber</code> attribute.
	 * @return the Pfnumber
	 */
	public String getPfnumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PFNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingEmployee.Pfnumber</code> attribute.
	 * @return the Pfnumber
	 */
	public String getPfnumber()
	{
		return getPfnumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingEmployee.Pfnumber</code> attribute. 
	 * @param value the Pfnumber
	 */
	public void setPfnumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PFNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingEmployee.Pfnumber</code> attribute. 
	 * @param value the Pfnumber
	 */
	public void setPfnumber(final String value)
	{
		setPfnumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingEmployee.reportingManager</code> attribute.
	 * @return the reportingManager
	 */
	public String getReportingManager(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REPORTINGMANAGER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingEmployee.reportingManager</code> attribute.
	 * @return the reportingManager
	 */
	public String getReportingManager()
	{
		return getReportingManager( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingEmployee.reportingManager</code> attribute. 
	 * @param value the reportingManager
	 */
	public void setReportingManager(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REPORTINGMANAGER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingEmployee.reportingManager</code> attribute. 
	 * @param value the reportingManager
	 */
	public void setReportingManager(final String value)
	{
		setReportingManager( getSession().getSessionContext(), value );
	}
	
}
