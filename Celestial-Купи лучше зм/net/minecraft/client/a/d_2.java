/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
package net.minecraft.client.A;

import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.a2;
import net.minecraft.aN;
import net.minecraft.ar.v;
import net.minecraft.client.A.a;
import net.minecraft.client.A.b;
import net.minecraft.client.A.c;
import net.minecraft.client.A.e;
import net.minecraft.client.Q;
import net.minecraft.client.a.p;
import net.minecraft.client.b.q;
import net.minecraft.client.j.u;
import net.minecraft.k.h;
import net.minecraft.k.m;

public class d
extends q {
    private final /* synthetic */ a q;
    private final /* synthetic */ Q h;
    private final /* synthetic */ a2 a;
    private final /* synthetic */ String l;
    private /* synthetic */ int u;
    private /* synthetic */ int g;
    private final /* synthetic */ net.minecraft.w.d r;
    private /* synthetic */ float w;
    private final /* synthetic */ int k;
    private final /* synthetic */ aN v;
    private /* synthetic */ int s;
    private final /* synthetic */ c p;
    private /* synthetic */ boolean o;
    private final /* synthetic */ Map<aN, c> j;
    private /* synthetic */ int t;
    private final /* synthetic */ b n;
    private /* synthetic */ int m;
    private /* synthetic */ int i;

    public boolean d(int n2, int n3, int n4, int n5) {
        return this.q.a(n2, n3, this.k, n4, n5);
    }

    @Nullable
    public c b(aN aN2) {
        return this.j.get(aN2);
    }

    public aN a() {
        return this.v;
    }

    public b b() {
        return this.n;
    }

    public void c() {
        block9: {
            m[] arrm;
            block13: {
                block12: {
                    block11: {
                        arrm = net.minecraft.client.A.e.b();
                        int n2 = this.o;
                        if (arrm != null) {
                            if (n2 == 0) {
                                this.t = 117 - (this.s + this.m) / 2;
                                this.g = 56 - (this.u + this.i) / 2;
                                this.o = true;
                            }
                            net.minecraft.client.a.v.o(518);
                            net.minecraft.client.A.d.a(0, 0, 234, 113, -16777216);
                            n2 = 515;
                        }
                        net.minecraft.client.a.v.o(n2);
                        v v2 = this.a.g();
                        if (arrm == null) break block11;
                        if (v2 == null) break block12;
                        this.h.aN().b(v2);
                    }
                    if (arrm != null) break block13;
                }
                this.h.aN().b(net.minecraft.client.j.u.f);
            }
            net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
            int n3 = this.t % 16;
            int n4 = this.g % 16;
            int n5 = -1;
            while (n5 <= 15) {
                block10: {
                    if (arrm == null) break block9;
                    for (int i2 = -1; i2 <= 8; ++i2) {
                        net.minecraft.client.A.d.a(n3 + 16 * n5, n4 + 16 * i2, 0.0f, 0.0f, 16.0f, 16.0f, 16.0f, 16.0f);
                        if (arrm != null) {
                            if (arrm != null) continue;
                        }
                        break block10;
                    }
                    ++n5;
                }
                if (arrm != null) continue;
            }
            this.p.a(this.t, this.g, true);
            this.p.a(this.t, this.g, false);
            this.p.a(this.t, this.g);
        }
    }

    public void a(int n2, int n3) {
        block6: {
            block5: {
                d d10;
                int n4;
                int n5;
                block4: {
                    m[] arrm = net.minecraft.client.A.e.b();
                    n5 = this.s - this.m;
                    n4 = 234;
                    if (arrm == null) break block4;
                    if (n5 > n4) {
                        this.t = net.minecraft.k.h.c(this.t + n2, -(this.s - 234), 0);
                    }
                    d10 = this;
                    if (arrm == null) break block5;
                    n5 = d10.u - this.i;
                    n4 = 113;
                }
                if (n5 <= n4) break block6;
                d10 = this;
            }
            d10.g = net.minecraft.k.h.c(this.g + n3, -(this.u - 113), 0);
        }
    }

    private void a(c c10, aN aN2) {
        this.j.put(aN2, c10);
        int n2 = c10.a();
        int n3 = n2 + 28;
        int n4 = c10.c();
        int n5 = n4 + 27;
        this.m = Math.min(this.m, n2);
        this.s = Math.max(this.s, n3);
        m[] arrm = net.minecraft.client.A.e.b();
        this.i = Math.min(this.i, n4);
        this.u = Math.max(this.u, n5);
        for (c c11 : this.j.values()) {
            c11.b();
            if (arrm != null) continue;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * WARNING - void declaration
     */
    public void c(int n2, int n3, int n4, int n5) {
        block9: {
            block8: {
                m[] arrm;
                block7: {
                    int n6;
                    block3: {
                        void var6_7;
                        block4: {
                            m[] arrm2 = net.minecraft.client.A.e.b();
                            net.minecraft.client.a.v.M();
                            arrm = arrm2;
                            net.minecraft.client.a.v.b(0.0f, 0.0f, 200.0f);
                            net.minecraft.client.A.d.a(0, 0, 234, 113, net.minecraft.k.h.d(this.w * 255.0f) << 24);
                            boolean n7 = false;
                            n6 = n2;
                            if (arrm == null) break block3;
                            if (n6 <= 0) break block4;
                            n6 = n2;
                            if (arrm == null) break block3;
                            if (n6 >= 234) break block4;
                            n6 = n3;
                            if (arrm == null) break block3;
                            if (n6 <= 0) break block4;
                            n6 = n3;
                            if (arrm == null) break block3;
                            if (n6 >= 113) break block4;
                            for (c c10 : this.j.values()) {
                                block6: {
                                    boolean bl2;
                                    block5: {
                                        n6 = c10.a(this.t, this.g, n2, n3) ? 1 : 0;
                                        if (arrm == null) break block3;
                                        if (arrm == null) break block5;
                                        if (n6 == 0) break block6;
                                        bl2 = true;
                                    }
                                    var6_7 = bl2;
                                    c10.a(this.t, this.g, this.w, n4, n5);
                                    if (arrm != null) break;
                                }
                                if (arrm != null) continue;
                            }
                        }
                        net.minecraft.client.a.v.B();
                        if (arrm == null) break block7;
                        n6 = var6_7;
                    }
                    if (n6 == 0) break block8;
                    this.w = net.minecraft.k.h.c(this.w + 0.02f, 0.0f, 0.3f);
                }
                if (arrm != null) break block9;
            }
            this.w = net.minecraft.k.h.c(this.w - 0.04f, 0.0f, 1.0f);
        }
    }

    public void a(aN aN2) {
        if (aN2.d() != null) {
            c c10 = new c(this, this.h, aN2, aN2.d());
            this.a(c10, aN2);
        }
    }

    @Nullable
    public static d a(Q q2, b b10, int n2, aN aN2) {
        m[] arrm = net.minecraft.client.A.e.b();
        if (aN2.d() == null) {
            return null;
        }
        for (a a10 : net.minecraft.client.A.a.values()) {
            int n3 = n2;
            int n4 = a10.a();
            if (arrm != null) {
                if (n3 < n4) {
                    return new d(q2, b10, a10, n2, aN2, aN2.d());
                }
                n3 = n2;
                n4 = a10.a();
            }
            n2 = n3 - n4;
            if (arrm != null) continue;
        }
        return null;
    }

    public void a(int n2, int n3, p p2) {
        this.q.a(n2, n3, this.k, p2, this.r);
    }

    public String d() {
        return this.l;
    }

    public void a(int n2, int n3, boolean bl2) {
        this.q.a(this, n2, n3, bl2, this.k);
    }

    public d(Q q2, b b10, a a10, int n2, aN aN2, a2 a22) {
        this.j = Maps.newLinkedHashMap();
        this.m = Integer.MAX_VALUE;
        this.i = Integer.MAX_VALUE;
        this.s = Integer.MIN_VALUE;
        this.u = Integer.MIN_VALUE;
        this.h = q2;
        this.n = b10;
        this.q = a10;
        this.k = n2;
        this.v = aN2;
        this.a = a22;
        this.r = a22.f();
        this.l = a22.i().a();
        this.p = new c(this, q2, aN2, a22);
        this.a(this.p, aN2);
    }
}

