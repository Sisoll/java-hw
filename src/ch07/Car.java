package ch07;

/**
 * 
 * 7.類別Car(車)、Airplane(飛機) 繼承Vehicle 
 * 建構子: 無參數建構子、1個參數建構子(tankSize)
 * 
 * @author SisolShie
 *
 */

public class Car extends Vehicle {

	int tankSize;

	public Car() {
	}

	public Car(int tankSize) {
	}

	@Override
	void gasUp() {
	}

	public int getTankSize() {
		return tankSize;
	}

	public void setTankSize(int tankSize) {
		this.tankSize = tankSize;
	}

}
