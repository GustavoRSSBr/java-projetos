package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;

	private Departament departament;
	private List<HourContract> contracts = new ArrayList<>();

	public Worker() {

	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	public List<HourContract> getContract() {
		return contracts;
	}

	public void addContract(HourContract contract) {

		this.contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		this.contracts.remove(contract);
	}

	public double incame(int year, int month) {
		double sum = baseSalary;

		for (HourContract c : contracts) {
			int c_year = c.getDate().getYear();
			int c_month = c.getDate().getMonthValue();

			if (c_year == year && c_month == month) {
				sum += c.totalValue();
			}
		}

		return sum;
	}

}
