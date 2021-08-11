/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package net.minecraft.W;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.W.cV;
import net.minecraft.W.j;
import net.minecraft.Z.i;
import net.minecraft.ad.a;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aH;
import net.minecraft.ar.ay;
import net.minecraft.k.n;
import net.minecraft.u.E;
import net.minecraft.u.g;
import net.minecraft.w.d;
import net.minecraft.w.k;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class cy
extends cV {
    private static final /* synthetic */ Map<z, List<j>> G;
    private final /* synthetic */ boolean F;

    protected cy(boolean bl2) {
        this.F = bl2;
        this.a(true);
        this.a((a)null);
    }

    @Override
    public int c(i i2, t t2, n n2, aA aA2) {
        return aA2 == aA.DOWN ? i2.a(t2, n2, aA2) : 0;
    }

    private boolean c(z z2, n n2, i i2) {
        aA aA2 = i2.b(z).h();
        return z2.c(n2.a(aA2), aA2);
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        block16: {
            int n3;
            boolean bl2;
            block18: {
                block13: {
                    int n4;
                    block14: {
                        block12: {
                            int n5;
                            block17: {
                                int n6;
                                block15: {
                                    block11: {
                                        n4 = this.c(z2, n2, i2);
                                        bl2 = cL.e();
                                        List<j> list = G.get(z2);
                                        while (list != null) {
                                            n3 = list.isEmpty();
                                            if (bl2 && bl2) {
                                                if (n3 != 0) break;
                                                long l2 = z2.r() - list.get((int)0).a - 60L;
                                                n3 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
                                                if (bl2) {
                                                    if (n3 <= 0) break;
                                                    list.remove(0);
                                                    if (bl2) continue;
                                                }
                                            }
                                            break block11;
                                        }
                                        n3 = this.F;
                                    }
                                    if (!bl2) break block13;
                                    if (n3 == 0) break block14;
                                    n6 = n4;
                                    if (!bl2) break block15;
                                    if (n6 == 0) break block16;
                                    z2.a(n2, g.ai.d().a(z, i2.b(z)), 3);
                                    n6 = this.a(z2, n2, true) ? 1 : 0;
                                }
                                if (!bl2) break block17;
                                if (n6 == 0) break block16;
                                z2.a(null, n2, net.minecraft.u.E.cZ, ay.BLOCKS, 0.5f, 2.6f + (z2.J.nextFloat() - z2.J.nextFloat()) * 0.8f);
                                n6 = n5 = 0;
                            }
                            while (n5 < 5) {
                                double d10 = (double)n2.e() + random.nextDouble() * 0.6 + 0.2;
                                double d11 = (double)n2.b() + random.nextDouble() * 0.6 + 0.2;
                                double d12 = (double)n2.a() + random.nextDouble() * 0.6 + 0.2;
                                z2.a(aH.SMOKE_NORMAL, d10, d11, d12, 0.0, 0.0, 0.0, new int[0]);
                                ++n5;
                                if (bl2) {
                                    if (bl2) continue;
                                }
                                break block12;
                            }
                            z2.a(n2, z2.d(n2).b(), 160);
                        }
                        if (bl2) break block16;
                    }
                    n3 = n4;
                }
                if (!bl2) break block18;
                if (n3 != 0) break block16;
                n3 = this.a(z2, n2, false);
            }
            if (bl2 && n3 == 0) {
                n3 = z2.a(n2, g.c5.d().a(z, i2.b(z)), 3) ? 1 : 0;
            }
        }
    }

    @Override
    public void a(i i2, z z2, n n2, Random random) {
        block3: {
            double d10;
            double d11;
            double d12;
            block5: {
                aA aA2;
                block4: {
                    aA aA3;
                    int n3;
                    boolean bl2;
                    block2: {
                        bl2 = cL.e();
                        n3 = this.F;
                        if (!bl2) break block2;
                        if (n3 == 0) break block3;
                        n3 = n2.e();
                    }
                    d12 = (double)n3 + 0.5 + (random.nextDouble() - 0.5) * 0.2;
                    d11 = (double)n2.b() + 0.7 + (random.nextDouble() - 0.5) * 0.2;
                    d10 = (double)n2.a() + 0.5 + (random.nextDouble() - 0.5) * 0.2;
                    aA2 = aA3 = i2.b(z);
                    if (!bl2) break block4;
                    if (!aA2.g().d()) break block5;
                    aA2 = aA3.h();
                }
                aA aA4 = aA2;
                double d13 = 0.27;
                d12 += 0.27 * (double)aA4.r();
                d11 += 0.22;
                d10 += 0.27 * (double)aA4.i();
            }
            z2.a(aH.REDSTONE, d12, d11, d10, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    public int a(i i2, t t2, n n2, aA aA2) {
        return this.F && i2.b(z) != aA2 ? 15 : 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void b(z z2, n n2, i i2, Random random) {
    }

    @Override
    public d c(z z2, n n2, i i2) {
        return new d(g.c5);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean d(K k2) {
        boolean bl2 = cL.e();
        K k3 = k2;
        K k4 = g.ai;
        if (bl2) {
            if (k3 == k4) return true;
            k3 = k2;
            k4 = g.c5;
        }
        if (k3 != k4) return false;
        return true;
    }

    static {
        G = Maps.newHashMap();
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        block2: {
            boolean bl2;
            block1: {
                boolean bl3 = cL.b();
                bl2 = this.a(z2, n2, i2);
                if (bl3) break block1;
                if (bl2) break block2;
                bl2 = this.F;
            }
            if (bl2 == this.c(z2, n2, i2)) {
                z2.a(n2, (K)this, this.a(z2));
            }
        }
    }

    @Override
    public k a(i i2, Random random, int n2) {
        return net.minecraft.w.k.b(g.c5);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(z z2, n n2, boolean bl2) {
        boolean bl3 = cL.e();
        Map<z, List<j>> map = G;
        z z3 = z2;
        if (bl3) {
            if (!map.containsKey(z3)) {
                G.put(z2, Lists.newArrayList());
            }
            map = G;
            z3 = z2;
        }
        List<j> list = map.get(z3);
        int n3 = bl2;
        if (bl3) {
            if (n3 != 0) {
                list.add(new j(n2, z2.r()));
            }
            n3 = 0;
        }
        int n4 = n3;
        int n5 = 0;
        do {
            if (n5 >= list.size()) return false;
            j j2 = list.get(n5);
            if (!bl3) continue;
            boolean bl4 = j2.b.equals(n2);
            if (!bl3) return bl4;
            if (bl4) {
                ++n4;
                if (!bl3) continue;
                if (n4 >= 8) {
                    return true;
                }
            }
            ++n5;
        } while (bl3);
        return false;
    }

    @Override
    public boolean o(i i2) {
        return true;
    }

    @Override
    public void a(z z2, n n2, i i2) {
        boolean bl2 = cL.e();
        if (this.F) {
            for (aA aA2 : aA.values()) {
                z2.a(n2.a(aA2), (K)this, false);
                if (bl2) continue;
            }
        }
    }

    @Override
    public int a(z z2) {
        return 2;
    }

    @Override
    public void b(z z2, n n2, i i2) {
        boolean bl2 = cL.e();
        if (this.F) {
            for (aA aA2 : aA.values()) {
                z2.a(n2.a(aA2), (K)this, false);
                if (bl2) continue;
            }
        }
    }
}

