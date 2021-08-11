/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.U.B;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aX;
import net.minecraft.ar.ay;
import net.minecraft.ar.t;
import net.minecraft.ar.v;
import net.minecraft.ax.T;
import net.minecraft.i.j;
import net.minecraft.l.m;
import net.minecraft.u.E;
import net.minecraft.w.aN;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;
import net.minecraft.z.o;

public class au
extends k {
    @Override
    public t<d> a(z z2, j j2, a3 a32) {
        d d10;
        block11: {
            int n2;
            block9: {
                block10: {
                    d10 = j2.c(a32);
                    n2 = bl.c();
                    if (n2 != 0) break block9;
                    if (j2.ch == null) break block10;
                    int n3 = j2.ch.h();
                    d10.a(n3, (B)j2);
                    j2.b(a32);
                    z2.a(null, j2.a, j2.aF, j2.ax, E.aX, ay.NEUTRAL, 1.0f, 0.4f / (r.nextFloat() * 0.4f + 0.8f));
                    if (n2 == 0) break block11;
                }
                z2.a(null, j2.a, j2.aF, j2.ax, E.bu, ay.NEUTRAL, 0.5f, 0.4f / (r.nextFloat() * 0.4f + 0.8f));
            }
            if (n2 == 0) {
                if (!z2.C) {
                    int n4;
                    int n5;
                    o o2 = new o(z2, j2);
                    int n6 = n5 = T.c(d10);
                    if (n2 == 0) {
                        if (n6 > 0) {
                            o2.a(n5);
                        }
                        n6 = T.d(d10);
                    }
                    int n7 = n4 = n6;
                    if (n2 == 0) {
                        if (n7 > 0) {
                            o2.b(n4);
                        }
                        n7 = z2.f(o2) ? 1 : 0;
                    }
                }
                j2.b(a32);
            }
            j2.b(m.b(this));
        }
        return new t<d>(aX.SUCCESS, d10);
    }

    public au() {
        this.d(64);
        this.b(1);
        this.a(net.minecraft.ad.a.d);
        this.a(new v("cast"), new aN(this));
    }

    @Override
    public int o() {
        return 1;
    }

    @Override
    public boolean d() {
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean k() {
        return true;
    }
}

