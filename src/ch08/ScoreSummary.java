package ch08;

/**
 * <pre>
 * 請定義…
 * 
 * ScoreGrade列舉，含有列舉常數: 甲、乙、丙、丁、戊、錯誤
 * 
 * ScoreSummary類別，有1個靜態方法… public static ScoreGrade summarize(int score): 將分數 轉成
 * 分數級距(ScoreGrade)，規則如下…
 * 
 * Grade Range 甲 90-100 	乙 80-89 	丙 70-79 	丁 60-69		戊 0-59
 * 
 * 請加入適當的try-catch區塊，轉換失敗時印出"輸入分數錯誤"，並回傳ScoreGrade列舉常數 錯誤
 * </pre>
 * 
 * @author SisolShie
 *
 */

public class ScoreSummary {

	public static void main(String[] args) {
		System.out.println(summarize(-56));
	}

	public static ScoreGrade summarize(int score) {

		try {
			for (ScoreGrade scoreGrade : ScoreGrade.values()) {
				int min = scoreGrade.getMin();
				int max = scoreGrade.getMax();
				if (score >= min && score <= max) {
					return scoreGrade;
				}
			}
			throw new Exception("輸入分數錯誤");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return ScoreGrade.錯誤;
		}
	}
}
