import java.util.Scanner;

public class Login {
    public static void loginUser(){
        System.out.println("Please, enter your username and password: ");
        Scanner scanner = new Scanner(System.in);
        int loop = 0;
        while (loop < 3){
            loop++;
            String username = scanner.nextLine();
            String password = scanner.nextLine();
            if (username.equals("Admin") && password.equals("12345")){
                System.out.println("Successfully login! ");
                MenuResponseModel.getMenuResponseModel();
                Menu.choiceMenu();
                break;
            } else if (loop == 3) {
                System.out.println("You banned! ");
            } else {
                System.out.println("You are enter wrong username and password: ");
            }
        }
        scanner.close();
    }
}
