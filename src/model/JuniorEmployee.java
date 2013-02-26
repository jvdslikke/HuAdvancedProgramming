package model;

public class JuniorEmployee extends AbstractEmployee
{
	public JuniorEmployee(String name)
	{
		super(name);
	}
	
	@Override
	public String getLevelName()
	{
		return "Junior";
	}

	@Override
	public void raiseSalary()
	{
		this.salary = this.salary * 105 + 10000;
		this.salary = this.salary / 100;	
	}
}
