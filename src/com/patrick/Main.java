package com.patrick;
import java.util.*;
public class Main {
//Guess the letter game.

    public static void main(String[] args) throws java.io.IOException{
/*        char ch, answer = 'K';

        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.println("Can you guess the letter?");

        ch = (char) System.in.read();

        if (ch == answer) System.out.println("**RIGHT**");
        else {
            System.out.println("...Sorry, you're wrong...");
            if (ch < answer) System.out.println("too low.");
            else System.out.println("too high.");
        }*/
/*        int x ;

        for (x = 0; x < 6; x++){
            if (x==1)
                System.out.println("x is one");
            else if (x==2)
                System.out.println("x is two");
            else if (x==3)
                System.out.println("x is three");
            else if (x==4)
                System.out.println("x is four");
            else
                System.out.println("x is not between 1 and 4");
        }*/
/*        int i;
        for (i=0; i<10; i++)
            switch (i) {
                case 0:
                    System.out.println("i is zero");
                    break;
                case 1:
                    System.out.println("i is one");
                    break;
                case 2:
                    System.out.println("i is two");
                    break;
                case 3:
                    System.out.println("i is three");
                    break;
                case 4:
                    System.out.println("i is four");
                    break;
                default:
                    System.out.println("i is five or more.");
            }*/
        /*System.out.println("Help on:");
        System.out.println("  1. if");
        System.out.println("  2. switch");
        System.out.println("Choose one: ");

        char choice = (char) System.in.read();

        switch (choice){
            case '1':
                System.out.println("The if: \n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch: \n");
                System.out.println("switch(expression) {");
                System.out.println("  case constant");
                System.out.println("     statement sequence");
                System.out.println("           break");
                System.out.println(":      //....");
                System.out.println("}");
                break;
            default:
                System.out.println("Selection not found.");
        }*/
        /*double num, sroot, rerr;

        for (num = 1; num < 100; num++){
            sroot = Math.sqrt(num);
            System.out.println("Square root of " + num + " is " + sroot);

            // rounding error
            rerr = num - (sroot * sroot);
            System.out.println("Rounding error is " + rerr);
            System.out.println();

        }*/
/*        int x;

        for (x = 100; x > -100; x -= 5)
            System.out.println(x);*/
 /*       int i, j;
        for (i=0, j=10; i < j; i++, j--)// once i and j are equal,
            // the while is satisfied.
            System.out.println("i and j: "+ i + " " + j);*/
/*        int i;
        System.out.println("Press S to stop.");
        for (i = 0; (char) System.in.read() != 'S'; i++)
            System.out.println("Pass # " + i);*/
       /* int i;
        for (i = 0; i < 10;){
            System.out.println("Pass #" + i);
            i++;*/
 /*       int i;
        i = 0;
        for (; i < 10;){
            System.out.println("Pass #" + i);
            i++;
        }*/
 /*       int i;
        int sum = 0;
        for (i = 1; i <= 5; sum += i++);
        System.out.println("Sun is "+ sum);*/

        /*int e;
        int result;
        for (int i = 0; i < 10; i++ ){
            result = 1;
            e = i;
            while (e > 0){
                result *= 2;
                e--;
            }
            System.out.println("2 to the " + i + " power is "+ result);
        }*/
        char ch;
        do {
            System.out.println("Press a key followed by ENTER:");
            ch = (char) System.in.read();
        }   while (ch != 'q') ;


        }}
