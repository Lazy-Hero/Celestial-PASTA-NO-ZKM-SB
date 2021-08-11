/*
 * Decompiled with CFR 0.150.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;
import net.minecraft.ar.v;

public class l {
    private static /* synthetic */ ga a;
    private static final /* synthetic */ Random b;

    private static int a(int[] arrn) {
        int n2;
        int n3;
        block4: {
            int n4 = c5.a(arrn);
            int n5 = b.nextInt(n4);
            int n6 = 0;
            String string = K.d();
            int n7 = 0;
            while (n7 < arrn.length) {
                n6 += arrn[n7];
                if (string == null) {
                    n3 = n6;
                    n2 = n5;
                    if (string != null) break block4;
                    if (n3 > n2) {
                        return n7;
                    }
                    ++n7;
                }
                if (string == null) continue;
            }
            n3 = arrn.length;
            n2 = 1;
        }
        return n3 - n2;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static int[] a(Properties[] arrproperties) {
        int[] arrn = new int[arrproperties.length];
        String string = K.d();
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            Properties properties;
            Properties properties2 = properties = arrproperties[i2];
            if (string == null) {
                if (properties2 == null) {
                    properties = arrproperties[0];
                }
                properties2 = properties;
            }
            if (string == null) {
                if (properties2 == null) {
                    arrn[i2] = 1;
                    if (string == null) continue;
                }
                properties2 = properties;
            }
            String string2 = properties2.getProperty("weight", null);
            arrn[i2] = fU.b(string2, 1);
            if (string == null) continue;
        }
        return arrn;
    }

    private static String[] a() {
        String string = K.d();
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("textures/gui/title/background");
        String string2 = string;
        int n2 = 0;
        while (n2 < 100) {
            String string3 = "optifine/gui/background" + n2;
            String string4 = string3 + "/panorama_0.png";
            v v2 = new v(string4);
            if (string2 == null) {
                if (fU.b(v2)) {
                    arrayList.add(string3);
                }
                ++n2;
            }
            if (string2 == null) continue;
        }
        String[] arrstring = arrayList.toArray(new String[arrayList.size()]);
        return arrstring;
    }

    public static ga b() {
        return a;
    }

    private static Properties[] a(String[] arrstring) {
        Properties[] arrproperties = new Properties[arrstring.length];
        String string = K.d();
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            String string2;
            block7: {
                block6: {
                    block5: {
                        string2 = arrstring[i2];
                        if (string != null) break block5;
                        if (i2 != 0) break block6;
                        string2 = "optifine/gui";
                    }
                    if (string == null) break block7;
                }
                fU.b("CustomPanorama: " + string2);
            }
            v v2 = new v(string2 + "/background.properties");
            try {
                InputStream inputStream = fU.a(v2);
                if (inputStream == null) continue;
                Properties properties = new Properties();
                properties.load(inputStream);
                fU.b("CustomPanorama: " + v2.a());
                arrproperties[i2] = properties;
                inputStream.close();
                continue;
            }
            catch (IOException iOException) {
                // empty catch block
            }
            if (string == null) continue;
        }
        return arrproperties;
    }

    public static void c() {
        block6: {
            ga ga2;
            Properties properties;
            String string;
            block8: {
                Properties properties2;
                block7: {
                    String[] arrstring;
                    String string2;
                    String[] arrstring2;
                    block5: {
                        a = null;
                        arrstring2 = l.a();
                        string2 = K.d();
                        arrstring = arrstring2;
                        if (string2 != null) break block5;
                        if (arrstring.length <= 1) break block6;
                        arrstring = arrstring2;
                    }
                    Properties[] arrproperties = l.a(arrstring);
                    int[] arrn = l.a(arrproperties);
                    int n2 = l.a(arrn);
                    string = arrstring2[n2];
                    properties2 = properties = arrproperties[n2];
                    if (string2 == null) {
                        if (properties2 == null) {
                            properties = arrproperties[0];
                        }
                        properties2 = properties;
                    }
                    if (string2 != null) break block7;
                    if (properties2 != null) break block8;
                    properties2 = new Properties();
                }
                properties = properties2;
            }
            a = ga2 = new ga(string, properties);
        }
    }

    static {
        a = null;
        b = new Random();
    }
}

