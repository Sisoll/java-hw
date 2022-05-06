package ch07;

/**
 * 
 * 9.續第6、7題，請定義類別Owner(主人)… 欄位: name(姓名)，pet(寵物，Pet型態)，vehicle(交通工具，Vehicle型態)
 * 建構子: 無參數建構子、3個參數建構子(name、pet、vehicle) 方法: walkPet()、drive()、欄位的Setter/Getter
 * 
 * @author SisolShie
 *
 */
public class Owner {

	public static void main(String[] args) {

		//建構pet型態的物件
		Cat cat = new Cat();		
		Dog dog = new Dog();
		//建構vehicle(中的Car)物件
		Car car = new Car();
		
		Owner owner1 = new Owner("TTTT", cat, car);
		Owner owner2 = new Owner("SSSS", dog, car);
		
		owner1.walkPet();
		owner2.drive();
	}

	String name;
	Pet pet;
	Vehicle vehicle;
	
	public Owner() {
	}

	public Owner(String name, Pet pet, Vehicle vehicle) {
		this.name = name;
		this.pet = pet;
		this.vehicle = vehicle;
	}

	void walkPet() {
		System.out.print("溜寵物~");
		pet.talk();
	}

	void drive() {
		System.out.println("駕駛員是 : " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}
