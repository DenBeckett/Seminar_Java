package org.example.Seminar3.Ex12;

import org.example.Seminar3.Ex12.Model.Coub;
import java.util.List;
import java.util.ArrayList;

public class Ex12 {
    public static void main(String[] args) {
        Coub coub1 = new Coub("зеленый", 13, "деревянный");
        Coub coub2 = new Coub("желтый", 73, "металлический");
        Coub coub3 = new Coub("красный", 23, "картонный");
        Coub coub4 = new Coub("желтый", 3, "металлический");

        List<Coub> listCoub = new ArrayList<>();
        listCoub.add(coub1);
        listCoub.add(coub2);
        listCoub.add(coub3);
        listCoub.add(coub4);
        int countCoub = 0;
        int sumVolume = 0;
        int countWood = 0;
        for (Coub coub : listCoub) {
            if (coub.getColor().equals("желтый")) {
                countCoub++;
                sumVolume += volumeCoub(coub.getSize());
            }
            if (coub.getMaterial().equals("деревянный") && coub.getSize() == 3) {
                countWood++;
            }
        }
        System.out.println(countCoub);
        System.out.println(sumVolume);
        System.out.println(countWood);
    }

    private static int volumeCoub(Integer size) {
        return size * size * size;
    }
}
