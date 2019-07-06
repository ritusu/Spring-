package com.lti.component;

import org.springframework.stereotype.Component;


//these are called as pojo classes
@Component("cc")//alternative to bean id="..." class=".."
public class CurrencyConverter {

	public double convertDollarstoRupees(double dollars) {
		return dollars *68.44;
	}
}
