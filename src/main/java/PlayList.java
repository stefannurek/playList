import java.util.ArrayList;
import java.util.List;

public class PlayList implements Playable {

    private List<Playable> tracks = new ArrayList<Playable>();

    public void add(Playable playable) {
        tracks.add(playable);
    }

    public void play() {
        tracks.stream()
                .forEach(a-> a.play());
    }
}
