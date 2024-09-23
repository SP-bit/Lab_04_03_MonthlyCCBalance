public class Main
{
    public static void main(String[] args)
    {
        int intialBalance = 5000;
        double interestRate = 0.17;
        double interestOne = intialBalance * interestRate;
        double month1 = 5000 + interestOne;
        double interestTwo = month1 * 0.17;
        double month2 = month1 + interestTwo;
        System.out.println("The balance for month 1 is: " + month1);
        System.out.println("The balance for month 2 is: " + month2);
    }
}