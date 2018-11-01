public class Account {
    private int a;
    private int b;
    private int c;

    public Account(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Account() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getDiscriminant(){
        return Math.pow(this.b,2) - 4*this.a*this.c;
    }

    public double getRoot(){
        return -this.c/this.b;
    }
    public double getRoot1(){
        return (-this.b-Math.sqrt(getDiscriminant()))/(2*this.a);
    }

    public double getRoot2(){
        return (-this.b+Math.sqrt(getDiscriminant()))/(2*this.a);
    }
    public boolean isA(){
        if (this.a == 0)
            return true;
        return false;
    }
    public boolean isB(){
        if (this.b == 0)
            return true;
        return false;
    }
    public boolean isC(){
        if (this.c == 0)
            return true;
        return false;
    }

    public String display(){
        if (isA()){
            if (isB()){
                if (isC()){
                    return "The equation has infinite root";
                }else {
                    return "The equation had no real root";
                }
            }else {
                return "The equation has 1 root " + getRoot();
            }
        }else{
            if (getDiscriminant() == 0){
                return "The equation has 1 root " + getRoot1();
            }else if (getDiscriminant() < 0){
                return "The equation had no real root";
            }else {
                return "The euqation has roots " + getRoot1() + " and " + getRoot2();
            }
        }
    }
}
