package Topic3_Palindrome;

public class ReverseString {

    public static void main (String [] args) {

        //Creating two variables t is dummy to store the value
        String s = "MALAYALAM";
        String t = "";

        //s.length()-1 capturing the length  i>=0 go until this index i-- decrement 1 after every iteration
        for(int i = s.length()-1; i>=0; i--){
          // t stores all the variables after every iteration
            t = t + s.charAt(i);
        }

        System.out.println(t);

        if(s.equals(t)) System.out.println("This is a Palindrome");
        else if (s!=t) System.out.println("Not a Palindrome");
    }
}
