package ch06;

/**
 * 1.請定義"手機"類別，特徵依你認知的現實狀況
 * 
 * @author SisolShie
 */

public class Hw01 {

	static class Mobile { // 有其他的static class要呼叫來用的話,要加上static

		String owner;

		String brand;
		String type;

		int price;

		int rom;
		int battery;
		int cameraPixel;

		double size;
		double weight;

		String call(String someone) {
			return "call to " + someone ; 
		}
		
		// 加上void沒有回傳,所以不需要return
		void clock(String time) {
			System.out.println("Setting the clock, ringing at " + time);
		}		
		
		// 因為是static 不需要new 直接可以執行
		static String music(String song) {
			var doing = "now playing the " + song;
			return doing;
		}

		
		
		
		
	}
}
