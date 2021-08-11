/*
 * Decompiled with CFR 0.150.
 */
import java.util.MissingResourceException;
import java.util.ResourceBundle;

class cK {
    cK() {
    }

    static String a(String string) {
        String string2;
        try {
            string2 = ResourceBundle.getBundle("ExceptionStrings").getString(string);
        }
        catch (MissingResourceException missingResourceException) {
            System.err.println("VecMathI18N: Error looking up: " + string);
            string2 = string;
        }
        return string2;
    }
}

