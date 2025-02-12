import java.util.ArrayList;

public class Album {
    String title;
    String artist;
    ArrayList<Song> SongList = new ArrayList<Song>();
    

    public Album(){

    }

    public Album(String title, String artist){
        this.title = title;
        this.artist = artist;
        this.SongList = new ArrayList<Song>();
        
    }

    public void addSong(String title, double duration){
        if(this.findSong(title)){
            System.out.println("Song is already present in the album");
        }
        else{
            Song song = new Song(title, duration);
            this.SongList.add(song);
        }
    }
    
    public boolean findSong(String title){

        if(SongList.isEmpty()){
            return false;
        }
        
        for (Song elem: SongList){
            if(elem.getTitle().equals(title)){
                return true;
            }
        }

        return false;

    }
}
