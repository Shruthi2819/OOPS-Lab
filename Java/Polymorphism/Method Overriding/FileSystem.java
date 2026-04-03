class File {
    void open() {
        System.out.println("Opening file...");
    }
}

class TextFile extends File {
    void open() {
        System.out.println("Reading text file");
    }
}

class ImageFile extends File {
    void open() {
        System.out.println("Displaying image");
    }
}

class AudioFile extends File {
    void open() {
        System.out.println("Playing audio");
    }
}

public class FileSystem {
    public static void main(String[] args) {
        File f;

        f = new TextFile();
        f.open();

        f = new ImageFile();
        f.open();

        f = new AudioFile();
        f.open();
    }
}
