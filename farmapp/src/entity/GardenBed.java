package entity;

public class GardenBed {
	private Plant[] plantingSpot = new Plant[9];

	
	
	public void water(int index) {

	}

	public void waterAll() {

	}

	public void plant(Plant plant, int index){
		plantingSpot[index] = plant;
	}
	
	public Plant getPlant(int index){
		return plantingSpot[index];
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
	
	public void plant(Plant plant, int index){
		plantingSpot[index] = plant;
	}
	
	public Plant getPlant(int index){
		return plantingSpot[index];
	}
	
	
}
