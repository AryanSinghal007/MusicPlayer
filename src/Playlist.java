import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {

    public LinkedList<Song> playlist1 = new LinkedList<Song>();
    public ListIterator<Song> it = playlist1.listIterator();

    public Playlist(){
        this.playlist1 = new LinkedList<Song>();
        this.it = playlist1.listIterator();
    }

    public void playNextSong() {
        // System.out.println("Playing next song");

        if(it.hasNext()){
            System.out.println(it.next().toString());
        }else{
            System.out.println("End of playlist");
        }
    }

    public void playPreviousSong() {
        System.out.println("Playing previous song");

        if(it.hasPrevious()){
            System.out.println(it.previous().toString());
        }else{
            System.out.println("Start of playlist");
        }
    }

    public void deleteCurrentSong() {
        System.out.println("Deleting current song");

        it.remove();
        if(it.hasNext()){
            System.out.println("Playing next song...");
            System.out.println(it.next().toString());
        }
        else if(it.hasPrevious()){
            System.out.println("Playing prev song...");
            System.out.println(it.previous().toString());
        }else{
            System.out.println("End of playlist");
        }
    }

    public void printPlaylist() {
        System.out.println("Your playlist...");
        for (Song song : this.playlist1) {
            System.out.println(song.toString());
        }
    }

}