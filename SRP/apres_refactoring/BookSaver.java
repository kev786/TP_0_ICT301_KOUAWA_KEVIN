package TP_0_ICT301_KOUAWA_KEVIN.SRP.apres_refactoring;

import TP_0_ICT301_KOUAWA_KEVIN.SRP.avant_refactoring.Book;

public class BookSaver {
    public void saveToDatabase(Book book) {
        System.out.println("Sauvegarde du livre '" + book.getTitle() + "' en base de données...");
    }

    public void saveToFile(Book book, String filename) {
        System.out.println("Sauvegarde de '" + book.getTitle() + "' dans le fichier " + filename);
    }
}
