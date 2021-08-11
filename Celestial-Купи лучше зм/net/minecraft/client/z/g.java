/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.z;

import net.minecraft.W.K;
import net.minecraft.client.z.c;
import net.minecraft.client.z.e;
import net.minecraft.client.z.f;
import net.minecraft.client.z.i;
import net.minecraft.client.z.j;
import net.minecraft.client.z.l;
import net.minecraft.client.z.m;
import net.minecraft.client.z.q;
import net.minecraft.client.z.r;
import net.minecraft.client.z.u;
import net.minecraft.u.h;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class g {
    private final /* synthetic */ net.minecraft.ar.m<c> a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int a(d d10, int n2) {
        c c10 = this.a.a(k.q.c(d10.w()));
        int n3 = m.b();
        c c11 = c10;
        if (n3 != 0) {
            if (c11 == null) {
                return -1;
            }
            c11 = c10;
        }
        int n4 = c11.a(d10, n2);
        return n4;
    }

    public void a(c c10, K ... arrk) {
        K[] arrk2 = arrk;
        int n2 = m.b();
        for (K k2 : arrk2) {
            this.a.a(c10, k.a(k.b(k2)));
            if (n2 != 0) continue;
        }
    }

    public g() {
        this.a = new net.minecraft.ar.m(32);
    }

    public void a(c c10, k ... arrk) {
        k[] arrk2 = arrk;
        int n2 = arrk2.length;
        int n3 = m.d();
        for (int i2 = 0; i2 < n2; ++i2) {
            k k2 = arrk2[i2];
            this.a.a(c10, k.a(k2));
            if (n3 == 0) continue;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static g a(m m2) {
        g g10;
        block0: {
            g10 = new g();
            int n2 = m.d();
            g10.a((c)new i(), h.ab, h.cy, h.E, h.K);
            g10.a((c)new u(), net.minecraft.u.g.bW);
            g10.a((c)new q(), h.bS);
            int n3 = n2;
            g10.a((c)new f(), h.V, h.b3, h.W);
            g10.a((c)new r(), h.bn);
            g10.a((c)new l(m2), net.minecraft.u.g.aU, net.minecraft.u.g.dc, net.minecraft.u.g.aW, net.minecraft.u.g.bU, net.minecraft.u.g.S, net.minecraft.u.g.c_);
            g10.a((c)new j(), h.aI);
            g10.a((c)new e(), h.a9);
            if (net.minecraft.k.m.d()) break block0;
            m.b(++n3);
        }
        return g10;
    }
}

