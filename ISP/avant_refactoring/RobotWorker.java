package TP_0_ICT301_KOUAWA_KEVIN.ISP.avant_refactoring;

public class RobotWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Les Robots travaillent sans fatigue");
    }

    @Override
    public void eat() {
        System.out.println("l'on ne doit faire manger un robot");
        throw new UnsupportedOperationException("Les robots ne mangent pas");
    }
    
}
