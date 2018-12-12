package com.jeelelivre.pages;
 import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
 import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

 public class PageManager {
	
	private ArrayList<Page> pages;
	private ArrayList<Choice> choices;
	
	public PageManager() {
		this.pages = new ArrayList<Page>();

		URL url = null;
		try {
			url = new URL("https://my-json-server.typicode.com/JuDubois/json-livre/pages");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
 		HttpURLConnection connection = null;
		int status = 0;
		try {
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			status = connection.getResponseCode();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		if(status == 200) {
			InputStreamReader in = null;
			try {
				in = new InputStreamReader(
					connection.getInputStream()
				);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
						
			JSONParser parser = new JSONParser();
	        Object jsonParsed = null;
	        try{
	            jsonParsed = parser.parse(in);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
			
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			connection.disconnect();
 			JSONArray root = (JSONArray) jsonParsed;
			for(int i=0; i<root.size(); i++){
				JSONObject pageObject = (JSONObject) root.get(i);
				int id = Math.toIntExact((long) pageObject.get("id"));
				String title = (String) pageObject.get("title");
				String content = (String) pageObject.get("content");
				var choices = new ArrayList<Choice>();
				JSONArray jsonChoices = (JSONArray) pageObject.get("choices");
				for(int j=0; j<jsonChoices.size(); j++){
					JSONObject choiceObject = (JSONObject) jsonChoices.get(j);
					int nextPage = Math.toIntExact((long) choiceObject.get("nextPage"));
					String choice = (String) choiceObject.get("choice");
					choices.add(new Choice(choice, nextPage));		
				}		
				this.pages.add(new Page(id, title, content, choices));
			}
		}
	}
	
	public ArrayList<Page> getAllPages(){
        return this.pages;
    }
	
	public Page getPageByIndex(int index){
        return this.pages.get(index);
    }
	
	public Page getPageById(int id) {
		for (var page : this.pages) {
			if (page.getId() == id) {
				return page;
			}	
		}
		return null;
	}	
}