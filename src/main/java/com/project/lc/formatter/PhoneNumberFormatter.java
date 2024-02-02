package com.project.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.project.lc.model.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {
		// TODO Auto-generated method stub
		return phone.getCountryCodeString()+"-"+phone.getUserNumberString();
	}

	@Override
	public Phone parse(String phoneNumberString, Locale locale) throws ParseException {

		Phone phone = new Phone();
		String[] numberStrings = phoneNumberString.split("-");
		
		if (phoneNumberString.contains("-")) {
			if (numberStrings[0] == "") {
				numberStrings[0] = "91";
			}
			phone.setCountryCodeString(numberStrings[0]);
			phone.setUserNumberString(numberStrings[1]);

		}
		else {
			phone.setCountryCodeString("91");
			phone.setUserNumberString(numberStrings[0]);
		}

		return phone;
	}

}
