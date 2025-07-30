import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String firstName;
        String lastName;
        String gender;
        int birthday;
        String city;
        String infoConfirm;

        System.out.println("Welcome to the Basic Name Manager! To proceed enter your information first.");

        System.out.print("Enter your First Name: ");
        firstName = input.next();

        System.out.print("Enter your Last Name: ");
        lastName = input.next();

        System.out.print("Enter your Birth Year (e.g., 1999): ");
        birthday = input.nextInt();

        do {
            System.out.println("What’s your Gender?");
            System.out.print("Enter M for Male or F for Female: ");
            gender = input.next();
        } while (!gender.equalsIgnoreCase("M") && !gender.equalsIgnoreCase("F"));

        System.out.print("Enter your City: ");
        city = input.next();

        do {
            System.out.print("Would you like to check your Information? (Y/N): ");
            infoConfirm = input.next();
        } while (!infoConfirm.equalsIgnoreCase("Y") && !infoConfirm.equalsIgnoreCase("N"));

        if (infoConfirm.equalsIgnoreCase("Y")) {
            System.out.println("\n--- Your Information ---");
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Birth Year: " + birthday);
            System.out.println("Gender: " + gender);
            System.out.println("City: " + city);
            System.out.println("------------------------");
        } else {
            System.out.println("Okay, your information will not be shown.");
        }

        System.out.println("Thanks for using the Basic Name Manager. Goodbye!");
        input.close();
    }
}
