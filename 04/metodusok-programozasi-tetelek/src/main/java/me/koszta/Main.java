package me.koszta;
public class Main {
    public static void main(String[] args) {
        int[] feladat1Teszt = {2,3,4,5,6,7,8};
        tomElemHatvanyKiir(feladat1Teszt, 3);
        canBeDivided(25,5000,3,7);
        test3();

    }

    public static void tomElemHatvanyKiir(int[] numbers, int power){

        for (int i = 0; i < numbers.length; i++) {
            int new_number = numbers[i];
            for (int j = 1; j < power; j++) {
                new_number *= numbers[i];
            }
            System.out.print(new_number + " ");

        }
        System.out.println();


    }
    public static void canBeDivided(int min, int max){
        int counter = 0;
        int firstNum = 3;
        int secondNum = 7;
        for (int i = min; i < max + 1; i++) {
            if ((i % firstNum == 0) && (i % secondNum == 0)){
                counter++;
                System.out.print(i + " ");
                if (counter%10 == 0) {
                    System.out.println();
                    counter = 0;
                }
            }

        }
        System.out.println();

    }

    public static void canBeDivided(int min, int max, int firstNum, int secondNum){
        int counter = 0;

        for (int i = min; i < max + 1; i++) {
            if ((i % firstNum == 0) && (i % secondNum == 0)){
                counter++;

                System.out.print(i + " ");
                if (counter%10 == 0) {
                    System.out.println();
                    counter = 0;

                }
            }

        }

    }

    public static void test3(){
        int num1 = (int) randomNumGenerator(1, 10);
        int num2 = (int) randomNumGenerator(1, 10);
        int num3 = num1 * num2;
        System.out.println(isEven(num3) ? (num1 +" es " + num2 + " szorzata paros") :(num1 +" es " + num2 + " szorzata paratlan"));

    }



    public static double randomNumGenerator(int min, int max){
        return (Math.random()*(max-min)) + min;
    }


    public static boolean isEven(int num){
        return num%2 == 0;
    }



}