import java.util.Scanner;

class Exercise1 {
    int max = 100;
    int abc;
}

public class Exercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Exercise1 S1 = new Exercise1();
        System.out.println("Enter Maths Marks:");
        S1.abc = sc.nextInt();

        Exercise1 S2 = new Exercise1();
        System.out.println("Enter Marathi Marks:");
        S2.abc = sc.nextInt();

        Exercise1 S3 = new Exercise1();
        System.out.println("Enter Physics Marks:");
        S3.abc = sc.nextInt();

        Exercise1 S4 = new Exercise1();
        System.out.println("Enter Biology Marks:");
        S4.abc = sc.nextInt();

        Exercise1 S5 = new Exercise1();
        System.out.println("Enter English Marks:");
        S5.abc = sc.nextInt();

        int total = S1.abc + S2.abc + S3.abc + S4.abc + S5.abc;
        int per = (total*100/500);
        System.out.println("Total percentage"+per);

        sc.close();
    }
}