/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.J;

import javax.annotation.Nullable;
import net.minecraft.J.j;
import net.minecraft.P.r;
import net.minecraft.U.x;
import net.minecraft.U.z;
import net.minecraft.ar.G;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.av.b;
import net.minecraft.av.f;
import net.minecraft.aw.s;
import net.minecraft.k.n;
import net.minecraft.q.m;
import net.minecraft.u.E;
import net.minecraft.u.g;
import net.minecraft.u.h;
import net.minecraft.w.an;
import net.minecraft.w.d;
import net.minecraft.x.c;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class l
extends z {
    private /* synthetic */ float aP;
    private static final /* synthetic */ net.minecraft.q.r<d> aO;
    private static final /* synthetic */ net.minecraft.q.r<Integer> aQ;

    @Override
    public boolean b(double d10) {
        double d11 = 16.0;
        d11 = d11 * 64.0 * l.al();
        int n2 = net.minecraft.J.j.d();
        double d12 = d10 - d11 * d11;
        double d13 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
        if (n2 != 0) {
            d13 = d13 < 0 ? 1.0 : 0.0;
        }
        return (boolean)d13;
    }

    @Override
    public void d() {
        this.a(net.minecraft.u.E.p, 1.0f, 1.0f);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(G g10, float f10) {
        int n2 = net.minecraft.J.j.c();
        boolean bl2 = this.a(g10);
        if (n2 == 0) {
            if (bl2) {
                return false;
            }
            bl2 = g10.j();
        }
        if (n2 != 0) return bl2;
        if (!bl2) {
            bl2 = this.b().G();
            if (n2 != 0) return bl2;
            if (!bl2) {
                boolean bl3 = this.aG.C;
                if (n2 != 0) return bl3;
                if (bl3) return true;
                this.a(g10.h(), false);
                this.a(net.minecraft.u.E.B, 1.0f, 1.0f);
                this.a(net.minecraft.w.d.m);
                return true;
            }
        }
        bl2 = super.a(g10, f10);
        return bl2;
    }

    private void a(d d10, boolean bl2) {
        block7: {
            l l2;
            block8: {
                int n2 = net.minecraft.J.j.c();
                boolean bl3 = d10.G();
                if (n2 == 0) {
                    if (!bl3) {
                        d10 = d10.C();
                        d10.c(1);
                        d10.a(this);
                    }
                    this.E().b(aO, d10);
                    this.E().c(aO);
                    bl3 = d10.G();
                }
                if (n2 == 0) {
                    if (!bl3) {
                        this.a(net.minecraft.u.E.a1, 1.0f, 1.0f);
                    }
                    bl3 = bl2;
                }
                if (!bl3) break block7;
                l2 = this;
                if (n2 != 0) break block8;
                if (l2.aN == null) break block7;
                l2 = this;
            }
            l2.aG.b(this.aN, net.minecraft.u.g.bf);
        }
    }

    @Override
    public float aw() {
        return 0.0f;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(@Nullable x x2) {
        this.a(net.minecraft.u.E.dn, 1.0f, 1.0f);
        this.a(x2, true);
    }

    private void b(int n2, boolean bl2) {
        block3: {
            l l2;
            block4: {
                int n3;
                block2: {
                    n3 = net.minecraft.J.j.d();
                    l2 = this;
                    if (n3 == 0) break block2;
                    l2.E().b(aQ, n2 % 8);
                    if (!bl2) break block3;
                    l2 = this;
                }
                if (n3 == 0) break block4;
                if (l2.aN == null) break block3;
                l2 = this;
            }
            l2.aG.b(this.aN, net.minecraft.u.g.bf);
        }
    }

    @Override
    public void a(net.minecraft.q.r<?> r2) {
        block2: {
            d d10;
            block4: {
                d d11;
                int n2;
                block3: {
                    n2 = net.minecraft.J.j.d();
                    if (!r2.equals(aO)) break block2;
                    d10 = d11 = this.b();
                    if (n2 == 0) break block3;
                    if (d10.G()) break block2;
                    d10 = d11;
                }
                if (n2 == 0) break block4;
                if (d10.e() == this) break block2;
                d10 = d11;
            }
            d10.a(this);
        }
    }

    @Override
    public boolean a(net.minecraft.i.j j2, a3 a32) {
        boolean bl2;
        block2: {
            block3: {
                l l2;
                block4: {
                    block5: {
                        d d10 = j2.c(a32);
                        int n2 = net.minecraft.J.j.c();
                        bl2 = this.aG.C;
                        if (n2 != 0) break block2;
                        if (bl2) break block3;
                        l2 = this;
                        if (n2 != 0) break block4;
                        if (!l2.b().G()) break block5;
                        bl2 = d10.G();
                        if (n2 != 0) break block2;
                        if (bl2) break block3;
                        this.a(d10);
                        bl2 = j2.cw.g;
                        if (n2 != 0) break block2;
                        if (bl2) break block3;
                        d10.b(1);
                        if (n2 == 0) break block3;
                    }
                    this.a(net.minecraft.u.E.fd, 1.0f, 1.0f);
                    l2 = this;
                }
                l2.a(this.d() + 1);
            }
            bl2 = true;
        }
        return bl2;
    }

    public l(net.minecraft.ah.z z2, n n2, aA aA2) {
        super(z2, n2);
        this.aP = 1.0f;
        this.a(aA2);
    }

    public void a(d d10) {
        this.a(d10, true);
    }

    public l(net.minecraft.ah.z z2) {
        super(z2);
        this.aP = 1.0f;
    }

    static {
        aO = net.minecraft.q.m.a(l.class, net.minecraft.q.h.o);
        aQ = net.minecraft.q.m.a(l.class, net.minecraft.q.h.n);
    }

    @Override
    public int h() {
        return 12;
    }

    public d b() {
        return this.E().b(aO);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int a() {
        int n2 = net.minecraft.J.j.c();
        int n3 = this.b().G();
        if (n2 == 0) {
            if (n3 != 0) {
                return 0;
            }
            n3 = this.d() % 8;
        }
        int n4 = n3 + 1;
        return n4;
    }

    @Override
    public void a(r r2) {
        block4: {
            block5: {
                boolean bl2;
                block6: {
                    r r3 = r2.h("Item");
                    int n2 = net.minecraft.J.j.d();
                    if (n2 == 0) break block4;
                    if (r3 == null) break block5;
                    bl2 = r3.c();
                    if (n2 == 0) break block6;
                    if (bl2) break block5;
                    this.a(new d(r3), false);
                    this.b(r2.r("ItemRotation"), false);
                    if (n2 == 0) break block4;
                    bl2 = r2.a("ItemDropChance", 99);
                }
                if (bl2) {
                    this.aP = r2.d("ItemDropChance");
                }
            }
            super.a(r2);
        }
    }

    @Override
    protected void ab() {
        this.E().c(aO, net.minecraft.w.d.m);
        this.E().c(aQ, 0);
    }

    private void b(d d10) {
        block6: {
            d d11;
            int n2;
            block5: {
                n2 = net.minecraft.J.j.d();
                d11 = d10;
                if (n2 == 0) break block5;
                if (d11.G()) break block6;
                d11 = d10;
            }
            if (n2 != 0) {
                if (d11.w() == h.a9) {
                    s s2 = ((an)d10.w()).a(d10, this.aG);
                    s2.i.remove("frame-" + this.W());
                }
                d11 = d10;
            }
            d11.a((l)null);
        }
    }

    @Override
    public int c() {
        return 12;
    }

    public int d() {
        return this.E().b(aQ);
    }

    public void a(int n2) {
        this.b(n2, true);
    }

    @Override
    public void f(r r2) {
        int n2 = net.minecraft.J.j.d();
        l l2 = this;
        if (n2 != 0) {
            if (!l2.b().G()) {
                r2.a("Item", this.b().a(new r()));
                r2.a("ItemRotation", (byte)this.d());
                r2.a("ItemDropChance", this.aP);
            }
            l2 = this;
        }
        super.f(r2);
    }

    public static void b(b b10) {
        b10.a(net.minecraft.av.f.ENTITY, (net.minecraft.av.g)new c(l.class, "Item"));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(@Nullable x var1_1, boolean var2_2) {
        block13: {
            block12: {
                var3_3 = net.minecraft.J.j.c();
                v0 = this;
                if (var3_3 == 0) {
                    if (v0.aG.M().c("doEntityDrops") == false) return;
                    v0 = this;
                }
                var4_4 = v0.b();
                v1 = var1_1 instanceof net.minecraft.i.j;
                if (var3_3 == 0) {
                    if (v1 != 0) {
                        var5_5 = (net.minecraft.i.j)var1_1;
                        v1 = var5_5.cw.g ? 1 : 0;
                        if (var3_3 == 0) {
                            if (v1 != 0) {
                                this.b(var4_4);
                                return;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v1 = var2_2;
                    }
                }
                if (var3_3 == 0) {
                    if (v1 != 0) {
                        this.a(new d(h.L), 0.0f);
                    }
                    v1 = var4_4.G();
                }
                if (var3_3 != 0) break block12;
                if (v1 != 0) return;
                v2 = this;
                if (var3_3 != 0) break block13;
                cfr_temp_0 = v2.g.nextFloat() - this.aP;
                v1 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
            }
            if (v1 >= 0) return;
            var4_4 = var4_4.C();
            this.b(var4_4);
            v2 = this;
        }
        v2.a(var4_4, 0.0f);
    }
}

