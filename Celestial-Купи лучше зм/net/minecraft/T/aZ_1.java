/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.T.F;
import net.minecraft.T.G;
import net.minecraft.T.H;
import net.minecraft.T.S;
import net.minecraft.T.d;
import net.minecraft.T.k;
import net.minecraft.U.C;
import net.minecraft.U.M;
import net.minecraft.ah.e;
import net.minecraft.ah.z;
import net.minecraft.ak.u;
import net.minecraft.ar.ay;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.i.j;
import net.minecraft.q.h;
import net.minecraft.q.m;
import net.minecraft.u.E;
import net.minecraft.z.l;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aZ
extends net.minecraft.U.F
implements k {
    private /* synthetic */ int cq;
    private static final /* synthetic */ net.minecraft.q.r<Boolean> cr;

    public boolean b() {
        return this.ap.b(cr);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(r r2) {
        block3: {
            r r3;
            block2: {
                int[] arrn = net.minecraft.T.S.f();
                aZ aZ2 = this;
                r3 = r2;
                if (arrn == null) break block2;
                super.a(r3);
                if (!r2.a("ExplosionPower", 99)) break block3;
                aZ2 = this;
                r3 = r2;
            }
            aZ2.cq = r3.m("ExplosionPower");
        }
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(cr, false);
    }

    @Override
    public ay ad() {
        return ay.HOSTILE;
    }

    @Override
    public void f(r r2) {
        super.f(r2);
        r2.b("ExplosionPower", this.cq);
    }

    public int a() {
        return this.cq;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(net.minecraft.ar.G g10, float f10) {
        int[] arrn = net.minecraft.T.S.f();
        boolean bl2 = this.a(g10);
        if (arrn != null) {
            if (bl2) {
                return false;
            }
            bl2 = g10.q() instanceof l;
        }
        if (arrn == null) return bl2;
        if (bl2) {
            bl2 = g10.h() instanceof j;
            if (arrn == null) return bl2;
            if (bl2) {
                super.a(g10, 1000.0f);
                return true;
            }
        }
        bl2 = super.a(g10, f10);
        return bl2;
    }

    @Override
    protected float x() {
        return 10.0f;
    }

    @Override
    public int U() {
        return 1;
    }

    static {
        cr = net.minecraft.q.m.a(aZ.class, h.g);
    }

    @Override
    protected net.minecraft.ar.d q() {
        return net.minecraft.u.E.t;
    }

    @Override
    public float l() {
        return 2.6f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean C() {
        aZ aZ2;
        block3: {
            int n2;
            block2: {
                int[] arrn = net.minecraft.T.S.f();
                n2 = this.g.nextInt(20);
                if (arrn == null) break block2;
                if (n2 != 0) return false;
                aZ2 = this;
                if (arrn == null) break block3;
                n2 = super.C() ? 1 : 0;
            }
            if (n2 == 0) return false;
            aZ2 = this;
        }
        if (aZ2.aG.g() == net.minecraft.ah.e.PEACEFUL) return false;
        return true;
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.y;
    }

    public aZ(z z2) {
        super(z2);
        this.cq = 1;
        this.c(4.0f, 4.0f);
        this.al = true;
        this.ch = 5;
        this.b9 = new d(this);
    }

    @Override
    public void ae() {
        block3: {
            aZ aZ2;
            block4: {
                z z2;
                block2: {
                    int[] arrn = net.minecraft.T.S.f();
                    super.ae();
                    int[] arrn2 = arrn;
                    z2 = this.aG;
                    if (arrn2 == null) break block2;
                    if (z2.C) break block3;
                    aZ2 = this;
                    if (arrn2 == null) break block4;
                    z2 = aZ2.aG;
                }
                if (z2.g() != net.minecraft.ah.e.PEACEFUL) break block3;
                aZ2 = this;
            }
            aZ2.a();
        }
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.f).a(10.0);
        this.a(net.minecraft.U.M.b).a(100.0);
    }

    public void a(boolean bl2) {
        this.ap.b(cr, bl2);
    }

    @Override
    protected net.minecraft.ar.d e(net.minecraft.ar.G g10) {
        return net.minecraft.u.E.g9;
    }

    @Override
    protected net.minecraft.ar.d aI() {
        return net.minecraft.u.E.R;
    }

    @Override
    protected void H() {
        this.b5.a(5, new H(this));
        this.b5.a(7, new G(this));
        this.b5.a(7, new F(this));
        this.ci.a(1, new u(this));
    }

    public static void b(b b10) {
        C.a(b10, aZ.class);
    }
}

