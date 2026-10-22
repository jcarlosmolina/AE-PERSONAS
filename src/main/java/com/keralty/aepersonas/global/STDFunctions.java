package com.keralty.aepersonas.global;

import java.security.SecureRandom;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import com.keralty.aepersonas.utils.Types;
import com.keralty.aepersonas.utils.Utilities;

/**
 * <code>STDFunctions</code> is a class with standard functions
 */
public final class STDFunctions {

	/** Short date format */
	public static final String SHORTDATEFORMAT;
	/** Medium date format */
	public static final String MEDIUMDATEFORMAT;
	/** Long date format */
	public static final String LONGDATEFORMAT;
	/** Full date format */
	public static final String FULLDATEFORMAT;
	/** DateTime format */
	public static final String DATETIMETOSTRFORMAT;
	
	private static SecureRandom random = new SecureRandom();

	private STDFunctions() {

	}

	/**
	 * Sets date formats
	 */
	private static String aritmeticError;
	static {
		SHORTDATEFORMAT = "d/M/yy";
		MEDIUMDATEFORMAT = "MMM dd, yyyy";
		LONGDATEFORMAT = "MMMM dd, yyyy";
		FULLDATEFORMAT = "EEEE, MMMMM dd, yyyy";
		DATETIMETOSTRFORMAT = "MMMM dd, yyyy HH:mm:ss";

		aritmeticError = "Error occurred while attempting to calculate the ";
	}

	// ------------------------------------------
	// --------- DATE FUNCTIONS ----------
	// ------------------------------------------

	// QUERY
	// ------------------------------------------

	/**
	 * Return the date of the system.
	 * 
	 * @return System date
	 */
	public static java.sql.Date systemDateFun() {

		java.sql.Date result = new java.sql.Date(System.currentTimeMillis());
		return java.sql.Date.valueOf(result.toString());
	}

	/**
	 * Return true if and only if year is a leap year; false in other case.
	 * Determine if a parameter year is a leap year, following the Gregorian
	 * calendar rule made official by papal decree Every fourth year is a leap year
	 * except for century years that are not evenly divisible by 400.
	 * 
	 * @param year Year
	 * @return {@link Boolean}
	 */
	public static Boolean isLeapYearFun(Long year) {
		Boolean isLeapYear = null;
		if (year != null) {
			isLeapYear = new java.util.GregorianCalendar().isLeapYear(year.intValue());
		}
		return isLeapYear;
	}

	/**
	 * Return the days of difference between date1 and date2
	 * 
	 * @param date1 First date
	 * @param date2 Second date
	 * @return Days of difference
	 */
	public static Long daysDifferenceFromDateFun(Date date1, Date date2) {
		Long returnValue;
		if (date1 == null || date2 == null) {
			returnValue = null;
		} else {
			returnValue = daysDifferenceFromDate(date1, date2);
		}
		return returnValue;
	}

	protected static Long daysDifferenceFromDate(Date date1, Date date2) {
		Long returnValue;
		if (date1.after(date2))
			returnValue = Long.valueOf(0);
		else {
			int year;
			int ly;
			int day1;
			int day2;
			java.util.Calendar c = java.util.Calendar.getInstance();
			c.setTime(date1);
			year = c.get(Calendar.YEAR) - 1;
			ly = year / 4 - year / 100 + year / 400; // amount of leapYear
			day1 = year * 365 + 1 * ly + c.get(Calendar.DAY_OF_YEAR);
			c.setTime(date2);
			year = c.get(Calendar.YEAR) - 1;
			ly = year / 4 - year / 100 + year / 400; // amount of leapYear
			day2 = year * 365 + 1 * ly + c.get(Calendar.DAY_OF_YEAR);

			returnValue = Long.valueOf(day2) - Long.valueOf(day1);
		}
		return returnValue;
	}

	/**
	 * Return the number of days in a specified month of the specified year. For
	 * example, if month equals 2 for February, the return value is 28 or 29
	 * depending upon whether year is a leap year. year - The year. month - The
	 * month.
	 * 
	 * @param pYear  Year
	 * @param pMonth Month
	 * @return {@link Long}
	 */
	public static Long daysInMonthFun(Long pYear, Long pMonth) {
		Long returnValue;
		if (pYear == null || pMonth == null) {
			returnValue = null;
		} else {
			returnValue = daysInMonth(pYear, pMonth);
		}
		return returnValue;
	}

	private static Long daysInMonth(Long pYear, Long pMonth) {
		Long returnValue = Long.valueOf(0);
		int year = pYear.intValue();
		int month = pMonth.intValue();

		if (year < 0)
			throw new IllegalArgumentException("Invalid year");
		if (month < 1 || month > 12)
			throw new IllegalArgumentException("Invalid month");

		month -= 1;

		if (has31Days(month))
			returnValue = Long.valueOf(31);
		if (has30Days(month))
			returnValue = Long.valueOf(30);
		if (month == Calendar.FEBRUARY)
			returnValue = (Boolean.TRUE.equals(isLeapYearFun(Long.valueOf(year))) ? Long.valueOf(29) : Long.valueOf(28));
		return returnValue;
	}

	private static boolean has31Days(int month) {
		int[] monthsWith31Days = new int[] { Calendar.JANUARY, Calendar.MARCH, Calendar.MAY, Calendar.JULY,
				Calendar.AUGUST, Calendar.OCTOBER, Calendar.DECEMBER };
		return Arrays.binarySearch(monthsWith31Days, month) >= 0;
	}

	private static boolean has30Days(int month) {
		int[] monthsWith30Days = new int[] { Calendar.APRIL, Calendar.JUNE, Calendar.SEPTEMBER, Calendar.NOVEMBER };
		return Arrays.binarySearch(monthsWith30Days, month) >= 0;
	}

	/**
	 * Return the day in adate.
	 * 
	 * @param adate Date
	 * @return Number of days in month
	 */
	public static Long getDayFun(Date adate) {
		Long returnValue;
		if (adate == null) {
			returnValue = null;
		} else {
			java.util.Calendar c = java.util.Calendar.getInstance();
			c.setTime(adate);
			returnValue = Long.valueOf(c.get(Calendar.DAY_OF_MONTH));
		}
		return returnValue;
	}

	/**
	 * Return the month in adate. (1 through 12)
	 * 
	 * @param adate Date
	 * @return Month of date
	 */
	public static Long getMonthFun(Date adate) {
		Long returnValue;
		if (adate == null) {
			returnValue = null;
		} else {
			java.util.Calendar c = java.util.Calendar.getInstance();
			c.setTime(adate);

			returnValue = Long.valueOf(c.get(Calendar.MONTH) + 1L);
		}
		return returnValue;
	}

	/**
	 * Return the year in adate.
	 * 
	 * @param adate Date
	 * @return Year of date
	 */
	public static Long getYearFun(Date adate) {
		Long returnValue;
		if (adate == null) {
			returnValue = null;
		} else {
			java.util.Calendar c = java.util.Calendar.getInstance();
			c.setTime(adate);

			returnValue = Long.valueOf(c.get(Calendar.YEAR));
		}
		return returnValue;
	}

	/**
	 * Return the day of week contained in adate. The possible values are 1 through
	 * 7.
	 * 
	 * @param adate Date
	 * @return Day of the week
	 */
	public static Long getDayOfWeekFun(Date adate) {
		Long returnValue;
		if (adate == null) {
			returnValue = null;
		} else {
			java.util.Calendar c = java.util.Calendar.getInstance();
			c.setTime(adate);

			returnValue = Long.valueOf(c.get(Calendar.DAY_OF_WEEK));
		}
		return returnValue;
	}

	/**
	 * Return the day of year contained in adate. The possible values are either 1
	 * through 365 (if the year is not leap) or 1 through 366.
	 * 
	 * @param adate Date
	 * @return Day of year in Gregorian calendar
	 */
	public static Long getDayOfYearFun(Date adate) {
		Long returnValue;
		if (adate == null) {
			returnValue = null;
		} else {
			java.util.Calendar c = java.util.Calendar.getInstance();
			c.setTime(adate);

			returnValue = Long.valueOf(c.get(Calendar.DAY_OF_YEAR));
		}
		return returnValue;
	}

	/**
	 * Return a date corresponding to the next day of the argument aDate.
	 * 
	 * @param adate Date
	 * @return Tomorrow date
	 */
	public static java.sql.Date tomorrowFun(Date adate) {
		java.sql.Date returnValue;
		if (adate == null) {
			returnValue = null;
		} else {
			java.util.Calendar c = java.util.Calendar.getInstance();
			c.setTime(adate);
			c.set(Calendar.DAY_OF_MONTH, c.get(Calendar.DAY_OF_MONTH) + 1);

			returnValue = new java.sql.Date(c.getTimeInMillis());
		}
		return returnValue;
	}

	/**
	 * Return a date corresponding to the earlier day of the argument adate.
	 * 
	 * @param adate Date
	 * @return Yesterday date
	 */
	public static java.sql.Date yesterdayFun(Date adate) {
		java.sql.Date returnValue;
		if (adate == null) {
			returnValue = null;
		} else {
			java.util.Calendar c = java.util.Calendar.getInstance();
			c.setTime(adate);
			c.set(Calendar.DAY_OF_MONTH, c.get(Calendar.DAY_OF_MONTH) - 1);

			returnValue = new java.sql.Date(c.getTimeInMillis());
		}
		return returnValue;
	}

	/**
	 * Returns a date to which a specified time interval has been added.Interval :
	 * The interval of time you want to add. - yyyy Year - m Month - d Daynumber:
	 * The number of interval you want to add.adate: The date to which a specified
	 * time interval has been added.
	 * 
	 * @param interval Interval
	 * @param pNumber  Number
	 * @param adate    Date
	 * @return New date
	 */
	public static java.sql.Date dateAddFun(String interval, Long pNumber, Date adate) {
		java.sql.Date returnValue;
		if (interval == null || pNumber == null || adate == null) {
			returnValue = null;
		} else {

			int number = pNumber.intValue();
			java.util.Calendar c = java.util.Calendar.getInstance();
			c.setTime(adate);

			if (interval.equalsIgnoreCase("yyyy"))
				c.set(Calendar.YEAR, c.get(Calendar.YEAR) + number);
			else if (interval.equalsIgnoreCase("m"))
				c.set(Calendar.MONTH, c.get(Calendar.MONTH) + number);
			else if (interval.equalsIgnoreCase("d"))
				c.set(Calendar.DATE, c.get(Calendar.DATE) + number);

			returnValue = new java.sql.Date(c.getTimeInMillis());
		}
		return returnValue;
	}

	/**
	 * Counts the number of apperances of the day of the week between two dates
	 * 
	 * @param dayOfWeekArg of the week
	 * @param iniDateArg   is the initial date of the interval
	 * @param endDateArg   is the end date of the interval
	 * @return number of apperances of the day of the week
	 */
	public static Long getNumDayOfWeekBetweenDatesFun(Long dayOfWeekArg, java.sql.Date iniDateArg,
			java.sql.Date endDateArg) {
		Long returnValue;
		if (dayOfWeekArg == null || iniDateArg == null || endDateArg == null)
			returnValue = null;
		else {
			Long lDayOfWeekArg = dayOfWeekArg;

			Long numTotal = daysDifferenceFromDateFun(iniDateArg, endDateArg);
			long numDays = numTotal / 7;
			long diffDays = numTotal % 7;

			Long iniDay = getDayOfWeekFun(iniDateArg);
			Long endDay = getDayOfWeekFun(endDateArg);

			if (endDay < iniDay) {
				endDay += 7;
			}

			if (lDayOfWeekArg < iniDay) {
				lDayOfWeekArg += 7;
			}

			long iniRest = endDay - diffDays;
			if ((lDayOfWeekArg >= iniRest) && (lDayOfWeekArg <= endDay)) {
				numDays++;
			}
			if (iniDateArg.after(endDateArg))
				returnValue = 0L;
			else
				returnValue = numDays;
		}
		return returnValue;
	}

	// CONVERSIONS
	// ------------------------------------------

	/**
	 * Return a string representation of the argument adate. Converts aDate to a
	 * string of the form: m/d/yy
	 * 
	 * @param adate Date
	 * @return Short date format
	 */
	public static String toShortDateFormatFun(Date adate) {
		SimpleDateFormat shortDate = new java.text.SimpleDateFormat(SHORTDATEFORMAT);
		String returnValue;
		if (adate == null) {
			returnValue = null;
		} else {
			returnValue = shortDate.format(adate);
		}
		return returnValue;
	}

	/**
	 * Return and string representation of the argument adate. Converts a Date to a
	 * string of the form: mmm dd, yyyy
	 * 
	 * @param adate Date
	 * @return Medium date format
	 */
	public static String toMediumDateFormatFun(Date adate) {
		SimpleDateFormat mediumDate = new java.text.SimpleDateFormat(MEDIUMDATEFORMAT);
		String returnValue;
		if (adate == null) {
			returnValue = null;
		} else {
			returnValue = mediumDate.format(adate);
		}
		return returnValue;
	}

	/**
	 * Return and string representation of the argument adate. Converts adate to a
	 * string of the form: mmmm dd, yyyy
	 * 
	 * @param adate Date
	 * @return Long date format
	 */
	public static String toLongDateFormatFun(Date adate) {
		SimpleDateFormat longDate = new java.text.SimpleDateFormat(LONGDATEFORMAT);
		String returnValue;
		if (adate == null) {
			returnValue = null;
		} else {
			returnValue = longDate.format(adate);
		}
		return returnValue;
	}

	/**
	 * Return and string representation of the argument adate. Converts aDate to a
	 * string of the form: dow, mon dd, yyyy Where: - dow is the day of the week
	 * (Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday). - mon is
	 * the month (Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec), - dd
	 * is the day of the month (01 through 31) as two decimal digits, - yyyy is the
	 * year, as four decimal digits
	 * 
	 * @param adate Date
	 * @return Full date format
	 */
	public static String toFullDateFormatFun(Date adate) {
		SimpleDateFormat fullDate = new java.text.SimpleDateFormat(FULLDATEFORMAT);
		String returnValue;
		if (adate == null) {
			returnValue = null;
		} else {
			returnValue = fullDate.format(adate);
		}
		return returnValue;
	}

	/**
	 * Convert the string stringDate to a date representation.
	 * 
	 * @param stringDate Date in string format
	 * @return New date
	 */
	public static Date stringToDateFun(String stringDate) {
		Date returnValue;
		if (stringDate == null) {
			returnValue = null;
		} else {
			returnValue = stringToDateSHORT(stringDate);
			if (returnValue == null)
				returnValue = stringToDateMEDIUM(stringDate);
			if (returnValue == null)
				returnValue = stringToDateLONG(stringDate);
			if (returnValue == null)
				returnValue = stringToDateFULL(stringDate);
			if (returnValue == null)
				throw new IllegalArgumentException("Invalid Format. SHORT, MEDIUM, LONG or FULL format expected");
		}
		return returnValue;
	}

	private static Date stringToDateSHORT(String stringDate) {
		Date result;
		try {
			result = new Date(DateFormat.getDateInstance(java.text.DateFormat.SHORT).parse(stringDate).getTime());
		} catch (Exception e) {
			result = null;
		}
		return result;
	}

	private static Date stringToDateMEDIUM(String stringDate) {
		Date result;
		try {
			result = new Date(DateFormat.getDateInstance(java.text.DateFormat.MEDIUM).parse(stringDate).getTime());
		} catch (Exception e) {
			result = null;
		}
		return result;
	}

	private static Date stringToDateLONG(String stringDate) {
		Date result;
		try {
			result = new Date(DateFormat.getDateInstance(java.text.DateFormat.LONG).parse(stringDate).getTime());
		} catch (Exception e) {
			result = null;
		}
		return result;
	}

	private static Date stringToDateFULL(String stringDate) {
		Date result;
		try {
			result = new Date(DateFormat.getDateInstance(java.text.DateFormat.FULL).parse(stringDate).getTime());
		} catch (Exception e) {
			result = null;
		}
		return result;
	}

	/**
	 * Convert the arguments (month, day and year) to a date representation. -month
	 * 1 (January) through 12 (December) -day 1 through 31
	 * 
	 * @param year  Year
	 * @param month Month
	 * @param day   Day
	 * @return Date
	 */
	public static java.sql.Date formatToDateFun(int year, int month, int day) {
        return new java.sql.Date(
                new java.util.GregorianCalendar(year, month - 1, day, 0, 0, 0).getTimeInMillis());
	}

	/**
	 * Convert the arguments (month, day and year) to a date representation. -month
	 * 1 (January) through 12 (December) -day 1 through 31
	 * 
	 * @param pYear  Year
	 * @param pMonth Month
	 * @param pDay   Day
	 * @return New date
	 */
	public static java.sql.Date formatToDateFun(Long pYear, Long pMonth, Long pDay) {
		java.sql.Date returnValue;
		if (pYear == null || pMonth == null || pDay == null) {
			returnValue = null;
		} else {
			int year = pYear.intValue();
			int month = pMonth.intValue();
			int day = pDay.intValue();

			returnValue = new java.sql.Date(
					new java.util.GregorianCalendar(year, month - 1, day, 0, 0, 0).getTimeInMillis());
		}
		return returnValue;
	}

	// COMPARISON
	// ------------------------------------------
	/**
	 * Tests if adate1 is after the specified date adate2. Return: true if and only
	 * if adate1 is strictly later than the date represented by adate2.
	 * 
	 * @param adate1 Date 1
	 * @param adate2 Date 2
	 * @return True if adate1 greater than adate2
	 */

	public static Boolean dateAfterFun(Date adate1, Date adate2) {
		Boolean returnValue;
		if (adate1 == null || adate2 == null) {
			returnValue = null;
		} else {
			returnValue = dateAfter(adate1, adate2);
		}
		return returnValue;
	}

	public static Boolean dateAfter(Date adate1, Date adate2) {
		return (adate2 != null ? adate1.after(adate2) : Boolean.FALSE);
	}

	/**
	 * Tests if adate1 is before the specified date adate2. Return: true if and only
	 * if adate1 is strictly earlier than the date represented by adate2.
	 * 
	 * @param adate1 Date 1
	 * @param adate2 Date 2
	 * @return True if Date 1 is smaller that Date 2
	 */
	public static Boolean dateBeforeFun(Date adate1, Date adate2) {
		Boolean returnValue;
		if (adate1 == null || adate2 == null) {
			returnValue = null;
		} else {
			returnValue = dateBefore(adate1, adate2);
		}
		return returnValue;
	}

	public static Boolean dateBefore(Date adate1, Date adate2) {
		return (adate2 != null ? adate1.before(adate2) : Boolean.FALSE);
	}

	/**
	 * Compare two dates for equality. The result is true if and only if the
	 * argument adate1 represents the same date as adate2.
	 * 
	 * @param adate1 Date 1
	 * @param adate2 Date 2
	 * @return True is Date 1 is equals to Date 2
	 */
	public static Boolean dateEqualsFun(Date adate1, Date adate2) {
		Boolean returnValue;
		if (adate1 == null || adate2 == null) {
			returnValue = null;
		} else {
			returnValue = adate1.equals(adate2);
		}
		return returnValue;
	}

	// ------------------------------------------
	// ------- DATETIME FUNCTIONS --------
	// ------------------------------------------

	// QUERY
	// ------------------------------------------

	/**
	 * Return the date and time of the system
	 * 
	 * @return Current time
	 */
	public static Timestamp systemDateTimeFun() {

		Date lDate = new Date();
		long lnMilisegundos = lDate.getTime();

		return new Timestamp(lnMilisegundos);
	}

	/**
	 * Returns the date part of a datetime argument
	 * 
	 * @param adatetime Datetime
	 * @return Date of the datetime
	 */
	public static java.sql.Date getDatePartFun(Timestamp adatetime) {
		java.sql.Date returnValue;
		if (adatetime == null) {
			returnValue = null;
		} else {
			java.util.Calendar c = java.util.Calendar.getInstance();
			c.setTime(adatetime);

			returnValue = formatToDateFun(c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1, c.get(Calendar.DATE));
		}
		return returnValue;
	}

	/**
	 * Returns the time part of a datetime argument
	 * 
	 * @param adatetime Datetime
	 * @return Time of datetime
	 */
	public static Time getTimePartFun(Timestamp adatetime) {
		Time returnValue;
		if (adatetime == null) {
			returnValue = null;
		} else {
			java.util.Calendar c = java.util.Calendar.getInstance();
			c.setTime(adatetime);

			returnValue = formatToTimeFun(c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE), c.get(Calendar.SECOND));
		}
		return returnValue;
	}

	/**
	 * Returns a datetime to which a specified time interval has been added.Interval
	 * : The interval of time you want to add. - yyyy Year - m Month - d Day - h
	 * Hour - n Minute - s Second Number: The number of interval you want to
	 * add.adatetime: The datetime to which a specified time interval has been
	 * added.
	 * 
	 * @param interval  Interval
	 * @param number    Number
	 * @param adatetime Datetime
	 * @return New datetime
	 */
	public static Timestamp dateTimeAddFun(String interval, Long number, Date adatetime) {
		Timestamp returnValue;
		if (interval == null || number == null || adatetime == null) {
			returnValue = null;
		} else {
			java.util.Calendar c = java.util.Calendar.getInstance();
			c.setTime(adatetime);

			if (interval.equalsIgnoreCase("yyyy"))
				c.set(Calendar.YEAR, c.get(Calendar.YEAR) + number.intValue());
			else if (interval.equalsIgnoreCase("m"))
				c.set(Calendar.MONTH, c.get(Calendar.MONTH) + number.intValue());
			else if (interval.equalsIgnoreCase("d"))
				c.set(Calendar.DATE, c.get(Calendar.DATE) + number.intValue());
			else if (interval.equalsIgnoreCase("h"))
				c.set(Calendar.HOUR_OF_DAY, c.get(Calendar.HOUR_OF_DAY) + number.intValue());
			else if (interval.equalsIgnoreCase("n"))
				c.set(Calendar.MINUTE, c.get(Calendar.MINUTE) + number.intValue());
			else if (interval.equalsIgnoreCase("s"))
				c.set(Calendar.SECOND, c.get(Calendar.SECOND) + number.intValue());

			returnValue = new Timestamp(c.getTimeInMillis());
		}
		return returnValue;
	}

	/**
	 * Returns the days of difference between datetime1 and datetime2
	 * 
	 * @param datetime1 Datetime 1
	 * @param datetime2 Datetime 2
	 * @return Difference between dates
	 */
	public static Long daysDifferenceFromDateTimeFun(Timestamp datetime1, Timestamp datetime2) {
		Long returnValue;
		if (datetime1 == null || datetime2 == null) {
			returnValue = null;
		} else if (datetime1.after(datetime2)) {
			returnValue = Long.valueOf(0);
		} else {
			returnValue = daysDifferenceFromDateTimeAuxFun(datetime1, datetime2);
		}
		return returnValue;
	}

	private static Long daysDifferenceFromDateTimeAuxFun(Timestamp datetime1, Timestamp datetime2) {
		Long returnValue;
		Date d1 = getDatePartFun(datetime1);
		Date d2 = getDatePartFun(datetime2);

		Long d = daysDifferenceFromDateFun(d1, d2);

		if (timeEquals(buildCalendar(getTimePartFun(datetime1)), buildCalendar(getTimePartFun(datetime2))).booleanValue()) {
			returnValue = d;
		} else if (timeAfter(getTimePartFun(datetime1), getTimePartFun(datetime2)).booleanValue()) {
			Boolean dateBeforeComparison = dateBeforeFun(d1, d2);
			returnValue = (dateBeforeComparison != null && dateBeforeComparison.booleanValue()
					? Long.valueOf(d.intValue() + 1L)
							: d);
		} else {
			Boolean dateAfterComparison = dateAfterFun(d1, d2);
			returnValue = (dateAfterComparison != null && dateAfterComparison.booleanValue())
					? Long.valueOf(d.intValue() - 1L)
							: d;
		}
		return returnValue;
	}

	// CONVERSIONS
	// ------------------------------------------

	/**
	 * Convert the arguments adate and atime to a datetime representation.
	 * 
	 * @param adate Date part
	 * @param atime Time part
	 * @return New timestamp
	 */
	public static Timestamp toDateTimeFun(Date adate, Time atime) {
		Timestamp returnValue;
		if (adate == null || atime == null) {
			returnValue = null;
		} else {
			java.util.Calendar c = java.util.Calendar.getInstance();
			java.util.Calendar c2 = java.util.Calendar.getInstance();
			c.setTime(adate);
			c2.setTime(atime);

			returnValue = formatToDateTimeFun(c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1, c.get(Calendar.DATE),
					c2.get(Calendar.HOUR_OF_DAY), c2.get(Calendar.MINUTE), c2.get(Calendar.SECOND));
		}
		return returnValue;
	}

	/**
	 * Return a string representation of the argument d. Converts aDate to a string
	 * of the form: "monthname day, year hh:mm:ss"
	 * 
	 * @param adatetime Datetime
	 * @return String date
	 */
	public static String dateTimeToStringFun(Timestamp adatetime) {
		SimpleDateFormat dateTimeFormat = new java.text.SimpleDateFormat(DATETIMETOSTRFORMAT);
		String returnValue;
		if (adatetime == null) {
			returnValue = null;
		} else {
			returnValue = dateTimeFormat.format(adatetime);
		}
		return returnValue;
	}

	/**
	 * Convert the string stringDate to a datetime representation.
	 * 
	 * @param stringDate DateTime is string format
	 * @return New timestamp
	 */
	public static Timestamp stringToDateTimeFun(String stringDate) {
		Timestamp returnValue;
		if (stringDate == null) {
			returnValue = null;
		} else {
			returnValue = new Types().parseTimestamp(stringDate);
		}
		return returnValue;
	}

	/**
	 * Convert the arguments (month, day, year, hour, minute and second) to a
	 * datetime representation.
	 * 
	 * @param year   Year
	 * @param month  Month
	 * @param day    Day
	 * @param hour   Hours
	 * @param minute Minutes
	 * @param second Seconds
	 * @return New datetime
	 */
	public static Timestamp formatToDateTimeFun(int year, int month, int day, int hour, int minute, int second) {
        return new Timestamp(
                new java.util.GregorianCalendar(year, month - 1, day, hour, minute, second).getTimeInMillis());
	}

	/**
	 * Convert the arguments (month, day, year, hour, minute and second) to a
	 * datetime representation.
	 * 
	 * @param pYear   Year
	 * @param pMonth  Month
	 * @param pDay    Day
	 * @param pHour   Hours
	 * @param pMinute Minutes
	 * @param pSecond Seconds
	 * @return New datetime
	 */
	public static Timestamp formatToDateTimeFun(Long pYear, Long pMonth, Long pDay, Long pHour, Long pMinute,
			Long pSecond) {
		Timestamp returnValue;
		if (pYear == null || pMonth == null || pDay == null || pHour == null || pMinute == null || pSecond == null) {
			returnValue = null;
		} else {
			int year = pYear.intValue();
			int month = pMonth.intValue();
			int day = pDay.intValue();
			int hour = pHour.intValue();
			int minute = pMinute.intValue();
			int second = pSecond.intValue();

			returnValue = new Timestamp(
					new java.util.GregorianCalendar(year, month - 1, day, hour, minute, second).getTimeInMillis());
		}
		return returnValue;
	}

	// COMPARISON
	// ------------------------------------------

	/**
	 * Tests if adatetime1 is after the specified datetime adatetime2. Return: true
	 * if and only if adatetime1 is strictly later than the datetime represented by
	 * adatetime2.
	 * 
	 * @param adatetime1 Datetime 1
	 * @param adatetime2 Datetime 2
	 * @return True is Datetime 1 is greater than Datetime 2
	 */
	public static Boolean datetimeAfterFun(Timestamp adatetime1, Timestamp adatetime2) {
		Boolean returnValue;
		if (adatetime1 == null || adatetime2 == null) {
			returnValue = null;
		} else {
			returnValue = adatetime1.after(adatetime2);
		}
		return returnValue;
	}

	/**
	 * Tests if adatetime1 is before the specified datetime adatetime2. Return: true
	 * if and only if adatetime1 is strictly earlier than the datetime represented
	 * by adatetime2.
	 * 
	 * @param adatetime1 Datetime 1
	 * @param adatetime2 Datetime 2
	 * @return True is Datetime 1 is smaller than Datetime 2
	 */
	public static Boolean datetimeBeforeFun(Timestamp adatetime1, Timestamp adatetime2) {
		Boolean returnValue;
		if (adatetime1 == null || adatetime2 == null) {
			returnValue = null;
		} else {
			returnValue = adatetime1.before(adatetime2);
		}
		return returnValue;
	}

	/**
	 * Compare two datetimes for equality. The result is true if and only if the
	 * argument adatetime1 represents the same datetime as adatetime2.
	 * 
	 * @param adatetime1 Datetime 1
	 * @param adatetime2 Datetime 2
	 * @return True is Datetime 1 is equals than Datetime 2
	 */
	public static Boolean datetimeEqualsFun(Timestamp adatetime1, Timestamp adatetime2) {
		Boolean returnValue;
		if (adatetime1 == null || adatetime2 == null) {
			returnValue = null;
		} else {
			returnValue = Boolean.valueOf(adatetime1.equals(adatetime2));
		}
		return returnValue;
	}

	// ------------------------------------------
	// ------- TIME FUNCTIONS --------
	// ------------------------------------------

	// QUERY
	// ------------------------------------------

	/**
	 * Return the time of the system
	 * 
	 * @return System time
	 */
	public static Time systemTimeFun() {
		return new Time(System.currentTimeMillis());
	}

	/**
	 * Returns the hour of a time
	 * 
	 * @param atime Time
	 * @return Hour of time
	 */
	public static Long getHourFun(Time atime) {
		Long returnValue;
		if (atime == null) {
			returnValue = null;
		} else {
			java.util.Calendar c = java.util.Calendar.getInstance();
			c.setTime(atime);

			returnValue = Long.valueOf(c.get(Calendar.HOUR_OF_DAY));
		}
		return returnValue;
	}

	/**
	 * Returns the minutes of a time
	 * 
	 * @param atime Time
	 * @return Minutes of time
	 */
	public static Long getMinuteFun(Time atime) {
		Long returnValue;
		if (atime == null) {
			returnValue = null;
		} else {
			java.util.Calendar c = java.util.Calendar.getInstance();
			c.setTime(atime);

			returnValue = Long.valueOf(c.get(Calendar.MINUTE));
		}
		return returnValue;
	}

	/**
	 * Returns the seconds of a time
	 * 
	 * @param atime Time
	 * @return Seconds of time
	 */
	public static Long getSecondFun(Time atime) {
		Long returnValue;
		if (atime == null) {
			returnValue = null;
		} else {
			java.util.Calendar c = java.util.Calendar.getInstance();
			c.setTime(atime);

			returnValue = Long.valueOf(c.get(Calendar.SECOND));
		}
		return returnValue;
	}

	/**
	 * Returns a time to which a specified time interval has been added.Interval :
	 * The interval of time you want to add. - h Hour - n Minute - s Second Number:
	 * The number of interval you want to add. Date: The date to which a specified
	 * time interval has been added.
	 * 
	 * @param interval Interval
	 * @param pNumber  Number
	 * @param atime    Time
	 * @return New time
	 */
	public static Time timeAddFun(String interval, Long pNumber, Time atime) {
		Time returnValue;
		if (interval == null || pNumber == null || atime == null) {
			returnValue = null;
		} else {
			int number = pNumber.intValue();

			java.util.Calendar c = java.util.Calendar.getInstance();
			c.setTime(atime);

			if (interval.equalsIgnoreCase("h"))
				c.set(Calendar.HOUR_OF_DAY, c.get(Calendar.HOUR_OF_DAY) + number);
			else if (interval.equalsIgnoreCase("n"))
				c.set(Calendar.MINUTE, c.get(Calendar.MINUTE) + number);
			else if (interval.equalsIgnoreCase("s"))
				c.set(Calendar.SECOND, c.get(Calendar.SECOND) + number);

			returnValue = new Time(c.getTime().getTime());
		}
		return returnValue;
	}

	// CONVERSIONS
	// ------------------------------------------

	/**
	 * Convert the arguments (hour, minute and second) to a time representation.
	 * 
	 * @param hour   Hours
	 * @param minute Minutes
	 * @param second Seconds
	 * @return New time
	 */
    public static Time formatToTimeFun(int hour, int minute, int second) {
        java.util.Calendar c = new java.util.GregorianCalendar(0, 0, 1, hour, minute, second);
        return new Time(c.getTime().getTime());
    }

	/**
	 * Convert the arguments (hour, minute and second) to a time representation.
	 * 
	 * @param pHour   Hours
	 * @param pMinute Minutes
	 * @param pSecond Seconds
	 * @return New time
	 */
	public static Time formatToTimeFun(Long pHour, Long pMinute, Long pSecond) {
		Time returnValue;
		if (pHour == null || pMinute == null || pSecond == null) {
			returnValue = null;
		} else {
			int hour = pHour.intValue();
			int minute = pMinute.intValue();
			int second = pSecond.intValue();

			java.util.Calendar c = new java.util.GregorianCalendar(0, 0, 1, hour, minute, second);
			returnValue = new Time(c.getTime().getTime());
		}
		return returnValue;
	}

	/**
	 * Convert the string stringTime to a time representation.
	 * 
	 * @param stringTime Time in string format
	 * @return New time
	 */
	public static Time stringToTimeFun(String stringTime) {
		Time returnValue;
		if (stringTime == null) {
			returnValue = null;
		} else {
			try {
				java.text.DateFormat formatter = new java.text.SimpleDateFormat("HH:mm:ss", java.util.Locale.US);
				formatter.setTimeZone(java.util.TimeZone.getDefault());
				returnValue = new Time(formatter.parse(stringTime).getTime());
			} catch (java.text.ParseException pe) {
				throw new IllegalArgumentException("Invalid Format");
			}
		}
		return returnValue;
	}

	/**
	 * Return a string representation of the argument atime.
	 * 
	 * @param atime time
	 * @return Time in String format
	 */
	public static String timeToStringFun(Time atime) {
		String returnValue;
		if (atime == null) {
			returnValue = null;
		} else {
			returnValue = atime.toString();
		}
		return returnValue;
	}

	// COMPARISON
	// ------------------------------------------

	/**
	 * Tests if atime1 is after the specified time atime2. Return: true if and only
	 * if atime1 is strictly later than the time represented by atime2.
	 * 
	 * @param atime1 Time 1
	 * @param atime2 Time 2
	 * @return True if Time 1 is greater than Time 2
	 */
	public static Boolean timeAfterFun(Time atime1, Time atime2) {
		Boolean returnValue;
		if (atime1 == null || atime2 == null) {
			returnValue = null;
		} else {
			returnValue = timeAfter(atime1, atime2);
		}
		return returnValue;
	}

	protected static Boolean timeAfter(Time atime1, Time atime2) {
		return (atime1 == null || atime2 == null)
				? Boolean.FALSE
						: atime1.after(atime2);
	}

	protected static Boolean timeAfter(Calendar cal1, Calendar cal2) {
		Boolean returnValue;

		if (getHour(cal1) > getHour(cal2))
			returnValue = Boolean.TRUE;
		else if ((getHour(cal1) == getHour(cal2)) && (getMinutes(cal1) > getMinutes(cal2)))
			returnValue = Boolean.TRUE;
		else if ((getHour(cal1) == getHour(cal2)) && (getMinutes(cal1) == getMinutes(cal2)) && (getSeconds(cal1) > getSeconds(cal2)))
			returnValue = Boolean.TRUE;
		else
			returnValue = Boolean.FALSE;
		return returnValue;
	}

	/**
	 * Tests if atime1 is before the specified time atime2. Return: true if and only
	 * if atime1 is strictly earlier than the time represented by atime2.
	 * 
	 * @param atime1 Time 1
	 * @param atime2 Time 2
	 * @return True if Time 1 is smaller than Time 2
	 */
	public static Boolean timeBeforeFun(Time atime1, Time atime2) {
		Boolean returnValue;
		if (atime1 == null || atime2 == null) {
			returnValue = null;
		} else {
			returnValue = timeBefore(atime1, atime2);
		}
		return returnValue;
	}

	protected static Boolean timeBefore(Time atime1, Time atime2) {
		return atime1 == null || atime2 == null
				? Boolean.FALSE
						: atime1.before(atime2);
	}

	protected static Boolean timeBefore(Calendar cal1, Calendar cal2) {
		Boolean returnValue;
		if (getHour(cal1) < getHour(cal2))
			returnValue = Boolean.TRUE;
		else if ((getHour(cal1) == getHour(cal2)) && (getMinutes(cal1) < getMinutes(cal2)))
			returnValue = Boolean.TRUE;
		else if ((getHour(cal1) == getHour(cal2)) && (getMinutes(cal1) == getMinutes(cal2)) && (getSeconds(cal1) < getSeconds(cal2)))
			returnValue = Boolean.TRUE;
		else
			returnValue = Boolean.FALSE;
		return returnValue;
	}

	/**
	 * Compare two times for equality. The result is true if and only if the
	 * argument atime1 represents the same time as atime2.
	 * 
	 * @param atime1 Time 1
	 * @param atime2 Time 2
	 * @return True if Time 1 is equals to Time 2
	 */
	public static Boolean timeEqualsFun(Time atime1, Time atime2) {
		Boolean returnValue;
		if (atime1 == null || atime2 == null) {
			returnValue = null;
		} else {
			returnValue = timeEquals(buildCalendar(atime1), buildCalendar(atime2));
		}
		return returnValue;
	}

	protected static Boolean timeEquals(Calendar cal1, Calendar cal2) {
		Boolean returnValue;
		if ((getHour(cal1) == getHour(cal2)) 
				&& (getMinutes(cal1) == getMinutes(cal2)) 
				&& (getSeconds(cal1) == getSeconds(cal2)))
			returnValue = Boolean.TRUE;
		else
			returnValue = Boolean.FALSE;
		return returnValue;
	}

	private static Calendar buildCalendar(Time time) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(time);
		return cal;
	}

	private static int getHour(Calendar cal) {
		return cal.get(Calendar.HOUR_OF_DAY);
	}

	private static int getMinutes(Calendar cal) {
		return cal.get(Calendar.MINUTE);
	}

	private static int getSeconds(Calendar cal) {
		return cal.get(Calendar.SECOND);
	}

	// -------------------------------------------
	// -------- NUMERIC FUNCTIONS ---------
	// -------------------------------------------

	/**
	 * Gets PI number
	 * 
	 * @return PI number
	 */
	public static final Double pIFun() {
		return Double.valueOf(Math.PI);
	}

	/**
	 * Gets Euler number
	 * 
	 * @return Euler number
	 */
	public static final Double eulerFun() {
		return Double.valueOf(Math.E);
	}

	// TRIGONOMETRIC
	// ------------------------------------------

	/**
	 * Returns the trigonometric sine of the argument pAngle.
	 * 
	 * @param pAngle Angle
	 * @return Sin of angle
	 */
	public static Double sinFun(Double pAngle) {
		Double returnValue;
		if (pAngle == null) {
			returnValue = null;
		} else {
			double angle = pAngle.doubleValue();
			returnValue = Double.valueOf(Math.sin(angle));
		}
		return returnValue;
	}

	/**
	 * Returns the trigonometric cosine of the argument pAngle.
	 * 
	 * @param pAngle Angle
	 * @return Cos of angle
	 */
	public static Double cosFun(Double pAngle) {
		Double returnValue;
		if (pAngle == null) {
			returnValue = null;
		} else {
			double angle = pAngle.doubleValue();
			returnValue = Double.valueOf(Math.cos(angle));
		}
		return returnValue;
	}

	/**
	 * Returns the trigonometric tangent of the argument pAngle.
	 * 
	 * @param pAngle Angle
	 * @return Tan of angle
	 */
	public static Double tanFun(Double pAngle) {
		Double returnValue;
		if (pAngle == null) {
			returnValue = null;
		} else {
			double angle = pAngle.doubleValue();
			returnValue = Double.valueOf(Math.tan(angle));
		}
		return returnValue;
	}

	/**
	 * Returns the trigonometric cotangent of the argument pAngle.
	 * 
	 * @param pAngle Angle
	 * @return Cotangent of angle
	 */
	public static Double cotFun(Double pAngle) {
		Double returnValue;
		if (pAngle == null) {
			returnValue = null;
		} else {
			double angle = pAngle.doubleValue();
			returnValue = Double.valueOf(1 / Math.tan(angle));
		}
		return returnValue;
	}

	/**
	 * Returns the trigonometric arc sine of the argument pAngle, which most hold a
	 * real value between -1 through 1. The result is in the range of -PI/2 through
	 * PI/2.
	 * 
	 * @param pAngle Angle
	 * @return Arc sine of angle
	 */
	public static Double asinFun(Double pAngle) {
		Double returnValue;
		if (pAngle == null) {
			returnValue = null;
		} else {
			double value = pAngle.doubleValue();
			if (value < -1 || value > 1) {
				throw new ArithmeticException(aritmeticError + "arc sine of functions");
			}
			returnValue = Double.valueOf(Math.asin(value));
		}
		return returnValue;
	}

	/**
	 * Returns the trigonometric arc cosine of the argument pValue, which most hold
	 * a real value between -1 through 1. The result is in the range of -PI/2
	 * through PI/2.
	 * 
	 * @param pValue Angle
	 * @return Arc cosine of angle
	 */
	public static Double acosFun(Double pValue) {
		Double returnValue;
		if (pValue == null) {
			returnValue = null;
		} else {
			double value = pValue.doubleValue();
			if (value < -1 || value > 1) {
				throw new ArithmeticException(aritmeticError + "arc cosine of functions");
			}
			returnValue = Double.valueOf(Math.acos(value));
		}
		return returnValue;
	}

	/**
	 * Returns the trigonometric arc tangent of the argument pValue. The result is
	 * in the range of -PI/2 through PI/2.
	 * 
	 * @param pValue Angle
	 * @return Arc tangent of angle
	 */
	public static Double atanFun(Double pValue) {
		Double returnValue;
		if (pValue == null) {
			returnValue = null;
		} else {
			double value = pValue.doubleValue();
			returnValue = Double.valueOf(Math.atan(value));
		}
		return returnValue;
	}

	/**
	 * Returns the trigonometric arc cotangent of the argument pValue. The result is
	 * in the range of -PI/2 through PI/2.
	 * 
	 * @param pValue Angle
	 * @return Arc cotangent of angle
	 */
	public static Double acotFun(Double pValue) {
		Double returnValue;
		if (pValue == null) {
			returnValue = null;
		} else {
			double value = pValue.doubleValue();
			returnValue = Double.valueOf(Math.PI / 2 - Math.atan(value));
		}
		return returnValue;
	}

	/**
	 * Returns the trigonometric arc tangent of the value y/x. This function
	 * calculate the result based on the atan function, but it considers the (x, y)
	 * as rectangular coordinates to be converted to polar coordinates (ro, theta),
	 * where theta is the result. The result is in the range of -PI through PI.
	 * 
	 * @param pX Point X
	 * @param pY Point Y
	 * @return Arc tangent of the value y/x
	 */
	public static Double atan2Fun(Double pX, Double pY) {
		Double returnValue;
		if (pX == null || pY == null) {
			returnValue = null;
		} else {
			double x = pX.doubleValue();
			double y = pY.doubleValue();
			returnValue = Double.valueOf(Math.atan2(y, x));
		}
		return returnValue;
	}

	/**
	 * Converts an angle measured in degrees (pValue) in an angle measured in
	 * radians. The result is mathematically equivalent to Value * PI / 180.
	 * 
	 * @param pValue Angle
	 * @return To radians
	 */
	public static Double toRadiansFun(Double pValue) {
		Double returnValue;
		if (pValue == null) {
			returnValue = null;
		} else {
			double value = pValue.doubleValue();
			returnValue = Double.valueOf(Math.toRadians(value));
		}
		return returnValue;
	}

	/**
	 * Converts an angle measured in radians (pValue) in an angle measured in
	 * degrees. The result is mathematically equivalent to Value * 180 / PI.
	 * 
	 * @param pValue Angle
	 * @return To degrees
	 */
	public static Double toDegreesFun(Double pValue) {
		Double returnValue;
		if (pValue == null) {
			returnValue = null;
		} else {
			double value = pValue.doubleValue();
			returnValue = Double.valueOf(Math.toDegrees(value));
		}
		return returnValue;
	}

	/**
	 * Returns the trigonometric secant of the argument angle.
	 * 
	 * @param angle Angle
	 * @return Secant of angle
	 */
	public static Double secFun(Double angle) {
		Double returnValue;
		if (angle == null) {
			returnValue = null;
		} else {
			returnValue = Double.valueOf(1 / cosFun(angle).doubleValue());
		}
		return returnValue;
	}

	/**
	 * Returns the trigonometric cosecant of the argument angle.
	 * 
	 * @param angle Angle
	 * @return Cosecant of angle
	 */
	public static Double csecFun(Double angle) {
		Double returnValue;
		if (angle == null) {
			returnValue = null;
		} else {
			returnValue = Double.valueOf(1 / sinFun(angle).doubleValue());
		}
		return returnValue;
	}

	/**
	 * Returns the trigonometric inverse secant of the argument pValue.
	 * 
	 * @param pValue Value
	 * @return Inverse secant
	 */
	public static Double asecFun(Double pValue) {
		Double returnValue;
		if (pValue == null) {
			returnValue = null;
		} else {
			double value = pValue.doubleValue();
			returnValue = Double
					.valueOf(Math.PI / 2 - Math.atan(signFun(pValue).intValue() / Math.sqrt(value * value - 1)));
		}
		return returnValue;
	}

	/**
	 * Returns the trigonometric inverse cosecant of the argument pValue.
	 * 
	 * @param pValue Value
	 * @return Inverse cosecant
	 */
	public static Double acsecFun(Double pValue) {
		Double returnValue;
		if (pValue == null) {
			returnValue = null;
		} else {
			double value = pValue.doubleValue();
			returnValue = Double.valueOf(Math.atan(signFun(pValue).intValue() / Math.sqrt(value * value - 1)));
		}
		return returnValue;
	}

	// ELEMENTAL MATHEMATHICS
	// ------------------------------------------

	/**
	 * Returns the Euler constant raised to the specified argument value (e^value).
	 * 
	 * @param value Value
	 * @return Euler constant raised to the specified argument value
	 */
	public static Double expFun(Double value) {
		Double returnValue;
		if (value == null) {
			returnValue = null;
		} else {
			returnValue = Double.valueOf(Math.exp(value.doubleValue()));
		}
		return returnValue;
	}

	/**
	 * Returns the natural logarithm (base Euler constant) of the specified argument
	 * value.
	 * 
	 * @param value Value
	 * @return Logarithm
	 */
	public static Double logFun(Double value) {
		Double returnValue;
		if (value == null) {
			returnValue = null;
		} else {
			returnValue = Double.valueOf(Math.log(value.doubleValue()));
		}
		return returnValue;
	}

	/**
	 * Returns the value base raised to the power of exponent (base^exponent).
	 * 
	 * @param base     Base
	 * @param exponent Exponent
	 * @return (base^exponent)
	 */
	public static Double powFun(Double base, Double exponent) {
		Double returnValue;
		if (base == null || exponent == null) {
			returnValue = null;
		} else {
			returnValue = Double.valueOf(Math.pow(base.doubleValue(), exponent.doubleValue()));
		}
		return returnValue;
	}

	/**
	 * Returns the square root of the specified value argument.
	 * 
	 * @param value Value
	 * @return Square root
	 */
	public static Double sqrtFun(Double value) {
		Double returnValue;
		if (value == null) {
			returnValue = null;
		} else {
			returnValue = Double.valueOf(Math.sqrt(value.doubleValue()));
		}
		return returnValue;
	}

	/**
	 * Returns the absolute value of the specified argument value.
	 * 
	 * @param value Value
	 * @return Absolute value
	 */
	public static Long absIntFun(Long value) {
		Long returnValue;
		if (value == null) {
			returnValue = null;
		} else {
			returnValue = Long.valueOf(Math.abs(value.intValue()));
		}
		return returnValue;
	}

	/**
	 * Returns the absolute value of the specified argument value.
	 * 
	 * @param value Value
	 * @return Absolute value
	 */
	public static Double absRealFun(Double value) {
		Double returnValue;
		if (value == null) {
			returnValue = null;
		} else {
			returnValue = Double.valueOf(Math.abs(value.doubleValue()));
		}
		return returnValue;
	}

	/**
	 * Returns the minimum between value1 and value2.
	 * 
	 * @param value1 Value 1
	 * @param value2 Value 2
	 * @return Min value
	 */
	public static Double minFun(Double value1, Double value2) {
		Double returnValue;
		if (value1 == null || value2 == null) {
			returnValue = null;
		} else {
			returnValue = Double.valueOf(Math.min(value1.doubleValue(), value2.doubleValue()));
		}
		return returnValue;
	}

	/**
	 * Returns the maximum between value1 and value2.
	 * 
	 * @param value1 Value 1
	 * @param value2 Value 2
	 * @return Max value
	 */
	public static Double maxFun(Double value1, Double value2) {
		Double returnValue;
		if (value1 == null || value2 == null) {
			returnValue = null;
		} else {
			returnValue = Double.valueOf(Math.max(value1.doubleValue(), value2.doubleValue()));
		}
		return returnValue;
	}

	/**
	 * Returns the minimum between value1 and value2.
	 * 
	 * @param value1 Value 1
	 * @param value2 Value 2
	 * @return Min value
	 */
	public static Long minIntFun(Long value1, Long value2) {
		Long returnValue;
		if (value1 == null || value2 == null) {
			returnValue = null;
		} else {
			returnValue = Long.valueOf(Math.min(value1.intValue(), value2.intValue()));
		}
		return returnValue;
	}

	/**
	 * Returns the maximum between value1 and value2.
	 * 
	 * @param value1 Value 1
	 * @param value2 Value 2
	 * @return Max value
	 */
	public static Long maxIntFun(Long value1, Long value2) {
		Long returnValue;
		if (value1 == null || value2 == null) {
			returnValue = null;
		} else {
			returnValue = Long.valueOf(Math.max(value1.intValue(), value2.intValue()));
		}
		return returnValue;
	}

	/**
	 * Returns the logarithm of value, in base base
	 * 
	 * @param value Value
	 * @param base  Base
	 * @return Logarithm
	 */
	public static Double logBaseFun(Double value, Double base) {
		Double returnValue;
		if (value == null || base == null) {
			returnValue = null;
		} else {
			returnValue = Double.valueOf(Math.log(value.doubleValue()) / Math.log(base.doubleValue()));
		}
		return returnValue;
	}

	/**
	 * Returns the sign of the specified argument pValue, represented as -1, 0 and
	 * 1, in correspondence with negative, zero or positive argument.
	 * 
	 * @param pValue Value
	 * @return Sign of argument
	 */
	public static Long signFun(Double pValue) {
		Long returnValue;
		if (pValue == null) {
			returnValue = null;
		} else {
			double value = pValue.doubleValue();
			int negative = -1;
			int zeroOrPositive = (value > 0) ? 1 : 0;
			returnValue = Long.valueOf((value < 0) ? negative : zeroOrPositive);
		}
		return returnValue;
	}

	/**
	 * Returns the greatest common divisor between value1 and value2. That is, the
	 * greatest integer value that exactly divides Value1 (integer quotient and
	 * remainder 0) and exactly divides Value2. Both arguments (value1 and value2)
	 * can't be simultaneously 0.
	 * 
	 * @param pValue1 Value 1
	 * @param pValue2 Value 2
	 * @return GCD
	 */
	public static Long gcdFun(Long pValue1, Long pValue2) {
		Long returnValue;
		if (pValue1 == null || pValue2 == null) {
			returnValue = null;
		} else {
			int value1 = pValue1.intValue();
			int value2 = pValue2.intValue();

			while (value2 != 0) {
				int rest = value1 % value2;
				value1 = value2;
				value2 = rest;
			}
			if (value1 == 0)
				throw new IllegalArgumentException("The gdc between 0 and 0 is not a number");

			returnValue = Long.valueOf(value1);
		}
		return returnValue;
	}

	/**
	 * Returns the less common multiple between value1 and value2. That is, the
	 * lesser integer value that is exactly divisible by value1 and value2. Both
	 * arguments (value1 and value2) can't be simultaneously 0.
	 * 
	 * @param value1 Value 1
	 * @param value2 Value 2
	 * @return lcm
	 */
	public static Long lcmFun(Long value1, Long value2) {
		Long returnValue;
		if (value1 == null || value2 == null) {
			returnValue = null;
		} else {
			returnValue = value1 * value2 / gcdFun(value1, value2).intValue();
		}
		return returnValue;
	}

	// ROUNDING
	// ------------------------------------------

	/**
	 * Returns the smallest integer value (closest to negative infinity) greater
	 * than or equal to value.
	 * 
	 * @param value Value
	 * @return Ceiling of value
	 */
	public static Long ceilingFun(Double value) {
		Long returnValue;
		if (value == null) {
			returnValue = null;
		} else {
			double ceiling = Math.ceil(value.doubleValue());
			returnValue = (long) ceiling;
		}
		return returnValue;
	}

	/**
	 * Returns the largest integer value (closest to positive infinity) less than or
	 * equal to value.
	 * 
	 * @param value Value
	 * @return Floor of value
	 */
	public static Long floorFun(Double value) {
		Long returnValue;
		if (value == null) {
			returnValue = null;
		} else {
			double floor = Math.floor(value.doubleValue());
			returnValue = (long) floor;
		}
		return returnValue;
	}

	/**
	 * Returns the integer part of the real argument value, just removing the
	 * fractionary part. If Value is below 0, it returns the ceiling, otherwise it
	 * returns the floor.
	 * 
	 * @param value Value
	 * @return Trunc of value
	 */
	public static Long truncFun(Double value) {
		Long returnValue;
		if (value == null) {
			returnValue = null;
		} else {
			returnValue = Long.valueOf((int) value.doubleValue());
		}
		return returnValue;
	}

	/**
	 * Returns the integer value closest to value. In cases of ambiguity, where the
	 * fractionary part is .5, this function returns the even integer from the tow
	 * posible closest integers (on the examples).
	 * 
	 * @param value Value
	 * @return Round of value
	 */
	public static Long roundFun(Double value) {
		Long returnValue;
		if (value == null) {
			returnValue = null;
		} else {
			double round = (value.doubleValue() + 0.5D);
			returnValue = (long) round;
		}
		return returnValue;
	}

	/**
	 * Returns the number with the specified precision nearest the specified value,
	 * where digits is the number of significant fractional digits (precision) in
	 * the returned value.
	 * 
	 * @param value  Value
	 * @param digits Digits
	 * @return Round value with precision digits
	 */
	public static Double roundExFun(Double value, Long digits) {
		Double returnValue;
		if (value == null || digits == null) {
			returnValue = null;
		} else {
			double powDigits = Math.pow(10, digits.intValue());
			returnValue = Double.valueOf(Math.round(value.doubleValue() * powDigits) / powDigits);
		}
		return returnValue;
	}

	// CONVERSIONS
	// ------------------------------------------

	/**
	 * Returns the string representation of Value in decimal format.
	 * 
	 * @param value Value
	 * @return String format
	 */
	public static String intToStrFun(Long value) {
		String returnValue;
		if (value == null) {
			returnValue = null;
		} else {
			returnValue = value.toString();
		}
		return returnValue;
	}

	/**
	 * Returns the string representation of Value.
	 * 
	 * @param value Value
	 * @return String format
	 */
	public static String realToStrFun(Double value) {
		String returnValue;
		if (value == null) {
			returnValue = null;
		} else {
			returnValue = value.toString();
		}
		return returnValue;
	}

	/**
	 * Returns the string representation of Value in hexadecimal format.
	 * 
	 * @param value Value
	 * @return Hexadecimal format
	 */
	public static String toHexStringFun(Long value) {
		String returnValue;
		if (value == null) {
			returnValue = null;
		} else {
			returnValue = Long.toHexString(value.intValue());
		}
		return returnValue;
	}

	/**
	 * Returns the string representation of Value in octal format.
	 * 
	 * @param value Value
	 * @return Octal format
	 */
	public static String toOctalStringFun(Long value) {
		String returnValue;
		if (value == null) {
			returnValue = null;
		} else {
			returnValue = Long.toOctalString(value.intValue());
		}
		return returnValue;
	}

	/**
	 * Returns the integer value represented in decimal format by the string Value.
	 * 
	 * @param value Value
	 * @return Long value
	 */
	public static Long strToIntFun(String value) {
		Long returnValue;
		if (value == null) {
			returnValue = null;
		} else {
			String lValue = value;
			int i = value.indexOf(',');
			if (i != -1) {
				lValue = lValue.substring(0, i);
			}
			try {
			    returnValue = Long.valueOf(lValue);
			} catch (Exception e) {
			    returnValue = null;
			}
		}
		return returnValue;
	}

	/**
	 * Returns the real value represented by the string Value.
	 * 
	 * @param value Value
	 * @return Double value
	 */
	public static Double strToRealFun(String value) {
		Double returnValue;
		if (value == null) {
			returnValue = null;
		} else {
		    try {
			    returnValue = Double.valueOf(value);
			} catch (Exception e) {
			    returnValue = null;
			}
		}
		return returnValue;
	}

	// RANDOM
	// ------------------------------------------

	/**
	 * Returns a uniformly distributed pseudo-random real number greater than or
	 * equal to 0 and less than 1. The use of this method has a state because the
	 * generated sequence is pseudo-random, but it could be considered as stateless
	 * due to the imprecise relation among results from different calls.
	 * 
	 * @return Random number
	 */
	public static Double rndFun() {
		return random.nextDouble();
	}

	/**
	 * Returns a uniformly distributed pseudo-random discrete (integer) number
	 * greater than or equal to 0 and less than upperBound.
	 * 
	 * @param upperBound Upper Bound
	 * @return Random number
	 */
	public static Long rndIntegerFun(Long upperBound) {
		Long returnValue;
		if (upperBound == null) {
			returnValue = null;
		} else {
			returnValue = random.nextLong();
		}
		return returnValue;
	}

	/**
	 * Returns a uniformly distributed pseudo-random discrete (integer) number
	 * greater than or equal to 0 and less than UpperBound.
	 * 
	 * @param upperBound Upper Bound
	 * @return Random number
	 */
	public static Double rndRealFun(Double upperBound) {
		Double returnValue;
		if (upperBound == null) {
			returnValue = null;
		} else {
			returnValue = Double.valueOf(random.nextDouble() * upperBound.doubleValue());
		}
		return returnValue;
	}

	/**
	 * Returns a uniformly distributed pseudo-random discrete (integer) number
	 * greater than or equal to LowerBound and less than UpperBound.
	 * 
	 * @param pLowerBound Lower Bound
	 * @param pUpperBound Upper Bound
	 * @return Random number
	 */
	public static Long rndIntBoundFun(Long pLowerBound, Long pUpperBound) {
		Long returnValue;
		if (pLowerBound == null || pUpperBound == null) {
			returnValue = null;
		} else {
			Long lowerBound = pLowerBound;
			Long upperBound = pUpperBound;
			returnValue = (random.nextLong() * (upperBound - lowerBound)) + lowerBound;
		}
		return returnValue;
	}

	/**
	 * Returns a uniformly distributed pseudo-random discrete (integer) number
	 * greater than or equal to LowerBound and less than UpperBound.
	 * 
	 * @param pLowerBound Lower Bound
	 * @param pUpperBound Upper Bound
	 * @return Random number
	 */
	public static Double rndRealBoundFun(Double pLowerBound, Double pUpperBound) {
		Double returnValue;
		if (pLowerBound == null || pUpperBound == null) {
			returnValue = null;
		} else {
			double lowerBound = pLowerBound.doubleValue();
			double upperBound = pUpperBound.doubleValue();
			returnValue = Double.valueOf(random.nextDouble() * (upperBound - lowerBound) + lowerBound);
		}
		return returnValue;
	}

	// HYPERBOLIC TRIGONOMETRIC
	// ------------------------------------------

	/**
	 * Returns the hyperbolic sine of the argument value
	 * 
	 * @param pValue Value
	 * @return Hyperbolic sine
	 */
	public static Double sinhFun(Double pValue) {
		Double returnValue;
		if (pValue == null) {
			returnValue = null;
		} else {
			double value = pValue.doubleValue();
			returnValue = Double.valueOf((Math.exp(value) - Math.exp(-value)) / 2);
		}
		return returnValue;
	}

	/**
	 * Returns the hyperbolic cosine of the argument value
	 * 
	 * @param pValue Value
	 * @return Hyperbolic cosine
	 */
	public static Double coshFun(Double pValue) {
		Double returnValue;
		if (pValue == null) {
			returnValue = null;
		} else {
			double value = pValue.doubleValue();
			returnValue = Double.valueOf((Math.exp(value) + Math.exp(-value)) / 2);
		}
		return returnValue;
	}

	/**
	 * Returns the hyperbolic tangent of the argument value
	 * 
	 * @param pValue Value
	 * @return Hyperbolic tangent
	 */
	public static Double tanhFun(Double pValue) {
		Double returnValue;
		if (pValue == null) {
			returnValue = null;
		} else {
			double value = pValue.doubleValue();
			returnValue = Double.valueOf((Math.exp(value) - Math.exp(-value)) / (Math.exp(value) + Math.exp(-value)));
		}
		return returnValue;
	}

	/**
	 * Returns the hyperbolic cotangent of the argument value
	 * 
	 * @param pValue Value
	 * @return Hyperbolic cotangent
	 */
	public static Double cothFun(Double pValue) {
		Double returnValue;
		if (pValue == null) {
			returnValue = null;
		} else {
			double value = pValue.doubleValue();
			returnValue = Double.valueOf((Math.exp(value) + Math.exp(-value)) / (Math.exp(value) - Math.exp(-value)));
		}
		return returnValue;
	}

	/**
	 * Returns the hyperbolic secant of the argument value
	 * 
	 * @param pValue Value
	 * @return Hyperbolic secant
	 */
	public static Double sechFun(Double pValue) {
		Double returnValue;
		if (pValue == null) {
			returnValue = null;
		} else {
			double value = pValue.doubleValue();
			returnValue = Double.valueOf(2 / (Math.exp(value) + Math.exp(-value)));
		}
		return returnValue;
	}

	/**
	 * Returns the hyperbolic cosecant of the argument value
	 * 
	 * @param pValue Value
	 * @return Hyperbolic cosecant
	 */
	public static Double csechFun(Double pValue) {
		Double returnValue;
		if (pValue == null) {
			returnValue = null;
		} else {
			double value = pValue.doubleValue();
			returnValue = Double.valueOf(2 / (Math.exp(value) - Math.exp(-value)));
		}
		return returnValue;
	}

	/**
	 * Returns the inverse hyperbolic sine of the argument value
	 * 
	 * @param pValue Value
	 * @return Hyperbolic sine
	 */
	public static Double asinhFun(Double pValue) {
		Double returnValue;
		if (pValue == null) {
			returnValue = null;
		} else {
			double value = pValue.doubleValue();
			returnValue = Double.valueOf(Math.log(value + Math.sqrt(value * value + 1)));
		}
		return returnValue;
	}

	/**
	 * Returns the inverse hyperbolic cosine of the argument value
	 * 
	 * @param pValue Value
	 * @return Inverse hyperbolic cosine
	 */
	public static Double acoshFun(Double pValue) {
		Double returnValue;
		if (pValue == null) {
			returnValue = null;
		} else {
			double value = pValue.doubleValue();
			returnValue = Double.valueOf(Math.log(value + Math.sqrt(value * value - 1)));
		}
		return returnValue;
	}

	/**
	 * Returns the inverse hyperbolic tangent of the argument value
	 * 
	 * @param pValue Value
	 * @return Inverse hyperbolic tangent
	 */
	public static Double atanhFun(Double pValue) {
		Double returnValue;
		if (pValue == null) {
			returnValue = null;
		} else {
			double value = pValue.doubleValue();
			if (value < -1 || value > 1) {
				throw new ArithmeticException(
						aritmeticError + "inverse hyperbolic tangent of functions");
			}
			returnValue = Double.valueOf(Math.log((1 + value) / (1 - value)) / 2);
		}
		return returnValue;
	}

	/**
	 * Returns the inverse hyperbolic cotangent of the argument value
	 * 
	 * @param pValue Value
	 * @return Inverse hyperbolic cotangent
	 */
	public static Double acothFun(Double pValue) {
		Double returnValue;
		if (pValue == null) {
			returnValue = null;
		} else {
			double value = pValue.doubleValue();
			returnValue = Double.valueOf(Math.log((value + 1) / (value - 1)) / 2);
		}
		return returnValue;
	}

	/**
	 * Returns the inverse hyperbolic secant of the argument value
	 * 
	 * @param pValue Value
	 * @return Inverse hyperbolic secant
	 */
	public static Double asechFun(Double pValue) {
		Double returnValue;
		if (pValue == null) {
			returnValue = null;
		} else {
			double value = pValue.doubleValue();
			Double valor = Double.valueOf(-value * value + 1);
			if (valor.doubleValue() < 0) {
				throw new ArithmeticException(
						aritmeticError + "inverse hyperbolic secant of functions");
			}
			returnValue = Double.valueOf(Math.log((Math.sqrt(valor.doubleValue()) + 1) / value));
		}
		return returnValue;
	}

	/**
	 * Returns the inverse hyperbolic cosecant of the argument value
	 * 
	 * @param pValue Value
	 * @return Inverse hyperbolic cosecant
	 */
	public static Double acsechFun(Double pValue) {
		Double returnValue;
		if (pValue == null) {
			returnValue = null;
		} else {
			double value = pValue.doubleValue();
			returnValue = Double
					.valueOf(Math.log((signFun(pValue).intValue() * Math.sqrt(value * value + 1) + 1) / value));
		}
		return returnValue;
	}

	// -------------------------------------------
	// -------- STRING FUNCTIONS ---------
	// -------------------------------------------

	// SEARCHING
	// ------------------------------------------

	/**
	 * Returns the first position of the substring specified by the argument subStr
	 * if it is found as part of the aString string. It returns 0 otherwise.
	 * 
	 * @param aString String
	 * @param subStr  Substring
	 * @return Index of ...
	 */
	public static Long indexOfFun(String aString, String subStr) {
		Long returnValue;
		if (aString == null || subStr == null) {
			returnValue = null;
		} else {
			returnValue = aString.indexOf(subStr) + 1L;
		}
		return returnValue;
	}

	/**
	 * Search the first occurrence of the substring specified by the argument subStr
	 * in the aString string after the position specified by the argument from, if
	 * the substring is found, its position in the string is returned, It returns 0
	 * otherwise.
	 * 
	 * @param aString String
	 * @param subStr  Substring
	 * @param from    From
	 * @return Index of ...
	 */
	public static Long indexOfFromFun(String aString, String subStr, Long from) {
		Long returnValue;
		if (aString == null || subStr == null || from == null) {
			returnValue = null;
		} else {
			returnValue = aString.indexOf(subStr, from.intValue() - 1) + 1L;
		}
		return returnValue;
	}

	/**
	 * Returns the last position of the substring specified by the argument subStr
	 * if it is found as part of the aString string, otherwise it returns 0.
	 * 
	 * @param aString String
	 * @param subStr  Substring
	 * @return Last index of
	 */
	public static Long lastIndexOfFun(String aString, String subStr) {
		Long returnValue;
		if (aString == null || subStr == null) {
			returnValue = null;
		} else {
			returnValue = aString.lastIndexOf(subStr) + 1L;
		}
		return returnValue;
	}

	/**
	 * Search the rightmost occurrence of the substring specified by the argument
	 * subStr in the prefix string before the position specified by the argument
	 * ending, if the substring is found it position in the string is returned,
	 * otherwise it returns 0.
	 * 
	 * @param aString String
	 * @param subStr  Substring
	 * @param ending  Before index
	 * @return Last index of
	 */
	public static Long lastIndexOfFromFun(String aString, String subStr, Long ending) {
		Long returnValue;
		if (aString == null || subStr == null || ending == null) {
			returnValue = null;
		} else {
			String auxstring = leftSubstringFun(aString, ending);
			returnValue = lastIndexOfFun(auxstring, subStr);
		}
		return returnValue;
	}

	/**
	 * Returns true if aString string starts with the substring specified by the
	 * argument prefix, false otherwise.
	 * 
	 * @param aString String
	 * @param prefix  Prefix
	 * @return True if String starts with Prefix
	 */
	public static Boolean strStartsWithFun(String aString, String prefix) {
		Boolean returnValue;
		if (aString == null || prefix == null) {
			returnValue = null;
		} else {
			returnValue = aString.startsWith(prefix);
		}
		return returnValue;
	}

	/**
	 * Returns true if aString string ends with the substring specified by the
	 * argument sufix, false otherwise.
	 * 
	 * @param aString String
	 * @param sufix   Sufix
	 * @return True if String ends with sufix
	 */
	public static Boolean strEndsWithFun(String aString, String sufix) {
		Boolean returnValue;
		if (aString == null || sufix == null) {
			returnValue = null;
		} else {
			returnValue = aString.endsWith(sufix);
		}
		return returnValue;
	}

	/**
	 * Returns true if the substring that begins in the from position of the aString
	 * string, starts with the substring specified by the argument prefix, false
	 * otherwise.
	 * 
	 * @param aString String
	 * @param prefix  Prefix
	 * @param from    From
	 * @return True if the substring that begins in the from position
	 */
	public static Boolean strStartsWithFromFun(String aString, String prefix, Long from) {
		Boolean returnValue;
		if (aString == null || prefix == null || from == null) {
			returnValue = null;
		} else {
			returnValue = aString.startsWith(prefix, from.intValue());
		}
		return returnValue;
	}

	// SUBSTRING FUNCTIONS
	// ------------------------------------------

	/**
	 * Returns a string containing a number of size characters of the right side of
	 * the aString string.
	 * 
	 * @param aString String
	 * @param pSize   Size
	 * @return Right substring
	 */
	public static String rightSubstringFun(String aString, Long pSize) {
		String returnValue;
		if (aString == null || pSize == null) {
			returnValue = null;
		} else {
			int size = pSize.intValue();

			if (size < 0 || size > aString.length())
				throw new StringIndexOutOfBoundsException();

			returnValue = aString.substring(aString.length() - size);
		}
		return returnValue;
	}

	/**
	 * Returns a string containing a number of size characters of the left side of
	 * the aString string.
	 * 
	 * @param aString String
	 * @param size    Size
	 * @return Left substring
	 */
	public static String leftSubstringFun(String aString, Long size) {
		String returnValue;
		if (aString == null || size == null) {
			returnValue = null;
		} else {
			if (aString.length() <= size)
				returnValue = aString;
			else
				returnValue = aString.substring(0, size.intValue());
		}
		return returnValue;
	}

	/**
	 * Returns a copy of a substring of the aString string. This copy starts at the
	 * from position of the aString string and copy an amount of size characters.
	 * 
	 * @param aString String
	 * @param pFrom   From
	 * @param pSize   Size
	 * @return Substring
	 */
	public static String substringFun(String aString, Long pFrom, Long pSize) {
		String returnValue;
		if (aString == null || pFrom == null || pSize == null) {
			returnValue = null;
		} else {
			int from = pFrom.intValue();
			int size = pSize.intValue();

			if (size < 0 || from + size > aString.length() + 1)
				throw new StringIndexOutOfBoundsException();
			returnValue = aString.substring(from - 1, from + size - 1);
		}
		return returnValue;
	}

	/**
	 * Returns a new string which is a copy of aString string without its leading
	 * spaces.
	 * 
	 * @param aString String
	 * @return Left trim string
	 */
	public static String leftTrimFun(String aString) {
		String returnValue;
		if (aString == null) {
			returnValue = null;
		} else {
			int count = 0;
			for (; count < aString.length(); count++)
				if (aString.charAt(count) != ' ')
					break;
			returnValue = aString.substring(count);
		}
		return returnValue;
	}

	/**
	 * Returns a new string which is a copy of aString string without its trailing
	 * spaces.
	 * 
	 * @param aString String
	 * @return Right trim string
	 */
	public static String rightTrimFun(String aString) {
		String returnValue;
		if (aString == null || aString.length() == 0) {
			returnValue = aString;
		} else {
			int firstSpace = aString.length();
			for (; firstSpace > 0; firstSpace--)
				if (aString.charAt(firstSpace - 1) != ' ')
					break;
			returnValue = aString.substring(0, firstSpace);
		}
		return returnValue;
	}

	/**
	 * Returns a new string which is a copy of aString string without its both
	 * leading and trailing spaces.
	 * 
	 * @param aString String
	 * @return Trim string
	 */
	public static String strTrimFun(String aString) {
		String returnValue;
		if (aString == null) {
			returnValue = null;
		} else {
			returnValue = aString.trim();
		}
		return returnValue;
	}

	/**
	 * Returns a copy of the aString string but with all occurrences of the subStr
	 * substring specified replaced by the other string.
	 * 
	 * @param aString String
	 * @param subStr  Substring
	 * @param other   To replace
	 * @return New string
	 */
	public static String strReplaceFun(String aString, String subStr, String other) {
		String returnValue;
		if (aString == null || subStr == null || other == null) {
			returnValue = null;
		} else {
			returnValue = replaceFromFun(aString, subStr, other, Long.valueOf(1));
		}
		return returnValue;
	}

	/**
	 * Returns a copy of the aString string but with all occurrences of the subStr
	 * substring specified replaced by the other string, starting from the from
	 * position.
	 * 
	 * @param aString String
	 * @param subStr  Substring
	 * @param other   To replace
	 * @param pFrom   From
	 * @return New string
	 */
	public static String replaceFromFun(String aString, String subStr, String other, Long pFrom) {
		String returnValue;
		if (aString == null || subStr == null || other == null || pFrom == null) {
			returnValue = null;
		} else {
			int from = pFrom.intValue();

			StringBuilder buffer = new StringBuilder();
			buffer.append(aString.substring(0, from - 1));
			int oldPos = from - 1;
			int pos = aString.indexOf(subStr, from - 1);
			for (; pos >= 0; pos = aString.indexOf(subStr, oldPos)) {
				buffer.append(aString.substring(oldPos, pos));
				buffer.append(other);
				oldPos = pos + subStr.length();
			}
			buffer.append(aString.substring(oldPos));
			returnValue = buffer.toString();
		}
		return returnValue;
	}

	/**
	 * Returns a copy of the aString string with a number of times occurrences of
	 * the subStr substring specified replaced by the other string, starting from
	 * the from position.
	 * 
	 * @param aString String
	 * @param subStr  Substring
	 * @param other   To replace
	 * @param pFrom   From
	 * @param pTimes  N times
	 * @return New string
	 */
	public static String replaceTimesFun(String aString, String subStr, String other, Long pFrom, Long pTimes) {
		String returnValue;
		if (aString == null || subStr == null || other == null || pFrom == null || pTimes == null) {
			returnValue = null;
		} else {
			int from = pFrom.intValue();
			int times = pTimes.intValue();

			StringBuilder buffer = new StringBuilder();
			int oldPos = from - 1;
			buffer.append(aString.substring(0, from - 1));
			int pos = aString.indexOf(subStr, from - 1);
			for (; pos >= 0 && times > 0; pos = aString.indexOf(subStr, oldPos), times--) {
				buffer.append(aString.substring(oldPos, pos));
				buffer.append(other);
				oldPos = pos + subStr.length();
			}
			buffer.append(aString.substring(oldPos));
			returnValue = buffer.toString();
		}
		return returnValue;
	}

	/**
	 * Concatenates the secondStr string at the end of the firstStr string
	 * 
	 * @param firstStr  String 1
	 * @param secondStr String 2
	 * @return New string
	 */
	public static String concatFun(String firstStr, String secondStr) {
		return Utilities.concat(firstStr, secondStr);
	}

	/**
	 * Returns a new String which is a copy of aString without the region defined by
	 * the start position specified with the specified length.
	 * 
	 * @param aString String
	 * @param pStart  From
	 * @param pLength Lenght
	 * @return New string
	 */
	public static String strDeleteFun(String aString, Long pStart, Long pLength) {
		String returnValue;
		if (aString == null || pStart == null || pLength == null) {
			returnValue = null;
		} else {
			int start = pStart.intValue();
			int length = pLength.intValue();

			if (length < 0)
				throw new StringIndexOutOfBoundsException();
			StringBuilder buffer = new StringBuilder(aString);
			returnValue = buffer.delete(start - 1, start - 1 + length).toString();
		}
		return returnValue;
	}

	/**
	 * Returns a copy of the aString string with a new string (insertion) inserted
	 * at the index position.
	 * 
	 * @param aString   String
	 * @param index     Index
	 * @param insertion Insertion
	 * @return New string
	 */
	public static String strInsertFun(String aString, Long index, String insertion) {
		String returnValue;
		if (aString == null || index == null || insertion == null) {
			returnValue = null;
		} else {
			StringBuilder buffer = new StringBuilder(aString);
			returnValue = buffer.insert(index.intValue() - 1, insertion).toString();
		}
		return returnValue;
	}

	// CASE
	// ------------------------------------------

	/**
	 * Return a new String with all its characters in their Uppercase variant.
	 * 
	 * @param aString String
	 * @return Upper case
	 */
	public static String upperCaseFun(String aString) {
		String returnValue;
		if (aString == null) {
			returnValue = null;
		} else {
			returnValue = aString.toUpperCase();
		}
		return returnValue;
	}

	/**
	 * Return a new String with all its characters in their Lowercase variant.
	 * 
	 * @param aString String
	 * @return Lower case
	 */
	public static String lowerCaseFun(String aString) {
		String returnValue;
		if (aString == null) {
			returnValue = null;
		} else {
			returnValue = aString.toLowerCase();
		}
		return returnValue;
	}

	// SIMPLE QUERIES
	// ------------------------------------------

	/**
	 * Returns the size of the aString string.
	 * 
	 * @param aString String
	 * @return Length
	 */
	public static Long lengthFun(String aString) {
		Long returnValue;
		if (aString == null) {
			returnValue = null;
		} else {
			returnValue = Long.valueOf(aString.length());
		}
		return returnValue;
	}

	/**
	 * Returns a new Sting, copy of the aString string with its characters in
	 * reverse order.
	 * 
	 * @param aString String
	 * @return Reverse string
	 */
	public static String reverseFun(String aString) {
		String returnValue;
		if (aString == null) {
			returnValue = null;
		} else {
			returnValue = new StringBuffer(aString).reverse().toString();
		}
		return returnValue;
	}

	// COMPARISON
	// ------------------------------------------

	/**
	 * Compare both strings: firstStr and secondStr lexicographically. Returns a
	 * negative value when firstStr appears before secondStr, 0 if they are equals,
	 * or a positive value if firstStr follows secondStr.
	 * 
	 * @param firstStr  String 1
	 * @param secondStr String 2
	 * @return Result fo comparation
	 */
	public static Long strCompareFun(String firstStr, String secondStr) {
		Long returnValue;
		if (firstStr == null || secondStr == null) {
			returnValue = null;
		} else {
			returnValue = Long.valueOf(firstStr.compareTo(secondStr));
		}
		return returnValue;
	}

	/**
	 * Compares both strings lexicographically ignoring case considerations. It
	 * returns a negative value when the firstStr string appears before the
	 * secondStr in the lexical order, 0 if they are equals, or a positive value if
	 * the first string follows the second String.
	 * 
	 * @param firstStr  String 1
	 * @param secondStr String 2
	 * @return Result of comparation
	 */
	public static Long strCompareIgnoreCaseFun(String firstStr, String secondStr) {
		Long returnValue;
		if (firstStr == null || secondStr == null) {
			returnValue = null;
		} else {
			returnValue = Long.valueOf(firstStr.compareToIgnoreCase(secondStr));
		}
		return returnValue;
	}

	/**
	 * Compares two regions defined by the arguments of this method: The first
	 * string region is defined by the substring of the aString string starting at
	 * the from position with a length size, the second one is a substring which
	 * starts at the otherfrom position of the other string with the length size. If
	 * both regions are equals (depending on the ignoreCase parameter) this method
	 * returns true, if not, or if one of the from or otherfrom arguments is
	 * negative, or some of the regions exceeds the end of the string, this method
	 * returns false.
	 * 
	 * @param aString    String
	 * @param ignoreCase Ignore case
	 * @param from       From
	 * @param other      Other
	 * @param otherFrom  Other from
	 * @param length     Lenght
	 * @return Result of comparison
	 */
	public static Boolean strRegionMatchesFun(String aString, Boolean ignoreCase, Long from, String other,
			Long otherFrom, Long length) {
		Boolean returnValue;
		if (aString == null || ignoreCase == null || from == null || other == null || otherFrom == null
				|| length == null) {
			returnValue = null;
		} else {
			returnValue = Boolean.valueOf(aString.regionMatches(ignoreCase.booleanValue(), from.intValue(), other,
					otherFrom.intValue(), length.intValue()));
		}
		return returnValue;
	}

	/**
	 * Return true if the string firstStr comes before the string secondStr in
	 * lexicographic order.
	 * 
	 * @param firstStr  String 1
	 * @param secondStr String 2
	 * @return Result of comparison
	 */
	public static Boolean strLesserThanFun(String firstStr, String secondStr) {
		Boolean returnValue;
		if (firstStr == null || secondStr == null) {
			returnValue = null;
		} else {
			returnValue = Boolean.valueOf(firstStr.compareTo(secondStr) < 0);
		}
		return returnValue;
	}

	/**
	 * Return true if the string firstStr is equal to or comes before the string secondStr in
	 * lexicographic order.
	 * 
	 * @param firstStr  String 1
	 * @param secondStr String 2
	 * @return Result of comparison
	 */
	public static Boolean strLesserThanOrEqualToFun(String firstStr, String secondStr) {
		Boolean returnValue;
		if (firstStr == null || secondStr == null) {
			returnValue = null;
		} else {
			returnValue = firstStr.equals(secondStr) || Boolean.valueOf(firstStr.compareTo(secondStr) < 0);
		}
		return returnValue;
	}

	/**
	 * Return true if the string firstStr comes after the string secondStr in
	 * lexicographic order.
	 * 
	 * @param firstStr  String 1
	 * @param secondStr String 2
	 * @return Result of comparison
	 */
	public static Boolean strGreaterThanFun(String firstStr, String secondStr) {
		Boolean returnValue;
		if (firstStr == null || secondStr == null) {
			returnValue = null;
		} else {
			returnValue = firstStr.compareTo(secondStr) > 0;
		}
		return returnValue;
	}

	/**
	 * Return true if the string firstStr comes after the string secondStr in
	 * lexicographic order.
	 * 
	 * @param firstStr  String 1
	 * @param secondStr String 2
	 * @return Result of comparison
	 */
	public static Boolean strGreaterThanOrEqualToFun(String firstStr, String secondStr) {
		Boolean returnValue;
		if (firstStr == null || secondStr == null) {
			returnValue = null;
		} else {
			returnValue = firstStr.equals(secondStr) || firstStr.compareTo(secondStr) > 0;
		}
		return returnValue;
	}

	/**
	 * Return true if the string firstStr and the string secondStr are
	 * lexicographically equals
	 * 
	 * @param firstStr  String 1
	 * @param secondStr String 2
	 * @return True if are equals
	 */
	public static Boolean strSameAsFun(String firstStr, String secondStr) {
		Boolean returnValue;
		if (firstStr == null || secondStr == null) {
			returnValue = null;
		} else {
			returnValue = firstStr.compareTo(secondStr) == 0;
		}
		return returnValue;
	}

	// CONVERSION
	// ------------------------------------------

	/**
	 * Converts a TEXT type in to a STRING type
	 * 
	 * @param text Text value
	 * @return String format
	 */
	public static String textToStrFun(String text) {
		return text;
	}
    
    // EQUALITY
    // -------------------------------------------
    public static boolean areEqual(Object val1, Object val2) {
        return java.util.Objects.equals(val1, val2);
    }
}
