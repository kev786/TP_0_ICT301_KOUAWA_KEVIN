package TP_0_ICT301_KOUAWA_KEVIN.SRP.apres_refactoring;

import TP_0_ICT301_KOUAWA_KEVIN.SRP.avant_refactoring.Book;

public class BookBusinessLogic {
    public void emprunter(Book book, String lecteur) {
        System.out.println("Le livre '" + book.getTitle() + "' a été emprunté par : " + lecteur);
    }
}
