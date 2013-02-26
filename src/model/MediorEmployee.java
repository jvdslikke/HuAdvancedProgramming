package model;

public class MediorEmployee extends AbstractEmployee
{
	public MediorEmployee(String name)
	{
		super(name);
	}
	
	@Override
	public String getLevelName()
	{
		return "Medior";
	}

	@Override
	public void raiseSalary()
	{
		this.salary = this.salary * 106 + 20000;
		this.salary = this.salary / 100;
	}

}
