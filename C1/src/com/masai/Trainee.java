package com.masai;

import java.util.List;
import java.util.ArrayList;

public class Trainee {
	private String traineeId;
	private String name;
	private double rating;
	
	public Trainee(String traineeId, String name, double rating) {
		super();
		this.traineeId = traineeId;
		this.name = name;
		this.rating = rating;
	}
	
	public String getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(String traineeId) {
		this.traineeId = traineeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", name=" + name + ", rating=" + rating + "]";
	}
}

class Manager{
	private String managerId;
	private String name;
	private String designation;
	private String location;
	public Manager(String managerId, String name, String designation, String location) {
		super();
		this.managerId = managerId;
		this.name = name;
		this.designation = designation;
		this.location = location;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", name=" + name + ", designation=" + designation + ", location="
				+ location + "]";
	}
}

class Main{
	public static void main(String[] args) {
		List<Trainee> traineeList = new ArrayList<>();
		traineeList.add(new Trainee("T001", "Ajay", 4.75));
		traineeList.add(new Trainee("T002", "Zakir", 4.25));
		traineeList.add(new Trainee("T003", "Nayan", 2.25));
		traineeList.add(new Trainee("T004", "Abhishek", 3.25));
		traineeList.add(new Trainee("T004", "Abhishek", 3.25));
		
		List<Manager> managerList = traineeList.stream().main(
				trainee -> {
					String managerId = trainee.getTraineeId();
					String name = trainee.getName();
					String rating = trainee.getRating();
					String designation;
					String location;
					if(rating >= 4.5) {
						designation =  "People manager";
						location = "headquarter";
					}else if(rating >= 3.5) {
						designation = "Branch manager";
						location = "Branch office";
					}else if(rating >= 3.0) {
						designation = "Junior manager";
						location = "Kiosk";
					}
				})
	}
}
