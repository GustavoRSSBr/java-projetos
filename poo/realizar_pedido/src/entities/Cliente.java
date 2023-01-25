package entities;

import java.time.LocalDate;

public class Cliente {

	private String name;
	private String email;
	private LocalDate dataNasc;

	public Cliente() {

	}

	public Cliente(String name, String email, LocalDate dataNasc) {
		this.name = name;
		this.email = email;
		this.dataNasc = dataNasc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	@Override
	public String toString() {
		return "Cliente [name=" + name + ", email=" + email + ", dataNasc=" + dataNasc + "]";
	}

}
