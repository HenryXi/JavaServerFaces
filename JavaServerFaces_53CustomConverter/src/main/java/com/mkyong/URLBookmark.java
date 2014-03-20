package com.mkyong;

public class URLBookmark{
	
	String fullURL;

	public URLBookmark(String fullURL) {
		this.fullURL = fullURL;
	}

	public String getFullURL() {
		return fullURL;
	}

	public void setFullURL(String fullURL) {
		this.fullURL = fullURL;
	}
	
	public String toString(){
		return fullURL;
	}
	
}