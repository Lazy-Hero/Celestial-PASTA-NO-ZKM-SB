/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.N;

import java.util.Iterator;
import java.util.Random;
import net.minecraft.B.W;
import net.minecraft.B.n;
import net.minecraft.B.r;
import net.minecraft.N.N;
import net.minecraft.N.j;
import net.minecraft.ar.a2;
import net.minecraft.av.b;
import net.minecraft.av.f;
import net.minecraft.av.g;
import net.minecraft.i.h;
import net.minecraft.k.m;
import net.minecraft.w.d;

public class P
extends N {
    private static final /* synthetic */ Random n;
    private /* synthetic */ a2<d> m;

    @Override
    public String a() {
        return "minecraft:dispenser";
    }

    static {
        n = new Random();
    }

    public P() {
        this.m = a2.a(9, net.minecraft.w.d.m);
    }

    @Override
    protected a2<d> a() {
        return this.m;
    }

    public static void a(b b10) {
        b10.a(net.minecraft.av.f.BLOCK_ENTITY, (g)new net.minecraft.x.d(P.class, "Items"));
    }

    @Override
    public boolean f() {
        boolean bl2;
        block3: {
            Iterator iterator = this.m.iterator();
            m[] arrm = net.minecraft.N.j.f();
            while (iterator.hasNext()) {
                block5: {
                    boolean bl3;
                    block4: {
                        d d10 = (d)iterator.next();
                        bl2 = d10.G();
                        if (arrm != null) break block3;
                        if (arrm != null) break block4;
                        if (bl2) break block5;
                        bl3 = false;
                    }
                    return bl3;
                }
                if (arrm == null) continue;
            }
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public net.minecraft.P.r a(net.minecraft.P.r r2) {
        block2: {
            m[] arrm = net.minecraft.N.j.f();
            super.a(r2);
            m[] arrm2 = arrm;
            boolean bl2 = this.b(r2);
            if (arrm2 == null) {
                if (!bl2) {
                    W.b(r2, this.m);
                }
                bl2 = this.g();
            }
            if (!bl2) break block2;
            r2.a("CustomName", this.j);
        }
        return r2;
    }

    public int b() {
        int n2;
        block4: {
            m[] arrm = net.minecraft.N.j.f();
            this.a((net.minecraft.i.j)null);
            m[] arrm2 = arrm;
            int n3 = -1;
            int n4 = 1;
            for (int i2 = 0; i2 < this.m.size(); ++i2) {
                n2 = this.m.get(i2).G() ? 1 : 0;
                if (arrm2 == null) {
                    int n5;
                    if (arrm2 == null) {
                        if (n2 != 0) continue;
                        n5 = n.nextInt(n4++);
                    }
                    if (arrm2 == null) {
                        if (n5 != false) continue;
                        n5 = i2;
                    }
                    n3 = n5;
                    if (arrm2 == null) continue;
                }
                break block4;
            }
            n2 = n3;
        }
        return n2;
    }

    public int a(d d10) {
        int n2;
        block3: {
            m[] arrm = net.minecraft.N.j.f();
            for (int i2 = 0; i2 < this.m.size(); ++i2) {
                n2 = this.m.get(i2).G() ? 1 : 0;
                if (arrm == null) {
                    int n3;
                    if (arrm == null) {
                        if (n2 == 0) continue;
                        this.a(i2, d10);
                        n3 = i2;
                    }
                    return n3;
                }
                break block3;
            }
            n2 = -1;
        }
        return n2;
    }

    @Override
    public n a(h h2, net.minecraft.i.j j2) {
        this.a(j2);
        return new r(h2, this);
    }

    @Override
    public void c(net.minecraft.P.r r2) {
        block2: {
            super.c(r2);
            this.m = a2.a(this.e(), net.minecraft.w.d.m);
            m[] arrm = net.minecraft.N.j.f();
            boolean bl2 = this.a(r2);
            if (arrm == null) {
                if (!bl2) {
                    W.a(r2, this.m);
                }
                bl2 = r2.a("CustomName", 8);
            }
            if (!bl2) break block2;
            this.j = r2.j("CustomName");
        }
    }

    @Override
    public int c() {
        return 64;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public int e() {
        return 9;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public String g() {
        m[] arrm = net.minecraft.N.j.f();
        P p2 = this;
        if (arrm == null) {
            if (!p2.g()) return "container.dispenser";
            p2 = this;
        }
        String string = p2.j;
        return string;
    }
}

