package com.answeris.hb.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//@Table(name="Book") //테이블명과 다를 경우 이거 넣어줘야함
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //기본키 자동생성하기위해. IDENTITY는 기본키 생성을 데이터베이스에 위임하는 방법. 주로MySQL, PostgresSQL 등에서 사용
	private int id;
	private String title;
	private String coverImg;
	private String writerId;
	private Date regDate;
	private int hit;
	@Column(name="`order`")
	private int order;
	
	
	public Book() {
		// TODO Auto-generated constructor stub
	}


	public Book(String title, String coverImg, String writerId) {
		super();
		this.title = title;
		this.coverImg = coverImg;
		this.writerId = writerId;
	}


	public Book(int id, String title, String coverImg, String writerId, Date regDate, int hit, int order) {
		super();
		this.id = id;
		this.title = title;
		this.coverImg = coverImg;
		this.writerId = writerId;
		this.regDate = regDate;
		this.hit = hit;
		this.order = order;
	}

	

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", coverImg=" + coverImg + ", writerId=" + writerId
				+ ", regDate=" + regDate + ", hit=" + hit + ", order=" + order + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getCoverImg() {
		return coverImg;
	}


	public void setCoverImg(String coverImg) {
		this.coverImg = coverImg;
	}


	public String getWriterId() {
		return writerId;
	}


	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}


	public Date getRegDate() {
		return regDate;
	}


	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}


	public int getHit() {
		return hit;
	}


	public void setHit(int hit) {
		this.hit = hit;
	}


	public int getOrder() {
		return order;
	}


	public void setOrder(int order) {
		this.order = order;
	}

	
	
	


}
