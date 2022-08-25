package com.xworkz.encapsulation.protector.sup;

public class Trainer {
	
	protected String name;
	protected double experience;
	protected String specialization;
	
	protected Trainer()
	{
		System.out.println("Default const of Trainer");
	}

	protected Trainer(String name,double experience,String specialization)
	{
		this.name=name;
		this.experience=experience;
		this.specialization=specialization;
	}
	
	protected boolean getTraining()
	{
		System.out.println("Training is Good");
		return true;
	}
		
	protected boolean getConductInterview()
	{
		System.out.println("Interview will be conducted");
		return true;
	}
		
	protected boolean getCoding()
	{
		System.out.println("Coding is there in Interview");
		return true;
	}
}
