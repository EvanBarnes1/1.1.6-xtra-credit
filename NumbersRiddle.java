/*
 * Activity 1.1.6
 Choose any integer, double it, add six, divide it in half, and subtract the number you started with. The answer is always three!
 */
public class NumbersRiddle
{
  public static void main(String[] args)
  {
   int yournumber = 10;
   System.out.println("Your number is: " + yournumber);
   int yndoubled = yournumber * 2;
   // yndoubled means your number doubled
   System.out.println("Your number doubled is: " + yndoubled);
   int yndas = yndoubled + 6;
   // yndas stands for your number doubled and add six
   System.out.println("Your number after doubling it and adding 6 is: " + yndas);
   int dividebytwo = yndas / 2;
   System.out.println("Divide it in half and you get: " + dividebytwo);
   int stnysw = dividebytwo - yournumber;
   // stnysw means subtract the number you started with
   System.out.println("Subtract it by your number and you will always get " + stnysw);

    
    
    
    
    
  }
}
