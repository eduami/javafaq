package org.eduami.javafaq.desginpattern.creational;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class FactoryMethod {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("ET"), Locale.US);
		System.out.println("Current Time in long island USA is "+calendar.getTime());
	}
}
