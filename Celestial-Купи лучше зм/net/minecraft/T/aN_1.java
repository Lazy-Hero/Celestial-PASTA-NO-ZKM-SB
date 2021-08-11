/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.B.X;
import net.minecraft.T.S;
import net.minecraft.T.a4;
import net.minecraft.T.r;
import net.minecraft.T.u;
import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.M;
import net.minecraft.U.x;
import net.minecraft.ah.e;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.a3;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.i.j;
import net.minecraft.j.f;
import net.minecraft.u.E;
import net.minecraft.u.h;
import net.minecraft.w.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aN
extends a4 {
    private static final /* synthetic */ f cL;
    private /* synthetic */ int cH;
    private static final /* synthetic */ UUID cI;
    private /* synthetic */ int cK;
    private /* synthetic */ UUID cJ;

    @Override
    protected void h() {
        aN aN2;
        block21: {
            block22: {
                int n2;
                int[] arrn;
                block19: {
                    block20: {
                        block18: {
                            block17: {
                                net.minecraft.j.b b10;
                                block12: {
                                    block13: {
                                        aN aN3;
                                        block14: {
                                            block15: {
                                                f f10;
                                                net.minecraft.j.b b11;
                                                block16: {
                                                    b10 = this.a(net.minecraft.U.M.d);
                                                    arrn = net.minecraft.T.S.f();
                                                    n2 = this.z();
                                                    if (arrn == null) break block12;
                                                    if (n2 == 0) break block13;
                                                    aN3 = this;
                                                    if (arrn == null) break block14;
                                                    if (aN3.Q()) break block15;
                                                    b11 = b10;
                                                    f10 = cL;
                                                    if (arrn == null) break block16;
                                                    if (b11.c(f10)) break block15;
                                                    b11 = b10;
                                                    f10 = cL;
                                                }
                                                b11.b(f10);
                                            }
                                            aN3 = this;
                                        }
                                        --aN3.cK;
                                        if (arrn != null) break block17;
                                    }
                                    n2 = b10.c(cL);
                                }
                                if (arrn == null) break block18;
                                if (n2 != 0) {
                                    b10.a(cL);
                                }
                            }
                            n2 = this.cH;
                        }
                        if (arrn == null) break block19;
                        if (n2 <= 0) break block20;
                        n2 = this.cH = this.cH - 1;
                        if (arrn == null) break block19;
                        if (n2 == 0) {
                            this.a(net.minecraft.u.E.gC, this.x() * 2.0f, ((this.g.nextFloat() - this.g.nextFloat()) * 0.2f + 1.0f) * 1.8f);
                        }
                    }
                    aN2 = this;
                    if (arrn == null) break block21;
                    n2 = aN2.cK;
                }
                if (n2 <= 0) break block22;
                aN2 = this;
                if (arrn == null) break block21;
                if (aN2.cJ == null) break block22;
                aN2 = this;
                if (arrn == null) break block21;
                if (aN2.aA() == null) {
                    j j2 = this.aG.a(this.cJ);
                    this.c((B)j2);
                    this.bP = j2;
                    this.bM = this.Z();
                }
            }
            aN2 = this;
        }
        super.h();
    }

    @Override
    public void a(net.minecraft.P.r r2) {
        block3: {
            block4: {
                int[] arrn;
                block2: {
                    super.a(r2);
                    this.cK = r2.q("Anger");
                    arrn = net.minecraft.T.S.f();
                    String string = r2.j("HurtBy");
                    if (arrn == null) break block2;
                    if (string.isEmpty()) break block3;
                    this.cJ = UUID.fromString(string);
                }
                j j2 = this.aG.a(this.cJ);
                this.c((B)j2);
                if (arrn == null) break block4;
                if (j2 == null) break block3;
                this.bP = j2;
            }
            this.bM = this.Z();
        }
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.H;
    }

    public boolean z() {
        int[] arrn = net.minecraft.T.S.f();
        boolean bl2 = this.cK;
        if (arrn != null) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    @Override
    public boolean a(G g10, float f10) {
        int[] arrn = net.minecraft.T.S.f();
        x x2 = this;
        if (arrn != null) {
            if (x2.a(g10)) {
                return false;
            }
            x2 = g10.h();
        }
        aN aN2 = x2;
        boolean bl2 = aN2 instanceof j;
        if (arrn != null) {
            if (bl2) {
                this.a((x)aN2);
            }
            bl2 = super.a(g10, f10);
        }
        return bl2;
    }

    @Override
    protected net.minecraft.ar.d e(G g10) {
        return net.minecraft.u.E.b9;
    }

    @Override
    protected d R() {
        return net.minecraft.w.d.m;
    }

    @Override
    public void c(@Nullable B b10) {
        block3: {
            B b11;
            block2: {
                int[] arrn = net.minecraft.T.S.f();
                aN aN2 = this;
                b11 = b10;
                if (arrn == null) break block2;
                super.c(b11);
                if (b10 == null) break block3;
                aN2 = this;
                b11 = b10;
            }
            aN2.cJ = b11.u();
        }
    }

    @Override
    public void f(net.minecraft.P.r r2) {
        block4: {
            String string;
            net.minecraft.P.r r3;
            block2: {
                block3: {
                    int[] arrn = net.minecraft.T.S.f();
                    super.f(r2);
                    int[] arrn2 = arrn;
                    r3 = r2;
                    string = "Anger";
                    if (arrn2 == null) break block2;
                    r3.a(string, (short)this.cK);
                    if (this.cJ == null) break block3;
                    r2.a("HurtBy", this.cJ.toString());
                    if (arrn2 != null) break block4;
                }
                r3 = r2;
                string = "HurtBy";
            }
            r3.a(string, "");
        }
    }

    @Override
    protected void b(net.minecraft.ah.h h2) {
        this.a(net.minecraft.B.X.MAINHAND, new d(h.X));
    }

    private void a(x x2) {
        block3: {
            B b10;
            aN aN2;
            block2: {
                this.cK = 400 + this.g.nextInt(400);
                int[] arrn = net.minecraft.T.S.f();
                aN2 = this;
                b10 = this;
                if (arrn == null) break block2;
                aN2.cH = b10.g.nextInt(40);
                if (!(x2 instanceof B)) break block3;
                aN2 = this;
                b10 = (B)x2;
            }
            aN2.c(b10);
        }
    }

    @Override
    protected net.minecraft.ar.d q() {
        return net.minecraft.u.E.hN;
    }

    public static void c(b b10) {
        C.a(b10, aN.class);
    }

    @Override
    protected void P() {
        this.ci.a(1, new r(this));
        this.ci.a(2, new u(this));
    }

    static void a(aN aN2, x x2) {
        aN2.a(x2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void D() {
        super.D();
        this.a(cD).a(0.0);
        this.a(net.minecraft.U.M.d).a(0.23f);
        this.a(net.minecraft.U.M.g).a(5.0);
    }

    @Override
    public boolean C() {
        return this.aG.g() != net.minecraft.ah.e.PEACEFUL;
    }

    @Override
    protected net.minecraft.ar.d aI() {
        return net.minecraft.u.E.g3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean u() {
        int[] arrn = net.minecraft.T.S.f();
        boolean bl2 = this.aG.a(this.m(), this);
        if (arrn != null) {
            if (!bl2) return false;
            bl2 = this.aG.a((x)this, this.m()).isEmpty();
        }
        if (arrn != null) {
            if (!bl2) return false;
            bl2 = this.aG.a(this.m());
        }
        if (arrn == null) return bl2;
        if (bl2) return false;
        return true;
    }

    public aN(z z2) {
        super(z2);
        this.al = true;
    }

    @Override
    public boolean b(j j2, a3 a32) {
        return false;
    }

    static {
        cI = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
        cL = new f(cI, "Attacking speed boost", 0.05, 0).a(false);
    }

    @Override
    public boolean c(j j2) {
        return this.z();
    }
}

