public class Main {

    public static void main(String[] args) {
        Continent highest = Continent.getContinentWithHighestArea();
        Continent smallest = Continent.getContinentWithSmallestArea();
        System.out.println("Najmniejsza powierzchnia: " + smallest.getName() + " wynosi " + smallest.getAreaInKilometrs() + "mln km");
        System.out.println("Najwieksza powierzchnia: " + highest.getName() + " wynosi " + highest.getAreaInKilometrs() + "mln km");
    }

    public class A {

    }

    public interface B {

    }

    public enum C {

    }
}
