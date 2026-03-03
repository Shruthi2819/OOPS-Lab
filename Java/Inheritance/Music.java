import java.util.Scanner;

class Content {
    int duration;
    String artist_name;

    Content(int duration, String artist_name) {
        this.duration = duration;
        this.artist_name = artist_name;
    }
}

class Song extends Content {
    String genre;

    Song(int duration, String artist_name, String genre) {
        super(duration, artist_name);
        this.genre = genre;
    }
}

class Podcast extends Content {
    int epno;

    Podcast(int duration, String artist_name, int epno) {
        super(duration, artist_name);
        this.epno = epno;
    }
}

class AudioBook extends Content {
    int count;

    AudioBook(int duration, String artist_name, int count) {
        super(duration, artist_name);
        this.count = count;
    }
}

public class Music {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Content Type:");
        System.out.println("1. Song");
        System.out.println("2. Podcast");
        System.out.println("3. AudioBook");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Duration: ");
        int dur = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Artist Name: ");
        String artist = sc.nextLine();

        if (choice == 1) {

            System.out.print("Enter Genre: ");
            String genre = sc.nextLine();

            Song s = new Song(dur, artist, genre);

            System.out.println("\n--- SONG DETAILS ---");
            System.out.println("Duration: " + s.duration);
            System.out.println("Artist: " + s.artist_name);
            System.out.println("Genre: " + s.genre);
        }

        else if (choice == 2) {

            System.out.print("Enter Episode Number: ");
            int ep = sc.nextInt();

            Podcast p = new Podcast(dur, artist, ep);

            System.out.println("\n--- PODCAST DETAILS ---");
            System.out.println("Duration: " + p.duration);
            System.out.println("Artist: " + p.artist_name);
            System.out.println("Episode: " + p.epno);
        }

        else if (choice == 3) {

            System.out.print("Enter Chapter Count: ");
            int count = sc.nextInt();

            AudioBook a = new AudioBook(dur, artist, count);

            System.out.println("\n--- AUDIOBOOK DETAILS ---");
            System.out.println("Duration: " + a.duration);
            System.out.println("Artist: " + a.artist_name);
            System.out.println("Chapter Count: " + a.count);
        }

        else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}