/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ar;

import net.minecraft.ar.v;

public class F {
    private static final /* synthetic */ Integer[] a;

    /*
     * Enabled aggressive block sorting
     */
    public static Integer a(int n2) {
        int n3;
        block5: {
            int n4;
            block4: {
                n4 = v.b();
                n3 = n2;
                if (n4 != 0) break block4;
                if (n3 <= 0) break block5;
                n3 = n2;
            }
            if (n4 != 0) return n3;
            if (n3 < a.length) {
                n3 = a[n2];
                return n3;
            }
        }
        n3 = n2;
        return n3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        a = new Integer[65535];
        int n2 = a.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            F.a[i2] = i2;
        }
    }
}

