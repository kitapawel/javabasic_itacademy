package Week8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public enum DayOfWeek {
    MON("Monday","Poniedziałek", true),
    TUE("Tuesday","Wtorek",true),
    WED("Wednesday","Sroda", true),
    THU("Thursday","Czwartek", true),
    FRI("Friday","Piątek", true),
    SAT("Saturday","Sobota",false),
    SUN("Sunday","Niedziela", false);

    private String englishName;
    private String polishName;
    private boolean workingDay;

    private int index;

    DayOfWeek(String englishName, String polishName, boolean workingDay) {
        this.englishName = englishName;
        this.polishName = polishName;
        this.workingDay = workingDay;
    }

    public static DayOfWeek fromPolishName (String polishName){
        for (DayOfWeek dayOfWeek: DayOfWeek.values()){
            if (dayOfWeek.polishName.equals(polishName)){
                return dayOfWeek;
            }
        }
        throw new IllegalArgumentException("There are no days of week in PL with name " + polishName);
    }
    public static DayOfWeek fromEnglishName (String englishName){
        for (DayOfWeek dayOfWeek: DayOfWeek.values()){
            if (dayOfWeek.englishName.equals(englishName)){
                return dayOfWeek;
            }
        }
        throw new IllegalArgumentException("There are no days of week in PL with name " + englishName);
    }

    public static boolean isWeekend (String dayID){
        if(dayID == "SUN" || dayID =="SAT"){
                return true;
            } else {
            //if(dayID == "MON" || dayID =="TUE" || dayID =="WED" || dayID == "THU" || dayID == "FRI") {
                return false;
            }
    }

    public static ArrayList<DayOfWeek> getWeekendDays() {
        ArrayList<DayOfWeek> weekendDays = new ArrayList<DayOfWeek>();

        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            if (dayOfWeek.workingDay == false){
                weekendDays.add(dayOfWeek);
            }
        }
        return weekendDays;
    }

    public static ArrayList<DayOfWeek> getWorkingDays() {
        ArrayList<DayOfWeek> workingDays = new ArrayList<DayOfWeek>();

        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            if (dayOfWeek.workingDay == true){
                workingDays.add(dayOfWeek);
            }
        }
        return workingDays;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getPolishName() {
        return polishName;
    }

    public boolean isWorkingDay() {
        return workingDay;
    }
}
