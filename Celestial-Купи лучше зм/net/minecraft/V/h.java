/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.v;

import javax.annotation.Nullable;
import net.minecraft.ar.aH;
import net.minecraft.h.d;
import net.minecraft.k.l;
import net.minecraft.k.m;
import net.minecraft.p.z;
import net.minecraft.v.b;
import net.minecraft.v.c;

public class h
extends c {
    private /* synthetic */ l a;

    @Override
    public float f() {
        float f10 = net.minecraft.k.h.e(this.c.aq * this.c.aq + this.c.d * this.c.d) + 1.0f;
        float f11 = Math.min(f10, 40.0f);
        return f11 / f10;
    }

    public b<h> b() {
        return b.j;
    }

    @Override
    public void a() {
        block1: {
            int[] arrn = net.minecraft.v.c.b();
            l l2 = this.c.d(1.0f).d();
            l2.b(-0.7853982f);
            double d10 = this.c.cO.a;
            double d11 = this.c.cO.aF + (double)(this.c.cO.aD / 2.0f);
            double d12 = this.c.cO.ax;
            int[] arrn2 = arrn;
            for (int i2 = 0; i2 < 8; ++i2) {
                double d13 = d10 + this.c.f().nextGaussian() / 2.0;
                double d14 = d11 + this.c.f().nextGaussian() / 2.0;
                double d15 = d12 + this.c.f().nextGaussian() / 2.0;
                this.c.aG.a(aH.DRAGON_BREATH, d13, d14, d15, -l2.e * (double)0.08f + this.c.aq, -l2.d * (double)0.3f + this.c.G, -l2.b * (double)0.08f + this.c.d, new int[0]);
                l2.b(0.19634955f);
                if (arrn2 == null) continue;
            }
            if (m.d()) break block1;
            net.minecraft.v.c.b(new int[5]);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public float g() {
        return 1.5f;
    }

    @Override
    @Nullable
    public l e() {
        return this.a;
    }

    public h(d d10) {
        super(d10);
    }

    @Override
    public void c() {
        this.a = null;
    }

    @Override
    public void h() {
        block6: {
            h h2;
            block5: {
                l l2;
                block4: {
                    int[] arrn = net.minecraft.v.c.b();
                    l2 = this.a;
                    if (arrn != null) break block4;
                    if (l2 == null) {
                        this.a = new l(this.c.aG.c(z.d));
                    }
                    h2 = this;
                    if (arrn != null) break block5;
                    l2 = h2.a;
                }
                if (!(l2.b(this.c.a, this.c.aF, this.c.ax) < 1.0)) break block6;
                this.c.d().a(b.f).b();
                h2 = this;
            }
            h2.c.d().b(b.h);
        }
    }
}

