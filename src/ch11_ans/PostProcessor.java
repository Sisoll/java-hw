package ch11_ans;

/**
 * <pre>
 * 請定義以下類別/介面..
 * 	介面PostProcessor
 * 		方法: void process(Object data)
 * 	類別BoundAdderTask，實作Runnable介面，
 * 		成員如下..
 * 			欄位private long lower;    // 計算的下限
 *		 	private long upper;    // 計算的上限
 * 			private PostProcessor processor;     // 後置處理器
 *	 	建構子: 3個參數(lower、upper、processor)的建構子

 * 方法
 * 	覆寫run(): 計算lower一直加到upper的總和(sum)，計算完後需呼叫..
 * 
 * 	processor.process(sum);
 * 
 *	 欄位lower、upper的Getter
 * 
 * </pre>
 * 
 * @author SisolShie
 *
 */
public interface PostProcessor {
	void process(Object data);
}
