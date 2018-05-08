package Dao;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import Util.CustomerUtil;
import pojo.Order;

public class OrderDao implements IOrderDao {

	SessionFactory sf;
	List<Order> list = null;
	private LocalDate startDate;
	private LocalDate endDate;

	public OrderDao() {
		sf = CustomerUtil.getSessionFactory();
	}

	public boolean addOrder(Order order) {
		Session session = sf.openSession();
		session.getTransaction().begin();
		session.save(order);
		session.getTransaction().commit();
		session.close();
		return true;
	}

	public boolean deleteOrder(int order_Number) {
		sf = CustomerUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Order order = (Order) session.load(Order.class, order_Number);
		session.delete(order);
		session.getTransaction().commit();
		session.close();
		return true;
	}

	public boolean updateOrder(Order order) {
		sf = CustomerUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.update(order);
		session.getTransaction().commit();
		session.close();
		return true;
	}

	public boolean loadOrder(int order_Number) {
		sf = CustomerUtil.getSessionFactory();
		Session session = sf.openSession();
		session.getTransaction().begin();
		Order ss = (Order) session.get(Order.class, order_Number);
		return true;
	}
	
	
	/*
	*/

	public void orderByRangeDates(LocalDate startDate, LocalDate endDate) {
		sf = CustomerUtil.getSessionFactory();
		Session session = sf.openSession();
		int pageNumber = 1;
		int pageSize = 2;
		/*session.beginTransaction();
		String hql = "from Order where orderDate >= :startDate and orderDate <= :endDate";
		Query query = session.createQuery(hql);
		query.setFirstResult(pageNumber);
		query.setMaxResults(pageSize);
		List<Order> listOrders = ( (org.hibernate.Query) query).list();
		for (Order od : listOrders) {
		    System.out.println(od.getOrderNumber() + " " + od.getStatus());
		}*/
		
		try {
			session.beginTransaction();
			Criteria criteria = session.createCriteria(Order.class)
					.add(Restrictions.between("orderDate", getStartDate(), getEndDate()));
			criteria.setFirstResult(pageNumber);
			criteria.setMaxResults(pageSize);

			List<Order> listOfOrders = criteria.list();
			if (listOfOrders != null) {
				System.out.println("Total Results:" + listOfOrders.size());
				for (Order od : listOfOrders) {
					System.out.println(od.getOrderNumber() + " " + od.getStatus());
				}
			}else {
				System.out.println("No entries found between the given dates");
			}
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void orderByMonth() {
		sf = CustomerUtil.getSessionFactory();
		Session session = sf.openSession();
		
		/*
		session.beginTransaction();
		Criteria criteria = session.createCriteria(Product.class);
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.sum("priceEach"));
		projectionList.add(Projections.property("orderDate"));
		projectionList.add(Projections.groupProperty("orderDate.getMonth()"));
		
		criteria.setProjection(projectionList);
		List listOfOrders = criteria.list();
		if (listOfOrders != null) {
			System.out.println("Total Results:" + listOfOrders.size());
			for(Object obj:listOfOrders) {
				obj.toString();
			}
		}else {
			System.out.println("No entries found between the given dates");
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();*/
		int pageNumber = 1;
		int pageSize = 2;
		session.beginTransaction();		
		String hql = "select month(ord.orderDate), sum(prod.priceEach) from Order ord inner join Product prod USING ord.orderNumber group by month(ord.orderDate)";
		Query query = session.createQuery(hql);
		/*query.setFirstResult(pageNumber);
		query.setMaxResults(pageSize);*/
		/*List<Order> listOrders = ((org.hibernate.Query) query).list();*/
		List<Order> listOrders= query.getResultList();
		for (Order od : listOrders) {
		    System.out.println(od.getOrderNumber() + " " + od.getStatus());
		}

		
	}
	
	@Override
	public String toString() {
		
		return " ";
	}
}
