package com.xworkz.dtoconcept.dto;

import java.io.Serializable;

public class CarDTO implements Serializable {

	private String company;
	private String name;
	private double mileage;
	private double cityMileage;
	private boolean fuel;
	private String fuelType;
	private int engineDisplacement;
	private boolean cylinders;
	private int power;
	private int powerRpm;

	private int torque;
	private int torqueRpm;
	private boolean seats;
	private int noOfSeats;
	private String transmissionType1;
	private String transmissionType2;
	private boolean fuelTank;
	private double fuelTankCapacity;
	private String bodyType;
	private boolean groundClearance;

	private double groundClearance1;
	private boolean powerSteering;
	private boolean powerWindowsFront;
	private boolean powerWindowsBack;
	private boolean abs;
	private boolean ac;
	private boolean driverAirbag;
	private boolean passengerAirbag;
	private boolean acc;
	private boolean fogLights;

	private boolean alloyWheels;
	private String engineType;
	private boolean turboCharger;
	private String gearBox;
	private String emissionNorm;
	private String frontBrake;
	private String rearBrake;
	private int noOfDoors;
	private boolean cruiseControl;
	private boolean parkingSensors;

	private String clock;
	private String odometer;
	private boolean powerAntenna;
	private String tyreType;
	private boolean seatBelts;

	public CarDTO() {
		System.out.println("Default constructor");
	}

	@Override
	public int hashCode() {
		return 2819;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public void setCityMileage(double cityMileage) {
		this.cityMileage = cityMileage;
	}

	public void setFuel(boolean fuel) {
		this.fuel = fuel;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public void setEngineDisplacement(int engineDisplacement) {
		this.engineDisplacement = engineDisplacement;
	}

	public void setCylinders(boolean cylinders) {
		this.cylinders = cylinders;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public void setPowerRpm(int powerRpm) {
		this.powerRpm = powerRpm;
	}

	public void setTorque(int torque) {
		this.torque = torque;
	}

	public void setTorqueRpm(int torqueRpm) {
		this.torqueRpm = torqueRpm;
	}

	public void setSeats(boolean seats) {
		this.seats = seats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public void setTransmissionType1(String transmissionType1) {
		this.transmissionType1 = transmissionType1;
	}

	public void setTransmissionType2(String transmissionType2) {
		this.transmissionType2 = transmissionType2;
	}

	public void setFuelTank(boolean fuelTank) {
		this.fuelTank = fuelTank;
	}

	public void setFuelTankCapacity(double fuelTankCapacity) {
		this.fuelTankCapacity = fuelTankCapacity;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public void setGroundClearance(boolean groundClearance) {
		this.groundClearance = groundClearance;
	}

	public void setGroundClearance1(double groundClearance1) {
		this.groundClearance1 = groundClearance1;
	}

	public void setPowerSteering(boolean powerSteering) {
		this.powerSteering = powerSteering;
	}

	public void setPowerWindowsFront(boolean powerWindowsFront) {
		this.powerWindowsFront = powerWindowsFront;
	}

	public void setPowerWindowsBack(boolean powerWindowsBack) {
		this.powerWindowsBack = powerWindowsBack;
	}

	public void setAbs(boolean abs) {
		this.abs = abs;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public void setDriverAirbag(boolean driverAirbag) {
		this.driverAirbag = driverAirbag;
	}

	public void setPassengerAirbag(boolean passengerAirbag) {
		this.passengerAirbag = passengerAirbag;
	}

	public void setAcc(boolean acc) {
		this.acc = acc;
	}

	public void setFogLights(boolean fogLights) {
		this.fogLights = fogLights;
	}

	public void setAlloyWheels(boolean alloyWheels) {
		this.alloyWheels = alloyWheels;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public void setTurboCharger(boolean turboCharger) {
		this.turboCharger = turboCharger;
	}

	public void setGearBox(String gearBox) {
		this.gearBox = gearBox;
	}

	public void setEmissionNorm(String emissionNorm) {
		this.emissionNorm = emissionNorm;
	}

	public void setFrontBrake(String frontBrake) {
		this.frontBrake = frontBrake;
	}

	public void setRearBrake(String rearBrake) {
		this.rearBrake = rearBrake;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public void setCruiseControl(boolean cruiseControl) {
		this.cruiseControl = cruiseControl;
	}

	public void setParkingSensors(boolean parkingSensors) {
		this.parkingSensors = parkingSensors;
	}

	public void setClock(String clock) {
		this.clock = clock;
	}

	public void setOdometer(String odometer) {
		this.odometer = odometer;
	}

	public void setPowerAntenna(boolean powerAntenna) {
		this.powerAntenna = powerAntenna;
	}

	public void setTyreType(String tyreType) {
		this.tyreType = tyreType;
	}

	public void setSeatBelts(boolean seatBelts) {
		this.seatBelts = seatBelts;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Object is not a null");
			if (obj instanceof CarDTO) {
				CarDTO cd = (CarDTO) obj;
				if (cd.company.equals(this.company) && cd.name.equals(this.name)) {
					return true;
				}
			}
		} else {
			System.out.println("Object is null");
		}
		return super.equals(obj);
	}

}
