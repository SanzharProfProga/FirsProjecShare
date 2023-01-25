import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /** Кайтаруучу тиби boolean болгон метод түзүңүз, параметрине бир сан жана сандардын varargs-ын кабыл алсын.
         Методко биринчи берген аргументиңизди экинчи берген аргументтердин ичинен барбы же жокпу текшерип,
         бар болсо true, жок болсо false кайтарсын.
         static boolean contains (int a, int ... varargs) {
         // бул жака кодуңузду жазыңыз */
        int a = new Scanner(System.in).nextInt();
        System.out.println(my(a, 1, 86, 95, 85, 745, 84));


    }

    public static boolean my(int a, int... varargs) {
        for (int i = 0; i < varargs.length; i++) {
            if (a == varargs[i]) {
                return true;
            }
        }
        return false;
    }
}