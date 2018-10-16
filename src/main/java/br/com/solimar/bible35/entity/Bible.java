package br.com.solimar.bible35.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BIBLE")
public class Bible implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY)
	private Version version;

	@Column(name = "BOOK", length = 2)
	private String book;

	@Column(name = "CHAPTER")
	private Integer chapter;

	@Column(name = "VERSE")
	private Integer verse;

	@Column(name = "TEXT", length = 1000)
	private String text;

	@Column(name = "TEXTSTRONG", length = 1500)
	private String textStrong;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public Integer getChapter() {
		return chapter;
	}

	public void setChapter(Integer chapter) {
		this.chapter = chapter;
	}

	public Integer getVerse() {
		return verse;
	}

	public void setVerse(Integer verse) {
		this.verse = verse;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTextStrong() {
		return textStrong;
	}

	public void setTextStrong(String textStrong) {
		this.textStrong = textStrong;
	}

	public Version getVersion() {
		return version;
	}

	public void setVersion(Version version) {
		this.version = version;
	}

}
