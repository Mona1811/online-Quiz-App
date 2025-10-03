package QuizApp;

public class QuizApp {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // Adding sample questions
        quiz.addQuestion(new Question(
            "Which language is used for Android development?",
            new String[]{"Python", "Java", "C++", "Ruby"}, 
            2
        ));

        quiz.addQuestion(new Question(
            "What is the capital of India?",
            new String[]{"Mumbai", "New Delhi", "Chennai", "Kolkata"}, 
            2
        ));

        quiz.addQuestion(new Question(
            "Which company developed Java?",
            new String[]{"Google", "Microsoft", "Sun Microsystems", "IBM"}, 
            3
        ));

        quiz.start();
    }
}