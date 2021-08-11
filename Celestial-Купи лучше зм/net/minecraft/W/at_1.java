/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import java.util.Iterator;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.N.y;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ae.f;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.ar.av;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.u.h;
import net.minecraft.w.d;
import net.minecraft.w.k;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class at
extends K {
    public static final /* synthetic */ f z;

    @Override
    public net.minecraft.Z.d a(t t2, i i2, n n2, aA aA2) {
        return net.minecraft.Z.d.UNDEFINED;
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        block0: {
            if (this.b(z2, n2)) break block0;
            z2.a(n2, (K)this, 1);
        }
    }

    @Override
    public i c(int n2) {
        return this.d().a(z, n2);
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public int d(i i2) {
        return i2.b(z);
    }

    private void a(z z2, n n2) {
        z2.a(n2, this.d().a(z, 5), 2);
        z2.b(1034, n2, 0);
    }

    private static void a(z z2, n n2, Random random, n n3, int n4, int n5) {
        int n6;
        boolean bl2;
        int n7;
        block15: {
            int n8;
            block16: {
                int n9;
                block14: {
                    n7 = random.nextInt(4) + 1;
                    bl2 = cL.b();
                    int n10 = n5;
                    if (!bl2) {
                        if (n10 == 0) {
                            ++n7;
                        }
                        n10 = n8 = 0;
                    }
                    while (n8 < n7) {
                        n n11 = n2.c(n8 + 1);
                        n6 = at.b(z2, n11, null) ? 1 : 0;
                        if (!bl2) {
                            if (!bl2) {
                                if (n6 == 0) {
                                    return;
                                }
                                z2.a(n11, g.cm.d(), 2);
                            }
                            ++n8;
                            if (!bl2) continue;
                        }
                        break block14;
                    }
                    n8 = 0;
                    n6 = n5;
                }
                if (bl2) break block15;
                if (n6 >= 4) break block16;
                int n12 = random.nextInt(4);
                int n13 = n5;
                if (!bl2) {
                    if (n13 == 0) {
                        ++n12;
                    }
                    n13 = n9 = 0;
                }
                while (n9 < n12) {
                    block17: {
                        block18: {
                            n n14;
                            block22: {
                                int n15;
                                block21: {
                                    aA aA2;
                                    block20: {
                                        block19: {
                                            aA2 = av.HORIZONTAL.a(random);
                                            n14 = n2.c(n7).a(aA2);
                                            if (bl2) break block17;
                                            n6 = Math.abs(n14.e() - n3.e());
                                            if (bl2) break block15;
                                            if (n6 >= n4) break block18;
                                            n15 = Math.abs(n14.a() - n3.a());
                                            if (bl2) break block19;
                                            if (n15 >= n4) break block18;
                                            n15 = z2.a(n14) ? 1 : 0;
                                        }
                                        if (bl2) break block20;
                                        if (n15 == 0) break block18;
                                        n15 = z2.a(n14.k()) ? 1 : 0;
                                    }
                                    if (bl2) break block21;
                                    if (n15 == 0) break block18;
                                    n15 = at.b(z2, n14, aA2.h()) ? 1 : 0;
                                }
                                if (bl2) break block22;
                                if (n15 == 0) break block18;
                                n8 = 1;
                                n15 = z2.a(n14, g.cm.d(), 2) ? 1 : 0;
                            }
                            at.a(z2, n14, random, n3, n4, n5 + 1);
                        }
                        ++n9;
                    }
                    if (!bl2) continue;
                }
            }
            n6 = n8;
        }
        if (!bl2 && n6 == 0) {
            n6 = z2.a(n2.c(n7), g.P.d().a(z, 5), 2) ? 1 : 0;
        }
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        block31: {
            int n3;
            int n4;
            block44: {
                int n5;
                block45: {
                    boolean bl2;
                    block52: {
                        block51: {
                            block50: {
                                int n6;
                                block28: {
                                    int n7;
                                    int n8;
                                    int n9;
                                    int n10;
                                    block42: {
                                        block43: {
                                            int n11;
                                            n n12;
                                            block38: {
                                                i i3;
                                                block39: {
                                                    block40: {
                                                        int n13;
                                                        block41: {
                                                            block27: {
                                                                K k2;
                                                                K k3;
                                                                block36: {
                                                                    K k4;
                                                                    block37: {
                                                                        int n14;
                                                                        block35: {
                                                                            block34: {
                                                                                int n15;
                                                                                block33: {
                                                                                    block32: {
                                                                                        block30: {
                                                                                            block29: {
                                                                                                bl2 = cL.e();
                                                                                                boolean bl3 = this.b(z2, n2);
                                                                                                if (!bl2) break block29;
                                                                                                if (bl3) break block30;
                                                                                                bl3 = z2.a(n2, true);
                                                                                            }
                                                                                            if (bl2) break block31;
                                                                                        }
                                                                                        n12 = n2.a();
                                                                                        n15 = z2.a(n12);
                                                                                        if (!bl2) break block32;
                                                                                        if (n15 == 0) break block31;
                                                                                        n15 = n12.b();
                                                                                    }
                                                                                    if (!bl2) break block33;
                                                                                    if (n15 >= 256) break block31;
                                                                                    n15 = i2.b(z);
                                                                                }
                                                                                n14 = n5 = n15;
                                                                                if (!bl2) break block34;
                                                                                if (n14 >= 5) break block31;
                                                                                n14 = random.nextInt(1);
                                                                            }
                                                                            if (!bl2) break block35;
                                                                            if (n14 != 0) break block31;
                                                                            n14 = 0;
                                                                        }
                                                                        n11 = n14;
                                                                        n10 = 0;
                                                                        i3 = z2.d(n2.k());
                                                                        k3 = k4 = i3.b();
                                                                        k2 = g.v;
                                                                        if (!bl2) break block36;
                                                                        if (k3 != k2) break block37;
                                                                        n11 = 1;
                                                                        if (bl2) break block38;
                                                                    }
                                                                    k3 = k4;
                                                                    k2 = g.cm;
                                                                }
                                                                if (k3 != k2) break block39;
                                                                n9 = 1;
                                                                n8 = 0;
                                                                while (n8 < 4) {
                                                                    K k5 = z2.d(n2.a(n9 + 1)).b();
                                                                    if (bl2) {
                                                                        if (bl2) {
                                                                            if (k5 != g.cm) {
                                                                                if (k5 != g.v) break;
                                                                                n10 = 1;
                                                                                if (bl2) break;
                                                                            }
                                                                            ++n9;
                                                                            ++n8;
                                                                        }
                                                                        if (bl2) continue;
                                                                    }
                                                                    break block27;
                                                                }
                                                                n8 = 4;
                                                            }
                                                            n13 = n10;
                                                            if (bl2) {
                                                                if (n13 != 0) {
                                                                    ++n8;
                                                                }
                                                                n13 = n9;
                                                            }
                                                            if (!bl2) break block40;
                                                            if (n13 < 2) break block41;
                                                            n13 = random.nextInt(n8);
                                                            if (!bl2 || n13 < n9) break block40;
                                                        }
                                                        n13 = n11 = 1;
                                                    }
                                                    if (bl2) break block38;
                                                }
                                                if (i3.o() == net.minecraft.ac.c.A) {
                                                    n11 = 1;
                                                }
                                            }
                                            n4 = n11;
                                            if (!bl2) break block42;
                                            if (n4 == 0) break block43;
                                            n4 = at.b(z2, n12, null) ? 1 : 0;
                                            if (!bl2) break block42;
                                            if (n4 == 0) break block43;
                                            n4 = z2.a(n2.c(2)) ? 1 : 0;
                                            if (!bl2) break block42;
                                            if (n4 == 0) break block43;
                                            z2.a(n2, g.cm.d(), 2);
                                            this.b(z2, n12, n5);
                                            if (bl2) break block31;
                                        }
                                        n4 = n5;
                                    }
                                    n3 = 4;
                                    if (!bl2) break block44;
                                    if (n4 >= n3) break block45;
                                    n9 = random.nextInt(4);
                                    n8 = 0;
                                    int n16 = n10;
                                    if (bl2) {
                                        if (n16 != 0) {
                                            ++n9;
                                        }
                                        n16 = n7 = 0;
                                    }
                                    while (n7 < n9) {
                                        block46: {
                                            block47: {
                                                boolean bl4;
                                                block49: {
                                                    n n17;
                                                    block48: {
                                                        aA aA2 = av.HORIZONTAL.a(random);
                                                        n17 = n2.a(aA2);
                                                        if (!bl2) break block46;
                                                        n6 = z2.a(n17) ? 1 : 0;
                                                        if (!bl2) break block28;
                                                        if (n6 == 0) break block47;
                                                        bl4 = z2.a(n17.k());
                                                        if (!bl2) break block48;
                                                        if (!bl4) break block47;
                                                        bl4 = at.b(z2, n17, aA2.h());
                                                    }
                                                    if (!bl2) break block49;
                                                    if (!bl4) break block47;
                                                    this.b(z2, n17, n5 + 1);
                                                    bl4 = true;
                                                }
                                                n8 = bl4 ? 1 : 0;
                                            }
                                            ++n7;
                                        }
                                        if (bl2) continue;
                                    }
                                    n6 = n8;
                                }
                                if (!bl2) break block50;
                                if (n6 == 0) break block51;
                                n6 = z2.a(n2, g.cm.d(), 2) ? 1 : 0;
                            }
                            if (bl2) break block52;
                        }
                        this.a(z2, n2);
                    }
                    if (bl2) break block31;
                }
                n4 = n5;
                n3 = 4;
            }
            if (n4 == n3) {
                this.a(z2, n2);
            }
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(z z2, n n2) {
        K k2;
        i i2 = z2.d(n2.k());
        boolean bl2 = cL.b();
        K k3 = k2 = i2.b();
        K k4 = g.cm;
        if (!bl2) {
            if (k3 == k4) return true;
            k3 = k2;
            k4 = g.v;
        }
        if (k3 == k4) return true;
        if (i2.o() != net.minecraft.ac.c.A) return false;
        int n3 = 0;
        for (aA aA2 : av.HORIZONTAL) {
            block8: {
                i i3;
                block7: {
                    block6: {
                        i3 = z2.d(n2.a(aA2));
                        K k5 = i3.b();
                        if (bl2) return 0 != 0;
                        if (bl2) break block6;
                        if (k5 != g.cm) break block7;
                        ++n3;
                    }
                    if (!bl2) break block8;
                }
                if (i3.o() != net.minecraft.ac.c.A) {
                    return false;
                }
            }
            if (!bl2) continue;
        }
        int n4 = n3;
        if (bl2) return n4 != 0;
        if (n4 != true) return 0 != 0;
        return 1 != 0;
    }

    private static boolean b(z z2, n n2, aA aA2) {
        Iterator<aA> iterator = av.HORIZONTAL.iterator();
        boolean bl2 = cL.e();
        while (iterator.hasNext()) {
            block3: {
                boolean bl3;
                block4: {
                    aA aA3 = iterator.next();
                    if (aA3 == aA2) break block3;
                    bl3 = z2.a(n2.a(aA3));
                    if (!bl2) break block4;
                    if (bl3) break block3;
                    bl3 = false;
                }
                return bl3;
            }
            if (bl2) continue;
        }
        return true;
    }

    @Override
    public aC p() {
        return aC.CUTOUT;
    }

    @Override
    protected d q(i i2) {
        return d.m;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    private void b(z z2, n n2, int n3) {
        z2.a(n2, this.d().a(z, n3), 2);
        z2.b(1033, n2, 0);
    }

    @Override
    public k a(i i2, Random random, int n2) {
        return net.minecraft.u.h.v;
    }

    static {
        z = f.a("age", 0, 5);
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z);
    }

    public static void a(z z2, n n2, Random random, int n3) {
        z2.a(n2, g.cm.d(), 2);
        at.a(z2, n2, random, n2, n3, 0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, n n2) {
        boolean bl2 = cL.b();
        boolean bl3 = super.a(z2, n2);
        if (!bl2) {
            if (!bl3) return false;
            bl3 = this.b(z2, n2);
        }
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    protected at() {
        super(net.minecraft.ac.c.f, net.minecraft.ac.a.ab);
        this.h(this.e.a().a(z, 0));
        this.a(net.minecraft.ad.a.j);
        this.a(true);
    }

    @Override
    public void a(z z2, j j2, n n2, i i2, @Nullable y y2, d d10) {
        super.a(z2, j2, n2, i2, y2, d10);
        at.a(z2, n2, new d(net.minecraft.w.k.b(this)));
    }
}

