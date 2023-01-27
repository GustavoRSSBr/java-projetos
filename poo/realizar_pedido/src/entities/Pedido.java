package entities;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.PedidoStatus;

public class Pedido {

	private Instant momento;
	private PedidoStatus status;

	public static DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public static DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

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

	public String toString() {
		StringBuffer texto = new StringBuffer();

		texto.append("INFORMAÇÕES DO PEDIDO");
		texto.append("\nMomento Do pedido: ");
		texto.append(momento.atZone(ZoneId.systemDefault()).format(formato2));
		texto.append("\nStatus do pedido: ");
		texto.append(getStatus());
		texto.append("\nCliente: ");
		texto.append(cliente.getName());
		texto.append(" (" + cliente.getDataNasc().format(formato1) + ") - ");
		texto.append(cliente.getEmail());
		texto.append("\nItens do pedido:\n");
		for (PedidoItem i : listaPedido) {
			texto.append(i.getProduto().getNome() + ", ");
			texto.append("R$" + String.format("%.2f", i.getProduto().getPreco()) + ", ");
			texto.append("Quantidade: " + i.getQuantidade() + ", ");
			texto.append("Subtotal: R$" + String.format("%.2f", i.subTotal()) + "\n");
		}
		texto.append("\nPreço total: R$" + String.format("%.2f", total()));

		return texto.toString();
	}

}
