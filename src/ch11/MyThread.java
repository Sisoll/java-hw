package ch11;

import java.sql.Time;

/**
 * 
 * <pre>
 * 1.請定義類別MyThread，繼承Thread
 * 
 * 2個建構子: 
 * 	無參數建構子 2個參數(ThreadGroup group, String name)的建構子:
 * 	group為執行緒群組、name為執行緒的名稱 
 * 
 * 方法: 覆寫run()，每隔一秒可以印出 執行緒名稱: 當下時間，只會印出5次 
 * 	提示:可透過以下程式取得當下時間 Time time = new Time(System.currentTimeMillis());
 * 
 * 2.續第1題，請設計一段程式，可以控制隨時保持有4個active的MyThread實例在執行
 * </pre>
 * 
 * @author SisolShie
 *
 */
public class MyThread extends Thread {

	public static void main(String[] args) {
		ThreadGroup group = new ThreadGroup("group");

		var count = 1;
		while (true) {
			while (group.activeCount() == 4) // 如果不用group區分的話,main也算一個執行緒
				;
			new MyThread(group, "t" + count).start();
			count++;
		}
	}

	// 用construct from Superclass 製作
	public MyThread() {
		super();
	}

	public MyThread(ThreadGroup group, String name) {
		super(group, name);
	}

	@Override
	public void run() {
		try {
			for (var i = 0; i < 5; i++) {
				Time time = new Time(System.currentTimeMillis());
				System.out.println(getName() + " : " + time);
				sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
