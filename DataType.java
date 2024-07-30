class DataType{
    public static void main(String[] args) {
        //Integral DataTypes
        byte players = 013; //Treat it as Octal
        short score = 0b111; //Treat number as binary or else we can write it as 0B111 i.e CAPITAL B
        int seatings = 0xA; //Treat it as hexadecimal or els we can write 0Xa/0XA/0xa
        long collections = 1_23_45_67_89L; //If number is big we can give underscore b/w it, it won't affect the number

        System.out.println(players);
        System.out.println(score);
        System.out.println(seatings);
        System.out.println(collections);

        //Floating DataTypes
        float avg = 98.6_75_08_42f; //To say that you need smaller space
        double d = 98.674859;
        double a = 1e-9; //0.1 x 10*-8

        System.out.println(avg);
        System.out.println(d);
        System.out.println(a);

        //char
        char ch = 65;
        System.out.println(ch);

        boolean rightToVote = true;
        System.out.println(rightToVote);

        Integer i = 1000; //Wapper class
        System.out.println(i);

        Long l = 100000L;
        System.out.println(l);

        String myName = "Kanan Arora";
        System.out.println(myName);
          

    }
}