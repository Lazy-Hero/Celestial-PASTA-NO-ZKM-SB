/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
package net.minecraft.client.I;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.B.D;
import net.minecraft.ad.a;
import net.minecraft.at.l;
import net.minecraft.ax.T;
import net.minecraft.ax.u;
import net.minecraft.client.B.m;
import net.minecraft.client.B.n;
import net.minecraft.client.I.b;
import net.minecraft.client.I.q;
import net.minecraft.client.I.v;
import net.minecraft.client.I.w;
import net.minecraft.client.Q;
import net.minecraft.client.a.K;
import net.minecraft.client.a.a0;
import net.minecraft.client.b.aq;
import net.minecraft.client.b.s;
import net.minecraft.client.l.c;
import net.minecraft.client.l.g;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.w.d;
import net.minecraft.w.k;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class p
extends K {
    private static /* synthetic */ int ag;
    private /* synthetic */ aq ak;
    private /* synthetic */ boolean aj;
    private static final /* synthetic */ net.minecraft.B.b ai;
    private /* synthetic */ D ah;
    private static final /* synthetic */ net.minecraft.ar.v ac;
    private /* synthetic */ float ab;
    private /* synthetic */ b al;
    private /* synthetic */ boolean ae;
    private /* synthetic */ boolean ad;
    private /* synthetic */ List<D> af;

    @Override
    protected void b(int n2, int n3, int n4) {
        int[] arrn = net.minecraft.client.I.v.a();
        if (arrn == null) {
            p p2;
            block6: {
                if (n4 == 0) {
                    int n5 = n2 - this.H;
                    int n6 = n3 - this.B;
                    a[] arra = net.minecraft.ad.a.h;
                    int n7 = arra.length;
                    int n8 = 0;
                    while (n8 < n7) {
                        a a10 = arra[n8];
                        if (arrn == null) {
                            p2 = this;
                            if (arrn != null) break block6;
                            if (p2.a(a10, n5, n6)) {
                                this.a(a10);
                                return;
                            }
                            ++n8;
                        }
                        if (arrn == null) continue;
                    }
                }
                p2 = this;
            }
            super.b(n2, n3, n4);
        }
    }

    public p(j j2) {
        super(new v(j2));
        j2.cm = this.X;
        this.l = true;
        this.F = 136;
        this.M = 195;
    }

    @Override
    public void e() {
        block3: {
            Q q2;
            block2: {
                int[] arrn = net.minecraft.client.I.v.a();
                q2 = this.m;
                if (arrn != null) break block2;
                if (q2.aW.f()) break block3;
                q2 = this.m;
            }
            q2.a(new q(this.m.s));
        }
    }

    @Override
    public void a(int n2, int n3, float f10) {
        int n4;
        int n5;
        p p2;
        block27: {
            block24: {
                block25: {
                    int n6;
                    block26: {
                        int[] arrn;
                        block19: {
                            p p3;
                            block23: {
                                int n7;
                                int n8;
                                int n9;
                                block22: {
                                    int n10;
                                    block20: {
                                        block21: {
                                            int[] arrn2 = net.minecraft.client.I.v.a();
                                            this.n();
                                            arrn = arrn2;
                                            n10 = Mouse.isButtonDown((int)0);
                                            int n11 = this.H;
                                            int n12 = this.B;
                                            int n13 = n11 + 175;
                                            n9 = n12 + 18;
                                            int n14 = n13 + 14;
                                            n8 = n9 + 112;
                                            n7 = this.aj;
                                            if (arrn != null) break block20;
                                            if (n7 != 0) break block21;
                                            n7 = n10;
                                            if (arrn != null) break block20;
                                            if (n7 == 0) break block21;
                                            n7 = n2;
                                            if (arrn != null) break block20;
                                            if (n7 < n13) break block21;
                                            n7 = n3;
                                            if (arrn != null) break block20;
                                            if (n7 < n9) break block21;
                                            n7 = n2;
                                            if (arrn != null) break block20;
                                            if (n7 >= n14) break block21;
                                            n7 = n3;
                                            if (arrn != null) break block20;
                                            if (n7 < n8) {
                                                this.ad = this.c();
                                            }
                                        }
                                        n7 = n10;
                                    }
                                    if (arrn != null) break block22;
                                    if (n7 == 0) {
                                        this.ad = false;
                                    }
                                    this.aj = n10;
                                    p3 = this;
                                    if (arrn != null) break block23;
                                    n7 = p3.ad ? 1 : 0;
                                }
                                if (n7 != 0) {
                                    this.ab = ((float)(n3 - n9) - 7.5f) / ((float)(n8 - n9) - 15.0f);
                                    this.ab = net.minecraft.k.h.c(this.ab, 0.0f, 1.0f);
                                    ((v)this.X).a(this.ab);
                                }
                                p3 = this;
                            }
                            super.a(n2, n3, f10);
                            a[] arra = net.minecraft.ad.a.h;
                            int n15 = arra.length;
                            int n16 = 0;
                            while (n16 < n15) {
                                a a10 = arra[n16];
                                if (arrn == null) {
                                    n6 = this.b(a10, n2, n3) ? 1 : 0;
                                    if (arrn != null) break block19;
                                    if (n6 != 0 && arrn == null) break;
                                    ++n16;
                                }
                                if (arrn == null) continue;
                            }
                            p2 = this;
                            if (arrn != null) break block24;
                            if (p2.ah == null) break block25;
                            n6 = ag;
                        }
                        if (arrn != null) break block26;
                        if (n6 != net.minecraft.ad.a.g.h()) break block25;
                        p2 = this;
                        n5 = this.ah.a;
                        n4 = this.ah.b;
                        if (arrn != null) break block27;
                        n6 = p2.a(n5, n4, 16, 16, n2, n3) ? 1 : 0;
                    }
                    if (n6 != 0) {
                        this.a(net.minecraft.client.D.h.a("inventory.binSlot", new Object[0]), n2, n3);
                    }
                }
                net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                net.minecraft.client.a.v.y();
                p2 = this;
            }
            n5 = n2;
            n4 = n3;
        }
        p2.c(n5, n4);
    }

    public int b() {
        return ag;
    }

    static {
        ac = new net.minecraft.ar.v("textures/gui/container/creative_inventory/tabs.png");
        ai = new net.minecraft.B.b("tmp", true, 45);
        ag = net.minecraft.ad.a.r.h();
    }

    protected void b(a a10) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int[] arrn;
        block17: {
            int n7;
            block15: {
                block16: {
                    block14: {
                        block13: {
                            int n8;
                            block11: {
                                block12: {
                                    arrn = net.minecraft.client.I.v.a();
                                    int n9 = a10.h();
                                    if (arrn == null) {
                                        n9 = n9 == ag ? 1 : 0;
                                    }
                                    int n10 = n9;
                                    n6 = a10.n();
                                    n8 = a10.g();
                                    n5 = n8 * 28;
                                    n4 = 0;
                                    n3 = this.H + 28 * n8;
                                    n2 = this.B;
                                    int n11 = 32;
                                    n7 = n10;
                                    if (arrn == null) {
                                        if (n7 != 0) {
                                            n4 += 32;
                                        }
                                        n7 = a10.a() ? 1 : 0;
                                    }
                                    if (arrn != null) break block11;
                                    if (n7 == 0) break block12;
                                    n3 = this.H + this.M - 28 * (6 - n8);
                                    if (arrn == null) break block13;
                                }
                                n7 = n8;
                            }
                            if (arrn != null) break block14;
                            if (n7 > 0) {
                                n3 += n8;
                            }
                        }
                        n7 = n6;
                    }
                    if (arrn != null) break block15;
                    if (n7 == 0) break block16;
                    n2 -= 28;
                    if (arrn == null) break block17;
                }
                n4 += 64;
                n7 = n2 + (this.F - 4);
            }
            n2 = n7;
        }
        net.minecraft.client.a.v.y();
        this.a(n3, n2, n5, n4, 28, 32);
        c = 100.0f;
        this.x.g = 100.0f;
        n3 += 6;
        int n12 = n6;
        if (arrn == null) {
            n12 = n12 != 0 ? 1 : -1;
        }
        n2 = n2 + 8 + n12;
        net.minecraft.client.a.v.j();
        net.minecraft.client.a.v.q();
        d d10 = a10.l();
        this.x.a(d10, n3, n2);
        this.x.a(this.v, d10, n3, n2);
        net.minecraft.client.a.v.y();
        this.x.g = 0.0f;
        c = 0.0f;
    }

    @Override
    protected void a(char c10, int n2) throws IOException {
        block9: {
            p p2;
            block11: {
                block12: {
                    int n3;
                    int[] arrn;
                    block10: {
                        block5: {
                            block6: {
                                p p3;
                                block7: {
                                    block8: {
                                        arrn = net.minecraft.client.I.v.a();
                                        n3 = ag;
                                        if (arrn != null) break block5;
                                        if (n3 == net.minecraft.ad.a.b.h()) break block6;
                                        p3 = this;
                                        if (arrn != null) break block7;
                                        if (!net.minecraft.client.l.c.a(p3.m.ac.bI)) break block8;
                                        this.a(net.minecraft.ad.a.b);
                                        if (arrn == null) break block9;
                                    }
                                    p3 = this;
                                }
                                super.a(c10, n2);
                                if (arrn == null) break block9;
                            }
                            n3 = this.ae ? 1 : 0;
                        }
                        if (arrn == null) {
                            if (n3 != 0) {
                                this.ae = false;
                                this.ak.a("");
                            }
                            n3 = this.a(n2) ? 1 : 0;
                        }
                        if (arrn != null) break block10;
                        if (n3 != 0) break block9;
                        p2 = this;
                        if (arrn != null) break block11;
                        n3 = p2.ak.a(c10, n2) ? 1 : 0;
                    }
                    if (n3 == 0) break block12;
                    this.l();
                    if (arrn == null) break block9;
                }
                p2 = this;
            }
            super.a(c10, n2);
        }
    }

    protected boolean b(a a10, int n2, int n3) {
        int n4;
        int n5;
        int[] arrn;
        block15: {
            int n6;
            block13: {
                block14: {
                    block12: {
                        block11: {
                            int n7;
                            block9: {
                                block10: {
                                    n7 = a10.g();
                                    arrn = net.minecraft.client.I.v.a();
                                    n5 = 28 * n7;
                                    n4 = 0;
                                    n6 = a10.a();
                                    if (arrn != null) break block9;
                                    if (n6 == 0) break block10;
                                    n5 = this.M - 28 * (6 - n7) + 2;
                                    if (arrn == null) break block11;
                                }
                                n6 = n7;
                            }
                            if (arrn != null) break block12;
                            if (n6 > 0) {
                                n5 += n7;
                            }
                        }
                        n6 = a10.n() ? 1 : 0;
                    }
                    if (arrn != null) break block13;
                    if (n6 == 0) break block14;
                    n4 -= 32;
                    if (arrn == null) break block15;
                }
                n6 = n4 + this.F;
            }
            n4 = n6;
        }
        boolean bl2 = this.a(n5 + 3, n4 + 3, 23, 27, n2, n3);
        if (arrn == null) {
            if (bl2) {
                this.a(net.minecraft.client.D.h.a(a10.i(), new Object[0]), n2, n3);
                return true;
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean a(a a10, int n2, int n3) {
        int n4;
        int n5;
        int[] arrn;
        block16: {
            int n6;
            block14: {
                block15: {
                    block13: {
                        block12: {
                            int n7;
                            block10: {
                                block11: {
                                    n7 = a10.g();
                                    arrn = net.minecraft.client.I.v.a();
                                    n5 = 28 * n7;
                                    n4 = 0;
                                    n6 = a10.a();
                                    if (arrn != null) break block10;
                                    if (n6 == 0) break block11;
                                    n5 = this.M - 28 * (6 - n7) + 2;
                                    if (arrn == null) break block12;
                                }
                                n6 = n7;
                            }
                            if (arrn != null) break block13;
                            if (n6 > 0) {
                                n5 += n7;
                            }
                        }
                        n6 = a10.n() ? 1 : 0;
                    }
                    if (arrn != null) break block14;
                    if (n6 == 0) break block15;
                    n4 -= 32;
                    if (arrn == null) break block16;
                }
                n6 = n4 + this.F;
            }
            n4 = n6;
        }
        int n8 = n2;
        int n9 = n5;
        if (arrn == null) {
            if (n8 < n9) return 0 != 0;
            n8 = n2;
            n9 = n5 + 28;
        }
        if (arrn == null) {
            if (n8 > n9) return 0 != 0;
            n8 = n3;
            n9 = n4;
        }
        if (arrn == null) {
            if (n8 < n9) return 0 != 0;
            n8 = n3;
            if (arrn != null) return n8 != 0;
            n9 = n4 + 32;
        }
        if (n8 > n9) return 0 != 0;
        return 1 != 0;
    }

    public static void a(Q q2, int n2, boolean n3, boolean bl2) {
        block8: {
            Object object;
            int n4;
            net.minecraft.client.l.b b10;
            g g10;
            int[] arrn;
            net.minecraft.client.q.c c10;
            block11: {
                int n5;
                block9: {
                    block10: {
                        block7: {
                            c10 = q2.s;
                            arrn = net.minecraft.client.I.v.a();
                            g10 = q2.aw;
                            b10 = g10.a(n2);
                            n5 = n3;
                            if (arrn != null) break block9;
                            if (n5 == 0) break block10;
                            for (n4 = 0; n4 < net.minecraft.i.h.j(); ++n4) {
                                object = ((d)b10.get(n4)).C();
                                c10.cB.a(n4, (d)object);
                                q2.aW.a((d)object, 36 + n4);
                                if (arrn == null) {
                                    if (arrn == null) continue;
                                }
                                break block7;
                            }
                            c10.cu.a();
                        }
                        if (arrn == null) break block8;
                    }
                    n5 = bl2 ? 1 : 0;
                }
                if (arrn != null) break block11;
                if (n5 == 0) break block8;
                n5 = n4 = 0;
            }
            while (n4 < net.minecraft.i.h.j()) {
                b10.set(n4, c10.cB.a(n4).C());
                ++n4;
                if (arrn == null) {
                    if (arrn == null) continue;
                }
                break block8;
            }
            String string = net.minecraft.client.l.c.a(q2.ac.b3[n2].e());
            object = net.minecraft.client.l.c.a(q2.ac.b9.e());
            q2.n.a(new net.minecraft.at.h("inventory.hotbarSaved", object, string), false);
            g10.b();
        }
    }

    @Override
    protected void a(float f10, int n2, int n3) {
        block13: {
            p p2;
            block12: {
                a a10;
                block11: {
                    int n4;
                    int n5;
                    int n6;
                    int n7;
                    int[] arrn;
                    a a11;
                    block10: {
                        int[] arrn2 = net.minecraft.client.I.v.a();
                        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                        a0.b();
                        a11 = net.minecraft.ad.a.h[ag];
                        a[] arra = net.minecraft.ad.a.h;
                        arrn = arrn2;
                        n7 = arra.length;
                        n6 = 0;
                        while (n6 < n7) {
                            a a12 = arra[n6];
                            this.m.aN().b(ac);
                            if (arrn == null) {
                                int n4 = a12.h();
                                n4 = ag;
                                if (arrn != null) break block10;
                                if (n5 != n4) {
                                    this.b(a12);
                                }
                                ++n6;
                            }
                            if (arrn == null) continue;
                        }
                        this.m.aN().b(new net.minecraft.ar.v("textures/gui/container/creative_inventory/tab_" + a11.m()));
                        this.a(this.H, this.B, 0, 0, this.M, this.F);
                        this.ak.d();
                        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                        int n4 = this.H;
                        n4 = 175;
                    }
                    int n8 = n5 + n4;
                    n7 = this.B + 18;
                    n6 = n7 + 112;
                    this.m.aN().b(ac);
                    a10 = a11;
                    if (arrn != null) break block11;
                    if (a10.k()) {
                        int n10 = n7 + (int)((float)(n6 - n7 - 17) * this.ab);
                        n10 = this.c();
                        if (arrn == null) {
                            n10 = n10 != 0 ? 0 : 12;
                        }
                        this.a(n8, n9, 232 + n10, 0, 12, 15);
                    }
                    p2 = this;
                    if (arrn != null) break block12;
                    p2.b(a11);
                    a10 = a11;
                }
                if (a10 != net.minecraft.ad.a.g) break block13;
                p2 = this;
            }
            q.a((float)(p2.H + 88), (float)(this.B + 45), 20, (float)(this.H + 88 - n2), (float)(this.B + 45 - 30 - n3), this.m.s);
        }
    }

    @Override
    public void r() {
        block4: {
            Q q2;
            block2: {
                block3: {
                    int[] arrn = net.minecraft.client.I.v.a();
                    q2 = this.m;
                    if (arrn != null) break block2;
                    if (!q2.aW.f()) break block3;
                    super.r();
                    this.t.clear();
                    Keyboard.enableRepeatEvents((boolean)true);
                    this.ak = new aq(0, this.v, this.H + 82, this.B + 6, 80, this.v.p);
                    this.ak.b(50);
                    this.ak.d(false);
                    this.ak.e(false);
                    this.ak.c(0xFFFFFF);
                    int n2 = ag;
                    ag = -1;
                    this.a(net.minecraft.ad.a.h[n2]);
                    this.al = new b(this.m);
                    this.m.s.cu.b(this.al);
                    if (arrn == null) break block4;
                }
                q2 = this.m;
            }
            q2.a(new q(this.m.s));
        }
    }

    private void l() {
        block6: {
            v v2;
            block7: {
                boolean bl2;
                block8: {
                    int[] arrn = net.minecraft.client.I.v.a();
                    v2 = (v)this.X;
                    v2.k.clear();
                    int[] arrn2 = arrn;
                    bl2 = this.ak.n().isEmpty();
                    if (arrn2 != null) break block7;
                    if (!bl2) break block8;
                    for (k k2 : net.minecraft.w.k.q) {
                        k2.a(net.minecraft.ad.a.b, v2.k);
                        if (arrn2 == null) {
                            if (arrn2 == null) continue;
                        }
                        break block6;
                    }
                    if (arrn2 == null) break block7;
                }
                bl2 = v2.k.addAll(this.m.a(net.minecraft.client.B.m.b).a(this.ak.n().toLowerCase(Locale.ROOT)));
            }
            this.ab = 0.0f;
            v2.a(0.0f);
        }
    }

    @Override
    protected void a(s s2) throws IOException {
        block0: {
            if (s2.g != 1) break block0;
            this.m.a(new net.minecraft.client.m.b(this, this.m.s.a()));
        }
    }

    @Override
    public void k() throws IOException {
        block6: {
            int n2;
            int n3;
            block9: {
                int n4;
                block8: {
                    int n5;
                    int[] arrn;
                    block7: {
                        block5: {
                            int[] arrn2 = net.minecraft.client.I.v.a();
                            super.k();
                            n3 = Mouse.getEventDWheel();
                            arrn = arrn2;
                            n5 = n3;
                            if (arrn != null) break block5;
                            if (n5 == 0) break block6;
                            n5 = this.c() ? 1 : 0;
                        }
                        if (arrn != null) break block7;
                        if (n5 == 0) break block6;
                        n5 = (((v)this.X).k.size() + 9 - 1) / 9 - 5;
                    }
                    n2 = n5;
                    n4 = n3;
                    if (arrn == null) {
                        if (n4 > 0) {
                            n3 = 1;
                        }
                        n4 = n3;
                    }
                    if (arrn != null) break block8;
                    if (n4 >= 0) break block9;
                    n4 = -1;
                }
                n3 = n4;
            }
            this.ab = (float)((double)this.ab - (double)n3 / (double)n2);
            this.ab = net.minecraft.k.h.c(this.ab, 0.0f, 1.0f);
            ((v)this.X).a(this.ab);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean c() {
        int[] arrn = net.minecraft.client.I.v.a();
        boolean bl2 = ag;
        if (arrn == null) {
            if (bl2 == net.minecraft.ad.a.g.h()) return false;
            bl2 = net.minecraft.ad.a.h[ag].k();
        }
        if (arrn == null) {
            if (!bl2) return false;
            bl2 = ((v)this.X).b();
        }
        if (arrn != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    protected void a(d d10, int n2, int n3) {
        block21: {
            block14: {
                int[] arrn;
                block13: {
                    int n4;
                    List<String> list;
                    block12: {
                        int n5;
                        a a10;
                        a a11;
                        block15: {
                            block16: {
                                Object object;
                                block18: {
                                    d d11;
                                    block17: {
                                        arrn = net.minecraft.client.I.v.a();
                                        if (ag != net.minecraft.ad.a.b.h()) break block14;
                                        list = d10.a(this.m.s, this.m.ac.aP ? net.minecraft.client.B.n.ADVANCED : net.minecraft.client.B.n.NORMAL);
                                        a10 = a11 = d10.w().j();
                                        if (arrn != null) break block15;
                                        if (a10 != null) break block16;
                                        d11 = d10;
                                        if (arrn != null) break block17;
                                        if (d11.w() != net.minecraft.u.h.a0) break block16;
                                        d11 = d10;
                                    }
                                    Map<u, Integer> map = T.a(d11);
                                    object = map;
                                    if (arrn != null) break block18;
                                    if (object.size() != 1) break block16;
                                    object = map.keySet().iterator().next();
                                }
                                u u2 = (u)object;
                                a[] arra = net.minecraft.ad.a.h;
                                int n6 = arra.length;
                                int n7 = 0;
                                while (n7 < n6) {
                                    a a12 = arra[n7];
                                    if (arrn == null) {
                                        n5 = a12.a(u2.b) ? 1 : 0;
                                        if (arrn != null) break block12;
                                        if (n5 != 0) {
                                            a11 = a12;
                                            if (arrn == null) break;
                                        }
                                        ++n7;
                                    }
                                    if (arrn == null) continue;
                                }
                            }
                            a10 = a11;
                        }
                        if (a10 != null) {
                            list.add(1, "" + (Object)((Object)net.minecraft.at.l.BOLD) + (Object)((Object)net.minecraft.at.l.BLUE) + net.minecraft.client.D.h.a(a11.i(), new Object[0]));
                        }
                        n5 = n4 = 0;
                    }
                    while (n4 < list.size()) {
                        block20: {
                            block19: {
                                if (arrn != null) break block13;
                                if (n4 != 0) break block19;
                                list.set(n4, (Object)((Object)d10.l().rarityColor) + list.get(n4));
                                if (arrn == null) break block20;
                            }
                            list.set(n4, (Object)((Object)net.minecraft.at.l.GRAY) + list.get(n4));
                        }
                        ++n4;
                        if (arrn == null) continue;
                    }
                    this.a(list, n2, n3);
                }
                if (arrn == null) break block21;
            }
            super.a(d10, n2, n3);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void a(a var1_1) {
        block49: {
            block50: {
                block51: {
                    block48: {
                        block39: {
                            block47: {
                                block40: {
                                    block46: {
                                        block45: {
                                            block41: {
                                                block42: {
                                                    var3_2 = p.ag;
                                                    p.ag = var1_1.h();
                                                    v0 = net.minecraft.client.I.v.a();
                                                    var4_3 = (v)this.X;
                                                    this.E.clear();
                                                    var4_3.k.clear();
                                                    var2_4 = v0;
                                                    v1 = var1_1;
                                                    v2 = net.minecraft.ad.a.u;
                                                    if (var2_4 != null) break block41;
                                                    if (v1 != v2) break block42;
                                                    var5_5 = 0;
                                                    block0: while (true) {
                                                        v3 = var5_5;
                                                        v4 = 9;
                                                        block1: while (v3 < v4) {
                                                            block43: {
                                                                block44: {
                                                                    var6_7 = this.m.aw.a(var5_5);
                                                                    v5 = var6_7.isEmpty() ? 1 : 0;
                                                                    if (var2_4 != null) break block39;
                                                                    if (var2_4 != null) break block43;
                                                                    if (v5 == 0) break block44;
                                                                    for (var7_9 = 0; var7_9 < 9; ++var7_9) {
                                                                        v6 = var7_9;
                                                                        if (var2_4 != null) continue;
                                                                        v4 = var5_5;
                                                                        if (var2_4 != null) continue block1;
                                                                        if (v6 == v4) {
                                                                            var8_12 = new d(net.minecraft.u.h.C);
                                                                            var8_12.a("CustomCreativeLock");
                                                                            var9_15 = net.minecraft.client.l.c.a(this.m.ac.b3[var5_5].e());
                                                                            var10_18 = net.minecraft.client.l.c.a(this.m.ac.bl.e());
                                                                            var8_12.d(new net.minecraft.at.h("inventory.hotbarInfo", new Object[]{var10_18, var9_15}).f());
                                                                            var4_3.k.add(var8_12);
                                                                            if (var2_4 == null) continue;
                                                                        }
                                                                        v6 = var4_3.k.add(net.minecraft.w.d.m) ? 1 : 0;
                                                                        if (var2_4 == null) continue;
                                                                    }
                                                                    if (var2_4 == null) break block43;
                                                                }
                                                                var4_3.k.addAll(var6_7);
                                                            }
                                                            ++var5_5;
                                                            if (var2_4 == null) continue block0;
                                                        }
                                                        break;
                                                    }
                                                    if (var2_4 == null) break block45;
                                                }
                                                v1 = var1_1;
                                                v2 = net.minecraft.ad.a.b;
                                            }
                                            if (var2_4 != null) break block46;
                                            if (v1 != v2) {
                                                var1_1.a(var4_3.k);
                                            }
                                        }
                                        v1 = var1_1;
                                        v2 = net.minecraft.ad.a.g;
                                    }
                                    if (v1 != v2) break block47;
                                    var5_6 = this.m.s.cu;
                                    if (var2_4 == null) {
                                        if (this.af == null) {
                                            this.af = var4_3.f;
                                        }
                                        var4_3.f = Lists.newArrayList();
                                    }
                                    for (var6_8 = 0; var6_8 < var5_6.f.size(); ++var6_8) {
                                        var7_11 = new w(this, var5_6.f.get(var6_8), var6_8);
                                        var4_3.f.add(var7_11);
                                        v7 = var6_8;
                                        if (var2_4 != null) break block40;
                                        if (var2_4 == null) {
                                            if (v7 >= 5) {
                                                v8 = var6_8;
                                                if (var2_4 == null) {
                                                    if (v8 < 9) {
                                                        var8_13 = var6_8 - 5;
                                                        var9_16 = var8_13 / 2;
                                                        var10_19 = var8_13 % 2;
                                                        var7_11.a = 54 + var9_16 * 54;
                                                        var7_11.b = 6 + var10_19 * 27;
                                                        if (var2_4 == null) continue;
                                                    } else {
                                                        ** GOTO lbl-1000
                                                    }
                                                }
                                            } else lbl-1000:
                                            // 4 sources

                                            {
                                                v8 = var6_8;
                                            }
                                        }
                                        if (var2_4 != null) ** GOTO lbl95
                                        if (v8 >= 0) {
                                            v8 = var6_8;
                                            v9 = 5;
                                            if (var2_4 == null) {
                                                if (v8 < v9) {
                                                    var7_11.a = -2000;
                                                    var7_11.b = -2000;
                                                    if (var2_4 == null) continue;
                                                } else {
                                                    ** GOTO lbl-1000
                                                }
                                            }
                                        } else lbl-1000:
                                        // 4 sources

                                        {
                                            v8 = var6_8;
lbl95:
                                            // 2 sources

                                            v9 = 45;
                                        }
                                        if (var2_4 == null) {
                                            if (v8 == v9) {
                                                var7_11.a = 35;
                                                var7_11.b = 20;
                                                if (var2_4 == null) continue;
                                            }
                                            v8 = var6_8;
                                            v9 = var5_6.f.size();
                                        }
                                        if (var2_4 == null) {
                                            if (v8 >= v9) continue;
                                            v8 = var6_8;
                                            v9 = 9;
                                        }
                                        var8_14 = v8 - v9;
                                        var9_17 = var8_14 % 9;
                                        var10_20 = var8_14 / 9;
                                        v10 = var7_11;
                                        v11 = 9 + var9_17 * 18;
                                        if (var2_4 == null) {
                                            v10.a = v11;
                                            if (var6_8 >= 36) {
                                                var7_11.b = 112;
                                                if (var2_4 == null) continue;
                                            }
                                            v10 = var7_11;
                                            v11 = 54 + var10_20 * 18;
                                        }
                                        v10.b = v11;
                                        if (var2_4 == null) continue;
                                    }
                                    this.ah = new D(p.ai, 0, 173, 112);
                                    v7 = var4_3.f.add(this.ah);
                                }
                                if (var2_4 == null) break block48;
                            }
                            v5 = var3_2;
                        }
                        if (v5 == net.minecraft.ad.a.g.h()) {
                            var4_3.f = this.af;
                            this.af = null;
                        }
                    }
                    v12 = this;
                    if (var2_4 != null) break block49;
                    if (v12.ak == null) break block50;
                    if (var1_1 != net.minecraft.ad.a.b) break block51;
                    this.ak.e(true);
                    this.ak.b(false);
                    this.ak.c(true);
                    this.ak.a("");
                    this.l();
                    if (var2_4 == null) break block50;
                }
                this.ak.e(false);
                this.ak.b(true);
                this.ak.c(false);
            }
            v12 = this;
        }
        v12.ab = 0.0f;
        var4_3.a(0.0f);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void h() {
        block2: {
            block3: {
                net.minecraft.client.q.c c10;
                block4: {
                    int[] arrn = net.minecraft.client.I.v.a();
                    super.h();
                    int[] arrn2 = arrn;
                    if (arrn2 != null) break block2;
                    if (this.m.s == null) break block3;
                    c10 = this.m.s;
                    if (arrn2 != null) break block4;
                    if (c10.cB == null) break block3;
                    c10 = this.m.s;
                }
                c10.cu.a(this.al);
            }
            Keyboard.enableRepeatEvents((boolean)false);
        }
    }

    @Override
    protected void i() {
        block3: {
            block4: {
                p p2;
                int[] arrn;
                int n2;
                block2: {
                    int[] arrn2 = net.minecraft.client.I.v.a();
                    n2 = this.H;
                    super.i();
                    arrn = arrn2;
                    p2 = this;
                    if (arrn != null) break block2;
                    if (p2.ak == null) break block3;
                    p2 = this;
                }
                if (arrn != null) break block4;
                if (p2.H == n2) break block3;
                p2 = this;
            }
            p2.ak.g = this.H + 82;
        }
    }

    static net.minecraft.B.b a() {
        return ai;
    }

    @Override
    protected void a(int n2, int n3, int n4) throws IOException {
        int[] arrn = net.minecraft.client.I.v.a();
        if (arrn == null) {
            p p2;
            block6: {
                if (n4 == 0) {
                    int n5 = n2 - this.H;
                    int n6 = n3 - this.B;
                    a[] arra = net.minecraft.ad.a.h;
                    int n7 = arra.length;
                    int n8 = 0;
                    while (n8 < n7) {
                        a a10 = arra[n8];
                        if (arrn == null) {
                            p2 = this;
                            if (arrn != null) break block6;
                            if (p2.a(a10, n5, n6)) {
                                return;
                            }
                            ++n8;
                        }
                        if (arrn == null) continue;
                    }
                }
                p2 = this;
            }
            super.a(n2, n3, n4);
        }
    }

    @Override
    protected void b(int n2, int n3) {
        a a10 = net.minecraft.ad.a.h[ag];
        int[] arrn = net.minecraft.client.I.v.a();
        int n4 = a10.j();
        if (arrn == null && n4 != 0) {
            net.minecraft.client.a.v.f();
            n4 = this.v.b(net.minecraft.client.D.h.a(a10.i(), new Object[0]), 8.0f, 6.0f, 0x404040);
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public void a(@Nullable D var1_1, int var2_2, int var3_3, net.minecraft.B.h var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:453)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:232)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:646)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:52)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }
}

