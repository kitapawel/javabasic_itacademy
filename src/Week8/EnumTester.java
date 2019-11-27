package Week8;

public class EnumTester {
    public static void main(String[] args) {
        WeatherTypes weatherType = WeatherTypes.SMOG;
        System.out.println(weatherType);
        System.out.println(weatherType.compareTo(WeatherTypes.RAIN));
        System.out.println(weatherType.equals(WeatherTypes.RAIN));
        System.out.println(weatherType == WeatherTypes.SMOG);

        switch (weatherType){
            case RAIN:
                System.out.println("Its raining.");
                break;
            case SMOG:
                System.out.println("It's foggy");
                break;
            default:
                System.out.println("Jako tako.");
        }

        System.out.println(Planet.MARS.getDiameter());
        System.out.println(Planet.valueOf("VENUS").getRadius());
        System.out.println(Planet.EARTH.ordinal()); //order will change if order inside enum is changed - usage is risky

        for (Planet planet : Planet.values()){
            System.out.println(planet.name());
        }
        System.out.println(DayOfWeek.fromPolishName("Wtorek"));
        //System.out.println(DayOfWeek.fromPolishName("Podzienialek"));
        System.out.println(DayOfWeek.fromEnglishName("Monday"));
        System.out.println(DayOfWeek.fromEnglishName("Saturday"));
        System.out.println(DayOfWeek.isWeekend("MON"));
        System.out.println(DayOfWeek.isWeekend("TUE"));
        System.out.println(DayOfWeek.isWeekend("SUN"));
        System.out.println(DayOfWeek.isWeekend("SAT"));
        System.out.println(DayOfWeek.isWeekend("ST"));
        System.out.println(DayOfWeek.getWeekendDays());
        System.out.println(DayOfWeek.getWorkingDays());

    }
}
