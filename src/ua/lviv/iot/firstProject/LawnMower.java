package ua.lviv.iot.firstProject;

public record LawnMower(int grass_level, int engine_power, double fuel_tank_volume, String model, 
		String developer_company, int year_of_manafacture) {
	
	static public final String TYPE = "GrassKiller";
	
	public LawnMower() 
	{
		this(3, 12, 3.2d, "Out of town", "Bosh", 2019);
	}

	public LawnMower(int grass_level, int engine_power, double fuel_tank_volume) 
	{
		this(grass_level, engine_power, fuel_tank_volume, "Z560X", "Husqvarna", 2022);
	}
	
	public LawnMower(int grass_level, int engine_power, double fuel_tank_volume, String model, 
			String developer_company, int year_of_manafacture) 
	{
		this.grass_level = grass_level; 
		this.engine_power = engine_power;
		this.fuel_tank_volume = fuel_tank_volume;
		this.model = model;
		this.developer_company = developer_company;
		this.year_of_manafacture = year_of_manafacture;
	}
	
	@Override
	public String toString() 
	{
		String about_all = "Grass mowing width in centimeters - " + grass_level + ", "
				+ "engine power in watts - " + engine_power + ", model - " + model + 
				", fuel tank volume - " + fuel_tank_volume + ", developer company is " 
				+ developer_company + " and year of manafacture " + year_of_manafacture + ".";
		return about_all;
	}
	
	public static String getStaticField() 
	{
		return "Type of lawn-mower - " + TYPE;
	}
}
