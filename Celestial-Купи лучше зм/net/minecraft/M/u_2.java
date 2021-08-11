/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import java.util.Random;
import net.minecraft.P.r;
import net.minecraft.aj.k;
import net.minecraft.m.m;
import net.minecraft.w.d;

public class u
extends m {
    private final /* synthetic */ r a;

    static r a(u u2) {
        return u2.a;
    }

    @Override
    public d a(d d10, Random random, k k2) {
        r r2;
        block4: {
            r r3;
            block2: {
                block3: {
                    r2 = d10.v();
                    net.minecraft.k.m[] arrm = m.b();
                    r3 = r2;
                    if (arrm == null) break block2;
                    if (r3 != null) break block3;
                    r2 = this.a.c();
                    if (arrm != null) break block4;
                }
                r3 = r2;
            }
            r3.a(this.a);
        }
        d10.b(r2);
        return d10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public u(net.minecraft.g.d[] arrd, r r2) {
        super(arrd);
        this.a = r2;
    }
}

