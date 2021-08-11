/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import java.util.Iterator;
import javax.annotation.Nullable;
import net.minecraft.B.U;
import net.minecraft.B.V;
import net.minecraft.N.O;
import net.minecraft.N.y;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.ak;
import net.minecraft.W.bF;
import net.minecraft.W.cL;
import net.minecraft.W.cd;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ae.e;
import net.minecraft.ag.S;
import net.minecraft.ah.l;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.Q;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aW;
import net.minecraft.ar.ae;
import net.minecraft.ar.av;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.l.m;
import net.minecraft.w.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class az
extends ak {
    protected static final /* synthetic */ k z;
    protected static final /* synthetic */ k B;
    protected static final /* synthetic */ k A;
    public final /* synthetic */ cd D;
    protected static final /* synthetic */ k E;
    protected static final /* synthetic */ k F;
    public static final /* synthetic */ e C;

    @Override
    public int b(i i2, z z2, n n2) {
        return net.minecraft.B.n.b(this.g(z2, n2));
    }

    @Override
    public void b(z z2, n n2, i i2) {
        boolean bl2 = cL.e();
        this.b(z2, n2, i2);
        Iterator<aA> iterator = av.HORIZONTAL.iterator();
        boolean bl3 = bl2;
        while (iterator.hasNext()) {
            i i3;
            aA aA2 = iterator.next();
            n n3 = n2.a(aA2);
            i i4 = i3 = z2.d(n3);
            if (bl3 && i4.b() == this) {
                i4 = this.b(z2, n3, i3);
            }
            if (bl3) continue;
        }
    }

    @Override
    public boolean o(i i2) {
        return this.D == cd.TRAP;
    }

    @Override
    public boolean a(z z2, n n2, i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        block8: {
            cd cd2;
            cd cd3;
            block9: {
                block10: {
                    boolean bl2;
                    block7: {
                        block6: {
                            boolean bl3;
                            block5: {
                                bl2 = cL.e();
                                bl3 = z2.C;
                                if (!bl2) break block5;
                                if (!bl3) break block6;
                                bl3 = true;
                            }
                            return bl3;
                        }
                        l l2 = this.g(z2, n2);
                        if (!bl2) break block7;
                        if (l2 == null) break block8;
                        j2.a(l2);
                    }
                    cd3 = this.D;
                    cd2 = cd.BASIC;
                    if (!bl2) break block9;
                    if (cd3 != cd2) break block10;
                    j2.b(net.minecraft.l.m.W);
                    if (bl2) break block8;
                }
                cd3 = this.D;
                cd2 = cd.TRAP;
            }
            if (cd3 == cd2) {
                j2.b(net.minecraft.l.m.E);
            }
        }
        return true;
    }

    @Override
    public net.minecraft.Z.d a(t t2, i i2, n n2, aA aA2) {
        return net.minecraft.Z.d.UNDEFINED;
    }

    private boolean f(z z2, n n2) {
        boolean bl2;
        block3: {
            Iterator<S> iterator = z2.a(S.class, new k(n2.e(), n2.b() + 1, n2.a(), n2.e() + 1, n2.b() + 2, n2.a() + 1)).iterator();
            boolean bl3 = cL.b();
            while (iterator.hasNext()) {
                block5: {
                    boolean bl4;
                    block4: {
                        x x2 = iterator.next();
                        S s2 = (S)x2;
                        bl2 = s2.D();
                        if (bl3) break block3;
                        if (bl3) break block4;
                        if (!bl2) break block5;
                        bl4 = true;
                    }
                    return bl4;
                }
                if (!bl3) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    private boolean d(z z2, n n2) {
        boolean bl2 = cL.b();
        if (z2.d(n2).b() != this) {
            return false;
        }
        for (aA aA2 : av.HORIZONTAL) {
            if (z2.d(n2.a(aA2)).b() == this) {
                return true;
            }
            if (!bl2) continue;
        }
        return false;
    }

    @Nullable
    public l a(z z2, n n2, boolean bl2) {
        l l2;
        boolean bl3;
        block12: {
            boolean bl4;
            block11: {
                y y2 = z2.b(n2);
                bl3 = cL.b();
                y y3 = y2;
                if (!bl3) {
                    if (!(y3 instanceof O)) {
                        return null;
                    }
                    y3 = y2;
                }
                l2 = (O)y3;
                bl4 = bl2;
                if (bl3) break block11;
                if (bl4) break block12;
                bl4 = this.c(z2, n2);
            }
            if (bl4) {
                return null;
            }
        }
        for (aA aA2 : av.HORIZONTAL) {
            block13: {
                y y4;
                block15: {
                    aA aA3;
                    aA aA4;
                    block14: {
                        n n3 = n2.a(aA2);
                        K k2 = z2.d(n3).b();
                        if (k2 != this) break block13;
                        if (this.c(z2, n3)) {
                            return null;
                        }
                        y4 = z2.b(n3);
                        if (!(y4 instanceof O)) break block13;
                        aA4 = aA2;
                        aA3 = aA.WEST;
                        if (bl3) break block14;
                        if (aA4 == aA3) break block15;
                        aA4 = aA2;
                        aA3 = aA.NORTH;
                    }
                    if (aA4 == aA3) break block15;
                    l2 = new U("container.chestDouble", l2, (O)y4);
                    if (!bl3) break block13;
                }
                l2 = new U("container.chestDouble", (O)y4, l2);
            }
            if (!bl3) continue;
        }
        return l2;
    }

    @Override
    public void a(z z2, n n2, i i2) {
        y y2 = z2.b(n2);
        boolean bl2 = cL.b();
        if (!bl2) {
            if (y2 instanceof net.minecraft.B.a) {
                V.a(z2, n2, (net.minecraft.B.a)((Object)y2));
                z2.b(n2, this);
            }
            super.a(z2, n2, i2);
        }
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public int a(i i2, t t2, n n2, aA aA2) {
        boolean bl2 = cL.e();
        int n3 = i2.a();
        if (bl2) {
            if (n3 == 0) {
                return 0;
            }
            n3 = 0;
        }
        int n4 = n3;
        y y2 = t2.b(n2);
        int n5 = y2 instanceof O;
        if (bl2) {
            if (n5 != 0) {
                n4 = ((O)y2).r;
            }
            n5 = net.minecraft.k.h.c(n4, 0, 15);
        }
        return n5;
    }

    @Nullable
    public l g(z z2, n n2) {
        return this.a(z2, n2, false);
    }

    @Override
    public int d(i i2) {
        return i2.b(C).f();
    }

    protected az(cd cd2) {
        super(net.minecraft.ac.c.k);
        this.h(this.e.a().a(C, aA.NORTH));
        this.D = cd2;
        this.a(cd2 == cd.TRAP ? net.minecraft.ad.a.p : net.minecraft.ad.a.j);
    }

    @Override
    public k a(i i2, t t2, n n2) {
        boolean bl2 = cL.b();
        K k2 = t2.d(n2.i()).b();
        az az2 = this;
        if (!bl2) {
            if (k2 == az2) {
                return z;
            }
            k2 = t2.d(n2.j()).b();
            az2 = this;
        }
        if (!bl2) {
            if (k2 == az2) {
                return B;
            }
            k2 = t2.d(n2.b()).b();
            az2 = this;
        }
        if (!bl2) {
            if (k2 == az2) {
                return A;
            }
            k2 = t2.d(n2.m()).b();
            az2 = this;
        }
        return k2 == az2 ? E : F;
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        block3: {
            y y2;
            block2: {
                super.a(i2, z2, n2, k2, n3);
                y y3 = z2.b(n2);
                boolean bl2 = cL.b();
                y2 = y3;
                if (bl2) break block2;
                if (!(y2 instanceof O)) break block3;
                y2 = y3;
            }
            y2.t();
        }
    }

    @Override
    public boolean s(i i2) {
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public aW b(i i2) {
        return aW.ENTITYBLOCK_ANIMATED;
    }

    @Override
    public int c(i i2, t t2, n n2, aA aA2) {
        return aA2 == aA.UP ? i2.a(t2, n2, aA2) : 0;
    }

    @Override
    public i a(i i2, ae ae2) {
        return i2.a(C, ae2.a(i2.b(C)));
    }

    @Override
    public i c(int n2) {
        aA aA2;
        block3: {
            aA aA3;
            block2: {
                aA2 = aA.a(n2);
                boolean bl2 = cL.b();
                aA3 = aA2;
                if (bl2) break block2;
                if (aA3.g() != Q.Y) break block3;
                aA3 = aA.NORTH;
            }
            aA2 = aA3;
        }
        return this.d().a(C, aA2);
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, C);
    }

    @Override
    public i a(i i2, net.minecraft.ar.h h2) {
        return i2.a(h2.b(i2.b(C)));
    }

    @Override
    public y a(z z2, int n2) {
        return new O();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean c(z z2, n n2) {
        boolean bl2 = cL.b();
        boolean bl3 = this.e(z2, n2);
        if (bl2) return bl3;
        if (bl3) return true;
        bl3 = this.f(z2, n2);
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    @Override
    public i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        return this.d().a(C, b10.K());
    }

    @Override
    public boolean a(z z2, n n2) {
        boolean bl2;
        int n3;
        block25: {
            boolean bl3;
            block26: {
                az az2;
                K k2;
                n n4;
                block21: {
                    block22: {
                        block24: {
                            boolean bl4;
                            block23: {
                                n n5;
                                block17: {
                                    block18: {
                                        block20: {
                                            boolean bl5;
                                            block19: {
                                                n n6;
                                                block13: {
                                                    block14: {
                                                        block16: {
                                                            boolean bl6;
                                                            block15: {
                                                                n3 = 0;
                                                                n n7 = n2.b();
                                                                n6 = n2.m();
                                                                n5 = n2.i();
                                                                n4 = n2.j();
                                                                bl2 = cL.e();
                                                                k2 = z2.d(n7).b();
                                                                az2 = this;
                                                                if (!bl2) break block13;
                                                                if (k2 != az2) break block14;
                                                                bl6 = this.d(z2, n7);
                                                                if (!bl2) break block15;
                                                                if (!bl6) break block16;
                                                                bl6 = false;
                                                            }
                                                            return bl6;
                                                        }
                                                        ++n3;
                                                    }
                                                    k2 = z2.d(n6).b();
                                                    az2 = this;
                                                }
                                                if (!bl2) break block17;
                                                if (k2 != az2) break block18;
                                                bl5 = this.d(z2, n6);
                                                if (!bl2) break block19;
                                                if (!bl5) break block20;
                                                bl5 = false;
                                            }
                                            return bl5;
                                        }
                                        ++n3;
                                    }
                                    k2 = z2.d(n5).b();
                                    az2 = this;
                                }
                                if (!bl2) break block21;
                                if (k2 != az2) break block22;
                                bl4 = this.d(z2, n5);
                                if (!bl2) break block23;
                                if (!bl4) break block24;
                                bl4 = false;
                            }
                            return bl4;
                        }
                        ++n3;
                    }
                    k2 = z2.d(n4).b();
                    az2 = this;
                }
                if (k2 != az2) break block25;
                bl3 = this.d(z2, n4);
                if (!bl2) break block26;
                if (!bl3) break block25;
                bl3 = false;
            }
            return bl3;
        }
        int n8 = ++n3;
        if (bl2) {
            n8 = n8 <= 1 ? 1 : 0;
        }
        return n8 != 0;
    }

    @Override
    public void a(z z2, n n2, i i2, B b10, d d10) {
        block23: {
            y y2;
            block24: {
                y y3;
                boolean bl2;
                boolean bl3;
                block18: {
                    block11: {
                        block21: {
                            boolean bl4;
                            n n3;
                            block22: {
                                n n4;
                                block14: {
                                    boolean bl5;
                                    block15: {
                                        block19: {
                                            boolean bl6;
                                            n n5;
                                            block20: {
                                                n n6;
                                                block16: {
                                                    boolean bl7;
                                                    block17: {
                                                        Q q2;
                                                        Q q3;
                                                        boolean bl8;
                                                        block12: {
                                                            aA aA2;
                                                            block13: {
                                                                boolean bl9;
                                                                block7: {
                                                                    block10: {
                                                                        boolean bl10;
                                                                        block9: {
                                                                            block8: {
                                                                                block6: {
                                                                                    aA2 = aA.b(net.minecraft.k.h.f((double)(b10.e * 4.0f / 360.0f) + 0.5) & 3).h();
                                                                                    i2 = i2.a(C, aA2);
                                                                                    bl3 = cL.b();
                                                                                    n4 = n2.i();
                                                                                    n3 = n2.j();
                                                                                    n6 = n2.b();
                                                                                    n5 = n2.m();
                                                                                    bl5 = this == z2.d(n4).b();
                                                                                    bl9 = this == z2.d(n3).b();
                                                                                    bl7 = this == z2.d(n6).b();
                                                                                    bl8 = this == z2.d(n5).b();
                                                                                    bl10 = bl5;
                                                                                    if (bl3) break block6;
                                                                                    if (bl10) break block7;
                                                                                    bl10 = bl9;
                                                                                }
                                                                                if (bl3) break block8;
                                                                                if (bl10) break block7;
                                                                                bl10 = bl7;
                                                                            }
                                                                            if (bl3) break block9;
                                                                            if (bl10) break block7;
                                                                            bl10 = bl8;
                                                                        }
                                                                        if (bl3) break block10;
                                                                        if (bl10) break block7;
                                                                        bl10 = z2.a(n2, i2, 3);
                                                                    }
                                                                    if (!bl3) break block11;
                                                                }
                                                                q3 = aA2.g();
                                                                q2 = Q.X;
                                                                if (bl3) break block12;
                                                                if (q3 != q2) break block13;
                                                                bl4 = bl5;
                                                                if (bl3) break block14;
                                                                if (bl4) break block15;
                                                                bl4 = bl9;
                                                                if (bl3) break block14;
                                                                if (bl4) break block15;
                                                            }
                                                            q3 = aA2.g();
                                                            q2 = Q.Z;
                                                        }
                                                        if (q3 != q2) break block11;
                                                        bl6 = bl7;
                                                        if (bl3) break block16;
                                                        if (bl6) break block17;
                                                        bl2 = bl8;
                                                        if (bl3) break block18;
                                                        if (!bl2) break block11;
                                                    }
                                                    bl6 = bl7;
                                                }
                                                if (bl3) break block19;
                                                if (!bl6) break block20;
                                                z2.a(n6, i2, 3);
                                                if (!bl3) break block19;
                                            }
                                            bl6 = z2.a(n5, i2, 3);
                                        }
                                        z2.a(n2, i2, 3);
                                        if (!bl3) break block11;
                                    }
                                    bl4 = bl5;
                                }
                                if (bl3) break block21;
                                if (!bl4) break block22;
                                z2.a(n4, i2, 3);
                                if (!bl3) break block21;
                            }
                            bl4 = z2.a(n3, i2, 3);
                        }
                        z2.a(n2, i2, 3);
                    }
                    bl2 = d10.c();
                }
                if (!bl2) break block23;
                y2 = y3 = z2.b(n2);
                if (bl3) break block24;
                if (!(y2 instanceof O)) break block23;
                y2 = y3;
            }
            ((O)y2).a(d10.g());
        }
    }

    private boolean e(z z2, n n2) {
        return z2.d(n2.a()).r();
    }

    static {
        C = bF.z;
        z = new k(0.0625, 0.0, 0.0, 0.9375, 0.875, 0.9375);
        B = new k(0.0625, 0.0, 0.0625, 0.9375, 0.875, 1.0);
        A = new k(0.0, 0.0, 0.0625, 0.9375, 0.875, 0.9375);
        E = new k(0.0625, 0.0, 0.0625, 1.0, 0.875, 0.9375);
        F = new k(0.0625, 0.0, 0.0625, 0.9375, 0.875, 0.9375);
    }

    public i b(z z2, n n2, i i2) {
        block59: {
            boolean bl2;
            aA aA2;
            block47: {
                i i3;
                boolean bl3;
                block57: {
                    i i4;
                    block58: {
                        Object object;
                        block55: {
                            i i5;
                            block56: {
                                block53: {
                                    block54: {
                                        block52: {
                                            aA aA3;
                                            block51: {
                                                Object object2;
                                                block50: {
                                                    i i6;
                                                    block48: {
                                                        i i7;
                                                        block49: {
                                                            az az2;
                                                            K k2;
                                                            i i8;
                                                            block30: {
                                                                block31: {
                                                                    block34: {
                                                                        boolean bl4;
                                                                        block46: {
                                                                            block44: {
                                                                                boolean bl5;
                                                                                block45: {
                                                                                    i i9;
                                                                                    block42: {
                                                                                        boolean bl6;
                                                                                        block43: {
                                                                                            block40: {
                                                                                                block41: {
                                                                                                    block39: {
                                                                                                        aA aA4;
                                                                                                        block38: {
                                                                                                            aA aA5;
                                                                                                            block37: {
                                                                                                                i i10;
                                                                                                                block35: {
                                                                                                                    block36: {
                                                                                                                        az az3;
                                                                                                                        K k3;
                                                                                                                        block32: {
                                                                                                                            block33: {
                                                                                                                                bl3 = cL.b();
                                                                                                                                z z3 = z2;
                                                                                                                                if (!bl3) {
                                                                                                                                    if (z3.C) {
                                                                                                                                        return i2;
                                                                                                                                    }
                                                                                                                                    z3 = z2;
                                                                                                                                }
                                                                                                                                i8 = z3.d(n2.i());
                                                                                                                                i7 = z2.d(n2.j());
                                                                                                                                i4 = z2.d(n2.b());
                                                                                                                                i5 = z2.d(n2.m());
                                                                                                                                aA2 = i2.b(C);
                                                                                                                                k2 = i8.b();
                                                                                                                                az2 = this;
                                                                                                                                if (bl3) break block30;
                                                                                                                                if (k2 == az2) break block31;
                                                                                                                                k2 = i7.b();
                                                                                                                                az2 = this;
                                                                                                                                if (bl3) break block30;
                                                                                                                                if (k2 == az2) break block31;
                                                                                                                                bl5 = i8.m();
                                                                                                                                bl6 = i7.m();
                                                                                                                                k3 = i4.b();
                                                                                                                                az3 = this;
                                                                                                                                if (bl3) break block32;
                                                                                                                                if (k3 == az3) break block33;
                                                                                                                                k3 = i5.b();
                                                                                                                                az3 = this;
                                                                                                                                if (bl3) break block32;
                                                                                                                                if (k3 != az3) break block34;
                                                                                                                            }
                                                                                                                            k3 = i4.b();
                                                                                                                            az3 = this;
                                                                                                                        }
                                                                                                                        object = k3 == az3 ? n2.b() : n2.m();
                                                                                                                        object2 = z2.d(((n)object).i());
                                                                                                                        i9 = z2.d(((n)object).j());
                                                                                                                        aA2 = aA.SOUTH;
                                                                                                                        i10 = i4;
                                                                                                                        if (bl3) break block35;
                                                                                                                        if (i10.b() != this) break block36;
                                                                                                                        aA5 = i4.b(C);
                                                                                                                        if (!bl3) break block37;
                                                                                                                    }
                                                                                                                    i10 = i5;
                                                                                                                }
                                                                                                                aA5 = i10.b(C);
                                                                                                            }
                                                                                                            aA4 = aA5;
                                                                                                            if (bl3) break block38;
                                                                                                            if (aA4 != aA.NORTH) break block39;
                                                                                                            aA4 = aA.NORTH;
                                                                                                        }
                                                                                                        aA2 = aA4;
                                                                                                    }
                                                                                                    bl4 = bl5;
                                                                                                    if (bl3) break block40;
                                                                                                    if (bl4) break block41;
                                                                                                    bl4 = object2.m();
                                                                                                    if (bl3) break block42;
                                                                                                    if (!bl4) break block43;
                                                                                                }
                                                                                                bl4 = bl6;
                                                                                            }
                                                                                            if (bl3) break block42;
                                                                                            if (bl4) break block43;
                                                                                            bl4 = i9.m();
                                                                                            if (bl3) break block42;
                                                                                            if (!bl4) {
                                                                                                aA2 = aA.SOUTH;
                                                                                            }
                                                                                        }
                                                                                        bl4 = bl6;
                                                                                    }
                                                                                    if (bl3) break block44;
                                                                                    if (bl4) break block45;
                                                                                    bl4 = i9.m();
                                                                                    if (bl3) break block44;
                                                                                    if (!bl4) break block34;
                                                                                }
                                                                                bl4 = bl5;
                                                                            }
                                                                            if (bl3) break block46;
                                                                            if (bl4) break block34;
                                                                            bl4 = object2.m();
                                                                        }
                                                                        if (!bl4) {
                                                                            aA2 = aA.NORTH;
                                                                        }
                                                                    }
                                                                    if (!bl3) break block47;
                                                                }
                                                                k2 = i8.b();
                                                                az2 = this;
                                                            }
                                                            n n3 = k2 == az2 ? n2.i() : n2.j();
                                                            i3 = z2.d(n3.b());
                                                            object = z2.d(n3.m());
                                                            aA2 = aA.EAST;
                                                            i6 = i8;
                                                            if (bl3) break block48;
                                                            if (i6.b() != this) break block49;
                                                            object2 = i8.b(C);
                                                            if (!bl3) break block50;
                                                        }
                                                        i6 = i7;
                                                    }
                                                    object2 = i6.b(C);
                                                }
                                                aA3 = object2;
                                                if (bl3) break block51;
                                                if (aA3 != aA.WEST) break block52;
                                                aA3 = aA.WEST;
                                            }
                                            aA2 = aA3;
                                        }
                                        bl2 = i4.m();
                                        if (bl3) break block53;
                                        if (bl2) break block54;
                                        bl2 = i3.m();
                                        if (bl3) break block55;
                                        if (!bl2) break block56;
                                    }
                                    bl2 = i5.m();
                                }
                                if (bl3) break block55;
                                if (bl2) break block56;
                                bl2 = object.m();
                                if (bl3) break block55;
                                if (!bl2) {
                                    aA2 = aA.EAST;
                                }
                            }
                            bl2 = i5.m();
                        }
                        if (bl3) break block57;
                        if (bl2) break block58;
                        bl2 = object.m();
                        if (bl3) break block59;
                        if (!bl2) break block47;
                    }
                    bl2 = i4.m();
                }
                if (bl3) break block59;
                if (bl2) break block47;
                bl2 = i3.m();
                if (bl3) break block59;
                if (!bl2) {
                    aA2 = aA.WEST;
                }
            }
            i2 = i2.a(C, aA2);
            bl2 = z2.a(n2, i2, 3);
        }
        return i2;
    }

    public i a(z z2, n n2, i i2) {
        i i3;
        block23: {
            boolean bl2;
            Object object;
            block22: {
                aA aA2;
                boolean bl3;
                block21: {
                    i i4;
                    block20: {
                        aA aA3 = null;
                        object = av.HORIZONTAL.iterator();
                        bl3 = cL.b();
                        while (object.hasNext()) {
                            i i5;
                            aA aA4 = object.next();
                            i4 = i5 = z2.d(n2.a(aA4));
                            if (!bl3) {
                                i i6;
                                if (!bl3) {
                                    if (i4.b() == this) {
                                        return i2;
                                    }
                                    i6 = i5;
                                }
                                if (i6.m()) {
                                    aA aA5 = aA3;
                                    if (!bl3) {
                                        if (aA5 != null) {
                                            aA3 = null;
                                            break;
                                        }
                                        aA5 = aA3 = aA4;
                                    }
                                }
                                if (!bl3) continue;
                            }
                            break block20;
                        }
                        aA2 = aA3;
                        if (bl3) break block21;
                        if (aA2 != null) {
                            return i2.a(C, aA3.h());
                        }
                        i4 = i2;
                    }
                    aA2 = i4.b(C);
                }
                object = aA2;
                bl2 = z2.d(n2.a((aA)object)).m();
                if (!bl3) {
                    if (bl2) {
                        object = ((aA)object).h();
                    }
                    bl2 = z2.d(n2.a((aA)object)).m();
                }
                if (bl3) break block22;
                if (bl2) {
                    object = ((aA)object).l();
                }
                i3 = z2.d(n2.a((aA)object));
                if (bl3) break block23;
                bl2 = i3.m();
            }
            if (bl2) {
                object = ((aA)object).h();
            }
            i3 = i2.a(C, object);
        }
        return i3;
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public boolean r(i i2) {
        return true;
    }
}

