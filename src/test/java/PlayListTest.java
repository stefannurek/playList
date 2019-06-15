import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static junit.framework.TestCase.assertTrue;

public class PlayListTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    private static PlayList playlist;

    @Before
    public void initializePlaylist() {
        playlist = new PlayList();
        playlist.add(new Movie("Casablanca"));
        playlist.add(new Song("Chlopaki nie płaczą"));
        playlist.add(new Song("Lambada"));
    }

    @Test
    public void testSequencePlaylist() {
        playlist.play();
        assertTrue(systemOutRule.getLog().contains("Film: Casablanca"));
        assertTrue(systemOutRule.getLog().contains("Muzyka: Lambada"));
    }
}
