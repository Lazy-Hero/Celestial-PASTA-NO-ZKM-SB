/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  javax.annotation.concurrent.Immutable
 */
package net.minecraft.k;

import com.google.common.base.MoreObjects;
import javax.annotation.concurrent.Immutable;
import net.minecraft.k.h;
import net.minecraft.k.n;

@Immutable
public class m
implements Comparable<m> {
    private static /* synthetic */ boolean b;
    private final /* synthetic */ int f;
    public static final /* synthetic */ m d;
    private final /* synthetic */ int e;
    private final /* synthetic */ int c;

    public int hashCode() {
        return (this.b() + this.a() * 31) * 31 + this.e();
    }

    public static boolean d() {
        boolean bl2 = m.c();
        return !bl2;
    }

    public double a(int n2, int n3, int n4) {
        double d10 = this.e() - n2;
        double d11 = this.b() - n3;
        double d12 = this.a() - n4;
        return Math.sqrt(d10 * d10 + d11 * d11 + d12 * d12);
    }

    public int b() {
        return this.e;
    }

    public static void b(boolean bl2) {
        b = bl2;
    }

    public int e() {
        return this.f;
    }

    private static gP c(gP gP2) {
        return gP2;
    }

    public static boolean c() {
        return b;
    }

    static {
        d = new m(0, 0, 0);
        m.b(false);
    }

    public boolean equals(Object object) {
        int n2;
        block11: {
            int n3;
            block10: {
                boolean bl2 = n.e();
                Object object2 = this;
                if (!bl2) {
                    if (object2 == object) {
                        return true;
                    }
                    object2 = object;
                }
                if (!bl2) {
                    if (!(object2 instanceof m)) {
                        return false;
                    }
                    object2 = object;
                }
                m m2 = (m)object2;
                n2 = this.e();
                n3 = m2.e();
                if (!bl2) {
                    if (n2 != n3) {
                        return false;
                    }
                    n2 = this.b();
                    n3 = m2.b();
                }
                if (bl2) break block10;
                if (n2 != n3) {
                    return false;
                }
                n2 = this.a();
                if (bl2) break block11;
                n3 = m2.a();
            }
            n2 = n2 == n3 ? 1 : 0;
        }
        return n2 != 0;
    }

    public double a(double d10, double d11, double d12) {
        double d13 = (double)this.e() + 0.5 - d10;
        double d14 = (double)this.b() + 0.5 - d11;
        double d15 = (double)this.a() + 0.5 - d12;
        return d13 * d13 + d14 * d14 + d15 * d15;
    }

    public double b(m m2) {
        return this.b(m2.e(), m2.b(), m2.a());
    }

    /*
     * Enabled aggressive block sorting
     */
    public int a(m m2) {
        int n2;
        boolean bl2 = n.g();
        int n3 = this.b();
        int n4 = m2.b();
        if (!bl2) return n3 - n4;
        if (n3 != n4) {
            n3 = this.b();
            n4 = m2.b();
            return n3 - n4;
        }
        int n5 = this.a();
        int n6 = m2.a();
        if (bl2) {
            if (n5 == n6) {
                n2 = this.e() - m2.e();
                return n2;
            }
            n5 = this.a();
            n6 = m2.a();
        }
        n2 = n5 - n6;
        return n2;
    }

    public int a() {
        return this.c;
    }

    public m(int n2, int n3, int n4) {
        this.f = n2;
        this.e = n3;
        this.c = n4;
    }

    public m c(m m2) {
        return new m(this.b() * m2.a() - this.a() * m2.b(), this.a() * m2.e() - this.e() * m2.a(), this.e() * m2.b() - this.b() * m2.e());
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("x", this.e()).add("y", this.b()).add("z", this.a()).toString();
    }

    public double b(double d10, double d11, double d12) {
        double d13 = (double)this.e() - d10;
        double d14 = (double)this.b() - d11;
        double d15 = (double)this.a() - d12;
        return d13 * d13 + d14 * d14 + d15 * d15;
    }

    public m(double d10, double d11, double d12) {
        this(h.f(d10), h.f(d11), h.f(d12));
    }
}

