package observer;

public class Agency2_Observer extends Observer {

    private double marketValue;

    public Agency2_Observer(Agent_Subject agentSubject){
        this.agentSubject = agentSubject;
        this.agentSubject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Agency2 - The updated stock market value is: " + agentSubject.getMarketValue());
    }
}
