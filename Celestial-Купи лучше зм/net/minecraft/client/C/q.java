/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.C;

import net.minecraft.ag.Q;
import net.minecraft.ar.v;
import net.minecraft.client.C.m;
import net.minecraft.client.C.w;
import net.minecraft.client.r.av;
import net.minecraft.client.w.Z;
import net.minecraft.w.bl;

public class q
implements w<Q> {
    private static final /* synthetic */ v c;
    public /* synthetic */ Z a;
    private final /* synthetic */ av b;

    public q(av av2) {
        this.a = new Z();
        this.b = av2;
    }

    static {
        c = new v("textures/entity/sheep/sheep_fur.png");
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void a(Q q2, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        block7: {
            block12: {
                Q q3;
                block9: {
                    block10: {
                        int n2;
                        boolean bl2;
                        block11: {
                            boolean bl3;
                            block8: {
                                block6: {
                                    bl2 = m.c();
                                    bl3 = q2.b();
                                    if (!bl2) break block6;
                                    if (bl3) break block7;
                                    bl3 = q2.a3();
                                }
                                if (!bl2) break block8;
                                if (bl3) break block7;
                                this.b.b(c);
                                q3 = q2;
                                if (!bl2) break block9;
                                bl3 = q3.g();
                            }
                            if (!bl3) break block10;
                            n2 = "jeb_".equals(q2.aB());
                            if (!bl2) break block11;
                            if (n2 == 0) break block10;
                            n2 = 25;
                        }
                        int n3 = n2;
                        int n4 = q2.H / 25 + q2.W();
                        int n5 = bl.values().length;
                        int n6 = n4 % n5;
                        int n7 = (n4 + 1) % n5;
                        float f17 = ((float)(q2.H % 25) + f12) / 25.0f;
                        float[] arrf = Q.c(bl.c(n6));
                        float[] arrf2 = Q.c(bl.c(n7));
                        if (bl2) {
                            if (fU.g()) {
                                arrf = fa.a(bl.c(n6), arrf);
                                arrf2 = fa.a(bl.c(n7), arrf2);
                            }
                            net.minecraft.client.a.v.c(arrf[0] * (1.0f - f17) + arrf2[0] * f17, arrf[1] * (1.0f - f17) + arrf2[1] * f17, arrf[2] * (1.0f - f17) + arrf2[2] * f17);
                        }
                        if (bl2) break block12;
                    }
                    q3 = q2;
                }
                float[] arrf = Q.c(q3.a());
                if (fU.g()) {
                    arrf = fa.a(q2.a(), arrf);
                }
                net.minecraft.client.a.v.c(arrf[0], arrf[1], arrf[2]);
            }
            this.a.a(this.b.b());
            this.a.a(q2, f10, f11, f12);
            this.a.b(q2, f10, f11, f13, f14, f15, f16);
        }
    }
}

