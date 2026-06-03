class BasicOperations{
    public static void main(String[] args) {
        System.out.println("Print All Characters of a String");
        String str = "Java";
        str.chars()
        .mapToObj(ele -> (char) ele)
        .forEach(System.out::println);
        
        System.out.println("Print First Character of a String");
        str.chars()
        .mapToObj(ele -> (char) ele)
        .findFirst()
        .ifPresent(System.out::println);
        
        System.out.println("Print last Character of a String");
        str.chars()
        .mapToObj(ele -> (char) ele)
        .skip(str.length()-1)
        .findFirst()
        .ifPresent(System.out::println);
        
        
        System.out.println("Count Total Characters");
        long count = str.chars()
        .count();
        System.out.println(count);
    }
}