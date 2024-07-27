package com.example.practice.learnthefundamentals.datatypesandvariables;

import org.springframework.util.Assert;

/**
 * HelloRecord.
 *
 * <p>
 *
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2024/07/27
 */
public class HelloRecord {
	public static void main(String[] args) {
		int age = 25;
		String address = "Seoul";

		Member jenny = new Member(age, address);
		Member jisoo = new Member(age, address);

		System.out.println(jenny.equals(jisoo));
	}
}


record Member(int age, String address) {
}
