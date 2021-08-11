/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft.z;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ah.A;
import net.minecraft.ah.e;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.Q;
import net.minecraft.ar.aA;
import net.minecraft.ar.aH;
import net.minecraft.ar.ay;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.i;
import net.minecraft.k.k;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.u.E;
import net.minecraft.u.c;
import net.minecraft.z.b;
import net.minecraft.z.d;

public class q
extends x {
    private /* synthetic */ double aR;
    @Nullable
    private /* synthetic */ UUID aQ;
    private /* synthetic */ int aT;
    private /* synthetic */ n aN;
    private /* synthetic */ n aS;
    private /* synthetic */ double aM;
    @Nullable
    private /* synthetic */ UUID aU;
    @Nullable
    private /* synthetic */ aA aK;
    private /* synthetic */ double aL;
    private /* synthetic */ x aO;
    private /* synthetic */ B aP;

    private void a(@Nullable Q q2) {
        block50: {
            double d10;
            double d11;
            block48: {
                double d12;
                double d13;
                block49: {
                    aA aA2;
                    double d14;
                    double d15;
                    double d16;
                    m[] arrm;
                    block26: {
                        block47: {
                            ArrayList arrayList;
                            block45: {
                                ArrayList arrayList2;
                                block46: {
                                    q q3;
                                    n n2;
                                    block44: {
                                        block39: {
                                            int n3;
                                            block43: {
                                                int n4;
                                                block40: {
                                                    n n5;
                                                    block42: {
                                                        block41: {
                                                            Q q4;
                                                            Q q5;
                                                            block33: {
                                                                block34: {
                                                                    int n6;
                                                                    block38: {
                                                                        int n7;
                                                                        block35: {
                                                                            block37: {
                                                                                block36: {
                                                                                    block27: {
                                                                                        block28: {
                                                                                            int n8;
                                                                                            block32: {
                                                                                                int n9;
                                                                                                block29: {
                                                                                                    block31: {
                                                                                                        block30: {
                                                                                                            n n10;
                                                                                                            block25: {
                                                                                                                double d17;
                                                                                                                block24: {
                                                                                                                    x x2;
                                                                                                                    block22: {
                                                                                                                        block23: {
                                                                                                                            d17 = 0.5;
                                                                                                                            arrm = net.minecraft.z.d.b();
                                                                                                                            x2 = this.aO;
                                                                                                                            if (arrm != null) break block22;
                                                                                                                            if (x2 != null) break block23;
                                                                                                                            n5 = new n(this).k();
                                                                                                                            if (arrm == null) break block24;
                                                                                                                        }
                                                                                                                        x2 = this.aO;
                                                                                                                    }
                                                                                                                    d17 = (double)x2.aD * 0.5;
                                                                                                                    n5 = new n(this.aO.a, this.aO.aF + d17, this.aO.ax);
                                                                                                                }
                                                                                                                d16 = (double)n5.e() + 0.5;
                                                                                                                d15 = (double)n5.b() + d17;
                                                                                                                d14 = (double)n5.a() + 0.5;
                                                                                                                aA2 = null;
                                                                                                                n10 = n5;
                                                                                                                if (arrm != null) break block25;
                                                                                                                if (!(n10.a(this.a, this.aF, this.ax) >= 4.0)) break block26;
                                                                                                                n10 = new n(this);
                                                                                                            }
                                                                                                            n2 = n10;
                                                                                                            arrayList2 = Lists.newArrayList();
                                                                                                            q5 = q2;
                                                                                                            q4 = net.minecraft.ar.Q.X;
                                                                                                            if (arrm != null) break block27;
                                                                                                            if (q5 == q4) break block28;
                                                                                                            n8 = n2.e();
                                                                                                            n9 = n5.e();
                                                                                                            if (arrm != null) break block29;
                                                                                                            if (n8 >= n9) break block30;
                                                                                                            n8 = this.aG.a(n2.m()) ? 1 : 0;
                                                                                                            if (arrm != null) break block31;
                                                                                                            if (n8 == 0) break block30;
                                                                                                            arrayList2.add(net.minecraft.ar.aA.EAST);
                                                                                                            if (arrm == null) break block28;
                                                                                                        }
                                                                                                        n8 = n2.e();
                                                                                                    }
                                                                                                    if (arrm != null) break block32;
                                                                                                    n9 = n5.e();
                                                                                                }
                                                                                                if (n8 <= n9) break block28;
                                                                                                n8 = this.aG.a(n2.b()) ? 1 : 0;
                                                                                            }
                                                                                            if (arrm == null && n8 != 0) {
                                                                                                n8 = arrayList2.add(net.minecraft.ar.aA.WEST) ? 1 : 0;
                                                                                            }
                                                                                        }
                                                                                        q5 = q2;
                                                                                        q4 = net.minecraft.ar.Q.Y;
                                                                                    }
                                                                                    if (arrm != null) break block33;
                                                                                    if (q5 == q4) break block34;
                                                                                    n6 = n2.b();
                                                                                    n7 = n5.b();
                                                                                    if (arrm != null) break block35;
                                                                                    if (n6 >= n7) break block36;
                                                                                    n6 = this.aG.a(n2.a()) ? 1 : 0;
                                                                                    if (arrm != null) break block37;
                                                                                    if (n6 == 0) break block36;
                                                                                    arrayList2.add(net.minecraft.ar.aA.UP);
                                                                                    if (arrm == null) break block34;
                                                                                }
                                                                                n6 = n2.b();
                                                                            }
                                                                            if (arrm != null) break block38;
                                                                            n7 = n5.b();
                                                                        }
                                                                        if (n6 <= n7) break block34;
                                                                        n6 = this.aG.a(n2.k()) ? 1 : 0;
                                                                    }
                                                                    if (arrm == null && n6 != 0) {
                                                                        n6 = arrayList2.add(net.minecraft.ar.aA.DOWN) ? 1 : 0;
                                                                    }
                                                                }
                                                                q5 = q2;
                                                                q4 = net.minecraft.ar.Q.Z;
                                                            }
                                                            if (q5 == q4) break block39;
                                                            n3 = n2.a();
                                                            n4 = n5.a();
                                                            if (arrm != null) break block40;
                                                            if (n3 >= n4) break block41;
                                                            n3 = this.aG.a(n2.j()) ? 1 : 0;
                                                            if (arrm != null) break block42;
                                                            if (n3 == 0) break block41;
                                                            arrayList2.add(net.minecraft.ar.aA.SOUTH);
                                                            if (arrm == null) break block39;
                                                        }
                                                        n3 = n2.a();
                                                    }
                                                    if (arrm != null) break block43;
                                                    n4 = n5.a();
                                                }
                                                if (n3 <= n4) break block39;
                                                q3 = this;
                                                if (arrm != null) break block44;
                                                n3 = q3.aG.a(n2.i()) ? 1 : 0;
                                            }
                                            if (n3 != 0) {
                                                arrayList2.add(net.minecraft.ar.aA.NORTH);
                                            }
                                        }
                                        q3 = this;
                                    }
                                    aA2 = net.minecraft.ar.aA.a(q3.g);
                                    arrayList = arrayList2;
                                    if (arrm != null) break block45;
                                    if (!arrayList.isEmpty()) break block46;
                                    for (int i2 = 5; !this.aG.a(n2.a(aA2)) && i2 > 0; --i2) {
                                        aA2 = net.minecraft.ar.aA.a(this.g);
                                        if (arrm == null) continue;
                                    }
                                    if (arrm == null) break block47;
                                }
                                arrayList = arrayList2.get(this.g.nextInt(arrayList2.size()));
                            }
                            aA2 = (aA)((Object)arrayList);
                        }
                        d16 = this.a + (double)aA2.r();
                        d15 = this.aF + (double)aA2.p();
                        d14 = this.ax + (double)aA2.i();
                    }
                    this.a(aA2);
                    d13 = d16 - this.a;
                    d12 = d15 - this.aF;
                    d11 = d14 - this.ax;
                    d10 = h.e(d13 * d13 + d12 * d12 + d11 * d11);
                    if (arrm != null) break block48;
                    if (d10 != 0.0) break block49;
                    this.aL = 0.0;
                    this.aM = 0.0;
                    this.aR = 0.0;
                    if (arrm == null) break block50;
                }
                this.aL = d13 / d10 * 0.15;
                this.aM = d12 / d10 * 0.15;
            }
            this.aR = d11 / d10 * 0.15;
        }
        this.aA = true;
        this.aT = 10 + this.g.nextInt(5) * 10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void ae() {
        block60: {
            block61: {
                block59: {
                    block58: {
                        block57: {
                            block55: {
                                block56: {
                                    block54: {
                                        block53: {
                                            block36: {
                                                block52: {
                                                    block37: {
                                                        block50: {
                                                            block51: {
                                                                block48: {
                                                                    block49: {
                                                                        block32: {
                                                                            block46: {
                                                                                block47: {
                                                                                    block42: {
                                                                                        block43: {
                                                                                            block38: {
                                                                                                block39: {
                                                                                                    block33: {
                                                                                                        block35: {
                                                                                                            block34: {
                                                                                                                var1_1 = net.minecraft.z.d.b();
                                                                                                                v0 = this.aG.C;
                                                                                                                if (var1_1 != null) break block33;
                                                                                                                if (v0) break block34;
                                                                                                                v1 = this.aG;
                                                                                                                if (var1_1 != null) break block35;
                                                                                                                if (v1.g() == net.minecraft.ah.e.PEACEFUL) {
                                                                                                                    this.a();
                                                                                                                    if (var1_1 == null) return;
                                                                                                                }
                                                                                                            }
                                                                                                            super.ae();
                                                                                                            v1 = this.aG;
                                                                                                        }
                                                                                                        v0 = v1.C;
                                                                                                    }
                                                                                                    if (var1_1 != null) break block36;
                                                                                                    if (v0) break block37;
                                                                                                    v2 = this;
                                                                                                    if (var1_1 != null) break block38;
                                                                                                    if (v2.aO != null) break block39;
                                                                                                    v2 = this;
                                                                                                    if (var1_1 != null) break block38;
                                                                                                    if (v2.aQ == null) break block39;
                                                                                                    for (B var3_3 : this.aG.a(B.class, new k(this.aS.a(-2, -2, -2), this.aS.a(2, 2, 2)))) {
                                                                                                        block41: {
                                                                                                            block40: {
                                                                                                                if (var1_1 != null) break block40;
                                                                                                                v3 = var3_3.u().equals(this.aQ);
                                                                                                                if (var1_1 != null) break block32;
                                                                                                                if (!v3) break block41;
                                                                                                                this.aO = var3_3;
                                                                                                            }
                                                                                                            if (var1_1 == null) break;
                                                                                                        }
                                                                                                        if (var1_1 == null) continue;
                                                                                                    }
                                                                                                    this.aQ = null;
                                                                                                }
                                                                                                v2 = this;
                                                                                            }
                                                                                            v4 /* !! */  = v2.aP;
                                                                                            if (var1_1 != null) break block42;
                                                                                            if (v4 /* !! */  != null) break block43;
                                                                                            v4 /* !! */  = this;
                                                                                            if (var1_1 != null) break block42;
                                                                                            if (v4 /* !! */ .aU == null) break block43;
                                                                                            for (B var3_5 : this.aG.a(B.class, new k(this.aN.a(-2, -2, -2), this.aN.a(2, 2, 2)))) {
                                                                                                block45: {
                                                                                                    block44: {
                                                                                                        if (var1_1 != null) break block44;
                                                                                                        v3 = var3_5.u().equals(this.aU);
                                                                                                        if (var1_1 != null) break block32;
                                                                                                        if (!v3) break block45;
                                                                                                        this.aP = var3_5;
                                                                                                    }
                                                                                                    if (var1_1 == null) break;
                                                                                                }
                                                                                                if (var1_1 == null) continue;
                                                                                            }
                                                                                            this.aU = null;
                                                                                        }
                                                                                        v5 = this;
                                                                                        if (var1_1 != null) break block46;
                                                                                        v4 /* !! */  = v5.aO;
                                                                                    }
                                                                                    if (v4 /* !! */  == null) break block47;
                                                                                    v3 = this.aO.aL();
                                                                                    if (var1_1 != null) break block32;
                                                                                    if (!v3) break block47;
                                                                                    v6 = this;
                                                                                    if (var1_1 != null) break block48;
                                                                                    if (!(v6.aO instanceof j)) break block49;
                                                                                    v6 = this;
                                                                                    if (var1_1 != null) break block48;
                                                                                    if (!((j)v6.aO).ae()) break block49;
                                                                                }
                                                                                v5 = this;
                                                                            }
                                                                            if (var1_1 != null) break block50;
                                                                            v3 = v5.aI();
                                                                        }
                                                                        if (v3) break block51;
                                                                        this.G -= 0.04;
                                                                        if (var1_1 == null) break block51;
                                                                    }
                                                                    this.aL = h.b(this.aL * 1.025, -1.0, 1.0);
                                                                    this.aM = h.b(this.aM * 1.025, -1.0, 1.0);
                                                                    this.aR = h.b(this.aR * 1.025, -1.0, 1.0);
                                                                    this.aq += (this.aL - this.aq) * 0.2;
                                                                    this.G += (this.aM - this.G) * 0.2;
                                                                    v6 = this;
                                                                }
                                                                v6.d += (this.aR - this.d) * 0.2;
                                                            }
                                                            v5 = this;
                                                        }
                                                        var2_2 = b.a(v5, true, false, this.aP);
                                                        if (var1_1 != null) break block52;
                                                        if (var2_2 != null) {
                                                            this.a((i)var2_2);
                                                        }
                                                    }
                                                    this.g(this.a + this.aq, this.aF + this.G, this.ax + this.d);
                                                    b.a(this, 0.5f);
                                                }
                                                v7 = this;
                                                if (var1_1 != null) break block53;
                                                v0 = v7.aG.C;
                                            }
                                            if (v0) {
                                                this.aG.a(net.minecraft.ar.aH.END_ROD, this.a - this.aq, this.aF - this.G + 0.15, this.ax - this.d, 0.0, 0.0, 0.0, new int[0]);
                                                if (var1_1 == null) return;
                                            }
                                            v7 = this.aO;
                                        }
                                        if (var1_1 == null) {
                                            if (v7 == null) return;
                                            v7 = this.aO;
                                        }
                                        v8 = v7.P;
                                        if (var1_1 != null) break block54;
                                        if (v8 != 0) return;
                                        v9 = this;
                                        if (var1_1 != null) break block55;
                                        v8 = v9.aT;
                                    }
                                    if (v8 <= 0) break block56;
                                    --this.aT;
                                    v9 = this;
                                    if (var1_1 != null) break block55;
                                    if (v9.aT != 0) break block56;
                                    v10 = this.aK;
                                    if (var1_1 != null) ** GOTO lbl129
                                    if (v10 == null) {
                                        v11 = null;
                                    } else {
                                        v10 = this.aK;
lbl129:
                                        // 2 sources

                                        v11 = v10.g();
                                    }
                                    this.a(v11);
                                }
                                v9 = this;
                            }
                            if (v9.aK == null) return;
                            var2_2 = new n(this);
                            var3_6 = this.aK.g();
                            v12 = this;
                            if (var1_1 != null) break block57;
                            if (!v12.aG.f(var2_2.a(this.aK), false)) break block58;
                            v12 = this;
                        }
                        v12.a(var3_6);
                        if (var1_1 == null) return;
                    }
                    var4_7 = new n(this.aO);
                    v13 = var3_6;
                    v14 = net.minecraft.ar.Q.X;
                    if (var1_1 != null) break block59;
                    if (v13 == v14 && var2_2.e() == var4_7.e()) break block60;
                    v13 = var3_6;
                    v14 = net.minecraft.ar.Q.Z;
                }
                if (var1_1 != null) break block61;
                if (v13 == v14 && var2_2.a() == var4_7.a()) break block60;
                v13 = var3_6;
                v14 = net.minecraft.ar.Q.Y;
            }
            if (v13 != v14) return;
            if (var2_2.b() != var4_7.b()) return;
        }
        this.a(var3_6);
    }

    @Override
    public ay ad() {
        return ay.HOSTILE;
    }

    @Override
    protected void f(r r2) {
        q q2;
        block7: {
            r r3;
            n n2;
            x x2;
            block6: {
                m[] arrm = net.minecraft.z.d.b();
                x2 = this.aP;
                if (arrm != null) break block6;
                if (x2 != null) {
                    n2 = new n(this.aP);
                    r3 = net.minecraft.P.c.a(this.aP.u());
                    r3.b("X", n2.e());
                    r3.b("Y", n2.b());
                    r3.b("Z", n2.a());
                    r2.a("Owner", r3);
                }
                q2 = this;
                if (arrm != null) break block7;
                x2 = q2.aO;
            }
            if (x2 != null) {
                n2 = new n(this.aO);
                r3 = net.minecraft.P.c.a(this.aO.u());
                r3.b("X", n2.e());
                r3.b("Y", n2.b());
                r3.b("Z", n2.a());
                r2.a("Target", r3);
            }
            q2 = this;
        }
        if (q2.aK != null) {
            r2.b("Dir", this.aK.f());
        }
        r2.b("Steps", this.aT);
        r2.a("TXD", this.aL);
        r2.a("TYD", this.aM);
        r2.a("TZD", this.aR);
    }

    @Override
    public int aS() {
        return 0xF000F0;
    }

    @Override
    public float S() {
        return 1.0f;
    }

    public q(z z2) {
        super(z2);
        this.c(0.3125f, 0.3125f);
        this.K = true;
    }

    public q(z z2, double d10, double d11, double d12, double d13, double d14, double d15) {
        this(z2);
        this.c(d10, d11, d12, this.e, this.at);
        this.aq = d13;
        this.G = d14;
        this.d = d15;
    }

    public q(z z2, B b10, x x2, Q q2) {
        this(z2);
        this.aP = b10;
        n n2 = new n(b10);
        double d10 = (double)n2.e() + 0.5;
        double d11 = (double)n2.b() + 0.5;
        double d12 = (double)n2.a() + 0.5;
        this.c(d10, d11, d12, this.e, this.at);
        this.aO = x2;
        this.aK = net.minecraft.ar.aA.UP;
        this.a(q2);
    }

    private void a(@Nullable aA aA2) {
        this.aK = aA2;
    }

    @Override
    public boolean b(double d10) {
        m[] arrm = net.minecraft.z.d.b();
        double d11 = d10 - 16384.0;
        double d12 = d11 == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
        if (arrm == null) {
            d12 = d12 < 0 ? 1.0 : 0.0;
        }
        return (boolean)d12;
    }

    @Override
    public boolean a(G g10, float f10) {
        m[] arrm = net.minecraft.z.d.b();
        boolean bl2 = this.aG.C;
        if (arrm == null) {
            if (!bl2) {
                this.a(net.minecraft.u.E.N, 1.0f, 1.0f);
                ((A)this.aG).a(net.minecraft.ar.aH.CRIT, this.a, this.aF, this.ax, 15, 0.2, 0.2, 0.2, 0.0, new int[0]);
                this.a();
            }
            bl2 = true;
        }
        return bl2;
    }

    @Override
    protected void ab() {
    }

    @Override
    public boolean p() {
        return false;
    }

    protected void a(i i2) {
        block7: {
            block6: {
                x x2;
                m[] arrm;
                block4: {
                    block5: {
                        arrm = net.minecraft.z.d.b();
                        x2 = i2.e;
                        if (arrm != null) break block4;
                        if (x2 != null) break block5;
                        ((A)this.aG).a(net.minecraft.ar.aH.EXPLOSION_LARGE, this.a, this.aF, this.ax, 2, 0.2, 0.2, 0.2, 0.0, new int[0]);
                        this.a(net.minecraft.u.E.bb, 1.0f, 1.0f);
                        if (arrm == null) break block6;
                    }
                    x2 = i2.e;
                }
                boolean bl2 = x2.a(net.minecraft.ar.G.a((x)this, this.aP).r(), 4.0f);
                if (arrm != null) break block7;
                if (!bl2) break block6;
                this.a(this.aP, i2.e);
                if (arrm != null) break block7;
                if (i2.e instanceof B) {
                    ((B)i2.e).b(new net.minecraft.K.j(c.m, 200));
                }
            }
            this.a();
        }
    }

    @Override
    public boolean M() {
        return true;
    }

    @Override
    protected void a(r r2) {
        block8: {
            String string;
            r r3;
            r r4;
            block7: {
                boolean bl2;
                block6: {
                    this.aT = r2.m("Steps");
                    m[] arrm = net.minecraft.z.d.b();
                    this.aL = r2.e("TXD");
                    this.aM = r2.e("TYD");
                    this.aR = r2.e("TZD");
                    bl2 = r2.a("Dir", 99);
                    if (arrm == null) {
                        if (bl2) {
                            this.aK = net.minecraft.ar.aA.a(r2.m("Dir"));
                        }
                        bl2 = r2.a("Owner", 10);
                    }
                    if (arrm != null) break block6;
                    if (bl2) {
                        r4 = r2.h("Owner");
                        this.aU = net.minecraft.P.c.c(r4);
                        this.aN = new n(r4.m("X"), r4.m("Y"), r4.m("Z"));
                    }
                    r3 = r2;
                    string = "Target";
                    if (arrm != null) break block7;
                    bl2 = r3.a(string, 10);
                }
                if (!bl2) break block8;
                r3 = r2;
                string = "Target";
            }
            r4 = r3.h(string);
            this.aQ = net.minecraft.P.c.c(r4);
            this.aS = new n(r4.m("X"), r4.m("Y"), r4.m("Z"));
        }
    }
}

