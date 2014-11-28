import java.io.*;
import java.util.*;
import static java.lang.System.out;

// To generate the documentation: javadoc FullMoons.java -d <DocFileDir>

/**
 * The FullMoons class prints out the 60 dates on which full
 * moons occurred after Jan 7 2004.
 * <p>
 * This is an exercise in Chapter 10 of Head First Java
*/
public class FullMoons {

    // One day in milliseconds
    static int DAY_IM = 1000 * 60 * 60 * 24;
    
    public static void main (String[] args) {
    
        Calendar c = Calendar.getInstance();
        
        // There was a full moon on Jan 7 2004
        c.set(2004, 0, 7, 16, 9);
        
        long day1 = c.getTimeInMillis();
        
        for (int x = 0; x < 140; x++) {
            // There is a full moon every 29.52 days
            day1 += DAY_IM * 29.52;
            c.setTimeInMillis(day1);
            out.println(String.format("full moon at %tc", c.getTime()));
        }
    }
}