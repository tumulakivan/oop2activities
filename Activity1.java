public class Activity1 {
    public static final int x = 5;

    public static void main(String[] args) {
        newObject obj1 = new newObject();
        obj1.objPrint(x);
    }
}

class newObject {
    public void objPrint(int num) {
        System.out.println(num);
    }
}