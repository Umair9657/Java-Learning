public class String_Methods {
    public static void main(String[] args) {
        String a = "Umair Ansari";
        int value = a.length();     // it returns length of the string.
        System.out.println(value);

        String tlc = a.toLowerCase();   // it returns lower case result.
        System.out.println(tlc);

        String tuc = a.toUpperCase(); // it returns upper case result.
        
        System.out.println(a.substring(4)); // it returns the string after giving starting value.

        System.out.println(a.substring(5, 10));   // it returns the string after giving starting value and end value.

        System.out.println(a.replace('r', 'g'));   // it replace char from the string.
        System.out.println(a.replaceAll("Uma", "Abh"));

        System.out.println(a.startsWith("Uma"));  // it returns true if string starts with given values.

         System.out.println(a.endsWith("ri"));  // it returns true if end value same as given value.

        System.out.println(a.charAt(4));  // it returns char form given char value.

        System.out.println(a.indexOf("Ans")); // it returns the index of the string.

        System.out.println(a.lastIndexOf("an"));  //it returns the last index of the provided value.

        System.out.println(a.equals("Umar"));  // it returns the true or false if given value is same or not.

        System.out.println(a.equalsIgnoreCase("ansari"));

        System.out.println("hi mi hu mumbai hdkwhdi ihiwh \n double quote");


        

    }
}
