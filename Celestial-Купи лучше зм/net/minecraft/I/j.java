/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 *  javax.annotation.Nullable
 */
package net.minecraft.i;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.B.X;
import net.minecraft.D.b;
import net.minecraft.D.l;
import net.minecraft.J.t;
import net.minecraft.N.B;
import net.minecraft.N.Y;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.T.ae;
import net.minecraft.U.C;
import net.minecraft.U.M;
import net.minecraft.U.q;
import net.minecraft.W.K;
import net.minecraft.W.bF;
import net.minecraft.W.bn;
import net.minecraft.Z.i;
import net.minecraft.ag.D;
import net.minecraft.ag.O;
import net.minecraft.ag.R;
import net.minecraft.ag.U;
import net.minecraft.ah.A;
import net.minecraft.ah.e;
import net.minecraft.ah.o;
import net.minecraft.ah.s;
import net.minecraft.ah.x;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.W;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aH;
import net.minecraft.ar.aX;
import net.minecraft.ar.ay;
import net.minecraft.ar.v;
import net.minecraft.ar.y;
import net.minecraft.at.k;
import net.minecraft.ax.T;
import net.minecraft.i.a;
import net.minecraft.i.c;
import net.minecraft.i.d;
import net.minecraft.i.f;
import net.minecraft.i.g;
import net.minecraft.i.h;
import net.minecraft.k.n;
import net.minecraft.l.m;
import net.minecraft.u.E;
import net.minecraft.w.am;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class j
extends net.minecraft.U.B {
    public /* synthetic */ double b_;
    private /* synthetic */ boolean bX;
    public /* synthetic */ float b3;
    protected /* synthetic */ net.minecraft.B.f ck;
    public /* synthetic */ float bZ;
    public /* synthetic */ double cq;
    protected static final /* synthetic */ net.minecraft.q.r<Byte> cd;
    protected static final /* synthetic */ net.minecraft.q.r<Byte> cy;
    public /* synthetic */ float b1;
    private final /* synthetic */ y cj;
    protected /* synthetic */ W b6;
    private static final /* synthetic */ net.minecraft.q.r<Integer> ca;
    public /* synthetic */ float cx;
    public /* synthetic */ h cB;
    public /* synthetic */ net.minecraft.B.n cu;
    private /* synthetic */ boolean cz;
    protected static final /* synthetic */ net.minecraft.q.r<r> cr;
    private /* synthetic */ net.minecraft.w.d ci;
    private /* synthetic */ int ce;
    public /* synthetic */ int b4;
    private static final /* synthetic */ net.minecraft.q.r<Float> co;
    public /* synthetic */ net.minecraft.B.n cm;
    public /* synthetic */ float b9;
    public /* synthetic */ n cf;
    public /* synthetic */ int b8;
    private final /* synthetic */ GameProfile cc;
    protected /* synthetic */ int bY;
    public /* synthetic */ double b0;
    public /* synthetic */ double b5;
    protected /* synthetic */ int cg;
    protected static final /* synthetic */ net.minecraft.q.r<r> cv;
    private /* synthetic */ n cb;
    public /* synthetic */ float cA;
    private /* synthetic */ int cp;
    public /* synthetic */ float b7;
    @Nullable
    public /* synthetic */ net.minecraft.z.o ch;
    public /* synthetic */ g cw;
    public /* synthetic */ double cn;
    private static /* synthetic */ String[] ct;
    public /* synthetic */ int cl;
    public /* synthetic */ double cs;
    protected /* synthetic */ boolean b2;

    public net.minecraft.w.d l(int n2) {
        return n2 == 0 ? this.cB.k() : this.cB.e.get(n2 - 1);
    }

    public r p() {
        return this.ap.b(cv);
    }

    public void b(net.minecraft.w.d d10, int n2) {
        this.b4 -= n2;
        String string = net.minecraft.i.g.b();
        j j2 = this;
        if (string == null) {
            if (j2.b4 < 0) {
                this.b4 = 0;
                this.b7 = 0.0f;
                this.b8 = 0;
            }
            j2 = this;
        }
        j2.bY = this.g.nextInt();
    }

    @Override
    public void a(X x2, net.minecraft.w.d d10) {
        block6: {
            X x3;
            String string;
            block7: {
                block8: {
                    X x4;
                    block4: {
                        block5: {
                            string = net.minecraft.i.g.b();
                            x3 = x2;
                            x4 = net.minecraft.B.X.MAINHAND;
                            if (string != null) break block4;
                            if (x3 != x4) break block5;
                            this.b(d10);
                            this.cB.c.set(this.cB.a, d10);
                            if (string == null) break block6;
                        }
                        x3 = x2;
                        if (string != null) break block7;
                        x4 = net.minecraft.B.X.OFFHAND;
                    }
                    if (x3 != x4) break block8;
                    this.b(d10);
                    this.cB.h.set(0, d10);
                    if (string == null) break block6;
                }
                x3 = x2;
            }
            Object object = x3.b();
            if (string == null && object == net.minecraft.B.i.ARMOR) {
                this.b(d10);
                object = this.cB.e.set(x2.a(), d10);
            }
        }
    }

    @Override
    public void d(float f10, float f11) {
        block5: {
            int n2;
            block4: {
                String string = net.minecraft.i.g.b();
                n2 = this.cw.d;
                if (string != null) break block4;
                if (n2 != 0) break block5;
                float f12 = f10 - 2.0f;
                n2 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
            }
            if (n2 >= 0) {
                this.a(net.minecraft.l.m.q, (int)Math.round((double)f10 * 100.0));
            }
            super.d(f10, f11);
        }
    }

    @Override
    protected net.minecraft.ar.d a(int n2) {
        return n2 > 4 ? net.minecraft.u.E.eA : net.minecraft.u.E.E;
    }

    @Override
    public net.minecraft.ar.b al() {
        return this.ap.b(cy) == 0 ? net.minecraft.ar.b.LEFT : net.minecraft.ar.b.RIGHT;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public f a(n var1_1) {
        block22: {
            block20: {
                block21: {
                    block19: {
                        var3_2 = this.aG.d(var1_1).b(net.minecraft.W.bF.z);
                        var2_3 = net.minecraft.i.g.b();
                        v0 = this.aG.C;
                        if (var2_3 == null) {
                            if (!v0) {
                                v1 = this.as();
                                if (var2_3 == null) {
                                    if (v1 != false) return net.minecraft.i.f.OTHER_PROBLEM;
                                    v1 = this.aL();
                                }
                                if (var2_3 == null) {
                                    if (!v1) {
                                        return net.minecraft.i.f.OTHER_PROBLEM;
                                    }
                                    v1 = this.aG.D.s();
                                }
                                if (var2_3 == null) {
                                    if (!v1) {
                                        return net.minecraft.i.f.NOT_POSSIBLE_HERE;
                                    }
                                    v1 = this.aG.R();
                                }
                                if (var2_3 == null) {
                                    if (v1) {
                                        return net.minecraft.i.f.NOT_POSSIBLE_NOW;
                                    }
                                    v1 = this.a(var1_1, var3_2);
                                }
                                if (!v1) {
                                    return net.minecraft.i.f.TOO_FAR_AWAY;
                                }
                                var4_4 = 8.0;
                                var6_6 = 5.0;
                                var8_7 = this.aG.a(ae.class, new net.minecraft.k.k((double)var1_1.e() - 8.0, (double)var1_1.b() - 5.0, (double)var1_1.a() - 8.0, (double)var1_1.e() + 8.0, (double)var1_1.b() + 5.0, (double)var1_1.a() + 8.0), new c(this, null));
                                v0 = var8_7.isEmpty();
                                if (var2_3 == null) {
                                    if (!v0) {
                                        return net.minecraft.i.f.NOT_SAFE;
                                    } else {
                                        ** GOTO lbl-1000
                                    }
                                }
                            } else lbl-1000:
                            // 3 sources

                            {
                                v0 = this.N();
                            }
                        }
                        if (var2_3 != null) break block19;
                        if (v0) {
                            this.aO();
                        }
                        this.P();
                        this.c(0.2f, 0.2f);
                        v2 = this;
                        if (var2_3 != null) break block20;
                        v0 = v2.aG.n(var1_1);
                    }
                    if (!v0) break block21;
                    var4_5 = 0.5f + (float)var3_2.r() * 0.4f;
                    var5_8 = 0.5f + (float)var3_2.i() * 0.4f;
                    this.a(var3_2);
                    this.g((float)var1_1.e() + var4_5, (float)var1_1.b() + 0.6875f, (float)var1_1.a() + var5_8);
                    if (var2_3 == null) break block22;
                }
                v2 = this;
            }
            v2.g((float)var1_1.e() + 0.5f, (float)var1_1.b() + 0.6875f, (float)var1_1.a() + 0.5f);
        }
        this.b2 = true;
        this.cp = 0;
        this.cf = var1_1;
        this.aq = 0.0;
        this.G = 0.0;
        this.d = 0.0;
        v3 = this.aG;
        if (var2_3 == null) {
            if (v3.C != false) return net.minecraft.i.f.OK;
            v3 = this.aG;
        }
        v3.l();
        return net.minecraft.i.f.OK;
    }

    public r r() {
        return this.ap.b(cr);
    }

    public void a(net.minecraft.l.d d10) {
    }

    public boolean b(i i2) {
        return this.cB.a(i2);
    }

    public boolean T() {
        return this.bX;
    }

    public n Y() {
        return this.cb;
    }

    @Override
    public void a() {
        block3: {
            net.minecraft.B.n n2;
            block2: {
                String string = net.minecraft.i.g.b();
                super.a();
                this.cu.b(this);
                String string2 = string;
                n2 = this.cm;
                if (string2 != null) break block2;
                if (n2 == null) break block3;
                n2 = this.cm;
            }
            n2.b(this);
        }
    }

    public j(z z2, GameProfile gameProfile) {
        super(z2);
        this.cB = new h(this);
        this.ck = new net.minecraft.B.f();
        this.b6 = new W();
        this.cw = new g();
        this.cx = 0.02f;
        this.ci = net.minecraft.w.d.m;
        this.cj = this.F();
        this.a(net.minecraft.i.j.a(gameProfile));
        this.cc = gameProfile;
        this.cm = this.cu = new net.minecraft.B.x(this.cB, !z2.C, this);
        n n2 = z2.G();
        this.c((double)n2.e() + 0.5, n2.b() + 1, (double)n2.a() + 0.5, 0.0f, 0.0f);
        this.bx = 180.0f;
    }

    @Override
    public int F() {
        return 10;
    }

    public void m(boolean n2) {
        block6: {
            j j2;
            block5: {
                int n3;
                block4: {
                    float f10 = 0.25f + (float)net.minecraft.ax.T.e(this) * 0.05f;
                    String string = net.minecraft.i.g.b();
                    n3 = n2;
                    if (string != null) break block4;
                    if (n3 != 0) {
                        f10 += 0.75f;
                    }
                    j2 = this;
                    if (string != null) break block5;
                    float f11 = j2.g.nextFloat() - f10;
                    n3 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                }
                if (n3 >= 0) break block6;
                this.o().b(net.minecraft.u.h.cq, 100);
                this.aJ();
                j2 = this;
            }
            j2.aG.a((net.minecraft.U.x)this, (byte)30);
        }
    }

    public float Q() {
        int n2;
        block3: {
            int n3 = 0;
            String string = net.minecraft.i.g.b();
            for (net.minecraft.w.d d10 : this.cB.e) {
                n2 = d10.G();
                if (string == null) {
                    if (n2 == 0) {
                        ++n3;
                    }
                    if (string == null) continue;
                }
                break block3;
            }
            n2 = n3;
        }
        return (float)n2 / (float)this.cB.e.size();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean I() {
        String string = net.minecraft.i.g.b();
        int n2 = this.b2;
        if (string == null) {
            if (n2 == 0) return 0 != 0;
            n2 = this.cp;
        }
        if (string != null) return n2 != 0;
        if (n2 < 100) return 0 != 0;
        return 1 != 0;
    }

    @Override
    protected void aQ() {
        block3: {
            j j2;
            block2: {
                String string = net.minecraft.i.g.b();
                j2 = this;
                if (string != null) break block2;
                if (j2.ae()) break block3;
                j2 = this;
            }
            super.aQ();
        }
    }

    public void a(D d10, net.minecraft.B.a a10) {
    }

    @Override
    public Iterable<net.minecraft.w.d> k() {
        return Lists.newArrayList((Object[])new net.minecraft.w.d[]{this.av(), this.b()});
    }

    /*
     * Enabled aggressive block sorting
     */
    public int R() {
        int n2;
        String string = net.minecraft.i.g.b();
        int n3 = this.b4;
        int n4 = 30;
        if (string == null) {
            if (n3 >= n4) {
                return 112 + (this.b4 - 30) * 9;
            }
            n3 = this.b4;
            n4 = 15;
        }
        if (string == null) {
            if (n3 >= n4) {
                n2 = 37 + (this.b4 - 15) * 5;
                return n2;
            }
            n3 = 7;
            n4 = this.b4 * 2;
        }
        n2 = n3 + n4;
        return n2;
    }

    public void b(List<net.minecraft.az.k> list) {
    }

    private void a(double d10, double d11, double d12) {
        block3: {
            j j2;
            int n2;
            block11: {
                int n3;
                block9: {
                    String string;
                    block10: {
                        block7: {
                            block8: {
                                block5: {
                                    block6: {
                                        block4: {
                                            int n4;
                                            block2: {
                                                string = net.minecraft.i.g.b();
                                                n4 = this.N();
                                                if (string != null) break block2;
                                                if (n4 == 0) break block3;
                                                n4 = Math.round(net.minecraft.k.h.e(d10 * d10 + d11 * d11 + d12 * d12) * 100.0f);
                                            }
                                            n3 = n2 = n4;
                                            if (string != null) break block4;
                                            if (n3 <= 0) break block3;
                                            n3 = this.as() instanceof net.minecraft.J.u;
                                        }
                                        if (string != null) break block5;
                                        if (n3 == 0) break block6;
                                        this.a(net.minecraft.l.m.U, n2);
                                        if (string == null) break block3;
                                    }
                                    n3 = this.as() instanceof net.minecraft.J.o;
                                }
                                if (string != null) break block7;
                                if (n3 == 0) break block8;
                                this.a(net.minecraft.l.m.o, n2);
                                if (string == null) break block3;
                            }
                            n3 = this.as() instanceof O;
                        }
                        if (string != null) break block9;
                        if (n3 == 0) break block10;
                        this.a(net.minecraft.l.m.Z, n2);
                        if (string == null) break block3;
                    }
                    j2 = this;
                    if (string != null) break block11;
                    n3 = j2.as() instanceof D;
                }
                if (n3 == 0) break block3;
                j2 = this;
            }
            j2.a(net.minecraft.l.m.ad, n2);
        }
    }

    public void a(Y y2) {
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public net.minecraft.w.d b(X x2) {
        net.minecraft.w.d d10;
        X x3;
        String string;
        block8: {
            X x4;
            block7: {
                string = net.minecraft.i.g.b();
                X x4 = x2;
                x4 = net.minecraft.B.X.MAINHAND;
                if (string != null) break block7;
                if (x3 == x4) {
                    return this.cB.k();
                }
                x3 = x2;
                if (string != null) break block8;
                x4 = net.minecraft.B.X.OFFHAND;
            }
            if (x3 == x4) {
                return this.cB.h.get(0);
            }
            x3 = x2;
        }
        Object object = x3.b();
        if (string == null) {
            if (object != net.minecraft.B.i.ARMOR) {
                d10 = net.minecraft.w.d.m;
                return d10;
            }
            object = this.cB.e.get(x2.a());
        }
        d10 = (net.minecraft.w.d)object;
        return d10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected int a(j j2) {
        int n2;
        String string = net.minecraft.i.g.b();
        int n3 = this.aG.M().c("keepInventory");
        if (string != null) return n3;
        if (n3 != 0) return 0;
        n3 = this.ae() ? 1 : 0;
        if (string != null) return n3;
        if (n3 != 0) return 0;
        int n4 = n2 = this.b4 * 7;
        if (string != null) return n4;
        if (n4 > 100) {
            return 100;
        }
        n4 = n2;
        return n4;
    }

    @Override
    protected void b(G g10, float f10) {
        block3: {
            j j2;
            block5: {
                float f11;
                String string;
                block4: {
                    G g11;
                    j j3;
                    block2: {
                        string = net.minecraft.i.g.b();
                        j3 = this;
                        g11 = g10;
                        if (string != null) break block2;
                        if (j3.a(g11)) break block3;
                        f10 = this.c(g10, f10);
                        j3 = this;
                        g11 = g10;
                    }
                    float f12 = f10 = j3.a(g11, f10);
                    f10 = Math.max(f10 - this.ax(), 0.0f);
                    this.d(this.ax() - (f12 - f10));
                    f11 = f10;
                    if (string != null) break block4;
                    if (f11 == 0.0f) break block3;
                    this.c(g10.s());
                    f11 = this.V();
                }
                float f13 = f11;
                this.f(this.V() - f10);
                j2 = this;
                if (string != null) break block5;
                j2.aC().a(g10, f13, f10);
                if (!(f10 < 3.4028235E37f)) break block3;
                j2 = this;
            }
            j2.a(net.minecraft.l.m.C, Math.round(f10 * 10.0f));
        }
    }

    public static void b(String[] arrstring) {
        ct = arrstring;
    }

    public float q() {
        block9: {
            Object object;
            block8: {
                String string = net.minecraft.i.g.b();
                object = this.cf;
                if (string != null) break block8;
                if (object == null) break block9;
                object = this.aG.d(this.cf).b(net.minecraft.W.bF.z);
            }
            aA aA2 = (aA)object;
            switch (aA2) {
                case SOUTH: {
                    return 90.0f;
                }
                case WEST: {
                    return 0.0f;
                }
                case NORTH: {
                    return 270.0f;
                }
                case EAST: {
                    return 180.0f;
                }
            }
        }
        return 0.0f;
    }

    @Override
    public void aZ() {
        block4: {
            block5: {
                j j2;
                String string;
                block2: {
                    block3: {
                        string = net.minecraft.i.g.b();
                        j2 = this;
                        if (string != null) break block2;
                        if (j2.aG.C) break block3;
                        j2 = this;
                        if (string != null) break block2;
                        if (!j2.a4()) break block3;
                        j2 = this;
                        if (string != null) break block2;
                        if (!j2.N()) break block3;
                        this.aO();
                        this.f(false);
                        if (string == null) break block4;
                    }
                    j2 = this;
                }
                double d10 = j2.a;
                double d11 = this.aF;
                double d12 = this.ax;
                float f10 = this.e;
                float f11 = this.at;
                super.aZ();
                this.bZ = this.b9;
                this.b9 = 0.0f;
                this.a(this.a - d10, this.aF - d11, this.ax - d12);
                j j3 = this;
                if (string != null) break block5;
                if (!(j3.as() instanceof O)) break block4;
                this.at = f11;
                this.e = f10;
                j3 = this;
            }
            j3.bf = ((O)this.as()).bf;
        }
    }

    public float y() {
        return (float)this.a(net.minecraft.U.M.a).d();
    }

    @Override
    public void a(net.minecraft.U.B b10) {
        block0: {
            q q2 = net.minecraft.U.h.g.get(net.minecraft.U.h.a(b10));
            if (q2 == null) break block0;
            this.b(q2.c);
        }
    }

    private void a(aA aA2) {
        this.b1 = -1.8f * (float)aA2.r();
        this.b3 = -1.8f * (float)aA2.i();
    }

    public void a(net.minecraft.ar.b b10) {
        this.ap.b(cy, (byte)(b10 != net.minecraft.ar.b.LEFT ? 1 : 0));
    }

    public boolean a(a a10) {
        String string = net.minecraft.i.g.b();
        int n2 = this.E().b(cd) & a10.b();
        if (string == null) {
            n2 = n2 == a10.b() ? 1 : 0;
        }
        return n2 != 0;
    }

    @Override
    public float l() {
        float f10;
        block10: {
            float f11;
            block4: {
                float f12;
                float f13;
                block7: {
                    block6: {
                        String string;
                        block9: {
                            boolean bl2;
                            block8: {
                                boolean bl3;
                                block5: {
                                    block2: {
                                        block3: {
                                            f11 = 1.62f;
                                            string = net.minecraft.i.g.b();
                                            bl3 = this.as();
                                            if (string != null) break block2;
                                            if (!bl3) break block3;
                                            f11 = 0.2f;
                                            if (string == null) break block4;
                                        }
                                        bl3 = this.a4();
                                    }
                                    if (string != null) break block5;
                                    if (bl3) break block6;
                                    float f12 = this.aD;
                                    f12 = 1.65f;
                                    if (string != null) break block7;
                                    float f14 = f13 - f12;
                                    bl3 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                                }
                                if (!bl3) break block6;
                                bl2 = this.aK();
                                if (string != null) break block8;
                                if (bl2) break block9;
                                f10 = this.aD;
                                if (string != null) break block10;
                                float f15 = f10 - 0.6f;
                                bl2 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                            }
                            if (bl2) break block4;
                        }
                        f11 = 0.4f;
                        if (string == null) break block4;
                    }
                    float f12 = f11;
                    f12 = 0.08f;
                }
                f11 = f13 - f12;
            }
            f10 = f11;
        }
        return f10;
    }

    @Override
    public void n(net.minecraft.U.x x2) {
        block3: {
            j j2;
            block2: {
                String string = net.minecraft.i.g.b();
                j2 = this;
                if (string != null) break block2;
                if (j2.as()) break block3;
                j2 = this;
            }
            super.n(x2);
        }
    }

    @Override
    protected net.minecraft.ar.d x() {
        return net.minecraft.u.E.a5;
    }

    @Override
    protected void b(float f10) {
        this.cB.a(f10);
    }

    public void a(v[] arrv) {
    }

    @Override
    protected net.minecraft.ar.d e(G g10) {
        String string = net.minecraft.i.g.b();
        G g11 = g10;
        G g12 = net.minecraft.ar.G.x;
        if (string == null) {
            if (g11 == g12) {
                return net.minecraft.u.E.ds;
            }
            g11 = g10;
            g12 = net.minecraft.ar.G.u;
        }
        return g11 == g12 ? net.minecraft.u.E.eT : net.minecraft.u.E.fW;
    }

    static {
        co = net.minecraft.q.m.a(j.class, net.minecraft.q.h.k);
        ca = net.minecraft.q.m.a(j.class, net.minecraft.q.h.n);
        cd = net.minecraft.q.m.a(j.class, net.minecraft.q.h.m);
        cy = net.minecraft.q.m.a(j.class, net.minecraft.q.h.m);
        cr = net.minecraft.q.m.a(j.class, net.minecraft.q.h.l);
        cv = net.minecraft.q.m.a(j.class, net.minecraft.q.h.l);
        net.minecraft.i.j.b(new String[5]);
    }

    public float e(float f10) {
        return net.minecraft.k.h.c(((float)this.a9 + f10) / this.z(), 0.0f, 1.0f);
    }

    public void u() {
        this.a9 = 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(boolean bl2) {
        boolean bl3;
        String string;
        block2: {
            block3: {
                string = net.minecraft.i.g.b();
                bl3 = bl2;
                if (string != null) break block2;
                if (bl3) break block3;
                bl3 = this.b6.a();
                if (string != null) break block2;
                if (!bl3) return false;
            }
            bl3 = this.cw.b;
        }
        if (string != null) return bl3;
        if (bl3) return false;
        return true;
    }

    protected void g(r r2) {
        this.ap.b(cr, r2);
    }

    public net.minecraft.w.d e() {
        return this.cB.k();
    }

    public void a(net.minecraft.w.d d10, a3 a32) {
    }

    public static UUID a(GameProfile gameProfile) {
        UUID uUID = gameProfile.getId();
        String string = net.minecraft.i.g.b();
        UUID uUID2 = uUID;
        if (string == null) {
            if (uUID2 == null) {
                uUID = net.minecraft.i.j.a(gameProfile.getName());
            }
            uUID2 = uUID;
        }
        return uUID2;
    }

    public void ah() {
        block3: {
            z z2;
            double d10;
            double d11;
            block2: {
                d11 = -net.minecraft.k.h.g(this.e * ((float)Math.PI / 180));
                d10 = net.minecraft.k.h.c(this.e * ((float)Math.PI / 180));
                String string = net.minecraft.i.g.b();
                z2 = this.aG;
                if (string != null) break block2;
                if (!(z2 instanceof A)) break block3;
                z2 = this.aG;
            }
            ((A)z2).a(net.minecraft.ar.aH.SWEEP_ATTACK, this.a + d11, this.aF + (double)this.aD * 0.5, this.ax + d10, 0, d11, 0.0, d10, 0.0, new int[0]);
        }
    }

    private boolean k() {
        return this.aG.d(this.cf).b() == net.minecraft.u.g.R;
    }

    @Override
    public void E() {
        block59: {
            j j2;
            block57: {
                block58: {
                    float f10;
                    block55: {
                        String string;
                        block56: {
                            block36: {
                                block51: {
                                    net.minecraft.k.k k2;
                                    block54: {
                                        j j3;
                                        block52: {
                                            block53: {
                                                block49: {
                                                    float f11;
                                                    float f12;
                                                    block50: {
                                                        block48: {
                                                            block47: {
                                                                block45: {
                                                                    block46: {
                                                                        block44: {
                                                                            block43: {
                                                                                j j4;
                                                                                block42: {
                                                                                    boolean bl2;
                                                                                    net.minecraft.j.b b10;
                                                                                    block41: {
                                                                                        j j5;
                                                                                        block37: {
                                                                                            block38: {
                                                                                                float f13;
                                                                                                block39: {
                                                                                                    block40: {
                                                                                                        string = net.minecraft.i.g.b();
                                                                                                        j5 = this;
                                                                                                        if (string == null) {
                                                                                                            if (j5.cg > 0) {
                                                                                                                --this.cg;
                                                                                                            }
                                                                                                            j5 = this;
                                                                                                        }
                                                                                                        if (string != null) break block37;
                                                                                                        if (j5.aG.g() != net.minecraft.ah.e.PEACEFUL) break block38;
                                                                                                        j5 = this;
                                                                                                        if (string != null) break block37;
                                                                                                        if (!j5.aG.M().c("naturalRegeneration")) break block38;
                                                                                                        float f14 = this.V() - this.H();
                                                                                                        f13 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                                                                                                        if (string != null) break block39;
                                                                                                        if (f13 >= 0) break block40;
                                                                                                        f13 = this.H % 20;
                                                                                                        if (string != null) break block39;
                                                                                                        if (f13 == false) {
                                                                                                            this.i(1.0f);
                                                                                                        }
                                                                                                    }
                                                                                                    j5 = this;
                                                                                                    if (string != null) break block37;
                                                                                                    f13 = (float)j5.b6.a();
                                                                                                }
                                                                                                if (f13 == false) break block38;
                                                                                                j5 = this;
                                                                                                if (string != null) break block37;
                                                                                                if (j5.H % 10 == 0) {
                                                                                                    this.b6.a(this.b6.b() + 1);
                                                                                                }
                                                                                            }
                                                                                            this.cB.g();
                                                                                            this.bZ = this.b9;
                                                                                            super.E();
                                                                                            j5 = this;
                                                                                        }
                                                                                        b10 = j5.a(net.minecraft.U.M.d);
                                                                                        bl2 = this.aG.C;
                                                                                        if (string != null) break block41;
                                                                                        if (!bl2) {
                                                                                            b10.a(this.cw.c());
                                                                                        }
                                                                                        this.a_ = this.cx;
                                                                                        j4 = this;
                                                                                        if (string != null) break block42;
                                                                                        bl2 = j4.ai();
                                                                                    }
                                                                                    if (bl2) {
                                                                                        this.a_ = (float)((double)this.a_ + (double)this.cx * 0.3);
                                                                                    }
                                                                                    this.g((float)b10.d());
                                                                                    j4 = this;
                                                                                }
                                                                                f12 = net.minecraft.k.h.e(j4.aq * this.aq + this.d * this.d);
                                                                                f11 = (float)(Math.atan(-this.G * (double)0.2f) * 15.0);
                                                                                float f15 = f12 - 0.1f;
                                                                                f10 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                                                                                if (string == null) {
                                                                                    if (f10 > 0) {
                                                                                        f12 = 0.1f;
                                                                                    }
                                                                                    f10 = (float)this.A;
                                                                                }
                                                                                if (string != null) break block43;
                                                                                if (f10 == false) break block44;
                                                                                float f16 = this.V() - 0.0f;
                                                                                f10 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                                                                            }
                                                                            if (string != null) break block45;
                                                                            if (f10 > 0) break block46;
                                                                        }
                                                                        f12 = 0.0f;
                                                                    }
                                                                    f10 = (float)this.A;
                                                                }
                                                                if (string != null) break block47;
                                                                if (f10 != false) break block48;
                                                                float f17 = this.V() - 0.0f;
                                                                f10 = f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
                                                            }
                                                            if (string != null) break block49;
                                                            if (f10 > 0) break block50;
                                                        }
                                                        f11 = 0.0f;
                                                    }
                                                    this.b9 += (f12 - this.b9) * 0.4f;
                                                    this.bF += (f11 - this.bF) * 0.8f;
                                                    float f18 = this.V() - 0.0f;
                                                    f10 = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
                                                }
                                                if (string != null) break block36;
                                                if (f10 <= 0) break block51;
                                                f10 = (float)this.ae();
                                                if (string != null) break block36;
                                                if (f10 != false) break block51;
                                                j3 = this;
                                                if (string != null) break block52;
                                                if (!j3.N()) break block53;
                                                j3 = this;
                                                if (string != null) break block52;
                                                if (j3.as().P) break block53;
                                                k2 = this.m().a(this.as().m()).a(1.0, 0.0, 1.0);
                                                if (string == null) break block54;
                                                net.minecraft.k.m.b(!net.minecraft.k.m.c());
                                            }
                                            j3 = this;
                                        }
                                        k2 = j3.m().a(1.0, 0.5, 1.0);
                                    }
                                    List<net.minecraft.U.x> list = this.aG.b((net.minecraft.U.x)this, k2);
                                    int n2 = 0;
                                    while (n2 < list.size()) {
                                        net.minecraft.U.x x2 = list.get(n2);
                                        if (string == null) {
                                            f10 = (float)x2.P;
                                            if (string != null) break block36;
                                            if (f10 == false) {
                                                this.a(x2);
                                            }
                                            ++n2;
                                        }
                                        if (string == null) continue;
                                    }
                                }
                                this.b(this.r());
                                this.b(this.p());
                                f10 = (float)this.aG.C;
                            }
                            if (string != null) break block55;
                            if (f10 != false) break block56;
                            j2 = this;
                            if (string != null) break block57;
                            if (j2.an > 0.5f) break block58;
                            j2 = this;
                            if (string != null) break block57;
                            if (j2.aj()) break block58;
                            j2 = this;
                            if (string != null) break block57;
                            if (j2.N()) break block58;
                        }
                        j2 = this;
                        if (string != null) break block57;
                        f10 = (float)j2.cw.e;
                    }
                    if (f10 == false) break block59;
                }
                j2 = this;
            }
            j2.P();
        }
    }

    @Override
    public String g() {
        return this.cc.getName();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public static n a(z z2, n n2, boolean bl2) {
        K k2 = z2.d(n2).b();
        String string = net.minecraft.i.g.b();
        if (k2 == net.minecraft.u.g.R) return net.minecraft.W.bn.a(z2, n2, 0);
        boolean bl3 = bl2;
        if (string == null) {
            if (!bl3) {
                return null;
            }
            bl3 = k2.m();
        }
        boolean bl4 = bl3;
        boolean bl5 = z2.d(n2.a()).b().m();
        boolean bl6 = bl4;
        if (string == null) {
            if (!bl6) return null;
            bl6 = bl5;
        }
        if (!bl6) return null;
        n n3 = n2;
        return n3;
    }

    public void a(boolean n2, boolean bl2, boolean bl3) {
        block10: {
            j j2;
            String string;
            block6: {
                block7: {
                    n n3;
                    block9: {
                        n n4;
                        block8: {
                            String string2 = net.minecraft.i.g.b();
                            this.c(0.6f, 1.8f);
                            string = string2;
                            i i2 = this.aG.d(this.cf);
                            j2 = this;
                            if (string != null) break block6;
                            if (j2.cf == null || i2.b() != net.minecraft.u.g.R) break block7;
                            this.aG.a(this.cf, i2.a(net.minecraft.W.bn.A, false), 4);
                            n4 = n3 = net.minecraft.W.bn.a(this.aG, this.cf, 0);
                            if (string != null) break block8;
                            if (n4 != null) break block9;
                            n4 = this.cf.a();
                        }
                        n3 = n4;
                    }
                    this.g((float)n3.e() + 0.5f, (float)n3.b() + 0.1f, (float)n3.a() + 0.5f);
                }
                this.b2 = false;
                j2 = this;
            }
            if (string == null) {
                if (!j2.aG.C && bl2) {
                    this.aG.l();
                }
                j2 = this;
            }
            int n5 = n2;
            if (string == null) {
                n5 = j2.cp = n5 != 0 ? 0 : 100;
            }
            if (!bl3) break block10;
            this.b(this.cf, false);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(n n2, aA aA2, net.minecraft.w.d d10) {
        String string = net.minecraft.i.g.b();
        boolean bl2 = this.cw.c;
        if (string == null) {
            if (bl2) {
                return true;
            }
            bl2 = d10.G();
        }
        if (string != null) return bl2;
        if (bl2) {
            return false;
        }
        n n3 = n2.a(aA2.h());
        K k2 = this.aG.d(n3).b();
        boolean bl3 = d10.b(k2);
        if (string != null) return bl3;
        if (bl3) return true;
        bl3 = d10.b();
        if (string != null) return bl3;
        if (!bl3) return false;
        return true;
    }

    public void a(boolean bl2) {
        this.cz = bl2;
    }

    @Override
    public void aH() {
        block4: {
            j j2;
            block2: {
                block3: {
                    String string = net.minecraft.i.g.b();
                    super.aH();
                    String string2 = string;
                    this.b(net.minecraft.l.m.S);
                    j2 = this;
                    if (string2 != null) break block2;
                    if (!j2.ai()) break block3;
                    this.c(0.2f);
                    if (string2 == null) break block4;
                }
                j2 = this;
            }
            j2.c(0.05f);
        }
    }

    protected void ag() {
        this.cm = this.cu;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void ae() {
        block47: {
            block48: {
                block46: {
                    block45: {
                        block44: {
                            block42: {
                                block43: {
                                    block40: {
                                        block41: {
                                            block37: {
                                                block39: {
                                                    block38: {
                                                        block33: {
                                                            block34: {
                                                                block31: {
                                                                    block32: {
                                                                        block35: {
                                                                            block36: {
                                                                                var2_1 = new fS();
                                                                                var1_2 = net.minecraft.i.g.b();
                                                                                af.a(var2_1);
                                                                                this.K = this.ae();
                                                                                v0 = this.ae();
                                                                                if (var1_2 == null) {
                                                                                    if (v0 != 0) {
                                                                                        this.A = false;
                                                                                    }
                                                                                    v0 = this.cl;
                                                                                }
                                                                                if (var1_2 == null) {
                                                                                    if (v0 > 0) {
                                                                                        --this.cl;
                                                                                    }
                                                                                    v0 = this.as() ? 1 : 0;
                                                                                }
                                                                                if (var1_2 != null) break block31;
                                                                                if (v0 == 0) break block32;
                                                                                v0 = ++this.cp;
                                                                                if (var1_2 == null) {
                                                                                    if (v0 > 100) {
                                                                                        this.cp = 100;
                                                                                    }
                                                                                    v0 = this.aG.C ? 1 : 0;
                                                                                }
                                                                                if (var1_2 != null) break block33;
                                                                                if (v0 != 0) break block34;
                                                                                v0 = this.k() ? 1 : 0;
                                                                                if (var1_2 != null) break block35;
                                                                                if (v0 != 0) break block36;
                                                                                this.a(true, true, false);
                                                                                if (var1_2 == null) break block34;
                                                                            }
                                                                            v0 = this.aG.R() ? 1 : 0;
                                                                        }
                                                                        if (var1_2 != null) break block33;
                                                                        if (v0 == 0) break block34;
                                                                        this.a(false, true, true);
                                                                        if (var1_2 == null) break block34;
                                                                    }
                                                                    v0 = this.cp;
                                                                }
                                                                if (var1_2 != null) break block33;
                                                                if (v0 <= 0) break block34;
                                                                v0 = ++this.cp;
                                                                if (var1_2 != null) break block33;
                                                                if (v0 >= 110) {
                                                                    this.cp = 0;
                                                                }
                                                            }
                                                            super.ae();
                                                            v0 = this.aG.C ? 1 : 0;
                                                        }
                                                        if (var1_2 != null) break block37;
                                                        if (v0 != 0) break block38;
                                                        v1 = this;
                                                        if (var1_2 != null) break block39;
                                                        if (v1.cm == null) break block38;
                                                        v0 = this.cm.a(this) ? 1 : 0;
                                                        if (var1_2 != null) break block37;
                                                        if (v0 == 0) {
                                                            this.ag();
                                                            this.cm = this.cu;
                                                        }
                                                    }
                                                    v1 = this;
                                                }
                                                v0 = v1.p() ? 1 : 0;
                                            }
                                            if (var1_2 != null) break block40;
                                            if (v0 == 0) break block41;
                                            v0 = this.cw.b ? 1 : 0;
                                            if (var1_2 != null) break block40;
                                            if (v0 != 0) {
                                                this.T();
                                            }
                                        }
                                        this.f();
                                        v0 = this.aG.C ? 1 : 0;
                                    }
                                    if (var1_2 != null) break block42;
                                    if (v0 != 0) break block43;
                                    this.b6.a(this);
                                    this.b(net.minecraft.l.m.P);
                                    v0 = this.aL() ? 1 : 0;
                                    if (var1_2 == null) {
                                        if (v0 != 0) {
                                            this.b(net.minecraft.l.m.V);
                                        }
                                        v0 = this.a4() ? 1 : 0;
                                    }
                                    if (var1_2 != null) break block42;
                                    if (v0 != 0) {
                                        this.b(net.minecraft.l.m.I);
                                    }
                                }
                                v0 = 29999999;
                            }
                            var3_3 = v0;
                            var4_4 = net.minecraft.k.h.b(this.a, -2.9999999E7, 2.9999999E7);
                            var6_5 = net.minecraft.k.h.b(this.ax, -2.9999999E7, 2.9999999E7);
                            cfr_temp_0 = var4_4 - this.a;
                            v2 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                            if (var1_2 != null) break block44;
                            if (v2 != false) break block45;
                            cfr_temp_1 = var6_5 - this.ax;
                            v2 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                        }
                        if (v2 == false) break block46;
                    }
                    this.g(var4_4, this.aF, var6_5);
                }
                ++this.a9;
                var8_6 = this.av();
                v3 = this;
                if (var1_2 != null) break block47;
                if (net.minecraft.w.d.a(v3.ci, var8_6)) break block48;
                v4 = this;
                if (var1_2 == null) {
                    if (!net.minecraft.w.d.d(v4.ci, var8_6)) {
                        this.u();
                    }
                    v4 = this;
                }
                v5 = var8_6;
                if (var1_2 != null) ** GOTO lbl119
                if (v5.G()) {
                    v6 = net.minecraft.w.d.m;
                } else {
                    v5 = var8_6;
lbl119:
                    // 2 sources

                    v6 = v5.C();
                }
                v4.ci = v6;
            }
            this.cj.a();
            v3 = this;
        }
        v3.G();
    }

    @Override
    protected void h(float f10) {
        block2: {
            block6: {
                block5: {
                    String string;
                    block4: {
                        j j2;
                        block3: {
                            string = net.minecraft.i.g.b();
                            if (!(f10 >= 3.0f) || this.aX.w() != net.minecraft.u.h.cq) break block2;
                            int n2 = 1 + net.minecraft.k.h.d(f10);
                            this.aX.a(n2, (net.minecraft.U.B)this);
                            j2 = this;
                            if (string != null) break block3;
                            if (!j2.aX.G()) break block2;
                            j2 = this;
                        }
                        a3 a32 = j2.aN();
                        if (string != null) break block4;
                        if (a32 != net.minecraft.ar.a3.MAIN_HAND) break block5;
                        this.a(net.minecraft.B.X.MAINHAND, net.minecraft.w.d.m);
                    }
                    if (string == null) break block6;
                }
                this.a(net.minecraft.B.X.OFFHAND, net.minecraft.w.d.m);
            }
            this.aX = net.minecraft.w.d.m;
            this.a(net.minecraft.u.E.cl, 0.8f, 0.8f + this.aG.J.nextFloat() * 0.4f);
        }
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(co, Float.valueOf(0.0f));
        this.ap.c(ca, 0);
        this.ap.c(cd, (byte)0);
        this.ap.c(cy, (byte)1);
        this.ap.c(cr, new r());
        this.ap.c(cv, new r());
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean ac() {
        float f10;
        block5: {
            String string;
            block4: {
                string = net.minecraft.i.g.b();
                float f11 = this.V() - 0.0f;
                f10 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                if (string != null) break block4;
                if (f10 <= 0) break block5;
                float f12 = this.V() - this.H();
                f10 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
            }
            if (string != null) return (boolean)f10;
            if (f10 < 0) {
                f10 = 1.0f;
                return (boolean)f10;
            }
        }
        f10 = 0.0f;
        return (boolean)f10;
    }

    public static String[] V() {
        return ct;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(j j2) {
        l l2;
        j j3;
        String string;
        block8: {
            boolean bl2;
            block7: {
                string = net.minecraft.i.g.b();
                bl2 = this.a3();
                if (string != null) break block7;
                if (!bl2) {
                    return false;
                }
                j3 = j2;
                if (string != null) break block8;
                bl2 = j3.ae();
            }
            if (bl2) {
                return false;
            }
            j3 = this;
        }
        if ((l2 = j3.aM()) == null) return true;
        j j4 = j2;
        if (string == null) {
            if (j4 == null) return true;
            j4 = j2;
        }
        l l3 = j4.aM();
        if (string == null) {
            if (l3 != l2) return true;
            l3 = l2;
        }
        boolean bl3 = l3.f();
        if (string != null) return bl3;
        if (bl3) return false;
        return true;
    }

    public int ad() {
        return this.ap.b(ca);
    }

    public net.minecraft.B.f D() {
        return this.ck;
    }

    public void l() {
    }

    @Override
    protected void g() {
        super.g();
        this.aE();
        this.a1 = this.e;
        this.be = this.at;
    }

    @Override
    public boolean as() {
        return this.b2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b() {
        String string = net.minecraft.i.g.b();
        boolean bl2 = this.cw.g;
        if (string == null) {
            if (!bl2) return false;
            bl2 = this.a(2, "");
        }
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Nullable
    public t a(net.minecraft.w.d d10, boolean bl2) {
        return this.a(d10, false, bl2);
    }

    @Override
    public float aa() {
        return (float)this.a(net.minecraft.U.M.d).d();
    }

    public void a(B b10) {
    }

    public y o() {
        return this.cj;
    }

    public void a(net.minecraft.U.e e10) {
    }

    @Override
    public void a(r r2) {
        block14: {
            int n2;
            String string;
            block12: {
                block13: {
                    String string2 = net.minecraft.i.g.b();
                    super.a(r2);
                    string = string2;
                    this.a(net.minecraft.i.j.a(this.cc));
                    u u2 = r2.c("Inventory", 10);
                    this.cB.a(u2);
                    this.cB.a = r2.m("SelectedItemSlot");
                    this.b2 = r2.f("Sleeping");
                    this.cp = r2.q("SleepTimer");
                    this.b7 = r2.d("XpP");
                    this.b4 = r2.m("XpLevel");
                    this.b8 = r2.m("XpTotal");
                    n2 = this.bY = r2.m("XpSeed");
                    if (string == null) {
                        if (n2 == 0) {
                            this.bY = this.g.nextInt();
                        }
                        this.k(r2.m("Score"));
                        n2 = this.b2 ? 1 : 0;
                    }
                    if (string == null) {
                        if (n2 != 0) {
                            this.cf = new n(this);
                            this.a(true, true, false);
                        }
                        n2 = r2.a("SpawnX", 99) ? 1 : 0;
                    }
                    if (string != null) break block12;
                    if (n2 == 0) break block13;
                    n2 = r2.a("SpawnY", 99) ? 1 : 0;
                    if (string != null) break block12;
                    if (n2 == 0) break block13;
                    n2 = r2.a("SpawnZ", 99) ? 1 : 0;
                    if (string != null) break block12;
                    if (n2 != 0) {
                        this.cb = new n(r2.m("SpawnX"), r2.m("SpawnY"), r2.m("SpawnZ"));
                        this.bX = r2.f("SpawnForced");
                    }
                }
                this.b6.b(r2);
                this.cw.b(r2);
                n2 = r2.a("EnderItems", 9) ? 1 : 0;
            }
            if (string == null) {
                if (n2 != 0) {
                    u u3 = r2.c("EnderItems", 10);
                    this.ck.a(u3);
                }
                n2 = r2.a("ShoulderEntityLeft", 10) ? 1 : 0;
            }
            if (string == null) {
                if (n2 != 0) {
                    this.g(r2.h("ShoulderEntityLeft"));
                }
                n2 = r2.a("ShoulderEntityRight", 10) ? 1 : 0;
            }
            if (n2 == 0) break block14;
            this.c(r2.h("ShoulderEntityRight"));
        }
    }

    public void a(net.minecraft.N.W w2) {
    }

    public W S() {
        return this.b6;
    }

    @Override
    public void a(G g10) {
        block12: {
            block11: {
                String string;
                block9: {
                    j j2;
                    block10: {
                        boolean bl2;
                        block8: {
                            String string2 = net.minecraft.i.g.b();
                            super.a(g10);
                            this.c(0.2f, 0.2f);
                            string = string2;
                            this.g(this.a, this.aF, this.ax);
                            this.G = 0.1f;
                            bl2 = "Notch".equals(this.g());
                            if (string == null) {
                                if (bl2) {
                                    this.a(new net.minecraft.w.d(net.minecraft.u.h.ci, 1), true, false);
                                }
                                bl2 = this.aG.M().c("keepInventory");
                            }
                            if (string != null) break block8;
                            if (bl2) break block9;
                            j2 = this;
                            if (string != null) break block10;
                            bl2 = j2.ae();
                        }
                        if (bl2) break block9;
                        this.H();
                        j2 = this;
                    }
                    j2.cB.i();
                }
                if (g10 == null) break block11;
                this.aq = -net.minecraft.k.h.c((this.bJ + this.e) * ((float)Math.PI / 180)) * 0.1f;
                this.d = -net.minecraft.k.h.g((this.bJ + this.e) * ((float)Math.PI / 180)) * 0.1f;
                if (string == null) break block12;
            }
            this.aq = 0.0;
            this.d = 0.0;
        }
        this.b(net.minecraft.l.m.L);
        this.a(net.minecraft.l.m.V);
        this.T();
        this.a(0, false);
    }

    protected net.minecraft.w.d a(t t2) {
        this.aG.f(t2);
        return t2.m();
    }

    public void n() {
    }

    @Override
    public void a(net.minecraft.ar.d d10, float f10, float f11) {
        this.aG.a(this, this.a, this.aF, this.ax, d10, this.ad(), f10, f11);
    }

    protected void c(r r2) {
        this.ap.b(cv, r2);
    }

    @Override
    public double an() {
        return -0.35;
    }

    @Override
    public int am() {
        String string = net.minecraft.i.g.b();
        int n2 = this.cw.b;
        if (string == null) {
            n2 = n2 != 0 ? 1 : 80;
        }
        return n2;
    }

    @Override
    public void a(float f10, float f11, float f12) {
        double d10;
        double d11;
        double d12;
        block6: {
            j j2;
            block4: {
                block5: {
                    d12 = this.a;
                    d11 = this.aF;
                    String string = net.minecraft.i.g.b();
                    d10 = this.ax;
                    j2 = this;
                    if (string != null) break block4;
                    if (!j2.cw.e) break block5;
                    j2 = this;
                    if (string != null) break block4;
                    if (j2.N()) break block5;
                    double d13 = this.G;
                    float f13 = this.a_;
                    float f14 = this.cw.a();
                    int n2 = this.ai();
                    if (string == null) {
                        n2 = n2 != 0 ? 2 : 1;
                    }
                    this.a_ = f14 * (float)n2;
                    super.a(f10, f11, f12);
                    this.G = d13 * 0.6;
                    this.a_ = f13;
                    this.an = 0.0f;
                    this.a(7, false);
                    if (string == null) break block6;
                }
                j2 = this;
            }
            super.a(f10, f11, f12);
        }
        this.d(this.a - d12, this.aF - d11, this.ax - d10);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean f(r r2) {
        String string = net.minecraft.i.g.b();
        boolean bl2 = this.N();
        if (string != null) return bl2;
        if (bl2) return false;
        bl2 = this.A;
        if (string != null) return bl2;
        if (!bl2) return false;
        bl2 = this.aj();
        if (string != null) return bl2;
        if (bl2) return false;
        boolean bl3 = this.r().c();
        if (string == null) {
            if (bl3) {
                this.g(r2);
                return true;
            }
            bl3 = this.p().c();
        }
        if (string != null) return bl3;
        if (!bl3) return false;
        this.c(r2);
        return true;
    }

    public float z() {
        return (float)(1.0 / this.a(net.minecraft.U.M.j).d() * 20.0);
    }

    @Nullable
    public t a(net.minecraft.w.d d10, boolean bl2, boolean bl3) {
        t t2;
        block13: {
            boolean bl4;
            net.minecraft.w.d d11;
            block12: {
                String string;
                block11: {
                    float f10;
                    float f11;
                    block10: {
                        string = net.minecraft.i.g.b();
                        if (d10.G()) {
                            return null;
                        }
                        double d12 = this.aF - (double)0.3f + (double)this.l();
                        t2 = new t(this.aG, this.a, d12, this.ax, d10);
                        t2.a(40);
                        boolean bl5 = bl3;
                        if (string == null) {
                            if (bl5) {
                                t2.c(this.g());
                            }
                            bl5 = bl2;
                        }
                        if (!bl5) break block10;
                        f11 = this.g.nextFloat() * 0.5f;
                        f10 = this.g.nextFloat() * ((float)Math.PI * 2);
                        t2.aq = -net.minecraft.k.h.g(f10) * f11;
                        t2.d = net.minecraft.k.h.c(f10) * f11;
                        t2.G = 0.2f;
                        if (string == null) break block11;
                    }
                    f11 = 0.3f;
                    t2.aq = -net.minecraft.k.h.g(this.e * ((float)Math.PI / 180)) * net.minecraft.k.h.c(this.at * ((float)Math.PI / 180)) * f11;
                    t2.d = net.minecraft.k.h.c(this.e * ((float)Math.PI / 180)) * net.minecraft.k.h.c(this.at * ((float)Math.PI / 180)) * f11;
                    t2.G = -net.minecraft.k.h.g(this.at * ((float)Math.PI / 180)) * f11 + 0.1f;
                    f10 = this.g.nextFloat() * ((float)Math.PI * 2);
                    f11 = 0.02f * this.g.nextFloat();
                    t2.aq += Math.cos(f10) * (double)f11;
                    t2.G += (double)((this.g.nextFloat() - this.g.nextFloat()) * 0.1f);
                    t2.d += Math.sin(f10) * (double)f11;
                }
                d11 = this.a(t2);
                bl4 = bl3;
                if (string != null) break block12;
                if (!bl4) break block13;
                bl4 = d11.G();
            }
            if (!bl4) {
                this.a(net.minecraft.l.m.e(d11.w()), d10.t());
            }
            this.b(net.minecraft.l.m.s);
        }
        return t2;
    }

    @Override
    protected boolean aB() {
        return true;
    }

    @Override
    public float ax() {
        return this.E().b(co).floatValue();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean ah() {
        String string = net.minecraft.i.g.b();
        boolean bl2 = this.cw.e;
        if (string == null) {
            if (bl2) return false;
            bl2 = cj.b.i.a(bK.class).i();
        }
        if (string != null) return bl2;
        if (!bl2) return true;
        bl2 = bK.k.l();
        if (string != null) return bl2;
        if (bl2) return false;
        return true;
    }

    public boolean U() {
        return this.cz;
    }

    @Override
    protected net.minecraft.ar.d aI() {
        return net.minecraft.u.E.cn;
    }

    public void b(n n2, boolean bl2) {
        block4: {
            block2: {
                block3: {
                    String string = net.minecraft.i.g.b();
                    if (string != null) break block2;
                    if (n2 == null) break block3;
                    this.cb = n2;
                    this.bX = bl2;
                    if (string == null) break block4;
                }
                this.cb = null;
            }
            this.bX = false;
        }
    }

    public boolean c() {
        return false;
    }

    public void c(float f10) {
        block3: {
            j j2;
            block4: {
                boolean bl2;
                block2: {
                    String string = net.minecraft.i.g.b();
                    bl2 = this.cw.b;
                    if (string != null) break block2;
                    if (bl2) break block3;
                    j2 = this;
                    if (string != null) break block4;
                    bl2 = j2.aG.C;
                }
                if (bl2) break block3;
                j2 = this;
            }
            j2.b6.a(f10);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean a(n n2, aA aA2) {
        double d10;
        block12: {
            String string;
            block13: {
                n n3;
                block11: {
                    block9: {
                        double d11;
                        block10: {
                            block8: {
                                string = net.minecraft.i.g.b();
                                double d12 = Math.abs(this.a - (double)n2.e()) - 3.0;
                                d11 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                                if (string != null) break block8;
                                if (d11 > 0) break block9;
                                double d13 = Math.abs(this.aF - (double)n2.b()) - 2.0;
                                d11 = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
                            }
                            if (string != null) break block10;
                            if (d11 > 0) break block9;
                            double d14 = Math.abs(this.ax - (double)n2.a()) - 3.0;
                            d11 = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
                        }
                        if (string != null) return (boolean)d11;
                        if (d11 <= 0) {
                            d11 = 1.0;
                            return (boolean)d11;
                        }
                    }
                    n3 = n2.a(aA2.h());
                    double d15 = Math.abs(this.a - (double)n3.e()) - 3.0;
                    d10 = d15 == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1);
                    if (string != null) break block11;
                    if (d10 > 0) break block12;
                    double d16 = Math.abs(this.aF - (double)n3.b()) - 2.0;
                    d10 = d16 == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
                }
                if (string != null) break block13;
                if (d10 > 0) break block12;
                double d17 = Math.abs(this.ax - (double)n3.a()) - 3.0;
                d10 = d17 == 0.0 ? 0 : (d17 < 0.0 ? -1 : 1);
            }
            if (string != null) return (boolean)d10;
            if (d10 <= 0) {
                d10 = 1.0;
                return (boolean)d10;
            }
        }
        d10 = 0.0;
        return (boolean)d10;
    }

    @Override
    protected void D() {
        super.D();
        this.ao().b(net.minecraft.U.M.g).a(1.0);
        this.a(net.minecraft.U.M.d).a(0.1f);
        this.ao().b(net.minecraft.U.M.j);
        this.ao().b(net.minecraft.U.M.a);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(j j2) {
        l l2 = this.aM();
        l l3 = j2.aM();
        String string = net.minecraft.i.g.b();
        l l4 = l2;
        if (string == null) {
            if (l4 == null) {
                return true;
            }
            l4 = l2;
        }
        boolean bl2 = l4.a(l3);
        if (string != null) return bl2;
        if (!bl2) return true;
        bl2 = l2.g();
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private void a(net.minecraft.U.x x2) {
        x2.e(this);
    }

    protected void G() {
        block12: {
            j j2;
            float f10;
            float f11;
            block13: {
                String string;
                block11: {
                    float f12;
                    block10: {
                        float f13;
                        block6: {
                            block9: {
                                boolean bl2;
                                block7: {
                                    block8: {
                                        block4: {
                                            block5: {
                                                string = net.minecraft.i.g.b();
                                                bl2 = this.aK();
                                                if (string != null) break block4;
                                                if (!bl2) break block5;
                                                f11 = 0.6f;
                                                f10 = 0.6f;
                                                if (string == null) break block6;
                                            }
                                            bl2 = this.as();
                                        }
                                        if (string != null) break block7;
                                        if (!bl2) break block8;
                                        f11 = 0.2f;
                                        f10 = 0.2f;
                                        if (string == null) break block6;
                                    }
                                    bl2 = this.a4();
                                }
                                if (!bl2) break block9;
                                f11 = 0.6f;
                                f10 = 1.65f;
                                if (string == null) break block6;
                            }
                            f11 = 0.6f;
                            f10 = 1.8f;
                        }
                        f12 = (f13 = f11 - this.ad) == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                        if (string != null) break block10;
                        if (f12 != false) break block11;
                        float f14 = f10 - this.aD;
                        f12 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                    }
                    if (f12 == false) break block12;
                }
                net.minecraft.k.k k2 = this.m();
                k2 = new net.minecraft.k.k(k2.e, k2.b, k2.d, k2.e + (double)f11, k2.b + (double)f10, k2.d + (double)f11);
                j2 = this;
                if (string != null) break block13;
                if (j2.aG.d(k2)) break block12;
                j2 = this;
            }
            j2.c(f11, f10);
        }
    }

    public void k(int n2) {
        this.ap.b(ca, n2);
    }

    public abstract boolean C();

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(x x2) {
        String string = net.minecraft.i.g.b();
        boolean bl2 = x2.a();
        if (string != null) return bl2;
        if (bl2) {
            return true;
        }
        net.minecraft.w.d d10 = this.av();
        boolean bl3 = d10.G();
        if (string == null) {
            if (bl3) return false;
            bl3 = d10.c();
        }
        if (string == null) {
            if (!bl3) return false;
            bl3 = d10.g().equals(x2.b());
        }
        if (string != null) return bl3;
        if (!bl3) return false;
        return true;
    }

    public GameProfile m() {
        return this.cc;
    }

    public void a(s s2) {
    }

    public void g(net.minecraft.U.x x2) {
    }

    public void a(int n2) {
        int n3 = this.ad();
        this.ap.b(ca, n3 + n2);
    }

    public int x() {
        return this.cp;
    }

    @Override
    public boolean a() {
        return this.e().S[0].M().c("sendCommandFeedback");
    }

    private void e(@Nullable r r2) {
        block6: {
            r r3;
            String string;
            block7: {
                boolean bl2;
                block5: {
                    string = net.minecraft.i.g.b();
                    bl2 = this.aG.C;
                    if (string != null) break block5;
                    if (bl2) break block6;
                    r3 = r2;
                    if (string != null) break block7;
                    bl2 = r3.c();
                }
                if (bl2) break block6;
                r3 = r2;
            }
            net.minecraft.U.x x2 = net.minecraft.U.h.a(r3, this.aG);
            boolean bl3 = x2 instanceof R;
            if (string == null) {
                if (bl3) {
                    ((R)x2).b(this.ah);
                }
                x2.g(this.a, this.aF + (double)0.7f, this.ax);
                bl3 = this.aG.f(x2);
            }
        }
    }

    public b d() {
        return this.aG.c();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected boolean B() {
        String string = net.minecraft.i.g.b();
        float f10 = this.V() - 0.0f;
        float f11 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
        if (string != null) return (boolean)f11;
        if (f11 > 0) {
            f11 = (float)this.as();
            if (string != null) return (boolean)f11;
            if (f11 == false) {
                f11 = 0.0f;
                return (boolean)f11;
            }
        }
        f11 = 1.0f;
        return (boolean)f11;
    }

    public void a(net.minecraft.N.j j2) {
    }

    @Override
    public void d(float f10) {
        String string = net.minecraft.i.g.b();
        if (string == null) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            this.E().b(co, Float.valueOf(f10));
        }
    }

    @Override
    public void aO() {
        super.aO();
        this.s = 0;
    }

    @Override
    public k d() {
        net.minecraft.at.g g10 = new net.minecraft.at.g(net.minecraft.D.m.a(this.aM(), this.g()));
        g10.e().a(new net.minecraft.I.d(net.minecraft.I.a.SUGGEST_COMMAND, "/msg " + this.g() + " "));
        g10.e().a(this.aP());
        g10.e().a(this.g());
        return g10;
    }

    public float a(i i2) {
        float f10;
        float f11;
        block20: {
            block21: {
                String string;
                block18: {
                    block19: {
                        f11 = this.cB.b(i2);
                        string = net.minecraft.i.g.b();
                        float f12 = f11 - 1.0f;
                        f10 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                        if (string != null) break block18;
                        if (f10 <= 0) break block19;
                        int n2 = net.minecraft.ax.T.e(this);
                        net.minecraft.w.d d10 = this.av();
                        f10 = n2;
                        if (string != null) break block18;
                        if (f10 <= 0) break block19;
                        f10 = (float)d10.G();
                        if (string != null) break block18;
                        if (f10 == false) {
                            f11 += (float)(n2 * n2 + 1);
                        }
                    }
                    f10 = (float)this.c(net.minecraft.u.c.u);
                }
                if (string == null) {
                    if (f10 != false) {
                        f11 *= 1.0f + (float)(this.a(net.minecraft.u.c.u).h() + 1) * 0.2f;
                    }
                    f10 = (float)this.c(net.minecraft.u.c.q);
                }
                if (string == null) {
                    if (f10 != false) {
                        float f13;
                        switch (this.a(net.minecraft.u.c.q).h()) {
                            case 0: {
                                f13 = 0.3f;
                                if (string == null) break;
                            }
                            case 1: {
                                f13 = 0.09f;
                                if (string == null) break;
                            }
                            case 2: {
                                f13 = 0.0027f;
                                if (string == null) break;
                            }
                            default: {
                                f13 = 8.1E-4f;
                            }
                        }
                        f11 *= f13;
                    }
                    f10 = (float)this.a(net.minecraft.ac.c.L);
                }
                if (string != null) break block20;
                if (f10 == false) break block21;
                f10 = (float)net.minecraft.ax.T.i(this);
                if (string != null) break block20;
                if (f10 == false) {
                    f11 /= 5.0f;
                }
            }
            f10 = (float)this.A;
        }
        if (f10 == false) {
            f11 /= 5.0f;
        }
        return f11;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean ap() {
        fD fD2 = new fD();
        String string = net.minecraft.i.g.b();
        af.a(fD2);
        String string2 = string;
        boolean bl2 = this.b2;
        if (string2 == null) {
            if (bl2) return false;
            bl2 = super.ap();
        }
        if (string2 == null) {
            if (!bl2) return false;
            bl2 = fD2.a();
        }
        if (string2 != null) return bl2;
        if (bl2) return false;
        return true;
    }

    protected y F() {
        return new y();
    }

    protected void H() {
        int n2 = 0;
        String string = net.minecraft.i.g.b();
        while (n2 < this.cB.e()) {
            net.minecraft.w.d d10 = this.cB.a(n2);
            if (string == null) {
                if (!d10.G()) {
                    net.minecraft.w.d d11 = d10;
                    if (string == null && net.minecraft.ax.T.b(d11)) {
                        d11 = this.cB.b(n2);
                    }
                }
                ++n2;
            }
            if (string == null) continue;
        }
    }

    private void b(@Nullable r r2) {
        block5: {
            String string;
            String string2;
            r r3;
            block3: {
                block4: {
                    String string3;
                    block1: {
                        block2: {
                            string3 = net.minecraft.i.g.b();
                            r3 = r2;
                            if (string3 != null) break block1;
                            if (r3 == null) break block2;
                            r3 = r2;
                            string2 = "Silent";
                            if (string3 != null) break block3;
                            if (!r3.b(string2)) break block4;
                        }
                        r3 = r2;
                    }
                    string2 = "Silent";
                    if (string3 != null) break block3;
                    if (r3.f(string2)) break block5;
                }
                r3 = r2;
                string2 = "id";
            }
            if ((string = r3.j(string2)).equals(net.minecraft.U.h.a(U.class).toString())) {
                net.minecraft.ag.U.b(this.aG, this);
            }
        }
    }

    @Override
    public l aM() {
        return this.d().a(this.g());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(int var1_1, net.minecraft.w.d var2_2) {
        block26: {
            block20: {
                block25: {
                    block23: {
                        block24: {
                            block21: {
                                block22: {
                                    block18: {
                                        block19: {
                                            var3_3 = net.minecraft.i.g.b();
                                            v0 = var1_1;
                                            if (var3_3 != null) ** GOTO lbl13
                                            if (v0 >= 0) {
                                                v0 = var1_1;
                                                v1 = this.cB.c.size();
                                                if (var3_3 == null) {
                                                    if (v0 < v1) {
                                                        this.cB.a(var1_1, var2_2);
                                                        return true;
                                                    } else {
                                                        ** GOTO lbl-1000
                                                    }
                                                }
                                            } else lbl-1000:
                                            // 3 sources

                                            {
                                                v0 = var1_1;
lbl13:
                                                // 2 sources

                                                v1 = 100 + net.minecraft.B.X.HEAD.a();
                                            }
                                            if (var3_3 != null) break block18;
                                            if (v0 != v1) break block19;
                                            var4_4 = net.minecraft.B.X.HEAD;
                                            if (var3_3 == null) break block20;
                                        }
                                        v0 = var1_1;
                                        v1 = 100 + net.minecraft.B.X.CHEST.a();
                                    }
                                    if (var3_3 != null) break block21;
                                    if (v0 != v1) break block22;
                                    var4_4 = net.minecraft.B.X.CHEST;
                                    if (var3_3 == null) break block20;
                                }
                                v0 = var1_1;
                                v1 = 100 + net.minecraft.B.X.LEGS.a();
                            }
                            if (var3_3 != null) break block23;
                            if (v0 != v1) break block24;
                            var4_4 = net.minecraft.B.X.LEGS;
                            if (var3_3 == null) break block20;
                        }
                        v0 = var1_1;
                        v1 = 100 + net.minecraft.B.X.FEET.a();
                    }
                    if (v0 != v1) break block25;
                    var4_4 = net.minecraft.B.X.FEET;
                    if (var3_3 == null) break block20;
                }
                var4_4 = null;
            }
            v2 = var1_1;
            v3 = BADBOOL 98;
            if (var3_3 == null) {
                if (v2 == v3) {
                    this.a(net.minecraft.B.X.MAINHAND, var2_2);
                    return true;
                }
                v2 = var1_1;
                if (var3_3 != null) return v2;
                v3 = BADBOOL 99;
            }
            if (v2 == v3) {
                this.a(net.minecraft.B.X.OFFHAND, var2_2);
                return true;
            }
            if (var4_4 == null) {
                v4 = var5_5 = var1_1 - 200;
                if (var3_3 != null) return (boolean)v4;
                if (v4 < 0) return (boolean)0;
                v4 = var5_5;
                if (var3_3 != null) return (boolean)v4;
                if (v4 >= this.ck.e()) return (boolean)0;
                this.ck.a(var5_5, var2_2);
                return true;
            }
            v5 = var2_2.G();
            if (var3_3 != null) return v5;
            if (v5) break block26;
            v6 = var2_2;
            if (var3_3 != null) ** GOTO lbl79
            if (v6.w() instanceof net.minecraft.w.m) ** GOTO lbl-1000
            v6 = var2_2;
            if (var3_3 == null) {
                ** if (v6.w() instanceof net.minecraft.w.R) goto lbl-1000
lbl-1000:
                // 1 sources

                {
                    if (var4_4 != net.minecraft.B.X.HEAD) {
                        return false;
                    } else {
                        ** GOTO lbl76
                    }
lbl76:
                    // 2 sources

                    ** GOTO lbl81
                }
            }
            ** GOTO lbl79
lbl-1000:
            // 2 sources

            {
                v6 = var2_2;
lbl79:
                // 3 sources

                if (C.a(v6) != var4_4) {
                    return false;
                }
            }
        }
        this.cB.a(var4_4.a() + this.cB.c.size(), var2_2);
        return true;
    }

    public void a(List<net.minecraft.az.k> list) {
    }

    @Override
    protected int aW() {
        return 20;
    }

    @Override
    public void ax() {
        block3: {
            j j2;
            block2: {
                String string = net.minecraft.i.g.b();
                j2 = this;
                if (string != null) break block2;
                if (j2.cw.e) break block3;
                j2 = this;
            }
            super.ax();
        }
    }

    protected void P() {
        this.e(this.r());
        this.g(new r());
        this.e(this.p());
        this.c(new r());
    }

    private static gP c(gP gP2) {
        return gP2;
    }

    public void d(double d10, double d11, double d12) {
        block17: {
            int n2;
            int n3;
            block36: {
                block37: {
                    String string;
                    block28: {
                        block29: {
                            block31: {
                                j j2;
                                block34: {
                                    block35: {
                                        int n4;
                                        block32: {
                                            block33: {
                                                block30: {
                                                    block26: {
                                                        block27: {
                                                            block22: {
                                                                block23: {
                                                                    block25: {
                                                                        block24: {
                                                                            block18: {
                                                                                block19: {
                                                                                    block21: {
                                                                                        block20: {
                                                                                            block16: {
                                                                                                string = net.minecraft.i.g.b();
                                                                                                n3 = this.N();
                                                                                                if (string != null) break block16;
                                                                                                if (n3 != 0) break block17;
                                                                                                n3 = this.a(net.minecraft.ac.c.L);
                                                                                            }
                                                                                            if (string != null) break block18;
                                                                                            if (n3 == 0) break block19;
                                                                                            n2 = Math.round(net.minecraft.k.h.e(d10 * d10 + d11 * d11 + d12 * d12) * 100.0f);
                                                                                            if (string != null) break block20;
                                                                                            if (n2 <= 0) break block21;
                                                                                            this.a(net.minecraft.l.m.Q, n2);
                                                                                        }
                                                                                        this.c(0.01f * (float)n2 * 0.01f);
                                                                                    }
                                                                                    if (string == null) break block17;
                                                                                }
                                                                                n3 = this.aj();
                                                                            }
                                                                            if (string != null) break block22;
                                                                            if (n3 == 0) break block23;
                                                                            n2 = Math.round(net.minecraft.k.h.e(d10 * d10 + d12 * d12) * 100.0f);
                                                                            if (string != null) break block24;
                                                                            if (n2 <= 0) break block25;
                                                                            this.a(net.minecraft.l.m.v, n2);
                                                                        }
                                                                        this.c(0.01f * (float)n2 * 0.01f);
                                                                    }
                                                                    if (string == null) break block17;
                                                                }
                                                                n3 = this.s();
                                                            }
                                                            if (string != null) break block26;
                                                            if (n3 == 0) break block27;
                                                            if (!(d11 > 0.0)) break block17;
                                                            this.a(net.minecraft.l.m.ah, (int)Math.round(d11 * 100.0));
                                                            if (string == null) break block17;
                                                        }
                                                        n3 = this.A;
                                                    }
                                                    if (string != null) break block28;
                                                    if (n3 == 0) break block29;
                                                    n4 = n2 = Math.round(net.minecraft.k.h.e(d10 * d10 + d12 * d12) * 100.0f);
                                                    if (string != null) break block30;
                                                    if (n4 <= 0) break block31;
                                                    n4 = this.ai() ? 1 : 0;
                                                }
                                                if (string != null) break block32;
                                                if (n4 == 0) break block33;
                                                this.a(net.minecraft.l.m.w, n2);
                                                this.c(0.1f * (float)n2 * 0.01f);
                                                if (string == null) break block31;
                                            }
                                            j2 = this;
                                            if (string != null) break block34;
                                            n4 = j2.a4() ? 1 : 0;
                                        }
                                        if (n4 == 0) break block35;
                                        this.a(net.minecraft.l.m.b, n2);
                                        this.c(0.0f * (float)n2 * 0.01f);
                                        if (string == null) break block31;
                                    }
                                    this.a(net.minecraft.l.m.ae, n2);
                                    j2 = this;
                                }
                                j2.c(0.0f * (float)n2 * 0.01f);
                            }
                            if (string == null) break block17;
                        }
                        n3 = this.aK();
                    }
                    if (string != null) break block36;
                    if (n3 == 0) break block37;
                    n2 = Math.round(net.minecraft.k.h.e(d10 * d10 + d11 * d11 + d12 * d12) * 100.0f);
                    this.a(net.minecraft.l.m.l, n2);
                    if (string == null) break block17;
                }
                n3 = Math.round(net.minecraft.k.h.e(d10 * d10 + d12 * d12) * 100.0f);
            }
            if ((n2 = n3) > 25) {
                this.a(net.minecraft.l.m.G, n2);
            }
        }
    }

    @Override
    public void L() {
        this.c(0.6f, 1.8f);
        super.L();
        this.f(this.H());
        this.a2 = 0;
    }

    public int X() {
        return this.bY;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void f(int var1_1) {
        this.b4 += var1_1;
        var2_2 = net.minecraft.i.g.b();
        v0 = this.b4;
        if (var2_2 == null) {
            if (v0 < 0) {
                this.b4 = 0;
                this.b7 = 0.0f;
                this.b8 = 0;
            }
            v0 = var1_1;
        }
        if (var2_2 == null) {
            if (v0 <= 0) return;
            v0 = this.b4 % 5;
        }
        if (var2_2 == null) {
            if (v0 != 0) return;
            cfr_temp_0 = (float)this.ce - ((float)this.H - 100.0f);
            v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
        }
        if (var2_2 == null) {
            if (v0 >= 0) return;
            v0 = this.b4;
        }
        if (var2_2 != null) ** GOTO lbl25
        if (v0 > 30) {
            v1 = 1.0f;
        } else {
            v0 = this.b4;
lbl25:
            // 2 sources

            v1 = (float)v0 / 30.0f;
        }
        var3_3 = v1;
        this.aG.a(null, this.a, this.aF, this.ax, net.minecraft.u.E.fa, this.ad(), var3_3 * 0.75f, 1.0f);
        this.ce = this.H;
    }

    public boolean a(net.minecraft.w.d d10) {
        this.b(d10);
        return this.cB.b(d10);
    }

    public void a(k k2, boolean bl2) {
    }

    public void a(net.minecraft.l.d d10, int n2) {
    }

    public abstract boolean ae();

    public void b(int n2) {
        this.a(n2);
        int n3 = Integer.MAX_VALUE - this.b8;
        String string = net.minecraft.i.g.b();
        if (string == null) {
            if (n2 > n3) {
                n2 = n3;
            }
            this.b7 += (float)n2 / (float)this.R();
        }
        this.b8 += n2;
        while (this.b7 >= 1.0f) {
            this.b7 = (this.b7 - 1.0f) * (float)this.R();
            this.f(1);
            this.b7 /= (float)this.R();
            if (string == null) continue;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(G var1_1, float var2_2) {
        block22: {
            block23: {
                var3_3 = net.minecraft.i.g.b();
                v0 = this.a(var1_1);
                if (var3_3 == null) {
                    if (v0) {
                        return false;
                    }
                    v0 = this.cw.b;
                }
                if (var3_3 == null) {
                    if (v0) {
                        v0 = (boolean)(var1_1.b() ? 1 : 0);
                        if (var3_3 == null) {
                            if (!v0) {
                                return false;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        this.a8 = 0;
                        cfr_temp_0 = this.V() - 0.0f;
                        v0 = (boolean)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
                    }
                }
                if (var3_3 == null) {
                    if (v0 <= false) {
                        return false;
                    }
                    v0 = (boolean)(this.as() ? 1 : 0);
                }
                if (var3_3 != null) break block22;
                if (!v0) break block23;
                v0 = (boolean)(this.aG.C ? 1 : 0);
                if (var3_3 != null) break block22;
                if (!v0) {
                    this.a(true, true, false);
                }
            }
            this.P();
            v0 = (boolean)(var1_1.i() ? 1 : 0);
        }
        if (var3_3 == null) {
            if (v0) {
                v1 = this.aG.g();
                v2 = net.minecraft.ah.e.PEACEFUL;
                if (var3_3 == null) {
                    if (v1 == v2) {
                        var2_2 = 0.0f;
                    }
                    v1 = this.aG.g();
                    v2 = net.minecraft.ah.e.EASY;
                }
                if (var3_3 == null) {
                    if (v1 == v2) {
                        var2_2 = Math.min(var2_2 / 2.0f + 1.0f, var2_2);
                    }
                    v1 = this.aG.g();
                    v2 = net.minecraft.ah.e.HARD;
                }
                if (v1 == v2) {
                    var2_2 = var2_2 * 3.0f / 2.0f;
                }
            }
            v0 = (boolean)((cfr_temp_1 = var2_2 - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
        }
        if (var3_3 == null) {
            if (v0 == false) return false;
            v0 = super.a(var1_1, var2_2);
        }
        if (var3_3 != null) return v0;
        if (v0 == false) return false;
        return true;
    }

    public void b(net.minecraft.l.d d10) {
        this.a(d10, 1);
    }

    private void f() {
        this.b5 = this.cq;
        this.cs = this.b_;
        this.cn = this.b0;
        String string = net.minecraft.i.g.b();
        double d10 = this.a - this.cq;
        double d11 = this.aF - this.b_;
        double d12 = this.ax - this.b0;
        double d13 = 10.0;
        double d14 = d10 - 10.0;
        double d15 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
        if (string == null) {
            double d16;
            if (d15 > 0) {
                this.b5 = this.cq = this.a;
            }
            d15 = (d16 = d12 - 10.0) == 0.0 ? 0 : (d16 > 0.0 ? 1 : -1);
        }
        if (string == null) {
            double d17;
            if (d15 > 0) {
                this.cn = this.b0 = this.ax;
            }
            d15 = (d17 = d11 - 10.0) == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
        }
        if (string == null) {
            double d18;
            if (d15 > 0) {
                this.cs = this.b_ = this.aF;
            }
            d15 = (d18 = d10 - -10.0) == 0.0 ? 0 : (d18 < 0.0 ? -1 : 1);
        }
        if (string == null) {
            double d19;
            if (d15 < 0) {
                this.b5 = this.cq = this.a;
            }
            d15 = (d19 = d12 - -10.0) == 0.0 ? 0 : (d19 < 0.0 ? -1 : 1);
        }
        if (string == null) {
            double d20;
            if (d15 < 0) {
                this.cn = this.b0 = this.ax;
            }
            d15 = (d20 = d11 - -10.0) == 0.0 ? 0 : (d20 < 0.0 ? -1 : 1);
        }
        if (d15 < 0) {
            this.cs = this.b_ = this.aF;
        }
        this.cq += d10 * 0.25;
        this.b0 += d12 * 0.25;
        this.b_ += d11 * 0.25;
    }

    public static void b(net.minecraft.av.b b10) {
        b10.a(net.minecraft.av.f.PLAYER, (net.minecraft.av.g)new d());
    }

    @Override
    public void f(r r2) {
        block8: {
            r r3;
            block7: {
                boolean bl2;
                block6: {
                    String string = net.minecraft.i.g.b();
                    super.f(r2);
                    String string2 = string;
                    r2.b("DataVersion", 1343);
                    r2.a("Inventory", this.cB.b(new u()));
                    r2.b("SelectedItemSlot", this.cB.a);
                    r2.a("Sleeping", this.b2);
                    r2.a("SleepTimer", (short)this.cp);
                    r2.a("XpP", this.b7);
                    r2.b("XpLevel", this.b4);
                    r2.b("XpTotal", this.b8);
                    r2.b("XpSeed", this.bY);
                    r2.b("Score", this.ad());
                    j j2 = this;
                    if (string2 == null) {
                        if (j2.cb != null) {
                            r2.b("SpawnX", this.cb.e());
                            r2.b("SpawnY", this.cb.b());
                            r2.b("SpawnZ", this.cb.a());
                            r2.a("SpawnForced", this.bX);
                        }
                        this.b6.a(r2);
                        this.cw.a(r2);
                        r2.a("EnderItems", this.ck.a());
                        j2 = this;
                    }
                    bl2 = j2.r().c();
                    if (string2 != null) break block6;
                    if (!bl2) {
                        r2.a("ShoulderEntityLeft", this.r());
                    }
                    r3 = this.p();
                    if (string2 != null) break block7;
                    bl2 = r3.c();
                }
                if (bl2) break block8;
                r3 = r2;
            }
            r3.a("ShoulderEntityRight", this.p());
        }
    }

    @Override
    public boolean v() {
        return true;
    }

    /*
     * Exception decompiling
     */
    public void b(net.minecraft.U.x var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:453)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:232)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:646)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:52)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    public boolean E() {
        return this.cw.c;
    }

    public void h(net.minecraft.U.x x2) {
    }

    @Override
    public ay ad() {
        return ay.PLAYERS;
    }

    @Override
    public Iterable<net.minecraft.w.d> aV() {
        return this.cB.e;
    }

    public static UUID a(String string) {
        return UUID.nameUUIDFromBytes(("OfflinePlayer:" + string).getBytes(StandardCharsets.UTF_8));
    }

    public void a(net.minecraft.B.a a10) {
    }

    @Override
    public void a(byte n2) {
        block2: {
            block5: {
                int n3;
                int n4;
                String string;
                block3: {
                    block4: {
                        block0: {
                            block1: {
                                string = net.minecraft.i.g.b();
                                n4 = n2;
                                n3 = 9;
                                if (string != null) break block0;
                                if (n4 != n3) break block1;
                                this.K();
                                if (string == null) break block2;
                            }
                            n4 = n2;
                            n3 = 23;
                        }
                        if (string != null) break block3;
                        if (n4 != n3) break block4;
                        this.cz = false;
                        if (string == null) break block2;
                    }
                    n4 = n2;
                    n3 = 22;
                }
                if (n4 != n3) break block5;
                this.cz = true;
                if (string == null) break block2;
            }
            super.a((byte)n2);
        }
    }

    @Override
    protected void b(net.minecraft.U.B b10) {
        block3: {
            j j2;
            block2: {
                String string = net.minecraft.i.g.b();
                j2 = this;
                if (string != null) break block2;
                super.b(b10);
                if (!(b10.av().w() instanceof am)) break block3;
                j2 = this;
            }
            j2.m(true);
        }
    }

    @Override
    protected net.minecraft.ar.d H() {
        return net.minecraft.u.E.dj;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Nullable
    public t c(boolean bl2) {
        int n2;
        block5: {
            String string;
            block4: {
                string = net.minecraft.i.g.b();
                n2 = bl2;
                if (string != null) break block4;
                if (n2 == 0) break block5;
                n2 = this.cB.k().G() ? 1 : 0;
            }
            if (string != null) return this.a(this.cB.a(this.cB.a, n2), false, true);
            if (n2 == 0) {
                n2 = this.cB.k().t();
                return this.a(this.cB.a(this.cB.a, n2), false, true);
            }
        }
        n2 = 1;
        return this.a(this.cB.a(this.cB.a, n2), false, true);
    }

    @Override
    protected boolean h() {
        String string = net.minecraft.i.g.b();
        boolean bl2 = this.cw.e;
        if (string == null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public aX a(net.minecraft.U.x var1_1, a3 var2_2) {
        block17: {
            block16: {
                var3_3 = net.minecraft.i.g.b();
                v0 = this;
                if (var3_3 == null) {
                    if (v0.ae()) {
                        if (var1_1 instanceof net.minecraft.B.a == false) return net.minecraft.ar.aX.PASS;
                        this.a((net.minecraft.B.a)var1_1);
                        return net.minecraft.ar.aX.PASS;
                    }
                    v0 = this;
                }
                v1 = var4_4 = v0.c(var2_2);
                if (var3_3 != null) ** GOTO lbl15
                if (v1.G()) {
                    v2 = net.minecraft.w.d.m;
                } else {
                    v1 = var4_4;
lbl15:
                    // 2 sources

                    v2 = v1.C();
                }
                var5_5 = v2;
                v3 = var1_1.a(this, var2_2);
                if (var3_3 == null) {
                    if (v3) {
                        if (this.cw.g == false) return net.minecraft.ar.aX.SUCCESS;
                        v4 = var4_4;
                        if (var3_3 == null) {
                            if (v4 != this.c(var2_2)) return net.minecraft.ar.aX.SUCCESS;
                            v4 = var4_4;
                        }
                        if (var3_3 == null) {
                            if (v4.t() >= var5_5.t()) return net.minecraft.ar.aX.SUCCESS;
                            v4 = var4_4;
                        }
                        v4.c(var5_5.t());
                        return net.minecraft.ar.aX.SUCCESS;
                    }
                    v3 = var4_4.G();
                }
                if (var3_3 == null) {
                    if (v3 != false) return net.minecraft.ar.aX.PASS;
                    v3 = var1_1 instanceof net.minecraft.U.B;
                }
                if (var3_3 == null) {
                    if (v3 == false) return net.minecraft.ar.aX.PASS;
                    v3 = this.cw.g;
                }
                if (var3_3 == null) {
                    if (v3) {
                        var4_4 = var5_5;
                    }
                    v3 = var4_4.a(this, (net.minecraft.U.B)var1_1, var2_2);
                }
                if (var3_3 == null) {
                    if (v3 == false) return net.minecraft.ar.aX.PASS;
                    v3 = var4_4.G();
                }
                if (var3_3 != null) break block16;
                if (v3 == false) return net.minecraft.ar.aX.SUCCESS;
                v5 = this;
                if (var3_3 != null) break block17;
                v3 = v5.cw.g;
            }
            if (v3 != false) return net.minecraft.ar.aX.SUCCESS;
            v5 = this;
        }
        v5.a(var2_2, net.minecraft.w.d.m);
        return net.minecraft.ar.aX.SUCCESS;
    }

    public void a(o o2) {
    }
}

