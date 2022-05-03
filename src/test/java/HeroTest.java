import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class HeroTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {

    }
    @Test
    public void NewHeroObjectCorrectlyCreated_true() throws Exception{
        Hero myHero = new Hero("Nick", 25, "Fast thinker", "Impatience");
        assertEquals(true, myHero instanceof Hero);

    }
}
