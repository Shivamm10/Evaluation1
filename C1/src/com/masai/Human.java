package com.masai;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Human {
	private double weight;
	private double height;
	private double bodyMassIndex;
	public Human(double weight, double height) {
		super();
		this.weight = weight;
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) { 
		this.height = height;
	}
	public double getBodyMassIndex() {
		return bodyMassIndex;
	}
	public void setBodyMassIndex(double bodyMassIndex) {
		this.bodyMassIndex = bodyMassIndex;
	}
}

interface Index{
	void computeBMI(List<Human> humanList);
	void printRemark(List<Human> humanList);
}

class Main{
	public static void main(String[] args) {
		List<Human> human = new ArrayList<>();
		human.add(new Human(65,1.7));
		human.add(new Human(75,1.6));
		human.add(new Human(45,1.4));
		human.add(new Human(45,1.7));
		human.add(new Human(48,1.2));
		human.add(new Human(92,1.6));
		human.add(new Human(116,1.65));

	}
}
