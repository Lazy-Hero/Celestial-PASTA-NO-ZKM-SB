/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.concurrent.Immutable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.k;

import javax.annotation.concurrent.Immutable;
import net.minecraft.U.x;
import net.minecraft.ar.aA;
import net.minecraft.ar.ae;
import net.minecraft.k.a;
import net.minecraft.k.g;
import net.minecraft.k.h;
import net.minecraft.k.l;
import net.minecraft.k.m;
import net.minecraft.k.o;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Immutable
public class n
extends m {
    public static final /* synthetic */ n o;
    private static final /* synthetic */ int h;
    private static final /* synthetic */ long a;
    private static final /* synthetic */ long g;
    private static /* synthetic */ boolean m;
    private static final /* synthetic */ long i;
    private static final /* synthetic */ int p;
    private static final /* synthetic */ Logger j;
    private static final /* synthetic */ int l;
    private static final /* synthetic */ int k;
    private static final /* synthetic */ int n;

    public long h() {
        return ((long)this.e() & g) << l | ((long)this.b() & i) << p | ((long)this.a() & a) << 0;
    }

    public n a(ae ae2) {
        switch (ae2) {
            default: {
                return this;
            }
            case CLOCKWISE_90: {
                return new n(-this.a(), this.b(), this.e());
            }
            case CLOCKWISE_180: {
                return new n(-this.e(), this.b(), -this.a());
            }
            case COUNTERCLOCKWISE_90: 
        }
        return new n(this.a(), this.b(), -this.e());
    }

    public n a() {
        return this.c(1);
    }

    public n e(int n2) {
        return this.a(aA.NORTH, n2);
    }

    public n c(int n2) {
        return this.a(aA.UP, n2);
    }

    public n m() {
        return this.b(1);
    }

    public n d(int n2) {
        return this.a(aA.WEST, n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public n a(double d10, double d11, double d12) {
        n n2;
        block5: {
            double d13;
            block6: {
                boolean bl2;
                block4: {
                    bl2 = net.minecraft.k.n.e();
                    double d14 = d10 - 0.0;
                    d13 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                    if (bl2) break block4;
                    if (d13 != false) break block5;
                    double d15 = d11 - 0.0;
                    d13 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                }
                if (bl2) break block6;
                if (d13 != false) break block5;
                double d16 = d12 - 0.0;
                d13 = d16 == 0.0 ? 0 : (d16 > 0.0 ? 1 : -1);
            }
            if (d13 == false) {
                n2 = this;
                return n2;
            }
        }
        n2 = new n((double)this.e() + d10, (double)this.b() + d11, (double)this.a() + d12);
        return n2;
    }

    public n f(int n2) {
        return this.a(aA.SOUTH, n2);
    }

    public static Iterable<o> a(n n2, n n3) {
        return net.minecraft.k.n.a(Math.min(n2.e(), n3.e()), Math.min(n2.b(), n3.b()), Math.min(n2.a(), n3.a()), Math.max(n2.e(), n3.e()), Math.max(n2.b(), n3.b()), Math.max(n2.a(), n3.a()));
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    static {
        j = LogManager.getLogger();
        o = new n(0, 0, 0);
        k = n = 1 + net.minecraft.k.h.c(net.minecraft.k.h.e(30000000));
        net.minecraft.k.n.a(true);
        h = 64 - n - k;
        p = 0 + k;
        l = p + h;
        g = (1L << n) - 1L;
        i = (1L << h) - 1L;
        a = (1L << k) - 1L;
    }

    public n i() {
        return this.e(1);
    }

    public static boolean e() {
        boolean bl2 = net.minecraft.k.n.g();
        return !bl2;
    }

    public n a(aA aA2) {
        return this.a(aA2, 1);
    }

    public n b(m m2) {
        return this.a(m2.e(), m2.b(), m2.a());
    }

    public static void a(boolean bl2) {
        m = bl2;
    }

    public n a(aA aA2, int n2) {
        return n2 == 0 ? this : new n(this.e() + aA2.r() * n2, this.b() + aA2.p() * n2, this.a() + aA2.i() * n2);
    }

    public n(m m2) {
        this(m2.e(), m2.b(), m2.a());
    }

    @Override
    public n c(m m2) {
        return this.a(-m2.e(), -m2.b(), -m2.a());
    }

    public n(int n2, int n3, int n4) {
        super(n2, n3, n4);
    }

    public n(double d10, double d11, double d12) {
        super(d10, d11, d12);
    }

    public static Iterable<n> b(int n2, int n3, int n4, int n5, int n6, int n7) {
        return new g(n2, n3, n4, n5, n6, n7);
    }

    public static Iterable<n> b(n n2, n n3) {
        return net.minecraft.k.n.b(Math.min(n2.e(), n3.e()), Math.min(n2.b(), n3.b()), Math.min(n2.a(), n3.a()), Math.max(n2.e(), n3.e()), Math.max(n2.b(), n3.b()), Math.max(n2.a(), n3.a()));
    }

    public static n a(long l2) {
        int n2 = (int)(l2 << 64 - l - n >> 64 - n);
        int n3 = (int)(l2 << 64 - p - h >> 64 - h);
        int n4 = (int)(l2 << 64 - k >> 64 - k);
        return new n(n2, n3, n4);
    }

    public n a(int n2) {
        return this.a(aA.DOWN, n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public n a(int n2, int n3, int n4) {
        n n5;
        block5: {
            int n6;
            block6: {
                boolean bl2;
                block4: {
                    bl2 = net.minecraft.k.n.e();
                    n6 = n2;
                    if (bl2) break block4;
                    if (n6 != 0) break block5;
                    n6 = n3;
                }
                if (bl2) break block6;
                if (n6 != 0) break block5;
                n6 = n4;
            }
            if (n6 == 0) {
                n5 = this;
                return n5;
            }
        }
        n5 = new n(this.e() + n2, this.b() + n3, this.a() + n4);
        return n5;
    }

    public n(l l2) {
        this(l2.e, l2.d, l2.b);
    }

    public n b() {
        return this.d(1);
    }

    public n k() {
        return this.a(1);
    }

    public n(x x2) {
        this(x2.a, x2.aF, x2.ax);
    }

    public static boolean g() {
        return m;
    }

    public n b(int n2) {
        return this.a(aA.EAST, n2);
    }

    static Logger f() {
        return j;
    }

    public n a(m m2) {
        return new n(this.b() * m2.a() - this.a() * m2.b(), this.a() * m2.e() - this.e() * m2.a(), this.e() * m2.b() - this.b() * m2.e());
    }

    public n l() {
        return this;
    }

    public static Iterable<o> a(int n2, int n3, int n4, int n5, int n6, int n7) {
        return new a(n2, n3, n4, n5, n6, n7);
    }

    public n j() {
        return this.f(1);
    }
}

