package com.springlec.base.model;

import java.sql.Timestamp;

public class QnaWriteDto {
	int qnaseq;
	String qnaTitle;
	String qnaCategory;
	String qnaContent;
	String qnaImage;
	Timestamp qnaDate;
	
	
	
	public QnaWriteDto() {
		
	}



	public int getQnaseq() {
		return qnaseq;
	}



	public void setQnaseq(int qnaseq) {
		this.qnaseq = qnaseq;
	}



	public String getQnaTitle() {
		return qnaTitle;
	}



	public void setQnaTitle(String qnaTitle) {
		this.qnaTitle = qnaTitle;
	}



	public String getQnaCategory() {
		return qnaCategory;
	}



	public void setQnaCategory(String qnaCategory) {
		this.qnaCategory = qnaCategory;
	}



	public String getQnaContent() {
		return qnaContent;
	}



	public void setQnaContent(String qnaContent) {
		this.qnaContent = qnaContent;
	}



	public String getQnaImage() {
		return qnaImage;
	}



	public void setQnaImage(String qnaImage) {
		this.qnaImage = qnaImage;
	}



	public Timestamp getQnaDate() {
		return qnaDate;
	}



	public void setQnaDate(Timestamp qnaDate) {
		this.qnaDate = qnaDate;
	}
	
	
	
	
	
}