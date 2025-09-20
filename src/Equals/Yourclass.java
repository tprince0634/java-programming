package Equals;

import java.util.Objects;
//When you create your own classes, you can override equals() to define what it means for two instances of your class to be "equal".
public class Yourclass {
    int value;

    Yourclass(int value){
        this.value=value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Yourclass yourclass = (Yourclass)o;
        return value == yourclass.value;
    }

    public static void main(String[] args) {
        Yourclass a = new Yourclass(50);
        Yourclass b = new Yourclass(50);
        System.out.println(a.equals(b));
    }
}
