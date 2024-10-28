package observer;

public class Agency1_Observer extends Observer{

    private double marketValue;

    public Agency1_Observer(Agent_Subject agentSubject){
        this.agentSubject = agentSubject;
        this.agentSubject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Agency1 - The updated stock market value is: " + agentSubject.getMarketValue());
    }
}