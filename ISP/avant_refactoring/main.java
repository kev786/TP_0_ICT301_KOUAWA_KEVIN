package TP_0_ICT301_KOUAWA_KEVIN.ISP.avant_refactoring;

public class main {
    public static void main(String[] args) {
        Worker human = new HumanWorker();
        human.work();
        human.eat();

        Worker robot = new RobotWorker();
        robot.work();
        robot.eat(); // Problème ici : les robots ne mangent pas
    }
}
