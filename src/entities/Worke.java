package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.Worklevel;

public class Worke {
	
	private String name;
	private Worklevel level;
	private Double baseSalary;
	private Department departmen;
	private List<HourContratc> contracts = new ArrayList<>();
	
	public Worke() {
		
	}

	public Worke(String name, Worklevel level, Double baseSalary, Department departmen) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departmen = departmen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Worklevel getLevel() {
		return level;
	}

	public void setLevel(Worklevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartmen() {
		return departmen;
	}

	public void setDepartmen(Department departmen) {
		this.departmen = departmen;
	}

	public List<HourContratc> getList() {
		return contracts;
	}

	public void AddContract(HourContratc contratc) {
		contracts.add(contratc);
	}
	
	public void RemoveContract(HourContratc contratc) {
		contracts.remove(contratc);
	}
	
	public double income(int Yers, int Moth) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for ( HourContratc c : contracts) {
		cal.setTime(c.getDate());
		int c_yers = cal.get(Calendar.YEAR);
		int c_moth = 1 + cal.get(Calendar.MONTH);
		if(Yers == c_yers && Moth == c_moth) {
			sum += c.totalvalue();
			
		}
			
		}
		
		return sum;
	}
	
	

}
