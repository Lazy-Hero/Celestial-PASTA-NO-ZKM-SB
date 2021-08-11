/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.ar.v;
import net.minecraft.client.Q;
import net.minecraft.client.a.G;
import net.minecraft.client.a.a0;
import net.minecraft.client.a.o;
import net.minecraft.client.b.l;
import net.minecraft.client.b.q;
import net.minecraft.client.g.b;
import net.minecraft.client.g.f;
import net.minecraft.client.i.a;
import net.minecraft.client.l.c;
import net.minecraft.k.h;

public class aR
extends q
implements f {
    private final /* synthetic */ Q a;
    public static final /* synthetic */ v j;
    private /* synthetic */ long g;
    private static final /* synthetic */ v i;
    private /* synthetic */ net.minecraft.client.g.a h;

    private float a() {
        long l2 = this.g - Q.aj() + 5000L;
        return net.minecraft.k.h.c((float)l2 / 2000.0f, 0.0f, 1.0f);
    }

    public void b(int n2) {
        block4: {
            block2: {
                aR aR2;
                block3: {
                    this.g = Q.aj();
                    String[] arrstring = q.b();
                    aR2 = this;
                    if (arrstring == null) break block2;
                    if (aR2.h == null) break block3;
                    this.h.b(n2);
                    if (arrstring != null) break block4;
                }
                aR2 = this;
            }
            aR2.h = new net.minecraft.client.g.a(this);
        }
    }

    private void a(int n2, int n3, float f10, float f11, b b10) {
        block5: {
            int n4;
            String string;
            int n5;
            String[] arrstring;
            block6: {
                String[] arrstring2 = q.b();
                this.a.aN().b(j);
                arrstring = arrstring2;
                if (b10 == net.minecraft.client.g.a.j) break block5;
                n5 = (int)(f11 * 255.0f);
                net.minecraft.client.a.v.M();
                float f12 = n3;
                if (arrstring != null) {
                    net.minecraft.client.a.v.b(f12, f10, 0.0f);
                    f12 = b10.a() ? 1.0f : 0.25f;
                }
                float f13 = f12;
                net.minecraft.client.a.v.b(f13, f13, f13, f11);
                b10.a(f13, n5);
                net.minecraft.client.a.v.B();
                string = net.minecraft.client.l.c.a(this.a.ac.b3[n2].e());
                n4 = n5;
                if (arrstring == null) break block6;
                if (n4 <= 3) break block5;
                n4 = b10.a() ? 1 : 0;
            }
            if (arrstring != null && n4 != 0) {
                n4 = this.a.a6.c(string, n3 + 19 - 2 - this.a.a6.e(string), f10 + 6.0f + 3.0f, 0xFFFFFF + (n5 << 24));
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(l var1_1) {
        var3_2 = (int)(this.a() * 255.0f);
        var2_3 = q.b();
        if (var3_2 <= 3) return;
        v0 = this.h;
        if (var2_3 != null) {
            if (v0 == null) return;
            v0 = this.h;
        }
        v1 = var4_4 = v0.a();
        if (var2_3 == null) ** GOTO lbl14
        if (v1 == net.minecraft.client.g.a.j) {
            v2 = this.h.e().c().a();
        } else {
            v1 = var4_4;
lbl14:
            // 2 sources

            v2 = v1.b().a();
        }
        var5_5 = v2;
        if (var5_5 == null) return;
        var6_6 = (var1_1.e() - this.a.a6.e(var5_5)) / 2;
        var7_7 = var1_1.a() - 35;
        net.minecraft.client.a.v.M();
        net.minecraft.client.a.v.a();
        net.minecraft.client.a.v.a(o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA, o.ONE, G.ZERO);
        this.a.a6.c(var5_5, var6_6, var7_7, 0xFFFFFF + (var3_2 << 24));
        net.minecraft.client.a.v.f();
        net.minecraft.client.a.v.B();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean b() {
        return this.h != null;
    }

    @Override
    public void a(net.minecraft.client.g.a a10) {
        this.h = null;
        this.g = 0L;
    }

    public aR(Q q2) {
        this.a = q2;
    }

    public void c() {
        block6: {
            block4: {
                aR aR2;
                block5: {
                    this.g = Q.aj();
                    String[] arrstring = q.b();
                    aR2 = this;
                    if (arrstring == null) break block4;
                    if (!aR2.b()) break block5;
                    int n2 = this.h.g();
                    if (n2 != -1) {
                        this.h.b(n2);
                    }
                    if (arrstring != null) break block6;
                }
                aR2 = this;
            }
            aR2.h = new net.minecraft.client.g.a(this);
        }
    }

    protected void a(l l2, float f10, int n2, float f11, a a10) {
        block4: {
            int n3;
            String[] arrstring = q.b();
            net.minecraft.client.a.v.q();
            net.minecraft.client.a.v.a();
            String[] arrstring2 = arrstring;
            net.minecraft.client.a.v.a(o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA, o.ONE, G.ZERO);
            net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, f10);
            this.a.aN().b(i);
            aR.a(n2 - 91, f11, 0, 0, 182, 22);
            int n4 = a10.a();
            if (arrstring2 != null) {
                if (n4 >= 0) {
                    aR.a(n2 - 91 - 1 + a10.a() * 20, f11 - 1.0f, 0, 22, 24, 22);
                }
                a0.b();
                n4 = n3 = 0;
            }
            while (n3 < 9) {
                this.a(n3, l2.e() / 2 - 90 + n3 * 20 + 2, f11 + 3.0f, f10, a10.a(n3));
                ++n3;
                if (arrstring2 != null) {
                    if (arrstring2 != null) continue;
                }
                break block4;
            }
            a0.a();
            net.minecraft.client.a.v.u();
            net.minecraft.client.a.v.f();
        }
    }

    public void a(int n2) {
        block7: {
            int n3;
            int n4;
            int n5;
            block5: {
                block6: {
                    String[] arrstring;
                    block4: {
                        arrstring = q.b();
                        for (n5 = this.h.g() + n2; n5 >= 0; n5 += n2) {
                            n4 = n5;
                            if (arrstring == null) break block4;
                            n3 = 8;
                            if (arrstring == null) break block5;
                            if (n4 > n3) break;
                            b b10 = this.h.a(n5);
                            if (arrstring != null) {
                                if (b10 == net.minecraft.client.g.a.j) continue;
                                b10 = this.h.a(n5);
                            }
                            n4 = b10.a() ? 1 : 0;
                            if (arrstring != null) {
                                if (n4 != 0) break;
                                if (arrstring != null) continue;
                            }
                            break block4;
                        }
                        n4 = n5;
                    }
                    if (arrstring == null) break block6;
                    if (n4 < 0) break block7;
                    n4 = n5;
                }
                n3 = 8;
            }
            if (n4 <= n3) {
                this.h.b(n5);
                this.g = Q.aj();
            }
        }
    }

    static {
        i = new v("textures/gui/widgets.png");
        j = new v("textures/gui/spectator_widgets.png");
    }

    public void a(l l2, float f10) {
        block3: {
            float f11;
            float f12;
            block4: {
                block5: {
                    aR aR2;
                    String[] arrstring;
                    block2: {
                        arrstring = q.b();
                        aR2 = this;
                        if (arrstring == null) break block2;
                        if (aR2.h == null) break block3;
                        aR2 = this;
                    }
                    f12 = aR2.a();
                    float f13 = f12 - 0.0f;
                    f11 = f13 == 0.0f ? 0 : (f13 < 0.0f ? -1 : 1);
                    if (arrstring == null) break block4;
                    if (f11 > 0) break block5;
                    this.h.h();
                    if (arrstring != null) break block3;
                }
                f11 = l2.e() / 2;
            }
            float f14 = f11;
            float f15 = c;
            c = -90.0f;
            float f16 = (float)l2.a() - 22.0f * f12;
            a a10 = this.h.i();
            this.a(l2, f12, (int)f14, f16, a10);
            c = f15;
        }
    }
}

