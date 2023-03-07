public class TryCatchFinally {
    public static void main(String[] args) {
        
        try {

            System.out.println(5 / 0);
        
        // } catch (Exception e) {
        } catch (ArithmeticException e) {
        
            e.printStackTrace();
        
        } finally {

            System.out.println("Vamos cerrando todo ...");

        }

        System.out.println("Llegué al final ;)");

    }
}

