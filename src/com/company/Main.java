package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Translation translation = new Translation();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter Word : ");
            String word = scanner.nextLine();
            translation.translate(word);
        }
    }
}
