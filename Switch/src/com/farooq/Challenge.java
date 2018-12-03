package com.farooq;

public class Challenge {
    public static void main(String[] args) {

        char newChar = 'D';

        switch(newChar){
            case 'A':case 'B':case 'C':case 'D':case 'E':
                System.out.println("The char was A,B,C,D or E");
                System.out.println(newChar + " was found !");
                break;
             default:
                 System.out.println("Not Found!");
                 break;
        }

        String month = "JanUaRy";

        switch(month.toLowerCase()){
            case "january":
                System.out.println("Cold!");
                break;
            case "june":
                System.out.println("Hot!");
                break;
             default:
                 System.out.println("Not Sure.");
        }
    }
}
