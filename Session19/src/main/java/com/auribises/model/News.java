package com.auribises.model;

public class News {

	String author;
	String title;
	String description;
	
	public News() {
		// TODO Auto-generated constructor stub
	}
	
	public News(String author, String title, String description) {
		this.author = author;
		this.title = title;
		this.description = description;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "News [author=" + author + ", title=" + title + ", description=" + description + "]";
	}
}
