/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.bF;
import net.minecraft.W.cL;
import net.minecraft.W.dC;
import net.minecraft.W.f;
import net.minecraft.W.h;
import net.minecraft.Z.c;
import net.minecraft.ad.a;
import net.minecraft.ae.d;
import net.minecraft.ae.e;
import net.minecraft.ah.U;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.Q;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.ar.ae;
import net.minecraft.i.j;
import net.minecraft.k.i;
import net.minecraft.k.k;
import net.minecraft.k.l;
import net.minecraft.k.n;
import net.minecraft.u.g;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class cG
extends K {
    protected static final /* synthetic */ k M;
    public static final /* synthetic */ d<dC> L;
    protected static final /* synthetic */ k R;
    public static final /* synthetic */ e V;
    private final /* synthetic */ K B;
    protected static final /* synthetic */ k U;
    protected static final /* synthetic */ k A;
    protected static final /* synthetic */ k J;
    protected static final /* synthetic */ k E;
    protected static final /* synthetic */ k z;
    protected static final /* synthetic */ k F;
    protected static final /* synthetic */ k S;
    protected static final /* synthetic */ k C;
    protected static final /* synthetic */ k I;
    protected static final /* synthetic */ k G;
    public static final /* synthetic */ d<f> P;
    protected static final /* synthetic */ k D;
    protected static final /* synthetic */ k T;
    protected static final /* synthetic */ k H;
    protected static final /* synthetic */ k O;
    protected static final /* synthetic */ k N;
    protected static final /* synthetic */ k K;
    private final /* synthetic */ net.minecraft.Z.i Q;

    @Override
    public boolean a(net.minecraft.Z.i i2, boolean bl2) {
        return this.B.a(i2, bl2);
    }

    @Override
    public boolean i(net.minecraft.Z.i i2) {
        return i2.b(P) == f.TOP;
    }

    @Override
    public int b(net.minecraft.Z.i i2, t t2, n n2) {
        return this.Q.e(t2, n2);
    }

    private static List<k> a(net.minecraft.Z.i i2) {
        ArrayList arrayList;
        block7: {
            dC dC2;
            dC dC3;
            block5: {
                dC dC4;
                block6: {
                    block3: {
                        boolean bl2;
                        block4: {
                            block2: {
                                arrayList = Lists.newArrayList();
                                bl2 = cL.b();
                                boolean bl3 = i2.b(P) == f.TOP;
                                arrayList.add(bl3 ? E : G);
                                dC3 = dC4 = i2.b(L);
                                dC2 = dC.STRAIGHT;
                                if (bl2) break block2;
                                if (dC3 == dC2) break block3;
                                dC3 = dC4;
                                dC2 = dC.INNER_LEFT;
                            }
                            if (bl2) break block4;
                            if (dC3 == dC2) break block3;
                            dC3 = dC4;
                            dC2 = dC.INNER_RIGHT;
                        }
                        if (bl2) break block5;
                        if (dC3 != dC2) break block6;
                    }
                    arrayList.add(cG.c(i2));
                }
                dC3 = dC4;
                dC2 = dC.STRAIGHT;
            }
            if (dC3 == dC2) break block7;
            arrayList.add(cG.d(i2));
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public net.minecraft.Z.i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        net.minecraft.Z.i i2;
        net.minecraft.Z.i i3 = super.a(z2, n2, aA2, f10, f11, f12, n3, b10);
        boolean bl2 = cL.e();
        net.minecraft.Z.i i4 = i3.a(V, b10.K()).a(L, dC.STRAIGHT);
        if (bl2) {
            i3 = i4;
            if (aA2 != aA.DOWN && (aA2 == aA.UP || (double)f11 <= 0.5)) {
                i2 = i3.a(P, f.BOTTOM);
                return i2;
            }
            i4 = i3;
        }
        i2 = i4.a(P, f.TOP);
        return i2;
    }

    @Override
    public boolean q() {
        return this.B.q();
    }

    @Override
    public boolean w(net.minecraft.Z.i i2) {
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public net.minecraft.Z.d a(t var1_1, net.minecraft.Z.i var2_2, n var3_3, aA var4_4) {
        block21: {
            block20: {
                var2_2 = this.e(var2_2, var1_1, var3_3);
                var5_5 = cL.e();
                v0 /* !! */  = var4_4.g();
                if (var5_5) {
                    if (v0 /* !! */  == net.minecraft.ar.Q.Y) {
                        if (var4_4 == aA.UP == (var2_2.b(cG.P) == f.TOP)) {
                            v1 = net.minecraft.Z.d.SOLID;
                            return v1;
                        }
                        v1 = net.minecraft.Z.d.UNDEFINED;
                        return v1;
                    }
                    v0 /* !! */  = var2_2.b(cG.L);
                }
                v2 /* !! */  = var6_6 = (dC)v0 /* !! */ ;
                v3 = dC.OUTER_LEFT;
                if (!var5_5) break block20;
                if (v2 /* !! */  == v3) return net.minecraft.Z.d.UNDEFINED;
                v2 /* !! */  = var6_6;
                if (!var5_5) break block21;
                v3 = dC.OUTER_RIGHT;
            }
            if (v2 /* !! */  == v3) return net.minecraft.Z.d.UNDEFINED;
            v2 /* !! */  = var2_2.b(cG.V);
        }
        var7_7 = (aA)v2 /* !! */ ;
        switch (net.minecraft.W.h.c[var6_6.ordinal()]) {
            case 3: {
                v4 = var7_7;
                v5 = var4_4;
                if (!var5_5) ** GOTO lbl32
                if (v4 == v5) ** GOTO lbl35
                v4 = var7_7;
                v5 = var4_4.d();
lbl32:
                // 2 sources

                if (v4 != v5) {
                    v6 = net.minecraft.Z.d.UNDEFINED;
                    return v6;
                }
lbl35:
                // 3 sources

                v6 = net.minecraft.Z.d.SOLID;
                return v6;
            }
            case 4: {
                v7 = var7_7;
                v8 = var4_4;
                if (!var5_5) ** GOTO lbl44
                if (v7 == v8) ** GOTO lbl47
                v7 = var7_7;
                v8 = var4_4.l();
lbl44:
                // 2 sources

                if (v7 != v8) {
                    v9 = net.minecraft.Z.d.UNDEFINED;
                    return v9;
                }
lbl47:
                // 3 sources

                v9 = net.minecraft.Z.d.SOLID;
                return v9;
            }
            case 5: {
                if (var7_7 == var4_4) {
                    v10 = net.minecraft.Z.d.SOLID;
                    return v10;
                }
                v10 = net.minecraft.Z.d.UNDEFINED;
                return v10;
            }
        }
        return net.minecraft.Z.d.UNDEFINED;
    }

    @Override
    public void a(z z2, n n2, U u2) {
        this.B.a(z2, n2, u2);
    }

    @Override
    public net.minecraft.Z.i a(net.minecraft.Z.i i2, net.minecraft.ar.h h2) {
        aA aA2 = i2.b(V);
        dC dC2 = i2.b(L);
        switch (h2) {
            case LEFT_RIGHT: {
                if (aA2.g() != net.minecraft.ar.Q.Z) break;
                switch (dC2) {
                    case OUTER_LEFT: {
                        return i2.a(ae.CLOCKWISE_180).a(L, dC.OUTER_RIGHT);
                    }
                    case OUTER_RIGHT: {
                        return i2.a(ae.CLOCKWISE_180).a(L, dC.OUTER_LEFT);
                    }
                    case INNER_RIGHT: {
                        return i2.a(ae.CLOCKWISE_180).a(L, dC.INNER_LEFT);
                    }
                    case INNER_LEFT: {
                        return i2.a(ae.CLOCKWISE_180).a(L, dC.INNER_RIGHT);
                    }
                }
                return i2.a(ae.CLOCKWISE_180);
            }
            case FRONT_BACK: {
                if (aA2.g() != net.minecraft.ar.Q.X) break;
                switch (dC2) {
                    case OUTER_LEFT: {
                        return i2.a(ae.CLOCKWISE_180).a(L, dC.OUTER_RIGHT);
                    }
                    case OUTER_RIGHT: {
                        return i2.a(ae.CLOCKWISE_180).a(L, dC.OUTER_LEFT);
                    }
                    case INNER_RIGHT: {
                        return i2.a(ae.CLOCKWISE_180).a(L, dC.INNER_RIGHT);
                    }
                    case INNER_LEFT: {
                        return i2.a(ae.CLOCKWISE_180).a(L, dC.INNER_LEFT);
                    }
                    case STRAIGHT: {
                        return i2.a(ae.CLOCKWISE_180);
                    }
                }
            }
        }
        return super.a(i2, h2);
    }

    @Override
    public boolean p(net.minecraft.Z.i i2) {
        return false;
    }

    @Override
    public int a(z z2) {
        return this.B.a(z2);
    }

    @Override
    public net.minecraft.Z.i c(int n2) {
        net.minecraft.Z.i i2 = this.d().a(P, (n2 & 4) > 0 ? f.TOP : f.BOTTOM);
        i2 = i2.a(V, aA.a(5 - (n2 & 3)));
        return i2;
    }

    private static k c(net.minecraft.Z.i i2) {
        boolean bl2 = cL.b();
        int n2 = i2.b(P) == f.TOP ? 1 : 0;
        int n3 = net.minecraft.W.h.a[i2.b(V).ordinal()];
        if (!bl2) {
            switch (n3) {
                default: {
                    return n2 != 0 ? K : S;
                }
                case 2: {
                    return n2 != 0 ? J : M;
                }
                case 3: {
                    return n2 != 0 ? H : F;
                }
                case 4: 
            }
            n3 = n2;
        }
        return n3 != 0 ? z : N;
    }

    @Override
    public void a(net.minecraft.Z.i i2, z z2, n n2, Random random) {
        this.B.a(i2, z2, n2, random);
    }

    private static k d(net.minecraft.Z.i i2) {
        aA aA2;
        aA aA3 = i2.b(V);
        boolean bl2 = cL.e();
        switch (i2.b(L)) {
            default: {
                aA2 = aA3;
                if (bl2) break;
            }
            case OUTER_RIGHT: {
                aA2 = aA3.l();
                if (bl2) break;
            }
            case INNER_RIGHT: {
                aA2 = aA3.h();
                if (bl2) break;
            }
            case INNER_LEFT: {
                aA2 = aA3.d();
            }
        }
        int n2 = i2.b(P) == f.TOP ? 1 : 0;
        int n3 = net.minecraft.W.h.a[aA2.ordinal()];
        if (bl2) {
            switch (n3) {
                default: {
                    return n2 != 0 ? C : I;
                }
                case 2: {
                    return n2 != 0 ? A : U;
                }
                case 3: {
                    return n2 != 0 ? T : D;
                }
                case 4: 
            }
            n3 = n2;
        }
        return n3 != 0 ? O : R;
    }

    @Override
    public void a(z z2, n n2, net.minecraft.Z.i i2, Random random) {
        this.B.a(z2, n2, i2, random);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(net.minecraft.Z.i i2, t t2, n n2, aA aA2) {
        net.minecraft.Z.i i3 = t2.d(n2.a(aA2));
        boolean bl2 = cL.e();
        boolean bl3 = cG.b(i3);
        if (!bl2) return bl3;
        if (!bl3) return true;
        Enum enum_2 = i3.b(V);
        enum_2 = i2.b(V);
        if (bl2) {
            if (enum_ != enum_2) return true;
            Enum enum_2 = i3.b(P);
            enum_2 = i2.b(P);
        }
        if (enum_ == enum_2) return false;
        return true;
    }

    @Override
    public l a(z z2, n n2, x x2, l l2) {
        return this.B.a(z2, n2, x2, l2);
    }

    @Override
    public float a(x x2) {
        return this.B.a(x2);
    }

    @Override
    public k a(net.minecraft.Z.i i2, z z2, n n2) {
        return this.Q.a(z2, n2);
    }

    @Override
    public void b(z z2, n n2, net.minecraft.Z.i i2) {
        this.Q.a(z2, n2, g.bf, n2);
        this.B.b(z2, n2, this.Q);
    }

    @Override
    protected c f() {
        return new c((K)this, V, P, L);
    }

    @Override
    public net.minecraft.ac.a f(net.minecraft.Z.i i2, t t2, n n2) {
        return this.B.f(this.Q, t2, n2);
    }

    @Override
    public boolean a(z z2, n n2, net.minecraft.Z.i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        return this.B.a(z2, n2, this.Q, j2, a32, aA.DOWN, 0.0f, 0.0f, 0.0f);
    }

    @Override
    public void a(z z2, n n2, net.minecraft.Z.i i2) {
        this.B.a(z2, n2, this.Q);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static dC a(net.minecraft.Z.i var0, t var1_1, n var2_2) {
        block6: {
            block7: {
                var4_3 = var0.b(cG.V);
                var3_4 = cL.b();
                v0 = var5_5 = var1_1.d(var2_2.a(var4_3));
                if (var3_4) break block6;
                if (!cG.b(v0)) break block7;
                v0 = var0;
                if (var3_4) break block6;
                if (v0.b(cG.P) != var5_5.b(cG.P)) break block7;
                v0 = var5_5;
                if (!var3_4) {
                    var6_6 = v0.b(cG.V);
                    if (var6_6.g() != var0.b(cG.V).g()) {
                        v0 = var0;
                        if (!var3_4) {
                            if (cG.a(v0, var1_1, var2_2, var6_6.h())) {
                                if (var6_6 != var4_3.d()) return dC.OUTER_RIGHT;
                                return dC.OUTER_LEFT;
                            } else {
                                ** GOTO lbl21
                            }
                        } else {
                            ** GOTO lbl20
                        }
                    } else {
                        ** GOTO lbl19
                    }
                }
                break block6;
lbl19:
                // 2 sources

                break block7;
lbl20:
                // 2 sources

                break block6;
            }
            v0 = var1_1.d(var2_2.a(var4_3.h()));
        }
        var6_6 = v0;
        v1 = var6_6;
        if (!var3_4) {
            if (cG.b(v1) == false) return dC.STRAIGHT;
            v1 = var0;
        }
        v2 /* !! */  = v1.b(cG.P);
        if (!var3_4) {
            if (v2 /* !! */  != var6_6.b(cG.P)) return dC.STRAIGHT;
            v2 /* !! */  = var6_6.b(cG.V);
        }
        if ((var7_7 = (aA)v2 /* !! */ ).g() == var0.b(cG.V).g()) return dC.STRAIGHT;
        if (cG.a(var0, var1_1, var2_2, var7_7) == false) return dC.STRAIGHT;
        if (var7_7 != var4_3.d()) return dC.INNER_RIGHT;
        return dC.INNER_LEFT;
    }

    public static boolean b(net.minecraft.Z.i i2) {
        return i2.b() instanceof cG;
    }

    @Override
    public boolean a(z z2, n n2) {
        return this.B.a(z2, n2);
    }

    @Override
    public aC p() {
        return this.B.p();
    }

    @Override
    public net.minecraft.Z.i e(net.minecraft.Z.i i2, t t2, n n2) {
        return i2.a(L, cG.a(i2, t2, n2));
    }

    static {
        V = bF.z;
        P = d.a("half", f.class);
        L = d.a("shape", dC.class);
        E = new k(0.0, 0.5, 0.0, 1.0, 1.0, 1.0);
        F = new k(0.0, 0.5, 0.0, 0.5, 1.0, 1.0);
        N = new k(0.5, 0.5, 0.0, 1.0, 1.0, 1.0);
        S = new k(0.0, 0.5, 0.0, 1.0, 1.0, 0.5);
        M = new k(0.0, 0.5, 0.5, 1.0, 1.0, 1.0);
        I = new k(0.0, 0.5, 0.0, 0.5, 1.0, 0.5);
        R = new k(0.5, 0.5, 0.0, 1.0, 1.0, 0.5);
        D = new k(0.0, 0.5, 0.5, 0.5, 1.0, 1.0);
        U = new k(0.5, 0.5, 0.5, 1.0, 1.0, 1.0);
        G = new k(0.0, 0.0, 0.0, 1.0, 0.5, 1.0);
        H = new k(0.0, 0.0, 0.0, 0.5, 0.5, 1.0);
        z = new k(0.5, 0.0, 0.0, 1.0, 0.5, 1.0);
        K = new k(0.0, 0.0, 0.0, 1.0, 0.5, 0.5);
        J = new k(0.0, 0.0, 0.5, 1.0, 0.5, 1.0);
        C = new k(0.0, 0.0, 0.0, 0.5, 0.5, 0.5);
        O = new k(0.5, 0.0, 0.0, 1.0, 0.5, 0.5);
        T = new k(0.0, 0.0, 0.5, 0.5, 0.5, 1.0);
        A = new k(0.5, 0.0, 0.5, 1.0, 0.5, 1.0);
    }

    @Override
    public void a(net.minecraft.Z.i i2, z z2, n n2, k k2, List<k> list, @Nullable x x2, boolean bl2) {
        boolean bl3 = cL.b();
        if (!bl2) {
            i2 = this.e(i2, z2, n2);
        }
        for (k k3 : cG.a(i2)) {
            cG.a(n2, k2, list, k3);
            if (!bl3) continue;
        }
    }

    @Override
    public net.minecraft.Z.i a(net.minecraft.Z.i i2, ae ae2) {
        return i2.a(V, ae2.a(i2.b(V)));
    }

    @Override
    public void a(z z2, n n2, j j2) {
        this.B.a(z2, n2, j2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(z z2, n n2, x x2) {
        this.B.a(z2, n2, x2);
    }

    @Override
    public void d(z z2, n n2, net.minecraft.Z.i i2) {
        this.B.d(z2, n2, i2);
    }

    protected cG(net.minecraft.Z.i i2) {
        super(i2.b().y);
        this.h(this.e.a().a(V, aA.NORTH).a(P, f.BOTTOM).a(L, dC.STRAIGHT));
        this.B = i2.b();
        this.Q = i2;
        this.c(this.B.m);
        this.a(this.B.b / 3.0f);
        this.a(this.B.s);
        this.d(255);
        this.a(net.minecraft.ad.a.r);
    }

    @Override
    public int d(net.minecraft.Z.i i2) {
        int n2 = 0;
        boolean bl2 = cL.b();
        if (!bl2) {
            if (i2.b(P) == f.TOP) {
                n2 |= 4;
            }
            n2 |= 5 - i2.b(V).f();
        }
        return n2;
    }

    @Override
    @Nullable
    public i a(net.minecraft.Z.i i2, z z2, n n2, l l2, l l3) {
        Object object;
        block6: {
            ArrayList arrayList = Lists.newArrayList();
            boolean bl2 = cL.e();
            for (k k2 : cG.a(this.e(i2, z2, n2))) {
                arrayList.add(this.a(n2, l2, l3, k2));
                if (bl2) continue;
            }
            Object object2 = null;
            double d10 = 0.0;
            for (i i3 : arrayList) {
                block8: {
                    double d11;
                    i i4;
                    block7: {
                        object = i3;
                        if (!bl2) break block6;
                        if (!bl2) break block7;
                        if (object == null) break block8;
                        i4 = i3;
                    }
                    double d12 = d11 = i4.c.f(l3);
                    if (bl2 && d12 > d10) {
                        object2 = i3;
                        d12 = d10 = d11;
                    }
                }
                if (bl2) continue;
            }
            object = object2;
        }
        return object;
    }
}

