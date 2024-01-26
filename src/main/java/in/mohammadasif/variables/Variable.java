package in.mohammadasif.variables;

/**
 *
 * @author mohammad asif
 * Email: mohammadasif2808@gmail.com
 * Date: Jan 26, 2024 11:38:18 AM
 */
public class Variable {
    
    public static void main(String[] args) {
    // numeric values, all signed
    // Notice naming convention for variable
    byte  aByte    = 127;       // behaves like 8 bits
    short aShort  = 037654;     // behaves like 16 bits
    int   anInteger = 123456;   // behaves like 32 bits
    long  aLong    = 0xCAFE;    // behaves like 64 bits.        
        System.out.println(aByte);
        System.out.println(aShort);
        System.out.println(anInteger);
        System.out.println(aLong);
    }
}
