import com.example.Feline;
import com.example.LionAlex;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionAlexTest {

    @Before
    public void setup(){

        MockitoAnnotations.initMocks(this);

    }

    @Mock
    Feline feline;


    @Test
    public void getFriendsTest() throws Exception {

        LionAlex lionAlex = new LionAlex(feline);
        assertEquals(List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман"),lionAlex.getFriends());
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {

        LionAlex lionAlex = new LionAlex(feline);
        assertEquals("Нью-Йоркский зоопарк",lionAlex.getPlaceOfLiving());

    }

    @Test
    public void getKittensTest() throws Exception {

        LionAlex lionAlex = new LionAlex(feline);
        assertEquals(0,lionAlex.getKittens());

    }
}
