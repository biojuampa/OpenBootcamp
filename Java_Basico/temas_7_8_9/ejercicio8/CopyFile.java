import java.io.*;


public class CopyFile {
    public static void main(String[] args) {
         
        final String FILE_IN = "original.txt";
        final String FILE_OUT = "copia.txt";

        copyFile(FILE_IN, FILE_OUT);

    }

    public static void copyFile(String fileIn, String fileOut) {

        try { 
            
            InputStream fileInput = new FileInputStream(fileIn);
            PrintStream fileOutput = new PrintStream(fileOut);

            try {
                
                byte[] data = fileInput.readAllBytes();
                fileOutput.write(data);
                
                fileInput.close();
                fileOutput.close();

                System.out.println("\nEl archivo «" + fileIn 
                                 + "» se copió con éxito en «" + fileOut
                                 + "»\n"
                                  );

            } catch  (IOException e) {

                System.out.println("Error: " + e.getMessage());

            }

        } catch (FileNotFoundException e) {
            
            System.out.println("Error: " + e.getMessage());
        
        }

    }

}
