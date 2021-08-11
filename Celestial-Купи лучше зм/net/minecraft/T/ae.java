/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.k;
import net.minecraft.U.B;
import net.minecraft.U.D;
import net.minecraft.U.M;
import net.minecraft.U.x;
import net.minecraft.ah.c;
import net.minecraft.ah.e;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.ay;
import net.minecraft.ax.T;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.u.E;
import net.minecraft.w.am;
import net.minecraft.w.d;

public abstract class ae
extends D
implements k {
    private static /* synthetic */ m[] cw;

    public static void b(m[] arrm) {
        cw = arrm;
    }

    @Override
    protected net.minecraft.ar.d a(int n2) {
        return n2 > 4 ? net.minecraft.u.E.hj : net.minecraft.u.E.fo;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(G g10, float f10) {
        int[] arrn = net.minecraft.T.S.f();
        boolean bl2 = this.a(g10);
        if (arrn != null) {
            if (bl2) return false;
            bl2 = super.a(g10, f10);
        }
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    protected boolean j() {
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean j(x var1_1) {
        block13: {
            block22: {
                block18: {
                    block21: {
                        block20: {
                            block19: {
                                block17: {
                                    block16: {
                                        block14: {
                                            block15: {
                                                var3_2 = (float)this.a(net.minecraft.U.M.g).d();
                                                var4_3 = 0;
                                                var2_4 = net.minecraft.T.S.f();
                                                v0 = var1_1 instanceof B;
                                                if (var2_4 != null) {
                                                    if (v0) {
                                                        var3_2 += net.minecraft.ax.T.a(this.av(), ((B)var1_1).ag());
                                                        var4_3 += net.minecraft.ax.T.c(this);
                                                    }
                                                    v0 = var1_1.a(net.minecraft.ar.G.a(this), var3_2);
                                                }
                                                v1 = var5_5 = v0;
                                                if (var2_4 == null) return v1;
                                                if (!v1) break block13;
                                                v2 = var4_3;
                                                if (var2_4 == null) break block14;
                                                if (v2 <= 0) break block15;
                                                v2 = var1_1 instanceof B;
                                                if (var2_4 == null) break block14;
                                                if (v2 != 0) {
                                                    ((B)var1_1).a(this, (float)var4_3 * 0.5f, (double)h.g(this.e * 0.017453292f), (double)(-h.c(this.e * 0.017453292f)));
                                                    this.aq *= 0.6;
                                                    this.d *= 0.6;
                                                }
                                            }
                                            v2 = net.minecraft.ax.T.f(this);
                                        }
                                        v3 = var6_6 = v2;
                                        if (var2_4 == null) break block16;
                                        if (v3 > 0) {
                                            var1_1.h(var6_6 * 4);
                                        }
                                        v4 = var1_1;
                                        if (var2_4 == null) break block17;
                                        v3 = v4 instanceof j;
                                    }
                                    if (v3 == 0) break block18;
                                    v4 = var1_1;
                                }
                                var7_7 = (j)v4;
                                var8_8 = this.av();
                                v5 = var7_7;
                                if (var2_4 == null) ** GOTO lbl42
                                if (v5.aq()) {
                                    v5 = var7_7;
lbl42:
                                    // 2 sources

                                    v6 = v5.a();
                                } else {
                                    v6 = net.minecraft.w.d.m;
                                }
                                var9_9 = v6;
                                v7 = var8_8.G();
                                if (var2_4 == null) break block19;
                                if (v7) break block18;
                                v7 = var9_9.G();
                            }
                            if (var2_4 == null) break block20;
                            if (v7) break block18;
                            v8 = var8_8.w();
                            if (var2_4 == null) break block21;
                            v7 = v8 instanceof am;
                        }
                        if (!v7) break block18;
                        v8 = var9_9.w();
                    }
                    if (v8 != net.minecraft.u.h.cq) break block18;
                    var10_10 = 0.25f + (float)net.minecraft.ax.T.e(this) * 0.05f;
                    v9 = this;
                    if (var2_4 == null) break block22;
                    if (v9.g.nextFloat() < var10_10) {
                        var7_7.o().b(net.minecraft.u.h.cq, 100);
                        this.aG.a((x)var7_7, (byte)30);
                    }
                }
                v9 = this;
            }
            v9.a(this, var1_1);
        }
        v1 = var5_5;
        return v1;
    }

    @Override
    protected net.minecraft.ar.d e(G g10) {
        return net.minecraft.u.E.f9;
    }

    @Override
    public void E() {
        int[] arrn = net.minecraft.T.S.f();
        this.aE();
        int[] arrn2 = arrn;
        float f10 = this.S();
        if (arrn2 != null) {
            if (f10 > 0.5f) {
                this.a8 += 2;
            }
            super.E();
        }
    }

    @Override
    protected void D() {
        super.D();
        this.ao().b(net.minecraft.U.M.g);
    }

    @Override
    public ay ad() {
        return ay.HOSTILE;
    }

    public boolean c(j j2) {
        return true;
    }

    protected boolean b() {
        n n2 = new n(this.a, this.m().b, this.ax);
        int[] arrn = net.minecraft.T.S.f();
        int n3 = this.aG.a(c.SKY, n2);
        if (arrn != null) {
            if (n3 > this.g.nextInt(32)) {
                return false;
            }
            n3 = this.aG.s(n2);
        }
        int n4 = n3;
        int n5 = this.aG.u();
        if (arrn != null) {
            if (n5 != 0) {
                int n6 = this.aG.Q();
                this.aG.d(10);
                n4 = this.aG.s(n2);
                this.aG.d(n6);
            }
            n5 = n4;
        }
        if (arrn != null) {
            n5 = n5 <= this.g.nextInt(8) ? 1 : 0;
        }
        return n5 != 0;
    }

    @Override
    protected net.minecraft.ar.d aI() {
        return net.minecraft.u.E.ek;
    }

    static {
        if (net.minecraft.T.ae.c() != null) {
            net.minecraft.T.ae.b(new m[2]);
        }
    }

    private static gP c(gP gP2) {
        return gP2;
    }

    @Override
    public float b(n n2) {
        return 0.5f - this.aG.k(n2);
    }

    public static m[] c() {
        return cw;
    }

    public ae(z z2) {
        super(z2);
        this.ch = 5;
    }

    @Override
    protected net.minecraft.ar.d H() {
        return net.minecraft.u.E.h;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean C() {
        int[] arrn = net.minecraft.T.S.f();
        ae ae2 = this;
        if (arrn != null) {
            if (ae2.aG.g() == net.minecraft.ah.e.PEACEFUL) return false;
            ae2 = this;
        }
        boolean bl2 = ae2.b();
        if (arrn != null) {
            if (!bl2) return false;
            bl2 = super.C();
        }
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public void ae() {
        block3: {
            ae ae2;
            block4: {
                z z2;
                block2: {
                    int[] arrn = net.minecraft.T.S.f();
                    super.ae();
                    int[] arrn2 = arrn;
                    z2 = this.aG;
                    if (arrn2 == null) break block2;
                    if (z2.C) break block3;
                    ae2 = this;
                    if (arrn2 == null) break block4;
                    z2 = ae2.aG;
                }
                if (z2.g() != net.minecraft.ah.e.PEACEFUL) break block3;
                ae2 = this;
            }
            ae2.a();
        }
    }

    @Override
    protected net.minecraft.ar.d x() {
        return net.minecraft.u.E.bt;
    }
}

