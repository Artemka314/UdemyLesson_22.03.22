package lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        Student st = new Student("Sergey", "Sergeev", 34, 3, 3, 6); /* Создаём Объект
        класса Student и через конструктор вбиваем значения */
        Student st2 = new Student("Artem", "Artem'ev",34,5,5,5);

    System.out.println(st.name + st.srednee(st.mat, st.econom, st.inYaz)) ; /* Делаем вывод на экран, и используем метод srednee
    класса Student, в метод подставляем переменные которые создали ранее "st.mat...*/

    System.out.println(st2.srednee(st2.econom, st2.inYaz, st2.mat));

    }

    public static class Student {


        // Конструктор Student создание
        Student(String name1, String surname1, int godpostupleniay1, int mat1, int econom1, int inYaz1){
            // Присваиваем значение конструктора значение класса
            name = name1;
            surname = surname1;
            godpostupleniay = godpostupleniay1;
            mat = mat1;
            econom = econom1;
            inYaz = inYaz1;
        }
        // Переменные класса Student
        String name;
        String surname;
        int godpostupleniay;
        int mat;
        int econom;
        int inYaz;
        // Создаём функцию которая берёт среднее орифметическое по трём цифрам
        int srednee (int a, int b, int c) {


            return (a + b + c) / 3; // Обязательная команда в функции
        }




    }
}
