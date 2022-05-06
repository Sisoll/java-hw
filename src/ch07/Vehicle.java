package ch07;

/**
 * 
 * 7.請定義以下類別… 
 * 抽象類別Vehicle(交通工具) 
 * 欄位: tankSize(油箱大小) 
 * 方法: gasUp()、欄位的Setter/Getter
 * 
 * @author SisolShie
 *
 */
public abstract class Vehicle {
	int tankSize;

	abstract void gasUp();

	public int getTankSize() {
		return tankSize;
	}

	public void setTankSize(int tankSize) {
		this.tankSize = tankSize;
	}

}
