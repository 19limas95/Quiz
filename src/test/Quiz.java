package test;

import java.util.ArrayList;

public class Quiz {
	
	private String name;
	private ArrayList<Question> questions = new ArrayList<Question>();
	private int yourPoints = 0;
	private int totalPoints = 0;
	
	Quiz(){
		
	}
	
	public Quiz(String name){
		this.setName(name);
	}
	
	
	public void checkAnswer(int i, boolean yourAnswer) {
		if(yourAnswer == this.questions.get(i).getAnswer()) {
			this.yourPoints+=this.questions.get(i).getPoint();
		}else {
			//do nothing
		}
	}
	
	//Prints the questions in the arrayList
	public void printQuestions() {
		for(int i = 0; i < this.questions.size(); i++){
			System.out.println(this.questions.get(i).toString());
		}
	}
	
	//prints the desired question
	public void printQuestion(int i) {
		System.out.println(this.questions.get(i).getQuestion());
	}
	
	//adds only one question
	public void addQuestion(String question, boolean answer, String hint, int point) {
		this.questions.add( new Question(question, answer, hint, point));
		this.totalPoints+=point;
	}
	
	//removes the desire question from a list
	public void removeQuestion(int i){
		
		this.totalPoints-=this.questions.get(i).getPoint();
		this.questions.remove(i);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(ArrayList<Question> questions) {
		this.questions = questions;
	}

	public int getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}

	public int getYourPoints() {
		return yourPoints;
	}

	public void setYourPoints(int yourPoints) {
		this.yourPoints = yourPoints;
	}
	
}
