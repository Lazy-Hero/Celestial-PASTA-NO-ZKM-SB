/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.B.W;
import net.minecraft.N.S;
import net.minecraft.N.f;
import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.U.B;
import net.minecraft.W.K;
import net.minecraft.W.ak;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.b;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ae.d;
import net.minecraft.ae.e;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aW;
import net.minecraft.ar.ae;
import net.minecraft.ar.h;
import net.minecraft.at.l;
import net.minecraft.client.B.o;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.l.m;
import net.minecraft.u.g;
import net.minecraft.w.bl;

public class as
extends ak {
    private final /* synthetic */ bl A;
    public static final /* synthetic */ d<aA> z;

    @Override
    public boolean a(z z2, n n2, i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        boolean bl2;
        block13: {
            block14: {
                boolean bl3;
                y y2;
                boolean bl4;
                block16: {
                    block15: {
                        block12: {
                            boolean bl5;
                            block11: {
                                bl4 = cL.b();
                                bl5 = z2.C;
                                if (!bl4) {
                                    if (bl5) {
                                        return true;
                                    }
                                    bl5 = j2.ae();
                                }
                                if (bl4) break block11;
                                if (!bl5) break block12;
                                bl5 = true;
                            }
                            return bl5;
                        }
                        y2 = z2.b(n2);
                        bl2 = y2 instanceof S;
                        if (bl4) break block13;
                        if (!bl2) break block14;
                        aA aA3 = i2.b(z);
                        if (((S)y2).k() != f.CLOSED) break block15;
                        k k2 = k.d(0.5f * (float)aA3.r(), 0.5f * (float)aA3.p(), 0.5f * (float)aA3.i()).b((double)aA3.r(), aA3.p(), aA3.i());
                        boolean bl6 = z2.d(k2.a(n2.a(aA3)));
                        if (!bl4) {
                            bl6 = bl3 = !bl6;
                        }
                        if (!bl4) break block16;
                    }
                    bl3 = true;
                }
                boolean bl7 = bl3;
                if (!bl4) {
                    if (bl7) {
                        j2.b(net.minecraft.l.m.r);
                        j2.a((net.minecraft.B.a)((Object)y2));
                    }
                    bl7 = true;
                }
                return bl7;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public i a(i i2, h h2) {
        return i2.a(h2.b(i2.b(z)));
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean n(i i2) {
        return true;
    }

    @Override
    public i c(int n2) {
        aA aA2 = aA.a(n2);
        return this.d().a(z, aA2);
    }

    @Override
    public void a(z z2, n n2, i i2, j j2) {
        block3: {
            y y2;
            block2: {
                boolean bl2 = cL.e();
                y2 = z2.b(n2);
                if (!bl2) break block2;
                if (!(y2 instanceof S)) break block3;
                y2 = z2.b(n2);
            }
            S s2 = (S)y2;
            s2.a(j2.cw.g);
            s2.a(j2);
        }
    }

    static {
        z = net.minecraft.ae.e.a("facing");
    }

    @Override
    public boolean s(i i2) {
        return true;
    }

    public static net.minecraft.w.d a(bl bl2) {
        return new net.minecraft.w.d(as.b(bl2));
    }

    public as(bl bl2) {
        super(net.minecraft.ac.c.H, net.minecraft.ac.a.O);
        this.A = bl2;
        this.a(net.minecraft.ad.a.j);
        this.h(this.e.a().a(z, aA.UP));
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z);
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public y a(z z2, int n2) {
        return new S(this.A);
    }

    @Override
    public net.minecraft.w.d c(z z2, n n2, i i2) {
        net.minecraft.w.d d10;
        block0: {
            d10 = super.c(z2, n2, i2);
            S s2 = (S)z2.b(n2);
            r r2 = s2.c(new r());
            if (r2.c()) break block0;
            d10.a("BlockEntityTag", r2);
        }
        return d10;
    }

    @Override
    public aW b(i i2) {
        return aW.ENTITYBLOCK_ANIMATED;
    }

    public static bl a(net.minecraft.w.k k2) {
        return as.a(K.a(k2));
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public void a(z z2, n n2, i i2, float f10, int n3) {
    }

    @Override
    public b m(i i2) {
        return net.minecraft.ac.b.DESTROY;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public net.minecraft.Z.d a(t t2, i i2, n n2, aA aA2) {
        net.minecraft.Z.d d10;
        block3: {
            block4: {
                aA aA3;
                aA aA4;
                block5: {
                    f f10;
                    f f11;
                    boolean bl2;
                    aA aA5;
                    block2: {
                        i2 = this.e(i2, t2, n2);
                        aA5 = i2.b(z);
                        f f12 = ((S)t2.b(n2)).k();
                        bl2 = cL.e();
                        f11 = f12;
                        f10 = f.CLOSED;
                        if (!bl2) break block2;
                        if (f11 == f10) break block3;
                        f11 = f12;
                        f10 = f.OPENED;
                    }
                    if (f11 != f10) break block4;
                    aA4 = aA5;
                    aA3 = aA2.h();
                    if (!bl2) break block5;
                    if (aA4 == aA3) break block3;
                    aA4 = aA5;
                    aA3 = aA2;
                }
                if (aA4 == aA3) break block3;
            }
            d10 = net.minecraft.Z.d.UNDEFINED;
            return d10;
        }
        d10 = net.minecraft.Z.d.SOLID;
        return d10;
    }

    @Override
    public void a(net.minecraft.w.d d10, @Nullable z z2, List<String> list, o o2) {
        block10: {
            int n2;
            int n3;
            int n4;
            boolean bl2;
            block8: {
                int n5;
                r r2;
                block12: {
                    String string;
                    r r3;
                    block11: {
                        r r4;
                        block9: {
                            boolean bl3 = cL.b();
                            super.a(d10, z2, list, o2);
                            r4 = d10.v();
                            bl2 = bl3;
                            r3 = r4;
                            if (bl2) break block9;
                            if (r3 == null) break block10;
                            r3 = r4;
                        }
                        string = "BlockEntityTag";
                        if (bl2) break block11;
                        if (!r3.a(string, 10)) break block10;
                        r3 = r4;
                        string = "BlockEntityTag";
                    }
                    r2 = r3.h(string);
                    n5 = r2.a("LootTable", 8);
                    if (!bl2) {
                        if (n5 != 0) {
                            list.add("???????");
                        }
                        n5 = r2.a("Items", 9) ? 1 : 0;
                    }
                    if (bl2) break block12;
                    if (n5 == 0) break block10;
                    n5 = 27;
                }
                a2<net.minecraft.w.d> a22 = a2.a(n5, net.minecraft.w.d.m);
                W.a(r2, a22);
                n4 = 0;
                n3 = 0;
                for (net.minecraft.w.d d11 : a22) {
                    block14: {
                        int n6;
                        block13: {
                            n2 = d11.G() ? 1 : 0;
                            if (bl2) break block8;
                            if (bl2) break block13;
                            if (n2 != 0) break block14;
                            ++n3;
                            n6 = n4;
                        }
                        if (!bl2 && n6 <= 4) {
                            ++n4;
                            n6 = list.add(String.format("%s x%d", d11.g(), d11.t())) ? 1 : 0;
                        }
                    }
                    if (!bl2) continue;
                }
                n2 = n3 - n4;
            }
            if (!bl2 && n2 > 0) {
                n2 = list.add(String.format((Object)((Object)net.minecraft.at.l.ITALIC) + net.minecraft.ab.a.a("container.shulkerBox.more"), n3 - n4)) ? 1 : 0;
            }
        }
    }

    @Override
    public boolean r(i i2) {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public k a(i i2, t t2, n n2) {
        k k2;
        y y2 = t2.b(n2);
        boolean bl2 = cL.b();
        y y3 = y2;
        if (!bl2) {
            if (!(y3 instanceof S)) {
                k2 = k;
                return k2;
            }
            y3 = y2;
        }
        k2 = ((S)y3).a(i2);
        return k2;
    }

    public static K b(bl bl2) {
        switch (bl2) {
            case WHITE: {
                return g.b1;
            }
            case ORANGE: {
                return g.bk;
            }
            case MAGENTA: {
                return g.X;
            }
            case LIGHT_BLUE: {
                return g.L;
            }
            case YELLOW: {
                return g.aE;
            }
            case LIME: {
                return g.bo;
            }
            case PINK: {
                return g.bh;
            }
            case GRAY: {
                return g.J;
            }
            case SILVER: {
                return g.ap;
            }
            case CYAN: {
                return g.bg;
            }
            default: {
                return g.b5;
            }
            case BLUE: {
                return g.N;
            }
            case BROWN: {
                return g.by;
            }
            case GREEN: {
                return g.cx;
            }
            case RED: {
                return g.bw;
            }
            case BLACK: 
        }
        return g.a3;
    }

    @Override
    public void a(z z2, n n2, i i2, B b10, net.minecraft.w.d d10) {
        block2: {
            y y2;
            block3: {
                y y3;
                boolean bl2 = cL.b();
                if (!d10.c()) break block2;
                y2 = y3 = z2.b(n2);
                if (bl2) break block3;
                if (!(y2 instanceof S)) break block2;
                y2 = y3;
            }
            ((S)y2).a(d10.g());
        }
    }

    public bl a() {
        return this.A;
    }

    @Override
    public void a(z z2, n n2, i i2) {
        block2: {
            block3: {
                block5: {
                    net.minecraft.w.d d10;
                    block7: {
                        S s2;
                        block6: {
                            boolean bl2;
                            S s3;
                            boolean bl3;
                            y y2;
                            block4: {
                                y2 = z2.b(n2);
                                bl3 = cL.b();
                                if (bl3) break block2;
                                if (!(y2 instanceof S)) break block3;
                                s3 = (S)y2;
                                bl2 = s3.o();
                                if (bl3) break block4;
                                if (bl2) break block5;
                                bl2 = s3.i();
                            }
                            if (!bl2) break block5;
                            d10 = new net.minecraft.w.d(net.minecraft.w.k.b(this));
                            r r2 = new r();
                            r r3 = new r();
                            r2.a("BlockEntityTag", ((S)y2).c(r3));
                            d10.b(r2);
                            s2 = s3;
                            if (bl3) break block6;
                            if (!s2.g()) break block7;
                            d10.d(s3.g());
                            s2 = s3;
                        }
                        s2.a("");
                    }
                    as.a(z2, n2, d10);
                }
                z2.b(n2, i2.b());
            }
            super.a(z2, n2, i2);
        }
    }

    @Override
    public int b(i i2, z z2, n n2) {
        return net.minecraft.B.n.b((net.minecraft.B.a)((Object)z2.b(n2)));
    }

    @Override
    public int d(i i2) {
        return i2.b(z).f();
    }

    @Override
    public i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        return this.d().a(z, aA2);
    }

    @Override
    public i a(i i2, ae ae2) {
        return i2.a(z, ae2.a(i2.b(z)));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static bl a(K k2) {
        bl bl2;
        boolean bl3 = cL.e();
        K k3 = k2;
        if (bl3) {
            if (!(k3 instanceof as)) {
                bl2 = bl.PURPLE;
                return bl2;
            }
            k3 = k2;
        }
        bl2 = ((as)k3).a();
        return bl2;
    }
}

