public class VariablesTheme {

    public static void main(String[] args) {
        System.out.print("\n 1. Создание переменных и вывод их значений на консоль");
        byte numCores = 12;
        short modVideoСard = 3090;
        int volRAM = 16384;
        long volHDD = 1000000L;
        float verBIOS = 14f;
        double freqCPU = 2.7;
        char direct = 'X';
        boolean isDataCorrect = false;
        System.out.print("\n количество ядер " + numCores);
        System.out.print("\n модель видео карты " + modVideoСard);
        System.out.print("\n объем оперативной памяти " + volRAM);
        System.out.print("\n объем жетского диска " + volHDD);
        System.out.print("\n версия BIOS " + verBIOS);
        System.out.print("\n частота процессора " + freqCPU);
        System.out.print("\n среда выполнения Direct " + direct);
        System.out.println("\n данные верны? " + dataCorrect);

        System.out.print("\n 2. Расчет стоимости товара со скидкой");
        double x = 100;
        double y = 200;
        double sumSale = (x + y) * 0.11;
        double genCostSale = ((x + y) - sumSale);
        System.out.print("\n сумма скидки " + sumSale + " руб.");
        System.out.println("\n общая стоимость товаров со скидкой " + genCostSale + " руб.");

        System.out.print("\n 3. Вывод на консоль слова JAVA");
        System.out.print("\n    J    a  v     v  a");
        System.out.print("\n    J   a a  v   v  a a");
        System.out.print("\n J  J  aaaaa  V V  aaaaa");
        System.out.println("\n  JJ  a     a  V  a     a");

        System.out.print("\n 4. Отображение min и max значений числовых типов данных");
        // переменная byte
        byte origValue1 = 127;
        System.out.print("\n первоначальное значение: " + origValue1);
        byte incrValue1 = ++origValue1;
        System.out.print("\n -значение после инкремента: " + incrValue1);
        byte decrValue1 = --incrValue1;
        System.out.print("\n -значение после декремента: " + decrValue1);
        // переменная short
        short origValue2 = 32767;
        System.out.print("\n первоначальное значение: " + origValue2);
        short incrValue2 = ++origValue2;
        System.out.print("\n -значение после инкремента: " + incrValue2);
        short decrValue2 = --incrValue2;
         System.out.print("\n -значение после декремента: " + decrValue2);
        // переменная int
        int origValue3 = 2147483647;
        System.out.print("\n первоначальное значение: " + origValue3);
        int incrValue3 = ++origValue3;
        System.out.print("\n -значение после инкремента: " + incrValue3);
        int decrValue3 = --incrValue3;
        System.out.print("\n -значение после декремента: " + decrValue3);
        // переменная long
        long origValue4 = 9223372036854775807L; 
        System.out.print("\n первоначальное значение: " + origValue4);
        long incrValue4 = ++origValue4;
        System.out.print("\n -значение после инкремента: " + incrValue4);
        long decrValue4 = --incrValue4;
        System.out.println("\n -значение после декремента: " + decrValue4);
        
        System.out.print("\n 5. Перестановка значений переменных");
        double var1, var2, var3;
        var1 = 1.1;
        var2 = 2.2;
        var3 = 0;
        // способ третей переменной
        System.out.print("\n способ третьей переменной:");
        System.out.print("\n -значение до перестановки " + var1 + ", " + var2);
        var3 = var1;
        var1 = var2;
        var2 = var3;
        System.out.print("\n -новые значения " + var1 + ", " + var2);
        // способ арифметических операций
        System.out.print("\n способ арифметических операций:");
        System.out.print("\n -значение до перестановки " + var1 + ", " + var2);
        var1 = var1 + var2;
        var2 = var1 - var2;
        var1 = var1 - var2;
        System.out.print("\n -новые значения " + var1 + ", " + var2);
        // способ побитовой операции XOR
        System.out.print("\n способ побитовой операции ^:");
        System.out.print("\n -значение до перестановки " + var1 + ", " + var2);
        int var11 = (int) (var1 * 10);
        int var21 = (int) (var2 * 10);
        int resXOR = var11 ^ var21;
        var1 = (double) (var11 ^ resXOR) / 10;
        var2 = (double) (var21 ^ resXOR) / 10;
        System.out.println("\n -новые значения " + var1 + ", " + var2);

        System.out.print("\n 6. Вывод символов и их кодов");
        int code35 = 35;
        char sign1 = (char)code35;
        System.out.print("\n код символа " + code35 + " символ " + sign1);
        int code38 = 38;
        char sign2 = (char)code38;
        System.out.print("\n код символа " + code38 + " символ " + sign2);
        int code64 = 64;
        char sign3 = (char)code64;
        System.out.print("\n код символа " + code64 + " символ " + sign3);
        int code94 = 94;
        char sign4 = (char)code94;
        System.out.print("\n код символа " + code94 + " символ " + sign4);
        int code95 = 95;
        char sign5 = (char)code95;
        System.out.println("\n код символа " + code95 + " символ " + sign5);

        System.out.print("\n 7. Произведение и сумма цифр числа");
        int n = 345;
        int a = n / 100;
        int b = n / 10 % 10;
        int c = n % 10;
        int sum = a + b + c;
        int mult = a * b * c;
        System.out.print("\n cумма цифр числа N = " + sum);
        System.out.println("\n произведение цифр числа N = " + mult);

        System.out.print("\n 8. Вывод на консоль ASCII-арт Дюка");
        char sp = (char)32;
        char fSl = (char)47;
        char bSl = (char)92;
        char bktOp = (char)40;
        char bktCl = (char)41;
        char unSc = (char)95;
        System.out.print("\n" + sp + sp + sp + sp + fSl + bSl + sp + sp + sp + sp);
        System.out.print("\n" + sp + sp + sp + fSl + sp + sp + bSl + sp + sp + sp);
        System.out.print("\n" + sp + sp + fSl + unSc + bktOp + sp + bktCl + bSl + sp + sp);
        System.out.print("\n" + sp + fSl + sp + sp + sp + sp + sp + sp + bSl + sp);
        System.out.println("\n" + fSl + unSc + unSc + unSc + unSc + fSl + bSl + unSc + unSc + bSl);

        System.out.print("\n 9. Отображение количества сотен, десятков и единиц числа");
        int num = 123;
        int hundreds = num / 100;
        int tens = num / 10 % 10;
        int units = num % 10;
        System.out.print("\n Число N содержит:");
        System.out.print("\n" + hundreds + " сотен");
        System.out.print("\n" + tens + " десятков");
        System.out.println("\n" + units + " единиц");
        
        System.out.print("\n 10. Преобразование секунд");
        int sumSec = 86399;
        int hours = sumSec / 3600;
        int minutes = sumSec / 60 % 60;
        int seconds = sumSec % 60;
        System.out.println("\n" + hours + ":" + minutes + ":" + seconds);
    }
}

