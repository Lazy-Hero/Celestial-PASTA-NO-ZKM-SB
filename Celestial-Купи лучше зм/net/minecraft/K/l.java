/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.k;

import javax.annotation.Nullable;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.k.v;

public class l {
    public static final /* synthetic */ l a;
    public final /* synthetic */ double e;
    private static /* synthetic */ String c;
    public final /* synthetic */ double d;
    public final /* synthetic */ double b;

    public static void b(String string) {
        c = string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public l a(l l2, double d10) {
        double d11 = l2.e - this.e;
        double d12 = l2.d - this.d;
        boolean bl2 = n.e();
        double d13 = l2.b - this.b;
        double d14 = d11 * d11;
        double d15 = 1.0E-7f;
        if (!bl2) {
            if (d14 < d15) {
                return null;
            }
            d14 = d10 - this.e;
            d15 = d11;
        }
        double d16 = d14 / d15;
        double d17 = d16 - 0.0;
        double d18 = d17 == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
        if (!bl2) {
            if (d18 < 0) return null;
            double d19 = d16 - 1.0;
            d18 = d19 == 0.0 ? 0 : (d19 < 0.0 ? -1 : 1);
        }
        if (d18 > 0) return null;
        l l3 = new l(this.e + d11 * d16, this.d + d12 * d16, this.b + d13 * d16);
        return l3;
    }

    public double b(double d10, double d11, double d12) {
        double d13 = d10 - this.e;
        double d14 = d11 - this.d;
        double d15 = d12 - this.b;
        return d13 * d13 + d14 * d14 + d15 * d15;
    }

    public l c(double d10, double d11, double d12) {
        return new l(this.e + d10, this.d + d11, this.b + d12);
    }

    public double f(l l2) {
        double d10 = l2.e - this.e;
        double d11 = l2.d - this.d;
        double d12 = l2.b - this.b;
        return d10 * d10 + d11 * d11 + d12 * d12;
    }

    public static l a(float f10, float f11) {
        float f12 = h.c(-f11 * ((float)Math.PI / 180) - (float)Math.PI);
        float f13 = h.g(-f11 * ((float)Math.PI / 180) - (float)Math.PI);
        float f14 = -h.c(-f10 * ((float)Math.PI / 180));
        float f15 = h.g(-f10 * ((float)Math.PI / 180));
        return new l(f13 * f14, f15, f12 * f14);
    }

    public l a(double d10, double d11, double d12) {
        return this.c(-d10, -d11, -d12);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public l c(l l2, double d10) {
        double d11 = l2.e - this.e;
        double d12 = l2.d - this.d;
        double d13 = l2.b - this.b;
        boolean bl2 = n.g();
        double d14 = d12 * d12;
        double d15 = 1.0E-7f;
        if (bl2) {
            if (d14 < d15) {
                return null;
            }
            d14 = d10 - this.d;
            d15 = d12;
        }
        double d16 = d14 / d15;
        double d17 = d16 - 0.0;
        double d18 = d17 == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
        if (bl2) {
            if (d18 < 0) return null;
            double d19 = d16 - 1.0;
            d18 = d19 == 0.0 ? 0 : (d19 < 0.0 ? -1 : 1);
        }
        if (d18 > 0) return null;
        l l3 = new l(this.e + d11 * d16, this.d + d12 * d16, this.b + d13 * d16);
        return l3;
    }

    public l e(l l2) {
        return new l(l2.e - this.e, l2.d - this.d, l2.b - this.b);
    }

    public l a(double d10) {
        return new l(this.e * d10, this.d * d10, this.b * d10);
    }

    public String toString() {
        return "(" + this.e + ", " + this.d + ", " + this.b + ")";
    }

    public double c() {
        return this.e * this.e + this.d * this.d + this.b * this.b;
    }

    public l b(float f10) {
        float f11 = h.c(f10);
        float f12 = h.g(f10);
        double d10 = this.e * (double)f11 + this.b * (double)f12;
        double d11 = this.d;
        double d12 = this.b * (double)f11 - this.e * (double)f12;
        return new l(d10, d11, d12);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public l b(l l2, double d10) {
        double d11 = l2.e - this.e;
        double d12 = l2.d - this.d;
        boolean bl2 = n.e();
        double d13 = l2.b - this.b;
        double d14 = d13 * d13;
        double d15 = 1.0E-7f;
        if (!bl2) {
            if (d14 < d15) {
                return null;
            }
            d14 = d10 - this.b;
            d15 = d13;
        }
        double d16 = d14 / d15;
        double d17 = d16 - 0.0;
        double d18 = d17 == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
        if (!bl2) {
            if (d18 < 0) return null;
            double d19 = d16 - 1.0;
            d18 = d19 == 0.0 ? 0 : (d19 < 0.0 ? -1 : 1);
        }
        if (d18 > 0) return null;
        l l3 = new l(this.e + d11 * d16, this.d + d12 * d16, this.b + d13 * d16);
        return l3;
    }

    public static String b() {
        return c;
    }

    static {
        a = new l(0.0, 0.0, 0.0);
        l.b("Au5sPc");
    }

    public l a(l l2) {
        return new l(this.d * l2.b - this.b * l2.d, this.b * l2.e - this.e * l2.b, this.e * l2.d - this.d * l2.e);
    }

    public static l a(v v2) {
        return l.a(v2.j, v2.h);
    }

    public l d() {
        double d10 = h.e(this.e * this.e + this.d * this.d + this.b * this.b);
        return d10 < 1.0E-4 ? a : new l(this.e / d10, this.d / d10, this.b / d10);
    }

    public l b(l l2) {
        return this.a(l2.e, l2.d, l2.b);
    }

    public boolean equals(Object object) {
        boolean bl2 = n.e();
        Object object2 = this;
        if (!bl2) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        if (!bl2) {
            if (!(object2 instanceof l)) {
                return false;
            }
            object2 = object;
        }
        l l2 = (l)object2;
        int n2 = Double.compare(l2.e, this.e);
        if (!bl2) {
            if (n2 != 0) {
                return false;
            }
            n2 = Double.compare(l2.d, this.d);
        }
        if (!bl2) {
            if (n2 != 0) {
                return false;
            }
            n2 = Double.compare(l2.b, this.b);
        }
        if (!bl2) {
            n2 = n2 == 0 ? 1 : 0;
        }
        return n2 != 0;
    }

    public double a() {
        return h.e(this.e * this.e + this.d * this.d + this.b * this.b);
    }

    public double g(l l2) {
        return this.e * l2.e + this.d * l2.d + this.b * l2.b;
    }

    public l(double d10, double d11, double d12) {
        if (d10 == -0.0) {
            d10 = 0.0;
        }
        if (d11 == -0.0) {
            d11 = 0.0;
        }
        if (d12 == -0.0) {
            d12 = 0.0;
        }
        this.e = d10;
        this.d = d11;
        this.b = d12;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int hashCode() {
        long l2 = Double.doubleToLongBits(this.e);
        int n2 = (int)(l2 ^ l2 >>> 32);
        l2 = Double.doubleToLongBits(this.d);
        n2 = 31 * n2 + (int)(l2 ^ l2 >>> 32);
        l2 = Double.doubleToLongBits(this.b);
        n2 = 31 * n2 + (int)(l2 ^ l2 >>> 32);
        return n2;
    }

    public double d(l l2) {
        double d10 = l2.e - this.e;
        double d11 = l2.d - this.d;
        double d12 = l2.b - this.b;
        return h.e(d10 * d10 + d11 * d11 + d12 * d12);
    }

    public l(m m2) {
        this(m2.e(), m2.b(), m2.a());
    }

    public l c(l l2) {
        return this.c(l2.e, l2.d, l2.b);
    }

    public l a(float f10) {
        float f11 = h.c(f10);
        float f12 = h.g(f10);
        double d10 = this.e;
        double d11 = this.d * (double)f11 + this.b * (double)f12;
        double d12 = this.b * (double)f11 - this.d * (double)f12;
        return new l(d10, d11, d12);
    }
}

