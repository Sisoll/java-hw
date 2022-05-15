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
	
	private double tankSize;

	public void gasUp() {
		System.out.println("油加滿了~");
	};

	protected Vehicle() {
	}
	
	protected Vehicle(double tankSize) {
		this.tankSize = tankSize;
	}



	public double getTankSize() {
		return tankSize;
	}

	public void setTankSize(double tankSize) {
		this.tankSize = tankSize;
	}

}
