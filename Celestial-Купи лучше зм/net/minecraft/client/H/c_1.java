/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.h;

import java.util.List;
import net.minecraft.ar.v;
import net.minecraft.client.Q;
import net.minecraft.client.a.a0;
import net.minecraft.client.b.L;
import net.minecraft.client.b.s;
import net.minecraft.client.h.h;
import net.minecraft.client.h.k;
import net.minecraft.l.i;
import net.minecraft.w.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class c
extends s {
    private /* synthetic */ int v;
    private static final /* synthetic */ v x;
    private /* synthetic */ float t;
    private /* synthetic */ float s;
    private /* synthetic */ i w;
    private /* synthetic */ k u;

    public List<String> a(L l2) {
        d d10 = this.d().get(this.v).d();
        List<String> list = l2.a(d10);
        String[] arrstring = net.minecraft.client.h.k.d();
        List<Object> list2 = this.u.b(this.w.b());
        if (arrstring != null) {
            if (list2.size() > 1) {
                list.add(net.minecraft.client.D.h.a("gui.recipebook.moreRecipes", new Object[0]));
            }
            list2 = list;
        }
        return list2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private List<net.minecraft.az.k> d() {
        List<net.minecraft.az.k> list = this.u.a(true);
        String[] arrstring = net.minecraft.client.h.k.d();
        boolean bl2 = this.w.b();
        if (arrstring != null && !bl2) {
            bl2 = list.addAll(this.u.a(false));
        }
        return list;
    }

    public boolean a() {
        String[] arrstring = net.minecraft.client.h.k.d();
        boolean bl2 = this.d().size();
        if (arrstring != null) {
            bl2 = bl2;
        }
        return bl2;
    }

    public net.minecraft.az.k b() {
        List<net.minecraft.az.k> list = this.d();
        return list.get(this.v);
    }

    public void c(int n2, int n3) {
        this.o = n2;
        this.r = n3;
    }

    public void a(k k2, h h2, i i2) {
        this.u = k2;
        this.w = i2;
        List<net.minecraft.az.k> list = k2.b(i2.b());
        String[] arrstring = net.minecraft.client.h.k.d();
        for (net.minecraft.az.k k3 : list) {
            block4: {
                block3: {
                    if (arrstring == null) break block3;
                    if (!i2.a(k3)) break block4;
                    h2.a(list);
                    this.t = 15.0f;
                }
                if (arrstring != null) break;
            }
            if (arrstring != null) continue;
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(Q var1_1, int var2_2, int var3_3, float var4_4) {
        block25: {
            block23: {
                block24: {
                    block22: {
                        block21: {
                            block20: {
                                block19: {
                                    var5_5 = net.minecraft.client.h.k.d();
                                    v0 = this.l;
                                    if (var5_5 != null) {
                                        if (v0 == false) return;
                                        v0 = L.q();
                                    }
                                    if (!v0) {
                                        this.s += var4_4;
                                    }
                                    v1 = var2_2;
                                    v2 = this.o;
                                    if (var5_5 == null) break block19;
                                    if (v1 < v2) ** GOTO lbl-1000
                                    v1 = var3_3;
                                    v2 = this.r;
                                }
                                if (var5_5 == null) break block20;
                                if (v1 < v2) ** GOTO lbl-1000
                                v1 = var2_2;
                                v2 = this.o + this.i;
                            }
                            if (var5_5 == null) break block21;
                            if (v1 >= v2) ** GOTO lbl-1000
                            v1 = var3_3;
                            if (var5_5 == null) break block22;
                            v2 = this.r + this.n;
                        }
                        ** if (v1 >= v2) goto lbl-1000
lbl-1000:
                        // 1 sources

                        {
                            v1 = 1;
                            ** GOTO lbl31
                        }
lbl-1000:
                        // 4 sources

                        {
                            v1 = 0;
                        }
                    }
                    this.a = v1;
                    a0.b();
                    var1_1.aN().b(net.minecraft.client.h.c.x);
                    net.minecraft.client.a.v.y();
                    var6_6 = 29;
                    v3 = this.u.c();
                    if (var5_5 != null) {
                        if (v3 == 0) {
                            var6_6 += 25;
                        }
                        v3 = 206;
                    }
                    var7_7 = v3;
                    v4 = this.u.b(this.w.b()).size();
                    if (var5_5 != null) {
                        if (v4 > 1) {
                            var7_7 += 25;
                        }
                        v4 = (cfr_temp_0 = this.t - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                    }
                    if (var5_5 != null) {
                        v4 = var8_8 = v4 > 0 ? 1 : 0;
                    }
                    if (var5_5 != null) {
                        if (var8_8 != 0) {
                            var9_9 = 1.0f + 0.1f * (float)Math.sin(this.t / 15.0f * 3.1415927f);
                            net.minecraft.client.a.v.M();
                            net.minecraft.client.a.v.b((float)(this.o + 8), (float)(this.r + 12), 0.0f);
                            net.minecraft.client.a.v.d(var9_9, var9_9, 1.0f);
                            net.minecraft.client.a.v.b((float)(-(this.o + 8)), (float)(-(this.r + 12)), 0.0f);
                            this.t -= var4_4;
                        }
                        this.a(this.o, this.r, var6_6, var7_7, this.i, this.n);
                    }
                    var9_10 = this.d();
                    this.v = net.minecraft.k.h.d(this.s / 30.0f) % var9_10.size();
                    var10_11 = var9_10.get(this.v).d();
                    var11_12 = 4;
                    v5 = this.u.a();
                    if (var5_5 == null) break block23;
                    if (v5 == 0) break block24;
                    v5 = this.d().size();
                    if (var5_5 == null) break block23;
                    if (v5 > 1) {
                        var1_1.Y().a(var10_11, this.o + var11_12 + 1, this.r + var11_12 + 1);
                        --var11_12;
                    }
                }
                var1_1.Y().a(var10_11, this.o + var11_12, this.r + var11_12);
                if (var5_5 == null) break block25;
                v5 = var8_8;
            }
            if (v5 != 0) {
                net.minecraft.client.a.v.B();
            }
            net.minecraft.client.a.v.j();
        }
        a0.a();
    }

    public c() {
        super(0, 0, 0, 25, 25, "");
    }

    static {
        x = new v("textures/gui/recipe_book.png");
    }

    @Override
    public int a() {
        return 25;
    }

    public k c() {
        return this.u;
    }
}

