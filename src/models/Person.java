package models;

public class Person {
    private String persona;
    private int age;
    

    public Person(String persona, int age) {
        this.persona = persona;
        this.age = age;
    }


    public String getPersona() {
        return persona;
    }


    public void setPersona(String persona) {
        this.persona = persona;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

}