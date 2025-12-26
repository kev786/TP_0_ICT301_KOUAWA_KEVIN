package TP_0_ICT301_KOUAWA_KEVIN.SRP.apres_refactoring;

public class BookPrinter {
    public void printToScreen(BookSRP book) {
        System.out.println("===Print to Screen=== ");
        System.out.println("Titre: " + book.getTitle());
        System.out.println("Auteur: " + book.getAuthor());
        System.out.println("Contenu: " + book.getContent());
    }

    public void printToHTML(BookSRP book) {
        System.out.println("\n===Print to HTML=== ");
        System.out.println("<h1>" + book.getTitle() + "</h1>");
        System.out.println("<p>" + book.getContent() + "</p>");
    }
}
