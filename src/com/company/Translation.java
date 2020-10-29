package com.company;

public class Translation {
    public void translate(String word){
        switch(word){
            case "book":
                System.out.println("წიგნი");
                break;
            case "pen":
                System.out.println("კალამი");
                break;
            case "notebook":
                System.out.println("რვეული");
                break;
            case "paper":
                System.out.println("ქაღალდი");
                break;
                default:
                    System.out.println("არ მოიძებნა სიტყვა :(");

        }
    }
}
