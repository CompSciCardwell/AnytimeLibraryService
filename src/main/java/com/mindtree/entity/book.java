package com.mindtree.entity;

public class book {
	private int isbn;
	private String author;
	private String title;
	private String description;
	
	public book(int isbn, String author, String title, String description){
		this.isbn = isbn;
		this.author = author;
		this.title = title;
		this.description = description;
	}
}
