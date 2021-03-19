package com.techprimers.aws;

public class Student {

	private String name;

	private int age;

	private String country;
	
	private long random;

	public Student(String name, int age, String country, long random){
		super();
		this.name = name;
		this.age = age;
		this.country = country;
		this.random = random;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {

		this.name = name;
	}
	public int getAge() {

		return age;
	}
	public void setAge(int age) {

		this.age = age;
	}
	public String getCountry(){
		return country;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public long getRandom() {
		return random;
	}

	public void setRandom(long random) {
		this.random = random;
	}
	
	
	
	
}
