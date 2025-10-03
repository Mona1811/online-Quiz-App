package QuizApp;

import java.util.*;

class Question {
    private String questionText;
    private String[] options;
    private int correctAnswerIndex;

    public Question(String questionText, String[] options, int correctAnswerIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public void displayQuestion() {
        System.out.println(questionText);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    public boolean isCorrect(int userAnswer) {
        return userAnswer == correctAnswerIndex;
    }

    public String getCorrectAnswer() {
        return options[correctAnswerIndex - 1];
    }
}

class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
    }

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public void start() {
        try (Scanner sc = new Scanner(System.in)) {
			for (Question q : questions) {
			    q.displayQuestion();
			    System.out.print("Your answer: ");
			    int answer = sc.nextInt();

			    if (q.isCorrect(answer)) {
			        System.out.println("✅ Correct!\n");
			        score++;
			    } else {
			        System.out.println("❌ Wrong! Correct answer: " + q.getCorrectAnswer() + "\n");
			    }
			}
		}

        Result.display(score, questions.size());
    }
}

class Result {
    public static void display(int score, int total) {
        System.out.println("----- Quiz Completed -----");
        System.out.println("Your Score: " + score + " / " + total);

        if (score == total) {
            System.out.println("🎉 Excellent! Perfect Score!");
        } else if (score >= total / 2) {
            System.out.println("👍 Good Job!");
        } else {
            System.out.println("👀 Keep practicing!");
        }
    }
}

