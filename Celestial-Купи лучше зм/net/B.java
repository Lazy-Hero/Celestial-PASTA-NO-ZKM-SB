/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.G;
import net.a;
import net.i;

public class B {
    private final /* synthetic */ a[] a;

    public B(a[] arra) {
        this.a = arra;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a() {
        int[] arrn = G.c();
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            a a10 = this.a[i2];
            a10.a();
            if (arrn == null) continue;
        }
    }

    public boolean a(i i2) {
        boolean bl2;
        block4: {
            int n2 = 0;
            int[] arrn = G.c();
            while (n2 < this.a.length) {
                a a10 = this.a[n2];
                if (arrn == null) {
                    bl2 = a10.a(i2);
                    if (arrn != null) break block4;
                    if (!bl2) {
                        return false;
                    }
                    ++n2;
                }
                if (arrn == null) continue;
            }
            bl2 = true;
        }
        return bl2;
    }
}

