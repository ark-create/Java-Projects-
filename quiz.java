import java.util.Scanner;

public class quiz {

    public static void main(String[] args) {

        String[] que = {
            "Which planet is known as the Red Planet?",
            "Who wrote the famous play Romeo and Juliet?",
            "What is the largest mammal in the world?",
            "How many continents are there on Earth?",
            "Which gas do plants absorb from the atmosphere?"
        };

        String[][] opt = {
            {"1:- Jupiter", "2:- Venus", "3:- Mars"},
            {"1:- Charles Dickens", "2:- William Shakespeare", "3:- Mark Twain"},
            {"1:- African Elephant", "2:- Giraffe", "3:- Blue Whale"},
            {"1:- 5", "2:- 6", "3:- 7"},
            {"1:- Oxygen", "2:- Nitrogen", "3:- Carbon Dioxide"}
        };

        int[] answers = {3, 2, 3, 3, 3};
        int score = 0;
        int guess;

        Scanner sc = new Scanner(System.in);

        System.out.println("************************");
        System.out.println("Welcome to the Quiz Game");
        System.out.println("************************");

        for (int i = 0; i < que.length; i++) {

            System.out.println(que[i]);

            // print all the options
            for (String o : opt[i]) {
                System.out.println(o);
            }
            System.out.print("Enter Your Answer");
           guess = sc.nextInt();

           if(guess == answers[i]){
            System.out.println("Correct");
            score++;
           }
else{
    System.out.println("Wrong");
        }
        }

        System.out.println("Your Final Score Is:-" + score + "out of" + que.length);
        sc.close();
    }
}
