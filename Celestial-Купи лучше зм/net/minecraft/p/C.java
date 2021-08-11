/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.R.b;
import net.minecraft.ah.z;
import net.minecraft.ap.g;
import net.minecraft.ap.j;
import net.minecraft.ap.k;
import net.minecraft.ar.ae;
import net.minecraft.ar.h;
import net.minecraft.ar.v;
import net.minecraft.k.f;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.p.a;

public class C
extends a {
    private static final /* synthetic */ v g;
    private static final /* synthetic */ v a;
    private static final /* synthetic */ v e;
    private static final /* synthetic */ v p;
    private static final /* synthetic */ v k;
    private static final /* synthetic */ v o;
    private static final /* synthetic */ v[] h;
    private static final /* synthetic */ v n;
    private static final /* synthetic */ v r;
    private static final /* synthetic */ v i;
    private static final /* synthetic */ v f;
    private static final /* synthetic */ v l;
    private static final /* synthetic */ v s;
    private static final /* synthetic */ v[] d;
    private static final /* synthetic */ v m;
    private static final /* synthetic */ v t;
    private static final /* synthetic */ v j;
    private static final /* synthetic */ v q;

    static {
        j = new v("fossils/fossil_spine_01");
        m = new v("fossils/fossil_spine_02");
        k = new v("fossils/fossil_spine_03");
        a = new v("fossils/fossil_spine_04");
        n = new v("fossils/fossil_spine_01_coal");
        i = new v("fossils/fossil_spine_02_coal");
        r = new v("fossils/fossil_spine_03_coal");
        t = new v("fossils/fossil_spine_04_coal");
        e = new v("fossils/fossil_skull_01");
        q = new v("fossils/fossil_skull_02");
        f = new v("fossils/fossil_skull_03");
        g = new v("fossils/fossil_skull_04");
        l = new v("fossils/fossil_skull_01_coal");
        s = new v("fossils/fossil_skull_02_coal");
        o = new v("fossils/fossil_skull_03_coal");
        p = new v("fossils/fossil_skull_04_coal");
        h = new v[]{j, m, k, a, e, q, f, g};
        d = new v[]{n, i, r, t, l, s, o, p};
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(z z2, Random random, n n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        k k2;
        g g10;
        g g11;
        ae ae2;
        block3: {
            Random random2 = z2.b(n2).c(987234911L);
            b b10 = z2.H();
            ae[] arrae = ae.values();
            ae2 = arrae[random2.nextInt(arrae.length)];
            int n7 = random2.nextInt(h.length);
            j j2 = z2.v().d();
            g11 = j2.a(b10, h[n7]);
            boolean bl2 = net.minecraft.p.a.d();
            g10 = j2.a(b10, d[n7]);
            f f10 = new f(n2);
            net.minecraft.ao.b b11 = new net.minecraft.ao.b(f10.b(), 0, f10.a(), f10.c(), 256, f10.d());
            k2 = new k().a(ae2).a(b11).a(random2);
            n n8 = g11.a(ae2);
            n6 = random2.nextInt(16 - n8.e());
            n5 = random2.nextInt(16 - n8.a());
            int n9 = 256;
            n4 = 0;
            while (n4 < n8.e()) {
                block4: {
                    n3 = 0;
                    if (bl2) break block3;
                    for (int i2 = v2047825; i2 < n8.e(); ++i2) {
                        n9 = Math.min(n9, z2.c(n2.e() + n4 + n6, n2.a() + i2 + n5));
                        if (!bl2) {
                            if (!bl2) continue;
                            net.minecraft.k.m.b(!net.minecraft.k.m.c());
                            break;
                        }
                        break block4;
                    }
                    ++n4;
                }
                if (!bl2) continue;
            }
            n3 = Math.max(n9 - 15 - random2.nextInt(10), 10);
        }
        n4 = n3;
        n n10 = g11.b(n2.a(n6, n4, n5), net.minecraft.ar.h.NONE, ae2);
        k2.a(0.9f);
        g11.a(z2, n10, k2, 20);
        k2.a(0.1f);
        g10.a(z2, n10, k2, 20);
        return true;
    }
}

