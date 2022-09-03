package com.xworkz.dtoconcept.dto;

import java.io.Serializable;

public class WaterDTO implements Serializable {
	
	private String name;
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
	private double molarMass;
	private double density;
	private double meltingPoint;
	private double boilingPoint;
	private double vaporPressure;
	private double acidity;
	private double basicity;
	private String conjugateAcid; 
	private String conjugateBase; 
	private double thermalConductivity;
	private double refractiveIndex;
	private double Viscosity;
	private String crystalStructure;
	private String pointGroup;
	private String molecularShape;
	private double dipoleMoment;
	private double heatCap;
	private String solvent1;
	private String solvent2;
	private boolean washing;
	private boolean cooking;
	
	public WaterDTO() {
		System.out.println("Default constructor");
	}

	@Override
	public int hashCode() {
		return 8742;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			System.out.println("Object is not a null");
			if(obj instanceof WaterDTO) {
				WaterDTO water = (WaterDTO)obj;
				if(water.name.equals(this.name) && water.chemicalFormula.equals(this.chemicalFormula)) {
					System.out.println("Both " +this.name +" &" +this.chemicalFormula);
					return true;
				}
			}
		}else {
			System.out.println("Object is a null");
		}
		return super.equals(obj);
	}

	public String getName() {
		return name;
	}

	public String getChemicalFormula() {
		return chemicalFormula;
	}

	public String getDescribedAs() {
		return describedAs;
	}

	public boolean isPolar() {
		return polar;
	}

	public boolean isSolvent() {
		return solvent;
	}

	public String getHeatCapacity() {
		return heatCapacity;
	}

	public String getHeatOfVaporization() {
		return heatOfVaporization;
	}

	public boolean isCohesive() {
		return cohesive;
	}

	public boolean isAdhesive() {
		return adhesive;
	}

	public String getSurfaceTension() {
		return surfaceTension;
	}

	public boolean isSurfaceTension1() {
		return surfaceTension1;
	}

	public String getUsedTo() {
		return usedTo;
	}

	public String getUsedFor() {
		return usedFor;
	}

	public double getCapillaryAction() {
		return capillaryAction;
	}

	public double getSpecificHeat() {
		return specificHeat;
	}

	public String getSpecificHeat1() {
		return specificHeat1;
	}

	public boolean isImbibition() {
		return Imbibition;
	}

	public boolean isFreezing() {
		return freezing;
	}

	public double getVersatileSolvent() {
		return versatileSolvent;
	}

	public double getMolarMass() {
		return molarMass;
	}

	public double getDensity() {
		return density;
	}

	public double getMeltingPoint() {
		return meltingPoint;
	}

	public double getBoilingPoint() {
		return boilingPoint;
	}

	public double getVaporPressure() {
		return vaporPressure;
	}

	public double getAcidity() {
		return acidity;
	}

	public double getBasicity() {
		return basicity;
	}

	public String getConjugateAcid() {
		return conjugateAcid;
	}

	public String getConjugateBase() {
		return conjugateBase;
	}

	public double getThermalConductivity() {
		return thermalConductivity;
	}

	public double getRefractiveIndex() {
		return refractiveIndex;
	}

	public double getViscosity() {
		return Viscosity;
	}

	public String getCrystalStructure() {
		return crystalStructure;
	}

	public String getPointGroup() {
		return pointGroup;
	}

	public String getMolecularShape() {
		return molecularShape;
	}

	public double getDipoleMoment() {
		return dipoleMoment;
	}

	public double getHeatCap() {
		return heatCap;
	}

	public String getSolvent1() {
		return solvent1;
	}

	public String getSolvent2() {
		return solvent2;
	}

	public boolean isWashing() {
		return washing;
	}

	public boolean isCooking() {
		return cooking;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setChemicalFormula(String chemicalFormula) {
		this.chemicalFormula = chemicalFormula;
	}

	public void setDescribedAs(String describedAs) {
		this.describedAs = describedAs;
	}

	public void setPolar(boolean polar) {
		this.polar = polar;
	}

	public void setSolvent(boolean solvent) {
		this.solvent = solvent;
	}

	public void setHeatCapacity(String heatCapacity) {
		this.heatCapacity = heatCapacity;
	}

	public void setHeatOfVaporization(String heatOfVaporization) {
		this.heatOfVaporization = heatOfVaporization;
	}

	public void setCohesive(boolean cohesive) {
		this.cohesive = cohesive;
	}

	public void setAdhesive(boolean adhesive) {
		this.adhesive = adhesive;
	}

	public void setSurfaceTension(String surfaceTension) {
		this.surfaceTension = surfaceTension;
	}

	public void setSurfaceTension1(boolean surfaceTension1) {
		this.surfaceTension1 = surfaceTension1;
	}

	public void setUsedTo(String usedTo) {
		this.usedTo = usedTo;
	}

	public void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
	}

	public void setCapillaryAction(double capillaryAction) {
		this.capillaryAction = capillaryAction;
	}

	public void setSpecificHeat(double specificHeat) {
		this.specificHeat = specificHeat;
	}

	public void setSpecificHeat1(String specificHeat1) {
		this.specificHeat1 = specificHeat1;
	}

	public void setImbibition(boolean imbibition) {
		Imbibition = imbibition;
	}

	public void setFreezing(boolean freezing) {
		this.freezing = freezing;
	}

	public void setVersatileSolvent(double versatileSolvent) {
		this.versatileSolvent = versatileSolvent;
	}

	public void setMolarMass(double molarMass) {
		this.molarMass = molarMass;
	}

	public void setDensity(double density) {
		this.density = density;
	}

	public void setMeltingPoint(double meltingPoint) {
		this.meltingPoint = meltingPoint;
	}

	public void setBoilingPoint(double boilingPoint) {
		this.boilingPoint = boilingPoint;
	}

	public void setVaporPressure(double vaporPressure) {
		this.vaporPressure = vaporPressure;
	}

	public void setAcidity(double acidity) {
		this.acidity = acidity;
	}

	public void setBasicity(double basicity) {
		this.basicity = basicity;
	}

	public void setConjugateAcid(String conjugateAcid) {
		this.conjugateAcid = conjugateAcid;
	}

	public void setConjugateBase(String conjugateBase) {
		this.conjugateBase = conjugateBase;
	}

	public void setThermalConductivity(double thermalConductivity) {
		this.thermalConductivity = thermalConductivity;
	}

	public void setRefractiveIndex(double refractiveIndex) {
		this.refractiveIndex = refractiveIndex;
	}

	public void setViscosity(double viscosity) {
		Viscosity = viscosity;
	}

	public void setCrystalStructure(String crystalStructure) {
		this.crystalStructure = crystalStructure;
	}

	public void setPointGroup(String pointGroup) {
		this.pointGroup = pointGroup;
	}

	public void setMolecularShape(String molecularShape) {
		this.molecularShape = molecularShape;
	}

	public void setDipoleMoment(double dipoleMoment) {
		this.dipoleMoment = dipoleMoment;
	}

	public void setHeatCap(double heatCap) {
		this.heatCap = heatCap;
	}

	public void setSolvent1(String solvent1) {
		this.solvent1 = solvent1;
	}

	public void setSolvent2(String solvent2) {
		this.solvent2 = solvent2;
	}

	public void setWashing(boolean washing) {
		this.washing = washing;
	}

	public void setCooking(boolean cooking) {
		this.cooking = cooking;
	}

	
}
