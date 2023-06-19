import java.util.Scanner;

public class Menu {
    static Race race = Race.getInstance();
    public static void choiceMenu(){
        Scanner scannerForChoice = new Scanner(System.in);
        int choiceMenu = scannerForChoice.nextInt();
        switch (choiceMenu){
            case 1:
                race.doRegister();
                break;
            case 2:
                race.startRace();
                break;
            case 3:
                Login.loginUser();
                Race.users.clear();
                break;
            case 4:
                break;
        }
    }
}
