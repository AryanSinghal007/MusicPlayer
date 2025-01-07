import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist  {

    public LinkedList<Song> playlist1;
    public ListIterator<Song> it;

    public Playlist(){
        this.playlist1 = new LinkedList<Song>();
        this.it = playlist1.listIterator();
    }

    public  void playNextSong() {
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

    // public void deleteCurrentSong() {
    //     System.out.println("Deleting current song");
    //     ListIterator<Song> curr = it;
    //     it.remove();
    //     if(curr.hasNext()){
    //         System.out.println("Playing next song...");
    //         System.out.println(it.next().toString());
    //     }
    //     else if(curr.hasPrevious()){
    //         System.out.println("Playing prev song...");
    //         System.out.println(it.previous().toString());
    //     }else{
    //         System.out.println("End of playlist");
    //     }
    // }

    public void deleteCurrentSong() {
        System.out.println("Deleting current song");
        if (it.hasNext()) {
            it.next(); // Move to the next element
            it.remove(); // Remove the current element
            if (it.hasNext()) {
                System.out.println("Playing next song...");
                System.out.println(it.next().toString());
            } else if (it.hasPrevious()) {
                System.out.println("Playing prev song...");
                System.out.println(it.previous().toString());
            } else {
                System.out.println("End of playlist");
            }
        } else if (it.hasPrevious()) {
            it.previous(); // Move to the previous element
            it.remove(); // Remove the current element
            if (it.hasNext()) {
                System.out.println("Playing next song...");
                System.out.println(it.next().toString());
            } else if (it.hasPrevious()) {
                System.out.println("Playing prev song...");
                System.out.println(it.previous().toString());
            } else {
                System.out.println("End of playlist");
            }
        } else {
            System.out.println("No song to delete");
        }
    }
    
    public void addToPlaylist(String title, Double duration, Album album) {
        if (album.findSong(title)) {
            System.out.println("Song added to playlist");
            Song song = new Song(title, duration);
            this.playlist1.add(song);
            this.it = playlist1.listIterator();

        } else {
            System.out.println("Song not found in the album");
        }
    }
    public void printPlaylist() {
        System.out.println("Your playlist...");
        for (Song song : this.playlist1) {
            System.out.println(song.toString());
        }
    }
}