package lesson4;

class Student {




        String name;
        String female;
        int nomerBileta;
        int godObucheniya;
        int mat;
        int econom;
        int inYaz;
}






public class lesson4 {
    public static void main(String[] args) {
            Student st1 = new Student();
            st1.nomerBileta = 1;
            st1.name = "Artem";
            st1.female = "Artemov";
            st1.godObucheniya = 1989;
            st1.mat = 3;
            st1.econom = 4;
            st1.inYaz = 5;

            Student st2 = new Student();
            st2.nomerBileta = 2;
            st2.name = "Ivan";
            st2.female = "Ivanov";
            st2.godObucheniya = 1979;
            st2.mat = 4;
            st2.econom = 4;
            st2.inYaz = 5;

            Student st3 = new Student();
            st3.nomerBileta = 3;
            st3.name = "Sergey";
            st3.female = "Sergeev";
            st3.godObucheniya = 1999;
            st3.mat = 5;
            st3.econom = 5;
            st3.inYaz = 5;

            System.out.println(st1.name + " Средний бал: " +(st1.econom + st1.mat + st1.inYaz)/3);
            System.out.println(st2.name + " Средний бал: " +(st2.econom + st2.mat + st2.inYaz)/3);
            System.out.println(st3.name + " Средний бал: " +(st3.econom + st3.mat + st3.inYaz)/3);







        }
}
