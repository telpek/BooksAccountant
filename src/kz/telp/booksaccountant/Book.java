package kz.telp.booksaccountant;

import java.util.UUID;

public class Book {
	
	private UUID mId;
	private String mTitle;
	
	public Book() {
		// Generate unique identifier
		mId = UUID.randomUUID();
	}

	public UUID getId() {
		return mId;
	}
	
	public String getTitle() {
		return mTitle;
	}
	
	public void setTitle(String title) {
		mTitle = title;
	}

}
