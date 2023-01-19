package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entities.enums.OrderStatus;

public class Order {

	private Integer id;
	private LocalDate instante;
	private OrderStatus status;
	private DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public Order() {
	}

	public Order(Integer id, LocalDate instante, OrderStatus status) {
		this.id = id;
		this.instante = instante;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getInstante() {
		return instante;
	}

	public void setInstante(LocalDate instante) {
		this.instante = instante;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", instante=" + instante.format(fmt1) + ", status=" + status + "]";
	}
	
	
	
	
}
