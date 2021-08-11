/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 */
package net.minecraft.ag;

import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.B.X;
import net.minecraft.P.r;
import net.minecraft.T.aN;
import net.minecraft.U.B;
import net.minecraft.U.D;
import net.minecraft.U.E;
import net.minecraft.U.M;
import net.minecraft.U.x;
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
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.q.m;
import net.minecraft.w.d;
import net.minecraft.w.k;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class O
extends C {
    private /* synthetic */ int cL;
    private static final /* synthetic */ Set<k> cK;
    private static final /* synthetic */ net.minecraft.q.r<Boolean> cM;
    private /* synthetic */ boolean cI;
    private /* synthetic */ int cH;
    private static final /* synthetic */ net.minecraft.q.r<Integer> cJ;

    @Override
    protected void H() {
        this.b5.a(0, new W(this));
        this.b5.a(1, new P(this, 1.25));
        this.b5.a(3, new net.minecraft.ak.G(this, 1.0));
        this.b5.a(4, new al((D)this, 1.2, net.minecraft.u.h.bW, false));
        this.b5.a(4, new al((D)this, 1.2, false, cK));
        this.b5.a(5, new net.minecraft.ak.A(this, 1.1));
        this.b5.a(6, new aA(this, 1.0));
        this.b5.a(7, new aa(this, j.class, 6.0f));
        this.b5.a(8, new F(this));
    }

    public O(z z2) {
        super(z2);
        this.c(0.9f, 0.9f);
    }

    @Override
    public void a(G g10) {
        block3: {
            O o2;
            block4: {
                boolean bl2;
                block2: {
                    String[] arrstring = net.minecraft.ag.A.b();
                    super.a(g10);
                    String[] arrstring2 = arrstring;
                    bl2 = this.aG.C;
                    if (arrstring2 == null) break block2;
                    if (bl2) break block3;
                    o2 = this;
                    if (arrstring2 == null) break block4;
                    bl2 = o2.b();
                }
                if (!bl2) break block3;
                o2 = this;
            }
            o2.a(net.minecraft.u.h.be, 1);
        }
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.aD;
    }

    @Override
    public boolean a(d d10) {
        return cK.contains(d10.w());
    }

    @Override
    public void a(net.minecraft.an.b b10) {
        block7: {
            boolean bl2;
            String[] arrstring;
            block6: {
                arrstring = net.minecraft.ag.A.b();
                bl2 = this.aG.C;
                if (arrstring == null) break block6;
                if (bl2) break block7;
                bl2 = this.P;
            }
            if (!bl2) {
                aN aN2 = new aN(this.aG);
                aN2.a(net.minecraft.B.X.MAINHAND, new d(net.minecraft.u.h.X));
                aN2.c(this.a, this.aF, this.ax, this.e, this.at);
                aN2.m(this.T());
                boolean bl3 = this.g();
                if (arrstring != null) {
                    if (bl3) {
                        aN2.a(this.aB());
                        aN2.b(this.i());
                    }
                    bl3 = this.aG.f(aN2);
                }
                this.a();
            }
        }
    }

    public boolean b() {
        return this.ap.b(cM);
    }

    public static void b(b b10) {
        net.minecraft.U.C.a(b10, O.class);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(float var1_1, float var2_2, float var3_3) {
        block10: {
            block11: {
                block16: {
                    block14: {
                        block15: {
                            block12: {
                                block13: {
                                    var4_4 = net.minecraft.ag.A.b();
                                    v0 = this.j();
                                    if (var4_4 == null) ** GOTO lbl8
                                    if (v0.isEmpty()) {
                                        v1 = null;
                                    } else {
                                        v0 = this.j().get(0);
lbl8:
                                        // 2 sources

                                        v1 = (x)v0;
                                    }
                                    var5_5 = v1;
                                    v2 = this;
                                    if (var4_4 == null) break block10;
                                    if (!v2.aU()) break block11;
                                    v2 = this;
                                    if (var4_4 == null) break block10;
                                    if (!v2.K()) break block11;
                                    this.ak = this.e = var5_5.e;
                                    this.at = var5_5.at * 0.5f;
                                    this.e(this.e, this.at);
                                    this.bf = this.e;
                                    this.a1 = this.e;
                                    this.aI = 1.0f;
                                    this.a_ = this.aa() * 0.1f;
                                    v3 = this.cI;
                                    if (var4_4 == null) break block12;
                                    if (v3 == 0) break block13;
                                    v4 = this.cL;
                                    v3 = v4;
                                    this.cL = v4 + 1;
                                    if (var4_4 == null) break block12;
                                    if (v3 > this.cH) {
                                        this.cI = false;
                                    }
                                }
                                v5 = this;
                                if (var4_4 == null) break block14;
                                v3 = v5.a1();
                            }
                            if (v3 == 0) break block15;
                            var6_6 = (float)this.a(net.minecraft.U.M.d).d() * 0.225f;
                            v6 = this;
                            if (var4_4 != null) {
                                if (v6.cI) {
                                    var6_6 += var6_6 * 1.15f * h.g((float)this.cL / (float)this.cH * 3.1415927f);
                                }
                                this.g(var6_6);
                                v6 = this;
                            }
                            super.a(0.0f, 0.0f, 1.0f);
                            if (var4_4 != null) break block16;
                        }
                        this.aq = 0.0;
                        this.G = 0.0;
                        v5 = this;
                    }
                    v5.d = 0.0;
                }
                this.bR = this.a3;
                var6_7 = this.a - this.N;
                var8_8 = this.ax - this.k;
                var10_9 = h.e(var6_7 * var6_7 + var8_8 * var8_8) * 4.0f;
                if (var4_4 != null) {
                    if (var10_9 > 1.0f) {
                        var10_9 = 1.0f;
                    }
                    this.a3 += (var10_9 - this.a3) * 0.4f;
                    this.bK += this.a3;
                }
                if (var4_4 != null) return;
            }
            this.aI = 0.5f;
            this.a_ = 0.02f;
            v2 = this;
        }
        super.a(var1_1, var2_2, var3_3);
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.f).a(10.0);
        this.a(net.minecraft.U.M.d).a(0.25);
    }

    static {
        cM = net.minecraft.q.m.a(O.class, net.minecraft.q.h.g);
        cJ = net.minecraft.q.m.a(O.class, net.minecraft.q.h.n);
        cK = Sets.newHashSet((Object[])new k[]{net.minecraft.u.h.aG, net.minecraft.u.h.f, net.minecraft.u.h.b});
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(cM, false);
        this.ap.c(cJ, 0);
    }

    @Override
    public O a(E e10) {
        return new O(this.aG);
    }

    @Override
    protected net.minecraft.ar.d aI() {
        return net.minecraft.u.E.fY;
    }

    @Override
    public void f(r r2) {
        super.f(r2);
        r2.a("Saddle", this.b());
    }

    @Override
    public boolean b(j j2, a3 a32) {
        boolean bl2;
        block11: {
            block12: {
                block19: {
                    d d10;
                    block18: {
                        d d11;
                        String[] arrstring;
                        block16: {
                            boolean bl3;
                            block17: {
                                block15: {
                                    block14: {
                                        d d12;
                                        block13: {
                                            arrstring = net.minecraft.ag.A.b();
                                            bl2 = super.b(j2, a32);
                                            if (arrstring == null) break block11;
                                            if (bl2) break block12;
                                            d12 = d11 = j2.c(a32);
                                            if (arrstring == null) break block13;
                                            if (d12.w() != net.minecraft.u.h.bc) break block14;
                                            d12 = d11;
                                        }
                                        d12.a(j2, (B)this, a32);
                                        return true;
                                    }
                                    bl3 = this.b();
                                    if (arrstring == null) break block15;
                                    if (!bl3) break block16;
                                    bl3 = this.aU();
                                }
                                if (arrstring == null) break block17;
                                if (bl3) break block16;
                                bl3 = this.aG.C;
                            }
                            if (arrstring != null) {
                                if (!bl3) {
                                    j2.h(this);
                                }
                                bl3 = true;
                            }
                            return bl3;
                        }
                        d10 = d11;
                        if (arrstring == null) break block18;
                        if (d10.w() != net.minecraft.u.h.be) break block19;
                        d10 = d11;
                    }
                    d10.a(j2, (B)this, a32);
                    return true;
                }
                return false;
            }
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public void a(net.minecraft.q.r<?> r2) {
        block4: {
            O o2;
            block6: {
                block5: {
                    String[] arrstring = net.minecraft.ag.A.b();
                    if (arrstring == null) break block4;
                    if (!cJ.equals(r2)) break block5;
                    o2 = this;
                    if (arrstring == null) break block6;
                    if (o2.aG.C) {
                        this.cI = true;
                        this.cL = 0;
                        this.cH = this.ap.b(cJ);
                    }
                }
                o2 = this;
            }
            super.a(r2);
        }
    }

    public void a(boolean bl2) {
        block2: {
            block1: {
                String[] arrstring;
                block0: {
                    arrstring = net.minecraft.ag.A.b();
                    if (arrstring == null) break block0;
                    if (!bl2) break block1;
                    this.ap.b(cM, true);
                }
                if (arrstring != null) break block2;
            }
            this.ap.b(cM, false);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    @Nullable
    public x af() {
        String[] arrstring = net.minecraft.ag.A.b();
        Object object = this.j();
        if (arrstring != null) {
            if (object.isEmpty()) {
                return null;
            }
            object = this.j().get(0);
        }
        x x2 = (x)object;
        return x2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean K() {
        x x2 = this.af();
        String[] arrstring = net.minecraft.ag.A.b();
        x x3 = x2;
        if (arrstring != null) {
            if (!(x3 instanceof j)) {
                return false;
            }
            x3 = x2;
        }
        j j2 = (j)x3;
        k k2 = j2.av().w();
        k k3 = net.minecraft.u.h.bW;
        if (arrstring != null) {
            if (k2 == k3) return true;
            k2 = j2.b().w();
            k3 = net.minecraft.u.h.bW;
        }
        if (k2 != k3) return false;
        return true;
    }

    @Override
    protected void a(n n2, K k2) {
        this.a(net.minecraft.u.E.gt, 0.15f, 1.0f);
    }

    @Override
    protected net.minecraft.ar.d e(G g10) {
        return net.minecraft.u.E.fn;
    }

    @Override
    protected net.minecraft.ar.d q() {
        return net.minecraft.u.E.s;
    }

    public boolean D() {
        String[] arrstring = net.minecraft.ag.A.b();
        boolean bl2 = this.cI;
        if (arrstring != null) {
            if (bl2) {
                return false;
            }
            this.cI = true;
            this.cL = 0;
            this.cH = this.f().nextInt(841) + 140;
            this.E().b(cJ, this.cH);
            bl2 = true;
        }
        return bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(r r2) {
        super.a(r2);
        this.a(r2.f("Saddle"));
    }
}

