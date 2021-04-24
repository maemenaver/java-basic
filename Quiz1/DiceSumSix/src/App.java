public class App {
    public static void main(String[] args) throws Exception {
        int count = 0;

        System.out.println("2개의 주사위, 눈의 합이 6이 되는 경우의 수");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i + j == 6) {
                    System.out.println(i + " / " + j);
                    count++;
                }
            }
        }
        System.out.print("개수 : " + count);
    }
}
