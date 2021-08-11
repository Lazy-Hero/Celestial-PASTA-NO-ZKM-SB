/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.D;

import java.util.Comparator;
import net.minecraft.D.e;
import net.minecraft.D.l;

final class k
implements Comparator<e> {
    k() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int a(e e10, e e11) {
        e e12;
        block6: {
            int n2;
            int n3;
            block5: {
                int n4 = l.a();
                n3 = e10.a();
                n2 = e11.a();
                if (n4 != 0) break block5;
                if (n3 > n2) {
                    return 1;
                }
                e12 = e10;
                if (n4 != 0) break block6;
                n3 = e12.a();
                n2 = e11.a();
            }
            if (n3 < n2) {
                return -1;
            }
            e12 = e11;
        }
        int n5 = e12.d().compareToIgnoreCase(e10.d());
        return n5;
    }
}

