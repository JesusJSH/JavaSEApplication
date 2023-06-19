import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Race {
    private static final Race race = new Race();

    public static Race getInstance() {
        return race;
    }

    public static List<String> users = new ArrayList<>();

    public void doRegister() {
        Scanner scannerForParticipant = new Scanner(System.in);
        System.out.println("how many participants will participate in the competition? ");
        int enterParticipant = scannerForParticipant.nextInt();

        for (int i = 0; i < enterParticipant; i++) {
            Scanner scannerForAddUser = new Scanner(System.in);
            System.out.println("Please, enter you participants: ");
            String user = scannerForAddUser.nextLine();
            users.add(user);
        }
        System.out.println("These will participate in the competition " + users);
        MenuResponseModel.getMenuResponseModel();
        Menu.choiceMenu();
    }

    public void startRace() {
        System.out.println("Who do you think won? ");
        Scanner scannerForWin = new Scanner(System.in);
        int choiceWin = scannerForWin.nextInt();
        int choiceComputer = (int) (Math.random() * users.size() + 1);
        if (choiceWin == choiceComputer) {
            System.out.println("Congratulations you won!");
        } else {
            System.out.println("You failed!");
        }
    }
}
