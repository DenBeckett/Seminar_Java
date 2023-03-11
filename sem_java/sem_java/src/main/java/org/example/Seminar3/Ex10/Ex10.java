package org.example.Seminar3.Ex10;

import java.util.Scanner;
import org.example.Seminar3.Ex10.model.Items;
import java.util.List;
import java.util.ArrayList;

public class Ex10 {
    public static void main(String[] args) {
        Items items = new Items("qwe","zxc",3.0);
        Items items1 = new Items("qwe1","asd",3.0);
        Items items2 = new Items("qwe2","ert",3.0);
        Items items3 = new Items("qwe","dfg",3.0);
    
        List<Items> itemsList= new ArrayList<>();
        itemsList.add(items);
        itemsList.add(items1);
        itemsList.add(items2);
        itemsList.add(items3);
    
        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.nextLine();
        int sumVolume=0;
        List<String> country=new ArrayList<>();
    
        for (int i = 0; i < itemsList.size(); i++) {
            if(itemsList.get(i).getName().equals(searchName)){
                sumVolume+=itemsList.get(i).getVolume();
                country.add(itemsList.get(i).getCountry());
            }
        }
        
        scanner.close();
        System.out.println("sum = "+ sumVolume);
        System.out.println(" country : "+country);
    }
}
