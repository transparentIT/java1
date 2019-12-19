public class Task2 {
    public static void main(String[] args) {
//        printJava();
//        int x;
//        int y;
//        int subtraction1 = subtraction(x = 45, y = 12);
//        int subtraction2 = subtraction(x = 23, y = 55);
//        int addition1 = addition(x = 128, y = 787);
//        int addition2 = addition(x = 528, y = 387);
//        int multiplication1 = multiplication(x = 124, y = 87);
//        int multiplication2 = multiplication(x = 1528, y = 3);
    }

    public static void printJava() {
        String s1 = "Хорошо идут дела";
        String s2 = "Изучаю Java я!";
        String s3 = " ";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 + s3 + s2);
        System.out.println(s2 + s3 + s1);
        System.out.print("");
    }

    public static int subtraction(int x, int y) {
        System.out.println("Вызвана функция subtraction() с параметрами x = " + x + ", y = " + y);
        return x - y;
    }

    public static int addition(int x, int y) {
        System.out.println("Вызвана функция addition() с параметрами x = " + x + ", y = " + y);
        return x + y;
    }

    public static int multiplication(int x, int y) {
        System.out.println("Вызвана функция multiplication() с параметрами x = " + x + ", y = " + y);
        return x * y;
    }

    public static void calculation(){
        int a = 34;
        int b = 55;
        int c;

        System.out.println(a);
        System.out.println(b);
        c = addition(a, b);
        System.out.println("a + b = " + c);
        c = subtraction(a, b);
        System.out.println("a - b = " + c);
        c = multiplication(a, b);
        System.out.println("a * b = " + c);
    }

}
