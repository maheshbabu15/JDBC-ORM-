package info.inetsolv.JPAwithSpringORM;

import java.math.BigDecimal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import info.inetsolv.DAO.EmployeeDAO;
import info.inetsolv.Entity.Employee;
import info.inetsolv.Util.MOCUtil;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Employee employee = new Employee();
    	employee.setEno(4);
    	employee.setName("ambika");
    	employee.setSalary(new BigDecimal(2000));
    	
    	AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(MOCUtil.class);
    	EmployeeDAO employeeDAO = container.getBean(EmployeeDAO.class);
    	employeeDAO.save(employee);
//    	Employee findAllEmployees = employeeDAO.findAllEmployees();
//    	System.out.println(findAllEmployees.getName());
//    	System.out.println(findAllEmployees.getSalary());
    	
    	System.out.println(employeeDAO);
    	System.out.println(employee);
    	
    	container.close();
    }
}
