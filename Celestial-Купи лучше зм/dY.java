/*
 * Decompiled with CFR 0.150.
 */
import java.util.Comparator;

public class dY
implements Comparator {
    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int compare(Object object, Object object2) {
        int n2;
        String string;
        String string2;
        block6: {
            int n3;
            h6 h62;
            h6 h63;
            block5: {
                h63 = (h6)object;
                String string3 = K.d();
                h62 = (h6)object2;
                n3 = h63.i;
                if (string3 != null) break block5;
                if (n3 != h62.i) {
                    return h62.i - h63.i;
                }
                string2 = h63.I;
                string = h62.I;
                if (string3 != null) break block6;
                n3 = fU.a((Object)string2, (Object)string) ? 1 : 0;
            }
            if (n3 == 0) {
                n2 = h63.I.compareTo(h62.I);
                return n2;
            }
            string2 = h63.p;
            string = h62.p;
        }
        n2 = string2.compareTo(string);
        return n2;
    }
}

