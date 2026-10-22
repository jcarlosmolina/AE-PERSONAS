package com.keralty.aepersonas.utils;

import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

import org.apache.commons.codec.binary.Hex;

import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.STDFunctions;
import com.keralty.aepersonas.persistence.AbstractAppEntity;

/**
 * This class contains general utility functions.
 */
public final class Utilities {

	private static final String REGEXP_PATH_SEPARATOR = "\\.";

	private static final String PATH_SEPARATOR = ".";

	private Utilities() {

	}

	/**
	 * This method uses java reflection to call the method 'checkIC()' on every instance in the collection argument.
	 * @param colIC Object collection
	 * @throws ModelException In case any Integrity constraint is not satisfied
	 */
	public static void checkIC(Collection<?> colIC) throws ModelException {
		Iterator<?> it = colIC.iterator();
		while (it.hasNext()) {
			try {
				Object one = it.next();
				Class<?> cls = one.getClass();
				Method mth = cls.getMethod("checkIC");
				mth.invoke(one);
			} catch (Exception e) {
				throw new ModelException(e.getMessage());
			}
		}
	}

	/**
	 * Implements the SQL 'like' operator. The function isn't case sensitive. An
	 * ampersand is implicitly added at the end of the pattern.
	 * 
	 * @param str
	 *            string to test against the pattern.
	 * @param pattern
	 *            the pattern to apply.
	 * @return True if str matches the pattern
	 */
	public static boolean like(String str, String pattern) {

        if ((str == null) || (pattern == null))
            return false;

        int iStr = 0;

        String tmpPattern = pattern.toLowerCase();
        String tmpString = str.toLowerCase();

        StringTokenizer desComp = new  StringTokenizer(tmpPattern, "%", true);

        while (desComp.hasMoreTokens()) {
            String token = desComp.nextToken();
            if (token.equals("_")) {
                iStr++;
            } else if (token.equals("%")) {
                String sigToken = null;
                while (desComp.hasMoreTokens()) {
                     String tmp = desComp.nextToken();
                     if (!tmp.equals("%") && !tmp.equals("_")) {
                        sigToken = tmp;
                        break;
                     }
                }
                if (sigToken == null) {
                    return true;
                }
                int indice = tmpString.indexOf(sigToken, iStr);
                if (indice == -1) {
                    return false;
                } else {
                    iStr = indice + sigToken.length();
                }
            } else {
                if (tmpString.regionMatches(iStr, token, 0, token.length())) {
                    iStr += token.length();
                } else {
                    return false;
                }
            }
        }
        return true;
    }
	 
	private static boolean likeNotNull(String str, String pattern) {
		return str.matches(pattern + ".*");
	}

	/**
	 * Implements the Contains operator.
	 * The function isn't case sensitive.
	 * @param str String where the pattern may be contained.
	 * @param pattern the string to search.
	 * @return true if the collection of conditions are contained in the text.
	 */
	public static boolean contains(String str, String pattern) {
		boolean iscontained = true;
		List<String> conditions = null;
		String lStr = str;
		String lPattern = pattern;

		if ((lStr == null) || (lPattern == null)) {
			iscontained = false;
		} else {
			lStr = lStr.toLowerCase();
			lPattern = lPattern.toLowerCase();

			conditions = Utilities.getContainsConditions(lPattern);
			Iterator<String> conds = conditions.iterator();
			while(conds.hasNext()) {
				if(!lStr.contains(conds.next())) {
					iscontained = false;
					break;
				}
			}
		}
		return iscontained;
	}

	/**
	 * Gets a list of CONTAINS conditions
	 * @param cond is a String with all contains conditions in a plain list,
	 * the delimiter used for separating conditions is a blank space or quotes
	 * @return a String list with the conditions
	 */
	public static List<String> getContainsConditions(String cond) {
        List<String> conditions = new ArrayList<>();
        conditions.add(cond);
        return conditions;
	}

	/** Compares two blob attributes to decide if they are equal or not.
	 * @param ob1 the first blob attribute to compare.
	 * @param ob2 the second blob attribute to compare.
	 * @return a boolean indicating if the two blob attributes are equal or not.
	 */
	public static boolean isBlobEqual(Object ob1, Object ob2) {
		boolean lReturn = true;
		byte[] blob1=(byte[])ob1;
		byte[] blob2=(byte[])ob2;
		if (blob1.length != blob2.length){
			lReturn = false;
		}else{
			for(int i=0;i<blob1.length;i++){
				if (blob1[i]!=blob2[i]){
					lReturn = false;
					break;
				}
			}
		}
		return lReturn;
	}

	/**
	 * Breaks a string to a collection by using a separator and converts the strings to lower case.
	 * @param str the String to split.
	 * @param separator the string used to break the original string
	 * @return a Collection result of breaking the input string using the given separator.
	 */
	public static Collection<String> toCollection(String str, String separator) {
		Collection<String> result = new ArrayList<>(1);
		if (str != null) {

			String lStr = str.toLowerCase();
			StringTokenizer tokenizer = new StringTokenizer(lStr, separator);

			int total = tokenizer.countTokens();
			result = new ArrayList<>(total);

			for (int i = 0; i < total; i++) {
				result.add(tokenizer.nextToken().trim());
			}
		}
		return result;
	}

	/**
	 * Breaks a string to a String array of substring by using a separator and converts the strings to lower case.
	 * @param str the String to split.
	 * @param separator the string used to break the original string
	 * @return an array of strings result of breaking the input string using the given separator.
	 */
	public static String[] toArray(String str, String separator) {
		String[] result = new String[0];
		if (str != null) {

			StringTokenizer tokenizer = new StringTokenizer(str, separator);

			int total = tokenizer.countTokens();
			result = new String[total];

			for (int i = 0; i < total; i++) {
				result[i] = tokenizer.nextToken().trim();
			}
		}
		return result;
	}

	/**
	 * Concatenate all the strings in the collection argument and puts between the the separator string.
	 * @param strCol the collection of String to concatenate.
	 * @param separator the string to put between the strings
	 * @return the string result of the concatenation.
	 */
	public static String concat(Collection<String> strCol, String separator) {
		int size = strCol.size();

		String lReturn = "";
		if (size == 1) {
			lReturn = strCol.iterator().next();
		}
		else {

			StringBuilder buffer = new StringBuilder();
			Iterator<String> it = strCol.iterator();
			int count = 0;
			while (it.hasNext()) {
				buffer.append((String) it.next());
				count++;
				if (count < size) {
					buffer.append(separator);
				}
			}
			lReturn = buffer.toString();
		}
		return lReturn;
	}

	/** Call the function 'concat' using the separator ','
	 * @param strCol the collection with the strings to concat.
	 * @return the string result of the concatenation.
	 */
	public static String buildSQLFrom(Collection<String> strCol) {
		return concat(strCol, ",");
	}

	/** Call the function 'concat' using the separator ' AND '
	 * @param strCol the collection with the strings to concat.
	 * @return the string result of the concatenation.
	 */
	public static String buildSQLWhere(Collection<String> strCol) {
		int size = strCol.size();
		String lReturn = "";
		if (size == 1) {
			lReturn = '(' + strCol.iterator().next() + ')';
		}
		else {
			StringBuilder buffer = new StringBuilder();
			Iterator<String> it = strCol.iterator();
			int count = 0;
			while (it.hasNext()) {
				buffer.append("(" + it.next() + ")");
				count++;
				if (count < size) {
					buffer.append(" AND ");
				}
			}
			lReturn = buffer.toString();
		}
		return lReturn;
	}

	/**
	 * If the proposal string is not present in the collection the method return the proposal
	 * else the method adds a sufix that guaranties that the new proposal is not present and returns it.
	 * @param proposal the string to find.
	 * @param strCol the collection with the strings where to find the proposal.
	 * @return a proposal that is not in the strCol collection..
	 */
	public static String giveUnique(String  proposal, Collection<String> strCol) {
		StringBuilder lReturn = new StringBuilder();
		if (!strCol.contains(proposal)) {
			lReturn.append(proposal);
		} else {
			int cont = 1;

			while (strCol.contains(lReturn.toString())) {
				lReturn.append(cont);
				cont++;
			}
		}
		return lReturn.toString();
	}

	/**
	 * Normalizes the input name by putting it in Pascal mode.
	 * @param classname the string to put in Pascal mode.
	 * @return the string in Pascal mode.
	 */
	public static String normalize(String classname) {
		String first = classname.substring(0, 1);
		return classname.replaceFirst(first,first.toUpperCase());
	}

	/**
	 * Creates a Time object with the date set to 01-January-1970. Having such Time
	 * objects eases the task of comparing different Times as they only differ in
	 * the Time part and not in the Date part.
	 * @param millis the milliseconds representing the time object.
	 * @return A Time object with the date set to 01-January-1970.
	 */
	public static java.sql.Time newNormalizedTime(long millis) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(millis);
		calendar.set(Calendar.YEAR, 1970);
		calendar.set(Calendar.MONTH, Calendar.JANUARY);
		calendar.set(Calendar.DAY_OF_MONTH, 1);

		return new Time(calendar.getTimeInMillis());
	}

	/** Compares two blob attributes to decide if they are equal or not.
	 * @param ob1 the first blob attribute to compare.
	 * @param ob2 the second blob attribute to compare.
	 * @return a boolean indicating if the two blob attributes are equal or not.
	 */
	public static boolean isEqual(byte[] ob1, byte[] ob2) {
		return (ob1 == null && isEqual4Nulls(ob1, ob2)) || (ob1 != null && isEqualNotNull(ob1, ob2));
	}

	private static boolean isEqualNotNull(byte[] ob1, byte[] ob2) {
		boolean lReturn = (ob1.length == ob2.length);
		if (lReturn) {
			for (int i = 0; i < ob1.length; i++) {
				if (ob1[i] != ob2[i]) {
					lReturn = false;
					break;
				}
			}
		}
		return lReturn;
	}
	/** Compares two integer attributes to decide if they are equal or not.
	 * @param ob1 the first integer attribute to compare.
	 * @param ob2 the second integer attribute to compare.
	 * @return a boolean indicating if the two integer attributes are equal or not.
	 */
	public static boolean isEqual(Integer ob1, Integer ob2){
		return isEqual(Long.valueOf(ob1 != null ? ob1 : 0), Long.valueOf(ob2 != null ? ob2 : 0));
	}
	/** Compares two Long attributes to decide if they are equal or not.
	 * @param ob1 the first Long attribute to compare.
	 * @param ob2 the second Long attribute to compare.
	 * @return a boolean indicating if the two Long attributes are equal or not.
	 */
	public static boolean isEqual(Long ob1, Long ob2){
		return isEqual(Double.valueOf(ob1 != null ? ob1 : 0), Double.valueOf(ob2 != null ? ob2 : 0));
	}
	/** Compares two integer attributes to decide if they are lesser or not.
	 * @param ob1 the first integer attribute to compare.
	 * @param ob2 the second integer attribute to compare.
	 * @return a boolean indicating if the two integer attributes are lesser or not.
	 */
	public static boolean isLesser(Integer ob1, Integer ob2){
		boolean lReturn = false;
		if (ob1 != null && ob2 != null){
			lReturn = ob1 < ob2;
		}
		return lReturn;    			
	}
	/** Compares two integer attributes to decide if they are greater or not.
	 * @param ob1 the first integer attribute to compare.
	 * @param ob2 the second integer attribute to compare.
	 * @return a boolean indicating if the two integer attributes are greater or not.
	 */
	public static boolean isGreater(Integer ob1, Integer ob2){
		boolean lReturn = false;
		if (ob1 != null && ob2 != null){
			lReturn = ob1 > ob2;
		}
		return lReturn;    			
	}
	/** Compares two integer attributes to decide if they are lesser/equal or not.
	 * @param ob1 the first integer attribute to compare.
	 * @param ob2 the second integer attribute to compare.
	 * @return a boolean indicating if the two integer attributes are lesser/equal or not.
	 */
	public static boolean isLesserOrEqual(Integer ob1, Integer ob2){
		boolean lReturn = false;
		if (ob1 == null && ob2 == null){
			lReturn = true;
		}
		if (ob1 != null && ob2 != null){
			lReturn = ob1 <= ob2;
		}
		return lReturn;    			
	}
	/** Compares two integer attributes to decide if they are greater/equal or not.
	 * @param ob1 the first integer attribute to compare.
	 * @param ob2 the second integer attribute to compare.
	 * @return a boolean indicating if the two integer attributes are greater/equal or not.
	 */
	public static boolean isGreaterOrEqual(Integer ob1, Integer ob2){
		boolean lReturn = false;
		if (ob1 == null && ob2 == null){
			lReturn = true;
		}
		if (ob1 != null && ob2 != null){
			lReturn = ob1 >= ob2;
		}
		return lReturn;    			
	}
	/** Compares two double attributes to decide if they are equal or not.
	 * @param ob1 the first double attribute to compare.
	 * @param ob2 the second double attribute to compare.
	 * @return a boolean indicating if the two double attributes are equal or not.
	 */
	public static boolean isEqual(Double ob1, Double ob2){
		return (ob1 == null && isEqual4Nulls(ob1, ob2)) || (ob1 != null && ob1.equals(ob2));
	}
	/** Compares two double attributes to decide if they are lesser or not.
	 * @param ob1 the first double attribute to compare.
	 * @param ob2 the second double attribute to compare.
	 * @return a boolean indicating if the two double attributes are lesser or not.
	 */
	public static boolean isLesser(Double ob1, Double ob2){
		boolean lReturn = false;
		if (ob1 != null && ob2 != null){
			lReturn = ob1 < ob2;
		}
		return lReturn;    			
	}
	/** Compares two double attributes to decide if they are greater or not.
	 * @param ob1 the first double attribute to compare.
	 * @param ob2 the second double attribute to compare.
	 * @return a boolean indicating if the two double attributes are greater or not.
	 */
	public static boolean isGreater(Double ob1, Double ob2){
		boolean lReturn = false;
		if (ob1 != null && ob2 != null){
			lReturn = ob1 > ob2;
		}
		return lReturn;    			
	}

	/** Compares two attributes (one double, one integer) to decide if they are greater or not.
	 * @param ob1 the first double attribute to compare.
	 * @param ob2 the second integer attribute to compare.
	 * @return a boolean indicating if the two double attributes are greater or not.
	 */
	public static boolean isGreater(Double ob1, Integer ob2){
		boolean lReturn = false;
		if (ob1 != null && ob2 != null){
			lReturn = ob1 > ob2;
		}
		return lReturn;             
	}

	/** Compares two double attributes to decide if they are lesser/equal or not.
	 * @param ob1 the first double attribute to compare.
	 * @param ob2 the second double attribute to compare.
	 * @return a boolean indicating if the two double attributes are lesser/equal or not.
	 */
	public static boolean isLesserOrEqual(Double ob1, Double ob2){
		boolean lReturn = false;
		if (ob1 == null && ob2 == null){
			lReturn = true;
		}
		if (ob1 != null && ob2 != null){
			lReturn = ob1 <= ob2;
		}
		return lReturn;    			
	}
	/** Compares two double attributes to decide if they are greater/equal or not.
	 * @param ob1 the first double attribute to compare.
	 * @param ob2 the second double attribute to compare.
	 * @return a boolean indicating if the two double attributes are greater/equal or not.
	 */
	public static boolean isGreaterOrEqual(Double ob1, Double ob2){
		boolean lReturn = false;
		if (ob1 == null && ob2 == null){
			lReturn = true;
		}
		if (ob1 != null && ob2 != null){
			lReturn = ob1 >= ob2;
		}
		return lReturn;    			
	}
	/** Compares two boolean attributes to decide if they are equal or not.
	 * @param ob1 the first boolean attribute to compare.
	 * @param ob2 the second boolean attribute to compare.
	 * @return a boolean indicating if the two boolean attributes are equal or not.
	 */
	public static boolean isEqual(Boolean ob1, Boolean ob2){
		return (ob1 == null && isEqual4Nulls(ob1, ob2)) || (ob1 != null && ob1.equals(ob2));
	}
	/** Compares two string attributes to decide if they are equal or not.
	 * @param ob1 the first string attribute to compare.
	 * @param ob2 the second string attribute to compare.
	 * @return a boolean indicating if the two string attributes are equal or not.
	 */
	public static boolean isEqual(String ob1, String ob2){
		return (ob1 == null && isEqual4Nulls(ob1, ob2)) || (ob1 != null && ob1.equalsIgnoreCase(ob2));
	}
	/** Compares two string attributes to decide if they are lesser or not.
	 * @param ob1 the first string attribute to compare.
	 * @param ob2 the second string attribute to compare.
	 * @return a boolean indicating if the two string attributes are lesser or not.
	 */
	public static boolean isLesser(String ob1, String ob2){

		boolean lReturn = false;
		if (ob1 != null && ob2 != null){
			if (ob1.compareToIgnoreCase(ob2) < 0){
				lReturn = true;
			}
			else {
				lReturn = false;
			}
		}
		return lReturn;    			
	}
	/** Compares two string attributes to decide if they are greater or not.
	 * @param ob1 the first string attribute to compare.
	 * @param ob2 the second string attribute to compare.
	 * @return a boolean indicating if the two string attributes are greater or not.
	 */
	public static boolean isGreater(String ob1, String ob2){
		boolean lReturn = false;
		if (ob1 != null && ob2 != null){
			if (ob1.compareToIgnoreCase(ob2) > 0){
				lReturn = true;
			}
			else {
				lReturn = false;
			}
		}
		return lReturn;    			
	}
	/** Compares two string attributes to decide if they are lesser/equal or not.
	 * @param ob1 the first string attribute to compare.
	 * @param ob2 the second string attribute to compare.
	 * @return a boolean indicating if the two string attributes are lesser/equal or not.
	 */
	public static boolean isLesserOrEqual(String ob1, String ob2){
		boolean lReturn = false;
		if (ob1 == null && ob2 == null){
			lReturn = true;
		}
		if (ob1 != null && ob2 != null){
			if (ob1.compareToIgnoreCase(ob2) <= 0){
				lReturn = true;
			}
			else {
				lReturn = false;
			}
		}
		return lReturn;    			
	}
	/** Compares two string attributes to decide if they are greater/equal or not.
	 * @param ob1 the first string attribute to compare.
	 * @param ob2 the second string attribute to compare.
	 * @return a boolean indicating if the two string attributes are greater/equal or not.
	 */
	public static boolean isGreaterOrEqual(String ob1, String ob2){
		boolean lReturn = false;
		if (ob1 == null && ob2 == null){
			lReturn = true;
		}
		if (ob1 != null && ob2 != null){
			if (ob1.compareToIgnoreCase(ob2) >= 0){
				lReturn = true;
			}
			else {
				lReturn = false;
			}
		}
		return lReturn;    			
	}
	/** Compares two date attributes to decide if they are equal or not.
	 * @param ob1 the first date attribute to compare.
	 * @param ob2 the second date attribute to compare.
	 * @return a boolean indicating if the two date attributes are equal or not.
	 */
	public static boolean isEqual(java.sql.Date ob1, java.sql.Date ob2){
		return (ob1 == null && isEqual4Nulls(ob1, ob2)) || (ob1 != null && STDFunctions.dateEqualsFun(ob1, ob2));
	}
	/** Compares two date attributes to decide if they are lesser or not.
	 * @param ob1 the first date attribute to compare.
	 * @param ob2 the second date attribute to compare.
	 * @return a boolean indicating if the two date attributes are lesser or not.
	 */
	public static boolean isLesser(java.sql.Date ob1, java.sql.Date ob2){
		boolean lReturn = false;
		if (ob1 != null && ob2 != null){
			lReturn = STDFunctions.dateBeforeFun(ob1, ob2);
		}
		return lReturn;    			
	}
	/** Compares two date attributes to decide if they are greater or not.
	 * @param ob1 the first date attribute to compare.
	 * @param ob2 the second date attribute to compare.
	 * @return a boolean indicating if the two date attributes are greater or not.
	 */
	public static boolean isGreater(java.sql.Date ob1, java.sql.Date ob2){
		boolean lReturn = false;
		if (ob1 != null && ob2 != null){
			lReturn = !isLesserOrEqual(ob1, ob2);
		}
		return lReturn;    			
	}
	/** Compares two date attributes to decide if they are lesser/equal or not.
	 * @param ob1 the first date attribute to compare.
	 * @param ob2 the second date attribute to compare.
	 * @return a boolean indicating if the two date attributes are lesser/equal or not.
	 */
	public static boolean isLesserOrEqual(java.sql.Date ob1, java.sql.Date ob2){
		boolean lReturn = false;
		if (ob1 == null && ob2 == null){
			lReturn = true;
		}
		if (ob1 != null && ob2 != null){
			lReturn = STDFunctions.dateBeforeFun(ob1, ob2) || STDFunctions.dateEqualsFun(ob1, ob2);
		}
		return lReturn;    			
	}
	/** Compares two date attributes to decide if they are greater/equal or not.
	 * @param ob1 the first date attribute to compare.
	 * @param ob2 the second date attribute to compare.
	 * @return a boolean indicating if the two date attributes are greater/equal or not.
	 */
	public static boolean isGreaterOrEqual(java.sql.Date ob1, java.sql.Date ob2){
		boolean lReturn = false;
		if (ob1 == null && ob2 == null){
			lReturn = true;
		}
		if (ob1 != null && ob2 != null){
			lReturn = !STDFunctions.dateBeforeFun(ob1, ob2);
		}
		return lReturn;    			
	}
	/** Compares two time attributes to decide if they are equal or not.
	 * @param ob1 the first time attribute to compare.
	 * @param ob2 the second time attribute to compare.
	 * @return a boolean indicating if the two time attributes are equal or not.
	 */
	public static boolean isEqual(java.sql.Time ob1, java.sql.Time ob2){
		return (ob1 == null && isEqual4Nulls(ob1, ob2)) || (ob1 != null && STDFunctions.timeEqualsFun(ob1, ob2));

	}
	/** Compares two time attributes to decide if they are lesser or not.
	 * @param ob1 the first time attribute to compare.
	 * @param ob2 the second time attribute to compare.
	 * @return a boolean indicating if the two time attributes are lesser or not.
	 */
	public static boolean isLesser(java.sql.Time ob1, java.sql.Time ob2){
		boolean lReturn = false;
		if (ob1 != null && ob2 != null){
			lReturn = STDFunctions.timeBeforeFun(ob1, ob2);
		}
		return lReturn;    			
	}
	/** Compares two time attributes to decide if they are greater or not.
	 * @param ob1 the first time attribute to compare.
	 * @param ob2 the second time attribute to compare.
	 * @return a boolean indicating if the two time attributes are greater or not.
	 */
	public static boolean isGreater(java.sql.Time ob1, java.sql.Time ob2){
		boolean lReturn = false;
		if (ob1 != null && ob2 != null){
			lReturn = !isLesserOrEqual(ob1, ob2);
		}
		return lReturn;
	}
	/** Compares two time attributes to decide if they are lesser or equal or not.
	 * @param ob1 the first time attribute to compare.
	 * @param ob2 the second time attribute to compare.
	 * @return a boolean indicating if the two time attributes are lesser or equal or not.
	 */
	public static boolean isLesserOrEqual(java.sql.Time ob1, java.sql.Time ob2){
		boolean lReturn = false;
		if (ob1 == null && ob2 == null){
			lReturn = true;
		}
		if (ob1 != null && ob2 != null){
			lReturn = STDFunctions.timeBeforeFun(ob1, ob2) || STDFunctions.timeEqualsFun(ob1, ob2);
		}
		return lReturn;    			
	}
	/** Compares two time attributes to decide if they are greater or equal or not.
	 * @param ob1 the first time attribute to compare.
	 * @param ob2 the second time attribute to compare.
	 * @return a boolean indicating if the two time attributes are greater or equal or not.
	 */
	public static boolean isGreaterOrEqual(java.sql.Time ob1, java.sql.Time ob2){
		boolean lReturn = false;
		if (ob1 == null && ob2 == null){
			lReturn = true;
		}
		if (ob1 != null && ob2 != null){
			lReturn = STDFunctions.timeAfterFun(ob1, ob2) || STDFunctions.timeEqualsFun(ob1, ob2);
		}
		return lReturn;
	}
	/** Compares two timestamp attributes to decide if they are equal or not.
	 * @param ob1 the first timestamp attribute to compare.
	 * @param ob2 the second timestamp attribute to compare.
	 * @return a boolean indicating if the two timestamp attributes are equal or not.
	 */
	public static boolean isEqual(java.sql.Timestamp ob1, java.sql.Timestamp ob2){
		return (ob1 == null && isEqual4Nulls(ob1, ob2)) || (ob1 != null && STDFunctions.datetimeEqualsFun(ob1, ob2));
	}
	/** Compares two timestamp attributes to decide if they are lesser or not.
	 * @param ob1 the first timestamp attribute to compare.
	 * @param ob2 the second timestamp attribute to compare.
	 * @return a boolean indicating if the two timestamp attributes are lesser or not.
	 */
	public static boolean isLesser(java.sql.Timestamp ob1, java.sql.Timestamp ob2){
		boolean lReturn = false;
		if (ob1 != null && ob2 != null){
			lReturn = STDFunctions.datetimeBeforeFun(ob1, ob2);
		}
		return lReturn;    			
	}
	/** Compares two timestamp attributes to decide if they are equal or not.
	 * @param ob1 the first timestamp attribute to compare.
	 * @param ob2 the second timestamp attribute to compare.
	 * @return a boolean indicating if the two timestamp attributes are equal or not.
	 */
	public static boolean isGreater(java.sql.Timestamp ob1, java.sql.Timestamp ob2){
		boolean lReturn = false;
		if (ob1 != null && ob2 != null){
			lReturn = !isLesserOrEqual(ob1, ob2);
		}
		return lReturn;    			
	}
	/** Compares two timestamp attributes to decide if they are lesser or equal or not.
	 * @param ob1 the first timestamp attribute to compare.
	 * @param ob2 the second timestamp attribute to compare.
	 * @return a boolean indicating if the two timestamp attributes are lesser or equal or not.
	 */
	public static boolean isLesserOrEqual(java.sql.Timestamp ob1, java.sql.Timestamp ob2){
		boolean lReturn = false;
		if (ob1 == null && ob2 == null){
			lReturn = true;
		}
		if (ob1 != null && ob2 != null){
			lReturn = STDFunctions.datetimeBeforeFun(ob1, ob2) || STDFunctions.datetimeEqualsFun(ob1, ob2);
		}
		return lReturn;    			
	}
	/** Compares two timestamp attributes to decide if they are greater or equal or not.
	 * @param ob1 the first timestamp attribute to compare.
	 * @param ob2 the second timestamp attribute to compare.
	 * @return a boolean indicating if the two timestamp attributes are greater or equal or not.
	 */
	public static boolean isGreaterOrEqual(java.sql.Timestamp ob1, java.sql.Timestamp ob2){
		boolean lReturn = false;
		if (ob1 == null && ob2 == null){
			lReturn = true;
		}
		if (ob1 != null && ob2 != null){
			lReturn = !STDFunctions.datetimeBeforeFun(ob1,ob2);
		}
		return lReturn;    			
	}
	/** Compares two instances to decide if they are equal or not.
	 * @param ob1 the first instance to compare.
	 * @param ob2 the second instance to compare.
	 * @return a boolean indicating if both instances are equal or not.
	 */
	public static boolean isEqual(AbstractAppEntity ob1, AbstractAppEntity ob2){
		boolean lReturn = false;
		if (ob1 == null || ob1.isNull()){
			if (ob2 == null || ob2.isNull()){
				lReturn = true;
			}
			else{
				lReturn = false;
			}
		}else{
			if (ob2 == null || ob2.isNull()){
				lReturn = false;
			}
			else {
				lReturn = ob1.getOid().equals(ob2.getOid());
			}
		}
		return lReturn;
	}

	/** Converts an integer argument into a double argument.
	 * @param arg the argument to convert.
	 * @return the value of the double.
	 */
	public static Double convertToDouble(Integer arg){
		Double lReturn = null;
		if (arg != null) {
			lReturn = Double.valueOf(arg);
		}
		return lReturn;
	}

	/** Converts a long argument into a double argument.
	 * @param arg the argument to convert.
	 * @return the value of the double.
	 */
	public static Double convertToDouble(Long arg){
		Double lReturn = null;
		if (arg != null) {
			lReturn = Double.valueOf(arg);
		}
		return lReturn;
	}

	/** Convert an integer argument into a double argument.
	 * @param arg the argument to convert.
	 * @return the value of the double.
	 */
	public static Double convertToDouble(Double arg){
		return arg;
	}

	/** Concatenate two string
	 * @param str1 the first string to concatenate.
	 * @param str2 the second string to concatenate
	 * @return the value of the concatenation.
	 */
	public static String concat(String str1, String str2){
		String lReturn = null;
		if (str1 != null && str2 != null){
			lReturn = str1.concat(str2);
		}
		return lReturn;
	}
	/** Returns the module of two doubles
	 * @param arg1 the first double
	 * @param arg2 the second double
	 * @return the value of the module.
	 */
	public static Double mod(Double arg1, Double arg2){
		Double lReturn = null;
		if (arg1 != null && arg2 != null){
			lReturn = arg1 % arg2;
		}
		return lReturn;
	}

	/** Returns the module of two doubles
	 * @param arg1 the first double
	 * @param arg2 the second double
	 * @return the value of the module.
	 */
	public static Double mod(Integer arg1, Double arg2){
		Double lReturn = null;
		if (arg1 != null && arg2 != null){
			lReturn = arg1 % arg2;
		}
		return lReturn;
	}

	/** Returns the module of two doubles
	 * @param arg1 the first double
	 * @param arg2 the second double
	 * @return the value of the module.
	 */
	public static Double mod(Double arg1, Integer arg2){
		Double lReturn = null;
		if (arg1 != null && arg2 != null){
			lReturn = arg1 % arg2;
		}
		return lReturn;
	}

	/** Returns the module of two integers
	 * @param arg1 the first integer
	 * @param arg2 the second integer
	 * @return the value of the module.
	 */
	public static Integer mod(Integer arg1, Integer arg2){
		Integer lReturn = null;
		if (arg1 != null && arg2 != null){
			lReturn = arg1 % arg2;
		}
		return lReturn;
	}

	/** Returns the addition of two doubles
	 * @param arg1 the first double
	 * @param arg2 the second double
	 * @return the value of the addition.
	 */
	public static Double add(Double arg1, Double arg2){
		Double lReturn = null;
		if (arg1 != null && arg2 != null){
			lReturn = arg1 + arg2;
		}
		return lReturn;
	}

	/** Returns the addition of two doubles
	 * @param arg1 the first double
	 * @param arg2 the second double
	 * @return the value of the addition.
	 */
	public static Double add(Integer arg1, Double arg2){
		Double lReturn = null;
		if (arg1 != null && arg2 != null){
			lReturn = arg1 + arg2;
		}
		return lReturn;
	}

	/** Returns the addition of two doubles
	 * @param arg1 the first double
	 * @param arg2 the second double
	 * @return the value of the addition.
	 */
	public static Double add(Double arg1, Integer arg2){
		Double lReturn = null;
		if (arg1 != null && arg2 != null){
			lReturn = arg1 + arg2;
		}
		return lReturn;
	}

	/** Returns the addition of two integers
	 * @param arg1 the first integer
	 * @param arg2 the second integer
	 * @return the value of the addition.
	 */
	public static Integer add(Integer arg1, Integer arg2){
		Integer lReturn = null;
		if (arg1 != null && arg2 != null){
			lReturn = arg1 + arg2;
		}
		return lReturn;
	}

	/** Returns the subtraction of two doubles
	 * @param arg1 the first double
	 * @param arg2 the second double
	 * @return the value of the subtraction.
	 */
	public static Double sub(Double arg1, Double arg2){
		Double lReturn = null;
		if (arg1 != null && arg2 != null){
			lReturn = arg1 - arg2;
		}
		return lReturn;
	}

	/** Returns the subtraction of two doubles
	 * @param arg1 the first double
	 * @param arg2 the second double
	 * @return the value of the subtraction.
	 */
	public static Double sub(Integer arg1, Double arg2){
		Double lReturn = null;
		if (arg1 != null && arg2 != null){
			lReturn = arg1 - arg2;
		}
		return lReturn;
	}

	/** Returns the subtraction of two doubles
	 * @param arg1 the first double
	 * @param arg2 the second double
	 * @return the value of the subtraction.
	 */
	public static Double sub(Double arg1, Integer arg2){
		Double lReturn = null;
		if (arg1 != null && arg2 != null){
			lReturn = arg1 - arg2;
		}
		return lReturn;
	}

	/** Returns the subtraction of two integers
	 * @param arg1 the first integer
	 * @param arg2 the second integer
	 * @return the value of the subtraction.
	 */
	public static Integer sub(Integer arg1, Integer arg2){
		Integer lReturn = null;
		if (arg1 != null && arg2 != null){
			lReturn = arg1 - arg2;
		}
		return lReturn;
	}

	/** Returns the multiplication of two doubles
	 * @param arg1 the first double
	 * @param arg2 the second double
	 * @return the value of the multiplication.
	 */
	public static Double mult(Double arg1, Double arg2){
		Double lReturn = null;
		if (arg1 != null && arg2 != null){
			lReturn = arg1 * arg2;
		}
		return lReturn;
	}

	/** Returns the multiplication of two doubles
	 * @param arg1 the first double
	 * @param arg2 the second double
	 * @return the value of the multiplication.
	 */
	public static Double mult(Integer arg1, Double arg2){
		Double lReturn = null;
		if (arg1 != null && arg2 != null){
			lReturn = arg1 * arg2;
		}
		return lReturn;
	}

	/** Returns the multiplication of two doubles
	 * @param arg1 the first double
	 * @param arg2 the second double
	 * @return the value of the multiplication.
	 */
	public static Double mult(Double arg1, Integer arg2){
		Double lReturn = null;
		if (arg1 != null && arg2 != null){
			lReturn = arg1 * arg2;
		}
		return lReturn;
	}

	/** Returns the multiplication of two integers
	 * @param arg1 the first integer
	 * @param arg2 the second integer
	 * @return the value of the multiplication.
	 */
	public static Integer mult(Integer arg1, Integer arg2){
		Integer lReturn = null;
		if (arg1 != null && arg2 != null){
			lReturn = arg1 * arg2;
		}
		return lReturn;
	}

	/** Returns the division of two doubles
	 * @param arg1 the first double
	 * @param arg2 the second double
	 * @return the value of the division.
	 */
	public static Double div(Double arg1, Double arg2){
		Double lReturn = null;
		if (arg1 != null && arg2 != null){
			lReturn = arg1 / arg2;
		}
		return lReturn;
	}

	/** Returns the division of two doubles
	 * @param arg1 the first double
	 * @param arg2 the second double
	 * @return the value of the division.
	 */
	public static Double div(Integer arg1, Double arg2){
		Double lReturn = null;
		if (arg1 != null && arg2 != null){
			lReturn = arg1 / arg2;
		}
		return lReturn;
	}

	/** Returns the division of two doubles
	 * @param arg1 the first double
	 * @param arg2 the second double
	 * @return the value of the division.
	 */
	public static Double div(Double arg1, Integer arg2){
		Double lReturn = null;
		if (arg1 != null && arg2 != null){
			lReturn = arg1 / arg2;
		}
		return lReturn;
	}

	/** Returns the division of two integers
	 * @param arg1 the first integer
	 * @param arg2 the second integer
	 * @return the value of the division.
	 */
	public static Integer div(Integer arg1, Integer arg2){
		Integer lReturn = null;
		if (arg1 != null && arg2 != null){
			lReturn = arg1 / arg2;
		}
		return lReturn;
	}

	/** Returns the integer division of two doubles
	 * @param arg1 the first double
	 * @param arg2 the second double
	 * @return the value of the integer division.
	 */
	public static Integer divint(Double arg1, Double arg2){
		Integer lReturn = null;
		if (arg1 != null && arg2 != null){
			double result = arg1 / arg2;
			lReturn = (int) result;
		}
		return lReturn;
	}

	/** Returns the integer division of two doubles
	 * @param arg1 the first double
	 * @param arg2 the second double
	 * @return the value of the integer division.
	 */
	public static Integer divint(Integer arg1, Double arg2){
		Integer lReturn = null;
		if (arg1 != null && arg2 != null){
			double result = arg1 / arg2;
			lReturn = (int) result;
		}
		return lReturn;
	}

	/** Returns the integer division of two doubles
	 * @param arg1 the first double
	 * @param arg2 the second double
	 * @return the value of the integer division.
	 */
	public static Integer divint(Double arg1, Integer arg2){
		Integer lReturn = null;
		if (arg1 != null && arg2 != null){
			double result = arg1 / arg2;
			lReturn = (int) result;
		}
		return lReturn;
	}

	/** Returns the integer division of two integers
	 * @param arg1 the first integer
	 * @param arg2 the second integer
	 * @return the value of the integer division.
	 */
	public static Integer divint(Integer arg1, Integer arg2){
		Integer lReturn = null;
		if (arg1 != null && arg2 != null){
			lReturn = (arg1 / arg2);
		}
		return lReturn;
	}

	/**
	 * Returns the given path with all its elements in Pascal case
	 * @param path to be converted
	 * @return path with all its elements in Pascal case
	 */
	public static String pathToCamelCase(String path){
		StringBuilder result = new StringBuilder();
		String separator = "";
		String[] pathItems = path.split(REGEXP_PATH_SEPARATOR);
		for(String pathItem : pathItems){
			pathItem = pathItem.substring(0,1).toLowerCase() + pathItem.substring(1); // Convert item name to Camel case
			result.append(separator + pathItem);
			separator = PATH_SEPARATOR;
		}
		return result.toString();
	}

	public static Object getValueOfItemInCollection(Object[] values, int position, String type) {
		Object value = values[position];

		if (type.equalsIgnoreCase(Constants.Type.AUTONUMERIC.getTypeName()))
			return castToAutonumeric(value);

		if (type.equalsIgnoreCase(Constants.Type.BLOB.getTypeName()))
			return castToBlob(value);

		if (type.equalsIgnoreCase(Constants.Type.BOOL.getTypeName()))
			return castToBool(value);

		if (type.equalsIgnoreCase(Constants.Type.DATE.getTypeName()))
			return castToDate(value);

		if (type.equalsIgnoreCase(Constants.Type.DATETIME.getTypeName()))
			return castToDateTime(value);

		if (type.equalsIgnoreCase(Constants.Type.INT.getTypeName()))
			return castToInt(value);

		if (type.equalsIgnoreCase(Constants.Type.NAT.getTypeName()))
			return castToNat(value);

		if (type.equalsIgnoreCase(Constants.Type.REAL.getTypeName()))
			return castToReal(value);

		if (type.equalsIgnoreCase(Constants.Type.STRING.getTypeName()))
			return castToString(value);

		if (type.equalsIgnoreCase(Constants.Type.TEXT.getTypeName()))
			return castToText(value);

		if (type.equalsIgnoreCase(Constants.Type.TIME.getTypeName()))
			return castToTime(value);

		return value;
	}

    private static Long castToAutonumeric(Object value) {
        return (Long) value;
    }

    private static byte[] castToBlob(Object value) {
        return (byte[]) value;
    }

    private static Boolean castToBool(Object value) {
        return (Boolean) value;
    }

    private static Date castToDate(Object value) {
        return (Date) value;
    }

    private static Timestamp castToDateTime(Object value) {
        return (Timestamp) value;
    }

    private static Long castToInt(Object value) {
        return (Long) value;
    }

    private static Long castToNat(Object value) {
        return (Long) value;
    }

    private static Double castToReal(Object value) {
        return (Double) value;
    }

    private static String castToString(Object value) {
        return (value == null ? null : STDFunctions.rightTrimFun((String) value));
    }

    private static String castToText(Object value) {
        if (value != null && value instanceof java.sql.Clob) {
            java.io.BufferedReader bf = null;
            StringBuffer out = new StringBuffer(100);
            try {
                bf = new java.io.BufferedReader(new java.io.InputStreamReader(((java.sql.Clob)value).getAsciiStream()));
                String line;
                while ( (line = bf.readLine()) != null) {
                    out.append(line);
                }
                bf.close();
            } catch (Exception ex) {
                out.setLength(0);
            } finally {
                try {
                    int i = 1;
                    while (bf != null && i>0){
                        i--; 
                        bf.close();
                    }
                } catch (java.io.IOException ioe){
                    out.setLength(0);
                }
            }
            return out.toString();
        } else {
            return (value != null ? (String)value : null);
        }
    }

    private static Time castToTime(Object value) {
        return (Time) value;
    }

	private static boolean isEqual4Nulls(Object ob1, Object ob2) {
		return ob1 == null ? ob2 == null : ob2 != null;
	}
	
    private static final String ENCRYPT_SEED = "18sep1999000000sat";
    private static final int ENCRYPT_BASE   = 10;
    private static final int ENCRYPT_MODULE = 64;
    private static final int ENCRYPT_OFFSET = 33;
    
    private static final String ENCRYPTION_LEGACY = "Legacy";
    private static final String ENCRYPTION_PBKDF2 = "PBKDF2";
    private static final String ENCRYPTION_METHOD = ENCRYPTION_LEGACY;
    
    /**
     * Function used to encrypt agent passwords.
     * @param str is the string to encrypt
     * @return the encrypted string
     */
    public static String encrypt(String str) {
    	switch(ENCRYPTION_METHOD) {
    	case ENCRYPTION_LEGACY:
    		return encryptLegacy(str);
    	case ENCRYPTION_PBKDF2:
    		return encryptPBKDF2(str);
    	default:
    		return str;
    	}
    }
    
    private static String encryptLegacy(String str) {
        StringBuilder baseString = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int i;
        for (i = 0; i < ENCRYPT_BASE - 1; i++) {
            baseString.append(ENCRYPT_SEED.substring(i, i + 1) + ENCRYPT_SEED.substring(i + ENCRYPT_BASE - 1, i + ENCRYPT_BASE));
        }
        for (i = 0; i < str.length(); i++) {
        	BigInteger car1 = BigInteger.valueOf(str.charAt(i));
            BigInteger resultLen = BigInteger.valueOf(baseString.length());
            BigInteger bigI = BigInteger.valueOf(i + 1L);
            BigInteger j = bigI.mod(resultLen);
            BigInteger car2 = BigInteger.valueOf(baseString.charAt(j.intValue()));
            BigInteger bigCar2 = BigInteger.valueOf(car1.longValue() * car2.longValue());
            BigInteger valor = BigInteger.valueOf(ENCRYPT_MODULE);
            char temp = (char) (bigCar2.mod(valor).intValue() + ENCRYPT_OFFSET);
            result.append(temp);
        }
        return result.toString();
    }

    private static String encryptPBKDF2(String str) {
        String salt = "ASKDJFDSI";
        int iterations = 10000;
        // 512
        int keyLength = 272;
        char[] passwordChars = str.toCharArray();
        byte[] saltBytes = salt.getBytes();

        byte[] hashedBytes;
		try {
			hashedBytes = hashPassword(passwordChars, saltBytes, iterations, keyLength);
		} catch (SystemException e) {
			return str;
		}
        return Hex.encodeHexString(hashedBytes);
    }
    
    private static byte[] hashPassword( final char[] password, final byte[] salt, final int iterations, final int keyLength ) throws SystemException {

        try {
            SecretKeyFactory skf = SecretKeyFactory.getInstance( "PBKDF2WithHmacSHA512" );
            PBEKeySpec spec = new PBEKeySpec( password, salt, iterations, keyLength );
            SecretKey key = skf.generateSecret( spec );
            return key.getEncoded();
        } catch ( NoSuchAlgorithmException | InvalidKeySpecException e ) {
            throw new SystemException(e);
        }
    }
}
