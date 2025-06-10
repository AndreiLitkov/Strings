//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");

        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = middleName + " " + firstName + " " + lastName;
        System.out.println("Ф.И.О сотрудника - " + fullName);

        System.out.println();

        //Task 2
        System.out.println("Task 2");

        String fullNameForReport = fullName.toUpperCase();
        System.out.println("Ф.И.О сотрудника для заполнения отчета - " + fullNameForReport);

        System.out.println();

        //Task 3
        System.out.println("Task 3");

        String fullName1 = "Иванов Семён Семёнович";
        String fullName2 = fullName1.replace("ё", "е");
        System.out.println("Ф.И.О сотрудника - " + fullName2);
    }
}