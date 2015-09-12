package com.springapp.mvc;

public class Animal implements IAnimal{
	private String id;
	private String name;
	private String age;
	private String height;

	 public Animal(String id){
		 this.id = id;
		 name = "hello";
		 age = "hi";
		 height = "that is cool";
	 }

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	public String getHeight() {
		return height;
	}

	public String getId() {
		return id;
	}
}
