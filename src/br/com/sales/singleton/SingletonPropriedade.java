package br.com.sales.singleton;

public class SingletonPropriedade {
    private static SingletonPropriedade singleton;
    //    can't instantiate this class since its private
    private String value;
    private SingletonPropriedade(String value) {
        this.value = value;

    }

    public static SingletonPropriedade getInstance(String value) {
        if (singleton == null) {
            singleton = new SingletonPropriedade(value);
        }
        return singleton;
    }

    public String getValue() {
        return value;
    }
}
