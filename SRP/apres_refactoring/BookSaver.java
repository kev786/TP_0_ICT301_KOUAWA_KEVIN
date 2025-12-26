package TP_0_ICT301_KOUAWA_KEVIN.SRP.apres_refactoring;

public class BookSaver {
    public void saveToDatabase(BookSRP book) {
        System.out.println("Sauvegarde du livre '" + book.getTitle() + "' en base de données...");
    }

    public void saveToFile(BookSRP book, String filename) {
        System.out.println("Sauvegarde de '" + book.getTitle() + "' dans le fichier " + filename);
    }
}
