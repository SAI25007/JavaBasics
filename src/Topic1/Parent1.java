package Topic1;

public class Parent1 {

    public static void main (String[] args){
        System.out.println("Started the Parent class");

        // To call methods in other class use below syntax
             // Classname object = new Classfunction [To Create a object for class]
        Methods m = new Methods();
        //Classobject.methodname
        m.Variable();
        // If a method is having a return then use print statement to print
        System.out.println(m.Validate());
    }
}
