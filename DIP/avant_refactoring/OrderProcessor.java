package TP_0_ICT301_KOUAWA_KEVIN.DIP.avant_refactoring;

class MysqlDatabase {
    public void save(String data){
        System.out.println("Saving to MySQL: " + data);
    }
}

public class OrderProcessor {
    private MysqlDatabase database;

    public OrderProcessor() {
        this.database = new MysqlDatabase();
    }

    public void processOrder(String order){
        database.save(order);
    }
}
