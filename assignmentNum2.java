import java.util.Scanner;

public class assignmentNum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name="", confirm, region="", sports, listAthlete="", listRegion="";

        for (int c=0; c>=0; c++){
            System.out.print("Do you want to input an athlete data from yout polytechnic (y/n) ? ");
            confirm = sc.nextLine();
            if (confirm.equalsIgnoreCase("y")) {
                System.out.print("Where are your polytechnic from? ");
                region = sc.nextLine();
                listRegion += "\nThere are several athletes from state polytechnic of " + region + " : ";
                System.out.println("Please input your name athletes sequentially (badminton, table tennis, basketball, and volleyball) !");

                for (int a=1; a<=4; a++){
                    System.out.print("What's sport ? ");
                    sports = sc.nextLine();

                    if (sports.equalsIgnoreCase("badminton")||sports.equalsIgnoreCase("table tennis")||
                        sports.equalsIgnoreCase("basketball")||sports.equalsIgnoreCase("volleyball")) {
                            for (int b=1; b<=5; b++){
                                System.out.print("Name of athlete " + sports + " number-" + b + " : ");
                                name = sc.nextLine();

                                listAthlete += "Name of athlete " + sports + " number-" + b + " : " + name + "\n";
                            }
                    } else
                        System.out.println("Please input the name of sport correctly ! (badminton, table tennis, basketball, and volleyball)");

                }
            } else if (confirm.equalsIgnoreCase("n")) {
                break;
            }
            System.out.println(listRegion);
            System.out.println(listAthlete);
        }  
    }
}