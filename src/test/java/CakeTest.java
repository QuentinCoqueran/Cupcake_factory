import fr.esgi.cupcake.Factory;
import fr.esgi.cupcake.model.Cake;
import fr.esgi.cupcake.model.Prix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        Assertions.assertEquals(1.1, cake.showPrice().getMontant());
        Assertions.assertEquals(2.3, cake2.showPrice().getMontant());
        Assertions.assertEquals(2.4, cake3.showPrice().getMontant());
    }
}
