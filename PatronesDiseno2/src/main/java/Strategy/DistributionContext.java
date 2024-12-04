package Strategy;

public class DistributionContext {
    private DistributionStrategy strategy;

    public void setStrategy(DistributionStrategy strategy){
        this.strategy=strategy;
    }

    public void distribute(){
        if(strategy==null){
            System.out.println("Elige una ruta de distribucion");
        }
        strategy.distribute();
    }
}
