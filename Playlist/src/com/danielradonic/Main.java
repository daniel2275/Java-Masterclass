package com.danielradonic;


import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Album> myAlbums = new ArrayList<>();
    private static LinkedList<Song> playList = new LinkedList<Song>();
    private static String selectedAlbum = "NONE";
    private static boolean playing = false;
    private static Song current;

    public static void main(String[] args) {
        preload(myAlbums);
        String selectedMenu = "MAIN";
        printMenu(selectedMenu);
        System.out.print("Your choice:");
        String selection = scanner.nextLine();


        while (!selection.toUpperCase().equals("Q")) {

            switch (selection) {
                case "1":
                    if (selectedMenu == "MAIN") {
                        Album foundAlbum = findAlbum(selectedAlbum);
                        if (!selectedAlbum.equals("NONE") && foundAlbum != null) {
                            foundAlbum.listSongs();
                        }
                    } else if (selectedMenu.equals("PLAYLIST")) {
                        addToPlaylist();
                    } else if (selectedMenu.equals("PLAYBACK")) {
                        playing = playStop();
                    }
                    break;
                case "2":
                    if (selectedMenu.equals("MAIN")) {
                        Album foundAlbum = findAlbum(selectedAlbum);
                        if (!selectedAlbum.equals("NONE") && foundAlbum != null) {
                            addSong();
                        }
                    } else if (selectedMenu.equals("PLAYLIST")) {
                        removeFromPlaylist();
                    } else if (selectedMenu.equals("PLAYBACK")) {
                        nextSong();
                    }
                    break;
                case "3":
                    if (selectedMenu.equals("MAIN")) {
                        removeSong();
                    } else if (selectedMenu.equals("PLAYLIST")) {
                        clearPlaylist();
                    } else if (selectedMenu.equals("PLAYBACK")) {
                        previousSong();
                    }
                    break;
                case "4":
                    if (selectedMenu.equals("MAIN")) {
                        selectedMenu = "PLAYLIST";
                    } else if (selectedMenu.equals("PLAYLIST")) {
                        selectedMenu = "MAIN";
                    } else if (selectedMenu.equals("PLAYBACK")) {
                        selectedMenu = "MAIN";
                    }
                    break;
                case "5":
                    if (selectedMenu.equals("MAIN")) {
                        selectedMenu = "PLAYBACK";
                    } else if (selectedMenu.equals("PLAYLIST")) {
                        selectedMenu = "PLAYBACK";
                    } else if (selectedMenu.equals("PLAYBACK")) {
                        selectedMenu = "PLAYLIST";
                    }
                    break;
                case "6":
                    if (selectedMenu.equals("MAIN")) {
                        selectAlbum();
                    } else if (selectedMenu.equals("PLAYLIST")) {
                        viewPlaylist();
                    }
                    break;
                case "7":
                    if (selectedMenu.equals("MAIN")) {
                        if (!newAlbum()) {
                            System.out.println("\u001B[31m" + "Error creating album!" + "\u001B[0m");
                        }
                    }
                    break;
                case "8":
                    listAlbums();
                    break;
                case "9":
                    removeAlbum();
                    break;
                case "Q":
                    break;
            }
            printMenu(selectedMenu);
            System.out.print("Your choice:");
            selection = scanner.nextLine();
        }

        scanner.close();
    }


    private static String printMenu(String selectedMenu) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("=====================================\n" +
                           "Selected album:" + selectedAlbum + "\n");
        if (current != null){
            System.out.println("Selected Song:" + current.getTitle() + "\n");
        }
        System.out.println("=====================================\n");

        switch (selectedMenu.toUpperCase()) {
            case "MAIN":
                System.out.println("Main Options:\n" +
                        "=====================================\n" +
                        "1 - List songs\n" +
                        "2 - Add new song\n" +
                        "3 - Remove song\n" +
                        "4 - Playlist menu\n" +
                        "5 - Playback menu\n" +
                        "6 - Select album\n" +
                        "7 - New album\n" +
                        "8 - List albums\n" +
                        "9 - Delete album\n" +
                        "Q - Quit\n");
                selectedMenu = "MAIN";
                break;
            case "PLAYLIST":
                System.out.println("Playlist Options:\n" +
                        "=====================================\n" +
                        "1 - Add a song to the playlist\n" +
                        "2 - Remove a song from the playlist\n" +
                        "3 - Clear playlist\n" +
                        "4 - Main menu\n" +
                        "5 - Playback menu\n" +
                        "6 - View playlist" +
                        "Q - Quit\n");
                selectedMenu = "PLAYLIST";
                break;
            case "PLAYBACK":
                System.out.println("Playback Options:\n" +
                        "=====================================\n" +
                        "1 - Play / Stop\n" +
                        "2 - Next song\n" +
                        "3 - Previous song\n" +
                        "4 - Main menu\n" +
                        "5 - Playlist menu\n" +
                        "Q - Quit\n");
                selectedMenu = "PLAYBACK";
        }
        return selectedMenu;
    }



    // Albums ********************************************
    private static boolean newAlbum() {
        System.out.println("Enter new album name: ");
        String newAlbum = scanner.nextLine();
        System.out.println("Enter new album artist: ");
        String newArtist = scanner.nextLine();
        if (newAlbum.isEmpty() || newArtist.isEmpty()) {
            return false;
        } else {
            System.out.println("Created album title: " + newAlbum + " artist: " + newArtist);
            myAlbums.add(Album.createAlbum(newAlbum, newArtist));
            return true;
        }
    }

    // Albums ********************************************
    private static void listAlbums() {
        int count = 0;
        System.out.println("Current albums:");
        System.out.println("======================================");
        for (Album album : myAlbums) {
            count++;
            System.out.println("Number: " + count + " Name: " + album.getName() + " Artist: " + album.getArtist());
        }
        System.out.println("======================================");
        System.out.println();
    }

    // Albums ********************************************
    private static Album findAlbum(String albumName) { //find album by name
        for (Album album : myAlbums) {
            if (album.getName().equals(albumName)) {
                return album;
            }
        }
        return null;
    }

    // Albums ********************************************
    private static Album findAlbum(int albumIndex) { //find album by index
        if (albumIndex > 0 && albumIndex <= myAlbums.size()) {
            return myAlbums.get(albumIndex - 1);
        }
        return null;
    }

    // Albums ********************************************
    private static void selectAlbum() {
        listAlbums();
        System.out.print("Select album Number:");
        int selection = scanner.nextInt();
        Album album = findAlbum(selection);
        if (album != null) {
            selectedAlbum = album.getName();
        }
        System.out.println("Album not found");
    }

    // Albums ********************************************
    private static boolean removeAlbum() {
        listAlbums();
        System.out.print("Album number to delete:");
        int selection = scanner.nextInt();
        Album album = findAlbum(selection);
        if (album != null) {
            if (Objects.equals(selectedAlbum, album.getName())) {
                selectedAlbum = "NONE";
            }
            System.out.println("Album " + album.getName() + " removed");
            myAlbums.remove(album);
            return true;
        }
        System.out.println("Album not found");
        return false;

    }


    // Songs ********************************************
    private static boolean addSong() {
        System.out.println("Enter new song name: ");
        String newSong = scanner.nextLine();
        System.out.println("Enter new song duration: ");
        double newDuration = scanner.nextDouble();

        Album foundAlbum = findAlbum(selectedAlbum);

        if (newSong.isEmpty() || selectedAlbum.equals("NONE")) {
            return false;
        } else {
            Album album = findAlbum(selectedAlbum);
            if (album != null && album.addSong(newSong, newDuration)) {
                System.out.println("Added " + newSong + " duration " + newDuration);
            } else {
                System.out.println("Failed to add " + newSong + " duration " + newDuration);
            }
            return true;
        }
    }

        // Songs ********************************************
        private static boolean removeSong() {
            Album foundAlbum = findAlbum(selectedAlbum);
            if (foundAlbum != null) {
                foundAlbum.listSongs();
                System.out.print("Song number to delete:");
                int selection = scanner.nextInt();
                Song foundSong = foundAlbum.findSong(selection);
                if (foundSong != null) {
                    foundAlbum.removeSong(foundSong);
                    System.out.println("Song name: " + foundSong.getTitle() + " duration: " + foundSong.getDuration() + " removed");
                    return true;
                }
            }
            System.out.println("Album not found");
            return false;
        }

    // Playlist ********************************************
        private static boolean addToPlaylist(){
            Album foundAlbum = findAlbum(selectedAlbum);
                if (foundAlbum != null) {
                    foundAlbum.listSongs();
                    System.out.print("Song number to add to playlist:");
                    int selection = scanner.nextInt();
                    Song foundSong = foundAlbum.findSong(selection);
                    if (foundSong != null) {
                        foundAlbum.addToPlayList(foundSong.getTitle(), playList);
                        System.out.println("Song name: " + foundSong.getTitle() + " duration: " + foundSong.getDuration() + " added to playlist");
                        return true;
                    }
                }
                System.out.println("Song not added");
                return false;

        }

    // Playlist ********************************************
    private static boolean removeFromPlaylist(){
        Album foundAlbum = findAlbum(selectedAlbum);
        if (foundAlbum != null) {
            foundAlbum.listSongs();
            System.out.print("Song number to remove from playlist:");
            int selection = scanner.nextInt();
            Song foundSong = foundAlbum.findSong(selection);
            if (foundSong != null) {
                foundAlbum.removeSong(foundSong);
                System.out.println("Song name: " + foundSong.getTitle() + " duration: " + foundSong.getDuration() + " remove from playlist");
                return true;
            }
        }
        System.out.println("Song not removed");
        return false;

    }

    // Playlist ********************************************
    private static void clearPlaylist(){
        System.out.print("Are you sure (playlist will be cleared) (Y/N):");
        String selection = scanner.nextLine();
        switch (selection) {
            case "Y":
                System.out.println("Playlist cleared");
                playList.clear();
                break;
        }
    }

    // Playlist ********************************************
    private static void viewPlaylist(){
        int count = 1;
        Iterator<Song> it = playList.iterator();
        System.out.println("Playlist:");
        System.out.println("--------------------------------------------------------------------");
        while (it.hasNext()){
            Song song  = it.next();
            System.out.println( count + "- Title:"  + song.getTitle() + " Duration" + song.getDuration());
            count++;
        }
        System.out.println("--------------------------------------------------------------------");
    }

    // Playback ********************************************
    private static boolean playStop() {
        if (playing){
            return false;
        } else {
            return true;
        }
    }

    // Playback ********************************************
    private static void nextSong() {
        if (playList.isEmpty()) {
            System.out.println("Playlist is empty");
            return;
        }

        ListIterator<Song> playListIt = playList.listIterator();

        if (current == null && playListIt.hasNext()) {
            current = playListIt.next();
            System.out.println(current.getTitle());
        } else {
            while (playListIt.hasNext()) {
                Song next = playListIt.next();
                if (next == current && playListIt.hasNext()) {
                    current = playListIt.next();
                    System.out.println(current.getTitle());
                    return;
                }
            }
        }
    }

    // Playback ********************************************
    private static void previousSong() {
        if (playList.isEmpty()) {
            System.out.println("Playlist is empty");
            return;
        }
        ListIterator<Song> playListIt = playList.listIterator();

        while (playListIt.hasNext()) {
            Song next = playListIt.next();
            if (next == current && playListIt.hasPrevious()) {
                playListIt.previous();
                if (playListIt.hasPrevious()) {
                    current = playListIt.previous();
                }
                System.out.println(current.getTitle());
                return;
            }
        }
    }



        private static void preload(ArrayList<Album> albums) {
//        ArrayList<Album> albums = new ArrayList<>();
//
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);
//
//        LinkedList<Song> playList = new LinkedList<Song>();
//        albums.get(0).addToPlayList("You can't do it right", playList);
//        albums.get(0).addToPlayList("Holy man", playList);
//        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
//        albums.get(0).addToPlayList(9, playList);
//        albums.get(1).addToPlayList(3, playList);
//        albums.get(1).addToPlayList(2, playList);
//        albums.get(1).addToPlayList(24, playList);  // There is no track 24
}
}