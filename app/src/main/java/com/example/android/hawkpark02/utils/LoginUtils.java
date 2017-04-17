package com.example.android.hawkpark02.utils;

import android.util.Log;

import java.util.regex.Pattern;

/**
 * Created by priya on 4/16/2017.
 */

public class LoginUtils {
    //Fragments Tags
    public static final String Login_Fragment = "Login_Fragment";
    public static final String Register_Fragment = "Register_Fragment";
    public static final String ForgotPassword_Fragment = "ForgotPassword_Fragment";

    //checks that input field is not empty----------------------------------------------------------
    public static boolean isEmpty(String fieldName){
        if(fieldName.length()==0)
            return true;
        else
            return false;
    }
    //Password rules:Must be at least 6 characters---------------------------------------------------
    //Must contain at least one one lower case letter, one upper case letter, one digit and one
    // special character.
    //Valid special characters are –   @#$%^&
    public static String checkPswdFormat(String password){
        String errMsg = "Password length >=6. Must include atleast 1 each of uppercase, " +
                "lowercase, numbers & special characters(@#$%^&)";
        String password_pattern ="^.*(?=.{6,})(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&]).*$";
        if((password.matches(password_pattern)))
            return null;
        else
            return errMsg ;
    }
    //Checks if email ends with @montclair.edu------------------------------------------------------
    public static String checkEmail(String email){
        String errMsg = "Please enter your MSU email that ends with '@montclair.edu'";
        String msu = "montclair.edu";
        //pattern specifying email ends with montclair.edu
        String email_pattern = "^[a-zA-Z0-9._]+@" + Pattern.quote(msu) + "$";
        if((email.matches(email_pattern)))
            return null;
        else
            return errMsg ;
    }
    // Checks if password and confirm password fields match-----------------------------------------
    public static String pswdMatch(String pswd, String conPswd) {
        Log.i("password1"+pswd,"password2"+conPswd);
        String errMsg = "Passwords don't match. Please try again!";
        if (!(pswd.equals(conPswd)))
            return errMsg;
        else
            return null;
    }


}
