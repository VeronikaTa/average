package com.epam.rd.autotasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use Scanner methods to read input
        boolean nextInt = true;
        int sum = 0;

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while(nextInt){
            int number;
            number = scanner.nextInt();
            if(number != 0){
                numbers.add(number);
            }
            else{
                nextInt = false;
            }
        }


        for(Integer item : numbers){

            sum += item;
        }
        int average;
        average = sum / numbers.size();

        System.out.println(average);
    }

}