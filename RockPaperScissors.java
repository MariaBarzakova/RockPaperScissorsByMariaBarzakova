package projects;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println("Do you have a dispute with your friend?");
        System.out.println("So play a 17th century old chinese game.");
        System.out.println("Please enter [p]aper, [r]ock or [s]cissors.");
        System.out.println("The one of the players win if gets 3 results \"You Win\".");
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        int countWin1 = 0;
        int countWin2 = 0;

        while (true) {
            System.out.print("First player: ");
            String input1 = scanner.nextLine();
            System.out.print("Second player: ");
            String input2 = scanner.nextLine();
            if (("paper".equals(input1) && ("paper".equals(input2)))|| ("rock".equals(input1) && ("rock".equals(input2))) || ("scissors".equals(input1)) && ("scissors".equals(input2))) {
                System.out.println("Both players chose the same shape, so the game is tied.");
            } else if (("p".equals(input1) && ("p".equals(input2)))|| ("r".equals(input1) && ("r".equals(input2))) || ("s".equals(input1)) && ("s".equals(input2))) {
                System.out.println("Both players chose the same shape, so the game is tied.");
            } else if (("scissors".equals(input1) && ("paper".equals(input2))) || ("s".equals(input1) && ("p".equals(input2)))) {
                countWin1++;
                System.out.println("The scissors win. The Scissors beat paper. The First player win.");
            } else if(("scissors".equals(input1) && ("rock".equals(input2))) || ("s".equals(input1) && ("r".equals(input2)))) {
                countWin2++;
                System.out.println("The rock win. The rock beat scissors. The Second player win.");
            } else if(("paper".equals(input1) && ("rock".equals(input2))) || ("p".equals(input1) && ("r".equals(input2)))) {
                countWin1++;
                System.out.println("The paper win. The paper beat rock. The First player win.");
            } else if(("scissors".equals(input2) && ("paper".equals(input1))) || ("s".equals(input2) && ("p".equals(input1)))) {
                countWin2++;
                System.out.println("The scissors win. The Scissors beat paper. The Second player win.");
            } else if(("scissors".equals(input2) && ("rock".equals(input1))) || ("s".equals(input2) && ("r".equals(input1)))) {
                countWin1++;
                System.out.println("The rock win. The rock beat scissors. The First player win.");
            } else if(("paper".equals(input2) && ("rock".equals(input1))) || ("p".equals(input2) && ("r".equals(input1)))){
                countWin2++;
                System.out.println("The paper win. The paper beat rock. The Second player win.");
            } else{
                System.out.println("Please enter [p]aper, [r]ock or [s]cissors.");
            }
            if (countWin1 == 3  ) {
                break;
            } else if(countWin2 == 3) {
                break;
            }else{
                System.out.println("Please enter your next choice.");
                System.out.println();
            }
        }
        if( countWin1 == 3) {
            System.out.printf("%nYou Win! The First player Won %d times. The game is over.", countWin1);
        }else {
            System.out.printf("%nYou Win! The Second player Won %d times The game is over.", countWin2);
        }
    }
}
