/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ag;

import java.util.Random;
import net.minecraft.ag.A;
import net.minecraft.ag.W;
import net.minecraft.ar.i;

class b
extends i<Integer, Integer> {
    /*
     * Enabled aggressive block sorting
     */
    public int a(Random random) {
        int n2;
        String[] arrstring = A.b();
        int n3 = (Integer)this.a();
        int n4 = (Integer)this.b();
        if (arrstring != null) {
            if (n3 >= n4) {
                n2 = (Integer)this.a();
                return n2;
            }
            n3 = (Integer)this.a();
            n4 = random.nextInt((Integer)this.b() - (Integer)this.a() + 1);
        }
        n2 = n3 + n4;
        return n2;
    }

    public b(int n2, int n3) {
        super(n2, n3);
        if (n3 < n2) {
            W.a().warn("PriceRange({}, {}) invalid, {} smaller than {}", (Object)n2, (Object)n3, (Object)n3, (Object)n2);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

