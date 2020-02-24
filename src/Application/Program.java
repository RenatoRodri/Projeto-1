package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContratc;
import entities.Worke;
import entities.enums.Worklevel;


public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.print("Enter department's name: ");
		String departmentname = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String name= sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine();
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		Worke work = new Worke(name, Worklevel.valueOf(level), baseSalary,new Department (departmentname));		
		
		System.out.print("How many contracts to this worker? ");
		Integer n = sc.nextInt();
		for (int i=1; i<=n; i++) {
		System.out.println("Enter contract #"+i+" data:");
		System.out.print("Date (DD/MM/YYYY): ");
		Date date = sdf.parse(sc.next()); 
		System.out.print("Value per hour: ");
		Double value = sc.nextDouble();
		System.out.print("Duration (hours): ");
		Integer hours = sc.nextInt();
		HourContratc contract = new HourContratc(date, value, hours);
		work.AddContract(contract);
		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String mothyers = sc.next();	
		
		int moth = Integer.parseInt(mothyers.substring(0,2));
		int yers = Integer.parseInt(mothyers.substring(3));
		System.out.println("Name: "+ work.getName());
		System.out.println("Department: " + work.getDepartmen().getName());
		System.out.println("Income for " + mothyers + ": " + String.format("%.2f",work.income(yers, moth)));
		
		sc.close();

	}

}
