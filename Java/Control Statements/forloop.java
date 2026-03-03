public class forloop {
    public static void main(String[] args) {

        int c = 0;

        for (int i = 1; i <= 50; i++) {

            if (i % 4 == 0) {
                c++;
                continue;   // skip this number
            }

            System.out.println(i);
        }

        System.out.println("Total count of skipped numbers: " + c);
    }
}
