public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.print("\n 1. Перевод псевдокода на язык Java");
        int age = 15;
        if (age > 20) {
        System.out.print("\n ваш возраст больше двадцати лет");
        } else {
        System.out.print("\n ваш возраст меньше двадцати лет");
        }
        boolean maleGender = false;
        if(maleGender != true) {
        System.out.print("\n пол женский");
        }
        double height = 1.79;
        if(height < 1.80) {
        System.out.print("\n рост меньше 180 см.");
        } else {
        System.out.print("\n рост больше 180 см.");
        }
        char firstLetterName = "Irina".charAt(0);
        if(firstLetterName == 'M') {
        System.out.println("\n M первая буква имени");
        } else if (firstLetterName == 'I') {
        System.out.println("\n I первая буква имени");
        } else {
        System.out.println("\n другая первая буква имени");
        }

        System.out.print("\n 2. Поиск max и min числа");
        int var1 = 321;
        int var2 = 123;
        if (var1 > var2) {
        System.out.println("\n число max: " + var1 + ", число min: " + var2);
        } else if (var1 < var2) {
        System.out.println("\n число max: " + var2 + ", число min: " + var1);
        }

        System.out.print("\n 3. Работа с числом");
        int var3 = 0;
        System.out.print("\n число для проверки: "+ var3);
        if (var3 == 0) {
        System.out.println("\n является нулем");
        } else if (var3 % 2 == 0 && var3 > 0) {
        System.out.print("\n является четным и положительным");
        } else if (var3 % 2 == 0 && var3 < 0) {
        System.out.print("\n является четным и отрицательным");
        } else {
        System.out.println("\n является нечетным и отрицательным");
        }
        
        System.out.print("\n 4. Поиск одинаковых цифр в числах");
        int hundreds1 = var1 / 100;
        int tens1 = var1 / 10 % 10;
        int units1 = var1 % 10;
        int hundreds2 = var2 / 100;
        int tens2 = var2 / 10 % 10;
        int units2 = var2 % 10;
        System.out.print("\n в числах " + var1 + " и " + var2 + " одинаковые цифры ");
        if (hundreds1 == hundreds2) {
            if (tens1 == tens2) {
                if (units1 == units2) {
                    System.out.print(hundreds1 + " , " + tens1 + " , " + units1);
                    System.out.println(" стоят в 1, 2, 3 разрядах");
                } else {
                    System.out.println(hundreds1 + " , " + tens1 + " стоят в 1, 2 разрядах");
                }
            } else {
                System.out.println(hundreds1 + " стоят в 1 разряде");
            }
        } else if (tens1 == tens2) {
            if (units1 == units2) {
                System.out.println(tens1 + " , " + units1 + " стоят в 2, 3 разрядах");
            } else {
                System.out.println(tens1 + " стоят в 2 разряде");
            }
        } else if (units1 == units2) {
            System.out.println(units1 + " стоят в 3 разряде");
        } else {
            System.out.println("отсутствуют");
        }

        System.out.print("\n 5. Определение буквы, числа или символа по их коду");
        char var4 = '\u0057';
        if (var4 >= 48 && var4 <= 57) {
        System.out.println("\n"  + var4 + " это число");
        } else if (var4 >= 65 && var4 <= 90 || var4 >= 97 && var4 <= 122) {
        System.out.println("\n"  + var4 + " маленькая (большая) буква");
        } else {
        System.out.println("\n"  + var4 + " не буква и не число");
        }
        
        System.out.print("\n 6. Определение суммы вклада и начисленных банком %");
        double sumDepo = 300000;
        System.out.print("\n сумма вклада равна " + sumDepo + " руб.");
        double rate5perc = sumDepo * 0.05;
        double rate7perc = sumDepo * 0.07;
        double rate10perc = sumDepo * 0.1;
        double sumGen5perc = sumDepo + rate5perc;
        double sumGen7perc = sumDepo + rate7perc;
        double sumGen10perc = sumDepo + rate10perc;
        if (sumDepo < 100000) {
        System.out.print("\n начислено 5% итоговая сумма с процентом "+ sumGen5perc + " руб.");
        } else if (sumDepo >= 100000 && sumDepo < 300000) {
        System.out.print("\n начислено 7% итоговая сумма с процентом "+ sumGen7perc + " руб.");
        } else {
        System.out.println("\n начислено 10% / итоговая сумма с процентом "+ sumGen10perc + " руб.");
        }

        System.out.print("\n 7. Определение оценки по предметам");
        int persentHist = 59;
        int persentProg = 91;
        int gradeHist = 0;
        int gradeProg = 0;
        if (persentHist <= 60) {
            gradeHist = 2;
        System.out.print("\n студент получил оценку 2 по истории");
        } else if (persentHist > 60 && persentHist <= 72) {
            gradeHist = 3;
        System.out.print("\n студент получил оценку 3 по истории");
        } else if (persentHist > 73 && persentHist <= 90) {
            gradeHist = 4;
        System.out.print("\n студент получил оценку 4 по истории");
        } else if (persentHist >= 91) {
            gradeHist = 5;
        System.out.print("\n студент получил оценку 5 по истории");
        }
        if (persentProg <= 60) {
            gradeProg = 2;
        System.out.print("\n студент получил оценку 2 по программированию");
        } else if (persentProg > 60 && persentProg <= 72) {
            gradeProg = 3;
        System.out.print("\n студент получил оценку 3 по программированию");
        } else if (persentProg > 73 && persentProg <= 90) {
            gradeProg = 4;
        System.out.print("\n студент получил оценку 4 по программированию");
        } else if (persentProg >= 91) {
            gradeProg = 5;
        System.out.print("\n студент получил оценку 5 по программированию");
        }
        int midGrade = (gradeHist + gradeProg) / 2;
        System.out.print("\n студент получил среднюю оценку " + midGrade);
        int midPersent = (persentHist + persentProg) / 2;
        System.out.println("\n средний % по двум предметам " + midPersent);

        System.out.print("\n 8. Расчет прибыли");
        int sumRentMounth = 5000;
        int sumSalesMounth = 13000;
        int costPriceMounth = 9000;
        int sumRentYear = sumRentMounth * 12;
        int sumSalesYear = sumSalesMounth * 12;
        int costPriceYear = costPriceMounth * 12;
        int profitYear = sumSalesYear - (sumRentYear + costPriceYear);
        if (profitYear < 0) {
        System.out.println("\n прибыль за год: " + profitYear + " руб.");
        } else {
        System.out.println("\n прибыль за год: +" + profitYear + " руб.");
        }

        System.out.print("\n 9. Подсчет количества банкнот");
        int needSumCash = 567;
        int hundreds = needSumCash / 100;
        int tens = needSumCash / 10 % 10;
        int units = needSumCash % 10;
        int numBanknotes = hundreds + tens + units;
        System.out.print("\n из банкомата необходимо снять " + needSumCash + " USD");
        System.out.print("\n в банкомате есть банкноты номиналом 1, 10, 100 USD");
        System.out.print("\n банкомат должен выдать необходимую сумму с помощью " +
        numBanknotes + " банкнот");
        System.out.print("\n требуется " + hundreds + " банкнот номиналом 100 USD");
        System.out.print("\n требуется " + tens + " банкнот номиналом 10 USD");
        System.out.print("\n требуется " + units + " банкнот номиналом 1 USD");
        //if (hundreds <= 10) {
        //System.out.print("\n 100 USD банкнот достаточно для выдачи");
        //}
        if (tens <= 5) {
        System.out.print("\n банкнот номиналом 10 USD достаточно для выдачи");
        } else {
        int addBanknotes = tens - 5;
        units += addBanknotes * 10;
        tens -= addBanknotes;
        System.out.print("\n доступно 5 банкнот номиналом 10 USD " +
        "необходимо добавить 10 купюр по 1 USD");
        }
        //if (units <= 10) {
        //System.out.print("\n купюр номиналом 1 USD достаточно для выдачи");
        //}
        int countBanknotes = hundreds + tens + units;
        System.out.print("\n банкомат выдаст необходимую сумму с помощью " +
         countBanknotes + " банкнот");
        int needSumCash2 = hundreds * 100 + tens * 10 + units;
        System.out.print("\n из банкомата будет выдана сумма " + needSumCash2 + " USD");
    }
}
