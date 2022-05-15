package ch08;

public enum ScoreGrade {

	甲(90, 100), 乙(80, 89), 丙(70, 79), 丁(60, 69), 戊(0, 59), 錯誤;

	private int min, max;

	private ScoreGrade() {
	}

	private ScoreGrade(int min, int max) {
		this.min = min;
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

}
