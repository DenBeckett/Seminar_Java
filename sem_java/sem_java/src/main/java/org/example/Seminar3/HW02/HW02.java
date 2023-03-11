package org.example.Seminar3.HW02;

import org.example.Seminar3.HW02.model.Items;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class HW02 {
    /**
     * Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта. 
     * Получить наименования товаров заданного сорта с наименьшей ценой.
     */
    public static void main(String[] args) {
        Items items = new Items("vbn","abc",1,32.0,9.0);
        Items items2 = new Items("trf","cba",1,123.0,11.0);
        Items items3 = new Items("mjk","abc",2,145.0,3.0);
        Items items4 = new Items("uiu","cba",2,278.0,4.0);
        Items items5 = new Items("zsr","abc",3,11.0,17.0);
        Items items6 = new Items("qmh","cba",3,67.0,89.0);

        List<Items> itemsList = new ArrayList<>();
        itemsList.add(items);
        itemsList.add(items2);
        itemsList.add(items3);
        itemsList.add(items4);
        itemsList.add(items5);
        itemsList.add(items6);

        Scanner scanner = new Scanner(System.in);
        int sort = scanner.nextInt();
        scanner.close();
        List<Items> itemsSortList = new ArrayList<>();
        
        for (Items item : itemsList) {
            if (item.getSort() == sort) {
                itemsSortList.add(item);
            }
        }

        Items min = Collections.min(itemsSortList,null);

        for (Items item : itemsList) {
            if (item.getPrice() == min.getPrice()) {
            System.out.println(item.getName());
            }
        }
    }
}
