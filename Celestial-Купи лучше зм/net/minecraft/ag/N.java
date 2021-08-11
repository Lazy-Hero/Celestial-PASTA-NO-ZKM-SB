/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ag;

import javax.annotation.Nullable;
import net.minecraft.J.t;
import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.E;
import net.minecraft.ag.A;
import net.minecraft.ag.M;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aH;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.i.j;
import net.minecraft.u.g;
import net.minecraft.u.h;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class N
extends M {
    public N(z z2) {
        super(z2);
        this.c(0.9f, 1.4f);
        this.cE = net.minecraft.u.g.a8;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public static void c(b b10) {
        C.a(b10, N.class);
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.au;
    }

    @Override
    public N a(E e10) {
        return new N(this.aG);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(j j2, a3 a32) {
        int n2;
        k k2;
        String[] arrstring;
        d d10;
        block14: {
            block15: {
                boolean bl2;
                block17: {
                    block16: {
                        d10 = j2.c(a32);
                        arrstring = net.minecraft.ag.A.b();
                        k2 = d10.w();
                        if (arrstring == null) break block14;
                        if (k2 != h.z) break block15;
                        bl2 = this.z();
                        if (arrstring == null) break block16;
                        if (bl2 < false) break block15;
                        bl2 = (j2.cw.g ? 1 : 0) != 0;
                    }
                    if (arrstring == null) break block17;
                    if (bl2) break block15;
                    d10.b(1);
                    bl2 = d10.G();
                }
                if (arrstring != null) {
                    if (bl2) {
                        j2.a(a32, new d(h.bb));
                        if (arrstring != null) return true;
                    }
                    bl2 = j2.cB.b(new d(h.bb));
                }
                if (arrstring == null) return bl2;
                if (bl2) return true;
                j2.a(new d(h.bb), false);
                return true;
            }
            k2 = d10.w();
        }
        if (k2 == h.aT) {
            n2 = this.z();
            if (arrstring == null) return n2 != 0;
            if (n2 >= 0) {
                block13: {
                    int n3;
                    this.a();
                    this.aG.a(net.minecraft.ar.aH.EXPLOSION_LARGE, this.a, this.aF + (double)(this.aD / 2.0f), this.ax, 0.0, 0.0, 0.0, new int[0]);
                    boolean bl3 = this.aG.C;
                    if (arrstring == null) return bl3;
                    if (bl3) return true;
                    M m2 = new M(this.aG);
                    m2.c(this.a, this.aF, this.ax, this.e, this.at);
                    m2.f(this.V());
                    m2.bf = this.bf;
                    int n4 = this.g();
                    if (arrstring != null) {
                        if (n4 != 0) {
                            m2.a(this.aB());
                        }
                        this.aG.f(m2);
                        n4 = n3 = 0;
                    }
                    while (n3 < 5) {
                        this.aG.f(new t(this.aG, this.a, this.aF + (double)this.aD, this.ax, new d(net.minecraft.u.g.z)));
                        ++n3;
                        if (arrstring != null) {
                            if (arrstring != null) continue;
                        }
                        break block13;
                    }
                    d10.a(1, (B)j2);
                }
                this.a(net.minecraft.u.E.aY, 1.0f, 1.0f);
                return true;
            }
        }
        n2 = super.b(j2, a32) ? 1 : 0;
        return n2 != 0;
    }
}

