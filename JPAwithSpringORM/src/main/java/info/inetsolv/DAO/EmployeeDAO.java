package info.inetsolv.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import info.inetsolv.Entity.Employee;

@Repository
public class EmployeeDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	
	@Transactional
	public void save(Employee employee) {
		
		entityManager.persist(employee);
		}
	
	 public Employee findAllEmployees() {
		 
		 Employee employee = entityManager.find(Employee.class, 1);
		 return employee;
		
	 }
}
