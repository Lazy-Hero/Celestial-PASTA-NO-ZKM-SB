/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.J.r;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.ar.aH;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class bw
extends K {
    public static /* synthetic */ boolean z;

    private static gP b(gP gP2) {
        return gP2;
    }

    public int b(i i2) {
        return -16777216;
    }

    public void a(z z2, n n2, i i2, i i3) {
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        z2.a(n2, (K)this, this.a(z2));
    }

    @Override
    public int a(z z2) {
        return 2;
    }

    @Override
    public void b(z z2, n n2, i i2) {
        z2.a(n2, (K)this, this.a(z2));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(i i2) {
        K k2 = i2.b();
        c c10 = i2.o();
        boolean bl2 = cL.b();
        if (k2 == g.C) return true;
        c c11 = c10;
        c c12 = net.minecraft.ac.c.A;
        if (!bl2) {
            if (c11 == c12) return true;
            c11 = c10;
            c12 = net.minecraft.ac.c.L;
        }
        if (!bl2) {
            if (c11 == c12) return true;
            c11 = c10;
            c12 = net.minecraft.ac.c.g;
        }
        if (c11 != c12) return false;
        return true;
    }

    private void c(z z2, n n2) {
        block6: {
            int n3;
            Object object;
            boolean bl2;
            block4: {
                block8: {
                    boolean bl3;
                    block9: {
                        int n4;
                        block7: {
                            block5: {
                                bl2 = cL.e();
                                n4 = bw.a(z2.d(n2.k()));
                                if (!bl2) break block5;
                                if (n4 == 0) break block6;
                                n4 = n2.b();
                            }
                            if (!bl2) break block7;
                            if (n4 < 0) break block6;
                            n4 = 32;
                        }
                        int n5 = n4;
                        bl3 = z;
                        if (!bl2) break block8;
                        if (bl3) break block9;
                        bl3 = z2.a(n2.a(-32, -32, -32), n2.a(32, 32, 32));
                        if (!bl2) break block8;
                        if (!bl3) break block9;
                        if (z2.C) break block6;
                        object = new r(z2, (double)n2.e() + 0.5, n2.b(), (double)n2.a() + 0.5, z2.d(n2));
                        this.a((r)object);
                        z2.f((x)object);
                        if (bl2) break block6;
                    }
                    bl3 = z2.v(n2);
                }
                object = n2.k();
                while (bw.a(z2.d((n)object))) {
                    n3 = ((m)object).b();
                    if (bl2 && bl2) {
                        if (n3 <= 0) break;
                        object = ((n)object).k();
                        if (bl2) continue;
                    }
                    break block4;
                }
                n3 = ((m)object).b();
            }
            if (bl2 && n3 > 0) {
                n3 = z2.a(((n)object).a(), this.d()) ? 1 : 0;
            }
        }
    }

    @Override
    public void a(i i2, z z2, n n2, Random random) {
        block2: {
            int n3;
            block3: {
                boolean bl2 = cL.e();
                if (random.nextInt(16) != 0) break block2;
                n n4 = n2.k();
                n3 = bw.a(z2.d(n4));
                if (!bl2) break block3;
                if (n3 == 0) break block2;
                n3 = n2.e();
            }
            double d10 = (float)n3 + random.nextFloat();
            double d11 = (double)n2.b() - 0.05;
            double d12 = (float)n2.a() + random.nextFloat();
            z2.a(aH.FALLING_DUST, d10, d11, d12, 0.0, 0.0, 0.0, K.l(i2));
        }
    }

    protected void a(r r2) {
    }

    public void a(z z2, n n2) {
    }

    public bw(c c10) {
        super(c10);
    }

    public bw() {
        super(net.minecraft.ac.c.o);
        this.a(net.minecraft.ad.a.r);
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        block0: {
            if (z2.C) break block0;
            this.c(z2, n2);
        }
    }
}

