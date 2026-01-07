import java.util.Scanner;

public class ProjectMortgage {
    void main() {
        Scanner sc = new Scanner(System.in);
        double mortgage;

        IO.print("Principal: ");
        double loand = sc.nextDouble();

        IO.print("Annual Interest Rate: ");
        double interest = sc.nextDouble();

        IO.print("Period (Years): ");
        int period = sc.nextInt();

        mortgage = loand *
                ((interest / 1200) * Math.pow(1 + (interest / 1200), (period * 12))) /
                (Math.pow(1 + (interest / 1200), (period * 12) - 1));

        IO.println("Mortgage: $" + mortgage);



    }
}
