package Week8;

public enum DayOfWeek {
    MON("Poniedziałek"),
    TUE("Wtorek"),
    WED("Sroda"),
    THU("Czwartek"),
    FRI("Poniedziałek"),
    SAT("Poniedziałek"),
    SUN("Poniedziałek");

    private String polishName;

    DayOfWeek(String polishName) {
        this.polishName = polishName;
    }

    public static DayOfWeek fromPolishName (String polishName){
        for (DayOfWeek dayOfWeek: DayOfWeek.values()){
            if (dayOfWeek.equals(polishName)){
                return dayOfWeek;
            }
        }
        throw new IllegalArgumentException("There are no days of week in PL with name " + polishName);
    }
}
