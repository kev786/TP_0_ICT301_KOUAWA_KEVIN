package TP_0_ICT301_KOUAWA_KEVIN.DIP.apres_refactoring;

public interface Database {
    public void save(String data);
}

class MySQLDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("Saving to MySQL: " + data);
    }
}
