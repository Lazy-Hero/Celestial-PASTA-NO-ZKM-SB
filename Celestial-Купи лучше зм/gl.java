/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Iterables
 *  org.apache.commons.io.Charsets
 *  org.apache.commons.io.IOUtils
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import net.minecraft.ar.v;
import net.minecraft.client.D.a;
import net.minecraft.client.D.h;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

public class gl {
    private static final /* synthetic */ Pattern a;
    private static final /* synthetic */ Splitter b;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void a(a var0, String[] var1_1, Map var2_2) {
        var3_3 = K.d();
        try {
            var4_4 = 0;
            while (true) {
                if (var4_4 >= var1_1.length) return;
                var5_6 = var1_1[var4_4];
                var6_7 = new v(var5_6);
                if (var3_3 != null) return;
                if (var3_3 != null) continue;
                break;
            }
        }
        catch (IOException var4_5) {
            var4_5.printStackTrace();
            return;
        }
        {
            if (!var0.b(var6_7)) ** GOTO lbl-1000
        }
        {
            var7_8 = var0.a(var6_7);
            if (var3_3 != null) ** GOTO lbl20
            if (var7_8 == null) ** GOTO lbl-1000
        }
        {
            gl.a(var7_8, var2_2);
        }
lbl-1000:
        // 3 sources

        {
            ++var4_4;
lbl20:
            // 3 sources

            if (var3_3 == null) ** continue;
            return;
        }
    }

    public static String e() {
        return h.a("options.on", new Object[0]);
    }

    public static String a(String string) {
        return h.a(string, new Object[0]);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String a(String string, String string2) {
        String string3;
        block5: {
            String string4;
            String string5;
            block4: {
                string5 = h.a(string, new Object[0]);
                string4 = K.d();
                string3 = string5;
                if (string4 != null) break block4;
                if (string3 == null) break block5;
                string3 = string5;
            }
            if (string4 != null) return string3;
            if (!string3.equals(string)) {
                string3 = string5;
                return string3;
            }
        }
        string3 = string2;
        return string3;
    }

    public static void a(InputStream inputStream, Map map) throws IOException {
        Iterator iterator = IOUtils.readLines((InputStream)inputStream, (Charset)Charsets.UTF_8).iterator();
        String string = K.d();
        while (iterator.hasNext()) {
            block4: {
                String[] arrstring;
                String[] arrstring2;
                block6: {
                    block5: {
                        int n2;
                        String string2;
                        block3: {
                            string2 = (String)iterator.next();
                            n2 = string2.isEmpty();
                            if (string != null) break block3;
                            if (n2 != 0) break block4;
                            n2 = string2.charAt(0);
                        }
                        if (n2 == 35) break block4;
                        arrstring = arrstring2 = (String[])Iterables.toArray((Iterable)b.split((CharSequence)string2), String.class);
                        if (string != null) break block5;
                        if (arrstring == null) break block4;
                        arrstring = arrstring2;
                    }
                    if (string != null) break block6;
                    if (arrstring.length != 2) break block4;
                    arrstring = arrstring2;
                }
                String string3 = arrstring[0];
                String string4 = a.matcher(arrstring2[1]).replaceAll("%$1s");
                map.put(string3, string4);
            }
            if (string == null) continue;
        }
    }

    public static String a() {
        return h.a("options.graphics.fast", new Object[0]);
    }

    public static String c() {
        return h.a("options.graphics.fancy", new Object[0]);
    }

    public static String f() {
        return h.a("options.off", new Object[0]);
    }

    public static void d() {
        Map map = h.a();
        ArrayList<String> arrayList = new ArrayList<String>();
        String string = "optifine/lang/";
        String string2 = "en_us";
        String string3 = K.d();
        String string4 = ".lang";
        ArrayList<String> arrayList2 = arrayList;
        if (string3 == null) {
            arrayList2.add(string + string2 + string4);
            if (!fU.a().bM.equals(string2)) {
                arrayList.add(string + fU.a().bM + string4);
            }
            arrayList2 = arrayList;
        }
        String[] arrstring = arrayList2.toArray(new String[arrayList.size()]);
        gl.a(fU.l(), arrstring, map);
        a[] arra = fU.bf();
        for (int i2 = 0; i2 < arra.length; ++i2) {
            a a10 = arra[i2];
            gl.a(a10, arrstring, map);
            if (string3 == null) continue;
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    static {
        b = Splitter.on((char)'=').limit(2);
        a = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");
    }

    public static String b() {
        return h.a("generator.default", new Object[0]);
    }
}

