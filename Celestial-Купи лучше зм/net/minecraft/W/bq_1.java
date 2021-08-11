/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.b0;
import net.minecraft.W.bz;
import net.minecraft.W.cG;
import net.minecraft.W.cL;
import net.minecraft.Z.d;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ae.f;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.ar.aH;
import net.minecraft.ar.aW;
import net.minecraft.ar.av;
import net.minecraft.ar.ay;
import net.minecraft.k.h;
import net.minecraft.k.k;
import net.minecraft.k.l;
import net.minecraft.k.n;
import net.minecraft.k.p;
import net.minecraft.u.E;
import net.minecraft.u.g;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class bq
extends K {
    public static final /* synthetic */ f z;

    @Override
    public int a(z z2) {
        boolean bl2 = cL.b();
        c c11 = this.y;
        c11 = net.minecraft.ac.c.L;
        if (!bl2) {
            if (c10 == c11) {
                return 5;
            }
            c c11 = this.y;
            c11 = net.minecraft.ac.c.g;
        }
        if (c10 == c11) {
            int n2 = z2.D.b();
            if (!bl2) {
                n2 = n2 != 0 ? 10 : 30;
            }
            return n2;
        }
        return 0;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    protected bq(c c10) {
        super(c10);
        this.h(this.e.a().a(z, 0));
        this.a(true);
    }

    @Override
    public aC p() {
        return this.y == net.minecraft.ac.c.L ? aC.TRANSLUCENT : aC.SOLID;
    }

    @Override
    public i c(int n2) {
        return this.d().a(z, n2);
    }

    public static bz b(c c10) {
        boolean bl2 = cL.b();
        c c11 = c10;
        c c12 = net.minecraft.ac.c.L;
        if (!bl2) {
            if (c11 == c12) {
                return g.cL;
            }
            c11 = c10;
            c12 = net.minecraft.ac.c.g;
        }
        if (c11 == c12) {
            return g.ag;
        }
        throw new IllegalArgumentException("Invalid material");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(i i2, boolean n2) {
        boolean bl2 = cL.e();
        int n3 = n2;
        if (bl2) {
            if (n3 == 0) return 0 != 0;
            n3 = i2.b(z);
        }
        if (!bl2) return n3 != 0;
        if (n3 != 0) return 0 != 0;
        return 1 != 0;
    }

    protected l a(t t2, n n2, i i2) {
        Object object;
        block6: {
            p p2;
            block13: {
                double d10 = 0.0;
                double d11 = 0.0;
                double d12 = 0.0;
                int n3 = this.b(i2);
                p2 = p.a();
                object = av.HORIZONTAL.iterator();
                boolean bl2 = cL.b();
                while (object.hasNext()) {
                    block10: {
                        int n4;
                        int n5;
                        aA aA2;
                        block12: {
                            int n6;
                            block7: {
                                block8: {
                                    int n7;
                                    block11: {
                                        block9: {
                                            aA2 = object.next();
                                            p2.b(n2).a(aA2);
                                            n5 = n6 = this.b(t2.d(p2));
                                            if (bl2) break block7;
                                            if (n5 >= 0) break block8;
                                            n7 = t2.d(p2).o().n();
                                            if (bl2) break block9;
                                            if (n7 != 0) break block10;
                                            n7 = n6 = this.b(t2.d(p2.k()));
                                        }
                                        if (bl2) break block11;
                                        if (n7 < 0) break block10;
                                        n7 = n6 - (n3 - 8);
                                    }
                                    n4 = n7;
                                    d10 += (double)(aA2.r() * n4);
                                    d11 += (double)(aA2.p() * n4);
                                    d12 += (double)(aA2.i() * n4);
                                    if (!bl2) break block10;
                                }
                                n5 = n6;
                            }
                            if (bl2) break block12;
                            if (n5 < 0) break block10;
                            n5 = n6 - n3;
                        }
                        n4 = n5;
                        d10 += (double)(aA2.r() * n4);
                        d11 += (double)(aA2.p() * n4);
                        d12 += (double)(aA2.i() * n4);
                    }
                    if (!bl2) continue;
                }
                object = new l(d10, d11, d12);
                if (bl2) break block6;
                if (i2.b(z) < 8) break block13;
                for (aA aA3 : av.HORIZONTAL) {
                    block15: {
                        block14: {
                            p2.b(n2).a(aA3);
                            if (bl2) break block6;
                            if (bl2) break block14;
                            if (!this.a(t2, (n)p2, aA3) && !this.a(t2, p2.a(), aA3)) break block15;
                            object = ((l)object).d().c(0.0, -6.0, 0.0);
                        }
                        if (!bl2) break;
                    }
                    if (!bl2) continue;
                }
            }
            p2.b();
        }
        return ((l)object).d();
    }

    public static float a(i i2, t t2, n n2) {
        int n3 = i2.b(z);
        return (n3 & 7) == 0 && t2.d(n2.a()).o() == net.minecraft.ac.c.L ? 1.0f : 1.0f - bq.a(n3);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static float a(t var0, n var1_1, c var2_2, i var3_3) {
        var5_4 = bq.b(var2_2).a(var0, var1_1, var3_3);
        var4_5 = cL.b();
        v0 = var5_4.e;
        v1 = 0.0;
        if (!var4_5) {
            if (v0 == v1) {
                v0 = var5_4.b;
                v1 = 0.0;
                if (!var4_5) {
                    if (v0 == v1) {
                        return -1000.0f;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var5_4.b;
                v1 = var5_4.e;
            }
        }
        v2 = (float)net.minecraft.k.h.a(v0, v1) - 1.5707964f;
        return v2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(i i2, t t2, n n2, aA aA2) {
        boolean bl2 = cL.b();
        if (t2.d(n2.a(aA2)).o() == this.y) {
            return false;
        }
        if (aA2 == aA.UP) return true;
        boolean bl3 = super.b(i2, t2, n2, aA2);
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z);
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return k;
    }

    @Override
    public l a(z z2, n n2, x x2, l l2) {
        return l2.c(this.a((t)z2, n2, z2.d(n2)));
    }

    @Override
    public boolean a(t t2, n n2) {
        return this.y != net.minecraft.ac.c.g;
    }

    @Override
    public int d(i i2) {
        return i2.b(z);
    }

    @Override
    @Nullable
    public k c(i i2, t t2, n n2) {
        return a;
    }

    public static b0 a(c c10) {
        boolean bl2 = cL.e();
        c c11 = c10;
        c c12 = net.minecraft.ac.c.L;
        if (bl2) {
            if (c11 == c12) {
                return g.bQ;
            }
            c11 = c10;
            c12 = net.minecraft.ac.c.g;
        }
        if (c11 == c12) {
            return g.bq;
        }
        throw new IllegalArgumentException("Invalid material");
    }

    @Override
    public void a(i i2, z z2, n n2, Random random) {
        block21: {
            double d10;
            double d11;
            double d12;
            block25: {
                boolean bl2;
                block24: {
                    boolean bl3;
                    double d13;
                    double d14;
                    double d15;
                    block23: {
                        i i3;
                        block22: {
                            int n3;
                            block20: {
                                block19: {
                                    block17: {
                                        i i4;
                                        block18: {
                                            c c10;
                                            c c11;
                                            block16: {
                                                block12: {
                                                    block13: {
                                                        int n4;
                                                        block14: {
                                                            block15: {
                                                                int n5;
                                                                d15 = n2.e();
                                                                bl2 = cL.b();
                                                                d14 = n2.b();
                                                                d13 = n2.a();
                                                                c11 = this.y;
                                                                c10 = net.minecraft.ac.c.L;
                                                                if (bl2) break block12;
                                                                if (c11 != c10) break block13;
                                                                n4 = n5 = i2.b(z).intValue();
                                                                if (bl2) break block14;
                                                                if (n4 <= 0) break block15;
                                                                n4 = n5;
                                                                if (bl2) break block14;
                                                                if (n4 >= 8) break block15;
                                                                if (random.nextInt(64) != 0) break block13;
                                                                z2.a(d15 + 0.5, d14 + 0.5, d13 + 0.5, E.ac, ay.BLOCKS, random.nextFloat() * 0.25f + 0.75f, random.nextFloat() + 0.5f, false);
                                                                if (!bl2) break block13;
                                                            }
                                                            n4 = random.nextInt(10);
                                                        }
                                                        if (n4 == 0) {
                                                            z2.a(aH.SUSPENDED, d15 + (double)random.nextFloat(), d14 + (double)random.nextFloat(), d13 + (double)random.nextFloat(), 0.0, 0.0, 0.0, new int[0]);
                                                        }
                                                    }
                                                    c11 = this.y;
                                                    c10 = net.minecraft.ac.c.g;
                                                }
                                                if (bl2) break block16;
                                                if (c11 != c10) break block17;
                                                i4 = z2.d(n2.a());
                                                if (bl2) break block18;
                                                c11 = i4.o();
                                                c10 = net.minecraft.ac.c.A;
                                            }
                                            if (c11 != c10) break block17;
                                            i4 = z2.d(n2.a());
                                        }
                                        n3 = i4.i() ? 1 : 0;
                                        if (bl2) break block19;
                                        if (n3 != 0) break block17;
                                        n3 = random.nextInt(100);
                                        if (!bl2) {
                                            if (n3 == 0) {
                                                double d16 = d15 + (double)random.nextFloat();
                                                double d17 = d14 + i2.f((t)z2, (n)n2).a;
                                                double d18 = d13 + (double)random.nextFloat();
                                                z2.a(aH.LAVA, d16, d17, d18, 0.0, 0.0, 0.0, new int[0]);
                                                z2.a(d16, d17, d18, E.ai, ay.BLOCKS, 0.2f + random.nextFloat() * 0.2f, 0.9f + random.nextFloat() * 0.15f, false);
                                            }
                                            n3 = random.nextInt(200);
                                        }
                                        if (bl2) break block19;
                                        if (n3 == 0) {
                                            z2.a(d15, d14, d13, E.gm, ay.BLOCKS, 0.2f + random.nextFloat() * 0.2f, 0.9f + random.nextFloat() * 0.15f, false);
                                        }
                                    }
                                    n3 = random.nextInt(10);
                                }
                                if (bl2) break block20;
                                if (n3 != 0) break block21;
                                i3 = z2.d(n2.k());
                                if (bl2) break block22;
                                n3 = i3.d() ? 1 : 0;
                            }
                            if (n3 == 0) break block21;
                            i3 = z2.d(n2.a(2));
                        }
                        c c12 = i3.o();
                        bl3 = c12.n();
                        if (bl2) break block23;
                        if (bl3) break block21;
                        bl3 = c12.b();
                    }
                    if (bl3) break block21;
                    d12 = d15 + (double)random.nextFloat();
                    d11 = d14 - 1.05;
                    d10 = d13 + (double)random.nextFloat();
                    if (bl2) break block24;
                    if (this.y != net.minecraft.ac.c.L) break block25;
                    z2.a(aH.DRIP_WATER, d12, d11, d10, 0.0, 0.0, 0.0, new int[0]);
                }
                if (!bl2) break block21;
            }
            z2.a(aH.DRIP_LAVA, d12, d11, d10, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected int a(i i2) {
        boolean bl2 = cL.e();
        i i3 = i2;
        if (bl2) {
            if (i3.o() != this.y) return -1;
            i3 = i2;
        }
        int n2 = i3.b(z);
        return n2;
    }

    static {
        z = f.a("level", 0, 15);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    @Override
    public d a(t t2, i i2, n n2, aA aA2) {
        return d.UNDEFINED;
    }

    public static float b(i i2, t t2, n n2) {
        return (float)n2.b() + bq.a(i2, t2, n2);
    }

    @Override
    public void b(z z2, n n2, i i2) {
        this.a(z2, n2, i2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(z z2, n n2, i i2) {
        int n3;
        Object object;
        Object object2;
        boolean bl2;
        block6: {
            bl2 = cL.e();
            if (this.y != net.minecraft.ac.c.g) return 0 != 0;
            int n4 = 0;
            object2 = aA.values();
            int n5 = ((aA[])object2).length;
            int n6 = 0;
            while (n6 < n5) {
                aA aA2 = object2[n6];
                if (bl2) {
                    object = aA2;
                    if (!bl2) break block6;
                    if (object != aA.DOWN && z2.d(n2.a(aA2)).o() == net.minecraft.ac.c.L) {
                        n4 = 1;
                        if (bl2) break;
                    }
                    ++n6;
                }
                if (bl2) continue;
            }
            n3 = n4;
            if (!bl2) return n3 != 0;
            if (n3 == 0) return 0 != 0;
            object = i2.b(z);
        }
        object2 = (Integer)object;
        n3 = (Integer)object2;
        if (bl2) {
            if (n3 == 0) {
                z2.a(n2, g.bP.d());
                this.a(z2, n2);
                return true;
            }
            n3 = (Integer)object2;
        }
        if (!bl2) return n3 != 0;
        if (n3 > 4) return 0 != 0;
        z2.a(n2, g.cW.d());
        this.a(z2, n2);
        return true;
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public net.minecraft.w.k a(i i2, Random random, int n2) {
        return net.minecraft.u.h.v;
    }

    @Override
    public int b(i i2, t t2, n n2) {
        int n3 = t2.a(n2, 0);
        int n4 = t2.a(n2.a(), 0);
        int n5 = n3 & 0xFF;
        int n6 = n4 & 0xFF;
        int n7 = n3 >> 16 & 0xFF;
        int n8 = n4 >> 16 & 0xFF;
        boolean bl2 = cL.b();
        int n9 = n5;
        if (!bl2) {
            n9 = n9 > n6 ? n5 : n6;
        }
        int n10 = n7;
        if (!bl2) {
            n10 = n10 > n8 ? n7 : n8;
        }
        return n9 | n10 << 16;
    }

    protected void a(z z2, n n2) {
        double d10 = n2.e();
        boolean bl2 = cL.e();
        double d11 = n2.b();
        double d12 = n2.a();
        z2.a(null, n2, E.as, ay.BLOCKS, 0.5f, 2.6f + (z2.J.nextFloat() - z2.J.nextFloat()) * 0.8f);
        for (int i2 = 0; i2 < 8; ++i2) {
            z2.a(aH.SMOKE_LARGE, d10 + Math.random(), d11 + 1.2, d12 + Math.random(), 0.0, 0.0, 0.0, new int[0]);
            if (bl2) continue;
        }
    }

    public static float a(int n2) {
        boolean bl2 = cL.e();
        int n3 = n2;
        int n4 = 8;
        if (bl2) {
            if (n3 >= n4) {
                n2 = 0;
            }
            n3 = n2;
            n4 = 1;
        }
        return (float)(n3 + n4) / 9.0f;
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        this.a(z2, n2, i2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(t t2, n n2, aA aA2) {
        i i2 = t2.d(n2);
        K k2 = i2.b();
        boolean bl2 = cL.b();
        c c10 = i2.o();
        if (c10 == this.y) {
            return false;
        }
        if (aA2 == aA.UP) {
            return true;
        }
        if (c10 == net.minecraft.ac.c.O) {
            return false;
        }
        boolean bl3 = bq.a(k2);
        if (!bl2) {
            if (bl3) return false;
            bl3 = k2 instanceof cG;
            if (!bl2) {
                if (bl3) {
                    return false;
                }
                bl3 = false;
            }
        }
        boolean bl4 = bl3;
        if (bl4) return false;
        if (i2.c(t2, n2, aA2) != d.SOLID) return false;
        return true;
    }

    public boolean c(t t2, n n2) {
        int n3;
        block4: {
            int n4 = -1;
            boolean bl2 = cL.e();
            while (n4 <= 1) {
                block5: {
                    n3 = -1;
                    if (!bl2) break block4;
                    int n5 = n3;
                    while (n5 <= 1) {
                        block6: {
                            block7: {
                                boolean bl3;
                                block8: {
                                    i i2 = t2.d(n2.a(n4, 0, n5));
                                    if (!bl2) break block5;
                                    if (!bl2) break block6;
                                    if (i2.o() == this.y) break block7;
                                    bl3 = i2.m();
                                    if (!bl2) break block8;
                                    if (bl3) break block7;
                                    bl3 = true;
                                }
                                return bl3;
                            }
                            ++n5;
                        }
                        if (bl2) continue;
                    }
                    ++n4;
                }
                if (bl2) continue;
            }
            n3 = 0;
        }
        return n3 != 0;
    }

    protected int b(i i2) {
        int n2 = this.a(i2);
        boolean bl2 = cL.b();
        int n3 = n2;
        if (!bl2) {
            n3 = n3 >= 8 ? 0 : n2;
        }
        return n3;
    }

    @Override
    public aW b(i i2) {
        return aW.LIQUID;
    }
}

