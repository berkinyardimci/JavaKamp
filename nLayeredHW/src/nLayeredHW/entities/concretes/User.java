package nLayeredHW.entities.concretes;

import java.util.concurrent.atomic.AtomicInteger;

import nLayeredHW.entities.abstracts.Entity;

public class User implements Entity{
	
	private static final AtomicInteger count = new AtomicInteger(0); 
	private int id;
	private String eMail;
	private String password;
	private String name;
	private String surname;
	
	public User(String eMail, String password, String name, String surname) {
		this.id += count.incrementAndGet();
		this.eMail = eMail;
		this.password = password;
		this.name = name;
		this.surname = surname;
		
	}

	public int getId() {
		return id;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name : " + name;
	}
	
	
}
