public class MilkDecoration implements Beverage{ 
    private Beverage beverage;
    public MilkDecoration(Beverage bev){
        this.beverage = bev;
    }
    @Override
    public int getCost(){
        return beverage.getCost()+3;
    }
    @Override
    public String getDescription(){
        return beverage.getDescription()+"milk ";
    }
    
}
