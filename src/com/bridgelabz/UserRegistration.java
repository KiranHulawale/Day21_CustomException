package com.bridgelabz;
import java.util.regex.Matcher;
import  java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegistration {

    static Scanner scan = new Scanner(System.in);

    public void firstName() {
        System.out.print(" Please enter the FirstName: ");
        String name = scan.nextLine();
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
        Matcher match = pattern.matcher(name);
        // System.out.println(match.matches());
        try {
        if (match.matches()) {
            System.out.println("FirstName is valid");
        } else {
            throw new CustomException("Invalid Name");
        }
        } catch (CustomException ce) {
            ce.printStackTrace();
        }
    }

    public void lastName() {
        System.out.print(" Please enter the LastName: ");
        String name = scan.nextLine();
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher match = pattern.matcher(name);
        // System.out.println(match.matches());
        try {
        if (match.matches()) {
            System.out.println("LastName is valid");
        } else {
            throw new CustomException("Invalid Last Name");
        }
        } catch (CustomException ce) {
            ce.printStackTrace();
        }
    }

    public void validMail() {
        System.out.print(" Please enter the mail id");
        String name = scan.nextLine();
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_-]+([.][a-zA-Z0-9+_-]+)*@[a-zA-Z0-9]+([.][a-zA-Z0-9+_-]+)+$");
        Matcher match = pattern.matcher(name);
        // System.out.println(match.matches());
        try {
        if (match.matches()) {
            System.out.println("MailId is valid");
        } else {
            throw new CustomException("Invalid mail id");
        }
        } catch (CustomException ce) {
            ce.printStackTrace();
        }
    }

    public void validMobileNo() {
        System.out.print(" Please enter the mobile number");
        String name = scan.nextLine();
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9@$!%*#?&]{1,}[a-zA-Z0-9@$!%*#?&]{7,}$");
        Matcher match = pattern.matcher(name);
        // System.out.println(match.matches());
        try {
        if (match.matches()) {
            System.out.println("MobileNo is valid");
        } else {
            throw new CustomException("Invalid MobileNo");
        }
        } catch (CustomException ce) {
            ce.printStackTrace();
        }
    }

    public void password() {
        System.out.print(" Please enter the password");
        String name = scan.nextLine();
        Pattern pattern = Pattern.compile("^(?=.*[A-Z]).{8,}$");
        Matcher match = pattern.matcher(name);
        // System.out.println(match.matches());
        try {
        if (match.matches()) {
            System.out.println("password is valid");
        } else {
            throw new CustomException("Invalid password");
        }
        } catch (CustomException ce) {
            ce.printStackTrace();
        }
    }

    public static void main(String[] args) {
        UserRegistration userDetails = new UserRegistration();
        userDetails.firstName();
        userDetails.lastName();
        userDetails.validMail();
        userDetails.validMobileNo();
        userDetails.password();
    }
}