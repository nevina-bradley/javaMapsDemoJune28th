package com.codedifferently.example;

interface Greeter {
    String greeting();
}

class AggressiveAndy implements Greeter{
    public String greeting(){
        return "Shut up and pay me";
    }
}

class PolitePaul implements Greeter{
    public String greeting(){
        return "Excuse me, I believe you have not paid your bill";
    }
}

public class Main {

    public static void introduction(Greeter rep){
        System.out.println(rep.greeting());
    }

    public static void main(String[] args) {
        PolitePaul paul = new PolitePaul();
        AggressiveAndy andy = new AggressiveAndy();

        introduction(andy);
    }
}
