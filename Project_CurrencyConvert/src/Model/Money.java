package Model;

public abstract class Money {
    public  String type;
    public  double value;

    public Money() {}
    public Money(String type, double value){
        this.type = type;
        this.value = value;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return this.type;
    }
    public void setValue(double value) {
        this.value = value;
    }
    public double getValue() {
        return this.value;
    }
}
