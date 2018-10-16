package br.com.solimar.bible35.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STRONG")
public class Strong implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "STRONGNUMBER")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer strongNumber;

	@Column(name = "WORD", length = 200)
	private String word;

	@Column(name = "GREEKWORD", length = 300)
	private String greekWord;

	@Column(name = "MEANING", length = 2000)
	private String meaning;

	@Column(name = "MEANINGOTHER", length = 2000)
	private String meaningOther;

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getGreekWord() {
		return greekWord;
	}

	public void setGreekWord(String greekWord) {
		this.greekWord = greekWord;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public String getMeaningOther() {
		return meaningOther;
	}

	public void setMeaningOther(String meaningOther) {
		this.meaningOther = meaningOther;
	}

	public Integer getStrongNumber() {
		return strongNumber;
	}

	public void setStrongNumber(Integer strongNumber) {
		this.strongNumber = strongNumber;
	}

}
