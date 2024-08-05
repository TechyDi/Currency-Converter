import java.util.Scanner;

public class currency{
//     public static double All(double value){
//             System.out.println("$"+value+" in Rupees is "+(value*83.85));
//             System.out.println("$"+value+" in yen is "+(value*143));
//             System.out.println("$"+value+" in euro is "+(value*0.91));  
//               return 0;
//     }
            
        public static void cal(double dlr){
        
            System.out.println("$"+dlr+" is in Rupees is "+(dlr*84.02));
            System.out.println("$"+dlr+" is in Yen is "+(dlr*143.75));
            System.out.println("$"+dlr+" is in Euro is "+(dlr*0.91));
         }

         public static void cal1(double rup){
        
            System.out.println("RS"+rup+" is in Dollar is "+(rup*0.012));
            System.out.println("RS"+rup+" is in Yen is "+(rup*1.71));
            System.out.println("RS"+rup+" is in Euro is "+(rup*0.011));
         }

         public static void cal2(double yen){
        
            System.out.println("¥"+yen+" is in Dollar is "+(yen*0.007));
            System.out.println("¥"+yen+" is in Rupees is "+(yen*0.58));
            System.out.println("¥"+yen+" is in Euro is "+(yen*0.0063));
         }

         public static void cal3(double eur){
        
            System.out.println("€"+eur+" is in Dollar is "+(eur*1.10));
            System.out.println("€"+eur+" is in Rupees is "+(eur*92.06));
            System.out.println("€"+eur+" is in Yen is "+(eur*157.58));
         }

    public static void main(String[] args){
        double currency;
//         System.out.println("Enter Your currency in Dollar:-");
//         Scanner sc = new Scanner(System.in);
//         currency = sc.nextInt();
        
//         All(currency);

//         // System.out.println("WELCOME TO THE CURRENCY CONVERTER.");
//         // System.out.println("Choose your Currency:-");
        // System.out.println(" 1:DOLLAR\n 2:RUPEES\n 3:YEN\n 4:EURO");
        
//         // currency = sc. nextInt();
        
//         //                                                                 //DOLLAR
//         //                                                                 //  Q in Rupees is A
//         //                                                                 // QD in yen is B
//         //                                                                 // qd in euro is C
//         //                                                                 // meaning= RESULT
//         //                                                                 //result
                                                                        

//         // switch (currency) {
//         //     case 1: 
//         //     System.out.println("Enter Your currency in Dollar:-");
//         //              float dlr = sc.nextFloat();
//         //              System.out.println("$"+dlr+" in Rupees is "+(dlr*83.85));
//         //         break;
//         //     case 2 :
//         //     System.out.println("Enter Your currency in Rupees:- ");   
//         //             float rup = sc.nextFloat();
//         //             System.out.println("Rs"+rup+" in Dollar is "+Math.round(rup/83.85));
//         //         break;
//         //     case 3:
//         //     System.out.println("Enter Your currency in Yen:-");    
//         //             float yen = sc.nextFloat();
//         //             System.out.println("¥"+yen+" in DOllar is "+(yen*0.0070));
//         //         break;
//         //     case 4:
//         //         System.out.println("Enter Your currency in Euro:-");
//         //         double eu = sc.nextDouble();
//         //         System.out.println("€"+eu+"in Dollar is" +(eu*1.09));
//         //     break;


        
//         //     default:
//         //         break;
//         // }
    

//     }
// }
                                                                            // 1-Rupees
                                                                            // 2-Dollar
                                                                            // 3-Yen
                                                                            // 4- Euro
System.out.println("WELCOME TO CURRENCY CONVERTER");
System.out.println("Choose your currency:- ");
System.out.println(" 1:DOLLAR\n 2:RUPEES\n 3:YEN\n 4:EURO");
        Scanner sc = new Scanner(System.in);
        currency = sc.nextInt();

    if (currency==1)
                {
            System.out.println("Enter your currency in Dollar");
                    double dlr = sc.nextDouble();
                        cal(dlr); 
                }        

    else if(currency==2)    
                {  
            System.out.println("Enter your currency in Rupees");
                    double rup = sc.nextDouble();
                        cal1(rup);               
                }     

    else if(currency==3)
                {
                System.out.println("Enter your currency in Yen");
                    double yen = sc.nextDouble();
                        cal2(yen); 
                }
    else if(currency==4)
                {
                System.out.println("Enter your currency in Euro");
                    double eur = sc.nextDouble();
                        cal(eur); 
                }
            sc.close();



    }
}