public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------WHILE LOOP----------------------------------------");
        int count =1;
        while(count != 6) {
            System.out.println("Count value is :" + count);
            count ++;
        }

        System.out.println("------------------FOR LOOP------------------------------------------");
//for loop
        for(count=1;count !=6;count++){
            System.out.println("Count value is :" + count);
        }

        System.out.println("-------------------WHILE WITH BOOLEAN--------------------------------");
//while loop with boolean condition
        count =1;
        while(true){
            System.out.println("Count value is " + count);
            count++;
            if(count ==6){
                break;
            }
        }
        System.out.println("---------------------DO WHILE---------------------------------------");

        int counter =1;
        do{
            System.out.println("Count value is " + counter);
            counter ++;
        }
        while(counter!=6);

        System.out.println(isEvenNumber(100));
    }

    public static boolean isEvenNumber(int num){
        if(num % 2 == 0){
            return true;
        }
        return false;
    }
}

