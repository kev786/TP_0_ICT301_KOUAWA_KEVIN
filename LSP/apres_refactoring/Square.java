package TP_0_ICT301_KOUAWA_KEVIN.LSP.apres_refactoring;

public class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }

}
