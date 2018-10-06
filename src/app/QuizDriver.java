package app;

import java.util.Scanner;

import test.Quiz;


public class QuizDriver {
	
	public static void main(String[] args) {
		
		
		
		Quiz quiz = new Quiz("My Quiz");
		System.out.println("Name: "+ quiz.getName());
		System.out.println();
		
		quiz.addQuestion("Am i 22 years old", true, "I was born on Nov 30 1995", 5);
		quiz.addQuestion("Am i from USA", true, "I was born in HP Mission hospital", 4);
		quiz.addQuestion("Is the sky blue", true, "during the day", 1);
		quiz.addQuestion("Are you a human?", true, "are you perfect?", 4);
		quiz.addQuestion("Albert Einstien is mexican?", false, "Re-Read his name", 4);
		
		runTest(quiz);
		
		System.out.print("Your Score: "+quiz.getYourPoints()+"/" +quiz.getTotalPoints()
						+" = " + (double)quiz.getYourPoints()/quiz.getTotalPoints());
		
		
	}

	private static void runTest(Quiz quiz) {
		boolean running = true;
		int totQuest = 0;
		Scanner input = new Scanner(System.in);
		
		while(running) {
			
			quiz.printQuestion(totQuest);
			String yourAnswer = input.next();
			
			if(yourAnswer.equals("h") || yourAnswer.equals("hint"))
				System.out.println("Hint: "+ quiz.getQuestions().get(totQuest).getHint());
			
			
			if(yourAnswer.equals("true") || yourAnswer.equals("false")) {
				quiz.checkAnswer(totQuest, Boolean.parseBoolean(yourAnswer));
				System.out.println("Points: "+quiz.getYourPoints());
				totQuest++;
			}
				
			if(totQuest > quiz.getQuestions().size() - 1)
				running = false;
		}
		
	}


	
	
	
}

//these are tests!!!!!!
//System.out.println("Points: " + quiz.getYourPoints() );
//quiz.checkAnswer(0, true);
//System.out.println("Points: " + quiz.getYourPoints() );
//
//quiz.checkAnswer(1, true);
//System.out.println("Points: " + quiz.getYourPoints() );

//System.out.println("Total Points: "+ quiz.getTotalPoints());
//quiz.removeQuestion(0);
//System.out.println("Total Points: "+ quiz.getTotalPoints());


//
//System.out.println("This the list of questions in the Quiz");
//quiz.printQuestions();
//System.out.println();
//
//System.out.println("This is question 1: ");
//quiz.printQuestion(0);

//boolean running = true;