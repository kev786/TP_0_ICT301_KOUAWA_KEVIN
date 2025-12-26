package TP_0_ICT301_KOUAWA_KEVIN.SRP.apres_refactoring;

public class BookBusinessLogic {
    public void emprunter(BookSRP book, String lecteur) {
        System.out.println("Le livre '" + book.getTitle() + "' a été emprunté par : " + lecteur);
    }
}
