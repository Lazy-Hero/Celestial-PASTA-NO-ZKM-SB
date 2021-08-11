/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.V;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import net.minecraft.U.x;
import net.minecraft.V.b;
import net.minecraft.V.c;
import net.minecraft.k.f;
import net.minecraft.k.k;
import net.minecraft.k.m;
import net.minecraft.k.n;

public class a {
    private static /* synthetic */ String[] c;
    private final /* synthetic */ List<b> d;
    private /* synthetic */ long m;
    private /* synthetic */ double f;
    private /* synthetic */ int e;
    private /* synthetic */ double l;
    private /* synthetic */ double g;
    private /* synthetic */ double k;
    private /* synthetic */ long a;
    private /* synthetic */ int b;
    private /* synthetic */ int i;
    private /* synthetic */ double j;
    private /* synthetic */ double h;

    public double r() {
        double d10 = this.n() + this.c() / 2.0;
        String[] arrstring = net.minecraft.V.a.b();
        double d11 = d10;
        if (arrstring != null) {
            if (d11 > (double)this.b) {
                d10 = this.b;
            }
            d11 = d10;
        }
        return d11;
    }

    public double f() {
        double d10 = this.l() - this.c() / 2.0;
        String[] arrstring = net.minecraft.V.a.b();
        double d11 = d10;
        if (arrstring != null) {
            if (d11 < (double)(-this.b)) {
                d10 = -this.b;
            }
            d11 = d10;
        }
        return d11;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public double h() {
        String[] arrstring = net.minecraft.V.a.b();
        a a10 = this;
        if (arrstring != null) {
            if (a10.m == this.a) {
                return 0.0;
            }
            a10 = this;
        }
        double d10 = Math.abs(a10.f - this.l) / (double)(this.m - this.a);
        return d10;
    }

    public void a(double d10) {
        this.j = d10;
        String[] arrstring = net.minecraft.V.a.b();
        for (b b10 : this.m()) {
            b10.a(this, d10);
            if (arrstring != null) continue;
        }
    }

    public void a(b b10) {
        this.d.add(b10);
    }

    public void a(double d10, double d11, long l2) {
        this.f = d10;
        this.l = d11;
        String[] arrstring = net.minecraft.V.a.b();
        this.a = System.currentTimeMillis();
        this.m = this.a + l2;
        for (b b10 : this.m()) {
            b10.a(this, d10, d11, l2);
            if (arrstring != null) continue;
        }
    }

    public static String[] b() {
        return c;
    }

    static {
        if (net.minecraft.V.a.b() == null) {
            net.minecraft.V.a.b(new String[1]);
        }
    }

    public int s() {
        return this.e;
    }

    public double l() {
        return this.h;
    }

    public double d() {
        double d10 = this.l() + this.c() / 2.0;
        String[] arrstring = net.minecraft.V.a.b();
        double d11 = d10;
        if (arrstring != null) {
            if (d11 > (double)this.b) {
                d10 = this.b;
            }
            d11 = d10;
        }
        return d11;
    }

    public double c() {
        a a10;
        block2: {
            block3: {
                block5: {
                    double d10;
                    double d11;
                    block4: {
                        double d12;
                        String[] arrstring = net.minecraft.V.a.b();
                        a10 = this;
                        if (arrstring == null) break block2;
                        if (a10.o() == net.minecraft.V.c.STATIONARY) break block3;
                        d11 = d12 = (double)((float)(System.currentTimeMillis() - this.a) / (float)(this.m - this.a));
                        d10 = 1.0;
                        if (arrstring == null) break block4;
                        if (!(d11 < d10)) break block5;
                        d11 = this.f;
                        d10 = (this.l - this.f) * d12;
                    }
                    return d11 + d10;
                }
                this.c(this.l);
            }
            a10 = this;
        }
        return a10.f;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean a(n n2) {
        double d10;
        block5: {
            String[] arrstring;
            block7: {
                block6: {
                    block4: {
                        arrstring = net.minecraft.V.a.b();
                        double d11 = (double)(n2.e() + 1) - this.g();
                        d10 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                        if (arrstring == null) break block4;
                        if (d10 <= 0) break block5;
                        double d12 = (double)n2.e() - this.r();
                        d10 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                    }
                    if (arrstring == null) break block6;
                    if (d10 >= 0) break block5;
                    double d13 = (double)(n2.a() + 1) - this.f();
                    d10 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                }
                if (arrstring == null) break block7;
                if (d10 <= 0) break block5;
                double d14 = (double)n2.a() - this.d();
                d10 = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
            }
            if (arrstring == null) return (boolean)d10;
            if (d10 < 0) {
                d10 = 1.0;
                return (boolean)d10;
            }
        }
        d10 = 0.0;
        return (boolean)d10;
    }

    public static void b(String[] arrstring) {
        c = arrstring;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public long i() {
        String[] arrstring = net.minecraft.V.a.b();
        a a10 = this;
        if (arrstring != null) {
            if (a10.o() == net.minecraft.V.c.STATIONARY) {
                return 0L;
            }
            a10 = this;
        }
        long l2 = a10.m - System.currentTimeMillis();
        return l2;
    }

    public void b(int n2) {
        this.b = n2;
    }

    public a() {
        block0: {
            this.d = Lists.newArrayList();
            this.l = this.f = 6.0E7;
            String[] arrstring = net.minecraft.V.a.b();
            this.b = 29999984;
            this.j = 0.2;
            this.k = 5.0;
            this.i = 15;
            this.e = 5;
            if (!net.minecraft.k.m.c()) break block0;
            net.minecraft.V.a.b(new String[5]);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean a(f f10) {
        double d10;
        block5: {
            String[] arrstring;
            block7: {
                block6: {
                    block4: {
                        arrstring = net.minecraft.V.a.b();
                        double d11 = (double)f10.c() - this.g();
                        d10 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                        if (arrstring == null) break block4;
                        if (d10 <= 0) break block5;
                        double d12 = (double)f10.b() - this.r();
                        d10 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                    }
                    if (arrstring == null) break block6;
                    if (d10 >= 0) break block5;
                    double d13 = (double)f10.d() - this.f();
                    d10 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                }
                if (arrstring == null) break block7;
                if (d10 <= 0) break block5;
                double d14 = (double)f10.a() - this.d();
                d10 = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
            }
            if (arrstring == null) return (boolean)d10;
            if (d10 < 0) {
                d10 = 1.0;
                return (boolean)d10;
            }
        }
        d10 = 0.0;
        return (boolean)d10;
    }

    protected List<b> m() {
        return Lists.newArrayList(this.d);
    }

    public void b(double d10) {
        this.k = d10;
        String[] arrstring = net.minecraft.V.a.b();
        for (b b10 : this.m()) {
            b10.c(this, d10);
            if (arrstring != null) continue;
        }
    }

    public double a(x x2) {
        return this.a(x2.a, x2.ax);
    }

    public double j() {
        return this.j;
    }

    public double n() {
        return this.g;
    }

    public double g() {
        double d10 = this.n() - this.c() / 2.0;
        String[] arrstring = net.minecraft.V.a.b();
        double d11 = d10;
        if (arrstring != null) {
            if (d11 < (double)(-this.b)) {
                d10 = -this.b;
            }
            d11 = d10;
        }
        return d11;
    }

    public void a(int n2) {
        this.i = n2;
        Iterator<b> iterator = this.m().iterator();
        String[] arrstring = net.minecraft.V.a.b();
        while (iterator.hasNext()) {
            b b10 = iterator.next();
            b10.b(this, n2);
            if (arrstring != null) continue;
        }
    }

    public double p() {
        return this.k;
    }

    public double a(double d10, double d11) {
        double d12 = d11 - this.f();
        double d13 = this.d() - d11;
        String[] arrstring = net.minecraft.V.a.b();
        double d14 = d10 - this.g();
        double d15 = this.r() - d10;
        double d16 = Math.min(d14, d15);
        d16 = Math.min(d16, d12);
        double d17 = Math.min(d16, d13);
        if (arrstring == null) {
            net.minecraft.k.m.b(!net.minecraft.k.m.d());
        }
        return d17;
    }

    public c o() {
        String[] arrstring = net.minecraft.V.a.b();
        double d10 = this.l - this.f;
        double d11 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
        if (arrstring != null) {
            if (d11 < 0) {
                return net.minecraft.V.c.SHRINKING;
            }
            double d12 = this.l - this.f;
            d11 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
        }
        return d11 > 0 ? net.minecraft.V.c.GROWING : net.minecraft.V.c.STATIONARY;
    }

    public int k() {
        return this.b;
    }

    public int q() {
        return this.i;
    }

    public void b(double d10, double d11) {
        this.g = d10;
        String[] arrstring = net.minecraft.V.a.b();
        this.h = d11;
        for (b b10 : this.m()) {
            b10.a(this, d10, d11);
            if (arrstring != null) continue;
        }
    }

    public void c(double d10) {
        this.f = d10;
        this.l = d10;
        this.a = this.m = System.currentTimeMillis();
        Iterator<b> iterator = this.m().iterator();
        String[] arrstring = net.minecraft.V.a.b();
        while (iterator.hasNext()) {
            b b10 = iterator.next();
            b10.b(this, d10);
            if (arrstring != null) continue;
        }
    }

    public void c(int n2) {
        this.e = n2;
        String[] arrstring = net.minecraft.V.a.b();
        for (b b10 : this.m()) {
            b10.a(this, n2);
            if (arrstring != null) continue;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean a(k k2) {
        double d10;
        block5: {
            String[] arrstring;
            block7: {
                block6: {
                    block4: {
                        arrstring = net.minecraft.V.a.b();
                        double d11 = k2.f - this.g();
                        d10 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                        if (arrstring == null) break block4;
                        if (d10 <= 0) break block5;
                        double d12 = k2.e - this.r();
                        d10 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                    }
                    if (arrstring == null) break block6;
                    if (d10 >= 0) break block5;
                    double d13 = k2.g - this.f();
                    d10 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                }
                if (arrstring == null) break block7;
                if (d10 <= 0) break block5;
                double d14 = k2.d - this.d();
                d10 = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
            }
            if (arrstring == null) return (boolean)d10;
            if (d10 < 0) {
                d10 = 1.0;
                return (boolean)d10;
            }
        }
        d10 = 0.0;
        return (boolean)d10;
    }

    public double e() {
        return this.l;
    }
}

