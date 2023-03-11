package org.example.Seminar3.HW03.model;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor

public class Books {
    private String name;
    private String autor;
    private Double price;
    private Integer year;
    private Integer page;
}
