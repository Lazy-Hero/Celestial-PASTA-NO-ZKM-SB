/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.J.r;
import net.minecraft.W.K;
import net.minecraft.W.bw;
import net.minecraft.W.cL;
import net.minecraft.Z.d;
import net.minecraft.Z.i;
import net.minecraft.ac.a;
import net.minecraft.ac.c;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aH;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.n;

public class a8
extends K {
    protected static final /* synthetic */ k z;

    private static gP a(gP gP2) {
        return gP2;
    }

    private void c(z z2, n n2) {
        block6: {
            int n3;
            n n4;
            boolean bl2;
            block4: {
                block8: {
                    boolean bl3;
                    block9: {
                        int n5;
                        block7: {
                            block5: {
                                bl2 = cL.e();
                                n5 = bw.a(z2.d(n2.k()));
                                if (!bl2) break block5;
                                if (n5 == 0) break block6;
                                n5 = n2.b();
                            }
                            if (!bl2) break block7;
                            if (n5 < 0) break block6;
                            n5 = 32;
                        }
                        int n6 = n5;
                        bl3 = bw.z;
                        if (!bl2) break block8;
                        if (bl3) break block9;
                        bl3 = z2.a(n2.a(-32, -32, -32), n2.a(32, 32, 32));
                        if (!bl2) break block8;
                        if (!bl3) break block9;
                        z2.f(new r(z2, (float)n2.e() + 0.5f, n2.b(), (float)n2.a() + 0.5f, this.d()));
                        if (bl2) break block6;
                    }
                    bl3 = z2.v(n2);
                }
                n4 = n2;
                while (bw.a(z2.d(n4))) {
                    n3 = n4.b();
                    if (bl2 && bl2) {
                        if (n3 <= 0) break;
                        n4 = n4.k();
                        if (bl2) continue;
                    }
                    break block4;
                }
                n3 = n4.b();
            }
            if (bl2 && n3 > 0) {
                n3 = z2.a(n4, this.d(), 2) ? 1 : 0;
            }
        }
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        this.c(z2, n2);
    }

    @Override
    public d a(t t2, i i2, n n2, aA aA2) {
        return d.UNDEFINED;
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        z2.a(n2, (K)this, this.a(z2));
    }

    @Override
    public int a(z z2) {
        return 5;
    }

    private void a(z z2, n n2) {
        block8: {
            i i2 = z2.d(n2);
            boolean bl2 = cL.b();
            if (i2.b() != this) break block8;
            int n3 = 0;
            while (n3 < 1000) {
                block9: {
                    block10: {
                        block7: {
                            boolean bl3;
                            n n4;
                            block11: {
                                n4 = n2.a(z2.J.nextInt(16) - z2.J.nextInt(16), z2.J.nextInt(8) - z2.J.nextInt(8), z2.J.nextInt(16) - z2.J.nextInt(16));
                                if (bl2) break block9;
                                if (z2.d((n)n4).b().y != net.minecraft.ac.c.A) break block10;
                                bl3 = z2.C;
                                if (bl2) break block7;
                                if (!bl3) break block11;
                                for (int i3 = 0; i3 < 128; ++i3) {
                                    double d10 = z2.J.nextDouble();
                                    float f10 = (z2.J.nextFloat() - 0.5f) * 0.2f;
                                    float f11 = (z2.J.nextFloat() - 0.5f) * 0.2f;
                                    float f12 = (z2.J.nextFloat() - 0.5f) * 0.2f;
                                    double d11 = (double)n4.e() + (double)(n2.e() - n4.e()) * d10 + (z2.J.nextDouble() - 0.5) + 0.5;
                                    double d12 = (double)n4.b() + (double)(n2.b() - n4.b()) * d10 + z2.J.nextDouble() - 0.5;
                                    double d13 = (double)n4.a() + (double)(n2.a() - n4.a()) * d10 + (z2.J.nextDouble() - 0.5) + 0.5;
                                    z2.a(aH.PORTAL, d11, d12, d13, (double)f10, (double)f11, (double)f12, new int[0]);
                                    if (!bl2) {
                                        if (!bl2) continue;
                                    }
                                    break block7;
                                }
                                if (!bl2) break block7;
                            }
                            z2.a(n4, i2, 2);
                            bl3 = z2.v(n2);
                        }
                        return;
                    }
                    ++n3;
                }
                if (!bl2) continue;
            }
        }
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public void b(z z2, n n2, i i2) {
        z2.a(n2, (K)this, this.a(z2));
    }

    @Override
    public boolean a(z z2, n n2, i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        this.a(z2, n2);
        return true;
    }

    @Override
    public boolean b(i i2, t t2, n n2, aA aA2) {
        return true;
    }

    public a8() {
        super(net.minecraft.ac.c.p, net.minecraft.ac.a.k);
    }

    static {
        z = new k(0.0625, 0.0, 0.0625, 0.9375, 1.0, 0.9375);
    }

    @Override
    public void a(z z2, n n2, j j2) {
        this.a(z2, n2);
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return z;
    }
}

