class Report {
    void generateReport(String title) {
        System.out.println("Report: " + title);
    }

    void generateReport(String title, String date) {
        System.out.println("Report: " + title + " Date: " + date);
    }

    void generateReport(String title, String date, String author) {
        System.out.println("Report: " + title + " Date: " + date + " Author: " + author);
    }
}

public class ReportSystem {
    public static void main(String[] args) {
        Report r = new Report();

        r.generateReport("Sales");
        r.generateReport("Sales", "30-03-2026");
        r.generateReport("Sales", "30-03-2026", "Shruthi");
    }
}