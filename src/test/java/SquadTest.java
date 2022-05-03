import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SquadTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void NewSquadObjectGetsCorrectlyCreated_true() throws Exception{
        Squad squad = new Squad(10, "Titans", "Fight cybercrime");
        assertEquals(true, squad instanceof Squad);
    }
}
