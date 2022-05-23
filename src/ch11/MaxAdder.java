package ch11;

/**
 * 
 * <pre>
 * 5.請定義類別MaxAdder，實作PostProcessor介面，成員如下..
 * 欄位: long sum; 方法 add(): 計算1 + 2 + .. + * Integer.MAX_VALUE(2147483647)的總和，並回傳。 
 * 2147483647
 * 請利用第3題的BoundAdderTask類別，啟動多個執行緒來一起計算 
 * 	註:總和是2305843008139952128
 * 
 * 覆寫process(): 用此方法接收BoundAdderTask物件計算完的結果，並加總至欄位sum
 * 
 *  提示: 需將欄位sum控制成同步資料
 *  
 *  &#64;remark
 *  {
 *   1.BoundAdderTask內的PostProcessor就是"自己",所以用this就好
 *   2.	while (tGroup.activeCount() != 0);  如果還有(tGroup內的)執行緒還在運作則會卡在這裡不會往下
 * </pre>
 * 
 * @author SisolShie
 *
 */
public class MaxAdder implements PostProcessor {

	public static void main(String[] args) {

		final long start = System.currentTimeMillis();
		MaxAdder maxAdder = new MaxAdder();
		System.out.println(maxAdder.add());
		final long end = System.currentTimeMillis();
		System.out.println("running time : " + (end - start));
	}

	private long sum;

	public long add() {
		/// PostProcessor data = new MaxAdder();
		ThreadGroup tGroup = new ThreadGroup("group");

		int step = 10000000;
		int lower = 1;
		int upper = step;
		int upperMax = Integer.MAX_VALUE;
		while (true) {
			while (tGroup.activeCount() == 2048) {
			}
			if (upper < upperMax) {
				new Thread(tGroup, new BoundAdderTask(lower, upper, this)).start();

			} else if (upper >= upperMax) {
				new Thread(tGroup, new BoundAdderTask(lower, upperMax, this)).start();

				break;
			}
			lower += step;
			upper += step;

			if (upper < lower) {
				upper = upperMax;
			}
		}
		while (tGroup.activeCount() != 0) {
		}
		return sum;
	}

	@Override
	public synchronized void process(Object data) {
		sum += (long) data;
	}

}