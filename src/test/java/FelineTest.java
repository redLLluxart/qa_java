import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void eatMeatTest() throws Exception {

        Feline feline = new Feline();
        assertEquals(List.of("Животные", "Птицы", "Рыба"),feline.eatMeat());

    }

    @Test
    public void getFamilyTest(){

        Feline feline = new Feline();
        assertEquals("Кошачьи",feline.getFamily());

    }

    @Test
    public void getKitensTest(){

        Feline feline = new Feline();
        assertEquals(feline.getKittens(1),feline.getKittens());

    }

    @Test
    public  void  getKitencCountTest(){

        int kittenCount = 1;
        Feline feline = new Feline();
        assertEquals(kittenCount,feline.getKittens(kittenCount));

    }

}
