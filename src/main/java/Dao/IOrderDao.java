package Dao;

import java.time.LocalDate;

import pojo.Order;

public interface IOrderDao {

	boolean addOrder(Order order);

	boolean deleteOrder(int order_Number);

	boolean updateOrder(Order order);

	boolean loadOrder(int order_Number);

	void orderByRangeDates(LocalDate startDate, LocalDate endDate);

}