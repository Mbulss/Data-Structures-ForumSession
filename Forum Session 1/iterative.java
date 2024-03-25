public class iterative {
    public static void main(String[] args) { //start of program
        StringBuilder buildstring = new StringBuilder(100); //declare string builder
        int intput = 123456; //initial int
        String myStr = Integer.toString(intput); //turn int into string
        int b = myStr.length()-1; //gets length of input
        for (int i = b;i>=0;i--) { //for loop equal to length og input from last to first numbers
            char result = myStr.charAt(i); //gets the number based on number of for loop from the last number
            String v = Character.toString(result); //turns char to string
            buildstring.append(v); //append v to string builder
        }
        int x = Integer.parseInt(buildstring.toString()); //turns string builder string into int
        System.out.println(x); //prints the result
    }
}
