import java.util.ArrayList;

import model.*;


public class SalarySystem
{
	protected Logger logger;
	private ArrayList<AbstractEmployee> colleagues;
	
	public SalarySystem()
	{
		this.logger = new Logger();
		this.colleagues = new ArrayList<AbstractEmployee>();
	}
	
	public void raiseSalaryOfAllEmployees()
	{
		for(AbstractEmployee employee : this.colleagues)
		{
			this.raiseSalary(employee);
		}
	}
	
	public void addColleague(AbstractEmployee c)
	{
		colleagues.add(c);
	}
	
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
	
	public void raiseSalary(AbstractEmployee e)
	{
		e.raiseSalary();
		
		this.logger.addLogMessage("employee "+e.getName()+" salary raised to "+e.getPay());
	}
	
	public void printAll()
	{
		for (AbstractEmployee e : colleagues)
		{
			System.out.print(e.toString() + "\n");
		}
	}
	
	public void outputLogMessages()
	{
		this.logger.outputMessages();
	}
	
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


