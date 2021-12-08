package capa;

import java.util.Scanner;

public class Person implements Interface{

    //ATTRIBUTES--------------------------------------
    private int id;
    private String name;
    private int birthday;

    //METHODS------------------------------------------
    public Person(){
        this.id=0;
        this.name="Undefined";
        this.birthday=0;
    }

    public Person(int id, String name, int birthday){
        this.id=id;
        this.name=name;
        this.birthday=birthday;
    }

    public Person(int id){
        this.id=id;
    }

    public int getID(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getBirthday(){
        return this.birthday;
    }

    public void setId(int id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setBirthday(int birthday){
        this.birthday=birthday;
    }

    @Override
    public boolean equals(Object o) {                           //sem2, cla2, min 10
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        if (getBirthday() != person.getBirthday()) return false;
        return getName() != null ? getName().equals(person.getName()) : person.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + getBirthday();
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public void captureData() {
        Scanner scanning = new Scanner(System.in);
        int id= scanning.nextInt();
        String name= scanning.next();
        this.setId(id);
        this.setName(name);
    }
}