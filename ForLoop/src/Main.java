public class Main {
    public static void main(String[] args) {
       // System.out.println("10,000 at 2% interest = " + calculateInterest(10000,2));

        for(int i=2;i<9;i++){
            System.out.println("10,000 at " + i +"% interest = " + String.format("%.2f",calculateInterest(10000,i)));
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount*(interestRate/100));
    }
}
