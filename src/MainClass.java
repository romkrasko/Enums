import javax.annotation.processing.SupportedSourceVersion;

public class MainClass {
    public static void main(String[] argv) {

        Days days = Days.WEDNESDAY;

        System.out.println("Current - " + days);
        System.out.println("After tomorroy - " + days.getBeforeYesterday(days));
        System.out.println("Before yesterday - " + days.getAfterTomorroy(days));


        System.out.println();

        Seasons season = Seasons.SUMMER;
        System.out.println("Current - " + season);
        System.out.println("Next season - " + season.getNext(season));
        System.out.println("Prev season - " + season.getPrev(season));
    }
}


/*
# Задачи на перечисления
1) Перечисление для представления дней недели
  Реализовать перечисление "День недели"
  В перечислении "День недели" добавить функции получения дня "позавчера" и "послезавтра".
  Протестировать перечисление в функции main() тестового класса.

 2) Перечисление для представления сезона*
  Создать перечисление "Сезон".
  Описать метод получения предыдущего и последующего сезона.
  Протестировать перечисление в функции main() тестового класса.
  */