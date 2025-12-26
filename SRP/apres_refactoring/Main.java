package TP_0_ICT301_KOUAWA_KEVIN.SRP.apres_refactoring;

public class Main {
    public static void main(String[] args) {
        // 1. Création de l'objet de données (Responsabilité : Données)
        BookSRP book = new BookSRP("Les principes SOLID", "Etudiants de M1-GL", "Révision des principes SOLID");

        // 2. Utilisation du service d'affichage (Responsabilité : Présentation)
        BookPrinter printer = new BookPrinter();
        printer.printToScreen(book);

        // 3. Utilisation du service de sauvegarde (Responsabilité : Persistance)
        BookSaver saver = new BookSaver();
        saver.saveToDatabase(book);

        // 4. Utilisation de la logique métier (Responsabilité : Métier)
        BookBusinessLogic logic = new BookBusinessLogic();
        logic.emprunter(book, "Marcial");
    }
}
