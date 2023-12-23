public class Eggs extends Food{
    int qty;

    public Eggs(int qty){
        super("Яйца");
        this.qty = qty;
    }

    @Override
    public String toString(){
        return super.toString() + " в количестве " + Integer.toString(qty) +  "шт.";
    }

    public int getQty(){
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public void consume(){
        System.out.println(this + " съедены");
    }
}
