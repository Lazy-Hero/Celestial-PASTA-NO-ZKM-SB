/*
 * Decompiled with CFR 0.150.
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import net.minecraft.U.x;
import net.minecraft.ar.aA;
import net.minecraft.client.E.l;
import net.minecraft.client.a.aF;
import net.minecraft.client.k.m;
import net.minecraft.client.k.s;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.u.g;

public class e6 {
    private /* synthetic */ x c;
    private /* synthetic */ int g;
    private /* synthetic */ double f;
    private /* synthetic */ double h;
    private /* synthetic */ double e;
    private final /* synthetic */ o i;
    private /* synthetic */ boolean j;
    private /* synthetic */ Set<n> d;
    private /* synthetic */ long b;
    private /* synthetic */ double a;

    public boolean d() {
        return this.j;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public String toString() {
        return "Entity: " + this.c + ", offsetY: " + this.a;
    }

    public double f() {
        return this.h;
    }

    public int e() {
        return this.g;
    }

    public x b() {
        return this.c;
    }

    public double c() {
        return this.a;
    }

    public e6(x x2) {
        this.c = null;
        this.a = 0.0;
        this.f = -2.147483648E9;
        this.e = -2.147483648E9;
        this.h = -2.147483648E9;
        this.g = 0;
        this.j = false;
        this.b = 0L;
        this.d = new HashSet<n>();
        this.i = new o();
        this.c = x2;
        this.a = x2.l();
    }

    private void a(s s2, Set<n> set, Set<n> set2) {
        block10: {
            Set<n> set3;
            n n2;
            block13: {
                String string;
                block12: {
                    m m2;
                    block11: {
                        m m3;
                        s s3;
                        block9: {
                            string = K.d();
                            s3 = s2;
                            if (string != null) break block9;
                            if (s3 == null) break block10;
                            s3 = s2;
                        }
                        m2 = m3 = s3.b();
                        if (string != null) break block11;
                        if (m2 == null) break block12;
                        m2 = m3;
                    }
                    if (!m2.a()) {
                        s2.a(false);
                    }
                }
                n2 = s2.g().l();
                set3 = set;
                if (string == null) {
                    if (set3 != null) {
                        set.remove(n2);
                    }
                    set3 = set2;
                }
                if (string != null) break block13;
                if (set3 == null) break block10;
                set3 = set2;
            }
            set3.add(n2);
        }
    }

    public double a() {
        return this.e;
    }

    public void b(aF aF2) {
        Iterator<n> iterator = this.d.iterator();
        String string = K.d();
        while (iterator.hasNext()) {
            n n2 = iterator.next();
            s s2 = aF2.b(n2);
            this.a(s2, (Set<n>)null, (Set<n>)null);
            if (string == null) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private n a(s s2, n n2, aA aA2) {
        n n3;
        String string = K.d();
        s s3 = s2;
        if (string == null) {
            if (s3 == null) {
                n3 = n2.a(aA2, 16);
                return n3;
            }
            s3 = s2;
        }
        n3 = s3.a(aA2);
        return n3;
    }

    public double g() {
        return this.f;
    }

    public void a(aF aF2) {
        block12: {
            Object object;
            Object object2;
            int n2;
            double d10;
            double d11;
            double d12;
            String string;
            block14: {
                l l2;
                block13: {
                    l l3;
                    block7: {
                        block11: {
                            e6 e62;
                            block8: {
                                double d13;
                                block10: {
                                    block9: {
                                        string = K.d();
                                        if (fU.a7()) {
                                            long l4 = System.currentTimeMillis();
                                            if (l4 < this.b + 500L) {
                                                return;
                                            }
                                            this.b = l4;
                                        }
                                        d12 = this.c.a - 0.5;
                                        d11 = this.c.aF - 0.5 + this.a;
                                        d10 = this.c.ax - 0.5;
                                        n2 = gk.a(this.c);
                                        double d14 = d12 - this.f;
                                        double d15 = d11 - this.e;
                                        double d16 = d10 - this.h;
                                        double d17 = 0.1;
                                        if (string != null) break block7;
                                        if (Math.abs(d14) > d17) break block8;
                                        double d18 = Math.abs(d15) - d17;
                                        d13 = d18 == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
                                        if (string != null) break block9;
                                        if (d13 > 0) break block8;
                                        double d19 = Math.abs(d16) - d17;
                                        d13 = d19 == 0.0 ? 0 : (d19 > 0.0 ? 1 : -1);
                                    }
                                    if (string != null) break block10;
                                    if (d13 > 0) break block8;
                                    e62 = this;
                                    if (string != null) break block11;
                                    d13 = e62.g;
                                }
                                if (d13 == n2) break block12;
                            }
                            this.f = d12;
                            this.e = d11;
                            this.h = d10;
                            this.g = n2;
                            e62 = this;
                        }
                        e62.j = false;
                    }
                    l2 = l3 = aF2.b();
                    if (string != null) break block13;
                    if (l2 == null) break block14;
                    this.i.a(net.minecraft.k.h.f(d12), net.minecraft.k.h.f(d11), net.minecraft.k.h.f(d10));
                    l2 = l3;
                }
                this.j = (object2 = (object = l2.d(this.i)).b()) == net.minecraft.u.g.bQ;
            }
            object = new HashSet();
            if (string == null) {
                if (n2 > 0) {
                    object2 = (net.minecraft.k.h.f(d12) & 0xF) >= 8 ? aA.EAST : aA.WEST;
                    aA aA2 = (net.minecraft.k.h.f(d11) & 0xF) >= 8 ? aA.UP : aA.DOWN;
                    aA aA3 = (net.minecraft.k.h.f(d10) & 0xF) >= 8 ? aA.SOUTH : aA.NORTH;
                    n n3 = new n(d12, d11, d10);
                    s s2 = aF2.b(n3);
                    n n4 = this.a(s2, n3, (aA)object2);
                    s s3 = aF2.b(n4);
                    n n5 = this.a(s2, n3, aA3);
                    s s4 = aF2.b(n5);
                    n n6 = this.a(s3, n4, aA3);
                    s s5 = aF2.b(n6);
                    n n7 = this.a(s2, n3, aA2);
                    s s6 = aF2.b(n7);
                    n n8 = this.a(s6, n7, (aA)object2);
                    s s7 = aF2.b(n8);
                    n n9 = this.a(s6, n7, aA3);
                    s s8 = aF2.b(n9);
                    n n10 = this.a(s7, n8, aA3);
                    s s9 = aF2.b(n10);
                    this.a(s2, this.d, (Set<n>)object);
                    this.a(s3, this.d, (Set<n>)object);
                    this.a(s4, this.d, (Set<n>)object);
                    this.a(s5, this.d, (Set<n>)object);
                    this.a(s6, this.d, (Set<n>)object);
                    this.a(s7, this.d, (Set<n>)object);
                    this.a(s8, this.d, (Set<n>)object);
                    this.a(s9, this.d, (Set<n>)object);
                }
                this.b(aF2);
            }
            this.d = object;
        }
    }
}

