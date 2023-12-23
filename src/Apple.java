public class Apple extends Food{
    String size;

    public Apple(String size){
        super("Яблоко");
        this.size = size;
    }

    public String getSize(){
        return this.size;
    }

    public void setSize(String size){
        this.size = size;
    }

    @Override
    public void consume(){
        System.out.println(this + " съедено");
    }

    @Override
    public String toString() {
        return super.toString() + " размера " + this.size;
    }
}
