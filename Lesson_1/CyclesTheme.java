public class CyclesTheme {

    public static void main(String[] args) {
        System.out.print("\n 1. Подсчет суммы четных и нечетных чисел");
        int sumEvenNum = 0;
        int sumOddNum = 0;
        int limit = -10;
        do {
            if (limit % 2 == 0) {
                sumEvenNum += limit;
            } else {
                sumOddNum += limit;
            }
            limit++;
        } while(limit <= 21);
        System.out.println("\n в промежутке [-10, 21] сумма четных чисел = " +
        sumEvenNum + ", а нечетных = " + sumOddNum);

        System.out.println("\n 2. Вывод чисел в интервале между (max и min)");
        int a = 10;
        int b = 5;
        int c = -1;
        int x;
        if (a > b) {
            x = a; a = b; b = x;
        } else a = a;
        if (b > c) {
            x = b; b = c; c = x;
        } else b = b;
        if (a > b) {
           x = a; a = b; b = x;
        } else c = c;
        for(int i = a; i <= c; i++) {
        System.out.printf("%3d", i);
        }
        System.out.println("\n среди них число min " + a + " число max " + c);
        
        System.out.print("\n 3. Вывод реверсивного числа и суммы его цифр");
        int num1 = 1234;
        int invertedNum1 = 0;
        int sumInvertedNum1 = 0;
        while(num1 != 0) {
        invertedNum1 = invertedNum1 * 10 + num1 % 10;
        sumInvertedNum1 += num1 % 10;
        num1 /= 10;
        }
        System.out.print("\n исходное число в обратном порядке " + invertedNum1);
        System.out.println("\n сумма его цифр " + sumInvertedNum1);

        System.out.println("\n 4. Вывод чисел на консоль в несколько строк");
        for(int j = 1; j < 10; j += 2) {
        System.out.printf("%4d", j);
        }
        System.out.printf("%n");
        for(int k = 11; k < 21; k += 2) {
        System.out.printf("%4d", k);
        }
        System.out.printf("%n");
        for(int l = 21; l < 24; l += 2) {
        System.out.printf("     %05d", l);
        }
        System.out.println();

        System.out.println("\n 5. Проверка количества единиц на четность");
        int num2 = 3141591;
        System.out.print(" число " + num2 +" содержит ");
        int sumNum2 = 0;
        while(num2 != 0) {
        int variable = num2 % 10;
        if (variable == 1) {
        sumNum2 += 1;
        } else {
        sumNum2 += 0;
        }
        num2 = num2 / 10;
        }
        System.out.println( + sumNum2 + " (четное/нечетное) количество единиц");

        System.out.println("\n 6. Отображение фигур в консоли");
        int num3 = 5;
        for(int m = 1; m <= num3; m++) {
            System.out.print(" ********** \n");
        }
        
        int num4 = 5;
        int m;
        while(num4 > 0) {
            m = num4;
            while (m > 0) {
                System.out.print(" #");
                m --;
            }
            System.out.print('\n');
            num4 --;
        
        int num6 = 1;
        int z;
        boolean flag = true;
        do {
            z = num6;
            do {
                System.out.print(" $");
                z --;
            } while (z > 0);
            System.out.print("\n");
            if (flag) {
                num6 ++;
            } else {
                num6 --;
            }
            if (num6 == 3) {
                flag = false;
            }
            if (num6 == 0) {
                break;
            }
        } while (num6 <= 3);
        
        System.out.println("\n 9. Определение, является ли число счастливым");
        int num = 123451;
        int digit;
        int abc = 0;
        int def = 0;
        for(int i = 0; i < 6; i++) {
            digit = num % 10;
            num = num/10;
            if(i >= 3) {
                abc += digit;
            } else {
                def += digit;
        }
        }

        System.out.println("\n 8. Проверка, является ли число палиндромом");
        int num7 = 1234321;
        int inverseNum;
        System.out.println("Заданное число: " + num7);
        for (inverseNum = 0; num7 != 0; num7 /= 10){
        inverseNum = inverseNum * 10 + num7 % 10;
        }
        System.out.println("Число в обратно порядке: " + inverseNum);
        System.out.println("Заданное число: " + num7);
        boolean s = true;
        boolean comparison = num7 == inverseNum;
        boolean d = s & comparison;
        System.out.println("Числа являются палиндромами " + d);

        System.out.println("\n 10. Вывод таблицы умножения Пифагора");
        System.out.printf("   |");
        for(int num8 = 2; num8 <= 9; num8++)
        System.out.printf("%2d ", num8);
        System.out.printf("\n---|-----------");
        System.out.printf("-------------\n");
        for(int num8 = 2; num8 <= 9; num8++){
        System.out.printf("%2d |", num8);
        for(int num9 = 2; num9 <= 9; num9++)
        System.out.printf("%2d ", num8 * num9);
        System.out.printf("\n");
        }
        }
    }
}








