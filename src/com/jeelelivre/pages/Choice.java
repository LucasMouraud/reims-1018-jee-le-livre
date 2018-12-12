package com.jeelelivre.pages;

public class Choice {
	
	private String choice;
	private int nextPage;
	

	public Choice(String choice, int nextPage) {
		this.choice = choice;
		this.nextPage = nextPage;
		
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}
	
	public int getNextPage() {
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}
}
