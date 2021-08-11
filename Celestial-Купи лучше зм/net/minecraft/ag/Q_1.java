/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
package net.minecraft.ag;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.B.m;
import net.minecraft.J.t;
import net.minecraft.P.r;
import net.minecraft.U.B;
import net.minecraft.U.D;
import net.minecraft.U.E;
import net.minecraft.U.M;
import net.minecraft.W.K;
import net.minecraft.ag.A;
import net.minecraft.ag.C;
import net.minecraft.ag.f;
import net.minecraft.ag.w;
import net.minecraft.ah.h;
import net.minecraft.ah.z;
import net.minecraft.aj.j;
import net.minecraft.ak.F;
import net.minecraft.ak.G;
import net.minecraft.ak.P;
import net.minecraft.ak.W;
import net.minecraft.ak.aA;
import net.minecraft.ak.aa;
import net.minecraft.ak.al;
import net.minecraft.ak.s;
import net.minecraft.ar.a3;
import net.minecraft.ar.d;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.bl;
import net.minecraft.w.k;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Q
extends C {
    private static final /* synthetic */ net.minecraft.q.r<Byte> cI;
    private /* synthetic */ int cH;
    private final /* synthetic */ m cJ;
    private /* synthetic */ s cK;
    private static final /* synthetic */ Map<bl, float[]> cL;

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void b(b b10) {
        net.minecraft.U.C.a(b10, Q.class);
    }

    @Override
    protected d q() {
        return net.minecraft.u.E.gI;
    }

    @Override
    protected void h() {
        this.cH = this.cK.a();
        super.h();
    }

    @Override
    public void E() {
        String[] arrstring = net.minecraft.ag.A.b();
        Q q2 = this;
        if (arrstring != null) {
            if (q2.aG.C) {
                this.cH = Math.max(0, this.cH - 1);
            }
            q2 = this;
        }
        super.E();
    }

    public static float[] c(bl bl2) {
        return cL.get(bl2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public float b(float var1_1) {
        block9: {
            block7: {
                block8: {
                    var2_2 = net.minecraft.ag.A.b();
                    v0 = this.cH;
                    if (var2_2 == null) break block7;
                    if (v0 <= 4) break block8;
                    v0 = this.cH;
                    if (var2_2 != null) {
                        if (v0 <= 36) {
                            var3_3 = ((float)(this.cH - 4) - var1_1) / 32.0f;
                            return 0.62831855f + 0.2199115f * net.minecraft.k.h.g(var3_3 * 28.7f);
                        } else {
                            ** GOTO lbl11
                        }
                    }
                    break block7;
                }
                v1 = this;
                if (var2_2 == null) break block9;
                v0 = v1.cH;
            }
            if (v0 > 0) {
                return 0.62831855f;
            }
            v1 = this;
        }
        v2 = v1.at * 0.017453292f;
        return v2;
    }

    public Q(z z2) {
        super(z2);
        this.cJ = new m(new w(this), 2, 1);
        this.c(0.9f, 1.3f);
        this.cJ.a(0, new net.minecraft.w.d(net.minecraft.u.h.aL));
        this.cJ.a(1, new net.minecraft.w.d(net.minecraft.u.h.aL));
    }

    public boolean b() {
        String[] arrstring = net.minecraft.ag.A.b();
        boolean bl2 = this.ap.b(cI) & 0x10;
        if (arrstring != null) {
            bl2 = bl2;
        }
        return bl2;
    }

    public static bl a(Random random) {
        int n2;
        block10: {
            int n3;
            block9: {
                int n4 = random.nextInt(100);
                String[] arrstring = net.minecraft.ag.A.b();
                n2 = n4;
                n3 = 5;
                if (arrstring != null) {
                    if (n2 < n3) {
                        return bl.BLACK;
                    }
                    n2 = n4;
                    n3 = 10;
                }
                if (arrstring != null) {
                    if (n2 < n3) {
                        return bl.GRAY;
                    }
                    n2 = n4;
                    n3 = 15;
                }
                if (arrstring == null) break block9;
                if (n2 < n3) {
                    return bl.SILVER;
                }
                n2 = n4;
                if (arrstring == null) break block10;
                n3 = 18;
            }
            if (n2 < n3) {
                return bl.BROWN;
            }
            n2 = random.nextInt(500);
        }
        return n2 == 0 ? bl.PINK : bl.WHITE;
    }

    @Override
    public float l() {
        return 0.95f * this.aD;
    }

    private bl a(C c10, C c11) {
        int n2;
        block6: {
            String[] arrstring;
            int n3;
            int n4;
            block5: {
                net.minecraft.w.d d10;
                block4: {
                    net.minecraft.w.d d11;
                    String[] arrstring2 = net.minecraft.ag.A.b();
                    n4 = ((Q)c10).a().a();
                    n3 = ((Q)c11).a().a();
                    this.cJ.a(0).a(n4);
                    arrstring = arrstring2;
                    this.cJ.a(1).a(n3);
                    d10 = d11 = net.minecraft.az.t.b(this.cJ, c10.aG);
                    if (arrstring == null) break block4;
                    if (d10.w() != net.minecraft.u.h.aL) break block5;
                    d10 = d11;
                }
                n2 = d10.d();
                if (arrstring != null) break block6;
            }
            int n5 = this.aG.J.nextBoolean();
            if (arrstring != null) {
                n5 = n5 != 0 ? n4 : n3;
            }
            n2 = n5;
        }
        return bl.d(n2);
    }

    public void a(boolean bl2) {
        block2: {
            byte by2;
            block1: {
                String[] arrstring;
                block0: {
                    by2 = this.ap.b(cI);
                    arrstring = net.minecraft.ag.A.b();
                    if (arrstring == null) break block0;
                    if (!bl2) break block1;
                    this.ap.b(cI, (byte)(by2 | 0x10));
                }
                if (arrstring != null) break block2;
            }
            this.ap.b(cI, (byte)(by2 & 0xFFFFFFEF));
        }
    }

    public void b(bl bl2) {
        byte by2 = this.ap.b(cI);
        this.ap.b(cI, (byte)(by2 & 0xF0 | bl2.e() & 0xF));
    }

    private static float[] a(bl bl2) {
        float[] arrf = bl2.f();
        float f10 = 0.75f;
        return new float[]{arrf[0] * 0.75f, arrf[1] * 0.75f, arrf[2] * 0.75f};
    }

    @Override
    protected void H() {
        this.cK = new s(this);
        this.b5.a(0, new W(this));
        this.b5.a(1, new P(this, 1.25));
        this.b5.a(2, new G(this, 1.0));
        this.b5.a(3, new al((D)this, 1.1, net.minecraft.u.h.b1, false));
        this.b5.a(4, new net.minecraft.ak.A(this, 1.1));
        this.b5.a(5, this.cK);
        this.b5.a(6, new aA(this, 1.0));
        this.b5.a(7, new aa(this, net.minecraft.i.j.class, 6.0f));
        this.b5.a(8, new F(this));
    }

    @Override
    public boolean b(net.minecraft.i.j j2, a3 a32) {
        boolean bl2;
        block10: {
            block9: {
                net.minecraft.w.d d10 = j2.c(a32);
                String[] arrstring = net.minecraft.ag.A.b();
                if (d10.w() != net.minecraft.u.h.aT) break block9;
                bl2 = this.b();
                if (arrstring == null) break block10;
                if (bl2) break block9;
                bl2 = this.Q();
                if (arrstring == null) break block10;
                if (!bl2) {
                    Q q2 = this;
                    if (arrstring != null) {
                        if (!q2.aG.C) {
                            this.a(true);
                            int n2 = 1 + this.g.nextInt(3);
                            for (int i2 = 0; i2 < n2; ++i2) {
                                t t2 = this.a(new net.minecraft.w.d(net.minecraft.w.k.b(net.minecraft.u.g.s), 1, this.a().e()), 1.0f);
                                t2.G += (double)(this.g.nextFloat() * 0.05f);
                                t2.aq += (double)((this.g.nextFloat() - this.g.nextFloat()) * 0.1f);
                                t2.d += (double)((this.g.nextFloat() - this.g.nextFloat()) * 0.1f);
                                if (arrstring != null) {
                                    if (arrstring != null) continue;
                                }
                                break;
                            }
                        } else {
                            d10.a(1, (B)j2);
                        }
                        q2 = this;
                    }
                    q2.a(net.minecraft.u.E.d9, 1.0f, 1.0f);
                }
            }
            bl2 = super.b(j2, a32);
        }
        return bl2;
    }

    @Override
    public void a(r r2) {
        super.a(r2);
        this.a(r2.f("Sheared"));
        this.b(bl.c(r2.r("Color")));
    }

    static {
        cI = net.minecraft.q.m.a(Q.class, net.minecraft.q.h.m);
        cL = Maps.newEnumMap(bl.class);
        for (bl bl2 : bl.values()) {
            cL.put(bl2, net.minecraft.ag.Q.a(bl2));
        }
        cL.put(bl.WHITE, new float[]{0.9019608f, 0.9019608f, 0.9019608f});
    }

    @Override
    @Nullable
    protected v D() {
        String[] arrstring = net.minecraft.ag.A.b();
        int n2 = this.b();
        if (arrstring != null) {
            if (n2 != 0) {
                return net.minecraft.aj.j.z;
            }
            n2 = net.minecraft.ag.f.a[this.a().ordinal()];
        }
        switch (n2) {
            default: {
                return net.minecraft.aj.j.Q;
            }
            case 2: {
                return net.minecraft.aj.j.ay;
            }
            case 3: {
                return net.minecraft.aj.j.Y;
            }
            case 4: {
                return net.minecraft.aj.j.V;
            }
            case 5: {
                return net.minecraft.aj.j.m;
            }
            case 6: {
                return net.minecraft.aj.j.ag;
            }
            case 7: {
                return net.minecraft.aj.j.K;
            }
            case 8: {
                return net.minecraft.aj.j.f;
            }
            case 9: {
                return net.minecraft.aj.j.q;
            }
            case 10: {
                return net.minecraft.aj.j.aB;
            }
            case 11: {
                return net.minecraft.aj.j.aE;
            }
            case 12: {
                return net.minecraft.aj.j.N;
            }
            case 13: {
                return net.minecraft.aj.j.ar;
            }
            case 14: {
                return net.minecraft.aj.j.o;
            }
            case 15: {
                return net.minecraft.aj.j.a;
            }
            case 16: 
        }
        return net.minecraft.aj.j.C;
    }

    @Override
    @Nullable
    public net.minecraft.U.j a(h h2, @Nullable net.minecraft.U.j j2) {
        j2 = super.a(h2, j2);
        this.b(net.minecraft.ag.Q.a(this.aG.J));
        return j2;
    }

    public bl a() {
        return bl.c(this.ap.b(cI) & 0xF);
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.f).a(8.0);
        this.a(net.minecraft.U.M.d).a(0.23f);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public float a(float var1_1) {
        var2_2 = net.minecraft.ag.A.b();
        v0 = this.cH;
        if (var2_2 != null) {
            if (v0 <= 0) {
                return 0.0f;
            }
            v0 = this.cH;
        }
        v1 = 4;
        if (var2_2 != null) {
            if (v0 >= v1) {
                v0 = this.cH;
                v1 = 36;
                if (var2_2 != null) {
                    if (v0 <= v1) {
                        return 1.0f;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = this.cH;
                v1 = 4;
            }
        }
        if (var2_2 != null) {
            if (v0 < v1) {
                v2 = ((float)this.cH - var1_1) / 4.0f;
                return v2;
            }
            v0 = this.cH;
            v1 = 40;
        }
        v2 = -((float)(v0 - v1) - var1_1) / 4.0f;
        return v2;
    }

    @Override
    public void f(r r2) {
        super.f(r2);
        r2.a("Sheared", this.b());
        r2.a("Color", (byte)this.a().e());
    }

    @Override
    protected d e(net.minecraft.ar.G g10) {
        return net.minecraft.u.E.e6;
    }

    @Override
    protected d aI() {
        return net.minecraft.u.E.hE;
    }

    @Override
    protected void a(n n2, K k2) {
        this.a(net.minecraft.u.E.ao, 0.15f, 1.0f);
    }

    @Override
    public void ag() {
        block3: {
            Q q2;
            block2: {
                String[] arrstring = net.minecraft.ag.A.b();
                this.a(false);
                String[] arrstring2 = arrstring;
                q2 = this;
                if (arrstring2 == null) break block2;
                if (!q2.Q()) break block3;
                q2 = this;
            }
            q2.k(60);
        }
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(cI, (byte)0);
    }

    @Override
    public void a(byte by2) {
        block2: {
            block1: {
                String[] arrstring;
                block0: {
                    arrstring = net.minecraft.ag.A.b();
                    if (arrstring == null) break block0;
                    if (by2 != 10) break block1;
                    this.cH = 40;
                }
                if (arrstring != null) break block2;
            }
            super.a(by2);
        }
    }

    @Override
    public Q a(E e10) {
        Q q2 = (Q)e10;
        Q q3 = new Q(this.aG);
        q3.b(this.a(this, q2));
        return q3;
    }
}

