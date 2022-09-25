//package com.luv2code.springboot.cruddemo.dao;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//
//import org.hibernate.Session;
//import org.hibernate.query.Query;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.luv2code.springboot.cruddemo.entity.Employee;
//
//@Repository
//public class EmployeeDAOHibernateImpl implements EmployeeDAO {
//
//	
////	Define Fields for entitymanager
//	
//	private EntityManager entityManager;
//	
////	setup Constructor injection
//	@Autowired
//	public EmployeeDAOHibernateImpl(EntityManager theEntityManager) {
//		entityManager = theEntityManager;
//	}
//	
//	@Override
//	public List<Employee> findAll() {
////		get current hibernate session
//		Session currentSession = entityManager.unwrap(Session.class);
//		
////		create query
//		Query<Employee> theQuery = 
//				currentSession.createQuery("from Employee", Employee.class);
//		
////		execute query and get result list
//		List<Employee> employees = theQuery.getResultList();
//		
////		return result
//		return employees;
//	}
//
//	@Override
//	public Employee findById(int theId) {
//		// get current hibernate session
//		Session currentSession = entityManager.unwrap(Session.class);
//		
//		// get Employee
//		Employee theEmployee = currentSession.get(Employee.class, theId);
//		
//		//Return Employee
//		return theEmployee;
//	}
//
//	@Override
//	public void save(Employee theEmployee) {
//		// get current hibernate session
//				Session currentSession = entityManager.unwrap(Session.class);
//				
//		// Save employee
//				currentSession.saveOrUpdate(theEmployee);
//	}
//
//	@Override
//	public void deleteById(int theId) {
//		// get current hibernate session
//		Session currentSession = entityManager.unwrap(Session.class);
//		
//		// Delete employee
//		Query theQuery = currentSession.createQuery(
//				"delete from Employee where id=:employeeId");
//		theQuery.setParameter("employeeId", theId);
//		theQuery.executeUpdate();
//		
//	}
//
//}
