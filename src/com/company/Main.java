package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int oneDigit = 0, twoDigits = 0, threeDigits = 0, moreDigits = 0, digit;
        String endCheck;

        System.out.println("Insert a number: ");
        endCheck = scan.nextLine();

        while(!endCheck.equals("end")) //loop where we count digits until the user types "end"
        {
            digit = Integer.parseInt(endCheck); //we need to make the conversion to string to int

            if(digit != 0)
            {
                if(digit / 10 == 0)
                {
                    oneDigit++;
                }
                else
                {
                    if(digit / 100 == 0)
                    {
                        twoDigits++;
                    }
                    else
                    {
                        if(digit / 1000 == 0)
                        {
                            threeDigits++;
                        }
                        else
                        {
                            moreDigits++;
                        }
                    }
                }
            }

            endCheck = scan.nextLine();
        }

        System.out.println("Numbers with one digit: " + oneDigit +" with two digits: " + twoDigits
                + " with three digits: " + threeDigits + " and more than three digits: " + moreDigits);
    }
}
