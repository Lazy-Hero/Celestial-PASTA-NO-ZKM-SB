/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import java.util.Iterator;
import java.util.List;
import net.minecraft.ag.C;
import net.minecraft.ak.h;

public class A
extends h {
    private /* synthetic */ int f;
    /* synthetic */ double e;
    /* synthetic */ C c;
    /* synthetic */ C d;

    @Override
    public boolean c() {
        double d10;
        C c10;
        String string;
        block9: {
            string = h.h();
            C c11 = this.d;
            if (string == null) {
                if (c11.z() >= 0) {
                    return false;
                }
                c11 = this.d;
            }
            List<?> list = c11.aG.a(this.d.getClass(), this.d.m().a(8.0, 4.0, 8.0));
            c10 = null;
            double d11 = Double.MAX_VALUE;
            Iterator<?> iterator = list.iterator();
            while (iterator.hasNext()) {
                block11: {
                    double d12;
                    C c12;
                    block12: {
                        double d13;
                        C c13;
                        block10: {
                            c13 = c12 = (C)iterator.next();
                            if (string != null) break block10;
                            d10 = c13.z();
                            if (string != null) break block9;
                            if (d10 < 0) break block11;
                            c13 = this.d;
                        }
                        d12 = d13 = c13.s(c12);
                        if (string != null) break block12;
                        if (!(d12 <= d11)) break block11;
                        d12 = d13;
                    }
                    d11 = d12;
                    c10 = c12;
                }
                if (string == null) continue;
            }
            if (c10 == null) {
                return false;
            }
            double d14 = d11 - 9.0;
            d10 = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
        }
        if (string == null) {
            if (d10 < 0) {
                return false;
            }
            this.c = c10;
            d10 = 1.0;
        }
        return (boolean)d10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void g() {
        this.c = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean e() {
        double d10;
        block12: {
            String string;
            block11: {
                C c10;
                block10: {
                    int n2;
                    block9: {
                        string = h.h();
                        n2 = this.d.z();
                        if (string != null) break block9;
                        if (n2 >= 0) {
                            return false;
                        }
                        c10 = this.c;
                        if (string != null) break block10;
                        n2 = c10.aL() ? 1 : 0;
                    }
                    if (n2 == 0) {
                        return false;
                    }
                    c10 = this.d;
                }
                double d11 = c10.s(this.c);
                double d12 = d11 - 9.0;
                d10 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                if (string != null) break block11;
                if (d10 < 0) break block12;
                double d13 = d11 - 256.0;
                d10 = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
            }
            if (string != null) return (boolean)d10;
            if (d10 <= 0) {
                d10 = 1.0;
                return (boolean)d10;
            }
        }
        d10 = 0.0;
        return (boolean)d10;
    }

    @Override
    public void b() {
        String string = h.h();
        int n2 = this.f = this.f - 1;
        if (string == null && n2 <= 0) {
            this.f = 10;
            n2 = this.d.l().a(this.c, this.e) ? 1 : 0;
        }
    }

    public A(C c10, double d10) {
        this.d = c10;
        this.e = d10;
    }

    @Override
    public void a() {
        this.f = 0;
    }
}

