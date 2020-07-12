public class Worker {

    private String surname;
    private String name;
    private String middleName;
    private String position;
    private String site;
    private String numTel;
    private String salary;
    private String age;

    public Worker(String surname, String name, String middleName, String position, String email, String numTel, String salary, String age) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.position = position;
        this.site = email;
        this.numTel = numTel;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Работник " + surname + " " + name +" " + middleName + '\'' +
                ", возраст='" + age +
                ", должность '" + position + '\'' +
                ", e-mail '" + site + '\'' +
                ", телефон='" + numTel + '\'' +
                ", оклад='" + salary + '\'';
    }
}
