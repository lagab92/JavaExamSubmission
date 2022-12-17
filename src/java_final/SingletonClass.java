package java_final;

public class SingletonClass {



    int y = 8;

    static SingletonClass obj = new SingletonClass();

    private SingletonClass() {


    }

    public static  SingletonClass getInstance(int y) {

        return obj;
    }
}

