/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.l;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import net.minecraft.D.q;
import net.minecraft.ar.a1;
import net.minecraft.l.a;
import net.minecraft.l.b;
import net.minecraft.l.c;
import net.minecraft.l.k;
import net.minecraft.l.l;
import net.minecraft.l.m;

public class d {
    public /* synthetic */ boolean d;
    private final /* synthetic */ net.minecraft.at.k k;
    private static final /* synthetic */ NumberFormat e;
    public static /* synthetic */ c g;
    private final /* synthetic */ c l;
    private final /* synthetic */ net.minecraft.D.a m;
    private static /* synthetic */ int j;
    public final /* synthetic */ String c;
    public static /* synthetic */ c f;
    private /* synthetic */ Class<? extends a1> i;
    private static final /* synthetic */ DecimalFormat h;
    public static /* synthetic */ c b;
    public static /* synthetic */ c a;

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    public static void b(int n2) {
        j = n2;
    }

    public static int e() {
        int n2 = net.minecraft.l.d.h();
        if (n2 == 0) {
            return 9;
        }
        return 0;
    }

    public static int h() {
        return j;
    }

    static NumberFormat b() {
        return e;
    }

    public d g() {
        if (net.minecraft.l.m.Y.containsKey(this.c)) {
            throw new RuntimeException("Duplicate stat id: \"" + net.minecraft.l.m.Y.get((Object)this.c).k + "\" and \"" + this.k + "\" at id " + this.c);
        }
        net.minecraft.l.m.ai.add(this);
        net.minecraft.l.m.Y.put(this.c, this);
        return this;
    }

    public String toString() {
        return "Stat{id=" + this.c + ", nameId=" + this.k + ", awardLocallyOnly=" + this.d + ", formatter=" + this.l + ", objectiveCriteria=" + this.m + '}';
    }

    public boolean equals(Object object) {
        block5: {
            Object object2;
            block6: {
                int n2 = net.minecraft.l.d.e();
                Object object3 = this;
                if (n2 != 0) {
                    if (object3 == object) {
                        return true;
                    }
                    object3 = object;
                }
                if (object3 == null) break block5;
                object2 = this.getClass();
                if (n2 == 0) break block6;
                if (object2 != object.getClass()) break block5;
                object2 = object;
            }
            d d10 = (d)object2;
            return this.c.equals(d10.c);
        }
        return false;
    }

    public net.minecraft.D.a d() {
        return this.m;
    }

    public Class<? extends a1> a() {
        return this.i;
    }

    static {
        e = NumberFormat.getIntegerInstance(Locale.US);
        a = new a();
        h = new DecimalFormat("########0.00");
        g = new b();
        f = new k();
        net.minecraft.l.d.b(0);
        b = new l();
    }

    public net.minecraft.at.k i() {
        net.minecraft.at.k k2 = this.k.d();
        k2.e().a(net.minecraft.at.l.GRAY);
        return k2;
    }

    static DecimalFormat f() {
        return h;
    }

    public d(String string, net.minecraft.at.k k2, c c10) {
        this.c = string;
        this.k = k2;
        this.l = c10;
        this.m = new q(this);
        net.minecraft.D.a.i.put(this.m.a(), this.m);
    }

    public d c() {
        this.d = true;
        return this;
    }

    public d(String string, net.minecraft.at.k k2) {
        this(string, k2, a);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String a(int n2) {
        return this.l.a(n2);
    }
}

