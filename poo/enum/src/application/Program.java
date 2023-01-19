package application;

import java.time.LocalDate;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order(1070, LocalDate.now(), OrderStatus.PENDING_PAYMENT);

		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
		
	}
}