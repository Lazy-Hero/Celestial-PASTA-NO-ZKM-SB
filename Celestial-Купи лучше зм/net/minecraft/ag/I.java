/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ag;

import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.B.a;
import net.minecraft.P.r;
import net.minecraft.U.B;
import net.minecraft.U.E;
import net.minecraft.U.M;
import net.minecraft.W.d_;
import net.minecraft.ag.A;
import net.minecraft.ag.C;
import net.minecraft.ag.D;
import net.minecraft.ag.F;
import net.minecraft.ag.H;
import net.minecraft.ag.aw;
import net.minecraft.ag.j;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.a3;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.av.f;
import net.minecraft.av.g;
import net.minecraft.q.m;
import net.minecraft.u.h;
import net.minecraft.w.d;
import net.minecraft.x.c;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class I
extends D {
    private final /* synthetic */ String[] da;
    private /* synthetic */ String c7;
    private static final /* synthetic */ String[] c8;
    private static final /* synthetic */ String[] c9;
    private static final /* synthetic */ net.minecraft.q.r<Integer> c4;
    private static final /* synthetic */ String[] c6;
    private static final /* synthetic */ String[] c3;
    private static final /* synthetic */ UUID c_;
    private static final /* synthetic */ net.minecraft.q.r<Integer> c5;

    public static void b(b b10) {
        net.minecraft.ag.D.b(b10, I.class);
        b10.a(net.minecraft.av.f.ENTITY, (g)new c(I.class, "ArmorItem"));
    }

    private void l() {
        this.c7 = null;
    }

    public int o() {
        return this.ap.b(c4);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private void m() {
        int n2 = this.o();
        int n3 = (n2 & 0xFF) % 7;
        int n4 = ((n2 & 0xFF00) >> 8) % 5;
        aw aw2 = this.p();
        this.da[0] = c8[n3];
        this.da[1] = c9[n4];
        this.da[2] = aw2.a();
        this.c7 = "horse/" + c6[n3] + c3[n4] + aw2.d();
    }

    @Override
    protected void ah() {
        super.ah();
        this.a(this.cO.a(1));
    }

    @Override
    public boolean E() {
        return true;
    }

    @Override
    protected net.minecraft.ar.d ap() {
        super.ap();
        return net.minecraft.u.E.cV;
    }

    public void n(int n2) {
        this.ap.b(c4, n2);
        this.l();
    }

    @Override
    public void a(r r2) {
        block4: {
            block5: {
                String[] arrstring = net.minecraft.ag.A.b();
                super.a(r2);
                String[] arrstring2 = arrstring;
                this.n(r2.m("Variant"));
                if (arrstring2 == null) break block4;
                if (!r2.a("ArmorItem", 10)) break block5;
                d d10 = new d(r2.h("ArmorItem"));
                if (arrstring2 == null) break block4;
                if (!d10.G() && net.minecraft.ag.aw.a(d10.w())) {
                    this.cO.a(1, d10);
                }
            }
            this.ah();
        }
    }

    public String[] q() {
        String[] arrstring = net.minecraft.ag.A.b();
        I i2 = this;
        if (arrstring != null) {
            if (i2.c7 == null) {
                this.m();
            }
            i2 = this;
        }
        return i2.da;
    }

    public String r() {
        String[] arrstring = net.minecraft.ag.A.b();
        String string = this.c7;
        if (arrstring != null) {
            if (string == null) {
                this.m();
            }
            string = this.c7;
        }
        return string;
    }

    @Override
    protected v D() {
        return net.minecraft.aj.j.i;
    }

    public aw p() {
        return net.minecraft.ag.aw.a(this.ap.b(c5));
    }

    @Override
    protected net.minecraft.ar.d q() {
        super.q();
        return net.minecraft.u.E.fZ;
    }

    public void a(d d10) {
        block2: {
            int n2;
            int n3;
            block1: {
                String[] arrstring = net.minecraft.ag.A.b();
                aw aw2 = net.minecraft.ag.aw.a(d10);
                this.ap.b(c5, aw2.b());
                String[] arrstring2 = arrstring;
                this.l();
                n3 = this.aG.C;
                if (arrstring2 == null) break block1;
                if (n3 != 0) break block2;
                this.a(net.minecraft.U.M.i).b(c_);
                n3 = aw2.c();
            }
            if ((n2 = n3) != 0) {
                this.a(net.minecraft.U.M.i).b(new net.minecraft.j.f(c_, "Horse armor bonus", n2, 0).a(false));
            }
        }
    }

    @Override
    public void ae() {
        block3: {
            m m2;
            block4: {
                boolean bl2;
                block2: {
                    String[] arrstring = net.minecraft.ag.A.b();
                    super.ae();
                    String[] arrstring2 = arrstring;
                    bl2 = this.aG.C;
                    if (arrstring2 == null) break block2;
                    if (!bl2) break block3;
                    m2 = this.ap;
                    if (arrstring2 == null) break block4;
                    bl2 = m2.e();
                }
                if (!bl2) break block3;
                m2 = this.ap;
            }
            m2.g();
            this.l();
        }
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(c4, 0);
        this.ap.c(c5, net.minecraft.ag.aw.NONE.b());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(net.minecraft.i.j var1_1, a3 var2_2) {
        block25: {
            block26: {
                block28: {
                    block27: {
                        var4_3 = var1_1.c(var2_2);
                        var3_4 = net.minecraft.ag.A.b();
                        v0 = var4_3.G();
                        if (var3_4 != null) {
                            v0 = v0 == false;
                        }
                        v1 = var5_5 = v0;
                        if (var3_4 != null) {
                            if (v1 && var4_3.w() == h.bn) {
                                return super.b(var1_1, var2_2);
                            }
                            v1 = this.Q();
                        }
                        if (var3_4 != null) {
                            if (!v1) {
                                v1 = this.aD();
                                if (var3_4 != null) {
                                    if (v1) {
                                        v1 = var1_1.a4();
                                        if (var3_4 != null) {
                                            if (v1) {
                                                this.f(var1_1);
                                                return true;
                                            } else {
                                                ** GOTO lbl-1000
                                            }
                                        }
                                    } else lbl-1000:
                                    // 3 sources

                                    {
                                        v1 = this.aU();
                                    }
                                }
                                if (var3_4 != null) {
                                    if (v1) {
                                        return super.b(var1_1, var2_2);
                                    } else {
                                        ** GOTO lbl-1000
                                    }
                                }
                            } else lbl-1000:
                            // 3 sources

                            {
                                v1 = var5_5;
                            }
                        }
                        if (var3_4 == null) break block25;
                        if (!v1) break block26;
                        v2 = this.a(var1_1, var4_3);
                        if (var3_4 != null) {
                            if (v2) {
                                v3 = var1_1.cw.g;
                                if (var3_4 == null) return v3;
                                if (v3 != false) return true;
                                var4_3.b(1);
                                return true;
                            }
                            v2 = var4_3.a(var1_1, (B)this, var2_2);
                        }
                        if (var3_4 != null) {
                            if (v2) {
                                return true;
                            }
                            v2 = this.aD();
                        }
                        if (var3_4 == null) return v2;
                        if (!v2) {
                            this.P();
                            return true;
                        }
                        var6_6 = net.minecraft.ag.aw.a(var4_3) != net.minecraft.ag.aw.NONE;
                        v4 = this.Q();
                        if (var3_4 == null) break block27;
                        if (v4) ** GOTO lbl-1000
                        v4 = this.ac();
                    }
                    if (!v4 && var4_3.w() == h.be) {
                        v5 = true;
                    } else lbl-1000:
                    // 2 sources

                    {
                        v5 = false;
                    }
                    var7_7 = v5;
                    v6 = var6_6;
                    if (var3_4 == null) return v6;
                    if (v6) break block28;
                    v1 = var7_7;
                    if (var3_4 == null) break block25;
                    if (!v1) break block26;
                }
                this.f(var1_1);
                return true;
            }
            v1 = this.Q();
        }
        if (var3_4 == null) return v1;
        if (v1) {
            return super.b(var1_1, var2_2);
        }
        this.d(var1_1);
        return true;
    }

    @Override
    protected net.minecraft.ar.d aI() {
        super.aI();
        return net.minecraft.u.E.aU;
    }

    @Override
    protected net.minecraft.ar.d e(G g10) {
        super.e(g10);
        return net.minecraft.u.E.f;
    }

    public I(z z2) {
        super(z2);
        this.da = new String[3];
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(C var1_1) {
        var2_2 = net.minecraft.ag.A.b();
        v0 = var1_1;
        if (var2_2 != null) {
            if (v0 == this) {
                return false;
            }
            v0 = var1_1;
        }
        v1 = v0 instanceof F;
        if (var2_2 != null) {
            if (!v1) {
                v1 = var1_1 instanceof I;
                if (var2_2 != null) {
                    if (!v1) {
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v1 = this.Y();
            }
        }
        if (var2_2 != null) {
            if (v1 == false) return false;
            v1 = ((D)var1_1).Y();
        }
        if (var2_2 == null) return v1;
        if (v1 == false) return false;
        return true;
    }

    @Override
    public void a(a a10) {
        block1: {
            aw aw2;
            aw aw3;
            block2: {
                aw aw4 = this.p();
                String[] arrstring = net.minecraft.ag.A.b();
                super.a(a10);
                aw aw5 = this.p();
                if (this.H <= 20) break block1;
                aw3 = aw4;
                aw2 = aw5;
                if (arrstring == null) break block2;
                if (aw3 == aw2) break block1;
                aw3 = aw5;
                aw2 = net.minecraft.ag.aw.NONE;
            }
            if (aw3 != aw2) {
                this.a(net.minecraft.u.E.cM, 0.5f, 1.0f);
            }
        }
    }

    @Override
    public void f(r r2) {
        block3: {
            I i2;
            String string;
            r r3;
            block2: {
                String[] arrstring = net.minecraft.ag.A.b();
                super.f(r2);
                String[] arrstring2 = arrstring;
                r3 = r2;
                string = "Variant";
                i2 = this;
                if (arrstring2 == null) break block2;
                r3.b(string, i2.o());
                if (this.cO.a(1).G()) break block3;
                r3 = r2;
                string = "ArmorItem";
                i2 = this;
            }
            r3.a(string, i2.cO.a(1).a(new r()));
        }
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.f).a(this.at());
        this.a(net.minecraft.U.M.d).a(this.as());
        this.a(cT).a(this.a());
    }

    @Override
    @Nullable
    public net.minecraft.U.j a(net.minecraft.ah.h h2, @Nullable net.minecraft.U.j j2) {
        int n2;
        block4: {
            int n3;
            block2: {
                block3: {
                    j2 = super.a(h2, j2);
                    String[] arrstring = net.minecraft.ag.A.b();
                    n3 = j2 instanceof j;
                    if (arrstring == null) break block2;
                    if (n3 == 0) break block3;
                    n2 = ((j)j2).a;
                    if (arrstring != null) break block4;
                }
                n3 = this.g.nextInt(7);
            }
            n2 = n3;
            j2 = new j(n2);
        }
        this.n(n2 | this.g.nextInt(5) << 8);
        return j2;
    }

    @Override
    protected void a(d_ d_2) {
        block3: {
            I i2;
            block2: {
                String[] arrstring = net.minecraft.ag.A.b();
                super.a(d_2);
                String[] arrstring2 = arrstring;
                i2 = this;
                if (arrstring2 == null) break block2;
                if (i2.g.nextInt(10) != 0) break block3;
                i2 = this;
            }
            i2.a(net.minecraft.u.E.hK, d_2.c() * 0.6f, d_2.e());
        }
    }

    @Override
    public E a(E e10) {
        D d10;
        block6: {
            int n2;
            block14: {
                int n3;
                int n4;
                block15: {
                    block16: {
                        I i2;
                        String[] arrstring;
                        block12: {
                            int n5;
                            block13: {
                                block9: {
                                    int n6;
                                    block10: {
                                        block11: {
                                            int n7;
                                            block7: {
                                                int n8;
                                                block8: {
                                                    E e11;
                                                    block4: {
                                                        block5: {
                                                            arrstring = net.minecraft.ag.A.b();
                                                            e11 = e10;
                                                            if (arrstring == null) break block4;
                                                            if (!(e11 instanceof F)) break block5;
                                                            d10 = new H(this.aG);
                                                            if (arrstring != null) break block6;
                                                        }
                                                        e11 = e10;
                                                    }
                                                    i2 = (I)e11;
                                                    d10 = new I(this.aG);
                                                    n6 = n8 = this.g.nextInt(9);
                                                    n7 = 4;
                                                    if (arrstring == null) break block7;
                                                    if (n6 >= n7) break block8;
                                                    n2 = this.o() & 0xFF;
                                                    if (arrstring != null) break block9;
                                                }
                                                n6 = n8;
                                                if (arrstring == null) break block10;
                                                n7 = 8;
                                            }
                                            if (n6 >= n7) break block11;
                                            n2 = i2.o() & 0xFF;
                                            if (arrstring != null) break block9;
                                        }
                                        n6 = this.g.nextInt(7);
                                    }
                                    n2 = n6;
                                }
                                n4 = n5 = this.g.nextInt(5);
                                n3 = 2;
                                if (arrstring == null) break block12;
                                if (n4 >= n3) break block13;
                                n2 |= this.o() & 0xFF00;
                                if (arrstring != null) break block14;
                            }
                            n4 = n5;
                            n3 = 4;
                        }
                        if (arrstring == null) break block15;
                        if (n4 >= n3) break block16;
                        n2 |= i2.o() & 0xFF00;
                        if (arrstring != null) break block14;
                    }
                    n4 = n2;
                    n3 = this.g.nextInt(5) << 8 & 0xFF00;
                }
                n2 = n4 | n3;
            }
            ((I)d10).n(n2);
        }
        this.a(e10, d10);
        return d10;
    }

    static {
        c_ = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
        c4 = net.minecraft.q.m.a(I.class, net.minecraft.q.h.n);
        c5 = net.minecraft.q.m.a(I.class, net.minecraft.q.h.n);
        c8 = new String[]{"textures/entity/horse/horse_white.png", "textures/entity/horse/horse_creamy.png", "textures/entity/horse/horse_chestnut.png", "textures/entity/horse/horse_brown.png", "textures/entity/horse/horse_black.png", "textures/entity/horse/horse_gray.png", "textures/entity/horse/horse_darkbrown.png"};
        c6 = new String[]{"hwh", "hcr", "hch", "hbr", "hbl", "hgr", "hdb"};
        c9 = new String[]{null, "textures/entity/horse/horse_markings_white.png", "textures/entity/horse/horse_markings_whitefield.png", "textures/entity/horse/horse_markings_whitedots.png", "textures/entity/horse/horse_markings_blackdots.png"};
        c3 = new String[]{"", "wo_", "wmo", "wdo", "bdo"};
    }

    @Override
    public boolean c(d d10) {
        return net.minecraft.ag.aw.a(d10.w());
    }
}

