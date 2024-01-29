package br.com.sales.singleton;

public class DemoSingletonPropriedade {
    public static void main (String[] args) {
//        ele sempre pega o primeiro valor
        SingletonPropriedade singleton = SingletonPropriedade.getInstance("Teste");
        SingletonPropriedade singleton1 = SingletonPropriedade.getInstance("Teste1");

        System.out.println(singleton.getValue());
        System.out.println(singleton1.getValue());
    }
}
