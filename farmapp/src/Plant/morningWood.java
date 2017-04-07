package Plant;

import Entity.Fruit;
import Entity.Plant;
import Entity.Prompter;
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
		if (healthGauge == 0) {
			product.clear();
			System.out.println("Oh no! Your " + name + " fruit has rot");
		} else if (state.equals("mature")) {
			if (water == waterGauge && health == healthGauge) {
				boolean exist = false;
				Fruit f = new largeMorningFruit();
				for (Fruit fr : product) {
					if (fr.getName().equals(f.getName())) {
						fr.setAmount(fr.getAmount() + 1);
						exist = true;
						break;
					}
				}
				if (!exist) {
					f.setAmount(1);
					product.add(f);
				}
				System.out.println("Yay! Your " + name + " has produced " + f.getName());
			} else {
				boolean exist = false;
				Fruit f = new smallMorningFruit();
				for (Fruit fr : product) {
					if (fr.getName().equals(f.getName())) {
						fr.setAmount(fr.getAmount() + 1);
						exist = true;
						break;
					}
				}
				if (!exist) {
					f.setAmount(1);
					product.add(f);
				}
				System.out.println("Yay! Your " + name + " has produced " + f.getName());
			}
		}
	}
}
