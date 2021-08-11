/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.W.K;
import net.minecraft.W.Y;
import net.minecraft.W.Z;
import net.minecraft.W.cL;
import net.minecraft.W.cV;
import net.minecraft.W.cs;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ae.e;
import net.minecraft.ae.f;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.av;
import net.minecraft.k.h;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.d;

public class a7
extends Y
implements cs {
    protected static final /* synthetic */ k[] A;
    public static final /* synthetic */ f B;
    private final /* synthetic */ K D;
    public static final /* synthetic */ e C;

    @Override
    public k a(i i2, t t2, n n2) {
        return A[i2.b(B)];
    }

    @Override
    public void b(z z2, Random random, n n2, i i2) {
        this.e(z2, n2, i2);
    }

    @Nullable
    protected net.minecraft.w.k a() {
        boolean bl2 = cL.e();
        K k2 = this.D;
        K k3 = g.G;
        if (bl2) {
            if (k2 == k3) {
                return net.minecraft.u.h.bJ;
            }
            k2 = this.D;
            k3 = g.ae;
        }
        return k2 == k3 ? net.minecraft.u.h.bu : null;
    }

    static {
        B = f.a("age", 0, 7);
        C = cV.z;
        A = new k[]{new k(0.375, 0.0, 0.375, 0.625, 0.125, 0.625), new k(0.375, 0.0, 0.375, 0.625, 0.25, 0.625), new k(0.375, 0.0, 0.375, 0.625, 0.375, 0.625), new k(0.375, 0.0, 0.375, 0.625, 0.5, 0.625), new k(0.375, 0.0, 0.375, 0.625, 0.625, 0.625), new k(0.375, 0.0, 0.375, 0.625, 0.75, 0.625), new k(0.375, 0.0, 0.375, 0.625, 0.875, 0.625), new k(0.375, 0.0, 0.375, 0.625, 1.0, 0.625)};
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, B, C);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void e(z z2, n n2, i i2) {
        int n3 = i2.b(B) + net.minecraft.k.h.a(z2.J, 2, 5);
        z2.a(n2, i2.a(B, Math.min(7, n3)), 2);
    }

    @Override
    public boolean a(z z2, Random random, n n2, i i2) {
        return true;
    }

    protected a7(K k2) {
        this.h(this.e.a().a(B, 0).a(C, aA.UP));
        this.D = k2;
        this.a(true);
        this.a((a)null);
    }

    @Override
    public i c(int n2) {
        return this.d().a(B, n2);
    }

    @Override
    public boolean a(z z2, n n2, i i2, boolean bl2) {
        boolean bl3 = cL.b();
        boolean bl4 = i2.b(B).intValue();
        if (!bl3) {
            bl4 = !bl4;
        }
        return bl4;
    }

    @Override
    public i e(i i2, t t2, n n2) {
        i i3;
        block3: {
            int n3 = i2.b(B);
            i2 = i2.a(C, aA.UP);
            boolean bl2 = cL.e();
            for (aA aA2 : av.HORIZONTAL) {
                i3 = t2.d(n2.a(aA2));
                if (bl2) {
                    if (i3.b() == this.D && n3 == 7) {
                        i2 = i2.a(C, aA2);
                        if (bl2) break;
                    }
                    if (bl2) continue;
                }
                break block3;
            }
            i3 = i2;
        }
        return i3;
    }

    @Override
    protected boolean a(i i2) {
        return i2.b() == g.cU;
    }

    @Override
    public net.minecraft.w.k a(i i2, Random random, int n2) {
        return net.minecraft.u.h.v;
    }

    @Override
    public d c(z z2, n n2, i i2) {
        net.minecraft.w.k k2 = this.a();
        return k2 == null ? d.m : new d(k2);
    }

    @Override
    public void a(z z2, n n2, i i2, float f10, int n3) {
        block7: {
            net.minecraft.w.k k2;
            a7 a72;
            boolean bl2;
            block6: {
                bl2 = cL.e();
                a72 = this;
                if (!bl2) break block6;
                super.a(z2, n2, i2, f10, n3);
                if (z2.C) break block7;
                a72 = this;
            }
            if ((k2 = a72.a()) != null) {
                int n4 = i2.b(B);
                for (int i3 = 0; i3 < 3; ++i3) {
                    z z3 = z2;
                    if (bl2) {
                        if (z3.J.nextInt(15) > n4) continue;
                        z3 = z2;
                    }
                    a7.a(z3, n2, new d(k2));
                    if (bl2) continue;
                }
            }
        }
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        block5: {
            block11: {
                Object object;
                block12: {
                    K k2;
                    K k3;
                    block10: {
                        boolean bl2;
                        block9: {
                            K k4;
                            block3: {
                                block8: {
                                    block7: {
                                        int n3;
                                        int n4;
                                        block6: {
                                            n n5;
                                            z z3;
                                            a7 a72;
                                            block4: {
                                                bl2 = cL.b();
                                                a72 = this;
                                                z3 = z2;
                                                n5 = n2;
                                                if (bl2) break block4;
                                                super.a(z3, n5, i2, random);
                                                if (z2.s(n2.a()) < 9) break block5;
                                                a72 = this;
                                                z3 = z2;
                                                n5 = n2;
                                            }
                                            float f10 = Z.a(a72, z3, n5);
                                            n4 = random.nextInt((int)(25.0f / f10) + 1);
                                            if (bl2) break block6;
                                            if (n4 != 0) break block5;
                                            n4 = i2.b(B);
                                        }
                                        int n6 = n3 = n4;
                                        if (bl2) break block7;
                                        if (n6 >= 7) break block8;
                                        i2 = i2.a(B, n3 + 1);
                                        n6 = z2.a(n2, i2, 2) ? 1 : 0;
                                    }
                                    if (!bl2) break block5;
                                }
                                for (aA aA2 : av.HORIZONTAL) {
                                    k4 = z2.d(n2.a(aA2)).b();
                                    if (!bl2) {
                                        if (k4 == this.D) {
                                            return;
                                        }
                                        if (!bl2) continue;
                                    }
                                    break block3;
                                }
                                n2 = n2.a(av.HORIZONTAL.a(random));
                                k4 = z2.d(n2.k()).b();
                            }
                            k3 = k4;
                            object = z2.d(n2).b();
                            if (bl2) break block9;
                            if (((K)object).y != net.minecraft.ac.c.A) break block5;
                            object = k3;
                        }
                        k2 = g.cU;
                        if (bl2) break block10;
                        if (object == k2) break block11;
                        object = k3;
                        if (bl2) break block12;
                        k2 = g.bv;
                    }
                    if (object == k2) break block11;
                    object = k3;
                }
                if (object != g.aU) break block5;
            }
            z2.a(n2, this.D.d());
        }
    }

    @Override
    public int d(i i2) {
        return i2.b(B);
    }
}

