package com.gllab.departments.util;

import java.util.ResourceBundle;

/**
 * Utility class for Standard messages
 * 
 * @author fullstack8
 *
 */
public final class MessageUtil {
	
	public static ResourceBundle bundle = ResourceBundle.getBundle("messages");
	
	public static String MSG_SUPER_DEPTNAME = bundle.getString("MSG_SUPER_DEPTNAME");
	public static String MSG_SUPER_TODAY_HOLIDAY = bundle.getString("MSG_SUPER_TODAY_HOLIDAY");	
	public static String MSG_SUPER_TODAY_WORKDAY = bundle.getString("MSG_SUPER_TODAY_WORKDAY");
	public static String MSG_SUPER_WORK_DEADLINE = bundle.getString("MSG_SUPER_WORK_DEADLINE");
	public static String MSG_SUPER_TODAYS_WORK = bundle.getString("MSG_SUPER_TODAYS_WORK");
	public static String MSG_ADMIN_DEPTNAME = bundle.getString("MSG_ADMIN_DEPTNAME");	
	public static String MSG_ADMIN_TODAYS_WORK = bundle.getString("MSG_ADMIN_TODAYS_WORK");
	public static String MSG_ADMIN_WORK_DEADLINE = bundle.getString("MSG_ADMIN_WORK_DEADLINE");
	public static String MSG_HR_DEPTNAME = bundle.getString("MSG_HR_DEPTNAME");
	public static String MSG_HR_TODAYS_WORK = bundle.getString("MSG_HR_TODAYS_WORK");
	public static String MSG_HR_WORK_DEADLINE = bundle.getString("MSG_HR_WORK_DEADLINE");
	public static String MSG_HR_DO_ACTIVITY = bundle.getString("MSG_HR_DO_ACTIVITY");
	public static String MSG_TECH_DEPTNAME = bundle.getString("MSG_TECH_DEPTNAME");
	public static String MSG_TECH_TODAYS_WORK = bundle.getString("MSG_TECH_TODAYS_WORK");
	public static String MSG_TECH_WORK_DEADLINE = bundle.getString("MSG_TECH_WORK_DEADLINE");
	public static String MSG_TECH_STACK_INFO = bundle.getString("MSG_TECH_STACK_INFO");
	
}
