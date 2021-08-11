/*
 * Decompiled with CFR 0.150.
 */
import java.util.HashMap;
import java.util.Map;
import net.minecraft.U.h;
import net.minecraft.U.x;
import net.minecraft.ar.v;

public class fA {
    private static final /* synthetic */ Map<Class, Integer> c;
    private static final /* synthetic */ Map<String, Integer> b;
    private static final /* synthetic */ Map<String, Integer> a;

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a(x x2) {
        String string = K.d();
        x x3 = x2;
        if (string == null) {
            if (x3 == null) {
                return -1;
            }
            x3 = x2;
        }
        int n2 = fA.a(x3.getClass());
        return n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a(String string) {
        Integer n2 = a.get(string);
        String string2 = K.d();
        Integer n3 = n2;
        if (string2 == null) {
            if (n3 == null) {
                return -1;
            }
            n3 = n2;
        }
        int n4 = n3;
        return n4;
    }

    static {
        c = new HashMap<Class, Integer>();
        a = new HashMap<String, Integer>();
        b = new HashMap<String, Integer>();
        for (int i2 = 0; i2 < 1000; ++i2) {
            v v2;
            Class<? extends x> class_ = h.a(i2);
            if (class_ == null || (v2 = h.a(class_)) == null) continue;
            String string = v2.toString();
            String string2 = h.a(v2);
            if (string2 == null) continue;
            if (c.containsKey(class_)) {
                fU.h("Duplicate entity class: " + class_ + ", id1: " + c.get(class_) + ", id2: " + i2);
            }
            if (a.containsKey(string)) {
                fU.h("Duplicate entity location: " + string + ", id1: " + a.get(string) + ", id2: " + i2);
            }
            if (b.containsKey(string)) {
                fU.h("Duplicate entity name: " + string2 + ", id1: " + b.get(string2) + ", id2: " + i2);
            }
            c.put(class_, i2);
            a.put(string, i2);
            b.put(string2, i2);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int b(String string) {
        Integer n2 = b.get(string);
        String string2 = K.d();
        Integer n3 = n2;
        if (string2 == null) {
            if (n3 == null) {
                return -1;
            }
            n3 = n2;
        }
        int n4 = n3;
        return n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a(Class class_) {
        Integer n2 = c.get(class_);
        String string = K.d();
        Integer n3 = n2;
        if (string == null) {
            if (n3 == null) {
                return -1;
            }
            n3 = n2;
        }
        int n4 = n3;
        return n4;
    }
}

