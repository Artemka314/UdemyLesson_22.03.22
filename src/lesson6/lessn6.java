package lesson6;
class lesson6Test{

    int chisloq(int q,int w,int e,int r){

int result = q+w+e+r;
System.out.println(result);
        return result;

    }
    int chisloq(int q,int w) {

       int result = q + w;
        System.out.println(result);
        return result;
    }

    int chisloq(int q,int w, int e){

        int result = q+w+e;
        System.out.println(result);
        return result;


    }
    int chisloq(){

        int result = 0;
        System.out.println(result);
        return result;


    }

}
public class lessn6 {
    public static void main(String[] args) {
lesson6Test ls = new lesson6Test();
ls.chisloq();
    }
}
