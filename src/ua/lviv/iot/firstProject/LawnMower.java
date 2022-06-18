package ua.lviv.iot.firstProject;

public record LawnMower(int grassLevel, int enginePower, double fuelTankVolume, String model,
						String developerCompany, int yearOfManafacture) {
	
	static public final String TYPE = "GrassKiller";

	public LawnMower() 
	{
		this(3, 12, 3.2d, "Out of town", "Bosh", 2019);
	}

	public LawnMower(int grassLevel, int enginePower, double fuelTankVolume) {
		this(grassLevel, enginePower, fuelTankVolume, "Z560X", "Husqvarna", 2022);
	}
	
	@Override
	public String toString() {
		return "Grass mowing width in centimeters - " + grassLevel + ", "
				+ "engine power in watts - " + enginePower + ", model - " + model +
				", fuel tank volume - " + fuelTankVolume + ", developer company is "
				+ developerCompany + " and year of manafacture " + yearOfManafacture + ".";
	}
	
	public static String getStaticField() 
	{
		return "Type of lawn-mower - " + TYPE;
	}
}
