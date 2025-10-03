# online-Quiz-App

🎯 Java Console-Based Quiz Application
📌 Project Overview

The Java Console-Based Quiz Application is a simple yet interactive text-based program that allows users to test their knowledge across different topics using multiple-choice questions (MCQs). The application focuses on console input/output and object-oriented design principles, making it ideal for beginners and intermediate Java learners.

The main goal of this project is to create a fully functional quiz system that:

Presents questions dynamically using a list of Question objects, which makes it easy to add, remove, or modify questions.

Captures user input safely and validates it to check correctness.

Provides instant feedback after each question to enhance learning.

Tracks performance by calculating and displaying the final score.

Displays a detailed review of all attempted questions at the end, showing the user’s answers along with the correct ones, helping the user understand mistakes and improve.

This project also emphasizes:

Clean and modular code: Using separate classes (Question, Quiz, Result) to handle different responsibilities.

Reusability: The design allows easy addition of more questions without changing the core logic.

User interaction and experience: Provides clear instructions, immediate feedback, and motivational messages based on performance.

Overall, this project serves as a hands-on practice for Java programming and console-based application development, while also being a fun way to learn through quizzes.

✨ Features

Displays a list of multiple-choice questions.

Accepts user input (answer choices).

Provides instant feedback (correct/wrong).

Tracks and displays the final score.

Review section at the end: shows all questions, user answers, and correct answers.

Motivational messages based on performance.

📦 Project Structure
QuizApp.java      # Main entry point of the application
Question.java     # Class representing a quiz question
Quiz.java         # Manages the quiz flow and scoring
Result.java       # Displays the final result and review section

🚀 How It Works

The user starts the quiz from the console.

Each question is displayed with four options.

The user enters their answer (1-4).

The app checks if the answer is correct and updates the score.

After all questions:

Final score is displayed.

A review section shows all questions, user answers, and correct answers.

🛠️ Technologies Used

Java (Core Java, OOP)

Scanner class for user input

ArrayList for storing questions

📖 Sample Output
Which language is used for Android development?
1. Python
2. Java
3. C++
4. Ruby
Your answer: 2
✅ Correct!

What is the capital of India?
1. Mumbai
2. New Delhi
3. Chennai
4. Kolkata
Your answer: 1
❌ Wrong! Correct answer: New Delhi

----- Quiz Completed -----
Your Score: 2 / 3
👍 Good Job!

----- Review Section -----
Q: Which language is used for Android development?
Your Answer: Java
Correct Answer: Java
---------------------------
Q: What is the capital of India?
Your Answer: Mumbai
Correct Answer: New Delhi
---------------------------
Q: Which company developed Java?
Your Answer: Sun Microsystems
Correct Answer: Sun Microsystems
---------------------------

🎯 Future Enhancements

Add more question categories (sports, history, coding).

Load questions from a file or database.

Add a timer for each question.

Implement difficulty levels.

🙏 Thank You

Thank you for checking out this project.
