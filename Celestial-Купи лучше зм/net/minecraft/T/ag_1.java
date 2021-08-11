/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.T.S;
import net.minecraft.T.a4;
import net.minecraft.U.C;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.a6;
import net.minecraft.ag.W;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.a3;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.i.j;
import net.minecraft.i.k;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.q.m;
import net.minecraft.u.E;
import net.minecraft.u.c;
import net.minecraft.u.g;
import net.minecraft.u.h;
import net.minecraft.w.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ag
extends a4 {
    private static final /* synthetic */ net.minecraft.q.r<Integer> cH;
    private /* synthetic */ UUID cJ;
    private /* synthetic */ int cI;
    private static final /* synthetic */ net.minecraft.q.r<Boolean> cK;

    protected int A() {
        float f10;
        block10: {
            int n2;
            block11: {
                n2 = 1;
                int[] arrn = net.minecraft.T.S.f();
                float f11 = this.g.nextFloat() - 0.01f;
                f10 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                if (arrn == null) break block10;
                if (f10 >= 0) break block11;
                int n3 = 0;
                o o2 = new o();
                int n4 = (int)this.a - 4;
                block0: while (true) {
                    int n5 = n4;
                    int n6 = (int)this.a + 4;
                    block1: while (n5 < n6) {
                        f10 = n3;
                        if (arrn == null || arrn == null) break block10;
                        if (f10 >= 14) break block0;
                        int n7 = (int)this.aF - 4;
                        block2: while (true) {
                            int n8 = n7;
                            int n9 = (int)this.aF + 4;
                            block3: while (n8 < n9) {
                                n5 = n3;
                                n6 = 14;
                                if (arrn == null) continue block1;
                                if (arrn != null) {
                                    if (n5 >= n6) break block2;
                                    int n10 = (int)this.ax;
                                    int n11 = 4;
                                }
                                for (void var7_7 = (v1688348) - (v1688349); var7_7 < (int)this.ax + 4; ++var7_7) {
                                    block13: {
                                        K k2;
                                        K k3;
                                        block12: {
                                            K k4;
                                            n8 = n3;
                                            n9 = 14;
                                            if (arrn == null) continue block3;
                                            if (n8 >= n9) break;
                                            k3 = k4 = this.aG.d(o2.a(n4, n7, (int)var7_7)).b();
                                            k2 = net.minecraft.u.g.dd;
                                            if (arrn == null) break block12;
                                            if (k3 == k2) break block13;
                                            k3 = k4;
                                            k2 = net.minecraft.u.g.R;
                                        }
                                        if (k3 != k2) continue;
                                    }
                                    if (this.g.nextFloat() < 0.3f) {
                                        ++n2;
                                    }
                                    ++n3;
                                    if (arrn != null) continue;
                                }
                                ++n7;
                                if (arrn != null) continue block2;
                            }
                            break;
                        }
                        ++n4;
                        if (arrn != null) continue block0;
                    }
                    break;
                }
            }
            f10 = n2;
        }
        return (int)f10;
    }

    @Override
    protected d R() {
        return net.minecraft.w.d.m;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(r var1_1) {
        v0 = net.minecraft.T.S.f();
        super.a(var1_1);
        this.a(var1_1.m("Profession"));
        var2_2 = v0;
        v1 = var1_1.a("ConversionTime", 99);
        if (var2_2 != null) {
            if (v1 == 0) return;
            v1 = var1_1.m("ConversionTime");
        }
        if (v1 <= -1) return;
        v2 = var1_1;
        v3 = "ConversionPlayer";
        if (var2_2 == null) ** GOTO lbl16
        if (v2.p(v3)) {
            v2 = var1_1;
            v3 = "ConversionPlayer";
lbl16:
            // 2 sources

            v4 = v2.l(v3);
        } else {
            v4 = null;
        }
        this.a(v4, var1_1.m("ConversionTime"));
    }

    @Override
    public net.minecraft.ar.d e(G g10) {
        return net.minecraft.u.E.co;
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(cK, false);
        this.ap.c(cH, 0);
    }

    public void a(int n2) {
        this.ap.b(cH, n2);
    }

    @Override
    public void ae() {
        ag ag2;
        block4: {
            block5: {
                int[] arrn = net.minecraft.T.S.f();
                ag2 = this;
                if (arrn == null) break block4;
                if (ag2.aG.C) break block5;
                ag2 = this;
                if (arrn == null) break block4;
                if (!ag2.z()) break block5;
                int n2 = this.A();
                this.cI -= n2;
                ag2 = this;
                if (arrn == null) break block4;
                if (ag2.cI <= 0) {
                    this.Q();
                }
            }
            ag2 = this;
        }
        super.ae();
    }

    @Override
    public net.minecraft.ar.d Q() {
        return net.minecraft.u.E.cO;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int a() {
        return Math.max(this.ap.b(cH) % 6, 0);
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.aC;
    }

    @Override
    public net.minecraft.ar.d q() {
        return net.minecraft.u.E.m;
    }

    @Override
    public void f(r r2) {
        block1: {
            int[] arrn = net.minecraft.T.S.f();
            super.f(r2);
            int[] arrn2 = arrn;
            r2.b("Profession", this.a());
            int n2 = this.z();
            if (arrn2 != null) {
                n2 = n2 != 0 ? this.cI : -1;
            }
            r2.b("ConversionTime", n2);
            if (this.cJ == null) break block1;
            r2.a("ConversionPlayer", this.cJ);
        }
    }

    protected void a(@Nullable UUID uUID, int n2) {
        this.cJ = uUID;
        this.cI = n2;
        this.E().b(cK, true);
        this.d(c.d);
        this.b(new net.minecraft.K.j(c.e, n2, Math.min(this.aG.g().a() - 1, 0)));
        this.aG.a((x)this, (byte)16);
    }

    public static void c(b b10) {
        C.a(b10, ag.class);
    }

    protected void Q() {
        block10: {
            ag ag2;
            block8: {
                W w2;
                block9: {
                    w2 = new W(this.aG);
                    int[] arrn = net.minecraft.T.S.f();
                    w2.p(this);
                    w2.a(this.a());
                    w2.a(this.aG.h(new n(w2)), null, false);
                    w2.Q();
                    boolean bl2 = this.Q();
                    if (arrn != null) {
                        if (bl2) {
                            w2.l(-24000);
                        }
                        this.aG.c(this);
                        w2.m(this.T());
                        bl2 = this.g();
                    }
                    if (arrn != null) {
                        if (bl2) {
                            w2.a(this.aB());
                            w2.b(this.i());
                        }
                        bl2 = this.aG.f(w2);
                    }
                    ag2 = this;
                    if (arrn == null) break block8;
                    if (ag2.cJ == null) break block9;
                    j j2 = this.aG.a(this.cJ);
                    if (arrn == null) break block10;
                    if (j2 instanceof k) {
                        a6.a.a((k)j2, this, w2);
                    }
                }
                w2.b(new net.minecraft.K.j(c.s, 200, 0));
                ag2 = this;
            }
            ag2.aG.a(null, 1027, new n((int)this.a, (int)this.aF, (int)this.ax), 0);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected float p() {
        float f10;
        int[] arrn = net.minecraft.T.S.f();
        ag ag2 = this;
        if (arrn != null) {
            if (ag2.Q()) {
                f10 = (this.g.nextFloat() - this.g.nextFloat()) * 0.2f + 2.0f;
                return f10;
            }
            ag2 = this;
        }
        f10 = (ag2.g.nextFloat() - this.g.nextFloat()) * 0.2f + 1.0f;
        return f10;
    }

    static {
        cK = net.minecraft.q.m.a(ag.class, net.minecraft.q.h.g);
        cH = net.minecraft.q.m.a(ag.class, net.minecraft.q.h.n);
    }

    @Override
    protected boolean k() {
        int[] arrn = net.minecraft.T.S.f();
        boolean bl2 = this.z();
        if (arrn != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    @Override
    public void a(byte by2) {
        block5: {
            block3: {
                ag ag2;
                int[] arrn;
                block4: {
                    byte by3;
                    block2: {
                        arrn = net.minecraft.T.S.f();
                        by3 = by2;
                        if (arrn == null) break block2;
                        if (by3 != 16) break block3;
                        ag2 = this;
                        if (arrn == null) break block4;
                        by3 = (byte)(ag2.aR() ? 1 : 0);
                    }
                    if (by3 != 0) break block5;
                    ag2 = this;
                }
                ag2.aG.a(this.a + 0.5, this.aF + 0.5, this.ax + 0.5, net.minecraft.u.E.hd, this.ad(), 1.0f + this.g.nextFloat(), this.g.nextFloat() * 0.7f + 0.3f, false);
                if (arrn != null) break block5;
            }
            super.a(by2);
        }
    }

    public ag(z z2) {
        super(z2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(j j2, a3 a32) {
        d d10 = j2.c(a32);
        int[] arrn = net.minecraft.T.S.f();
        d d11 = d10;
        if (arrn != null) {
            if (d11.w() != h.bt) return false;
            d11 = d10;
        }
        boolean bl2 = d11.d();
        if (arrn == null) return bl2;
        if (bl2) return false;
        bl2 = this.c(c.d);
        if (arrn == null) return bl2;
        if (!bl2) return false;
        boolean bl3 = j2.cw.g;
        if (arrn != null) {
            if (!bl3) {
                d10.b(1);
            }
            bl3 = this.aG.C;
        }
        if (arrn == null) return bl3;
        if (bl3) return true;
        this.a(j2.u(), this.g.nextInt(2401) + 3600);
        return true;
    }

    @Override
    public net.minecraft.ar.d aI() {
        return net.minecraft.u.E.ge;
    }

    public boolean z() {
        return this.E().b(cK);
    }

    @Override
    @Nullable
    public net.minecraft.U.j a(net.minecraft.ah.h h2, @Nullable net.minecraft.U.j j2) {
        this.a(this.aG.J.nextInt(6));
        return super.a(h2, j2);
    }
}

