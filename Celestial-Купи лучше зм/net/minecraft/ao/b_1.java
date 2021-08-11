/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 */
package net.minecraft.ao;

import com.google.common.base.MoreObjects;
import net.minecraft.P.t;
import net.minecraft.ao.u;
import net.minecraft.ar.aA;
import net.minecraft.k.m;

public class b {
    public /* synthetic */ int b;
    public /* synthetic */ int e;
    public /* synthetic */ int c;
    public /* synthetic */ int f;
    public /* synthetic */ int a;
    public /* synthetic */ int d;

    public int a() {
        return this.d - this.f + 1;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public b(int n2, int n3, int n4, int n5) {
        this.c = n2;
        this.f = n3;
        this.a = n4;
        this.d = n5;
        this.e = 1;
        this.b = 512;
    }

    public void a(int n2, int n3, int n4) {
        this.c += n2;
        this.e += n3;
        this.f += n4;
        this.a += n2;
        this.b += n3;
        this.d += n4;
    }

    public b(int[] arrn) {
        block3: {
            block2: {
                String[] arrstring = u.b();
                String[] arrstring2 = arrstring;
                if (arrstring2 == null) break block2;
                if (arrn.length != 6) break block3;
                this.c = arrn[0];
                this.e = arrn[1];
                this.f = arrn[2];
                this.a = arrn[3];
                this.b = arrn[4];
            }
            this.d = arrn[5];
        }
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("x0", this.c).add("y0", this.e).add("z0", this.f).add("x1", this.a).add("y1", this.b).add("z1", this.d).toString();
    }

    public b() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(m m2) {
        String[] arrstring = u.b();
        int n2 = m2.e();
        int n3 = this.c;
        if (arrstring != null) {
            if (n2 < n3) return 0 != 0;
            n2 = m2.e();
            n3 = this.a;
        }
        if (arrstring != null) {
            if (n2 > n3) return 0 != 0;
            n2 = m2.a();
            n3 = this.f;
        }
        if (arrstring != null) {
            if (n2 < n3) return 0 != 0;
            n2 = m2.a();
            n3 = this.d;
        }
        if (arrstring != null) {
            if (n2 > n3) return 0 != 0;
            n2 = m2.b();
            n3 = this.e;
        }
        if (arrstring != null) {
            if (n2 < n3) return 0 != 0;
            n2 = m2.b();
            if (arrstring == null) return n2 != 0;
            n3 = this.b;
        }
        if (n2 > n3) return 0 != 0;
        return 1 != 0;
    }

    public m b() {
        return new m(this.a - this.c, this.b - this.e, this.d - this.f);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(b b10) {
        String[] arrstring = u.b();
        int n2 = this.a;
        int n3 = b10.c;
        if (arrstring != null) {
            if (n2 < n3) return 0 != 0;
            n2 = this.c;
            n3 = b10.a;
        }
        if (arrstring != null) {
            if (n2 > n3) return 0 != 0;
            n2 = this.d;
            n3 = b10.f;
        }
        if (arrstring != null) {
            if (n2 < n3) return 0 != 0;
            n2 = this.f;
            n3 = b10.d;
        }
        if (arrstring != null) {
            if (n2 > n3) return 0 != 0;
            n2 = this.b;
            n3 = b10.e;
        }
        if (arrstring != null) {
            if (n2 < n3) return 0 != 0;
            n2 = this.e;
            if (arrstring == null) return n2 != 0;
            n3 = b10.b;
        }
        if (n2 > n3) return 0 != 0;
        return 1 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(int n2, int n3, int n4, int n5) {
        String[] arrstring = u.b();
        int n6 = this.a;
        int n7 = n2;
        if (arrstring != null) {
            if (n6 < n7) return 0 != 0;
            n6 = this.c;
            n7 = n4;
        }
        if (arrstring != null) {
            if (n6 > n7) return 0 != 0;
            n6 = this.d;
            n7 = n3;
        }
        if (arrstring != null) {
            if (n6 < n7) return 0 != 0;
            n6 = this.f;
            if (arrstring == null) return n6 != 0;
            n7 = n5;
        }
        if (n6 > n7) return 0 != 0;
        return 1 != 0;
    }

    public static b d() {
        return new b(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public static b a(int n2, int n3, int n4, int n5, int n6, int n7) {
        return new b(Math.min(n2, n5), Math.min(n3, n6), Math.min(n4, n7), Math.max(n2, n5), Math.max(n3, n6), Math.max(n4, n7));
    }

    public static b a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, aA aA2) {
        switch (aA2) {
            case NORTH: {
                return new b(n2 + n5, n3 + n6, n4 - n10 + 1 + n7, n2 + n8 - 1 + n5, n3 + n9 - 1 + n6, n4 + n7);
            }
            case SOUTH: {
                return new b(n2 + n5, n3 + n6, n4 + n7, n2 + n8 - 1 + n5, n3 + n9 - 1 + n6, n4 + n10 - 1 + n7);
            }
            case WEST: {
                return new b(n2 - n10 + 1 + n7, n3 + n6, n4 + n5, n2 + n7, n3 + n9 - 1 + n6, n4 + n8 - 1 + n5);
            }
            case EAST: {
                return new b(n2 + n7, n3 + n6, n4 + n5, n2 + n10 - 1 + n7, n3 + n9 - 1 + n6, n4 + n8 - 1 + n5);
            }
        }
        return new b(n2 + n5, n3 + n6, n4 + n7, n2 + n8 - 1 + n5, n3 + n9 - 1 + n6, n4 + n10 - 1 + n7);
    }

    public int f() {
        return this.a - this.c + 1;
    }

    public t e() {
        return new t(new int[]{this.c, this.e, this.f, this.a, this.b, this.d});
    }

    public b(b b10) {
        this.c = b10.c;
        this.e = b10.e;
        this.f = b10.f;
        this.a = b10.a;
        this.b = b10.b;
        this.d = b10.d;
    }

    public b(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.c = n2;
        this.e = n3;
        this.f = n4;
        this.a = n5;
        this.b = n6;
        this.d = n7;
    }

    public void a(b b10) {
        this.c = Math.min(this.c, b10.c);
        this.e = Math.min(this.e, b10.e);
        this.f = Math.min(this.f, b10.f);
        this.a = Math.max(this.a, b10.a);
        this.b = Math.max(this.b, b10.b);
        this.d = Math.max(this.d, b10.d);
    }

    public b(m m2, m m3) {
        this.c = Math.min(m2.e(), m3.e());
        this.e = Math.min(m2.b(), m3.b());
        this.f = Math.min(m2.a(), m3.a());
        this.a = Math.max(m2.e(), m3.e());
        this.b = Math.max(m2.b(), m3.b());
        this.d = Math.max(m2.a(), m3.a());
    }

    public int c() {
        return this.b - this.e + 1;
    }
}

