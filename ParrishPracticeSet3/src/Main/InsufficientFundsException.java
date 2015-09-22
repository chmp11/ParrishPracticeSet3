package Main;

public class InsufficientFundsException extends Exception{
   private double amount;
   //Create an instance of the InsufficientFundsException class, to be thrown to the caller
   //From Week 3 Package 4
   public InsufficientFundsException(double amount)
   {
      this.amount = amount;
   } 
   public double getAmount()
   {
      return amount;
   }
}
