public class Funtion {
        public static void main(String[] args) {
            int x = Hamin(99);
        }
        public static int Hamin(int n) {
            for (int i = 0; i <= n; ++i) {
                if (i % 2 == 0) {
                    System.out.println(i + " la so chang");
                } else {
                    System.out.println(i + " ko phai la so chang nhe");
                }
            }

            return n;
        }

}
