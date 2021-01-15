package com.company.Organized;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Date summer = new Date(103, 5, 21);
        Date today = new Date(203, 6, 22);
        long diff = today.getTime() - summer.getTime();
        System.out.println(diff / 1000 / 60 / 60 / 24);
        System.out.println("=====================");
        System.out.println("    Next  learn  Intersection     ");
        System.out.println("=========================");

        System.out.println("Intersection");
        int[] List1 = {1, 2, 3, 4, 5, 6, 7};
        int[] List2 = {2, 4, 5, 6, 8, 9};

        for (int i = 0; i < List1.length; i++) {
            for (int j = 0; j < List2.length; j++) {
                if (List1[i] == List2[j]) {
                    System.out.println(List1[i]);
                }
            }
        }
    }
}


