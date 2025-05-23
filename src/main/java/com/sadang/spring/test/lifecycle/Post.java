package com.sadang.spring.test.lifecycle;

public class Post {

	private String title;
	private String user;
	private String content;

	public Post(String title, String user, String content) {
		this.title = title;
		this.user = user;
		this.content = content;
	}

	public String getTitle() {
		return this.title;
	}

	public String getUser() {
		return this.user;
	}

	public String getContent() {
		return this.content;
	}

	@Override
	public String toString() {
		return "제목 : " + title + " / 작성자 : " + user + " / 내용 : " + content;
	}
}
