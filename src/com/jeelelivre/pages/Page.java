package com.jeelelivre.pages;

public class Page {

	private int id;
	private String title;
	private String content;
	private int[] nextPages;

	public Page(int id, String title, String content, int[] nextPages){
		this.id = id;
		this.title = title;
		this.content = content;
		this.nextPages = nextPages;
	}

	public int getId(){
		return this.id;
	}

	public void setId(int id){
		this.id = id;
	}

	public String getTitle(){
		return this.title;
	}

	public void setTitle(String title){
		this.title = title;
	}
	
	public String getContent(){
		return this.content;
	}

	public void setContent(String content){
		this.content = content;
	}

	public int[] getNextPages(){
		return this.nextPages;
	}

	public void setNextPages(int[] nextPages){
		this.nextPages = nextPages;
	}

}
