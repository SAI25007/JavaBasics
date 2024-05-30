package Topic2_StringHandling;

public class Class1 {
    public static void main (String [] args) {
        //Payment $100 paid

     String str = "Payment $100 paid and $200 to be paid";
     //chartAt is used to print the value present at the index of the string
     System.out.println(str.charAt(23));
     //indexOf is used to know the index of the value given
     System.out.println(str.indexOf("$200"));
     //substring is used to get the values after the index given
     System.out.println(str.substring(22));
     //To change whole string upperCase
        System.out.println(str.toUpperCase());




     String str1 = str.toUpperCase();
     System.out.println(str1.substring(22));
    }
}
