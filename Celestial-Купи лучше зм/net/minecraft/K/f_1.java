/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.k;

import net.minecraft.U.x;
import net.minecraft.k.n;

public class f {
    private /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public f(n n2) {
        this.a = 0;
        this.c = n2.e() >> 4;
        this.b = n2.a() >> 4;
    }

    public int a() {
        return this.b << 4;
    }

    public int hashCode() {
        boolean bl2 = n.e();
        int n2 = this.a;
        if (!bl2) {
            if (n2 != 0) {
                return this.a;
            }
            n2 = 1664525 * this.c + 1013904223;
        }
        int n3 = n2;
        int n4 = 1664525 * (this.b ^ 0xDEADBEEF) + 1013904223;
        this.a = n3 ^ n4;
        return this.a;
    }

    public n a(int n2, int n3, int n4) {
        return new n((this.c << 4) + n2, n3, (this.b << 4) + n4);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int b() {
        return this.c << 4;
    }

    public static long a(int n2, int n3) {
        return (long)n2 & 0xFFFFFFFFL | ((long)n3 & 0xFFFFFFFFL) << 32;
    }

    public String toString() {
        return "[" + this.c + ", " + this.b + "]";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        boolean bl2 = n.g();
        Object object2 = this;
        if (bl2) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        if (bl2) {
            if (!(object2 instanceof f)) {
                return false;
            }
            object2 = object;
        }
        f f10 = (f)object2;
        int n2 = this.c;
        int n3 = f10.c;
        if (bl2) {
            if (n2 != n3) return 0 != 0;
            n2 = this.b;
            if (!bl2) return n2 != 0;
            n3 = f10.b;
        }
        if (n2 != n3) return 0 != 0;
        return 1 != 0;
    }

    public int d() {
        return (this.b << 4) + 15;
    }

    public int c() {
        return (this.c << 4) + 15;
    }

    public f(int n2, int n3) {
        this.a = 0;
        this.c = n2;
        this.b = n3;
    }

    public double a(x x2) {
        double d10 = this.c * 16 + 8;
        double d11 = this.b * 16 + 8;
        double d12 = d10 - x2.a;
        double d13 = d11 - x2.ax;
        return d12 * d12 + d13 * d13;
    }
}

