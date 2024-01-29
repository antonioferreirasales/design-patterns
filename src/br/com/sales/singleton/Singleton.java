package br.com.sales.singleton;

public final class Singleton {
    private static Singleton singleton;
//    can't instantiate this class since its private
    private Singleton() {

    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
