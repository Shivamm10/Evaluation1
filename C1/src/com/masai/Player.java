package com.masai;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Player {
	private int age;
	private float weight;
	private String name;
	public Player(int age, float weight, String name) {
		super();
		this.age = age;
		this.weight = weight;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class Main{
	public static void main(String[] args) {
		List<Player> player = new ArrayList<>(); 
		player.add(new Player(23, 56.75f, "ABC"));
		player.add(new Player(24, 60.75f, "BCD"));
		player.add(new Player(32, 62.75f, "CDE"));
		player.add(new Player(21, 51.75f, "DEF"));
		player.add(new Player(35, 72.75f, "EFG"));
		player.add(new Player(38, 74.75f, "FGH"));
		player.add(new Player(39, 65.25f, "GHI"));
		player.add(new Player(42, 74.42f, "HIJ"));
		player.add(new Player(18, 55.56f, "IJK"));
		player.add(new Player(56, 49.25f, "JKL"));
		
		Predicate<Player> playerPd = p -> p.getWeight()<50;
		System.out.println(player.stream().anyMatch(playerPd));
		
		player.getWeight().stream().collect(Collectors.averagingDouble(i -> i*1.0)));
		player.getAge().stream().reduce(0,(i1,i2) -> (i1 + i2));
		player.getWeight().sorted((i1,i2)->(i2-i1)).skip(2).limit(4);
		
		Predicate<Player> playPd = p -> p.getAge() <= 60 && p.getAge() >=18;
		player.stream().allMatch(playPd)?System.out.println("Team contains young and middle aged")
				:System.out.println("Team contains kids or old")];
	}
}
