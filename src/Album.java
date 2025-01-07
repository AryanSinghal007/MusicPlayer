import java.util.ArrayList;

public class Album extends Playlist{
    String title;
    String artist;
    ArrayList<Song> SongList;

    public Album(String title, String artist){
        this.title = title;
        this.artist = artist;
        this.SongList = new ArrayList<Song>();
    }

    protected void addSong(String title, double duration){
        if(findSong(title)){
            System.out.println("Song is already present in the album");
        }
        else{
            Song song = new Song(title, duration);
            this.SongList.add(song);
        }
    }
    

    public boolean findSong(String title){
        
        for (Song elem: SongList){
            if(elem.getTitle().equals(title)){
                return true;
            }
        }

        return false;

    }

    public void addToPlaylist(Song song){
        if(findSong(song.getTitle())){
            System.out.println("Song added to playlist");
            playlist1.add(song);
        }
        else{
            System.out.println("Song not found in the album");
        }
    }
}
