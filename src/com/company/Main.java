package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String current_state = "Current State: Introductory Exercises";
        int failure = 0;
        String result;
        while (failure != 5) {
            System.out.println(current_state);
            Scanner in = new Scanner(System.in);

            System.out.print("> ");
            result = in.nextLine();

            if (current_state == "Current State: Introductory Exercises") {
                if (result.equals("Complete")) {
                    current_state = "Current State: Project";
                } else {
                    System.out.println("Error: Invalid transition");
                }
            }
            else if (current_state =="Current State: Project") {
                if (result.equals("Complete")) {
                    current_state = "Current State: Benchmark";
                }
                else {
                    System.out.println("Error: Invalid transition");
                }
            }
            else if ( current_state =="Current State: Benchmark") {
                if (result.equals("Pass")) {
                    current_state = "Current State: Module Complete";
                    System.out.println(current_state);
                    break;
                }


                else if (result.equals("Fail")) {
                    failure ++;

                    if (failure< 3) {
                        current_state = "Current State: Project";
                    }
                    else if (failure ==3) {
                        System.out.println("Current State: Fail");
                        break;
                    }
                }
            }
        }
    }
}
