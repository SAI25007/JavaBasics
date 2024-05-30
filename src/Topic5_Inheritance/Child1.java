package Topic5_Inheritance;

public class Child1 extends Parent{

    public void colour() {
        // The colour is taken from the Parent class
        System.out.println(colour);
    }
    public void newEngine() {
        System.out.println("220 hoursePower");
    }

    public static void main (String [] args) {
        Child1 a = new Child1();
        a.colour();
        a.newEngine();
    }
}
