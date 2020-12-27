package com.app.service.dateutil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class DateValidator {
	
	private DateTimeFormatter dateformatter;
	
	public DateValidator() {
		// TODO Auto-generated constructor stub
	}

	public DateValidator(DateTimeFormatter dateformatter) {
		super();
		this.dateformatter = dateformatter;
	}
	
	public boolean isValidDate (String date) {
		
		try {
			LocalDate.parse(date, this.dateformatter);
		} catch (DateTimeParseException e) {
			return false;
		}
		return true;
	}
	
}