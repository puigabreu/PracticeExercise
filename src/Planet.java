public class Planet {
	
	private String name;
	private double distance; // in light-years
	private double radius; // in kilometers
	private int population;
	
	
	/*
	 *  Create a constructor that uses the given parameters. 
	 *  A planet has a 5% chance of having alien life. 
	 *  In case of alien life, population is random.
	 */
	public Planet(String name, double distance, double radius) {
		// Your code here
	}
	
	/*
	 * Creates an identical planet to the one given.
	 */
	public Planet(Planet planet) {
		// Your code here
	}
	
	public boolean equals(Object e) {
		if(e instanceof Planet && ((Planet) e).name.equals(this.name))
			return true;
		return false;
	}
	// Getters
	public String getName() {
		return this.name;
	}
	
	public double getDistance() {
		return this.distance;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public int getPopulation() {
		return this.population;
	}
	
	/*
	 * Write a method that indicates if there is alien life or not.
	 */
	public boolean alienLife() {
		// Your code here
		return false;
	}
	
	/*
	 * Write a method that returns the distance in miles:
	 * 1 light year is approximately 5.88e12 miles
	 */
	public double getDistanceMiles() {
		// Your code here
		return 0.0;
	}
	
	/*
	 * Assuming the planets are perfect spheres, return the volume 
	 * of the planet.
	 * V = 4/3 * pi * r^3
	 */
	public double getVolume() {
		// Your code here
		return 0.0;
	}
	
	/*
	 * Create a method that returns true if the calling Planet is
	 * bigger and false otherwise
	 */
	public boolean isBigger(Planet planet) {
		// Your code here
		return false;
	}
	
	/*
	 * A civilization has come to colonize the planet! If the planet 
	 * already has alien life, a war will break out. The planet
	 * with the bigger population will win, but their population will
	 * be reduced by 50%. In the case the populations are equal,
	 * no one will survive. If the planet is vacant, all of the 
	 * incoming population will move in. 
	 */
	public void colonize(int incomingPopulation) {
		// Your code here
	}
	
	/*
	 * Create a method where there's a 50/50 chance of a population
	 * boom or decrease. Either double or cut the population by half
	 */
	public void populationEvent() {
		// Your code here
	}
	
	/*
	 * Return the planet as a string
	 * Ex: Planet Jupiter
	 */
	public String toString() {
		// Your code here
		return null;
	}
	    

	public static void main(String[] args) {
		
	}

}
