package ch07;

/**
 * 
 * 6.類別Dog(狗)、Cat(貓)、Bird(鳥) 繼承Pet 建構子: 無參數建構子、3個參數建構子(nickname、age、color) 方法: *
 * (覆寫Pet的方法) talk()、欄位的Setter/Getter
 * 
 * @author SisolShie
 *
 */

public class Cat extends Pet {

	public Cat() {
	}

	public Cat(String nickname, int age, Color color) {
		super(nickname, age, color);
	}

	@Override
	public void talk() {
		System.out.println("喵喵喵");
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
