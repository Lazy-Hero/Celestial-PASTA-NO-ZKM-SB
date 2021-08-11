/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.W;

import com.google.common.base.Predicate;
import java.util.List;
import java.util.Random;
import net.minecraft.J.u;
import net.minecraft.J.v;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.bp;
import net.minecraft.W.c0;
import net.minecraft.W.cL;
import net.minecraft.W.n;
import net.minecraft.W.y;
import net.minecraft.Z.i;
import net.minecraft.ae.a;
import net.minecraft.ae.c;
import net.minecraft.ae.d;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.ae;
import net.minecraft.ar.e;
import net.minecraft.ar.h;
import net.minecraft.k.k;

public class bK
extends bp {
    public static final /* synthetic */ c D;
    public static final /* synthetic */ d<cL> C;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public i a(i var1_1, ae var2_2) {
        var3_3 = cL.b();
        v0 = net.minecraft.W.y.a[var2_2.ordinal()];
        if (var3_3) ** GOTO lbl7
        switch (v0) {
            case 1: {
                v0 = net.minecraft.W.y.b[var1_1.b(bK.C).ordinal()];
lbl7:
                // 2 sources

                if (var3_3) ** GOTO lbl27
                switch (v0) {
                    case 1: {
                        return var1_1.a(bK.C, cL.ASCENDING_WEST);
                    }
                    case 2: {
                        return var1_1.a(bK.C, cL.ASCENDING_EAST);
                    }
                    case 3: {
                        return var1_1.a(bK.C, cL.ASCENDING_SOUTH);
                    }
                    case 4: {
                        return var1_1.a(bK.C, cL.ASCENDING_NORTH);
                    }
                    case 5: {
                        return var1_1.a(bK.C, cL.NORTH_WEST);
                    }
                    case 6: {
                        return var1_1.a(bK.C, cL.NORTH_EAST);
                    }
                    case 7: {
                        return var1_1.a(bK.C, cL.SOUTH_EAST);
                    }
                    case 8: {
                        return var1_1.a(bK.C, cL.SOUTH_WEST);
                    }
                }
            }
            case 2: {
                v0 = net.minecraft.W.y.b[var1_1.b(bK.C).ordinal()];
lbl27:
                // 2 sources

                if (var3_3) ** GOTO lbl51
                switch (v0) {
                    case 1: {
                        return var1_1.a(bK.C, cL.ASCENDING_NORTH);
                    }
                    case 2: {
                        return var1_1.a(bK.C, cL.ASCENDING_SOUTH);
                    }
                    case 3: {
                        return var1_1.a(bK.C, cL.ASCENDING_WEST);
                    }
                    case 4: {
                        return var1_1.a(bK.C, cL.ASCENDING_EAST);
                    }
                    case 5: {
                        return var1_1.a(bK.C, cL.NORTH_EAST);
                    }
                    case 6: {
                        return var1_1.a(bK.C, cL.SOUTH_EAST);
                    }
                    case 7: {
                        return var1_1.a(bK.C, cL.SOUTH_WEST);
                    }
                    case 8: {
                        return var1_1.a(bK.C, cL.NORTH_WEST);
                    }
                    case 9: {
                        return var1_1.a(bK.C, cL.EAST_WEST);
                    }
                    case 10: {
                        return var1_1.a(bK.C, cL.NORTH_SOUTH);
                    }
                }
            }
            case 3: {
                v0 = net.minecraft.W.y.b[var1_1.b(bK.C).ordinal()];
lbl51:
                // 2 sources

                switch (v0) {
                    case 1: {
                        return var1_1.a(bK.C, cL.ASCENDING_SOUTH);
                    }
                    case 2: {
                        return var1_1.a(bK.C, cL.ASCENDING_NORTH);
                    }
                    case 3: {
                        return var1_1.a(bK.C, cL.ASCENDING_EAST);
                    }
                    case 4: {
                        return var1_1.a(bK.C, cL.ASCENDING_WEST);
                    }
                    case 5: {
                        return var1_1.a(bK.C, cL.SOUTH_WEST);
                    }
                    case 6: {
                        return var1_1.a(bK.C, cL.NORTH_WEST);
                    }
                    case 7: {
                        return var1_1.a(bK.C, cL.NORTH_EAST);
                    }
                    case 8: {
                        return var1_1.a(bK.C, cL.SOUTH_EAST);
                    }
                    case 9: {
                        return var1_1.a(bK.C, cL.EAST_WEST);
                    }
                    case 10: {
                        return var1_1.a(bK.C, cL.NORTH_SOUTH);
                    }
                }
                return var1_1;
            }
        }
        return var1_1;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean o(i i2) {
        return true;
    }

    @Override
    public int a(i i2, t t2, net.minecraft.k.n n2, aA aA2) {
        boolean bl2 = cL.e();
        int n3 = i2.b(D).booleanValue();
        if (bl2) {
            n3 = n3 != 0 ? 15 : 0;
        }
        return n3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public i a(i var1_1, h var2_2) {
        var4_3 = var1_1.b(bK.C);
        var3_4 = cL.e();
        v0 = net.minecraft.W.y.c[var2_2.ordinal()];
        if (!var3_4) ** GOTO lbl8
        switch (v0) {
            case 1: {
                v0 = net.minecraft.W.y.b[var4_3.ordinal()];
lbl8:
                // 2 sources

                switch (v0) {
                    case 3: {
                        return var1_1.a(bK.C, cL.ASCENDING_SOUTH);
                    }
                    case 4: {
                        return var1_1.a(bK.C, cL.ASCENDING_NORTH);
                    }
                    case 5: {
                        return var1_1.a(bK.C, cL.NORTH_EAST);
                    }
                    case 6: {
                        return var1_1.a(bK.C, cL.NORTH_WEST);
                    }
                    case 7: {
                        return var1_1.a(bK.C, cL.SOUTH_WEST);
                    }
                    case 8: {
                        return var1_1.a(bK.C, cL.SOUTH_EAST);
                    }
                }
                return super.a(var1_1, var2_2);
            }
            case 2: {
                switch (net.minecraft.W.y.b[var4_3.ordinal()]) {
                    case 1: {
                        return var1_1.a(bK.C, cL.ASCENDING_WEST);
                    }
                    case 2: {
                        return var1_1.a(bK.C, cL.ASCENDING_EAST);
                    }
                    default: {
                        if (var3_4 != false) return super.a(var1_1, var2_2);
                    }
                    case 5: {
                        return var1_1.a(bK.C, cL.SOUTH_WEST);
                    }
                    case 6: {
                        return var1_1.a(bK.C, cL.SOUTH_EAST);
                    }
                    case 7: {
                        return var1_1.a(bK.C, cL.NORTH_EAST);
                    }
                    case 8: 
                }
                return var1_1.a(bK.C, cL.NORTH_WEST);
            }
        }
        return super.a(var1_1, var2_2);
    }

    @Override
    public a<cL> a() {
        return C;
    }

    @Override
    public int a(z z2) {
        return 20;
    }

    protected <T extends u> List<T> a(z z2, net.minecraft.k.n n2, Class<T> class_, Predicate<x> ... arrpredicate) {
        k k2 = this.a(n2);
        return arrpredicate.length != 1 ? z2.a(class_, k2) : z2.a(class_, k2, arrpredicate[0]);
    }

    @Override
    public void a(z z2, net.minecraft.k.n n2, i i2, Random random) {
        block2: {
            boolean bl2;
            block1: {
                boolean bl3 = cL.b();
                bl2 = z2.C;
                if (bl3) break block1;
                if (bl2) break block2;
                bl2 = i2.b(D);
            }
            if (bl2) {
                this.c(z2, n2, i2);
            }
        }
    }

    static {
        C = d.a("shape", cL.class, new c0());
        D = net.minecraft.ae.c.a("powered");
    }

    private void c(z z2, net.minecraft.k.n n2, i i2) {
        boolean bl2;
        block13: {
            boolean bl3;
            block14: {
                boolean bl4;
                boolean bl5;
                block11: {
                    block12: {
                        bl5 = i2.b(D);
                        bl3 = false;
                        bl4 = cL.e();
                        List<u> list = this.a(z2, n2, u.class, new Predicate[0]);
                        bl2 = list.isEmpty();
                        if (bl4) {
                            if (!bl2) {
                                bl3 = true;
                            }
                            bl2 = bl3;
                        }
                        if (!bl4) break block11;
                        if (!bl2) break block12;
                        bl2 = bl5;
                        if (!bl4) break block11;
                        if (!bl2) {
                            z2.a(n2, i2.a(D, true), 3);
                            this.a(z2, n2, i2, true);
                            z2.a(n2, (K)this, false);
                            z2.a(n2.k(), (K)this, false);
                            z2.b(n2, n2);
                        }
                    }
                    bl2 = bl3;
                }
                if (!bl4) break block13;
                if (bl2) break block14;
                bl2 = bl5;
                if (!bl4) break block13;
                if (bl2) {
                    z2.a(n2, i2.a(D, false), 3);
                    this.a(z2, n2, i2, false);
                    z2.a(n2, (K)this, false);
                    z2.a(n2.k(), (K)this, false);
                    z2.b(n2, n2);
                }
            }
            bl2 = bl3;
        }
        if (bl2) {
            z2.a(new net.minecraft.k.n(n2), (K)this, this.a(z2));
        }
        z2.b(n2, this);
    }

    @Override
    public void b(z z2, net.minecraft.k.n n2, i i2, Random random) {
    }

    private k a(net.minecraft.k.n n2) {
        float f10 = 0.2f;
        return new k((float)n2.e() + 0.2f, n2.b(), (float)n2.a() + 0.2f, (float)(n2.e() + 1) - 0.2f, (float)(n2.b() + 1) - 0.2f, (float)(n2.a() + 1) - 0.2f);
    }

    @Override
    public int c(i i2, t t2, net.minecraft.k.n n2, aA aA2) {
        block3: {
            int n3;
            block2: {
                boolean bl2 = cL.e();
                n3 = i2.b(D).booleanValue();
                if (!bl2) break block2;
                if (n3 != 0) break block3;
                n3 = 0;
            }
            return n3;
        }
        return aA2 == aA.UP ? 15 : 0;
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, C, D);
    }

    @Override
    public boolean s(i i2) {
        return true;
    }

    @Override
    public void a(z z2, net.minecraft.k.n n2, i i2, x x2) {
        block2: {
            boolean bl2;
            block1: {
                boolean bl3 = cL.b();
                bl2 = z2.C;
                if (bl3) break block1;
                if (bl2) break block2;
                bl2 = i2.b(D);
            }
            if (!bl2) {
                this.c(z2, n2, i2);
            }
        }
    }

    public bK() {
        super(true);
        this.h(this.e.a().a(D, false).a(C, cL.NORTH_SOUTH));
        this.a(true);
    }

    @Override
    public i c(int n2) {
        boolean bl2 = cL.e();
        i i2 = this.d().a(C, cL.a(n2 & 7));
        boolean bl3 = n2 & 8;
        if (bl2) {
            bl3 = bl3 > false;
        }
        return i2.a(D, bl3);
    }

    @Override
    public int d(i i2) {
        int n2 = 0;
        boolean bl2 = cL.b();
        n2 |= i2.b(C).d();
        int n3 = i2.b(D).booleanValue();
        if (!bl2) {
            if (n3 != 0) {
                n2 |= 8;
            }
            n3 = n2;
        }
        return n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int b(i i2, z z2, net.minecraft.k.n n2) {
        List<v> list;
        boolean bl2 = cL.b();
        int n3 = i2.b(D).booleanValue();
        if (bl2) return n3;
        if (n3 == 0) return 0;
        List<u> list2 = list = this.a(z2, n2, v.class, new Predicate[0]);
        if (!bl2) {
            if (!list2.isEmpty()) {
                return list.get(0).b().h();
            }
            list2 = this.a(z2, n2, u.class, net.minecraft.ar.e.c);
        }
        List<v> list3 = list2;
        n3 = list3.isEmpty() ? 1 : 0;
        if (bl2) return n3;
        if (n3 != 0) return 0;
        return net.minecraft.B.n.b((net.minecraft.B.a)((Object)list3.get(0)));
    }

    protected void a(z z2, net.minecraft.k.n n2, i i2, boolean bl2) {
        n n3 = new n(this, z2, n2, i2);
        boolean bl3 = cL.e();
        for (net.minecraft.k.n n4 : n3.c()) {
            block4: {
                i i3;
                i i4;
                block3: {
                    i3 = i4 = z2.d(n4);
                    if (!bl3) break block3;
                    if (i3 == null) break block4;
                    i3 = i4;
                }
                i3.a(z2, n4, i4.b(), n2);
            }
            if (bl3) continue;
        }
    }

    @Override
    public void b(z z2, net.minecraft.k.n n2, i i2) {
        super.b(z2, n2, i2);
        this.c(z2, n2, i2);
    }
}

