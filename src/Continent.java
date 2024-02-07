public enum Continent {

    AFRYKA("Afryka",30.4),
    AMERYKA_POLUDNIOWA("Ameryka Południowa",17.8),
    AMERYKA_POLNOCNA("Ameryka Północna",24.2),
    ANTARKTYDA("Antarktyda",13.2),
    AUSTRALIA("Australia",7.7),
    EUROPA("EUROPA",10.2),
    AZJA("Azja",44.6);

    public static Continent getContinentWithSmallestArea(){
        Continent smalest = Continent.AFRYKA;
        for (Continent continent : Continent.values()){
            if(continent.getAreaInKilometrs() < smalest.getAreaInKilometrs()){
                smalest = continent;
            }
        }
        return smalest;
    }
    public static Continent getContinentWithHighestArea(){
        Continent highest = Continent.AFRYKA;
        for (Continent continent : Continent.values()){
            if(continent.getAreaInKilometrs() > highest.getAreaInKilometrs()){
                highest = continent;
            }
        }
        return highest;
    }

    private double areaInKilometrs;
    Continent(String name, double areaInKilometrs){
        this.areaInKilometrs = areaInKilometrs;
    }

    public String getName() {
        return this.name().replace("_", " ").toLowerCase();
    }

    public double getAreaInKilometrs() {
        return areaInKilometrs;
    }
}
