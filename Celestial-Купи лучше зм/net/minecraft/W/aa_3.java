/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 */
package net.minecraft.w;

import com.google.common.collect.Multimap;
import net.minecraft.B.X;
import net.minecraft.U.B;
import net.minecraft.U.M;
import net.minecraft.W.K;
import net.minecraft.W.ax;
import net.minecraft.W.da;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aX;
import net.minecraft.ar.ay;
import net.minecraft.i.j;
import net.minecraft.j.f;
import net.minecraft.k.n;
import net.minecraft.u.E;
import net.minecraft.u.g;
import net.minecraft.w.a8;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class aa
extends k {
    private final /* synthetic */ float s;
    protected /* synthetic */ a8 t;

    public String a() {
        return this.t.toString();
    }

    @Override
    public Multimap<String, f> a(X x2) {
        Multimap<String, f> multimap;
        block3: {
            block2: {
                multimap = super.a(x2);
                int n2 = bl.c();
                if (n2 != 0) break block2;
                if (x2 != X.MAINHAND) break block3;
                multimap.put((Object)M.g.c(), (Object)new f(h, "Weapon modifier", 0.0, 0));
            }
            multimap.put((Object)M.j.c(), (Object)new f(b, "Weapon modifier", this.s - 4.0f, 0));
        }
        return multimap;
    }

    protected void a(d d10, j j2, z z2, n n2, i i2) {
        block3: {
            block2: {
                int n3 = bl.c();
                z2.a(j2, n2, E.gq, ay.BLOCKS, 1.0f, 1.0f);
                int n4 = n3;
                boolean bl2 = z2.C;
                if (n4 != 0) break block2;
                if (bl2) break block3;
                bl2 = z2.a(n2, i2, 11);
            }
            d10.a(1, (B)j2);
        }
    }

    public aa(a8 a82) {
        this.t = a82;
        this.f = 1;
        this.d(a82.c());
        this.a(net.minecraft.ad.a.d);
        this.s = a82.a() + 1.0f;
    }

    @Override
    public boolean a(d d10, B b10, B b11) {
        d10.a(1, b11);
        return true;
    }

    @Override
    public aX a(j j2, z z2, n n2, a3 a32, aA aA2, float f10, float f11, float f12) {
        block9: {
            K k2;
            K k3;
            i i2;
            d d10;
            block12: {
                K k4;
                block13: {
                    block11: {
                        int n3;
                        block10: {
                            d10 = j2.c(a32);
                            n3 = bl.g();
                            if (!j2.a(n2.a(aA2), aA2, d10)) {
                                return aX.FAIL;
                            }
                            i2 = z2.d(n2);
                            k4 = i2.b();
                            if (aA2 == aA.DOWN || z2.d(n2.a()).o() != c.A) break block9;
                            k3 = k4;
                            k2 = g.aU;
                            if (n3 == 0) break block10;
                            if (k3 == k2) break block11;
                            k3 = k4;
                            k2 = g.ci;
                        }
                        if (n3 == 0) break block12;
                        if (k3 != k2) break block13;
                    }
                    this.a(d10, j2, z2, n2, g.cU.d());
                    return aX.SUCCESS;
                }
                k3 = k4;
                k2 = g.bv;
            }
            if (k3 == k2) {
                switch (i2.b(ax.A)) {
                    case DIRT: {
                        this.a(d10, j2, z2, n2, g.cU.d());
                        return aX.SUCCESS;
                    }
                    case COARSE_DIRT: {
                        this.a(d10, j2, z2, n2, g.bv.d().a(ax.A, da.DIRT));
                        return aX.SUCCESS;
                    }
                }
            }
        }
        return aX.PASS;
    }

    @Override
    public boolean d() {
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

