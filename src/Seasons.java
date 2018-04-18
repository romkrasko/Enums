public enum Seasons {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN;

    public Seasons getNext(Seasons season) {
        switch (season) {
            case WINTER:
                season = SPRING;
                break;
            case SPRING:
                season = SUMMER;
                break;
            case SUMMER:
                season = AUTUMN;
                break;
            case AUTUMN:
                season = WINTER;
                break;
            default:
                break;
        }
        return season;
}

    public Seasons getPrev(Seasons season) {
        switch (season) {
            case WINTER:
                season = AUTUMN;
                break;
            case SPRING:
                season = WINTER;
                break;
            case SUMMER:
                season = SPRING;
                break;
            case AUTUMN:
                season = SUMMER;
                break;
            default:
                break;
        }
        return season;
    }
}
/*) Перечисление для представления сезона*
  Создать перечисление "Сезон".
  Описать метод получения предыдущего и последующего сезона.
  Протестировать перечисление в функции main() тестового класса.*/