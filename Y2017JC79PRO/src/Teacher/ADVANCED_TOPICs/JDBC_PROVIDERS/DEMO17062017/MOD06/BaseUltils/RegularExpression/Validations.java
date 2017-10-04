package BaseUltils.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validations {

    /***
     * CheckDate
     * @param dateString
     * @return
     */
    public static boolean CheckDate(String dateString) {
        String DATE_PATTERN = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)";
        Pattern pattern = Pattern.compile(DATE_PATTERN);
        Matcher matcher = pattern.matcher(dateString);
        if (matcher.matches()) {
            matcher.reset();
            if (matcher.find()) {
                String day = matcher.group(1);
                String month = matcher.group(2);
                int year = Integer.parseInt(matcher.group(3));

                if (day.equals("31")
                        && (month.equals("4") || month.equals("6") || month.equals("9") || month.equals("11")
                                || month.equals("04") || month.equals("06") || month.equals("09"))) {
                    return false; // only 1,3,5,7,8,10,12 has 31 days
                } else if (month.equals("2") || month.equals("02")) {
                    // leap year
                    if (year % 4 == 0) {
                        if (day.equals("30") || day.equals("31")) {
                            return false;
                        } else {
                            return true;
                        }
                    } else {
                        if (day.equals("29") || day.equals("30") || day.equals("31")) {
                            return false;
                        } else {
                            return true;
                        }
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /***
     * CheckEmail
     * @param email
     * @return
     */
    public static boolean CheckEmail(String email) {
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    /***
     * CheckImage
     * @param fileName
     * @return
     */
    public static boolean CheckImage(String fileName) {
        String IMAGE_PATTERN = "([^\\s]+(\\.(?i)(jpg|png|gif|bmp))$)";
        Pattern pattern = Pattern.compile(IMAGE_PATTERN);
        Matcher matcher = pattern.matcher(fileName);
        return matcher.matches();
    }

    /***
     * isNumeric
     * @param number
     * @return
     */
    public static boolean isNumeric(String number) {
        boolean isValid = false;

        /*
         * Number: A numeric value will have following format: ^[-+]?: Starts
         * with an optional "+" or "-" sign. [0-9]*: May have one or more
         * digits. \\.? : May contain an optional "." (decimal point) character.
         * [0-9]+$ : ends with numeric digit.
         */

        String expression = "^[-+]?[0-9]*\\.?[0-9]+$";
        CharSequence inputStr = number;
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(inputStr);
        if (matcher.matches()) {
            isValid = true;
        }
        return isValid;
    }

    /***
     * CheckIsNumber
     * @param number
     * @return
     */
    public static boolean CheckIsNumber(String number) {
        String NUMBER_PATTERN = "^[0-9.-]{1,20}$";
        Pattern pattern = Pattern.compile(NUMBER_PATTERN);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }

    /*
     * Regular Expression Pattern:
     * ((?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20}) Description ( # Start
     * of group (?=.*\d) # must contains one digit from 0-9 (?=.*[a-z]) # must
     * contains one lowercase characters (?=.*[A-Z]) # must contains one
     * uppercase characters (?=.*[@#$%]) # must contains one special symbols in
     * the list "@#$%" . # match anything with previous condition checking
     * {6,20} # length at least 6 characters and maximum of 20 ) # End of group
     */
    public static boolean CheckPassWord(String passWord) {
        String PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(passWord);
        return matcher.matches();
    }

    /***
     * isPhoneNumberValid
     * @param phoneNumber
     * @return
     */
    public static boolean isPhoneNumberValid(String phoneNumber) {
        boolean isValid = false;
        String expression = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
        CharSequence inputStr = phoneNumber;
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(inputStr);
        if (matcher.matches()) {
            isValid = true;
        }
        return isValid;
    }

    public static boolean isSSNValid(String ssn) {
        boolean isValid = false;
        /*
         * SSN format xxx-xx-xxxx, xxxxxxxxx, xxx-xxxxxx; xxxxx-xxxx: ^\\d{3}:
         * Starts with three numeric digits. [- ]?: Followed by an optional "-"
         * \\d{2}: Two numeric digits after the optional "-" [- ]?: May contain
         * an optional second "-" character. \\d{4}: ends with four numeric
         * digits.
         * 
         * Examples: 879-89-8989; 869878789 etc.
         */

        // Initialize reg ex for SSN.
        String expression = "^\\d{3}[- ]?\\d{2}[- ]?\\d{4}$";
        CharSequence inputStr = ssn;
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(inputStr);
        if (matcher.matches()) {
            isValid = true;
        }
        return isValid;
    }

    /*
     * UserName the matcher demo (min: 3 và max:15 character): doannv123 : true
     * doannv_imic : true doannv-imic : true ab : false ab@abc : false abc123_-
     * : false
     */
    public static boolean CheckUserName(String userName) {
        String USERNAME_PATTERN = "^[a-z0-9_-]{3,15}$";
        Pattern pattern = Pattern.compile(USERNAME_PATTERN);
        Matcher matcher = pattern.matcher(userName);
        return matcher.matches();
    }

}
