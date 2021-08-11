/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.k;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.U.x;
import net.minecraft.ar.aA;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.k.o;

public final class p
extends o {
    private /* synthetic */ boolean t;
    private static final /* synthetic */ List<p> u;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public p a(int n2, int n3, int n4) {
        boolean bl2 = n.g();
        p p2 = this;
        if (bl2) {
            if (p2.t) {
                n.f().error("PooledMutableBlockPosition modified after it was released.", new Throwable());
                this.t = false;
            }
            p2 = (p)super.a(n2, n3, n4);
        }
        return p2;
    }

    @Override
    public p b(m m2) {
        return (p)super.a(m2);
    }

    private p(int n2, int n3, int n4) {
        super(n2, n3, n4);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void b() {
        List<p> list = u;
        synchronized (list) {
            List<p> list2;
            block5: {
                boolean bl2 = n.e();
                list2 = u;
                if (bl2) return;
                if (list2.size() >= 100) break block5;
                u.add(this);
            }
            this.t = true;
            list2 = list;
            // ** MonitorExit[v0] (shouldn't be in output)
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static p b(int n2, int n3, int n4) {
        List<p> list = u;
        synchronized (list) {
            List<p> list2;
            block8: {
                boolean bl2 = n.e();
                list2 = u;
                if (bl2) return new p(n2, n3, n4);
                if (list2.isEmpty()) break block8;
                p p2 = u.remove(u.size() - 1);
                if (bl2) return new p(n2, n3, n4);
                if (p2 == null) break block8;
                p p3 = p2;
                if (bl2) return p3;
                if (!p3.t) break block8;
                p2.t = false;
                p2.a(n2, n3, n4);
                p3 = p2;
                return p3;
            }
            list2 = list;
            // ** MonitorExit[v0] (shouldn't be in output)
            return new p(n2, n3, n4);
        }
    }

    public static p a(m m2) {
        return p.b(m2.e(), m2.b(), m2.a());
    }

    public static p a() {
        return p.b(0, 0, 0);
    }

    public static p b(double d10, double d11, double d12) {
        return p.b(h.f(d10), h.f(d11), h.f(d12));
    }

    static {
        u = Lists.newArrayList();
    }

    @Override
    public p a(double d10, double d11, double d12) {
        return (p)super.a(d10, d11, d12);
    }

    @Override
    public p a(aA aA2, int n2) {
        return (p)super.a(aA2, n2);
    }

    @Override
    public p a(aA aA2) {
        return (p)super.a(aA2);
    }

    @Override
    public p a(x x2) {
        return (p)super.a(x2);
    }
}

