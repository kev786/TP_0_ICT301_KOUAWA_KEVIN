package TP_0_ICT301_KOUAWA_KEVIN.LSP.apres_refactoring;

public class Mainlsp2 {
    public static void main(String[] args) {
        Shape square = new Square(3);
        Shape rectangle = new Rectangle(3, 4);

        System.out.println("Area of Square: " + square.getArea());
        System.out.println("Area of Rectangle: " + rectangle.getArea());
    }

}
