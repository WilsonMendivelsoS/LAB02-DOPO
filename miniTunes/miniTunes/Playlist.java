//Each song is described by its title, artist, genre, duration, and rating.
//The title and artist are mandatory. The genre, duration, and rating may be unknown.
//The combination (title, artist) must be unique. Two songs cannot have the same title and artist.
//The duration (minutes) must be between 1 and 9.
//The rating must be between * and *****.
/**
 * It represents a Playlist.
 * songs
 * 
 */
// Inv: Todas las canciones deben tener el nombre de la canción y el nombre del autor.
public class Playlist {
    
    private String[][] songs;
    
    
    public Playlist(String [][] songs){
        this.songs = new String[0][5];
        for( String[] i: songs){
            if(i.length ==5){
                if(i[0]!=null && i[1]!=null){
                    if(Integer.parseInt(i[3]) >=1 && Integer.parseInt(i[3]) <=9){
                        int cant = 0;
                        for(int j=0; j < i[4].length(); j++){
                            if(i[4].charAt(j) == '*'){
                                cant++;
                            }
                            if(cant >5){
                                break;
                            }
                        }
                        if(cant>= 1 && cant<=5){
                            String[][] temp = new String[size() + 1][5]; 
                            for(int k =0; k < size(); k++){
                                temp[k] = this.songs[0];
                            }
                            temp[size()] = i;
                            this.songs = temp;
                        }
                    }
                }
            }
        }
    }
    
    public Playlist add(String [] song){
        return null;
    }
    
    public Playlist delete(String [] song){
        return null;
    }
    
    public Playlist select(String [] values){
        return null;
    }      

    public int size(){
        return songs.length;
    }    
    
   
    // Songs are in uppercase with unnecessary spaces removed.
    // Columns are aligned and separated by three spaces.
    //TITLE    ARTIST          GENRE   DURATION   RATING
    //ONE      U2              ROCK           4   *****
    //NUMB     LINKIN PARK     ROCK           3
    //ALIVE    PEARL JAM       ROCK           5   ****
    //CREEP    RADIOHEAD       ROCK               *****
    //DREAMS   FLEETWOOD MAC   .              4   ****
    public String toString() {
      return "";
    }
    
    public boolean equals(Playlist pl){
        return false;
    }
    
    public boolean equals(Object o){
        return equals((Playlist)o);
    }
}
