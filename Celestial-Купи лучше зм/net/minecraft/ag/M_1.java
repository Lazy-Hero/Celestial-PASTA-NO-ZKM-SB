/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ag;

import javax.annotation.Nullable;
import net.minecraft.U.D;
import net.minecraft.U.E;
import net.minecraft.W.K;
import net.minecraft.ag.A;
import net.minecraft.ag.C;
import net.minecraft.ah.z;
import net.minecraft.ak.F;
import net.minecraft.ak.P;
import net.minecraft.ak.W;
import net.minecraft.ak.aA;
import net.minecraft.ak.aa;
import net.minecraft.ak.al;
import net.minecraft.ar.G;
import net.minecraft.ar.a3;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.u.h;
import net.minecraft.w.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class M
extends C {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public float l() {
        String[] arrstring = net.minecraft.ag.A.b();
        M m2 = this;
        if (arrstring != null) {
            if (!m2.Q()) return 1.3f;
            m2 = this;
        }
        float f10 = m2.aD;
        return f10;
    }

    @Override
    protected net.minecraft.ar.d e(G g10) {
        return net.minecraft.u.E.bY;
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.E;
    }

    @Override
    protected net.minecraft.ar.d aI() {
        return net.minecraft.u.E.n;
    }

    public M(z z2) {
        super(z2);
        this.c(0.9f, 1.4f);
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.f).a(10.0);
        this.a(net.minecraft.U.M.d).a(0.2f);
    }

    @Override
    public M a(E e10) {
        return new M(this.aG);
    }

    @Override
    public boolean b(j j2, a3 a32) {
        boolean bl2;
        block5: {
            block4: {
                boolean bl3;
                block9: {
                    block8: {
                        String[] arrstring;
                        block6: {
                            block7: {
                                d d10 = j2.c(a32);
                                arrstring = net.minecraft.ag.A.b();
                                if (d10.w() != h.P) break block4;
                                bl2 = j2.cw.g;
                                if (arrstring == null) break block5;
                                if (bl2) break block4;
                                bl2 = this.Q();
                                if (arrstring == null) break block5;
                                if (bl2) break block4;
                                j2.a(net.minecraft.u.E.fw, 1.0f, 1.0f);
                                d10.b(1);
                                bl3 = d10.G();
                                if (arrstring == null) break block6;
                                if (!bl3) break block7;
                                j2.a(a32, new d(h.n));
                                if (arrstring != null) break block8;
                            }
                            bl3 = j2.cB.b(new d(h.n));
                        }
                        if (arrstring == null) break block9;
                        if (!bl3) {
                            j2.a(new d(h.n), false);
                        }
                    }
                    bl3 = true;
                }
                return bl3;
            }
            bl2 = super.b(j2, a32);
        }
        return bl2;
    }

    @Override
    protected void H() {
        this.b5.a(0, new W(this));
        this.b5.a(1, new P(this, 2.0));
        this.b5.a(2, new net.minecraft.ak.G(this, 1.0));
        this.b5.a(3, new al((D)this, 1.25, h.b1, false));
        this.b5.a(4, new net.minecraft.ak.A(this, 1.25));
        this.b5.a(5, new aA(this, 1.0));
        this.b5.a(6, new aa(this, j.class, 6.0f));
        this.b5.a(7, new F(this));
    }

    @Override
    protected float x() {
        return 0.4f;
    }

    @Override
    protected net.minecraft.ar.d q() {
        return net.minecraft.u.E.eE;
    }

    @Override
    protected void a(n n2, K k2) {
        this.a(net.minecraft.u.E.av, 0.15f, 1.0f);
    }

    public static void b(b b10) {
        net.minecraft.U.C.a(b10, M.class);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

