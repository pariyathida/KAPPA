package Entity;

public class GardenBed {
	Plant[] plantingSpot = new Plant[9];

	public void water(int index) {

	}

	public void waterAll() {

	}

	public void increaseDay() {
		for (int i = 0; i < 9; i++) {
			if (plantingSpot[i] != null) {
				if (plantingSpot[i].getState().equals("dead")) {
					plantingSpot[i] = null;
				} else {
					plantingSpot[i].increaseAge();
				}
			}
		}
	}
}
