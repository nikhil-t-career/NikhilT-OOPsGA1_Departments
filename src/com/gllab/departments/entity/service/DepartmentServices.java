package com.gllab.departments.entity.service;

import static com.gllab.departments.util.MessageUtil.MSG_SUPER_TODAY_HOLIDAY;
import static com.gllab.departments.util.MessageUtil.MSG_SUPER_TODAY_WORKDAY;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DepartmentServices {
	
	public static String isTodayWeekendHoliday()
	{
				//simple logic to identify weekend holiday
				if(LocalDate.now().getDayOfWeek().getValue() < 6)
					return MSG_SUPER_TODAY_WORKDAY.replace("{0}", LocalDate.now().getDayOfWeek().toString());
				else	
					return MSG_SUPER_TODAY_HOLIDAY.replace("{0}", LocalDate.now().getDayOfWeek().toString());
	}

	
//	public static void main(String...strings)
//	{
//		System.out.println(isTodayWeekendHoliday());
//		System.out.println("Day if today " + DayOfWeek.from(LocalDate.of(1947,
//                Month.AUGUST, 15)).getValue() );
//	}
}
