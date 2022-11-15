package com.seleniumexpress.ic.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.seleniumexpress.ic.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	public String print(Phone phone, Locale locale) {
		// TODO Auto-generated method stub
		return phone.getCountrycode() + "-" + phone.getUserNumber();
	}

	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {
		System.out.println(" we are in parse() in PhoneNumberFormatter ");
		// weather completePhoneNumber consists
		int indexOfiphen = completePhoneNumber.indexOf('-');
		String[] splitphonenumber = completePhoneNumber.split("-");
		Phone phone = new Phone();
		if (indexOfiphen == -1) {
			// if "-" not found in completePhoneNumber add default country code as 91
			phone.setCountrycode("91");
			phone.setUserNumber(splitphonenumber[0]);

		} else if(indexOfiphen == 0){
			// if any number started with - ex: -09876  we need to add 91  and output as 91-09876
			phone.setCountrycode("91");
			phone.setUserNumber(splitphonenumber[1]);
		}
		else{

			phone.setCountrycode(splitphonenumber[0]);
			phone.setUserNumber(splitphonenumber[1]);
		}

		return phone;

	}

}
