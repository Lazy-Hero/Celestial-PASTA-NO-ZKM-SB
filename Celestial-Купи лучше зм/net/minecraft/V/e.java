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
import net.minecraft.k.n;
import net.minecraft.p.z;
import net.minecraft.v.b;
import net.minecraft.v.c;

public class e
extends c {
    private /* synthetic */ l a;
    private /* synthetic */ int d;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public float g() {
        return 3.0f;
    }

    @Override
    @Nullable
    public l e() {
        return this.a;
    }

    public e(d d10) {
        super(d10);
    }

    public b<e> b() {
        return b.m;
    }

    @Override
    public void h() {
        block9: {
            d d10;
            block8: {
                block6: {
                    double d11;
                    int[] arrn;
                    block7: {
                        block5: {
                            ++this.d;
                            arrn = net.minecraft.v.c.b();
                            l l2 = this.a;
                            if (arrn == null) {
                                if (l2 == null) {
                                    n n2 = this.c.aG.C(z.d);
                                    this.a = new l(n2.e(), n2.b(), n2.a());
                                }
                                l2 = this.a;
                            }
                            double d12 = l2.b(this.c.a, this.c.aF, this.c.ax);
                            double d13 = d12 - 100.0;
                            d11 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                            if (arrn != null) break block5;
                            if (d11 < 0) break block6;
                            double d14 = d12 - 22500.0;
                            d11 = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
                        }
                        if (arrn != null) break block7;
                        if (d11 > 0) break block6;
                        d10 = this.c;
                        if (arrn != null) break block8;
                        d11 = (double)d10.aE;
                    }
                    if (d11 != false) break block6;
                    d10 = this.c;
                    if (arrn != null) break block8;
                    if (d10.B) break block6;
                    this.c.f(1.0f);
                    if (arrn == null) break block9;
                }
                d10 = this.c;
            }
            d10.f(0.0f);
        }
    }

    @Override
    public void a() {
        block3: {
            e e10;
            block2: {
                int[] arrn = net.minecraft.v.c.b();
                e10 = this;
                if (arrn != null) break block2;
                if (e10.d++ % 10 != 0) break block3;
                e10 = this;
            }
            float f10 = (e10.c.f().nextFloat() - 0.5f) * 8.0f;
            float f11 = (this.c.f().nextFloat() - 0.5f) * 4.0f;
            float f12 = (this.c.f().nextFloat() - 0.5f) * 8.0f;
            this.c.aG.a(aH.EXPLOSION_HUGE, this.c.a + (double)f10, this.c.aF + 2.0 + (double)f11, this.c.ax + (double)f12, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    public void c() {
        this.a = null;
        this.d = 0;
    }
}

