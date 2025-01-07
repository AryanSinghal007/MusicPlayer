import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        UserMenu menu = new UserMenu();
        menu.displayMenu();
        
       

        // Add songs to the album
        Album album = new Album("Album 1", "Artist 1");
        album.addSong("Song 1", 3.5);
        album.addSong("Song 2", 4.0);
        album.addSong("Song 3", 3.0);
        album.addSong("Song 4", 3.5);
        album.addSong("Song 5", 4.0);
        album.addSong("Song 6", 3.0);
        album.addSong("Song 7", 3.5);
        album.addSong("Song 8", 4.0);
        album.addSong("Song 9", 3.0);
        album.addSong("Song 10", 3.5);


        // Add songs to the playlist
        album.addToPlaylist(new Song("Song 1", 3.5));
        album.addToPlaylist(new Song("Song 2", 4.0));
        album.addToPlaylist(new Song("Song 3", 3.0));


        // album.printPlaylist();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        menu.UserInput(n);

        scanner.close();
    }
}
