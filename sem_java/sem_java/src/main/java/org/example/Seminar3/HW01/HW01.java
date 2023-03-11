package org.example.Seminar3.HW01;

import org.example.Seminar3.HW01.model.Items;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class HW01 {
    /**
     * Дан массив записей: наименование товара, цена, сорт.
     * Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
     * 
     */
    public static void main(String[] args) {
        Items items = new Items("abc",1,34.0);
        Items items1 = new Items("cba высший",1,12.0);
        Items items2 = new Items("wer высший",3,122.0);
        Items items3 = new Items("sdf высший",2,234.0);
    
        List<Items> itemsList = new ArrayList<>();
        itemsList.add(items);
        itemsList.add(items1);
        itemsList.add(items2);
        itemsList.add(items3);

        List<Items> itemsSortList = new ArrayList<>();
        
        for (Items item : itemsList) {
            if ((item.getSort() == 1 || item.getSort() == 2) && item.getName().endsWith("высший")) {
                itemsSortList.add(item);
            }
        }

        Items max = Collections.max(itemsSortList,null);
        System.out.println(max.getPrice());
    }
}
