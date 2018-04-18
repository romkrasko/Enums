public enum Days {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public Days getAfterTomorroy(Days day) {
        switch (day) {
            case MONDAY:
                day = WEDNESDAY;
                break;
            case TUESDAY:
                day = THURSDAY;
                break;
            case WEDNESDAY:
                day = FRIDAY;
                break;
            case THURSDAY:
                day = SATURDAY;
                break;
            case FRIDAY:
                day = SUNDAY;
                break;
            case SATURDAY:
                day = MONDAY;
                break;
            case SUNDAY:
                day = TUESDAY;
                break;
            default:
                break;
        }
        return day;
    }

    public Days getBeforeYesterday(Days day) {
        switch (day) {
            case MONDAY:
                day = SATURDAY;
                break;
            case TUESDAY:
                day = SUNDAY;
                break;
            case WEDNESDAY:
                day = MONDAY;
                break;
            case THURSDAY:
                day = TUESDAY;
                break;
            case FRIDAY:
                day = WEDNESDAY;
                break;
            case SATURDAY:
                day = THURSDAY;
                break;
            case SUNDAY:
                day = FRIDAY;
                break;
            default:
                break;
        }
        return day;
    }
}
