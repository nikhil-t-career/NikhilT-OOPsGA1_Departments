package com.gllab.departments.entity;
import static com.gllab.departments.util.MessageUtil.MSG_SUPER_DEPTNAME;
import static com.gllab.departments.util.MessageUtil.MSG_SUPER_TODAYS_WORK;
import static com.gllab.departments.util.MessageUtil.MSG_SUPER_WORK_DEADLINE;

import com.gllab.departments.entity.service.DepartmentServices;

/**
 * Super department has 4 methods
 * 
 * Abstract as it's direct instance must not exist.
 *  
 * i) departmentName 
 * ii) getTodaysWork 
 * iii)getWorkDeadline 
 * iv) isTodayAHoliday
 * 
 * @author fullstack8
 *
 */
public abstract class SuperDepartment {

	public String departmentName() {
		return MSG_SUPER_DEPTNAME;
	}

	public String getTodaysWork() {
		return MSG_SUPER_TODAYS_WORK;
	}

	public String getWorkDeadline() {
		return MSG_SUPER_WORK_DEADLINE;
	}

	public String isTodayAHoliday() {
		return DepartmentServices.isTodayWeekendHoliday();
	}

}
