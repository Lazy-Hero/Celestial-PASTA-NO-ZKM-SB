/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ax;

import net.minecraft.B.X;
import net.minecraft.U.B;
import net.minecraft.ar.G;
import net.minecraft.ax.R;
import net.minecraft.ax.T;
import net.minecraft.ax.a;
import net.minecraft.ax.h;
import net.minecraft.ax.u;
import net.minecraft.u.b;

public class K
extends u {
    public final /* synthetic */ R f;

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public int f() {
        return 4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(u u2) {
        String[] arrstring = T.b();
        boolean bl2 = u2 instanceof K;
        if (arrstring != null) return bl2;
        if (bl2) {
            K k2 = (K)u2;
            R r2 = this.f;
            R r3 = k2.f;
            if (arrstring == null) {
                if (r2 == r3) {
                    return false;
                }
                r2 = this.f;
                r3 = R.FALL;
            }
            if (arrstring == null) {
                if (r2 == r3) return true;
                r2 = k2.f;
                r3 = R.FALL;
            }
            if (r2 != r3) return false;
            return true;
        }
        bl2 = super.a(u2);
        return bl2;
    }

    @Override
    public int a(int n2) {
        return this.f.c() + (n2 - 1) * this.f.a();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int a(int n2, G g10) {
        String[] arrstring = T.b();
        int n3 = g10.b();
        if (arrstring != null) return n3;
        if (n3 != 0) {
            return 0;
        }
        R r2 = this.f;
        R r3 = R.ALL;
        if (arrstring == null) {
            if (r2 == r3) {
                return n2;
            }
            r2 = this.f;
            r3 = R.FIRE;
        }
        if (arrstring == null) {
            if (r2 == r3) {
                int n4 = g10.n();
                if (arrstring != null) return n4;
                if (n4 != 0) {
                    n4 = n2 * 2;
                    return n4;
                }
            }
            r2 = this.f;
            r3 = R.FALL;
        }
        if (arrstring == null) {
            if (r2 == r3 && g10 == G.e) {
                return n2 * 3;
            }
            r2 = this.f;
            r3 = R.EXPLOSION;
        }
        if (arrstring == null) {
            if (r2 == r3) {
                int n5 = g10.j();
                if (arrstring != null) return n5;
                if (n5 != 0) {
                    n5 = n2 * 2;
                    return n5;
                }
            }
            r2 = this.f;
            r3 = R.PROJECTILE;
        }
        if (r2 != r3) return 0;
        int n6 = g10.o();
        if (arrstring != null) return n6;
        if (n6 == 0) return 0;
        n6 = n2 * 2;
        return n6;
    }

    public static double a(B b10, double d10) {
        int n2 = T.a(net.minecraft.u.b.m, b10);
        if (n2 > 0) {
            d10 -= (double)net.minecraft.k.h.f(d10 * (double)((float)n2 * 0.15f));
        }
        return d10;
    }

    @Override
    public String a() {
        return "enchantment.protect." + this.f.b();
    }

    @Override
    public int b(int n2) {
        return this.a(n2) + this.f.a();
    }

    public static int a(B b10, int n2) {
        int n3 = T.a(net.minecraft.u.b.u, b10);
        String[] arrstring = T.b();
        int n4 = n3;
        if (arrstring == null) {
            if (n4 > 0) {
                n2 -= net.minecraft.k.h.d((float)n2 * (float)n3 * 0.15f);
            }
            n4 = n2;
        }
        return n4;
    }

    public K(a a10, R r2, X ... arrx) {
        block3: {
            block2: {
                String[] arrstring = T.b();
                super(a10, h.ARMOR, arrx);
                String[] arrstring2 = arrstring;
                K k2 = this;
                if (arrstring2 != null) break block2;
                k2.f = r2;
                if (r2 != R.FALL) break block3;
                k2 = this;
            }
            k2.b = h.ARMOR_FEET;
        }
    }
}

