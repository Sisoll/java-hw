package ch07;

/**
 * 
 * 7.類別Car(車)、Airplane(飛機) 繼承Vehicle 
 * 建構子: 無參數建構子、1個參數建構子(tankSize)
 * 
 * 8.續第6、7題，請定義介面Flying(會飛的)， 
 * 含有一抽象方法fly()類別Bird、Airplane實作此介面，並覆寫fly()
 * 
 * @author SisolShie
 *
 */

public class Airplane extends Vehicle implements Flying {

	int tankSize;

	public Airplane() {
	}

	public Airplane(int tankSize) {
	}

	@Override
	void gasUp() {
	}

	@Override
	public void fly() {
		System.out.println("飛機會飛的其中一個原因是白努利原理");
	}
	
	public int getTankSize() {
		return tankSize;
	}

	public void setTankSize(int tankSize) {
		this.tankSize = tankSize;
	}
}
