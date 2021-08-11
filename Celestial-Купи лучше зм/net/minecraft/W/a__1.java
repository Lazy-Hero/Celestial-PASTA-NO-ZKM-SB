/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 */
package net.minecraft.w;

import com.google.common.collect.Multimap;
import net.minecraft.B.X;
import net.minecraft.U.B;
import net.minecraft.U.M;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.j.f;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.a8;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class a_
extends k {
    private final /* synthetic */ a8 t;
    private final /* synthetic */ float s;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public Multimap<String, f> a(X x2) {
        Multimap<String, f> multimap;
        block3: {
            block2: {
                multimap = super.a(x2);
                int n2 = bl.g();
                if (n2 == 0) break block2;
                if (x2 != X.MAINHAND) break block3;
                multimap.put((Object)M.g.c(), (Object)new f(h, "Weapon modifier", this.s, 0));
            }
            multimap.put((Object)M.j.c(), (Object)new f(b, "Weapon modifier", -2.4f, 0));
        }
        return multimap;
    }

    @Override
    public boolean d() {
        return true;
    }

    public a_(a8 a82) {
        this.t = a82;
        this.f = 1;
        this.d(a82.c());
        this.a(net.minecraft.ad.a.o);
        this.s = 3.0f + a82.a();
    }

    @Override
    public boolean a(d d10, z z2, i i2, n n2, B b10) {
        int n3 = bl.g();
        double d11 = (double)i2.b(z2, n2) - 0.0;
        double d12 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
        if (n3 != 0) {
            if (d12 != false) {
                d10.a(2, b10);
            }
            d12 = 1.0;
        }
        return (boolean)d12;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public float a(d d10, i i2) {
        c c10;
        K k2 = i2.b();
        int n2 = bl.g();
        if (k2 == g.dh) {
            return 15.0f;
        }
        c c11 = c10 = i2.o();
        c c12 = c.f;
        if (n2 != 0) {
            if (c11 == c12) return 1.5f;
            c11 = c10;
            c12 = c.z;
        }
        if (n2 != 0) {
            if (c11 == c12) return 1.5f;
            c11 = c10;
            c12 = c.j;
        }
        if (n2 != 0) {
            if (c11 == c12) return 1.5f;
            c11 = c10;
            c12 = c.J;
        }
        if (n2 != 0) {
            if (c11 == c12) return 1.5f;
            c11 = c10;
            c12 = c.h;
        }
        if (c11 == c12) return 1.5f;
        return 1.0f;
    }

    @Override
    public boolean a(i i2) {
        return i2.b() == g.dh;
    }

    public float b() {
        return this.t.a();
    }

    @Override
    public int o() {
        return this.t.e();
    }

    @Override
    public boolean a(d d10, B b10, B b11) {
        d10.a(1, b11);
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(d d10, d d11) {
        int n2 = bl.g();
        a_ a_2 = this;
        if (n2 != 0) {
            if (a_2.t.d() == d11.w()) return true;
            a_2 = this;
        }
        boolean bl2 = super.a(d10, d11);
        if (n2 == 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    public String a() {
        return this.t.toString();
    }
}

