package Task_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program {
    public static void nameProgram(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter as many names as you want. \nEnter 'close' when you wish to quit: ");
        String inputAnswer = "";

        ArrayList<String> nameArray = new ArrayList<>();

        double nameLength;
        double averageLength;
        double sum = 0;

        // Allows a user to add names and exit
        do {
            inputAnswer = in.nextLine();
            nameLength = inputAnswer.length();

            // Does not permit less than two characters
            if(nameLength < 2){
                System.out.println("You can't enter a name that has less than two characters");
                do {
                    inputAnswer = inputAnswer;
                    break;
                } while (nameLength < 2);
            }

            if(!inputAnswer.contains("close") && !inputAnswer.contains("Close") && inputAnswer.length() > 1){
                nameArray.add(inputAnswer);
                sum += nameLength;
            }
        } while(!inputAnswer.contains("close") && !inputAnswer.contains("Close"));

        // Sorts list alphabetically
        Collections.sort(nameArray);

        // nameArray output
        for(String n:nameArray){
            System.out.println(n);
        }

        // Average length of entered names
        averageLength = sum/nameArray.size();
        System.out.println("Average length of the names entered: " + averageLength);

        // Longest name(after arrangement)
        int index = 0;
        int alt = nameArray.get(0).length();
        for (int i = 0; i < nameArray.size(); i++){
            if(nameArray.get(i).length() > alt){
                alt = nameArray.get(i).length();
                index = i;
            }
        }
        System.out.println("Name at index " + index + " '"+ nameArray.get(index) + "' " + "and it is the largest name with a size of " + alt + " characters.");
    }
}
