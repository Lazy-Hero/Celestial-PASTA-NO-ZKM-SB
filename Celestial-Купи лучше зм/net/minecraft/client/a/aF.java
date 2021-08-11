/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonSyntaxException
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.vector.Matrix4f
 *  org.lwjgl.util.vector.Vector3f
 *  org.lwjgl.util.vector.Vector4f
 */
package net.minecraft.client.a;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonSyntaxException;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.W.K;
import net.minecraft.W.d_;
import net.minecraft.ac.c;
import net.minecraft.ah.k;
import net.minecraft.ah.p;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.Z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aH;
import net.minecraft.ar.ay;
import net.minecraft.c.f;
import net.minecraft.c.l;
import net.minecraft.client.D.x;
import net.minecraft.client.Q;
import net.minecraft.client.a.G;
import net.minecraft.client.a.I;
import net.minecraft.client.a.M;
import net.minecraft.client.a.T;
import net.minecraft.client.a.W;
import net.minecraft.client.a.Y;
import net.minecraft.client.a.a0;
import net.minecraft.client.a.a9;
import net.minecraft.client.a.aC;
import net.minecraft.client.a.aK;
import net.minecraft.client.a.aM;
import net.minecraft.client.a.aZ;
import net.minecraft.client.a.ae;
import net.minecraft.client.a.ar;
import net.minecraft.client.a.g;
import net.minecraft.client.a.o;
import net.minecraft.client.a.v;
import net.minecraft.client.a.y;
import net.minecraft.client.j.u;
import net.minecraft.client.k.s;
import net.minecraft.client.r.a4;
import net.minecraft.client.u.av;
import net.minecraft.client.y.b;
import net.minecraft.client.y.d;
import net.minecraft.client.y.e;
import net.minecraft.k.h;
import net.minecraft.k.i;
import net.minecraft.k.j;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.o.a;
import net.minecraft.u.E;
import net.minecraft.w.P;
import net.minecraft.w.aV;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aF
implements x,
k {
    private /* synthetic */ int q;
    private final /* synthetic */ List an;
    private /* synthetic */ double ah;
    private /* synthetic */ int U;
    private final /* synthetic */ List k;
    private /* synthetic */ int av;
    private /* synthetic */ double f;
    private static final /* synthetic */ net.minecraft.ar.v aC;
    private /* synthetic */ net.minecraft.client.y.c u;
    private /* synthetic */ double i;
    private /* synthetic */ Set<s> ak;
    private /* synthetic */ double p;
    private /* synthetic */ List<T> s;
    private /* synthetic */ List b;
    public /* synthetic */ boolean a;
    private /* synthetic */ List y;
    private final /* synthetic */ List ai;
    public /* synthetic */ boolean aB;
    private /* synthetic */ net.minecraft.o.k aj;
    private final /* synthetic */ net.minecraft.client.j.c[] C;
    private /* synthetic */ double ab;
    private /* synthetic */ int I;
    private /* synthetic */ int K;
    private static final /* synthetic */ net.minecraft.ar.v N;
    public /* synthetic */ net.minecraft.U.x x;
    private /* synthetic */ double X;
    public final /* synthetic */ Q l;
    private /* synthetic */ int Y;
    private /* synthetic */ net.minecraft.client.s.b M;
    private /* synthetic */ int F;
    private /* synthetic */ net.minecraft.client.G.c ar;
    private final /* synthetic */ u w;
    private final /* synthetic */ a9 e;
    private final /* synthetic */ Vector4f[] j;
    private final /* synthetic */ List L;
    private /* synthetic */ int ap;
    private /* synthetic */ int S;
    private /* synthetic */ double r;
    private /* synthetic */ net.minecraft.client.y.c W;
    private final /* synthetic */ Deque E;
    public /* synthetic */ Set ac;
    private /* synthetic */ net.minecraft.client.y.c A;
    private /* synthetic */ int aa;
    private static final /* synthetic */ Set c;
    private static final /* synthetic */ Logger P;
    private final /* synthetic */ List at;
    private /* synthetic */ boolean aA;
    static /* synthetic */ Deque<T> n;
    private /* synthetic */ double aq;
    private /* synthetic */ net.minecraft.client.s.d al;
    private /* synthetic */ double ag;
    private final /* synthetic */ List B;
    private /* synthetic */ int az;
    private /* synthetic */ net.minecraft.client.E.l ax;
    private /* synthetic */ int G;
    public /* synthetic */ Set Q;
    private static final /* synthetic */ net.minecraft.ar.v as;
    private /* synthetic */ double Z;
    private /* synthetic */ int au;
    private /* synthetic */ aK ao;
    public final /* synthetic */ Map<Integer, g> ay;
    private /* synthetic */ int m;
    private /* synthetic */ boolean am;
    private final /* synthetic */ Set<net.minecraft.N.y> J;
    /* synthetic */ net.minecraft.client.k.j T;
    private final /* synthetic */ e d;
    private /* synthetic */ double ae;
    private /* synthetic */ int g;
    private static final /* synthetic */ net.minecraft.ar.v ad;
    private /* synthetic */ aC af;
    private /* synthetic */ boolean H;
    private final /* synthetic */ e9 D;
    private static final /* synthetic */ net.minecraft.ar.v h;
    private final /* synthetic */ Map<n, net.minecraft.client.e.j> o;
    private final /* synthetic */ Set<n> aw;
    private /* synthetic */ Long2ObjectMap<a> z;
    private /* synthetic */ net.minecraft.client.k.b v;
    private final /* synthetic */ eB O;
    private /* synthetic */ int R;
    public /* synthetic */ boolean V;
    private final /* synthetic */ a4 t;

    public int l() {
        return this.af.e.length;
    }

    public void a(int n2, int n3) {
        block2: {
            net.minecraft.client.s.d d10;
            block3: {
                String string = net.minecraft.client.a.I.j();
                if (!net.minecraft.client.a.as.m) break block2;
                d10 = this.al;
                if (string != null) break block3;
                if (d10 == null) break block2;
                d10 = this.al;
            }
            d10.a(n2, n3);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean r() {
        String string = net.minecraft.client.a.I.j();
        boolean bl2 = fU.aw();
        if (string != null) return bl2;
        if (bl2) return false;
        bl2 = fU.ag();
        if (string != null) return bl2;
        if (bl2) return false;
        bl2 = fU.m();
        if (string != null) return bl2;
        if (bl2) return false;
        aF aF2 = this;
        if (string == null) {
            if (aF2.M == null) return false;
            aF2 = this;
        }
        if (string == null) {
            if (aF2.al == null) return false;
            aF2 = this;
        }
        if (aF2.l.s == null) return false;
        return true;
    }

    @Override
    public void a(int n2, n n3, int n4) {
        block7: {
            block3: {
                g g10;
                String string;
                block6: {
                    g g11;
                    block4: {
                        Object object;
                        block5: {
                            int n5;
                            block2: {
                                string = net.minecraft.client.a.I.j();
                                n5 = n4;
                                if (string != null) break block2;
                                if (n5 < 0) break block3;
                                n5 = n4;
                            }
                            if (n5 >= 10) break block3;
                            g11 = this.ay.get(n2);
                            object = g11;
                            if (string != null) break block4;
                            if (object == null) break block5;
                            object = g11.b();
                            if (string != null) break block4;
                            if (((m)object).e() != n3.e()) break block5;
                            object = g11.b();
                            if (string != null) break block4;
                            if (((m)object).b() != n3.b()) break block5;
                            g10 = g11;
                            if (string != null) break block6;
                            if (g10.b().a() == n3.a()) break block4;
                        }
                        g11 = new g(n2, n3);
                        object = this.ay.put(n2, g11);
                    }
                    g11.a(n4);
                    g10 = g11;
                }
                g10.b(this.aa);
                if (string == null) break block7;
            }
            this.ay.remove(n2);
        }
    }

    public static void a(double d10, double d11, double d12, double d13, double d14, double d15, float f10, float f11, float f12, float f13) {
        GL11.glPushMatrix();
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)3042);
        GL11.glLineWidth((float)1.0f);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        W w2 = net.minecraft.client.a.W.c();
        I i2 = w2.b();
        i2.a(3, net.minecraft.client.y.b.i);
        aF.b(i2, d10, d11, d12, d13, d14, d15, f10, f11, f12, f13);
        w2.a();
        GL11.glLineWidth((float)4.0f);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    static {
        P = LogManager.getLogger();
        N = new net.minecraft.ar.v("textures/environment/moon_phases.png");
        as = new net.minecraft.ar.v("textures/environment/sun.png");
        h = new net.minecraft.ar.v("textures/environment/clouds.png");
        aC = new net.minecraft.ar.v("textures/environment/end_sky.png");
        ad = new net.minecraft.ar.v("textures/misc/forcefield.png");
        c = Collections.unmodifiableSet(new HashSet<aA>(Arrays.asList(net.minecraft.ar.aA.VALUES)));
        n = new ArrayDeque<T>();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(net.minecraft.U.x var1_1, double var2_2, net.minecraft.client.G.b var4_3, int var5_4, boolean var6_5) {
        block140: {
            block172: {
                block171: {
                    block137: {
                        block154: {
                            block160: {
                                block155: {
                                    block158: {
                                        block159: {
                                            block156: {
                                                block157: {
                                                    block136: {
                                                        block148: {
                                                            block135: {
                                                                block147: {
                                                                    block146: {
                                                                        block145: {
                                                                            block143: {
                                                                                block144: {
                                                                                    block141: {
                                                                                        block142: {
                                                                                            var7_6 = net.minecraft.client.a.I.j();
                                                                                            v0 = this;
                                                                                            if (var7_6 == null) {
                                                                                                if (v0.l.ac.bf != this.ap) {
                                                                                                    this.d();
                                                                                                }
                                                                                                v0 = this;
                                                                                            }
                                                                                            v0.ax.H.b("camera");
                                                                                            var8_7 = var1_1.a - this.i;
                                                                                            var10_8 = var1_1.aF - this.ah;
                                                                                            var12_9 = var1_1.ax - this.p;
                                                                                            v1 = this;
                                                                                            if (var7_6 != null) break block141;
                                                                                            if (v1.G != var1_1.v) break block142;
                                                                                            v1 = this;
                                                                                            if (var7_6 != null) break block141;
                                                                                            if (v1.U != var1_1.q) break block142;
                                                                                            v1 = this;
                                                                                            if (var7_6 != null) break block141;
                                                                                            if (v1.I != var1_1.y) break block142;
                                                                                            cfr_temp_0 = var8_7 * var8_7 + var10_8 * var10_8 + var12_9 * var12_9 - 16.0;
                                                                                            v2 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                                                                            if (var7_6 != null) break block143;
                                                                                            if (v2 <= 0) break block144;
                                                                                        }
                                                                                        this.i = var1_1.a;
                                                                                        this.ah = var1_1.aF;
                                                                                        this.p = var1_1.ax;
                                                                                        this.G = var1_1.v;
                                                                                        this.U = var1_1.q;
                                                                                        this.I = var1_1.y;
                                                                                        v1 = this;
                                                                                    }
                                                                                    v1.af.a(var1_1.a, var1_1.ax);
                                                                                }
                                                                                v2 = fU.bi();
                                                                            }
                                                                            if (v2 != 0) {
                                                                                gk.a(this);
                                                                            }
                                                                            this.ax.H.a("renderlistcamera");
                                                                            var14_10 = var1_1.am + (var1_1.a - var1_1.am) * var2_2;
                                                                            var16_11 = var1_1.af + (var1_1.aF - var1_1.af) * var2_2;
                                                                            var18_12 = var1_1.n + (var1_1.ax - var1_1.n) * var2_2;
                                                                            this.ao.a(var14_10, var16_11, var18_12);
                                                                            this.ax.H.a("cull");
                                                                            v3 = this;
                                                                            if (var7_6 == null) {
                                                                                if (v3.ar != null) {
                                                                                    var20_13 = new net.minecraft.client.G.a(this.ar);
                                                                                    var20_13.a(this.e.b, this.e.a, this.e.c);
                                                                                    var4_3 = var20_13;
                                                                                }
                                                                                v3 = this;
                                                                            }
                                                                            v3.l.an.a("culling");
                                                                            var20_13 = new n(var14_10, var16_11 + (double)var1_1.l(), var18_12);
                                                                            var21_14 = this.af.a((n)var20_13);
                                                                            new n(net.minecraft.k.h.f(var14_10 / 16.0) * 16, net.minecraft.k.h.f(var16_11 / 16.0) * 16, net.minecraft.k.h.f(var18_12 / 16.0) * 16);
                                                                            v4 = this.V;
                                                                            if (var7_6 != null) break block145;
                                                                            if (v4) ** GOTO lbl-1000
                                                                            v4 = this.ak.isEmpty();
                                                                            if (var7_6 != null) break block145;
                                                                            if (!v4) ** GOTO lbl-1000
                                                                            cfr_temp_1 = var1_1.a - this.r;
                                                                            v4 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                                                            if (var7_6 != null) break block145;
                                                                            if (v4) ** GOTO lbl-1000
                                                                            cfr_temp_2 = var1_1.aF - this.X;
                                                                            v4 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                                                            if (var7_6 != null) break block145;
                                                                            if (!v4) {
                                                                                cfr_temp_3 = var1_1.ax - this.ag;
                                                                                v4 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 > 0.0 ? 1 : -1);
                                                                                if (var7_6 == null) {
                                                                                    if (!v4) {
                                                                                        cfr_temp_4 = (double)var1_1.at - this.Z;
                                                                                        v4 = cfr_temp_4 == 0.0 ? 0 : (cfr_temp_4 > 0.0 ? 1 : -1);
                                                                                        if (var7_6 == null) {
                                                                                            if (!v4) {
                                                                                                cfr_temp_5 = (double)var1_1.e - this.ab;
                                                                                                v4 = cfr_temp_5 == 0.0 ? 0 : (cfr_temp_5 > 0.0 ? 1 : -1);
                                                                                                if (var7_6 == null) {
                                                                                                    ** if (!v4) goto lbl-1000
                                                                                                } else {
                                                                                                    ** GOTO lbl88
                                                                                                }
                                                                                            } else {
                                                                                                ** GOTO lbl87
                                                                                            }
                                                                                        } else {
                                                                                            ** GOTO lbl86
                                                                                        }
                                                                                    } else {
                                                                                        ** GOTO lbl85
                                                                                    }
                                                                                } else {
                                                                                    ** GOTO lbl84
                                                                                }
                                                                            }
                                                                            ** GOTO lbl-1000
lbl84:
                                                                            // 2 sources

                                                                            break block145;
lbl85:
                                                                            // 2 sources

                                                                            ** GOTO lbl-1000
lbl86:
                                                                            // 2 sources

                                                                            break block145;
lbl87:
                                                                            // 2 sources

                                                                            ** GOTO lbl-1000
lbl88:
                                                                            // 2 sources

                                                                            break block145;
lbl-1000:
                                                                            // 7 sources

                                                                            {
                                                                                v4 = true;
                                                                                ** GOTO lbl92
                                                                            }
lbl-1000:
                                                                            // 1 sources

                                                                            {
                                                                                v4 = false;
                                                                            }
                                                                        }
                                                                        this.V = v4;
                                                                        this.r = var1_1.a;
                                                                        this.X = var1_1.aF;
                                                                        this.ag = var1_1.ax;
                                                                        this.Z = var1_1.at;
                                                                        this.ab = var1_1.e;
                                                                        var22_15 = this.ar != null ? 1 : 0;
                                                                        this.l.an.a("update");
                                                                        fi.k.c();
                                                                        v5 = var23_16 = this.m();
                                                                        if (var7_6 == null) {
                                                                            if (v5 != this.m) {
                                                                                this.m = var23_16;
                                                                                this.V = true;
                                                                            }
                                                                            v5 = cS.dn ? 1 : 0;
                                                                        }
                                                                        if (var7_6 != null) break block146;
                                                                        if (v5 == 0) break block147;
                                                                        this.s = this.k;
                                                                        this.y = this.ai;
                                                                        this.b = this.at;
                                                                        v5 = var22_15;
                                                                    }
                                                                    if (var7_6 != null) break block148;
                                                                    if (v5 != 0) break block135;
                                                                    v5 = this.V ? 1 : 0;
                                                                    if (var7_6 != null) break block148;
                                                                    if (v5 == 0) break block135;
                                                                    this.s.clear();
                                                                    this.y.clear();
                                                                    this.b.clear();
                                                                    var24_17 = new aw();
                                                                    var25_18 = dw.a(this.ax, var2_2, var1_1, this.ap, this.af);
                                                                    while (var25_18.hasNext()) {
                                                                        block150: {
                                                                            block153: {
                                                                                block151: {
                                                                                    block152: {
                                                                                        block149: {
                                                                                            var26_24 = var25_18.next();
                                                                                            if (var7_6 != null) break block135;
                                                                                            v6 = var26_24;
                                                                                            if (var7_6 != null) break block149;
                                                                                            if (v6 == null) break block150;
                                                                                            var24_17.a(var26_24);
                                                                                            v6 = var26_24;
                                                                                        }
                                                                                        v7 = v6.j.a();
                                                                                        if (var7_6 != null) break block151;
                                                                                        if (!v7) break block152;
                                                                                        v8 = var26_24;
                                                                                        if (var7_6 != null) break block153;
                                                                                        if (!v8.c()) break block151;
                                                                                    }
                                                                                    v7 = this.s.add(var24_17.a());
                                                                                }
                                                                                v8 = var26_24;
                                                                            }
                                                                            var27_32 = v8.g();
                                                                            v9 = fr.a(this.ax.b((n)var27_32));
                                                                            if (var7_6 == null) {
                                                                                if (v9 != 0) {
                                                                                    this.y.add(var24_17.a());
                                                                                }
                                                                                v9 = var26_24.b().b().size();
                                                                            }
                                                                            if (var7_6 == null && v9 > 0) {
                                                                                v9 = this.b.add(var24_17.a()) ? 1 : 0;
                                                                            }
                                                                        }
                                                                        if (var7_6 == null) continue;
                                                                    }
                                                                    if (var7_6 == null) break block135;
                                                                }
                                                                this.s = this.B;
                                                                this.y = this.an;
                                                                this.b = this.L;
                                                            }
                                                            v5 = var22_15;
                                                        }
                                                        if (var7_6 != null) break block137;
                                                        if (v5 != 0) break block154;
                                                        v5 = this.V ? 1 : 0;
                                                        if (var7_6 != null) break block137;
                                                        if (v5 == 0) break block154;
                                                        v5 = cS.dn ? 1 : 0;
                                                        if (var7_6 != null) break block137;
                                                        if (v5 != 0) break block154;
                                                        this.V = false;
                                                        for (T var25_20 : this.s) {
                                                            this.a(var25_20);
                                                            if (var7_6 == null) {
                                                                if (var7_6 == null) continue;
                                                            }
                                                            break block136;
                                                        }
                                                        this.s.clear();
                                                        this.y.clear();
                                                        this.b.clear();
                                                        this.E.clear();
                                                    }
                                                    var24_17 = this.E;
                                                    net.minecraft.U.x.a(net.minecraft.k.h.b((double)this.l.ac.bf / 8.0, 1.0, 2.5));
                                                    var25_21 = this.l.a4;
                                                    if (var21_14 == null) break block155;
                                                    var26_25 = false;
                                                    var27_32 = new T(var21_14, null, 0);
                                                    var28_35 = aF.c;
                                                    v10 = var28_35.size();
                                                    if (var7_6 == null) {
                                                        if (v10 == 1) {
                                                            var29_37 = this.a(var1_1, var2_2);
                                                            var30_39 = net.minecraft.ar.aA.a(var29_37.x, var29_37.y, var29_37.z).h();
                                                            var28_35.remove(var30_39);
                                                        }
                                                        v10 = var28_35.isEmpty() ? 1 : 0;
                                                    }
                                                    if (var7_6 == null) {
                                                        if (v10 != 0) {
                                                            var26_26 = true;
                                                        }
                                                        v10 = var26_26;
                                                    }
                                                    if (var7_6 != null) break block156;
                                                    if (v10 == 0) break block157;
                                                    v10 = var6_5 ? 1 : 0;
                                                    if (var7_6 != null) break block156;
                                                    if (v10 != 0) break block157;
                                                    this.s.add((T)var27_32);
                                                    if (var7_6 == null) break block158;
                                                }
                                                v10 = var6_5 ? 1 : 0;
                                            }
                                            if (var7_6 != null) break block158;
                                            if (v10 == 0) break block159;
                                            v10 = this.ax.d((n)var20_13).i() ? 1 : 0;
                                            if (var7_6 != null) break block158;
                                            if (v10 != 0) {
                                                var25_22 = false;
                                            }
                                        }
                                        var21_14.b(var5_4);
                                        v10 = var24_17.add(var27_32) ? 1 : 0;
                                    }
                                    if (var7_6 == null) break block160;
                                }
                                v11 = var20_13.b();
                                if (var7_6 == null) {
                                    v11 = v11 > 0 ? 248 : 8;
                                }
                                var26_27 = v11;
                                var27_33 = -this.ap;
                                while (var27_33 <= this.ap) {
                                    block138: {
                                        v5 = -this.ap;
                                        if (var7_6 != null) break block137;
                                        var28_36 = v5;
                                        while (var28_36 <= this.ap) {
                                            var29_37 = this.af.a(new n((var27_33 << 4) + 8, var26_27, (var28_36 << 4) + 8));
                                            if (var7_6 == null) {
                                                if (var7_6 == null) {
                                                    if (var29_37 != null) {
                                                        v12 = var4_3.a(var29_37.d);
                                                        if (var7_6 == null && v12) {
                                                            var29_37.b(var5_4);
                                                            v12 = var24_17.add(new T((s)var29_37, null, 0));
                                                        }
                                                    }
                                                    ++var28_36;
                                                }
                                                if (var7_6 == null) continue;
                                            }
                                            break block138;
                                        }
                                        ++var27_33;
                                    }
                                    if (var7_6 == null) continue;
                                }
                            }
                            this.l.an.b("iteration");
                            var26_29 = net.minecraft.ar.aA.VALUES;
                            var27_34 = var26_29.length;
                            while (!var24_17.isEmpty()) {
                                block139: {
                                    block163: {
                                        block164: {
                                            block161: {
                                                block162: {
                                                    var28_35 = (T)var24_17.poll();
                                                    var29_37 = var28_35.a;
                                                    var30_39 = var28_35.c;
                                                    var31_40 = false;
                                                    var32_41 = var29_37.j;
                                                    v5 = var32_41.a() ? 1 : 0;
                                                    if (var7_6 != null) break block137;
                                                    if (var7_6 != null) break block161;
                                                    if (v5 == 0) break block162;
                                                    v13 = var29_37.c();
                                                    if (var7_6 != null) break block163;
                                                    if (v13 == 0) break block164;
                                                }
                                                this.s.add((T)var28_35);
                                                v14 = true;
                                            }
                                            var31_40 = v14;
                                        }
                                        v13 = fr.a(var29_37.a(this.ax));
                                    }
                                    if (var7_6 == null) {
                                        if (v13 != 0) {
                                            this.y.add(var28_35);
                                            var31_40 = true;
                                        }
                                        v13 = var32_41.b().size();
                                    }
                                    if (var7_6 == null) {
                                        if (v13 > 0) {
                                            this.b.add(var28_35);
                                            var31_40 = true;
                                        }
                                        v13 = var33_42 = 0;
                                    }
                                    while (var33_42 < var27_34) {
                                        block168: {
                                            block167: {
                                                block170: {
                                                    block169: {
                                                        block165: {
                                                            block166: {
                                                                var34_43 = var26_29[var33_42];
                                                                v15 = var25_22;
                                                                if (var7_6 != null) break block139;
                                                                if (var7_6 != null) break block165;
                                                                if (!v15) break block166;
                                                                v16 = var28_35.a(var34_43.h());
                                                                if (var7_6 != null) break block165;
                                                                if (v16) break block167;
                                                            }
                                                            v16 = var25_22;
                                                        }
                                                        if (v16 && var30_39 != null && !var32_41.a(var30_39.h(), var34_43)) break block167;
                                                        var35_44 = this.a((n)var20_13, (s)var29_37, var34_43);
                                                        if (var7_6 != null) break block168;
                                                        if (var35_44 == null) break block167;
                                                        v17 = var35_44.b(var5_4);
                                                        if (var7_6 != null) break block169;
                                                        if (v17 == 0) break block167;
                                                        v17 = var4_3.a(var35_44.d);
                                                    }
                                                    if (var7_6 != null) break block170;
                                                    if (v17 == 0) break block167;
                                                    v17 = var28_35.d | 1 << var34_43.ordinal();
                                                }
                                                var36_45 = v17;
                                                var37_46 = this.a(var35_44, var34_43, var36_45);
                                                var24_17.add(var37_46);
                                            }
                                            ++var33_42;
                                        }
                                        if (var7_6 == null) continue;
                                    }
                                    v15 = var31_40;
                                }
                                if (!v15) {
                                    this.a((T)var28_35);
                                }
                                if (var7_6 == null) continue;
                            }
                            this.l.an.c();
                        }
                        this.l.an.a("captureFrustum");
                        v5 = this.am ? 1 : 0;
                    }
                    if (var7_6 != null) break block171;
                    if (v5 != 0) {
                        this.a(var14_10, var16_11, var18_12);
                        this.am = false;
                    }
                    fi.k.a();
                    if (var7_6 != null) break block172;
                    v5 = cS.dn ? 1 : 0;
                }
                if (v5 != 0) {
                    cS.a();
                    if (var7_6 == null) return;
                }
                this.l.an.a("rebuildNear");
            }
            var24_17 = this.ak;
            this.ak = Sets.newLinkedHashSet();
            fi.q.c();
            for (T var26_31 : this.s) {
                block174: {
                    block177: {
                        block178: {
                            block175: {
                                block176: {
                                    block173: {
                                        var27_32 = var26_31.a;
                                        v18 = var27_32;
                                        if (var7_6 != null) break block173;
                                        v19 = v18.c();
                                        if (var7_6 != null) break block140;
                                        if (!v19 && !var24_17.contains(var27_32)) break block174;
                                        this.V = true;
                                        v18 = var27_32;
                                    }
                                    var28_35 = v18.g();
                                    cfr_temp_6 = var20_13.b(var28_35.e() + 8, var28_35.b() + 8, var28_35.a() + 8) - 768.0;
                                    v20 = cfr_temp_6 == 0.0 ? 0 : (cfr_temp_6 < 0.0 ? -1 : 1);
                                    if (var7_6 == null) {
                                        v20 = v20 < 0 ? (double)true : (double)false;
                                    }
                                    v21 = var29_38 = v20;
                                    if (var7_6 != null) break block175;
                                    if (v21 != false) break block176;
                                    this.ak.add((s)var27_32);
                                    if (var7_6 == null) break block174;
                                }
                                v21 = (double)var27_32.p();
                            }
                            if (var7_6 != null) break block177;
                            if (v21 != false) break block178;
                            this.Q.add(var27_32);
                            if (var7_6 == null) break block174;
                        }
                        this.l.an.b("build near");
                        v21 = (double)this.v.c((s)var27_32);
                    }
                    var27_32.k();
                    this.l.an.c();
                }
                if (var7_6 == null) continue;
            }
            fi.q.a();
            v19 = this.ak.addAll((Collection<s>)var24_17);
        }
        this.l.an.c();
    }

    public String u() {
        return "E: " + this.g + "/" + this.au + ", B: " + this.R + ", " + fU.P();
    }

    public void t() {
        this.V = true;
    }

    private void a(aH aH2, double d10, double d11, double d12, double d13, double d14, double d15, int ... arrn) {
        this.a(aH2.a(), aH2.c(), d10, d11, d12, d13, d14, d15, arrn);
    }

    private void g() {
        block16: {
            int n2;
            block14: {
                boolean bl2;
                String string;
                block15: {
                    string = net.minecraft.client.a.I.j();
                    bl2 = fU.Z();
                    if (string != null) break block15;
                    if (!bl2) break block16;
                    net.minecraft.client.a.v.C();
                    net.minecraft.client.a.v.v();
                    net.minecraft.client.a.v.a();
                    net.minecraft.client.a.v.a(net.minecraft.client.a.o.SRC_ALPHA, net.minecraft.client.a.G.ONE_MINUS_SRC_ALPHA, net.minecraft.client.a.o.ONE, net.minecraft.client.a.G.ZERO);
                    a0.a();
                    bl2 = false;
                }
                net.minecraft.client.a.v.a(bl2);
                this.w.b(aC);
                W w2 = net.minecraft.client.a.W.c();
                I i2 = w2.b();
                int n3 = 0;
                while (n3 < 6) {
                    int n4;
                    block18: {
                        int n5;
                        block17: {
                            net.minecraft.client.a.v.M();
                            n2 = n3;
                            if (string != null) break block14;
                            n5 = 1;
                            if (string == null) {
                                if (n2 == n5) {
                                    net.minecraft.client.a.v.a(90.0f, 1.0f, 0.0f, 0.0f);
                                }
                                n4 = n3;
                                n5 = 2;
                            }
                            if (string == null) {
                                if (n4 == n5) {
                                    net.minecraft.client.a.v.a(-90.0f, 1.0f, 0.0f, 0.0f);
                                }
                                n4 = n3;
                                n5 = 3;
                            }
                            if (string == null) {
                                if (n4 == n5) {
                                    net.minecraft.client.a.v.a(180.0f, 1.0f, 0.0f, 0.0f);
                                }
                                n4 = n3;
                                n5 = 4;
                            }
                            if (string != null) break block17;
                            if (n4 == n5) {
                                net.minecraft.client.a.v.a(90.0f, 0.0f, 0.0f, 1.0f);
                            }
                            n4 = n3;
                            if (string != null) break block18;
                            n5 = 5;
                        }
                        if (n4 == n5) {
                            net.minecraft.client.a.v.a(-90.0f, 0.0f, 0.0f, 1.0f);
                        }
                        i2.a(7, net.minecraft.client.y.b.t);
                        n4 = 40;
                    }
                    int n6 = n4;
                    int n7 = 40;
                    int n8 = 40;
                    if (string == null) {
                        if (fU.g()) {
                            net.minecraft.k.l l2 = new net.minecraft.k.l((double)n6 / 255.0, (double)n7 / 255.0, (double)n8 / 255.0);
                            l2 = fa.a(l2, this.ax, this.l.Z(), 0.0f);
                            n6 = (int)(l2.e * 255.0);
                            n7 = (int)(l2.d * 255.0);
                            n8 = (int)(l2.b * 255.0);
                        }
                        i2.c(-100.0, -100.0, -100.0).a(0.0, 0.0).b(n6, n7, n8, 255).d();
                        i2.c(-100.0, -100.0, 100.0).a(0.0, 16.0).b(n6, n7, n8, 255).d();
                        i2.c(100.0, -100.0, 100.0).a(16.0, 16.0).b(n6, n7, n8, 255).d();
                        i2.c(100.0, -100.0, -100.0).a(16.0, 0.0).b(n6, n7, n8, 255).d();
                        w2.a();
                        net.minecraft.client.a.v.B();
                        ++n3;
                    }
                    if (string == null) continue;
                }
                n2 = 1;
            }
            net.minecraft.client.a.v.a(n2 != 0);
            net.minecraft.client.a.v.x();
            net.minecraft.client.a.v.e();
            net.minecraft.client.a.v.f();
        }
    }

    @Override
    public void a(net.minecraft.U.x x2) {
        block3: {
            aF aF2;
            net.minecraft.U.x x3;
            block2: {
                String string = net.minecraft.client.a.I.j();
                x3 = x2;
                aF2 = this;
                if (string != null) break block2;
                ab.a(x3, (z)aF2.ax);
                if (!fU.bi()) break block3;
                x3 = x2;
                aF2 = this;
            }
            gk.a(x3, aF2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void a(I i2) {
        Random random = new Random(10842L);
        i2.a(7, net.minecraft.client.y.b.k);
        int n2 = 0;
        String string = net.minecraft.client.a.I.j();
        block0: do {
            block4: {
                double d10;
                double d11;
                double d12;
                double d13;
                double d14;
                double d15;
                block5: {
                    if (n2 >= 1500) return;
                    d15 = random.nextFloat() * 2.0f - 1.0f;
                    d14 = random.nextFloat() * 2.0f - 1.0f;
                    d13 = random.nextFloat() * 2.0f - 1.0f;
                    d12 = 0.15f + random.nextFloat() * 0.1f;
                    double d16 = d15 * d15 + d14 * d14 + d13 * d13;
                    if (string != null) continue;
                    if (!(d16 < 1.0)) break block4;
                    d11 = d16;
                    d10 = 0.01;
                    if (string != null) break block5;
                    if (!(d11 > d10)) break block4;
                    d16 = 1.0 / Math.sqrt(d16);
                    d14 *= d16;
                    d13 *= d16;
                    d11 = d15 *= d16;
                    d10 = 100.0;
                }
                double d17 = d11 * d10;
                double d18 = d14 * 100.0;
                double d19 = d13 * 100.0;
                double d20 = Math.atan2(d15, d13);
                double d21 = Math.sin(d20);
                double d22 = Math.cos(d20);
                double d23 = Math.atan2(Math.sqrt(d15 * d15 + d13 * d13), d14);
                double d24 = Math.sin(d23);
                double d25 = Math.cos(d23);
                double d26 = random.nextDouble() * Math.PI * 2.0;
                double d27 = Math.sin(d26);
                double d28 = Math.cos(d26);
                for (int i3 = 0; i3 < 4; ++i3) {
                    double d29 = 0.0;
                    double d30 = (double)((i3 & 2) - 1) * d12;
                    double d31 = (double)((i3 + 1 & 2) - 1) * d12;
                    double d32 = 0.0;
                    double d33 = d30 * d28 - d31 * d27;
                    double d34 = d31 * d28 + d30 * d27;
                    double d35 = d33 * d24 + 0.0 * d25;
                    double d36 = 0.0 * d24 - d33 * d25;
                    double d37 = d36 * d21 - d34 * d22;
                    double d38 = d34 * d21 + d36 * d22;
                    i2.c(d17 + d37, d18 + d35, d19 + d38).d();
                    if (string != null) continue block0;
                    if (string == null) continue;
                }
            }
            ++n2;
        } while (string == null);
    }

    private void a(Iterator<g> iterator) {
        String string = net.minecraft.client.a.I.j();
        while (iterator.hasNext()) {
            g g10 = iterator.next();
            int n2 = g10.c();
            if (this.aa - n2 > 400) {
                iterator.remove();
            }
            if (string == null) continue;
        }
    }

    protected void s() {
        this.ak.clear();
        this.v.e();
    }

    public void a(net.minecraft.U.x x2, float f10) {
        block28: {
            double d10;
            block30: {
                block25: {
                    float f11;
                    double d11;
                    double d12;
                    float f12;
                    double d13;
                    double d14;
                    float f13;
                    double d15;
                    String string;
                    double d16;
                    net.minecraft.V.a a10;
                    I i2;
                    W w2;
                    block29: {
                        double d17;
                        block24: {
                            double d18;
                            double d19;
                            block26: {
                                block27: {
                                    w2 = net.minecraft.client.a.W.c();
                                    i2 = w2.b();
                                    a10 = this.ax.O();
                                    d16 = this.l.ac.bf * 16;
                                    string = net.minecraft.client.a.I.j();
                                    d19 = x2.a;
                                    d18 = a10.r() - d16;
                                    if (string != null) break block26;
                                    if (d19 >= d18) break block27;
                                    d19 = x2.a;
                                    d18 = a10.g() + d16;
                                    if (string != null) break block26;
                                    if (d19 <= d18) break block27;
                                    d19 = x2.ax;
                                    d18 = a10.d() - d16;
                                    if (string != null) break block26;
                                    if (d19 >= d18) break block27;
                                    d19 = x2.ax;
                                    d18 = a10.f() + d16;
                                    if (string != null) break block26;
                                    if (!(d19 <= d18)) break block28;
                                }
                                d19 = 1.0;
                                d18 = a10.a(x2) / d16;
                            }
                            double d20 = d19 - d18;
                            d20 = Math.pow(d20, 4.0);
                            double d21 = x2.am + (x2.a - x2.am) * (double)f10;
                            double d22 = x2.af + (x2.aF - x2.af) * (double)f10;
                            d15 = x2.n + (x2.ax - x2.n) * (double)f10;
                            net.minecraft.client.a.v.a();
                            net.minecraft.client.a.v.a(net.minecraft.client.a.o.SRC_ALPHA, net.minecraft.client.a.G.ONE, net.minecraft.client.a.o.ONE, net.minecraft.client.a.G.ZERO);
                            this.w.b(ad);
                            net.minecraft.client.a.v.a(false);
                            net.minecraft.client.a.v.M();
                            int n2 = a10.o().a();
                            float f14 = (float)(n2 >> 16 & 0xFF) / 255.0f;
                            float f15 = (float)(n2 >> 8 & 0xFF) / 255.0f;
                            float f16 = (float)(n2 & 0xFF) / 255.0f;
                            net.minecraft.client.a.v.b(f14, f15, f16, (float)d20);
                            net.minecraft.client.a.v.b(-3.0f, -3.0f);
                            net.minecraft.client.a.v.G();
                            net.minecraft.client.a.v.a(516, 0.1f);
                            net.minecraft.client.a.v.e();
                            net.minecraft.client.a.v.E();
                            f13 = (float)(net.minecraft.client.Q.aj() % 3000L) / 3000.0f;
                            float f17 = 0.0f;
                            float f18 = 0.0f;
                            float f19 = 128.0f;
                            i2.a(7, net.minecraft.client.y.b.m);
                            i2.a(-d21, -d22, -d15);
                            d14 = Math.max((double)net.minecraft.k.h.f(d15 - d16), a10.f());
                            d13 = Math.min((double)net.minecraft.k.h.i(d15 + d16), a10.d());
                            double d23 = d21 - (a10.r() - d16);
                            d10 = d23 == 0.0 ? 0 : (d23 > 0.0 ? 1 : -1);
                            if (string == null) {
                                double d24;
                                if (d10 > 0) {
                                    f12 = 0.0f;
                                    d12 = d14;
                                    while (d12 < d13) {
                                        d11 = Math.min(1.0, d13 - d12);
                                        f11 = (float)d11 * 0.5f;
                                        i2.c(a10.r(), 256.0, d12).a(f13 + f12, f13 + 0.0f).d();
                                        i2.c(a10.r(), 256.0, d12 + d11).a(f13 + f11 + f12, f13 + 0.0f).d();
                                        i2.c(a10.r(), 0.0, d12 + d11).a(f13 + f11 + f12, f13 + 128.0f).d();
                                        i2.c(a10.r(), 0.0, d12).a(f13 + f12, f13 + 128.0f).d();
                                        d12 += 1.0;
                                        f12 += 0.5f;
                                        if (string == null) {
                                            if (string == null) continue;
                                        }
                                        break block24;
                                    }
                                }
                                d10 = (d24 = d21 - (a10.g() + d16)) == 0.0 ? 0 : (d24 < 0.0 ? -1 : 1);
                            }
                            if (string != null) break block29;
                            if (d10 < 0) {
                                f12 = 0.0f;
                                d12 = d14;
                                while (d12 < d13) {
                                    d11 = Math.min(1.0, d13 - d12);
                                    f11 = (float)d11 * 0.5f;
                                    i2.c(a10.g(), 256.0, d12).a(f13 + f12, f13 + 0.0f).d();
                                    i2.c(a10.g(), 256.0, d12 + d11).a(f13 + f11 + f12, f13 + 0.0f).d();
                                    i2.c(a10.g(), 0.0, d12 + d11).a(f13 + f11 + f12, f13 + 128.0f).d();
                                    i2.c(a10.g(), 0.0, d12).a(f13 + f12, f13 + 128.0f).d();
                                    d12 += 1.0;
                                    f12 += 0.5f;
                                    if (string == null) {
                                        if (string == null) continue;
                                    }
                                    break;
                                }
                            } else {
                                d14 = Math.max((double)net.minecraft.k.h.f(d21 - d16), a10.g());
                                d13 = Math.min((double)net.minecraft.k.h.i(d21 + d16), a10.r());
                            }
                        }
                        d10 = (d17 = d15 - (a10.d() - d16)) == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
                    }
                    if (string == null) {
                        double d25;
                        if (d10 > 0) {
                            f12 = 0.0f;
                            d12 = d14;
                            while (d12 < d13) {
                                d11 = Math.min(1.0, d13 - d12);
                                f11 = (float)d11 * 0.5f;
                                i2.c(d12, 256.0, a10.d()).a(f13 + f12, f13 + 0.0f).d();
                                i2.c(d12 + d11, 256.0, a10.d()).a(f13 + f11 + f12, f13 + 0.0f).d();
                                i2.c(d12 + d11, 0.0, a10.d()).a(f13 + f11 + f12, f13 + 128.0f).d();
                                i2.c(d12, 0.0, a10.d()).a(f13 + f12, f13 + 128.0f).d();
                                d12 += 1.0;
                                f12 += 0.5f;
                                if (string == null) {
                                    if (string == null) continue;
                                }
                                break block25;
                            }
                        }
                        d10 = (d25 = d15 - (a10.f() + d16)) == 0.0 ? 0 : (d25 < 0.0 ? -1 : 1);
                    }
                    if (string != null) break block30;
                    if (d10 < 0) {
                        f12 = 0.0f;
                        d12 = d14;
                        while (d12 < d13) {
                            d11 = Math.min(1.0, d13 - d12);
                            f11 = (float)d11 * 0.5f;
                            i2.c(d12, 256.0, a10.f()).a(f13 + f12, f13 + 0.0f).d();
                            i2.c(d12 + d11, 256.0, a10.f()).a(f13 + f11 + f12, f13 + 0.0f).d();
                            i2.c(d12 + d11, 0.0, a10.f()).a(f13 + f11 + f12, f13 + 128.0f).d();
                            i2.c(d12, 0.0, a10.f()).a(f13 + f12, f13 + 128.0f).d();
                            d12 += 1.0;
                            f12 += 0.5f;
                            if (string == null) {
                                if (string == null) continue;
                            }
                            break;
                        }
                    } else {
                        w2.a();
                        i2.a(0.0, 0.0, 0.0);
                        net.minecraft.client.a.v.c();
                        net.minecraft.client.a.v.v();
                        net.minecraft.client.a.v.b(0.0f, 0.0f);
                        net.minecraft.client.a.v.I();
                        net.minecraft.client.a.v.e();
                        net.minecraft.client.a.v.a(net.minecraft.client.a.o.SRC_ALPHA, net.minecraft.client.a.G.ONE_MINUS_SRC_ALPHA, net.minecraft.client.a.o.ONE, net.minecraft.client.a.G.ZERO);
                        net.minecraft.client.a.v.f();
                        net.minecraft.client.a.v.B();
                    }
                }
                d10 = 1.0;
            }
            net.minecraft.client.a.v.a((boolean)d10);
        }
    }

    @Override
    public void a(@Nullable net.minecraft.i.j j2, net.minecraft.ar.d d10, ay ay2, double d11, double d12, double d13, float f10, float f11) {
    }

    public int c() {
        return this.q;
    }

    public void w() {
        this.O.d();
    }

    @Override
    public void a(int n2, boolean bl2, boolean bl3, double d10, double d11, double d12, double d13, double d14, double d15, int ... arrn) {
        String string = net.minecraft.client.a.I.j();
        try {
            this.a(n2, bl2, bl3, d10, d11, d12, d13, d14, d15, arrn);
        }
        catch (Throwable throwable) {
            f f10 = net.minecraft.c.f.a(throwable, "Exception while adding particle");
            l l2 = f10.a("Particle being added");
            l2.a("ID", n2);
            if (string == null) {
                if (arrn != null) {
                    l2.a("Parameters", arrn);
                }
                l2.a("Position", new ae(this, d10, d11, d12));
            }
            throw new Z(f10);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void b(float var1_1, int var2_2, double var3_3, double var5_4, double var7_5) {
        block17: {
            block20: {
                block19: {
                    var9_6 = net.minecraft.client.a.I.j();
                    v0 = fU.d();
                    if (var9_6 == null) {
                        if (v0 != false) return;
                        v0 = cq.a5.b();
                    }
                    if (var9_6 == null) {
                        if (v0) {
                            v1 = var10_7 = this.l.e.D;
                            if (var9_6 == null) {
                                var11_9 = cq.d(v1, cq.a5, new Object[0]);
                                if (var11_9 != null) {
                                    cq.b(var11_9, cq.bh, new Object[]{Float.valueOf(var1_1), this.ax, this.l});
                                    return;
                                } else {
                                    ** GOTO lbl-1000
                                }
                            }
                        } else lbl-1000:
                        // 3 sources

                        {
                            v1 = this.l.e.D;
                        }
                        v0 = v1.s();
                    }
                    if (var9_6 == null) {
                        if (v0 == false) return;
                        v0 = fU.ag();
                    }
                    if (var9_6 == null) {
                        if (v0) {
                            cS.an();
                        }
                        v0 = fU.aY();
                    }
                    if (!v0) break block19;
                    this.a(var1_1, var2_2, var3_3, var5_4, var7_5);
                    if (var9_6 == null) break block20;
                }
                var10_8 = var1_1;
                var1_1 = 0.0f;
                net.minecraft.client.a.v.E();
                var11_10 = 32;
                var12_11 = 8;
                var13_12 = net.minecraft.client.a.W.c();
                var14_13 = var13_12.b();
                this.w.b(aF.h);
                net.minecraft.client.a.v.a();
                net.minecraft.client.a.v.a(net.minecraft.client.a.o.SRC_ALPHA, net.minecraft.client.a.G.ONE_MINUS_SRC_ALPHA, net.minecraft.client.a.o.ONE, net.minecraft.client.a.G.ZERO);
                var15_14 = this.ax.c(var1_1);
                var16_15 = (float)var15_14.e;
                var17_16 = (float)var15_14.d;
                var18_17 = (float)var15_14.b;
                this.O.a(false, this.aa, var10_8, var15_14);
                v2 = this.O;
                if (var9_6 == null) {
                    if (v2.b()) {
                        this.O.c();
                        if (var2_2 != 2) {
                            var19_18 = (var16_15 * 30.0f + var17_16 * 59.0f + var18_17 * 11.0f) / 100.0f;
                            var20_19 = (var16_15 * 30.0f + var17_16 * 70.0f) / 100.0f;
                            var21_21 = (var16_15 * 30.0f + var18_17 * 70.0f) / 100.0f;
                            var16_15 = var19_18;
                            var17_16 = var20_19;
                            var18_17 = var21_21;
                        }
                        var19_18 = 4.8828125E-4f;
                        var20_20 = (float)this.aa + var1_1;
                        var22_22 = var3_3 + var20_20 * 0.029999999329447746;
                        var24_23 = net.minecraft.k.h.f(var22_22 / 2048.0);
                        var25_24 = net.minecraft.k.h.f(var7_5 / 2048.0);
                        var26_25 = var7_5 - (double)(var25_24 * 2048);
                        var28_26 = this.ax.D.f() - (float)var5_4 + 0.33f;
                        var28_26 += this.l.ac.ak * 128.0f;
                        var29_27 = (float)((var22_22 -= (double)(var24_23 * 2048)) * 4.8828125E-4);
                        var30_28 = (float)(var26_25 * 4.8828125E-4);
                        var14_13.a(7, net.minecraft.client.y.b.t);
                        var31_29 = -256;
                        while (var31_29 < 256) {
                            block18: {
                                v3 = -256;
                                if (var9_6 != null) break block17;
                                for (var32_30 = v1469795; var32_30 < 256; var32_30 += 32) {
                                    var14_13.c((double)(var31_29 + 0), (double)var28_26, (double)(var32_30 + 32)).a((float)(var31_29 + 0) * 4.8828125E-4f + var29_27, (float)(var32_30 + 32) * 4.8828125E-4f + var30_28).a(var16_15, var17_16, var18_17, 0.8f).d();
                                    var14_13.c((double)(var31_29 + 32), (double)var28_26, (double)(var32_30 + 32)).a((float)(var31_29 + 32) * 4.8828125E-4f + var29_27, (float)(var32_30 + 32) * 4.8828125E-4f + var30_28).a(var16_15, var17_16, var18_17, 0.8f).d();
                                    var14_13.c((double)(var31_29 + 32), (double)var28_26, (double)(var32_30 + 0)).a((float)(var31_29 + 32) * 4.8828125E-4f + var29_27, (float)(var32_30 + 0) * 4.8828125E-4f + var30_28).a(var16_15, var17_16, var18_17, 0.8f).d();
                                    var14_13.c((double)(var31_29 + 0), (double)var28_26, (double)(var32_30 + 0)).a((float)(var31_29 + 0) * 4.8828125E-4f + var29_27, (float)(var32_30 + 0) * 4.8828125E-4f + var30_28).a(var16_15, var17_16, var18_17, 0.8f).d();
                                    if (var9_6 == null) {
                                        if (var9_6 == null) continue;
                                    }
                                    break block18;
                                }
                                var31_29 += 32;
                            }
                            if (var9_6 == null) continue;
                        }
                        var13_12.a();
                        this.O.e();
                    }
                    v2 = this.O;
                }
                v2.a();
                net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                net.minecraft.client.a.v.f();
                net.minecraft.client.a.v.c();
            }
            v3 = fU.ag();
        }
        if (v3 == 0) return;
        cS.f();
    }

    public void a(net.minecraft.i.j j2, i i2, int n2, float f10) {
        block7: {
            boolean bl2;
            block10: {
                block8: {
                    block9: {
                        String string = net.minecraft.client.a.I.j();
                        if (n2 != 0 || i2.d != net.minecraft.k.j.BLOCK) break block7;
                        net.minecraft.client.a.v.a();
                        net.minecraft.client.a.v.a(net.minecraft.client.a.o.SRC_ALPHA, net.minecraft.client.a.G.ONE_MINUS_SRC_ALPHA, net.minecraft.client.a.o.ONE, net.minecraft.client.a.G.ZERO);
                        net.minecraft.client.a.v.d(2.0f);
                        net.minecraft.client.a.v.L();
                        boolean bl3 = fU.ag();
                        if (string == null) {
                            if (bl3) {
                                cS.g();
                            }
                            bl3 = false;
                        }
                        net.minecraft.client.a.v.a(bl3);
                        n n3 = i2.a();
                        net.minecraft.Z.i i3 = this.ax.d(n3);
                        if (string != null) break block8;
                        if (i3.o() == net.minecraft.ac.c.A) break block9;
                        bl2 = this.ax.O().a(n3);
                        if (string != null) break block10;
                        if (bl2) {
                            double d10 = j2.am + (j2.a - j2.am) * (double)f10;
                            double d11 = j2.af + (j2.aF - j2.af) * (double)f10;
                            double d12 = j2.n + (j2.ax - j2.n) * (double)f10;
                            aF.b(i3.a(this.ax, n3).a(0.002f).c(-d10, -d11, -d12), 0.0f, 0.0f, 0.0f, 0.4f);
                        }
                    }
                    net.minecraft.client.a.v.a(true);
                    net.minecraft.client.a.v.x();
                }
                bl2 = fU.ag();
            }
            if (bl2) {
                cS.ak();
            }
            net.minecraft.client.a.v.f();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(float var1_1, int var2_2) {
        block100: {
            block99: {
                block94: {
                    block95: {
                        block98: {
                            block96: {
                                block97: {
                                    block93: {
                                        block92: {
                                            block88: {
                                                block89: {
                                                    block90: {
                                                        block91: {
                                                            block87: {
                                                                block86: {
                                                                    block85: {
                                                                        block82: {
                                                                            block80: {
                                                                                block81: {
                                                                                    block74: {
                                                                                        block84: {
                                                                                            block83: {
                                                                                                block79: {
                                                                                                    block75: {
                                                                                                        block76: {
                                                                                                            block77: {
                                                                                                                block78: {
                                                                                                                    var3_3 = net.minecraft.client.a.I.j();
                                                                                                                    if (cq.az.b()) {
                                                                                                                        v0 = var4_4 = this.l.e.D;
                                                                                                                        if (var3_3 == null) {
                                                                                                                            var5_6 = cq.d(v0, cq.az, new Object[0]);
                                                                                                                            if (var5_6 != null) {
                                                                                                                                cq.b(var5_6, cq.bh, new Object[]{Float.valueOf(var1_1), this.ax, this.l});
                                                                                                                                return;
                                                                                                                            } else {
                                                                                                                                ** GOTO lbl-1000
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } else lbl-1000:
                                                                                                                    // 3 sources

                                                                                                                    {
                                                                                                                        v0 = this.l.e.D;
                                                                                                                    }
                                                                                                                    if (var3_3 == null) {
                                                                                                                        if (v0.r() == net.minecraft.ah.p.THE_END) {
                                                                                                                            this.g();
                                                                                                                            if (var3_3 == null) return;
                                                                                                                        }
                                                                                                                        v0 = this.l.e.D;
                                                                                                                    }
                                                                                                                    v1 = v0.s();
                                                                                                                    if (var3_3 == null) {
                                                                                                                        if (v1 == 0) return;
                                                                                                                        net.minecraft.client.a.v.L();
                                                                                                                        v1 = fU.ag();
                                                                                                                    }
                                                                                                                    if ((var4_5 = v1) != 0) {
                                                                                                                        cS.g();
                                                                                                                    }
                                                                                                                    var5_6 = this.ax.a(this.l.Z(), var1_1);
                                                                                                                    v2 = fa.b((net.minecraft.k.l)var5_6, this.l.e, this.l.Z().a, this.l.Z().aF + 1.0, this.l.Z().ax);
                                                                                                                    if (var3_3 == null) {
                                                                                                                        var5_6 = v2;
                                                                                                                        if (var4_5 != 0) {
                                                                                                                            cS.a((net.minecraft.k.l)var5_6);
                                                                                                                        }
                                                                                                                        v2 = var5_6;
                                                                                                                    }
                                                                                                                    var6_7 = (float)v2.e;
                                                                                                                    var7_8 = (float)var5_6.d;
                                                                                                                    var8_9 = (float)var5_6.b;
                                                                                                                    if (var3_3 == null) {
                                                                                                                        if (var2_2 != 2) {
                                                                                                                            var9_10 = (var6_7 * 30.0f + var7_8 * 59.0f + var8_9 * 11.0f) / 100.0f;
                                                                                                                            var10_12 = (var6_7 * 30.0f + var7_8 * 70.0f) / 100.0f;
                                                                                                                            var11_14 = (var6_7 * 30.0f + var8_9 * 70.0f) / 100.0f;
                                                                                                                            var6_7 = var9_10;
                                                                                                                            var7_8 = var10_12;
                                                                                                                            var8_9 = var11_14;
                                                                                                                        }
                                                                                                                        net.minecraft.client.a.v.c(var6_7, var7_8, var8_9);
                                                                                                                    }
                                                                                                                    var9_11 = net.minecraft.client.a.W.c();
                                                                                                                    var10_13 = var9_11.b();
                                                                                                                    net.minecraft.client.a.v.a(false);
                                                                                                                    net.minecraft.client.a.v.o();
                                                                                                                    v3 = var4_5;
                                                                                                                    if (var3_3 == null) {
                                                                                                                        if (v3 != 0) {
                                                                                                                            cS.Q();
                                                                                                                        }
                                                                                                                        net.minecraft.client.a.v.c(var6_7, var7_8, var8_9);
                                                                                                                        v3 = var4_5;
                                                                                                                    }
                                                                                                                    if (var3_3 == null) {
                                                                                                                        if (v3 != 0) {
                                                                                                                            cS.ai();
                                                                                                                        }
                                                                                                                        v3 = fU.Z();
                                                                                                                    }
                                                                                                                    if (var3_3 != null) break block75;
                                                                                                                    if (v3 == 0) break block76;
                                                                                                                    v4 = this.aA;
                                                                                                                    if (var3_3 != null) break block77;
                                                                                                                    if (v4 == 0) break block78;
                                                                                                                    this.u.b();
                                                                                                                    net.minecraft.client.a.v.r(32884);
                                                                                                                    net.minecraft.client.a.v.c(3, 5126, 12, 0);
                                                                                                                    this.u.a(7);
                                                                                                                    this.u.c();
                                                                                                                    net.minecraft.client.a.v.a(32884);
                                                                                                                    if (var3_3 == null) break block76;
                                                                                                                }
                                                                                                                v4 = this.av;
                                                                                                            }
                                                                                                            net.minecraft.client.a.v.s(v4);
                                                                                                        }
                                                                                                        net.minecraft.client.a.v.C();
                                                                                                        if (var3_3 != null) break block79;
                                                                                                        v3 = var4_5;
                                                                                                    }
                                                                                                    if (v3 != 0) {
                                                                                                        cS.aK();
                                                                                                    }
                                                                                                    net.minecraft.client.a.v.v();
                                                                                                    net.minecraft.client.a.v.a();
                                                                                                    net.minecraft.client.a.v.a(net.minecraft.client.a.o.SRC_ALPHA, net.minecraft.client.a.G.ONE_MINUS_SRC_ALPHA, net.minecraft.client.a.o.ONE, net.minecraft.client.a.G.ZERO);
                                                                                                    a0.a();
                                                                                                }
                                                                                                var11_15 = this.ax.D.b(this.ax.h(var1_1), var1_1);
                                                                                                if (var3_3 != null) break block80;
                                                                                                if (var11_15 == null) break block81;
                                                                                                v5 = fU.an();
                                                                                                if (var3_3 != null) break block82;
                                                                                                if (v5 == 0) break block81;
                                                                                                net.minecraft.client.a.v.L();
                                                                                                v6 = var4_5;
                                                                                                if (var3_3 != null) break block83;
                                                                                                if (v6 != 0) {
                                                                                                    cS.g();
                                                                                                }
                                                                                                net.minecraft.client.a.v.g(7425);
                                                                                                net.minecraft.client.a.v.M();
                                                                                                net.minecraft.client.a.v.a(90.0f, 1.0f, 0.0f, 0.0f);
                                                                                                v7 = net.minecraft.k.h.g(this.ax.e(var1_1));
                                                                                                if (var3_3 != null) break block84;
                                                                                                cfr_temp_0 = v7 - 0.0f;
                                                                                                v6 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                                                                            }
                                                                                            v7 = v6 < 0 ? 180.0f : 0.0f;
                                                                                        }
                                                                                        net.minecraft.client.a.v.a(v7, 0.0f, 0.0f, 1.0f);
                                                                                        net.minecraft.client.a.v.a(90.0f, 0.0f, 0.0f, 1.0f);
                                                                                        var12_16 = var11_15[0];
                                                                                        var13_17 = var11_15[1];
                                                                                        var14_18 = var11_15[2];
                                                                                        v8 = var2_2;
                                                                                        if (var3_3 == null) {
                                                                                            if (v8 != 2) {
                                                                                                var15_21 = (var12_16 * 30.0f + var13_17 * 59.0f + var14_18 * 11.0f) / 100.0f;
                                                                                                var16_24 = (var12_16 * 30.0f + var13_17 * 70.0f) / 100.0f;
                                                                                                var17_26 = (var12_16 * 30.0f + var14_18 * 70.0f) / 100.0f;
                                                                                                var12_16 = var15_21;
                                                                                                var13_17 = var16_24;
                                                                                                var14_18 = var17_26;
                                                                                            }
                                                                                            var10_13.a(6, net.minecraft.client.y.b.i);
                                                                                            var10_13.c(0.0, 100.0, 0.0).a(var12_16, var13_17, var14_18, var11_15[3]).d();
                                                                                            v8 = 16;
                                                                                        }
                                                                                        var15_22 = v8;
                                                                                        for (var16_25 = 0; var16_25 <= 16; ++var16_25) {
                                                                                            var17_26 = (float)var16_25 * 6.2831855f / 16.0f;
                                                                                            var18_27 = net.minecraft.k.h.g(var17_26);
                                                                                            var19_28 = net.minecraft.k.h.c(var17_26);
                                                                                            var10_13.c((double)(var18_27 * 120.0f), (double)(var19_28 * 120.0f), (double)(-var19_28 * 40.0f * var11_15[3])).a(var11_15[0], var11_15[1], var11_15[2], 0.0f).d();
                                                                                            if (var3_3 == null) {
                                                                                                if (var3_3 == null) continue;
                                                                                            }
                                                                                            break block74;
                                                                                        }
                                                                                        var9_11.a();
                                                                                        net.minecraft.client.a.v.B();
                                                                                    }
                                                                                    net.minecraft.client.a.v.g(7424);
                                                                                }
                                                                                net.minecraft.client.a.v.x();
                                                                            }
                                                                            if (var3_3 != null) break block85;
                                                                            v5 = var4_5;
                                                                        }
                                                                        if (v5 != 0) {
                                                                            cS.ak();
                                                                        }
                                                                        net.minecraft.client.a.v.a(net.minecraft.client.a.o.SRC_ALPHA, net.minecraft.client.a.G.ONE, net.minecraft.client.a.o.ONE, net.minecraft.client.a.G.ZERO);
                                                                        net.minecraft.client.a.v.M();
                                                                    }
                                                                    var12_16 = 1.0f - this.ax.a(var1_1);
                                                                    net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, var12_16);
                                                                    net.minecraft.client.a.v.a(-90.0f, 0.0f, 1.0f, 0.0f);
                                                                    aS.a(this.ax, this.w, var1_1);
                                                                    v9 = var4_5;
                                                                    if (var3_3 != null) break block86;
                                                                    if (v9 != 0) {
                                                                        cS.e();
                                                                    }
                                                                    v10 = this.ax.h(var1_1) * 360.0f;
                                                                    if (var3_3 != null) break block87;
                                                                    net.minecraft.client.a.v.a(v10, 1.0f, 0.0f, 0.0f);
                                                                    v9 = var4_5;
                                                                }
                                                                if (v9 != 0) {
                                                                    cS.ab();
                                                                }
                                                                v10 = 30.0f;
                                                            }
                                                            var13_17 = v10;
                                                            v11 = fU.V();
                                                            if (var3_3 == null) {
                                                                if (v11 != 0) {
                                                                    this.w.b(aF.as);
                                                                    var10_13.a(7, net.minecraft.client.y.b.m);
                                                                    var10_13.c((double)(-var13_17), 100.0, (double)(-var13_17)).a(0.0, 0.0).d();
                                                                    var10_13.c((double)var13_17, 100.0, (double)(-var13_17)).a(1.0, 0.0).d();
                                                                    var10_13.c((double)var13_17, 100.0, (double)var13_17).a(1.0, 1.0).d();
                                                                    var10_13.c((double)(-var13_17), 100.0, (double)var13_17).a(0.0, 1.0).d();
                                                                    var9_11.a();
                                                                }
                                                                var13_17 = 20.0f;
                                                                v11 = fU.aT();
                                                            }
                                                            if (var3_3 == null) {
                                                                if (v11 != 0) {
                                                                    this.w.b(aF.N);
                                                                    var14_19 = this.ax.d();
                                                                    var15_22 = var14_19 % 4;
                                                                    var16_25 = var14_19 / 4 % 2;
                                                                    var17_26 = (float)(var15_22 + 0) / 4.0f;
                                                                    var18_27 = (float)(var16_25 + 0) / 2.0f;
                                                                    var19_28 = (float)(var15_22 + 1) / 4.0f;
                                                                    var20_29 = (float)(var16_25 + 1) / 2.0f;
                                                                    var10_13.a(7, net.minecraft.client.y.b.m);
                                                                    var10_13.c((double)(-var13_17), -100.0, (double)var13_17).a(var19_28, var20_29).d();
                                                                    var10_13.c((double)var13_17, -100.0, (double)var13_17).a(var17_26, var20_29).d();
                                                                    var10_13.c((double)var13_17, -100.0, (double)(-var13_17)).a(var17_26, var18_27).d();
                                                                    var10_13.c((double)(-var13_17), -100.0, (double)(-var13_17)).a(var19_28, var18_27).d();
                                                                    var9_11.a();
                                                                }
                                                                net.minecraft.client.a.v.L();
                                                                v11 = var4_5;
                                                            }
                                                            if (v11 != 0) {
                                                                cS.g();
                                                            }
                                                            var14_20 = this.ax.d(var1_1) * var12_16;
                                                            cfr_temp_1 = var14_20 - 0.0f;
                                                            v12 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                                                            if (var3_3 != null) break block88;
                                                            if (v12 <= 0) break block89;
                                                            v12 = (float)fU.aD();
                                                            if (var3_3 != null) break block88;
                                                            if (v12 == false) break block89;
                                                            v12 = (float)aS.a(this.ax);
                                                            if (var3_3 != null) break block88;
                                                            if (v12 != false) break block89;
                                                            net.minecraft.client.a.v.b(var14_20, var14_20, var14_20, var14_20);
                                                            v13 = this.aA;
                                                            if (var3_3 != null) break block90;
                                                            if (v13 == 0) break block91;
                                                            this.A.b();
                                                            net.minecraft.client.a.v.r(32884);
                                                            net.minecraft.client.a.v.c(3, 5126, 12, 0);
                                                            this.A.a(7);
                                                            this.A.c();
                                                            net.minecraft.client.a.v.a(32884);
                                                            if (var3_3 == null) break block89;
                                                        }
                                                        v13 = this.F;
                                                    }
                                                    net.minecraft.client.a.v.s(v13);
                                                }
                                                net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                                                net.minecraft.client.a.v.f();
                                                net.minecraft.client.a.v.e();
                                                net.minecraft.client.a.v.o();
                                                v12 = var4_5;
                                            }
                                            if (var3_3 != null) break block92;
                                            if (v12 != false) {
                                                cS.Q();
                                            }
                                            net.minecraft.client.a.v.B();
                                            net.minecraft.client.a.v.L();
                                            if (var3_3 != null) break block93;
                                            v12 = var4_5;
                                        }
                                        if (v12 != false) {
                                            cS.g();
                                        }
                                        net.minecraft.client.a.v.c(0.0f, 0.0f, 0.0f);
                                    }
                                    var15_23 = this.l.s.c((float)var1_1).d - this.ax.P();
                                    cfr_temp_2 = var15_23 - 0.0;
                                    v14 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 < 0.0 ? -1 : 1);
                                    if (var3_3 != null) break block94;
                                    if (v14 >= 0) break block95;
                                    net.minecraft.client.a.v.M();
                                    net.minecraft.client.a.v.b(0.0f, 12.0f, 0.0f);
                                    v15 = this.aA;
                                    if (var3_3 != null) break block96;
                                    if (v15 == 0) break block97;
                                    this.W.b();
                                    net.minecraft.client.a.v.r(32884);
                                    net.minecraft.client.a.v.c(3, 5126, 12, 0);
                                    this.W.a(7);
                                    this.W.c();
                                    net.minecraft.client.a.v.a(32884);
                                    if (var3_3 == null) break block98;
                                }
                                v15 = this.Y;
                            }
                            net.minecraft.client.a.v.s(v15);
                        }
                        net.minecraft.client.a.v.B();
                        var17_26 = 1.0f;
                        var18_27 = -((float)(var15_23 + 65.0));
                        var19_28 = -1.0f;
                        var10_13.a(7, net.minecraft.client.y.b.i);
                        var10_13.c(-1.0, (double)var18_27, 1.0).b(0, 0, 0, 255).d();
                        var10_13.c(1.0, (double)var18_27, 1.0).b(0, 0, 0, 255).d();
                        var10_13.c(1.0, -1.0, 1.0).b(0, 0, 0, 255).d();
                        var10_13.c(-1.0, -1.0, 1.0).b(0, 0, 0, 255).d();
                        var10_13.c(-1.0, -1.0, -1.0).b(0, 0, 0, 255).d();
                        var10_13.c(1.0, -1.0, -1.0).b(0, 0, 0, 255).d();
                        var10_13.c(1.0, (double)var18_27, -1.0).b(0, 0, 0, 255).d();
                        var10_13.c(-1.0, (double)var18_27, -1.0).b(0, 0, 0, 255).d();
                        var10_13.c(1.0, -1.0, -1.0).b(0, 0, 0, 255).d();
                        var10_13.c(1.0, -1.0, 1.0).b(0, 0, 0, 255).d();
                        var10_13.c(1.0, (double)var18_27, 1.0).b(0, 0, 0, 255).d();
                        var10_13.c(1.0, (double)var18_27, -1.0).b(0, 0, 0, 255).d();
                        var10_13.c(-1.0, (double)var18_27, -1.0).b(0, 0, 0, 255).d();
                        var10_13.c(-1.0, (double)var18_27, 1.0).b(0, 0, 0, 255).d();
                        var10_13.c(-1.0, -1.0, 1.0).b(0, 0, 0, 255).d();
                        var10_13.c(-1.0, -1.0, -1.0).b(0, 0, 0, 255).d();
                        var10_13.c(-1.0, -1.0, -1.0).b(0, 0, 0, 255).d();
                        var10_13.c(-1.0, -1.0, 1.0).b(0, 0, 0, 255).d();
                        var10_13.c(1.0, -1.0, 1.0).b(0, 0, 0, 255).d();
                        var10_13.c(1.0, -1.0, -1.0).b(0, 0, 0, 255).d();
                        var9_11.a();
                    }
                    v14 = (double)this.ax.D.a();
                }
                if (v14 == false) break block99;
                net.minecraft.client.a.v.c(var6_7 * 0.2f + 0.04f, var7_8 * 0.2f + 0.04f, var8_9 * 0.6f + 0.1f);
                if (var3_3 == null) break block100;
            }
            net.minecraft.client.a.v.c(var6_7, var7_8, var8_9);
        }
        v16 = this.l.ac.bf;
        if (var3_3 == null) {
            if (v16 <= 4) {
                net.minecraft.client.a.v.c(this.l.Y.am, this.l.Y.ah, this.l.Y.L);
            }
            net.minecraft.client.a.v.M();
            net.minecraft.client.a.v.b(0.0f, -((float)(var15_23 - 16.0)), 0.0f);
            v16 = fU.Z() ? 1 : 0;
        }
        if (var3_3 == null) {
            if (v16 != 0) {
                net.minecraft.client.a.v.s(this.Y);
            }
            net.minecraft.client.a.v.B();
            net.minecraft.client.a.v.x();
            v16 = var4_5;
        }
        if (var3_3 == null) {
            if (v16 != 0) {
                cS.ak();
            }
            v16 = 1;
        }
        net.minecraft.client.a.v.a((boolean)v16);
    }

    public int j() {
        return this.ak.size();
    }

    public net.minecraft.client.E.l b() {
        return this.ax;
    }

    private void h() {
        block0: {
            net.minecraft.client.a.v.a(net.minecraft.client.a.o.DST_COLOR, net.minecraft.client.a.G.SRC_COLOR, net.minecraft.client.a.o.ONE, net.minecraft.client.a.G.ZERO);
            net.minecraft.client.a.v.a();
            net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 0.5f);
            net.minecraft.client.a.v.b(-3.0f, -3.0f);
            net.minecraft.client.a.v.G();
            net.minecraft.client.a.v.a(516, 0.1f);
            net.minecraft.client.a.v.e();
            net.minecraft.client.a.v.M();
            if (!fU.ag()) break block0;
            as.l();
        }
    }

    private void a(I i2, float f10, boolean bl2) {
        int n2 = 64;
        String string = net.minecraft.client.a.I.j();
        int n3 = 6;
        i2.a(7, net.minecraft.client.y.b.k);
        int n4 = -384;
        block0: while (true) {
            int n5 = n4;
            block1: while (n5 <= 384) {
                int n6 = -384;
                while (n6 <= 384) {
                    float f11 = n4;
                    float f12 = n4 + 64;
                    if (string == null) {
                        n5 = bl2 ? 1 : 0;
                        if (string != null) continue block1;
                        if (n5 != 0) {
                            f12 = n4;
                            f11 = n4 + 64;
                        }
                        i2.c((double)f11, (double)f10, (double)n6).d();
                        i2.c((double)f12, (double)f10, (double)n6).d();
                        i2.c((double)f12, (double)f10, (double)(n6 + 64)).d();
                        i2.c((double)f11, (double)f10, (double)(n6 + 64)).d();
                        n6 += 64;
                    }
                    if (string == null) continue;
                }
                n4 += 64;
                if (string == null) continue block0;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void a(net.minecraft.ar.aC var1_1) {
        block12: {
            v0 = net.minecraft.client.a.I.j();
            this.l.Y.f();
            var2_2 = v0;
            v1 = net.minecraft.client.a.as.f();
            if (var2_2 == null) {
                if (v1) {
                    net.minecraft.client.a.v.r(32884);
                    net.minecraft.client.a.as.f(net.minecraft.client.a.as.U);
                    net.minecraft.client.a.v.r(32888);
                    net.minecraft.client.a.as.f(net.minecraft.client.a.as.p);
                    net.minecraft.client.a.v.r(32888);
                    net.minecraft.client.a.as.f(net.minecraft.client.a.as.U);
                    net.minecraft.client.a.v.r(32886);
                }
                v1 = fU.ag();
            }
            if (var2_2 == null) {
                if (v1) {
                    as.b(var1_1);
                }
                this.ao.a(var1_1);
                v1 = fU.ag();
            }
            if (var2_2 == null) {
                if (v1) {
                    as.a(var1_1);
                }
                v1 = net.minecraft.client.a.as.f();
            }
            if (!v1) break block12;
            for (net.minecraft.client.y.g var4_4 : net.minecraft.client.y.b.s.f()) {
                var5_5 = var4_4.g();
                var6_6 = var4_4.f();
                if (var2_2 != null) return;
                v2 = net.minecraft.client.a.M.a[var5_5.ordinal()];
                if (var2_2 != null) ** GOTO lbl34
                switch (v2) {
                    case 1: {
                        v2 = 32884;
lbl34:
                        // 2 sources

                        net.minecraft.client.a.v.a(v2);
                        if (var2_2 == null) break;
                    }
                    case 2: {
                        net.minecraft.client.a.as.f(net.minecraft.client.a.as.U + var6_6);
                        net.minecraft.client.a.v.a(32888);
                        net.minecraft.client.a.as.f(net.minecraft.client.a.as.U);
                        if (var2_2 == null) break;
                    }
                    case 3: {
                        net.minecraft.client.a.v.a(32886);
                        net.minecraft.client.a.v.p();
                        break;
                    }
                }
                if (var2_2 == null) continue;
            }
        }
        this.l.Y.i();
    }

    /*
     * Exception decompiling
     */
    public void a(W var1_1, I var2_2, net.minecraft.U.x var3_3, float var4_4) {
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

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void a(float var1_1, int var2_2, double var3_3, double var5_4, double var7_5) {
        block38: {
            block37: {
                block30: {
                    var10_6 = 0.0f;
                    net.minecraft.client.a.v.E();
                    var11_7 = net.minecraft.client.a.W.c();
                    var12_8 = var11_7.b();
                    var13_9 = 12.0f;
                    var14_10 = 4.0f;
                    var15_11 = (float)this.aa + var10_6;
                    var17_12 = (var3_3 + var15_11 * 0.029999999329447746) / 12.0;
                    var19_13 = var7_5 / 12.0 + 0.33000001311302185;
                    var21_14 = this.ax.D.f() - (float)var5_4 + 0.33f;
                    var21_14 += this.l.ac.ak * 128.0f;
                    var22_15 = net.minecraft.k.h.f(var17_12 / 2048.0);
                    var23_16 = net.minecraft.k.h.f(var19_13 / 2048.0);
                    var17_12 -= (double)(var22_15 * 2048);
                    var19_13 -= (double)(var23_16 * 2048);
                    var9_17 = net.minecraft.client.a.I.j();
                    this.w.b(aF.h);
                    net.minecraft.client.a.v.a();
                    net.minecraft.client.a.v.a(net.minecraft.client.a.o.SRC_ALPHA, net.minecraft.client.a.G.ONE_MINUS_SRC_ALPHA, net.minecraft.client.a.o.ONE, net.minecraft.client.a.G.ZERO);
                    var24_18 = this.ax.c(var10_6);
                    var25_19 = (float)var24_18.e;
                    var26_20 = (float)var24_18.d;
                    var27_21 = (float)var24_18.b;
                    this.O.a(true, this.aa, var1_1, var24_18);
                    if (var2_2 != 2) {
                        var28_22 = (var25_19 * 30.0f + var26_20 * 59.0f + var27_21 * 11.0f) / 100.0f;
                        var29_23 = (var25_19 * 30.0f + var26_20 * 70.0f) / 100.0f;
                        var30_24 = (var25_19 * 30.0f + var27_21 * 70.0f) / 100.0f;
                        var25_19 = var28_22;
                        var26_20 = var29_23;
                        var27_21 = var30_24;
                    }
                    var28_22 = var25_19 * 0.9f;
                    var29_23 = var26_20 * 0.9f;
                    var30_24 = var27_21 * 0.9f;
                    var31_25 = var25_19 * 0.7f;
                    var32_26 = var26_20 * 0.7f;
                    var33_27 = var27_21 * 0.7f;
                    var34_28 = var25_19 * 0.8f;
                    var35_29 = var26_20 * 0.8f;
                    var36_30 = var27_21 * 0.8f;
                    var37_31 = 0.00390625f;
                    var38_32 = (float)net.minecraft.k.h.f(var17_12) * 0.00390625f;
                    var39_33 = (float)net.minecraft.k.h.f(var19_13) * 0.00390625f;
                    var40_34 = (float)(var17_12 - (double)net.minecraft.k.h.f(var17_12));
                    var41_35 = (float)(var19_13 - (double)net.minecraft.k.h.f(var19_13));
                    var42_36 = 8;
                    var43_37 = 4;
                    var44_38 = 9.765625E-4f;
                    net.minecraft.client.a.v.d(12.0f, 1.0f, 12.0f);
                    for (var45_39 = 0; var45_39 < 2; ++var45_39) {
                        block36: {
                            block34: {
                                block35: {
                                    v0 = var45_39;
                                    if (var9_17 != null) break block30;
                                    if (var9_17 != null) break block34;
                                    if (v0 != 0) break block35;
                                    net.minecraft.client.a.v.a(false, false, false, false);
                                    if (var9_17 == null) break block36;
                                }
                                v1 = var2_2;
                            }
                            if (var9_17 != null) ** GOTO lbl64
                            switch (v1) {
                                case 0: {
                                    v1 = false;
lbl64:
                                    // 2 sources

                                    net.minecraft.client.a.v.a(v1, true, true, true);
                                    if (var9_17 == null) break;
                                }
                                case 1: {
                                    net.minecraft.client.a.v.a(true, false, false, true);
                                    if (var9_17 == null) break;
                                }
                                case 2: {
                                    net.minecraft.client.a.v.a(true, true, true, true);
                                    break;
                                }
                            }
                        }
                        this.O.a();
                        if (var9_17 == null) continue;
                    }
                    v0 = this.O.b() ? 1 : 0;
                }
                if (var9_17 != null) break block37;
                if (v0 == 0) break block38;
                this.O.c();
                v0 = -3;
            }
            var45_39 = v0;
            block6: while (true) {
                v2 = var45_39;
                block7: while (v2 <= 4) {
                    if (var9_17 != null) return;
                    var46_40 = -3;
                    while (var46_40 <= 4) {
                        block33: {
                            block40: {
                                block32: {
                                    block39: {
                                        block31: {
                                            var12_8.a(7, net.minecraft.client.y.b.e);
                                            var47_41 = var45_39 * 8;
                                            var48_42 = var46_40 * 8;
                                            var49_43 = var47_41 - var40_34;
                                            var50_44 = var48_42 - var41_35;
                                            cfr_temp_0 = var21_14 - -5.0f;
                                            v2 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                            if (var9_17 != null) continue block7;
                                            if (var9_17 == null) {
                                                if (v2 > 0) {
                                                    var12_8.c((double)(var49_43 + 0.0f), (double)(var21_14 + 0.0f), (double)(var50_44 + 8.0f)).a((var47_41 + 0.0f) * 0.00390625f + var38_32, (var48_42 + 8.0f) * 0.00390625f + var39_33).a(var31_25, var32_26, var33_27, 0.8f).d(0.0f, -1.0f, 0.0f).d();
                                                    var12_8.c((double)(var49_43 + 8.0f), (double)(var21_14 + 0.0f), (double)(var50_44 + 8.0f)).a((var47_41 + 8.0f) * 0.00390625f + var38_32, (var48_42 + 8.0f) * 0.00390625f + var39_33).a(var31_25, var32_26, var33_27, 0.8f).d(0.0f, -1.0f, 0.0f).d();
                                                    var12_8.c((double)(var49_43 + 8.0f), (double)(var21_14 + 0.0f), (double)(var50_44 + 0.0f)).a((var47_41 + 8.0f) * 0.00390625f + var38_32, (var48_42 + 0.0f) * 0.00390625f + var39_33).a(var31_25, var32_26, var33_27, 0.8f).d(0.0f, -1.0f, 0.0f).d();
                                                    var12_8.c((double)(var49_43 + 0.0f), (double)(var21_14 + 0.0f), (double)(var50_44 + 0.0f)).a((var47_41 + 0.0f) * 0.00390625f + var38_32, (var48_42 + 0.0f) * 0.00390625f + var39_33).a(var31_25, var32_26, var33_27, 0.8f).d(0.0f, -1.0f, 0.0f).d();
                                                }
                                                v3 = (cfr_temp_1 = var21_14 - 5.0f) == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                                            }
                                            if (var9_17 == null) {
                                                if (v3 <= 0) {
                                                    var12_8.c((double)(var49_43 + 0.0f), (double)(var21_14 + 4.0f - 9.765625E-4f), (double)(var50_44 + 8.0f)).a((var47_41 + 0.0f) * 0.00390625f + var38_32, (var48_42 + 8.0f) * 0.00390625f + var39_33).a(var25_19, var26_20, var27_21, 0.8f).d(0.0f, 1.0f, 0.0f).d();
                                                    var12_8.c((double)(var49_43 + 8.0f), (double)(var21_14 + 4.0f - 9.765625E-4f), (double)(var50_44 + 8.0f)).a((var47_41 + 8.0f) * 0.00390625f + var38_32, (var48_42 + 8.0f) * 0.00390625f + var39_33).a(var25_19, var26_20, var27_21, 0.8f).d(0.0f, 1.0f, 0.0f).d();
                                                    var12_8.c((double)(var49_43 + 8.0f), (double)(var21_14 + 4.0f - 9.765625E-4f), (double)(var50_44 + 0.0f)).a((var47_41 + 8.0f) * 0.00390625f + var38_32, (var48_42 + 0.0f) * 0.00390625f + var39_33).a(var25_19, var26_20, var27_21, 0.8f).d(0.0f, 1.0f, 0.0f).d();
                                                    var12_8.c((double)(var49_43 + 0.0f), (double)(var21_14 + 4.0f - 9.765625E-4f), (double)(var50_44 + 0.0f)).a((var47_41 + 0.0f) * 0.00390625f + var38_32, (var48_42 + 0.0f) * 0.00390625f + var39_33).a(var25_19, var26_20, var27_21, 0.8f).d(0.0f, 1.0f, 0.0f).d();
                                                }
                                                v3 = var45_39;
                                            }
                                            v4 = -1;
                                            if (var9_17 == null) {
                                                if (v3 > v4) {
                                                    for (var51_45 = 0; var51_45 < 8; ++var51_45) {
                                                        var12_8.c((double)(var49_43 + (float)var51_45 + 0.0f), (double)(var21_14 + 0.0f), (double)(var50_44 + 8.0f)).a((var47_41 + (float)var51_45 + 0.5f) * 0.00390625f + var38_32, (var48_42 + 8.0f) * 0.00390625f + var39_33).a(var28_22, var29_23, var30_24, 0.8f).d(-1.0f, 0.0f, 0.0f).d();
                                                        var12_8.c((double)(var49_43 + (float)var51_45 + 0.0f), (double)(var21_14 + 4.0f), (double)(var50_44 + 8.0f)).a((var47_41 + (float)var51_45 + 0.5f) * 0.00390625f + var38_32, (var48_42 + 8.0f) * 0.00390625f + var39_33).a(var28_22, var29_23, var30_24, 0.8f).d(-1.0f, 0.0f, 0.0f).d();
                                                        var12_8.c((double)(var49_43 + (float)var51_45 + 0.0f), (double)(var21_14 + 4.0f), (double)(var50_44 + 0.0f)).a((var47_41 + (float)var51_45 + 0.5f) * 0.00390625f + var38_32, (var48_42 + 0.0f) * 0.00390625f + var39_33).a(var28_22, var29_23, var30_24, 0.8f).d(-1.0f, 0.0f, 0.0f).d();
                                                        var12_8.c((double)(var49_43 + (float)var51_45 + 0.0f), (double)(var21_14 + 0.0f), (double)(var50_44 + 0.0f)).a((var47_41 + (float)var51_45 + 0.5f) * 0.00390625f + var38_32, (var48_42 + 0.0f) * 0.00390625f + var39_33).a(var28_22, var29_23, var30_24, 0.8f).d(-1.0f, 0.0f, 0.0f).d();
                                                        if (var9_17 == null) {
                                                            if (var9_17 == null) continue;
                                                        }
                                                        break block31;
                                                    }
                                                }
                                                v3 = var45_39;
                                                v4 = 1;
                                            }
                                            if (var9_17 == null) {
                                                if (v3 <= v4) {
                                                    for (var51_45 = 0; var51_45 < 8; ++var51_45) {
                                                        var12_8.c((double)(var49_43 + (float)var51_45 + 1.0f - 9.765625E-4f), (double)(var21_14 + 0.0f), (double)(var50_44 + 8.0f)).a((var47_41 + (float)var51_45 + 0.5f) * 0.00390625f + var38_32, (var48_42 + 8.0f) * 0.00390625f + var39_33).a(var28_22, var29_23, var30_24, 0.8f).d(1.0f, 0.0f, 0.0f).d();
                                                        var12_8.c((double)(var49_43 + (float)var51_45 + 1.0f - 9.765625E-4f), (double)(var21_14 + 4.0f), (double)(var50_44 + 8.0f)).a((var47_41 + (float)var51_45 + 0.5f) * 0.00390625f + var38_32, (var48_42 + 8.0f) * 0.00390625f + var39_33).a(var28_22, var29_23, var30_24, 0.8f).d(1.0f, 0.0f, 0.0f).d();
                                                        var12_8.c((double)(var49_43 + (float)var51_45 + 1.0f - 9.765625E-4f), (double)(var21_14 + 4.0f), (double)(var50_44 + 0.0f)).a((var47_41 + (float)var51_45 + 0.5f) * 0.00390625f + var38_32, (var48_42 + 0.0f) * 0.00390625f + var39_33).a(var28_22, var29_23, var30_24, 0.8f).d(1.0f, 0.0f, 0.0f).d();
                                                        var12_8.c((double)(var49_43 + (float)var51_45 + 1.0f - 9.765625E-4f), (double)(var21_14 + 0.0f), (double)(var50_44 + 0.0f)).a((var47_41 + (float)var51_45 + 0.5f) * 0.00390625f + var38_32, (var48_42 + 0.0f) * 0.00390625f + var39_33).a(var28_22, var29_23, var30_24, 0.8f).d(1.0f, 0.0f, 0.0f).d();
                                                        if (var9_17 == null) {
                                                            if (var9_17 == null) continue;
                                                        }
                                                        break block32;
                                                    }
                                                } else {
                                                    ** GOTO lbl135
                                                }
                                            }
                                            break block39;
                                        }
                                        v3 = var46_40;
                                        v4 = -1;
                                    }
                                    if (var9_17 == null) {
                                        if (v3 > v4) {
                                            for (var51_45 = 0; var51_45 < 8; ++var51_45) {
                                                var12_8.c((double)(var49_43 + 0.0f), (double)(var21_14 + 4.0f), (double)(var50_44 + (float)var51_45 + 0.0f)).a((var47_41 + 0.0f) * 0.00390625f + var38_32, (var48_42 + (float)var51_45 + 0.5f) * 0.00390625f + var39_33).a(var34_28, var35_29, var36_30, 0.8f).d(0.0f, 0.0f, -1.0f).d();
                                                var12_8.c((double)(var49_43 + 8.0f), (double)(var21_14 + 4.0f), (double)(var50_44 + (float)var51_45 + 0.0f)).a((var47_41 + 8.0f) * 0.00390625f + var38_32, (var48_42 + (float)var51_45 + 0.5f) * 0.00390625f + var39_33).a(var34_28, var35_29, var36_30, 0.8f).d(0.0f, 0.0f, -1.0f).d();
                                                var12_8.c((double)(var49_43 + 8.0f), (double)(var21_14 + 0.0f), (double)(var50_44 + (float)var51_45 + 0.0f)).a((var47_41 + 8.0f) * 0.00390625f + var38_32, (var48_42 + (float)var51_45 + 0.5f) * 0.00390625f + var39_33).a(var34_28, var35_29, var36_30, 0.8f).d(0.0f, 0.0f, -1.0f).d();
                                                var12_8.c((double)(var49_43 + 0.0f), (double)(var21_14 + 0.0f), (double)(var50_44 + (float)var51_45 + 0.0f)).a((var47_41 + 0.0f) * 0.00390625f + var38_32, (var48_42 + (float)var51_45 + 0.5f) * 0.00390625f + var39_33).a(var34_28, var35_29, var36_30, 0.8f).d(0.0f, 0.0f, -1.0f).d();
                                                if (var9_17 == null) {
                                                    if (var9_17 == null) continue;
                                                }
                                                break block33;
                                            }
                                        } else {
                                            ** GOTO lbl150
                                        }
                                    }
                                    break block40;
                                }
                                v3 = var46_40;
                                if (var9_17 != null) ** GOTO lbl157
                                v4 = 1;
                            }
                            if (v3 <= v4) {
                                v3 = (float)false;
lbl157:
                                // 3 sources

                                for (var51_45 = (int)(v1495367); var51_45 < 8; ++var51_45) {
                                    var12_8.c((double)(var49_43 + 0.0f), (double)(var21_14 + 4.0f), (double)(var50_44 + (float)var51_45 + 1.0f - 9.765625E-4f)).a((var47_41 + 0.0f) * 0.00390625f + var38_32, (var48_42 + (float)var51_45 + 0.5f) * 0.00390625f + var39_33).a(var34_28, var35_29, var36_30, 0.8f).d(0.0f, 0.0f, 1.0f).d();
                                    var12_8.c((double)(var49_43 + 8.0f), (double)(var21_14 + 4.0f), (double)(var50_44 + (float)var51_45 + 1.0f - 9.765625E-4f)).a((var47_41 + 8.0f) * 0.00390625f + var38_32, (var48_42 + (float)var51_45 + 0.5f) * 0.00390625f + var39_33).a(var34_28, var35_29, var36_30, 0.8f).d(0.0f, 0.0f, 1.0f).d();
                                    var12_8.c((double)(var49_43 + 8.0f), (double)(var21_14 + 0.0f), (double)(var50_44 + (float)var51_45 + 1.0f - 9.765625E-4f)).a((var47_41 + 8.0f) * 0.00390625f + var38_32, (var48_42 + (float)var51_45 + 0.5f) * 0.00390625f + var39_33).a(var34_28, var35_29, var36_30, 0.8f).d(0.0f, 0.0f, 1.0f).d();
                                    var12_8.c((double)(var49_43 + 0.0f), (double)(var21_14 + 0.0f), (double)(var50_44 + (float)var51_45 + 1.0f - 9.765625E-4f)).a((var47_41 + 0.0f) * 0.00390625f + var38_32, (var48_42 + (float)var51_45 + 0.5f) * 0.00390625f + var39_33).a(var34_28, var35_29, var36_30, 0.8f).d(0.0f, 0.0f, 1.0f).d();
                                    if (var9_17 == null) {
                                        if (var9_17 == null) continue;
                                    }
                                    break;
                                }
                            } else {
                                var11_7.a();
                                ++var46_40;
                            }
                        }
                        if (var9_17 == null) continue;
                    }
                    ++var45_39;
                    if (var9_17 == null) continue block6;
                }
                break;
            }
            this.O.e();
        }
        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
        net.minecraft.client.a.v.f();
        net.minecraft.client.a.v.c();
    }

    private void z() {
        block9: {
            int n2;
            I i2;
            W w2;
            block7: {
                block8: {
                    w2 = net.minecraft.client.a.W.c();
                    String string = net.minecraft.client.a.I.j();
                    i2 = w2.b();
                    aF aF2 = this;
                    if (string == null) {
                        if (aF2.A != null) {
                            this.A.a();
                        }
                        aF2 = this;
                    }
                    n2 = aF2.F;
                    if (string == null) {
                        if (n2 >= 0) {
                            aZ.a(this.F);
                            this.F = -1;
                        }
                        n2 = this.aA ? 1 : 0;
                    }
                    if (string != null) break block7;
                    if (n2 == 0) break block8;
                    this.A = new net.minecraft.client.y.c(this.d);
                    this.a(i2);
                    i2.p();
                    i2.k();
                    this.A.a(i2.b());
                    if (string == null) break block9;
                }
                this.F = aZ.c(1);
                net.minecraft.client.a.v.M();
                n2 = this.F;
            }
            net.minecraft.client.a.v.d(n2, 4864);
            this.a(i2);
            w2.a();
            net.minecraft.client.a.v.w();
            net.minecraft.client.a.v.B();
        }
    }

    public void o() {
        block9: {
            block7: {
                block8: {
                    String string = net.minecraft.client.a.I.j();
                    if (string != null) break block7;
                    if (!net.minecraft.client.a.as.m) break block8;
                    if (net.minecraft.client.s.e.c() == null) {
                        net.minecraft.client.s.e.a();
                    }
                    net.minecraft.ar.v v2 = new net.minecraft.ar.v("shaders/post/entity_outline.json");
                    try {
                        this.al = new net.minecraft.client.s.d(this.l.aN(), this.l.O(), this.l.ao(), v2);
                        this.al.a(this.l.P, this.l.aT);
                        this.M = this.al.a("final");
                    }
                    catch (IOException iOException) {
                        P.warn("Failed to load shader: {}", (Object)v2, (Object)iOException);
                        this.al = null;
                        this.M = null;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        P.warn("Failed to load shader: {}", (Object)v2, (Object)jsonSyntaxException);
                        this.al = null;
                        this.M = null;
                    }
                    if (string == null) break block9;
                }
                this.al = null;
            }
            this.M = null;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public String a() {
        var2_1 = this.af.e.length;
        var1_2 = net.minecraft.client.a.I.j();
        var3_3 = this.n();
        v0 = new Object[6];
        v0[0] = var3_3;
        v0[1] = var2_1;
        v0[2] = this.l.a4 != false ? "(s) " : "";
        v0[3] = this.ap;
        v0[4] = this.aw.size();
        v1 = this.v;
        if (var1_2 != null) ** GOTO lbl16
        if (v1 == null) {
            v2 = "null";
        } else {
            v1 = this.v;
lbl16:
            // 2 sources

            v2 = v1.c();
        }
        v0[5] = v2;
        return String.format("C: %d/%d %sD: %d, L: %d, %s", v0);
    }

    @Override
    public void b(net.minecraft.U.x x2) {
        block0: {
            if (!fU.bi()) break block0;
            gk.b(x2, this);
        }
    }

    private void a(double d10, double d11, double d12) {
        String string = net.minecraft.client.a.I.j();
        this.ar = new net.minecraft.client.G.d();
        ((net.minecraft.client.G.d)this.ar).b();
        Y y2 = new Y(this.ar.a);
        y2.transpose();
        Y y3 = new Y(this.ar.e);
        y3.transpose();
        Y y4 = new Y();
        net.minecraft.client.a.Y.mul((Matrix4f)y3, (Matrix4f)y2, (Matrix4f)y4);
        y4.invert();
        this.e.b = d10;
        this.e.a = d11;
        this.e.c = d12;
        String string2 = string;
        this.j[0] = new Vector4f(-1.0f, -1.0f, -1.0f, 1.0f);
        this.j[1] = new Vector4f(1.0f, -1.0f, -1.0f, 1.0f);
        this.j[2] = new Vector4f(1.0f, 1.0f, -1.0f, 1.0f);
        this.j[3] = new Vector4f(-1.0f, 1.0f, -1.0f, 1.0f);
        this.j[4] = new Vector4f(-1.0f, -1.0f, 1.0f, 1.0f);
        this.j[5] = new Vector4f(1.0f, -1.0f, 1.0f, 1.0f);
        this.j[6] = new Vector4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.j[7] = new Vector4f(-1.0f, 1.0f, 1.0f, 1.0f);
        for (int i2 = 0; i2 < 8; ++i2) {
            net.minecraft.client.a.Y.transform((Matrix4f)y4, (Vector4f)this.j[i2], (Vector4f)this.j[i2]);
            this.j[i2].x /= this.j[i2].w;
            this.j[i2].y /= this.j[i2].w;
            this.j[i2].z /= this.j[i2].w;
            this.j[i2].w = 1.0f;
            if (string2 == null) continue;
        }
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a(n2 - 1, n3 - 1, n4 - 1, n5 + 1, n6 + 1, n7 + 1, false);
    }

    protected Vector3f a(net.minecraft.U.x x2, double d10) {
        float f10 = (float)((double)x2.E + (double)(x2.at - x2.E) * d10);
        float f11 = (float)((double)x2.ak + (double)(x2.e - x2.ak) * d10);
        if (net.minecraft.client.Q.P().ac.L == 2) {
            f10 += 180.0f;
        }
        float f12 = net.minecraft.k.h.c(-f11 * ((float)Math.PI / 180) - (float)Math.PI);
        float f13 = net.minecraft.k.h.g(-f11 * ((float)Math.PI / 180) - (float)Math.PI);
        float f14 = -net.minecraft.k.h.c(-f10 * ((float)Math.PI / 180));
        float f15 = net.minecraft.k.h.g(-f10 * ((float)Math.PI / 180));
        return new Vector3f(f13 * f14, f15, f12 * f14);
    }

    private int a(boolean n2) {
        int n3;
        block11: {
            int n4;
            block12: {
                int n5;
                String string;
                block10: {
                    block8: {
                        block9: {
                            n4 = this.l.ac.bC;
                            string = net.minecraft.client.a.I.j();
                            n3 = n2;
                            if (string != null) break block8;
                            if (n3 == 0) break block9;
                            n3 = n4;
                            n5 = 2;
                            if (string != null) break block10;
                            if (n3 != n5) break block9;
                            n3 = this.ax.J.nextInt(10);
                            if (string != null) break block8;
                            if (n3 == 0) {
                                n4 = 1;
                            }
                        }
                        n3 = n4;
                    }
                    if (string != null) break block11;
                    n5 = 1;
                }
                if (n3 != n5) break block12;
                n3 = this.ax.J.nextInt(3);
                if (string != null) break block11;
                if (n3 == 0) {
                    n4 = 2;
                }
            }
            n3 = n4;
        }
        return n3;
    }

    @Override
    public void a(@Nullable net.minecraft.ar.d d10, n n2) {
        block6: {
            aV aV2;
            net.minecraft.ar.d d11;
            block5: {
                net.minecraft.client.e.j j2 = this.o.get(n2);
                String string = net.minecraft.client.a.I.j();
                net.minecraft.client.e.j j3 = j2;
                if (string == null && j3 != null) {
                    this.l.p().a(j2);
                    j3 = this.o.remove(n2);
                }
                d11 = d10;
                if (string != null) break block5;
                if (d11 == null) break block6;
                d11 = d10;
            }
            if ((aV2 = aV.a(d11)) != null) {
                this.l.n.a(aV2.b());
            }
            net.minecraft.client.e.y y2 = net.minecraft.client.e.y.a(d10, n2.e(), n2.b(), n2.a());
            this.o.put(n2, y2);
            this.l.p().c(y2);
        }
        this.a(this.ax, n2, d10 != null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int m() {
        net.minecraft.o.k k2;
        String string = net.minecraft.client.a.I.j();
        net.minecraft.client.E.l l2 = this.ax;
        if (string == null) {
            if (l2 == null) {
                return 0;
            }
            l2 = this.ax;
        }
        net.minecraft.o.k k3 = k2 = l2.f();
        if (string == null) {
            if (k3 == null) {
                return 0;
            }
            k3 = k2;
        }
        if (k3 != this.aj) {
            this.aj = k2;
            this.z = (Long2ObjectMap)cq.a(k2, cq.dz);
        }
        Long2ObjectMap<a> long2ObjectMap = this.z;
        if (string == null) {
            if (long2ObjectMap == null) {
                return 0;
            }
            long2ObjectMap = this.z;
        }
        int n2 = long2ObjectMap.size();
        return n2;
    }

    private void a(z z2, n n2, boolean bl2) {
        Iterator<B> iterator = z2.a(B.class, new net.minecraft.k.k(n2).a(3.0)).iterator();
        String string = net.minecraft.client.a.I.j();
        while (iterator.hasNext()) {
            B b10 = iterator.next();
            b10.a(n2, bl2);
            if (string == null) continue;
        }
    }

    private T a(s s2, aA aA2, int n2) {
        T t2;
        block4: {
            Object object;
            block2: {
                block3: {
                    String string = net.minecraft.client.a.I.j();
                    object = n;
                    if (string != null) break block2;
                    if (!object.isEmpty()) break block3;
                    t2 = new T(s2, aA2, n2);
                    if (string == null) break block4;
                }
                object = n.pollLast();
            }
            t2 = (T)object;
            net.minecraft.client.a.T.a(t2, s2, aA2, n2);
        }
        t2.b = true;
        return t2;
    }

    @Override
    public void a(z z2, n n2, net.minecraft.Z.i i2, net.minecraft.Z.i i3, int n3) {
        int n4 = n2.e();
        int n5 = n2.b();
        int n6 = n2.a();
        String string = net.minecraft.client.a.I.j();
        boolean bl2 = n3 & 8;
        if (string == null) {
            bl2 = bl2;
        }
        this.a(n4 - 1, n5 - 1, n6 - 1, n4 + 1, n5 + 1, n6 + 1, bl2);
    }

    @Override
    public void a(int n2, boolean bl2, double d10, double d11, double d12, double d13, double d14, double d15, int ... arrn) {
        this.a(n2, bl2, false, d10, d11, d12, d13, d14, d15, arrn);
    }

    private void a(int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2) {
        this.af.a(n2, n3, n4, n5, n6, n7, bl2);
    }

    /*
     * Exception decompiling
     */
    private boolean a(net.minecraft.U.x var1_1, net.minecraft.U.x var2_2, net.minecraft.client.G.b var3_3) {
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

    public static void b(net.minecraft.k.k k2, float f10, float f11, float f12, float f13) {
        aF.b(k2.e, k2.b, k2.d, k2.f, k2.a, k2.g, f10, f11, f12, f13);
    }

    public void a(long l2) {
        block25: {
            Set<s> set;
            int n2;
            int n3;
            int n4;
            String string;
            block24: {
                int n5;
                block22: {
                    block23: {
                        s s2;
                        Iterator iterator;
                        l2 = (long)((double)l2 + 1.0E8);
                        this.V |= this.v.a(l2);
                        string = net.minecraft.client.a.I.j();
                        n5 = this.Q.size();
                        if (string == null) {
                            if (n5 > 0) {
                                iterator = this.Q.iterator();
                                while (iterator.hasNext()) {
                                    s2 = (s)iterator.next();
                                    n5 = this.v.a(s2) ? 1 : 0;
                                    if (string == null) {
                                        if (string == null) {
                                            if (n5 == 0 && string == null) break;
                                            s2.k();
                                            iterator.remove();
                                            this.ak.remove(s2);
                                            this.ac.remove(s2);
                                        }
                                        if (string == null) continue;
                                    }
                                    break;
                                }
                            } else {
                                n5 = this.ac.size();
                            }
                        }
                        if (string != null) break block22;
                        if (n5 <= 0) break block23;
                        iterator = this.ac.iterator();
                        n5 = iterator.hasNext() ? 1 : 0;
                        if (string != null) break block22;
                        if (n5 == 0) break block23;
                        s2 = (s)iterator.next();
                        n5 = this.v.b(s2) ? 1 : 0;
                        if (string != null) break block22;
                        if (n5 != 0) {
                            iterator.remove();
                        }
                    }
                    n5 = 0;
                }
                n4 = n5;
                n3 = fU.a1();
                n2 = n3 * 2;
                set = this.ak;
                if (string != null) break block24;
                if (set.isEmpty()) break block25;
                set = this.ak;
            }
            Iterator<s> iterator = set.iterator();
            while (iterator.hasNext()) {
                int n6;
                int n7;
                block31: {
                    block29: {
                        block30: {
                            int n8;
                            s s3;
                            block28: {
                                int n9;
                                block26: {
                                    block27: {
                                        s3 = iterator.next();
                                        n9 = s3.j();
                                        if (string != null) break block26;
                                        if (n9 == 0) break block27;
                                        n8 = this.v.c(s3);
                                        if (string == null) break block28;
                                    }
                                    n9 = this.v.a(s3);
                                }
                                n8 = n9;
                            }
                            n7 = n8;
                            if (string == null) {
                                if (n7 == 0 && string == null) break;
                                s3.k();
                                iterator.remove();
                                n7 = s3.b().a() ? 1 : 0;
                            }
                            if (string != null) break block29;
                            if (n7 == 0) break block30;
                            int n6 = n3++;
                            n6 = n2;
                            if (string != null) break block31;
                            if (n7 < n6) {
                                // empty if block
                            }
                        }
                        n7 = ++n4;
                    }
                    n6 = n3;
                }
                if ((n7 < n6 || string != null) && string == null) continue;
                break;
            }
        }
    }

    public static void a(I i2, double d10, double d11, double d12, double d13, double d14, double d15, float f10, float f11, float f12, float f13) {
        block0: {
            i2.c(d10, d11, d12).a(f10, f11, f12, f13).d();
            i2.c(d10, d11, d12).a(f10, f11, f12, f13).d();
            i2.c(d10, d11, d12).a(f10, f11, f12, f13).d();
            i2.c(d10, d11, d15).a(f10, f11, f12, f13).d();
            i2.c(d10, d14, d12).a(f10, f11, f12, f13).d();
            i2.c(d10, d14, d15).a(f10, f11, f12, f13).d();
            i2.c(d10, d14, d15).a(f10, f11, f12, f13).d();
            i2.c(d10, d11, d15).a(f10, f11, f12, f13).d();
            i2.c(d13, d14, d15).a(f10, f11, f12, f13).d();
            i2.c(d13, d11, d15).a(f10, f11, f12, f13).d();
            i2.c(d13, d11, d15).a(f10, f11, f12, f13).d();
            i2.c(d13, d11, d12).a(f10, f11, f12, f13).d();
            i2.c(d13, d14, d15).a(f10, f11, f12, f13).d();
            i2.c(d13, d14, d12).a(f10, f11, f12, f13).d();
            i2.c(d13, d14, d12).a(f10, f11, f12, f13).d();
            i2.c(d13, d11, d12).a(f10, f11, f12, f13).d();
            i2.c(d10, d14, d12).a(f10, f11, f12, f13).d();
            i2.c(d10, d11, d12).a(f10, f11, f12, f13).d();
            i2.c(d10, d11, d12).a(f10, f11, f12, f13).d();
            i2.c(d13, d11, d12).a(f10, f11, f12, f13).d();
            String string = net.minecraft.client.a.I.j();
            i2.c(d10, d11, d15).a(f10, f11, f12, f13).d();
            i2.c(d13, d11, d15).a(f10, f11, f12, f13).d();
            i2.c(d13, d11, d15).a(f10, f11, f12, f13).d();
            String string2 = string;
            i2.c(d10, d14, d12).a(f10, f11, f12, f13).d();
            i2.c(d10, d14, d12).a(f10, f11, f12, f13).d();
            i2.c(d10, d14, d15).a(f10, f11, f12, f13).d();
            i2.c(d13, d14, d12).a(f10, f11, f12, f13).d();
            i2.c(d13, d14, d15).a(f10, f11, f12, f13).d();
            i2.c(d13, d14, d15).a(f10, f11, f12, f13).d();
            i2.c(d13, d14, d15).a(f10, f11, f12, f13).d();
            if (net.minecraft.k.m.d()) break block0;
            net.minecraft.client.a.I.b("PMKP8");
        }
    }

    protected int n() {
        int n2 = 0;
        Iterator<T> iterator = this.s.iterator();
        String string = net.minecraft.client.a.I.j();
        while (iterator.hasNext()) {
            block6: {
                net.minecraft.client.k.m m2;
                block5: {
                    net.minecraft.client.k.m m3;
                    T t2 = iterator.next();
                    m2 = m3 = t2.a.j;
                    if (string != null) break block5;
                    if (m2 == net.minecraft.client.k.m.b) break block6;
                    m2 = m3;
                }
                if (!m2.a()) {
                    ++n2;
                }
            }
            if (string == null) continue;
        }
        return n2;
    }

    public boolean a(double d10, double d11, double d12, float f10) {
        return false;
    }

    public void v() {
    }

    public void f() {
        block3: {
            aF aF2;
            block2: {
                String string = net.minecraft.client.a.I.j();
                aF2 = this;
                if (string != null) break block2;
                if (!aF2.r()) break block3;
                net.minecraft.client.a.v.a();
                net.minecraft.client.a.v.a(net.minecraft.client.a.o.SRC_ALPHA, net.minecraft.client.a.G.ONE_MINUS_SRC_ALPHA, net.minecraft.client.a.o.ZERO, net.minecraft.client.a.G.ONE);
                aF2 = this;
            }
            aF2.M.a(this.l.P, this.l.aT, false);
            net.minecraft.client.a.v.f();
        }
    }

    public int k() {
        return this.g;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Nullable
    private av a(int var1_2, boolean var2_3, boolean var3_4, double var4_5, double var6_6, double var8_7, double var10_8, double var12_9, double var14_10, int ... var16_1) {
        block109: {
            block108: {
                var18_11 = this.l.Z();
                var17_12 = net.minecraft.client.a.I.j();
                if (this.l == null) return null;
                if (var18_11 == null) return null;
                v0 = this;
                if (var17_12 == null) {
                    if (v0.l.au == null) return null;
                    v0 = this;
                }
                var19_13 = v0.a(var3_4);
                var20_14 = var18_11.a - var4_5;
                var22_15 = var18_11.aF - var6_6;
                var24_16 = var18_11.ax - var8_7;
                v1 = var1_2;
                v2 = aH.EXPLOSION_HUGE.a();
                if (var17_12 == null) {
                    if (v1 == v2) {
                        v1 = fU.aG() ? 1 : 0;
                        if (var17_12 == null) {
                            if (v1 == 0) {
                                return null;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v1 = var1_2;
                    }
                    v2 = aH.EXPLOSION_LARGE.a();
                }
                if (var17_12 == null) {
                    if (v1 == v2) {
                        v1 = fU.aG() ? 1 : 0;
                        if (var17_12 == null) {
                            if (v1 == 0) {
                                return null;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v1 = var1_2;
                    }
                    v2 = aH.EXPLOSION_NORMAL.a();
                }
                if (var17_12 == null) {
                    if (v1 == v2) {
                        v1 = fU.aG() ? 1 : 0;
                        if (var17_12 == null) {
                            if (v1 == 0) {
                                return null;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v1 = var1_2;
                    }
                    v2 = aH.SUSPENDED.a();
                }
                if (var17_12 == null) {
                    if (v1 == v2) {
                        v1 = fU.ae() ? 1 : 0;
                        if (var17_12 == null) {
                            if (v1 == 0) {
                                return null;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v1 = var1_2;
                    }
                    v2 = aH.SUSPENDED_DEPTH.a();
                }
                if (var17_12 == null) {
                    if (v1 == v2) {
                        v1 = fU.w() ? 1 : 0;
                        if (var17_12 == null) {
                            if (v1 == 0) {
                                return null;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v1 = var1_2;
                    }
                    v2 = aH.SMOKE_NORMAL.a();
                }
                if (var17_12 == null) {
                    if (v1 == v2) {
                        v1 = fU.R() ? 1 : 0;
                        if (var17_12 == null) {
                            if (v1 == 0) {
                                return null;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v1 = var1_2;
                    }
                    v2 = aH.SMOKE_LARGE.a();
                }
                if (var17_12 == null) {
                    if (v1 == v2) {
                        v1 = fU.R() ? 1 : 0;
                        if (var17_12 == null) {
                            if (v1 == 0) {
                                return null;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v1 = var1_2;
                    }
                    v2 = aH.SPELL_MOB.a();
                }
                if (var17_12 == null) {
                    if (v1 == v2) {
                        v1 = fU.H() ? 1 : 0;
                        if (var17_12 == null) {
                            if (v1 == 0) {
                                return null;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v1 = var1_2;
                    }
                    v2 = aH.SPELL_MOB_AMBIENT.a();
                }
                if (var17_12 == null) {
                    if (v1 == v2) {
                        v1 = fU.H() ? 1 : 0;
                        if (var17_12 == null) {
                            if (v1 == 0) {
                                return null;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v1 = var1_2;
                    }
                    v2 = aH.SPELL.a();
                }
                if (var17_12 == null) {
                    if (v1 == v2) {
                        v1 = fU.H() ? 1 : 0;
                        if (var17_12 == null) {
                            if (v1 == 0) {
                                return null;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v1 = var1_2;
                    }
                    v2 = aH.SPELL_INSTANT.a();
                }
                if (var17_12 == null) {
                    if (v1 == v2) {
                        v1 = fU.H() ? 1 : 0;
                        if (var17_12 == null) {
                            if (v1 == 0) {
                                return null;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v1 = var1_2;
                    }
                    v2 = aH.SPELL_WITCH.a();
                }
                if (var17_12 == null) {
                    if (v1 == v2) {
                        v1 = fU.H() ? 1 : 0;
                        if (var17_12 == null) {
                            if (v1 == 0) {
                                return null;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v1 = var1_2;
                    }
                    v2 = aH.PORTAL.a();
                }
                if (var17_12 == null) {
                    if (v1 == v2) {
                        v1 = fU.as() ? 1 : 0;
                        if (var17_12 == null) {
                            if (v1 == 0) {
                                return null;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v1 = var1_2;
                    }
                    v2 = aH.FLAME.a();
                }
                if (var17_12 == null) {
                    if (v1 == v2) {
                        v1 = fU.A() ? 1 : 0;
                        if (var17_12 == null) {
                            if (v1 == 0) {
                                return null;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v1 = var1_2;
                    }
                    v2 = aH.REDSTONE.a();
                }
                if (var17_12 == null) {
                    if (v1 == v2) {
                        v1 = fU.k() ? 1 : 0;
                        if (var17_12 == null) {
                            if (v1 == 0) {
                                return null;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v1 = var1_2;
                    }
                    v2 = aH.DRIP_WATER.a();
                }
                if (var17_12 == null) {
                    if (v1 == v2) {
                        v1 = fU.ah() ? 1 : 0;
                        if (var17_12 == null) {
                            if (v1 == 0) {
                                return null;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v1 = var1_2;
                    }
                    v2 = aH.DRIP_LAVA.a();
                }
                if (var17_12 != null) break block108;
                if (v1 == v2) {
                    v1 = fU.ah() ? 1 : 0;
                    if (var17_12 == null) {
                        if (v1 == 0) {
                            return null;
                        } else {
                            ** GOTO lbl-1000
                        }
                    }
                } else lbl-1000:
                // 3 sources

                {
                    v1 = var1_2;
                }
                if (var17_12 != null) break block109;
                v2 = aH.FIREWORKS_SPARK.a();
            }
            if (v1 == v2) {
                v1 = fU.j() ? 1 : 0;
                if (var17_12 == null) {
                    if (v1 == 0) {
                        return null;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v1 = var2_3 ? 1 : 0;
            }
        }
        if (v1 == 0) {
            var26_17 = 1024.0;
            v3 = var1_2;
            if (var17_12 == null) {
                if (v3 == aH.CRIT.a()) {
                    var26_17 = 38416.0;
                }
                v3 = (cfr_temp_0 = var20_14 * var20_14 + var22_15 * var22_15 + var24_16 * var24_16 - var26_17) == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
            }
            if (var17_12 == null) {
                if (v3 > 0) {
                    return null;
                }
                v3 = var19_13;
            }
            if (v3 > 1) {
                return null;
            }
        }
        var26_18 = this.l.au.a(var1_2, var4_5, var6_6, var8_7, var10_8, var12_9, var14_10, var16_1);
        v4 = var1_2;
        v5 = aH.WATER_BUBBLE.a();
        if (var17_12 == null) {
            if (v4 == v5) {
                fa.a(var26_18, this.ax, var4_5, var6_6, var8_7, this.D);
            }
            v4 = var1_2;
            v5 = aH.WATER_SPLASH.a();
        }
        if (var17_12 == null) {
            if (v4 == v5) {
                fa.a(var26_18, this.ax, var4_5, var6_6, var8_7, this.D);
            }
            v4 = var1_2;
            v5 = aH.WATER_DROP.a();
        }
        if (var17_12 == null) {
            if (v4 == v5) {
                fa.a(var26_18, this.ax, var4_5, var6_6, var8_7, this.D);
            }
            v4 = var1_2;
            v5 = aH.TOWN_AURA.a();
        }
        if (var17_12 == null) {
            if (v4 == v5) {
                fa.a(var26_18);
            }
            v4 = var1_2;
            v5 = aH.PORTAL.a();
        }
        if (var17_12 == null) {
            if (v4 == v5) {
                fa.b(var26_18);
            }
            v4 = var1_2;
            v5 = aH.REDSTONE.a();
        }
        if (v4 != v5) return var26_18;
        fa.a(var26_18, (t)this.ax, var4_5, var6_6, var8_7);
        return var26_18;
    }

    private void q() {
        block9: {
            int n2;
            I i2;
            W w2;
            block7: {
                block8: {
                    w2 = net.minecraft.client.a.W.c();
                    i2 = w2.b();
                    String string = net.minecraft.client.a.I.j();
                    aF aF2 = this;
                    if (string == null) {
                        if (aF2.W != null) {
                            this.W.a();
                        }
                        aF2 = this;
                    }
                    n2 = aF2.Y;
                    if (string == null) {
                        if (n2 >= 0) {
                            aZ.a(this.Y);
                            this.Y = -1;
                        }
                        n2 = this.aA ? 1 : 0;
                    }
                    if (string != null) break block7;
                    if (n2 == 0) break block8;
                    this.W = new net.minecraft.client.y.c(this.d);
                    this.a(i2, -16.0f, true);
                    i2.p();
                    i2.k();
                    this.W.a(i2.b());
                    if (string == null) break block9;
                }
                n2 = this.Y = aZ.c(1);
            }
            net.minecraft.client.a.v.d(n2, 4864);
            this.a(i2, -16.0f, true);
            w2.a();
            net.minecraft.client.a.v.w();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void d() {
        block19: {
            block24: {
                aF aF2;
                block25: {
                    boolean bl2;
                    String string;
                    block23: {
                        boolean bl3;
                        block22: {
                            block20: {
                                block21: {
                                    aF aF3;
                                    block18: {
                                        string = net.minecraft.client.a.I.j();
                                        aF3 = this;
                                        if (string != null) break block18;
                                        if (aF3.ax == null) break block19;
                                        aF3 = this;
                                    }
                                    if (string == null) {
                                        if (aF3.v == null) {
                                            this.v = new net.minecraft.client.k.b();
                                        }
                                        aF3 = this;
                                    }
                                    aF3.V = true;
                                    net.minecraft.u.g.bU.a(fU.av());
                                    net.minecraft.u.g.S.a(fU.av());
                                    net.minecraft.client.a.y.a();
                                    n.clear();
                                    boolean bl4 = fU.bi();
                                    if (string == null) {
                                        if (bl4) {
                                            gk.b();
                                        }
                                        this.ap = this.l.ac.bf;
                                        this.S = this.ap * 16;
                                        this.az = this.S * this.S;
                                        bl4 = this.aA;
                                    }
                                    bl3 = bl4;
                                    this.aA = net.minecraft.client.a.as.f();
                                    bl2 = bl3;
                                    if (string != null) break block20;
                                    if (!bl2) break block21;
                                    bl2 = this.aA;
                                    if (string != null) break block20;
                                    if (bl2) break block21;
                                    this.ao = new ar();
                                    this.T = new net.minecraft.client.k.i();
                                    if (string == null) break block22;
                                }
                                bl2 = bl3;
                            }
                            if (string != null) break block23;
                            if (bl2) break block22;
                            bl2 = this.aA;
                            if (string != null) break block23;
                            if (bl2) {
                                this.ao = new aM();
                                this.T = new net.minecraft.client.k.o();
                            }
                        }
                        bl2 = bl3;
                    }
                    if (bl2 != this.aA) {
                        this.z();
                        this.y();
                        this.q();
                    }
                    aF aF4 = this;
                    if (string == null) {
                        if (aF4.af != null) {
                            this.af.a();
                        }
                        this.s();
                        aF4 = this;
                    }
                    Object object = aF4.J;
                    synchronized (object) {
                        this.J.clear();
                    }
                    this.af = new aC(this.ax, this.l.ac.bf, this, this.T);
                    aF2 = this;
                    if (string != null) break block24;
                    if (aF2.ax == null) break block25;
                    aF2 = this;
                    if (string != null) break block24;
                    object = aF2.l.Z();
                    if (object != null) {
                        this.af.a(((net.minecraft.U.x)object).a, ((net.minecraft.U.x)object).ax);
                    }
                }
                aF2 = this;
            }
            aF2.K = 2;
        }
    }

    private void i() {
        net.minecraft.client.j.j j2 = this.l.an();
        String string = net.minecraft.client.a.I.j();
        for (int i2 = 0; i2 < this.C.length; ++i2) {
            this.C[i2] = j2.b("minecraft:blocks/destroy_stage_" + i2);
            if (string == null) continue;
        }
    }

    @Nullable
    private av a(int n2, boolean bl2, double d10, double d11, double d12, double d13, double d14, double d15, int ... arrn) {
        return this.a(n2, bl2, false, d10, d11, d12, d13, d14, d15, arrn);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public aF(Q q2) {
        block4: {
            block2: {
                aF aF2;
                block3: {
                    this.ak = Sets.newLinkedHashSet();
                    this.s = Lists.newArrayListWithCapacity((int)69696);
                    this.J = Sets.newHashSet();
                    this.F = -1;
                    this.av = -1;
                    this.Y = -1;
                    this.ay = Maps.newHashMap();
                    this.o = Maps.newHashMap();
                    this.C = new net.minecraft.client.j.c[10];
                    this.i = Double.MIN_VALUE;
                    this.ah = Double.MIN_VALUE;
                    this.p = Double.MIN_VALUE;
                    this.G = Integer.MIN_VALUE;
                    this.U = Integer.MIN_VALUE;
                    this.I = Integer.MIN_VALUE;
                    this.r = Double.MIN_VALUE;
                    this.X = Double.MIN_VALUE;
                    this.ag = Double.MIN_VALUE;
                    this.Z = Double.MIN_VALUE;
                    this.ab = Double.MIN_VALUE;
                    this.ap = -1;
                    this.K = 2;
                    this.j = new Vector4f[8];
                    this.e = new a9();
                    this.V = true;
                    this.aw = Sets.newHashSet();
                    this.ac = new LinkedHashSet();
                    this.Q = new LinkedHashSet();
                    this.E = new ArrayDeque();
                    this.y = new ArrayList(1024);
                    this.b = new ArrayList(1024);
                    this.B = new ArrayList(1024);
                    this.an = new ArrayList(1024);
                    this.L = new ArrayList(1024);
                    this.k = new ArrayList(1024);
                    this.ai = new ArrayList(1024);
                    this.at = new ArrayList(1024);
                    this.S = 0;
                    this.az = 0;
                    this.aj = null;
                    this.z = null;
                    String string = net.minecraft.client.a.I.j();
                    this.m = 0;
                    this.D = new e9(this.ax, net.minecraft.u.g.bf.d(), new n(0, 0, 0));
                    this.a = false;
                    this.aB = false;
                    this.O = new eB(q2);
                    this.l = q2;
                    this.t = q2.aQ();
                    this.w = q2.aN();
                    this.w.b(ad);
                    net.minecraft.client.a.v.c(3553, 10242, 10497);
                    net.minecraft.client.a.v.c(3553, 10243, 10497);
                    net.minecraft.client.a.v.t(0);
                    this.i();
                    this.aA = net.minecraft.client.a.as.f();
                    aF2 = this;
                    if (string != null) break block2;
                    if (!aF2.aA) break block3;
                    this.ao = new aM();
                    this.T = new net.minecraft.client.k.o();
                    if (string == null) break block4;
                }
                this.ao = new ar();
                aF2 = this;
            }
            aF2.T = new net.minecraft.client.k.i();
        }
        this.d = new e();
        this.d.a(new net.minecraft.client.y.g(0, net.minecraft.client.y.a.FLOAT, net.minecraft.client.y.d.POSITION, 3));
        this.z();
        this.y();
        this.q();
    }

    private void e() {
        block0: {
            net.minecraft.client.a.v.v();
            net.minecraft.client.a.v.b(0.0f, 0.0f);
            net.minecraft.client.a.v.I();
            net.minecraft.client.a.v.e();
            net.minecraft.client.a.v.a(true);
            net.minecraft.client.a.v.B();
            if (!fU.ag()) break block0;
            as.i();
        }
    }

    public static void b(I i2, double d10, double d11, double d12, double d13, double d14, double d15, float f10, float f11, float f12, float f13) {
        i2.c(d10, d11, d12).a(f10, f11, f12, f13).d();
        i2.c(d13, d11, d12).a(f10, f11, f12, f13).d();
        i2.c(d13, d11, d15).a(f10, f11, f12, f13).d();
        i2.c(d10, d11, d15).a(f10, f11, f12, f13).d();
        i2.c(d10, d11, d12).a(f10, f11, f12, f13).d();
        i2.c(d10, d14, d12).a(f10, f11, f12, f13).d();
        i2.c(d13, d14, d12).a(f10, f11, f12, f13).d();
        i2.c(d13, d14, d15).a(f10, f11, f12, f13).d();
        i2.c(d10, d14, d15).a(f10, f11, f12, f13).d();
        i2.c(d10, d14, d12).a(f10, f11, f12, 0.0f).d();
        i2.c(d10, d14, d15).a(f10, f11, f12, f13).d();
        i2.c(d10, d11, d15).a(f10, f11, f12, f13).d();
        i2.c(d13, d11, d15).a(f10, f11, f12, 0.0f).d();
        i2.c(d13, d14, d15).a(f10, f11, f12, f13).d();
        i2.c(d13, d14, d12).a(f10, f11, f12, 0.0f).d();
        i2.c(d13, d11, d12).a(f10, f11, f12, f13).d();
    }

    public s b(n n2) {
        return this.af.a(n2);
    }

    public void a(@Nullable net.minecraft.client.E.l l2) {
        block12: {
            String string;
            block11: {
                net.minecraft.client.E.l l3;
                block10: {
                    string = net.minecraft.client.a.I.j();
                    aF aF2 = this;
                    if (string == null) {
                        if (aF2.ax != null) {
                            this.ax.b(this);
                        }
                        this.i = Double.MIN_VALUE;
                        this.ah = Double.MIN_VALUE;
                        this.p = Double.MIN_VALUE;
                        this.G = Integer.MIN_VALUE;
                        this.U = Integer.MIN_VALUE;
                        this.I = Integer.MIN_VALUE;
                        this.t.a(l2);
                        aF2 = this;
                    }
                    aF2.ax = l2;
                    if (fU.bi()) {
                        gk.b();
                    }
                    l3 = l2;
                    if (string != null) break block10;
                    if (l3 == null) break block11;
                    l3 = l2;
                }
                l3.a(this);
                this.d();
                if (string == null) break block12;
            }
            this.ak.clear();
            this.s.clear();
            aF aF3 = this;
            if (string == null) {
                if (aF3.af != null) {
                    this.af.a();
                    this.af = null;
                }
                aF3 = this;
            }
            if (string == null) {
                if (aF3.v != null) {
                    this.v.f();
                }
                aF3 = this;
            }
            aF3.v = null;
        }
    }

    @Override
    public void a(n n2) {
        this.aw.add(n2.l());
    }

    @Override
    public void b(int n2, n n3, int n4) {
        String string = net.minecraft.client.a.I.j();
        switch (n2) {
            case 1023: 
            case 1028: 
            case 1038: {
                net.minecraft.U.x x2 = this.l.Z();
                if (x2 == null) break;
                double d10 = (double)n3.e() - x2.a;
                double d11 = (double)n3.b() - x2.aF;
                double d12 = (double)n3.a() - x2.ax;
                double d13 = Math.sqrt(d10 * d10 + d11 * d11 + d12 * d12);
                double d14 = x2.a;
                double d15 = x2.aF;
                double d16 = x2.ax;
                double d17 = d13 - 0.0;
                double d18 = d17 == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
                if (string == null) {
                    if (d18 > 0) {
                        d14 += d10 / d13 * 2.0;
                        d15 += d11 / d13 * 2.0;
                        d16 += d12 / d13 * 2.0;
                    }
                    d18 = n2;
                }
                int n5 = 1023;
                if (string == null) {
                    if (d18 == n5) {
                        this.ax.a(d14, d15, d16, net.minecraft.u.E.q, net.minecraft.ar.ay.HOSTILE, 1.0f, 1.0f, false);
                        if (string == null) break;
                    }
                    d18 = n2;
                    n5 = 1038;
                }
                if (d18 == n5) {
                    this.ax.a(d14, d15, d16, net.minecraft.u.E.bH, net.minecraft.ar.ay.HOSTILE, 1.0f, 1.0f, false);
                    if (string == null) break;
                }
                this.ax.a(d14, d15, d16, net.minecraft.u.E.e1, net.minecraft.ar.ay.HOSTILE, 5.0f, 1.0f, false);
                break;
            }
        }
    }

    public int A() {
        return this.s.size();
    }

    public int a(net.minecraft.ar.aC aC2, double d10, int n2, net.minecraft.U.x x2) {
        int n3;
        block28: {
            int n4;
            block29: {
                String string;
                block21: {
                    int n5;
                    int n6;
                    block20: {
                        block22: {
                            block23: {
                                block25: {
                                    double d11;
                                    block24: {
                                        String string2 = net.minecraft.client.a.I.j();
                                        a0.a();
                                        string = string2;
                                        if (string != null) break block22;
                                        if (aC2 != net.minecraft.ar.aC.TRANSLUCENT) break block23;
                                        this.l.an.b("translucent_sort");
                                        double d12 = x2.a - this.aq;
                                        double d13 = x2.aF - this.ae;
                                        double d14 = x2.ax - this.f;
                                        double d11 = d12 * d12 + d13 * d13 + d14 * d14 - 1.0;
                                        d11 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                                        if (string != null) break block24;
                                        if (d11 <= 0) break block25;
                                        this.aq = x2.a;
                                        this.ae = x2.aF;
                                        this.f = x2.ax;
                                        d11 = 0.0;
                                    }
                                    double d16 = d11;
                                    this.ac.clear();
                                    for (T t2 : this.s) {
                                        block27: {
                                            double d17;
                                            block26: {
                                                n6 = t2.a.j.c(aC2) ? 1 : 0;
                                                if (string != null) break block20;
                                                if (string != null) break block26;
                                                if (n6 == 0) break block27;
                                                d17 = d16++;
                                            }
                                            if (string == null && d17 < 15) {
                                                d17 = (double)this.ac.add(t2.a);
                                            }
                                        }
                                        if (string == null) continue;
                                    }
                                }
                                this.l.an.c();
                            }
                            this.l.an.b("filterempty");
                        }
                        n6 = 0;
                    }
                    n4 = n6;
                    int n7 = n5 = aC2 == net.minecraft.ar.aC.TRANSLUCENT ? 1 : 0;
                    if (string == null) {
                        n7 = n7 != 0 ? this.s.size() - 1 : 0;
                    }
                    int n8 = n7;
                    int n9 = n5;
                    if (string == null) {
                        n9 = n9 != 0 ? -1 : this.s.size();
                    }
                    int n10 = n9;
                    int n11 = n5;
                    if (string == null) {
                        n11 = n11 != 0 ? -1 : 1;
                    }
                    int n12 = n11;
                    int n13 = n8;
                    while (n13 != n10) {
                        s s2 = this.s.get((int)n13).a;
                        n3 = s2.b().d(aC2) ? 1 : 0;
                        if (string == null) {
                            if (string == null) {
                                if (n3 == 0) {
                                    ++n4;
                                    this.ao.a(s2, aC2);
                                }
                                int n14 = n13 = n13 + n12;
                            }
                            if (string == null) continue;
                        }
                        break block21;
                    }
                    n3 = n4;
                }
                if (string == null) {
                    if (n3 == 0) {
                        this.l.an.c();
                        return n4;
                    }
                    n3 = fU.am();
                }
                if (string != null) break block28;
                if (n3 == 0) break block29;
                n3 = this.l.Y.an ? 1 : 0;
                if (string != null) break block28;
                if (n3 != 0) {
                    net.minecraft.client.a.v.C();
                }
            }
            this.l.an.a("render_" + (Object)((Object)aC2));
            this.a(aC2);
            this.l.an.c();
            n3 = n4;
        }
        return n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean p() {
        String string = net.minecraft.client.a.I.j();
        boolean bl2 = this.ak.isEmpty();
        if (string == null) {
            if (!bl2) return false;
            bl2 = this.v.h();
        }
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private Set<aA> a(n n2) {
        net.minecraft.client.k.p p2 = new net.minecraft.client.k.p();
        String string = net.minecraft.client.a.I.j();
        n n3 = new n(n2.e() >> 4 << 4, n2.b() >> 4 << 4, n2.a() >> 4 << 4);
        a a10 = this.ax.b(n3);
        for (net.minecraft.k.o o2 : net.minecraft.k.n.a(n3, n3.a(15, 15, 15))) {
            if (a10.c(o2).i()) {
                p2.c(o2);
            }
            if (string == null) continue;
        }
        return p2.b(n2);
    }

    public void x() {
        block13: {
            Set<Object> set;
            String string;
            block15: {
                int n2;
                block14: {
                    block12: {
                        block10: {
                            block11: {
                                string = net.minecraft.client.a.I.j();
                                n2 = fU.ag();
                                if (string != null) break block10;
                                if (n2 == 0) break block11;
                                n2 = Keyboard.isKeyDown((int)61);
                                if (string != null) break block10;
                                if (n2 == 0) break block11;
                                n2 = Keyboard.isKeyDown((int)19);
                                if (string != null) break block10;
                                if (n2 != 0) {
                                    cS.d();
                                    cS.ay();
                                    cq.I.a(this.l, Boolean.TRUE);
                                }
                            }
                            ++this.aa;
                            n2 = this.aa % 20;
                        }
                        if (string == null) {
                            if (n2 == 0) {
                                this.a(this.ay.values().iterator());
                            }
                            n2 = this.aw.isEmpty();
                        }
                        if (string != null) break block12;
                        if (n2 != 0) break block13;
                        n2 = this.v.d();
                    }
                    if (string != null) break block14;
                    if (n2 != 0) break block13;
                    set = this.ak;
                    if (string != null) break block15;
                    n2 = set.isEmpty() ? 1 : 0;
                }
                if (n2 == 0) break block13;
                set = this.aw;
            }
            Iterator<Object> iterator = set.iterator();
            while (iterator.hasNext()) {
                n n3 = (n)iterator.next();
                iterator.remove();
                int n4 = n3.e();
                int n5 = n3.b();
                int n6 = n3.a();
                this.a(n4 - 1, n5 - 1, n6 - 1, n4 + 1, n5 + 1, n6 + 1, false);
                if (string == null) continue;
            }
        }
    }

    /*
     * Exception decompiling
     */
    public void a(net.minecraft.U.x var1_1, net.minecraft.client.G.b var2_2, float var3_3) {
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

    private void a(T t2) {
        String string = net.minecraft.client.a.I.j();
        boolean bl2 = t2.b;
        if (string == null && bl2) {
            bl2 = n.add(t2);
        }
    }

    private void y() {
        block9: {
            int n2;
            I i2;
            W w2;
            block7: {
                block8: {
                    w2 = net.minecraft.client.a.W.c();
                    String string = net.minecraft.client.a.I.j();
                    i2 = w2.b();
                    aF aF2 = this;
                    if (string == null) {
                        if (aF2.u != null) {
                            this.u.a();
                        }
                        aF2 = this;
                    }
                    n2 = aF2.av;
                    if (string == null) {
                        if (n2 >= 0) {
                            aZ.a(this.av);
                            this.av = -1;
                        }
                        n2 = this.aA ? 1 : 0;
                    }
                    if (string != null) break block7;
                    if (n2 == 0) break block8;
                    this.u = new net.minecraft.client.y.c(this.d);
                    this.a(i2, 16.0f, false);
                    i2.p();
                    i2.k();
                    this.u.a(i2.b());
                    if (string == null) break block9;
                }
                n2 = this.av = aZ.c(1);
            }
            net.minecraft.client.a.v.d(n2, 4864);
            this.a(i2, 16.0f, false);
            w2.a();
            net.minecraft.client.a.v.w();
        }
    }

    @Override
    public void b(net.minecraft.client.D.t t2) {
        this.i();
    }

    public static void a(net.minecraft.k.k k2, float f10, float f11, float f12, float f13) {
        aF.c(k2.e, k2.b, k2.d, k2.f, k2.a, k2.g, f10, f11, f12, f13);
    }

    @Nullable
    private s a(n n2, s s2, aA aA2) {
        block4: {
            block10: {
                int n3;
                int n4;
                block6: {
                    int n5;
                    int n6;
                    block7: {
                        block9: {
                            int n7;
                            int n8;
                            block8: {
                                int n9;
                                int n10;
                                String string;
                                n n11;
                                block5: {
                                    block3: {
                                        n11 = s2.a(aA2);
                                        string = net.minecraft.client.a.I.j();
                                        n10 = n11.b();
                                        if (string != null) break block3;
                                        if (n10 < 0) break block4;
                                        n10 = n11.b();
                                    }
                                    n9 = 256;
                                    if (string != null) break block5;
                                    if (n10 >= n9) break block4;
                                    n10 = n2.e();
                                    n9 = n11.e();
                                }
                                n6 = n10 - n9;
                                n5 = n2.a() - n11.a();
                                n4 = fU.am();
                                if (string != null) break block6;
                                if (n4 == 0) break block7;
                                n8 = Math.abs(n6);
                                n7 = this.S;
                                if (string != null) break block8;
                                if (n8 > n7) break block9;
                                n8 = Math.abs(n5);
                                n7 = this.S;
                            }
                            if (n8 <= n7) break block10;
                        }
                        return null;
                    }
                    n4 = n6 * n6 + n5 * n5;
                }
                if ((n3 = n4) > this.az) {
                    return null;
                }
            }
            return s2.a(this.af, aA2);
        }
        return null;
    }

    public static void b(double d10, double d11, double d12, double d13, double d14, double d15, float f10, float f11, float f12, float f13) {
        W w2 = net.minecraft.client.a.W.c();
        I i2 = w2.b();
        i2.a(3, net.minecraft.client.y.b.i);
        aF.b(i2, d10, d11, d12, d13, d14, d15, f10, f11, f12, f13);
        w2.a();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(Collection<net.minecraft.N.y> collection, Collection<net.minecraft.N.y> collection2) {
        Set<net.minecraft.N.y> set = this.J;
        synchronized (set) {
            this.J.removeAll(collection);
            this.J.addAll(collection2);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(net.minecraft.i.j var1_1, int var2_2, n var3_3, int var4_4) {
        var6_5 = this.ax.J;
        var5_6 = net.minecraft.client.a.I.j();
        if (var5_6 != null) ** GOTO lbl7
        switch (var2_2) {
            case 1000: {
                this.ax.a(var3_3, net.minecraft.u.E.gx, net.minecraft.ar.ay.BLOCKS, 1.0f, 1.0f, false);
lbl7:
                // 2 sources

                if (var5_6 == null) return;
            }
            case 1001: {
                this.ax.a(var3_3, net.minecraft.u.E.dq, net.minecraft.ar.ay.BLOCKS, 1.0f, 1.2f, false);
                if (var5_6 == null) return;
            }
            case 1002: {
                this.ax.a(var3_3, net.minecraft.u.E.dV, net.minecraft.ar.ay.BLOCKS, 1.0f, 1.2f, false);
                if (var5_6 == null) return;
            }
            case 1003: {
                this.ax.a(var3_3, net.minecraft.u.E.dy, net.minecraft.ar.ay.NEUTRAL, 1.0f, 1.2f, false);
                if (var5_6 == null) return;
            }
            case 1004: {
                this.ax.a(var3_3, net.minecraft.u.E.bO, net.minecraft.ar.ay.NEUTRAL, 1.0f, 1.2f, false);
                if (var5_6 == null) return;
            }
            case 1005: {
                this.ax.a(var3_3, net.minecraft.u.E.eR, net.minecraft.ar.ay.BLOCKS, 1.0f, this.ax.J.nextFloat() * 0.1f + 0.9f, false);
                if (var5_6 == null) return;
            }
            case 1006: {
                this.ax.a(var3_3, net.minecraft.u.E.bl, net.minecraft.ar.ay.BLOCKS, 1.0f, this.ax.J.nextFloat() * 0.1f + 0.9f, false);
                if (var5_6 == null) return;
            }
            case 1007: {
                this.ax.a(var3_3, net.minecraft.u.E.fc, net.minecraft.ar.ay.BLOCKS, 1.0f, this.ax.J.nextFloat() * 0.1f + 0.9f, false);
                if (var5_6 == null) return;
            }
            case 1008: {
                this.ax.a(var3_3, net.minecraft.u.E.eF, net.minecraft.ar.ay.BLOCKS, 1.0f, this.ax.J.nextFloat() * 0.1f + 0.9f, false);
                if (var5_6 == null) return;
            }
            case 1009: {
                this.ax.a(var3_3, net.minecraft.u.E.gE, net.minecraft.ar.ay.BLOCKS, 0.5f, 2.6f + (var6_5.nextFloat() - var6_5.nextFloat()) * 0.8f, false);
                if (var5_6 == null) return;
            }
            case 1010: {
                if (net.minecraft.w.k.a(var4_4) instanceof aV) {
                    this.ax.a(var3_3, ((aV)net.minecraft.w.k.a(var4_4)).a());
                    if (var5_6 == null) return;
                }
                this.ax.a(var3_3, (net.minecraft.ar.d)null);
                if (var5_6 == null) return;
            }
            case 1011: {
                this.ax.a(var3_3, net.minecraft.u.E.S, net.minecraft.ar.ay.BLOCKS, 1.0f, this.ax.J.nextFloat() * 0.1f + 0.9f, false);
                if (var5_6 == null) return;
            }
            case 1012: {
                this.ax.a(var3_3, net.minecraft.u.E.dY, net.minecraft.ar.ay.BLOCKS, 1.0f, this.ax.J.nextFloat() * 0.1f + 0.9f, false);
                if (var5_6 == null) return;
            }
            case 1013: {
                this.ax.a(var3_3, net.minecraft.u.E.cP, net.minecraft.ar.ay.BLOCKS, 1.0f, this.ax.J.nextFloat() * 0.1f + 0.9f, false);
                if (var5_6 == null) return;
            }
            case 1014: {
                this.ax.a(var3_3, net.minecraft.u.E.f5, net.minecraft.ar.ay.BLOCKS, 1.0f, this.ax.J.nextFloat() * 0.1f + 0.9f, false);
                if (var5_6 == null) return;
            }
            case 1015: {
                this.ax.a(var3_3, net.minecraft.u.E.hC, net.minecraft.ar.ay.HOSTILE, 10.0f, (var6_5.nextFloat() - var6_5.nextFloat()) * 0.2f + 1.0f, false);
                if (var5_6 == null) return;
            }
            case 1016: {
                this.ax.a(var3_3, net.minecraft.u.E.fj, net.minecraft.ar.ay.HOSTILE, 10.0f, (var6_5.nextFloat() - var6_5.nextFloat()) * 0.2f + 1.0f, false);
                if (var5_6 == null) return;
            }
            case 1017: {
                this.ax.a(var3_3, net.minecraft.u.E.b, net.minecraft.ar.ay.HOSTILE, 10.0f, (var6_5.nextFloat() - var6_5.nextFloat()) * 0.2f + 1.0f, false);
                if (var5_6 == null) return;
            }
            case 1018: {
                this.ax.a(var3_3, net.minecraft.u.E.gQ, net.minecraft.ar.ay.HOSTILE, 2.0f, (var6_5.nextFloat() - var6_5.nextFloat()) * 0.2f + 1.0f, false);
                if (var5_6 == null) return;
            }
            case 1019: {
                this.ax.a(var3_3, net.minecraft.u.E.d_, net.minecraft.ar.ay.HOSTILE, 2.0f, (var6_5.nextFloat() - var6_5.nextFloat()) * 0.2f + 1.0f, false);
                if (var5_6 == null) return;
            }
            case 1020: {
                this.ax.a(var3_3, net.minecraft.u.E.dX, net.minecraft.ar.ay.HOSTILE, 2.0f, (var6_5.nextFloat() - var6_5.nextFloat()) * 0.2f + 1.0f, false);
                if (var5_6 == null) return;
            }
            case 1021: {
                this.ax.a(var3_3, net.minecraft.u.E.a9, net.minecraft.ar.ay.HOSTILE, 2.0f, (var6_5.nextFloat() - var6_5.nextFloat()) * 0.2f + 1.0f, false);
                if (var5_6 == null) return;
            }
            case 1022: {
                this.ax.a(var3_3, net.minecraft.u.E.ah, net.minecraft.ar.ay.HOSTILE, 2.0f, (var6_5.nextFloat() - var6_5.nextFloat()) * 0.2f + 1.0f, false);
                if (var5_6 == null) return;
            }
            case 1024: {
                this.ax.a(var3_3, net.minecraft.u.E.e4, net.minecraft.ar.ay.HOSTILE, 2.0f, (var6_5.nextFloat() - var6_5.nextFloat()) * 0.2f + 1.0f, false);
                if (var5_6 == null) return;
            }
            case 1025: {
                this.ax.a(var3_3, net.minecraft.u.E.gp, net.minecraft.ar.ay.NEUTRAL, 0.05f, (var6_5.nextFloat() - var6_5.nextFloat()) * 0.2f + 1.0f, false);
                if (var5_6 == null) return;
            }
            case 1026: {
                this.ax.a(var3_3, net.minecraft.u.E.aw, net.minecraft.ar.ay.HOSTILE, 2.0f, (var6_5.nextFloat() - var6_5.nextFloat()) * 0.2f + 1.0f, false);
                if (var5_6 == null) return;
            }
            case 1027: {
                this.ax.a(var3_3, net.minecraft.u.E.fO, net.minecraft.ar.ay.NEUTRAL, 2.0f, (var6_5.nextFloat() - var6_5.nextFloat()) * 0.2f + 1.0f, false);
                if (var5_6 == null) return;
            }
            case 1029: {
                this.ax.a(var3_3, net.minecraft.u.E.bc, net.minecraft.ar.ay.BLOCKS, 1.0f, this.ax.J.nextFloat() * 0.1f + 0.9f, false);
                if (var5_6 == null) return;
            }
            case 1030: {
                this.ax.a(var3_3, net.minecraft.u.E.a0, net.minecraft.ar.ay.BLOCKS, 1.0f, this.ax.J.nextFloat() * 0.1f + 0.9f, false);
                if (var5_6 == null) return;
            }
            case 1031: {
                this.ax.a(var3_3, net.minecraft.u.E.aM, net.minecraft.ar.ay.BLOCKS, 0.3f, this.ax.J.nextFloat() * 0.1f + 0.9f, false);
                if (var5_6 == null) return;
            }
            case 1032: {
                this.l.p().c(net.minecraft.client.e.y.a(net.minecraft.u.E.cD, var6_5.nextFloat() * 0.4f + 0.8f));
                if (var5_6 == null) return;
            }
            case 1033: {
                this.ax.a(var3_3, net.minecraft.u.E.dP, net.minecraft.ar.ay.BLOCKS, 1.0f, 1.0f, false);
                if (var5_6 == null) return;
            }
            case 1034: {
                this.ax.a(var3_3, net.minecraft.u.E.cH, net.minecraft.ar.ay.BLOCKS, 1.0f, 1.0f, false);
                if (var5_6 == null) return;
            }
            case 1035: {
                this.ax.a(var3_3, net.minecraft.u.E.V, net.minecraft.ar.ay.BLOCKS, 1.0f, 1.0f, false);
                if (var5_6 == null) return;
            }
            case 1036: {
                this.ax.a(var3_3, net.minecraft.u.E.be, net.minecraft.ar.ay.BLOCKS, 1.0f, this.ax.J.nextFloat() * 0.1f + 0.9f, false);
                if (var5_6 == null) return;
            }
            case 1037: {
                this.ax.a(var3_3, net.minecraft.u.E.eN, net.minecraft.ar.ay.BLOCKS, 1.0f, this.ax.J.nextFloat() * 0.1f + 0.9f, false);
                if (var5_6 == null) return;
            }
            case 2000: {
                var7_7 = var4_4 % 3 - 1;
                var8_8 = var4_4 / 3 % 3 - 1;
                var9_9 = (double)var3_3.e() + (double)var7_7 * 0.6 + 0.5;
                var11_10 = (double)var3_3.b() + 0.5;
                var13_11 = (double)var3_3.a() + (double)var8_8 * 0.6 + 0.5;
                var15_12 = 0;
                do {
                    if (var15_12 >= 10) return;
                    var16_14 = var6_5.nextDouble() * 0.2 + 0.01;
                    var18_17 = var9_9 + (double)var7_7 * 0.01 + (var6_5.nextDouble() - 0.5) * (double)var8_8 * 0.5;
                    var20_19 = var11_10 + (var6_5.nextDouble() - 0.5) * 0.5;
                    var22_21 = var13_11 + (double)var8_8 * 0.01 + (var6_5.nextDouble() - 0.5) * (double)var7_7 * 0.5;
                    var24_24 = (double)var7_7 * var16_14 + var6_5.nextGaussian() * 0.01;
                    var26_26 = -0.03 + var6_5.nextGaussian() * 0.01;
                    var28_29 = (double)var8_8 * var16_14 + var6_5.nextGaussian() * 0.01;
                    this.a(aH.SMOKE_NORMAL, var18_17, var20_19, var22_21, var24_24, var26_26, var28_29, new int[0]);
                    ++var15_12;
                } while (var5_6 == null);
                return;
            }
            case 2001: {
                var15_13 = net.minecraft.W.K.b(var4_4 & 4095);
                if (var5_6 != null) ** GOTO lbl148
                if (var15_13.d().o() == net.minecraft.ac.c.A) ** GOTO lbl147
                var16_15 = var15_13.l();
                v0 = cq.t;
                if (var5_6 != null) ** GOTO lbl145
                if (!v0.b()) ** GOTO lbl146
                v0 = cq.d(var15_13, cq.t, new Object[]{net.minecraft.W.K.a(var4_4), this.ax, var3_3, null});
lbl145:
                // 2 sources

                var16_15 = (d_)v0;
lbl146:
                // 2 sources

                this.ax.a(var3_3, var16_15.d(), net.minecraft.ar.ay.BLOCKS, (var16_15.c() + 1.0f) / 2.0f, var16_15.e() * 0.8f, false);
lbl147:
                // 2 sources

                this.l.au.a(var3_3, var15_13.c(var4_4 >> 12 & 255));
lbl148:
                // 2 sources

                if (var5_6 == null) return;
            }
            case 2002: 
            case 2007: {
                var16_16 = var3_3.e();
                var18_18 = var3_3.b();
                var20_20 = var3_3.a();
                for (var22_22 = 0; var22_22 < 8; ++var22_22) {
                    this.a(aH.ITEM_CRACK, var16_16, var18_18, var20_20, var6_5.nextGaussian() * 0.15, var6_5.nextDouble() * 0.2, var6_5.nextGaussian() * 0.15, new int[]{net.minecraft.w.k.a(net.minecraft.u.h.b3)});
                    if (var5_6 != null) return;
                    if (var5_6 == null) continue;
                }
                var22_23 = (float)(var4_4 >> 16 & 255) / 255.0f;
                var23_31 = (float)(var4_4 >> 8 & 255) / 255.0f;
                var24_25 = (float)(var4_4 >> 0 & 255) / 255.0f;
                var25_32 = var2_2 == 2007 ? aH.SPELL_INSTANT : aH.SPELL;
                var26_27 = 0;
                while (var26_27 < 100) {
                    var27_43 = var6_5.nextDouble() * 4.0;
                    var29_44 = var6_5.nextDouble() * 3.141592653589793 * 2.0;
                    var31_45 = Math.cos(var29_44) * var27_43;
                    var33_33 = 0.01 + var6_5.nextDouble() * 0.5;
                    var35_36 = Math.sin(var29_44) * var27_43;
                    var37_39 = this.a(var25_32.a(), var25_32.c(), var16_16 + var31_45 * 0.1, var18_18 + 0.3, var20_20 + var35_36 * 0.1, var31_45, var33_33, var35_36, new int[0]);
                    if (var5_6 == null) {
                        if (var5_6 == null) {
                            if (var37_39 != null) {
                                var38_42 = 0.75f + var6_5.nextFloat() * 0.25f;
                                var37_39.a(var22_23 * var38_42, var23_31 * var38_42, var24_25 * var38_42);
                                var37_39.d((float)var27_43);
                            }
                            ++var26_27;
                        }
                        if (var5_6 == null) continue;
                    }
                    ** GOTO lbl180
                }
                this.ax.a(var3_3, net.minecraft.u.E.cw, net.minecraft.ar.ay.NEUTRAL, 1.0f, this.ax.J.nextFloat() * 0.1f + 0.9f, false);
lbl180:
                // 2 sources

                if (var5_6 == null) return;
            }
            case 2003: {
                var26_28 = (double)var3_3.e() + 0.5;
                var28_30 = var3_3.b();
                var30_46 = (double)var3_3.a() + 0.5;
                for (var32_47 = 0; var32_47 < 8; ++var32_47) {
                    this.a(aH.ITEM_CRACK, var26_28, var28_30, var30_46, var6_5.nextGaussian() * 0.15, var6_5.nextDouble() * 0.2, var6_5.nextGaussian() * 0.15, new int[]{net.minecraft.w.k.a(net.minecraft.u.h.cE)});
                    if (var5_6 == null) continue;
                }
                var32_48 = 0.0;
                do {
                    if (!(var32_48 < 6.283185307179586)) return;
                    this.a(aH.PORTAL, var26_28 + Math.cos(var32_48) * 5.0, var28_30 - 0.4, var30_46 + Math.sin(var32_48) * 5.0, Math.cos(var32_48) * -5.0, 0.0, Math.sin(var32_48) * -5.0, new int[0]);
                    this.a(aH.PORTAL, var26_28 + Math.cos(var32_48) * 5.0, var28_30 - 0.4, var30_46 + Math.sin(var32_48) * 5.0, Math.cos(var32_48) * -7.0, 0.0, Math.sin(var32_48) * -7.0, new int[0]);
                    var32_48 += 0.15707963267948966;
                } while (var5_6 == null);
                return;
            }
            case 2004: {
                var32_49 = 0;
                do {
                    if (var32_49 >= 20) return;
                    var33_34 = (double)var3_3.e() + 0.5 + ((double)this.ax.J.nextFloat() - 0.5) * 2.0;
                    var35_37 = (double)var3_3.b() + 0.5 + ((double)this.ax.J.nextFloat() - 0.5) * 2.0;
                    var37_40 = (double)var3_3.a() + 0.5 + ((double)this.ax.J.nextFloat() - 0.5) * 2.0;
                    this.ax.a(aH.SMOKE_NORMAL, var33_34, var35_37, var37_40, 0.0, 0.0, 0.0, new int[0]);
                    this.ax.a(aH.FLAME, var33_34, var35_37, var37_40, 0.0, 0.0, 0.0, new int[0]);
                    ++var32_49;
                } while (var5_6 == null);
                return;
            }
            case 2005: {
                net.minecraft.w.P.a(this.ax, var3_3, var4_4);
                if (var5_6 == null) return;
            }
            case 2006: {
                var32_50 = 0;
                while (var32_50 < 200) {
                    var33_35 = var6_5.nextFloat() * 4.0f;
                    var34_51 = var6_5.nextFloat() * 6.2831855f;
                    var35_38 = net.minecraft.k.h.c(var34_51) * var33_35;
                    var37_41 = 0.01 + var6_5.nextDouble() * 0.5;
                    var39_52 = net.minecraft.k.h.g(var34_51) * var33_35;
                    var41_53 = this.a(aH.DRAGON_BREATH.a(), false, (double)var3_3.e() + var35_38 * 0.1, (double)var3_3.b() + 0.3, (double)var3_3.a() + var39_52 * 0.1, var35_38, var37_41, var39_52, new int[0]);
                    if (var5_6 == null) {
                        if (var5_6 == null) {
                            if (var41_53 != null) {
                                var41_53.d(var33_35);
                            }
                            ++var32_50;
                        }
                        if (var5_6 == null) continue;
                    }
                    ** GOTO lbl229
                }
                this.ax.a(var3_3, net.minecraft.u.E.df, net.minecraft.ar.ay.HOSTILE, 1.0f, this.ax.J.nextFloat() * 0.1f + 0.9f, false);
lbl229:
                // 2 sources

                if (var5_6 == null) return;
            }
            case 3000: {
                this.ax.a(aH.EXPLOSION_HUGE, true, (double)var3_3.e() + 0.5, (double)var3_3.b() + 0.5, (double)var3_3.a() + 0.5, 0.0, 0.0, 0.0, new int[0]);
                this.ax.a(var3_3, net.minecraft.u.E.dO, net.minecraft.ar.ay.BLOCKS, 10.0f, (1.0f + (this.ax.J.nextFloat() - this.ax.J.nextFloat()) * 0.2f) * 0.7f, false);
                if (var5_6 == null) return;
            }
            case 3001: {
                this.ax.a(var3_3, net.minecraft.u.E.dA, net.minecraft.ar.ay.HOSTILE, 64.0f, 0.8f + this.ax.J.nextFloat() * 0.3f, false);
                return;
            }
        }
    }

    public static void c(double d10, double d11, double d12, double d13, double d14, double d15, float f10, float f11, float f12, float f13) {
        W w2 = net.minecraft.client.a.W.c();
        I i2 = w2.b();
        i2.a(5, net.minecraft.client.y.b.i);
        aF.a(i2, d10, d11, d12, d13, d14, d15, f10, f11, f12, f13);
        w2.a();
    }
}

