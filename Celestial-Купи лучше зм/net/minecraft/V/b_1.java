/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.v;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import net.minecraft.v.c;
import net.minecraft.v.d;
import net.minecraft.v.e;
import net.minecraft.v.f;
import net.minecraft.v.g;
import net.minecraft.v.h;
import net.minecraft.v.i;
import net.minecraft.v.k;
import net.minecraft.v.l;
import net.minecraft.v.m;
import net.minecraft.v.n;
import net.minecraft.v.o;
import net.minecraft.v.p;

public class b<T extends p> {
    public static final /* synthetic */ b<o> k;
    public static final /* synthetic */ b<h> j;
    public static final /* synthetic */ b<d> i;
    private static /* synthetic */ b<?>[] g;
    public static final /* synthetic */ b<e> m;
    public static final /* synthetic */ b<f> e;
    public static final /* synthetic */ b<l> f;
    private final /* synthetic */ int d;
    private final /* synthetic */ String a;
    public static final /* synthetic */ b<g> n;
    public static final /* synthetic */ b<i> c;
    public static final /* synthetic */ b<n> b;
    public static final /* synthetic */ b<m> h;
    private final /* synthetic */ Class<? extends p> o;
    public static final /* synthetic */ b<k> l;

    static {
        g = new b[0];
        e = net.minecraft.v.b.a(f.class, "HoldingPattern");
        b = net.minecraft.v.b.a(n.class, "StrafePlayer");
        c = net.minecraft.v.b.a(i.class, "LandingApproach");
        j = net.minecraft.v.b.a(h.class, "Landing");
        k = net.minecraft.v.b.a(o.class, "Takeoff");
        f = net.minecraft.v.b.a(l.class, "SittingFlaming");
        h = net.minecraft.v.b.a(m.class, "SittingScanning");
        l = net.minecraft.v.b.a(k.class, "SittingAttacking");
        i = net.minecraft.v.b.a(d.class, "ChargingPlayer");
        m = net.minecraft.v.b.a(e.class, "Dying");
        n = net.minecraft.v.b.a(g.class, "Hover");
    }

    public int b() {
        return this.d;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static b<?> a(int n2) {
        b<f> b10;
        block5: {
            int n3;
            block4: {
                int[] arrn = net.minecraft.v.c.b();
                n3 = n2;
                if (arrn != null) break block4;
                if (n3 < 0) break block5;
                n3 = n2;
            }
            if (n3 < g.length) {
                b10 = g[n2];
                return b10;
            }
        }
        b10 = e;
        return b10;
    }

    public String toString() {
        return this.a + " (#" + this.d + ")";
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private static <T extends p> b<T> a(Class<T> class_, String string) {
        b<T> b10 = new b<T>(g.length, class_, string);
        g = Arrays.copyOf(g, g.length + 1);
        net.minecraft.v.b.g[b10.b()] = b10;
        return b10;
    }

    protected Constructor<? extends p> c() throws NoSuchMethodException {
        return this.o.getConstructor(net.minecraft.h.d.class);
    }

    public static int a() {
        return g.length;
    }

    private b(int n2, Class<? extends p> class_, String string) {
        this.d = n2;
        this.o = class_;
        this.a = string;
    }

    public p a(net.minecraft.h.d d10) {
        try {
            Constructor<p> constructor = this.c();
            return constructor.newInstance(d10);
        }
        catch (Exception exception) {
            throw new Error(exception);
        }
    }
}

