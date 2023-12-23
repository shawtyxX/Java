public class Tea extends Food{
    String color;

    public Tea(String color){
        super("Чай");
        this.color = color;
    }

    public String getVolume(){
        return color;
    }
    public void setColor(String volume){
        this.color = null;
    }

    @Override
    public String toString(){
        return super.toString() + " цвета " + color;
    }

    @Override
    public void consume(){
        System.out.println(this + " выпит ");
    }
}
