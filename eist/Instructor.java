package de.tum.in.ase.eist;

public class Instructor extends Person{
    public Instructor(String name, int age, String tumId) {
        super(name, age, tumId);
    }
    // TODO: implement according to problem statement
    public void teach(String a){
        say("Please learn "+'"'+a+'"');
    }
}
