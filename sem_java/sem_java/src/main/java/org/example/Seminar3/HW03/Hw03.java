package org.example.Seminar3.HW03;

import org.example.Seminar3.HW03.model.Books;
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.math3.primes.*;

public class Hw03 {
    /**
     * Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц. 
     * Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
     */
    public static void main(String[] args) {
        Books book1 = new Books("fsd","ase",220.0,2009,125);
        Books book2 = new Books("hjg","hfh",64.0,2015,131);
        Books book3 = new Books("wer","dwg",127.0,1999,181);
        Books book4 = new Books("mji","abn",651.0,2020,234);
        Books book5 = new Books("qwe","zxq",328.0,2000,99);
        Books book6 = new Books("dfu","pau",296.0,2017,239);

        List<Books> booksList = new ArrayList<>();
        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);
        booksList.add(book5);
        booksList.add(book6);
        
        for (Books book : booksList) {
            if (Primes.isPrime(book.getPage()) == true && book.getYear() >= 2010 && book.getAutor().contains("a")) {
                System.out.println(book.getName());
            }
        }
    }
}
