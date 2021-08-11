/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.ContiguousSet
 *  com.google.common.collect.DiscreteDomain
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Range
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.am;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.A.N;
import net.minecraft.J.p;
import net.minecraft.N.F;
import net.minecraft.N.y;
import net.minecraft.P.c;
import net.minecraft.P.n;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.Z.f;
import net.minecraft.a6;
import net.minecraft.ah.A;
import net.minecraft.ah.S;
import net.minecraft.ah.d;
import net.minecraft.ah.i;
import net.minecraft.ah.z;
import net.minecraft.am.a;
import net.minecraft.ar.G;
import net.minecraft.ar.aA;
import net.minecraft.ar.av;
import net.minecraft.ar.e;
import net.minecraft.at.h;
import net.minecraft.k.k;
import net.minecraft.k.m;
import net.minecraft.p.X;
import net.minecraft.v.b;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class g {
    private final /* synthetic */ List<Integer> b;
    private /* synthetic */ int c;
    private /* synthetic */ int o;
    private /* synthetic */ boolean n;
    private /* synthetic */ UUID r;
    private /* synthetic */ boolean h;
    private static final /* synthetic */ Predicate<net.minecraft.i.k> a;
    private /* synthetic */ a q;
    private /* synthetic */ int e;
    private /* synthetic */ List<p> f;
    private /* synthetic */ int i;
    private /* synthetic */ boolean k;
    private static final /* synthetic */ Logger g;
    private /* synthetic */ net.minecraft.k.n p;
    private final /* synthetic */ net.minecraft.au.d j;
    private /* synthetic */ int l;
    private final /* synthetic */ A d;
    private final /* synthetic */ S m;

    public void a(net.minecraft.h.d d10) {
        block3: {
            g g10;
            block4: {
                boolean bl2;
                block2: {
                    boolean bl3 = net.minecraft.P.r.g();
                    bl2 = d10.u().equals(this.r);
                    if (bl3) break block2;
                    if (!bl2) break block3;
                    this.m.a(d10.V() / d10.H());
                    g10 = this;
                    if (bl3) break block4;
                    g10.o = 0;
                    bl2 = d10.g();
                }
                if (!bl2) break block3;
                g10 = this;
            }
            g10.m.a(d10.d());
        }
    }

    static {
        g = LogManager.getLogger();
        a = Predicates.and(net.minecraft.ar.e.b, net.minecraft.ar.e.a(0.0, 128.0, 0.0, 192.0));
    }

    public void a(p p2, G g10) {
        block4: {
            x x2;
            block5: {
                x x3;
                g g11;
                boolean bl2;
                block2: {
                    block3: {
                        bl2 = net.minecraft.P.r.b();
                        g11 = this;
                        if (!bl2) break block2;
                        if (g11.q == null) break block3;
                        g11 = this;
                        if (!bl2) break block2;
                        if (!g11.f.contains(p2)) break block3;
                        g.debug("Aborting respawn sequence");
                        this.q = null;
                        this.l = 0;
                        this.m();
                        this.a(true);
                        if (bl2) break block4;
                    }
                    this.d();
                    g11 = this;
                }
                x2 = x3 = g11.d.a(this.r);
                if (!bl2) break block5;
                if (!(x2 instanceof net.minecraft.h.d)) break block4;
                x2 = x3;
            }
            ((net.minecraft.h.d)x2).a(p2, new net.minecraft.k.n(p2), g10);
        }
    }

    private void a(List<p> list) {
        block11: {
            block8: {
                g g10;
                boolean bl2;
                block12: {
                    block10: {
                        bl2 = net.minecraft.P.r.g();
                        g10 = this;
                        if (bl2) break block10;
                        if (!g10.n) break block11;
                        g10 = this;
                    }
                    if (bl2) break block12;
                    if (g10.q != null) break block11;
                    g10 = this;
                }
                net.minecraft.au.h h2 = g10.b();
                while (h2 != null) {
                    if (bl2) break block8;
                    int n2 = 0;
                    block1: while (true) {
                        int n3 = n2;
                        block2: while (true) {
                            int n4 = n3;
                            block3: while (n4 < this.j.a()) {
                                n2 = 0;
                                if (bl2) continue block1;
                                int n5 = n2;
                                while (n5 < this.j.c()) {
                                    block9: {
                                        n4 = 0;
                                        if (bl2) continue block3;
                                        for (int i2 = v2345032; i2 < this.j.b(); ++i2) {
                                            f f10;
                                            block14: {
                                                K k2;
                                                K k3;
                                                block13: {
                                                    f10 = h2.a(n3, n5, i2);
                                                    if (bl2) break block9;
                                                    k3 = f10.b().b();
                                                    k2 = net.minecraft.u.g.g;
                                                    if (bl2) break block13;
                                                    if (k3 == k2) break block14;
                                                    k3 = f10.b().b();
                                                    k2 = net.minecraft.u.g.df;
                                                }
                                                if (k3 != k2) continue;
                                            }
                                            this.d.a(f10.c(), net.minecraft.u.g.v.d());
                                            if (!bl2) continue;
                                        }
                                        ++n5;
                                    }
                                    if (!bl2) continue;
                                }
                                ++n3;
                                if (!bl2) continue block2;
                            }
                            break block1;
                            break;
                        }
                        break;
                    }
                    h2 = this.b();
                    if (!bl2) continue;
                }
                this.q = net.minecraft.am.a.START;
                this.l = 0;
                this.a(false);
            }
            this.f = list;
        }
    }

    public int h() {
        return this.i;
    }

    public void a() {
        block22: {
            int n2;
            block40: {
                g g10;
                int n3;
                int n4;
                block35: {
                    boolean bl2;
                    block36: {
                        block39: {
                            List<x> list;
                            block37: {
                                block38: {
                                    g g11;
                                    block33: {
                                        block34: {
                                            block32: {
                                                block23: {
                                                    block24: {
                                                        boolean bl3;
                                                        block31: {
                                                            block30: {
                                                                Object object;
                                                                boolean bl4;
                                                                block28: {
                                                                    List<x> list2;
                                                                    block29: {
                                                                        block27: {
                                                                            block25: {
                                                                                block26: {
                                                                                    int n5;
                                                                                    block21: {
                                                                                        bl2 = net.minecraft.P.r.g();
                                                                                        boolean bl5 = this.n;
                                                                                        if (!bl2) {
                                                                                            bl5 = !bl5;
                                                                                        }
                                                                                        this.m.a(bl5);
                                                                                        n5 = this.c = this.c + 1;
                                                                                        if (!bl2) {
                                                                                            if (n5 >= 20) {
                                                                                                this.e();
                                                                                                this.c = 0;
                                                                                            }
                                                                                            n5 = this.m.a().isEmpty() ? 1 : 0;
                                                                                        }
                                                                                        if (bl2) break block21;
                                                                                        if (n5 != 0) break block22;
                                                                                        g11 = this;
                                                                                        if (bl2) break block23;
                                                                                        n5 = g11.h ? 1 : 0;
                                                                                    }
                                                                                    if (n5 == 0) break block24;
                                                                                    g.info("Scanning for legacy world dragon fight...");
                                                                                    this.k();
                                                                                    this.h = false;
                                                                                    bl4 = this.f();
                                                                                    if (bl2) break block25;
                                                                                    if (!bl4) break block26;
                                                                                    g.info("Found that the dragon has been killed in this world already.");
                                                                                    this.k = true;
                                                                                    if (!bl2) break block27;
                                                                                }
                                                                                g.info("Found that the dragon has not yet been killed in this world.");
                                                                                this.k = false;
                                                                            }
                                                                            this.a(false);
                                                                        }
                                                                        list2 = this.d.a(net.minecraft.h.d.class, net.minecraft.ar.e.b);
                                                                        object = list2;
                                                                        if (bl2) break block28;
                                                                        if (!object.isEmpty()) break block29;
                                                                        this.n = true;
                                                                        if (!bl2) break block30;
                                                                    }
                                                                    object = list2.get(0);
                                                                }
                                                                net.minecraft.h.d d10 = (net.minecraft.h.d)object;
                                                                this.r = d10.u();
                                                                g.info("Found that there's a dragon still alive ({})", (Object)d10);
                                                                this.n = false;
                                                                bl3 = bl4;
                                                                if (bl2) break block31;
                                                                if (!bl3) {
                                                                    g.info("But we didn't have a portal, let's remove it.");
                                                                    d10.a();
                                                                    this.r = null;
                                                                }
                                                            }
                                                            g11 = this;
                                                            if (bl2) break block23;
                                                            bl3 = g11.k;
                                                        }
                                                        if (bl3) break block24;
                                                        g11 = this;
                                                        if (bl2) break block23;
                                                        if (g11.n) {
                                                            this.n = false;
                                                        }
                                                    }
                                                    g11 = this;
                                                }
                                                if (!bl2) {
                                                    if (g11.q != null) {
                                                        g g12 = this;
                                                        if (!bl2) {
                                                            if (g12.f == null) {
                                                                this.q = null;
                                                                this.l();
                                                            }
                                                            g12 = this;
                                                        }
                                                        g12.q.a(this.d, this, this.f, this.l++, this.p);
                                                    }
                                                    g11 = this;
                                                }
                                                if (bl2) break block32;
                                                if (g11.n) break block22;
                                                g11 = this;
                                            }
                                            if (bl2) break block33;
                                            if (g11.r == null) break block34;
                                            n4 = this.o = this.o + 1;
                                            n3 = 1200;
                                            if (bl2) break block35;
                                            if (n4 < n3) break block36;
                                        }
                                        this.k();
                                        g11 = this;
                                    }
                                    list = g11.d.a(net.minecraft.h.d.class, net.minecraft.ar.e.b);
                                    if (bl2) break block37;
                                    if (!list.isEmpty()) break block38;
                                    g.debug("Haven't seen the dragon, respawning it");
                                    this.c();
                                    if (!bl2) break block39;
                                }
                                g.debug("Haven't seen our dragon, but found another one to use.");
                            }
                            this.r = ((net.minecraft.h.d)list.get(0)).u();
                        }
                        this.o = 0;
                    }
                    g g13 = this;
                    g10 = g13;
                    n2 = g13.e + 1;
                    if (bl2) break block40;
                    n4 = g10.e = n2;
                    n3 = 100;
                }
                if (n4 < n3) break block22;
                this.d();
                g10 = this;
                n2 = 0;
            }
            g10.e = n2;
        }
    }

    @Nullable
    private net.minecraft.au.h b() {
        Object object;
        int n2;
        boolean bl2;
        block12: {
            int n3;
            int n4 = -8;
            bl2 = net.minecraft.P.r.g();
            while (n4 <= 8) {
                block13: {
                    n3 = -8;
                    if (bl2) break block12;
                    n2 = n3;
                    block1: while (true) {
                        int n5 = n2;
                        block2: while (n5 <= 8) {
                            object = this.d.b(n4, n2);
                            if (bl2) break block13;
                            for (y y2 : ((net.minecraft.o.a)object).l().values()) {
                                block14: {
                                    net.minecraft.au.h h2;
                                    block17: {
                                        int n6;
                                        net.minecraft.k.n n7;
                                        block18: {
                                            net.minecraft.k.n n8;
                                            block16: {
                                                net.minecraft.au.h h3;
                                                block15: {
                                                    n5 = y2 instanceof F;
                                                    if (bl2) continue block2;
                                                    if (n5 == 0) break block14;
                                                    h3 = h2 = this.j.a(this.d, y2.j());
                                                    if (bl2) break block15;
                                                    if (h3 == null) break block14;
                                                    h3 = h2;
                                                }
                                                n7 = h3.a(3, 3, 3).c();
                                                n8 = this.p;
                                                if (bl2) break block16;
                                                if (n8 != null) break block17;
                                                n8 = n7;
                                            }
                                            n6 = n8.e();
                                            if (bl2) break block18;
                                            if (n6 != 0) break block17;
                                            n6 = n7.a();
                                        }
                                        if (n6 == 0) {
                                            this.p = n7;
                                        }
                                    }
                                    return h2;
                                }
                                if (!bl2) continue;
                            }
                            ++n2;
                            if (!bl2) continue block1;
                        }
                        break;
                    }
                    ++n4;
                }
                if (!bl2) continue;
            }
            n3 = n2 = (n4 = this.d.C(net.minecraft.p.z.d).b());
        }
        while (n2 >= 0) {
            block19: {
                block20: {
                    block22: {
                        block21: {
                            object = this.j.a(this.d, new net.minecraft.k.n(net.minecraft.p.z.d.e(), n2, net.minecraft.p.z.d.a()));
                            if (bl2) break block19;
                            if (object == null) break block20;
                            g g10 = this;
                            if (bl2) break block21;
                            if (g10.p != null) break block22;
                            g10 = this;
                        }
                        g10.p = ((net.minecraft.au.h)object).a(3, 3, 3).c();
                    }
                    return object;
                }
                --n2;
            }
            if (!bl2) continue;
        }
        return null;
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    private void k() {
        int n2 = -8;
        boolean bl2 = net.minecraft.P.r.b();
        while (n2 <= 8) {
            block3: {
                for (int i2 = -8; i2 <= 8; ++i2) {
                    this.d.b(n2, i2);
                    if (bl2) {
                        if (bl2) continue;
                    }
                    break block3;
                }
                ++n2;
            }
            if (bl2) continue;
        }
    }

    private boolean f() {
        int n2;
        block6: {
            int n3 = -8;
            boolean bl2 = net.minecraft.P.r.b();
            while (n3 <= 8) {
                block7: {
                    n2 = -8;
                    if (!bl2) break block6;
                    int n4 = n2;
                    block1: while (true) {
                        int n5 = n4;
                        block2: while (n5 <= 8) {
                            net.minecraft.o.a a10 = this.d.b(n3, n4);
                            if (!bl2) break block7;
                            for (y y2 : a10.l().values()) {
                                block9: {
                                    boolean bl3;
                                    block8: {
                                        n5 = y2 instanceof F;
                                        if (!bl2) continue block2;
                                        if (!bl2) break block8;
                                        if (n5 == 0) break block9;
                                        bl3 = true;
                                    }
                                    return bl3;
                                }
                                if (bl2) continue;
                            }
                            ++n4;
                            if (bl2) continue block1;
                        }
                        break;
                    }
                    ++n3;
                }
                if (bl2) continue;
            }
            n2 = 0;
        }
        return n2 != 0;
    }

    public r i() {
        boolean bl2;
        r r2;
        block8: {
            block11: {
                g g10;
                String string;
                r r3;
                block10: {
                    g g11;
                    block9: {
                        r2 = new r();
                        bl2 = net.minecraft.P.r.b();
                        g11 = this;
                        if (!bl2) break block9;
                        if (g11.r != null) {
                            r2.a("DragonUUID", this.r);
                        }
                        r2.a("DragonKilled", this.n);
                        r3 = r2;
                        string = "PreviouslyKilled";
                        g10 = this;
                        if (!bl2) break block10;
                        r3.a(string, g10.k);
                        g11 = this;
                    }
                    if (g11.p == null) break block11;
                    r3 = r2;
                    string = "ExitPortalLocation";
                    g10 = this;
                }
                r3.a(string, net.minecraft.P.c.a(g10.p));
            }
            u u2 = new u();
            for (int n2 : this.b) {
                u2.a(new n(n2));
                if (bl2) {
                    if (bl2) continue;
                }
                break block8;
            }
            r2.a("Gateways", u2);
        }
        if (net.minecraft.k.m.c()) {
            net.minecraft.P.r.a(!bl2);
        }
        return r2;
    }

    private void a(net.minecraft.k.n n2) {
        this.d.b(3000, n2, 0);
        new net.minecraft.p.x().a((z)this.d, new Random(), n2);
    }

    private void g() {
        block3: {
            int n2;
            block2: {
                boolean bl2 = net.minecraft.P.r.b();
                n2 = this.b.isEmpty();
                if (!bl2) break block2;
                if (n2 != 0) break block3;
                n2 = this.b.remove(this.b.size() - 1);
            }
            int n3 = n2;
            int n4 = (int)(96.0 * Math.cos(2.0 * (-Math.PI + 0.15707963267948966 * (double)n3)));
            int n5 = (int)(96.0 * Math.sin(2.0 * (-Math.PI + 0.15707963267948966 * (double)n3)));
            this.a(new net.minecraft.k.n(n4, 75, n5));
        }
    }

    public void l() {
        block10: {
            Object object;
            block8: {
                net.minecraft.k.n n2;
                boolean bl2;
                block13: {
                    block16: {
                        block15: {
                            block14: {
                                block12: {
                                    g g10;
                                    block11: {
                                        block9: {
                                            bl2 = net.minecraft.P.r.b();
                                            g10 = this;
                                            if (!bl2) break block9;
                                            if (!g10.n) break block10;
                                            g10 = this;
                                        }
                                        if (!bl2) break block11;
                                        if (g10.q != null) break block10;
                                        g10 = this;
                                    }
                                    n2 = g10.p;
                                    if (!bl2) break block12;
                                    if (n2 != null) break block13;
                                    g.debug("Tried to respawn, but need to find the portal first.");
                                }
                                object = this.b();
                                if (!bl2) break block14;
                                if (object != null) break block15;
                                g.debug("Couldn't find a portal, so we made one.");
                                this.a(true);
                            }
                            if (bl2) break block16;
                        }
                        g.debug("Found the exit portal & temporarily using it.");
                    }
                    n2 = this.p;
                }
                object = Lists.newArrayList();
                net.minecraft.k.n n3 = n2.c(1);
                for (aA aA2 : av.HORIZONTAL) {
                    List<p> list = this.d.a(p.class, new k(n3.a(aA2, 2)));
                    if (bl2) {
                        boolean bl3 = list.isEmpty();
                        if (bl2) {
                            if (bl3) {
                                return;
                            }
                            bl3 = object.addAll(list);
                        }
                        if (bl2) continue;
                    }
                    break block8;
                }
                g.debug("Found all crystals, respawning dragon.");
            }
            this.a((List<p>)object);
        }
    }

    private void e() {
        HashSet hashSet;
        boolean bl2;
        HashSet hashSet2;
        block3: {
            hashSet2 = Sets.newHashSet();
            bl2 = net.minecraft.P.r.g();
            for (net.minecraft.i.k object2 : this.d.b(net.minecraft.i.k.class, a)) {
                this.m.a(object2);
                hashSet = hashSet2;
                if (!bl2) {
                    hashSet.add(object2);
                    if (!bl2) continue;
                }
                break block3;
            }
            hashSet = Sets.newHashSet(this.m.a());
        }
        HashSet hashSet3 = hashSet;
        hashSet3.removeAll(hashSet2);
        Iterator iterator = hashSet3.iterator();
        while (iterator.hasNext()) {
            net.minecraft.i.k k2 = (net.minecraft.i.k)iterator.next();
            this.m.b(k2);
            if (!bl2) continue;
        }
    }

    private void a(boolean bl2) {
        net.minecraft.p.z z2 = new net.minecraft.p.z(bl2);
        boolean bl3 = net.minecraft.P.r.g();
        if (!bl3) {
            int n2;
            if (this.p == null) {
                this.p = this.d.c(net.minecraft.p.z.d).k();
                while (this.d.d(this.p).b() == net.minecraft.u.g.g) {
                    n2 = this.p.b();
                    if (!bl3 && !bl3) {
                        if (n2 <= this.d.y()) break;
                        this.p = this.p.k();
                        if (!bl3) continue;
                    }
                    break;
                }
            } else {
                n2 = z2.a((z)this.d, new Random(), this.p);
            }
        }
    }

    public void m() {
        X[] arrx = N.a(this.d);
        boolean bl2 = net.minecraft.P.r.b();
        int n2 = arrx.length;
        int n3 = 0;
        while (n3 < n2) {
            block3: {
                X x2 = arrx[n3];
                for (p p2 : this.d.a(p.class, x2.d())) {
                    p2.h(false);
                    p2.b((net.minecraft.k.n)null);
                    if (bl2) {
                        if (bl2) continue;
                    }
                    break block3;
                }
                ++n3;
            }
            if (bl2) continue;
        }
    }

    public g(A a10, r r2) {
        block14: {
            block21: {
                block19: {
                    boolean bl2;
                    block20: {
                        boolean bl3;
                        block17: {
                            block18: {
                                block15: {
                                    block16: {
                                        this.m = (S)new S(new h("entity.EnderDragon.name", new Object[0]), net.minecraft.ah.d.PINK, net.minecraft.ah.i.PROGRESS).b(true).c(true);
                                        this.b = Lists.newArrayList();
                                        bl3 = net.minecraft.P.r.g();
                                        this.h = true;
                                        this.d = a10;
                                        if (bl3) break block15;
                                        if (!r2.a("DragonKilled", 99)) break block16;
                                        bl2 = r2.p("DragonUUID");
                                        if (!bl3) {
                                            if (bl2) {
                                                this.r = r2.l("DragonUUID");
                                            }
                                            this.n = r2.f("DragonKilled");
                                            this.k = r2.f("PreviouslyKilled");
                                            bl2 = r2.f("IsRespawning");
                                        }
                                        if (!bl3) {
                                            if (bl2) {
                                                this.q = net.minecraft.am.a.START;
                                            }
                                            bl2 = r2.a("ExitPortalLocation", 10);
                                        }
                                        if (bl3) break block17;
                                        if (!bl2) break block18;
                                        this.p = net.minecraft.P.c.d(r2.h("ExitPortalLocation"));
                                        if (!bl3) break block18;
                                        net.minecraft.k.m.b(!net.minecraft.k.m.c());
                                    }
                                    this.n = true;
                                }
                                this.k = true;
                            }
                            bl2 = r2.a("Gateways", 9);
                        }
                        if (bl3) break block19;
                        if (!bl2) break block20;
                        u u2 = r2.c("Gateways", 3);
                        for (int i2 = 0; i2 < u2.b(); ++i2) {
                            this.b.add(u2.a(i2));
                            if (!bl3) {
                                if (!bl3) continue;
                            }
                            break block14;
                        }
                        if (!bl3) break block21;
                    }
                    bl2 = this.b.addAll((Collection<Integer>)ContiguousSet.create((Range)Range.closedOpen((Comparable)Integer.valueOf(0), (Comparable)Integer.valueOf(20)), (DiscreteDomain)DiscreteDomain.integers()));
                }
                Collections.shuffle(this.b, new Random(a10.C()));
            }
            this.j = net.minecraft.au.g.b().a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ").a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ").a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ").a("  ###  ", " #   # ", "#     #", "#  #  #", "#     #", " #   # ", "  ###  ").a("       ", "  ###  ", " ##### ", " ##### ", " ##### ", "  ###  ", "       ").a('#', net.minecraft.Z.f.a(net.minecraft.au.a.a(net.minecraft.u.g.g))).a();
        }
    }

    public boolean j() {
        return this.k;
    }

    private net.minecraft.h.d c() {
        this.d.b(new net.minecraft.k.n(0, 128, 0));
        net.minecraft.h.d d10 = new net.minecraft.h.d(this.d);
        d10.d().b(net.minecraft.v.b.e);
        d10.c(0.0, 128.0, 0.0, this.d.J.nextFloat() * 360.0f, 0.0f);
        this.d.f(d10);
        this.r = d10.u();
        return d10;
    }

    public void b(net.minecraft.h.d d10) {
        block5: {
            block6: {
                g g10;
                boolean bl2;
                block4: {
                    boolean bl3 = net.minecraft.P.r.g();
                    bl2 = d10.u().equals(this.r);
                    if (bl3) break block4;
                    if (!bl2) break block5;
                    this.m.a(0.0f);
                    this.m.a(false);
                    this.a(true);
                    this.g();
                    g10 = this;
                    if (bl3) break block6;
                    bl2 = g10.k;
                }
                if (!bl2) {
                    this.d.a(this.d.C(net.minecraft.p.z.d), net.minecraft.u.g.bG.d());
                }
                this.k = true;
                g10 = this;
            }
            g10.n = true;
        }
    }

    protected void a(a a10) {
        block7: {
            block9: {
                g g10;
                block10: {
                    a a11;
                    boolean bl2;
                    block8: {
                        bl2 = net.minecraft.P.r.g();
                        a11 = this.q;
                        if (bl2) break block8;
                        if (a11 == null) {
                            throw new IllegalStateException("Dragon respawn isn't in progress, can't skip ahead in the animation.");
                        }
                        g10 = this;
                        if (bl2) break block9;
                        g10.l = 0;
                        a11 = a10;
                    }
                    if (a11 != net.minecraft.am.a.END) break block10;
                    this.q = null;
                    this.n = false;
                    net.minecraft.h.d d10 = this.c();
                    for (net.minecraft.i.k k2 : this.m.a()) {
                        a6.z.a(k2, d10);
                        if (!bl2) {
                            if (!bl2) continue;
                        }
                        break block7;
                    }
                    if (!bl2) break block7;
                }
                g10 = this;
            }
            g10.q = a10;
        }
    }

    private void d() {
        block2: {
            this.e = 0;
            this.i = 0;
            X[] arrx = N.a(this.d);
            boolean bl2 = net.minecraft.P.r.b();
            for (X x2 : arrx) {
                this.i += this.d.a(p.class, x2.d()).size();
                if (bl2) {
                    if (bl2) continue;
                }
                break block2;
            }
            g.debug("Found {} end crystals still alive", (Object)this.i);
        }
    }
}

