import java.util.Scanner;
public class QuestionService {
 Question[] questions = new Question[5];
 Scanner sc = new Scanner(System.in);
  public QuestionService() {
    questions[0] = new Question(1, "What is the capital of France?", "Berlin", "Madrid", "Paris", "Rome", "Paris");
    questions[1] = new Question(2, "What is the largest desert in the world?", "Sahara", "Gobi", "Kalahari", "Atacama", "Sahara");
    questions[2] = new Question(3, "What is the largest planet in our solar system?", "Earth", "Mars", "Jupiter", "Saturn", "Jupiter");
    questions[3] = new Question(4, "What is the chemical symbol for water?", "H2O", "CO2", "NaCl", "O2", "H2O");
    questions[4] = new Question(5, "Who wrote 'Romeo and Juliet'?", "Charles Dickens", "William Shakespeare", "Mark Twain", "Jane Austen", "William Shakespeare");
  }
  public void playQuiz() {
     int count = 0;
    for (Question question : questions) {
      System.out.println("Question ID: " + question.getId());
      System.out.println("Question: " + question.getQuestion());
      System.out.println("Options:");
      System.out.println("1. " + question.getOpt1());
      System.out.println("2. " + question.getOpt2());
      System.out.println("3. " + question.getOpt3());
      System.out.println("4. " + question.getOpt4());
      System.out.println();
        System.out.print("Enter your answer: ");
        String userAnswer = sc.nextLine();
        if (userAnswer.equalsIgnoreCase(question.getAnswer())) {
          System.out.println("Correct answer!");
          count++;
        } else {
          System.out.println("Incorrect answer. The correct answer is: " + question.getAnswer());
        }
        System.out.println();
      
    }
    System.out.println("Quiz completed! Your score is: " + count + "/5");
  } 
  
   
}
