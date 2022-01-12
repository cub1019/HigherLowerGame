package HigherLower;
import java.util.Random;
import java.util.Scanner;
    public class HigherLower {

        public static void main(String[] args) {
            int num1 = (int)(1 + Math.random() * 13);
            int num2 = (int)(2 + Math.random() * 12);
            String guess;

            if (num1 > num2) {
                System.out.println("The number is lower.");
            }
            else if (num1 == num2){
                System.out.println("The numbers are the same");
            }
            else if (num1 < num2) {
                System.out.println("The number is Higher!");
            }
        }
    }
