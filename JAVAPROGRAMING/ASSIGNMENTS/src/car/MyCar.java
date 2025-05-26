package car;

import java.math.BigDecimal;

public class MyCar {
    public static void main(String[] args) {
        Car maVoiture = new Car("GENESIS", "BLUE", "G70", 2022, 30000.0, 10000d);

     maVoiture.salleCar();

        System.out.println(maVoiture.getColor());

    }
}
