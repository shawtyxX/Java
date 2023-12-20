public class Tea extends Food{
    String color = null;
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

    public String toString(){
        return super.toString() + " цвета " + color;
    }

    @Override
    public void consume(){
        System.out.println(this + " выпит ");
    }

    public boolean equals(Object arg0){
        if(super.equals(arg0)){
            if(!(arg0 instanceof Tea)) return false;
            return this.color.equals(((Tea)arg0).color);
        }
        else{
            return false;
        }
    }
}
