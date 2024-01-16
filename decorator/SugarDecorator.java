public class SugarDecorator implements Beverage{ 
    private Beverage beverage;
    public SugarDecorator(Beverage bev){
        this.beverage = bev;
    }
    @Override
    public int getCost(){
        return beverage.getCost()+1;
    }
    @Override
    public String getDescription(){
        return beverage.getDescription()+"sugar ";
    }
    
}
