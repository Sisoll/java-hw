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
public class ScoreSummary1 {

	public static void main(String[] args) {

		System.out.println(summarize1(-45));

	}

	public static ScoreGrade1 summarize1(int score) {

		ScoreGrade1 grade = null;

		try {
			if (score < 0 || score > 100) {
				throw new OutOfRangeException("輸入分數錯誤");
			} else if (score <= 100 && score >= 90) {
				grade = ScoreGrade1.甲;
			} else if (score <= 89 && score >= 80) {
				grade = ScoreGrade1.乙;
			} else if (score <= 79 && score >= 70) {
				grade = ScoreGrade1.丙;
			} else if (score <= 69 && score >= 60) {
				grade = ScoreGrade1.丁;
			} else if (score <= 59 && score >= 0) {
				grade = ScoreGrade1.戊;
			}
		} catch (OutOfRangeException e) {
			grade = ScoreGrade1.錯誤;
		}

		return grade;
	}

	static class OutOfRangeException extends IllegalArgumentException {

		private static final long serialVersionUID = -7906412844632077622L;

		
		
		public OutOfRangeException(String message) {
			System.out.println(message);
		}
	}
}
