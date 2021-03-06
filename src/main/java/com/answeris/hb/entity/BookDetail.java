package com.answeris.hb.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class BookDetail {
	
	@Id
	private int id;
	private int pageCount;
	private int width;
	private int height;
	private String publisher;
	private Date pubDate;
	private int bookId;
	
	
	
	public BookDetail() {
		// TODO Auto-generated constructor stub
	}

	//기본값 있는 것들 빼고 
	public BookDetail(int pageCount, String publisher) {
		super();
		this.pageCount = pageCount;
		this.publisher = publisher;
	}
	

	@Override
	public String toString() {
		return "BookDetail [id=" + id + ", pageCount=" + pageCount + ", width=" + width + ", height=" + height
				+ ", publisher=" + publisher + ", pubDate=" + pubDate + "]";
	}

	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getPageCount() {
		return pageCount;
	}


	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public Date getPubDate() {
		return pubDate;
	}


	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}


	
	
	
}
