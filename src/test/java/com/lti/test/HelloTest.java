package com.lti.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.component.Calculator;
import com.lti.component.CurrencyConverter;
import com.lti.component.HelloWorld;


public class HelloTest {

	public static void main(String[ ] args) {
		//Loading Spring's IoC Container
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		HelloWorld hw=(HelloWorld) context.getBean("hw"); //bean id//object reference but not the real object
		System.out.println(hw.sayHello("Sriya"));
		
		
		Calculator calc=(Calculator) context.getBean("calc");
		
		System.out.println(calc.add(10, 20));
		System.out.println(calc.div(330, 11));
		System.out.println(calc.sub(330, 20));
		
		
		CurrencyConverter cc=(CurrencyConverter) context.getBean("cc");
		System.out.println(cc.convertDollarstoRupees(10));
	}
}
