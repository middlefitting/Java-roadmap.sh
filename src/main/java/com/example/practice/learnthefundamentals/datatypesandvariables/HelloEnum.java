package com.example.practice.learnthefundamentals.datatypesandvariables;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * HelloEnum.
 *
 * <p>
 * Enum의 편리함을 알아보자.
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2024/07/24
 */
public class HelloEnum {
	public static void main(String[] args) {
		Car car = Car.HYUNDAI;
		int age = car.getAge();

		CarForClass carForClass = CarForClass.HYUNDAI;
		int ageForClass = carForClass.getAge();

		System.out.println(age + " " + ageForClass);
	}
}

// Enum
@AllArgsConstructor
@Getter
enum Car {
	HYUNDAI(10),
	BENZ(20),
	BMW(30);

	private final int age;
}

// Enum 이 없었다면?
@Getter
class CarForClass {
	public static CarForClass HYUNDAI;
	public static CarForClass BENZ;
	public static CarForClass BMW;

	static {
		HYUNDAI = new CarForClass(10);
		BENZ = new CarForClass(20);
		BMW = new CarForClass(30);
	}

	private CarForClass(int age) {
		this.age = age;
	}

	private int age;
}
