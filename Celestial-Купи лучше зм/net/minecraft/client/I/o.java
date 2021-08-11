/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.I;

import java.awt.Color;
import net.minecraft.B.a;
import net.minecraft.B.z;
import net.minecraft.client.I.g;
import net.minecraft.client.I.v;
import net.minecraft.client.Q;
import net.minecraft.client.b.l;
import net.minecraft.i.h;

public class o
extends g {
    private static final /* synthetic */ net.minecraft.ar.v ac;
    private final /* synthetic */ h ad;
    private /* synthetic */ float ab;
    private final /* synthetic */ a aa;

    @Override
    protected void a(float f10, int n2, int n3) {
        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
        this.m.aN().b(ac);
        int n4 = (h - this.M) / 2;
        int n5 = (w - this.F) / 2;
        this.a(n4, n5, 0, 0, this.M, this.F);
    }

    @Override
    protected void b(int n2, int n3) {
        this.v.b(this.aa.d().f(), 8.0f, 6.0f, 0x404040);
        this.v.b(this.ad.d().f(), 8.0f, this.F - 96 + 2, 0x404040);
    }

    @Override
    public void a(int n2, int n3, float f10) {
        block12: {
            o o2;
            block4: {
                block5: {
                    int[] arrn;
                    l l2;
                    block8: {
                        float f11;
                        block11: {
                            o o3;
                            float f12;
                            block9: {
                                block10: {
                                    block6: {
                                        float f13;
                                        int n4;
                                        block7: {
                                            l2 = new l(Q.P());
                                            arrn = net.minecraft.client.I.v.a();
                                            o2 = this;
                                            if (arrn != null) break block4;
                                            if (o2.m.s == null) break block5;
                                            o2 = this;
                                            if (arrn != null) break block4;
                                            if (o2.m.e == null) break block5;
                                            f11 = 160.0f;
                                            n4 = (int)(f11 / 100.0f);
                                            float f14 = this.ab - (f11 - (float)n4);
                                            f12 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                                            if (arrn != null) break block6;
                                            if (f12 >= 0) break block7;
                                            this.ab += (float)n4;
                                            if (arrn == null) break block8;
                                        }
                                        f12 = (f13 = this.ab - (f11 - (float)n4)) == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                                    }
                                    if (arrn != null) break block9;
                                    if (f12 <= 0) break block10;
                                    float f15 = this.ab - f11;
                                    f12 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                                    if (arrn != null) break block9;
                                    if (f12 == false) break block10;
                                    this.ab = (int)f11;
                                    if (arrn == null) break block8;
                                }
                                o3 = this;
                                if (arrn != null) break block11;
                                float f16 = o3.ab - f11;
                                f12 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                            }
                            if (f12 == false) break block8;
                            o3 = this;
                        }
                        o3.ab = (int)f11;
                    }
                    Color color = new Color(cj.h().getRed(), cj.h().getGreen(), cj.h().getBlue(), (int)this.ab);
                    Color color2 = new Color(0, 0, 0, 0);
                    this.a(0, 0, (double)l2.e(), (double)l2.a(), color.getRGB(), color2.getRGB());
                    if (arrn == null) break block12;
                }
                o2 = this;
            }
            o2.n();
        }
        super.a(n2, n3, f10);
        this.c(n2, n3);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        ac = new net.minecraft.ar.v("textures/gui/container/shulker_box.png");
    }

    public o(h h2, a a10) {
        super(new z(h2, a10, Q.P().s));
        this.ad = h2;
        this.aa = a10;
        ++this.F;
    }
}

