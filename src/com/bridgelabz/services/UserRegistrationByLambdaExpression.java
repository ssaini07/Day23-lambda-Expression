package com.bridgelabz.services;

import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.interfaces.IUserValidate;

public class UserRegistrationByLambdaExpression implements IUserValidate {
//Driver class
	public static void main(String[] args) {
		System.out.println("Welcome to the lambda expression");
		UserRegistrationByLambdaExpression validateUser = new UserRegistrationByLambdaExpression();
		System.out.println(validateUser.fnameValidate("Shubham"));
		System.out.println(validateUser.lNameValidate("Saini"));
		System.out.println(validateUser.emailValidate("abc@gmail.co.in"));
		System.out.println(validateUser.passwordValidate("#$%^$@SDffdd!"));
		System.out.println(validateUser.mobileNumberValidate("91 6287348589"));
	}

	@Override
	public boolean fnameValidate(String firstName) {
		String regexCheck = "^[A-Z][a-z]{3,}$";
		boolean value;

		// create a Pattern using REGEX
		Pattern pattern = Pattern.compile(regexCheck);
		// get Predicate Object
		Predicate<String> predicate = pattern.asPredicate();
		// check whether predicate match
		// with actual string
		value = predicate.test(firstName);
		if (value == false) {
			System.out.println("Invalid first name");
		} else {
			System.out.println("Valid first name");
		}
		return value;

	}

	@Override
	public boolean lNameValidate(String lastName) {
		String regexCheck = "^[A-Z][a-z]{3,}$";
		boolean value;

		// create a Pattern using REGEX
		Pattern pattern = Pattern.compile(regexCheck);
		// get Predicate Object
		Predicate<String> predicate = pattern.asPredicate();
		// check whether predicate match
		// with actual string
		value = predicate.test(lastName);
		if (value == false) {
			System.out.println("Invalid last name");
		} else {
			System.out.println("Valid last name");
		}
		return value;

	}

	@Override
	public boolean emailValidate(String email) {
		String regexCheck = "^[a-z.+_-]+[.a-z0-9]*+@[a-z0-9]+[.a-z]+[.a-z0-9]*$";
		boolean value;

		// create a Pattern using REGEX
		Pattern pattern = Pattern.compile(regexCheck);
		// get Predicate Object
		Predicate<String> predicate = pattern.asPredicate();
		// check whether predicate match
		// with actual string
		value = predicate.test(email);
		if (value == false) {
			System.out.println("Invalid email address");
		} else {
			System.out.println("Valid email address");
		}
		return value;

	}

	@Override
	public boolean passwordValidate(String password) {
		String regexCheck = "^[a-zA-Z0-9+-_!@#$%^&*(){}'.,]{8,}";
		boolean value;

		// create a Pattern using REGEX
		Pattern pattern = Pattern.compile(regexCheck);
		// get Predicate Object
		Predicate<String> predicate = pattern.asPredicate();
		// check whether predicate match
		// with actual string
		value = predicate.test(password);
		if (value == false) {
			System.out.println("Invalid password");
		} else {
			System.out.println("Valid password");
		}
		return value;

	}

	@Override
	public boolean mobileNumberValidate(String mobileNumber) {
		String regexCheck = "^[0-9]{2}+[ ][0-9]{10}$";
		boolean value;

		// create a Pattern using REGEX
		Pattern pattern = Pattern.compile(regexCheck);
		// get Predicate Object
		Predicate<String> predicate = pattern.asPredicate();
		// check whether predicate match
		// with actual string
		value = predicate.test(mobileNumber);
		if (value == false) {
			System.out.println("Invalid mobile number");
		} else {
			System.out.println("Valid mobile number");
		}
		return value;

	}
}
