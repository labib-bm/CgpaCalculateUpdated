# CgpaCalculateUpdated

CgpaCalculateUpdated is a Java program that calculates the Cumulative Grade Point Average (CGPA) for a whole semester of a student. It takes into account both Theory and Lab courses, considering their respective mark distributions. This project is an updated version of a previous project.

**Theory Course Mark Distribution**
* Attendance: 7% (Calculation: Number of classes attended / number of classes conducted * 7)
* Quiz: 15% (Average score of 3 quizzes, each worth 15 marks)
* Assignment: 5%
* Presentation: 8%
* Mid-Term: 25%
* Final Exam: 40%

**Lab Course Mark Distribution**
* Attendance: 10% (Calculation: Number of classes attended / number of classes conducted * 10)
* Lab Performance: 25% (Average score of 5 Lab Performance Tasks, each worth 25 marks)
* Lab Project: 25%
* Lab Final Exam: 40%

**Final CGPA Calculation**
The CGPA is calculated using the following formula:
(Summation of all course grade points (Credit * Course Grade)) / Total Credit Hour

**Getting Started**
To use this program:

1. Clone the repository: "git clone https://github.com/labib-bm/CgpaCalculateUpdated.git"
2. Make sure you have Java Development Kit (JDK) installed on your system.
3. Open the project in your preferred Java IDE.
4. Compile and run the "CgpaCalculator" class.
5. Follow the prompts and provide the necessary information, such as the number of Theory and Lab courses, attendance records, quiz scores, etc.
6. The program will calculate the CGPA for the semester based on the provided data and display the result.

**Implementation**
The program is implemented in Java and utilizes various programming concepts and features, including:

* Conditional Statements
* Arrays
* Strings
* Loops
* Methods and Constructors
* Classes
* Error / Exception Handling

**User Interface (UI)**
In the future, if you decide to implement a user interface for this project, you can extend the functionality by creating a graphical interface using Java GUI libraries such as JavaFX, Swing, or Java AWT. By adding a UI layer, you can enhance the user experience and provide a more intuitive way for users to input their course data and view the calculated CGPA.

**Dependencies**
There are no external dependencies required for this project. It is written in pure Java.
