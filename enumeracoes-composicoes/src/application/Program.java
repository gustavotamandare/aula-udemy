package application;

import java.sql.Date;

import entities.Orders;
import entities.enums.OrderStatus;

public class Program {
	
	public static void main(String[] args) {
		Orders order = new Orders(1080, new Date(0), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
	}
}
