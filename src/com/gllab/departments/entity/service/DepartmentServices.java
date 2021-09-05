package com.gllab.departments.entity.service;

import static com.gllab.departments.util.MessageUtil.MSG_SUPER_TODAY_HOLIDAY;
import static com.gllab.departments.util.MessageUtil.MSG_SUPER_TODAY_WORKDAY;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DepartmentServices {

	public static String isTodayWeekendHoliday() {
		// simple logic to identify weekend holiday
		DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();

		if (dayOfWeek.getValue() < 6)
			return MSG_SUPER_TODAY_WORKDAY.replace("{0}", dayOfWeek.toString());
		else
			return MSG_SUPER_TODAY_HOLIDAY.replace("{0}", dayOfWeek.toString());
	}

}
