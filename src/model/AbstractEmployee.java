package model;

public abstract class AbstractEmployee
{
	protected String name;
	protected double salary;
	
	public AbstractEmployee()
	{
		this.name = "";
		this.salary = 0;
	}
	
	public AbstractEmployee(String name)
	{
		this.name = name;
		this.salary = 0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public abstract String getLevelName();
	
	public void setSalary(double s)
	{
		salary = s;
	}
	
	public double getPay()
	{
		return salary;
	}
	
	public abstract void raiseSalary();
	
	public String toString()
	{
		String output = "";
		output += getLevelName();
		output += " employee " + name + " has salary " + salary;
		return output;
	}

}
