package com.example.console.exam;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Exam exam = new Exam();
		
		exam.questions[0] = new Question("001", "What is 2+1","4","5","3","6",3);
		exam.questions[1] = new Question("002", "What is national animal of India","Tiger","Lion","Elephant","Bear",1);
		exam.questions[2] = new Question("003", "What is apple","Vegetable","Fruit","Flower","Color",2);
		exam.questions[3] = new Question("004", "What is capital of India","Mumbai","Patna","Lucknow","Delhi",4);
		exam.questions[4] = new Question("005", "What is 4 * (7-8)","-4","1","4","3",1);
		exam.questions[5] = new Question("006", "What is color of Moon","Black","Red","White","Blue",3);
		exam.questions[6] = new Question("007", "What is Java","Script","Prgramming Language","DB","UI",2);
		exam.questions[7] = new Question("008", "What is capital of Maharashtra","Patna","Pune","Kolkata","Mumbai",4);
		exam.questions[8] = new Question("009", "What is 7*9","63","22","34","66",1);
		exam.questions[9] = new Question("010", "What is ++ in Java","Decrement operator","Addition Operator","Divide Operator","Increment Operator",4);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to Exam.Are you Ready(y-start,n-stop)");
		String start = scanner.next();
		
		if ("y".equals(start)) {
			int i = 0;
			int j=0;
			do {
				if (i == j) {
					System.out.println(exam.questions[i].question);
					System.out.println("1. "+exam.questions[i].option1 + "\t2. "+exam.questions[i].option2);
					System.out.println("3. "+exam.questions[i].option3 + "\t4. "+exam.questions[i].option4);
				}
				int rightAnswer = Integer.parseInt(scanner.next());
				if ( rightAnswer != exam.questions[i].rightOption) {
					System.out.println("Wrong answer. Do you want to try again? (y/n)");
					String input = scanner.next();
					if (!input.equals("y")) {
						i++;
						j = i;
					} else {
						j++;
					}
				} else {
					i++;
					j = i;
				}
			} while (i < exam.questions.length);
			System.out.println("Thank you!");
		} else {
			System.out.println("Thank you!");
		}
	}

}
