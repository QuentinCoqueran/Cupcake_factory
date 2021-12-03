import fr.esgi.cupcake.Factory;
import fr.esgi.cupcake.model.Bundle;
import fr.esgi.cupcake.model.Cake;
import fr.esgi.cupcake.model.Prix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CakeTest {

    @Test
    public void should_return_cake_name(){
        Cake cake = Factory.createCake("Cupcake");
        Cake cake2 = Factory.createCake("Cookie");
        Assertions.assertEquals("Cupcake", cake.showRecipe());
        Assertions.assertEquals("Cookie", cake2.showRecipe());
    }

    @Test void should_return_recipe(){
        Cake cake = Factory.createCake("Cupcake with chocolate");
        Cake cake2 = Factory.createCake("Cookie with peanuts and chocolate");
        Cake cake3 = Factory.createCake("Cookie with caramel and chocolate");
        Assertions.assertEquals("Cupcake with chocolate", cake.showRecipe());
        Assertions.assertEquals("Cookie with peanuts and chocolate", cake2.showRecipe());
        Assertions.assertEquals("Cookie with caramel and chocolate", cake3.showRecipe());
    }

    @Test void should_return_price(){
        Cake cake = Factory.createCake("Cupcake with chocolate");
        Cake cake2 = Factory.createCake("Cookie with peanuts and chocolate");
        Cake cake3 = Factory.createCake("Cookie with caramel and chocolate");
        Assertions.assertTrue(Math.abs(cake.showPrice().getMontant()- 1.1) < 0.00001);
        Assertions.assertTrue(Math.abs(cake2.showPrice().getMontant()- 2.3) < 0.00001);
        Assertions.assertTrue(Math.abs(cake3.showPrice().getMontant()- 2.4) < 0.00001);
    }

    @Test void should_return_bundle_price() {
        Cake cake = Factory.createCake("Cupcake with chocolate");
        Cake cake2 = Factory.createCake("Cookie with peanuts and chocolate");
        List<Cake> cakes = new ArrayList<>();
        cakes.add(cake);
        cakes.add(cake2);
        Bundle bundle = new Bundle(cakes);
        Assertions.assertTrue(Math.abs(bundle.getPrix().getMontant()-3.06) < 0.00001);
    }

    @Test void should_return_expired() {
        Cake cake = Factory.createCake("Cupcake with chocolate");
        cake.setCookDate(LocalDateTime.of(2021, 11, 1, 9, 30, 12));
        Assertions.assertTrue(cake.isExpired());
    }
}
