import java.io.*;

/**
 * The class Reader demonstrates reading from a text file.
 */
class Reader{
    public static void main(String[] args){
        int lineCount = 0;
    
        try {
            File myFile = new File("Reader.java");
            FileReader fileReader = new FileReader(myFile);
            
            BufferedReader reader = new BufferedReader(fileReader);
            
            String line = null;
            while( (line = reader.readLine()) != null ) {
                System.out.println(++lineCount + " " + line);
            }
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("lineCount = " + lineCount);
    }
}