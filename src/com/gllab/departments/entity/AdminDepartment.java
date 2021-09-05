package com.gllab.departments.entity;

import static com.gllab.departments.util.MessageUtil.MSG_ADMIN_DEPTNAME;
import static com.gllab.departments.util.MessageUtil.MSG_ADMIN_TODAYS_WORK;
import static com.gllab.departments.util.MessageUtil.MSG_ADMIN_WORK_DEADLINE;

/**
 * Singleton class of ADMIN Department
 * 
 * @author fullstack8
 *
 */
public final class AdminDepartment extends SuperDepartment {

	private static final AdminDepartment ADMIN_DEPT = new AdminDepartment();

	private AdminDepartment() {

	}

	@Override
	public String departmentName() {
		return MSG_ADMIN_DEPTNAME;
	}

	@Override
	public String getTodaysWork() {
		return MSG_ADMIN_TODAYS_WORK;
	}

	@Override
	public String getWorkDeadline() {
		return MSG_ADMIN_WORK_DEADLINE;
	}

	public static AdminDepartment getInstance() {

		return ADMIN_DEPT;
	}

}
