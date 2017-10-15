import org.jfugue.*;

public class NewClass
{
public static void main(String[] args)
{
    Player player = new Player();
    Pattern pattern = new Pattern("C D E F G A B c  Cmaj Gmaj9 Cmaj9 Gmaj9 Fmaj Fmaj Fmaj Cmaj Gmaj Cmaj Gmaj Fmaj Fmaj Fmaj");

    player.play(pattern);
    System.exit(0);
}
}