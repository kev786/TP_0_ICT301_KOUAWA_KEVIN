package TP_0_ICT301_KOUAWA_KEVIN.SRP.apres_refactoring;

import TP_0_ICT301_KOUAWA_KEVIN.SRP.avant_refactoring.Book;

public class BookPrinter {
    public void printToScreen(Book book) {
        System.out.println("Titre: " + book.getTitle());
        System.out.println("Auteur: " + book.getAuthor());
        System.out.println("Contenu: " + book.getContent());
    }

    public void printToHTML(Book book) {
        System.out.println("<h1>" + book.getTitle() + "</h1>");
        System.out.println("<p>" + book.getContent() + "</p>");
    }
}
