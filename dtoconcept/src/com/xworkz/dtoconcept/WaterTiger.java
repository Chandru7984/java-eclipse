package com.xworkz.dtoconcept;

import com.xworkz.dtoconcept.dto.WaterDTO;

public class WaterTiger {

	public static void main(String[] args) {
		
		/*private String name;
	private String chemicalFormula;
	private String describedAs;
	private boolean polar;
	private boolean solvent;
	private String heatCapacity;
	private String heatOfVaporization;
	private boolean cohesive;
	private boolean adhesive;
	private String surfaceTension;
	private boolean surfaceTension1;
	private String usedTo;
	private String usedFor;
	private double capillaryAction;
	private double specificHeat;
	private String specificHeat1;
	private boolean Imbibition;
	private boolean freezing;
	private double versatileSolvent;
	private double molarMass;18.01
	private double density;0.999
	private double meltingPoint;0.00
	private double boilingPoint;99.98
	private double vaporPressure;3.1690
	private double acidity;13.995
	private double basicity;13.995
	private String conjugateAcid;Hydronium H3O
	private String conjugateBase;Hydroxide OH
	private double thermalConductivity;0.6065
	private double refractiveIndex;1.3330
	private double Viscosity;0.890
	private String crystalStructure;Hexagonal
	private String pointGroup;C2v
	private String molecularShape;Bent
	private double dipoleMoment;1.8546
	private double heatCap;75.385
	private String solvent1;Acetone
	private String solvent2;Methanol
	private boolean washing;
	private boolean cooking; */
		
		WaterDTO wd = new WaterDTO();
		
		wd.setName("Water");
		wd.setChemicalFormula("H2O");
		
		System.out.println(wd.hashCode());
		
		WaterDTO wd1 = new WaterDTO();
		
		wd1.setName("Water");
		wd1.setChemicalFormula("H2O");
		
		System.out.println(wd1.hashCode());
		
		if(wd.hashCode() == wd1.hashCode()) {
			System.out.println(wd.equals(wd1));
		}
		else {
			System.out.println("it is note same");
		}
		

	}

}
