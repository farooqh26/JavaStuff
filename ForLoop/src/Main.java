public class Main {
    public static void main(String[] args) {
       // System.out.println("10,000 at 2% interest = " + calculateInterest(10000,2));

        for(int i=2;i<9;i++){
            System.out.println("10,000 at " + i +"% interest = " + String.format("%.2f",calculateInterest(10000,i)));
        }
        System.out.println("-----------------------------------------------------------------------");
        for(int i=8;i>=2;i--){
            System.out.println("10,000 at " + i +"% interest = " + String.format("%.2f",calculateInterest(10000,i)));
        }
        System.out.println("-----------------------------------------------------------------------");

        int count =0;
        for(int j=10;j<=50;j++){
            if(isPrime(j)) {
                count++;
                System.out.println("Prime number is : " + j);
                if(count ==3){
                    System.out.println("Exiting the loop");
                    break;
                }
            }
        }

    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount*(interestRate/100));
    }
//-----------------------------------------------------------------------------------//
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i=2; i <= (long) Math.sqrt(n/2); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

