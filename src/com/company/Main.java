package com.company;

public class Main {

    public static void main(String[] args) {
        // если создадим 2 разных класса, он просто заного пропишет путь от начального класса одиночки
        Singelton singelton = Singelton.getInstance();
        Singelton singelton2 = Singelton.getInstance();
        singelton.i=5;
        System.out.println(singelton2.i);
    }
}

// класс одиночка
class Singelton {
    int i=0;
    static Singelton singelton = new Singelton();
    private Singelton(){}
    public static Singelton getInstance(){
        return singelton;
    }
}
