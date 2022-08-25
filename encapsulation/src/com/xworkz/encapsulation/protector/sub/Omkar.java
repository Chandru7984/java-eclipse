package com.xworkz.encapsulation.protector.sub;

import com.xworkz.encapsulation.protector.sup.Trainer;

public class Omkar extends Trainer {

	public Omkar() {
		System.out.println("Default const of Omakar");
	}

	public Omkar(String name, double experience, String specialization) {
		super(name, experience, specialization);
		System.out.println("Initializing Trainer");
	}

	@Override
	public boolean getTraining() {
		return false;
	}

	@Override
	public boolean getConductInterview() {
		return super.getConductInterview();
	}

	@Override
	public boolean getCoding() {
		return super.getCoding();
	}

	public void Show()
	{
		System.out.println(super.name);
		System.out.println(super.experience);
		System.out.println(super.specialization);
	}
}
