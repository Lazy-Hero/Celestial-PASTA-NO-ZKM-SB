/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.b;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import net.minecraft.at.k;
import net.minecraft.client.Q;
import net.minecraft.client.a.G;
import net.minecraft.client.a.o;
import net.minecraft.client.a.v;
import net.minecraft.client.b.l;
import net.minecraft.client.b.n;
import net.minecraft.client.b.q;
import net.minecraft.client.e.g;
import net.minecraft.client.e.j;
import net.minecraft.k.h;

public class ah
extends q
implements g {
    private final /* synthetic */ List<n> h;
    private /* synthetic */ boolean a;
    private final /* synthetic */ Q g;

    public ah(Q q2) {
        this.h = Lists.newArrayList();
        this.g = q2;
    }

    @Override
    public void a(j j2, net.minecraft.client.e.k k2) {
        block3: {
            boolean bl2;
            String string;
            block5: {
                k k3;
                String[] arrstring;
                block4: {
                    arrstring = q.b();
                    k3 = k2.b();
                    if (arrstring == null) break block4;
                    if (k3 == null) break block3;
                    k3 = k2.b();
                }
                string = k3.a();
                bl2 = this.h.isEmpty();
                if (arrstring == null) break block3;
                if (bl2) break block5;
                Iterator<n> iterator = this.h.iterator();
                while (iterator.hasNext()) {
                    block7: {
                        n n2;
                        block6: {
                            n n3;
                            n2 = n3 = iterator.next();
                            if (arrstring == null) break block6;
                            bl2 = n2.a().equals(string);
                            if (arrstring == null) break block3;
                            if (!bl2) break block7;
                            n2 = n3;
                        }
                        n2.a(new net.minecraft.k.l(j2.e(), j2.a(), j2.k()));
                        return;
                    }
                    if (arrstring != null) continue;
                }
            }
            bl2 = this.h.add(new n(this, string, new net.minecraft.k.l(j2.e(), j2.a(), j2.k())));
        }
    }

    public void a(l l2) {
        block21: {
            block15: {
                long l3;
                int n2;
                int n3;
                net.minecraft.k.l l4;
                net.minecraft.k.l l5;
                net.minecraft.k.l l6;
                String[] arrstring;
                block14: {
                    boolean bl2;
                    block20: {
                        block19: {
                            block18: {
                                block16: {
                                    block17: {
                                        arrstring = q.b();
                                        bl2 = this.a;
                                        if (arrstring == null) break block16;
                                        if (bl2) break block17;
                                        bl2 = this.g.ac.a4;
                                        if (arrstring == null) break block16;
                                        if (!bl2) break block17;
                                        this.g.p().b(this);
                                        this.a = true;
                                        if (arrstring != null) break block18;
                                    }
                                    bl2 = this.a;
                                }
                                if (arrstring == null) break block19;
                                if (!bl2) break block18;
                                bl2 = this.g.ac.a4;
                                if (arrstring == null) break block19;
                                if (!bl2) {
                                    this.g.p().a(this);
                                    this.a = false;
                                }
                            }
                            bl2 = this.a;
                        }
                        if (arrstring == null) break block20;
                        if (!bl2) break block21;
                        bl2 = this.h.isEmpty();
                    }
                    if (bl2) break block21;
                    v.M();
                    v.a();
                    v.a(o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA, o.ONE, G.ZERO);
                    l6 = new net.minecraft.k.l(this.g.s.a, this.g.s.aF + (double)this.g.s.l(), this.g.s.ax);
                    l5 = new net.minecraft.k.l(0.0, 0.0, -1.0).a(-this.g.s.at * ((float)Math.PI / 180)).b(-this.g.s.e * ((float)Math.PI / 180));
                    net.minecraft.k.l l7 = new net.minecraft.k.l(0.0, 1.0, 0.0).a(-this.g.s.at * ((float)Math.PI / 180)).b(-this.g.s.e * ((float)Math.PI / 180));
                    l4 = l5.a(l7);
                    n3 = 0;
                    n2 = 0;
                    Iterator<n> iterator = this.h.iterator();
                    while (iterator.hasNext()) {
                        block22: {
                            n n4;
                            block23: {
                                n4 = iterator.next();
                                long l8 = n4.c() + 3000L - Q.aj();
                                l3 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                                if (arrstring == null) break block14;
                                if (arrstring == null) break block22;
                                if (l3 > 0) break block23;
                                iterator.remove();
                                if (arrstring != null) break block22;
                            }
                            int n5 = n2 = Math.max(n2, this.g.a6.e(n4.a()));
                        }
                        if (arrstring != null) continue;
                    }
                    l3 = n2 + this.g.a6.e("<") + this.g.a6.e(" ") + this.g.a6.e(">") + this.g.a6.e(" ");
                }
                n2 = (int)l3;
                for (n n6 : this.h) {
                    block24: {
                        double d10;
                        int n7;
                        int n8;
                        int n9;
                        String string;
                        block25: {
                            int n10;
                            block26: {
                                double d11;
                                double d12;
                                block27: {
                                    int n11 = 255;
                                    string = n6.a();
                                    net.minecraft.k.l l9 = n6.b().b(l6).d();
                                    d12 = -l4.g(l9);
                                    double d13 = -l5.g(l9);
                                    if (arrstring == null) break block15;
                                    double d14 = d13 - 0.5;
                                    double d15 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                                    if (arrstring != null) {
                                        d15 = d15 > 0 ? 1.0 : 0.0;
                                    }
                                    double d16 = d15;
                                    n10 = n2 / 2;
                                    int n12 = this.g.a6.p;
                                    n9 = n12 / 2;
                                    float f10 = 1.0f;
                                    n8 = this.g.a6.e(string);
                                    int n13 = net.minecraft.k.h.f(net.minecraft.k.h.a(255.0, 75.0, (double)((float)(Q.aj() - n6.c()) / 3000.0f)));
                                    n7 = n13 << 16 | n13 << 8 | n13;
                                    v.M();
                                    v.b((float)l2.e() - (float)n10 * 1.0f - 2.0f, (float)(l2.a() - 30) - (float)(n3 * (n12 + 1)) * 1.0f, 0.0f);
                                    v.d(1.0f, 1.0f, 1.0f);
                                    ah.a(-n10 - 1, -n9 - 1, n10 + 1, n9 + 1, -872415232);
                                    v.a();
                                    d10 = d16;
                                    if (arrstring == null) break block24;
                                    if (d10 != false) break block25;
                                    double d17 = d12 - 0.0;
                                    d10 = d17 == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
                                    if (arrstring == null) break block26;
                                    if (d10 <= 0) break block27;
                                    this.g.a6.b(">", n10 - this.g.a6.e(">"), -n9, n7 + -16777216);
                                    if (arrstring != null) break block25;
                                }
                                d10 = (d11 = d12 - 0.0) == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
                            }
                            if (arrstring == null) break block24;
                            if (d10 < 0) {
                                this.g.a6.b("<", -n10, -n9, n7 + -16777216);
                            }
                        }
                        d10 = this.g.a6.b(string, -n8 / 2, -n9, n7 + -16777216);
                    }
                    v.B();
                    ++n3;
                    if (arrstring != null) continue;
                }
                v.f();
            }
            v.B();
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

