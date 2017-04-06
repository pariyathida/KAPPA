package Entity;

import java.util.ArrayList;

public class Plant {
	protected String name;
	protected int age;
	protected int health;
	protected int healthGauge;
	protected int water;
	protected int waterGauge;
	protected int sprout;
	protected int maturity;
	protected int lifeSpan;
	protected String state = "seedling";
	protected ArrayList<Fruit> product = new ArrayList<>();
	protected boolean isFertilized;
	public String getState() {
		return state;
	}
	public void increaseAge() {
		age++;
		if (isFertilized) {
			sprout--;
			maturity--;
		}
		if (age > sprout) {
			state = "sprout";
		}
		if (age > maturity) {
			state = "mature";
		}
		if (age > lifeSpan) {
			state = "dead";
			System.out.println("Oh shit! Your " + name + " has rot.");
		}
		if (waterGauge > 0) {
			waterGauge--;
		}
		if (waterGauge == 0) {
			healthGauge--;
		}
		if (healthGauge == 0) {
			state = "dead";
			System.out.println("Oh shit! Your " + name + " has rot.");
		}
	}
}
