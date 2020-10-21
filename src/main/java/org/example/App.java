package org.example;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String translate(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'o' || ch == 'u' || ch == 'å' ||
                    ch == 'e' || ch == 'i' || ch == 'y' || ch == 'ä' || ch == 'ö') {
                sb.append(ch);
            } else {
                sb.append(ch);
                sb.append('o');
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static String translateBack(String s) {
        String translateBack =  "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String o = "o";
            if (("bcdfghjklmnpqrstvwxz".contains("" + s.charAt(i)))){
                translateBack = translateBack.concat("" + s.charAt(i));//Här vill ja göra minus "o" och minus säg självt...
                i += 2;

            }else {
                translateBack = translateBack.concat("" + s.charAt(i));
            }
        }
        return translateBack;
    }
    public static int whatSquare(int totalSum) {
        double sum = 0;
        int quantity = 0;
        while (!(sum >= totalSum)) {
            sum = sum + Math.pow(2, quantity);
            quantity++;
        }
        return quantity;
    }
        public static void removeDuplicates(){
        int n, i, j ,x;
        int[] arr = new int[55];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        n = sc.nextInt();
        System.out.println("Enter the array elements");
        for (i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Original arrays");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("After removing duplicates elements");
        for (i = 0; i < n; i++) {
            for (j = i+1; j < n;) {
                if (arr[i]==arr[j]){
                    for (x = j; x < n; x++) {
                        arr[x]=arr[x+1];
                    }n--;
                }else {
                    j++;
                }
            }
        }
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void fizzBuzz(){
        for (int i = 1; i < 100 ; i++) {
            if ( i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }else if ( i % 3 == 0 ){
                System.out.println("Fizz");
            }else if ( i % 5 == 0 ){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }
    public static void main( String[] args )
    {
        //fizzBuzz();
        //removeDuplicates();
        String translation = translateBack("HoHejoj o popå o dodigog");
        System.out.println(translation);
    }
}
