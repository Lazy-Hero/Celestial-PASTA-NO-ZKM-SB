/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.A;

import java.util.Random;
import net.minecraft.A.b;
import net.minecraft.A.d;
import net.minecraft.A.e;
import net.minecraft.A.h;
import net.minecraft.W.C;
import net.minecraft.W.d2;
import net.minecraft.ag.F;
import net.minecraft.ag.I;
import net.minecraft.ah.z;
import net.minecraft.k.n;

public class t
extends h {
    protected /* synthetic */ boolean H;

    @Override
    public C a(Random random, n n2) {
        block13: {
            double d10;
            double d11;
            boolean bl2;
            block12: {
                double d12 = k.a((double)n2.e() / 200.0, (double)n2.a() / 200.0);
                bl2 = net.minecraft.A.b.f();
                double d13 = d12 - -0.8;
                d11 = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
                if (!bl2) {
                    if (d11 < 0) {
                        int n3 = random.nextInt(4);
                        switch (n3) {
                            case 0: {
                                return net.minecraft.W.C.ORANGE_TULIP;
                            }
                            case 1: {
                                return net.minecraft.W.C.RED_TULIP;
                            }
                            case 2: {
                                return net.minecraft.W.C.PINK_TULIP;
                            }
                        }
                        return net.minecraft.W.C.WHITE_TULIP;
                    }
                    d11 = random.nextInt(3);
                }
                if (bl2) break block12;
                if (d11 <= 0) break block13;
                d11 = random.nextInt(3);
            }
            double d14 = d10 = d11;
            if (!bl2) {
                if (d14 == false) {
                    return net.minecraft.W.C.POPPY;
                }
                d14 = d10;
            }
            return d14 == true ? net.minecraft.W.C.HOUSTONIA : net.minecraft.W.C.OXEYE_DAISY;
        }
        return net.minecraft.W.C.DANDELION;
    }

    @Override
    public net.minecraft.p.b b(Random random) {
        return random.nextInt(3) == 0 ? r : C;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(z z2, Random random, n n2) {
        int n3;
        int n4;
        int n5;
        double d10;
        boolean bl2;
        block9: {
            block7: {
                double d11;
                block8: {
                    double d12 = k.a((double)(n2.e() + 8) / 200.0, (double)(n2.a() + 8) / 200.0);
                    bl2 = net.minecraft.A.b.c();
                    double d13 = d12 - -0.8;
                    d11 = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
                    if (!bl2) break block7;
                    if (d11 >= 0) break block8;
                    this.a.C = 15;
                    this.a.G = 5;
                    if (bl2) break block9;
                }
                this.a.C = 4;
                this.a.G = 10;
                h.a(d2.GRASS);
                d11 = d10 = 0.0;
            }
            while (d10 < 7) {
                n5 = random.nextInt(16) + 8;
                n4 = random.nextInt(16) + 8;
                n3 = random.nextInt(z2.C(n2.a(n5, 0, n4)).b() + 32);
                h.a(z2, random, n2.a(n5, n3, n4));
                ++d10;
                if (!bl2) return;
                if (bl2) continue;
            }
        }
        t t2 = this;
        if (bl2) {
            if (t2.H) {
                h.a(d2.SUNFLOWER);
                for (d10 = 0.0; d10 < 10; ++d10) {
                    n5 = random.nextInt(16) + 8;
                    n4 = random.nextInt(16) + 8;
                    n3 = random.nextInt(z2.C(n2.a(n5, 0, n4)).b() + 32);
                    h.a(z2, random, n2.a(n5, n3, n4));
                    if (!bl2) return;
                    if (bl2) continue;
                }
            }
            t2 = this;
        }
        super.a(z2, random, n2);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    protected t(boolean bl2, e e10) {
        super(e10);
        this.H = bl2;
        this.j.add(new d(I.class, 5, 2, 6));
        this.j.add(new d(F.class, 1, 1, 3));
        this.a.I = 0;
        this.a.E = 0.05f;
        this.a.C = 4;
        this.a.G = 10;
    }
}

