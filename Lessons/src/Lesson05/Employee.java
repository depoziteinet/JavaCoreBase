package Lesson;

public class Employee {

    private String surname;
    private String name;
    private String middleName;
    private String position;
    private String site;
    private String numTel;
    private String salary;
    private int age;

    public Employee(String surname, String name, String middleName, String position, String email, String numTel, String salary, int age) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.position = position;
        this.site = email;
        this.numTel = numTel;
        this.salary = salary;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return surname + " " + name +" " + middleName +
                ", возраст " + age +
                ", должность " + position +
                ", сайт " + site +
                ", телефон " + numTel +
                ", заработная плата '" + salary ;
    }
}
