public class TutionFee
{

        public static void main(String[] args)
        {
            
            double fee=122600;
            double doublefee=fee*2;
             
             int y=0;

           while(fee<doublefee)
            {
                fee= fee +(fee * 0.065);
                y++;
            }
            System.out.println("Tution fee will  be double in\t"+y+"\tyears");
         }
}
