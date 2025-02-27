package tournament.main;

import java.util.Scanner;

/*. View available tournaments ordered by name
1. View players information ordered by ranking and name
2. View teams information ordered by ranking
3. Add a new player to a team
4. Find an exact player by name
5. Find a player
6. Find a team
7. Show all the matches ordered by tournament name
8. Update the result of the matches pending
9. Exit*/
public class Main {
    public static void ShowMenu(){
        System.out.println("1. View available tournaments ordered by name");
        System.out.println("2. View players information ordered by ranking and name");
        System.out.println("3. View teams information ordered by ranking");
        System.out.println("4. Add a new player to a team");
        System.out.println("5. Find an exact player by name");
        System.out.println("6. Find players");
        System.out.println("7. Find teams");
        System.out.println("8. Show all the matches ordered by tournament name");
        System.out.println("9. Update the result of the matches pending");
        System.out.println("10. Exit");
        System.out.print("Select an option: ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int option = 0;

        while(!exit){
            ShowMenu();
            Integer.parseInt(sc.next());

            switch(option){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }
}