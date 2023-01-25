package entities;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import entities.enums.PedidoStatus;

public class Pedido {

	private Instant momento;
	private PedidoStatus status;

	private Cliente cliente;
	List<PedidoItem> listaPedido = new ArrayList<>();

	public Pedido() {

	}

	public Pedido(Instant momento, PedidoStatus status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Instant getMomento() {
		return momento;
	}

	public void setMomento(Instant momento) {
		this.momento = momento;
	}

	public PedidoStatus getStatus() {
		return status;
	}

	public void setStatus(PedidoStatus status) {
		this.status = status;
	}

	public List<PedidoItem> getListaPedido() {
		return listaPedido;
	}

	public void addItem(PedidoItem item) {
		listaPedido.add(item);
	}

	public void removeItem(PedidoItem item) {
		listaPedido.remove(item);
	}

	public Double total() {
		Double total = 0.0;
		for (PedidoItem p : listaPedido) {
			total += p.subTotal();
		}
		return total;
	}

}
