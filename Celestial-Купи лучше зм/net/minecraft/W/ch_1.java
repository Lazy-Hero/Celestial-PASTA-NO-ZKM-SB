/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.bG;
import net.minecraft.W.cL;
import net.minecraft.W.d3;
import net.minecraft.Z.i;
import net.minecraft.ad.a;
import net.minecraft.ae.c;
import net.minecraft.ae.d;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.ar.aA;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class ch
extends K {
    protected static final /* synthetic */ k[] C;
    public static final /* synthetic */ c A;
    public static final /* synthetic */ c G;
    protected static final /* synthetic */ k[] z;
    public static final /* synthetic */ c F;
    public static final /* synthetic */ d<d3> E;
    public static final /* synthetic */ c B;
    public static final /* synthetic */ c D;

    public ch(K k2) {
        super(k2.y);
        this.h(this.e.a().a(D, false).a(A, false).a(G, false).a(F, false).a(B, false).a(E, d3.NORMAL));
        this.c(k2.m);
        this.a(k2.b / 3.0f);
        this.a(k2.s);
        this.a(net.minecraft.ad.a.j);
    }

    @Override
    public String n() {
        return net.minecraft.ab.a.a(this.k() + "." + d3.NORMAL.b() + ".name");
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public net.minecraft.Z.d a(t t2, i i2, n n2, aA aA2) {
        net.minecraft.Z.d d10;
        block5: {
            aA aA3;
            aA aA4;
            block4: {
                boolean bl2 = cL.e();
                aA4 = aA2;
                aA3 = aA.UP;
                if (!bl2) break block4;
                if (aA4 == aA3) break block5;
                aA4 = aA2;
                aA3 = aA.DOWN;
            }
            if (aA4 != aA3) {
                d10 = net.minecraft.Z.d.MIDDLE_POLE_THICK;
                return d10;
            }
        }
        d10 = net.minecraft.Z.d.CENTER_BIG;
        return d10;
    }

    @Override
    public k a(i i2, t t2, n n2) {
        i2 = this.e(i2, t2, n2);
        return z[ch.a(i2)];
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        D = net.minecraft.ae.c.a("up");
        A = net.minecraft.ae.c.a("north");
        G = net.minecraft.ae.c.a("east");
        F = net.minecraft.ae.c.a("south");
        B = net.minecraft.ae.c.a("west");
        E = d.a("variant", d3.class);
        z = new k[]{new k(0.25, 0.0, 0.25, 0.75, 1.0, 0.75), new k(0.25, 0.0, 0.25, 0.75, 1.0, 1.0), new k(0.0, 0.0, 0.25, 0.75, 1.0, 0.75), new k(0.0, 0.0, 0.25, 0.75, 1.0, 1.0), new k(0.25, 0.0, 0.0, 0.75, 1.0, 0.75), new k(0.3125, 0.0, 0.0, 0.6875, 0.875, 1.0), new k(0.0, 0.0, 0.0, 0.75, 1.0, 0.75), new k(0.0, 0.0, 0.0, 0.75, 1.0, 1.0), new k(0.25, 0.0, 0.25, 1.0, 1.0, 0.75), new k(0.25, 0.0, 0.25, 1.0, 1.0, 1.0), new k(0.0, 0.0, 0.3125, 1.0, 0.875, 0.6875), new k(0.0, 0.0, 0.25, 1.0, 1.0, 1.0), new k(0.25, 0.0, 0.0, 1.0, 1.0, 0.75), new k(0.25, 0.0, 0.0, 1.0, 1.0, 1.0), new k(0.0, 0.0, 0.0, 1.0, 1.0, 0.75), new k(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)};
        C = new k[]{z[0].c(1.5), z[1].c(1.5), z[2].c(1.5), z[3].c(1.5), z[4].c(1.5), z[5].c(1.5), z[6].c(1.5), z[7].c(1.5), z[8].c(1.5), z[9].c(1.5), z[10].c(1.5), z[11].c(1.5), z[12].c(1.5), z[13].c(1.5), z[14].c(1.5), z[15].c(1.5)};
    }

    @Override
    public void a(i i2, z z2, n n2, k k2, List<k> list, @Nullable x x2, boolean bl2) {
        boolean bl3 = cL.b();
        if (!bl3) {
            if (!bl2) {
                i2 = this.e(i2, z2, n2);
            }
            ch.a(n2, k2, list, C[ch.a(i2)]);
        }
    }

    @Override
    public boolean a(t t2, n n2) {
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean a(t var1_1, n var2_2, aA var3_3) {
        block6: {
            block5: {
                var5_4 = var1_1.d(var2_2);
                var6_5 = var5_4.b();
                var7_6 = var5_4.c(var1_1, var2_2, var3_3);
                var4_7 = cL.b();
                v0 = var7_6;
                v1 = net.minecraft.Z.d.MIDDLE_POLE_THICK;
                if (var4_7) break block5;
                if (v0 == v1) ** GOTO lbl-1000
                v0 = var7_6;
                v1 = net.minecraft.Z.d.MIDDLE_POLE;
            }
            if (v0 != v1) ** GOTO lbl-1000
            v2 = var6_5 instanceof bG;
            if (!var4_7) {
                ** if (!v2) goto lbl-1000
            }
            break block6;
lbl-1000:
            // 2 sources

            {
                v2 = true;
                ** GOTO lbl20
            }
lbl-1000:
            // 2 sources

            {
                v2 = false;
            }
        }
        var8_8 = v2;
        v3 = ch.b(var6_5);
        if (!var4_7) {
            if (!v3) {
                if (var7_6 == net.minecraft.Z.d.SOLID) return true;
            }
            v3 = var8_8;
        }
        if (var4_7 != false) return v3;
        if (v3 != false) return true;
        return false;
    }

    @Override
    public i c(int n2) {
        return this.d().a(E, d3.a(n2));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(i i2, t t2, n n2, aA aA2) {
        boolean bl2 = cL.e();
        if (aA2 != aA.DOWN) return true;
        boolean bl3 = super.b(i2, t2, n2, aA2);
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public void a(a a10, a2<net.minecraft.w.d> a22) {
        d3[] arrd3 = d3.values();
        int n2 = arrd3.length;
        boolean bl2 = cL.e();
        for (int i2 = 0; i2 < n2; ++i2) {
            d3 d32 = arrd3[i2];
            a22.add(new net.minecraft.w.d(this, 1, d32.c()));
            if (bl2) continue;
        }
    }

    private static int a(i i2) {
        int n2 = 0;
        boolean bl2 = cL.b();
        int n3 = i2.b(A).booleanValue();
        if (!bl2) {
            if (n3 != 0) {
                n2 |= 1 << aA.NORTH.k();
            }
            n3 = i2.b(G).booleanValue();
        }
        if (!bl2) {
            if (n3 != 0) {
                n2 |= 1 << aA.EAST.k();
            }
            n3 = i2.b(F).booleanValue() ? 1 : 0;
        }
        if (!bl2) {
            if (n3 != 0) {
                n2 |= 1 << aA.SOUTH.k();
            }
            n3 = i2.b(B).booleanValue() ? 1 : 0;
        }
        if (!bl2) {
            if (n3 != 0) {
                n2 |= 1 << aA.WEST.k();
            }
            n3 = n2;
        }
        return n3;
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public int g(i i2) {
        return i2.b(E).c();
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, D, A, G, B, F, E);
    }

    @Override
    @Nullable
    public k c(i i2, t t2, n n2) {
        i2 = this.e(i2, t2, n2);
        return C[ch.a(i2)];
    }

    @Override
    public int d(i i2) {
        return i2.b(E).c();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected static boolean b(K k2) {
        boolean bl2 = cL.e();
        boolean bl3 = K.a(k2);
        if (!bl2) return bl3;
        if (bl3) return true;
        K k3 = k2;
        K k4 = g.ah;
        if (bl2) {
            if (k3 == k4) return true;
            k3 = k2;
            k4 = g.ae;
        }
        if (bl2) {
            if (k3 == k4) return true;
            k3 = k2;
            k4 = g.G;
        }
        if (bl2) {
            if (k3 == k4) return true;
            k3 = k2;
            k4 = g.y;
        }
        if (k3 != k4) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public i e(i var1_1, t var2_2, n var3_3) {
        block7: {
            block10: {
                block9: {
                    block8: {
                        block5: {
                            block6: {
                                var5_4 = this.a(var2_2, var3_3.i(), aA.SOUTH);
                                var4_5 = cL.b();
                                var6_6 = this.a(var2_2, var3_3.m(), aA.WEST);
                                var7_7 = this.a(var2_2, var3_3.j(), aA.NORTH);
                                var8_8 = this.a(var2_2, var3_3.b(), aA.EAST);
                                v0 = var5_4;
                                if (var4_5) break block5;
                                if (!v0) break block6;
                                v0 = var6_6;
                                if (var4_5) break block5;
                                if (v0) break block6;
                                v0 = var7_7;
                                if (var4_5) break block5;
                                if (!v0) break block6;
                                v0 = var8_8;
                                if (var4_5) break block7;
                                if (!v0) ** GOTO lbl-1000
                            }
                            v0 = var5_4;
                        }
                        if (var4_5) break block8;
                        if (v0) ** GOTO lbl-1000
                        v0 = var6_6;
                    }
                    if (var4_5) break block9;
                    if (!v0) ** GOTO lbl-1000
                    v0 = var7_7;
                }
                if (var4_5) break block10;
                if (v0) ** GOTO lbl-1000
                v0 = var8_8;
            }
            if (!var4_5) {
                ** if (!v0) goto lbl-1000
            }
            break block7;
lbl-1000:
            // 2 sources

            {
                v0 = true;
                ** GOTO lbl39
            }
lbl-1000:
            // 4 sources

            {
                v0 = false;
            }
        }
        v1 = var9_9 = v0;
        if (var4_5 != false) return var1_1.a(ch.D, v1).a(ch.A, var5_4).a(ch.G, var6_6).a(ch.F, var7_7).a(ch.B, var8_8);
        if (v1) {
            v1 = var2_2.a(var3_3.a());
            if (var4_5 != false) return var1_1.a(ch.D, v1).a(ch.A, var5_4).a(ch.G, var6_6).a(ch.F, var7_7).a(ch.B, var8_8);
            if (v1) {
                v1 = false;
                return var1_1.a(ch.D, v1).a(ch.A, var5_4).a(ch.G, var6_6).a(ch.F, var7_7).a(ch.B, var8_8);
            }
        }
        v1 = true;
        return var1_1.a(ch.D, v1).a(ch.A, var5_4).a(ch.G, var6_6).a(ch.F, var7_7).a(ch.B, var8_8);
    }
}

