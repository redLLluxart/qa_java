import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalParameterizedTest {

    public String animalKind;
    public List<String> animalFood;

    public AnimalParameterizedTest(String animalKind, List<String> animalFood) {
        this.animalKind = animalKind;
        this.animalFood = animalFood;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник",List.of("Животные", "Птицы", "Рыба")},
                {"Иное",List.of("Иное")},
        };
    }

    @Test
    public void getFoodTest(){

        try {

            Animal animal = new Animal();
            assertEquals(animalFood,animal.getFood(animalKind));

        } catch (Exception e) {

            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник",e.getMessage());

        }


    }


}
