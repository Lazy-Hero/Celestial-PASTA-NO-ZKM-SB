/*
 * Decompiled with CFR 0.150.
 */
public class gB {
    private static final /* synthetic */ Integer[] b;
    private static final /* synthetic */ int a;

    /*
     * Enabled aggressive block sorting
     */
    public static Integer a(int n2) {
        Integer n3;
        block5: {
            int n4;
            block4: {
                String string = K.d();
                n4 = n2;
                if (string != null) break block4;
                if (n4 < 0) break block5;
                n4 = n2;
            }
            if (n4 < 4096) {
                n3 = b[n2];
                return n3;
            }
        }
        n3 = new Integer(n2);
        return n3;
    }

    static {
        a = 4096;
        b = gB.b(4096);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private static Integer[] b(int n2) {
        Integer[] arrinteger = new Integer[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrinteger[i2] = new Integer(i2);
        }
        return arrinteger;
    }
}

