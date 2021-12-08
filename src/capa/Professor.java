package capa;

import java.util.Objects;
import java.util.Scanner;

public class Professor extends Person{

    //ATTRIBUTES--------------------------------------
    String role;

    //METHODS------------------------------------------


    public Professor() {
        this.role="Undefined";
    }

    public Professor(int id, String name, int birthday, String role) {
        super(id, name, birthday);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Professor{" + super.toString()+ " ' , "+
                "role='" + role + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor)) return false;
        if (!super.equals(o)) return false;
        Professor professor = (Professor) o;
        return Objects.equals(getRole(), professor.getRole());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getRole());
    }

    @Override
    public void captureData(){
        super.captureData();
        Scanner scanning = new Scanner(System.in);
        String role= scanning.nextLine();
        this.setRole(role);
    }
}
