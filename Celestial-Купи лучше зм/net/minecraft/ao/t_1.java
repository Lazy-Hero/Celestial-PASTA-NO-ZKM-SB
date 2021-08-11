/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.ao;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.ao.B;
import net.minecraft.ao.bR;
import net.minecraft.ao.bW;
import net.minecraft.ao.bq;
import net.minecraft.ao.by;
import net.minecraft.ao.f;
import net.minecraft.ao.g;
import net.minecraft.ao.u;
import net.minecraft.ap.j;
import net.minecraft.ap.k;
import net.minecraft.ar.ae;
import net.minecraft.ar.i;
import net.minecraft.k.n;

public class t {
    private static final /* synthetic */ g a;
    private static final /* synthetic */ g b;
    private static final /* synthetic */ List<i<ae, n>> c;
    private static final /* synthetic */ k d;
    private static final /* synthetic */ g g;
    private static final /* synthetic */ List<i<ae, n>> e;
    private static final /* synthetic */ k f;
    private static final /* synthetic */ g h;

    private static B a(List<u> list, B b10) {
        list.add(b10);
        return b10;
    }

    private static B a(j j2, B b10, n n2, String string, ae ae2, boolean bl2) {
        B b11 = new B(j2, string, b10.i, ae2, bl2);
        n n3 = b10.h.a(b10.g, n2, b11.g, n.o);
        b11.a(n3.e(), n3.b(), n3.a());
        return b11;
    }

    static g f() {
        return b;
    }

    static k b() {
        return f;
    }

    static List h() {
        return e;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(j j2, g g10, int n2, B b10, n n3, List<u> list, Random random) {
        String[] arrstring = u.b();
        int n4 = n2;
        if (arrstring == null) return n4 != 0;
        if (n4 > 8) {
            return 0 != 0;
        }
        ArrayList arrayList = Lists.newArrayList();
        int n5 = g10.a(j2, n2, b10, n3, arrayList, random);
        if (arrstring == null) return n5 != 0;
        if (n5 == 0) return 0 != 0;
        int n6 = 0;
        int n7 = random.nextInt();
        for (u u2 : arrayList) {
            block6: {
                block7: {
                    u u3;
                    block5: {
                        u2.c = n7;
                        u u4 = u.a(list, u2.a());
                        if (arrstring == null) return 0 != 0;
                        u3 = u4;
                        if (arrstring == null) break block5;
                        if (u3 == null) break block6;
                        u3 = u4;
                    }
                    int n8 = u3.c;
                    if (arrstring == null) break block7;
                    if (n8 == b10.c) break block6;
                    n8 = n6 = 1;
                }
                if (arrstring != null) break;
            }
            if (arrstring != null) continue;
        }
        n5 = n6;
        if (arrstring == null) return n5 != 0;
        if (n5 != 0) return 0 != 0;
        list.addAll(arrayList);
        return true;
    }

    static {
        d = new k().b(true);
        f = new k().b(true).a(net.minecraft.u.g.bf);
        h = new f();
        e = Lists.newArrayList((Object[])new i[]{new i<ae, n>(ae.NONE, new n(1, -1, 0)), new i<ae, n>(ae.CLOCKWISE_90, new n(6, -1, 1)), new i<ae, n>(ae.COUNTERCLOCKWISE_90, new n(0, -1, 5)), new i<ae, n>(ae.CLOCKWISE_180, new n(5, -1, 6))});
        g = new bR();
        a = new bW();
        c = Lists.newArrayList((Object[])new i[]{new i<ae, n>(ae.NONE, new n(4, -1, 0)), new i<ae, n>(ae.CLOCKWISE_90, new n(12, -1, 4)), new i<ae, n>(ae.COUNTERCLOCKWISE_90, new n(0, -1, 8)), new i<ae, n>(ae.CLOCKWISE_180, new n(8, -1, 12))});
        b = new bq();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static g g() {
        return a;
    }

    static B b(List list, B b10) {
        return t.a(list, b10);
    }

    static g i() {
        return g;
    }

    static boolean b(j j2, g g10, int n2, B b10, n n3, List list, Random random) {
        return t.a(j2, g10, n2, b10, n3, list, random);
    }

    public static void a() {
        by.b(B.class, "ECP");
    }

    static g e() {
        return h;
    }

    static k d() {
        return d;
    }

    static B b(j j2, B b10, n n2, String string, ae ae2, boolean bl2) {
        return t.a(j2, b10, n2, string, ae2, bl2);
    }

    public static void a(j j2, n n2, ae ae2, List<u> list, Random random) {
        b.a();
        h.a();
        a.a();
        g.a();
        B b10 = t.a(list, new B(j2, "base_floor", n2, ae2, true));
        b10 = t.a(list, t.a(j2, b10, new n(-1, 0, -1), "second_floor", ae2, false));
        b10 = t.a(list, t.a(j2, b10, new n(-1, 4, -1), "third_floor", ae2, false));
        b10 = t.a(list, t.a(j2, b10, new n(-1, 8, -1), "third_roof", ae2, true));
        t.a(j2, g, 1, b10, null, list, random);
    }

    static List c() {
        return c;
    }
}

