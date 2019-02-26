package prWeek12.railFencer;

public class Application {
    public static void main(String[] args) {
        CoordinateCalculator calculator = new CoordinateCalculator();
        System.out.println(calculator.getCoordinatesOfLetters("SERIFERABIA",3));
        System.out.println(calculator.sortedCoordinatesOfLetters("SERIFERABIA",3));
        Encoder encoder = new Encoder();
        System.out.println(encoder.encode("SERIFERABIA",3));
//        System.out.println("------------------------");
//        Decoder decoder = new Decoder();
//        System.out.println(decoder.decode("SFBEIEAIRRA",3));

    }
}
