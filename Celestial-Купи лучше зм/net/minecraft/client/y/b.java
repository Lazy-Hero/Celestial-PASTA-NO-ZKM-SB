/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.y;

import net.minecraft.client.y.a;
import net.minecraft.client.y.d;
import net.minecraft.client.y.e;
import net.minecraft.client.y.g;

public class b {
    public static final /* synthetic */ g l;
    public static final /* synthetic */ g h;
    public static final /* synthetic */ e t;
    public static final /* synthetic */ g d;
    public static final /* synthetic */ e n;
    public static final /* synthetic */ e i;
    public static final /* synthetic */ g g;
    public static final /* synthetic */ e j;
    private static final /* synthetic */ e p;
    public static final /* synthetic */ e a;
    public static final /* synthetic */ e k;
    public static final /* synthetic */ e m;
    public static final /* synthetic */ g o;
    public static final /* synthetic */ e b;
    public static final /* synthetic */ e e;
    private static final /* synthetic */ e c;
    public static final /* synthetic */ g q;
    public static final /* synthetic */ e r;
    public static /* synthetic */ e f;
    public static /* synthetic */ e s;

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void a() {
        int[] arrn;
        block6: {
            block5: {
                arrn = net.minecraft.client.y.g.c();
                if (!fU.ag()) break block5;
                s = gT.c();
                f = gT.b();
                if (arrn == null) break block6;
            }
            s = p;
            f = c;
        }
        if (cq.d1.c()) {
            e e10 = f;
            e e11 = (e)cq.a(cq.d1);
            e11.j();
            for (int i2 = 0; i2 < e10.g(); ++i2) {
                e11.a(e10.d(i2));
                if (arrn == null) continue;
            }
        }
    }

    static {
        s = new e();
        f = new e();
        p = s;
        c = f;
        j = new e();
        n = new e();
        k = new e();
        i = new e();
        m = new e();
        a = new e();
        t = new e();
        b = new e();
        r = new e();
        e = new e();
        d = new g(0, net.minecraft.client.y.a.FLOAT, net.minecraft.client.y.d.POSITION, 3);
        l = new g(0, net.minecraft.client.y.a.UBYTE, net.minecraft.client.y.d.COLOR, 4);
        q = new g(0, net.minecraft.client.y.a.FLOAT, net.minecraft.client.y.d.UV, 2);
        g = new g(1, net.minecraft.client.y.a.SHORT, net.minecraft.client.y.d.UV, 2);
        o = new g(0, net.minecraft.client.y.a.BYTE, net.minecraft.client.y.d.NORMAL, 3);
        h = new g(0, net.minecraft.client.y.a.BYTE, net.minecraft.client.y.d.PADDING, 1);
        s.a(d);
        s.a(l);
        s.a(q);
        s.a(g);
        f.a(d);
        f.a(l);
        f.a(q);
        f.a(o);
        f.a(h);
        j.a(d);
        j.a(q);
        j.a(o);
        j.a(h);
        n.a(d);
        n.a(q);
        n.a(l);
        n.a(g);
        k.a(d);
        i.a(d);
        i.a(l);
        m.a(d);
        m.a(q);
        a.a(d);
        a.a(o);
        a.a(h);
        t.a(d);
        t.a(q);
        t.a(l);
        b.a(d);
        b.a(q);
        b.a(o);
        b.a(h);
        r.a(d);
        r.a(q);
        r.a(g);
        r.a(l);
        e.a(d);
        e.a(q);
        e.a(l);
        e.a(o);
        e.a(h);
    }
}

