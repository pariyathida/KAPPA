package Plant;

import Entity.Fruit;
import Entity.Plant;
import Fruit.largeMorningFruit;
import Fruit.smallMorningFruit;

public class morningWood extends Plant {
	public morningWood() {
		name = "Morning wood";
		health = 3;
		healthGauge = health;
		water = 2;
		waterGauge = water;
		sprout = 1;
		maturity = 2;
		lifeSpan = 5;
	}

	public void increaseAge() {
		super.increaseAge();
		if (healthGauge==0){
			product.clear();
			System.out.println("Oh fuck! Your "+name+" fruit has rot");
		}else if (state.equals("mature")) {
			if (water == waterGauge && health == healthGauge) {
				Fruit f = new largeMorningFruit();
				product.add(f);
				System.out.println("Yay! Your "+name+" has produced "+f.getName());
			}else{
				Fruit f = new smallMorningFruit();
				product.add(f);
				System.out.println("Yay! Your "+name+" has produced "+f.getName());
			}
		}
	}
}
