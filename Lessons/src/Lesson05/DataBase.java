package Lesson05;

public class DataBase {
    public static void main(String[] args) {
        int ageFor = 55;
        int numEmployee = 3;

        Employee[] arrayEmployee = new Employee[numEmployee];

        arrayEmployee[0] = new Employee("Путин", "Владимир", "Владимирович", "Президент","kremlin.ru", "8 800 200 23 16", "720 700 руб", 67);
        arrayEmployee[1] = new Employee("Медведев", "Дмитрий", "Анатольевич", "Заместитель Председателя Совета безопасности Российской Федерации","www.scrf.gov.ru", "-", "618 713 руб", 54);
        arrayEmployee[2] = new Employee("Мишустин", "Михаил", "Владимирович", "Председатель Правительства Российской Федерации","government.ru", "8 800 200-84-42", "618 000 руб", 54);

        System.out.println("Работники возрастом старше " + ageFor + " лет:");
        for (Employee employee : arrayEmployee) {
            if(employee.getAge() > ageFor)
                System.out.println(employee.toString());
         }

        System.out.println();

        System.out.println("Работники возрастом младше " + ageFor + " лет:");
        for (Employee employee : arrayEmployee) {
            if(employee.getAge() < ageFor)
                System.out.println(employee.toString());
        }

    }
}
