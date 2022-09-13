package com.xworkz.exception.dto;

import java.io.Serializable;
import java.util.Arrays;

public class MovieDTO implements Serializable {

	private String name;
	private String hero;
	private String villain;
	private String director;
	private String musicDirector;
	private String[] producers;
	private String editor;
	private String production;
	private String guestRole;
	private double budjet;

	private double boxOffice;
	private String ott;
	private boolean hit;
	private String imdb;
	private double rating;

	public MovieDTO() {
		System.out.println("Default const");
	}

	@Override
	public String toString() {
		return "MovieDTO [name=" + name + ", hero=" + hero + ", villain=" + villain + ", director=" + director
				+ ", musicDirector=" + musicDirector + ", producers=" + Arrays.toString(producers) + ", editor="
				+ editor + ", production=" + production + ", guestRole=" + guestRole + ", budjet=" + budjet
				+ ", boxOffice=" + boxOffice + ", ott=" + ott + ", hit=" + hit + ", imdb=" + imdb + ", rating=" + rating
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public String getName() {
		return name;
	}

	public String getHero() {
		return hero;
	}

	public String getVillain() {
		return villain;
	}

	public String getDirector() {
		return director;
	}

	public String getMusicDirector() {
		return musicDirector;
	}

	public String[] getProducers() {
		return producers;
	}

	public String getEditor() {
		return editor;
	}

	public String getProduction() {
		return production;
	}

	public String getGuestRole() {
		return guestRole;
	}

	public double getBudjet() {
		return budjet;
	}

	public double getBoxOffice() {
		return boxOffice;
	}

	public String getOtt() {
		return ott;
	}

	public boolean isHit() {
		return hit;
	}

	public String getImdb() {
		return imdb;
	}

	public double getRating() {
		return rating;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHero(String hero) {
		this.hero = hero;
	}

	public void setVillain(String villain) {
		this.villain = villain;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setMusicDirector(String musicDirector) {
		this.musicDirector = musicDirector;
	}

	public void setProducers(String[] producers) {
		this.producers = producers;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public void setProduction(String production) {
		this.production = production;
	}

	public void setGuestRole(String guestRole) {
		this.guestRole = guestRole;
	}

	public void setBudjet(double budjet) {
		this.budjet = budjet;
	}

	public void setBoxOffice(double boxOffice) {
		this.boxOffice = boxOffice;
	}

	public void setOtt(String ott) {
		this.ott = ott;
	}

	public void setHit(boolean hit) {
		this.hit = hit;
	}

	public void setImdb(String imdb) {
		this.imdb = imdb;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

}
