/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ag;

import java.util.Calendar;
import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.U.C;
import net.minecraft.U.M;
import net.minecraft.U.x;
import net.minecraft.Z.i;
import net.minecraft.ag.A;
import net.minecraft.ag.X;
import net.minecraft.ah.z;
import net.minecraft.aj.j;
import net.minecraft.ar.G;
import net.minecraft.ar.d;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.q.m;
import net.minecraft.u.E;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Y
extends X {
    private static final /* synthetic */ net.minecraft.q.r<Byte> cq;
    private /* synthetic */ n cr;

    @Override
    protected void a(double d10, boolean bl2, i i2, n n2) {
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(cq, (byte)0);
    }

    public boolean b() {
        String[] arrstring = net.minecraft.ag.A.b();
        boolean bl2 = this.ap.b(cq) & 1;
        if (arrstring != null) {
            bl2 = bl2;
        }
        return bl2;
    }

    @Override
    public boolean aC() {
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(Calendar calendar) {
        String[] arrstring = net.minecraft.ag.A.b();
        int n2 = calendar.get(2) + 1;
        int n3 = 10;
        if (arrstring != null) {
            if (n2 == n3) {
                n2 = calendar.get(5);
                if (arrstring == null) return n2 != 0;
                if (n2 >= 20) return 1 != 0;
            }
            n2 = calendar.get(2) + 1;
            n3 = 11;
        }
        if (arrstring != null) {
            if (n2 != n3) return 0 != 0;
            n2 = calendar.get(5);
            if (arrstring == null) return n2 != 0;
            n3 = 3;
        }
        if (n2 > n3) return 0 != 0;
        return 1 != 0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean C() {
        var2_1 = new n(this.a, this.m().b, this.ax);
        var1_2 = net.minecraft.ag.A.b();
        v0 = var2_1.b();
        if (var1_2 != null) {
            if (v0 >= this.aG.y()) {
                return false;
            }
            v0 = this.aG.s(var2_1);
        }
        var3_3 = v0;
        var4_4 = 4;
        v1 = this.a(this.aG.F());
        if (var1_2 == null) ** GOTO lbl16
        if (v1 == 0) ** GOTO lbl-1000
        var4_4 = 7;
        if (var1_2 == null) lbl-1000:
        // 2 sources

        {
            v1 = this.g.nextBoolean();
lbl16:
            // 2 sources

            if (var1_2 != null) {
                if (v1 != 0) {
                    return false;
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v1 = var3_3;
        }
        if (var1_2 != null) {
            if (v1 > this.g.nextInt(var4_4)) return (boolean)0;
            v1 = super.C() ? 1 : 0;
        }
        if (var1_2 == null) return (boolean)v1;
        if (v1 == 0) return (boolean)0;
        return (boolean)1;
    }

    @Override
    protected void d(x x2) {
    }

    public Y(z z2) {
        super(z2);
        this.c(0.5f, 0.9f);
        this.a(true);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        cq = net.minecraft.q.m.a(Y.class, net.minecraft.q.h.m);
    }

    @Override
    protected void af() {
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.f).a(6.0);
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.ab;
    }

    @Override
    public void d(float f10, float f11) {
    }

    @Override
    public void f(r r2) {
        super.f(r2);
        r2.a("BatFlags", this.ap.b(cq));
    }

    @Override
    protected d e(G g10) {
        return net.minecraft.u.E.hx;
    }

    @Override
    public float l() {
        return this.aD / 2.0f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    @Nullable
    public d q() {
        block5: {
            int n2;
            block4: {
                String[] arrstring = net.minecraft.ag.A.b();
                n2 = this.b();
                if (arrstring == null) break block4;
                if (n2 == 0) break block5;
                n2 = this.g.nextInt(4);
            }
            if (n2 != 0) {
                return null;
            }
        }
        d d10 = net.minecraft.u.E.gF;
        return d10;
    }

    @Override
    protected boolean h() {
        return false;
    }

    @Override
    public boolean a(G g10, float f10) {
        boolean bl2;
        block6: {
            block7: {
                String[] arrstring = net.minecraft.ag.A.b();
                bl2 = this.a(g10);
                if (arrstring != null) {
                    if (bl2) {
                        return false;
                    }
                    bl2 = this.aG.C;
                }
                if (arrstring == null) break block6;
                if (bl2) break block7;
                bl2 = this.b();
                if (arrstring == null) break block6;
                if (bl2) {
                    this.a(false);
                }
            }
            bl2 = super.a(g10, f10);
        }
        return bl2;
    }

    @Override
    public void a(r r2) {
        super.a(r2);
        this.ap.b(cq, r2.r("BatFlags"));
    }

    @Override
    public void ae() {
        block4: {
            block2: {
                Y y2;
                block3: {
                    String[] arrstring = net.minecraft.ag.A.b();
                    super.ae();
                    String[] arrstring2 = arrstring;
                    y2 = this;
                    if (arrstring2 == null) break block2;
                    if (!y2.b()) break block3;
                    this.aq = 0.0;
                    this.G = 0.0;
                    this.d = 0.0;
                    this.aF = (double)h.f(this.aF) + 1.0 - (double)this.aD;
                    if (arrstring2 != null) break block4;
                }
                y2 = this;
            }
            y2.G *= (double)0.6f;
        }
    }

    @Override
    protected float x() {
        return 0.1f;
    }

    @Override
    protected void h() {
        block16: {
            Y y2;
            block26: {
                int n2;
                block25: {
                    double d10;
                    n n3;
                    String[] arrstring;
                    block23: {
                        block24: {
                            block21: {
                                Y y3;
                                block22: {
                                    n n4;
                                    block17: {
                                        block18: {
                                            block19: {
                                                Y y4;
                                                block20: {
                                                    Y y5;
                                                    block11: {
                                                        block12: {
                                                            z z2;
                                                            n n5;
                                                            block13: {
                                                                block14: {
                                                                    z z3;
                                                                    block15: {
                                                                        String[] arrstring2 = net.minecraft.ag.A.b();
                                                                        super.h();
                                                                        n5 = new n(this);
                                                                        arrstring = arrstring2;
                                                                        n3 = n5.a();
                                                                        y5 = this;
                                                                        if (arrstring == null) break block11;
                                                                        if (!y5.b()) break block12;
                                                                        z2 = this.aG;
                                                                        if (arrstring == null) break block13;
                                                                        if (!z2.d(n3).r()) break block14;
                                                                        Y y6 = this;
                                                                        if (arrstring != null) {
                                                                            if (y6.g.nextInt(200) == 0) {
                                                                                this.a1 = this.g.nextInt(360);
                                                                            }
                                                                            y6 = this;
                                                                        }
                                                                        z3 = y6.aG;
                                                                        if (arrstring == null) break block15;
                                                                        if (z3.b((x)this, 4.0) == null) break block16;
                                                                        this.a(false);
                                                                        z3 = this.aG;
                                                                    }
                                                                    z3.a(null, 1025, n5, 0);
                                                                    if (arrstring != null) break block16;
                                                                }
                                                                this.a(false);
                                                                z2 = this.aG;
                                                            }
                                                            z2.a(null, 1025, n5, 0);
                                                            if (arrstring != null) break block16;
                                                        }
                                                        y5 = this;
                                                    }
                                                    n4 = y5.cr;
                                                    if (arrstring == null) break block17;
                                                    if (n4 == null) break block18;
                                                    y4 = this;
                                                    if (arrstring == null) break block19;
                                                    if (!y4.aG.a(this.cr)) break block20;
                                                    n4 = this.cr;
                                                    if (arrstring == null) break block17;
                                                    if (n4.b() >= 1) break block18;
                                                }
                                                y4 = this;
                                            }
                                            y4.cr = null;
                                        }
                                        y3 = this;
                                        if (arrstring == null) break block21;
                                        n4 = y3.cr;
                                    }
                                    if (n4 == null) break block22;
                                    y3 = this;
                                    if (arrstring == null) break block21;
                                    if (y3.g.nextInt(30) == 0) break block22;
                                    double d11 = this.cr.b((int)this.a, (int)this.aF, (int)this.ax) - 4.0;
                                    d10 = d11 == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
                                    if (arrstring == null) break block23;
                                    if (d10 >= 0) break block24;
                                }
                                y3 = this;
                            }
                            y3.cr = new n((int)this.a + this.g.nextInt(7) - this.g.nextInt(7), (int)this.aF + this.g.nextInt(6) - 2, (int)this.ax + this.g.nextInt(7) - this.g.nextInt(7));
                        }
                        d10 = this.cr.e();
                    }
                    double d12 = (double)d10 + 0.5 - this.a;
                    double d13 = (double)this.cr.b() + 0.1 - this.aF;
                    double d14 = (double)this.cr.a() + 0.5 - this.ax;
                    this.aq += (Math.signum(d12) * 0.5 - this.aq) * (double)0.1f;
                    this.G += (Math.signum(d13) * (double)0.7f - this.G) * (double)0.1f;
                    this.d += (Math.signum(d14) * 0.5 - this.d) * (double)0.1f;
                    float f10 = (float)(h.a(this.d, this.aq) * 57.29577951308232) - 90.0f;
                    float f11 = h.b(f10 - this.e);
                    this.bU = 0.5f;
                    this.e += f11;
                    n2 = this.g.nextInt(100);
                    if (arrstring == null) break block25;
                    if (n2 != 0) break block16;
                    y2 = this;
                    if (arrstring == null) break block26;
                    n2 = y2.aG.d(n3).r() ? 1 : 0;
                }
                if (n2 == 0) break block16;
                y2 = this;
            }
            y2.a(true);
        }
    }

    @Override
    protected float p() {
        return super.p() * 0.95f;
    }

    @Override
    protected d aI() {
        return net.minecraft.u.E.cI;
    }

    @Override
    public boolean aY() {
        return false;
    }

    public static void b(b b10) {
        C.a(b10, Y.class);
    }

    public void a(boolean bl2) {
        block2: {
            byte by2;
            block1: {
                String[] arrstring;
                block0: {
                    by2 = this.ap.b(cq);
                    arrstring = net.minecraft.ag.A.b();
                    if (arrstring == null) break block0;
                    if (!bl2) break block1;
                    this.ap.b(cq, (byte)(by2 | 1));
                }
                if (arrstring != null) break block2;
            }
            this.ap.b(cq, (byte)(by2 & 0xFFFFFFFE));
        }
    }
}

