package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="place")
public class Place {

	@Id
	private int id;
	
	private String city;
	private String weather;
	private String temperature;
	
	public Place()
	{	
	}
	
	@Override
	public String toString() {
		return "city [id=" + id + ", city=" + city + ", weather=" + weather + ", temperature=" + temperature + "]";
	}
	
	
	public Place(int id, String city, String weather, String temperature) {
		super();
		this.id = id;
		this.city = city;
		this.weather = weather;
		this.temperature = temperature;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getcity() {
		return city;
	}
	public void setcity(String city) {
		this.city = city;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
}
