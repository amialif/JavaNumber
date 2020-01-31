
package logarithmvalues;

/**
 *
 * @author arifur.rahman
 */
public class LogarithmValues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double a = -2.87;
        double b = 2.0/0;
        double c = 0;
        
        double d = 1000;
        double e = 123.234;
        
        //Argument is less than zero - output should be Nan
        System.out.println(Math.log10(a));
        
        //Argument is positive Infinity - output should be Infinity
        System.out.println(Math.log10(b));
        
        //Argument is positive or Negative zero - output should be negative Infinity
        System.out.println(Math.log10(c));
        
        //power of 10
        System.out.println(Math.log10(d));
        
        // positive double value as argument
        System.out.println(Math.log10(e));
    
    }
    
}
