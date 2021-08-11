/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
package net.minecraft.ap;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.J.m;
import net.minecraft.N.y;
import net.minecraft.P.l;
import net.minecraft.P.n;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.ah.z;
import net.minecraft.ap.a;
import net.minecraft.ap.b;
import net.minecraft.ap.c;
import net.minecraft.ap.d;
import net.minecraft.ap.e;
import net.minecraft.ap.f;
import net.minecraft.ap.h;
import net.minecraft.ap.i;
import net.minecraft.ap.k;
import net.minecraft.ar.ae;
import net.minecraft.k.o;

public class g {
    private static /* synthetic */ int[] b;
    private final /* synthetic */ List<h> f;
    private final /* synthetic */ List<e> e;
    private /* synthetic */ net.minecraft.k.n d;
    private /* synthetic */ String c;

    public void b(r r2) {
        block12: {
            net.minecraft.P.i i2;
            String string;
            r r3;
            Object object;
            Object object2;
            net.minecraft.P.i i3;
            int[] arrn;
            block8: {
                this.e.clear();
                int[] arrn2 = g.c();
                this.f.clear();
                arrn = arrn2;
                u u2 = r2.c("size", 3);
                this.d = new net.minecraft.k.n(u2.a(0), u2.a(1), u2.a(2));
                this.c = r2.j("author");
                c c10 = new c(null);
                u u3 = r2.c("palette", 10);
                for (int i4 = 0; i4 < u3.b(); ++i4) {
                    c10.a(net.minecraft.P.c.b(u3.d(i4)), i4);
                    if (arrn != null) continue;
                }
                u u4 = r2.c("blocks", 10);
                for (int i5 = 0; i5 < u4.b(); ++i5) {
                    block11: {
                        block10: {
                            String string2;
                            r r4;
                            block9: {
                                r r5 = u4.d(i5);
                                i3 = r5.c("pos", 3);
                                object2 = new net.minecraft.k.n(((u)i3).a(0), ((u)i3).a(1), ((u)i3).a(2));
                                object = c10.a(r5.m("state"));
                                r3 = r5;
                                string = "nbt";
                                if (arrn == null) break block8;
                                if (arrn == null) break block9;
                                if (!r3.b(string)) break block10;
                                r4 = r5;
                                string2 = "nbt";
                            }
                            i2 = r4.h(string2);
                            if (arrn != null) break block11;
                        }
                        i2 = null;
                    }
                    this.e.add(new e((net.minecraft.k.n)object2, (net.minecraft.Z.i)object, (r)i2));
                    if (arrn != null) continue;
                }
                r3 = r2;
                string = "entities";
            }
            u u5 = r3.c(string, 10);
            int n2 = 0;
            while (n2 < u5.b()) {
                i3 = u5.d(n2);
                object2 = ((r)i3).c("pos", 6);
                object = new net.minecraft.k.l(((u)object2).g(0), ((u)object2).g(1), ((u)object2).g(2));
                i2 = ((r)i3).c("blockPos", 3);
                net.minecraft.k.n n3 = new net.minecraft.k.n(((u)i2).a(0), ((u)i2).a(1), ((u)i2).a(2));
                if (arrn != null) {
                    if (((r)i3).b("nbt")) {
                        r r6 = ((r)i3).h("nbt");
                        this.f.add(new h((net.minecraft.k.l)object, n3, r6));
                    }
                    ++n2;
                }
                if (arrn != null) continue;
            }
            if (net.minecraft.k.m.d()) break block12;
            g.b(new int[2]);
        }
    }

    static {
        if (g.c() == null) {
            g.b(new int[5]);
        }
    }

    public void a(z z2, net.minecraft.k.n n2, net.minecraft.k.n n3, boolean bl2, @Nullable K k2) {
        block7: {
            List<Object> list;
            block16: {
                block17: {
                    net.minecraft.k.n n4;
                    net.minecraft.k.n n5;
                    int[] arrn;
                    block5: {
                        net.minecraft.k.n n6;
                        block9: {
                            int n7;
                            int n8;
                            block8: {
                                block6: {
                                    arrn = g.c();
                                    n8 = n3.e();
                                    n7 = 1;
                                    if (arrn == null) break block6;
                                    if (n8 < n7) break block7;
                                    n8 = n3.b();
                                    n7 = 1;
                                }
                                if (arrn == null) break block8;
                                if (n8 < n7) break block7;
                                n6 = n3;
                                if (arrn == null) break block9;
                                n8 = n6.a();
                                n7 = 1;
                            }
                            if (n8 < n7) break block7;
                            n6 = n2.b(n3).a(-1, -1, -1);
                        }
                        net.minecraft.k.n n9 = n6;
                        ArrayList arrayList = Lists.newArrayList();
                        ArrayList arrayList2 = Lists.newArrayList();
                        ArrayList arrayList3 = Lists.newArrayList();
                        n5 = new net.minecraft.k.n(Math.min(n2.e(), n9.e()), Math.min(n2.b(), n9.b()), Math.min(n2.a(), n9.a()));
                        n4 = new net.minecraft.k.n(Math.max(n2.e(), n9.e()), Math.max(n2.b(), n9.b()), Math.max(n2.a(), n9.a()));
                        this.d = n3;
                        for (o o2 : net.minecraft.k.n.a(n5, n4)) {
                            block12: {
                                boolean bl3;
                                net.minecraft.Z.i i2;
                                net.minecraft.k.m m2;
                                block15: {
                                    block14: {
                                        y y2;
                                        block13: {
                                            y y3;
                                            block11: {
                                                K k3;
                                                block10: {
                                                    m2 = o2.c(n5);
                                                    i2 = z2.d(o2);
                                                    if (arrn == null) break block5;
                                                    k3 = k2;
                                                    if (arrn == null) break block10;
                                                    if (k3 == null) break block11;
                                                    k3 = k2;
                                                }
                                                if (k3 == i2.b()) break block12;
                                            }
                                            y2 = y3 = z2.b(o2);
                                            if (arrn == null) break block13;
                                            if (y2 == null) break block14;
                                            y2 = y3;
                                        }
                                        r r2 = y2.a(new r());
                                        r2.k("x");
                                        r2.k("y");
                                        r2.k("z");
                                        arrayList2.add(new e((net.minecraft.k.n)m2, i2, r2));
                                        if (arrn != null) break block12;
                                    }
                                    bl3 = i2.m();
                                    if (arrn == null) break block12;
                                    if (bl3) break block15;
                                    bl3 = i2.k();
                                    if (arrn == null) break block12;
                                    if (bl3) break block15;
                                    arrayList3.add(new e((net.minecraft.k.n)m2, i2, null));
                                    if (arrn != null) break block12;
                                }
                                bl3 = arrayList.add(new e((net.minecraft.k.n)m2, i2, null));
                            }
                            if (arrn != null) continue;
                        }
                        this.e.clear();
                        this.e.addAll(arrayList);
                        this.e.addAll(arrayList2);
                        list = this.e;
                        if (arrn == null) break block16;
                        list.addAll(arrayList3);
                    }
                    if (!bl2) break block17;
                    this.a(z2, n5, n4.a(1, 1, 1));
                    if (arrn != null) break block7;
                }
                list = this.f;
            }
            list.clear();
        }
    }

    public static void a(net.minecraft.av.b b10) {
        b10.a(net.minecraft.av.f.STRUCTURE, (net.minecraft.av.g)new b());
    }

    public net.minecraft.k.n a(ae ae2) {
        switch (ae2) {
            case COUNTERCLOCKWISE_90: 
            case CLOCKWISE_90: {
                return new net.minecraft.k.n(this.d.a(), this.d.b(), this.d.e());
            }
        }
        return this.d;
    }

    public static void b(int[] arrn) {
        b = arrn;
    }

    public void b(z z2, net.minecraft.k.n n2, k k2) {
        this.a(z2, n2, new i(n2, k2), k2, 2);
    }

    public net.minecraft.k.n b(net.minecraft.k.n n2, net.minecraft.ar.h h2, ae ae2) {
        return g.a(n2, h2, ae2, this.b().e(), this.b().a());
    }

    public static net.minecraft.k.n a(k k2, net.minecraft.k.n n2) {
        return g.a(n2, k2.d(), k2.g());
    }

    public void a(String string) {
        this.c = string;
    }

    public static int[] c() {
        return b;
    }

    public Map<net.minecraft.k.n, String> a(net.minecraft.k.n n2, k k2) {
        HashMap hashMap = Maps.newHashMap();
        int[] arrn = g.c();
        net.minecraft.ao.b b10 = k2.f();
        for (e e10 : this.e) {
            block7: {
                r r2;
                net.minecraft.k.n n3;
                block8: {
                    net.minecraft.Z.i i2;
                    block6: {
                        net.minecraft.ao.b b11;
                        block5: {
                            n3 = g.a(k2, e10.a).b(n2);
                            b11 = b10;
                            if (arrn == null) break block5;
                            if (b11 == null) break block6;
                            b11 = b10;
                        }
                        if (!b11.a(n3)) break block7;
                    }
                    if ((i2 = e10.b).b() != net.minecraft.u.g.bD) break block7;
                    r2 = e10.c;
                    if (arrn == null) break block8;
                    if (r2 == null) break block7;
                    r2 = e10.c;
                }
                net.minecraft.N.r r3 = net.minecraft.N.r.valueOf(r2.j("mode"));
                Object object = r3;
                if (arrn != null && object == net.minecraft.N.r.DATA) {
                    object = hashMap.put(n3, e10.c.j("metadata"));
                }
            }
            if (arrn != null) continue;
        }
        return hashMap;
    }

    public void a(z z2, net.minecraft.k.n n2, k k2) {
        k2.a();
        this.b(z2, n2, k2);
    }

    private u a(double ... arrd) {
        u u2;
        block2: {
            u u3 = new u();
            int[] arrn = g.c();
            for (double d10 : arrd) {
                u2 = u3;
                if (arrn != null) {
                    u2.a(new l(d10));
                    if (arrn != null) continue;
                }
                break block2;
            }
            u2 = u3;
        }
        return u2;
    }

    public g() {
        this.e = Lists.newArrayList();
        this.f = Lists.newArrayList();
        this.d = net.minecraft.k.n.o;
        this.c = "?";
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static net.minecraft.k.n a(net.minecraft.k.n var0, net.minecraft.ar.h var1_1, ae var2_2) {
        var4_3 = var0.e();
        var5_4 = var0.b();
        var6_5 = var0.a();
        var3_6 = g.c();
        var7_7 = 1;
        v0 = a.a[var1_1.ordinal()];
        if (var3_6 == null) ** GOTO lbl17
        switch (v0) {
            case 1: {
                var6_5 = -var6_5;
                if (var3_6 != null) break;
            }
            case 2: {
                var4_3 = -var4_3;
                if (var3_6 != null) break;
            }
            default: {
                v0 = 0;
lbl17:
                // 2 sources

                var7_7 = v0;
            }
        }
        v1 = a.b[var2_2.ordinal()];
        if (var3_6 != null) {
            switch (v1) {
                case 1: {
                    return new net.minecraft.k.n(var6_5, var5_4, -var4_3);
                }
                case 2: {
                    return new net.minecraft.k.n(-var6_5, var5_4, var4_3);
                }
                case 3: {
                    return new net.minecraft.k.n(-var4_3, var5_4, -var6_5);
                }
            }
            v1 = var7_7;
        }
        if (v1 != 0) {
            v2 = new net.minecraft.k.n(var4_3, var5_4, var6_5);
            return v2;
        }
        v2 = var0;
        return v2;
    }

    public net.minecraft.k.n a(k k2, net.minecraft.k.n n2, k k3, net.minecraft.k.n n3) {
        net.minecraft.k.n n4 = g.a(k2, n2);
        net.minecraft.k.n n5 = g.a(k3, n3);
        return n4.c(n5);
    }

    public r a(r r2) {
        block8: {
            c c10 = new c(null);
            u u2 = new u();
            int[] arrn = g.c();
            for (e object2 : this.e) {
                r r3 = new r();
                r3.a("pos", this.a(object2.a.e(), object2.a.b(), object2.a.a()));
                r3.b("state", c10.a(object2.b));
                if (arrn != null) {
                    if (object2.c != null) {
                        r3.a("nbt", object2.c);
                    }
                    u2.a(r3);
                }
                if (arrn != null) continue;
                net.minecraft.k.m.b(!net.minecraft.k.m.d());
                break;
            }
            u u3 = new u();
            for (h h2 : this.f) {
                Object object = new r();
                ((r)object).a("pos", this.a(h2.a.e, h2.a.d, h2.a.b));
                ((r)object).a("blockPos", this.a(h2.c.e(), h2.c.b(), h2.c.a()));
                if (arrn != null) {
                    if (h2.b != null) {
                        ((r)object).a("nbt", h2.b);
                    }
                    u3.a((net.minecraft.P.i)object);
                }
                if (arrn != null) continue;
            }
            u u4 = new u();
            for (Object object : c10) {
                u4.a(net.minecraft.P.c.a(new r(), (net.minecraft.Z.i)object));
                if (arrn != null) {
                    if (arrn != null) continue;
                }
                break block8;
            }
            r2.a("palette", u4);
            r2.a("blocks", u2);
            r2.a("entities", u3);
            r2.a("size", this.a(this.d.e(), this.d.b(), this.d.a()));
            r2.a("author", this.c);
            r2.b("DataVersion", 1343);
        }
        return r2;
    }

    private void a(z z2, net.minecraft.k.n n2, net.minecraft.ar.h h2, ae ae2, @Nullable net.minecraft.ao.b b10) {
        Iterator<h> iterator = this.f.iterator();
        int[] arrn = g.c();
        while (iterator.hasNext()) {
            block7: {
                x x2;
                x x3;
                net.minecraft.k.l l2;
                block8: {
                    h h3;
                    block6: {
                        net.minecraft.ao.b b11;
                        net.minecraft.k.n n3;
                        block5: {
                            h3 = iterator.next();
                            n3 = g.a(h3.c, h2, ae2).b(n2);
                            b11 = b10;
                            if (arrn == null) break block5;
                            if (b11 == null) break block6;
                            b11 = b10;
                        }
                        if (!b11.a(n3)) break block7;
                    }
                    r r2 = h3.b;
                    net.minecraft.k.l l3 = g.a(h3.a, h2, ae2);
                    l2 = l3.c(n2.e(), n2.b(), n2.a());
                    u u2 = new u();
                    u2.a(new l(l2.e));
                    u2.a(new l(l2.d));
                    u2.a(new l(l2.b));
                    r2.a("Pos", u2);
                    r2.a("UUID", UUID.randomUUID());
                    try {
                        x3 = net.minecraft.U.h.a(r2, z2);
                    }
                    catch (Exception exception) {
                        x3 = null;
                    }
                    x2 = x3;
                    if (arrn == null) break block8;
                    if (x2 == null) break block7;
                    x2 = x3;
                }
                float f10 = x2.a(h2);
                x3.c(l2.e, l2.d, l2.b, f10 += x3.e - x3.a(ae2), x3.at);
                z2.f(x3);
            }
            if (arrn != null) continue;
        }
    }

    private void a(z z2, net.minecraft.k.n n2, net.minecraft.k.n n3) {
        int[] arrn = g.c();
        List<x> list = z2.a(x.class, new net.minecraft.k.k(n2, n3), new d(this));
        this.f.clear();
        Iterator<x> iterator = list.iterator();
        int[] arrn2 = arrn;
        while (iterator.hasNext()) {
            net.minecraft.k.n n4;
            r r2;
            net.minecraft.k.l l2;
            block5: {
                block4: {
                    x x2;
                    block3: {
                        x x3 = iterator.next();
                        l2 = new net.minecraft.k.l(x3.a - (double)n2.e(), x3.aF - (double)n2.b(), x3.ax - (double)n2.a());
                        r2 = new r();
                        x3.e(r2);
                        x2 = x3;
                        if (arrn2 == null) break block3;
                        if (!(x2 instanceof m)) break block4;
                        x2 = x3;
                    }
                    n4 = ((m)x2).g().c(n2);
                    if (arrn2 != null) break block5;
                }
                n4 = new net.minecraft.k.n(l2);
            }
            this.f.add(new h(l2, n4, r2));
            if (arrn2 != null) continue;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static net.minecraft.k.n a(net.minecraft.k.n var0, net.minecraft.ar.h var1_1, ae var2_2, int var3_3, int var4_4) {
        var5_5 = g.c();
        var6_6 = var1_1 == net.minecraft.ar.h.FRONT_BACK ? --var3_3 : 0;
        var7_7 = var1_1 == net.minecraft.ar.h.LEFT_RIGHT ? --var4_4 : 0;
        var8_8 = var0;
        if (var5_5 == null) ** GOTO lbl9
        switch (a.b[var2_2.ordinal()]) {
            case 1: {
                var8_8 = var0.a(var7_7, 0, var3_3 - var6_6);
lbl9:
                // 2 sources

                if (var5_5 != null) return var8_8;
            }
            case 2: {
                var8_8 = var0.a(var4_4 - var7_7, 0, var6_6);
                if (var5_5 != null) return var8_8;
            }
            case 3: {
                var8_8 = var0.a(var3_3 - var6_6, 0, var4_4 - var7_7);
                if (var5_5 != null) return var8_8;
            }
            case 4: {
                return var0.a(var6_6, 0, var7_7);
            }
        }
        return var8_8;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static net.minecraft.k.l a(net.minecraft.k.l var0, net.minecraft.ar.h var1_1, ae var2_2) {
        var4_3 = var0.e;
        var6_4 = var0.d;
        var8_5 = var0.b;
        var3_6 = g.c();
        var10_7 = 1;
        v0 = a.a[var1_1.ordinal()];
        if (var3_6 == null) ** GOTO lbl17
        switch (v0) {
            case 1: {
                var8_5 = 1.0 - var8_5;
                if (var3_6 != null) break;
            }
            case 2: {
                var4_3 = 1.0 - var4_3;
                if (var3_6 != null) break;
            }
            default: {
                v0 = 0;
lbl17:
                // 2 sources

                var10_7 = v0;
            }
        }
        v1 = a.b[var2_2.ordinal()];
        if (var3_6 != null) {
            switch (v1) {
                case 1: {
                    return new net.minecraft.k.l(var8_5, var6_4, 1.0 - var4_3);
                }
                case 2: {
                    return new net.minecraft.k.l(1.0 - var8_5, var6_4, var4_3);
                }
                case 3: {
                    return new net.minecraft.k.l(1.0 - var4_3, var6_4, 1.0 - var8_5);
                }
            }
            v1 = var10_7;
        }
        if (v1 != 0) {
            v2 = new net.minecraft.k.l(var4_3, var6_4, var8_5);
            return v2;
        }
        v2 = var0;
        return v2;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private u a(int ... arrn) {
        u u2;
        block2: {
            u u3 = new u();
            int[] arrn2 = arrn;
            int n2 = arrn2.length;
            int[] arrn3 = g.c();
            for (int i2 = 0; i2 < n2; ++i2) {
                int n3 = arrn2[i2];
                u2 = u3;
                if (arrn3 != null) {
                    u2.a(new n(n3));
                    if (arrn3 != null) continue;
                }
                break block2;
            }
            u2 = u3;
        }
        return u2;
    }

    public void a(z z2, net.minecraft.k.n n2, k k2, int n3) {
        this.a(z2, n2, new i(n2, k2), k2, n3);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(z var1_1, net.minecraft.k.n var2_2, @Nullable f var3_3, k var4_4, int var5_5) {
        block22: {
            block23: {
                var6_6 = g.c();
                v0 = this.e.isEmpty();
                if (var6_6 == null) break block22;
                if (v0 == 0) break block23;
                v0 = var4_4.h();
                if (var6_6 != null) {
                    if (v0 != 0) return;
                    v0 = this.f.isEmpty() ? 1 : 0;
                }
                if (var6_6 == null) break block22;
                if (v0 != 0) return;
            }
            v0 = this.d.e();
        }
        v1 = 1;
        if (var6_6 != null) {
            if (v0 < v1) return;
            v0 = this.d.b();
            v1 = 1;
        }
        if (var6_6 != null) {
            if (v0 < v1) return;
            v0 = this.d.a();
            v1 = 1;
        }
        if (v0 < v1) return;
        var7_7 = var4_4.b();
        var8_8 = var4_4.f();
        var9_9 = this.e.iterator();
        while (var9_9.hasNext()) {
            block25: {
                block32: {
                    block31: {
                        block30: {
                            block29: {
                                block28: {
                                    block27: {
                                        block26: {
                                            block24: {
                                                var10_10 = var9_9.next();
                                                var11_11 = g.a(var4_4, var10_10.a).b(var2_2);
                                                v2 = var3_3;
                                                if (var6_6 == null) ** GOTO lbl-1000
                                                if (var6_6 == null) ** GOTO lbl35
                                                if (v2 != null) {
                                                    v3 = var3_3;
lbl35:
                                                    // 2 sources

                                                    v4 = v3.a(var1_1, var11_11, var10_10);
                                                } else {
                                                    v4 = var10_10;
                                                }
                                                var12_12 = v4;
                                                v5 = var12_12;
                                                if (var6_6 == null) break block24;
                                                if (v5 == null) break block25;
                                                v5 = var12_12;
                                            }
                                            var13_13 = v5.b.b();
                                            v6 = var7_7;
                                            if (var6_6 == null) break block26;
                                            if (v6 == null) break block27;
                                            v6 = var7_7;
                                        }
                                        if (v6 == var13_13) break block25;
                                    }
                                    if (var4_4.c() && var13_13 == net.minecraft.u.g.bD) break block25;
                                    v7 = var8_8;
                                    if (var6_6 == null) break block28;
                                    if (v7 == null) break block29;
                                    v7 = var8_8;
                                }
                                if (!v7.a(var11_11)) break block25;
                            }
                            var14_14 = var12_12.b.a(var4_4.d());
                            var15_15 = var14_14.a(var4_4.g());
                            if (var12_12.c == null) break block30;
                            v8 = var1_1;
                            v9 = var11_11;
                            if (var6_6 == null) break block31;
                            var16_16 = v8.b(v9);
                            if (var16_16 != null) {
                                v10 = var16_16 instanceof net.minecraft.B.a;
                                if (var6_6 != null) {
                                    if (v10) {
                                        ((net.minecraft.B.a)var16_16).d();
                                    }
                                    v10 = var1_1.a(var11_11, net.minecraft.u.g.ah.d(), 4);
                                }
                            }
                        }
                        v8 = var1_1;
                        v9 = var11_11;
                    }
                    if (!v8.a(v9, var15_15, var5_5) || var12_12.c == null) break block25;
                    v11 = var16_16 = var1_1.b(var11_11);
                    if (var6_6 == null) break block32;
                    if (v11 == null) break block25;
                    var12_12.c.b("x", var11_11.e());
                    var12_12.c.b("y", var11_11.b());
                    var12_12.c.b("z", var11_11.a());
                    var16_16.c(var12_12.c);
                    var16_16.a(var4_4.d());
                    v11 = var16_16;
                }
                v11.a(var4_4.g());
            }
            if (var6_6 != null) continue;
        }
        for (Object v2 : this.e) lbl-1000:
        // 2 sources

        {
            block35: {
                block38: {
                    block37: {
                        block36: {
                            block34: {
                                block33: {
                                    var10_10 = v2;
                                    if (var6_6 == null) return;
                                    v12 = var7_7;
                                    if (var6_6 == null) break block33;
                                    if (v12 == null) break block34;
                                    v12 = var7_7;
                                }
                                if (v12 == var10_10.b.b()) break block35;
                            }
                            var11_11 = g.a(var4_4, var10_10.a).b(var2_2);
                            if (var6_6 == null) break block36;
                            if (var8_8 != null && !var8_8.a(var11_11)) break block35;
                            v13 = var1_1;
                            v14 = var11_11;
                            if (var6_6 == null) break block37;
                            v13.b(v14, var10_10.b.b(), false);
                        }
                        if (var10_10.c == null) break block35;
                        v13 = var1_1;
                        v14 = var11_11;
                    }
                    v15 = var12_12 = v13.b(v14);
                    if (var6_6 == null) break block38;
                    if (v15 == null) break block35;
                    v15 = var12_12;
                }
                v15.b();
            }
            if (var6_6 != null) continue;
        }
        if (var4_4.h() != false) return;
        this.a(var1_1, var2_2, var4_4.d(), var4_4.g(), var8_8);
    }

    public net.minecraft.k.n b() {
        return this.d;
    }

    public String a() {
        return this.c;
    }
}

