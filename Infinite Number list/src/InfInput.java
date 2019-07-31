import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InfInput {

    public static void main(String[] args) {
        List<Integer> inputList= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Which documents would you like to clone from the database today (type done after entered all number):\n");
        while(sc.hasNextInt()){
            inputList.add(sc.nextInt());
        }
        for (int x: inputList
             ) {
            System.out.println(x);
        }
    }
}
