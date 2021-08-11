/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.U.B;
import net.minecraft.W.K;
import net.minecraft.W.aQ;
import net.minecraft.W.ak;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ae.c;
import net.minecraft.ae.e;
import net.minecraft.ah.a;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aD;
import net.minecraft.ar.aW;
import net.minecraft.ar.ae;
import net.minecraft.ar.h;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.u.g;
import net.minecraft.w.d;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class a0
extends ak {
    public static final /* synthetic */ c z;
    public static final /* synthetic */ e B;
    private static final /* synthetic */ Logger A;

    static {
        A = LogManager.getLogger();
        B = aQ.z;
        z = net.minecraft.ae.c.a("conditional");
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public i a(i i2, h h2) {
        return i2.a(h2.b(i2.b(B)));
    }

    @Override
    public i c(int n2) {
        boolean bl2 = cL.b();
        i i2 = this.d().a(B, aA.a(n2 & 7));
        boolean bl3 = n2 & 8;
        if (!bl2) {
            bl3 = bl3;
        }
        return i2.a(z, bl3);
    }

    @Override
    public i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        return this.d().a(B, aA.a(n2, b10)).a(z, false);
    }

    @Override
    public int d(i i2) {
        boolean bl2 = cL.e();
        int n3 = i2.b(B).f();
        n3 = i2.b(z).booleanValue();
        if (bl2) {
            n3 = n3 != 0 ? 8 : 0;
        }
        return n2 | n3;
    }

    private void a(i i2, z z2, n n2, net.minecraft.N.j j2, boolean bl2) {
        block4: {
            block3: {
                boolean bl3;
                block2: {
                    bl3 = cL.b();
                    boolean bl4 = bl2;
                    if (bl3) break block2;
                    if (!bl4) break block3;
                    bl4 = j2.a(z2);
                }
                if (!bl3) break block4;
            }
            j2.a(0);
        }
        a0.a(z2, n2, i2.b(B));
    }

    @Override
    public void a(z z2, n n2, i i2, B b10, d d10) {
        block7: {
            net.minecraft.N.B b11;
            block9: {
                block8: {
                    y y2;
                    boolean bl2;
                    block6: {
                        y y3 = z2.b(n2);
                        bl2 = cL.e();
                        y2 = y3;
                        if (!bl2) break block6;
                        if (!(y2 instanceof net.minecraft.N.B)) break block7;
                        y2 = y3;
                    }
                    b11 = (net.minecraft.N.B)y2;
                    net.minecraft.N.j j2 = b11.k();
                    boolean bl3 = d10.c();
                    if (bl2) {
                        if (bl3) {
                            j2.b(d10.g());
                        }
                        bl3 = z2.C;
                    }
                    if (bl3) break block7;
                    r r2 = d10.v();
                    if (!bl2) break block8;
                    if (r2 != null && r2.a("BlockEntityTag", 10)) break block9;
                    j2.a(z2.M().c("sendCommandFeedback"));
                }
                b11.a(this == g.bZ);
            }
            if (b11.e() == net.minecraft.N.g.SEQUENCE) {
                boolean bl4 = z2.x(n2);
                b11.c(bl4);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, n n2, i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        y y2 = z2.b(n2);
        boolean bl2 = cL.b();
        boolean bl3 = y2 instanceof net.minecraft.N.B;
        if (bl2) return bl3;
        if (!bl3) return false;
        bl3 = j2.b();
        if (bl2) return bl3;
        if (!bl3) return false;
        j2.a((net.minecraft.N.B)y2);
        return true;
    }

    private static void a(z z2, n n2, aA aA2) {
        block10: {
            int n3;
            block16: {
                o o2 = new o(n2);
                a a10 = z2.M();
                int n4 = a10.b("maxCommandChainLength");
                boolean bl2 = cL.e();
                while (n4-- > 0) {
                    i i2;
                    block13: {
                        boolean bl3;
                        net.minecraft.N.j j2;
                        block14: {
                            net.minecraft.N.B b10;
                            block15: {
                                net.minecraft.N.B b11;
                                K k2;
                                block11: {
                                    block12: {
                                        y y2;
                                        o2.a(aA2);
                                        i2 = z2.d(o2);
                                        k2 = i2.b();
                                        if (!bl2) break block10;
                                        if (k2 != g.bZ && bl2) break;
                                        y y3 = y2 = z2.b(o2);
                                        if (bl2) {
                                            if (!(y3 instanceof net.minecraft.N.B) && bl2) break;
                                            y3 = y2;
                                        }
                                        b11 = b10 = (net.minecraft.N.B)y3;
                                        if (bl2) {
                                            if (b11.e() != net.minecraft.N.g.SEQUENCE && bl2) break;
                                            b11 = b10;
                                        }
                                        if (!bl2) break block11;
                                        if (b11.i()) break block12;
                                        b11 = b10;
                                        if (!bl2) break block11;
                                        if (!b11.b()) break block13;
                                    }
                                    b11 = b10;
                                }
                                j2 = b11.k();
                                bl3 = b10.g();
                                if (!bl2) break block14;
                                if (!bl3) break block15;
                                if (!j2.a(z2) && bl2) break;
                                z2.b((n)o2, k2);
                                if (bl2) break block13;
                            }
                            bl3 = b10.d();
                        }
                        if (bl3) {
                            j2.a(0);
                        }
                    }
                    aA2 = i2.b(B);
                    if (bl2) continue;
                }
                n3 = n4;
                if (!bl2) break block16;
                if (n3 > 0) break block10;
                n3 = Math.max(a10.b("maxCommandChainLength"), 0);
            }
            int n5 = n3;
            A.warn("Commandblock chain tried to execure more than " + n5 + " steps!");
        }
    }

    @Override
    public boolean s(i i2) {
        return true;
    }

    @Override
    public int a(z z2) {
        return 1;
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, B, z);
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        block10: {
            block20: {
                boolean bl2;
                net.minecraft.N.j j2;
                block21: {
                    net.minecraft.N.B b10;
                    block22: {
                        net.minecraft.N.g g10;
                        net.minecraft.N.g g11;
                        boolean bl3;
                        boolean bl4;
                        boolean bl5;
                        block12: {
                            net.minecraft.N.g g12;
                            block13: {
                                block19: {
                                    boolean bl6;
                                    block18: {
                                        block17: {
                                            block16: {
                                                block14: {
                                                    block15: {
                                                        y y2;
                                                        block11: {
                                                            y y3;
                                                            z z3;
                                                            block9: {
                                                                bl5 = cL.e();
                                                                z3 = z2;
                                                                if (!bl5) break block9;
                                                                if (z3.C) break block10;
                                                                z3 = z2;
                                                            }
                                                            y2 = y3 = z3.b(n2);
                                                            if (!bl5) break block11;
                                                            if (!(y2 instanceof net.minecraft.N.B)) break block10;
                                                            y2 = y3;
                                                        }
                                                        b10 = (net.minecraft.N.B)y2;
                                                        j2 = b10.k();
                                                        boolean bl7 = aD.a(j2.d());
                                                        if (bl5) {
                                                            bl7 = !bl7;
                                                        }
                                                        bl4 = bl7;
                                                        g12 = b10.e();
                                                        bl3 = b10.c();
                                                        g11 = g12;
                                                        g10 = net.minecraft.N.g.AUTO;
                                                        if (!bl5) break block12;
                                                        if (g11 != g10) break block13;
                                                        b10.g();
                                                        bl6 = bl3;
                                                        if (!bl5) break block14;
                                                        if (!bl6) break block15;
                                                        this.a(i2, z2, n2, j2, bl4);
                                                        if (bl5) break block16;
                                                    }
                                                    bl6 = b10.d();
                                                }
                                                if (!bl5) break block17;
                                                if (bl6) {
                                                    j2.a(0);
                                                }
                                            }
                                            bl6 = b10.i();
                                        }
                                        if (!bl5) break block18;
                                        if (bl6) break block19;
                                        bl6 = b10.b();
                                    }
                                    if (!bl6) break block20;
                                }
                                z2.a(n2, (K)this, this.a(z2));
                                if (bl5) break block20;
                            }
                            g11 = g12;
                            g10 = net.minecraft.N.g.REDSTONE;
                        }
                        if (g11 != g10) break block20;
                        bl2 = bl3;
                        if (!bl5) break block21;
                        if (!bl2) break block22;
                        this.a(i2, z2, n2, j2, bl4);
                        if (bl5) break block20;
                    }
                    bl2 = b10.d();
                }
                if (bl2) {
                    j2.a(0);
                }
            }
            z2.b(n2, this);
        }
    }

    @Override
    public y a(z z2, int n2) {
        net.minecraft.N.B b10 = new net.minecraft.N.B();
        b10.a(this == g.bZ);
        return b10;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public i a(i i2, ae ae2) {
        return i2.a(B, ae2.a(i2.b(B)));
    }

    @Override
    public int b(i i2, z z2, n n2) {
        y y2 = z2.b(n2);
        boolean bl2 = cL.e();
        int n3 = y2 instanceof net.minecraft.N.B;
        if (bl2) {
            n3 = n3 != 0 ? ((net.minecraft.N.B)y2).k().h() : 0;
        }
        return n3;
    }

    @Override
    public aW b(i i2) {
        return aW.MODEL;
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        block3: {
            block7: {
                net.minecraft.N.B b10;
                boolean bl2;
                net.minecraft.N.B b11;
                boolean bl3;
                block6: {
                    boolean bl4;
                    block5: {
                        y y2;
                        block4: {
                            y y3;
                            z z3;
                            block2: {
                                bl3 = cL.b();
                                z3 = z2;
                                if (bl3) break block2;
                                if (z3.C) break block3;
                                z3 = z2;
                            }
                            y2 = y3 = z3.b(n2);
                            if (bl3) break block4;
                            if (!(y2 instanceof net.minecraft.N.B)) break block3;
                            y2 = y3;
                        }
                        b11 = (net.minecraft.N.B)y2;
                        bl2 = z2.x(n2);
                        boolean bl5 = b11.i();
                        b11.c(bl2);
                        bl4 = bl5;
                        if (bl3) break block5;
                        if (bl4) break block3;
                        b10 = b11;
                        if (bl3) break block6;
                        bl4 = b10.b();
                    }
                    if (bl4) break block3;
                    b10 = b11;
                }
                if (b10.e() == net.minecraft.N.g.SEQUENCE) break block3;
                boolean bl6 = bl2;
                if (bl3) break block7;
                if (!bl6) break block3;
                bl6 = b11.g();
            }
            z2.a(n2, (K)this, this.a(z2));
        }
    }

    public a0(net.minecraft.ac.a a10) {
        super(net.minecraft.ac.c.D, a10);
        this.h(this.e.a().a(B, aA.NORTH).a(z, false));
    }
}

