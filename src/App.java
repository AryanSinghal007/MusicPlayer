import java.util.Scanner;

public class App  {
    public static void main(String[] args) throws Exception {
        
        UserMenu menu = new UserMenu();
        menu.displayMenu();
        
        // Add songs to the album
        Album album = new Album("Album1", "Artist1");
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

        Playlist playlist = new Playlist();

        playlist.addToPlaylist("Song 1", 3.5, album);
        playlist.addToPlaylist("Song 2", 4.0, album);
        playlist.addToPlaylist("Song 3", 3.0, album);

        // playlist.printPlaylist();

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Enter your choice: ");
          
            int n = scanner.nextInt();
            menu.UserInput(n, playlist);

            if(n == 5){
                break;
            }
        }

        scanner.close();
    }
}
