package application;


import java.util.Date;
import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Date date = new Date();
		Order order = new Order(1080, date, OrderStatus.PENDING_PAYMENT);

		System.out.println(order);
	}

}
