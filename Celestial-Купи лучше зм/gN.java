/*
 * Decompiled with CFR 0.150.
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;
import net.minecraft.ar.v;

public class gN {
    public static Properties a(v v2) {
        String string = v2.a();
        String string2 = K.d();
        Properties properties = new Properties();
        String string3 = ".png";
        String string4 = string;
        if (string2 == null) {
            if (!string4.endsWith(string3)) {
                return properties;
            }
            string4 = string.substring(0, string.length() - string3.length()) + ".properties";
        }
        String string5 = string4;
        try {
            v v3 = new v(v2.c(), string5);
            InputStream inputStream = fU.b(fU.ba(), v3);
            if (string2 == null) {
                if (inputStream == null) {
                    return properties;
                }
                fU.e("Loading " + string5);
                properties.load(inputStream);
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return properties;
    }

    public static float a(Properties properties, String string, float f10) {
        float f11;
        String string2 = properties.getProperty(string);
        String string3 = K.d();
        String string4 = string2;
        if (string3 == null) {
            if (string4 == null) {
                return f10;
            }
            string4 = string2;
        }
        float f12 = f11 = fU.a(string4, Float.MIN_VALUE);
        if (string3 == null) {
            if (f12 == Float.MIN_VALUE) {
                fU.h("Invalid value for " + string + ": " + string2);
                return f10;
            }
            f12 = f11;
        }
        return f12;
    }

    public static v b(v v2) {
        String string;
        block8: {
            v v3;
            block7: {
                string = K.d();
                if (!fU.v()) {
                    return v2;
                }
                v3 = v2;
                if (string != null) break block7;
                if (v3 != null) break block8;
                v3 = v2;
            }
            return v3;
        }
        if (!fU.a8()) {
            return v2;
        }
        String string2 = v2.a();
        String string3 = "textures/";
        String string4 = "mcpatcher/";
        String string5 = string2;
        String string6 = string3;
        if (string == null) {
            if (!string5.startsWith(string6)) {
                return v2;
            }
            string5 = string2;
            string6 = string3;
        }
        string2 = string5.substring(string6.length());
        string2 = string4 + string2;
        v v4 = new v(v2.c(), string2);
        return fU.a(fU.ba(), v4) ? v4 : v2;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(Properties properties, String string, boolean bl2) {
        String string2 = properties.getProperty(string);
        String string3 = K.d();
        String string4 = string2;
        if (string3 == null) {
            if (string4 == null) {
                return bl2;
            }
            string4 = string2.toLowerCase().trim();
        }
        String string5 = string4;
        boolean bl3 = string5.equals("true");
        if (string3 != null) return bl3;
        if (bl3) return true;
        bl3 = string5.equals("on");
        if (string3 != null) return bl3;
        if (bl3) return true;
        boolean bl4 = string5.equals("false");
        if (string3 != null) return bl4;
        if (bl4) return false;
        bl4 = string5.equals("off");
        if (string3 != null) return bl4;
        if (bl4) return false;
        fU.h("Invalid value for " + string + ": " + string2);
        return bl2;
    }

    public static void a(Properties properties, float[] arrf) {
        Iterator<Object> iterator = properties.keySet().iterator();
        String string = K.d();
        while (iterator.hasNext()) {
            block6: {
                String string2;
                float f10;
                int n2;
                Object object;
                block7: {
                    int n3;
                    String string3;
                    String string4;
                    block5: {
                        object = iterator.next();
                        String string5 = "width.";
                        string4 = (String)object;
                        string3 = string5;
                        if (string != null) break block5;
                        if (!string4.startsWith(string3)) break block6;
                        string4 = (String)object;
                        string3 = string5;
                    }
                    String string6 = string4.substring(string3.length());
                    n2 = n3 = fU.b(string6, -1);
                    if (string != null) break block7;
                    if (n2 < 0) break block6;
                    n2 = n3;
                }
                if (n2 < arrf.length && (f10 = fU.a(string2 = properties.getProperty((String)object), -1.0f)) >= 0.0f) {
                    arrf[n3] = f10;
                }
            }
            if (string == null) continue;
        }
    }
}

