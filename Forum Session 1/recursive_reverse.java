public class recursive_reverse {
    public class bstring { //declare public class for string builder
        public static StringBuilder buildstring = new StringBuilder(100); //string builder declare
    }
    public static void main(String[] args) { //program starts here
        int inputint = 456789; //initial int input
        String input = Integer.toString(inputint); //turns int into string
        int i = input.length()-1; //gets length of input
        reverse(i, input); //declares w is reversed input and calls the reverse method
    }
    public static String reverse(int i, String word){ //reverses the input int
        if (i>0){ //if i is more than 0, do these actions
            char j=word.charAt(i); //gets the character at the current i location starting from the end of the input
            String k = Character.toString(j);// turns char j into string
            bstring.buildstring.append(k); //append j into string builder
            i--; //reduces i by 1 to go to the next number from the back
            reverse(i, word); //calls the method in itself to loop
        }
        else{ //set of actions if the i reaches 0
            char j = word.charAt(0); //gets the first number of the input
            bstring.buildstring.append(j); //append j to string builder
            int x = Integer.parseInt(bstring.buildstring.toString()); //turns string builder string to int
            System.out.println(x); //prints the result
        }
        return word; //return
    }
}
