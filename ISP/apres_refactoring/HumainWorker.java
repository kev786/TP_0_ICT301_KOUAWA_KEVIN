package TP_0_ICT301_KOUAWA_KEVIN.ISP.apres_refactoring;

public class HumainWorker implements Eatable {

    @Override
    public void work() {
        System.out.println("Les humains travaillent");
    }

    @Override
    public void eat() {
        System.out.println("Les humains mangent");
    }
}

class RobotWorker implements Workable {
    
    @Override
    public void work() {
        System.out.println("Les robots travaillent sans fatigue");
    }
    
}