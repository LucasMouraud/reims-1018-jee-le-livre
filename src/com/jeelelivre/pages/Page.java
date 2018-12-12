package com.jeelelivre.pages;

import java.util.ArrayList;

public class Page {

	private int id;
	private String title;
	private String content;
	private ArrayList<Choice> choices;

	public Page(int id, String title, String content, ArrayList<Choice> choices){
		this.id = id;
		this.title = title;
		this.content = content;
		this.choices = choices;
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

	public ArrayList<Choice> getChoices(){
		return this.choices;
	}

	public void setChoices(ArrayList<Choice> choices){
		this.choices = choices;
	}

}
