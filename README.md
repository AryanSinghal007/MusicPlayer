# Music Player Application

## Description
This is a simple console-based Music Player application developed in Java. It allows users to manage playlists, play songs, and navigate through them efficiently. The program is built using basic OOP principles and Java's data structures.

## Collaborators
- Aryan Singhal : [AryanSinghal007](https://github.com/AryanSinghal007)
- Ansh Bathla : [anshbathla](https://github.com/anshbathla)

## Features
1. **Create and Manage Playlists**:
   - Add songs to a playlist.
   - Remove songs from the playlist.

2. **Album Management**:
   - Store albums containing songs with attributes like title and artist.
   - Search for songs within albums.

3. **Song Navigation**:
   - Play the next song.
   - Play the previous song.
   - Remove the currently playing song.

4. **Playlist Interaction**:
   - Print the list of songs in the playlist.
   - Quit the application.


## Class Structure

### 1. **Song**
- **Attributes**: `title`, `duration`
- **Constructor**: Initializes song details.

### 2. **Album**
- **Attributes**: `albumTitle`, `artist`, `list<Song>`
- **Functionality**: 
  - Find songs by title within the album.

### 3. **Playlist**
- **Attributes**: `LinkedList<Song>`
- **Functionality**:
  - Add a song to the playlist.
  - Remove a song from the playlist.

### 4. **Menu**
- Handles user inputs to perform operations like:
  1. Quit the application.
  2. Play the next song.
  3. Play the previous song.
  4. Remove the currently playing song.
  5. Print the playlist.

### 5. **Main**
- The entry point of the application.
- Handles user interactions and invokes menu operations.


## How to Run

1. Clone the repository to your local system.
2. Ensure you have **Java JDK** installed (version 8 or higher).
3. Compile the Java files using the following command:

   ```bash
   javac App.java
4. Run the program

   ```bash
   javac App

## Future Enhancements

1. Add support for song metadata such as genre, release year, etc.

2. Implement GUI for a better user experience.

3. Add search functionality within playlists.

4. Integrate multimedia libraries to play actual audio files.

## Contributing
Contributions are welcome! Please fork the repository and submit a pull request for review.

## License
This project is licensed under the MIT License.
