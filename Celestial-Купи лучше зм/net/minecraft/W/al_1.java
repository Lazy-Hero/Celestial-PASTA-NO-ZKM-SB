/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.N.y;
import net.minecraft.W.B;
import net.minecraft.W.K;
import net.minecraft.W.Y;
import net.minecraft.W.bF;
import net.minecraft.W.cI;
import net.minecraft.W.cL;
import net.minecraft.W.cs;
import net.minecraft.W.d2;
import net.minecraft.W.d_;
import net.minecraft.W.e;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ae.d;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.ar.aA;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.l.m;
import net.minecraft.u.g;
import net.minecraft.u.h;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class al
extends Y
implements cs {
    public static final /* synthetic */ d<aA> C;
    public static final /* synthetic */ d<B> A;
    public static final /* synthetic */ d<d2> B;

    @Override
    public boolean a(z z2, Random random, n n2, i i2) {
        return true;
    }

    @Override
    public void a(z z2, n n2, i i2, net.minecraft.U.B b10, net.minecraft.w.d d10) {
        z2.a(n2.a(), this.d().a(A, net.minecraft.W.B.UPPER), 2);
    }

    public al() {
        super(net.minecraft.ac.c.z);
        this.h(this.e.a().a(B, d2.SUNFLOWER).a(A, net.minecraft.W.B.LOWER).a(C, aA.NORTH));
        this.c(0.0f);
        this.a(d_.k);
        this.c("doublePlant");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int g(i i2) {
        boolean bl2 = cL.b();
        Enum enum_ = i2.b(A);
        if (!bl2) {
            if (enum_ == net.minecraft.W.B.UPPER) return 0;
            enum_ = i2.b(B);
        }
        if (!bl2) {
            if (enum_ == d2.GRASS) return 0;
            enum_ = i2.b(B);
        }
        int n2 = ((d2)enum_).c();
        return n2;
    }

    private d2 a(t t2, n n2, i i2) {
        block3: {
            i i3;
            block2: {
                boolean bl2 = cL.e();
                i3 = i2;
                if (!bl2) break block2;
                if (i3.b() != this) break block3;
                i3 = i2 = i2.c(t2, n2);
            }
            return i3.b(B);
        }
        return d2.FERN;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, n n2, i i2) {
        i i3;
        boolean bl2 = cL.b();
        i i4 = i2;
        if (!bl2) {
            if (i4.b(A) == net.minecraft.W.B.UPPER) {
                if (z2.d(n2.k()).b() != this) return false;
                return true;
            }
            i4 = z2.d(n2.a());
        }
        if ((i3 = i4).b() != this) return false;
        boolean bl3 = super.a(z2, n2, i3);
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    public void a(z z2, n n2, d2 d22, int n3) {
        z2.a(n2, this.d().a(A, net.minecraft.W.B.LOWER).a(B, d22), n3);
        z2.a(n2.a(), this.d().a(A, net.minecraft.W.B.UPPER), n3);
    }

    @Override
    public void a(z z2, n n2, i i2, j j2) {
        block6: {
            n n3;
            z z3;
            block15: {
                i i3;
                block4: {
                    boolean bl2;
                    block5: {
                        block11: {
                            boolean bl3;
                            block14: {
                                i i4;
                                block12: {
                                    block13: {
                                        block10: {
                                            d2 d22;
                                            d2 d23;
                                            block9: {
                                                d2 d24;
                                                block8: {
                                                    block7: {
                                                        bl2 = cL.e();
                                                        i3 = i2;
                                                        if (!bl2) break block4;
                                                        if (i3.b(A) != net.minecraft.W.B.UPPER) break block5;
                                                        if (z2.d(n2.k()).b() != this) break block6;
                                                        boolean bl4 = j2.cw.g;
                                                        if (!bl2) break block7;
                                                        if (!bl4) break block8;
                                                        bl4 = z2.v(n2.k());
                                                    }
                                                    if (bl2) break block6;
                                                }
                                                i4 = z2.d(n2.k());
                                                d23 = d24 = i4.b(B);
                                                d22 = d2.FERN;
                                                if (!bl2) break block9;
                                                if (d23 == d22) break block10;
                                                d23 = d24;
                                                d22 = d2.GRASS;
                                            }
                                            if (d23 == d22) break block10;
                                            z2.a(n2.k(), true);
                                            if (bl2) break block11;
                                        }
                                        bl3 = z2.C;
                                        if (!bl2) break block12;
                                        if (!bl3) break block13;
                                        z2.v(n2.k());
                                        if (bl2) break block11;
                                    }
                                    bl3 = j2.av().G();
                                }
                                if (!bl2) break block11;
                                if (bl3 || j2.av().w() != net.minecraft.u.h.aT) break block14;
                                this.a(z2, n2, i4, j2);
                                z2.v(n2.k());
                                if (bl2) break block11;
                            }
                            bl3 = z2.a(n2.k(), true);
                        }
                        if (bl2) break block6;
                    }
                    z3 = z2;
                    n3 = n2.a();
                    if (!bl2) break block15;
                    i3 = z3.d(n3);
                }
                if (i3.b() != this) break block6;
                z3 = z2;
                n3 = n2.a();
            }
            z3.a(n3, g.bf.d(), 2);
        }
        super.a(z2, n2, i2, j2);
    }

    @Override
    public void b(z z2, Random random, n n2, i i2) {
        al.a(z2, n2, new net.minecraft.w.d(this, 1, this.a((t)z2, n2, i2).c()));
    }

    @Override
    public void a(z z2, j j2, n n2, i i2, @Nullable y y2, net.minecraft.w.d d10) {
        block4: {
            z z3;
            al al2;
            block3: {
                block2: {
                    boolean bl2 = cL.b();
                    if (z2.C || d10.w() != net.minecraft.u.h.aT || i2.b(A) != net.minecraft.W.B.LOWER) break block2;
                    al2 = this;
                    z3 = z2;
                    if (bl2) break block3;
                    if (al2.a(z3, n2, i2, j2)) break block4;
                }
                al2 = this;
                z3 = z2;
            }
            super.a(z3, j2, n2, i2, y2, d10);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean a(z var1_1, n var2_2, i var3_3, j var4_4) {
        var6_5 = var3_3.b(al.B);
        var5_6 = cL.b();
        v0 = var6_5;
        v1 = d2.FERN;
        if (!var5_6) {
            if (v0 != v1) {
                v0 = var6_5;
                v1 = d2.GRASS;
                if (!var5_6) {
                    if (v0 != v1) {
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                var4_4.b(net.minecraft.l.m.a(this));
                v0 = var6_5;
                v1 = d2.GRASS;
            }
        }
        var7_7 = (v0 == v1 ? net.minecraft.W.e.GRASS : net.minecraft.W.e.FERN).a();
        al.a(var1_1, var2_2, new net.minecraft.w.d(g.dc, 2, var7_7));
        return true;
    }

    @Override
    public net.minecraft.w.d c(z z2, n n2, i i2) {
        return new net.minecraft.w.d(this, 1, this.a((t)z2, n2, i2).c());
    }

    static {
        B = d.a("variant", d2.class);
        A = d.a("half", B.class);
        C = bF.z;
    }

    @Override
    public i e(i i2, t t2, n n2) {
        i i3;
        block4: {
            block5: {
                i i4;
                boolean bl2 = cL.e();
                i3 = i2;
                if (!bl2) break block4;
                if (i3.b(A) != net.minecraft.W.B.UPPER) break block5;
                i3 = i4 = t2.d(n2.k());
                if (!bl2) break block4;
                if (i3.b() == this) {
                    i2 = i2.a(B, i4.b(B));
                }
            }
            i3 = i2;
        }
        return i3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, n n2) {
        boolean bl2 = cL.e();
        boolean bl3 = super.a(z2, n2);
        if (bl2) {
            if (!bl3) return false;
            bl3 = z2.a(n2.a());
        }
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return k;
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, A, B, C);
    }

    @Override
    public cI h() {
        return cI.XZ;
    }

    @Override
    public net.minecraft.w.k a(i i2, Random random, int n2) {
        d2 d22;
        boolean bl2 = cL.e();
        Enum enum_ = i2.b(A);
        if (bl2) {
            if (enum_ == net.minecraft.W.B.UPPER) {
                return net.minecraft.u.h.v;
            }
            enum_ = i2.b(B);
        }
        d2 d23 = d22 = (d2)enum_;
        d2 d24 = d2.FERN;
        if (bl2) {
            if (d23 == d24) {
                return net.minecraft.u.h.v;
            }
            d23 = d22;
            d24 = d2.GRASS;
        }
        if (d23 == d24) {
            return random.nextInt(8) == 0 ? net.minecraft.u.h.a6 : net.minecraft.u.h.v;
        }
        return super.a(i2, random, n2);
    }

    @Override
    protected void c(z z2, n n2, i i2) {
        block4: {
            boolean bl2 = cL.b();
            if (this.a(z2, n2, i2)) break block4;
            boolean bl3 = i2.b(A) == net.minecraft.W.B.UPPER;
            n n3 = bl3 ? n2 : n2.a();
            n n4 = bl3 ? n2.k() : n2;
            al al2 = bl3 ? this : z2.d(n3).b();
            al al3 = bl3 ? z2.d(n4).b() : this;
            al al4 = al2;
            al al5 = this;
            if (!bl2) {
                if (al4 == al5) {
                    z2.a(n3, g.bf.d(), 2);
                }
                al4 = al3;
                al5 = this;
            }
            if (al4 == al5) {
                z2.a(n4, g.bf.d(), 3);
                if (!bl3) {
                    this.a(z2, n4, i2, 0);
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public int d(i i2) {
        int n2;
        boolean bl2 = cL.e();
        Enum enum_ = i2.b(A);
        if (bl2) {
            if (enum_ == net.minecraft.W.B.UPPER) {
                n2 = 8 | i2.b(C).k();
                return n2;
            }
            enum_ = i2.b(B);
        }
        n2 = ((d2)enum_).c();
        return n2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, n n2, i i2, boolean bl2) {
        d2 d22 = this.a((t)z2, n2, i2);
        boolean bl3 = cL.e();
        d2 d23 = d22;
        d2 d24 = d2.GRASS;
        if (bl3) {
            if (d23 == d24) return false;
            d23 = d22;
            d24 = d2.FERN;
        }
        if (d23 == d24) return false;
        return true;
    }

    @Override
    public i c(int n2) {
        return (n2 & 8) > 0 ? this.d().a(A, net.minecraft.W.B.UPPER) : this.d().a(A, net.minecraft.W.B.LOWER).a(B, d2.a(n2 & 7));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(t t2, n n2) {
        d2 d22;
        i i2 = t2.d(n2);
        boolean bl2 = cL.e();
        i i3 = i2;
        if (bl2) {
            if (i3.b() != this) {
                return true;
            }
            i3 = i2.c(t2, n2);
        }
        d2 d23 = d22 = i3.b(B);
        d2 d24 = d2.FERN;
        if (bl2) {
            if (d23 == d24) return true;
            d23 = d22;
            d24 = d2.GRASS;
        }
        if (d23 != d24) return false;
        return true;
    }

    @Override
    public void a(a a10, a2<net.minecraft.w.d> a22) {
        d2[] arrd2 = d2.values();
        int n2 = arrd2.length;
        boolean bl2 = cL.b();
        for (int i2 = 0; i2 < n2; ++i2) {
            d2 d22 = arrd2[i2];
            a22.add(new net.minecraft.w.d(this, 1, d22.c()));
            if (!bl2) continue;
        }
    }
}

