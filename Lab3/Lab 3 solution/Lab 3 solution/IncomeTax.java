import java.util.Scanner;


class IncomeTax
  {
    
     public static void main (String[] args)
   
     {

        int age;
     
        double income;

        double tax;



        Scanner scanner=new Scanner(System.in);
 
        System.out.println("Enter Age");

        age=scanner.nextInt();

        System.out.println("Enter Income");
    
        income=scanner.nextDouble();


        if(age < 60)

        {

            if (income<=250000)
          
             {
      
              tax= income * 0/100;
  
              System.out.println("Tax % is 0.");

              System.out.println("Tax is: "+tax);

            }
 
           else if (income>=250001 && income <= 500000)
     
                {

                tax= income * 10/100;

                System.out.println("Tax % is 10.");
 
               System.out.println("Tax is: "+tax);

                }
           
         else if (income >= 500001 && income <= 1000000)
    
           {
             
             tax= income * 20/100;
      
              System.out.println("Tax % is 20");
    
              System.out.println("Tax is: "+tax);
   
              } 
        
         else if  (income >= 1000001)
      
             {  
          
             tax= income * 30/100;
         
             System.out.println("Tax % is 30");
        
             System.out.println("Tax is: "+tax);
          
             }
  
      }  
        
     if (age >= 60 && age <=80) 
     {
  
            if (income <= 300000)
              {

                tax= income * 0/100;

                System.out.println("Tax % is 0");
      
                System.out.println("Tax is: "+tax);
         
              }
            else if (income >= 300001 && income < 500000)
             {
 
                tax= income * 10/100;
              
                 System.out.println("Tax % is 10");
             
                System.out.println("Tax is: "+tax);
            
             }
             else if (income >= 500001 && income <= 1000000)
         
             { 
        
                tax= income * 20/100;
       
                System.out.println("Tax % is 20");
      
                System.out.println("Tax is: "+tax);
       
            }  
           else if (income >= 1000001)
     
            { 
               
                tax= income * 30/100;
       
                System.out.println("Tax % is 30");
  
               System.out.println("Tax is: "+tax);
  
            } 
    
        }

        if (age > 80)

        {

            if (income<= 500000)

            {

                tax= income * 0/100;
      
                System.out.println("Tax % is 0");

                System.out.println("Tax is: "+tax);
    
            }
          
            else if (income>=500001 && income<=1000000)
 
           {
         
               tax= income * 20/100;
         
               System.out.println("Tax % is 20");
           
               System.out.println("Tax is: "+tax);
      
            }
       
           else if (income>=1000001)
     
           {
              
              tax= income * 30/100;
           
              System.out.println("Tax % is 30");
        
              System.out.println("Tax is: "+tax);

            
           }

       }


    }

}
