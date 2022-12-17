package java_final;

public class EnumClass {

    enum colours {
        WHITE,
        BLACK,
        GREEN,
        RED,
        BROWN,
    }

    public static void main(String[] args) {
        for (colours cl : colours.values()) {
            System.out.println(cl);
        }
    }

}
