/*
 * Decompiled with CFR 0.150.
 */
import java.util.Comparator;

final class g3
implements Comparator {
    g3() {
    }

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
        block8: {
            int n3;
            h6 h62;
            h6 h63;
            block7: {
                int n4;
                String string3;
                block6: {
                    h63 = (h6)object;
                    h62 = (h6)object2;
                    string3 = K.d();
                    n3 = h63.l;
                    n4 = h62.l;
                    if (string3 != null) break block6;
                    if (n3 != n4) {
                        return h63.l - h62.l;
                    }
                    n3 = h63.i;
                    if (string3 != null) break block7;
                    n4 = h62.i;
                }
                if (n3 != n4) {
                    return h62.i - h63.i;
                }
                string2 = h63.I;
                string = h62.I;
                if (string3 != null) break block8;
                n3 = string2.equals(string) ? 1 : 0;
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

