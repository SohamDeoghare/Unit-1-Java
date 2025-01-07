public class excpthand extends Throwable {
        public static int div(int a, int b) throws excpthand {
            if (b == 0) {
                throw new excpthand();
            }
            return a / b;
        }
    }
    public class Main {
        public static void main(String[] args) {
            int x = 10;
            int y = 2;
            try {
                int z = excpthand.div(x, y);
                System.out.println("Result - " + z);
            } catch (excpthand e) {

                System.out.println("Caught MyException ");
            }
        }
}
}