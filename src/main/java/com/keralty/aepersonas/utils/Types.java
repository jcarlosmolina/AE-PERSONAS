package com.keralty.aepersonas.utils;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Types implements Serializable {
        
    private static final long serialVersionUID = 1L;

	private SimpleDateFormat sdf; 
	private SimpleDateFormat timeFormat; 
	private SimpleDateFormat datetimeFormat;
	private NumberFormat numberFormatter = NumberFormat.getNumberInstance();
	private String trueFormat;
	private String falseFormat;

	/**
	 * Types
	 */
	public Types() {
		String pattern;
		String timepattern;
		String datetimepattern;
		Locale lc = Locale.getDefault();
		String language = lc.getLanguage();

		final String DATEFORMAT_ES = "dd/MM/yyy";
		final String DATEFORMAT_FR = DATEFORMAT_ES;
		final String DATEFORMAT_DE = "dd.MM.yyy";
		final String DATEFORMAT_GB = DATEFORMAT_ES;
		final String DATEFORMAT_US = "MM/dd/yyy";

		final String TIMEFORMAT_ES = "H:mm:ss";
		final String TIMEFORMAT_FR = TIMEFORMAT_ES;
		final String TIMEFORMAT_DE = TIMEFORMAT_ES;
		final String TIMEFORMAT_GB = "H:mm:ss a";
		final String TIMEFORMAT_US = TIMEFORMAT_GB;

		final String DATETIMEFORMAT_ES = "dd/MM/yyyy H:mm:ss";
		final String DATETIMEFORMAT_FR = DATETIMEFORMAT_ES;
		final String DATETIMEFORMAT_DE = "dd.MM.yyyy H:mm:ss";
		final String DATETIMEFORMAT_GB = "dd/MM/yyyy H:mm:ss a";
		final String DATETIMEFORMAT_US = "MM/dd/yyyy H:mm:ss a";

		if (language.equals("es")) {
			pattern = DATEFORMAT_ES;
			timepattern = TIMEFORMAT_ES;
			datetimepattern = DATETIMEFORMAT_ES;
			trueFormat = "Verdadero";
			falseFormat = "Falso";

		} else if (language.equals("fr")) {
			pattern = DATEFORMAT_FR;
			timepattern = TIMEFORMAT_FR;
			datetimepattern = DATETIMEFORMAT_FR;
			trueFormat = "Vrai";
			falseFormat = "Faux";

		} else if (language.equals("de")) {
			pattern = DATEFORMAT_DE;
			timepattern = TIMEFORMAT_DE;
			datetimepattern = DATETIMEFORMAT_DE;
			trueFormat = "Wahr";
			falseFormat = "Falsch";

		} else if (language.equals("en") && lc.getCountry().equals("GB")) {
			pattern = DATEFORMAT_GB;
			timepattern = TIMEFORMAT_GB;
			datetimepattern = DATETIMEFORMAT_GB;
			trueFormat = "True";
			falseFormat = "False";

		} else {
			pattern = DATEFORMAT_US;
			timepattern = TIMEFORMAT_US;
			datetimepattern = DATETIMEFORMAT_US;
			trueFormat = "True";
			falseFormat = "False";
		}
		sdf = new SimpleDateFormat(pattern);
		timeFormat = new SimpleDateFormat(timepattern);
		datetimeFormat = new SimpleDateFormat(datetimepattern);
	}

	/**
	 * Returns the simple Date format
	 * @return Simple Date format
	 */
	public SimpleDateFormat getSdf() {
		return sdf;
	}
	
	/**
	 * Returns the Time format
	 * @return Time format
	 */
	public SimpleDateFormat getTimeFormat() {
		return timeFormat;
	}
	
	/**
	 * Returns the Simple DateTime format
	 * @return DateTime format
	 */
	public SimpleDateFormat getDatetimeFormat() {
		return datetimeFormat;
	}

	/**
	 * This function parses a String that represents a date in a Locale sensitve manner.
	 * The format of the String is 'dd/MM/yyyy' for the Spanish Locale,
	 * is 'dd.MM.yy' for the German Locale
	 * and 'MM/dd/yyyy' for US Locale.
	 * @param sdate Date to parse
	 * @return Date 
	 */
	public Date parseDate(String sdate) {
		try {
			return new Date(sdf.parse(sdate.trim()).getTime());
		} catch (ParseException e) {
            throw new IllegalArgumentException(e.getMessage());
		}
	}

	/**
	 * This function parses a String that represents a time.
	 * The format of the String is 'H:mm:ss' for the Spanish Locale
	 * is 'H:mm:ss' for the German Locale
	 * and 'h:mm:ss a' for the rest of Locales.
	 * @param stime Time to parse
	 * @return Time
	 */
	public Time parseTime(String stime) {
		try {
			return  new Time(timeFormat.parse(stime.trim()).getTime());
		} catch (ParseException e) {
            throw new IllegalArgumentException(e.getMessage());
		}
	}

	/**
	 * This function parses a String that represents a date.
	 * The format of the String is 'dd/MM/yy H:mm:ss' for the Spanish Locale
	 * is 'dd.MM.yy H:mm:ss' for the German Locale
	 * and 'MM/dd/yy h:mm:ss a' for the rest of Locales.
	 * @param sdatetime Timestamp to parse
	 * @return Timestamp
	 */
	public Timestamp parseTimestamp(String sdatetime) {
		try {
			return new Timestamp(datetimeFormat.parse(sdatetime.trim()).getTime());
		} catch (ParseException e) {
            throw new IllegalArgumentException(e.getMessage());
		}
	}

	/**
	 * This function parses a String that represents a double number in a locale-sensitive manner.
	 * @param sdouble Double to parse
	 * @return Double 
	 */
	public double parseDouble(String sdouble) {
		try {
			Number tmp = numberFormatter.parse(sdouble);
			return tmp.doubleValue();
		} catch (ParseException e) {
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	/**
	 * This function parses a String that represents a boolean
	 * @param sbool Value to parse
	 * @return Boolean
	 */
	public Boolean parseBoolean(String sbool) {
		if (sbool.equalsIgnoreCase("true") || sbool.equalsIgnoreCase(trueFormat)) {
			return true;
		}
		if (sbool.equalsIgnoreCase("false") || sbool.equalsIgnoreCase(falseFormat)) {
			return false;
		}
		return false;
	}


	/** 
	 * Transform a character Unicode Stream to a String 
	 * @param reader Input reader
	 * @return String
	 **/
	public String stream2String(Reader reader) {
		StringBuilder temp = null;
		
		if (reader != null) {
			temp = new StringBuilder();
			char[] buffer = new char[2048];
			boolean salir = false;
			do {
				try {
					int total = reader.read(buffer);
					if (total == -1) {
						salir = true;
					} else {
						temp.append(buffer, 0, total);
					}
				} catch (IOException e) {
					salir = true;
				}
			} while (!salir);
		}
		
		String lReturn = null;
		if (temp != null)
			lReturn = temp.toString();
			
		return lReturn;
	}
}
