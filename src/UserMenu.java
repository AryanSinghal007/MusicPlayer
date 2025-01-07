public class UserMenu extends Playlist{

    public void displayMenu() {
        System.out.println("1. Play next song");
        System.out.println("2. Play previous song");
        System.out.println("3. Delete current song");
        System.out.println("4. Print playlist");
        System.out.println("5. Quit");
    }

    public void quit() {
        System.out.println("Goodbye!");
        System.exit(0);
    }

    Playlist playlist = new Playlist();

    public void UserInput(int n){
        switch(n){
            case 1:
                // System.out.println("Playing next song");
                playlist.playNextSong();
                break;
            case 2:
                // System.out.println("Playing previous song");
                playlist.playPreviousSong();
                break;
            case 3:
                // System.out.println("Deleting current song");
                playlist.deleteCurrentSong();
                break;
            case 4:
                // System.out.println("Printing playlist");
                playlist.printPlaylist();
                break;
            case 5:
                quit();
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
