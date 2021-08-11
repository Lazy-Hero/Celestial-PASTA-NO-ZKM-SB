/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.N;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.B.W;
import net.minecraft.N.J;
import net.minecraft.N.j;
import net.minecraft.P.r;
import net.minecraft.ah.A;
import net.minecraft.aj.b;
import net.minecraft.aj.i;
import net.minecraft.aj.q;
import net.minecraft.ar.a2;
import net.minecraft.ar.v;
import net.minecraft.k.m;
import net.minecraft.w.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class N
extends J
implements q {
    protected /* synthetic */ long k;
    protected /* synthetic */ String j;
    protected /* synthetic */ v l;

    @Override
    public void a(int n2, @Nullable d d10) {
        this.a((net.minecraft.i.j)null);
        m[] arrm = net.minecraft.N.j.f();
        this.a().set(n2, d10);
        m[] arrm2 = arrm;
        if (arrm2 == null) {
            if (d10.t() > this.c()) {
                d10.c(this.c());
            }
            this.b();
        }
    }

    protected boolean b(r r2) {
        block6: {
            long l2;
            N n2;
            m[] arrm;
            block5: {
                arrm = net.minecraft.N.j.f();
                n2 = this;
                if (arrm != null) break block5;
                if (n2.l == null) break block6;
                r2.a("LootTable", this.l.toString());
                n2 = this;
            }
            long l3 = (l2 = n2.k - 0L) == 0L ? 0 : (l2 < 0L ? -1 : 1);
            if (arrm == null) {
                if (l3 != false) {
                    r2.a("LootTableSeed", this.k);
                }
                l3 = 1;
            }
            return (boolean)l3;
        }
        return false;
    }

    protected boolean a(r r2) {
        m[] arrm = net.minecraft.N.j.f();
        boolean bl2 = r2.a("LootTable", 8);
        if (arrm == null) {
            if (bl2) {
                this.l = new v(r2.j("LootTable"));
                this.k = r2.o("LootTableSeed");
                return true;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public d a(int n2) {
        this.a((net.minecraft.i.j)null);
        return this.a().get(n2);
    }

    protected abstract a2<d> a();

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean g() {
        m[] arrm = net.minecraft.N.j.f();
        String string = this.j;
        if (arrm == null) {
            if (string == null) return false;
            string = this.j;
        }
        boolean bl2 = string.isEmpty();
        if (arrm != null) return bl2;
        if (bl2) return false;
        return true;
    }

    @Override
    public boolean a(net.minecraft.i.j j2) {
        m[] arrm = net.minecraft.N.j.f();
        if (this.a.b(this.d) != this) {
            return false;
        }
        double d10 = j2.a((double)this.d.e() + 0.5, (double)this.d.b() + 0.5, (double)this.d.a() + 0.5) - 64.0;
        double d11 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
        if (arrm == null) {
            d11 = d11 <= 0 ? 1.0 : 0.0;
        }
        return (boolean)d11;
    }

    private static gP d(gP gP2) {
        return gP2;
    }

    @Override
    public d b(int n2) {
        this.a((net.minecraft.i.j)null);
        return W.a(this.a(), n2);
    }

    @Override
    public void b(int n2, int n3) {
    }

    @Override
    public int c(int n2) {
        return 0;
    }

    @Override
    public void d(net.minecraft.i.j j2) {
    }

    @Override
    public boolean b(int n2, d d10) {
        return true;
    }

    @Override
    public v a() {
        return this.l;
    }

    public void a(String string) {
        this.j = string;
    }

    @Override
    public void c(net.minecraft.i.j j2) {
    }

    @Override
    public int a() {
        return 0;
    }

    @Override
    public d a(int n2, int n3) {
        m[] arrm = net.minecraft.N.j.f();
        this.a((net.minecraft.i.j)null);
        d d10 = W.a(this.a(), n2, n3);
        m[] arrm2 = arrm;
        d d11 = d10;
        if (arrm2 == null) {
            if (!d11.G()) {
                this.b();
            }
            d11 = d10;
        }
        return d11;
    }

    public void a(v v2, long l2) {
        this.l = v2;
        this.k = l2;
    }

    public void a(@Nullable net.minecraft.i.j j2) {
        block5: {
            Random random;
            i i2;
            block7: {
                block6: {
                    N n2;
                    m[] arrm;
                    block4: {
                        arrm = net.minecraft.N.j.f();
                        n2 = this;
                        if (arrm != null) break block4;
                        if (n2.l == null) break block5;
                        n2 = this;
                    }
                    i2 = n2.a.D().a(this.l);
                    this.l = null;
                    if (this.k != 0L) break block6;
                    random = new Random();
                    if (arrm == null) break block7;
                }
                random = new Random(this.k);
            }
            b b10 = new b((A)this.a);
            if (j2 != null) {
                b10.a(j2.y());
            }
            i2.a(this, random, b10.a());
        }
    }

    @Override
    public void d() {
        this.a((net.minecraft.i.j)null);
        this.a().clear();
    }
}

