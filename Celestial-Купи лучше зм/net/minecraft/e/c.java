/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.e;

import javax.annotation.Nullable;
import net.minecraft.U.C;
import net.minecraft.ah.t;
import net.minecraft.ar.aA;
import net.minecraft.e.a;
import net.minecraft.e.b;
import net.minecraft.e.f;
import net.minecraft.e.i;
import net.minecraft.k.h;
import net.minecraft.k.o;

public class c
extends b {
    @Override
    public int a(f[] arrf, f f10, f f11, float f12) {
        int n2 = 0;
        aA[] arraA = aA.values();
        int n3 = net.minecraft.e.i.n();
        int n4 = arraA.length;
        int n5 = 0;
        while (n5 < n4) {
            block5: {
                block6: {
                    int n6;
                    f f13;
                    block7: {
                        aA aA2 = arraA[n5];
                        f13 = this.b(f10.g + aA2.r(), f10.m + aA2.p(), f10.f + aA2.i());
                        if (n3 == 0) break block5;
                        if (f13 == null) break block6;
                        n6 = f13.j;
                        if (n3 == 0) break block7;
                        if (n6 != 0) break block6;
                        float f14 = f13.b(f11) - f12;
                        n6 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                    }
                    if (n6 < 0) {
                        arrf[n2++] = f13;
                    }
                }
                ++n5;
            }
            if (n3 != 0) continue;
        }
        return n2;
    }

    @Override
    public a a(t t2, int n2, int n3, int n4, C c10, int n5, int n6, int n7, boolean bl2, boolean bl3) {
        return net.minecraft.e.a.WATER;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private a c(int n2, int n3, int n4) {
        o o2 = new o();
        int n5 = net.minecraft.e.i.g();
        int n6 = n2;
        block0: while (true) {
            int n7 = n6;
            block1: while (n7 < n2 + this.d) {
                int n8 = n3;
                while (n8 < n3 + this.c) {
                    block7: {
                        n7 = n4;
                        if (n5 != 0) continue block1;
                        int n9 = n7;
                        while (n9 < n4 + this.h) {
                            net.minecraft.Z.i i2 = this.f.d(o2.a(n6, n8, n9));
                            if (n5 == 0) {
                                if (n5 == 0) {
                                    if (i2.o() != net.minecraft.ac.c.L) {
                                        return net.minecraft.e.a.BLOCKED;
                                    }
                                    ++n9;
                                }
                                if (n5 == 0) continue;
                            }
                            break block7;
                        }
                        ++n8;
                    }
                    if (n5 == 0) continue;
                }
                ++n6;
                if (n5 == 0) continue block0;
            }
            break;
        }
        return net.minecraft.e.a.WATER;
    }

    @Override
    public f b() {
        return this.a(net.minecraft.k.h.f(this.i.m().e), net.minecraft.k.h.f(this.i.m().b + 0.5), net.minecraft.k.h.f(this.i.m().d));
    }

    @Override
    public a a(t t2, int n2, int n3, int n4) {
        return net.minecraft.e.a.WATER;
    }

    @Nullable
    private f b(int n2, int n3, int n4) {
        a a10 = this.c(n2, n3, n4);
        return a10 == net.minecraft.e.a.WATER ? this.a(n2, n3, n4) : null;
    }

    @Override
    public f a(double d10, double d11, double d12) {
        return this.a(net.minecraft.k.h.f(d10 - (double)(this.i.ad / 2.0f)), net.minecraft.k.h.f(d11 + 0.5), net.minecraft.k.h.f(d12 - (double)(this.i.ad / 2.0f)));
    }
}

