package test;

public class Question {
	
	private String question;
	private boolean answer;
	private String hint;
	private int point;
	
	Question(){}
	
	public Question(String question, boolean answer, String hint, int point){
		this.question = question;
		this.answer = answer;
		this.hint = hint;
		this.setPoint(point);
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public boolean getAnswer() {
		return answer;
	}

	public void setAnswer(boolean answer) {
		this.answer = answer;
	}

	public String getHint() {
		return hint;
	}

	public void setHint(String hint) {
		this.hint = hint;
	}
	
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	public String toString() {
		String question = "Question: "+this.question+"\nAnswer: "
							+this.getAnswer()+"\nHint: "+this.hint
							+"\nPoint: "+ this.point;
		return question;
	}

	
	
	
}
