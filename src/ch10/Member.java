package ch10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * <pre>
 * 6.請定義Member類別..
 * 欄位: id、account、password
 * 方法: 欄位的Setter/Getter
 * 宣告一Member物件，並放入欄位值..
		Member member1 = new Member();
		member1.setId(1);
		member1.setAccount("ithan0117");
		member1.setPassword("1qaz@WSX");
		
	將member1序列化寫出至sample3.txt，但password欄位不可序列化
 *
 * 7.續第6題，由sample3.txt反序列化成Member物件member2
 * </pre>
 * 
 * @author SisolShie
 */
public class Member implements Serializable {

	public static void main(String[] args) {
		Member member1 = new Member();
		member1.setId(1);
		member1.setAccount("ithan0117");
		member1.setPassword("1qaz@WSX");

		// Hw06 序列化
		try (FileOutputStream fos = new FileOutputStream("file\\sample3.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(member1);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Hw07 反序列化成物件menber2
		try (FileInputStream fis = new FileInputStream("file\\sample3.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Member member2 = (Member) ois.readObject(); // 這邊我們很有把握才能這樣強制轉型
			System.out.println(member2.getId());
			System.out.println(member2.getAccount());
			System.out.println(member2.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private int id;
	private String account;
	private transient String password;
	private static final long serialVersionUID = -8997586428837088245L;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
