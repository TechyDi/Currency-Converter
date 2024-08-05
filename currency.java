import java.util.Scanner;

public class currency{
    public static double All(double value){
            System.out.println("$"+value+" in Rupees is "+(value*83.85));
            System.out.println("$"+value+" in yen is "+(value*143));
            System.out.println("$"+value+" in euro is "+(value*0.91));  
              return 0;
    }
    public static void main(String[] args){
        int currency ;
        System.out.println("Enter Your currency in Dollar:-");
        Scanner sc = new Scanner(System.in);
        currency = sc.nextInt();
        
        All(currency);

        // System.out.println("WELCOME TO THE CURRENCY CONVERTER.");
        // System.out.println("Choose your Currency:-");
        // System.out.println(" 1:DOLLAR\n 2:RUPEES\n 3:YEN\n 4:EURO");
        
        // currency = sc. nextInt();
        
        //                                                                 //DOLLAR
        //                                                                 //  Q in Rupees is A
        //                                                                 // QD in yen is B
        //                                                                 // qd in euro is C
        //                                                                 // meaning= RESULT
        //                                                                 //result
                                                                        

        // switch (currency) {
        //     case 1: 
        //     System.out.println("Enter Your currency in Dollar:-");
        //              float dlr = sc.nextFloat();
        //              System.out.println("$"+dlr+" in Rupees is "+(dlr*83.85));
        //         break;
        //     case 2 :
        //     System.out.println("Enter Your currency in Rupees:- ");   
        //             float rup = sc.nextFloat();
        //             System.out.println("Rs"+rup+" in Dollar is "+Math.round(rup/83.85));
        //         break;
        //     case 3:
        //     System.out.println("Enter Your currency in Yen:-");    
        //             float yen = sc.nextFloat();
        //             System.out.println("¥"+yen+" in DOllar is "+(yen*0.0070));
        //         break;
        //     case 4:
        //         System.out.println("Enter Your currency in Euro:-");
        //         double eu = sc.nextDouble();
        //         System.out.println("€"+eu+"in Dollar is" +(eu*1.09));
        //     break;


        
        //     default:
        //         break;
        // }
    

    }
}
