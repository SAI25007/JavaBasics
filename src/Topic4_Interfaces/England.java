package Topic4_Interfaces;


// We write implements to use only the methods present in the interface
public class England implements TrafficRules{



    public static void main (String [] args) {
        //To print run the methods present in the interface create a object as [InterfaceName object = new ClassName where the methods code is written]
        TrafficRules a = new England();
        a.Red();
        a.Green();
        a.Yellow();
        //Crete a object to run the internal classes
        England b = new England();
        b.YellowFlashing();
    }

    //Can create a method inside this class as well
    public void YellowFlashing(){
        System.out.println("Yellow Flashing");
    }

    //Interface classes
    @Override
    public void Red() {
        System.out.println("Red Light");

    }

    @Override
    public void Green() {
        System.out.println("Green Light");
    }

    @Override
    public void Yellow() {
        System.out.println("Yellow Light");
    }
}
