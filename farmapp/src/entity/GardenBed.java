package entity;

public class GardenBed {
	int size = 9;
	private Plant[] plantingSpot = new Plant[size];
	
	public void water(int index) {

	}

	public void waterAll() {
		
	}

	public boolean plant(Plant plant){
		for(int i=0; i<size; i++){
			if(plantingSpot[i]==null){
				plantingSpot[i] = plant;
				return true;
			}
		}
		return false;
		
	}
	
	public Plant getPlant(int index){
		return plantingSpot[index];
	}
	
	public int size(){
		return size;
	}
	
	//if the plant is not dead, plant age is increased
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
