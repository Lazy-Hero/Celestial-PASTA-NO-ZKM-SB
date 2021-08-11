/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.W.K;
import net.minecraft.W.af;
import net.minecraft.W.bD;
import net.minecraft.W.bV;
import net.minecraft.W.cL;
import net.minecraft.W.dH;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ae.d;
import net.minecraft.ae.f;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.ar.aH;
import net.minecraft.ar.ae;
import net.minecraft.ar.av;
import net.minecraft.k.h;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.g;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bQ
extends K {
    public static final /* synthetic */ d<dH> G;
    public static final /* synthetic */ d<dH> C;
    private final /* synthetic */ Set<n> E;
    public static final /* synthetic */ f z;
    protected static final /* synthetic */ k[] F;
    public static final /* synthetic */ d<dH> D;
    private /* synthetic */ boolean A;
    public static final /* synthetic */ d<dH> B;

    protected static boolean a(i i2) {
        return bQ.a(i2, null);
    }

    @Override
    public void b(z z2, n n2, i i2) {
        block12: {
            aA aA2;
            Iterator<aA> iterator;
            boolean bl2;
            block10: {
                block9: {
                    block11: {
                        bl2 = cL.b();
                        if (bl2) break block11;
                        if (z2.C) break block12;
                        this.a(z2, n2, i2);
                    }
                    iterator = av.VERTICAL.iterator();
                    while (iterator.hasNext()) {
                        aA2 = iterator.next();
                        z2.a(n2.a(aA2), (K)this, false);
                        if (!bl2) {
                            if (!bl2) continue;
                        }
                        break block9;
                    }
                    iterator = av.HORIZONTAL.iterator();
                }
                while (iterator.hasNext()) {
                    aA2 = iterator.next();
                    this.a(z2, n2.a(aA2));
                    if (!bl2) {
                        if (!bl2) continue;
                    }
                    break block10;
                }
                iterator = av.HORIZONTAL.iterator();
            }
            while (iterator.hasNext()) {
                block15: {
                    n n3;
                    block14: {
                        block13: {
                            aA2 = iterator.next();
                            n3 = n2.a(aA2);
                            if (bl2) break block13;
                            if (!z2.d(n3).r()) break block14;
                            this.a(z2, n3.a());
                        }
                        if (!bl2) break block15;
                    }
                    this.a(z2, n3.k());
                }
                if (!bl2) continue;
            }
        }
    }

    @Override
    public void a(i i2, z z2, n n2, Random random) {
        block3: {
            int n3;
            int n4;
            block2: {
                n4 = i2.b(z);
                boolean bl2 = cL.b();
                n3 = n4;
                if (bl2) break block2;
                if (n3 == 0) break block3;
                n3 = n2.e();
            }
            double d10 = (double)n3 + 0.5 + ((double)random.nextFloat() - 0.5) * 0.2;
            double d11 = (float)n2.b() + 0.0625f;
            double d12 = (double)n2.a() + 0.5 + ((double)random.nextFloat() - 0.5) * 0.2;
            float f10 = (float)n4 / 15.0f;
            float f11 = f10 * 0.6f + 0.4f;
            float f12 = Math.max(0.0f, f10 * f10 * 0.7f - 0.5f);
            float f13 = Math.max(0.0f, f10 * f10 * 0.6f - 0.7f);
            z2.a(aH.REDSTONE, d10, d11, d12, (double)f11, (double)f12, (double)f13, new int[0]);
        }
    }

    @Override
    public net.minecraft.w.d c(z z2, n n2, i i2) {
        return new net.minecraft.w.d(net.minecraft.u.h.a7);
    }

    private static int b(i i2) {
        int n2;
        block22: {
            int n3;
            block23: {
                int n4;
                block20: {
                    block21: {
                        int n5;
                        int n6;
                        int n7;
                        int n8;
                        boolean bl2;
                        block18: {
                            block19: {
                                int n9;
                                block16: {
                                    block17: {
                                        block14: {
                                            block15: {
                                                int n10;
                                                block12: {
                                                    block13: {
                                                        block10: {
                                                            block11: {
                                                                int n11;
                                                                block8: {
                                                                    block9: {
                                                                        n3 = 0;
                                                                        bl2 = cL.e();
                                                                        n8 = i2.b(B) != dH.NONE ? 1 : 0;
                                                                        n7 = i2.b(D) != dH.NONE ? 1 : 0;
                                                                        n6 = i2.b(C) != dH.NONE ? 1 : 0;
                                                                        n5 = i2.b(G) != dH.NONE ? 1 : 0;
                                                                        n11 = n8;
                                                                        if (!bl2) break block8;
                                                                        if (n11 != 0) break block9;
                                                                        n10 = n6;
                                                                        if (!bl2) break block10;
                                                                        if (n10 == 0) break block11;
                                                                        n10 = n8;
                                                                        if (!bl2) break block10;
                                                                        if (n10 != 0) break block11;
                                                                        n10 = n7;
                                                                        if (!bl2) break block10;
                                                                        if (n10 != 0) break block11;
                                                                        n10 = n5;
                                                                        if (!bl2) break block10;
                                                                        if (n10 != 0) break block11;
                                                                    }
                                                                    n11 = n3 | 1 << aA.NORTH.k();
                                                                }
                                                                n3 = n11;
                                                            }
                                                            n10 = n7;
                                                        }
                                                        if (!bl2) break block12;
                                                        if (n10 != 0) break block13;
                                                        n9 = n5;
                                                        if (!bl2) break block14;
                                                        if (n9 == 0) break block15;
                                                        n9 = n8;
                                                        if (!bl2) break block14;
                                                        if (n9 != 0) break block15;
                                                        n9 = n7;
                                                        if (!bl2) break block14;
                                                        if (n9 != 0) break block15;
                                                        n9 = n6;
                                                        if (!bl2) break block14;
                                                        if (n9 != 0) break block15;
                                                    }
                                                    n10 = n3 | 1 << aA.EAST.k();
                                                }
                                                n3 = n10;
                                            }
                                            n9 = n6;
                                        }
                                        if (!bl2) break block16;
                                        if (n9 != 0) break block17;
                                        n4 = n8;
                                        if (!bl2) break block18;
                                        if (n4 == 0) break block19;
                                        n4 = n7;
                                        if (!bl2) break block18;
                                        if (n4 != 0) break block19;
                                        n4 = n6;
                                        if (!bl2) break block18;
                                        if (n4 != 0) break block19;
                                        n4 = n5;
                                        if (!bl2) break block18;
                                        if (n4 != 0) break block19;
                                    }
                                    n9 = n3 | 1 << aA.SOUTH.k();
                                }
                                n3 = n9;
                            }
                            n4 = n5;
                        }
                        if (!bl2) break block20;
                        if (n4 != 0) break block21;
                        n2 = n7;
                        if (!bl2) break block22;
                        if (n2 == 0) break block23;
                        n2 = n8;
                        if (!bl2) break block22;
                        if (n2 != 0) break block23;
                        n2 = n6;
                        if (!bl2) break block22;
                        if (n2 != 0) break block23;
                        n2 = n5;
                        if (!bl2) break block22;
                        if (n2 != 0) break block23;
                    }
                    n4 = n3 | 1 << aA.WEST.k();
                }
                n3 = n4;
            }
            n2 = n3;
        }
        return n2;
    }

    @Override
    public int c(i i2, t t2, n n2, aA aA2) {
        boolean bl2 = cL.b();
        int n3 = this.A;
        if (!bl2) {
            n3 = n3 == 0 ? 0 : i2.a(t2, n2, aA2);
        }
        return n3;
    }

    @Override
    public i c(int n2) {
        return this.d().a(z, n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected static boolean a(i i2, @Nullable aA aA2) {
        K k2 = i2.b();
        boolean bl2 = cL.b();
        if (k2 == g.bK) {
            return true;
        }
        K k3 = g.bB;
        i i3 = i2;
        if (!bl2) {
            if (k3.g(i3)) {
                aA aA3;
                aA aA5 = aA3 = i2.b(bV.z);
                aA5 = aA2;
                if (!bl2) {
                    if (aA4 == aA5) return true;
                    aA aA5 = aA3.h();
                    aA5 = aA2;
                }
                if (aA4 != aA5) return false;
                return true;
            }
            k3 = g.ce;
            i3 = i2;
        }
        if (k3 == i3.b()) {
            if (aA2 != i2.b(af.z)) return false;
            return true;
        }
        if (!i2.a()) return false;
        if (aA2 == null) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public i e(i i2, t t2, n n2) {
        i2 = i2.a(G, this.b(t2, n2, aA.WEST));
        i2 = i2.a(D, this.b(t2, n2, aA.EAST));
        i2 = i2.a(B, this.b(t2, n2, aA.NORTH));
        i2 = i2.a(C, this.b(t2, n2, aA.SOUTH));
        return i2;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public aC p() {
        return aC.CUTOUT;
    }

    @Override
    @Nullable
    public k c(i i2, t t2, n n2) {
        return a;
    }

    @Override
    public boolean a(z z2, n n2) {
        boolean bl2 = cL.b();
        boolean bl3 = z2.d(n2.k()).d();
        if (!bl2) {
            bl3 = bl3 || z2.d(n2.k()).b() == g.W;
        }
        return bl3;
    }

    @Override
    public void a(z z2, n n2, i i2) {
        block11: {
            Object object;
            boolean bl2;
            block10: {
                block9: {
                    boolean bl3 = cL.e();
                    super.a(z2, n2, i2);
                    bl2 = bl3;
                    if (z2.C) break block11;
                    for (aA aA2 : aA.values()) {
                        z2.a(n2.a(aA2), (K)this, false);
                        if (bl2) {
                            if (bl2) continue;
                        }
                        break block9;
                    }
                    this.a(z2, n2, i2);
                }
                object = av.HORIZONTAL.iterator();
                while (object.hasNext()) {
                    aA aA3 = (aA)object.next();
                    this.a(z2, n2.a(aA3));
                    if (bl2) {
                        if (bl2) continue;
                    }
                    break block10;
                }
                object = av.HORIZONTAL.iterator();
            }
            while (object.hasNext()) {
                block14: {
                    n n3;
                    block13: {
                        block12: {
                            aA aA4 = (aA)object.next();
                            n3 = n2.a(aA4);
                            if (!bl2) break block12;
                            if (!z2.d(n3).r()) break block13;
                            this.a(z2, n3.a());
                        }
                        if (bl2) break block14;
                    }
                    this.a(z2, n3.k());
                }
                if (bl2) continue;
            }
        }
    }

    public bQ() {
        super(net.minecraft.ac.c.n);
        this.A = true;
        this.E = Sets.newHashSet();
        this.h(this.e.a().a(B, dH.NONE).a(D, dH.NONE).a(C, dH.NONE).a(G, dH.NONE).a(z, 0));
    }

    private int a(z z2, n n2, int n3) {
        int n4;
        boolean bl2 = cL.e();
        i i2 = z2.d(n2);
        if (bl2) {
            if (i2.b() != this) {
                return n3;
            }
            i2 = z2.d(n2);
        }
        int n5 = n4 = i2.b(z).intValue();
        if (bl2) {
            n5 = n5 > n3 ? n4 : n3;
        }
        return n5;
    }

    @Override
    public net.minecraft.w.k a(i i2, Random random, int n2) {
        return net.minecraft.u.h.a7;
    }

    static {
        B = d.a("north", dH.class);
        D = d.a("east", dH.class);
        C = d.a("south", dH.class);
        G = d.a("west", dH.class);
        z = f.a("power", 0, 15);
        F = new k[]{new k(0.1875, 0.0, 0.1875, 0.8125, 0.0625, 0.8125), new k(0.1875, 0.0, 0.1875, 0.8125, 0.0625, 1.0), new k(0.0, 0.0, 0.1875, 0.8125, 0.0625, 0.8125), new k(0.0, 0.0, 0.1875, 0.8125, 0.0625, 1.0), new k(0.1875, 0.0, 0.0, 0.8125, 0.0625, 0.8125), new k(0.1875, 0.0, 0.0, 0.8125, 0.0625, 1.0), new k(0.0, 0.0, 0.0, 0.8125, 0.0625, 0.8125), new k(0.0, 0.0, 0.0, 0.8125, 0.0625, 1.0), new k(0.1875, 0.0, 0.1875, 1.0, 0.0625, 0.8125), new k(0.1875, 0.0, 0.1875, 1.0, 0.0625, 1.0), new k(0.0, 0.0, 0.1875, 1.0, 0.0625, 0.8125), new k(0.0, 0.0, 0.1875, 1.0, 0.0625, 1.0), new k(0.1875, 0.0, 0.0, 1.0, 0.0625, 0.8125), new k(0.1875, 0.0, 0.0, 1.0, 0.0625, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.0625, 0.8125), new k(0.0, 0.0, 0.0, 1.0, 0.0625, 1.0)};
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean a(t var1_1, n var2_2, aA var3_3) {
        block22: {
            block21: {
                block20: {
                    block18: {
                        block19: {
                            var5_4 = var2_2.a(var3_3);
                            var4_5 = cL.e();
                            var6_6 = var1_1.d(var5_4);
                            var7_7 = var6_6.r();
                            v0 = var8_8 = var1_1.d(var2_2.a()).r();
                            if (!var4_5) break block18;
                            if (v0) break block19;
                            v0 = var7_7;
                            if (!var4_5) break block18;
                            if (v0) {
                                v0 = bQ.c(var1_1, var5_4.a());
                                if (var4_5) {
                                    if (v0) {
                                        return true;
                                    } else {
                                        ** GOTO lbl17
                                    }
                                } else {
                                    ** GOTO lbl16
                                }
                            }
                            break block19;
lbl16:
                            // 2 sources

                            break block18;
                        }
                        v1 = var6_6;
                        if (!var4_5) break block20;
                        v0 = bQ.a(v1, var3_3);
                    }
                    if (v0) {
                        return true;
                    }
                    v1 = var6_6;
                }
                if (!var4_5) break block21;
                if (v1.b() != g.ar) break block22;
                v1 = var6_6;
            }
            if (v1.b(bD.z) == var3_3) {
                return true;
            }
        }
        v2 = var7_7;
        if (var4_5) {
            if (v2 != false) return false;
            v2 = bQ.c(var1_1, var5_4.k());
        }
        if (var4_5 == false) return v2;
        if (v2 == false) return false;
        return true;
    }

    @Override
    public int d(i i2) {
        return i2.b(z);
    }

    @Override
    public i a(i i2, net.minecraft.ar.h h2) {
        switch (h2) {
            case LEFT_RIGHT: {
                return i2.a(B, i2.b(C)).a(C, i2.b(B));
            }
            case FRONT_BACK: {
                return i2.a(D, i2.b(G)).a(G, i2.b(D));
            }
        }
        return super.a(i2, h2);
    }

    protected static boolean c(t t2, n n2) {
        return bQ.a(t2.d(n2));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public int a(i var1_1, t var2_2, n var3_3, aA var4_4) {
        block12: {
            var5_5 = cL.e();
            v0 = this.A;
            if (var5_5) {
                if (v0 == 0) {
                    return 0;
                }
                v0 = var1_1.b(bQ.z);
            }
            v1 = var6_6 = v0;
            if (var5_5 == false) return v1;
            if (v1 == 0) {
                return 0;
            }
            if (var4_4 == aA.UP) {
                return var6_6;
            }
            var7_7 = EnumSet.noneOf(aA.class);
            for (aA var9_9 : av.HORIZONTAL) {
                v2 = this.a(var2_2, var3_3, var9_9) ? 1 : 0;
                if (var5_5) {
                    if (var5_5 && v2 != 0) {
                        var7_7.add(var9_9);
                    }
                    if (var5_5) continue;
                }
                break block12;
            }
            v2 = var4_4.g().d();
        }
        if (var5_5) {
            if (v2 != 0) {
                v2 = var7_7.isEmpty() ? 1 : 0;
                if (var5_5) {
                    if (v2 != 0) {
                        return var6_6;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v2 = var7_7.contains(var4_4) ? 1 : 0;
            }
        }
        if (var5_5 == false) return v2;
        if (v2 == 0) return 0;
        v2 = var7_7.contains(var4_4.d()) ? 1 : 0;
        if (var5_5 == false) return v2;
        if (v2 != 0) return 0;
        v2 = var7_7.contains(var4_4.l()) ? 1 : 0;
        if (var5_5 == false) return v2;
        if (v2 != 0) return 0;
        return var6_6;
    }

    @Override
    public i a(i i2, ae ae2) {
        switch (ae2) {
            case CLOCKWISE_180: {
                return i2.a(B, i2.b(C)).a(D, i2.b(G)).a(C, i2.b(B)).a(G, i2.b(D));
            }
            case COUNTERCLOCKWISE_90: {
                return i2.a(B, i2.b(D)).a(D, i2.b(C)).a(C, i2.b(G)).a(G, i2.b(B));
            }
            case CLOCKWISE_90: {
                return i2.a(B, i2.b(G)).a(D, i2.b(B)).a(C, i2.b(D)).a(G, i2.b(C));
            }
        }
        return i2;
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return F[bQ.b(i2.c(t2, n2))];
    }

    @Override
    public boolean o(i i2) {
        return this.A;
    }

    @Override
    public net.minecraft.Z.d a(t t2, i i2, n n2, aA aA2) {
        return net.minecraft.Z.d.UNDEFINED;
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    public static int a(int n2) {
        float f10 = (float)n2 / 15.0f;
        float f11 = f10 * 0.6f + 0.4f;
        boolean bl2 = cL.b();
        if (n2 == 0) {
            f11 = 0.3f;
        }
        float f12 = f10 * f10 * 0.7f - 0.5f;
        float f13 = f10 * f10 * 0.6f - 0.7f;
        float f14 = f12 - 0.0f;
        float f15 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
        if (!bl2) {
            float f16;
            if (f15 < 0) {
                f12 = 0.0f;
            }
            f15 = (f16 = f13 - 0.0f) == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
        }
        if (!bl2) {
            if (f15 < 0) {
                f13 = 0.0f;
            }
            f15 = net.minecraft.k.h.c((int)(f11 * 255.0f), 0, 255);
        }
        float f17 = f15;
        int n3 = net.minecraft.k.h.c((int)(f12 * 255.0f), 0, 255);
        int n4 = net.minecraft.k.h.c((int)(f13 * 255.0f), 0, 255);
        return 0xFF000000 | f17 << 16 | n3 << 8 | n4;
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, B, D, C, G, z);
    }

    private i a(z z2, n n2, i i2) {
        boolean bl2 = cL.e();
        i2 = this.a(z2, n2, n2, i2);
        ArrayList arrayList = Lists.newArrayList(this.E);
        this.E.clear();
        Iterator iterator = arrayList.iterator();
        boolean bl3 = bl2;
        while (iterator.hasNext()) {
            n n3 = (n)iterator.next();
            z2.a(n3, (K)this, false);
            if (bl3) continue;
        }
        return i2;
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        block3: {
            boolean bl2;
            block4: {
                boolean bl3;
                block2: {
                    bl3 = cL.b();
                    bl2 = z2.C;
                    if (bl3) break block2;
                    if (bl2) break block3;
                    bl2 = this.a(z2, n2);
                }
                if (bl3) break block3;
                if (!bl2) break block4;
                this.a(z2, n2, i2);
                if (!bl3) break block3;
            }
            this.a(z2, n2, i2, 0);
            bl2 = z2.v(n2);
        }
    }

    private void a(z z2, n n2) {
        block4: {
            n n3;
            z z3;
            boolean bl2;
            block3: {
                bl2 = cL.b();
                z3 = z2;
                n3 = n2;
                if (bl2) break block3;
                if (z3.d(n3).b() != this) break block4;
                z3 = z2;
                n3 = n2;
            }
            z3.a(n3, (K)this, false);
            for (aA aA2 : aA.values()) {
                z2.a(n2.a(aA2), (K)this, false);
                if (!bl2) continue;
            }
        }
    }

    /*
     * Exception decompiling
     */
    private i a(z var1_1, n var2_2, n var3_3, i var4_4) {
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

    private dH b(t t2, n n2, aA aA2) {
        block6: {
            block10: {
                boolean bl2;
                block12: {
                    i i2;
                    boolean bl3;
                    block11: {
                        boolean bl4;
                        boolean bl5;
                        n n3;
                        block9: {
                            i i3;
                            block7: {
                                block8: {
                                    boolean bl6;
                                    block5: {
                                        n3 = n2.a(aA2);
                                        bl3 = cL.b();
                                        i2 = t2.d(n2.a(aA2));
                                        bl6 = bQ.a(t2.d(n3), aA2);
                                        if (bl3) break block5;
                                        if (bl6) break block6;
                                        i3 = i2;
                                        if (bl3) break block7;
                                        bl6 = i3.r();
                                    }
                                    if (bl6) break block8;
                                    i3 = t2.d(n3.k());
                                    if (bl3) break block7;
                                    if (bQ.a(i3)) break block6;
                                }
                                i3 = t2.d(n2.a());
                            }
                            i i4 = i3;
                            bl5 = i4.r();
                            if (bl3) break block9;
                            if (bl5) break block10;
                            bl5 = t2.d(n3).d();
                        }
                        if (!bl3) {
                            bl5 = bl5 || t2.d(n3).b() == g.W;
                        }
                        bl2 = bl4 = bl5;
                        if (bl3) break block11;
                        if (!bl2) break block10;
                        bl2 = bQ.a(t2.d(n3.a()));
                    }
                    if (bl3) break block12;
                    if (!bl2) break block10;
                    bl2 = i2.e();
                }
                if (bl2) {
                    return dH.UP;
                }
                return dH.SIDE;
            }
            return dH.NONE;
        }
        return dH.SIDE;
    }
}

