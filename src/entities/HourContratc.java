package entities;

import java.util.Date;

public class HourContratc {

	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	public HourContratc() {
	}

	public HourContratc(Date date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public double totalvalue() {
		return valuePerHour * hours;
	}
	
	
}