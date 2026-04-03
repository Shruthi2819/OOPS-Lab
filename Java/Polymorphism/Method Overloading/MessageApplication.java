class Message {
    void sendMessage(String text) {
        System.out.println("Text: " + text);
    }

    void sendMessage(String text, String image) {
        System.out.println("Text: " + text + " + Image: " + image);
    }

    void sendMessage(String text, String image, String video) {
        System.out.println("Text: " + text + " + Image: " + image + " + Video: " + video);
    }
}

public class MessageApplication {
    public static void main(String[] args) {
        Message m = new Message();

        m.sendMessage("Hello");
        m.sendMessage("Hi", "img.png");
        m.sendMessage("Hey", "img.png", "video.mp4");
    }
}
