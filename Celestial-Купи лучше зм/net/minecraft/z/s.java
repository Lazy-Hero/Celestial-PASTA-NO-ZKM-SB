/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.z;

import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ag.L;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.aH;
import net.minecraft.av.b;
import net.minecraft.k.i;
import net.minecraft.k.m;
import net.minecraft.u.h;
import net.minecraft.w.k;
import net.minecraft.z.d;
import net.minecraft.z.r;

public class s
extends r {
    @Override
    public void a(byte by2) {
        m[] arrm = net.minecraft.z.d.b();
        if (by2 == 3) {
            double d10 = 0.08;
            for (int i2 = 0; i2 < 8; ++i2) {
                this.aG.a(net.minecraft.ar.aH.ITEM_CRACK, this.a, this.aF, this.ax, ((double)this.g.nextFloat() - 0.5) * 0.08, ((double)this.g.nextFloat() - 0.5) * 0.08, ((double)this.g.nextFloat() - 0.5) * 0.08, net.minecraft.w.k.a(h.bB));
                if (arrm == null) continue;
            }
        }
    }

    public s(z z2, B b10) {
        super(z2, b10);
    }

    public s(z z2, double d10, double d11, double d12) {
        super(z2, d10, d11, d12);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void b(b b10) {
        r.a(b10, "ThrownEgg");
    }

    @Override
    protected void a(i i2) {
        block16: {
            s s2;
            block17: {
                int n2;
                m[] arrm;
                block15: {
                    block14: {
                        x x2;
                        block13: {
                            arrm = net.minecraft.z.d.b();
                            x2 = i2.e;
                            if (arrm != null) break block13;
                            if (x2 == null) break block14;
                            x2 = i2.e;
                        }
                        x2.a(net.minecraft.ar.G.b(this, this.b()), 0.0f);
                    }
                    n2 = this.aG.C;
                    if (arrm != null) break block15;
                    if (n2 != 0) break block16;
                    s2 = this;
                    if (arrm != null) break block17;
                    n2 = s2.g.nextInt(8);
                }
                if (n2 == 0) {
                    int n3;
                    int n4 = 1;
                    int n5 = this.g.nextInt(32);
                    if (arrm == null) {
                        if (n5 == 0) {
                            n4 = 4;
                        }
                        n5 = n3 = 0;
                    }
                    while (n3 < n4) {
                        L l2 = new L(this.aG);
                        l2.l(-24000);
                        l2.c(this.a, this.aF, this.ax, this.e, 0.0f);
                        this.aG.f(l2);
                        ++n3;
                        if (arrm == null) {
                            if (arrm == null) continue;
                        }
                        break;
                    }
                } else {
                    this.aG.a((x)this, (byte)3);
                }
                s2 = this;
            }
            s2.a();
        }
    }

    public s(z z2) {
        super(z2);
    }
}

