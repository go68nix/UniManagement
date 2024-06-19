package de.tum.in.ase.eist;

public abstract class Person {
	// TODO: implement according to problem statement

    private String name;
    private int age;
    private String tumId;
    public Person(String name,int age,String tumId){
        this.age= age;
        this.name= name;
        this.tumId= tumId;
    }
    public void say(String a){
        System.out.println(name +" said: "+a);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTumId() {
        return tumId;
    }
}
