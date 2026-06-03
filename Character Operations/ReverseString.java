public class ReverseString {
    public static void main(String[] args) {
        String str = "Java";
    /*
    * Visual Example (Input: "cat")
    * 
    * 1. chars()
    *    - Input: "cat"
    *    - Output: An IntStream containing numeric Unicode values: [99, 97, 116] 
    *    - Note: 99 is 'c', 97 is 'a', and 116 is 't'.
    * 
    * 2. .mapToObj(c -> String.valueOf((char)c))
    *    This step loops through each number (c) in the stream and transforms it:
    *    - First item:  99  -> (char)99  becomes 'c' -> String.valueOf('c')  becomes "c"
    *    - Second item: 97  -> (char)97  becomes 'a' -> String.valueOf('a')  becomes "a"
    *    - Third item:  116 -> (char)116 becomes 't' -> String.valueOf('t')  becomes "t"
    *    - Final Output of this step: A Stream<String> containing: ["c", "a", "t"]
    * 
    * 3. .reduce("", (a,b) -> b + a)
    *    This step combines the list of strings by placing the new character (b) in front of the accumulated result (a):
    *    - Start:  The accumulator starts as the identity value: ""
    *    - Step 1: Acc ("")   + Item ("c") -> "c" + ""   = "c"
    *    - Step 2: Acc ("c")  + Item ("a") -> "a" + "c"  = "ac"
    *    - Step 3: Acc ("ac") + Item ("t") -> "t" + "ac" = "tac"
    *    - Final Output: "tac"
    */
        System.out.println("Reverse a String");
        String reversed =
        str.chars()
           .mapToObj(c -> String.valueOf((char)c))
           .reduce("", (a,b) -> b + a);

        System.out.println(reversed);

        // Palindrome Check
        boolean isPalindrome = str.equals(reversed);
        System.out.println("Given String is Palindrome : " + isPalindrome);
    }
}
