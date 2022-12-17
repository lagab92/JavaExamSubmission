package java_final;

public class SingltonMain {

    public static void main(String[] args) {
        SingletonClass obj =   SingletonClass.getInstance(6);
        SingletonClass obj2 = SingletonClass.getInstance(5);

        System.out.println(obj.y);
        System.out.println(obj2.y);
    }
}
