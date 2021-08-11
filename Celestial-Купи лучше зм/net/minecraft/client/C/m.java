/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.C;

import com.google.common.collect.Maps;
import java.awt.Color;
import java.util.Map;
import net.minecraft.B.X;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.client.C.p;
import net.minecraft.client.C.w;
import net.minecraft.client.Q;
import net.minecraft.client.a.G;
import net.minecraft.client.a.o;
import net.minecraft.client.a.v;
import net.minecraft.client.r.s;
import net.minecraft.client.w.j;
import net.minecraft.w.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class m<T extends j>
implements w<B> {
    protected /* synthetic */ T g;
    private static /* synthetic */ boolean k;
    private final /* synthetic */ float a = 1.0f;
    private final /* synthetic */ s<?> e;
    private final /* synthetic */ float i = 1.0f;
    protected /* synthetic */ T c;
    private static final /* synthetic */ Map<String, net.minecraft.ar.v> f;
    private final /* synthetic */ float d = 1.0f;
    private final /* synthetic */ float h = 1.0f;
    protected static final /* synthetic */ net.minecraft.ar.v b;
    private /* synthetic */ boolean j;

    protected abstract void a(T var1, X var2);

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public net.minecraft.ar.v a(x var1_1, d var2_2, X var3_3, String var4_4) {
        block8: {
            block7: {
                var6_5 = (net.minecraft.w.m)var2_2.w();
                var5_6 = m.c();
                var7_7 = var6_5.c().b();
                var8_8 = "minecraft";
                var9_9 = var7_7.indexOf(58);
                if (!var5_6) break block7;
                if (var9_9 == -1) break block8;
                var8_8 = var7_7.substring(0, var9_9);
            }
            var7_7 = var7_7.substring(var9_9 + 1);
        }
        v0 = new Object[4];
        v0[0] = var8_8;
        v0[1] = var7_7;
        v1 = this.b(var3_3);
        if (var5_6) {
            v1 = v1 != 0 ? 2 : 1;
        }
        v0[2] = v1;
        v2 = var4_4;
        if (!var5_6) ** GOTO lbl25
        if (v2 == null) {
            v3 = "";
        } else {
            v2 = "_%s";
lbl25:
            // 2 sources

            v3 = String.format(v2, new Object[]{var4_4});
        }
        v0[3] = v3;
        var10_10 = String.format("%s:textures/models/armor/%s_layer_%d%s.png", v0);
        var10_10 = cq.g(cq.c6, new Object[]{var1_1, var2_2, var10_10, var3_3, var4_4});
        v4 = var11_11 = m.f.get(var10_10);
        if (var5_6 == false) return v4;
        if (v4 == null) {
            var11_11 = new net.minecraft.ar.v(var10_10);
            m.f.put(var10_10, var11_11);
        }
        v4 = var11_11;
        return v4;
    }

    @Override
    public boolean a() {
        return false;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static boolean c() {
        boolean bl2 = m.d();
        return !bl2;
    }

    @Override
    public void a(B b10, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        this.a(b10, f10, f11, f12, f13, f14, f15, f16, X.CHEST);
        this.a(b10, f10, f11, f12, f13, f14, f15, f16, X.LEGS);
        this.a(b10, f10, f11, f12, f13, f14, f15, f16, X.FEET);
        this.a(b10, f10, f11, f12, f13, f14, f15, f16, X.HEAD);
    }

    public static boolean d() {
        return k;
    }

    protected T a(B b10, d d10, X x2, T t2) {
        return t2;
    }

    public m(s<?> s2) {
        this.d = 1.0f;
        this.a = 1.0f;
        this.h = 1.0f;
        this.i = 1.0f;
        this.e = s2;
        this.a();
    }

    private net.minecraft.ar.v a(net.minecraft.w.m m2, boolean bl2) {
        return this.a(m2, bl2, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public T a(X x2) {
        T t2;
        boolean bl2 = m.d();
        m m2 = this;
        if (!bl2) {
            if (m2.b(x2)) {
                t2 = this.g;
                return t2;
            }
            m2 = this;
        }
        t2 = m2.c;
        return t2;
    }

    private boolean b(X x2) {
        return x2 == X.LEGS;
    }

    public static void b(boolean bl2) {
        k = bl2;
    }

    protected abstract void a();

    public static void a(s<?> s2, B b10, j j2, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        block8: {
            block5: {
                int n2;
                boolean bl2;
                block6: {
                    block7: {
                        bl2 = m.c();
                        n2 = fU.ag();
                        if (!bl2) break block6;
                        if (n2 == 0) break block7;
                        n2 = cS.dn;
                        if (!bl2) break block6;
                        if (n2 != 0) break block8;
                    }
                    n2 = b10.H;
                }
                float f17 = (float)n2 + f12;
                s2.b(b);
                boolean bl3 = fU.ag();
                if (bl2) {
                    if (bl3) {
                        as.p();
                    }
                    Q.P().Y.a(true);
                    v.a();
                    v.o(514);
                    bl3 = false;
                }
                v.a(bl3);
                float f18 = 0.5f;
                v.b(0.5f, 0.5f, 0.5f, 1.0f);
                for (int i2 = 0; i2 < 2; ++i2) {
                    v.y();
                    v.a(o.SRC_COLOR, G.ONE);
                    float f19 = 0.76f;
                    v.b(0.38f, 0.19f, 0.608f, 1.0f);
                    v.q(5890);
                    v.l();
                    float f20 = 0.33333334f;
                    v.d(0.33333334f, 0.33333334f, 0.33333334f);
                    v.a(30.0f - (float)i2 * 60.0f, 0.0f, 0.0f, 1.0f);
                    v.b(0.0f, f17 * (0.001f + (float)i2 * 0.003f) * 20.0f, 0.0f);
                    v.q(5888);
                    j2.b(b10, f10, f11, f13, f14, f15, f16);
                    v.a(o.ONE, G.ZERO);
                    if (bl2) {
                        if (bl2) continue;
                    }
                    break block5;
                }
                v.q(5890);
                v.l();
                v.q(5888);
                v.j();
                v.a(true);
                v.o(515);
                v.f();
                Q.P().Y.a(false);
            }
            if (fU.ag()) {
                as.j();
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private net.minecraft.ar.v a(net.minecraft.w.m var1_1, boolean var2_2, String var3_3) {
        var4_4 = m.d();
        v0 = new Object[3];
        v0[0] = var1_1.c().b();
        v1 = var2_2;
        if (!var4_4) {
            v1 = v1 != 0 ? 2 : 1;
        }
        v0[1] = v1;
        v2 = var3_3;
        if (var4_4) ** GOTO lbl14
        if (v2 == null) {
            v3 = "";
        } else {
            v2 = "_%s";
lbl14:
            // 2 sources

            v3 = String.format(v2, new Object[]{var3_3});
        }
        v0[2] = v3;
        var5_5 = String.format("textures/models/armor/%s_layer_%d%s.png", v0);
        v4 = var6_6 = m.f.get(var5_5);
        if (var4_4 != false) return v4;
        if (v4 == null) {
            var6_6 = new net.minecraft.ar.v(var5_5);
            m.f.put(var5_5, var6_6);
        }
        v4 = var6_6;
        return v4;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void a(B var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8, X var9_9) {
        block53: {
            block52: {
                block51: {
                    block40: {
                        block41: {
                            block50: {
                                block49: {
                                    block42: {
                                        block43: {
                                            block48: {
                                                block47: {
                                                    block46: {
                                                        block44: {
                                                            block45: {
                                                                block37: {
                                                                    block38: {
                                                                        block39: {
                                                                            block35: {
                                                                                block36: {
                                                                                    block34: {
                                                                                        block33: {
                                                                                            var10_10 = m.d();
                                                                                            v0 = cj.b.i.a(c7.class).i();
                                                                                            if (var10_10) break block33;
                                                                                            if (!v0) break block34;
                                                                                            v0 = c7.n.l();
                                                                                        }
                                                                                        if (v0) {
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                    var11_11 = var1_1.b(var9_9);
                                                                                    v1 = var11_11.w();
                                                                                    if (!var10_10) {
                                                                                        if (v1 instanceof net.minecraft.w.m == false) return;
                                                                                        v1 = var11_11.w();
                                                                                    }
                                                                                    if ((var12_12 = (net.minecraft.w.m)v1).a() != var9_9) return;
                                                                                    var13_13 = this.a(var9_9);
                                                                                    v2 = cq.ak.c();
                                                                                    if (!var10_10) {
                                                                                        if (v2) {
                                                                                            var13_13 = this.a(var1_1, var11_11, var9_9, var13_13);
                                                                                        }
                                                                                        var13_13.a(this.e.b());
                                                                                        var13_13.a(var1_1, var2_2, var3_3, var4_4);
                                                                                        this.a(var13_13, var9_9);
                                                                                        v2 = this.b(var9_9);
                                                                                    }
                                                                                    var14_14 = v2;
                                                                                    v3 = fU.aH();
                                                                                    if (var10_10) break block35;
                                                                                    if (!v3) break block36;
                                                                                    v4 = b1.a(var11_11, var9_9, null);
                                                                                    if (var10_10) break block37;
                                                                                    if (v4 != 0) break block38;
                                                                                }
                                                                                v3 = cq.c6.b();
                                                                            }
                                                                            if (!v3) break block39;
                                                                            this.e.b(this.a((x)var1_1, var11_11, var9_9, null));
                                                                            if (!var10_10) break block38;
                                                                        }
                                                                        this.e.b(this.a(var12_12, var14_14));
                                                                    }
                                                                    v4 = cq.c6.b();
                                                                }
                                                                if (var10_10) break block40;
                                                                if (v4 == 0) break block41;
                                                                v5 = ea.a(var12_12, var11_11);
                                                                if (var10_10) break block42;
                                                                if (!v5) break block43;
                                                                var15_15 = (c6)cj.b.i.a(c6.class);
                                                                var16_17 = var12_12.c(var11_11);
                                                                var17_19 = (float)(var16_17 >> 16 & 255) / 255.0f;
                                                                var18_21 = (float)(var16_17 >> 8 & 255) / 255.0f;
                                                                var19_23 = (float)(var16_17 & 255) / 255.0f;
                                                                var20_24 = Color.getHSBColor(c6.k / 255.0f, 1.0f, 1.0f).getColorComponents(null);
                                                                if (var10_10) break block44;
                                                                if (!cj.b.i.a(c6.class).i()) break block45;
                                                                v.b(var20_24[0], var20_24[1], var20_24[2], 1.0f);
                                                                if (!var10_10) break block46;
                                                            }
                                                            this.getClass();
                                                        }
                                                        this.getClass();
                                                        this.getClass();
                                                        this.getClass();
                                                        v.b(1.0f * var17_19, 1.0f * var18_21, 1.0f * var19_23, 1.0f);
                                                    }
                                                    var13_13.b(var1_1, var2_2, var3_3, var5_5, var6_6, var7_7, var8_8);
                                                    v5 = fU.aH();
                                                    if (var10_10) break block47;
                                                    if (!v5) break block48;
                                                    v5 = b1.a(var11_11, var9_9, "overlay");
                                                }
                                                if (var10_10) break block42;
                                                if (v5) break block43;
                                            }
                                            this.e.b(this.a((x)var1_1, var11_11, var9_9, "overlay"));
                                        }
                                        this.getClass();
                                        this.getClass();
                                        this.getClass();
                                        this.getClass();
                                        v.b(1.0f, 1.0f, 1.0f, 1.0f);
                                        var13_13.b(var1_1, var2_2, var3_3, var5_5, var6_6, var7_7, var8_8);
                                        v5 = this.j;
                                    }
                                    if (!var10_10) {
                                        if (v5 != false) return;
                                        v5 = var11_11.m();
                                    }
                                    if (!var10_10) {
                                        if (v5 == false) return;
                                        v5 = fU.aH();
                                    }
                                    if (var10_10) break block49;
                                    if (!v5) break block50;
                                    v5 = b1.a(var1_1, var11_11, var13_13, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, var8_8);
                                }
                                if (v5 != false) return;
                            }
                            m.a(this.e, var1_1, var13_13, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, var8_8);
                            return;
                        }
                        v4 = p.a[var12_12.c().ordinal()];
                    }
                    if (var10_10) break block51;
                    switch (v4 ? 1 : 0) {
                        case 1: {
                            var15_16 = var12_12.c(var11_11);
                            var16_18 = (float)(var15_16 >> 16 & 255) / 255.0f;
                            var17_20 = (float)(var15_16 >> 8 & 255) / 255.0f;
                            var18_22 = (float)(var15_16 & 255) / 255.0f;
                            v6 = this;
                            if (var10_10) ** GOTO lbl131
                            v6.getClass();
                            this.getClass();
                            this.getClass();
                            this.getClass();
                            v.b(1.0f * var16_18, 1.0f * var17_20, 1.0f * var18_22, 1.0f);
                            var13_13.b(var1_1, var2_2, var3_3, var5_5, var6_6, var7_7, var8_8);
                            if (fU.aH() && b1.a(var11_11, var9_9, "overlay")) ** GOTO lbl132
                            v6 = this;
lbl131:
                            // 2 sources

                            v6.e.b(this.a(var12_12, var14_14, "overlay"));
                        }
lbl132:
                        // 3 sources

                        case 2: 
                        case 3: 
                        case 4: 
                        case 5: {
                            this.getClass();
                            this.getClass();
                            this.getClass();
                            this.getClass();
                            v.b(1.0f, 1.0f, 1.0f, 1.0f);
                            var13_13.b(var1_1, var2_2, var3_3, var5_5, var6_6, var7_7, var8_8);
                            break;
                        }
                    }
                    v4 = this.j;
                }
                if (!var10_10) {
                    if (v4 != 0) return;
                    v4 = var11_11.r() ? 1 : 0;
                }
                if (!var10_10) {
                    if (v4 == 0) return;
                    v4 = fU.aH() ? 1 : 0;
                }
                if (var10_10) break block52;
                if (v4 == 0) break block53;
                v4 = b1.a(var1_1, var11_11, var13_13, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, var8_8) ? 1 : 0;
            }
            if (v4 != 0) return;
        }
        m.a(this.e, var1_1, var13_13, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, var8_8);
    }

    static {
        b = new net.minecraft.ar.v("textures/misc/enchanted_item_glint.png");
        m.b(false);
        f = Maps.newHashMap();
    }
}

