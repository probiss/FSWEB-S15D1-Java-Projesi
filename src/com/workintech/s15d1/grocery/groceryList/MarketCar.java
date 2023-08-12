package com.workintech.s15d1.grocery.groceryList;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MarketCar {
    private static String getInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void addItems(List<String> groceryList) {
        System.out.println("Eklenmesini istediğiniz alemanları giriniz: ");
        String input = getInput();

        if(input.contains(",")){
            String[] elements = input.split(",");
            for(String element: elements) {
                if(element != null && !element.trim().isEmpty()) {
                   if(!checkItemInList(groceryList, element)){
                        groceryList.add(element.trim());
                   }
                }
            }
        } else {
            if( input != null && !input.isEmpty()) {
                groceryList.add(input);
            }
        }

        printSorted(groceryList);
    }

    public static void removeItems(List<String> groceryList) {
        System.out.println("Silinmesini istediğiniz alemanları giriniz: ");
        String input = getInput();

        if(input.contains(",")){
            String[] elements = input.split(",");
            for(String element: elements) {
                if(element != null && !element.trim().isEmpty()) {
                    if(checkItemInList(groceryList, element)){
                        groceryList.remove(element.trim());
                    }
                }
            }
        } else {
            if( input != null && !input.isEmpty()) {
                groceryList.remove(input);
            }
        }

        printSorted(groceryList);
    }

    public static boolean checkItemInList(List<String> products, String product) {
        return products.contains(product.trim());
    }

    public static void printSorted(List<String> products) {
        Collections.sort(products);
        System.out.println(products);
        for(String product: products) {
            System.out.println(product);
        }
    }
}
