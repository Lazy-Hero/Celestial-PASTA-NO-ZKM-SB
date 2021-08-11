/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Optional
 *  javax.annotation.Nullable
 */
package net.minecraft.J;

import com.google.common.base.Optional;
import javax.annotation.Nullable;
import net.minecraft.J.j;
import net.minecraft.P.c;
import net.minecraft.U.x;
import net.minecraft.ah.H;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.h.d;
import net.minecraft.k.n;
import net.minecraft.q.h;
import net.minecraft.q.m;
import net.minecraft.q.r;
import net.minecraft.u.g;

public class p
extends x {
    public /* synthetic */ int aK;
    private static final /* synthetic */ r<Optional<n>> aL;
    private static final /* synthetic */ r<Boolean> aM;

    public p(z z2) {
        super(z2);
        this.az = true;
        this.c(2.0f, 2.0f);
        this.aK = this.g.nextInt(100000);
    }

    public boolean b() {
        return this.E().b(aM);
    }

    @Nullable
    public n c() {
        return (n)this.E().b(aL).orNull();
    }

    @Override
    protected boolean h() {
        return false;
    }

    @Override
    protected void f(net.minecraft.P.r r2) {
        int n2 = net.minecraft.J.j.c();
        if (n2 == 0) {
            if (this.c() != null) {
                r2.a("BeamTarget", c.a(this.c()));
            }
            r2.a("ShowBottom", this.b());
        }
    }

    public p(z z2, double d10, double d11, double d12) {
        this(z2);
        this.g(d10, d11, d12);
    }

    @Override
    public boolean M() {
        return true;
    }

    @Override
    public boolean a(G g10, float f10) {
        boolean bl2;
        block9: {
            block10: {
                int n2 = net.minecraft.J.j.c();
                bl2 = this.a(g10);
                if (n2 == 0) {
                    if (bl2) {
                        return false;
                    }
                    bl2 = g10.h() instanceof d;
                }
                if (n2 == 0) {
                    if (bl2) {
                        return false;
                    }
                    bl2 = this.P;
                }
                if (n2 != 0) break block9;
                if (bl2) break block10;
                bl2 = this.aG.C;
                if (n2 != 0) break block9;
                if (bl2) break block10;
                this.a();
                bl2 = this.aG.C;
                if (n2 != 0) break block9;
                if (!bl2) {
                    if (!g10.j()) {
                        this.aG.a(null, this.a, this.aF, this.ax, 6.0f, true);
                    }
                    this.a(g10);
                }
            }
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public boolean b(double d10) {
        int n2 = net.minecraft.J.j.d();
        boolean bl2 = super.b(d10);
        if (n2 != 0) {
            bl2 = bl2 || this.c() != null;
        }
        return bl2;
    }

    @Override
    public void ae() {
        block2: {
            n n2;
            z z2;
            block4: {
                n n3;
                int n4;
                block3: {
                    this.N = this.a;
                    this.L = this.aF;
                    this.k = this.ax;
                    ++this.aK;
                    n4 = net.minecraft.J.j.c();
                    if (this.aG.C) break block2;
                    n3 = new n(this);
                    z2 = this.aG;
                    if (n4 != 0) break block3;
                    if (!(z2.D instanceof H)) break block2;
                    z2 = this.aG;
                }
                n2 = n3;
                if (n4 != 0) break block4;
                if (z2.d(n2).b() == net.minecraft.u.g.C) break block2;
                z2 = this.aG;
                n2 = n3;
            }
            z2.a(n2, net.minecraft.u.g.C.d());
        }
    }

    @Override
    public void y() {
        this.a(net.minecraft.ar.G.B);
        super.y();
    }

    @Override
    protected void ab() {
        this.E().c(aL, Optional.absent());
        this.E().c(aM, true);
    }

    public void a(boolean bl2) {
        this.E().b(aM, bl2);
    }

    private void a(G g10) {
        block3: {
            net.minecraft.am.g g11;
            block4: {
                net.minecraft.am.g g12;
                net.minecraft.ah.G g13;
                int n2;
                block2: {
                    n2 = net.minecraft.J.j.c();
                    g13 = this.aG.D;
                    if (n2 != 0) break block2;
                    if (!(g13 instanceof H)) break block3;
                    g13 = this.aG.D;
                }
                H h2 = (H)g13;
                g11 = g12 = h2.a();
                if (n2 != 0) break block4;
                if (g11 == null) break block3;
                g11 = g12;
            }
            g11.a(this, g10);
        }
    }

    @Override
    protected void a(net.minecraft.P.r r2) {
        block2: {
            int n2 = net.minecraft.J.j.d();
            boolean bl2 = r2.a("BeamTarget", 10);
            if (n2 != 0) {
                if (bl2) {
                    this.b(c.d(r2.h("BeamTarget")));
                }
                bl2 = r2.a("ShowBottom", 1);
            }
            if (!bl2) break block2;
            this.a(r2.f("ShowBottom"));
        }
    }

    static {
        aL = net.minecraft.q.m.a(p.class, h.e);
        aM = net.minecraft.q.m.a(p.class, h.g);
    }

    public void b(@Nullable n n2) {
        this.E().b(aL, Optional.fromNullable((Object)n2));
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

