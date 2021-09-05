package com.gllab.departments.entity;

import static com.gllab.departments.util.MessageUtil.MSG_TECH_DEPTNAME;
import static com.gllab.departments.util.MessageUtil.MSG_TECH_STACK_INFO;
import static com.gllab.departments.util.MessageUtil.MSG_TECH_TODAYS_WORK;
import static com.gllab.departments.util.MessageUtil.MSG_TECH_WORK_DEADLINE;

/**
 * Singleton class of TECH Department
 * 
 * @author fullstack8
 *
 */
public final class TechDepartment extends SuperDepartment {

	private static final TechDepartment TECH_DEPT = new TechDepartment();

	private TechDepartment() {

	}

	@Override
	public String departmentName() {
		return MSG_TECH_DEPTNAME;
	}

	@Override
	public String getTodaysWork() {
		return MSG_TECH_TODAYS_WORK;
	}

	@Override
	public String getWorkDeadline() {
		return MSG_TECH_WORK_DEADLINE;
	}

	public String getTechStackInformation() {
		return MSG_TECH_STACK_INFO;
	}

	public static TechDepartment getInstance() {

		return TECH_DEPT;
	}
}
