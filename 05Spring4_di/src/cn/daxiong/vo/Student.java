package cn.daxiong.vo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	private String name;
	private Address addr;
	private String[] books;
	private List<String> hobbies;
	private Map<String, String> cards;
	private Set<String> games;
	private String wife;
	private Properties info;
	
	public void setInfo(Properties info) {
		this.info = info;
	}
	public void setWife(String wife) {
		this.wife = wife;
	}
	public void setGames(Set<String> games) {
		this.games = games;
	}
	public void setCards(Map<String, String> card) {
		this.cards = card;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public void setBooks(String[] books) {
		this.books = books;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void show() {
		System.out.println("name = "+name);
		System.out.println("address = "+addr.getAddress());
		
		System.out.print("books = ");
		for (String book : books) {
			System.out.print(book+"  ");
		}
		System.out.println();
		
		System.out.println("hobbies = "+hobbies);
		System.out.println("cards = "+cards);
		System.out.println("games = "+games);
		System.out.println("wife = "+wife);
		System.out.println("properties = "+info);
	}
	
}
