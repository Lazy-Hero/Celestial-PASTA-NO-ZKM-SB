/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.H;

import net.minecraft.ah.s;
import net.minecraft.at.h;
import net.minecraft.at.k;
import net.minecraft.client.H.d;
import net.minecraft.client.H.e;
import net.minecraft.client.H.f;
import net.minecraft.client.n.i;
import net.minecraft.client.q.c;
import net.minecraft.l.m;
import net.minecraft.u.g;

public class a
implements e {
    private static final /* synthetic */ k a;
    private final /* synthetic */ d c;
    private /* synthetic */ i b;
    private static final /* synthetic */ k d;
    private /* synthetic */ int e;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(c c10) {
        net.minecraft.l.d d10 = m.c(net.minecraft.w.k.b(g.cB));
        boolean bl2 = net.minecraft.client.H.d.f();
        if (d10 == null) return 0 != 0;
        int n2 = c10.a().a(d10);
        if (bl2) return n2 != 0;
        if (n2 <= 0) return 0 != 0;
        return 1 != 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public a(d d10) {
        this.c = d10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void b() {
        block15: {
            block11: {
                block14: {
                    block13: {
                        block12: {
                            ++this.e;
                            var1_1 = net.minecraft.client.H.d.a();
                            v0 = this;
                            if (var1_1) {
                                if (v0.c.g() != s.SURVIVAL) {
                                    this.c.a(f.NONE);
                                    if (var1_1 != false) return;
                                }
                                v0 = this;
                            }
                            v1 = v0.e;
                            v2 = 1;
                            if (!var1_1) break block11;
                            if (v1 != v2) break block12;
                            v3 = this;
                            if (!var1_1) break block13;
                            var2_2 = v3.c.d().s;
                            if (var2_2 == null) break block12;
                            v1 = var2_2.cB.h(new net.minecraft.w.d(g.cB)) ? 1 : 0;
                            if (var1_1) {
                                if (v1 != 0) {
                                    this.c.a(f.NONE);
                                    return;
                                }
                                v1 = net.minecraft.client.H.a.a(var2_2) ? 1 : 0;
                            }
                            if (var1_1) {
                                if (v1 != 0) {
                                    this.c.a(f.NONE);
                                    return;
                                } else {
                                    ** GOTO lbl28
                                }
                            }
                            break block14;
                        }
                        v3 = this;
                    }
                    if (!var1_1) break block15;
                    v1 = v3.e;
                }
                v2 = 1200;
            }
            if (v1 < v2) return;
            v3 = this;
        }
        if (var1_1) {
            if (v3.b != null) return;
            this.b = new i(net.minecraft.client.n.d.WOODEN_PLANKS, net.minecraft.client.H.a.d, net.minecraft.client.H.a.a, false);
            v3 = this;
        }
        v3.c.d().ay().a(this.b);
    }

    @Override
    public void a(net.minecraft.w.d d10) {
        block0: {
            if (d10.w() != net.minecraft.w.k.b(g.cB)) break block0;
            this.c.a(f.NONE);
        }
    }

    static {
        d = new h("tutorial.craft_planks.title", new Object[0]);
        a = new h("tutorial.craft_planks.description", new Object[0]);
    }

    @Override
    public void a() {
        block3: {
            i i2;
            block2: {
                boolean bl2 = net.minecraft.client.H.d.a();
                i2 = this.b;
                if (!bl2) break block2;
                if (i2 == null) break block3;
                i2 = this.b;
            }
            i2.a();
            this.b = null;
        }
    }
}

