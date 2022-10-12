package homework;

public class HW6 {

    static String line = "\n*************************************";
    static String task = "\nTask ";
    static int number = 1;
    public static void printNumber() {
        System.out.print(line + task + number++ + "\n");}

    public static final String ANSI_BLUE ="\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";


//    public static String verifyMN (char n, char m){
//        if (n == 0 && m == 0) {
//            char z;
//            for (z='n'; z<='m'; z++);
//            System.out.println(z);
//        } return "alphabet";
//    }


    public static void verifyLength (int l, int i2){
        if (i2==0 && l>=0 ){
            for (i2 = 0; i2<=l; i2+=2 ){
                System.out.println(i2);
            }
        }
    }

    public static void verifyPower (int value, int n){
        int result=1;
        for (int i=1; i<=n; i++){
            //System.out.println((int) Math.pow(value,n));
            System.out.println(result=result*value);
        }
    }


    public static void verifyChar (char n, char m, char l) {
        n = 110;
        m = 109;
        l = 108;
//        if (n != 0)
            for (n = 1; n <= l; n -= m) {
                System.out.println(n);
            }
    }

    public static void main (String[] args) {

        int i;

        //Распечатать последовательность чисел от 0 до 9 включительно.
        printNumber();
        for (i = 0; i <= 9; i ++){
            System.out.println(i);
        }

        //Распечатать последовательность чисел от 10 исключительно до 0 включительно.
        printNumber();
        for (i = 9; i >= 0; i --){
            System.out.println(i);
        }

        //Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.
        printNumber();
        for (i = 50; i <= 55; i = i + 2){
            System.out.println(i);
        }

        //Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)
        printNumber();
        for (i = 301; i <= 327; i += 7 ){
            System.out.println(i);
        }

        //Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1
        printNumber();
        for (double a = 12; a <= 13; a += 0.1 ){
            System.out.println(a);;
        }

        //Распечатать последовательность четных чисел от 215 до 237 включительно
        printNumber();
        for (i = 216; i <= 237;i += 2){
            System.out.println(i);
        }

        //Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.
        printNumber();
        for (i = 8; i < 14; i += 7){
            System.out.println(i);
        }

        //Распечатать последовательность которая начинается с минимального значения
        //типа данных short и заканчивается максимальным значением short.
        // Числа в последовательности должны быть кратны 15001.
        printNumber();
//        short e;
//        for (e = (short) -32769; e <= 32767; e += 15001){
//            System.out.println(e);
//        }

        //Распечатать последовательность чисел в промежутке от -10 до 34 включительно.
        //Числа, кратные 11, должны быть распечатаны синим цветом.
        //Числа, кратные 12, должны быть распечатаны красным цветом.А ноль необходимо распечатать словом ZERO.

        printNumber();

        for (i = -10; i <= 34; i++){
            if (i % 11 != 0) {
                System.out.println(ANSI_BLUE + i+ANSI_BLUE);
            } else if (i % 12 != 0) {
                System.out.println(ANSI_RED + i+ANSI_RED);
            } else if (i == 0) {
                System.out.println("ZERO");
            }
        }

        //Написать метод, который принимает на вход параметры start,  end, step,
        // и печатает последовательность десятичных  чисел, начиная с числа start,
        // с шагом step. Точка выхода из цикла - число end.
        printNumber();
        char s='s' + 't' + 'a' + 'r' + 't';
        System.out.println((int) s);//558
        char s1 = 'e'+'n'+'d';
        System.out.println((int) s1);//311
        char s2= 's'+'t'+'e'+'p';
        System.out.println((int) s2);//444
        for (s=558; s >= 311; s -=444){
            System.out.println(s);
        }

//        for(char s='a'; s<='z'; s++){
//            int c=s;
//            System.out.println(s+" :"+c+".");
//        }

        //Написать метод,
        //который принимает на вход параметры n и m типа char, и выводит на печать
        //последовательность букв английского алфавита в промежутке между значениями n и m включительно.

        printNumber();
        char n=110;
        char m=109;
        int n1=(int) n;//110
        int m1=(int) m;//109
        for ( n1 = n; n1>=m; n1--){
            System.out.println(n1);
        }

        //Написать метод, который принимает параметр  и печатает  последовательность четных чисел от нуля.
        //Длина последовательности = .

        printNumber();
        verifyLength(20,0);

        //Напишите метод, который принимает целое число n,
        //и выводит все степени числа 2 от 1 до n включительно

        printNumber();
        verifyPower(2, 4);

        //Вывести последовательность 012345678900112233445566778899000…
        //до числа 9999 включительно.
        printNumber();
        for (i=0; i<=9;i++){
            System.out.print(i);
        }
        for (i=0; i<=0;i++){
            System.out.print(i);
        }
        for (i=00; i<=9999;i+=11){
            System.out.print(i);
        }

        //Написать метод, который генерирует  последовательность чисел:
        //0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
        //Метод формирует строку из сгенерированных значений,
        //и выводит результат единожды на печать. ПРотестировать этот метод.
        printNumber();
        for (i=0; i<=5;i++){
            System.out.print(i + ", ");
            if(i!=0)
            System.out.print(i*(-1) +", ");
        }

        //Распечатать последовательность чисел:
        //0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25
        printNumber();

        for (i=0;i<=24;i+=3) {
            System.out.print(i + ", ");
        }
        for (i=0;i<=25;i+=5) {
            System.out.print(i + ", ");
        }

//            for (i=0;i<=25;i++) {
////                for (i = 0; i <= 24; i += 3)
////                for (i = 0; i <= 25; i += 5)
//                if ((i % 3 == 0) && (i % 5 == 0)) {
//                    System.out.println(i);
//                }else if (i%3==0) {
//                    System.out.println(i);
//                } else if (i%5==0) {
//                    System.out.println(i);
//                }
//                }

        //Написать метод, который принимает параметры n, m, l,
        //и печатает последовательность нечетных чисел,
        // начиная с числа n, с шагом m,  длина последовательности  l.
        printNumber();
        verifyChar(110,109,108);

















    }
}
