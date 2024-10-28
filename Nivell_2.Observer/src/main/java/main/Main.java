package main;

import observer.Agency1_Observer;
import observer.Agency2_Observer;
import observer.Agent_Subject;
import observer.Observer;

public class Main {
    public static void main(String[] args) {

        Agent_Subject agentSubject = new Agent_Subject();

        Observer agency1 = new Agency1_Observer(agentSubject);
        Observer agency2 = new Agency2_Observer(agentSubject);

        System.out.println("The actual stock market value is: " + agentSubject.getMarketValue());
        agentSubject.setMarketValue(10234.34);
        //agency1.update();
        //agency2.update();

    }
}