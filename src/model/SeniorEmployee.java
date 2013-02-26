package model;

public class SeniorEmployee extends AbstractEmployee
{
	public SeniorEmployee(String name)
	{
		super(name);
	}
	
	@Override
	public String getLevelName()
	{
		return "Senior";
	}

	@Override
	public void raiseSalary()
	{
		this.salary = this.salary * 107;
		this.salary = this.salary / 100;
	}

}
