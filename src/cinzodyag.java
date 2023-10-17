import java.util.Scanner;

public class cinzodyag {
    public static void main(String[] args) {
        int year;
        Scanner input= new Scanner(System.in);

        System.out.print("doğum yılınızı giriniz:");
        year=input.nextInt();

        switch (year/12){

            case 0:
                System.out.print("çin zodyğı burcunuz maymun");
            break;
            case 1:
                System.out.print("çin zodyğı burcunuz horoz");
                break;

            case 2:
                System.out.print("çin zodyğı burcunuz köpek");
                break;
            case 3:
                System.out.print("çin zodyğı burcunuz domuz");
                break;
            case 4:
                System.out.print("çin zodyğı burcunuz fare");
                break;
            case 5:
                System.out.print("çin zodyğı burcunuz öküz");
                break;
            case 6:
                System.out.print("çin zodyğı burcunuz kaplan");
                break;
            case 7:
                System.out.print("çin zodyğı burcunuz tavşan");
                break;
            case 8:
                System.out.print("çin zodyğı burcunuz ejderha");
                break;
            case 9:
                System.out.print("çin zodyğı burcunuz yılan");
                break;
            case 10:
                System.out.print("çin zodyğı burcunuz at");
                break;
            case 11:
                System.out.print("çin zodyğı burcunuz maymun");
                break;
            default:

        }
    }
}
