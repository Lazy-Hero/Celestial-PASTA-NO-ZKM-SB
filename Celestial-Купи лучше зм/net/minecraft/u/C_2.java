/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
package net.minecraft.U;

import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.B.X;
import net.minecraft.D.l;
import net.minecraft.J.t;
import net.minecraft.P.m;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.Q.R;
import net.minecraft.T.aZ;
import net.minecraft.T.ae;
import net.minecraft.T.k;
import net.minecraft.U.A;
import net.minecraft.U.B;
import net.minecraft.U.M;
import net.minecraft.U.j;
import net.minecraft.U.s;
import net.minecraft.U.w;
import net.minecraft.U.x;
import net.minecraft.U.z;
import net.minecraft.Z.i;
import net.minecraft.ah.e;
import net.minecraft.ah.h;
import net.minecraft.aj.b;
import net.minecraft.ak.a;
import net.minecraft.ak.ao;
import net.minecraft.ak.at;
import net.minecraft.ar.G;
import net.minecraft.ar.a2;
import net.minecraft.ar.a3;
import net.minecraft.ar.aH;
import net.minecraft.ar.v;
import net.minecraft.av.f;
import net.minecraft.av.g;
import net.minecraft.ax.T;
import net.minecraft.k.n;
import net.minecraft.x.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class C
extends B {
    protected /* synthetic */ at bX;
    protected /* synthetic */ net.minecraft.e.i b7;
    private /* synthetic */ long ca;
    private final /* synthetic */ a2<net.minecraft.w.d> cb;
    private /* synthetic */ r cm;
    private /* synthetic */ String bZ;
    protected /* synthetic */ net.minecraft.ak.d b9;
    public /* synthetic */ int b0;
    public /* synthetic */ int b_;
    private final /* synthetic */ Map<net.minecraft.e.a, Float> b4;
    protected final /* synthetic */ net.minecraft.ak.b ci;
    private /* synthetic */ v b2;
    private final /* synthetic */ a2<net.minecraft.w.d> co;
    private /* synthetic */ UUID ck;
    private /* synthetic */ x b8;
    private static final /* synthetic */ net.minecraft.q.r<Byte> cg;
    private final /* synthetic */ w bY;
    private final /* synthetic */ ao ce;
    protected /* synthetic */ float[] cf;
    public /* synthetic */ n cd;
    protected final /* synthetic */ net.minecraft.ak.b b5;
    private /* synthetic */ B b1;
    private final /* synthetic */ a b3;
    protected /* synthetic */ int ch;
    protected /* synthetic */ float[] b6;
    private /* synthetic */ boolean cj;
    private /* synthetic */ boolean cc;
    private static /* synthetic */ String[] cp;
    private /* synthetic */ boolean cn;
    public /* synthetic */ net.minecraft.A.h cl;

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(cg, (byte)0);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(X var1_1, net.minecraft.w.d var2_2) {
        var3_3 = net.minecraft.U.M.b();
        v0 /* !! */  = net.minecraft.U.s.a;
        if (var3_3 == null) ** GOTO lbl7
        switch (v0 /* !! */ [var1_1.b().ordinal()]) {
            case 1: {
                v0 /* !! */  = (int[])this.cb.set(var1_1.a(), var2_2);
lbl7:
                // 2 sources

                if (var3_3 != null) return;
            }
            case 2: {
                this.co.set(var1_1.a(), var2_2);
                return;
            }
        }
    }

    @Override
    public int au() {
        int[] arrn = net.minecraft.U.M.b();
        C c10 = this;
        if (arrn != null) {
            if (c10.J() == null) {
                return 3;
            }
            c10 = this;
        }
        int n2 = (int)(c10.V() - this.H() * 0.33f);
        int n3 = n2 -= (3 - this.aG.g().a()) * 4;
        if (arrn != null) {
            if (n3 < 0) {
                n2 = 0;
            }
            n3 = n2 + 3;
        }
        return n3;
    }

    public boolean x() {
        return this.cc;
    }

    @Override
    protected void D() {
        super.D();
        this.ao().b(net.minecraft.U.M.b).a(16.0);
    }

    public C(net.minecraft.ah.z z2) {
        super(z2);
        this.cb = net.minecraft.ar.a2.a(2, net.minecraft.w.d.m);
        this.b6 = new float[2];
        this.co = net.minecraft.ar.a2.a(4, net.minecraft.w.d.m);
        this.cf = new float[4];
        this.b4 = Maps.newEnumMap(net.minecraft.e.a.class);
        this.b0 = 0;
        int[] arrn = net.minecraft.U.M.b();
        this.cl = null;
        this.cd = null;
        this.ck = null;
        this.bZ = null;
        this.b5 = new net.minecraft.ak.b(z2 != null && z2.H != null ? z2.H : null);
        this.ci = new net.minecraft.ak.b(z2 != null && z2.H != null ? z2.H : null);
        this.ce = new ao(this);
        this.b9 = new net.minecraft.ak.d(this);
        this.bX = new at(this);
        this.bY = this.m();
        this.b7 = this.a(z2);
        this.b3 = new a(this);
        Arrays.fill(this.cf, 0.085f);
        C c10 = this;
        if (arrn != null) {
            Arrays.fill(c10.b6, 0.085f);
            if (z2 != null && !z2.C) {
                this.H();
            }
            c10 = this;
        }
        UUID uUID = c10.u();
        long l2 = uUID.getLeastSignificantBits();
        this.b0 = (int)(l2 & Integer.MAX_VALUE);
    }

    @Override
    public void E() {
        block5: {
            net.minecraft.ah.z z2;
            block6: {
                C c10;
                block8: {
                    block7: {
                        int[] arrn = net.minecraft.U.M.b();
                        super.E();
                        int[] arrn2 = arrn;
                        this.aG.H.b("looting");
                        z2 = this.aG;
                        if (arrn2 == null) break block6;
                        if (z2.C) break block7;
                        c10 = this;
                        if (arrn2 == null) break block8;
                        if (!c10.x()) break block7;
                        c10 = this;
                        if (arrn2 == null) break block8;
                        if (c10.aW) break block7;
                        z2 = this.aG;
                        if (arrn2 == null) break block6;
                        if (!z2.M().c("mobGriefing")) break block7;
                        for (t t2 : this.aG.a(t.class, this.m().a(1.0, 0.0, 1.0))) {
                            block10: {
                                boolean bl2;
                                block11: {
                                    block9: {
                                        if (arrn2 == null) break block5;
                                        bl2 = t2.P;
                                        if (arrn2 == null) break block9;
                                        if (bl2) break block10;
                                        bl2 = t2.m().G();
                                    }
                                    if (arrn2 == null) break block11;
                                    if (bl2) break block10;
                                    bl2 = t2.e();
                                }
                                if (!bl2) {
                                    this.a(t2);
                                }
                            }
                            if (arrn2 != null) continue;
                        }
                    }
                    c10 = this;
                }
                z2 = c10.aG;
            }
            z2.H.c();
        }
    }

    @Override
    public void g(float f10) {
        super.g(f10);
        this.c(f10);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(int n2, net.minecraft.w.d d10) {
        X x2;
        int[] arrn;
        block8: {
            int n3;
            int n4;
            block15: {
                block16: {
                    block13: {
                        block14: {
                            block11: {
                                block12: {
                                    block9: {
                                        block10: {
                                            block6: {
                                                block7: {
                                                    arrn = net.minecraft.U.M.b();
                                                    n4 = n2;
                                                    n3 = 98;
                                                    if (arrn == null) break block6;
                                                    if (n4 != n3) break block7;
                                                    x2 = net.minecraft.B.X.MAINHAND;
                                                    if (arrn != null) break block8;
                                                }
                                                n4 = n2;
                                                n3 = 99;
                                            }
                                            if (arrn == null) break block9;
                                            if (n4 != n3) break block10;
                                            x2 = net.minecraft.B.X.OFFHAND;
                                            if (arrn != null) break block8;
                                        }
                                        n4 = n2;
                                        n3 = 100 + net.minecraft.B.X.HEAD.a();
                                    }
                                    if (arrn == null) break block11;
                                    if (n4 != n3) break block12;
                                    x2 = net.minecraft.B.X.HEAD;
                                    if (arrn != null) break block8;
                                }
                                n4 = n2;
                                n3 = 100 + net.minecraft.B.X.CHEST.a();
                            }
                            if (arrn == null) break block13;
                            if (n4 != n3) break block14;
                            x2 = net.minecraft.B.X.CHEST;
                            if (arrn != null) break block8;
                        }
                        n4 = n2;
                        n3 = 100 + net.minecraft.B.X.LEGS.a();
                    }
                    if (arrn == null) break block15;
                    if (n4 != n3) break block16;
                    x2 = net.minecraft.B.X.LEGS;
                    if (arrn != null) break block8;
                }
                n4 = n2;
                if (arrn == null) return n4 != 0;
                n3 = 100 + net.minecraft.B.X.FEET.a();
            }
            if (n4 != n3) {
                return 0 != 0;
            }
            x2 = net.minecraft.B.X.FEET;
        }
        boolean bl2 = d10.G();
        if (arrn == null) return bl2;
        if (!bl2) {
            bl2 = C.a(x2, d10);
            if (arrn == null) return bl2;
            if (!bl2 && x2 != net.minecraft.B.X.HEAD) {
                return false;
            }
        }
        this.a(x2, d10);
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(X x2, net.minecraft.w.d d10) {
        X x3;
        X x4;
        int[] arrn;
        block5: {
            X x5;
            block6: {
                x5 = C.a(d10);
                arrn = net.minecraft.U.M.b();
                x4 = x5;
                x3 = x2;
                if (arrn != null) {
                    if (x4 == x3) return true;
                    x4 = x5;
                    x3 = net.minecraft.B.X.MAINHAND;
                }
                if (arrn == null) break block5;
                if (x4 != x3) break block6;
                x4 = x2;
                x3 = net.minecraft.B.X.OFFHAND;
                if (arrn == null) break block5;
                if (x4 == x3) return true;
            }
            x4 = x5;
            x3 = net.minecraft.B.X.OFFHAND;
        }
        if (arrn != null) {
            if (x4 != x3) return false;
            x4 = x2;
            x3 = net.minecraft.B.X.MAINHAND;
        }
        if (x4 != x3) return false;
        return true;
    }

    private float a(float f10, float f11, float f12) {
        float f13;
        float f14;
        block6: {
            float f15;
            float f16;
            block5: {
                f16 = net.minecraft.k.h.b(f11 - f10);
                int[] arrn = net.minecraft.U.M.b();
                f15 = f16 == f12 ? 0 : (f16 > f12 ? 1 : -1);
                if (arrn == null) break block5;
                if (f15 > 0) {
                    f16 = f12;
                }
                f14 = f16;
                f13 = -f12;
                if (arrn == null) break block6;
                float f17 = f14 - f13;
                f15 = f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
            }
            if (f15 < 0) {
                f16 = -f12;
            }
            f14 = f10;
            f13 = f16;
        }
        return f14 + f13;
    }

    public boolean c() {
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = this.ap.b(cg) & 2;
        if (arrn != null) {
            bl2 = bl2;
        }
        return bl2;
    }

    @Override
    protected final void g() {
        C c10;
        block4: {
            block5: {
                int[] arrn = net.minecraft.U.M.b();
                ++this.a8;
                this.aG.H.b("checkDespawn");
                this.F();
                this.aG.H.c();
                this.aG.H.b("sensing");
                this.b3.a();
                this.aG.H.c();
                this.aG.H.b("targetSelector");
                this.ci.a();
                this.aG.H.c();
                this.aG.H.b("goalSelector");
                this.b5.a();
                this.aG.H.c();
                this.aG.H.b("navigation");
                int[] arrn2 = arrn;
                this.b7.d();
                this.aG.H.c();
                this.aG.H.b("mob tick");
                this.h();
                this.aG.H.c();
                c10 = this;
                if (arrn2 == null) break block4;
                if (!c10.N()) break block5;
                c10 = this;
                if (arrn2 == null) break block4;
                if (c10.as() instanceof C) {
                    C c11 = (C)this.as();
                    c11.l().a(this.l().k(), 1.5);
                    c11.w().a(this.w());
                }
            }
            this.aG.H.b("controls");
            this.aG.H.b("move");
            this.b9.a();
            this.aG.H.a("look");
            this.ce.c();
            this.aG.H.a("jump");
            this.bX.a();
            this.aG.H.c();
            c10 = this;
        }
        c10.aG.H.c();
    }

    protected w m() {
        return new w(this);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Nullable
    public static net.minecraft.w.k a(X var0, int var1_1) {
        var2_2 = net.minecraft.U.M.b();
        v0 = net.minecraft.U.s.b[var0.ordinal()];
        if (var2_2 == null) ** GOTO lbl7
        switch (v0) {
            case 1: {
                v0 = var1_1;
lbl7:
                // 2 sources

                if (var2_2 != null) {
                    if (v0 == 0) {
                        return net.minecraft.u.h.ab;
                    }
                    v0 = var1_1;
                }
                v1 = 1;
                if (var2_2 != null) {
                    if (v0 == v1) {
                        return net.minecraft.u.h.S;
                    }
                    v0 = var1_1;
                    v1 = 2;
                }
                if (var2_2 != null) {
                    if (v0 == v1) {
                        return net.minecraft.u.h.p;
                    }
                    v0 = var1_1;
                    v1 = 3;
                }
                if (var2_2 == null) ** GOTO lbl28
                if (v0 == v1) {
                    return net.minecraft.u.h.af;
                }
                v0 = var1_1;
                if (var2_2 == null) ** GOTO lbl33
                v1 = 4;
lbl28:
                // 2 sources

                if (v0 == v1) {
                    return net.minecraft.u.h.bD;
                }
            }
            case 2: {
                v0 = var1_1;
lbl33:
                // 2 sources

                if (var2_2 != null) {
                    if (v0 == 0) {
                        return net.minecraft.u.h.cy;
                    }
                    v0 = var1_1;
                }
                v2 = 1;
                if (var2_2 != null) {
                    if (v0 == v2) {
                        return net.minecraft.u.h.cF;
                    }
                    v0 = var1_1;
                    v2 = 2;
                }
                if (var2_2 != null) {
                    if (v0 == v2) {
                        return net.minecraft.u.h.a4;
                    }
                    v0 = var1_1;
                    v2 = 3;
                }
                if (var2_2 == null) ** GOTO lbl54
                if (v0 == v2) {
                    return net.minecraft.u.h.aK;
                }
                v0 = var1_1;
                if (var2_2 == null) ** GOTO lbl59
                v2 = 4;
lbl54:
                // 2 sources

                if (v0 == v2) {
                    return net.minecraft.u.h.an;
                }
            }
            case 3: {
                v0 = var1_1;
lbl59:
                // 2 sources

                if (var2_2 != null) {
                    if (v0 == 0) {
                        return net.minecraft.u.h.E;
                    }
                    v0 = var1_1;
                }
                v3 = 1;
                if (var2_2 != null) {
                    if (v0 == v3) {
                        return net.minecraft.u.h.bP;
                    }
                    v0 = var1_1;
                    v3 = 2;
                }
                if (var2_2 != null) {
                    if (v0 == v3) {
                        return net.minecraft.u.h.H;
                    }
                    v0 = var1_1;
                    v3 = 3;
                }
                if (var2_2 == null) ** GOTO lbl80
                if (v0 == v3) {
                    return net.minecraft.u.h.aa;
                }
                v0 = var1_1;
                if (var2_2 == null) ** GOTO lbl85
                v3 = 4;
lbl80:
                // 2 sources

                if (v0 == v3) {
                    return net.minecraft.u.h.bv;
                }
            }
            case 4: {
                v0 = var1_1;
lbl85:
                // 2 sources

                if (var2_2 != null) {
                    if (v0 == 0) {
                        return net.minecraft.u.h.K;
                    }
                    v0 = var1_1;
                }
                v4 = 1;
                if (var2_2 != null) {
                    if (v0 == v4) {
                        return net.minecraft.u.h.cs;
                    }
                    v0 = var1_1;
                    v4 = 2;
                }
                if (var2_2 != null) {
                    if (v0 == v4) {
                        return net.minecraft.u.h.b_;
                    }
                    v0 = var1_1;
                    v4 = 3;
                }
                if (var2_2 != null) {
                    if (v0 == v4) {
                        return net.minecraft.u.h.D;
                    }
                    v0 = var1_1;
                    v4 = 4;
                }
                if (v0 != v4) return null;
                return net.minecraft.u.h.w;
            }
        }
        return null;
    }

    protected void F() {
        block9: {
            int n2;
            block17: {
                double d10;
                double d11;
                block18: {
                    int[] arrn;
                    block15: {
                        block16: {
                            net.minecraft.i.j j2;
                            net.minecraft.i.j j3;
                            block14: {
                                block11: {
                                    block13: {
                                        Object object;
                                        C c10;
                                        block12: {
                                            Object object2;
                                            Object object3;
                                            Object object4;
                                            C c11;
                                            block10: {
                                                int n3;
                                                block7: {
                                                    block8: {
                                                        c11 = null;
                                                        arrn = net.minecraft.U.M.b();
                                                        object4 = cq.a(cq.ai);
                                                        object3 = cq.a(cq.af);
                                                        n3 = this.cn;
                                                        if (arrn == null) break block7;
                                                        if (n3 == 0) break block8;
                                                        this.a8 = 0;
                                                        if (arrn != null) break block9;
                                                    }
                                                    object2 = this;
                                                    if (arrn == null) break block10;
                                                    n3 = ((C)object2).a8 & 0x1F;
                                                }
                                                if (n3 != 31) break block11;
                                                object2 = cq.d(cq.aH, this);
                                            }
                                            c10 = c11 = object2;
                                            object = object4;
                                            if (arrn == null) break block12;
                                            if (c10 == object) break block11;
                                            c10 = c11;
                                            object = object3;
                                        }
                                        if (c10 != object) break block13;
                                        this.a8 = 0;
                                        if (arrn != null) break block9;
                                    }
                                    this.a();
                                    if (arrn != null) break block9;
                                }
                                j2 = j3 = this.aG.a((x)this, -1.0);
                                if (arrn == null) break block14;
                                if (j2 == null) break block9;
                                j2 = j3;
                            }
                            double d12 = j2.a - this.a;
                            double d13 = j3.aF - this.aF;
                            double d14 = j3.ax - this.ax;
                            d11 = d12 * d12 + d13 * d13 + d14 * d14;
                            n2 = this.k();
                            if (arrn == null) break block15;
                            if (n2 == 0) break block16;
                            double d15 = d11 - 16384.0;
                            n2 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                            if (arrn == null) break block15;
                            if (n2 > 0) {
                                this.a();
                            }
                        }
                        n2 = this.a8;
                    }
                    if (arrn == null) break block17;
                    if (n2 <= 600) break block18;
                    n2 = this.g.nextInt(800);
                    if (arrn == null) break block17;
                    if (n2 != 0) break block18;
                    double d16 = d11 - 1024.0;
                    n2 = d16 == 0.0 ? 0 : (d16 > 0.0 ? 1 : -1);
                    if (arrn == null) break block17;
                    if (n2 <= 0) break block18;
                    n2 = this.k() ? 1 : 0;
                    if (arrn == null) break block17;
                    if (n2 == 0) break block18;
                    this.a();
                    if (arrn != null) break block9;
                }
                n2 = (d10 = d11 - 1024.0) == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
            }
            if (n2 < 0) {
                this.a8 = 0;
            }
        }
    }

    public boolean T() {
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = this.ap.b(cg) & 1;
        if (arrn != null) {
            bl2 = bl2;
        }
        return bl2;
    }

    public void d(@Nullable B b10) {
        this.b1 = b10;
        cq.e(cq.bJ, this, b10);
    }

    protected void W() {
        block7: {
            C c10;
            block9: {
                block10: {
                    x x2;
                    int[] arrn;
                    block8: {
                        boolean bl2;
                        block6: {
                            arrn = net.minecraft.U.M.b();
                            C c11 = this;
                            if (arrn != null) {
                                if (c11.cm != null) {
                                    this.Y();
                                }
                                c11 = this;
                            }
                            bl2 = c11.cj;
                            if (arrn == null) break block6;
                            if (!bl2) break block7;
                            x2 = this;
                            if (arrn == null) break block8;
                            bl2 = ((B)x2).aL();
                        }
                        if (!bl2) {
                            this.a(true, true);
                        }
                        c10 = this;
                        if (arrn == null) break block9;
                        x2 = c10.b8;
                    }
                    if (x2 == null) break block10;
                    c10 = this;
                    if (arrn == null) break block9;
                    if (!c10.b8.P) break block7;
                }
                c10 = this;
            }
            c10.a(true, true);
        }
    }

    protected boolean b(net.minecraft.i.j j2, a3 a32) {
        return false;
    }

    @Nullable
    protected v D() {
        return null;
    }

    public boolean d() {
        return this.cn;
    }

    @Override
    protected void b(boolean bl2, int n2) {
        X[] arrx = net.minecraft.B.X.values();
        int n3 = arrx.length;
        int[] arrn = net.minecraft.U.M.b();
        int n4 = 0;
        while (n4 < n3) {
            block9: {
                block10: {
                    net.minecraft.w.d d10;
                    block16: {
                        net.minecraft.w.d d11;
                        block17: {
                            int n5;
                            block15: {
                                block14: {
                                    double d12;
                                    block12: {
                                        double d13;
                                        double d14;
                                        block13: {
                                            block11: {
                                                double d15;
                                                X x2 = arrx[n4];
                                                d10 = this.b(x2);
                                                switch (x2.b()) {
                                                    case HAND: {
                                                        d14 = this.b6[x2.a()];
                                                        if (arrn != null) break;
                                                    }
                                                    case ARMOR: {
                                                        d14 = this.cf[x2.a()];
                                                        if (arrn != null) break;
                                                    }
                                                    default: {
                                                        d14 = 0.0;
                                                    }
                                                }
                                                double d16 = (d15 = d14 - 1.0) == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                                                if (arrn != null) {
                                                    d16 = d12 = d16 > 0 ? 1.0 : 0.0;
                                                }
                                                if (arrn == null) break block9;
                                                if (d10.G()) break block10;
                                                n5 = net.minecraft.ax.T.b(d10);
                                                if (arrn == null) break block11;
                                                if (n5 != 0) break block10;
                                                n5 = bl2;
                                            }
                                            if (arrn == null) break block12;
                                            if (n5 != 0) break block13;
                                            n5 = d12;
                                            if (arrn == null) break block12;
                                            if (n5 == 0) break block10;
                                        }
                                        n5 = (d13 = (double)(this.g.nextFloat() - (float)n2 * 0.01f) - d14) == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
                                    }
                                    if (arrn == null) break block14;
                                    if (n5 >= 0) break block10;
                                    n5 = (int)d12;
                                }
                                if (arrn == null) break block15;
                                if (n5 != 0) break block16;
                                d11 = d10;
                                if (arrn == null) break block17;
                                n5 = d11.j() ? 1 : 0;
                            }
                            if (n5 == 0) break block16;
                            d11 = d10;
                        }
                        d11.a(d10.E() - this.g.nextInt(1 + this.g.nextInt(Math.max(d10.E() - 3, 1))));
                    }
                    this.a(d10, 0.0f);
                }
                ++n4;
            }
            if (arrn != null) continue;
        }
    }

    private boolean o() {
        net.minecraft.ah.z z2;
        C c10;
        int[] arrn;
        block13: {
            int n2;
            block12: {
                arrn = net.minecraft.U.M.b();
                n2 = this.Q();
                if (arrn != null) {
                    if (n2 != 0) {
                        return false;
                    }
                    n2 = this.bc;
                }
                if (arrn == null) break block12;
                if (n2 > 0) {
                    return false;
                }
                c10 = this;
                if (arrn == null) break block13;
                n2 = c10.H;
            }
            if (n2 < 20) {
                return false;
            }
            c10 = this;
        }
        net.minecraft.ah.z z3 = z2 = c10.b();
        if (arrn != null) {
            if (z3 == null) {
                return false;
            }
            z3 = z2;
        }
        Object object = z3.k;
        if (arrn != null) {
            if (object.size() != 1) {
                return false;
            }
            object = z2.k.get(0);
        }
        x x2 = (x)object;
        double d10 = Math.max(Math.abs(this.a - x2.a) - 16.0, 0.0);
        double d11 = Math.max(Math.abs(this.ax - x2.ax) - 16.0, 0.0);
        double d12 = d10 * d10 + d11 * d11;
        boolean bl2 = this.b(d12);
        if (arrn != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public static void b(String[] arrstring) {
        cp = arrstring;
    }

    @Override
    public void a(byte by2) {
        block2: {
            block1: {
                int[] arrn;
                block0: {
                    arrn = net.minecraft.U.M.b();
                    if (arrn == null) break block0;
                    if (by2 != 20) break block1;
                    this.Z();
                }
                if (arrn != null) break block2;
            }
            super.a(by2);
        }
    }

    private void G() {
        this.b_ = -this.X();
    }

    public int j() {
        return 40;
    }

    public void a(boolean bl2, boolean bl3) {
        block8: {
            net.minecraft.ah.z z2;
            block13: {
                boolean bl4;
                block12: {
                    int[] arrn;
                    block11: {
                        block9: {
                            block10: {
                                block7: {
                                    arrn = net.minecraft.U.M.b();
                                    bl4 = this.cj;
                                    if (arrn == null) break block7;
                                    if (!bl4) break block8;
                                    this.cj = false;
                                    this.b8 = null;
                                    bl4 = this.aG.C;
                                }
                                if (arrn == null) break block9;
                                if (bl4) break block10;
                                bl4 = bl3;
                                if (arrn == null) break block9;
                                if (bl4) {
                                    this.a(net.minecraft.u.h.G, 1);
                                }
                            }
                            bl4 = this.aG.C;
                        }
                        if (arrn == null) break block11;
                        if (bl4) break block8;
                        bl4 = bl2;
                    }
                    if (arrn == null) break block12;
                    if (!bl4) break block8;
                    z2 = this.aG;
                    if (arrn == null) break block13;
                    bl4 = z2 instanceof net.minecraft.ah.A;
                }
                if (!bl4) break block8;
                z2 = this.aG;
            }
            ((net.minecraft.ah.A)z2).x().a(this, new R(this, null));
        }
    }

    public static String[] aa() {
        return cp;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a1() {
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = this.K();
        if (arrn != null) {
            if (!bl2) return false;
            bl2 = super.a1();
        }
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public void f(r r2) {
        block34: {
            boolean bl2;
            block33: {
                C c10;
                block31: {
                    block32: {
                        int[] arrn;
                        block25: {
                            block26: {
                                Object object;
                                block29: {
                                    x x2;
                                    block30: {
                                        boolean bl3;
                                        block27: {
                                            block28: {
                                                block24: {
                                                    block23: {
                                                        Object object3;
                                                        block22: {
                                                            Object object4;
                                                            block21: {
                                                                int[] arrn2 = net.minecraft.U.M.b();
                                                                super.f(r2);
                                                                r2.a("CanPickUpLoot", this.x());
                                                                r2.a("PersistenceRequired", this.cn);
                                                                u u2 = new u();
                                                                object4 = this.co.iterator();
                                                                arrn = arrn2;
                                                                while (object4.hasNext()) {
                                                                    object3 = (net.minecraft.w.d)object4.next();
                                                                    r object22 = new r();
                                                                    if (arrn != null) {
                                                                        if (arrn != null) {
                                                                            if (!((net.minecraft.w.d)object3).G()) {
                                                                                ((net.minecraft.w.d)object3).a(object22);
                                                                            }
                                                                            u2.a(object22);
                                                                        }
                                                                        if (arrn != null) continue;
                                                                    }
                                                                    break block21;
                                                                }
                                                                r2.a("ArmorItems", u2);
                                                            }
                                                            object4 = new u();
                                                            for (net.minecraft.w.d d10 : this.cb) {
                                                                r r3 = new r();
                                                                if (arrn != null) {
                                                                    if (arrn != null) {
                                                                        if (!d10.G()) {
                                                                            d10.a(r3);
                                                                        }
                                                                        ((u)object4).a(r3);
                                                                    }
                                                                    if (arrn != null) continue;
                                                                }
                                                                break block22;
                                                            }
                                                            r2.a("HandItems", (net.minecraft.P.i)object4);
                                                        }
                                                        object3 = new u();
                                                        for (float f10 : this.cf) {
                                                            ((u)object3).a(new m(f10));
                                                            if (arrn != null) {
                                                                if (arrn != null) continue;
                                                            }
                                                            break block23;
                                                        }
                                                        r2.a("ArmorDropChances", (net.minecraft.P.i)object3);
                                                    }
                                                    u u2 = new u();
                                                    for (float f11 : this.b6) {
                                                        u2.a(new m(f11));
                                                        if (arrn != null) {
                                                            if (arrn != null) continue;
                                                        }
                                                        break block24;
                                                    }
                                                    r2.a("HandDropChances", u2);
                                                    r2.a("Leashed", this.cj);
                                                }
                                                c10 = this;
                                                if (arrn == null) break block25;
                                                if (c10.b8 == null) break block26;
                                                object = new r();
                                                bl3 = this.b8 instanceof B;
                                                if (arrn == null) break block27;
                                                if (!bl3) break block28;
                                                UUID uUID = this.b8.u();
                                                ((r)object).a("UUID", uUID);
                                                break block29;
                                            }
                                            x2 = this.b8;
                                            if (arrn == null) break block30;
                                            bl3 = x2 instanceof z;
                                        }
                                        if (!bl3) break block29;
                                        x2 = this.b8;
                                    }
                                    n n2 = ((z)x2).g();
                                    ((r)object).b("X", n2.e());
                                    ((r)object).b("Y", n2.b());
                                    ((r)object).b("Z", n2.a());
                                }
                                r2.a("Leash", (net.minecraft.P.i)object);
                            }
                            r2.a("LeftHanded", this.c());
                            c10 = this;
                        }
                        if (arrn == null) break block31;
                        if (c10.b2 == null) break block32;
                        r2.a("DeathLootTable", this.b2.toString());
                        long l2 = this.ca - 0L;
                        bl2 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
                        if (arrn == null) break block33;
                        if (bl2) {
                            r2.a("DeathLootTableSeed", this.ca);
                        }
                    }
                    c10 = this;
                }
                bl2 = c10.T();
            }
            if (!bl2) break block34;
            r2.a("NoAI", this.T());
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(X var1_1, float var2_2) {
        var3_3 = net.minecraft.U.M.b();
        if (var3_3 == null) ** GOTO lbl6
        switch (net.minecraft.U.s.a[var1_1.b().ordinal()]) {
            case 1: {
                this.b6[var1_1.a()] = var2_2;
lbl6:
                // 2 sources

                if (var3_3 != null) return;
            }
            case 2: {
                this.cf[var1_1.a()] = var2_2;
                return;
            }
        }
    }

    private void Y() {
        block9: {
            block10: {
                C c10;
                block11: {
                    C c11;
                    block16: {
                        block17: {
                            Comparable<UUID> comparable;
                            boolean bl2;
                            int[] arrn;
                            block12: {
                                block13: {
                                    arrn = net.minecraft.U.M.b();
                                    c10 = this;
                                    if (arrn == null) break block10;
                                    if (!c10.cj) break block11;
                                    c10 = this;
                                    if (arrn == null) break block10;
                                    if (c10.cm == null) break block11;
                                    bl2 = this.cm.p("UUID");
                                    if (arrn == null) break block12;
                                    if (!bl2) break block13;
                                    comparable = this.cm.l("UUID");
                                    for (B b10 : this.aG.a(B.class, this.m().a(10.0))) {
                                        block15: {
                                            block14: {
                                                if (arrn == null) break block9;
                                                if (arrn == null) break block14;
                                                if (!b10.u().equals(comparable)) break block15;
                                                this.a((x)b10, true);
                                            }
                                            if (arrn != null) break;
                                        }
                                        if (arrn != null) continue;
                                    }
                                    if (arrn != null) break block11;
                                }
                                c11 = this;
                                if (arrn == null) break block16;
                                bl2 = c11.cm.a("X", 99);
                            }
                            if (!bl2) break block17;
                            c11 = this;
                            if (arrn == null) break block16;
                            if (!c11.cm.a("Y", 99)) break block17;
                            c11 = this;
                            if (arrn == null) break block16;
                            if (!c11.cm.a("Z", 99)) break block17;
                            comparable = new n(this.cm.m("X"), this.cm.m("Y"), this.cm.m("Z"));
                            Object object = net.minecraft.U.A.b(this.aG, (n)comparable);
                            if (arrn != null) {
                                if (object == null) {
                                    object = net.minecraft.U.A.a(this.aG, (n)comparable);
                                }
                                this.a((x)object, true);
                            }
                            if (arrn != null) break block11;
                        }
                        c11 = this;
                    }
                    c11.a(false, true);
                }
                c10 = this;
            }
            c10.cm = null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(net.minecraft.i.j j2) {
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = this.O();
        if (arrn != null) {
            if (bl2) return false;
            bl2 = this instanceof k;
        }
        if (arrn == null) return bl2;
        if (bl2) return false;
        return true;
    }

    @Override
    public boolean a(x x2, boolean bl2) {
        boolean bl3;
        block4: {
            boolean bl4;
            block5: {
                bl4 = super.a(x2, bl2);
                int[] arrn = net.minecraft.U.M.b();
                bl3 = bl4;
                if (arrn == null) break block4;
                if (!bl3) break block5;
                bl3 = this.O();
                if (arrn == null) break block4;
                if (bl3) {
                    this.a(true, true);
                }
            }
            bl3 = bl4;
        }
        return bl3;
    }

    @Nullable
    public j a(h h2, @Nullable j j2) {
        int[] arrn = net.minecraft.U.M.b();
        this.a(net.minecraft.U.M.b).b(new net.minecraft.j.f("Random spawn bonus", this.g.nextGaussian() * 0.05, 1));
        int[] arrn2 = arrn;
        float f10 = this.g.nextFloat() - 0.05f;
        float f11 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
        if (arrn2 != null) {
            f11 = f11 < 0 ? 1.0f : 0.0f;
        }
        this.n((boolean)f11);
        return j2;
    }

    public float L() {
        return 1.0f;
    }

    public void A() {
        this.cn = true;
    }

    protected void a(h h2) {
        int[] arrn;
        float f10;
        block6: {
            C c10;
            block7: {
                int n2;
                block5: {
                    f10 = h2.b();
                    arrn = net.minecraft.U.M.b();
                    n2 = this.av().G();
                    if (arrn == null) break block5;
                    if (n2 != 0) break block6;
                    c10 = this;
                    if (arrn == null) break block7;
                    float f11 = c10.g.nextFloat() - 0.25f * f10;
                    n2 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                }
                if (n2 >= 0) break block6;
                c10 = this;
            }
            c10.a(net.minecraft.B.X.MAINHAND, net.minecraft.ax.T.a(this.g, this.av(), (int)(5.0f + f10 * (float)this.g.nextInt(18)), false));
        }
        X[] arrx = net.minecraft.B.X.values();
        int n3 = arrx.length;
        int n4 = 0;
        while (n4 < n3) {
            block8: {
                block9: {
                    C c11;
                    net.minecraft.w.d d10;
                    X x2;
                    block10: {
                        x2 = arrx[n4];
                        if (arrn == null) break block8;
                        if (x2.b() != net.minecraft.B.i.ARMOR) break block9;
                        d10 = this.b(x2);
                        if (arrn == null) break block8;
                        if (d10.G()) break block9;
                        c11 = this;
                        if (arrn == null) break block10;
                        if (!(c11.g.nextFloat() < 0.5f * f10)) break block9;
                        c11 = this;
                    }
                    c11.a(x2, net.minecraft.ax.T.a(this.g, d10, (int)(5.0f + f10 * (float)this.g.nextInt(18)), false));
                }
                ++n4;
            }
            if (arrn != null) continue;
        }
    }

    public x e() {
        return this.b8;
    }

    public static void a(net.minecraft.av.b b10, Class<?> class_) {
        b10.a(net.minecraft.av.f.ENTITY, (g)new d(class_, "ArmorItems", "HandItems"));
    }

    public void ag() {
    }

    public void Z() {
        block6: {
            net.minecraft.ah.z z2;
            block7: {
                block8: {
                    int[] arrn = net.minecraft.U.M.b();
                    z2 = this.aG;
                    if (arrn == null) break block7;
                    if (!z2.C) break block8;
                    for (int i2 = 0; i2 < 20; ++i2) {
                        double d10 = this.g.nextGaussian() * 0.02;
                        double d11 = this.g.nextGaussian() * 0.02;
                        double d12 = this.g.nextGaussian() * 0.02;
                        double d13 = 10.0;
                        this.aG.a(net.minecraft.ar.aH.EXPLOSION_NORMAL, this.a + (double)(this.g.nextFloat() * this.ad * 2.0f) - (double)this.ad - d10 * 10.0, this.aF + (double)(this.g.nextFloat() * this.aD) - d11 * 10.0, this.ax + (double)(this.g.nextFloat() * this.ad * 2.0f) - (double)this.ad - d12 * 10.0, d10, d11, d12, new int[0]);
                        if (arrn != null) {
                            if (arrn != null) continue;
                        }
                        break block6;
                    }
                    if (arrn != null) break block6;
                }
                z2 = this.aG;
            }
            z2.a((x)this, (byte)20);
        }
    }

    protected boolean k() {
        return true;
    }

    @Override
    public Iterable<net.minecraft.w.d> aV() {
        return this.co;
    }

    public int p() {
        return 10;
    }

    public boolean O() {
        return this.cj;
    }

    private void f() {
        block6: {
            C c10;
            block4: {
                block5: {
                    ++this.a8;
                    int[] arrn = net.minecraft.U.M.b();
                    c10 = this;
                    if (arrn == null) break block4;
                    if (!(c10 instanceof ae)) break block5;
                    float f10 = this.S();
                    if (arrn == null) break block6;
                    if (f10 > 0.5f) {
                        this.a8 += 2;
                    }
                }
                c10 = this;
            }
            c10.F();
        }
    }

    public net.minecraft.ak.d w() {
        return this.b9;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean u() {
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = this.aG.a(this.m());
        if (arrn != null) {
            if (bl2) return false;
            bl2 = this.aG.a((x)this, this.m()).isEmpty();
        }
        if (arrn != null) {
            if (!bl2) return false;
            bl2 = this.aG.a(this.m(), this);
        }
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static gP g(gP gP2) {
        return gP2;
    }

    @Nullable
    protected net.minecraft.w.k P() {
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean r() {
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = super.r();
        if (arrn != null) {
            if (!bl2) return false;
            bl2 = this.T();
        }
        if (arrn == null) return bl2;
        if (bl2) return false;
        return true;
    }

    public static X a(net.minecraft.w.d d10) {
        block10: {
            net.minecraft.w.k k2;
            int[] arrn;
            block11: {
                net.minecraft.w.k k3;
                block9: {
                    arrn = net.minecraft.U.M.b();
                    k2 = d10.w();
                    k3 = net.minecraft.w.k.b(net.minecraft.u.g.G);
                    if (arrn == null) break block9;
                    if (k2 == k3) break block10;
                    k2 = d10.w();
                    if (arrn == null) break block11;
                    k3 = net.minecraft.u.h.cp;
                }
                if (k2 == k3) break block10;
                k2 = d10.w();
            }
            if (arrn != null) {
                if (k2 instanceof net.minecraft.w.m) {
                    return ((net.minecraft.w.m)d10.w()).A;
                }
                k2 = d10.w();
            }
            net.minecraft.w.k k4 = net.minecraft.u.h.cf;
            if (arrn != null) {
                if (k2 == k4) {
                    return net.minecraft.B.X.CHEST;
                }
                k2 = d10.w();
                k4 = net.minecraft.u.h.cq;
            }
            boolean bl2 = k2 == k4;
            boolean bl3 = cq.cc.b();
            if (arrn != null) {
                if (bl3) {
                    bl2 = cq.g(d10.w(), cq.cc, d10, null);
                }
                bl3 = bl2;
            }
            return bl3 ? net.minecraft.B.X.OFFHAND : net.minecraft.B.X.MAINHAND;
        }
        return net.minecraft.B.X.HEAD;
    }

    protected void H() {
    }

    public void a(net.minecraft.e.a a10, float f10) {
        this.b4.put(a10, Float.valueOf(f10));
    }

    protected void h() {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final boolean a(net.minecraft.i.j var1_1, a3 var2_2) {
        block10: {
            block11: {
                block9: {
                    var3_3 = net.minecraft.U.M.b();
                    v0 /* !! */  = this;
                    if (var3_3 == null) break block9;
                    if (!v0 /* !! */ .O()) break block10;
                    v1 = this;
                    if (var3_3 == null) break block11;
                    v0 /* !! */  = v1.e();
                }
                if (v0 /* !! */  != var1_1) break block10;
                v1 = this;
            }
            v2 = var1_1.cw.g;
            if (var3_3 != null) {
                v2 = v2 == false;
            }
            v1.a(true, v2);
            return true;
        }
        if ((var4_4 = var1_1.c(var2_2)).w() == net.minecraft.u.h.G) {
            v3 = this.a(var1_1);
            if (var3_3 != null) {
                if (v3) {
                    this.a((x)var1_1, true);
                    var4_4.b(1);
                    return true;
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v3 = this.b(var1_1, var2_2);
        }
        if (var3_3 == null) return v3;
        if (v3 != false) return true;
        v3 = super.a(var1_1, var2_2);
        if (var3_3 == null) return v3;
        if (v3 != false) return true;
        return false;
    }

    public int U() {
        return 4;
    }

    public void k(float f10) {
        this.bS = f10;
    }

    /*
     * Enabled aggressive block sorting
     */
    public float a(net.minecraft.e.a a10) {
        float f10;
        Float f11 = this.b4.get((Object)a10);
        int[] arrn = net.minecraft.U.M.b();
        Float f12 = f11;
        if (arrn != null) {
            if (f12 == null) {
                f10 = a10.a();
                return f10;
            }
            f12 = f11;
        }
        f10 = f12.floatValue();
        return f10;
    }

    public net.minecraft.e.i l() {
        return this.b7;
    }

    @Override
    protected int a(net.minecraft.i.j j2) {
        int n2;
        block11: {
            block12: {
                int n3;
                block10: {
                    int n4;
                    int n5;
                    int[] arrn;
                    block9: {
                        int n6;
                        arrn = net.minecraft.U.M.b();
                        n2 = this.ch;
                        if (arrn == null) break block11;
                        if (n2 <= 0) break block12;
                        n5 = this.ch;
                        for (n4 = 0; n4 < this.co.size(); ++n4) {
                            n6 = this.co.get(n4).G() ? 1 : 0;
                            if (arrn != null) {
                                float f10;
                                if (arrn != null) {
                                    if (n6 != 0) continue;
                                    float f11 = this.cf[n4] - 1.0f;
                                    f10 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                                }
                                if (arrn != null) {
                                    if (f10 > 0) continue;
                                    f10 = n5 + (1 + this.g.nextInt(3));
                                }
                                n5 = f10;
                                if (arrn != null) continue;
                            }
                            break block9;
                        }
                        n6 = n4 = 0;
                    }
                    while (n4 < this.cb.size()) {
                        block14: {
                            float f12;
                            block15: {
                                block13: {
                                    n3 = this.cb.get(n4).G() ? 1 : 0;
                                    if (arrn == null) break block10;
                                    if (arrn == null) break block13;
                                    if (n3 != 0) break block14;
                                    float f13 = this.b6[n4] - 1.0f;
                                    f12 = f13 == 0.0f ? 0 : (f13 < 0.0f ? -1 : 1);
                                }
                                if (arrn == null) break block15;
                                if (f12 > 0) break block14;
                                f12 = n5 + (1 + this.g.nextInt(3));
                            }
                            n5 = f12;
                        }
                        ++n4;
                        if (arrn != null) continue;
                    }
                    n3 = n5;
                }
                return n3;
            }
            n2 = this.ch;
        }
        return n2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void m(boolean var1_1) {
        var3_2 = this.ap.b(C.cg);
        var2_3 = net.minecraft.U.M.b();
        v0 = var1_1;
        if (var2_3 == null) ** GOTO lbl9
        if (v0 != 0) {
            v1 = (byte)(var3_2 | 1);
        } else {
            v0 = var3_2 & -2;
lbl9:
            // 2 sources

            v1 = (byte)v0;
        }
        this.ap.b(C.cg, v1);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    protected void a(boolean var1_1, int var2_2, G var3_3) {
        block8: {
            block7: {
                var5_4 = this.b2;
                var4_5 = net.minecraft.U.M.b();
                v0 = var5_4;
                if (var4_5 != null) {
                    if (v0 == null) {
                        var5_4 = this.D();
                    }
                    v0 = var5_4;
                }
                if (v0 == null) break block8;
                var6_6 = this.aG.D().a(var5_4);
                this.b2 = null;
                var7_7 = new b((net.minecraft.ah.A)this.aG).a(this).a(var3_3);
                if (var1_1 && this.bP != null) {
                    var7_7 = var7_7.a(this.bP).a(this.bP.y());
                }
                v1 = this;
                if (var4_5 == null) ** GOTO lbl18
                if (v1.ca == 0L) {
                    v1 = this;
lbl18:
                    // 2 sources

                    v2 = v1.g;
                } else {
                    v2 = new Random(this.ca);
                }
                for (net.minecraft.w.d var9_9 : var6_6.a(v2, var7_7.a())) {
                    this.a(var9_9, 0.0f);
                    if (var4_5 != null) {
                        if (var4_5 != null) continue;
                    }
                    break block7;
                }
                this.b(var1_1, var2_2);
            }
            if (var4_5 != null) return;
        }
        super.a(var1_1, var2_2, var3_3);
    }

    @Override
    protected void c(G g10) {
        this.G();
        super.c(g10);
    }

    protected net.minecraft.e.i a(net.minecraft.ah.z z2) {
        return new net.minecraft.e.k(this, z2);
    }

    @Override
    public net.minecraft.ar.b al() {
        return this.c() ? net.minecraft.ar.b.LEFT : net.minecraft.ar.b.RIGHT;
    }

    @Override
    public void a0() {
        C c10;
        block4: {
            block5: {
                int[] arrn = net.minecraft.U.M.b();
                super.a0();
                int[] arrn2 = arrn;
                this.aG.H.b("mobBaseTick");
                c10 = this;
                if (arrn2 == null) break block4;
                if (!c10.aL()) break block5;
                c10 = this;
                if (arrn2 == null) break block4;
                if (c10.g.nextInt(1000) < this.b_++) {
                    this.G();
                    this.i();
                }
            }
            c10 = this;
        }
        c10.aG.H.c();
    }

    @Override
    protected void a(boolean bl2, int n2) {
        net.minecraft.w.k k2 = this.P();
        int[] arrn = net.minecraft.U.M.b();
        if (k2 != null) {
            int n3;
            int n4 = this.g.nextInt(3);
            int n5 = n2;
            if (arrn != null) {
                if (n5 > 0) {
                    n4 += this.g.nextInt(n2 + 1);
                }
                n5 = n3 = 0;
            }
            while (n3 < n4) {
                this.a(k2, 1);
                ++n3;
                if (arrn != null) continue;
            }
        }
    }

    protected boolean b(net.minecraft.w.d d10) {
        return true;
    }

    public void i() {
        block0: {
            net.minecraft.ar.d d10 = this.q();
            if (d10 == null) break block0;
            this.a(d10, this.x(), this.p());
        }
    }

    /*
     * Exception decompiling
     */
    protected void a(t var1_1) {
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

    @Nullable
    protected net.minecraft.ar.d q() {
        return null;
    }

    static {
        cg = net.minecraft.q.m.a(C.class, net.minecraft.q.h.m);
        C.b(null);
    }

    public boolean C() {
        i i2 = this.aG.d(new n(this).k());
        return i2.a(this);
    }

    public void a(x x2, boolean bl2) {
        block7: {
            C c10;
            block6: {
                boolean bl3;
                block4: {
                    int[] arrn;
                    block5: {
                        this.cj = true;
                        this.b8 = x2;
                        arrn = net.minecraft.U.M.b();
                        bl3 = this.aG.C;
                        if (arrn == null) break block4;
                        if (bl3) break block5;
                        bl3 = bl2;
                        if (arrn == null) break block4;
                        if (!bl3) break block5;
                        bl3 = this.aG instanceof net.minecraft.ah.A;
                        if (arrn == null) break block4;
                        if (bl3) {
                            ((net.minecraft.ah.A)this.aG).x().a(this, new R(this, this.b8));
                        }
                    }
                    c10 = this;
                    if (arrn == null) break block6;
                    bl3 = c10.N();
                }
                if (!bl3) break block7;
                c10 = this;
            }
            c10.aO();
        }
    }

    public at V() {
        return this.bX;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public net.minecraft.w.d b(X x2) {
        int[] arrn = net.minecraft.U.M.b();
        Object object = net.minecraft.U.s.a;
        if (arrn == null) return (net.minecraft.w.d)object;
        switch (object[x2.b().ordinal()]) {
            case 1: {
                object = this.cb.get(x2.a());
                return (net.minecraft.w.d)object;
            }
            case 2: {
                return this.co.get(x2.a());
            }
        }
        return net.minecraft.w.d.m;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void n(boolean var1_1) {
        var3_2 = this.ap.b(C.cg);
        var2_3 = net.minecraft.U.M.b();
        v0 = var1_1;
        if (var2_3 == null) ** GOTO lbl9
        if (v0 != 0) {
            v1 = (byte)(var3_2 | 2);
        } else {
            v0 = var3_2 & -3;
lbl9:
            // 2 sources

            v1 = (byte)v0;
        }
        this.ap.b(C.cg, v1);
    }

    public void c(float f10) {
        this.bU = f10;
    }

    public boolean a(Class<? extends B> class_) {
        return class_ != aZ.class;
    }

    @Nullable
    public B J() {
        return this.b1;
    }

    @Override
    protected float a(float f10, float f11) {
        this.bY.a();
        return f11;
    }

    public void a(x x2, float f10, float f11) {
        double d10;
        double d11;
        double d12;
        block4: {
            x x3;
            block2: {
                block3: {
                    d12 = x2.a - this.a;
                    d11 = x2.ax - this.ax;
                    int[] arrn = net.minecraft.U.M.b();
                    x3 = x2;
                    if (arrn == null) break block2;
                    if (!(x3 instanceof B)) break block3;
                    B b10 = (B)x2;
                    d10 = b10.aF + (double)b10.l() - (this.aF + (double)this.l());
                    if (arrn != null) break block4;
                }
                x3 = x2;
            }
            d10 = (x3.m().b + x2.m().a) / 2.0 - (this.aF + (double)this.l());
        }
        double d13 = net.minecraft.k.h.e(d12 * d12 + d11 * d11);
        float f12 = (float)(net.minecraft.k.h.a(d11, d12) * 57.29577951308232) - 90.0f;
        float f13 = (float)(-(net.minecraft.k.h.a(d10, d13) * 57.29577951308232));
        this.at = this.a(this.at, f13, f11);
        this.e = this.a(this.e, f12, f10);
    }

    /*
     * Exception decompiling
     */
    @Override
    public void ae() {
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

    public void j(float f10) {
        this.bu = f10;
    }

    public ao I() {
        return this.ce;
    }

    @Override
    public l aM() {
        UUID uUID = this.u();
        int[] arrn = net.minecraft.U.M.b();
        C c10 = this;
        if (arrn != null) {
            if (c10.ck != uUID) {
                this.ck = uUID;
                this.bZ = uUID.toString();
            }
            c10 = this;
        }
        return c10.aG.c().a(this.bZ);
    }

    protected void b(h h2) {
        block14: {
            float f10;
            int[] arrn;
            block13: {
                arrn = net.minecraft.U.M.b();
                float f11 = this.g.nextFloat() - 0.15f * h2.b();
                f10 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                if (arrn == null) break block13;
                if (f10 >= 0) break block14;
                f10 = this.g.nextInt(2);
            }
            float f12 = f10;
            float f13 = this.aG.g() == net.minecraft.ah.e.HARD ? 0.1f : 0.25f;
            float f14 = this.g.nextFloat() - 0.095f;
            float f15 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
            if (arrn != null) {
                float f16;
                if (f15 < 0) {
                    ++f12;
                }
                f15 = (f16 = this.g.nextFloat() - 0.095f) == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
            }
            if (arrn != null) {
                float f17;
                if (f15 < 0) {
                    ++f12;
                }
                f15 = (f17 = this.g.nextFloat() - 0.095f) == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
            }
            if (arrn != null) {
                if (f15 < 0) {
                    ++f12;
                }
                f15 = 1.0f;
            }
            float f18 = f15;
            X[] arrx = net.minecraft.B.X.values();
            int n2 = arrx.length;
            int n3 = 0;
            while (n3 < n2) {
                block15: {
                    block16: {
                        float f19;
                        X x2;
                        block17: {
                            net.minecraft.w.d d10;
                            block18: {
                                x2 = arrx[n3];
                                if (arrn == null) break block15;
                                if (x2.b() != net.minecraft.B.i.ARMOR) break block16;
                                d10 = this.b(x2);
                                f19 = f18;
                                if (arrn == null) break block17;
                                if (f19 != false) break block18;
                                float f20 = this.g.nextFloat() - f13;
                                f19 = f20 == 0.0f ? 0 : (f20 < 0.0f ? -1 : 1);
                                if (arrn != null) {
                                    if (f19 < 0 && arrn != null) break;
                                }
                                break block17;
                            }
                            f18 = 0.0f;
                            if (arrn == null) break block15;
                            f19 = (float)d10.G();
                        }
                        if (f19 == false) break block16;
                        net.minecraft.w.k k2 = C.a(x2, (int)f12);
                        if (arrn == null) break block15;
                        if (k2 != null) {
                            this.a(x2, new net.minecraft.w.d(k2));
                        }
                    }
                    ++n3;
                }
                if (arrn != null) continue;
            }
        }
    }

    public void o(boolean bl2) {
        this.cc = bl2;
    }

    @Override
    public Iterable<net.minecraft.w.d> k() {
        return this.cb;
    }

    public a v() {
        return this.b3;
    }

    public boolean K() {
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(r var1_1) {
        block37: {
            block38: {
                block36: {
                    block33: {
                        block35: {
                            block32: {
                                block34: {
                                    block31: {
                                        v0 = net.minecraft.U.M.b();
                                        super.a(var1_1);
                                        var2_2 = v0;
                                        v1 = var1_1.a("CanPickUpLoot", 1);
                                        if (var2_2 != null) {
                                            if (v1) {
                                                this.o(var1_1.f("CanPickUpLoot"));
                                            }
                                            this.cn = var1_1.f("PersistenceRequired");
                                            v1 = var1_1.a("ArmorItems", 9);
                                        }
                                        if (var2_2 != null) {
                                            if (v1) {
                                                var3_3 = var1_1.c("ArmorItems", 10);
                                                for (var4_4 = 0; var4_4 < this.co.size(); ++var4_4) {
                                                    this.co.set(var4_4, new net.minecraft.w.d(var3_3.d(var4_4)));
                                                    if (var2_2 != null) {
                                                        if (var2_2 != null) continue;
                                                    }
                                                    break block31;
                                                }
                                            }
                                            v1 = var1_1.a("HandItems", 9);
                                        }
                                        if (var2_2 != null) {
                                            if (v1) {
                                                var3_3 = var1_1.c("HandItems", 10);
                                                for (var4_4 = 0; var4_4 < this.cb.size(); ++var4_4) {
                                                    this.cb.set(var4_4, new net.minecraft.w.d(var3_3.d(var4_4)));
                                                    if (var2_2 != null) {
                                                        if (var2_2 != null) continue;
                                                    }
                                                    break block32;
                                                }
                                            } else {
                                                ** GOTO lbl30
                                            }
                                        }
                                        break block34;
                                    }
                                    v1 = var1_1.a("ArmorDropChances", 9);
                                }
                                if (var2_2 != null) {
                                    if (v1) {
                                        var3_3 = var1_1.c("ArmorDropChances", 5);
                                        for (var4_4 = 0; var4_4 < var3_3.b(); ++var4_4) {
                                            this.cf[var4_4] = var3_3.f(var4_4);
                                            if (var2_2 != null) {
                                                if (var2_2 != null) continue;
                                            }
                                            break block33;
                                        }
                                    } else {
                                        ** GOTO lbl42
                                    }
                                }
                                break block35;
                            }
                            v1 = var1_1.a("HandDropChances", 9);
                        }
                        if (var2_2 == null) break block36;
                        if (v1) {
                            var3_3 = var1_1.c("HandDropChances", 5);
                            for (var4_4 = 0; var4_4 < var3_3.b(); ++var4_4) {
                                this.b6[var4_4] = var3_3.f(var4_4);
                                if (var2_2 != null) {
                                    if (var2_2 != null) continue;
                                }
                                break;
                            }
                        } else {
                            this.cj = var1_1.f("Leashed");
                        }
                    }
                    v1 = this.cj;
                }
                if (var2_2 == null) break block37;
                if (!v1) break block38;
                v1 = var1_1.a("Leash", 10);
                if (var2_2 == null) break block37;
                if (v1) {
                    this.cm = var1_1.h("Leash");
                }
            }
            this.n(var1_1.f("LeftHanded"));
            if (var2_2 == null) return;
            v1 = var1_1.a("DeathLootTable", 8);
        }
        if (v1) {
            this.b2 = new v(var1_1.j("DeathLootTable"));
            this.ca = var1_1.o("DeathLootTableSeed");
        }
        this.m(var1_1.f("NoAI"));
    }

    public int X() {
        return 80;
    }
}

