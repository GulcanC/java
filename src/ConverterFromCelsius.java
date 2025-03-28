public class ConverterFromCelsius {
    public static void main(String[] args) {
        // initialising
        double celsius = 10.0, fahrenheit = 0.0;

        // formula for conversion
        fahrenheit = (celsius*1.8) + 32;
        System.out.println("10 celsius is equal to " + fahrenheit + " fahrenheit");
    }
}
