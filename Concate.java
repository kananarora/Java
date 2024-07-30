class Concate{
    public static void main(String[] args) {
        String firstName = "Mary";
        String lastName = "Alice";
        int age = 20;

        char ch = 'a'; //It implicitly converts value to integer
        char ch2 = 'b';
        System.out.println(ch + ch2); //o/p 97+98=195.

        char ch3 = (char)(ch+1); // 97+1 = 98 i.e. char 98 = b(in terms of ASCII value) 
        System.out.println(ch3);
        String fullName = firstName +" "+ lastName + " is " + age + " Years old ";
        

        System.out.println(fullName);
    }
}