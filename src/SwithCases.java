import java.util.Scanner;

public class SwithCases {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String result, newInput;
        do {

            System.out.println("Enter total days of a month");
            int month = input.nextInt();
            input.nextLine();
            switch(month) {
                case 30:
                    result = "September, April, June, November";
                    break;
                case 31:
                    result = "January, March, May, July, August, October, December";
                    break;
                case 28:
                    result = "Feburary";
                    break;
                default:
                    result = "Enter correct number of days.";
                    break;
            }
            System.out.println(result);
            System.out.println("Do you want to enter another nubmer? (y/n)  ");
            newInput= input.nextLine();

        }while ( newInput.equalsIgnoreCase("Y") );

        System.out.println("Good Bye!");
    }

}
