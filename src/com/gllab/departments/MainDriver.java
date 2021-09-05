package com.gllab.departments;

import com.gllab.departments.entity.AdminDepartment;
import com.gllab.departments.entity.HrDepartment;
import com.gllab.departments.entity.TechDepartment;

/**
 * Main Driver class to get information of all Departments.
 * 
 * @author fullstack8
 *
 */
public class MainDriver {
	
	public static void main(String[] args) {
				
		//The Department classes must be Singleton and thus the getInstance method used to get the single instance.
		AdminDepartment adminDept = AdminDepartment.getInstance();
		System.out.println("Welcome to " + adminDept.departmentName() + "!!!");
		System.out.println(adminDept.getTodaysWork());
		System.out.println(adminDept.getWorkDeadline());
		System.out.println(adminDept.isTodayAHoliday());
		
		
		HrDepartment hrDept = HrDepartment.getInstance();
        System.out.println("\n\nWelcome to " + hrDept.departmentName() + "!!!");
        System.out.println(hrDept.doActivity());
        System.out.println(hrDept.getTodaysWork());
        System.out.println(hrDept.getWorkDeadline());
        System.out.println(hrDept.isTodayAHoliday());
        
        TechDepartment techDept = TechDepartment.getInstance();
        System.out.println("\n\nWelcome to " + techDept.departmentName() + "!!!");
        System.out.println(techDept.getTodaysWork());
        System.out.println(techDept.getWorkDeadline());
        System.out.println(techDept.getTechStackInformation());
        System.out.println(techDept.isTodayAHoliday());
	}

}

//OUTPUT
//======
//
//Welcome to Admin Department!!!
//Complete your documents Submission
//Complete by EOD
//Today is SUNDAY a weekend holiday 
//
//
//Welcome to HR Department!!!
//Team Lunch
//Fill today's worksheet and mark your attendance
//Complete by EOD
//Today is SUNDAY a weekend holiday 
//
//
//Welcome to Tech Department!!!
//Complete coding of module 1
//Complete by EOD
//core Java
//Today is SUNDAY a weekend holiday  

