/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.J;

import java.util.Iterator;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.B.V;
import net.minecraft.B.W;
import net.minecraft.B.a;
import net.minecraft.B.n;
import net.minecraft.J.j;
import net.minecraft.J.u;
import net.minecraft.P.r;
import net.minecraft.U.x;
import net.minecraft.ah.A;
import net.minecraft.ah.l;
import net.minecraft.ah.z;
import net.minecraft.aj.b;
import net.minecraft.aj.i;
import net.minecraft.aj.q;
import net.minecraft.ar.G;
import net.minecraft.ar.a2;
import net.minecraft.ar.a3;
import net.minecraft.ar.v;
import net.minecraft.av.f;
import net.minecraft.av.g;
import net.minecraft.w.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class w
extends u
implements l,
q {
    private /* synthetic */ a2<d> a1;
    private /* synthetic */ long a3;
    private /* synthetic */ boolean a4;
    private /* synthetic */ v a2;

    public w(z z2, double d10, double d11, double d12) {
        super(z2, d10, d11, d12);
        this.a1 = net.minecraft.ar.a2.a(36, net.minecraft.w.d.m);
        this.a4 = true;
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public void d() {
        this.a((net.minecraft.i.j)null);
        this.a1.clear();
    }

    @Override
    protected void f(r r2) {
        block5: {
            block3: {
                int n2;
                block4: {
                    w w2;
                    block2: {
                        int n3 = net.minecraft.J.j.c();
                        super.f(r2);
                        n2 = n3;
                        w2 = this;
                        if (n2 != 0) break block2;
                        if (w2.a2 == null) break block3;
                        r2.a("LootTable", this.a2.toString());
                        if (n2 != 0) break block4;
                        w2 = this;
                    }
                    if (w2.a3 == 0L) break block5;
                    r2.a("LootTableSeed", this.a3);
                }
                if (n2 == 0) break block5;
            }
            net.minecraft.B.W.b(r2, this.a1);
        }
    }

    @Override
    public v a() {
        return this.a2;
    }

    @Override
    public boolean b(int n2, d d10) {
        return true;
    }

    @Override
    public void a(G g10) {
        block3: {
            z z2;
            block2: {
                int n2 = net.minecraft.J.j.c();
                super.a(g10);
                int n3 = n2;
                z2 = this.aG;
                if (n3 != 0) break block2;
                if (!z2.M().c("doEntityDrops")) break block3;
                z2 = this.aG;
            }
            V.a(z2, this, (a)this);
        }
    }

    @Override
    public int c(int n2) {
        return 0;
    }

    @Override
    protected void a(r r2) {
        block4: {
            r r3;
            block2: {
                block3: {
                    int n2 = net.minecraft.J.j.c();
                    super.a(r2);
                    int n3 = n2;
                    this.a1 = net.minecraft.ar.a2.a(this.e(), net.minecraft.w.d.m);
                    r3 = r2;
                    if (n3 != 0) break block2;
                    if (!r3.a("LootTable", 8)) break block3;
                    this.a2 = new v(r2.j("LootTable"));
                    this.a3 = r2.o("LootTableSeed");
                    if (n3 == 0) break block4;
                }
                r3 = r2;
            }
            net.minecraft.B.W.a(r3, this.a1);
        }
    }

    @Override
    public void a(int n2, d d10) {
        block3: {
            d d11;
            block4: {
                int n3;
                block2: {
                    int n4 = net.minecraft.J.j.d();
                    this.a((net.minecraft.i.j)null);
                    int n5 = n4;
                    this.a1.set(n2, d10);
                    n3 = d10.G();
                    if (n5 == 0) break block2;
                    if (n3 != 0) break block3;
                    d11 = d10;
                    if (n5 == 0) break block4;
                    n3 = d11.t();
                }
                if (n3 <= this.c()) break block3;
                d11 = d10;
            }
            d11.c(this.c());
        }
    }

    @Override
    public int c() {
        return 64;
    }

    @Override
    public void b(int n2, int n3) {
    }

    @Override
    public void a(net.minecraft.ah.x x2) {
    }

    @Override
    public boolean a(net.minecraft.i.j j2, a3 a32) {
        int n2 = net.minecraft.J.j.c();
        boolean bl2 = this.aG.C;
        if (n2 == 0) {
            if (!bl2) {
                j2.a(this);
            }
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public void a() {
        int n2 = net.minecraft.J.j.c();
        w w2 = this;
        if (n2 == 0) {
            if (w2.a4) {
                V.a(this.aG, this, (a)this);
            }
            w2 = this;
        }
        super.a();
    }

    @Override
    public int a() {
        return 0;
    }

    @Override
    public d a(int n2, int n3) {
        this.a((net.minecraft.i.j)null);
        return net.minecraft.B.W.a(this.a1, n2, n3);
    }

    public w(z z2) {
        super(z2);
        this.a1 = net.minecraft.ar.a2.a(36, net.minecraft.w.d.m);
        this.a4 = true;
    }

    @Override
    public void b() {
    }

    @Override
    public void d(net.minecraft.i.j j2) {
    }

    @Override
    public void j(boolean bl2) {
        this.a4 = bl2;
    }

    @Override
    public boolean f() {
        boolean bl2;
        block3: {
            Iterator iterator = this.a1.iterator();
            int n2 = net.minecraft.J.j.d();
            while (iterator.hasNext()) {
                block5: {
                    boolean bl3;
                    block4: {
                        d d10 = (d)iterator.next();
                        bl2 = d10.G();
                        if (n2 == 0) break block3;
                        if (n2 == 0) break block4;
                        if (bl2) break block5;
                        bl3 = false;
                    }
                    return bl3;
                }
                if (n2 != 0) continue;
            }
            bl2 = true;
        }
        return bl2;
    }

    @Override
    @Nullable
    public x e(int n2) {
        this.a4 = false;
        return super.e(n2);
    }

    public void a(v v2, long l2) {
        this.a2 = v2;
        this.a3 = l2;
    }

    @Override
    public void c(net.minecraft.i.j j2) {
    }

    @Override
    protected void i() {
        float f10 = 0.98f;
        int n2 = net.minecraft.J.j.c();
        w w2 = this;
        if (n2 == 0) {
            if (w2.a2 == null) {
                int n3 = 15 - net.minecraft.B.n.b(this);
                f10 += (float)n3 * 0.001f;
            }
            this.aq *= (double)f10;
            this.G *= 0.0;
            w2 = this;
        }
        w2.d *= (double)f10;
    }

    public void a(@Nullable net.minecraft.i.j j2) {
        block5: {
            Random random;
            i i2;
            block7: {
                block6: {
                    w w2;
                    int n2;
                    block4: {
                        n2 = net.minecraft.J.j.c();
                        w2 = this;
                        if (n2 != 0) break block4;
                        if (w2.a2 == null) break block5;
                        w2 = this;
                    }
                    i2 = w2.aG.D().a(this.a2);
                    this.a2 = null;
                    if (this.a3 != 0L) break block6;
                    random = new Random();
                    if (n2 == 0) break block7;
                }
                random = new Random(this.a3);
            }
            b b10 = new b((A)this.aG);
            if (j2 != null) {
                b10.a(j2.y());
            }
            i2.a(this, random, b10.a());
        }
    }

    @Override
    public net.minecraft.ah.x a() {
        return net.minecraft.ah.x.a;
    }

    @Override
    public d a(int n2) {
        this.a((net.minecraft.i.j)null);
        return this.a1.get(n2);
    }

    @Override
    public boolean a(net.minecraft.i.j j2) {
        int n2 = net.minecraft.J.j.c();
        boolean bl2 = this.P;
        if (n2 == 0) {
            if (bl2) {
                return false;
            }
            double d10 = j2.s(this) - 64.0;
            bl2 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
        }
        if (n2 == 0) {
            bl2 = bl2 <= false;
        }
        return bl2;
    }

    public static void b(net.minecraft.av.b b10, Class<?> class_) {
        net.minecraft.J.u.a(b10, class_);
        b10.a(net.minecraft.av.f.ENTITY, (g)new net.minecraft.x.d(class_, "Items"));
    }

    private static gP c(gP gP2) {
        return gP2;
    }

    @Override
    public d b(int n2) {
        d d10;
        int n3 = net.minecraft.J.j.c();
        this.a((net.minecraft.i.j)null);
        int n4 = n3;
        d d11 = d10 = this.a1.get(n2);
        if (n4 == 0) {
            if (d11.G()) {
                return net.minecraft.w.d.m;
            }
            this.a1.set(n2, net.minecraft.w.d.m);
            d11 = d10;
        }
        return d11;
    }
}

