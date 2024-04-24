public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");

        String firstName = "Ivanov";    //фамилия сотрудника
        String middleName = "Ivan";     //имя сотрудника
        String lastName = "Ivanovich";  //отчество сотрудника
        String fullName = firstName + " " + middleName + " " + lastName;    //полное ФИО сотрудника
        System.out.println("Ф. И. О. сотрудника - " + fullName);

        //Задача 2
        System.out.println("Задача 2");

        System.out.println(fullName.toUpperCase());     //выводим полное имя сотрудника в верхнем регистре

        //Задача 3
        System.out.println("Задача 3");

        fullName = "Иванов Семён Семёнович";                    //новое полное имя сотрудника, в котором будет заменяться буква 'ё'
        fullName = fullName.replace("ё", "е"); //заменяем в строке букву 'ё' на 'е'
        System.out.println("Ф. И. О. сотрудника - " + fullName);

    }
}