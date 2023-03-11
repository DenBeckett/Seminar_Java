package org.example.Seminar3.HW02.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import java.lang.Comparable;

@Data
@AllArgsConstructor

public class Items implements Comparable<Items> {
    private String name;
    private String country; 
    private Integer sort;
    private Double price;
    private Double weight;

    @Override
    public int compareTo(Items o) {
        if (this.getPrice() < o.getPrice()) {
            return 1;
        }
        else if (this.getPrice() > o.getPrice()) {
            return -1;
        }
        return 0;
    }
}
