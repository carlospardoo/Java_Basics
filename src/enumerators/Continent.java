package enumerators;

public enum Continent {

    AFRICA(53),
//    AFRICA(53, "1.2 billones"),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14)
    ;

    private final int countries;

    Continent(int countries){
        this.countries = countries;
    }

    public int getCountries() {
        return countries;
    }
}
