public class TypeCasting {
    public static void main(String[] args) {
    //Implicit TypeCasting
    short currentYear = 2030;
    byte age = 39;
    int birthYear = currentYear - age;
    System.out.println(birthYear);   
    
    //Explicit TypeCasting
    short birthYearr = (short)(currentYear - age);
    byte year = (byte) currentYear;
    
    }
}
