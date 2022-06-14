package Serialization;

import java.io.Serializable;

public class SimpleClass implements Serializable {
    private static final long serialVersionUID = -5396145465726191215L;
    private int i;
    private transient String s;

    SimpleClass(int i, String s){
        this.i = i;
        this.s = s;
    }

    public void setI(int i) { this.i = i; }

    public void setS(String s) { this.s = s; }

    public int getI() { return i; }

    public String getS() { return s; }

    public String toString(){
        return "i = " + getI() + "; s = " + getS();
    }

}
