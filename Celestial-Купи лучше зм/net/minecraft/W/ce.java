/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.W;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.ad.a;
import net.minecraft.ae.c;
import net.minecraft.ah.z;
import net.minecraft.ar.Q;
import net.minecraft.ar.a2;
import net.minecraft.ar.aA;
import net.minecraft.ar.aH;
import net.minecraft.ar.i;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.d;

public class ce
extends K {
    public static final /* synthetic */ c z;

    protected ce() {
        super(net.minecraft.ac.c.G);
        this.h(this.e.a().a(z, false));
        this.a(net.minecraft.ad.a.r);
    }

    @Override
    public void b(z z2, n n2, net.minecraft.Z.i i2) {
        this.c(z2, n2, i2);
    }

    @Override
    public net.minecraft.Z.i c(int n2) {
        boolean bl2 = cL.b();
        net.minecraft.Z.i i2 = this.d();
        boolean bl3 = n2 & 1;
        if (!bl2) {
            bl3 = bl3;
        }
        return i2.a(z, bl3);
    }

    @Override
    public String n() {
        return net.minecraft.ab.a.a(this.k() + ".dry.name");
    }

    static {
        z = net.minecraft.ae.c.a("wet");
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public int g(net.minecraft.Z.i i2) {
        boolean bl2 = cL.e();
        int n2 = i2.b(z).booleanValue();
        if (bl2) {
            n2 = n2 != 0 ? 1 : 0;
        }
        return n2;
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z);
    }

    protected void c(z z2, n n2, net.minecraft.Z.i i2) {
        block3: {
            block4: {
                boolean bl2;
                boolean bl3;
                block2: {
                    bl3 = cL.b();
                    bl2 = i2.b(z);
                    if (bl3) break block2;
                    if (bl2) break block3;
                    bl2 = this.b(z2, n2);
                }
                if (bl3) break block4;
                if (!bl2) break block3;
                bl2 = z2.a(n2, i2.a(z, true), 2);
            }
            z2.b(2001, n2, K.b(g.bQ));
        }
    }

    @Override
    public void a(net.minecraft.Z.i i2, z z2, n n2, K k2, n n3) {
        this.c(z2, n2, i2);
        super.a(i2, z2, n2, k2, n3);
    }

    @Override
    public void a(net.minecraft.Z.i i2, z z2, n n2, Random random) {
        block2: {
            double d10;
            double d11;
            double d12;
            block6: {
                double d13;
                block11: {
                    block12: {
                        aA aA2;
                        boolean bl2;
                        block7: {
                            aA aA3;
                            block8: {
                                block9: {
                                    block10: {
                                        block4: {
                                            block5: {
                                                int n3;
                                                block3: {
                                                    bl2 = cL.e();
                                                    if (!i2.b(z).booleanValue() || (aA3 = aA.a(random)) == aA.UP) break block2;
                                                    n3 = z2.d(n2.a(aA3)).d();
                                                    if (!bl2) break block3;
                                                    if (n3 != 0) break block2;
                                                    n3 = n2.e();
                                                }
                                                d12 = n3;
                                                d11 = n2.b();
                                                d10 = n2.a();
                                                aA2 = aA3;
                                                if (!bl2) break block4;
                                                if (aA2 != aA.DOWN) break block5;
                                                d11 -= 0.05;
                                                d12 += random.nextDouble();
                                                d10 += random.nextDouble();
                                                if (bl2) break block6;
                                            }
                                            d11 += random.nextDouble() * 0.8;
                                            aA2 = aA3;
                                        }
                                        if (!bl2) break block7;
                                        if (aA2.g() != Q.X) break block8;
                                        d10 += random.nextDouble();
                                        if (!bl2) break block9;
                                        if (aA3 != aA.EAST) break block10;
                                        d12 += 1.0;
                                        if (bl2) break block6;
                                    }
                                    d12 += 0.05;
                                }
                                if (bl2) break block6;
                            }
                            d13 = d12 + random.nextDouble();
                            if (!bl2) break block11;
                            d12 = d13;
                            aA2 = aA3;
                        }
                        if (aA2 != aA.SOUTH) break block12;
                        d10 += 1.0;
                        if (bl2) break block6;
                    }
                    d13 = d10 + 0.05;
                }
                d10 = d13;
            }
            z2.a(aH.DRIP_WATER, d12, d11, d10, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean b(z z2, n n2) {
        LinkedList linkedList = Lists.newLinkedList();
        boolean bl2 = cL.b();
        ArrayList arrayList = Lists.newArrayList();
        linkedList.add(new i<n, Integer>(n2, 0));
        int n3 = 0;
        while (!linkedList.isEmpty()) {
            i i2 = (i)linkedList.poll();
            n n4 = (n)i2.a();
            Object object = i2.b();
            block1: while (true) {
                int n5 = (Integer)object;
                aA[] arraA = aA.values();
                int n6 = arraA.length;
                int n7 = 0;
                while (n7 < n6) {
                    block8: {
                        block9: {
                            aA aA2 = arraA[n7];
                            n n8 = n4.a(aA2);
                            if (bl2) break block8;
                            object = z2.d(n8).o();
                            if (bl2) continue block1;
                            if (object != net.minecraft.ac.c.L) break block9;
                            z2.a(n8, g.bf.d(), 2);
                            arrayList.add(n8);
                            ++n3;
                            if (bl2) break block8;
                            if (n5 < 6) {
                                linkedList.add(new i<n, Integer>(n8, n5 + 1));
                            }
                        }
                        ++n7;
                    }
                    if (!bl2) continue;
                }
                break;
            }
            if ((n3 <= 64 || bl2) && !bl2) continue;
        }
        for (n n4 : arrayList) {
            z2.a(n4, g.bf, false);
            if (bl2) return 0 != 0;
            if (!bl2) continue;
        }
        int n9 = n3;
        if (bl2) return n9 != 0;
        if (n9 <= 0) return 0 != 0;
        return 1 != 0;
    }

    @Override
    public int d(net.minecraft.Z.i i2) {
        boolean bl2 = cL.e();
        int n2 = i2.b(z).booleanValue();
        if (bl2) {
            n2 = n2 != 0 ? 1 : 0;
        }
        return n2;
    }

    @Override
    public void a(a a10, a2<d> a22) {
        a22.add(new d(this, 1, 0));
        a22.add(new d(this, 1, 1));
    }
}

