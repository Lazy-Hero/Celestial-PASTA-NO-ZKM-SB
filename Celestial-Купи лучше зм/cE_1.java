/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.glu.GLU
 */
import java.awt.Color;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import net.minecraft.J.D;
import net.minecraft.J.E;
import net.minecraft.J.G;
import net.minecraft.J.n;
import net.minecraft.J.o;
import net.minecraft.J.t;
import net.minecraft.J.u;
import net.minecraft.J.x;
import net.minecraft.T.a7;
import net.minecraft.T.ae;
import net.minecraft.T.ai;
import net.minecraft.U.B;
import net.minecraft.ag.C;
import net.minecraft.ag.W;
import net.minecraft.an.b;
import net.minecraft.client.a.aZ;
import net.minecraft.client.a.v;
import net.minecraft.client.b.l;
import net.minecraft.h.d;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.k;
import net.minecraft.w.m;
import net.minecraft.z.f;
import net.minecraft.z.g;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class cE
extends bE {
    private final /* synthetic */ int m;
    private final /* synthetic */ hH q;
    private final /* synthetic */ FloatBuffer k;
    private final /* synthetic */ FloatBuffer s;
    private final /* synthetic */ int n;
    private final /* synthetic */ FloatBuffer l;
    private final /* synthetic */ hH o;
    private final /* synthetic */ hH v;
    private final /* synthetic */ hH r;
    private final /* synthetic */ hH t;
    private final /* synthetic */ IntBuffer p;
    private final /* synthetic */ hH w;
    private final /* synthetic */ hH u;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @cL
    public void a(fn var1_1) {
        block41: {
            var3_2 = cj.b.f.a("ESP Mode").m();
            v0 = C.f();
            this.b(var3_2);
            GL11.glPushMatrix();
            var4_3 = cE.c.a8.i;
            var5_4 = net.minecraft.client.b.l.c();
            var6_5 = (double)var5_4 / Math.pow(var5_4, 2.0);
            GL11.glScaled((double)var6_5, (double)var6_5, (double)var6_5);
            var8_6 = this.n;
            var9_7 = new Color(this.w.o());
            var2_8 = v0;
            var10_9 = new Color(var9_7.getRed(), var9_7.getGreen(), var9_7.getBlue(), 255);
            v1 = this.v.l();
            if (var2_8 == null) {
                v1 = v1 != 0 ? cj.h().getRGB() : var10_9.getRGB();
            }
            var11_10 = v1;
            var12_11 = 1.0f;
            var13_12 = 1.0f / var12_11;
            var14_13 = cE.c.aQ();
            var15_14 = cE.c.Y;
            for (E v2 : cE.c.e.O) {
                block42: {
                    block74: {
                        block76: {
                            block75: {
                                block68: {
                                    block73: {
                                        block69: {
                                            block72: {
                                                block70: {
                                                    block71: {
                                                        block67: {
                                                            block66: {
                                                                block65: {
                                                                    block61: {
                                                                        block62: {
                                                                            block64: {
                                                                                block63: {
                                                                                    block59: {
                                                                                        block60: {
                                                                                            block58: {
                                                                                                block52: {
                                                                                                    block57: {
                                                                                                        block55: {
                                                                                                            block56: {
                                                                                                                block53: {
                                                                                                                    block54: {
                                                                                                                        block50: {
                                                                                                                            block51: {
                                                                                                                                block49: {
                                                                                                                                    block1: while (true) {
                                                                                                                                        block45: {
                                                                                                                                            block44: {
                                                                                                                                                block43: {
                                                                                                                                                    var17_16 = (net.minecraft.U.x)v2 /* !! */ ;
                                                                                                                                                    v3 = this.a(var17_16) ? 1 : 0;
                                                                                                                                                    if (var2_8 != null) break block41;
                                                                                                                                                    if (var2_8 != null) break block43;
                                                                                                                                                    if (v3 == 0) break block42;
                                                                                                                                                    v4 = var17_16;
                                                                                                                                                    if (var2_8 != null) break block44;
                                                                                                                                                    v5 = dJ.a(v4);
                                                                                                                                                }
                                                                                                                                                if (!v5) break block42;
                                                                                                                                                v4 = var17_16;
                                                                                                                                            }
                                                                                                                                            var18_17 = dJ.a(v4.a, var17_16.am, var4_3);
                                                                                                                                            var20_18 = dJ.a(var17_16.aF, var17_16.af, var4_3);
                                                                                                                                            var22_19 = dJ.a(var17_16.ax, var17_16.n, var4_3);
                                                                                                                                            var24_20 = (double)var17_16.ad / 1.5;
                                                                                                                                            v6 = var17_16.aD;
                                                                                                                                            v7 = var17_16;
                                                                                                                                            if (var2_8 != null) break block45;
                                                                                                                                            if (v7.a4()) ** GOTO lbl-1000
                                                                                                                                            v7 = var17_16;
                                                                                                                                        }
                                                                                                                                        if (v7 == cE.c.s && cE.c.s.a4()) lbl-1000:
                                                                                                                                        // 2 sources

                                                                                                                                        {
                                                                                                                                            v8 = -0.3;
                                                                                                                                        } else {
                                                                                                                                            v8 = 0.2;
                                                                                                                                        }
                                                                                                                                        var26_21 = v6 + v8;
                                                                                                                                        var28_22 = new k(var18_17 - var24_20, var20_18, var22_19 - var24_20, var18_17 + var24_20, var20_18 + var26_21, var22_19 + var24_20);
                                                                                                                                        var29_23 = new q[]{new q(var28_22.e, var28_22.b, var28_22.d), new q(var28_22.e, var28_22.a, var28_22.d), new q(var28_22.f, var28_22.b, var28_22.d), new q(var28_22.f, var28_22.a, var28_22.d), new q(var28_22.e, var28_22.b, var28_22.g), new q(var28_22.e, var28_22.a, var28_22.g), new q(var28_22.f, var28_22.b, var28_22.g), new q(var28_22.f, var28_22.a, var28_22.g)};
                                                                                                                                        var15_14.a(var4_3, 0);
                                                                                                                                        var30_24 = null;
                                                                                                                                        var31_25 = var29_23;
                                                                                                                                        var32_27 = var31_25.length;
                                                                                                                                        var33_28 = 0;
                                                                                                                                        while (var33_28 < var32_27) {
                                                                                                                                            block46: {
                                                                                                                                                block47: {
                                                                                                                                                    block48: {
                                                                                                                                                        var34_30 = var31_25[var33_28];
                                                                                                                                                        var34_30 = this.a(var5_4, var34_30.c - var14_13.m, var34_30.b - var14_13.u, var34_30.a - var14_13.j);
                                                                                                                                                        if (var2_8 != null) break block46;
                                                                                                                                                        v2 /* !! */  = var34_30;
                                                                                                                                                        if (var2_8 != null) continue block1;
                                                                                                                                                        if (v2 /* !! */  == null) break block47;
                                                                                                                                                        cfr_temp_0 = var34_30.a - 0.0;
                                                                                                                                                        v9 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                                                                                                                                        if (var2_8 != null) break block48;
                                                                                                                                                        if (v9 < 0) break block47;
                                                                                                                                                        cfr_temp_1 = var34_30.a - 1.0;
                                                                                                                                                        v9 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                                                                                                                                                    }
                                                                                                                                                    if (v9 < 0) {
                                                                                                                                                        v10 = var30_24;
                                                                                                                                                        if (var2_8 == null) {
                                                                                                                                                            if (v10 == null) {
                                                                                                                                                                var30_24 = new gO(var34_30.c, var34_30.b, var34_30.a, 0.0);
                                                                                                                                                            }
                                                                                                                                                            var30_24.c = Math.min(var34_30.c, var30_24.c);
                                                                                                                                                            var30_24.a = Math.min(var34_30.b, var30_24.a);
                                                                                                                                                            var30_24.b = Math.max(var34_30.c, var30_24.b);
                                                                                                                                                            v10 = var30_24;
                                                                                                                                                        }
                                                                                                                                                        v10.d = Math.max(var34_30.b, var30_24.d);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                ++var33_28;
                                                                                                                                            }
                                                                                                                                            if (var2_8 == null) continue;
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    v11 = var30_24;
                                                                                                                                    if (var2_8 != null) break block49;
                                                                                                                                    if (v11 == null) break block42;
                                                                                                                                    var15_14.j();
                                                                                                                                    v11 = var30_24;
                                                                                                                                }
                                                                                                                                var31_26 = v11.c;
                                                                                                                                var33_29 = var30_24.a;
                                                                                                                                var35_31 = var30_24.b;
                                                                                                                                var37_32 = var30_24.d;
                                                                                                                                v12 = var3_2.equalsIgnoreCase("CSGO");
                                                                                                                                if (var2_8 == null) {
                                                                                                                                    if (v12) {
                                                                                                                                        dJ.b(var31_26 + 1.0, var33_29, var31_26 - 1.0, var33_29 + (var37_32 - var33_29) / 4.0 + 0.5, var8_6);
                                                                                                                                        dJ.b(var31_26 - 2.0, var37_32, var31_26 + 0.5, var37_32 - (var37_32 - var33_29) / 4.0 - 0.5, var8_6);
                                                                                                                                        dJ.b(var31_26 - 2.0, var33_29 - 0.5, var31_26 + (var35_31 - var31_26) / 3.0 + 0.5, var33_29 + 1.0, var8_6);
                                                                                                                                        dJ.b(var35_31 - (var35_31 - var31_26) / 3.0 - 1.0, var33_29 - 0.5, var35_31, var33_29 + 1.0, var8_6);
                                                                                                                                        dJ.b(var35_31 - 2.0, var33_29, var35_31 + 0.5, var33_29 + (var37_32 - var33_29) / 4.0 + 0.5, var8_6);
                                                                                                                                        dJ.b(var35_31 - 2.0, var37_32, var35_31 + 0.5, var37_32 - (var37_32 - var33_29) / 4.0 - 0.5, var8_6);
                                                                                                                                        dJ.b(var31_26 - 2.0, var37_32 - 1.0, var31_26 + (var35_31 - var31_26) / 3.0 + 0.5, var37_32 + 0.5, var8_6);
                                                                                                                                        dJ.b(var35_31 - (var35_31 - var31_26) / 3.0 - 1.0, var37_32 - 1.0, var35_31 + 0.5, var37_32 + 0.5, var8_6);
                                                                                                                                        dJ.b(var31_26, var33_29, var31_26 - 1.0, var33_29 + (var37_32 - var33_29) / 4.0, var11_10);
                                                                                                                                        dJ.b(var31_26 - 1.0, var37_32, var31_26, var37_32 - (var37_32 - var33_29) / 4.0, var11_10);
                                                                                                                                        dJ.b(var31_26 - 1.0, var33_29, var31_26 + (var35_31 - var31_26) / 3.0, var33_29 + 0.5, var11_10);
                                                                                                                                        dJ.b(var35_31 - (var35_31 - var31_26) / 3.0 - 1.0, var33_29, var35_31, var33_29 + 0.5, var11_10);
                                                                                                                                        dJ.b(var35_31 - 1.0, var33_29, var35_31, var33_29 + (var37_32 - var33_29) / 4.0, var11_10);
                                                                                                                                        dJ.b(var35_31 - 1.0, var37_32, var35_31, var37_32 - (var37_32 - var33_29) / 4.0, var11_10);
                                                                                                                                        dJ.b(var31_26 - 1.0, var37_32 - 0.5, var31_26 + (var35_31 - var31_26) / 3.0, var37_32, var11_10);
                                                                                                                                        dJ.b(var35_31 - (var35_31 - var31_26) / 3.0 - 2.0, var37_32 - 0.5, var35_31 - 0.5, var37_32, var11_10);
                                                                                                                                    }
                                                                                                                                    v12 = var17_16 instanceof B;
                                                                                                                                }
                                                                                                                                var39_33 = v12;
                                                                                                                                var41_35 = (B)var17_16;
                                                                                                                                var42_36 = var41_35.V();
                                                                                                                                var43_37 = var41_35.H();
                                                                                                                                var44_38 = var42_36 / var43_37;
                                                                                                                                var46_39 = (var37_32 - var33_29) * var44_38;
                                                                                                                                cfr_temp_2 = var42_36 - 4.0f;
                                                                                                                                v13 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1);
                                                                                                                                if (var2_8 != null) break block50;
                                                                                                                                if (v13 > 0) break block51;
                                                                                                                                var40_34 = new Color(200, 0, 0).getRGB();
                                                                                                                                if (var2_8 == null) break block52;
                                                                                                                            }
                                                                                                                            v13 = (cfr_temp_3 = var42_36 - 8.0f) == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1);
                                                                                                                        }
                                                                                                                        if (var2_8 != null) break block53;
                                                                                                                        if (v13 > 0) break block54;
                                                                                                                        var40_34 = new Color(231, 143, 85).getRGB();
                                                                                                                        if (var2_8 == null) break block52;
                                                                                                                    }
                                                                                                                    v13 = (cfr_temp_4 = var42_36 - 12.0f) == 0.0f ? 0 : (cfr_temp_4 < 0.0f ? -1 : 1);
                                                                                                                }
                                                                                                                if (var2_8 != null) break block55;
                                                                                                                if (v13 > 0) break block56;
                                                                                                                var40_34 = new Color(219, 201, 106).getRGB();
                                                                                                                if (var2_8 == null) break block52;
                                                                                                            }
                                                                                                            v13 = (cfr_temp_5 = var42_36 - 16.0f) == 0.0f ? 0 : (cfr_temp_5 < 0.0f ? -1 : 1);
                                                                                                        }
                                                                                                        if (var2_8 != null) break block52;
                                                                                                        if (v13 > 0) break block57;
                                                                                                        var40_34 = new Color(117, 231, 85).getRGB();
                                                                                                        if (var2_8 == null) break block52;
                                                                                                    }
                                                                                                    v13 = var40_34 = (float)new Color(44, 186, 19).getRGB();
                                                                                                }
                                                                                                if (var41_35 == null) break block42;
                                                                                                cfr_temp_6 = var42_36 - 0.0f;
                                                                                                v14 = cfr_temp_6 == 0.0f ? 0 : (cfr_temp_6 > 0.0f ? 1 : -1);
                                                                                                if (var2_8 != null) break block58;
                                                                                                if (v14 <= 0) break block42;
                                                                                                v14 = (float)var39_33;
                                                                                            }
                                                                                            if (var2_8 != null) break block59;
                                                                                            if (v14 == false) break block60;
                                                                                            v14 = (float)this.o.l();
                                                                                            if (var2_8 != null) break block59;
                                                                                            if (v14 == false) break block60;
                                                                                            h.c(var42_36, 0.0f, 20.0f);
                                                                                            dJ.b(var31_26 - 4.5, var33_29 - 0.699999988079071, var31_26 - 1.0, var37_32 + 0.30000001192092896, new Color(0, 0, 0, 255).getRGB());
                                                                                            cfr_temp_7 = var42_36 - 0.0f;
                                                                                            v14 = cfr_temp_7 == 0.0f ? 0 : (cfr_temp_7 > 0.0f ? 1 : -1);
                                                                                            if (var2_8 != null) break block59;
                                                                                            if (v14 > 0) {
                                                                                                if (cE.c.s.o(var17_16) <= 8.0f) {
                                                                                                    cfr_temp_8 = ((B)var17_16).V() - 18.0f;
                                                                                                    v15 = cfr_temp_8 == 0.0f ? 0 : (cfr_temp_8 < 0.0f ? -1 : 1);
                                                                                                    if (var2_8 == null) {
                                                                                                        v15 = v15 < 0 ? (float)5 : (float)false;
                                                                                                    }
                                                                                                    dJ.b(var31_26 - 3.5, var37_32, var31_26 - 2.0, var37_32 - var46_39 - (double)v15, new Color(255, 0, 0).getRGB());
                                                                                                }
                                                                                                dJ.b(var31_26 - 3.5, var37_32, var31_26 - 2.0, var37_32 - var46_39, (int)var40_34);
                                                                                            }
                                                                                        }
                                                                                        v14 = (float)var39_33;
                                                                                    }
                                                                                    if (var2_8 != null) break block61;
                                                                                    if (v14 == false) break block62;
                                                                                    v14 = (float)this.t.l();
                                                                                    if (var2_8 != null) break block61;
                                                                                    if (v14 == false) break block62;
                                                                                    v14 = (float)cj.b.i.a(cH.class).i();
                                                                                    if (var2_8 != null) break block61;
                                                                                    if (v14 != false) break block62;
                                                                                    var48_40 = 20.0f;
                                                                                    var49_42 = var17_16.g();
                                                                                    v16 = cj.b.i.a(ch.class).i();
                                                                                    if (var2_8 != null) break block63;
                                                                                    if (!v16) break block64;
                                                                                    v16 = ch.l.l();
                                                                                }
                                                                                if (v16) {
                                                                                    var49_42 = "Protected";
                                                                                }
                                                                            }
                                                                            var50_44 = (var35_31 - var31_26) / 2.0;
                                                                            var52_46 = (float)cE.c.ax.b(var49_42 + " \u00a77" + (int)cE.c.s.o(var17_16) + "m") * var12_11;
                                                                            var54_50 = (float)((var31_26 + var50_44 - var52_46 / 2.0) * (double)var13_12);
                                                                            var55_54 = (float)(var33_29 * (double)var13_12) - var48_40;
                                                                            GL11.glPushMatrix();
                                                                            net.minecraft.client.a.v.d(var12_11, var12_11, var12_11);
                                                                            gu.a(var49_42, cE.c.a6, var54_50 + 5.0f, var55_54 + 5.0f, -1);
                                                                            GL11.glPopMatrix();
                                                                        }
                                                                        v14 = (float)var39_33;
                                                                    }
                                                                    if (var2_8 != null) break block65;
                                                                    if (v14 == false) break block42;
                                                                    v14 = (float)this.q.l();
                                                                }
                                                                if (var2_8 != null) break block66;
                                                                if (v14 == false) break block42;
                                                                v17 = var17_16;
                                                                if (var2_8 != null) break block67;
                                                                v14 = (float)(v17 instanceof j);
                                                            }
                                                            if (v14 == false) break block42;
                                                            v17 = var17_16;
                                                        }
                                                        var48_41 = (j)v17;
                                                        var49_43 = (var37_32 - var33_29) / 4.0;
                                                        var51_45 = var48_41.l(4);
                                                        if (!(cE.c.s.o(var48_41) <= 15.0f)) break block42;
                                                        v18 = var51_45;
                                                        if (var2_8 == null) {
                                                            if (v18 != null) {
                                                                var52_46 = var33_29 + var49_43 - 1.0 - (var33_29 + 2.0);
                                                                var54_51 = 1.0 - (double)var51_45.u() / (double)var51_45.E();
                                                                dJ.a(var51_45, (int)var35_31 + 4, (int)var33_29 + (int)var49_43 - 1 - (int)(var52_46 / 2.0) - 18);
                                                            }
                                                            v18 = var48_41.l(3);
                                                        }
                                                        v19 = var52_47 = v18;
                                                        if (var2_8 != null) break block68;
                                                        if (v19 == null) break block69;
                                                        var53_49 = var33_29 + var49_43 * 2.0 - (var33_29 + var49_43 + 2.0);
                                                        v20 = var51_45.g().equalsIgnoreCase("Air");
                                                        if (var2_8 != null) break block70;
                                                        if (!v20) break block71;
                                                        v21 = "0";
                                                        break block72;
                                                    }
                                                    v22 = var52_47;
                                                    if (var2_8 != null) ** GOTO lbl249
                                                    v20 = v22.w() instanceof m;
                                                }
                                                if (!v20) {
                                                    v22 = var52_47;
lbl249:
                                                    // 2 sources

                                                    v21 = v22.g();
                                                } else {
                                                    v21 = var52_47.E() - var52_47.u() + "";
                                                }
                                            }
                                            var55_55 = v21;
                                            v23 = cE.c.s;
                                            if (var2_8 != null) break block73;
                                            if (v23.o(var48_41) < 10.0f) {
                                                dJ.a(var52_47, (int)var35_31 + 4, (int)(var33_29 + var49_43 * 2.0) - (int)(var53_49 / 2.0) - 18);
                                            }
                                        }
                                        v23 = var48_41;
                                    }
                                    v19 = v23.l(2);
                                }
                                v24 = var53_48 = v19;
                                if (var2_8 != null) break block74;
                                if (v24 == null) break block75;
                                var54_52 = var33_29 + var49_43 * 3.0 - (var33_29 + var49_43 * 2.0 + 2.0);
                                v25 = cE.c.s;
                                if (var2_8 != null) break block76;
                                if (v25.o(var48_41) < 10.0f) {
                                    dJ.a(var53_48, (int)var35_31 + 4, (int)(var33_29 + var49_43 * 3.0) - (int)(var54_52 / 2.0) - 18);
                                }
                            }
                            v25 = var48_41;
                        }
                        v24 = v25.l(1);
                    }
                    var54_53 = v24;
                    var55_56 = var33_29 + var49_43 * 4.0 - (var33_29 + var49_43 * 3.0 + 2.0);
                    if (cE.c.s.o(var48_41) < 10.0f) {
                        dJ.a(var54_53, (int)var35_31 + 4, (int)(var33_29 + var49_43 * 4.0) - (int)(var55_56 / 2.0) - 18);
                    }
                }
                if (var2_8 == null) continue;
            }
            GL11.glPopMatrix();
            v3 = 2929;
        }
        GL11.glEnable((int)v3);
        net.minecraft.client.a.v.a();
        var15_14.j();
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @cL
    public void a(dS dS2) {
        block5: {
            String[] arrstring = C.f();
            if (!this.i()) {
                return;
            }
            Color color = new Color(this.u.o());
            Color color2 = new Color(color.getRed(), color.getGreen(), color.getBlue(), 255);
            if (!this.r.l()) break block5;
            for (net.minecraft.U.x x2 : cE.c.e.O) {
                block7: {
                    int n2;
                    block8: {
                        block9: {
                            block6: {
                                n2 = x2 instanceof t;
                                if (arrstring != null) break block6;
                                if (n2 == 0) break block7;
                                n2 = this.v.l();
                            }
                            if (arrstring != null) break block8;
                            if (n2 != 0) break block9;
                            net.minecraft.client.a.v.b((float)color2.getRed() / 255.0f, (float)color2.getGreen() / 255.0f, (float)color2.getBlue() / 255.0f, 0.3f);
                            dJ.a(x2, (float)color2.getRed() / 255.0f, (float)color2.getGreen() / 255.0f, (float)color2.getBlue() / 255.0f, (float)color2.getAlpha() / 255.0f);
                            if (arrstring == null) break block7;
                        }
                        dJ.a(x2, (float)cj.h().getRed() / 255.0f, (float)cj.h().getGreen() / 255.0f, (float)cj.h().getBlue() / 255.0f, (float)cj.h().getAlpha() / 255.0f);
                        n2 = cj.h().getRed();
                    }
                    net.minecraft.client.a.v.b((float)n2 / 255.0f, (float)cj.h().getGreen() / 255.0f, (float)cj.h().getBlue() / 255.0f, 0.3f);
                }
                if (arrstring == null) continue;
            }
        }
    }

    public cE() {
        block0: {
            super("ESP", a5.Visuals);
            this.p = aZ.b(16);
            this.s = aZ.e(16);
            String[] arrstring = C.f();
            this.l = aZ.e(16);
            this.k = aZ.e(4);
            this.m = new Color(0, 0, 0, 120).getRGB();
            this.n = Color.BLACK.getRGB();
            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList.add("CSGO");
            arrayList.add("None");
            cj.b.f.b(new hH("ESP Mode", (bE)this, "CSGO", arrayList));
            this.o = new hH("Health Rect", this, true);
            cj.b.f.b(this.o);
            String[] arrstring2 = arrstring;
            this.q = new hH("Render Armor", this, true);
            cj.b.f.b(this.q);
            this.t = new hH("Render Tags", this, true);
            cj.b.f.b(this.t);
            this.r = new hH("Item ESP", this, false);
            cj.b.f.b(this.r);
            this.w = new hH("ESP Color", (bE)this, new Color(0xFFFFFF).getRGB(), true);
            cj.b.f.b(this.w);
            this.u = new hH("Item ESP Color", (bE)this, new Color(0xFFFFFF).getRGB(), true);
            cj.b.f.b(this.u);
            this.v = new hH("Client Color", this, false);
            cj.b.f.b(this.v);
            if (!net.minecraft.k.m.c()) break block0;
            C.a(new String[5]);
        }
    }

    @cL
    public void a(f0 f02) {
        String[] arrstring = C.f();
        if (arrstring == null) {
            if (!this.i()) {
                return;
            }
            f02.a(this.t.l());
        }
    }

    private q a(int n2, double d10, double d11, double d12) {
        GL11.glGetFloat((int)2982, (FloatBuffer)this.s);
        GL11.glGetFloat((int)2983, (FloatBuffer)this.l);
        GL11.glGetInteger((int)2978, (IntBuffer)this.p);
        if (GLU.gluProject((float)((float)d10), (float)((float)d11), (float)((float)d12), (FloatBuffer)this.s, (FloatBuffer)this.l, (IntBuffer)this.p, (FloatBuffer)this.k)) {
            return new q(this.k.get(0) / (float)n2, ((float)Display.getHeight() - this.k.get(1)) / (float)n2, this.k.get(2));
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean a(net.minecraft.U.x var1_1) {
        var2_2 = C.f();
        v0 = cE.c.ac.L;
        if (var2_2 == null) {
            if (!v0) {
                v1 = var1_1;
                if (var2_2 == null) {
                    if (v1 == cE.c.s) {
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v1 = var1_1;
            }
            v0 = (boolean)(v1.P ? 1 : 0);
        }
        if (var2_2 == null) {
            if (v0) {
                return false;
            }
            v0 = var1_1 instanceof C;
        }
        if (var2_2 == null) {
            if (v0) {
                return false;
            }
            v0 = var1_1 instanceof j;
        }
        if (var2_2 == null) {
            if (v0) {
                return true;
            }
            v0 = var1_1 instanceof n;
        }
        if (var2_2 == null) {
            if (v0) {
                return false;
            }
            v0 = var1_1 instanceof net.minecraft.ag.u;
        }
        if (var2_2 == null) {
            if (v0) {
                return false;
            }
            v0 = var1_1 instanceof net.minecraft.J.l;
        }
        if (var2_2 == null) {
            if (v0) {
                return false;
            }
            v0 = var1_1 instanceof f;
        }
        if (var2_2 != null) return v0;
        if (v0 != false) return false;
        v2 = var1_1 instanceof g;
        if (var2_2 == null) {
            if (v2) {
                return false;
            }
            v2 = var1_1 instanceof u;
        }
        if (var2_2 == null) {
            if (v2) {
                return false;
            }
            v2 = var1_1 instanceof o;
        }
        if (var2_2 == null) {
            if (v2) {
                return false;
            }
            v2 = var1_1 instanceof net.minecraft.z.k;
        }
        if (var2_2 == null) {
            if (v2) {
                return false;
            }
            v2 = var1_1 instanceof E;
        }
        if (var2_2 == null) {
            if (v2) {
                return false;
            }
            v2 = var1_1 instanceof x;
        }
        if (var2_2 == null) {
            if (v2) {
                return false;
            }
            v2 = var1_1 instanceof D;
        }
        if (var2_2 == null) {
            if (v2) {
                return false;
            }
            v2 = var1_1 instanceof net.minecraft.J.C;
        }
        if (var2_2 == null) {
            if (v2) {
                return false;
            }
            v2 = var1_1 instanceof W;
        }
        if (var2_2 == null) {
            if (v2) {
                return false;
            }
            v2 = var1_1 instanceof G;
        }
        if (var2_2 == null) {
            if (v2) {
                return false;
            }
            v2 = var1_1 instanceof b;
        }
        if (var2_2 == null) {
            if (v2) {
                return false;
            }
            v2 = var1_1 instanceof net.minecraft.z.t;
        }
        if (var2_2 == null) {
            if (v2) {
                return false;
            }
            v2 = var1_1 instanceof net.minecraft.U.x;
        }
        if (var2_2 == null) {
            if (v2) {
                return false;
            }
            v2 = var1_1 instanceof ae;
        }
        if (var2_2 != null) return v2;
        if (v2 != false) return false;
        v2 = var1_1 instanceof ai;
        if (var2_2 != null) return v2;
        if (v2 != false) return false;
        v2 = var1_1 instanceof d;
        if (var2_2 != null) return v2;
        if (v2 != false) return false;
        v3 = var1_1;
        if (var2_2 == null) {
            if (v3 instanceof a7) {
                return false;
            }
            v3 = var1_1;
        }
        if (v3 == cE.c.s) return false;
        return true;
    }
}

