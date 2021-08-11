/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import javax.annotation.Nullable;
import net.minecraft.T.B;
import net.minecraft.T.L;
import net.minecraft.T.S;
import net.minecraft.T.ae;
import net.minecraft.U.C;
import net.minecraft.U.D;
import net.minecraft.U.M;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.ah.z;
import net.minecraft.ak.W;
import net.minecraft.ak.Z;
import net.minecraft.ak.au;
import net.minecraft.ak.i;
import net.minecraft.ar.G;
import net.minecraft.ar.H;
import net.minecraft.ar.d;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.u.E;
import net.minecraft.u.g;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a3
extends ae {
    private /* synthetic */ L cx;

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.ao;
    }

    @Override
    protected void H() {
        this.cx = new L(this);
        this.b5.a(1, new W(this));
        this.b5.a(3, this.cx);
        this.b5.a(4, new i(this, 1.0, false));
        this.b5.a(5, new B(this));
        this.ci.a(1, new Z((D)this, true, new Class[0]));
        this.ci.a(2, new au<j>((D)this, j.class, true));
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public double an() {
        return 0.1;
    }

    @Override
    public void e(float f10) {
        this.e = f10;
        super.e(f10);
    }

    @Override
    protected boolean h() {
        return false;
    }

    public static void b(b b10) {
        C.a(b10, a3.class);
    }

    @Override
    public boolean a(G g10, float f10) {
        a3 a32;
        block9: {
            block8: {
                int[] arrn;
                block7: {
                    G g11;
                    block6: {
                        boolean bl2;
                        block5: {
                            arrn = net.minecraft.T.S.f();
                            bl2 = this.a(g10);
                            if (arrn == null) break block5;
                            if (bl2) {
                                return false;
                            }
                            g11 = g10;
                            if (arrn == null) break block6;
                            bl2 = g11 instanceof H;
                        }
                        if (bl2) break block7;
                        g11 = g10;
                    }
                    if (g11 != net.minecraft.ar.G.f) break block8;
                }
                a32 = this;
                if (arrn == null) break block9;
                if (a32.cx != null) {
                    this.cx.c();
                }
            }
            a32 = this;
        }
        return super.a(g10, f10);
    }

    @Override
    protected d e(G g10) {
        return net.minecraft.u.E.cG;
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.f).a(8.0);
        this.a(net.minecraft.U.M.d).a(0.25);
        this.a(net.minecraft.U.M.g).a(1.0);
    }

    @Override
    protected d q() {
        return net.minecraft.u.E.eK;
    }

    @Override
    public net.minecraft.U.g ag() {
        return net.minecraft.U.g.ARTHROPOD;
    }

    @Override
    protected d aI() {
        return net.minecraft.u.E.hf;
    }

    @Override
    protected boolean b() {
        return true;
    }

    @Override
    public float l() {
        return 0.1f;
    }

    @Override
    public boolean C() {
        int[] arrn = net.minecraft.T.S.f();
        boolean bl2 = super.C();
        if (arrn != null) {
            if (bl2) {
                j j2 = this.aG.b((x)this, 5.0);
                return j2 == null;
            }
            bl2 = false;
        }
        return bl2;
    }

    public a3(z z2) {
        super(z2);
        this.c(0.4f, 0.3f);
    }

    @Override
    public void ae() {
        this.bf = this.e;
        super.ae();
    }

    @Override
    protected void a(n n2, K k2) {
        this.a(net.minecraft.u.E.eg, 0.15f, 1.0f);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public float b(n n2) {
        int[] arrn = net.minecraft.T.S.f();
        a3 a32 = this;
        if (arrn != null) {
            if (a32.aG.d(n2.k()).b() == net.minecraft.u.g.bx) {
                return 10.0f;
            }
            a32 = this;
        }
        float f10 = super.b(n2);
        return f10;
    }
}

