/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package net.minecraft.z;

import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.minecraft.K.i;
import net.minecraft.K.j;
import net.minecraft.K.k;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.ar.aH;
import net.minecraft.av.b;
import net.minecraft.k.m;
import net.minecraft.u.a;
import net.minecraft.z.d;
import net.minecraft.z.f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class h
extends f {
    private static final /* synthetic */ net.minecraft.q.r<Integer> a1;
    private /* synthetic */ i a3;
    private /* synthetic */ boolean a2;
    private final /* synthetic */ Set<j> a0;

    @Override
    public void ae() {
        block7: {
            h h2;
            block11: {
                int n2;
                block10: {
                    m[] arrm;
                    block9: {
                        block8: {
                            block2: {
                                block3: {
                                    h h3;
                                    block4: {
                                        block5: {
                                            h h4;
                                            block6: {
                                                m[] arrm2 = net.minecraft.z.d.b();
                                                super.ae();
                                                arrm = arrm2;
                                                n2 = this.aG.C;
                                                if (arrm != null) break block2;
                                                if (n2 == 0) break block3;
                                                h3 = this;
                                                if (arrm != null) break block4;
                                                if (!h3.aV) break block5;
                                                h4 = this;
                                                if (arrm != null) break block6;
                                                if (h4.aP % 5 != 0) break block7;
                                                h4 = this;
                                            }
                                            h4.b(1);
                                            if (arrm == null) break block7;
                                        }
                                        h3 = this;
                                    }
                                    h3.b(2);
                                    if (arrm == null) break block7;
                                }
                                n2 = this.aV;
                            }
                            if (arrm != null) break block8;
                            if (n2 == 0) break block7;
                            n2 = this.aP;
                        }
                        if (arrm != null) break block9;
                        if (n2 == 0) break block7;
                        n2 = this.a0.isEmpty() ? 1 : 0;
                    }
                    if (arrm != null) break block10;
                    if (n2 != 0) break block7;
                    h2 = this;
                    if (arrm != null) break block11;
                    n2 = h2.aP;
                }
                if (n2 < 600) break block7;
                this.aG.a((x)this, (byte)0);
                this.a3 = net.minecraft.u.a.l;
                this.a0.clear();
                h2 = this;
            }
            h2.ap.b(a1, -1);
        }
    }

    @Override
    protected void b(B b10) {
        block7: {
            Set<j> set;
            m[] arrm;
            block8: {
                super.b(b10);
                Iterator<j> iterator = this.a3.a().iterator();
                arrm = net.minecraft.z.d.b();
                while (iterator.hasNext()) {
                    j j2 = iterator.next();
                    b10.b(new j(j2.g(), Math.max(j2.e() / 8, 1), j2.h(), j2.c(), j2.f()));
                    if (arrm == null) {
                        if (arrm == null) continue;
                    }
                    break block7;
                }
                set = this.a0;
                if (arrm != null) break block8;
                if (set.isEmpty()) break block7;
                set = this.a0;
            }
            for (j j2 : set) {
                b10.b(j2);
                if (arrm == null) continue;
            }
        }
    }

    public h(z z2, double d10, double d11, double d12) {
        super(z2, d10, d11, d12);
        this.a3 = net.minecraft.u.a.l;
        this.a0 = Sets.newHashSet();
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(a1, -1);
    }

    @Override
    public void a(r r2) {
        block9: {
            block8: {
                m[] arrm = net.minecraft.z.d.b();
                super.a(r2);
                m[] arrm2 = arrm;
                r r3 = r2;
                if (arrm2 == null) {
                    if (r3.a("Potion", 8)) {
                        this.a3 = net.minecraft.K.k.a(r2);
                    }
                    r3 = r2;
                }
                for (j j2 : net.minecraft.K.k.c(r3)) {
                    this.a(j2);
                    if (arrm2 == null) {
                        if (arrm2 == null) continue;
                    }
                    break block8;
                }
                if (!r2.a("Color", 99)) break block8;
                this.e(r2.m("Color"));
                if (arrm2 == null) break block9;
            }
            this.b();
        }
    }

    public int c() {
        return this.ap.b(a1);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public h(z z2) {
        super(z2);
        this.a3 = net.minecraft.u.a.l;
        this.a0 = Sets.newHashSet();
    }

    @Override
    protected net.minecraft.w.d c() {
        m[] arrm;
        block9: {
            h h2;
            block8: {
                arrm = net.minecraft.z.d.b();
                h2 = this;
                if (arrm != null) break block8;
                if (!h2.a0.isEmpty()) break block9;
                h2 = this;
            }
            if (h2.a3 == net.minecraft.u.a.l) {
                return new net.minecraft.w.d(net.minecraft.u.h.x);
            }
        }
        net.minecraft.w.d d10 = new net.minecraft.w.d(net.minecraft.u.h.aI);
        net.minecraft.K.k.a(d10, this.a3);
        net.minecraft.w.d d11 = net.minecraft.K.k.a(d10, this.a0);
        if (arrm == null) {
            if (this.a2) {
                r r2;
                r r3 = r2 = d10.v();
                if (arrm == null) {
                    if (r3 == null) {
                        r2 = new r();
                        d10.b(r2);
                    }
                    r3 = r2;
                }
                r3.b("CustomPotionColor", this.c());
            }
            d11 = d10;
        }
        return d11;
    }

    public static void c(b b10) {
        net.minecraft.z.f.a(b10, "TippedArrow");
    }

    public void a(j j2) {
        this.a0.add(j2);
        this.E().b(a1, net.minecraft.K.k.a(net.minecraft.K.k.a(this.a3, this.a0)));
    }

    private void e(int n2) {
        this.a2 = true;
        this.ap.b(a1, n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a(net.minecraft.w.d d10) {
        r r2 = d10.v();
        m[] arrm = net.minecraft.z.d.b();
        r r3 = r2;
        if (arrm == null) {
            if (r3 == null) return -1;
            r3 = r2;
        }
        int n2 = r3.a("CustomPotionColor", 99) ? 1 : 0;
        if (arrm != null) return n2;
        if (n2 == 0) return -1;
        n2 = r2.m("CustomPotionColor");
        return n2;
    }

    public h(z z2, B b10) {
        super(z2, b10);
        this.a3 = net.minecraft.u.a.l;
        this.a0 = Sets.newHashSet();
    }

    @Override
    public void f(r r2) {
        block10: {
            h h2;
            m[] arrm;
            block11: {
                block12: {
                    m[] arrm2 = net.minecraft.z.d.b();
                    super.f(r2);
                    arrm = arrm2;
                    h2 = this;
                    if (arrm != null) break block11;
                    if (h2.a3 == net.minecraft.u.a.l) break block12;
                    h2 = this;
                    if (arrm != null) break block11;
                    if (h2.a3 != null) {
                        r2.a("Potion", net.minecraft.K.i.d.b(this.a3).toString());
                    }
                }
                h2 = this;
            }
            boolean bl2 = h2.a2;
            if (arrm == null) {
                if (bl2) {
                    r2.b("Color", this.c());
                }
                bl2 = this.a0.isEmpty();
            }
            if (!bl2) {
                u u2 = new u();
                for (j j2 : this.a0) {
                    u2.a(j2.b(new r()));
                    if (arrm == null) {
                        if (arrm == null) continue;
                    }
                    break block10;
                }
                r2.a("CustomPotionEffects", u2);
            }
        }
    }

    private void b() {
        this.a2 = false;
        this.ap.b(a1, net.minecraft.K.k.a(net.minecraft.K.k.a(this.a3, this.a0)));
    }

    @Override
    public void a(byte n2) {
        block3: {
            block5: {
                m[] arrm;
                block7: {
                    int n3;
                    int n4;
                    int n5;
                    block6: {
                        int n6;
                        block4: {
                            arrm = net.minecraft.z.d.b();
                            n6 = n2;
                            if (arrm != null) break block4;
                            if (n6 != 0) break block5;
                            n6 = this.c();
                        }
                        n4 = n5 = n6;
                        n3 = -1;
                        if (arrm != null) break block6;
                        if (n4 == n3) break block7;
                        n4 = n5 >> 16;
                        n3 = 255;
                    }
                    double d10 = (double)(n4 & n3) / 255.0;
                    double d11 = (double)(n5 >> 8 & 0xFF) / 255.0;
                    double d12 = (double)(n5 >> 0 & 0xFF) / 255.0;
                    for (int i2 = 0; i2 < 20; ++i2) {
                        this.aG.a(net.minecraft.ar.aH.SPELL_MOB, this.a + (this.g.nextDouble() - 0.5) * (double)this.ad, this.aF + this.g.nextDouble() * (double)this.aD, this.ax + (this.g.nextDouble() - 0.5) * (double)this.ad, d10, d11, d12, new int[0]);
                        if (arrm == null) {
                            if (arrm == null) continue;
                        }
                        break block3;
                    }
                }
                if (arrm == null) break block3;
            }
            super.a((byte)n2);
        }
    }

    static {
        a1 = net.minecraft.q.m.a(h.class, net.minecraft.q.h.n);
    }

    public void b(net.minecraft.w.d d10) {
        block10: {
            net.minecraft.w.k k2;
            net.minecraft.w.k k3;
            block11: {
                block12: {
                    m[] arrm;
                    block15: {
                        int n2;
                        block14: {
                            block13: {
                                arrm = net.minecraft.z.d.b();
                                k3 = d10.w();
                                k2 = net.minecraft.u.h.aI;
                                if (arrm != null) break block11;
                                if (k3 != k2) break block12;
                                this.a3 = net.minecraft.K.k.d(d10);
                                List<j> list = net.minecraft.K.k.c(d10);
                                int n3 = list.isEmpty();
                                if (arrm == null) {
                                    if (n3 == 0) {
                                        for (j j2 : list) {
                                            this.a0.add(new j(j2));
                                            if (arrm == null) {
                                                if (arrm == null) continue;
                                            }
                                            break block10;
                                        }
                                    }
                                    n3 = n2 = h.a(d10);
                                }
                                if (arrm != null) break block13;
                                if (n2 != -1) break block14;
                                this.b();
                            }
                            if (arrm == null) break block15;
                        }
                        this.e(n2);
                    }
                    if (arrm == null) break block10;
                }
                k3 = d10.w();
                k2 = net.minecraft.u.h.x;
            }
            if (k3 == k2) {
                this.a3 = net.minecraft.u.a.l;
                this.a0.clear();
                this.ap.b(a1, -1);
            }
        }
    }

    private void b(int n2) {
        block4: {
            int n3;
            m[] arrm;
            int n4;
            block5: {
                block3: {
                    n4 = this.c();
                    arrm = net.minecraft.z.d.b();
                    n3 = n4;
                    if (arrm != null) break block3;
                    if (n3 == -1) break block4;
                    n3 = n2;
                }
                if (arrm != null) break block5;
                if (n3 <= 0) break block4;
                n3 = n4 >> 16 & 0xFF;
            }
            double d10 = (double)n3 / 255.0;
            double d11 = (double)(n4 >> 8 & 0xFF) / 255.0;
            double d12 = (double)(n4 >> 0 & 0xFF) / 255.0;
            for (int i2 = 0; i2 < n2; ++i2) {
                this.aG.a(net.minecraft.ar.aH.SPELL_MOB, this.a + (this.g.nextDouble() - 0.5) * (double)this.ad, this.aF + this.g.nextDouble() * (double)this.aD, this.ax + (this.g.nextDouble() - 0.5) * (double)this.ad, d10, d11, d12, new int[0]);
                if (arrm == null) continue;
            }
        }
    }
}

