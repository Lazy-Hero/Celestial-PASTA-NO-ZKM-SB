/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import java.util.Random;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.aj.k;
import net.minecraft.aj.l;
import net.minecraft.ax.T;
import net.minecraft.m.m;
import net.minecraft.w.d;

public class p
extends m {
    private final /* synthetic */ int a;
    private final /* synthetic */ l d;

    static int a(p p2) {
        return p2.a;
    }

    static l b(p p2) {
        return p2.d;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public p(net.minecraft.g.d[] arrd, l l2, int n2) {
        super(arrd);
        this.d = l2;
        this.a = n2;
    }

    @Override
    public d a(d d10, Random random, k k2) {
        d d11;
        block8: {
            block7: {
                int n2;
                int n3;
                net.minecraft.k.m[] arrm;
                block6: {
                    x x2 = k2.b();
                    arrm = m.b();
                    n3 = x2 instanceof B;
                    if (arrm == null) break block6;
                    if (n3 == 0) break block7;
                    n3 = T.g((B)x2);
                }
                int n4 = n2 = n3;
                if (arrm != null) {
                    if (n4 == 0) {
                        return d10;
                    }
                    n4 = n2;
                }
                float f10 = (float)n4 * this.d.b(random);
                d11 = d10;
                if (arrm == null) break block8;
                d11.g(Math.round(f10));
                if (this.a == 0) break block7;
                d11 = d10;
                if (arrm == null) break block8;
                if (d11.t() > this.a) {
                    d10.c(this.a);
                }
            }
            d11 = d10;
        }
        return d11;
    }
}

