package less10Exception;

public class ThrowKeyword {

        public static void main(String[] args) {
            try {
                testExcp();
            } catch(Exception exp) {
                System.out.println("kk");
            }
        }
        public static void testExcp() throws Exception {
            throw new Exception("test");

    }
}
