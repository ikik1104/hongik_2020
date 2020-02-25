
public class Car {
	String color;
	String gearType;
	int door;
	
	Car(){ //기본 생성자
		this("핑크","오토",5);
	}

	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
}
