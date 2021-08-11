/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.az;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.W.K;
import net.minecraft.W.co;
import net.minecraft.az.i;
import net.minecraft.k.m;
import net.minecraft.u.h;
import net.minecraft.w.aY;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class g {
    private final /* synthetic */ Map<d, Float> b;
    private static final /* synthetic */ g c;
    private final /* synthetic */ Map<d, d> a;

    public static g a() {
        return c;
    }

    static {
        c = new g();
    }

    private g() {
        this.a = Maps.newHashMap();
        this.b = Maps.newHashMap();
        this.a(net.minecraft.u.g.ak, new d(h.ad), 0.7f);
        this.a(net.minecraft.u.g.aK, new d(h.I), 1.0f);
        this.a(net.minecraft.u.g.cO, new d(h.ag), 1.0f);
        this.a(net.minecraft.u.g.aO, new d(net.minecraft.u.g.a), 0.1f);
        this.a(h.aP, new d(h.cw), 0.35f);
        this.a(h.aV, new d(h.b2), 0.35f);
        this.a(h.bp, new d(h.F), 0.35f);
        this.a(h.cz, new d(h.bT), 0.35f);
        this.a(h.h, new d(h.ct), 0.35f);
        this.a(net.minecraft.u.g.cW, new d(net.minecraft.u.g.bx), 0.1f);
        this.a(new d(net.minecraft.u.g.ay, 1, co.B), new d(net.minecraft.u.g.ay, 1, co.A), 0.1f);
        this.a(h.ca, new d(h.by), 0.3f);
        this.a(net.minecraft.u.g.d, new d(net.minecraft.u.g.an), 0.35f);
        this.a(net.minecraft.u.g.aA, new d(h.aL, 1, bl.GREEN.a()), 0.2f);
        this.a(net.minecraft.u.g.bu, new d(h.b4, 1, 1), 0.15f);
        this.a(net.minecraft.u.g.aB, new d(h.b4, 1, 1), 0.15f);
        this.a(net.minecraft.u.g.au, new d(h.aO), 1.0f);
        this.a(h.f, new d(h.bg), 0.35f);
        this.a(net.minecraft.u.g.j, new d(h.b0), 0.1f);
        this.a(new d(net.minecraft.u.g.a2, 1, 1), new d(net.minecraft.u.g.a2, 1, 0), 0.15f);
        this.a(h.au, new d(h.r), 0.1f);
        for (aY aY2 : aY.values()) {
            if (!aY2.e()) continue;
            this.a(new d(h.aw, 1, aY2.a()), new d(h.cd, 1, aY2.a()), 0.35f);
        }
        this.a(net.minecraft.u.g.l, new d(h.b4), 0.1f);
        this.a(net.minecraft.u.g.cu, new d(h.a7), 0.7f);
        this.a(net.minecraft.u.g.aC, new d(h.aL, 1, bl.BLUE.a()), 0.2f);
        this.a(net.minecraft.u.g.u, new d(h.J), 0.2f);
        this.a(h.p, new d(h.a8), 0.1f);
        this.a(h.a4, new d(h.a8), 0.1f);
        this.a(h.H, new d(h.a8), 0.1f);
        this.a(h.b_, new d(h.a8), 0.1f);
        this.a(h.aZ, new d(h.a8), 0.1f);
        this.a(h.u, new d(h.a8), 0.1f);
        this.a(h.cv, new d(h.a8), 0.1f);
        this.a(h.b6, new d(h.a8), 0.1f);
        this.a(h.bs, new d(h.a8), 0.1f);
        this.a(h.af, new d(h.a8), 0.1f);
        this.a(h.aK, new d(h.a8), 0.1f);
        this.a(h.aa, new d(h.a8), 0.1f);
        this.a(h.D, new d(h.a8), 0.1f);
        this.a(h.a, new d(h.a8), 0.1f);
        this.a(h.bO, new d(h.bM), 0.1f);
        this.a(h.b5, new d(h.bM), 0.1f);
        this.a(h.B, new d(h.bM), 0.1f);
        this.a(h.e, new d(h.bM), 0.1f);
        this.a(h.X, new d(h.bM), 0.1f);
        this.a(h.S, new d(h.bM), 0.1f);
        this.a(h.cF, new d(h.bM), 0.1f);
        this.a(h.bP, new d(h.bM), 0.1f);
        this.a(h.cs, new d(h.bM), 0.1f);
        this.a(h.bf, new d(h.bM), 0.1f);
        this.a(new d(net.minecraft.u.g.ck, 1, bl.WHITE.e()), new d(net.minecraft.u.g.c7), 0.1f);
        this.a(new d(net.minecraft.u.g.ck, 1, bl.ORANGE.e()), new d(net.minecraft.u.g.A), 0.1f);
        this.a(new d(net.minecraft.u.g.ck, 1, bl.MAGENTA.e()), new d(net.minecraft.u.g.bb), 0.1f);
        this.a(new d(net.minecraft.u.g.ck, 1, bl.LIGHT_BLUE.e()), new d(net.minecraft.u.g.c0), 0.1f);
        this.a(new d(net.minecraft.u.g.ck, 1, bl.YELLOW.e()), new d(net.minecraft.u.g.cn), 0.1f);
        this.a(new d(net.minecraft.u.g.ck, 1, bl.LIME.e()), new d(net.minecraft.u.g.b3), 0.1f);
        this.a(new d(net.minecraft.u.g.ck, 1, bl.PINK.e()), new d(net.minecraft.u.g.cf), 0.1f);
        this.a(new d(net.minecraft.u.g.ck, 1, bl.GRAY.e()), new d(net.minecraft.u.g.b2), 0.1f);
        this.a(new d(net.minecraft.u.g.ck, 1, bl.SILVER.e()), new d(net.minecraft.u.g.cc), 0.1f);
        this.a(new d(net.minecraft.u.g.ck, 1, bl.CYAN.e()), new d(net.minecraft.u.g.a9), 0.1f);
        this.a(new d(net.minecraft.u.g.ck, 1, bl.PURPLE.e()), new d(net.minecraft.u.g.T), 0.1f);
        this.a(new d(net.minecraft.u.g.ck, 1, bl.BLUE.e()), new d(net.minecraft.u.g.c1), 0.1f);
        this.a(new d(net.minecraft.u.g.ck, 1, bl.BROWN.e()), new d(net.minecraft.u.g.ab), 0.1f);
        this.a(new d(net.minecraft.u.g.ck, 1, bl.GREEN.e()), new d(net.minecraft.u.g.ax), 0.1f);
        this.a(new d(net.minecraft.u.g.ck, 1, bl.RED.e()), new d(net.minecraft.u.g.c2), 0.1f);
        this.a(new d(net.minecraft.u.g.ck, 1, bl.BLACK.e()), new d(net.minecraft.u.g.c6), 0.1f);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public d b(d d10) {
        Iterator<Map.Entry<d, d>> iterator = this.a.entrySet().iterator();
        m[] arrm = i.b();
        while (iterator.hasNext()) {
            block4: {
                Object object;
                block3: {
                    Map.Entry<d, d> entry = iterator.next();
                    object = this;
                    if (arrm != null) break block3;
                    if (!((g)object).a(d10, entry.getKey())) break block4;
                    object = entry.getValue();
                }
                return (d)object;
            }
            if (arrm == null) continue;
        }
        return d.m;
    }

    public float a(d d10) {
        Iterator<Map.Entry<d, Float>> iterator = this.b.entrySet().iterator();
        m[] arrm = i.b();
        while (iterator.hasNext()) {
            block4: {
                Object object;
                block3: {
                    Map.Entry<d, Float> entry = iterator.next();
                    object = this;
                    if (arrm != null) break block3;
                    if (!((g)object).a(d10, entry.getKey())) break block4;
                    object = entry.getValue();
                }
                return ((Float)object).floatValue();
            }
            if (arrm == null) continue;
        }
        return 0.0f;
    }

    public void a(d d10, d d11, float f10) {
        this.a.put(d10, d11);
        this.b.put(d11, Float.valueOf(f10));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(d d10, d d11) {
        m[] arrm = i.b();
        d d12 = d11;
        if (arrm == null) {
            if (d12.w() != d10.w()) return 0 != 0;
            d12 = d11;
        }
        int n2 = d12.d();
        if (arrm != null) return n2 != 0;
        if (n2 == 32767) return 1 != 0;
        n2 = d11.d();
        if (arrm != null) return n2 != 0;
        if (n2 != d10.d()) return 0 != 0;
        return 1 != 0;
    }

    public void a(k k2, d d10, float f10) {
        this.a(new d(k2, 1, 32767), d10, f10);
    }

    public void a(K k2, d d10, float f10) {
        this.a(k.b(k2), d10, f10);
    }

    public Map<d, d> b() {
        return this.a;
    }
}

