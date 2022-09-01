package com.xworkz.encapsulation.protector.sub;

public class Fish {

	private String breed;
	private String type;

	public Fish() {
		System.out.println("Default const in Fish");
	}

	public Fish(String breed, String type) {
		super();
		this.breed = breed;
		this.type = type;
	}

	public String getBreed() {
		return breed;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Fish [breed=" + breed + ", type=" + type + "]";
	}
	
	public boolean equals(Object obj) {
		
		if(obj != null ) {
			System.out.println("Object is not a null");
			if(obj instanceof Fish) {
				System.out.println("Object is Fish");
				Fish f = (Fish)obj;
				String a = f.breed;
				String b = f.type;
				if(this.breed.equals(a) && this.type.equals(b)) {
					System.out.println("Two fish are same");
					return true;
				}else {
					System.out.println("Object is not a Fish");
				}
			}else {
				System.out.println("Object is null");
			}
		}
		return super.equals(obj);
	}

	

}
