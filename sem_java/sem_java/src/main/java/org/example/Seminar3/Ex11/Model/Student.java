package org.example.Seminar3.Ex11.Model;

import lombok.Data;
import lombok.AllArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor

public class Student {
    private String surname;
    private int groupNumber;
    private double money;
    private List<Integer> evaluations;
}
