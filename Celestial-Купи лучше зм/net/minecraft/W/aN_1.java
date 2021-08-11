/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.B.V;
import net.minecraft.B.a;
import net.minecraft.N.M;
import net.minecraft.N.y;
import net.minecraft.U.B;
import net.minecraft.W.K;
import net.minecraft.W.ak;
import net.minecraft.W.bF;
import net.minecraft.W.cL;
import net.minecraft.W.v;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ae.e;
import net.minecraft.ah.z;
import net.minecraft.ar.Q;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aH;
import net.minecraft.ar.aW;
import net.minecraft.ar.ae;
import net.minecraft.ar.ay;
import net.minecraft.ar.h;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.l.m;
import net.minecraft.u.E;
import net.minecraft.u.g;
import net.minecraft.w.d;
import net.minecraft.w.k;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aN
extends ak {
    private final /* synthetic */ boolean A;
    private static /* synthetic */ boolean z;
    public static final /* synthetic */ e B;

    @Override
    public y a(z z2, int n2) {
        return new M();
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, B);
    }

    @Override
    public i a(i i2, h h2) {
        return i2.a(h2.b(i2.b(B)));
    }

    protected aN(boolean bl2) {
        super(net.minecraft.ac.c.H);
        this.h(this.e.a().a(B, aA.NORTH));
        this.A = bl2;
    }

    private void c(z z2, n n2, i i2) {
        block5: {
            boolean bl2;
            aA aA2;
            block9: {
                aA aA3;
                aA aA4;
                i i3;
                i i4;
                boolean bl3;
                block13: {
                    block14: {
                        boolean bl4;
                        block15: {
                            block10: {
                                block11: {
                                    boolean bl5;
                                    block12: {
                                        i i5;
                                        i i6;
                                        block6: {
                                            block7: {
                                                boolean bl6;
                                                block8: {
                                                    z z3;
                                                    block4: {
                                                        bl3 = cL.e();
                                                        z3 = z2;
                                                        if (!bl3) break block4;
                                                        if (z3.C) break block5;
                                                        z3 = z2;
                                                    }
                                                    i6 = z3.d(n2.i());
                                                    i5 = z2.d(n2.j());
                                                    i4 = z2.d(n2.b());
                                                    i3 = z2.d(n2.m());
                                                    aA4 = aA2 = i2.b(B);
                                                    aA3 = aA.NORTH;
                                                    if (!bl3) break block6;
                                                    if (aA4 != aA3) break block7;
                                                    bl6 = i6.m();
                                                    if (!bl3) break block8;
                                                    if (!bl6) break block7;
                                                    bl6 = i5.m();
                                                }
                                                if (bl6) break block7;
                                                aA2 = aA.SOUTH;
                                                if (bl3) break block9;
                                            }
                                            aA4 = aA2;
                                            aA3 = aA.SOUTH;
                                        }
                                        if (!bl3) break block10;
                                        if (aA4 != aA3) break block11;
                                        bl5 = i5.m();
                                        if (!bl3) break block12;
                                        if (!bl5) break block11;
                                        bl5 = i6.m();
                                    }
                                    if (bl5) break block11;
                                    aA2 = aA.NORTH;
                                    if (bl3) break block9;
                                }
                                aA4 = aA2;
                                aA3 = aA.WEST;
                            }
                            if (!bl3) break block13;
                            if (aA4 != aA3) break block14;
                            bl4 = i4.m();
                            if (!bl3) break block15;
                            if (!bl4) break block14;
                            bl4 = i3.m();
                        }
                        if (bl4) break block14;
                        aA2 = aA.EAST;
                        if (bl3) break block9;
                    }
                    aA4 = aA2;
                    aA3 = aA.EAST;
                }
                if (aA4 != aA3) break block9;
                bl2 = i3.m();
                if (!bl3) break block5;
                if (!bl2) break block9;
                bl2 = i4.m();
                if (!bl3) break block5;
                if (!bl2) {
                    aA2 = aA.WEST;
                }
            }
            bl2 = z2.a(n2, i2.a(B, aA2), 2);
        }
    }

    public static void a(boolean bl2, z z2, n n2) {
        block7: {
            y y2;
            y y3;
            block6: {
                boolean bl3;
                block4: {
                    boolean bl4;
                    i i2;
                    block5: {
                        i2 = z2.d(n2);
                        y3 = z2.b(n2);
                        bl3 = cL.e();
                        z = true;
                        bl4 = bl2;
                        if (!bl3) break block4;
                        if (!bl4) break block5;
                        z2.a(n2, g.bn.d().a(B, i2.b(B)), 3);
                        z2.a(n2, g.bn.d().a(B, i2.b(B)), 3);
                        if (bl3) break block4;
                    }
                    z2.a(n2, g.bJ.d().a(B, i2.b(B)), 3);
                    bl4 = z2.a(n2, g.bJ.d().a(B, i2.b(B)), 3);
                }
                z = false;
                y2 = y3;
                if (!bl3) break block6;
                if (y2 == null) break block7;
                y2 = y3;
            }
            y2.o();
            z2.b(n2, y3);
        }
    }

    @Override
    public d c(z z2, n n2, i i2) {
        return new d(g.bJ);
    }

    @Override
    public int b(i i2, z z2, n n2) {
        return net.minecraft.B.n.a(z2.b(n2));
    }

    @Override
    public void b(z z2, n n2, i i2) {
        this.c(z2, n2, i2);
    }

    @Override
    public i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        return this.d().a(B, b10.K().h());
    }

    @Override
    public void a(i i2, z z2, n n2, Random random) {
        boolean bl2 = cL.e();
        if (this.A) {
            aA aA2 = i2.b(B);
            double d10 = (double)n2.e() + 0.5;
            double d11 = (double)n2.b() + random.nextDouble() * 6.0 / 16.0;
            double d12 = (double)n2.a() + 0.5;
            double d13 = 0.52;
            double d14 = random.nextDouble() * 0.6 - 0.3;
            double d15 = random.nextDouble() - 0.1;
            double d16 = d15 == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1);
            if (bl2) {
                if (d16 < 0) {
                    z2.a((double)n2.e() + 0.5, (double)n2.b(), (double)n2.a() + 0.5, E.cj, ay.BLOCKS, 1.0f, 1.0f, false);
                }
                d16 = v.a[aA2.ordinal()];
            }
            switch (d16) {
                case 1: {
                    z2.a(aH.SMOKE_NORMAL, d10 - 0.52, d11, d12 + d14, 0.0, 0.0, 0.0, new int[0]);
                    z2.a(aH.FLAME, d10 - 0.52, d11, d12 + d14, 0.0, 0.0, 0.0, new int[0]);
                    if (bl2) break;
                }
                case 2: {
                    z2.a(aH.SMOKE_NORMAL, d10 + 0.52, d11, d12 + d14, 0.0, 0.0, 0.0, new int[0]);
                    z2.a(aH.FLAME, d10 + 0.52, d11, d12 + d14, 0.0, 0.0, 0.0, new int[0]);
                    if (bl2) break;
                }
                case 3: {
                    z2.a(aH.SMOKE_NORMAL, d10 + d14, d11, d12 - 0.52, 0.0, 0.0, 0.0, new int[0]);
                    z2.a(aH.FLAME, d10 + d14, d11, d12 - 0.52, 0.0, 0.0, 0.0, new int[0]);
                    if (bl2) break;
                }
                case 4: {
                    z2.a(aH.SMOKE_NORMAL, d10 + d14, d11, d12 + 0.52, 0.0, 0.0, 0.0, new int[0]);
                    z2.a(aH.FLAME, d10 + d14, d11, d12 + 0.52, 0.0, 0.0, 0.0, new int[0]);
                    break;
                }
            }
        }
    }

    @Override
    public boolean a(z z2, n n2, i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        boolean bl2 = cL.b();
        z z3 = z2;
        if (!bl2) {
            if (z3.C) {
                return true;
            }
            z3 = z2;
        }
        y y2 = z3.b(n2);
        boolean bl3 = y2 instanceof M;
        if (!bl2) {
            if (bl3) {
                j2.a((M)y2);
                j2.b(net.minecraft.l.m.f);
            }
            bl3 = true;
        }
        return bl3;
    }

    @Override
    public aW b(i i2) {
        return aW.MODEL;
    }

    @Override
    public boolean s(i i2) {
        return true;
    }

    @Override
    public k a(i i2, Random random, int n2) {
        return net.minecraft.w.k.b(g.bJ);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(z z2, n n2, i i2) {
        block4: {
            block5: {
                boolean bl2 = cL.b();
                if (bl2) break block4;
                if (z) break block5;
                y y2 = z2.b(n2);
                if (bl2) break block4;
                if (y2 instanceof M) {
                    V.a(z2, n2, (a)((M)y2));
                    z2.b(n2, this);
                }
            }
            super.a(z2, n2, i2);
        }
    }

    @Override
    public void a(z z2, n n2, i i2, B b10, d d10) {
        block3: {
            y y2;
            block4: {
                y y3;
                n n3;
                z z3;
                boolean bl2;
                block2: {
                    bl2 = cL.b();
                    z3 = z2;
                    n3 = n2;
                    if (bl2) break block2;
                    z3.a(n3, i2.a(B, b10.K().h()), 2);
                    if (!d10.c()) break block3;
                    z3 = z2;
                    n3 = n2;
                }
                y2 = y3 = z3.b(n3);
                if (bl2) break block4;
                if (!(y2 instanceof M)) break block3;
                y2 = y3;
            }
            ((M)y2).a(d10.g());
        }
    }

    static {
        B = bF.z;
    }

    @Override
    public int d(i i2) {
        return i2.b(B).f();
    }

    @Override
    public i c(int n2) {
        aA aA2;
        block3: {
            aA aA3;
            block2: {
                aA2 = aA.a(n2);
                boolean bl2 = cL.e();
                aA3 = aA2;
                if (!bl2) break block2;
                if (aA3.g() != Q.Y) break block3;
                aA3 = aA.NORTH;
            }
            aA2 = aA3;
        }
        return this.d().a(B, aA2);
    }

    @Override
    public i a(i i2, ae ae2) {
        return i2.a(B, ae2.a(i2.b(B)));
    }
}

