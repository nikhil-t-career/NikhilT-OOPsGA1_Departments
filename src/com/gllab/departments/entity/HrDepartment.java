package com.gllab.departments.entity;

import static com.gllab.departments.util.MessageUtil.*;

/**
 * Singleton class of HR Department
 * 
 * @author fullstack8
 *
 */
public final class HrDepartment extends SuperDepartment {

	private static final HrDepartment HR_DEPT = new HrDepartment();

	private HrDepartment() {

	}

	@Override
	public String departmentName() {
		return MSG_HR_DEPTNAME;
	}

	@Override
	public String getTodaysWork() {
		return MSG_HR_TODAYS_WORK;
	}

	@Override
	public String getWorkDeadline() {
		return MSG_HR_WORK_DEADLINE;
	}

	public String doActivity() {
		return MSG_HR_DO_ACTIVITY;
	}

	public static HrDepartment getInstance() {

		return HR_DEPT;
	}
}
