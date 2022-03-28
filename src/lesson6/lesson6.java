package lesson6;
class lesson6Test{

    int sum(int q,int w,int e,int r){

int result = q+w+e+r;
System.out.println(result);
        return result;

    }
    int sum(int q,int w) {

       int result = q + w;
        System.out.println(result);
        return result;
    }

    int sum(int q,int w, int e){

        int result = q+w+e;
        System.out.println(result);
        return result;


    }
    int sum(){

        int result = 0;
        System.out.println(result);
        return result;


    }

}
public class lesson6 {
    public static void main(String[] args) {
lesson6Test ls = new lesson6Test();
ls.sum();
ls.sum(2,3);
    }
}
