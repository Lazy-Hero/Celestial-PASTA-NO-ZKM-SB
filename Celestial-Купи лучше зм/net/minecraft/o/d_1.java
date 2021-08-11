/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.O;

import net.minecraft.J.t;
import net.minecraft.O.a;
import net.minecraft.O.c;
import net.minecraft.O.i;
import net.minecraft.W.a3;
import net.minecraft.ah.z;
import net.minecraft.ar.Q;
import net.minecraft.ar.aA;
import net.minecraft.k.m;

public class d
implements c {
    private static /* synthetic */ boolean b;

    public static boolean c() {
        boolean bl2 = d.b();
        return !bl2;
    }

    @Override
    public final net.minecraft.w.d a(i i2, net.minecraft.w.d d10) {
        net.minecraft.w.d d11 = this.b(i2, d10);
        this.a(i2);
        this.a(i2, i2.b().b(a3.C));
        return d11;
    }

    protected void a(i i2) {
        i2.a().b(1000, i2.e(), 0);
    }

    protected net.minecraft.w.d b(i i2, net.minecraft.w.d d10) {
        aA aA2 = i2.b().b(a3.C);
        a a10 = a3.a(i2);
        net.minecraft.w.d d11 = d10.d(1);
        d.a(i2.a(), d11, 6, aA2, a10);
        return d10;
    }

    public static void b(boolean bl2) {
        b = bl2;
    }

    private int a(aA aA2) {
        return aA2.r() + 1 + (aA2.i() + 1) * 3;
    }

    public static void a(z z2, net.minecraft.w.d d10, int n2, aA aA2, a a10) {
        double d11;
        double d12;
        double d13;
        block4: {
            block3: {
                boolean bl2;
                block2: {
                    d13 = a10.a();
                    d12 = a10.f();
                    d11 = a10.d();
                    bl2 = d.b();
                    if (bl2) break block2;
                    if (aA2.g() != Q.Y) break block3;
                    d12 -= 0.125;
                }
                if (!bl2) break block4;
                m.b(!m.d());
            }
            d12 -= 0.15625;
        }
        t t2 = new t(z2, d13, d12, d11, d10);
        double d14 = z2.J.nextDouble() * 0.1 + 0.2;
        t2.aq = (double)aA2.r() * d14;
        t2.G = 0.2f;
        t2.d = (double)aA2.i() * d14;
        t2.aq += z2.J.nextGaussian() * (double)0.0075f * (double)n2;
        t2.G += z2.J.nextGaussian() * (double)0.0075f * (double)n2;
        t2.d += z2.J.nextGaussian() * (double)0.0075f * (double)n2;
        z2.f(t2);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public static boolean b() {
        return b;
    }

    protected void a(i i2, aA aA2) {
        i2.a().b(2000, i2.e(), this.a(aA2));
    }

    static {
        if (!d.c()) {
            d.b(true);
        }
    }
}

