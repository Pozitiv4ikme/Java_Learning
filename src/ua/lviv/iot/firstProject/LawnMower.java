package ua.lviv.iot.firstProject;

public record LawnMower(int grassLevel, int enginePower, double fuelTankVolume, String model,
						String developerCompany, int yearOfManafacture) {
	
	static public final String TYPE = "GrassKiller";
	//static public final int amount = 3;
	//private double ratingOfProduct;
	//private String name;

	public LawnMower() 
	{
		this(3, 12, 3.2d, "Out of town", "Bosh", 2019);
	}

	public LawnMower(int grassLevel, int enginePower, double fuelTankVolume)
	{
		this(grassLevel, enginePower, fuelTankVolume, "Z560X", "Husqvarna", 2022);
	}

	public LawnMower(int grassLevel, int enginePower, double fuelTankVolume, String model,
					 String developerCompany, int yearOfManafacture)
	{
		this.grassLevel = grassLevel;
		this.enginePower = enginePower;
		this.fuelTankVolume = fuelTankVolume;
		this.model = model;
		this.developerCompany = developerCompany;
		this.yearOfManafacture = yearOfManafacture;
	}
	
	@Override
	public String toString() 
	{
		return "Grass mowing width in centimeters - " + grassLevel + ", "
				+ "engine power in watts - " + enginePower + ", model - " + model +
				", fuel tank volume - " + fuelTankVolume + ", developer company is "
				+ developerCompany + " and year of manafacture " + yearOfManafacture + ".";
	}
	
	public static String getStaticField() 
	{
		return "Type of lawn-mower - " + TYPE;
	}

	//public static int getStaticFieldAmount() { return "Amount of all product is " + amount; }
	//public double setRatingOfProduct() { this.rating = rating; }
	//public String getThanks() { return "Thank you - " + name + " for purchasing the product in our store!"}
}
