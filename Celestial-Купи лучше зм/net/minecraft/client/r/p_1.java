/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.r;

import javax.annotation.Nullable;
import net.minecraft.J.l;
import net.minecraft.U.x;
import net.minecraft.client.Q;
import net.minecraft.client.a.a0;
import net.minecraft.client.a.d;
import net.minecraft.client.a.v;
import net.minecraft.client.j.j;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.x.Y;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.u.h;
import net.minecraft.w.an;

public class p
extends b<l> {
    private final /* synthetic */ net.minecraft.client.a.p j;
    private final /* synthetic */ Q i;
    private final /* synthetic */ net.minecraft.client.x.n m;
    private final /* synthetic */ net.minecraft.client.x.n l;
    private static final /* synthetic */ net.minecraft.ar.v k;

    @Nullable
    protected net.minecraft.ar.v a(l l2) {
        return null;
    }

    @Override
    protected void a(l l2, double d10, double d11, double d12) {
        block6: {
            x x2;
            block8: {
                boolean bl2;
                block7: {
                    m[] arrm;
                    block5: {
                        arrm = b.b();
                        bl2 = Q.ak();
                        if (arrm != null) break block5;
                        if (!bl2) break block6;
                        bl2 = l2.b().G();
                    }
                    if (arrm != null) break block7;
                    if (bl2) break block6;
                    x2 = l2;
                    if (arrm != null) break block8;
                    bl2 = ((l)x2).b().c();
                }
                if (!bl2) break block6;
                x2 = this.h.n;
            }
            if (x2 == l2) {
                float f10;
                double d13 = l2.s(this.h.b);
                float f11 = f10 = l2.a4() ? 32.0f : 64.0f;
                if (d13 < (double)(f10 * f10)) {
                    String string = l2.b().g();
                    this.a(l2, string, d10, d11, d12, 64);
                }
            }
        }
    }

    static {
        k = new net.minecraft.ar.v("textures/map/map_background.png");
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public p(a4 a42, net.minecraft.client.a.p p2) {
        super(a42);
        this.i = Q.P();
        this.m = new net.minecraft.client.x.n("item_frame", "normal");
        this.l = new net.minecraft.client.x.n("item_frame", "map");
        this.j = p2;
    }

    public void a(l l2, double d10, double d11, double d12, float f10, float f11) {
        p p2;
        block11: {
            boolean bl2;
            block10: {
                Y y2;
                d d13;
                m[] arrm;
                block9: {
                    net.minecraft.client.x.x x2;
                    block8: {
                        v.M();
                        n n2 = l2.g();
                        m[] arrm2 = b.b();
                        double d14 = (double)n2.e() - l2.a + d10;
                        double d15 = (double)n2.b() - l2.aF + d11;
                        double d16 = (double)n2.a() - l2.ax + d12;
                        v.b(d14 + 0.5, d15 + 0.5, d16 + 0.5);
                        v.a(180.0f - l2.e, 0.0f, 1.0f, 0.0f);
                        arrm = arrm2;
                        this.h.d.b(net.minecraft.client.j.j.x);
                        d13 = this.i.W();
                        x2 = d13.b().b();
                        if (!(l2.b().w() instanceof an)) break block8;
                        y2 = x2.a(this.l);
                        if (arrm == null) break block9;
                    }
                    y2 = x2.a(this.m);
                }
                v.M();
                v.b(-0.5f, -0.5f, -0.5f);
                bl2 = this.g;
                if (arrm != null) break block10;
                if (bl2) {
                    v.r();
                    v.m(this.a(l2));
                }
                d13.a().a(y2, 1.0f, 1.0f, 1.0f, 1.0f);
                p2 = this;
                if (arrm != null) break block11;
                bl2 = p2.g;
            }
            if (bl2) {
                v.s();
                v.h();
            }
            v.B();
            v.b(0.0f, 0.0f, 0.4375f);
            this.b(l2);
            v.B();
            p2 = this;
        }
        p2.a(l2, d10 + (double)((float)l2.aL.r() * 0.3f), d11 - 0.25, d12 + (double)((float)l2.aL.i() * 0.3f));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void b(l var1_1) {
        block12: {
            block13: {
                block14: {
                    var3_2 = var1_1.b();
                    var2_3 = b.b();
                    v0 = var3_2.G();
                    if (var2_3 == null) {
                        if (v0 != 0) return;
                        v0 = fU.q;
                    }
                    if (var2_3 == null) {
                        if (v0 == 0) {
                            var4_4 = this.i.s;
                            var5_6 = var1_1.a(var4_4.a, var4_4.aF, var4_4.ax);
                            cfr_temp_0 = var5_6 - 4096.0;
                            v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                            if (var2_3 == null) {
                                if (v0 > 0) {
                                    return;
                                } else {
                                    ** GOTO lbl-1000
                                }
                            }
                        } else lbl-1000:
                        // 3 sources

                        {
                            v.M();
                            v.y();
                            v0 = var3_2.w() instanceof an;
                        }
                    }
                    v1 = var4_5 = v0;
                    if (var2_3 == null) {
                        v1 = v1 != 0 ? var1_1.d() % 4 * 2 : var1_1.d();
                    }
                    var5_7 = v1;
                    v.a((float)var5_7 * 360.0f / 8.0f, 0.0f, 0.0f, 1.0f);
                    if (var2_3 != null) break block12;
                    if (cq.b(cq.cq, new Object[]{var1_1, this})) break block13;
                    if (var4_5 == 0) break block14;
                    this.h.d.b(p.k);
                    v.a(180.0f, 0.0f, 0.0f, 1.0f);
                    var6_8 = 0.0078125f;
                    v.d(0.0078125f, 0.0078125f, 0.0078125f);
                    v.b(-64.0f, -64.0f, 0.0f);
                    var7_9 = ea.a(net.minecraft.u.h.a9, var3_2, var1_1.aG);
                    v.b(0.0f, 0.0f, -1.0f);
                    if (var7_9 != null) {
                        this.i.Y.k().a(var7_9, true);
                    }
                    if (var2_3 == null) break block13;
                }
                v.d(0.5f, 0.5f, 0.5f);
                v.O();
                a0.c();
                this.j.a(var3_2, net.minecraft.client.x.d.FIXED);
                a0.a();
                v.i();
            }
            v.j();
        }
        v.B();
    }
}

