package ch11_ans;

/**
 * <pre>
 * written by Teacher
 *
 * 解題邏輯:先找出是幾的倍數然後分組,因最大INT+1為2^16 
 * 所以先用2^16加起來在減掉
 * 
 * 1 + .... + 9999 =
 * 
 * 1~1000 + 1001~2000 ... 9001+10000 (分10組) - 10000
 *
 * </pre>
 * 
 * @author SisolShie
 *
 */
public class MaxAdder implements PostProcessor {

	public static void main(String[] args) {
		// final long start = System.currentTimeMillis();

		// MaxAdder maxAdder = new MaxAdder();
		System.out.println(new MaxAdder().add());

		/// final long end = System.currentTimeMillis();

		// System.out.println("running time : " + (end - start));
	}

	private long sum;

	public long add() {
		long goal = 2147483648L;
		int threadCount = 1024;
		long rangeSize = goal / threadCount;
		ThreadGroup group = new ThreadGroup("max");
		for (var i = 1; i < threadCount; i++) {
			long lower = (i - 1) * rangeSize + 1;
			long upper = i * rangeSize;

			BoundAdderTask task = new BoundAdderTask(lower, upper, this);
			new Thread(group, task).start();
		}
		while (group.activeCount() != 0) {
		}

		sum -= 2147483648L;
		return sum;
	}

	@Override
	public synchronized void process(Object data) {
		final long subSum = (long) data;
		sum += subSum;
	}

}
