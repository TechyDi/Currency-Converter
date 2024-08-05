import java.util.Scanner;

public class currency{
    public static void main(String[] args){
        int currency ;
        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO THE CURRENCY CONVERTER.");
        System.out.println("Choose your Currency:-");
        System.out.println(" 1:DOLLAR\n 2:RUPEES\n 3:YEN\n 4:EURO");
        
        currency = sc. nextInt();
        


        switch (currency) {
            case 1: 
            System.out.println("Enter Your currency in Dollar:-");
                     float dlr = sc.nextFloat();
                     System.out.println("$"+dlr+" in Rupees is "+(dlr*83.85));
                break;
            case 2 :
            System.out.println("Enter Your currency in Rupees:- ");    
        
            default:
                break;
        }
        

        sc.close();

    }
}
