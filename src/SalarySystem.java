import java.util.ArrayList;

import model.*;

/**
 * 
 * @author jvdslikke
 *
 * This class maintains a list of employees and raises their salary.
 */
public class SalarySystem
{
	protected Logger logger;
	private ArrayList<AbstractEmployee> colleagues;
	
	public SalarySystem()
	{
		this.logger = new Logger();
		this.colleagues = new ArrayList<AbstractEmployee>();
	}
	
	/**
	 * Raises the salary of all employees
	 */
	public void raiseSalaryOfAllEmployees()
	{
		for(AbstractEmployee employee : this.colleagues)
		{
			this.raiseSalary(employee);
		}
	}
	
	/**
	 * Adds an employee to the list
	 * 
	 * @param c The employee to add
	 */
	public void addColleague(AbstractEmployee c)
	{
		colleagues.add(c);
	}
	
	/**
	 * Get an employee from the list by name
	 * 
	 * @param searchName The name to find employee by
	 * @return The found employee
	 * @throws RuntimeException if the employee isn't found
	 */
	public AbstractEmployee search(String searchName)
	{		
		for(AbstractEmployee employee : colleagues)
		{
			if(employee.getName().equals(searchName))
			{
				return employee;
			}
		}
		
		throw new RuntimeException("employee with name "+searchName+" not found");
	}
	
	/**
	 * Raises the salary of a specific employee and log it (side effect)
	 *  
	 * @param e The employee to raise the salary of
	 */
	public void raiseSalary(AbstractEmployee e)
	{
		e.raiseSalary();
		
		this.logger.addLogMessage("employee "+e.getName()+" salary raised to "+e.getPay());
	}
	
	/**
	 * Print information about all the employees
	 */
	public void printAll()
	{
		for (AbstractEmployee e : colleagues)
		{
			System.out.print(e.toString() + "\n");
		}
	}
	
	/**
	 * Print all gathered log messages
	 */
	public void outputLogMessages()
	{
		this.logger.outputMessages();
	}
	
	/**
	 * Runs the program
	 * 
	 * @param args
	 */
	public static void main(String args[])
	{
		SalarySystem salarySystem = new SalarySystem();
		
		AbstractEmployee junior = new JuniorEmployee("Jaap");
		AbstractEmployee medior = new MediorEmployee("Fred");
		AbstractEmployee senior = new SeniorEmployee("Hans");
		//TODO to save these three lines, create salary as a constructor parameter
		junior.setSalary(1700.0);
		medior.setSalary(2000);
		senior.setSalary(2300);
		
		salarySystem.addColleague(junior);
		salarySystem.addColleague(medior);
		salarySystem.addColleague(senior);
		
		salarySystem.printAll();
		
		salarySystem.raiseSalaryOfAllEmployees();
		
		salarySystem.outputLogMessages();		
		salarySystem.printAll();
	}
	
}


