/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.z;

import javax.annotation.Nullable;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.client.z.a;
import net.minecraft.client.z.b;
import net.minecraft.client.z.d;
import net.minecraft.client.z.h;
import net.minecraft.client.z.k;
import net.minecraft.client.z.n;
import net.minecraft.client.z.o;
import net.minecraft.client.z.p;
import net.minecraft.client.z.s;
import net.minecraft.client.z.t;
import net.minecraft.client.z.v;
import net.minecraft.client.z.w;
import net.minecraft.client.z.x;
import net.minecraft.u.g;

public class m {
    private static /* synthetic */ int b;
    private final /* synthetic */ net.minecraft.ar.m<w> c;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int a(i i2, @Nullable net.minecraft.ah.t t2, @Nullable net.minecraft.k.n n2, int n3) {
        w w2 = this.c.a(K.b(i2.b()));
        int n4 = m.d();
        w w3 = w2;
        if (n4 == 0) {
            if (w3 == null) {
                return -1;
            }
            w3 = w2;
        }
        int n5 = w3.a(i2, t2, n2, n3);
        return n5;
    }

    public static int d() {
        int n2 = m.b();
        if (n2 == 0) {
            return 103;
        }
        return 0;
    }

    public static int b() {
        return b;
    }

    public static m c() {
        m m2 = new m();
        m2.a(new b(), g.bW);
        m2.a(new s(m2), g.cA);
        int n2 = m.d();
        m2.a(new p(), g.aU);
        m2.a(new n(), g.bU);
        m2.a(new t(), g.S);
        int n3 = n2;
        m2.a(new a(), g.bQ, g.cL);
        m2.a(new h(), g.bK);
        m2.a(new d(), g.aZ);
        m2.a(new x(), g.aM, g.Q);
        m2.a(new o(), g.dc);
        m2.a(new v(), g.aW);
        m2.a(new k(), g.c_);
        if (n3 != 0) {
            net.minecraft.k.m.b(!net.minecraft.k.m.c());
        }
        return m2;
    }

    public m() {
        this.c = new net.minecraft.ar.m(32);
    }

    static {
        if (m.b() == 0) {
            m.b(25);
        }
    }

    public void a(w w2, K ... arrk) {
        K[] arrk2 = arrk;
        int n2 = m.d();
        for (K k2 : arrk2) {
            this.c.a(w2, K.b(k2));
            if (n2 == 0) continue;
        }
    }

    public static void b(int n2) {
        b = n2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int a(i i2, z z2, net.minecraft.k.n n2) {
        net.minecraft.ac.a a10;
        w w2 = this.c.a(K.b(i2.b()));
        int n3 = m.d();
        w w3 = w2;
        if (n3 != 0) return w3.a(i2, null, null, 0);
        if (w3 != null) {
            w3 = w2;
            return w3.a(i2, null, null, 0);
        }
        net.minecraft.ac.a a11 = a10 = i2.a((net.minecraft.ah.t)z2, n2);
        if (n3 == 0) {
            if (a11 == null) return -1;
            a11 = a10;
        }
        int n4 = a11.J;
        return n4;
    }
}

