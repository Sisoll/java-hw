package ch07;

/**
 * 
 * 6.類別Dog(狗)、Cat(貓)、Bird(鳥) 繼承Pet 建構子: 無參數建構子、3個參數建構子(nickname、age、color) 方法: *
 * (覆寫Pet的方法) talk()、欄位的Setter/Getter
 * 
 * 8.續第6、7題，請定義介面Flying(會飛的)，含有一抽象方法fly() 類別Bird、Airplane實作此介面，並覆寫fly()
 * 
 * @author SisolShie
 *
 */

public class Bird extends Pet implements Flying {

	public Bird() {
	}

	public Bird(String nickname, int age, Color color) {
		super(nickname, age, color);
	}

	@Override
	public void talk() {
		System.out.println("啾啾");
	}

	@Override
	public void fly() {
		System.out.println("鳥會飛是靠翅膀揮動~");
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
