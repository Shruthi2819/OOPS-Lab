class Course {
    void accessContent() {
        System.out.println("Accessing course...");
    }
}

class VideoCourse extends Course {
    void accessContent() {
        System.out.println("Playing video lectures");
    }
}

class TextCourse extends Course {
    void accessContent() {
        System.out.println("Displaying reading material");
    }
}

class LiveCourse extends Course {
    void accessContent() {
        System.out.println("Scheduling live session");
    }
}

public class OnlineLearning {
    public static void main(String[] args) {
        Course c;

        c = new VideoCourse();
        c.accessContent();

        c = new TextCourse();
        c.accessContent();

        c = new LiveCourse();
        c.accessContent();
    }
}