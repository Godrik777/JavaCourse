public class Homework1 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
    }

    public static void ex1() {
        //Дана строка
        String name = "     ПЕтРов Олег Иванович     ";
        //Необходимо
        //1. убрать лишние пробелы,
        //2. перевести текст в верхний регистр
        //3. Если содержит "ова " то печатаем на экран: Уважаемая {name}
        // Если содержит "ов " то печатаем на экран: Уважаемый {name}
        // В иных случаях печатаем на экран: Неизвестное лицо {name}
        String nameCorrect = name.trim().toUpperCase();
        if (nameCorrect.contains("ова ")) {
            System.out.println("Уважаемая " + nameCorrect);
        } else if (nameCorrect.contains("ов ")) {
            System.out.println("Уважаемый " + nameCorrect);
        } else
            System.out.println("Неизвестное лицо " + nameCorrect);
    }

    public static void ex2() {
        //У нас есть машина. В данной машине есть перечень проверок, перед запуском
        //Количество топлива
        double fuel = 10;
        //Проверка двигателя
        boolean isEngineWork = true;
        //Проверка отсутствия ошибок (false - ошибок нет)
        boolean hasErrors = false;
        //Датчики давления шин
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        //Поменять(убрать, поставить) логические операторы так, чтобы машина запускалась:
        // когда топлива не меньше 10 литров, двигатель работает, колеса все работают, нет ошибок
        //В ином случае, машина не должна запускаться
        if (fuel >= 10 && (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4) && !hasErrors && isEngineWork) {
            System.out.println("Машина работает");
        } else {
            System.out.println("Машина не работает");
        }
    }

    public static void ex3() {
        //Работа на самостоятельное изучение методов.
        //Заменить в строке все 'this is' на 'those are', получить индекс (число) второй буквы 'o' в строке
        //Распечатать полученный индекс
        String simply = "this is simply. This is my favorite song.";
        String simplyReplace = simply.replaceAll("this is", "those are");
        int index = simplyReplace.indexOf('o', 3);
        System.out.println(index);
    }

    public static void ex4() {
        //Компания Рога и Копыта производит мясные продукты.
        //Перечень производимых товаров :
        //Колбаса - стоимость 800 руб,
        //себестоимость при производстве меньше 1000 кг - 412руб,
        //себестоимость при производстве от 1000 до 2000 (не включая) - 408 руб
        //себестоимость при производстве от 2000кг - 404 руб

        //Ветчина - стоимость 350 руб
        //себестоимость при производстве - 275 руб

        //Шейка - стоимость 500 руб
        //себестоимость при производстве меньше 500кг - 311 руб
        //себестоимость при производстве больше или равно 500кг - 299 руб

        //Финансовые показатели
        //Доход компании считается как умножение стоимости на количество проданных кг
        //Расход компании считается как умножение себестоимости на количество проданных кг + миллион рублей
        //Прибыль до налогов считается как: доход - расход
        //Налоги считаются так:
        // прибыль до налогов больше 2_000_000, облагается ставкой 13%
        // прибыль до налогов больше 1_000_000 от 2_000_000, облагается ставкой 10%
        // прибыль до налогов меньше 1_000_000, облагается ставкой 8%
        //пример расчета налогов для прибыли до налогов 2_500_000:
        //1_000_000 - налог 80_000 - по ставке 8%
        //1_000_000 - налог 100_000 - по ставке 10%
        //500_000 - 65_000 - по ставке 13%
        //Итоговый налог: 80_000 + 100_000 + 65_000 = 245_000
        //Прибыль после налогов: прибыль до налогов - налог.

        //Необходимо создать универсальную систему расчетов прибыли после налогов,
        //Т.е на вход подаются данные по количеству произведенных продуктов
        // и печатается прибыль после налогов компании
        //Узнать прибыль после налогов, при продаже:
        //Колбасы 2000кг
        //Ветчины 8511кг
        //Шейки 6988кг

        //Колбаса
        int sausagePrice = 800;
        int sausageCount = 2000;
        int sausageIncome = sausagePrice * sausageCount;
        int sausageProductionPrice = 0;
        if (sausageCount < 1000) {
            sausageProductionPrice = 412;
        } else if (sausageCount >= 1000 && sausageCount < 2000) {
            sausageProductionPrice = 408;
        } else if (sausageCount >= 2000) {
            sausageProductionPrice = 404;
        }
        int sausageCost = sausageProductionPrice * sausageCount;

        //Ветчина
        int hamPrice = 600;
        int hamCount = 8511;
        int hamIncome = hamPrice * hamCount;
        int hamProductionPrice = 275;
        int hamCost = hamProductionPrice * hamCount;

        //Шейка
        int neckPrice = 500;
        int neckCount = 6988;
        int neckIncome = neckPrice * neckCount;
        int neckProductionPrice = 0;
        if (neckCount < 500) {
            neckProductionPrice = 311;
        } else if (neckCount >= 500) {
            neckProductionPrice = 299;
        }
        int neckCost = neckProductionPrice * neckCount;

        //Финансовые показатели до налогов
        int income = sausageIncome + hamIncome + neckIncome;
        int cost = sausageCost + hamCost + neckCost + 1_000_000;
        double profit = income - cost;
        System.out.println("Прибыль до налогов = " + profit + " руб.");

        //Финансовые показатели после налогов
        double taxesTotal = 0;
        double sum = 0;
        double tax;
        while (true) {
            if (profit > 2_000_000) {
                sum = profit - 2_000_000;
                tax = sum * 0.13;
                profit -= sum;
                taxesTotal += tax;
                System.out.println("Сумма = " + sum + " руб. Облагается ставкой 13%. Налог = " + tax + " руб.");
            } else if (profit > 1_000_000 && profit <= 2_000_000) {
                sum = profit - 1_000_000;
                tax = sum * 0.10;
                profit -= 1_000_000;
                taxesTotal += tax;
                System.out.println("Сумма = " + sum + " руб. Облагается ставкой 10%. Налог = " + tax + " руб.");
            } else if (profit > 0 && profit <= 1_000_000) {
                profit -= 1_000_000;
                tax = 1_000_000 * 0.08;
                taxesTotal += tax;
                System.out.println("Сумма = " + sum + " руб. Облагается ставкой 8%. Налог = " + tax + " руб.");
            } else {
                System.out.println("Общая сумма налогов = " + taxesTotal + " руб.");
                break;
            }
        }
    }
}
