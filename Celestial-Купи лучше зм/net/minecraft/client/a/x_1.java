/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.gson.JsonSyntaxException
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.GLContext
 *  org.lwjgl.util.glu.GLU
 *  org.lwjgl.util.glu.Project
 */
package net.minecraft.client.a;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.gson.JsonSyntaxException;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.nio.FloatBuffer;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.Random;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import net.minecraft.T.aR;
import net.minecraft.T.ah;
import net.minecraft.T.am;
import net.minecraft.U.B;
import net.minecraft.ag.C;
import net.minecraft.ah.t;
import net.minecraft.ar.Z;
import net.minecraft.ar.aH;
import net.minecraft.ar.aT;
import net.minecraft.ar.aV;
import net.minecraft.ar.ay;
import net.minecraft.ar.e;
import net.minecraft.at.g;
import net.minecraft.at.k;
import net.minecraft.ax.T;
import net.minecraft.c.f;
import net.minecraft.c.l;
import net.minecraft.client.D.h;
import net.minecraft.client.Q;
import net.minecraft.client.a.G;
import net.minecraft.client.a.I;
import net.minecraft.client.a.V;
import net.minecraft.client.a.W;
import net.minecraft.client.a.a0;
import net.minecraft.client.a.a1;
import net.minecraft.client.a.aF;
import net.minecraft.client.a.aZ;
import net.minecraft.client.a.ag;
import net.minecraft.client.a.an;
import net.minecraft.client.a.ap;
import net.minecraft.client.a.as;
import net.minecraft.client.a.o;
import net.minecraft.client.a.r;
import net.minecraft.client.a.v;
import net.minecraft.client.a.z;
import net.minecraft.client.b.L;
import net.minecraft.client.b.a5;
import net.minecraft.client.k.s;
import net.minecraft.client.l.c;
import net.minecraft.client.q.a;
import net.minecraft.client.x.d;
import net.minecraft.client.y.b;
import net.minecraft.k.i;
import net.minecraft.k.j;
import net.minecraft.k.n;
import net.minecraft.u.E;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.util.glu.Project;

public class x
implements net.minecraft.client.D.x {
    private /* synthetic */ float al;
    private /* synthetic */ float av;
    private /* synthetic */ boolean ap;
    private /* synthetic */ int J;
    private /* synthetic */ float C;
    private /* synthetic */ float I;
    private final /* synthetic */ net.minecraft.client.D.t i;
    private /* synthetic */ double af;
    private /* synthetic */ double ao;
    private final /* synthetic */ net.minecraft.ar.v R;
    private final /* synthetic */ net.minecraft.client.b.af t;
    private /* synthetic */ int ag;
    private /* synthetic */ int P;
    private final /* synthetic */ double N = 1.0;
    private /* synthetic */ int A;
    private static final /* synthetic */ net.minecraft.ar.v[] aw;
    private /* synthetic */ int aj;
    private /* synthetic */ long V;
    public static final /* synthetic */ int at;
    private /* synthetic */ long B;
    private /* synthetic */ float G;
    private /* synthetic */ boolean Y;
    private final /* synthetic */ float[] aa;
    public /* synthetic */ float ah;
    private /* synthetic */ float as;
    private /* synthetic */ float v;
    private /* synthetic */ float aq;
    private final /* synthetic */ net.minecraft.client.s.d[] Q;
    public static /* synthetic */ int u;
    private final /* synthetic */ FloatBuffer g;
    private /* synthetic */ boolean e;
    private final /* synthetic */ boolean D = true;
    private final /* synthetic */ Q o;
    private /* synthetic */ boolean z;
    private final /* synthetic */ Random M;
    private /* synthetic */ float ak;
    private /* synthetic */ float a;
    public static /* synthetic */ boolean S;
    public /* synthetic */ boolean an;
    private /* synthetic */ float X;
    private /* synthetic */ float r;
    private /* synthetic */ aV Z;
    private static final /* synthetic */ Logger ae;
    private /* synthetic */ float k;
    private /* synthetic */ net.minecraft.ah.z au;
    private final /* synthetic */ int[] b;
    private /* synthetic */ net.minecraft.U.x O;
    private /* synthetic */ float H;
    private /* synthetic */ float s;
    private /* synthetic */ aV ax;
    private final /* synthetic */ boolean l = true;
    private /* synthetic */ float x;
    private /* synthetic */ float q;
    public /* synthetic */ float L;
    private /* synthetic */ boolean E;
    public /* synthetic */ float am;
    private static final /* synthetic */ net.minecraft.ar.v ar;
    public /* synthetic */ int m;
    private /* synthetic */ boolean c;
    private /* synthetic */ float W;
    private /* synthetic */ float K;
    private /* synthetic */ long ab;
    private /* synthetic */ int f;
    private final /* synthetic */ net.minecraft.client.j.f j;
    private final /* synthetic */ float w = 4.0f;
    private /* synthetic */ double n;
    private /* synthetic */ int ac;
    private /* synthetic */ float T;
    private final /* synthetic */ float[] p;
    private /* synthetic */ int h;
    private /* synthetic */ net.minecraft.w.d y;
    private static final /* synthetic */ net.minecraft.ar.v d;
    public /* synthetic */ z U;
    private /* synthetic */ long F;
    public /* synthetic */ net.minecraft.client.s.d ai;
    private /* synthetic */ long ad;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void d(float var1_1) {
        block41: {
            block42: {
                block45: {
                    block46: {
                        block39: {
                            block40: {
                                block44: {
                                    block43: {
                                        block27: {
                                            block28: {
                                                block33: {
                                                    block36: {
                                                        block24: {
                                                            block35: {
                                                                block34: {
                                                                    block32: {
                                                                        block25: {
                                                                            block26: {
                                                                                block31: {
                                                                                    block30: {
                                                                                        block29: {
                                                                                            var3_2 = this.o.Z();
                                                                                            var4_3 = var3_2.l();
                                                                                            var5_4 = var3_2.N + (var3_2.a - var3_2.N) * (double)var1_1;
                                                                                            var7_5 = var3_2.L + (var3_2.aF - var3_2.L) * (double)var1_1 + (double)var4_3;
                                                                                            var2_6 = net.minecraft.client.a.I.j();
                                                                                            var9_7 = var3_2.k + (var3_2.ax - var3_2.k) * (double)var1_1;
                                                                                            v0 = var3_2 instanceof B;
                                                                                            if (var2_6 != null) break block25;
                                                                                            if (v0 == 0) break block26;
                                                                                            v0 = ((B)var3_2).as() ? 1 : 0;
                                                                                            if (var2_6 != null) break block25;
                                                                                            if (v0 == 0) break block26;
                                                                                            var4_3 = (float)((double)var4_3 + 1.0);
                                                                                            net.minecraft.client.a.v.b(0.0f, 0.3f, 0.0f);
                                                                                            v1 = this.o.ac.ba;
                                                                                            if (var2_6 != null) break block27;
                                                                                            if (v1) break block28;
                                                                                            var11_8 = new n(var3_2);
                                                                                            var12_11 = this.o.e.d((n)var11_8);
                                                                                            var13_13 = var12_11.b();
                                                                                            v2 = cq.bP;
                                                                                            if (var2_6 != null) break block29;
                                                                                            if (!v2.b()) break block30;
                                                                                            v2 = cq.bP;
                                                                                        }
                                                                                        cq.e(v2, new Object[]{this.o.e, var11_8, var12_11, var3_2});
                                                                                        if (var2_6 == null) break block31;
                                                                                    }
                                                                                    if (var13_13 == net.minecraft.u.g.R) {
                                                                                        var14_16 = var12_11.b(net.minecraft.W.bn.z).k();
                                                                                        net.minecraft.client.a.v.a((float)(var14_16 * 90), 0.0f, 1.0f, 0.0f);
                                                                                    }
                                                                                }
                                                                                net.minecraft.client.a.v.a(var3_2.ak + (var3_2.e - var3_2.ak) * var1_1 + 180.0f, 0.0f, -1.0f, 0.0f);
                                                                                net.minecraft.client.a.v.a(var3_2.E + (var3_2.at - var3_2.E) * var1_1, -1.0f, 0.0f, 0.0f);
                                                                                if (var2_6 == null) break block28;
                                                                            }
                                                                            v0 = this.o.ac.L;
                                                                        }
                                                                        if (var2_6 != null) break block32;
                                                                        if (v0 <= 0) break block33;
                                                                        this.ao += 1.0 * net.minecraft.client.Q.o / 200.0;
                                                                        cfr_temp_0 = this.ao - (double)this.T;
                                                                        v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                                                    }
                                                                    if (var2_6 == null) {
                                                                        if (v0 >= 0) {
                                                                            this.ao = this.T;
                                                                        }
                                                                        v0 = cj.b.i.a(cw.class).i() ? 1 : 0;
                                                                    }
                                                                    if (var2_6 != null) ** GOTO lbl52
                                                                    if (v0 != 0) {
                                                                        v0 = cw.k.c();
lbl52:
                                                                        // 2 sources

                                                                        v3 = v0;
                                                                    } else {
                                                                        v3 = var11_9 = this.ao + (this.ao - this.ao) * (double)var1_1;
                                                                    }
                                                                    if (var2_6 != null) break block34;
                                                                    if (!this.o.ac.ba) break block35;
                                                                    net.minecraft.client.a.v.b(0.0f, 0.0f, (float)(-var11_9));
                                                                }
                                                                if (var2_6 == null) break block36;
                                                            }
                                                            var13_14 = var3_2.e;
                                                            var14_17 = var3_2.at;
                                                            if (this.o.ac.L == 2) {
                                                                var14_17 += 180.0f;
                                                            }
                                                            var15_20 = (double)(-net.minecraft.k.h.g(var13_14 * 0.017453292f) * net.minecraft.k.h.c(var14_17 * 0.017453292f)) * var11_9;
                                                            var17_22 = (double)(net.minecraft.k.h.c(var13_14 * 0.017453292f) * net.minecraft.k.h.c(var14_17 * 0.017453292f)) * var11_9;
                                                            var19_23 = (double)(-net.minecraft.k.h.g(var14_17 * 0.017453292f)) * var11_9;
                                                            var21_24 = 0;
                                                            while (var21_24 < 8) {
                                                                block37: {
                                                                    block38: {
                                                                        var22_25 = (var21_24 & 1) * 2 - 1;
                                                                        var23_26 = (var21_24 >> 1 & 1) * 2 - 1;
                                                                        var24_27 = (var21_24 >> 2 & 1) * 2 - 1;
                                                                        var22_25 *= 0.1f;
                                                                        var23_26 *= 0.1f;
                                                                        var24_27 *= 0.1f;
                                                                        if (var2_6 != null) break block37;
                                                                        v4 = cj.b.i.a(cw.class).i() ? 1 : 0;
                                                                        if (var2_6 != null) break block24;
                                                                        if (v4 != 0) break block38;
                                                                        var25_28 = this.o.e.a(new net.minecraft.k.l(var5_4 + (double)var22_25, var7_5 + (double)var23_26, var9_7 + (double)var24_27), new net.minecraft.k.l(var5_4 - var15_20 + (double)var22_25 + (double)var24_27, var7_5 - var19_23 + (double)var23_26, var9_7 - var17_22 + (double)var24_27));
                                                                        if (var2_6 != null) break block37;
                                                                        if (var25_28 == null) break block38;
                                                                        var26_29 = var25_28.c.d(new net.minecraft.k.l(var5_4, var7_5, var9_7));
                                                                        if (var2_6 != null) break block37;
                                                                        if (var26_29 < var11_9) {
                                                                            var11_9 = var26_29;
                                                                        }
                                                                    }
                                                                    ++var21_24;
                                                                }
                                                                if (var2_6 == null) continue;
                                                            }
                                                            v4 = this.o.ac.L;
                                                        }
                                                        if (v4 == 2) {
                                                            net.minecraft.client.a.v.a(180.0f, 0.0f, 1.0f, 0.0f);
                                                        }
                                                        net.minecraft.client.a.v.a(var3_2.at - var14_17, 1.0f, 0.0f, 0.0f);
                                                        net.minecraft.client.a.v.a(var3_2.e - var13_14, 0.0f, 1.0f, 0.0f);
                                                        net.minecraft.client.a.v.b(0.0f, 0.0f, (float)(-var11_9));
                                                        net.minecraft.client.a.v.a(var13_14 - var3_2.e, 0.0f, 1.0f, 0.0f);
                                                        net.minecraft.client.a.v.a(var14_17 - var3_2.at, 1.0f, 0.0f, 0.0f);
                                                    }
                                                    if (var2_6 == null) break block28;
                                                }
                                                net.minecraft.client.a.v.b(0.0f, 0.0f, 0.05f);
                                            }
                                            v1 = cq.cJ.b();
                                        }
                                        if (var2_6 != null) break block39;
                                        if (!v1) break block40;
                                        v5 = this;
                                        if (var2_6 != null) break block41;
                                        if (v5.o.ac.ba) break block42;
                                        var11_10 = var3_2.ak + (var3_2.e - var3_2.ak) * var1_1 + 180.0f;
                                        var12_12 = var3_2.E + (var3_2.at - var3_2.E) * var1_1;
                                        var13_15 = 0.0f;
                                        v6 = var3_2;
                                        if (var2_6 != null) break block43;
                                        if (!(v6 instanceof C)) break block44;
                                        v6 = var3_2;
                                    }
                                    var14_18 = (C)v6;
                                    var11_10 = var14_18.bh + (var14_18.a1 - var14_18.bh) * var1_1 + 180.0f;
                                }
                                var14_19 = net.minecraft.client.a.an.a(this.o.e, var3_2, var1_1);
                                var15_21 = cq.a(cq.cJ, new Object[]{this, var3_2, var14_19, Float.valueOf(var1_1), Float.valueOf(var11_10), Float.valueOf(var12_12), Float.valueOf(var13_15)});
                                cq.a(var15_21);
                                var13_15 = cq.a(var15_21, cq.c1, new Object[0]);
                                var12_12 = cq.a(var15_21, cq.ch, new Object[0]);
                                var11_10 = cq.a(var15_21, cq.u, new Object[0]);
                                net.minecraft.client.a.v.a(var13_15, 0.0f, 0.0f, 1.0f);
                                net.minecraft.client.a.v.a(var12_12, 1.0f, 0.0f, 0.0f);
                                net.minecraft.client.a.v.a(var11_10, 0.0f, 1.0f, 0.0f);
                                if (var2_6 == null) break block42;
                            }
                            v5 = this;
                            if (var2_6 != null) break block41;
                            v1 = v5.o.ac.ba;
                        }
                        if (v1) break block42;
                        net.minecraft.client.a.v.a(var3_2.E + (var3_2.at - var3_2.E) * var1_1, 1.0f, 0.0f, 0.0f);
                        v7 = var3_2;
                        if (var2_6 != null) break block45;
                        if (!(v7 instanceof C)) break block46;
                        var11_8 = (C)var3_2;
                        net.minecraft.client.a.v.a(var11_8.bh + (var11_8.a1 - var11_8.bh) * var1_1 + 180.0f, 0.0f, 1.0f, 0.0f);
                        if (var2_6 == null) break block42;
                    }
                    v7 = var3_2;
                }
                net.minecraft.client.a.v.a(v7.ak + (var3_2.e - var3_2.ak) * var1_1 + 180.0f, 0.0f, 1.0f, 0.0f);
            }
            net.minecraft.client.a.v.b(0.0f, -var4_3, 0.0f);
            var5_4 = var3_2.N + (var3_2.a - var3_2.N) * (double)var1_1;
            var7_5 = var3_2.L + (var3_2.aF - var3_2.L) * (double)var1_1 + (double)var4_3;
            var9_7 = var3_2.k + (var3_2.ax - var3_2.k) * (double)var1_1;
            v5 = this;
        }
        v5.z = this.o.a2.a(var5_4, var7_5, var9_7, var1_1);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void a(net.minecraft.U.x var1_1, double var2_2, net.minecraft.client.G.b var4_3, boolean var5_4) {
        var7_5 = fU.ao();
        var8_6 = var7_5.m();
        var9_7 = System.currentTimeMillis();
        var6_8 = net.minecraft.client.a.I.j();
        fU.b("Loading visible chunks");
        var11_9 = System.currentTimeMillis() + 5000L;
        var13_10 = 0;
        var14_11 = 0;
        block0: while (true) {
            var14_11 = 0;
            for (var15_12 = 0; var15_12 < 100; ++var15_12) {
                var7_5.V = true;
                var7_5.a(var1_1, var2_2, var4_3, this.m++, var5_4);
                v0 = var7_5.p() ? 1 : 0;
                if (var6_8 == null) {
                    if (var6_8 == null) {
                        if (v0 == 0) {
                            var14_11 = 1;
                        }
                        var7_5.a(System.nanoTime() + 1000000000L);
                        v1 = (var13_10 += var7_5.j()) - var7_5.j();
                    }
                    var13_10 = v1;
                    if (var6_8 == null) continue;
                }
                ** GOTO lbl26
            }
            do {
                v0 = var7_5.m();
lbl26:
                // 2 sources

                if (var6_8 == null) {
                    if (v0 != var8_6) {
                        var14_11 = 1;
                        var8_6 = var7_5.m();
                    }
                    v0 = (cfr_temp_0 = System.currentTimeMillis() - var11_9) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                }
                if (var6_8 == null) {
                    if (v0 > 0) {
                        fU.e("Chunks loaded: " + var13_10);
                        var11_9 = System.currentTimeMillis() + 5000L;
                    }
                    v0 = var14_11;
                }
                if (v0 != 0) continue block0;
            } while (var6_8 != null);
            break;
        }
        fU.e("Chunks loaded: " + var13_10);
        fU.e("Finished loading visible chunks");
        net.minecraft.client.k.s.w = 0;
    }

    private void a(float f10) {
        block3: {
            net.minecraft.U.x x2;
            block2: {
                String string = net.minecraft.client.a.I.j();
                x2 = this.o.Z();
                if (string != null) break block2;
                if (!(x2 instanceof net.minecraft.i.j)) break block3;
                x2 = this.o.Z();
            }
            net.minecraft.i.j j2 = (net.minecraft.i.j)x2;
            float f11 = j2.as - j2.Y;
            float f12 = -(j2.as + f11 * f10);
            float f13 = j2.bZ + (j2.b9 - j2.bZ) * f10;
            float f14 = j2.bt + (j2.bF - j2.bt) * f10;
            net.minecraft.client.a.v.b(net.minecraft.k.h.g(f12 * (float)Math.PI) * f13 * 0.5f, -Math.abs(net.minecraft.k.h.c(f12 * (float)Math.PI) * f13), 0.0f);
            net.minecraft.client.a.v.a(net.minecraft.k.h.g(f12 * (float)Math.PI) * f13 * 3.0f, 0.0f, 0.0f, 1.0f);
            net.minecraft.client.a.v.a(Math.abs(net.minecraft.k.h.c(f12 * (float)Math.PI - 0.2f) * f13) * 5.0f, 1.0f, 0.0f, 0.0f);
            net.minecraft.client.a.v.a(f14, 1.0f, 0.0f, 0.0f);
        }
    }

    public void r() {
        this.y = null;
        this.t.b();
    }

    private void a(aF aF2, float f10, int n2, double d10, double d11, double d12) {
        block3: {
            int n3;
            block5: {
                String string;
                block4: {
                    block2: {
                        string = net.minecraft.client.a.I.j();
                        n3 = this.o.ac.bf;
                        if (string != null) break block2;
                        if (n3 < 4) break block3;
                        n3 = fU.d() ? 1 : 0;
                    }
                    if (string != null) break block4;
                    if (n3 != 0) break block3;
                    n3 = cS.a(this.o.ac) ? 1 : 0;
                }
                if (string != null) break block5;
                if (n3 == 0) break block3;
                this.o.an.a("clouds");
                net.minecraft.client.a.v.q(5889);
                net.minecraft.client.a.v.l();
                Project.gluPerspective((float)this.a(f10, true), (float)((float)this.o.P / (float)this.o.aT), (float)0.05f, (float)(this.X * 4.0f));
                net.minecraft.client.a.v.q(5888);
                net.minecraft.client.a.v.M();
                this.a(0, f10);
                aF2.b(f10, n2, d10, d11, d12);
                net.minecraft.client.a.v.C();
                net.minecraft.client.a.v.B();
                net.minecraft.client.a.v.q(5889);
                net.minecraft.client.a.v.l();
                Project.gluPerspective((float)this.a(f10, true), (float)((float)this.o.P / (float)this.o.aT), (float)0.05f, (float)this.X);
                n3 = 5888;
            }
            net.minecraft.client.a.v.q(n3);
        }
    }

    public void a(boolean n2) {
        block4: {
            int n3;
            block2: {
                block3: {
                    String string = net.minecraft.client.a.I.j();
                    n3 = n2;
                    if (string != null) break block2;
                    if (n3 == 0) break block3;
                    net.minecraft.client.a.v.c(2918, this.a(0.0f, 0.0f, 0.0f, 1.0f));
                    if (string == null) break block4;
                }
                n3 = 2918;
            }
            net.minecraft.client.a.v.c(n3, this.a(this.am, this.ah, this.L, 1.0f));
        }
    }

    public void f() {
        block0: {
            net.minecraft.client.a.v.u(net.minecraft.client.a.as.p);
            net.minecraft.client.a.v.q(5890);
            net.minecraft.client.a.v.l();
            float f10 = 0.00390625f;
            net.minecraft.client.a.v.d(0.00390625f, 0.00390625f, 0.00390625f);
            net.minecraft.client.a.v.b(8.0f, 8.0f, 8.0f);
            net.minecraft.client.a.v.q(5888);
            this.o.aN().b(this.R);
            net.minecraft.client.a.v.c(3553, 10241, 9729);
            net.minecraft.client.a.v.c(3553, 10240, 9729);
            net.minecraft.client.a.v.c(3553, 10242, 10496);
            net.minecraft.client.a.v.c(3553, 10243, 10496);
            net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
            net.minecraft.client.a.v.x();
            net.minecraft.client.a.v.u(net.minecraft.client.a.as.U);
            if (!fU.ag()) break block0;
            cS.U();
        }
    }

    /*
     * Exception decompiling
     */
    public void a(float var1_1, int var2_2, boolean var3_3, boolean var4_4, boolean var5_5) {
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

    private void p() {
        this.x = (float)((double)this.x + (Math.random() - Math.random()) * Math.random() * Math.random());
        this.x = (float)((double)this.x * 0.9);
        this.q += this.x - this.q;
        this.ap = true;
    }

    public x(Q q2, net.minecraft.client.D.t t2) {
        this.M = new Random();
        this.ax = new aV();
        this.Z = new aV();
        this.w = 4.0f;
        this.T = 4.0f;
        this.D = true;
        this.l = true;
        this.ab = net.minecraft.client.Q.aj();
        this.aa = new float[1024];
        this.p = new float[1024];
        this.g = aZ.e(16);
        this.N = 1.0;
        this.c = false;
        this.au = null;
        this.an = false;
        this.X = 128.0f;
        this.V = 0L;
        this.ag = 0;
        this.J = 0;
        this.A = 0;
        this.a = 0.0f;
        this.aq = 0.0f;
        String string = net.minecraft.client.a.I.j();
        this.F = 0L;
        this.Q = new net.minecraft.client.s.d[10];
        this.E = false;
        this.aj = at;
        this.o = q2;
        this.i = t2;
        this.U = q2.X();
        this.t = new net.minecraft.client.b.af(q2.aN());
        this.j = new net.minecraft.client.j.f(16, 16);
        this.R = q2.aN().a("lightMap", this.j);
        this.b = this.j.a();
        this.ai = null;
        int n2 = 0;
        while (n2 < 32) {
            block3: {
                for (int i2 = 0; i2 < 32; ++i2) {
                    float f10 = i2 - 16;
                    float f11 = n2 - 16;
                    float f12 = net.minecraft.k.h.a(f10 * f10 + f11 * f11);
                    this.aa[n2 << 5 | i2] = -f11 / f12;
                    this.p[n2 << 5 | i2] = f10 / f12;
                    if (string == null) {
                        if (string == null) continue;
                    }
                    break block3;
                }
                ++n2;
            }
            if (string == null) continue;
        }
    }

    public void a(@Nullable net.minecraft.U.x x2) {
        block6: {
            Object object;
            boolean bl2;
            block11: {
                String string;
                block12: {
                    block9: {
                        block10: {
                            block7: {
                                block8: {
                                    string = net.minecraft.client.a.I.j();
                                    if (!net.minecraft.client.a.as.m) break block6;
                                    x x3 = this;
                                    if (string == null) {
                                        if (x3.ai != null) {
                                            this.ai.c();
                                        }
                                        x3 = this;
                                    }
                                    x3.ai = null;
                                    bl2 = x2 instanceof aR;
                                    if (string != null) break block7;
                                    if (!bl2) break block8;
                                    this.a(new net.minecraft.ar.v("shaders/post/creeper.json"));
                                    if (string == null) break block6;
                                }
                                bl2 = x2 instanceof am;
                            }
                            if (string != null) break block9;
                            if (!bl2) break block10;
                            this.a(new net.minecraft.ar.v("shaders/post/spider.json"));
                            if (string == null) break block6;
                        }
                        bl2 = x2 instanceof ah;
                    }
                    if (string != null) break block11;
                    if (!bl2) break block12;
                    this.a(new net.minecraft.ar.v("shaders/post/invert.json"));
                    if (string == null) break block6;
                }
                object = cq.s;
                if (string != null) break block6;
                bl2 = ((ak)object).b();
            }
            if (bl2) {
                object = cq.d(cq.s, x2, this);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private float a(float f10, boolean n2) {
        float f11;
        Object object;
        float f12;
        net.minecraft.U.x x2;
        String string;
        block30: {
            int n3;
            block31: {
                block29: {
                    block27: {
                        block28: {
                            block25: {
                                block26: {
                                    int n4;
                                    block24: {
                                        Q q2;
                                        block23: {
                                            int n5;
                                            block21: {
                                                block22: {
                                                    string = net.minecraft.client.a.I.j();
                                                    x x3 = this;
                                                    if (string == null) {
                                                        if (x3.e) {
                                                            return 90.0f;
                                                        }
                                                        x3 = this;
                                                    }
                                                    x2 = x3.o.Z();
                                                    f12 = 70.0f;
                                                    n5 = n2;
                                                    if (string != null) break block21;
                                                    if (n5 == 0) break block22;
                                                    f12 = this.o.ac.bR;
                                                    n5 = fU.bm() ? 1 : 0;
                                                    if (string != null) break block21;
                                                    if (n5 != 0) {
                                                        f12 *= this.K + (this.as - this.K) * f10;
                                                    }
                                                }
                                                n5 = 0;
                                            }
                                            n4 = n5;
                                            q2 = this.o;
                                            if (string != null) break block23;
                                            if (q2.aO != null) break block24;
                                            q2 = this.o;
                                        }
                                        object = q2.ac;
                                        n4 = net.minecraft.client.l.c.a(this.o.ac.ax) ? 1 : 0;
                                    }
                                    n3 = n4;
                                    if (string != null) break block25;
                                    if (n3 == 0) break block26;
                                    n3 = fU.q ? 1 : 0;
                                    if (string == null) {
                                        if (n3 == 0) {
                                            fU.q = true;
                                            this.o.ac.d = true;
                                            this.o.a2.V = true;
                                        }
                                        n3 = fU.q ? 1 : 0;
                                    }
                                    if (string != null) break block27;
                                    if (n3 == 0) break block28;
                                    f12 /= 4.0f;
                                    if (string == null) break block28;
                                }
                                n3 = fU.q ? 1 : 0;
                            }
                            if (string != null) break block27;
                            if (n3 != 0) {
                                fU.q = false;
                                this.o.ac.d = false;
                                this.ax = new aV();
                                this.Z = new aV();
                                this.o.a2.V = true;
                            }
                        }
                        n3 = x2 instanceof B;
                    }
                    if (string != null) break block29;
                    if (n3 == 0) break block30;
                    float f13 = ((B)x2).V() - 0.0f;
                    n3 = f13 == 0.0f ? 0 : (f13 < 0.0f ? -1 : 1);
                }
                if (string != null) break block31;
                if (n3 > 0) break block30;
                n3 = ((B)x2).a2;
            }
            float f14 = (float)n3 + f10;
            f12 /= (1.0f - 500.0f / (f14 + 500.0f)) * 2.0f + 1.0f;
        }
        if ((object = net.minecraft.client.a.an.a(this.o.e, x2, f10)).o() == net.minecraft.ac.c.L) {
            f12 = f12 * 60.0f / 70.0f;
        }
        ak ak2 = cq.a4;
        if (string == null) {
            if (!ak2.b()) {
                f11 = f12;
                return f11;
            }
            ak2 = cq.a4;
        }
        f11 = cq.f(ak2, this, x2, object, Float.valueOf(f10), Float.valueOf(f12));
        return f11;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected void h(float var1_1) {
        block35: {
            var2_2 = net.minecraft.client.a.I.j();
            if (cq.bK.b()) {
                v0 = this.o.e;
                if (var2_2 == null) {
                    var3_3 = v0.D;
                    var4_5 = cq.d(var3_3, cq.bK, new Object[0]);
                    if (var4_5 != null) {
                        cq.b(var4_5, cq.bh, new Object[]{Float.valueOf(var1_1), this.o.e, this.o});
                        return;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = this.o.e;
            }
            var3_4 = v0.a(var1_1);
            cfr_temp_0 = var3_4 - 0.0f;
            v1 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
            if (var2_2 == null) {
                if (v1 <= 0) return;
                v1 = (float)fU.W();
            }
            if (v1 != false) {
                return;
            }
            this.f();
            var4_5 = this.o.Z();
            var5_6 = this.o.e;
            var6_7 = net.minecraft.k.h.f(var4_5.a);
            var7_8 = net.minecraft.k.h.f(var4_5.aF);
            var8_9 = net.minecraft.k.h.f(var4_5.ax);
            var9_10 = net.minecraft.client.a.W.c();
            var10_11 = var9_10.b();
            net.minecraft.client.a.v.E();
            net.minecraft.client.a.v.a(0.0f, 1.0f, 0.0f);
            net.minecraft.client.a.v.a();
            net.minecraft.client.a.v.a(net.minecraft.client.a.o.SRC_ALPHA, net.minecraft.client.a.G.ONE_MINUS_SRC_ALPHA, net.minecraft.client.a.o.ONE, net.minecraft.client.a.G.ZERO);
            net.minecraft.client.a.v.a(516, 0.1f);
            var11_12 = var4_5.am + (var4_5.a - var4_5.am) * (double)var1_1;
            var13_13 = var4_5.af + (var4_5.aF - var4_5.af) * (double)var1_1;
            var15_14 = var4_5.n + (var4_5.ax - var4_5.n) * (double)var1_1;
            var17_15 = net.minecraft.k.h.f(var13_13);
            var18_16 = 5;
            v2 = fU.a_();
            if (var2_2 == null) {
                if (v2 != 0) {
                    var18_16 = 10;
                }
                v2 = -1;
            }
            var19_17 = v2;
            var20_18 = (float)this.f + var1_1;
            var10_11.a(-var11_12, -var13_13, -var15_14);
            net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
            var21_19 = new net.minecraft.k.o();
            var22_20 = var8_9 - var18_16;
            block0: while (true) {
                v3 = var22_20;
                block1: while (v3 <= var8_9 + var18_16) {
                    v4 = var6_7 - var18_16;
                    if (var2_2 != null) break block35;
                    for (var23_21 = v2144614; var23_21 <= var6_7 + var18_16; ++var23_21) {
                        block37: {
                            block36: {
                                var24_22 = (var22_20 - var8_9 + 16) * 32 + var23_21 - var6_7 + 16;
                                var25_23 = (double)this.aa[var24_22] * 0.5;
                                var27_24 = (double)this.p[var24_22] * 0.5;
                                var21_19.a(var23_21, 0, var22_20);
                                var29_25 = var5_6.c(var21_19);
                                v3 = var29_25.p() ? 1 : 0;
                                if (var2_2 != null) continue block1;
                                if (var2_2 == null) {
                                    if (v3 == 0) {
                                        v5 = var29_25.g();
                                        if (var2_2 == null) {
                                            if (v5 == 0) continue;
                                        }
                                    } else {
                                        v5 = var5_6.d(var21_19).b();
                                    }
                                }
                                var30_26 = v5;
                                var31_27 = var7_8 - var18_16;
                                var32_28 = var7_8 + var18_16;
                                v6 = var31_27;
                                v7 = var30_26;
                                if (var2_2 != null) break block36;
                                if (v6 < v7) {
                                    var31_27 = var30_26;
                                }
                                v6 = var32_28;
                                if (var2_2 != null) break block37;
                                v7 = var30_26;
                            }
                            if (v6 < v7) {
                                var32_28 = var30_26;
                            }
                            v6 = var30_26;
                        }
                        var33_29 = v6;
                        v8 = var30_26;
                        v9 = var17_15;
                        if (var2_2 == null) {
                            if (v8 < v9) {
                                var33_29 = var17_15;
                            }
                            v8 = var31_27;
                            v9 = var32_28;
                        }
                        if (v8 == v9) continue;
                        this.M.setSeed(var23_21 * var23_21 * 3121 + var23_21 * 45238971 ^ var22_20 * var22_20 * 418711 + var22_20 * 13761);
                        var21_19.a(var23_21, var31_27, var22_20);
                        var34_30 = var29_25.a(var21_19);
                        cfr_temp_1 = var5_6.B().a(var34_30, (int)var30_26) - 0.15f;
                        v10 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                        if (var2_2 == null) {
                            if (v10 >= 0) {
                                v11 = var19_17;
                                if (var2_2 == null) {
                                    if (v11 != 0) {
                                        v12 = var19_17;
                                        if (var2_2 == null) {
                                            if (v12 >= 0) {
                                                var9_10.a();
                                            }
                                            v12 = 0;
                                        }
                                        var19_17 = v12;
                                        this.o.aN().b(net.minecraft.client.a.x.ar);
                                        var10_11.a(7, net.minecraft.client.y.b.n);
                                    }
                                    v11 = this.f + var23_21 * var23_21 * 3121 + var23_21 * 45238971 + var22_20 * var22_20 * 418711 + var22_20 * 13761 & 31;
                                }
                                var35_31 = -((double)v11 + (double)var1_1) / 32.0 * (3.0 + this.M.nextDouble());
                                var37_32 = (double)((float)var23_21 + 0.5f) - var4_5.a;
                                var39_33 = (double)((float)var22_20 + 0.5f) - var4_5.ax;
                                var41_34 = net.minecraft.k.h.e(var37_32 * var37_32 + var39_33 * var39_33) / (float)var18_16;
                                var42_36 = ((1.0f - var41_34 * var41_34) * 0.5f + 0.5f) * var3_4;
                                var21_19.a(var23_21, var33_29, var22_20);
                                var43_37 = var5_6.a((n)var21_19, 0);
                                var44_39 = var43_37 >> 16 & 65535;
                                var45_40 = var43_37 & 65535;
                                var10_11.c((double)var23_21 - var25_23 + 0.5, (double)var32_28, (double)var22_20 - var27_24 + 0.5).a(0.0, (double)var31_27 * 0.25 + var35_31).a(1.0f, 1.0f, 1.0f, var42_36).a(var44_39, var45_40).d();
                                var10_11.c((double)var23_21 + var25_23 + 0.5, (double)var32_28, (double)var22_20 + var27_24 + 0.5).a(1.0, (double)var31_27 * 0.25 + var35_31).a(1.0f, 1.0f, 1.0f, var42_36).a(var44_39, var45_40).d();
                                var10_11.c((double)var23_21 + var25_23 + 0.5, (double)var31_27, (double)var22_20 + var27_24 + 0.5).a(1.0, (double)var32_28 * 0.25 + var35_31).a(1.0f, 1.0f, 1.0f, var42_36).a(var44_39, var45_40).d();
                                var10_11.c((double)var23_21 - var25_23 + 0.5, (double)var31_27, (double)var22_20 - var27_24 + 0.5).a(0.0, (double)var32_28 * 0.25 + var35_31).a(1.0f, 1.0f, 1.0f, var42_36).a(var44_39, var45_40).d();
                                if (var2_2 == null) continue;
                            }
                            v10 = var19_17;
                        }
                        v13 = 1;
                        if (var2_2 == null) {
                            if (v10 != v13) {
                                v14 = var19_17;
                                if (var2_2 == null) {
                                    if (v14 >= 0) {
                                        var9_10.a();
                                    }
                                    v14 = 1;
                                }
                                var19_17 = v14;
                                this.o.aN().b(net.minecraft.client.a.x.d);
                                var10_11.a(7, net.minecraft.client.y.b.n);
                            }
                            v10 = this.f;
                            v13 = 511;
                        }
                        var35_31 = -((float)(v10 & v13) + var1_1) / 512.0f;
                        var37_32 = this.M.nextDouble() + (double)var20_18 * 0.01 * (double)((float)this.M.nextGaussian());
                        var39_33 = this.M.nextDouble() + (double)(var20_18 * (float)this.M.nextGaussian()) * 0.001;
                        var41_35 = (double)((float)var23_21 + 0.5f) - var4_5.a;
                        var43_38 = (double)((float)var22_20 + 0.5f) - var4_5.ax;
                        var45_41 = net.minecraft.k.h.e(var41_35 * var41_35 + var43_38 * var43_38) / (float)var18_16;
                        var46_42 = ((1.0f - var45_41 * var45_41) * 0.3f + 0.5f) * var3_4;
                        var21_19.a(var23_21, var33_29, var22_20);
                        var47_43 = (var5_6.a((n)var21_19, 0) * 3 + 0xF000F0) / 4;
                        var48_44 = var47_43 >> 16 & 65535;
                        var49_45 = var47_43 & 65535;
                        var10_11.c((double)var23_21 - var25_23 + 0.5, (double)var32_28, (double)var22_20 - var27_24 + 0.5).a(0.0 + var37_32, (double)var31_27 * 0.25 + var35_31 + var39_33).a(1.0f, 1.0f, 1.0f, var46_42).a(var48_44, var49_45).d();
                        var10_11.c((double)var23_21 + var25_23 + 0.5, (double)var32_28, (double)var22_20 + var27_24 + 0.5).a(1.0 + var37_32, (double)var31_27 * 0.25 + var35_31 + var39_33).a(1.0f, 1.0f, 1.0f, var46_42).a(var48_44, var49_45).d();
                        var10_11.c((double)var23_21 + var25_23 + 0.5, (double)var31_27, (double)var22_20 + var27_24 + 0.5).a(1.0 + var37_32, (double)var32_28 * 0.25 + var35_31 + var39_33).a(1.0f, 1.0f, 1.0f, var46_42).a(var48_44, var49_45).d();
                        var10_11.c((double)var23_21 - var25_23 + 0.5, (double)var31_27, (double)var22_20 - var27_24 + 0.5).a(0.0 + var37_32, (double)var32_28 * 0.25 + var35_31 + var39_33).a(1.0f, 1.0f, 1.0f, var46_42).a(var48_44, var49_45).d();
                        if (var2_2 == null) continue;
                    }
                    ++var22_20;
                    if (var2_2 == null) continue block0;
                }
                break;
            }
            v4 = var19_17;
        }
        if (var2_2 == null) {
            if (v4 >= 0) {
                var9_10.a();
            }
            var10_11.a(0.0, 0.0, 0.0);
            net.minecraft.client.a.v.c();
            net.minecraft.client.a.v.f();
            v4 = 516;
        }
        net.minecraft.client.a.v.a(v4, 0.1f);
        this.i();
    }

    public void b(float f10, long l2) {
        block66: {
            block65: {
                Q q2;
                String string;
                block62: {
                    block31: {
                        int n2;
                        net.minecraft.client.b.l l3;
                        int n3;
                        block49: {
                            Q q3;
                            block58: {
                                block59: {
                                    int n4;
                                    block60: {
                                        block61: {
                                            block56: {
                                                int n5;
                                                int n6;
                                                block57: {
                                                    block52: {
                                                        block53: {
                                                            x x2;
                                                            block54: {
                                                                block55: {
                                                                    block50: {
                                                                        block51: {
                                                                            Q q4;
                                                                            int n7;
                                                                            block47: {
                                                                                block48: {
                                                                                    int n8;
                                                                                    block46: {
                                                                                        block41: {
                                                                                            block42: {
                                                                                                Q q5;
                                                                                                float f11;
                                                                                                float f12;
                                                                                                block44: {
                                                                                                    block45: {
                                                                                                        boolean bl2;
                                                                                                        block43: {
                                                                                                            boolean bl3;
                                                                                                            block39: {
                                                                                                                block40: {
                                                                                                                    block37: {
                                                                                                                        block38: {
                                                                                                                            block34: {
                                                                                                                                x x3;
                                                                                                                                block33: {
                                                                                                                                    block35: {
                                                                                                                                        long l4;
                                                                                                                                        block36: {
                                                                                                                                            boolean bl4;
                                                                                                                                            block32: {
                                                                                                                                                String string2 = net.minecraft.client.a.I.j();
                                                                                                                                                this.h();
                                                                                                                                                string = string2;
                                                                                                                                                bl4 = bl3 = Display.isActive();
                                                                                                                                                if (string != null) break block32;
                                                                                                                                                if (bl4) break block33;
                                                                                                                                                x3 = this;
                                                                                                                                                if (string != null) break block34;
                                                                                                                                                bl4 = x3.o.ac.ay;
                                                                                                                                            }
                                                                                                                                            if (!bl4) break block33;
                                                                                                                                            n8 = this.o.ac.aZ;
                                                                                                                                            if (string != null) break block35;
                                                                                                                                            if (n8 == 0) break block36;
                                                                                                                                            n8 = Mouse.isButtonDown((int)1) ? 1 : 0;
                                                                                                                                            if (string != null) break block35;
                                                                                                                                            if (n8 != 0) break block33;
                                                                                                                                        }
                                                                                                                                        n8 = (l4 = net.minecraft.client.Q.aj() - this.ab - 500L) == 0L ? 0 : (l4 < 0L ? -1 : 1);
                                                                                                                                    }
                                                                                                                                    if (string != null) break block37;
                                                                                                                                    if (n8 <= 0) break block38;
                                                                                                                                    this.o.ab();
                                                                                                                                    if (string == null) break block38;
                                                                                                                                }
                                                                                                                                x3 = this;
                                                                                                                            }
                                                                                                                            x3.ab = net.minecraft.client.Q.aj();
                                                                                                                        }
                                                                                                                        this.o.an.b("mouse");
                                                                                                                        n8 = bl3 ? 1 : 0;
                                                                                                                    }
                                                                                                                    if (string != null) break block39;
                                                                                                                    if (n8 == 0) break block40;
                                                                                                                    n8 = net.minecraft.client.Q.I ? 1 : 0;
                                                                                                                    if (string != null) break block39;
                                                                                                                    if (n8 == 0) break block40;
                                                                                                                    n8 = this.o.af ? 1 : 0;
                                                                                                                    if (string != null) break block39;
                                                                                                                    if (n8 == 0) break block40;
                                                                                                                    n8 = Mouse.isInsideWindow() ? 1 : 0;
                                                                                                                    if (string != null) break block39;
                                                                                                                    if (n8 == 0) {
                                                                                                                        Mouse.setGrabbed((boolean)false);
                                                                                                                        Mouse.setCursorPosition((int)(Display.getWidth() / 2), (int)(Display.getHeight() / 2 - 20));
                                                                                                                        Mouse.setGrabbed((boolean)true);
                                                                                                                    }
                                                                                                                }
                                                                                                                n8 = this.o.af ? 1 : 0;
                                                                                                            }
                                                                                                            if (string != null) break block41;
                                                                                                            if (n8 == 0) break block42;
                                                                                                            n8 = bl3 ? 1 : 0;
                                                                                                            if (string != null) break block41;
                                                                                                            if (n8 == 0) break block42;
                                                                                                            this.o.V.a();
                                                                                                            this.o.aI().a(this.o.V);
                                                                                                            float f13 = this.o.ac.bv * 0.6f + 0.2f;
                                                                                                            float f14 = f13 * f13 * f13 * 8.0f;
                                                                                                            f12 = (float)this.o.V.b * f14;
                                                                                                            f11 = (float)this.o.V.a * f14;
                                                                                                            n3 = 1;
                                                                                                            bl2 = this.o.ac.B;
                                                                                                            if (string != null) break block43;
                                                                                                            if (bl2) {
                                                                                                                n3 = -1;
                                                                                                            }
                                                                                                            q5 = this.o;
                                                                                                            if (string != null) break block44;
                                                                                                            bl2 = q5.ac.d;
                                                                                                        }
                                                                                                        if (!bl2) break block45;
                                                                                                        this.I += f12;
                                                                                                        this.ak += f11;
                                                                                                        float f15 = f10 - this.s;
                                                                                                        this.s = f10;
                                                                                                        f12 = this.H * f15;
                                                                                                        f11 = this.C * f15;
                                                                                                        this.o.s.a(f12, f11 * (float)n3);
                                                                                                        if (string == null) break block42;
                                                                                                    }
                                                                                                    this.I = 0.0f;
                                                                                                    this.ak = 0.0f;
                                                                                                    q5 = this.o;
                                                                                                }
                                                                                                q5.s.a(f12, f11 * (float)n3);
                                                                                            }
                                                                                            this.o.an.c();
                                                                                            n8 = this.o.u ? 1 : 0;
                                                                                        }
                                                                                        if (string != null) break block46;
                                                                                        if (n8 != 0) break block31;
                                                                                        n8 = this.o.ac.aD ? 1 : 0;
                                                                                    }
                                                                                    S = n8;
                                                                                    l3 = new net.minecraft.client.b.l(this.o);
                                                                                    n6 = l3.e();
                                                                                    n5 = l3.a();
                                                                                    n2 = Mouse.getX() * n6 / this.o.P;
                                                                                    n3 = n5 - Mouse.getY() * n5 / this.o.aT - 1;
                                                                                    n7 = this.o.ac.bo;
                                                                                    q4 = this.o;
                                                                                    if (string != null) break block47;
                                                                                    if (q4.e != null) break block48;
                                                                                    net.minecraft.client.a.v.d(0, 0, this.o.P, this.o.aT);
                                                                                    net.minecraft.client.a.v.q(5889);
                                                                                    net.minecraft.client.a.v.l();
                                                                                    net.minecraft.client.a.v.q(5888);
                                                                                    net.minecraft.client.a.v.l();
                                                                                    this.j();
                                                                                    this.B = System.nanoTime();
                                                                                    net.minecraft.client.F.b.e.p = this.o.aN();
                                                                                    net.minecraft.client.F.b.e.b = this.o.a6;
                                                                                    if (string == null) break block49;
                                                                                }
                                                                                q4 = this.o;
                                                                            }
                                                                            q4.an.b("level");
                                                                            int n9 = Math.min(net.minecraft.client.Q.aL(), n7);
                                                                            n9 = Math.max(n9, 60);
                                                                            long l5 = System.nanoTime() - l2;
                                                                            long l6 = Math.max((long)(1000000000 / n9 / 4) - l5, 0L);
                                                                            this.a(f10, System.nanoTime() + l6);
                                                                            n4 = this.o.y();
                                                                            if (string != null) break block50;
                                                                            if (n4 == 0) break block51;
                                                                            long l7 = this.ad - (net.minecraft.client.Q.aj() - 1000L);
                                                                            n4 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                                                                            if (string != null) break block50;
                                                                            if (n4 >= 0) break block51;
                                                                            this.ad = net.minecraft.client.Q.aj();
                                                                            n4 = this.o.ae().V() ? 1 : 0;
                                                                            if (string != null) break block50;
                                                                            if (n4 == 0) {
                                                                                this.m();
                                                                            }
                                                                        }
                                                                        n4 = net.minecraft.client.a.as.m;
                                                                    }
                                                                    if (string != null) break block52;
                                                                    if (n4 == 0) break block53;
                                                                    this.o.a2.f();
                                                                    x2 = this;
                                                                    if (string != null) break block54;
                                                                    if (x2.ai == null) break block55;
                                                                    x2 = this;
                                                                    if (string != null) break block54;
                                                                    if (x2.Y) {
                                                                        net.minecraft.client.a.v.q(5890);
                                                                        net.minecraft.client.a.v.M();
                                                                        net.minecraft.client.a.v.l();
                                                                        this.ai.a(f10);
                                                                        net.minecraft.client.a.v.B();
                                                                    }
                                                                }
                                                                x2 = this;
                                                            }
                                                            x2.o.ao().a(true);
                                                        }
                                                        this.B = System.nanoTime();
                                                        this.o.an.a("gui");
                                                        n4 = this.o.ac.cb ? 1 : 0;
                                                    }
                                                    if (string != null) break block56;
                                                    if (n4 == 0) break block57;
                                                    q3 = this.o;
                                                    if (string != null) break block58;
                                                    if (q3.aO == null) break block59;
                                                }
                                                net.minecraft.client.a.v.a(516, 0.1f);
                                                this.j();
                                                this.a(n6, n5, f10);
                                                this.o.n.a(f10);
                                                n4 = this.o.ac.a5 ? 1 : 0;
                                            }
                                            if (string != null) break block60;
                                            if (n4 == 0) break block61;
                                            n4 = this.o.ac.bE ? 1 : 0;
                                            if (string != null) break block60;
                                            if (n4 == 0) {
                                                fU.x();
                                            }
                                        }
                                        q3 = this.o;
                                        if (string != null) break block58;
                                        n4 = q3.ac.bE ? 1 : 0;
                                    }
                                    if (n4 != 0) {
                                        fi.a(l3);
                                    }
                                }
                                q3 = this.o;
                            }
                            q3.an.c();
                        }
                        q2 = this.o;
                        if (string != null) break block62;
                        if (q2.aO == null) break block31;
                        net.minecraft.client.a.v.h(256);
                        try {
                            block64: {
                                ak ak2;
                                block63: {
                                    ak2 = cq.ag;
                                    if (string != null) break block63;
                                    if (!ak2.b()) break block64;
                                    ak2 = cq.ag;
                                }
                                cq.e(ak2, this.o.aO, n2, n3, Float.valueOf(this.o.aC()));
                                if (string == null) break block31;
                            }
                            this.o.aO.a(n2, n3, this.o.aC());
                        }
                        catch (Throwable throwable) {
                            f f16 = net.minecraft.c.f.a(throwable, "Rendering screen");
                            l l8 = f16.a("Screen render details");
                            l8.a("Screen name", new r(this));
                            l8.a("Mouse location", new ap(this, n2, n3));
                            l8.a("Screen size", new a1(this, l3));
                            throw new Z(f16);
                        }
                    }
                    net.minecraft.client.b.l l9 = new net.minecraft.client.b.l(this.o);
                    gd.a(l9);
                    this.n();
                    this.d();
                    fi.c();
                    q2 = this.o;
                }
                c c10 = q2.ac;
                if (string != null) break block65;
                if (!c10.ca) break block66;
                c10 = this.o.ac;
            }
            c10.bK = true;
        }
    }

    public void a(net.minecraft.w.d d10) {
        block2: {
            boolean bl2;
            block1: {
                String string = net.minecraft.client.a.I.j();
                bl2 = cj.b.i.a(c7.class).i();
                if (string != null) break block1;
                if (bl2) break block2;
                bl2 = c7.r.l();
            }
            if (bl2) {
                this.y = d10;
                this.h = 40;
                this.av = this.M.nextFloat() * 2.0f - 1.0f;
                this.W = this.M.nextFloat() * 2.0f - 1.0f;
            }
        }
    }

    @Override
    public void b(net.minecraft.client.D.t t2) {
        block7: {
            x x2;
            block5: {
                block6: {
                    String string = net.minecraft.client.a.I.j();
                    x2 = this;
                    if (string == null) {
                        if (x2.ai != null) {
                            this.ai.c();
                        }
                        this.ai = null;
                        x2 = this;
                    }
                    if (string != null) break block5;
                    if (x2.aj != at) break block6;
                    this.a(this.o.Z());
                    if (string == null) break block7;
                }
                x2 = this;
            }
            x2.a(aw[this.aj]);
        }
    }

    /*
     * Exception decompiling
     */
    private void a(int var1_1, float var2_2, long var3_3) {
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

    private void d() {
        block26: {
            block22: {
                block23: {
                    String string;
                    block27: {
                        block42: {
                            x x2;
                            boolean bl2;
                            block28: {
                                block29: {
                                    block41: {
                                        block32: {
                                            x x3;
                                            long l2;
                                            net.minecraft.af.c c10;
                                            block33: {
                                                block35: {
                                                    long l3;
                                                    block40: {
                                                        x x4;
                                                        block39: {
                                                            long l4;
                                                            block38: {
                                                                int n2;
                                                                block36: {
                                                                    long l5;
                                                                    block37: {
                                                                        long l6;
                                                                        block34: {
                                                                            block31: {
                                                                                int n3;
                                                                                block30: {
                                                                                    boolean bl3;
                                                                                    Q q2;
                                                                                    block25: {
                                                                                        boolean bl4;
                                                                                        block24: {
                                                                                            this.A = 0;
                                                                                            string = net.minecraft.client.a.I.j();
                                                                                            if (string != null) break block22;
                                                                                            if (!fU.J()) break block23;
                                                                                            bl4 = fU.G();
                                                                                            if (string != null) break block24;
                                                                                            if (!bl4) break block23;
                                                                                            q2 = this.o;
                                                                                            if (string != null) break block25;
                                                                                            bl4 = q2.n();
                                                                                        }
                                                                                        if (!bl4) break block26;
                                                                                        q2 = this.o;
                                                                                    }
                                                                                    if ((c10 = q2.ae()) == null) break block27;
                                                                                    bl2 = bl3 = this.o.S();
                                                                                    if (string != null) break block28;
                                                                                    if (bl2) break block29;
                                                                                    bl2 = this.o.aO instanceof net.minecraft.client.b.V;
                                                                                    if (string != null) break block28;
                                                                                    if (bl2) break block29;
                                                                                    n3 = this.J;
                                                                                    if (string != null) break block30;
                                                                                    if (n3 <= 0) break block31;
                                                                                    fi.t.c();
                                                                                    n3 = this.J;
                                                                                }
                                                                                fU.a((long)n3);
                                                                                fi.t.a();
                                                                                this.A = this.J;
                                                                            }
                                                                            l2 = System.nanoTime() / 1000000L;
                                                                            x3 = this;
                                                                            if (string != null) break block32;
                                                                            if (x3.V == 0L) break block33;
                                                                            x3 = this;
                                                                            if (string != null) break block32;
                                                                            if (x3.ag == 0) break block33;
                                                                            long l7 = l2 - this.V;
                                                                            long l8 = l7 - 0L;
                                                                            l6 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                                                                            if (string == null) {
                                                                                long l9;
                                                                                if (l6 < 0) {
                                                                                    this.V = l2;
                                                                                    l7 = 0L;
                                                                                }
                                                                                l6 = (l9 = l7 - 50L) == 0L ? 0 : (l9 < 0L ? -1 : 1);
                                                                            }
                                                                            if (string != null) break block34;
                                                                            if (l6 < 0) break block35;
                                                                            this.V = l2;
                                                                            l6 = c10.g();
                                                                        }
                                                                        l3 = l6;
                                                                        l4 = l5 = l3 - this.ag;
                                                                        if (string == null) {
                                                                            if (l4 < 0) {
                                                                                this.ag = (int)l3;
                                                                                l5 = 0;
                                                                            }
                                                                            l4 = l5;
                                                                        }
                                                                        n2 = 1;
                                                                        if (string != null) break block36;
                                                                        if (l4 >= n2) break block37;
                                                                        l4 = this.J;
                                                                        n2 = 100;
                                                                        if (string != null) break block36;
                                                                        if (l4 < n2) {
                                                                            this.J += 2;
                                                                        }
                                                                    }
                                                                    l4 = l5;
                                                                    if (string != null) break block38;
                                                                    n2 = 1;
                                                                }
                                                                if (l4 <= n2) break block39;
                                                                x4 = this;
                                                                if (string != null) break block40;
                                                                l4 = x4.J;
                                                            }
                                                            if (l4 > 0) {
                                                                --this.J;
                                                            }
                                                        }
                                                        x4 = this;
                                                    }
                                                    x4.ag = (int)l3;
                                                }
                                                if (string == null) break block41;
                                            }
                                            this.V = l2;
                                            this.ag = c10.g();
                                            this.aq = 1.0f;
                                            x3 = this;
                                        }
                                        x3.a = 50.0f;
                                    }
                                    if (string == null) break block27;
                                }
                                x2 = this;
                                if (string != null) break block42;
                                bl2 = x2.o.aO instanceof net.minecraft.client.b.V;
                            }
                            if (bl2) {
                                fU.a(20L);
                            }
                            this.V = 0L;
                            x2 = this;
                        }
                        x2.ag = 0;
                    }
                    if (string == null) break block26;
                }
                this.V = 0L;
            }
            this.ag = 0;
        }
    }

    /*
     * Exception decompiling
     */
    private boolean c() {
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

    private void m() {
        block5: {
            int n2;
            int n3;
            int n4;
            BufferedImage bufferedImage;
            block10: {
                int n5;
                int n6;
                block8: {
                    int n7;
                    block9: {
                        int n8;
                        String string;
                        block7: {
                            block6: {
                                block4: {
                                    string = net.minecraft.client.a.I.j();
                                    n8 = this.o.a2.n();
                                    if (string != null) break block4;
                                    if (n8 <= 10) break block5;
                                    n8 = this.o.a2.p() ? 1 : 0;
                                }
                                if (string != null) break block6;
                                if (n8 == 0) break block5;
                                n8 = this.o.ae().V() ? 1 : 0;
                            }
                            if (string != null) break block7;
                            if (n8 != 0) break block5;
                            n8 = this.o.P;
                        }
                        bufferedImage = aT.a(n8, this.o.aT, this.o.ao());
                        n4 = bufferedImage.getWidth();
                        n7 = bufferedImage.getHeight();
                        n3 = 0;
                        n2 = 0;
                        n6 = n4;
                        n5 = n7;
                        if (string != null) break block8;
                        if (n6 <= n5) break block9;
                        n3 = (n4 - n7) / 2;
                        n4 = n7;
                        if (string == null) break block10;
                    }
                    n6 = n7 - n4;
                    n5 = 2;
                }
                n2 = n6 / n5;
            }
            try {
                BufferedImage bufferedImage2 = new BufferedImage(64, 64, 1);
                Graphics2D graphics2D = bufferedImage2.createGraphics();
                graphics2D.drawImage(bufferedImage, 0, 0, 64, 64, n3, n2, n3 + n4, n2 + n4, null);
                graphics2D.dispose();
                ImageIO.write((RenderedImage)bufferedImage2, "png", this.o.ae().x());
            }
            catch (IOException iOException) {
                ae.warn("Couldn't save auto screenshot", (Throwable)iOException);
            }
        }
    }

    public void j() {
        net.minecraft.client.b.l l2 = new net.minecraft.client.b.l(this.o);
        net.minecraft.client.a.v.h(256);
        net.minecraft.client.a.v.q(5889);
        net.minecraft.client.a.v.l();
        net.minecraft.client.a.v.a(0.0, l2.d(), l2.b(), 0.0, 1000.0, 3000.0);
        net.minecraft.client.a.v.q(5888);
        net.minecraft.client.a.v.l();
        net.minecraft.client.a.v.b(0.0f, 0.0f, -2000.0f);
    }

    private void n() {
        block2: {
            long l2;
            long l3;
            block4: {
                long l4;
                String string;
                block3: {
                    string = net.minecraft.client.a.I.j();
                    if (this.o.e == null) break block2;
                    long l5 = System.currentTimeMillis();
                    long l6 = l5 - (this.F + 10000L);
                    l4 = l6 == 0L ? 0 : (l6 < 0L ? -1 : 1);
                    if (string != null) break block3;
                    if (l4 <= 0) break block2;
                    this.F = l5;
                    l4 = net.minecraft.client.a.v.D();
                }
                l2 = l3 = l4;
                if (string != null) break block4;
                if (l2 == false) break block2;
                l2 = l3;
            }
            String string = GLU.gluErrorString((int)l2);
            g g10 = new g(net.minecraft.client.D.h.a("of.message.openglError", (int)l3, string));
            this.o.n.f().a(g10);
        }
    }

    public static void a(a5 a52, String string, float f10, float f11, float f12, int n2, float f13, float f14, boolean n3, boolean n4) {
        String string2 = net.minecraft.client.a.I.j();
        net.minecraft.client.a.v.M();
        net.minecraft.client.a.v.b(f10, f11, f12);
        net.minecraft.client.a.v.a(0.0f, 1.0f, 0.0f);
        String string3 = string2;
        net.minecraft.client.a.v.a(-f13, 0.0f, 1.0f, 0.0f);
        int n5 = n3;
        if (string3 == null) {
            n5 = n5 != 0 ? -1 : 1;
        }
        net.minecraft.client.a.v.a((float)n5 * f14, 1.0f, 0.0f, 0.0f);
        net.minecraft.client.a.v.d(-0.025f, -0.025f, 0.025f);
        net.minecraft.client.a.v.y();
        net.minecraft.client.a.v.a(false);
        int n6 = n4;
        if (string3 == null) {
            if (n6 == 0) {
                net.minecraft.client.a.v.n();
            }
            net.minecraft.client.a.v.a();
            net.minecraft.client.a.v.a(net.minecraft.client.a.o.SRC_ALPHA, net.minecraft.client.a.G.ONE_MINUS_SRC_ALPHA, net.minecraft.client.a.o.ONE, net.minecraft.client.a.G.ZERO);
            n6 = a52.e(string) / 2;
        }
        int n7 = n6;
        net.minecraft.client.a.v.L();
        W w2 = net.minecraft.client.a.W.c();
        I i2 = w2.b();
        i2.a(7, net.minecraft.client.y.b.i);
        i2.c((double)(-n7 - 1), (double)(-1 + n2), 0.0).a(0.0f, 0.0f, 0.0f, 0.25f).d();
        i2.c((double)(-n7 - 1), (double)(8 + n2), 0.0).a(0.0f, 0.0f, 0.0f, 0.25f).d();
        i2.c((double)(n7 + 1), (double)(8 + n2), 0.0).a(0.0f, 0.0f, 0.0f, 0.25f).d();
        i2.c((double)(n7 + 1), (double)(-1 + n2), 0.0).a(0.0f, 0.0f, 0.0f, 0.25f).d();
        w2.a();
        net.minecraft.client.a.v.x();
        boolean bl2 = n4;
        if (string3 == null) {
            if (!bl2) {
                a52.b(string, -a52.e(string) / 2, n2, 0x20FFFFFF);
                net.minecraft.client.a.v.t();
            }
            bl2 = true;
        }
        net.minecraft.client.a.v.a(bl2);
        float f16 = -a52.e(string) / 2;
        f16 = n2;
        int n8 = n4;
        if (string3 == null) {
            n8 = n8 != 0 ? 0x20FFFFFF : -1;
        }
        a52.b(string, f15, f16, n8);
        net.minecraft.client.a.v.j();
        net.minecraft.client.a.v.f();
        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
        net.minecraft.client.a.v.B();
    }

    public void q() {
        String string = net.minecraft.client.a.I.j();
        x x2 = this;
        if (string == null) {
            if (x2.ai != null) {
                this.ai.c();
            }
            this.ai = null;
            x2 = this;
        }
        x2.aj = at;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void f(float var1_1) {
        block16: {
            block15: {
                block14: {
                    block12: {
                        block13: {
                            var2_2 = net.minecraft.client.a.I.j();
                            v0 = cj.b.i.a(c7.class).i();
                            if (var2_2 != null) break block12;
                            if (!v0) break block13;
                            v0 = c7.l.l();
                            if (var2_2 == null) {
                                if (v0) {
                                    return;
                                } else {
                                    ** GOTO lbl10
                                }
                            }
                            break block12;
                        }
                        v1 = this.o.Z();
                        if (var2_2 != null) break block14;
                        v0 = v1 instanceof B;
                    }
                    if (v0 == false) return;
                    v1 = this.o.Z();
                }
                var3_3 = (B)v1;
                var4_4 = (float)var3_3.bc - var1_1;
                cfr_temp_0 = var3_3.V() - 0.0f;
                v2 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                if (var2_2 != null) break block15;
                if (v2 <= 0) {
                    var5_5 = (float)var3_3.a2 + var1_1;
                    net.minecraft.client.a.v.a(380.0f - 8000.0f / (var5_5 + 200.0f), 0.0f, 0.0f, 1.0f);
                }
                v3 = var4_4;
                v4 = 0.0f;
                if (var2_2 != null) break block16;
                cfr_temp_1 = v3 - v4;
                v2 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
            }
            if (v2 < 0) {
                return;
            }
            v3 = (var4_4 /= (float)var3_3.bn) * var4_4 * var4_4 * var4_4;
            v4 = 3.1415927f;
        }
        var4_4 = net.minecraft.k.h.g(v3 * v4);
        var5_5 = var3_3.bJ;
        net.minecraft.client.a.v.a(-var5_5, 0.0f, 1.0f, 0.0f);
        net.minecraft.client.a.v.a(-var4_4 * 14.0f, 0.0f, 0.0f, 1.0f);
        net.minecraft.client.a.v.a(var5_5, 0.0f, 1.0f, 0.0f);
    }

    public float a(B b10, float f10) {
        int n2 = b10.a(net.minecraft.u.c.A).e();
        return n2 > 200 ? 1.0f : 0.7f + net.minecraft.k.h.g(((float)n2 - f10) * (float)Math.PI * 0.2f) * 0.3f;
    }

    public void a(net.minecraft.ar.v v2) {
        String string = net.minecraft.client.a.I.j();
        if (string == null && net.minecraft.client.a.as.c()) {
            try {
                this.ai = new net.minecraft.client.s.d(this.o.aN(), this.i, this.o.ao(), v2);
                this.ai.a(this.o.P, this.o.aT);
                this.Y = true;
            }
            catch (IOException iOException) {
                ae.warn("Failed to load shader: {}", (Object)v2, (Object)iOException);
                this.aj = at;
                this.Y = false;
            }
            catch (JsonSyntaxException jsonSyntaxException) {
                ae.warn("Failed to load shader: {}", (Object)v2, (Object)jsonSyntaxException);
                this.aj = at;
                this.Y = false;
            }
        }
    }

    public void g() {
        block20: {
            block21: {
                x x2;
                int n2;
                block19: {
                    String string;
                    block17: {
                        block18: {
                            block15: {
                                float f10;
                                block16: {
                                    block14: {
                                        x x3;
                                        block12: {
                                            block13: {
                                                String string2 = net.minecraft.client.a.I.j();
                                                this.o();
                                                string = string2;
                                                this.p();
                                                this.al = this.G;
                                                this.T = 4.0f;
                                                x3 = this;
                                                if (string != null) break block12;
                                                if (!x3.o.ac.d) break block13;
                                                float f11 = this.o.ac.bv * 0.6f + 0.2f;
                                                float f12 = f11 * f11 * f11 * 8.0f;
                                                this.H = this.ax.a(this.I, 0.05f * f12);
                                                this.C = this.Z.a(this.ak, 0.05f * f12);
                                                this.s = 0.0f;
                                                this.I = 0.0f;
                                                this.ak = 0.0f;
                                                if (string == null) break block14;
                                            }
                                            this.H = 0.0f;
                                            this.C = 0.0f;
                                            this.ax.a();
                                            x3 = this;
                                        }
                                        x3.Z.a();
                                    }
                                    net.minecraft.U.x x4 = this.o.Z();
                                    if (string == null) {
                                        if (x4 == null) {
                                            this.o.a(this.o.s);
                                        }
                                        x4 = this.o.Z();
                                    }
                                    net.minecraft.U.x x5 = x4;
                                    double d10 = x5.a;
                                    double d11 = x5.aF + (double)x5.l();
                                    double d12 = x5.ax;
                                    float f13 = this.o.e.k(new n(d10, d11, d12));
                                    float f14 = (float)this.o.ac.bf / 16.0f;
                                    f14 = net.minecraft.k.h.c(f14, 0.0f, 1.0f);
                                    float f15 = f13 * (1.0f - f14) + f14;
                                    this.G += (f15 - this.G) * 0.1f;
                                    ++this.f;
                                    this.U.e();
                                    this.b();
                                    this.k = this.v;
                                    n2 = this.o.n.g().e();
                                    if (string != null) break block15;
                                    if (n2 == 0) break block16;
                                    this.v += 0.05f;
                                    float f16 = this.v - 1.0f;
                                    n2 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                                    if (string != null) break block17;
                                    if (n2 <= 0) break block18;
                                    this.v = 1.0f;
                                    if (string == null) break block18;
                                }
                                n2 = (f10 = this.v - 0.0f) == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                            }
                            if (string != null) break block17;
                            if (n2 > 0) {
                                this.v -= 0.0125f;
                            }
                        }
                        n2 = this.h;
                    }
                    if (string != null) break block19;
                    if (n2 <= 0) break block20;
                    --this.h;
                    x2 = this;
                    if (string != null) break block21;
                    n2 = x2.h;
                }
                if (n2 != 0) break block20;
                x2 = this;
            }
            x2.y = null;
        }
    }

    public void a(int n2, int n3) {
        String string = net.minecraft.client.a.I.j();
        if (net.minecraft.client.a.as.m) {
            x x2 = this;
            if (string == null) {
                if (x2.ai != null) {
                    this.ai.a(n2, n3);
                }
                x2 = this;
            }
            x2.o.a2.a(n2, n3);
        }
    }

    private void h() {
        block27: {
            boolean bl2;
            block26: {
                x x2;
                net.minecraft.client.E.l l2;
                String string;
                block25: {
                    boolean bl3;
                    block24: {
                        block21: {
                            Object object;
                            block23: {
                                String string2;
                                block22: {
                                    x x3;
                                    block16: {
                                        block17: {
                                            block19: {
                                                int n2;
                                                block20: {
                                                    int n3;
                                                    block18: {
                                                        string = net.minecraft.client.a.I.j();
                                                        x3 = this;
                                                        if (string != null) break block16;
                                                        if (x3.c) break block17;
                                                        fp.a();
                                                        n2 = fU.aV();
                                                        n3 = 64;
                                                        if (string != null) break block18;
                                                        if (n2 != n3) break block19;
                                                        n2 = fU.aP();
                                                        if (string != null) break block20;
                                                        n3 = 32;
                                                    }
                                                    if (n2 != n3) break block19;
                                                    n2 = 1;
                                                }
                                                fU.a(n2 != 0);
                                            }
                                            this.c = true;
                                        }
                                        fU.ai();
                                        x3 = this;
                                    }
                                    if ((l2 = x3.o.e) == null) break block21;
                                    string2 = fU.y();
                                    if (string != null) break block22;
                                    if (string2 == null) break block23;
                                    string2 = "HD_U".replace("HD_U", "HD Ultra").replace("L", "Light");
                                }
                                object = string2;
                                String string3 = (String)object + " " + fU.y();
                                g g10 = new g(net.minecraft.client.D.h.a("of.message.newVersion", string3));
                                fU.i(null);
                            }
                            bl3 = fU.aA();
                            if (string != null) break block24;
                            if (bl3) {
                                fU.a(false);
                                object = new g(net.minecraft.client.D.h.a("of.message.java64Bit", new Object[0]));
                                this.o.n.f().a((k)object);
                            }
                        }
                        x2 = this;
                        if (string != null) break block25;
                        bl3 = x2.o.aO instanceof net.minecraft.client.b.a1;
                    }
                    if (bl3) {
                        this.a((net.minecraft.client.b.a1)this.o.aO);
                    }
                    x2 = this;
                }
                if (string == null) {
                    if (x2.au != l2) {
                        ab.a(this.au, (net.minecraft.ah.z)l2);
                        fU.Y();
                        this.V = 0L;
                        this.ag = 0;
                        this.au = l2;
                    }
                    x2 = this;
                }
                bl2 = x2.a(cS.bl);
                if (string != null) break block26;
                if (bl2) break block27;
                bl2 = false;
            }
            cS.bl = bl2 ? 1 : 0;
        }
    }

    private void b(float f10) {
        Object object;
        Object object2;
        net.minecraft.U.x x2;
        String string;
        block67: {
            x x3;
            float f11;
            block66: {
                int n2;
                block61: {
                    block62: {
                        float f12;
                        block65: {
                            float f13;
                            float f14;
                            block64: {
                                float f15;
                                block63: {
                                    double d10;
                                    block57: {
                                        double d11;
                                        block58: {
                                            block60: {
                                                block59: {
                                                    x x4;
                                                    net.minecraft.client.E.l l2;
                                                    block56: {
                                                        block48: {
                                                            net.minecraft.ac.c c10;
                                                            net.minecraft.ac.c c11;
                                                            block50: {
                                                                block51: {
                                                                    block55: {
                                                                        Object object3;
                                                                        block54: {
                                                                            block52: {
                                                                                float f16;
                                                                                block53: {
                                                                                    block49: {
                                                                                        boolean bl2;
                                                                                        block46: {
                                                                                            block47: {
                                                                                                block45: {
                                                                                                    float f17;
                                                                                                    float f18;
                                                                                                    block44: {
                                                                                                        float f19;
                                                                                                        float f20;
                                                                                                        float f21;
                                                                                                        block42: {
                                                                                                            block43: {
                                                                                                                float f22;
                                                                                                                float f23;
                                                                                                                block39: {
                                                                                                                    x x5;
                                                                                                                    float f24;
                                                                                                                    float f25;
                                                                                                                    block40: {
                                                                                                                        float f26;
                                                                                                                        float f27;
                                                                                                                        block41: {
                                                                                                                            l2 = this.o.e;
                                                                                                                            string = net.minecraft.client.a.I.j();
                                                                                                                            x2 = this.o.Z();
                                                                                                                            f23 = 0.25f + 0.75f * (float)this.o.ac.bf / 32.0f;
                                                                                                                            f23 = 1.0f - (float)Math.pow(f23, 0.25);
                                                                                                                            net.minecraft.k.l l3 = l2.a(this.o.Z(), f10);
                                                                                                                            l3 = fa.a(l3, l2, this.o.Z(), f10);
                                                                                                                            f25 = (float)l3.e;
                                                                                                                            f24 = (float)l3.d;
                                                                                                                            f22 = (float)l3.b;
                                                                                                                            net.minecraft.k.l l4 = l2.b(f10);
                                                                                                                            l4 = fa.b(l4, l2, this.o.Z(), f10);
                                                                                                                            this.am = (float)l4.e;
                                                                                                                            this.ah = (float)l4.d;
                                                                                                                            this.L = (float)l4.b;
                                                                                                                            x5 = this;
                                                                                                                            if (string != null) break block39;
                                                                                                                            if (x5.o.ac.bf < 4) break block40;
                                                                                                                            double d12 = net.minecraft.k.h.g(l2.e(f10)) > 0.0f ? -1.0 : 1.0;
                                                                                                                            object2 = new net.minecraft.k.l(d12, 0.0, 0.0);
                                                                                                                            f27 = (float)x2.b(f10).g((net.minecraft.k.l)object2);
                                                                                                                            float f28 = f27 - 0.0f;
                                                                                                                            f26 = f28 == 0.0f ? 0 : (f28 < 0.0f ? -1 : 1);
                                                                                                                            if (string != null) break block41;
                                                                                                                            if (f26 < 0) {
                                                                                                                                f27 = 0.0f;
                                                                                                                            }
                                                                                                                            f21 = f27;
                                                                                                                            if (string != null) break block42;
                                                                                                                            float f29 = f21 - 0.0f;
                                                                                                                            f26 = f29 == 0.0f ? 0 : (f29 > 0.0f ? 1 : -1);
                                                                                                                        }
                                                                                                                        if (f26 <= 0) break block40;
                                                                                                                        object3 = l2.D.b(l2.h(f10), f10);
                                                                                                                        if (string != null) break block43;
                                                                                                                        if (object3 != null) {
                                                                                                                            this.am = this.am * (1.0f - (f27 *= object3[3])) + object3[0] * f27;
                                                                                                                            this.ah = this.ah * (1.0f - f27) + object3[1] * f27;
                                                                                                                            this.L = this.L * (1.0f - f27) + object3[2] * f27;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    this.am += (f25 - this.am) * f23;
                                                                                                                    this.ah += (f24 - this.ah) * f23;
                                                                                                                    x5 = this;
                                                                                                                }
                                                                                                                x5.L += (f22 - this.L) * f23;
                                                                                                            }
                                                                                                            f21 = l2.a(f10);
                                                                                                        }
                                                                                                        float f30 = f20 = f21;
                                                                                                        if (string == null) {
                                                                                                            if (f30 > 0.0f) {
                                                                                                                f19 = 1.0f - f20 * 0.5f;
                                                                                                                float f31 = 1.0f - f20 * 0.4f;
                                                                                                                this.am *= f19;
                                                                                                                this.ah *= f19;
                                                                                                                this.L *= f31;
                                                                                                            }
                                                                                                            f30 = l2.g(f10);
                                                                                                        }
                                                                                                        f18 = f19 = f30;
                                                                                                        f17 = 0.0f;
                                                                                                        if (string != null) break block44;
                                                                                                        if (!(f18 > f17)) break block45;
                                                                                                        f18 = 1.0f;
                                                                                                        f17 = f19 * 0.5f;
                                                                                                    }
                                                                                                    float f32 = f18 - f17;
                                                                                                    this.am *= f32;
                                                                                                    this.ah *= f32;
                                                                                                    this.L *= f32;
                                                                                                }
                                                                                                object2 = net.minecraft.client.a.an.a(this.o.e, x2, f10);
                                                                                                bl2 = this.z;
                                                                                                if (string != null) break block46;
                                                                                                if (!bl2) break block47;
                                                                                                net.minecraft.k.l l5 = l2.c(f10);
                                                                                                this.am = (float)l5.e;
                                                                                                this.ah = (float)l5.d;
                                                                                                this.L = (float)l5.b;
                                                                                                if (string == null) break block48;
                                                                                            }
                                                                                            bl2 = cq.en.b();
                                                                                        }
                                                                                        if (!bl2) break block49;
                                                                                        net.minecraft.k.l l6 = net.minecraft.client.a.an.a(x2, f10);
                                                                                        object3 = new n(l6);
                                                                                        net.minecraft.Z.i i2 = this.o.e.d((n)object3);
                                                                                        object = (net.minecraft.k.l)cq.d(i2.b(), cq.en, this.o.e, object3, i2, x2, new net.minecraft.k.l(this.am, this.ah, this.L), Float.valueOf(f10));
                                                                                        this.am = (float)((net.minecraft.k.l)object).e;
                                                                                        this.ah = (float)((net.minecraft.k.l)object).d;
                                                                                        this.L = (float)((net.minecraft.k.l)object).b;
                                                                                        if (string == null) break block48;
                                                                                    }
                                                                                    c11 = object2.o();
                                                                                    c10 = net.minecraft.ac.c.L;
                                                                                    if (string != null) break block50;
                                                                                    if (c11 != c10) break block51;
                                                                                    f16 = 0.0f;
                                                                                    if (string != null) break block52;
                                                                                    if (!(x2 instanceof B)) break block53;
                                                                                    f16 = (float)net.minecraft.ax.T.a((B)x2) * 0.2f;
                                                                                    if (string != null) break block52;
                                                                                    if (((B)x2).c(net.minecraft.u.c.p)) {
                                                                                        f16 = f16 * 0.3f + 0.6f;
                                                                                    }
                                                                                }
                                                                                this.am = 0.02f + f16;
                                                                                this.ah = 0.02f + f16;
                                                                                this.L = 0.2f + f16;
                                                                            }
                                                                            object3 = fa.b(this.o.e, this.o.Z().a, this.o.Z().aF + 1.0, this.o.Z().ax);
                                                                            if (string != null) break block54;
                                                                            if (object3 == null) break block55;
                                                                            this.am = (float)object3.e;
                                                                            this.ah = (float)object3.d;
                                                                        }
                                                                        this.L = (float)object3.b;
                                                                    }
                                                                    if (string == null) break block48;
                                                                }
                                                                c11 = object2.o();
                                                                c10 = net.minecraft.ac.c.g;
                                                            }
                                                            if (c11 != c10) break block48;
                                                            this.am = 0.6f;
                                                            this.ah = 0.1f;
                                                            this.L = 0.0f;
                                                            x4 = this;
                                                            if (string != null) break block56;
                                                            net.minecraft.k.l l7 = fa.a((t)x4.o.e, this.o.Z().a, this.o.Z().aF + 1.0, this.o.Z().ax);
                                                            if (l7 != null) {
                                                                this.am = (float)l7.e;
                                                                this.ah = (float)l7.d;
                                                                this.L = (float)l7.b;
                                                            }
                                                        }
                                                        x4 = this;
                                                    }
                                                    float f33 = x4.al + (this.G - this.al) * f10;
                                                    this.am *= f33;
                                                    this.ah *= f33;
                                                    this.L *= f33;
                                                    d10 = (x2.af + (x2.aF - x2.af) * (double)f10) * l2.D.i();
                                                    n2 = x2 instanceof B;
                                                    if (string != null) break block57;
                                                    if (n2 == 0) break block58;
                                                    n2 = ((B)x2).c(net.minecraft.u.c.k) ? 1 : 0;
                                                    if (string != null) break block57;
                                                    if (n2 == 0) break block58;
                                                    int n3 = Objects.requireNonNull(((B)x2).a(net.minecraft.u.c.k)).e();
                                                    if (string != null) break block59;
                                                    if (n3 >= 20) break block60;
                                                    d10 *= (double)(1.0f - (float)n3 / 20.0f);
                                                }
                                                if (string == null) break block58;
                                            }
                                            d10 = 0.0;
                                        }
                                        n2 = (d11 = d10 - 1.0) == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
                                    }
                                    if (string == null) {
                                        float f34;
                                        if (n2 < 0) {
                                            double d13 = d10;
                                            double d14 = 0.0;
                                            if (string == null) {
                                                if (d13 < d14) {
                                                    d10 = 0.0;
                                                }
                                                d13 = d10;
                                                d14 = d10;
                                            }
                                            d10 = d13 * d14;
                                            this.am = (float)((double)this.am * d10);
                                            this.ah = (float)((double)this.ah * d10);
                                            this.L = (float)((double)this.L * d10);
                                        }
                                        n2 = (f34 = this.v - 0.0f) == 0.0f ? 0 : (f34 > 0.0f ? 1 : -1);
                                    }
                                    if (string == null) {
                                        if (n2 > 0) {
                                            float f35 = this.k + (this.v - this.k) * f10;
                                            this.am = this.am * (1.0f - f35) + this.am * 0.7f * f35;
                                            this.ah = this.ah * (1.0f - f35) + this.ah * 0.6f * f35;
                                            this.L = this.L * (1.0f - f35) + this.L * 0.6f * f35;
                                        }
                                        n2 = x2 instanceof B;
                                    }
                                    if (string != null) break block61;
                                    if (n2 == 0) break block62;
                                    n2 = ((B)x2).c(net.minecraft.u.c.A) ? 1 : 0;
                                    if (string != null) break block61;
                                    if (n2 == 0) break block62;
                                    f12 = this.a((B)x2, f10);
                                    f11 = 1.0f / this.am;
                                    float f36 = f11 - 1.0f / this.ah;
                                    f15 = f36 == 0.0f ? 0 : (f36 > 0.0f ? 1 : -1);
                                    if (string != null) break block63;
                                    if (f15 > 0) {
                                        f11 = 1.0f / this.ah;
                                    }
                                    f14 = f11;
                                    f13 = 1.0f / this.L;
                                    if (string != null) break block64;
                                    float f37 = f14 - f13;
                                    f15 = f37 == 0.0f ? 0 : (f37 > 0.0f ? 1 : -1);
                                }
                                if (f15 <= 0) break block65;
                                f14 = 1.0f;
                                f13 = this.L;
                            }
                            f11 = f14 / f13;
                        }
                        this.am = this.am * (1.0f - f12) + this.am * f11 * f12;
                        this.ah = this.ah * (1.0f - f12) + this.ah * f11 * f12;
                        this.L = this.L * (1.0f - f12) + this.L * f11 * f12;
                    }
                    x3 = this;
                    if (string != null) break block66;
                    n2 = x3.o.ac.aD ? 1 : 0;
                }
                if (n2 == 0) break block67;
                x3 = this;
            }
            float f38 = (x3.am * 30.0f + this.ah * 59.0f + this.L * 11.0f) / 100.0f;
            f11 = (this.am * 30.0f + this.ah * 70.0f) / 100.0f;
            float f39 = (this.am * 30.0f + this.L * 70.0f) / 100.0f;
            this.am = f38;
            this.ah = f11;
            this.L = f39;
        }
        object = new eY(this, x2, (net.minecraft.Z.i)object2, f10, this.am, this.ah, this.L);
        af.a((du)object);
        this.am = ((eY)object).a();
        this.ah = ((eY)object).c();
        this.L = ((eY)object).b();
        net.minecraft.client.a.v.c(this.am, this.ah, this.L, 0.0f);
        if (string == null) {
            if (cq.bt.b()) {
                Object object4 = cq.a(cq.bt, this, x2, object2, Float.valueOf(f10), Float.valueOf(this.am), Float.valueOf(this.ah), Float.valueOf(this.L));
                cq.a(object4);
                this.am = cq.a(object4, cq.ek, new Object[0]);
                this.ah = cq.a(object4, cq.cn, new Object[0]);
                this.L = cq.a(object4, cq.cg, new Object[0]);
            }
            cS.b(this.am, this.ah, this.L, 0.0f);
        }
    }

    private FloatBuffer a(float f10, float f11, float f12, float f13) {
        String string = net.minecraft.client.a.I.j();
        if (string == null) {
            if (fU.ag()) {
                cS.a(f10, f11, f12);
            }
            this.g.clear();
            this.g.put(f10).put(f11).put(f12).put(f13);
            this.g.flip();
        }
        return this.g;
    }

    public net.minecraft.client.s.d a() {
        return this.ai;
    }

    private void g(float f10) {
        block42: {
            block40: {
                float f11;
                net.minecraft.client.E.l l2;
                net.minecraft.client.E.l l3;
                String string;
                block45: {
                    block44: {
                        boolean bl2;
                        block43: {
                            x x2;
                            block41: {
                                string = net.minecraft.client.a.I.j();
                                x2 = this;
                                if (string != null) break block41;
                                if (!x2.ap) break block42;
                                this.o.an.b("lightTex");
                                x2 = this;
                            }
                            if ((l3 = x2.o.e) == null) break block42;
                            bl2 = fU.g();
                            if (string != null) break block43;
                            if (!bl2) break block44;
                            l2 = l3;
                            f11 = this.q;
                            if (string != null) break block45;
                            bl2 = fa.a(l2, f11, this.b, this.o.s.c(net.minecraft.u.c.A));
                        }
                        if (bl2) {
                            this.j.d();
                            this.ap = false;
                            this.o.an.c();
                            return;
                        }
                    }
                    l2 = l3;
                    f11 = 1.0f;
                }
                float f12 = l2.j(f11);
                float f13 = f12 * 0.95f + 0.05f;
                for (int i2 = 0; i2 < 256; ++i2) {
                    float f14;
                    float f15;
                    float f16;
                    float f17;
                    float f18;
                    float f19;
                    block53: {
                        float f20;
                        block52: {
                            block48: {
                                float f21;
                                block49: {
                                    float f22;
                                    float f23;
                                    block51: {
                                        float f24;
                                        block50: {
                                            float f25;
                                            float f26;
                                            block47: {
                                                net.minecraft.client.E.l l4;
                                                block46: {
                                                    f26 = l3.D.j()[i2 / 16] * f13;
                                                    f25 = l3.D.j()[i2 % 16] * (this.q * 0.1f + 1.5f);
                                                    if (string != null) break block40;
                                                    l4 = l3;
                                                    if (string != null) break block46;
                                                    if (l4.z() <= 0) break block47;
                                                    l4 = l3;
                                                }
                                                f26 = l4.D.j()[i2 / 16];
                                            }
                                            float f27 = f26 * (f12 * 0.65f + 0.35f);
                                            float f28 = f26 * (f12 * 0.65f + 0.35f);
                                            float f29 = f25 * ((f25 * 0.6f + 0.4f) * 0.6f + 0.4f);
                                            float f30 = f25 * (f25 * f25 * 0.6f + 0.4f);
                                            f19 = f27 + f25;
                                            f18 = f28 + f29;
                                            f17 = f26 + f30;
                                            f19 = f19 * 0.96f + 0.03f;
                                            f18 = f18 * 0.96f + 0.03f;
                                            f17 = f17 * 0.96f + 0.03f;
                                            float f31 = this.v - 0.0f;
                                            f20 = f31 == 0.0f ? 0 : (f31 > 0.0f ? 1 : -1);
                                            if (string == null) {
                                                if (f20 > 0) {
                                                    f16 = this.k + (this.v - this.k) * f10;
                                                    f19 = f19 * (1.0f - f16) + f19 * 0.7f * f16;
                                                    f18 = f18 * (1.0f - f16) + f18 * 0.6f * f16;
                                                    f17 = f17 * (1.0f - f16) + f17 * 0.6f * f16;
                                                }
                                                f20 = l3.D.r().a();
                                            }
                                            if (string == null) {
                                                if (f20 == true) {
                                                    f19 = 0.22f + f25 * 0.75f;
                                                    f18 = 0.28f + f29 * 0.75f;
                                                    f17 = 0.25f + f30 * 0.75f;
                                                }
                                                f20 = (float)cq.b0.b();
                                            }
                                            if (string == null) {
                                                if (f20 != false) {
                                                    float[] arrf = new float[]{f19, f18, f17};
                                                    cq.d(l3.D, cq.b0, Float.valueOf(f10), Float.valueOf(f12), Float.valueOf(f26), Float.valueOf(f25), arrf);
                                                    f19 = arrf[0];
                                                    f18 = arrf[1];
                                                    f17 = arrf[2];
                                                }
                                                f19 = net.minecraft.k.h.c(f19, 0.0f, 1.0f);
                                                f18 = net.minecraft.k.h.c(f18, 0.0f, 1.0f);
                                                f17 = net.minecraft.k.h.c(f17, 0.0f, 1.0f);
                                                f20 = (float)this.o.s.c(net.minecraft.u.c.A);
                                            }
                                            if (string != null) break block48;
                                            if (f20 == false) break block49;
                                            f16 = this.a(this.o.s, f10);
                                            f15 = 1.0f / f19;
                                            float f32 = f15 - 1.0f / f18;
                                            f24 = f32 == 0.0f ? 0 : (f32 > 0.0f ? 1 : -1);
                                            if (string != null) break block50;
                                            if (f24 > 0) {
                                                f15 = 1.0f / f18;
                                            }
                                            f23 = f15;
                                            f22 = 1.0f / f17;
                                            if (string != null) break block51;
                                            float f33 = f23 - f22;
                                            f24 = f33 == 0.0f ? 0 : (f33 > 0.0f ? 1 : -1);
                                        }
                                        if (f24 > 0) {
                                            f15 = 1.0f / f17;
                                        }
                                        f19 = f19 * (1.0f - f16) + f19 * f15 * f16;
                                        f18 = f18 * (1.0f - f16) + f18 * f15 * f16;
                                        f23 = f17 * (1.0f - f16);
                                        f22 = f17 * f15 * f16;
                                    }
                                    f17 = f23 + f22;
                                }
                                f20 = (f21 = f19 - 1.0f) == 0.0f ? 0 : (f21 > 0.0f ? 1 : -1);
                            }
                            if (string == null) {
                                float f34;
                                if (f20 > 0) {
                                    f19 = 1.0f;
                                }
                                f20 = (f34 = f18 - 1.0f) == 0.0f ? 0 : (f34 > 0.0f ? 1 : -1);
                            }
                            if (string != null) break block52;
                            if (f20 > 0) {
                                f18 = 1.0f;
                            }
                            f14 = f17;
                            if (string != null) break block53;
                            float f35 = f14 - 1.0f;
                            f20 = f35 == 0.0f ? 0 : (f35 > 0.0f ? 1 : -1);
                        }
                        if (f20 > 0) {
                            f17 = 1.0f;
                        }
                        f14 = this.o.ac.aj;
                    }
                    f16 = f14;
                    f15 = 1.0f - f19;
                    float f36 = 1.0f - f18;
                    float f37 = 1.0f - f17;
                    f15 = 1.0f - f15 * f15 * f15 * f15;
                    f36 = 1.0f - f36 * f36 * f36 * f36;
                    f37 = 1.0f - f37 * f37 * f37 * f37;
                    f19 = f19 * (1.0f - f16) + f15 * f16;
                    f18 = f18 * (1.0f - f16) + f36 * f16;
                    f17 = f17 * (1.0f - f16) + f37 * f16;
                    f19 = f19 * 0.96f + 0.03f;
                    f18 = f18 * 0.96f + 0.03f;
                    f17 = f17 * 0.96f + 0.03f;
                    float f38 = f19 - 1.0f;
                    float f39 = f38 == 0.0f ? 0 : (f38 > 0.0f ? 1 : -1);
                    if (string == null) {
                        float f40;
                        if (f39 > 0) {
                            f19 = 1.0f;
                        }
                        f39 = (f40 = f18 - 1.0f) == 0.0f ? 0 : (f40 > 0.0f ? 1 : -1);
                    }
                    if (string == null) {
                        float f41;
                        if (f39 > 0) {
                            f18 = 1.0f;
                        }
                        f39 = (f41 = f17 - 1.0f) == 0.0f ? 0 : (f41 > 0.0f ? 1 : -1);
                    }
                    if (string == null) {
                        float f42;
                        if (f39 > 0) {
                            f17 = 1.0f;
                        }
                        f39 = (f42 = f19 - 0.0f) == 0.0f ? 0 : (f42 < 0.0f ? -1 : 1);
                    }
                    if (string == null) {
                        float f43;
                        if (f39 < 0) {
                            f19 = 0.0f;
                        }
                        f39 = (f43 = f18 - 0.0f) == 0.0f ? 0 : (f43 < 0.0f ? -1 : 1);
                    }
                    if (string == null) {
                        float f44;
                        if (f39 < 0) {
                            f18 = 0.0f;
                        }
                        f39 = (f44 = f17 - 0.0f) == 0.0f ? 0 : (f44 < 0.0f ? -1 : 1);
                    }
                    if (string == null) {
                        if (f39 < 0) {
                            f17 = 0.0f;
                        }
                        f39 = 255;
                    }
                    float f45 = f39;
                    int n2 = (int)(f19 * 255.0f);
                    int n3 = (int)(f18 * 255.0f);
                    int n4 = (int)(f17 * 255.0f);
                    this.b[i2] = 0xFF000000 | n2 << 16 | n3 << 8 | n4;
                    if (string == null) continue;
                }
                this.j.d();
                this.ap = false;
            }
            this.o.an.c();
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private void a(net.minecraft.U.x x2, float f10, net.minecraft.client.G.b b10, boolean bl2) {
        block12: {
            int n2;
            block15: {
                x x3;
                Q q2;
                block14: {
                    int n3;
                    String string;
                    block13: {
                        block11: {
                            n2 = 201435902;
                            string = net.minecraft.client.a.I.j();
                            n3 = this.E;
                            if (string == null) {
                                if (n3 != 0) {
                                    this.E = false;
                                    this.a(x2, (double)f10, b10, bl2);
                                    this.o.n.f().c(n2);
                                }
                                n3 = Keyboard.isKeyDown((int)61);
                            }
                            if (string != null) break block11;
                            if (n3 == 0) break block12;
                            n3 = Keyboard.isKeyDown((int)38);
                        }
                        if (string != null) break block13;
                        if (n3 == 0) break block12;
                        q2 = this.o;
                        if (string != null) break block14;
                        n3 = q2.ac.bu.e();
                    }
                    if (n3 == 38) {
                        boolean bl4 = this.o.aO instanceof net.minecraft.client.A.b;
                        bl4 = true;
                        do {
                            if (bl4 && !(bl4 = false)) {
                                if (string != null) continue;
                                if (bl3) {
                                    this.o.a((L)null);
                                }
                            }
                            bl3 = Keyboard.next();
                        } while (bl3);
                    }
                    x3 = this;
                    if (string != null) break block15;
                    q2 = x3.o;
                }
                if (q2.aO != null) {
                    return;
                }
                x3 = this;
            }
            x3.E = true;
            g g10 = new g(net.minecraft.client.D.h.a("of.message.loadingVisibleChunks", new Object[0]));
            this.o.n.f().a(g10, n2);
            cq.I.a(this.o, Boolean.TRUE);
        }
    }

    public void a(float f10, int n2) {
        block35: {
            float f11;
            String string;
            block34: {
                block30: {
                    block31: {
                        int n3;
                        float f12;
                        block33: {
                            int n4;
                            block32: {
                                Q q2;
                                block29: {
                                    int n5;
                                    block28: {
                                        this.r = this.o.ac.bf * 16;
                                        string = net.minecraft.client.a.I.j();
                                        int n6 = fU.aQ();
                                        if (string == null) {
                                            if (n6 != 0) {
                                                this.r *= 0.95f;
                                            }
                                            n6 = fU.aM();
                                        }
                                        if (string == null) {
                                            if (n6 != 0) {
                                                this.r *= 0.83f;
                                            }
                                            n6 = 5889;
                                        }
                                        net.minecraft.client.a.v.q(n6);
                                        net.minecraft.client.a.v.l();
                                        float f13 = 0.07f;
                                        n5 = this.o.ac.aD;
                                        if (string == null) {
                                            if (n5 != 0) {
                                                net.minecraft.client.a.v.b((float)(-(n2 * 2 - 1)) * 0.07f, 0.0f, 0.0f);
                                            }
                                            this.X = this.r * 2.0f;
                                            float f14 = this.X - 173.0f;
                                            n5 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                                        }
                                        if (string == null) {
                                            if (n5 < 0) {
                                                this.X = 173.0f;
                                            }
                                            this.getClass();
                                            double d10 = 1.0 - 1.0;
                                            n5 = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
                                        }
                                        if (string == null) {
                                            if (n5 != 0) {
                                                net.minecraft.client.a.v.b((float)this.af, (float)(-this.n), 0.0f);
                                                this.getClass();
                                                this.getClass();
                                                net.minecraft.client.a.v.a(1.0, 1.0, 1.0);
                                            }
                                            Project.gluPerspective((float)this.a(f10, true), (float)((float)this.o.P / (float)this.o.aT), (float)0.05f, (float)this.X);
                                            net.minecraft.client.a.v.q(5888);
                                            net.minecraft.client.a.v.l();
                                            n5 = this.o.ac.aD ? 1 : 0;
                                        }
                                        if (string != null) break block28;
                                        if (n5 != 0) {
                                            net.minecraft.client.a.v.b((float)(n2 * 2 - 1) * 0.1f, 0.0f, 0.0f);
                                        }
                                        this.f(f10);
                                        q2 = this.o;
                                        if (string != null) break block29;
                                        n5 = q2.ac.X ? 1 : 0;
                                    }
                                    if (n5 != 0) {
                                        this.a(f10);
                                    }
                                    q2 = this.o;
                                }
                                f12 = q2.s.cO + (this.o.s.cK - this.o.s.cO) * f10;
                                float f11 = f12 - 0.0f;
                                f11 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                                if (string != null) break block30;
                                if (f11 <= 0) break block31;
                                n3 = 20;
                                n4 = this.o.s.c(net.minecraft.u.c.s);
                                if (string != null) break block32;
                                if (n4 == 0) break block33;
                                n4 = 7;
                            }
                            n3 = n4;
                        }
                        float f16 = 5.0f / (f12 * f12 + 5.0f) - f12 * 0.04f;
                        f16 *= f16;
                        net.minecraft.client.a.v.a(((float)this.f + f10) * (float)n3, 0.0f, 1.0f, 1.0f);
                        net.minecraft.client.a.v.d(1.0f / f16, 1.0f, 1.0f);
                        net.minecraft.client.a.v.a(-((float)this.f + f10) * (float)n3, 0.0f, 1.0f, 1.0f);
                    }
                    this.d(f10);
                    f11 = (float)this.e;
                }
                if (string != null) break block34;
                if (f11 == false) break block35;
                f11 = this.ac;
            }
            switch (f11) {
                case 0: {
                    net.minecraft.client.a.v.a(90.0f, 0.0f, 1.0f, 0.0f);
                    if (string == null) break;
                }
                case 1: {
                    net.minecraft.client.a.v.a(180.0f, 0.0f, 1.0f, 0.0f);
                    if (string == null) break;
                }
                case 2: {
                    net.minecraft.client.a.v.a(-90.0f, 0.0f, 1.0f, 0.0f);
                    if (string == null) break;
                }
                case 3: {
                    net.minecraft.client.a.v.a(90.0f, 1.0f, 0.0f, 0.0f);
                    if (string == null) break;
                }
                case 4: {
                    net.minecraft.client.a.v.a(-90.0f, 1.0f, 0.0f, 0.0f);
                    break;
                }
            }
        }
    }

    static Q a(x x2) {
        return x2.o;
    }

    public void c(float f10) {
        this.j();
    }

    private void b(float f10, int n2) {
        this.a(f10, n2, true, true, false);
    }

    private void a(int n2, float f10) {
        block45: {
            ak ak2;
            float f11;
            net.minecraft.Z.i i2;
            net.minecraft.U.x x2;
            block85: {
                boolean bl2;
                block83: {
                    String string;
                    block84: {
                        block82: {
                            block81: {
                                block79: {
                                    block80: {
                                        block78: {
                                            block77: {
                                                block76: {
                                                    block75: {
                                                        block74: {
                                                            block69: {
                                                                block72: {
                                                                    block73: {
                                                                        boolean bl3;
                                                                        block70: {
                                                                            block71: {
                                                                                net.minecraft.ac.c c10;
                                                                                net.minecraft.ac.c c11;
                                                                                block59: {
                                                                                    block60: {
                                                                                        block68: {
                                                                                            block66: {
                                                                                                block67: {
                                                                                                    boolean bl4;
                                                                                                    block65: {
                                                                                                        block63: {
                                                                                                            block64: {
                                                                                                                boolean bl5;
                                                                                                                block61: {
                                                                                                                    block62: {
                                                                                                                        block56: {
                                                                                                                            block58: {
                                                                                                                                block57: {
                                                                                                                                    int n3;
                                                                                                                                    block55: {
                                                                                                                                        block46: {
                                                                                                                                            block47: {
                                                                                                                                                block53: {
                                                                                                                                                    int n4;
                                                                                                                                                    block54: {
                                                                                                                                                        block52: {
                                                                                                                                                            block51: {
                                                                                                                                                                block50: {
                                                                                                                                                                    block49: {
                                                                                                                                                                        block48: {
                                                                                                                                                                            int n5;
                                                                                                                                                                            block43: {
                                                                                                                                                                                block44: {
                                                                                                                                                                                    this.an = false;
                                                                                                                                                                                    string = net.minecraft.client.a.I.j();
                                                                                                                                                                                    x2 = this.o.Z();
                                                                                                                                                                                    this.a(false);
                                                                                                                                                                                    net.minecraft.client.a.v.a(0.0f, -1.0f, 0.0f);
                                                                                                                                                                                    net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                                                                                                                                                                                    i2 = net.minecraft.client.a.an.a(this.o.e, x2, f10);
                                                                                                                                                                                    float f12 = -1.0f;
                                                                                                                                                                                    n3 = cq.aT.b();
                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                        float f13;
                                                                                                                                                                                        if (n3 != 0) {
                                                                                                                                                                                            f12 = cq.f(cq.aT, this, x2, i2, Float.valueOf(f10), Float.valueOf(0.1f));
                                                                                                                                                                                        }
                                                                                                                                                                                        n3 = (f13 = f12 - 0.0f) == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                                                                                                                                                                                    }
                                                                                                                                                                                    if (string != null) break block43;
                                                                                                                                                                                    if (n3 < 0) break block44;
                                                                                                                                                                                    net.minecraft.client.a.v.b(f12);
                                                                                                                                                                                    if (string == null) break block45;
                                                                                                                                                                                }
                                                                                                                                                                                n3 = x2 instanceof B;
                                                                                                                                                                            }
                                                                                                                                                                            if (string != null) break block46;
                                                                                                                                                                            if (n3 == 0) break block47;
                                                                                                                                                                            n3 = ((B)x2).c(net.minecraft.u.c.k) ? 1 : 0;
                                                                                                                                                                            if (string != null) break block46;
                                                                                                                                                                            if (n3 == 0) break block47;
                                                                                                                                                                            f11 = 5.0f;
                                                                                                                                                                            int n6 = n5 = ((B)x2).a(net.minecraft.u.c.k).e();
                                                                                                                                                                            if (string == null) {
                                                                                                                                                                                if (n6 < 20) {
                                                                                                                                                                                    f11 = 5.0f + (this.r - 5.0f) * (1.0f - (float)n5 / 20.0f);
                                                                                                                                                                                }
                                                                                                                                                                                n6 = fU.ag() ? 1 : 0;
                                                                                                                                                                            }
                                                                                                                                                                            if (n6 == 0) break block48;
                                                                                                                                                                            cS.a(net.minecraft.client.a.ag.LINEAR);
                                                                                                                                                                            if (string == null) break block49;
                                                                                                                                                                        }
                                                                                                                                                                        net.minecraft.client.a.v.a(net.minecraft.client.a.ag.LINEAR);
                                                                                                                                                                    }
                                                                                                                                                                    if (n2 != -1) break block50;
                                                                                                                                                                    net.minecraft.client.a.v.a(0.0f);
                                                                                                                                                                    net.minecraft.client.a.v.c(f11 * 0.8f);
                                                                                                                                                                    if (string == null) break block51;
                                                                                                                                                                }
                                                                                                                                                                net.minecraft.client.a.v.a(f11 * 0.25f);
                                                                                                                                                                net.minecraft.client.a.v.c(f11);
                                                                                                                                                            }
                                                                                                                                                            n4 = GLContext.getCapabilities().GL_NV_fog_distance;
                                                                                                                                                            if (string != null) break block52;
                                                                                                                                                            if (n4 == 0) break block53;
                                                                                                                                                            n4 = fU.aQ();
                                                                                                                                                        }
                                                                                                                                                        if (string != null) break block54;
                                                                                                                                                        if (n4 == 0) break block53;
                                                                                                                                                        n4 = 34138;
                                                                                                                                                    }
                                                                                                                                                    net.minecraft.client.a.v.b(n4, 34139);
                                                                                                                                                }
                                                                                                                                                if (string == null) break block45;
                                                                                                                                            }
                                                                                                                                            n3 = this.z ? 1 : 0;
                                                                                                                                        }
                                                                                                                                        if (string != null) break block55;
                                                                                                                                        if (n3 == 0) break block56;
                                                                                                                                        n3 = fU.ag() ? 1 : 0;
                                                                                                                                    }
                                                                                                                                    if (n3 == 0) break block57;
                                                                                                                                    cS.a(net.minecraft.client.a.ag.EXP);
                                                                                                                                    if (string == null) break block58;
                                                                                                                                }
                                                                                                                                net.minecraft.client.a.v.a(net.minecraft.client.a.ag.EXP);
                                                                                                                            }
                                                                                                                            net.minecraft.client.a.v.b(0.1f);
                                                                                                                            if (string == null) break block45;
                                                                                                                        }
                                                                                                                        net.minecraft.ac.c c10 = i2.o();
                                                                                                                        c10 = net.minecraft.ac.c.L;
                                                                                                                        if (string != null) break block59;
                                                                                                                        if (c11 != c10) break block60;
                                                                                                                        bl5 = cj.b.i.a(c7.class).i();
                                                                                                                        if (string != null) break block61;
                                                                                                                        if (!bl5) break block62;
                                                                                                                        bl5 = c7.t.l();
                                                                                                                        if (string != null) break block61;
                                                                                                                        if (bl5) break block63;
                                                                                                                    }
                                                                                                                    bl5 = fU.ag();
                                                                                                                }
                                                                                                                if (!bl5) break block64;
                                                                                                                cS.a(net.minecraft.client.a.ag.EXP);
                                                                                                                if (string == null) break block63;
                                                                                                            }
                                                                                                            net.minecraft.client.a.v.a(net.minecraft.client.a.ag.EXP);
                                                                                                        }
                                                                                                        bl4 = x2 instanceof B;
                                                                                                        if (string != null) break block65;
                                                                                                        if (!bl4) break block66;
                                                                                                        bl4 = ((B)x2).c(net.minecraft.u.c.p);
                                                                                                    }
                                                                                                    if (!bl4) break block67;
                                                                                                    net.minecraft.client.a.v.b(0.01f);
                                                                                                    if (string == null) break block68;
                                                                                                }
                                                                                                net.minecraft.client.a.v.b(0.1f - (float)net.minecraft.ax.T.a((B)x2) * 0.03f);
                                                                                                if (string == null) break block68;
                                                                                            }
                                                                                            net.minecraft.client.a.v.b(0.1f);
                                                                                        }
                                                                                        if (!fU.aJ()) break block45;
                                                                                        net.minecraft.client.a.v.b(0.02f);
                                                                                        if (string == null) break block45;
                                                                                    }
                                                                                    net.minecraft.ac.c c10 = i2.o();
                                                                                    c10 = net.minecraft.ac.c.g;
                                                                                }
                                                                                if (c11 != c10) break block69;
                                                                                bl3 = cj.b.i.a(c7.class).i();
                                                                                if (string != null) break block70;
                                                                                if (!bl3) break block71;
                                                                                bl3 = c7.t.l();
                                                                                if (string != null) break block70;
                                                                                if (bl3) break block72;
                                                                            }
                                                                            bl3 = fU.ag();
                                                                        }
                                                                        if (!bl3) break block73;
                                                                        cS.a(net.minecraft.client.a.ag.EXP);
                                                                        if (string == null) break block72;
                                                                    }
                                                                    net.minecraft.client.a.v.a(net.minecraft.client.a.ag.EXP);
                                                                }
                                                                net.minecraft.client.a.v.b(2.0f);
                                                                if (string == null) break block45;
                                                            }
                                                            f11 = this.r;
                                                            this.an = true;
                                                            if (string != null) break block74;
                                                            if (!fU.ag()) break block75;
                                                            cS.a(net.minecraft.client.a.ag.LINEAR);
                                                        }
                                                        if (string == null) break block76;
                                                    }
                                                    net.minecraft.client.a.v.a(net.minecraft.client.a.ag.LINEAR);
                                                }
                                                if (n2 != -1) break block77;
                                                net.minecraft.client.a.v.a(0.0f);
                                                net.minecraft.client.a.v.c(f11);
                                                if (string == null) break block78;
                                            }
                                            net.minecraft.client.a.v.a(f11 * fU.U());
                                            net.minecraft.client.a.v.c(f11);
                                        }
                                        bl2 = GLContext.getCapabilities().GL_NV_fog_distance;
                                        if (string != null) break block79;
                                        if (!bl2) break block80;
                                        bl2 = fU.aQ();
                                        if (string == null) {
                                            if (bl2) {
                                                net.minecraft.client.a.v.b(34138, 34139);
                                            }
                                            bl2 = fU.aM();
                                        }
                                        if (string != null) break block79;
                                        if (bl2) {
                                            net.minecraft.client.a.v.b(34138, 34140);
                                        }
                                    }
                                    bl2 = this.o.e.D.b((int)x2.a, (int)x2.ax);
                                }
                                if (string != null) break block81;
                                if (bl2) break block82;
                                bl2 = this.o.n.g().b();
                            }
                            if (string != null) break block83;
                            if (!bl2) break block84;
                        }
                        net.minecraft.client.a.v.a(f11 * 0.05f);
                        net.minecraft.client.a.v.c(f11);
                    }
                    ak2 = cq.Z;
                    if (string != null) break block85;
                    bl2 = ak2.b();
                }
                if (!bl2) break block45;
                ak2 = cq.Z;
            }
            cq.e(ak2, this, x2, i2, Float.valueOf(f10), n2, Float.valueOf(f11));
        }
        da da2 = new da(this.am, this.ah, this.L, 0);
        af.a(da2);
        this.am = da2.b / 255.0f;
        this.ah = da2.d / 255.0f;
        this.L = da2.c / 255.0f;
        net.minecraft.client.a.v.r();
        net.minecraft.client.a.v.o();
        net.minecraft.client.a.v.g(1028, 4608);
    }

    private void o() {
        block8: {
            block7: {
                x x2;
                int n2;
                block6: {
                    float f10 = 1.0f;
                    String string = net.minecraft.client.a.I.j();
                    n2 = this.o.Z() instanceof a;
                    if (string == null) {
                        if (n2 != 0) {
                            a a10 = (a)this.o.Z();
                            f10 = a10.s();
                        }
                        this.K = this.as;
                        this.as += (f10 - this.as) * 0.5f;
                        float f11 = this.as - 1.5f;
                        n2 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                    }
                    if (string != null) break block6;
                    if (n2 > 0) {
                        this.as = 1.5f;
                    }
                    x2 = this;
                    if (string != null) break block7;
                    float f12 = x2.as - 0.1f;
                    n2 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                }
                if (n2 >= 0) break block8;
                x2 = this;
            }
            x2.as = 0.1f;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean a(int var1_1) {
        block23: {
            block22: {
                block20: {
                    block21: {
                        block19: {
                            var2_2 = net.minecraft.client.a.I.j();
                            v0 = net.minecraft.client.a.as.c();
                            if (var2_2 != null) return v0;
                            if (!v0) {
                                return false;
                            }
                            v1 = this.ai;
                            if (var2_2 != null) break block19;
                            if (v1 == null) break block20;
                            v1 = this.ai;
                        }
                        v2 = this.Q[2];
                        if (var2_2 != null) break block21;
                        if (v1 == v2) break block20;
                        v1 = this.ai;
                        v2 = this.Q[4];
                    }
                    if (v1 != v2) {
                        return true;
                    }
                }
                v3 = var1_1;
                v4 = 2;
                if (var2_2 != null) break block22;
                if (v3 == v4) break block23;
                v3 = var1_1;
                v4 = 4;
            }
            if (v3 != v4) {
                v5 = this.ai;
                if (var2_2 == null) {
                    if (v5 == null) {
                        return true;
                    }
                    v5 = this.ai;
                }
                v5.c();
                this.ai = null;
                return true;
            }
        }
        v6 = this;
        if (var2_2 == null) {
            if (v6.ai != null) {
                v6 = this;
                if (var2_2 == null) {
                    if (v6.ai == this.Q[var1_1]) {
                        return true;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v6 = this;
            }
        }
        if (var2_2 != null) return v6.Y;
        if (v6.o.e == null) {
            return true;
        }
        this.a(new net.minecraft.ar.v("shaders/post/fxaa_of_" + var1_1 + "x.json"));
        this.Q[var1_1] = this.ai;
        v6 = this;
        return v6.Y;
    }

    public net.minecraft.client.b.af k() {
        return this.t;
    }

    public boolean e() {
        return net.minecraft.client.a.as.m && this.ai != null;
    }

    private void a(net.minecraft.client.b.a1 a12) {
        String string = net.minecraft.client.a.I.j();
        try {
            String string2;
            block14: {
                int n2;
                int n3;
                block13: {
                    int n4;
                    int n5;
                    block12: {
                        int n6;
                        int n7;
                        block11: {
                            string2 = null;
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTime(new Date());
                            n5 = calendar.get(5);
                            n4 = calendar.get(2) + 1;
                            n7 = n5;
                            n6 = 8;
                            if (string != null) break block11;
                            if (n7 != n6) break block12;
                            n7 = n4;
                            n6 = 4;
                        }
                        if (n7 == n6) {
                            string2 = "Happy birthday, OptiFine!";
                        }
                    }
                    n3 = n5;
                    n2 = 14;
                    if (string != null) break block13;
                    if (n3 != n2) break block14;
                    n3 = n4;
                    n2 = 8;
                }
                if (n3 == n2) {
                    string2 = "Happy birthday, sp614x!";
                }
            }
            if (string2 == null) {
                return;
            }
            cq.a((Object)a12, cq.dQ, (Object)string2);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    public void l() {
        String string = net.minecraft.client.a.I.j();
        boolean bl2 = this.Y;
        if (string == null) {
            bl2 = !bl2;
        }
        this.Y = bl2;
    }

    static {
        ae = LogManager.getLogger();
        ar = new net.minecraft.ar.v("textures/environment/rain.png");
        d = new net.minecraft.ar.v("textures/environment/snow.png");
        aw = new net.minecraft.ar.v[]{new net.minecraft.ar.v("shaders/post/notch.json"), new net.minecraft.ar.v("shaders/post/fxaa.json"), new net.minecraft.ar.v("shaders/post/art.json"), new net.minecraft.ar.v("shaders/post/bumpy.json"), new net.minecraft.ar.v("shaders/post/blobs2.json"), new net.minecraft.ar.v("shaders/post/pencil.json"), new net.minecraft.ar.v("shaders/post/color_convolve.json"), new net.minecraft.ar.v("shaders/post/deconverge.json"), new net.minecraft.ar.v("shaders/post/flip.json"), new net.minecraft.ar.v("shaders/post/invert.json"), new net.minecraft.ar.v("shaders/post/ntsc.json"), new net.minecraft.ar.v("shaders/post/outline.json"), new net.minecraft.ar.v("shaders/post/phosphor.json"), new net.minecraft.ar.v("shaders/post/scan_pincushion.json"), new net.minecraft.ar.v("shaders/post/sobel.json"), new net.minecraft.ar.v("shaders/post/bits.json"), new net.minecraft.ar.v("shaders/post/desaturate.json"), new net.minecraft.ar.v("shaders/post/green.json"), new net.minecraft.ar.v("shaders/post/blur.json"), new net.minecraft.ar.v("shaders/post/wobble.json"), new net.minecraft.ar.v("shaders/post/blobs.json"), new net.minecraft.ar.v("shaders/post/antialias.json"), new net.minecraft.ar.v("shaders/post/creeper.json"), new net.minecraft.ar.v("shaders/post/spider.json")};
        at = aw.length;
    }

    public void a(float f10, long l2) {
        block9: {
            x x2;
            block7: {
                block8: {
                    boolean bl2;
                    String string;
                    block6: {
                        String string2 = net.minecraft.client.a.I.j();
                        this.g(f10);
                        string = string2;
                        x x3 = this;
                        if (string == null) {
                            if (x3.o.Z() == null) {
                                this.o.a(this.o.s);
                            }
                            x3 = this;
                        }
                        x3.e(f10);
                        bl2 = fU.ag();
                        if (string != null) break block6;
                        if (bl2) {
                            cS.a(this.o, f10, l2);
                        }
                        net.minecraft.client.a.v.t();
                        net.minecraft.client.a.v.e();
                        net.minecraft.client.a.v.a(516, 0.1f);
                        this.o.an.b("center");
                        x2 = this;
                        if (string != null) break block7;
                        bl2 = x2.o.ac.aD;
                    }
                    if (!bl2) break block8;
                    u = 0;
                    net.minecraft.client.a.v.a(false, true, true, false);
                    this.a(0, f10, l2);
                    u = 1;
                    net.minecraft.client.a.v.a(true, false, false, false);
                    this.a(1, f10, l2);
                    net.minecraft.client.a.v.a(true, true, true, false);
                    if (string == null) break block9;
                }
                x2 = this;
            }
            x2.a(2, f10, l2);
        }
        this.o.an.c();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void e(float var1_1) {
        block74: {
            block70: {
                block71: {
                    block75: {
                        block76: {
                            block72: {
                                block73: {
                                    block67: {
                                        block68: {
                                            block69: {
                                                block63: {
                                                    block64: {
                                                        block65: {
                                                            block66: {
                                                                block52: {
                                                                    block51: {
                                                                        block49: {
                                                                            block50: {
                                                                                block47: {
                                                                                    block48: {
                                                                                        var3_2 = this.o.Z();
                                                                                        var2_3 = net.minecraft.client.a.I.j();
                                                                                        if (var3_2 == null) return;
                                                                                        v0 = this.o;
                                                                                        if (var2_3 == null) {
                                                                                            if (v0.e == null) return;
                                                                                            this.o.an.b("pick");
                                                                                            this.o.W = null;
                                                                                            v0 = this.o;
                                                                                        }
                                                                                        var4_4 = v0.aW.g();
                                                                                        this.o.ao = var3_2.a(var4_4, var1_1);
                                                                                        var6_5 = var3_2.c(var1_1);
                                                                                        var7_6 = 0;
                                                                                        var8_7 = 3;
                                                                                        var9_8 = var4_4;
                                                                                        v1 = this.o.aW.k();
                                                                                        if (var2_3 != null) break block47;
                                                                                        if (v1 == 0) break block48;
                                                                                        var4_4 = var9_8 = 6.0;
                                                                                        if (var2_3 == null) break block49;
                                                                                    }
                                                                                    v1 = (cfr_temp_0 = var4_4 - 3.0) == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                                                                }
                                                                                if (var2_3 != null) break block50;
                                                                                if (v1 <= 0) break block49;
                                                                                v1 = 1;
                                                                            }
                                                                            var7_6 = v1;
                                                                        }
                                                                        v2 = this.o.ao;
                                                                        if (var2_3 != null) break block51;
                                                                        if (v2 == null) break block52;
                                                                        v2 = this.o.ao;
                                                                    }
                                                                    var9_8 = v2.c.d(var6_5);
                                                                }
                                                                var11_9 = var3_2.b(1.0f);
                                                                var12_10 = var6_5.c(var11_9.e * var4_4, var11_9.d * var4_4, var11_9.b * var4_4);
                                                                this.O = null;
                                                                var13_11 = null;
                                                                var14_12 = 1.0f;
                                                                var15_13 = this.o.e.a(var3_2, var3_2.m().d(var11_9.e * var4_4, var11_9.d * var4_4, var11_9.b * var4_4).a(1.0, 1.0, 1.0), (Predicate<? super net.minecraft.U.x>)Predicates.and(net.minecraft.ar.e.e, (Predicate)new V(this)));
                                                                var16_14 = var9_8;
                                                                if (cj.b.i.a(bJ.class).i()) {
                                                                    return;
                                                                }
                                                                for (net.minecraft.U.x var19_17 : var15_13) {
                                                                    block57: {
                                                                        block62: {
                                                                            block60: {
                                                                                block61: {
                                                                                    block59: {
                                                                                        block58: {
                                                                                            block56: {
                                                                                                block55: {
                                                                                                    block53: {
                                                                                                        block54: {
                                                                                                            if (var2_3 != null) return;
                                                                                                            v3 = var19_17 instanceof net.minecraft.J.n;
                                                                                                            if (var2_3 != null) break block53;
                                                                                                            if (!v3) break block54;
                                                                                                            v3 = cj.b.i.a(ck.class).i();
                                                                                                            if (var2_3 != null) break block53;
                                                                                                            if (v3) {
                                                                                                                v3 = ck.k.l();
                                                                                                                if (var2_3 == null) {
                                                                                                                    if (v3) {
                                                                                                                        return;
                                                                                                                    } else {
                                                                                                                        ** GOTO lbl60
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    ** GOTO lbl59
                                                                                                                }
                                                                                                            }
                                                                                                            break block54;
lbl59:
                                                                                                            // 2 sources

                                                                                                            break block53;
                                                                                                        }
                                                                                                        v3 = cj.b.i.a(bn.class).i();
                                                                                                    }
                                                                                                    if (!v3) break block55;
                                                                                                    v4 = bn.l;
                                                                                                    if (var2_3 != null) break block56;
                                                                                                    if (v4 != null && bn.x.l()) break block57;
                                                                                                }
                                                                                                v4 = var19_17;
                                                                                            }
                                                                                            var20_18 = v4.m().a(var19_17.aw());
                                                                                            var21_19 = var20_18.b(var6_5, var12_10);
                                                                                            v5 = var20_18.b(var6_5);
                                                                                            if (var2_3 != null) break block58;
                                                                                            if (v5 == 0) break block59;
                                                                                            cfr_temp_1 = var16_14 - 0.0;
                                                                                            v5 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                                                                        }
                                                                                        if (v5 < 0) break block57;
                                                                                        this.O = var19_17;
                                                                                        v6 = var21_19;
                                                                                        if (var2_3 != null) ** GOTO lbl86
                                                                                        if (v6 == null) {
                                                                                            v7 = var6_5;
                                                                                        } else {
                                                                                            v6 = var21_19;
lbl86:
                                                                                            // 2 sources

                                                                                            v7 = v6.c;
                                                                                        }
                                                                                        var13_11 = v7;
                                                                                        var16_14 = 0.0;
                                                                                        if (var2_3 == null) break block57;
                                                                                    }
                                                                                    if (var21_19 == null) break block57;
                                                                                    var22_20 = var6_5.d(var21_19.c);
                                                                                    v8 = var22_20 == var16_14 ? 0 : (var22_20 < var16_14 ? -1 : 1);
                                                                                    if (var2_3 != null) break block60;
                                                                                    if (v8 < 0) break block61;
                                                                                    cfr_temp_2 = var16_14 - 0.0;
                                                                                    v8 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                                                                    if (var2_3 != null) break block60;
                                                                                    if (v8 != false) break block57;
                                                                                }
                                                                                v8 = (double)false;
                                                                            }
                                                                            var24_21 = v8;
                                                                            v9 = cq.b3.b();
                                                                            if (var2_3 == null) {
                                                                                if (v9) {
                                                                                    var24_21 = (double)cq.g(var19_17, cq.b3, new Object[0]);
                                                                                }
                                                                                v9 = var24_21;
                                                                            }
                                                                            if (v9 || var19_17.aX() != var3_2.aX()) break block62;
                                                                            if (var16_14 != 0.0) break block57;
                                                                            this.O = var19_17;
                                                                            var13_11 = var21_19.c;
                                                                            if (var2_3 == null) break block57;
                                                                        }
                                                                        this.O = var19_17;
                                                                        var13_11 = var21_19.c;
                                                                        var16_14 = var22_20;
                                                                    }
                                                                    if (var2_3 == null) continue;
                                                                }
                                                                var18_16 = 0.0;
                                                                v10 = this.O;
                                                                if (var2_3 != null) break block63;
                                                                if (v10 == null) break block64;
                                                                v11 = cj.b.g.c(this.O.g());
                                                                if (var2_3 != null) break block65;
                                                                if (!v11) break block66;
                                                                var18_16 = 3.0;
                                                                if (var2_3 == null) break block64;
                                                            }
                                                            v11 = cj.b.i.a(bG.class).i();
                                                        }
                                                        var18_16 = v11 != false ? (double)bG.k.r() : 3.0;
                                                    }
                                                    v10 = this.O;
                                                }
                                                if (var2_3 != null) break block67;
                                                if (v10 == null) break block68;
                                                v12 = var7_6;
                                                if (var2_3 != null) break block69;
                                                if (v12 == 0) break block68;
                                                cfr_temp_3 = var6_5.d(var13_11) - var18_16;
                                                v12 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 > 0.0 ? 1 : -1);
                                            }
                                            if (v12 > 0) {
                                                this.O = null;
                                                this.o.ao = new i(net.minecraft.k.j.MISS, var13_11, null, new n(var13_11));
                                            }
                                        }
                                        v13 = this;
                                        if (var2_3 != null) break block70;
                                        v10 = v13.O;
                                    }
                                    if (v10 == null) break block71;
                                    v14 = var16_14 == var9_8 ? 0 : (var16_14 < var9_8 ? -1 : 1);
                                    if (var2_3 != null) break block72;
                                    if (v14 < 0) break block73;
                                    v15 = this.o;
                                    if (var2_3 != null) break block74;
                                    if (v15.ao != null) break block71;
                                }
                                this.o.ao = new i(this.O, var13_11);
                                v16 = this;
                                if (var2_3 != null) break block75;
                                v14 = (double)(v16.O instanceof B);
                            }
                            if (v14 != false) break block76;
                            v13 = this;
                            if (var2_3 != null) break block70;
                            if (!(v13.O instanceof net.minecraft.J.l)) break block71;
                        }
                        v16 = this;
                    }
                    v16.o.W = this.O;
                }
                v13 = this;
            }
            v15 = v13.o;
        }
        v15.an.c();
    }

    private void a(int n2, int n3, float f10) {
        block3: {
            int n4;
            block4: {
                x x2;
                String string;
                block2: {
                    string = net.minecraft.client.a.I.j();
                    x2 = this;
                    if (string != null) break block2;
                    if (x2.y == null) break block3;
                    x2 = this;
                }
                n4 = x2.h;
                if (string != null) break block4;
                if (n4 <= 0) break block3;
                n4 = 40 - this.h;
            }
            int n5 = n4;
            float f11 = ((float)n5 + f10) / 40.0f;
            float f12 = f11 * f11;
            float f13 = f11 * f12;
            float f14 = 10.25f * f13 * f12 + -24.95f * f12 * f12 + 25.5f * f13 + -13.8f * f12 + 4.0f * f11;
            float f15 = f14 * (float)Math.PI;
            float f16 = this.av * (float)(n2 / 4);
            float f17 = this.W * (float)(n3 / 4);
            net.minecraft.client.a.v.e();
            net.minecraft.client.a.v.M();
            net.minecraft.client.a.v.O();
            net.minecraft.client.a.v.t();
            net.minecraft.client.a.v.E();
            a0.c();
            net.minecraft.client.a.v.b((float)(n2 / 2) + f16 * net.minecraft.k.h.e(net.minecraft.k.h.g(f15 * 2.0f)), (float)(n3 / 2) + f17 * net.minecraft.k.h.e(net.minecraft.k.h.g(f15 * 2.0f)), -50.0f);
            float f18 = 50.0f + 175.0f * net.minecraft.k.h.g(f15);
            net.minecraft.client.a.v.d(f18, -f18, f18);
            net.minecraft.client.a.v.a(900.0f * net.minecraft.k.h.e(net.minecraft.k.h.g(f15)), 0.0f, 1.0f, 0.0f);
            net.minecraft.client.a.v.a(6.0f * net.minecraft.k.h.c(f11 * 8.0f), 1.0f, 0.0f, 0.0f);
            net.minecraft.client.a.v.a(6.0f * net.minecraft.k.h.c(f11 * 8.0f), 0.0f, 0.0f, 1.0f);
            this.o.Y().a(this.y, net.minecraft.client.x.d.FIXED);
            net.minecraft.client.a.v.i();
            net.minecraft.client.a.v.B();
            a0.a();
            net.minecraft.client.a.v.c();
            net.minecraft.client.a.v.n();
        }
    }

    private void b() {
        block17: {
            net.minecraft.client.E.l l2;
            double d10;
            double d11;
            double d12;
            block33: {
                x x2;
                block31: {
                    block32: {
                        int n2;
                        n n3;
                        net.minecraft.client.E.l l3;
                        String string;
                        block30: {
                            int n4;
                            block15: {
                                block29: {
                                    int n5;
                                    int n6;
                                    int n7;
                                    block21: {
                                        int n8;
                                        block20: {
                                            int n9;
                                            block18: {
                                                block19: {
                                                    boolean bl2;
                                                    float f10;
                                                    block16: {
                                                        f10 = this.o.e.a(1.0f);
                                                        string = net.minecraft.client.a.I.j();
                                                        bl2 = fU.a_();
                                                        if (string == null) {
                                                            float f11;
                                                            if (!bl2) {
                                                                f10 /= 2.0f;
                                                            }
                                                            bl2 = (f11 = f10 - 0.0f) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                                                        }
                                                        if (string != null) break block16;
                                                        if (!bl2) break block17;
                                                        bl2 = fU.a6();
                                                    }
                                                    if (!bl2) break block17;
                                                    this.M.setSeed((long)this.f * 312987231L);
                                                    net.minecraft.U.x x3 = this.o.Z();
                                                    l3 = this.o.e;
                                                    n3 = new n(x3);
                                                    int n10 = 10;
                                                    d12 = 0.0;
                                                    d11 = 0.0;
                                                    d10 = 0.0;
                                                    n7 = 0;
                                                    n6 = (int)(100.0f * f10 * f10);
                                                    int n9 = this.o.ac.bC;
                                                    n9 = 1;
                                                    if (string != null) break block18;
                                                    if (n8 != n9) break block19;
                                                    n6 >>= 1;
                                                    if (string == null) break block20;
                                                }
                                                n8 = this.o.ac.bC;
                                                if (string != null) break block21;
                                                n9 = 2;
                                            }
                                            if (n8 == n9) {
                                                n6 = 0;
                                            }
                                        }
                                        n8 = n5 = 0;
                                    }
                                    while (n5 < n6) {
                                        block22: {
                                            block23: {
                                                net.minecraft.k.k k2;
                                                double d13;
                                                double d14;
                                                n n11;
                                                block27: {
                                                    net.minecraft.Z.i i2;
                                                    n n12;
                                                    block28: {
                                                        net.minecraft.Z.i i3;
                                                        block26: {
                                                            int n10;
                                                            block25: {
                                                                net.minecraft.A.h h2;
                                                                block24: {
                                                                    n11 = l3.d(n3.a(this.M.nextInt(10) - this.M.nextInt(10), 0, this.M.nextInt(10) - this.M.nextInt(10)));
                                                                    h2 = l3.c(n11);
                                                                    n12 = n11.k();
                                                                    i3 = l3.d(n12);
                                                                    if (string != null) break block22;
                                                                    int n4 = n11.b();
                                                                    n4 = n3.b() + 10;
                                                                    if (string != null) break block15;
                                                                    if (n2 > n4) break block23;
                                                                    n10 = n11.b();
                                                                    if (string != null) break block24;
                                                                    if (n10 < n3.b() - 10) break block23;
                                                                    n10 = h2.p() ? 1 : 0;
                                                                }
                                                                if (string != null) break block25;
                                                                if (n10 == 0) break block23;
                                                                float f12 = h2.a(n11) - 0.15f;
                                                                n10 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                                                            }
                                                            if (n10 < 0) break block23;
                                                            d14 = this.M.nextDouble();
                                                            d13 = this.M.nextDouble();
                                                            k2 = i3.f(l3, n12);
                                                            i2 = i3;
                                                            if (string != null) break block26;
                                                            if (i2.o() == net.minecraft.ac.c.g) break block27;
                                                            i2 = i3;
                                                        }
                                                        if (string != null) break block28;
                                                        if (i2.b() == net.minecraft.u.g.bR) break block27;
                                                        i2 = i3;
                                                    }
                                                    if (i2.o() == net.minecraft.ac.c.A) break block23;
                                                    ++n7;
                                                    x x3 = this;
                                                    if (string == null) {
                                                        if (x3.M.nextInt(n7) == 0) {
                                                            d12 = (double)n12.e() + d14;
                                                            d11 = (double)((float)n12.b() + 0.1f) + k2.a - 1.0;
                                                            d10 = (double)n12.a() + d13;
                                                        }
                                                        x3 = this;
                                                    }
                                                    x3.o.e.a(aH.WATER_DROP, (double)n12.e() + d14, (double)((float)n12.b() + 0.1f) + k2.a, (double)n12.a() + d13, 0.0, 0.0, 0.0, new int[0]);
                                                    if (string == null) break block23;
                                                }
                                                this.o.e.a(aH.SMOKE_NORMAL, (double)n11.e() + d14, (double)((float)n11.b() + 0.1f) - k2.b, (double)n11.a() + d13, 0.0, 0.0, 0.0, new int[0]);
                                            }
                                            ++n5;
                                        }
                                        if (string == null) continue;
                                    }
                                    n2 = n7;
                                    if (string != null) break block29;
                                    if (n2 <= 0) break block17;
                                    n2 = this.M.nextInt(3);
                                }
                                if (string != null) break block30;
                                int n4 = this.P;
                                n4 = n4;
                                this.P = n11 + 1;
                            }
                            if (n2 >= n4) break block17;
                            x2 = this;
                            if (string != null) break block31;
                            x2.P = 0;
                            double d13 = d11 - (double)(n3.b() + 1);
                            n2 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                        }
                        if (n2 <= 0) break block32;
                        l2 = l3;
                        if (string != null) break block33;
                        if (l2.d(n3).b() <= net.minecraft.k.h.d((float)n3.b())) break block32;
                        this.o.e.a(d12, d11, d10, net.minecraft.u.E.a, ay.WEATHER, 0.1f, 0.5f, false);
                        if (string == null) break block17;
                    }
                    x2 = this;
                }
                l2 = x2.o.e;
            }
            l2.a(d12, d11, d10, net.minecraft.u.E.b0, ay.WEATHER, 0.2f, 1.0f, false);
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public void i() {
        block0: {
            net.minecraft.client.a.v.u(net.minecraft.client.a.as.p);
            net.minecraft.client.a.v.L();
            net.minecraft.client.a.v.u(net.minecraft.client.a.as.U);
            if (!fU.ag()) break block0;
            cS.aJ();
        }
    }
}

