/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.gson.Gson
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.Display
 */
package net.minecraft.client.l;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.P.r;
import net.minecraft.ar.aG;
import net.minecraft.ar.ay;
import net.minecraft.ar.b;
import net.minecraft.client.D.h;
import net.minecraft.client.Q;
import net.minecraft.client.a.as;
import net.minecraft.client.b.I;
import net.minecraft.client.j.j;
import net.minecraft.client.l.a;
import net.minecraft.client.l.d;
import net.minecraft.client.l.e;
import net.minecraft.client.l.f;
import net.minecraft.d.m;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

public class c {
    public /* synthetic */ boolean bt;
    private static final /* synthetic */ String[] bL;
    public /* synthetic */ int bn;
    public /* synthetic */ boolean M;
    public /* synthetic */ boolean bQ;
    public /* synthetic */ d t;
    public /* synthetic */ net.minecraft.ah.e bH;
    public /* synthetic */ boolean aI;
    public /* synthetic */ boolean N;
    public /* synthetic */ d aT;
    public /* synthetic */ boolean aE;
    public /* synthetic */ boolean a3;
    public /* synthetic */ int b7;
    public /* synthetic */ String bM;
    private static final /* synthetic */ Gson k;
    public static final /* synthetic */ int aU;
    public /* synthetic */ boolean aH;
    public /* synthetic */ int bp;
    public /* synthetic */ List<String> T;
    public /* synthetic */ boolean p;
    public /* synthetic */ boolean ai;
    public /* synthetic */ d[] ad;
    public /* synthetic */ boolean bE;
    public static final /* synthetic */ int bx;
    private final /* synthetic */ Set<net.minecraft.i.a> bq;
    public /* synthetic */ boolean a4;
    public /* synthetic */ int bC;
    public static final /* synthetic */ int r;
    public /* synthetic */ boolean bs;
    public /* synthetic */ boolean aB;
    public /* synthetic */ boolean bN;
    public /* synthetic */ boolean R;
    public /* synthetic */ int o;
    public /* synthetic */ boolean h;
    private static final /* synthetic */ String[] bG;
    public /* synthetic */ int w;
    public static final /* synthetic */ int aS;
    public /* synthetic */ boolean by;
    public /* synthetic */ d bu;
    public /* synthetic */ boolean aP;
    public /* synthetic */ boolean P;
    public /* synthetic */ boolean ap;
    public /* synthetic */ boolean b5;
    private static final /* synthetic */ Logger f;
    public /* synthetic */ boolean aC;
    public /* synthetic */ d cc;
    public /* synthetic */ int bV;
    private static final /* synthetic */ Type bD;
    public /* synthetic */ d bO;
    public /* synthetic */ d b4;
    public /* synthetic */ float m;
    public /* synthetic */ boolean z;
    public /* synthetic */ boolean au;
    public /* synthetic */ d O;
    public /* synthetic */ float aQ;
    public /* synthetic */ int b;
    public /* synthetic */ d aK;
    public static final /* synthetic */ int aL;
    public /* synthetic */ boolean X;
    public /* synthetic */ int L;
    public /* synthetic */ boolean bP;
    public /* synthetic */ boolean cd;
    public /* synthetic */ boolean aZ;
    public /* synthetic */ int D;
    public /* synthetic */ boolean as;
    public /* synthetic */ d bl;
    public /* synthetic */ d G;
    public /* synthetic */ boolean bi;
    public /* synthetic */ d bA;
    public /* synthetic */ String l;
    public /* synthetic */ boolean aa;
    public /* synthetic */ int g;
    public /* synthetic */ d aW;
    public /* synthetic */ boolean V;
    public /* synthetic */ float aj;
    public /* synthetic */ int af;
    public /* synthetic */ boolean bw;
    public /* synthetic */ int c;
    public static final /* synthetic */ int b0;
    public /* synthetic */ boolean aO;
    public /* synthetic */ boolean bg;
    public /* synthetic */ int A;
    public /* synthetic */ boolean bz;
    private /* synthetic */ File q;
    public /* synthetic */ float bv;
    public /* synthetic */ boolean ay;
    public static final /* synthetic */ String F;
    public /* synthetic */ boolean bj;
    public /* synthetic */ d ax;
    public /* synthetic */ d y;
    public /* synthetic */ boolean aX;
    public /* synthetic */ boolean br;
    public /* synthetic */ float aG;
    public /* synthetic */ int bo;
    public /* synthetic */ boolean aA;
    public /* synthetic */ d bc;
    public /* synthetic */ boolean s;
    public /* synthetic */ boolean ag;
    public /* synthetic */ float an;
    public /* synthetic */ boolean u;
    public /* synthetic */ int b2;
    public /* synthetic */ boolean am;
    public /* synthetic */ d Q;
    private /* synthetic */ boolean a6;
    public /* synthetic */ int i;
    public /* synthetic */ int ce;
    public /* synthetic */ d C;
    public /* synthetic */ boolean b1;
    protected /* synthetic */ Q bk;
    public /* synthetic */ d bU;
    public /* synthetic */ net.minecraft.client.H.f bB;
    public /* synthetic */ boolean be;
    public /* synthetic */ float b_;
    public static final /* synthetic */ int a0;
    public /* synthetic */ d aq;
    public /* synthetic */ d[] b3;
    private static final /* synthetic */ String[] bX;
    public /* synthetic */ d bW;
    public /* synthetic */ boolean aJ;
    public /* synthetic */ boolean ca;
    private static final /* synthetic */ String[] W;
    public /* synthetic */ boolean B;
    public /* synthetic */ int n;
    public /* synthetic */ d aM;
    public /* synthetic */ boolean a1;
    public static final /* synthetic */ String[] a_;
    public /* synthetic */ d v;
    public /* synthetic */ String b8;
    public /* synthetic */ boolean bZ;
    private static final /* synthetic */ String[] bY;
    public /* synthetic */ boolean ba;
    public /* synthetic */ boolean ae;
    private final /* synthetic */ Map<ay, Float> ab;
    public /* synthetic */ float ak;
    public /* synthetic */ boolean I;
    public /* synthetic */ boolean aD;
    private static final /* synthetic */ int[] x;
    public /* synthetic */ boolean bh;
    public /* synthetic */ b aR;
    public /* synthetic */ boolean a5;
    public static final /* synthetic */ int ao;
    public /* synthetic */ int aN;
    public /* synthetic */ boolean aw;
    public /* synthetic */ int a;
    public /* synthetic */ float at;
    public /* synthetic */ d bI;
    public static final /* synthetic */ Splitter av;
    private static /* synthetic */ String[] j;
    public /* synthetic */ float bS;
    public /* synthetic */ int a9;
    public /* synthetic */ boolean d;
    private static final /* synthetic */ String[] K;
    public /* synthetic */ net.minecraft.i.b bd;
    public /* synthetic */ boolean a7;
    public /* synthetic */ int b6;
    public /* synthetic */ int az;
    public /* synthetic */ boolean al;
    public /* synthetic */ boolean bF;
    public /* synthetic */ boolean Z;
    public /* synthetic */ boolean bK;
    public /* synthetic */ int bf;
    public /* synthetic */ int J;
    public /* synthetic */ boolean aV;
    public /* synthetic */ int a2;
    public /* synthetic */ boolean a8;
    private /* synthetic */ File ac;
    public /* synthetic */ int Y;
    public /* synthetic */ boolean bT;
    public /* synthetic */ List<String> bJ;
    public /* synthetic */ d b9;
    public /* synthetic */ int e;
    public /* synthetic */ boolean E;
    public /* synthetic */ boolean S;
    public /* synthetic */ float bR;
    public /* synthetic */ boolean ar;
    public /* synthetic */ int H;
    public /* synthetic */ boolean cb;
    private static final /* synthetic */ int[] U;
    public /* synthetic */ float ah;
    public /* synthetic */ boolean aY;
    public /* synthetic */ d bb;
    public /* synthetic */ int bm;
    public /* synthetic */ boolean aF;

    private static Exception a(Exception exception) {
        return exception;
    }

    public static void b(String[] arrstring) {
        j = arrstring;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean a(d d10) {
        boolean bl2;
        int n2 = d10.e();
        String[] arrstring = net.minecraft.client.l.c.m();
        int n3 = n2;
        if (arrstring == null) return n3 != 0;
        if (n3 == 0) return 0 != 0;
        n3 = n2;
        if (arrstring == null) return n3 != 0;
        if (n3 >= 256) return 0 != 0;
        int n4 = n2;
        if (arrstring != null) {
            if (n4 < 0) {
                bl2 = Mouse.isButtonDown((int)(n2 + 100));
                return bl2;
            }
            n4 = n2;
        }
        bl2 = Keyboard.isKeyDown((int)n4);
        return bl2;
    }

    public void k() {
        block3: {
            String[] arrstring = net.minecraft.client.l.c.m();
            if (this.bk.s != null) {
                int n2 = 0;
                for (net.minecraft.i.a a10 : this.bq) {
                    n2 |= a10.b();
                    if (arrstring != null) {
                        if (arrstring != null) continue;
                    }
                    break block3;
                }
                this.bk.s.c9.a(new m(this.bM, this.bf, this.bd, this.b1, n2, this.aR));
            }
        }
    }

    public boolean a(f f10) {
        String[] arrstring = net.minecraft.client.l.c.m();
        boolean bl2 = net.minecraft.client.l.a.a[f10.ordinal()];
        if (arrstring != null) {
            switch (bl2) {
                case 1: {
                    return this.B;
                }
                case 2: {
                    return this.X;
                }
                case 3: {
                    return this.aD;
                }
                case 4: {
                    return this.bt;
                }
                case 5: {
                    return this.b1;
                }
                case 6: {
                    return this.bg;
                }
                case 7: {
                    return this.ae;
                }
                case 8: {
                    return this.a8;
                }
                case 9: {
                    return this.b5;
                }
                case 10: {
                    return this.br;
                }
                case 11: {
                    return this.bz;
                }
                case 12: {
                    return this.aZ;
                }
                case 13: {
                    return this.bZ;
                }
                case 14: {
                    return this.aw;
                }
                case 15: {
                    return this.bN;
                }
                case 16: {
                    return this.a4;
                }
                case 17: {
                    return this.ai;
                }
                case 18: {
                    return this.aV;
                }
                case 19: {
                    return this.ag;
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void b(f var1_1, float var2_2) {
        block24: {
            block26: {
                block27: {
                    block25: {
                        block29: {
                            block28: {
                                var3_3 = net.minecraft.client.l.c.m();
                                v0 = var1_1;
                                v1 = net.minecraft.client.l.f.CLOUD_HEIGHT;
                                if (var3_3 != null) {
                                    if (v0 == v1) {
                                        this.ak = var2_2;
                                        this.bk.a2.w();
                                    }
                                    v0 = var1_1;
                                    v1 = net.minecraft.client.l.f.AO_LEVEL;
                                }
                                if (var3_3 != null) {
                                    if (v0 == v1) {
                                        this.aG = var2_2;
                                        this.bk.a2.d();
                                    }
                                    v0 = var1_1;
                                    v1 = net.minecraft.client.l.f.AA_LEVEL;
                                }
                                if (var3_3 != null) {
                                    if (v0 == v1) {
                                        v2 = var4_4 = (int)var2_2;
                                        if (var3_3 != null) {
                                            if (v2 > 0) {
                                                v2 = fU.ag() ? 1 : 0;
                                                if (var3_3 != null) {
                                                    if (v2 != 0) {
                                                        fU.a(gl.a("of.message.aa.shaders1"), gl.a("of.message.aa.shaders2"));
                                                        return;
                                                    } else {
                                                        ** GOTO lbl-1000
                                                    }
                                                }
                                            } else lbl-1000:
                                            // 3 sources

                                            {
                                                v2 = 7;
                                            }
                                        }
                                        v3 = new int[v2];
                                        v3[0] = 0;
                                        v3[1] = 2;
                                        v3[2] = 4;
                                        v3[3] = 6;
                                        v3[4] = 8;
                                        v3[5] = 12;
                                        v3[6] = 16;
                                        var5_5 = v3;
                                        this.a = 0;
                                        for (var6_7 = 0; var6_7 < var5_5.length; ++var6_7) {
                                            v4 = var4_4;
                                            v5 = var5_5[var6_7];
                                            if (var3_3 != null) {
                                                if (v4 < v5) continue;
                                                this.a = var5_5[var6_7];
                                                if (var3_3 != null) continue;
                                            }
                                            break block24;
                                        }
                                        this.a = fU.a(this.a, 0, 16);
                                    }
                                    v0 = var1_1;
                                    v1 = net.minecraft.client.l.f.AF_LEVEL;
                                }
                                if (var3_3 == null) break block26;
                                if (v0 != v1) break block27;
                                v6 = var4_4 = (int)var2_2;
                                if (var3_3 == null) break block28;
                                if (v6 <= 1) break block29;
                                v6 = fU.ag() ? 1 : 0;
                            }
                            if (v6 != 0) {
                                fU.a(gl.a("of.message.af.shaders1"), gl.a("of.message.af.shaders2"));
                                return;
                            }
                        }
                        this.n = 1;
                        while (this.n * 2 <= var4_4) {
                            this.n *= 2;
                            if (var3_3 != null) {
                                if (var3_3 != null) continue;
                            }
                            break block25;
                        }
                        this.n = fU.a(this.n, 1, 16);
                    }
                    this.bk.af();
                }
                v0 = var1_1;
                v1 = net.minecraft.client.l.f.MIPMAP_TYPE;
            }
            if (var3_3 != null) {
                if (v0 == v1) {
                    var4_4 = (int)var2_2;
                    this.b6 = fU.a(var4_4, 0, 3);
                    this.bk.af();
                }
                v0 = var1_1;
                v1 = net.minecraft.client.l.f.FULLSCREEN_MODE;
            }
            if (v0 != v1) return;
            v4 = (int)var2_2;
            v5 = 1;
        }
        var4_4 = v4 - v5;
        var5_6 = fU.aI();
        if (var3_3 == null) return;
        if (var4_4 >= 0 && var4_4 < var5_6.length) {
            this.l = var5_6[var4_4];
            return;
        }
        this.l = "Default";
    }

    public c() {
        block0: {
            this.bv = 0.5f;
            this.bf = -1;
            this.X = true;
            this.bt = true;
            this.bo = 120;
            this.bn = 2;
            this.aC = true;
            this.A = 2;
            this.bJ = Lists.newArrayList();
            this.T = Lists.newArrayList();
            this.bd = net.minecraft.i.b.FULL;
            this.b1 = true;
            this.bg = true;
            this.ae = true;
            this.b_ = 1.0f;
            this.a8 = true;
            this.br = true;
            this.bz = true;
            this.ay = true;
            this.bq = Sets.newHashSet((Object[])net.minecraft.i.a.values());
            this.aR = net.minecraft.ar.b.RIGHT;
            this.bP = true;
            String[] arrstring = net.minecraft.client.l.c.m();
            this.ah = 1.0f;
            this.m = 1.0f;
            this.at = 0.44366196f;
            this.aQ = 1.0f;
            this.c = 4;
            this.ab = Maps.newEnumMap(ay.class);
            this.aA = true;
            this.bN = true;
            this.bm = 1;
            this.ai = true;
            this.ag = true;
            this.bB = net.minecraft.client.H.f.MOVEMENT;
            this.aW = new d("key.forward", 17, "key.categories.movement");
            this.C = new d("key.left", 30, "key.categories.movement");
            this.O = new d("key.back", 31, "key.categories.movement");
            this.G = new d("key.right", 32, "key.categories.movement");
            this.v = new d("key.jump", 57, "key.categories.movement");
            this.bc = new d("key.sneak", 42, "key.categories.movement");
            this.cc = new d("key.sprint", 29, "key.categories.movement");
            this.bW = new d("key.inventory", 18, "key.categories.inventory");
            this.bA = new d("key.swapHands", 33, "key.categories.inventory");
            this.bU = new d("key.drop", 16, "key.categories.inventory");
            this.aM = new d("key.use", -99, "key.categories.gameplay");
            this.bb = new d("key.attack", -100, "key.categories.gameplay");
            this.aT = new d("key.pickItem", -98, "key.categories.gameplay");
            this.bI = new d("key.chat", 20, "key.categories.multiplayer");
            this.aK = new d("key.playerlist", 15, "key.categories.multiplayer");
            this.y = new d("key.command", 53, "key.categories.multiplayer");
            this.b4 = new d("key.screenshot", 60, "key.categories.misc");
            this.bO = new d("key.togglePerspective", 63, "key.categories.misc");
            this.aq = new d("key.smoothCamera", 0, "key.categories.misc");
            this.Q = new d("key.fullscreen", 87, "key.categories.misc");
            this.t = new d("key.spectatorOutlines", 0, "key.categories.misc");
            this.bu = new d("key.advancements", 38, "key.categories.misc");
            this.b3 = new d[]{new d("key.hotbar.1", 2, "key.categories.inventory"), new d("key.hotbar.2", 3, "key.categories.inventory"), new d("key.hotbar.3", 4, "key.categories.inventory"), new d("key.hotbar.4", 5, "key.categories.inventory"), new d("key.hotbar.5", 6, "key.categories.inventory"), new d("key.hotbar.6", 7, "key.categories.inventory"), new d("key.hotbar.7", 8, "key.categories.inventory"), new d("key.hotbar.8", 9, "key.categories.inventory"), new d("key.hotbar.9", 10, "key.categories.inventory")};
            this.bl = new d("key.saveToolbarActivator", 46, "key.categories.creative");
            this.b9 = new d("key.loadToolbarActivator", 45, "key.categories.creative");
            this.i = 1;
            this.an = 0.8f;
            this.b6 = 0;
            this.bF = false;
            this.be = false;
            this.R = fU.G();
            this.E = fU.G();
            this.aG = 1.0f;
            this.a = 0;
            this.n = 1;
            this.o = 0;
            this.ak = 0.0f;
            this.D = 0;
            this.af = 0;
            this.a9 = 0;
            this.e = 3;
            this.az = 4000;
            this.V = false;
            this.ca = false;
            this.a5 = false;
            this.u = true;
            this.M = true;
            this.cd = true;
            this.I = true;
            this.bp = 0;
            this.Y = 1;
            this.aE = false;
            this.b = 0;
            this.aY = false;
            this.bj = false;
            this.l = "Default";
            this.a3 = true;
            this.S = true;
            this.al = true;
            this.N = true;
            this.aX = true;
            this.aF = true;
            this.bi = true;
            this.J = 2;
            this.bT = true;
            this.a7 = false;
            this.aa = false;
            this.as = false;
            this.H = 0;
            this.aJ = true;
            this.aI = true;
            this.aN = 3;
            this.h = true;
            this.aO = true;
            this.b2 = 1;
            this.bV = 0;
            this.ce = 0;
            this.Z = true;
            this.bs = true;
            this.au = true;
            this.ap = true;
            this.p = true;
            this.am = true;
            this.z = true;
            this.bQ = true;
            this.aH = true;
            this.bh = true;
            this.aB = true;
            this.bw = true;
            this.by = true;
            this.a1 = true;
            this.s = true;
            this.a6 = false;
            this.d();
            this.ad = (d[])ArrayUtils.addAll((Object[])new d[]{this.bb, this.aM, this.aW, this.C, this.O, this.G, this.v, this.bc, this.cc, this.bU, this.bW, this.bI, this.aK, this.aT, this.y, this.b4, this.bO, this.aq, this.Q, this.t, this.bA, this.bl, this.b9, this.bu}, (Object[])this.b3);
            this.bH = net.minecraft.ah.e.NORMAL;
            this.b8 = "";
            this.bR = 70.0f;
            this.bM = "en_us";
            if (net.minecraft.k.m.d()) break block0;
            net.minecraft.client.l.c.b(new String[1]);
        }
    }

    private static int b(int n2, int[] arrn) {
        int n3 = net.minecraft.client.l.c.c(n2, arrn);
        String[] arrstring = net.minecraft.client.l.c.m();
        int n4 = n3;
        if (arrstring != null) {
            n4 = n4 < 0 ? arrn[0] : n2;
        }
        return n4;
    }

    public String c(f f10) {
        f f11;
        String string;
        String[] arrstring;
        block55: {
            boolean bl2;
            block54: {
                String string2 = this.d(f10);
                arrstring = net.minecraft.client.l.c.m();
                String string3 = string2;
                if (arrstring != null) {
                    if (string3 != null) {
                        return string2;
                    }
                    string3 = net.minecraft.client.D.h.a(f10.d(), new Object[0]) + ": ";
                }
                string = string3;
                bl2 = f10.f();
                if (arrstring == null) break block54;
                if (bl2) {
                    float f12 = this.b(f10);
                    float f13 = f10.e(f12);
                    f f14 = f10;
                    f f15 = net.minecraft.client.l.f.SENSITIVITY;
                    if (arrstring != null) {
                        if (f14 == f15) {
                            float f16 = f13 - 0.0f;
                            float f17 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                            if (arrstring != null) {
                                if (f17 == false) {
                                    return string + net.minecraft.client.D.h.a("options.sensitivity.min", new Object[0]);
                                }
                                float f18 = f13 - 1.0f;
                                f17 = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
                            }
                            return f17 == false ? string + net.minecraft.client.D.h.a("options.sensitivity.max", new Object[0]) : string + (int)(f13 * 200.0f) + "%";
                        }
                        f14 = f10;
                        f15 = net.minecraft.client.l.f.FOV;
                    }
                    if (arrstring != null) {
                        if (f14 == f15) {
                            float f19 = f12 - 70.0f;
                            float f20 = f19 == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
                            if (arrstring != null) {
                                if (f20 == false) {
                                    return string + net.minecraft.client.D.h.a("options.fov.min", new Object[0]);
                                }
                                float f21 = f12 - 110.0f;
                                f20 = f21 == 0.0f ? 0 : (f21 > 0.0f ? 1 : -1);
                            }
                            return f20 == false ? string + net.minecraft.client.D.h.a("options.fov.max", new Object[0]) : string + (int)f12;
                        }
                        f14 = f10;
                        f15 = net.minecraft.client.l.f.FRAMERATE_LIMIT;
                    }
                    if (arrstring != null) {
                        if (f14 == f15) {
                            return f12 == net.minecraft.client.l.f.a(f10) ? string + net.minecraft.client.D.h.a("options.framerateLimit.max", new Object[0]) : string + net.minecraft.client.D.h.a("options.framerate", (int)f12);
                        }
                        f14 = f10;
                        f15 = net.minecraft.client.l.f.RENDER_CLOUDS;
                    }
                    if (arrstring != null) {
                        if (f14 == f15) {
                            return f12 == net.minecraft.client.l.f.b(f10) ? string + net.minecraft.client.D.h.a("options.cloudHeight.min", new Object[0]) : string + ((int)f12 + 128);
                        }
                        f14 = f10;
                        f15 = net.minecraft.client.l.f.GAMMA;
                    }
                    if (arrstring != null) {
                        if (f14 == f15) {
                            float f22 = f13 - 0.0f;
                            float f23 = f22 == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1);
                            if (arrstring != null) {
                                if (f23 == false) {
                                    return string + net.minecraft.client.D.h.a("options.gamma.min", new Object[0]);
                                }
                                float f24 = f13 - 1.0f;
                                f23 = f24 == 0.0f ? 0 : (f24 > 0.0f ? 1 : -1);
                            }
                            return f23 == false ? string + net.minecraft.client.D.h.a("options.gamma.max", new Object[0]) : string + "+" + (int)(f13 * 100.0f) + "%";
                        }
                        f14 = f10;
                        f15 = net.minecraft.client.l.f.SATURATION;
                    }
                    if (arrstring != null) {
                        if (f14 == f15) {
                            return string + (int)(f13 * 400.0f) + "%";
                        }
                        f14 = f10;
                        f15 = net.minecraft.client.l.f.CHAT_OPACITY;
                    }
                    if (arrstring != null) {
                        if (f14 == f15) {
                            return string + (int)(f13 * 90.0f + 10.0f) + "%";
                        }
                        f14 = f10;
                        f15 = net.minecraft.client.l.f.CHAT_HEIGHT_UNFOCUSED;
                    }
                    if (arrstring != null) {
                        if (f14 == f15) {
                            return string + net.minecraft.client.b.I.a(f13) + "px";
                        }
                        f14 = f10;
                        f15 = net.minecraft.client.l.f.CHAT_HEIGHT_FOCUSED;
                    }
                    if (arrstring != null) {
                        if (f14 == f15) {
                            return string + net.minecraft.client.b.I.a(f13) + "px";
                        }
                        f14 = f10;
                        f15 = net.minecraft.client.l.f.CHAT_WIDTH;
                    }
                    if (arrstring != null) {
                        if (f14 == f15) {
                            return string + net.minecraft.client.b.I.b(f13) + "px";
                        }
                        f14 = f10;
                        f15 = net.minecraft.client.l.f.RENDER_DISTANCE;
                    }
                    if (arrstring != null) {
                        if (f14 == f15) {
                            return string + net.minecraft.client.D.h.a("options.chunks", (int)f12);
                        }
                        f14 = f10;
                        f15 = net.minecraft.client.l.f.MIPMAP_LEVELS;
                    }
                    if (f14 == f15) {
                        return f12 == 0.0f ? string + net.minecraft.client.D.h.a("options.off", new Object[0]) : string + (int)f12;
                    }
                    return f13 == 0.0f ? string + net.minecraft.client.D.h.a("options.off", new Object[0]) : string + (int)(f13 * 100.0f) + "%";
                }
                f11 = f10;
                if (arrstring == null) break block55;
                bl2 = f11.b();
            }
            if (bl2) {
                boolean bl3 = this.a(f10);
                return bl3 ? string + net.minecraft.client.D.h.a("options.on", new Object[0]) : string + net.minecraft.client.D.h.a("options.off", new Object[0]);
            }
            f11 = f10;
        }
        f f25 = net.minecraft.client.l.f.MAIN_HAND;
        if (arrstring != null) {
            if (f11 == f25) {
                return string + (Object)((Object)this.aR);
            }
            f11 = f10;
            f25 = net.minecraft.client.l.f.GUI_SCALE;
        }
        if (arrstring != null) {
            if (f11 == f25) {
                return this.b7 >= bY.length ? string + this.b7 + "x" : string + net.minecraft.client.l.c.a(bY, this.b7);
            }
            f11 = f10;
            f25 = net.minecraft.client.l.f.CHAT_VISIBILITY;
        }
        if (arrstring != null) {
            if (f11 == f25) {
                return string + net.minecraft.client.D.h.a(this.bd.a(), new Object[0]);
            }
            f11 = f10;
            f25 = net.minecraft.client.l.f.PARTICLES;
        }
        if (arrstring != null) {
            if (f11 == f25) {
                return string + net.minecraft.client.l.c.a(bL, this.bC);
            }
            f11 = f10;
            f25 = net.minecraft.client.l.f.AMBIENT_OCCLUSION;
        }
        if (arrstring != null) {
            if (f11 == f25) {
                return string + net.minecraft.client.l.c.a(W, this.A);
            }
            f11 = f10;
            f25 = net.minecraft.client.l.f.RENDER_CLOUDS;
        }
        if (arrstring != null) {
            if (f11 == f25) {
                return string + net.minecraft.client.l.c.a(bX, this.bn);
            }
            f11 = f10;
            f25 = net.minecraft.client.l.f.GRAPHICS;
        }
        if (arrstring != null) {
            if (f11 == f25) {
                if (this.aC) {
                    return string + net.minecraft.client.D.h.a("options.graphics.fancy", new Object[0]);
                }
                String string4 = "options.graphics.fast";
                return string + net.minecraft.client.D.h.a("options.graphics.fast", new Object[0]);
            }
            f11 = f10;
            f25 = net.minecraft.client.l.f.ATTACK_INDICATOR;
        }
        if (arrstring != null) {
            if (f11 == f25) {
                return string + net.minecraft.client.l.c.a(bG, this.bm);
            }
            f11 = f10;
            f25 = net.minecraft.client.l.f.NARRATOR;
        }
        if (f11 == f25) {
            return net.minecraft.client.t.d.c.a() ? string + net.minecraft.client.l.c.a(a_, this.w) : string + net.minecraft.client.D.h.a("options.narrator.notavailable", new Object[0]);
        }
        return string;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void a(f var1_1, int var2_2) {
        block236: {
            block237: {
                block240: {
                    block243: {
                        block244: {
                            block241: {
                                block242: {
                                    block238: {
                                        block239: {
                                            block232: {
                                                block233: {
                                                    block235: {
                                                        block234: {
                                                            block229: {
                                                                block230: {
                                                                    block231: {
                                                                        block226: {
                                                                            block227: {
                                                                                block228: {
                                                                                    block223: {
                                                                                        block224: {
                                                                                            block225: {
                                                                                                block218: {
                                                                                                    block219: {
                                                                                                        block221: {
                                                                                                            block222: {
                                                                                                                block220: {
                                                                                                                    block215: {
                                                                                                                        block216: {
                                                                                                                            block217: {
                                                                                                                                block211: {
                                                                                                                                    block212: {
                                                                                                                                        block214: {
                                                                                                                                            block213: {
                                                                                                                                                block207: {
                                                                                                                                                    block208: {
                                                                                                                                                        block210: {
                                                                                                                                                            block209: {
                                                                                                                                                                block204: {
                                                                                                                                                                    block205: {
                                                                                                                                                                        block206: {
                                                                                                                                                                            block201: {
                                                                                                                                                                                block202: {
                                                                                                                                                                                    block203: {
                                                                                                                                                                                        block198: {
                                                                                                                                                                                            block199: {
                                                                                                                                                                                                block200: {
                                                                                                                                                                                                    block196: {
                                                                                                                                                                                                        block197: {
                                                                                                                                                                                                            var3_3 = net.minecraft.client.l.c.m();
                                                                                                                                                                                                            v0 = var1_1;
                                                                                                                                                                                                            v1 = net.minecraft.client.l.f.FOG_FANCY;
                                                                                                                                                                                                            if (var3_3 == null) break block196;
                                                                                                                                                                                                            if (v0 != v1) break block197;
                                                                                                                                                                                                            v2 = this;
                                                                                                                                                                                                            if (var3_3 == null) ** GOTO lbl23
                                                                                                                                                                                                            switch (v2.i) {
                                                                                                                                                                                                                case 1: {
                                                                                                                                                                                                                    this.i = 2;
                                                                                                                                                                                                                    if (var3_3 != null) {
                                                                                                                                                                                                                        if (fU.aL()) break;
                                                                                                                                                                                                                        this.i = 3;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    if (var3_3 != null) break;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case 2: {
                                                                                                                                                                                                                    this.i = 3;
                                                                                                                                                                                                                    if (var3_3 != null) break;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                case 3: {
                                                                                                                                                                                                                    this.i = 1;
                                                                                                                                                                                                                    if (var3_3 != null) break;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                default: {
                                                                                                                                                                                                                    v2 = this;
lbl23:
                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                    v2.i = 1;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        v0 = var1_1;
                                                                                                                                                                                                        v1 = net.minecraft.client.l.f.FOG_START;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (var3_3 == null) break block198;
                                                                                                                                                                                                    if (v0 != v1) break block199;
                                                                                                                                                                                                    this.an += 0.2f;
                                                                                                                                                                                                    v3 = this;
                                                                                                                                                                                                    if (var3_3 == null) break block200;
                                                                                                                                                                                                    if (!(v3.an > 0.81f)) break block199;
                                                                                                                                                                                                    v3 = this;
                                                                                                                                                                                                }
                                                                                                                                                                                                v3.an = 0.2f;
                                                                                                                                                                                            }
                                                                                                                                                                                            v0 = var1_1;
                                                                                                                                                                                            v1 = net.minecraft.client.l.f.SMOOTH_FPS;
                                                                                                                                                                                        }
                                                                                                                                                                                        if (var3_3 != null) {
                                                                                                                                                                                            if (v0 == v1) {
                                                                                                                                                                                                v4 = this.be;
                                                                                                                                                                                                if (var3_3 != null) {
                                                                                                                                                                                                    v4 = v4 == false;
                                                                                                                                                                                                }
                                                                                                                                                                                                this.be = v4;
                                                                                                                                                                                            }
                                                                                                                                                                                            v0 = var1_1;
                                                                                                                                                                                            v1 = net.minecraft.client.l.f.SMOOTH_WORLD;
                                                                                                                                                                                        }
                                                                                                                                                                                        if (var3_3 != null) {
                                                                                                                                                                                            if (v0 == v1) {
                                                                                                                                                                                                v5 = this.R;
                                                                                                                                                                                                if (var3_3 != null) {
                                                                                                                                                                                                    v5 = v5 == false;
                                                                                                                                                                                                }
                                                                                                                                                                                                this.R = v5;
                                                                                                                                                                                                fU.Y();
                                                                                                                                                                                            }
                                                                                                                                                                                            v0 = var1_1;
                                                                                                                                                                                            v1 = net.minecraft.client.l.f.CLOUDS;
                                                                                                                                                                                        }
                                                                                                                                                                                        if (var3_3 != null) {
                                                                                                                                                                                            if (v0 == v1) {
                                                                                                                                                                                                ++this.o;
                                                                                                                                                                                                v6 = this;
                                                                                                                                                                                                if (var3_3 != null) {
                                                                                                                                                                                                    if (v6.o > 3) {
                                                                                                                                                                                                        this.o = 0;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    this.b();
                                                                                                                                                                                                    v6 = this;
                                                                                                                                                                                                }
                                                                                                                                                                                                v6.bk.a2.w();
                                                                                                                                                                                            }
                                                                                                                                                                                            v0 = var1_1;
                                                                                                                                                                                            v1 = net.minecraft.client.l.f.TREES;
                                                                                                                                                                                        }
                                                                                                                                                                                        if (var3_3 != null) {
                                                                                                                                                                                            if (v0 == v1) {
                                                                                                                                                                                                this.D = net.minecraft.client.l.c.a(this.D, net.minecraft.client.l.c.U);
                                                                                                                                                                                                this.bk.a2.d();
                                                                                                                                                                                            }
                                                                                                                                                                                            v0 = var1_1;
                                                                                                                                                                                            v1 = net.minecraft.client.l.f.DROPPED_ITEMS;
                                                                                                                                                                                        }
                                                                                                                                                                                        if (var3_3 == null) break block201;
                                                                                                                                                                                        if (v0 != v1) break block202;
                                                                                                                                                                                        ++this.a9;
                                                                                                                                                                                        v7 = this;
                                                                                                                                                                                        if (var3_3 == null) break block203;
                                                                                                                                                                                        if (v7.a9 <= 2) break block202;
                                                                                                                                                                                        v7 = this;
                                                                                                                                                                                    }
                                                                                                                                                                                    v7.a9 = 0;
                                                                                                                                                                                }
                                                                                                                                                                                v0 = var1_1;
                                                                                                                                                                                v1 = net.minecraft.client.l.f.RAIN;
                                                                                                                                                                            }
                                                                                                                                                                            if (var3_3 == null) break block204;
                                                                                                                                                                            if (v0 != v1) break block205;
                                                                                                                                                                            ++this.af;
                                                                                                                                                                            v8 = this;
                                                                                                                                                                            if (var3_3 == null) break block206;
                                                                                                                                                                            if (v8.af <= 3) break block205;
                                                                                                                                                                            v8 = this;
                                                                                                                                                                        }
                                                                                                                                                                        v8.af = 0;
                                                                                                                                                                    }
                                                                                                                                                                    v0 = var1_1;
                                                                                                                                                                    v1 = net.minecraft.client.l.f.ANIMATED_WATER;
                                                                                                                                                                }
                                                                                                                                                                if (var3_3 == null) break block207;
                                                                                                                                                                if (v0 != v1) break block208;
                                                                                                                                                                v9 = ++this.bV;
                                                                                                                                                                v10 = 1;
                                                                                                                                                                if (var3_3 == null) break block209;
                                                                                                                                                                if (v9 == v10) {
                                                                                                                                                                    ++this.bV;
                                                                                                                                                                }
                                                                                                                                                                v11 = this;
                                                                                                                                                                if (var3_3 == null) break block210;
                                                                                                                                                                v9 = v11.bV;
                                                                                                                                                                v10 = 2;
                                                                                                                                                            }
                                                                                                                                                            if (v9 <= v10) break block208;
                                                                                                                                                            v11 = this;
                                                                                                                                                        }
                                                                                                                                                        v11.bV = 0;
                                                                                                                                                    }
                                                                                                                                                    v0 = var1_1;
                                                                                                                                                    v1 = net.minecraft.client.l.f.ANIMATED_LAVA;
                                                                                                                                                }
                                                                                                                                                if (var3_3 == null) break block211;
                                                                                                                                                if (v0 != v1) break block212;
                                                                                                                                                v12 = ++this.ce;
                                                                                                                                                v13 = 1;
                                                                                                                                                if (var3_3 == null) break block213;
                                                                                                                                                if (v12 == v13) {
                                                                                                                                                    ++this.ce;
                                                                                                                                                }
                                                                                                                                                v14 = this;
                                                                                                                                                if (var3_3 == null) break block214;
                                                                                                                                                v12 = v14.ce;
                                                                                                                                                v13 = 2;
                                                                                                                                            }
                                                                                                                                            if (v12 <= v13) break block212;
                                                                                                                                            v14 = this;
                                                                                                                                        }
                                                                                                                                        v14.ce = 0;
                                                                                                                                    }
                                                                                                                                    v0 = var1_1;
                                                                                                                                    v1 = net.minecraft.client.l.f.ANIMATED_FIRE;
                                                                                                                                }
                                                                                                                                if (var3_3 != null) {
                                                                                                                                    if (v0 == v1) {
                                                                                                                                        v15 = this.Z;
                                                                                                                                        if (var3_3 != null) {
                                                                                                                                            v15 = v15 == false;
                                                                                                                                        }
                                                                                                                                        this.Z = v15;
                                                                                                                                    }
                                                                                                                                    v0 = var1_1;
                                                                                                                                    v1 = net.minecraft.client.l.f.ANIMATED_PORTAL;
                                                                                                                                }
                                                                                                                                if (var3_3 != null) {
                                                                                                                                    if (v0 == v1) {
                                                                                                                                        v16 = this.bs;
                                                                                                                                        if (var3_3 != null) {
                                                                                                                                            v16 = v16 == false;
                                                                                                                                        }
                                                                                                                                        this.bs = v16;
                                                                                                                                    }
                                                                                                                                    v0 = var1_1;
                                                                                                                                    v1 = net.minecraft.client.l.f.ANIMATED_REDSTONE;
                                                                                                                                }
                                                                                                                                if (var3_3 != null) {
                                                                                                                                    if (v0 == v1) {
                                                                                                                                        v17 = this.au;
                                                                                                                                        if (var3_3 != null) {
                                                                                                                                            v17 = v17 == false;
                                                                                                                                        }
                                                                                                                                        this.au = v17;
                                                                                                                                    }
                                                                                                                                    v0 = var1_1;
                                                                                                                                    v1 = net.minecraft.client.l.f.ANIMATED_EXPLOSION;
                                                                                                                                }
                                                                                                                                if (var3_3 != null) {
                                                                                                                                    if (v0 == v1) {
                                                                                                                                        v18 = this.ap;
                                                                                                                                        if (var3_3 != null) {
                                                                                                                                            v18 = v18 == false;
                                                                                                                                        }
                                                                                                                                        this.ap = v18;
                                                                                                                                    }
                                                                                                                                    v0 = var1_1;
                                                                                                                                    v1 = net.minecraft.client.l.f.ANIMATED_FLAME;
                                                                                                                                }
                                                                                                                                if (var3_3 != null) {
                                                                                                                                    if (v0 == v1) {
                                                                                                                                        v19 = this.p;
                                                                                                                                        if (var3_3 != null) {
                                                                                                                                            v19 = v19 == false;
                                                                                                                                        }
                                                                                                                                        this.p = v19;
                                                                                                                                    }
                                                                                                                                    v0 = var1_1;
                                                                                                                                    v1 = net.minecraft.client.l.f.ANIMATED_SMOKE;
                                                                                                                                }
                                                                                                                                if (var3_3 != null) {
                                                                                                                                    if (v0 == v1) {
                                                                                                                                        v20 = this.am;
                                                                                                                                        if (var3_3 != null) {
                                                                                                                                            v20 = v20 == false;
                                                                                                                                        }
                                                                                                                                        this.am = v20;
                                                                                                                                    }
                                                                                                                                    v0 = var1_1;
                                                                                                                                    v1 = net.minecraft.client.l.f.VOID_PARTICLES;
                                                                                                                                }
                                                                                                                                if (var3_3 != null) {
                                                                                                                                    if (v0 == v1) {
                                                                                                                                        v21 = this.z;
                                                                                                                                        if (var3_3 != null) {
                                                                                                                                            v21 = v21 == false;
                                                                                                                                        }
                                                                                                                                        this.z = v21;
                                                                                                                                    }
                                                                                                                                    v0 = var1_1;
                                                                                                                                    v1 = net.minecraft.client.l.f.WATER_PARTICLES;
                                                                                                                                }
                                                                                                                                if (var3_3 != null) {
                                                                                                                                    if (v0 == v1) {
                                                                                                                                        v22 = this.bQ;
                                                                                                                                        if (var3_3 != null) {
                                                                                                                                            v22 = v22 == false;
                                                                                                                                        }
                                                                                                                                        this.bQ = v22;
                                                                                                                                    }
                                                                                                                                    v0 = var1_1;
                                                                                                                                    v1 = net.minecraft.client.l.f.PORTAL_PARTICLES;
                                                                                                                                }
                                                                                                                                if (var3_3 != null) {
                                                                                                                                    if (v0 == v1) {
                                                                                                                                        v23 = this.bh;
                                                                                                                                        if (var3_3 != null) {
                                                                                                                                            v23 = v23 == false;
                                                                                                                                        }
                                                                                                                                        this.bh = v23;
                                                                                                                                    }
                                                                                                                                    v0 = var1_1;
                                                                                                                                    v1 = net.minecraft.client.l.f.POTION_PARTICLES;
                                                                                                                                }
                                                                                                                                if (var3_3 != null) {
                                                                                                                                    if (v0 == v1) {
                                                                                                                                        v24 = this.aB;
                                                                                                                                        if (var3_3 != null) {
                                                                                                                                            v24 = v24 == false;
                                                                                                                                        }
                                                                                                                                        this.aB = v24;
                                                                                                                                    }
                                                                                                                                    v0 = var1_1;
                                                                                                                                    v1 = net.minecraft.client.l.f.FIREWORK_PARTICLES;
                                                                                                                                }
                                                                                                                                if (var3_3 != null) {
                                                                                                                                    if (v0 == v1) {
                                                                                                                                        v25 = this.bw;
                                                                                                                                        if (var3_3 != null) {
                                                                                                                                            v25 = v25 == false;
                                                                                                                                        }
                                                                                                                                        this.bw = v25;
                                                                                                                                    }
                                                                                                                                    v0 = var1_1;
                                                                                                                                    v1 = net.minecraft.client.l.f.DRIPPING_WATER_LAVA;
                                                                                                                                }
                                                                                                                                if (var3_3 != null) {
                                                                                                                                    if (v0 == v1) {
                                                                                                                                        v26 = this.by;
                                                                                                                                        if (var3_3 != null) {
                                                                                                                                            v26 = v26 == false;
                                                                                                                                        }
                                                                                                                                        this.by = v26;
                                                                                                                                    }
                                                                                                                                    v0 = var1_1;
                                                                                                                                    v1 = net.minecraft.client.l.f.ANIMATED_TERRAIN;
                                                                                                                                }
                                                                                                                                if (var3_3 != null) {
                                                                                                                                    if (v0 == v1) {
                                                                                                                                        v27 = this.a1;
                                                                                                                                        if (var3_3 != null) {
                                                                                                                                            v27 = v27 == false;
                                                                                                                                        }
                                                                                                                                        this.a1 = v27;
                                                                                                                                    }
                                                                                                                                    v0 = var1_1;
                                                                                                                                    v1 = net.minecraft.client.l.f.ANIMATED_TEXTURES;
                                                                                                                                }
                                                                                                                                if (var3_3 != null) {
                                                                                                                                    if (v0 == v1) {
                                                                                                                                        v28 = this.s;
                                                                                                                                        if (var3_3 != null) {
                                                                                                                                            v28 = v28 == false;
                                                                                                                                        }
                                                                                                                                        this.s = v28;
                                                                                                                                    }
                                                                                                                                    v0 = var1_1;
                                                                                                                                    v1 = net.minecraft.client.l.f.RAIN_SPLASH;
                                                                                                                                }
                                                                                                                                if (var3_3 != null) {
                                                                                                                                    if (v0 == v1) {
                                                                                                                                        v29 = this.aH;
                                                                                                                                        if (var3_3 != null) {
                                                                                                                                            v29 = v29 == false;
                                                                                                                                        }
                                                                                                                                        this.aH = v29;
                                                                                                                                    }
                                                                                                                                    v0 = var1_1;
                                                                                                                                    v1 = net.minecraft.client.l.f.LAGOMETER;
                                                                                                                                }
                                                                                                                                if (var3_3 != null) {
                                                                                                                                    if (v0 == v1) {
                                                                                                                                        v30 = this.V;
                                                                                                                                        if (var3_3 != null) {
                                                                                                                                            v30 = v30 == false;
                                                                                                                                        }
                                                                                                                                        this.V = v30;
                                                                                                                                    }
                                                                                                                                    v0 = var1_1;
                                                                                                                                    v1 = net.minecraft.client.l.f.SHOW_FPS;
                                                                                                                                }
                                                                                                                                if (var3_3 != null) {
                                                                                                                                    if (v0 == v1) {
                                                                                                                                        v31 = this.a5;
                                                                                                                                        if (var3_3 != null) {
                                                                                                                                            v31 = v31 == false;
                                                                                                                                        }
                                                                                                                                        this.a5 = v31;
                                                                                                                                    }
                                                                                                                                    v0 = var1_1;
                                                                                                                                    v1 = net.minecraft.client.l.f.AUTOSAVE_TICKS;
                                                                                                                                }
                                                                                                                                if (var3_3 == null) break block215;
                                                                                                                                if (v0 != v1) break block216;
                                                                                                                                this.az *= 10;
                                                                                                                                v32 = this;
                                                                                                                                if (var3_3 == null) break block217;
                                                                                                                                if (v32.az <= 40000) break block216;
                                                                                                                                v32 = this;
                                                                                                                            }
                                                                                                                            v32.az = 40;
                                                                                                                        }
                                                                                                                        v0 = var1_1;
                                                                                                                        v1 = net.minecraft.client.l.f.BETTER_GRASS;
                                                                                                                    }
                                                                                                                    if (var3_3 != null) {
                                                                                                                        if (v0 == v1) {
                                                                                                                            ++this.e;
                                                                                                                            v33 = this;
                                                                                                                            if (var3_3 != null) {
                                                                                                                                if (v33.e > 3) {
                                                                                                                                    this.e = 1;
                                                                                                                                }
                                                                                                                                v33 = this;
                                                                                                                            }
                                                                                                                            v33.bk.a2.d();
                                                                                                                        }
                                                                                                                        v0 = var1_1;
                                                                                                                        v1 = net.minecraft.client.l.f.CONNECTED_TEXTURES;
                                                                                                                    }
                                                                                                                    if (var3_3 == null) break block218;
                                                                                                                    if (v0 != v1) break block219;
                                                                                                                    v34 = ++this.J;
                                                                                                                    v35 = 3;
                                                                                                                    if (var3_3 == null) break block220;
                                                                                                                    if (v34 > v35) {
                                                                                                                        this.J = 1;
                                                                                                                    }
                                                                                                                    v36 = this;
                                                                                                                    if (var3_3 == null) break block221;
                                                                                                                    v34 = v36.J;
                                                                                                                    v35 = 2;
                                                                                                                }
                                                                                                                if (v34 != v35) break block222;
                                                                                                                this.bk.a2.d();
                                                                                                                if (var3_3 != null) break block219;
                                                                                                            }
                                                                                                            v36 = this;
                                                                                                        }
                                                                                                        v36.bk.af();
                                                                                                    }
                                                                                                    v0 = var1_1;
                                                                                                    v1 = net.minecraft.client.l.f.WEATHER;
                                                                                                }
                                                                                                if (var3_3 != null) {
                                                                                                    if (v0 == v1) {
                                                                                                        v37 = this.u;
                                                                                                        if (var3_3 != null) {
                                                                                                            v37 = v37 == false;
                                                                                                        }
                                                                                                        this.u = v37;
                                                                                                    }
                                                                                                    v0 = var1_1;
                                                                                                    v1 = net.minecraft.client.l.f.SKY;
                                                                                                }
                                                                                                if (var3_3 != null) {
                                                                                                    if (v0 == v1) {
                                                                                                        v38 = this.M;
                                                                                                        if (var3_3 != null) {
                                                                                                            v38 = v38 == false;
                                                                                                        }
                                                                                                        this.M = v38;
                                                                                                    }
                                                                                                    v0 = var1_1;
                                                                                                    v1 = net.minecraft.client.l.f.STARS;
                                                                                                }
                                                                                                if (var3_3 != null) {
                                                                                                    if (v0 == v1) {
                                                                                                        v39 = this.cd;
                                                                                                        if (var3_3 != null) {
                                                                                                            v39 = v39 == false;
                                                                                                        }
                                                                                                        this.cd = v39;
                                                                                                    }
                                                                                                    v0 = var1_1;
                                                                                                    v1 = net.minecraft.client.l.f.SUN_MOON;
                                                                                                }
                                                                                                if (var3_3 != null) {
                                                                                                    if (v0 == v1) {
                                                                                                        v40 = this.I;
                                                                                                        if (var3_3 != null) {
                                                                                                            v40 = v40 == false;
                                                                                                        }
                                                                                                        this.I = v40;
                                                                                                    }
                                                                                                    v0 = var1_1;
                                                                                                    v1 = net.minecraft.client.l.f.VIGNETTE;
                                                                                                }
                                                                                                if (var3_3 == null) break block223;
                                                                                                if (v0 != v1) break block224;
                                                                                                ++this.bp;
                                                                                                v41 = this;
                                                                                                if (var3_3 == null) break block225;
                                                                                                if (v41.bp <= 2) break block224;
                                                                                                v41 = this;
                                                                                            }
                                                                                            v41.bp = 0;
                                                                                        }
                                                                                        v0 = var1_1;
                                                                                        v1 = net.minecraft.client.l.f.CHUNK_UPDATES;
                                                                                    }
                                                                                    if (var3_3 == null) break block226;
                                                                                    if (v0 != v1) break block227;
                                                                                    ++this.Y;
                                                                                    v42 = this;
                                                                                    if (var3_3 == null) break block228;
                                                                                    if (v42.Y <= 5) break block227;
                                                                                    v42 = this;
                                                                                }
                                                                                v42.Y = 1;
                                                                            }
                                                                            v0 = var1_1;
                                                                            v1 = net.minecraft.client.l.f.CHUNK_UPDATES_DYNAMIC;
                                                                        }
                                                                        if (var3_3 != null) {
                                                                            if (v0 == v1) {
                                                                                v43 = this.aE;
                                                                                if (var3_3 != null) {
                                                                                    v43 = v43 == false;
                                                                                }
                                                                                this.aE = v43;
                                                                            }
                                                                            v0 = var1_1;
                                                                            v1 = net.minecraft.client.l.f.TIME;
                                                                        }
                                                                        if (var3_3 == null) break block229;
                                                                        if (v0 != v1) break block230;
                                                                        ++this.b;
                                                                        v44 = this;
                                                                        if (var3_3 == null) break block231;
                                                                        if (v44.b <= 2) break block230;
                                                                        v44 = this;
                                                                    }
                                                                    v44.b = 0;
                                                                }
                                                                v0 = var1_1;
                                                                v1 = net.minecraft.client.l.f.CLEAR_WATER;
                                                            }
                                                            if (var3_3 != null) {
                                                                if (v0 == v1) {
                                                                    v45 = this.aY;
                                                                    if (var3_3 != null) {
                                                                        v45 = v45 == false;
                                                                    }
                                                                    this.aY = v45;
                                                                    this.n();
                                                                }
                                                                v0 = var1_1;
                                                                v1 = net.minecraft.client.l.f.PROFILER;
                                                            }
                                                            if (var3_3 != null) {
                                                                if (v0 == v1) {
                                                                    v46 = this.ca;
                                                                    if (var3_3 != null) {
                                                                        v46 = v46 == false;
                                                                    }
                                                                    this.ca = v46;
                                                                }
                                                                v0 = var1_1;
                                                                v1 = net.minecraft.client.l.f.BETTER_SNOW;
                                                            }
                                                            if (var3_3 != null) {
                                                                if (v0 == v1) {
                                                                    v47 = this.bj;
                                                                    if (var3_3 != null) {
                                                                        v47 = v47 == false;
                                                                    }
                                                                    this.bj = v47;
                                                                    this.bk.a2.d();
                                                                }
                                                                v0 = var1_1;
                                                                v1 = net.minecraft.client.l.f.SWAMP_COLORS;
                                                            }
                                                            if (var3_3 != null) {
                                                                if (v0 == v1) {
                                                                    v48 = this.a3;
                                                                    if (var3_3 != null) {
                                                                        v48 = v48 == false;
                                                                    }
                                                                    this.a3 = v48;
                                                                    fa.j();
                                                                    this.bk.a2.d();
                                                                }
                                                                v0 = var1_1;
                                                                v1 = net.minecraft.client.l.f.RANDOM_MOBS;
                                                            }
                                                            if (var3_3 != null) {
                                                                if (v0 == v1) {
                                                                    v49 = this.S;
                                                                    if (var3_3 != null) {
                                                                        v49 = v49 == false;
                                                                    }
                                                                    this.S = v49;
                                                                    ab.a();
                                                                }
                                                                v0 = var1_1;
                                                                v1 = net.minecraft.client.l.f.SMOOTH_BIOMES;
                                                            }
                                                            if (var3_3 != null) {
                                                                if (v0 == v1) {
                                                                    v50 = this.al;
                                                                    if (var3_3 != null) {
                                                                        v50 = v50 == false;
                                                                    }
                                                                    this.al = v50;
                                                                    fa.j();
                                                                    this.bk.a2.d();
                                                                }
                                                                v0 = var1_1;
                                                                v1 = net.minecraft.client.l.f.CUSTOM_FONTS;
                                                            }
                                                            if (var3_3 != null) {
                                                                if (v0 == v1) {
                                                                    v51 = this.N;
                                                                    if (var3_3 != null) {
                                                                        v51 = v51 == false;
                                                                    }
                                                                    this.N = v51;
                                                                    this.bk.a6.b(fU.ba());
                                                                    this.bk.ah.b(fU.ba());
                                                                }
                                                                v0 = var1_1;
                                                                v1 = net.minecraft.client.l.f.CUSTOM_COLORS;
                                                            }
                                                            if (var3_3 != null) {
                                                                if (v0 == v1) {
                                                                    v52 = this.aX;
                                                                    if (var3_3 != null) {
                                                                        v52 = v52 == false;
                                                                    }
                                                                    this.aX = v52;
                                                                    fa.e();
                                                                    this.bk.a2.d();
                                                                }
                                                                v0 = var1_1;
                                                                v1 = net.minecraft.client.l.f.CUSTOM_ITEMS;
                                                            }
                                                            if (var3_3 != null) {
                                                                if (v0 == v1) {
                                                                    v53 = this.bT;
                                                                    if (var3_3 != null) {
                                                                        v53 = v53 == false;
                                                                    }
                                                                    this.bT = v53;
                                                                    this.bk.af();
                                                                }
                                                                v0 = var1_1;
                                                                v1 = net.minecraft.client.l.f.CUSTOM_SKY;
                                                            }
                                                            if (var3_3 != null) {
                                                                if (v0 == v1) {
                                                                    v54 = this.aF;
                                                                    if (var3_3 != null) {
                                                                        v54 = v54 == false;
                                                                    }
                                                                    this.aF = v54;
                                                                    aS.a();
                                                                }
                                                                v0 = var1_1;
                                                                v1 = net.minecraft.client.l.f.SHOW_CAPES;
                                                            }
                                                            if (var3_3 != null) {
                                                                if (v0 == v1) {
                                                                    v55 = this.bi;
                                                                    if (var3_3 != null) {
                                                                        v55 = v55 == false;
                                                                    }
                                                                    this.bi = v55;
                                                                }
                                                                v0 = var1_1;
                                                                v1 = net.minecraft.client.l.f.NATURAL_TEXTURES;
                                                            }
                                                            if (var3_3 != null) {
                                                                if (v0 == v1) {
                                                                    v56 = this.a7;
                                                                    if (var3_3 != null) {
                                                                        v56 = v56 == false;
                                                                    }
                                                                    this.a7 = v56;
                                                                    aO.a();
                                                                    this.bk.a2.d();
                                                                }
                                                                v0 = var1_1;
                                                                v1 = net.minecraft.client.l.f.FAST_MATH;
                                                            }
                                                            if (var3_3 != null) {
                                                                if (v0 == v1) {
                                                                    v57 = this.aa;
                                                                    if (var3_3 != null) {
                                                                        v57 = v57 == false;
                                                                    }
                                                                    net.minecraft.k.h.j = this.aa = v57;
                                                                }
                                                                v0 = var1_1;
                                                                v1 = net.minecraft.client.l.f.FAST_RENDER;
                                                            }
                                                            if (var3_3 == null) break block232;
                                                            if (v0 != v1) break block233;
                                                            v58 = this;
                                                            if (var3_3 != null) {
                                                                if (!v58.as && fU.ag()) {
                                                                    fU.a(gl.a("of.message.fr.shaders1"), gl.a("of.message.fr.shaders2"));
                                                                    return;
                                                                }
                                                                v58 = this;
                                                            }
                                                            v59 = this.as;
                                                            if (var3_3 != null) {
                                                                v59 = v59 == false;
                                                            }
                                                            v58.as = v59;
                                                            v60 = this;
                                                            if (var3_3 == null) break block234;
                                                            if (!v60.as) break block235;
                                                            v60 = this;
                                                        }
                                                        v60.bk.Y.q();
                                                    }
                                                    fU.aj();
                                                }
                                                v0 = var1_1;
                                                v1 = net.minecraft.client.l.f.TRANSLUCENT_BLOCKS;
                                            }
                                            if (var3_3 == null) break block236;
                                            if (v0 != v1) break block237;
                                            v61 = this.H;
                                            if (var3_3 == null) break block238;
                                            if (v61 != 0) break block239;
                                            this.H = 1;
                                            if (var3_3 != null) break block240;
                                        }
                                        v61 = this.H;
                                    }
                                    v62 = 1;
                                    if (var3_3 == null) break block241;
                                    if (v61 != v62) break block242;
                                    this.H = 2;
                                    if (var3_3 != null) break block240;
                                }
                                v63 = this;
                                if (var3_3 == null) break block243;
                                v61 = v63.H;
                                v62 = 2;
                            }
                            if (v61 != v62) break block244;
                            this.H = 0;
                            if (var3_3 != null) break block240;
                        }
                        v63 = this;
                    }
                    v63.H = 0;
                }
                this.bk.a2.d();
            }
            v0 = var1_1;
            v1 = net.minecraft.client.l.f.LAZY_CHUNK_LOADING;
        }
        if (var3_3 != null) {
            if (v0 == v1) {
                v64 = this.E;
                if (var3_3 != null) {
                    v64 = v64 == false;
                }
                this.E = v64;
                fU.t();
                if (!fU.G()) {
                    this.E = false;
                }
                this.bk.a2.d();
            }
            v0 = var1_1;
            v1 = net.minecraft.client.l.f.DYNAMIC_FOV;
        }
        if (var3_3 != null) {
            if (v0 == v1) {
                v65 = this.aJ;
                if (var3_3 != null) {
                    v65 = v65 == false;
                }
                this.aJ = v65;
            }
            v0 = var1_1;
            v1 = net.minecraft.client.l.f.ALTERNATE_BLOCKS;
        }
        if (var3_3 != null) {
            if (v0 == v1) {
                v66 = this.aI;
                if (var3_3 != null) {
                    v66 = v66 == false;
                }
                this.aI = v66;
                this.bk.af();
            }
            v0 = var1_1;
            v1 = net.minecraft.client.l.f.DYNAMIC_LIGHTS;
        }
        if (var3_3 != null) {
            if (v0 == v1) {
                this.aN = net.minecraft.client.l.c.a(this.aN, net.minecraft.client.l.c.x);
                gk.c(this.bk.a2);
            }
            v0 = var1_1;
            v1 = net.minecraft.client.l.f.SCREENSHOT_SIZE;
        }
        if (var3_3 != null) {
            if (v0 == v1) {
                v67 = ++this.b2;
                if (var3_3 != null) {
                    if (v67 > 4) {
                        this.b2 = 1;
                    }
                    v67 = net.minecraft.client.a.as.c() ? 1 : 0;
                }
                if (v67 == 0) {
                    this.b2 = 1;
                }
            }
            v0 = var1_1;
            v1 = net.minecraft.client.l.f.CUSTOM_ENTITY_MODELS;
        }
        if (var3_3 != null) {
            if (v0 == v1) {
                v68 = this.h;
                if (var3_3 != null) {
                    v68 = v68 == false;
                }
                this.h = v68;
                this.bk.af();
            }
            v0 = var1_1;
            v1 = net.minecraft.client.l.f.CUSTOM_GUIS;
        }
        if (var3_3 != null) {
            if (v0 == v1) {
                v69 = this.aO;
                if (var3_3 != null) {
                    v69 = v69 == false;
                }
                this.aO = v69;
                eO.a();
            }
            v0 = var1_1;
            v1 = net.minecraft.client.l.f.HELD_ITEM_TOOLTIPS;
        }
        if (var3_3 != null) {
            if (v0 == v1) {
                v70 = this.bP;
                if (var3_3 != null) {
                    v70 = v70 == false;
                }
                this.bP = v70;
            }
            v0 = var1_1;
            v1 = net.minecraft.client.l.f.ADVANCED_TOOLTIPS;
        }
        if (v0 != v1) return;
        v71 = this.aP;
        if (var3_3 != null) {
            v71 = v71 == false;
        }
        this.aP = v71;
    }

    public void a(d d10, int n2) {
        d10.a(n2);
        this.e();
    }

    private static int a(int n2, int[] arrn) {
        int n3 = net.minecraft.client.l.c.c(n2, arrn);
        String[] arrstring = net.minecraft.client.l.c.m();
        int n4 = n3++;
        if (arrstring != null) {
            if (n4 < 0) {
                return arrn[0];
            }
            n4 = n3;
        }
        if (arrstring != null) {
            if (n4 >= arrn.length) {
                n3 = 0;
            }
            n4 = arrn[n3];
        }
        return n4;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private float e(f var1_1) {
        var2_2 = net.minecraft.client.l.c.m();
        v0 = var1_1;
        v1 = net.minecraft.client.l.f.CLOUD_HEIGHT;
        if (var2_2 != null) {
            if (v0 == v1) {
                return this.ak;
            }
            v0 = var1_1;
            v1 = net.minecraft.client.l.f.AO_LEVEL;
        }
        if (var2_2 != null) {
            if (v0 == v1) {
                return this.aG;
            }
            v0 = var1_1;
            v1 = net.minecraft.client.l.f.AA_LEVEL;
        }
        if (var2_2 != null) {
            if (v0 == v1) {
                return this.a;
            }
            v0 = var1_1;
            v1 = net.minecraft.client.l.f.AF_LEVEL;
        }
        if (var2_2 != null) {
            if (v0 == v1) {
                return this.n;
            }
            v0 = var1_1;
            v1 = net.minecraft.client.l.f.MIPMAP_TYPE;
        }
        if (var2_2 != null) {
            if (v0 == v1) {
                return this.b6;
            }
            v0 = var1_1;
            v1 = net.minecraft.client.l.f.FRAMERATE_LIMIT;
        }
        if (var2_2 != null) {
            if (v0 == v1) {
                cfr_temp_0 = (float)this.bo - net.minecraft.client.l.f.FRAMERATE_LIMIT.a();
                v2 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                if (var2_2 != null) {
                    if (v2 == false) {
                        v2 = (float)this.br;
                        if (var2_2 != null) {
                            if (v2 != false) {
                                return 0.0f;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v2 = this.bo;
                    }
                }
                v3 = v2;
                return v3;
            }
            v0 = var1_1;
            v1 = net.minecraft.client.l.f.FULLSCREEN_MODE;
        }
        if (v0 != v1) return 3.4028235E38f;
        if (this.l.equals("Default")) {
            return 0.0f;
        }
        var3_3 = Arrays.asList(fU.aI());
        v4 = var4_4 = var3_3.indexOf(this.l);
        if (var2_2 != null) {
            if (v4 < 0) {
                return 0.0f;
            }
            v4 = var4_4 + 1;
        }
        v5 = v4;
        return v5;
    }

    /*
     * Exception decompiling
     */
    public void b(f var1_1, int var2_2) {
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

    public void a(ay ay2, float f10) {
        this.bk.p().a(ay2, f10);
        this.ab.put(ay2, Float.valueOf(f10));
    }

    private r a(r r2) {
        int n2 = 0;
        try {
            n2 = Integer.parseInt(r2.j("version"));
        }
        catch (RuntimeException runtimeException) {
            // empty catch block
        }
        return this.bk.ai().a(net.minecraft.av.f.OPTIONS, r2, n2);
    }

    public boolean i() {
        return this.aA;
    }

    public float b(f f10) {
        String[] arrstring;
        block26: {
            float f11;
            block25: {
                float f12 = this.e(f10);
                arrstring = net.minecraft.client.l.c.m();
                f11 = f12;
                if (arrstring == null) break block25;
                if (f11 == Float.MAX_VALUE) break block26;
                f11 = f12;
            }
            return f11;
        }
        f f13 = f10;
        f f14 = net.minecraft.client.l.f.FOV;
        if (arrstring != null) {
            if (f13 == f14) {
                return this.bR;
            }
            f13 = f10;
            f14 = net.minecraft.client.l.f.GAMMA;
        }
        if (arrstring != null) {
            if (f13 == f14) {
                return this.aj;
            }
            f13 = f10;
            f14 = net.minecraft.client.l.f.SATURATION;
        }
        if (arrstring != null) {
            if (f13 == f14) {
                return this.bS;
            }
            f13 = f10;
            f14 = net.minecraft.client.l.f.SENSITIVITY;
        }
        if (arrstring != null) {
            if (f13 == f14) {
                return this.bv;
            }
            f13 = f10;
            f14 = net.minecraft.client.l.f.CHAT_OPACITY;
        }
        if (arrstring != null) {
            if (f13 == f14) {
                return this.b_;
            }
            f13 = f10;
            f14 = net.minecraft.client.l.f.CHAT_HEIGHT_FOCUSED;
        }
        if (arrstring != null) {
            if (f13 == f14) {
                return this.aQ;
            }
            f13 = f10;
            f14 = net.minecraft.client.l.f.CHAT_HEIGHT_UNFOCUSED;
        }
        if (arrstring != null) {
            if (f13 == f14) {
                return this.at;
            }
            f13 = f10;
            f14 = net.minecraft.client.l.f.CHAT_SCALE;
        }
        if (arrstring != null) {
            if (f13 == f14) {
                return this.ah;
            }
            f13 = f10;
            f14 = net.minecraft.client.l.f.CHAT_WIDTH;
        }
        if (arrstring != null) {
            if (f13 == f14) {
                return this.m;
            }
            f13 = f10;
            f14 = net.minecraft.client.l.f.FRAMERATE_LIMIT;
        }
        if (arrstring != null) {
            if (f13 == f14) {
                return this.bo;
            }
            f13 = f10;
            f14 = net.minecraft.client.l.f.MIPMAP_LEVELS;
        }
        if (arrstring != null) {
            if (f13 == f14) {
                return this.c;
            }
            f13 = f10;
            f14 = net.minecraft.client.l.f.RENDER_DISTANCE;
        }
        return f13 == f14 ? (float)this.bf : 0.0f;
    }

    public void a(net.minecraft.i.a a10) {
        block2: {
            boolean bl2;
            block3: {
                String[] arrstring = net.minecraft.client.l.c.m();
                bl2 = this.c().contains((Object)a10);
                if (arrstring == null) break block2;
                if (!bl2) break block3;
                this.bq.remove((Object)a10);
                if (arrstring != null) break block2;
            }
            bl2 = this.bq.add(a10);
        }
        this.k();
    }

    private static String a(String[] arrstring, int n2) {
        block4: {
            int n3;
            block2: {
                block3: {
                    String[] arrstring2 = net.minecraft.client.l.c.m();
                    n3 = n2;
                    if (arrstring2 == null) break block2;
                    if (n3 < 0) break block3;
                    n3 = n2;
                    if (arrstring2 == null) break block2;
                    if (n3 < arrstring.length) break block4;
                }
                n3 = 0;
            }
            n2 = n3;
        }
        return net.minecraft.client.D.h.a(arrstring[n2], new Object[0]);
    }

    public void l() {
        block282: {
            String[] arrstring = net.minecraft.client.l.c.m();
            try {
                File file = this.q;
                boolean bl2 = file.exists();
                if (arrstring != null) {
                    if (!bl2) {
                        file = this.ac;
                    }
                    bl2 = file.exists();
                }
                if (!bl2) {
                    return;
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((InputStream)new FileInputStream(file), StandardCharsets.UTF_8));
                String string = "";
                while ((string = bufferedReader.readLine()) != null) {
                    try {
                        int n2;
                        String[] arrstring2;
                        block417: {
                            block418: {
                                block415: {
                                    block416: {
                                        block413: {
                                            block414: {
                                                block411: {
                                                    block412: {
                                                        block409: {
                                                            block410: {
                                                                block407: {
                                                                    block408: {
                                                                        block405: {
                                                                            block406: {
                                                                                block403: {
                                                                                    block404: {
                                                                                        block401: {
                                                                                            block402: {
                                                                                                block399: {
                                                                                                    block400: {
                                                                                                        block397: {
                                                                                                            block398: {
                                                                                                                block395: {
                                                                                                                    block396: {
                                                                                                                        block393: {
                                                                                                                            block394: {
                                                                                                                                block391: {
                                                                                                                                    block392: {
                                                                                                                                        block389: {
                                                                                                                                            block390: {
                                                                                                                                                block387: {
                                                                                                                                                    block388: {
                                                                                                                                                        block385: {
                                                                                                                                                            block386: {
                                                                                                                                                                block383: {
                                                                                                                                                                    block384: {
                                                                                                                                                                        block381: {
                                                                                                                                                                            block382: {
                                                                                                                                                                                block379: {
                                                                                                                                                                                    block380: {
                                                                                                                                                                                        block377: {
                                                                                                                                                                                            block378: {
                                                                                                                                                                                                block375: {
                                                                                                                                                                                                    block376: {
                                                                                                                                                                                                        block373: {
                                                                                                                                                                                                            block374: {
                                                                                                                                                                                                                block371: {
                                                                                                                                                                                                                    block372: {
                                                                                                                                                                                                                        block369: {
                                                                                                                                                                                                                            block370: {
                                                                                                                                                                                                                                block367: {
                                                                                                                                                                                                                                    block368: {
                                                                                                                                                                                                                                        block365: {
                                                                                                                                                                                                                                            block366: {
                                                                                                                                                                                                                                                block363: {
                                                                                                                                                                                                                                                    block364: {
                                                                                                                                                                                                                                                        block361: {
                                                                                                                                                                                                                                                            block362: {
                                                                                                                                                                                                                                                                block359: {
                                                                                                                                                                                                                                                                    block360: {
                                                                                                                                                                                                                                                                        block357: {
                                                                                                                                                                                                                                                                            block358: {
                                                                                                                                                                                                                                                                                block355: {
                                                                                                                                                                                                                                                                                    block356: {
                                                                                                                                                                                                                                                                                        block353: {
                                                                                                                                                                                                                                                                                            block354: {
                                                                                                                                                                                                                                                                                                block351: {
                                                                                                                                                                                                                                                                                                    block352: {
                                                                                                                                                                                                                                                                                                        block349: {
                                                                                                                                                                                                                                                                                                            block350: {
                                                                                                                                                                                                                                                                                                                block347: {
                                                                                                                                                                                                                                                                                                                    block348: {
                                                                                                                                                                                                                                                                                                                        block345: {
                                                                                                                                                                                                                                                                                                                            block346: {
                                                                                                                                                                                                                                                                                                                                block343: {
                                                                                                                                                                                                                                                                                                                                    block344: {
                                                                                                                                                                                                                                                                                                                                        block341: {
                                                                                                                                                                                                                                                                                                                                            block342: {
                                                                                                                                                                                                                                                                                                                                                block339: {
                                                                                                                                                                                                                                                                                                                                                    block340: {
                                                                                                                                                                                                                                                                                                                                                        block337: {
                                                                                                                                                                                                                                                                                                                                                            block338: {
                                                                                                                                                                                                                                                                                                                                                                block335: {
                                                                                                                                                                                                                                                                                                                                                                    block336: {
                                                                                                                                                                                                                                                                                                                                                                        block333: {
                                                                                                                                                                                                                                                                                                                                                                            block334: {
                                                                                                                                                                                                                                                                                                                                                                                block331: {
                                                                                                                                                                                                                                                                                                                                                                                    block332: {
                                                                                                                                                                                                                                                                                                                                                                                        block329: {
                                                                                                                                                                                                                                                                                                                                                                                            block330: {
                                                                                                                                                                                                                                                                                                                                                                                                block327: {
                                                                                                                                                                                                                                                                                                                                                                                                    block328: {
                                                                                                                                                                                                                                                                                                                                                                                                        block325: {
                                                                                                                                                                                                                                                                                                                                                                                                            block326: {
                                                                                                                                                                                                                                                                                                                                                                                                                block323: {
                                                                                                                                                                                                                                                                                                                                                                                                                    block324: {
                                                                                                                                                                                                                                                                                                                                                                                                                        block321: {
                                                                                                                                                                                                                                                                                                                                                                                                                            block322: {
                                                                                                                                                                                                                                                                                                                                                                                                                                block319: {
                                                                                                                                                                                                                                                                                                                                                                                                                                    block320: {
                                                                                                                                                                                                                                                                                                                                                                                                                                        block317: {
                                                                                                                                                                                                                                                                                                                                                                                                                                            block318: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                block315: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    block316: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                        block313: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                            block314: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                block311: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    block312: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        block309: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            block310: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                block307: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    block308: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        block305: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            block306: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                block303: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    block304: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        block301: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            block302: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                block299: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    block300: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        block297: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            block298: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                block295: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    block296: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        block293: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            block294: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                block291: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    block292: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        block289: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            block290: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                block287: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    block288: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        block285: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            block286: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                block283: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    block284: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        arrstring2 = string.split(":");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block282;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        n2 = arrstring2[0].equals("ofRenderDistanceChunks");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block283;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (n2 == 0) break block284;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block283;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            this.bf = Integer.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            this.bf = fU.a(this.bf, 2, 1024);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    n2 = arrstring2[0].equals("ofFogType") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block285;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (n2 == 0) break block286;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block285;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    this.i = Integer.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    this.i = fU.a(this.i, 1, 3);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            n2 = arrstring2[0].equals("ofFogStart") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block287;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (n2 == 0) break block288;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block287;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (n2 < 2) break block288;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        this.an = Float.valueOf(arrstring2[1]).floatValue();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        float f10 = this.an - 0.2f;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        n2 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (arrstring != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            float f11;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (n2 < 0) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                this.an = 0.2f;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            n2 = (f11 = this.an - 0.81f) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block287;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (n2 > 0) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            this.an = 0.8f;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    n2 = arrstring2[0].equals("ofMipmapType") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block289;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (n2 == 0) break block290;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block289;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    this.b6 = Integer.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    this.b6 = fU.a(this.b6, 0, 3);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            n2 = arrstring2[0].equals("ofOcclusionFancy") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block291;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (n2 == 0) break block292;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block291;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            this.bF = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    n2 = arrstring2[0].equals("ofSmoothFps") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block293;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (n2 == 0) break block294;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block293;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    this.be = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            n2 = arrstring2[0].equals("ofSmoothWorld") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block295;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (n2 == 0) break block296;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block295;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            this.R = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    n2 = arrstring2[0].equals("ofAoLevel") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block297;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (n2 == 0) break block298;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block297;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    this.aG = Float.valueOf(arrstring2[1]).floatValue();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    this.aG = fU.a(this.aG, 0.0f, 1.0f);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            n2 = arrstring2[0].equals("ofClouds") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block299;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (n2 == 0) break block300;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block299;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            this.o = Integer.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            this.o = fU.a(this.o, 0, 3);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            this.b();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    n2 = arrstring2[0].equals("ofCloudsHeight") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block301;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (n2 == 0) break block302;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block301;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    this.ak = Float.valueOf(arrstring2[1]).floatValue();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    this.ak = fU.a(this.ak, 0.0f, 1.0f);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            n2 = arrstring2[0].equals("ofTrees") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block303;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (n2 == 0) break block304;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block303;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            this.D = Integer.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            this.D = net.minecraft.client.l.c.b(this.D, U);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    n2 = arrstring2[0].equals("ofDroppedItems") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block305;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (n2 == 0) break block306;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block305;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    this.a9 = Integer.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    this.a9 = fU.a(this.a9, 0, 2);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            n2 = arrstring2[0].equals("ofRain") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block307;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (n2 == 0) break block308;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block307;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            this.af = Integer.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            this.af = fU.a(this.af, 0, 3);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    n2 = arrstring2[0].equals("ofAnimatedWater") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block309;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (n2 == 0) break block310;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block309;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    this.bV = Integer.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    this.bV = fU.a(this.bV, 0, 2);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            n2 = arrstring2[0].equals("ofAnimatedLava") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block311;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (n2 == 0) break block312;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block311;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            this.ce = Integer.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            this.ce = fU.a(this.ce, 0, 2);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    n2 = arrstring2[0].equals("ofAnimatedFire") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block313;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (n2 == 0) break block314;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block313;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    this.Z = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                            n2 = arrstring2[0].equals("ofAnimatedPortal") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block315;
                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (n2 == 0) break block316;
                                                                                                                                                                                                                                                                                                                                                                                                                                                        n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block315;
                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                            this.bs = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                    n2 = arrstring2[0].equals("ofAnimatedRedstone") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block317;
                                                                                                                                                                                                                                                                                                                                                                                                                                                if (n2 == 0) break block318;
                                                                                                                                                                                                                                                                                                                                                                                                                                                n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block317;
                                                                                                                                                                                                                                                                                                                                                                                                                                                if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    this.au = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                            n2 = arrstring2[0].equals("ofAnimatedExplosion") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block319;
                                                                                                                                                                                                                                                                                                                                                                                                                                        if (n2 == 0) break block320;
                                                                                                                                                                                                                                                                                                                                                                                                                                        n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block319;
                                                                                                                                                                                                                                                                                                                                                                                                                                        if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                                                                                                                            this.ap = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                    n2 = arrstring2[0].equals("ofAnimatedFlame") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block321;
                                                                                                                                                                                                                                                                                                                                                                                                                                if (n2 == 0) break block322;
                                                                                                                                                                                                                                                                                                                                                                                                                                n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block321;
                                                                                                                                                                                                                                                                                                                                                                                                                                if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                                                                                                                    this.p = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                            n2 = arrstring2[0].equals("ofAnimatedSmoke") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block323;
                                                                                                                                                                                                                                                                                                                                                                                                                        if (n2 == 0) break block324;
                                                                                                                                                                                                                                                                                                                                                                                                                        n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block323;
                                                                                                                                                                                                                                                                                                                                                                                                                        if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                                                                                                            this.am = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                    n2 = arrstring2[0].equals("ofVoidParticles") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block325;
                                                                                                                                                                                                                                                                                                                                                                                                                if (n2 == 0) break block326;
                                                                                                                                                                                                                                                                                                                                                                                                                n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block325;
                                                                                                                                                                                                                                                                                                                                                                                                                if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                                                                                                    this.z = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                            n2 = arrstring2[0].equals("ofWaterParticles") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block327;
                                                                                                                                                                                                                                                                                                                                                                                                        if (n2 == 0) break block328;
                                                                                                                                                                                                                                                                                                                                                                                                        n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block327;
                                                                                                                                                                                                                                                                                                                                                                                                        if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                                                                                            this.bQ = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    n2 = arrstring2[0].equals("ofPortalParticles") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block329;
                                                                                                                                                                                                                                                                                                                                                                                                if (n2 == 0) break block330;
                                                                                                                                                                                                                                                                                                                                                                                                n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block329;
                                                                                                                                                                                                                                                                                                                                                                                                if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                                                                                    this.bh = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                            n2 = arrstring2[0].equals("ofPotionParticles") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block331;
                                                                                                                                                                                                                                                                                                                                                                                        if (n2 == 0) break block332;
                                                                                                                                                                                                                                                                                                                                                                                        n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block331;
                                                                                                                                                                                                                                                                                                                                                                                        if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                                                                            this.aB = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                    n2 = arrstring2[0].equals("ofFireworkParticles") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block333;
                                                                                                                                                                                                                                                                                                                                                                                if (n2 == 0) break block334;
                                                                                                                                                                                                                                                                                                                                                                                n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block333;
                                                                                                                                                                                                                                                                                                                                                                                if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                                                                    this.bw = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                            n2 = arrstring2[0].equals("ofDrippingWaterLava") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block335;
                                                                                                                                                                                                                                                                                                                                                                        if (n2 == 0) break block336;
                                                                                                                                                                                                                                                                                                                                                                        n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block335;
                                                                                                                                                                                                                                                                                                                                                                        if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                                                            this.by = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                    n2 = arrstring2[0].equals("ofAnimatedTerrain") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block337;
                                                                                                                                                                                                                                                                                                                                                                if (n2 == 0) break block338;
                                                                                                                                                                                                                                                                                                                                                                n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block337;
                                                                                                                                                                                                                                                                                                                                                                if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                                                    this.a1 = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                            n2 = arrstring2[0].equals("ofAnimatedTextures") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block339;
                                                                                                                                                                                                                                                                                                                                                        if (n2 == 0) break block340;
                                                                                                                                                                                                                                                                                                                                                        n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block339;
                                                                                                                                                                                                                                                                                                                                                        if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                                            this.s = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                    n2 = arrstring2[0].equals("ofRainSplash") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block341;
                                                                                                                                                                                                                                                                                                                                                if (n2 == 0) break block342;
                                                                                                                                                                                                                                                                                                                                                n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block341;
                                                                                                                                                                                                                                                                                                                                                if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                                    this.aH = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                            n2 = arrstring2[0].equals("ofLagometer") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block343;
                                                                                                                                                                                                                                                                                                                                        if (n2 == 0) break block344;
                                                                                                                                                                                                                                                                                                                                        n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block343;
                                                                                                                                                                                                                                                                                                                                        if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                            this.V = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                    n2 = arrstring2[0].equals("ofShowFps") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block345;
                                                                                                                                                                                                                                                                                                                                if (n2 == 0) break block346;
                                                                                                                                                                                                                                                                                                                                n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block345;
                                                                                                                                                                                                                                                                                                                                if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                                    this.a5 = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            n2 = arrstring2[0].equals("ofAutoSaveTicks") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block347;
                                                                                                                                                                                                                                                                                                                        if (n2 == 0) break block348;
                                                                                                                                                                                                                                                                                                                        n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block347;
                                                                                                                                                                                                                                                                                                                        if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                            this.az = Integer.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                            this.az = fU.a(this.az, 40, 40000);
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                    n2 = arrstring2[0].equals("ofBetterGrass") ? 1 : 0;
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block349;
                                                                                                                                                                                                                                                                                                                if (n2 == 0) break block350;
                                                                                                                                                                                                                                                                                                                n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                                if (arrstring == null) break block349;
                                                                                                                                                                                                                                                                                                                if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                                    this.e = Integer.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                                    this.e = fU.a(this.e, 1, 3);
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                            n2 = arrstring2[0].equals("ofConnectedTextures") ? 1 : 0;
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block351;
                                                                                                                                                                                                                                                                                                        if (n2 == 0) break block352;
                                                                                                                                                                                                                                                                                                        n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                        if (arrstring == null) break block351;
                                                                                                                                                                                                                                                                                                        if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                            this.J = Integer.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                            this.J = fU.a(this.J, 1, 3);
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                    n2 = arrstring2[0].equals("ofWeather") ? 1 : 0;
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                if (arrstring == null) break block353;
                                                                                                                                                                                                                                                                                                if (n2 == 0) break block354;
                                                                                                                                                                                                                                                                                                n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                                if (arrstring == null) break block353;
                                                                                                                                                                                                                                                                                                if (n2 >= 2) {
                                                                                                                                                                                                                                                                                                    this.u = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            n2 = arrstring2[0].equals("ofSky") ? 1 : 0;
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        if (arrstring == null) break block355;
                                                                                                                                                                                                                                                                                        if (n2 == 0) break block356;
                                                                                                                                                                                                                                                                                        n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                        if (arrstring == null) break block355;
                                                                                                                                                                                                                                                                                        if (n2 >= 2) {
                                                                                                                                                                                                                                                                                            this.M = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    n2 = arrstring2[0].equals("ofStars") ? 1 : 0;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                if (arrstring == null) break block357;
                                                                                                                                                                                                                                                                                if (n2 == 0) break block358;
                                                                                                                                                                                                                                                                                n2 = arrstring2.length;
                                                                                                                                                                                                                                                                                if (arrstring == null) break block357;
                                                                                                                                                                                                                                                                                if (n2 >= 2) {
                                                                                                                                                                                                                                                                                    this.cd = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            n2 = arrstring2[0].equals("ofSunMoon") ? 1 : 0;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        if (arrstring == null) break block359;
                                                                                                                                                                                                                                                                        if (n2 == 0) break block360;
                                                                                                                                                                                                                                                                        n2 = arrstring2.length;
                                                                                                                                                                                                                                                                        if (arrstring == null) break block359;
                                                                                                                                                                                                                                                                        if (n2 >= 2) {
                                                                                                                                                                                                                                                                            this.I = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    n2 = arrstring2[0].equals("ofVignette") ? 1 : 0;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                if (arrstring == null) break block361;
                                                                                                                                                                                                                                                                if (n2 == 0) break block362;
                                                                                                                                                                                                                                                                n2 = arrstring2.length;
                                                                                                                                                                                                                                                                if (arrstring == null) break block361;
                                                                                                                                                                                                                                                                if (n2 >= 2) {
                                                                                                                                                                                                                                                                    this.bp = Integer.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                                    this.bp = fU.a(this.bp, 0, 2);
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            n2 = arrstring2[0].equals("ofChunkUpdates") ? 1 : 0;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        if (arrstring == null) break block363;
                                                                                                                                                                                                                                                        if (n2 == 0) break block364;
                                                                                                                                                                                                                                                        n2 = arrstring2.length;
                                                                                                                                                                                                                                                        if (arrstring == null) break block363;
                                                                                                                                                                                                                                                        if (n2 >= 2) {
                                                                                                                                                                                                                                                            this.Y = Integer.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                            this.Y = fU.a(this.Y, 1, 5);
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    n2 = arrstring2[0].equals("ofChunkUpdatesDynamic") ? 1 : 0;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                if (arrstring == null) break block365;
                                                                                                                                                                                                                                                if (n2 == 0) break block366;
                                                                                                                                                                                                                                                n2 = arrstring2.length;
                                                                                                                                                                                                                                                if (arrstring == null) break block365;
                                                                                                                                                                                                                                                if (n2 >= 2) {
                                                                                                                                                                                                                                                    this.aE = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            n2 = arrstring2[0].equals("ofTime") ? 1 : 0;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        if (arrstring == null) break block367;
                                                                                                                                                                                                                                        if (n2 == 0) break block368;
                                                                                                                                                                                                                                        n2 = arrstring2.length;
                                                                                                                                                                                                                                        if (arrstring == null) break block367;
                                                                                                                                                                                                                                        if (n2 >= 2) {
                                                                                                                                                                                                                                            this.b = Integer.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                            this.b = fU.a(this.b, 0, 2);
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    n2 = arrstring2[0].equals("ofClearWater") ? 1 : 0;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                if (arrstring == null) break block369;
                                                                                                                                                                                                                                if (n2 == 0) break block370;
                                                                                                                                                                                                                                n2 = arrstring2.length;
                                                                                                                                                                                                                                if (arrstring == null) break block369;
                                                                                                                                                                                                                                if (n2 >= 2) {
                                                                                                                                                                                                                                    this.aY = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                                                                                    this.n();
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            n2 = arrstring2[0].equals("ofAaLevel") ? 1 : 0;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        if (arrstring == null) break block371;
                                                                                                                                                                                                                        if (n2 == 0) break block372;
                                                                                                                                                                                                                        n2 = arrstring2.length;
                                                                                                                                                                                                                        if (arrstring == null) break block371;
                                                                                                                                                                                                                        if (n2 >= 2) {
                                                                                                                                                                                                                            this.a = Integer.valueOf(arrstring2[1]);
                                                                                                                                                                                                                            this.a = fU.a(this.a, 0, 16);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    n2 = arrstring2[0].equals("ofAfLevel") ? 1 : 0;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (arrstring == null) break block373;
                                                                                                                                                                                                                if (n2 == 0) break block374;
                                                                                                                                                                                                                n2 = arrstring2.length;
                                                                                                                                                                                                                if (arrstring == null) break block373;
                                                                                                                                                                                                                if (n2 >= 2) {
                                                                                                                                                                                                                    this.n = Integer.valueOf(arrstring2[1]);
                                                                                                                                                                                                                    this.n = fU.a(this.n, 1, 16);
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            n2 = arrstring2[0].equals("ofProfiler") ? 1 : 0;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        if (arrstring == null) break block375;
                                                                                                                                                                                                        if (n2 == 0) break block376;
                                                                                                                                                                                                        n2 = arrstring2.length;
                                                                                                                                                                                                        if (arrstring == null) break block375;
                                                                                                                                                                                                        if (n2 >= 2) {
                                                                                                                                                                                                            this.ca = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    n2 = arrstring2[0].equals("ofBetterSnow") ? 1 : 0;
                                                                                                                                                                                                }
                                                                                                                                                                                                if (arrstring == null) break block377;
                                                                                                                                                                                                if (n2 == 0) break block378;
                                                                                                                                                                                                n2 = arrstring2.length;
                                                                                                                                                                                                if (arrstring == null) break block377;
                                                                                                                                                                                                if (n2 >= 2) {
                                                                                                                                                                                                    this.bj = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            n2 = arrstring2[0].equals("ofSwampColors") ? 1 : 0;
                                                                                                                                                                                        }
                                                                                                                                                                                        if (arrstring == null) break block379;
                                                                                                                                                                                        if (n2 == 0) break block380;
                                                                                                                                                                                        n2 = arrstring2.length;
                                                                                                                                                                                        if (arrstring == null) break block379;
                                                                                                                                                                                        if (n2 >= 2) {
                                                                                                                                                                                            this.a3 = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    n2 = arrstring2[0].equals("ofRandomMobs") ? 1 : 0;
                                                                                                                                                                                }
                                                                                                                                                                                if (arrstring == null) break block381;
                                                                                                                                                                                if (n2 == 0) break block382;
                                                                                                                                                                                n2 = arrstring2.length;
                                                                                                                                                                                if (arrstring == null) break block381;
                                                                                                                                                                                if (n2 >= 2) {
                                                                                                                                                                                    this.S = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            n2 = arrstring2[0].equals("ofSmoothBiomes") ? 1 : 0;
                                                                                                                                                                        }
                                                                                                                                                                        if (arrstring == null) break block383;
                                                                                                                                                                        if (n2 == 0) break block384;
                                                                                                                                                                        n2 = arrstring2.length;
                                                                                                                                                                        if (arrstring == null) break block383;
                                                                                                                                                                        if (n2 >= 2) {
                                                                                                                                                                            this.al = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    n2 = arrstring2[0].equals("ofCustomFonts") ? 1 : 0;
                                                                                                                                                                }
                                                                                                                                                                if (arrstring == null) break block385;
                                                                                                                                                                if (n2 == 0) break block386;
                                                                                                                                                                n2 = arrstring2.length;
                                                                                                                                                                if (arrstring == null) break block385;
                                                                                                                                                                if (n2 >= 2) {
                                                                                                                                                                    this.N = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            n2 = arrstring2[0].equals("ofCustomColors") ? 1 : 0;
                                                                                                                                                        }
                                                                                                                                                        if (arrstring == null) break block387;
                                                                                                                                                        if (n2 == 0) break block388;
                                                                                                                                                        n2 = arrstring2.length;
                                                                                                                                                        if (arrstring == null) break block387;
                                                                                                                                                        if (n2 >= 2) {
                                                                                                                                                            this.aX = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    n2 = arrstring2[0].equals("ofCustomItems") ? 1 : 0;
                                                                                                                                                }
                                                                                                                                                if (arrstring == null) break block389;
                                                                                                                                                if (n2 == 0) break block390;
                                                                                                                                                n2 = arrstring2.length;
                                                                                                                                                if (arrstring == null) break block389;
                                                                                                                                                if (n2 >= 2) {
                                                                                                                                                    this.bT = Boolean.valueOf(arrstring2[1]);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            n2 = arrstring2[0].equals("ofCustomSky") ? 1 : 0;
                                                                                                                                        }
                                                                                                                                        if (arrstring == null) break block391;
                                                                                                                                        if (n2 == 0) break block392;
                                                                                                                                        n2 = arrstring2.length;
                                                                                                                                        if (arrstring == null) break block391;
                                                                                                                                        if (n2 >= 2) {
                                                                                                                                            this.aF = Boolean.valueOf(arrstring2[1]);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    n2 = arrstring2[0].equals("ofShowCapes") ? 1 : 0;
                                                                                                                                }
                                                                                                                                if (arrstring == null) break block393;
                                                                                                                                if (n2 == 0) break block394;
                                                                                                                                n2 = arrstring2.length;
                                                                                                                                if (arrstring == null) break block393;
                                                                                                                                if (n2 >= 2) {
                                                                                                                                    this.bi = Boolean.valueOf(arrstring2[1]);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            n2 = arrstring2[0].equals("ofNaturalTextures") ? 1 : 0;
                                                                                                                        }
                                                                                                                        if (arrstring == null) break block395;
                                                                                                                        if (n2 == 0) break block396;
                                                                                                                        n2 = arrstring2.length;
                                                                                                                        if (arrstring == null) break block395;
                                                                                                                        if (n2 >= 2) {
                                                                                                                            this.a7 = Boolean.valueOf(arrstring2[1]);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    n2 = arrstring2[0].equals("ofLazyChunkLoading") ? 1 : 0;
                                                                                                                }
                                                                                                                if (arrstring == null) break block397;
                                                                                                                if (n2 == 0) break block398;
                                                                                                                n2 = arrstring2.length;
                                                                                                                if (arrstring == null) break block397;
                                                                                                                if (n2 >= 2) {
                                                                                                                    this.E = Boolean.valueOf(arrstring2[1]);
                                                                                                                }
                                                                                                            }
                                                                                                            n2 = arrstring2[0].equals("ofDynamicFov") ? 1 : 0;
                                                                                                        }
                                                                                                        if (arrstring == null) break block399;
                                                                                                        if (n2 == 0) break block400;
                                                                                                        n2 = arrstring2.length;
                                                                                                        if (arrstring == null) break block399;
                                                                                                        if (n2 >= 2) {
                                                                                                            this.aJ = Boolean.valueOf(arrstring2[1]);
                                                                                                        }
                                                                                                    }
                                                                                                    n2 = arrstring2[0].equals("ofAlternateBlocks") ? 1 : 0;
                                                                                                }
                                                                                                if (arrstring == null) break block401;
                                                                                                if (n2 == 0) break block402;
                                                                                                n2 = arrstring2.length;
                                                                                                if (arrstring == null) break block401;
                                                                                                if (n2 >= 2) {
                                                                                                    this.aI = Boolean.valueOf(arrstring2[1]);
                                                                                                }
                                                                                            }
                                                                                            n2 = arrstring2[0].equals("ofDynamicLights") ? 1 : 0;
                                                                                        }
                                                                                        if (arrstring == null) break block403;
                                                                                        if (n2 == 0) break block404;
                                                                                        n2 = arrstring2.length;
                                                                                        if (arrstring == null) break block403;
                                                                                        if (n2 >= 2) {
                                                                                            this.aN = Integer.valueOf(arrstring2[1]);
                                                                                            this.aN = net.minecraft.client.l.c.b(this.aN, x);
                                                                                        }
                                                                                    }
                                                                                    n2 = arrstring2[0].equals("ofScreenshotSize") ? 1 : 0;
                                                                                }
                                                                                if (arrstring == null) break block405;
                                                                                if (n2 == 0) break block406;
                                                                                n2 = arrstring2.length;
                                                                                if (arrstring == null) break block405;
                                                                                if (n2 >= 2) {
                                                                                    this.b2 = Integer.valueOf(arrstring2[1]);
                                                                                    this.b2 = fU.a(this.b2, 1, 4);
                                                                                }
                                                                            }
                                                                            n2 = arrstring2[0].equals("ofCustomEntityModels") ? 1 : 0;
                                                                        }
                                                                        if (arrstring == null) break block407;
                                                                        if (n2 == 0) break block408;
                                                                        n2 = arrstring2.length;
                                                                        if (arrstring == null) break block407;
                                                                        if (n2 >= 2) {
                                                                            this.h = Boolean.valueOf(arrstring2[1]);
                                                                        }
                                                                    }
                                                                    n2 = arrstring2[0].equals("ofCustomGuis") ? 1 : 0;
                                                                }
                                                                if (arrstring == null) break block409;
                                                                if (n2 == 0) break block410;
                                                                n2 = arrstring2.length;
                                                                if (arrstring == null) break block409;
                                                                if (n2 >= 2) {
                                                                    this.aO = Boolean.valueOf(arrstring2[1]);
                                                                }
                                                            }
                                                            n2 = arrstring2[0].equals("ofFullscreenMode") ? 1 : 0;
                                                        }
                                                        if (arrstring == null) break block411;
                                                        if (n2 == 0) break block412;
                                                        n2 = arrstring2.length;
                                                        if (arrstring == null) break block411;
                                                        if (n2 >= 2) {
                                                            this.l = arrstring2[1];
                                                        }
                                                    }
                                                    n2 = arrstring2[0].equals("ofFastMath") ? 1 : 0;
                                                }
                                                if (arrstring == null) break block413;
                                                if (n2 == 0) break block414;
                                                n2 = arrstring2.length;
                                                if (arrstring == null) break block413;
                                                if (n2 >= 2) {
                                                    net.minecraft.k.h.j = this.aa = Boolean.valueOf(arrstring2[1]).booleanValue();
                                                }
                                            }
                                            n2 = arrstring2[0].equals("ofFastRender") ? 1 : 0;
                                        }
                                        if (arrstring == null) break block415;
                                        if (n2 == 0) break block416;
                                        n2 = arrstring2.length;
                                        if (arrstring == null) break block415;
                                        if (n2 >= 2) {
                                            this.as = Boolean.valueOf(arrstring2[1]);
                                        }
                                    }
                                    n2 = arrstring2[0].equals("ofTranslucentBlocks") ? 1 : 0;
                                }
                                if (arrstring == null) break block417;
                                if (n2 == 0) break block418;
                                n2 = arrstring2.length;
                                if (arrstring == null) break block417;
                                if (n2 >= 2) {
                                    this.H = Integer.valueOf(arrstring2[1]);
                                    this.H = fU.a(this.H, 0, 2);
                                }
                            }
                            n2 = arrstring2[0].equals("key_" + this.ax.f()) ? 1 : 0;
                        }
                        if (n2 == 0) continue;
                        this.ax.a(Integer.parseInt(arrstring2[1]));
                    }
                    catch (Exception exception) {
                        fU.b("Skipping bad option: " + string);
                        exception.printStackTrace();
                        if (arrstring != null) continue;
                    }
                }
                net.minecraft.client.l.d.i();
                bufferedReader.close();
            }
            catch (Exception exception) {
                fU.h("Failed to load options");
                exception.printStackTrace();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void b() {
        block10: {
            c c10;
            int n2;
            String[] arrstring;
            block9: {
                arrstring = net.minecraft.client.l.c.m();
                n2 = this.o;
                if (arrstring == null) break block9;
                switch (n2) {
                    case 1: {
                        this.bn = 1;
                        if (arrstring != null) return;
                    }
                    case 2: {
                        this.bn = 2;
                        if (arrstring != null) return;
                    }
                    case 3: {
                        this.bn = 0;
                        if (arrstring != null) return;
                    }
                }
                c10 = this;
                if (arrstring == null) break block10;
                n2 = c10.aC ? 1 : 0;
            }
            if (n2 != 0) {
                this.bn = 2;
                if (arrstring != null) return;
            }
            c10 = this;
        }
        c10.bn = 1;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void e() {
        block23: {
            Object object;
            String[] arrstring;
            block26: {
                aI aI2;
                block27: {
                    Object object2;
                    block25: {
                        arrstring = net.minecraft.client.l.c.m();
                        object2 = cq.bw;
                        if (arrstring == null) break block25;
                        if (!((aI)object2).c()) break block26;
                        object2 = cq.d(cq.cm, new Object[0]);
                    }
                    object = object2;
                    aI2 = object;
                    if (arrstring == null) break block27;
                    if (aI2 == null) break block26;
                    aI2 = object;
                }
                if (cq.g(aI2, cq.cp, new Object[0])) {
                    return;
                }
            }
            object = null;
            try {
                object = new PrintWriter(new OutputStreamWriter((OutputStream)new FileOutputStream(this.ac), StandardCharsets.UTF_8));
                ((PrintWriter)object).println("version:1343");
                ((PrintWriter)object).println("invertYMouse:" + this.B);
                ((PrintWriter)object).println("mouseSensitivity:" + this.bv);
                ((PrintWriter)object).println("fov:" + (this.bR - 70.0f) / 40.0f);
                ((PrintWriter)object).println("gamma:" + this.aj);
                ((PrintWriter)object).println("saturation:" + this.bS);
                ((PrintWriter)object).println("renderDistance:" + this.bf);
                ((PrintWriter)object).println("guiScale:" + this.b7);
                ((PrintWriter)object).println("particles:" + this.bC);
                ((PrintWriter)object).println("bobView:" + this.X);
                ((PrintWriter)object).println("anaglyph3d:" + this.aD);
                ((PrintWriter)object).println("maxFps:" + this.bo);
                ((PrintWriter)object).println("fboEnable:" + this.bt);
                ((PrintWriter)object).println("difficulty:" + this.bH.a());
                ((PrintWriter)object).println("fancyGraphics:" + this.aC);
                ((PrintWriter)object).println("ao:" + this.A);
                if (arrstring != null) {
                    switch (this.bn) {
                        case 0: {
                            ((PrintWriter)object).println("renderClouds:false");
                            if (arrstring != null) break;
                        }
                        case 1: {
                            ((PrintWriter)object).println("renderClouds:fast");
                            if (arrstring != null) break;
                        }
                        case 2: {
                            ((PrintWriter)object).println("renderClouds:true");
                            break;
                        }
                    }
                    ((PrintWriter)object).println("resourcePacks:" + k.toJson(this.bJ));
                    ((PrintWriter)object).println("incompatibleResourcePacks:" + k.toJson(this.T));
                    ((PrintWriter)object).println("lastServer:" + this.b8);
                    ((PrintWriter)object).println("lang:" + this.bM);
                    ((PrintWriter)object).println("chatVisibility:" + this.bd.b());
                    ((PrintWriter)object).println("chatColors:" + this.b1);
                    ((PrintWriter)object).println("chatLinks:" + this.bg);
                    ((PrintWriter)object).println("chatLinksPrompt:" + this.ae);
                    ((PrintWriter)object).println("chatOpacity:" + this.b_);
                    ((PrintWriter)object).println("snooperEnabled:" + this.a8);
                    ((PrintWriter)object).println("fullscreen:" + this.b5);
                    ((PrintWriter)object).println("enableVsync:" + this.br);
                    ((PrintWriter)object).println("useVbo:" + this.bz);
                    ((PrintWriter)object).println("hideServerAddress:" + this.ar);
                    ((PrintWriter)object).println("advancedItemTooltips:" + this.aP);
                    ((PrintWriter)object).println("pauseOnLostFocus:" + this.ay);
                    ((PrintWriter)object).println("touchscreen:" + this.aZ);
                    ((PrintWriter)object).println("overrideWidth:" + this.a2);
                    ((PrintWriter)object).println("overrideHeight:" + this.g);
                    ((PrintWriter)object).println("heldItemTooltips:" + this.bP);
                    ((PrintWriter)object).println("chatHeightFocused:" + this.aQ);
                    ((PrintWriter)object).println("chatHeightUnfocused:" + this.at);
                    ((PrintWriter)object).println("chatScale:" + this.ah);
                    ((PrintWriter)object).println("chatWidth:" + this.m);
                    ((PrintWriter)object).println("mipmapLevels:" + this.c);
                    ((PrintWriter)object).println("forceUnicodeFont:" + this.bZ);
                    ((PrintWriter)object).println("reducedDebugInfo:" + this.aw);
                    ((PrintWriter)object).println("useNativeTransport:" + this.aA);
                    ((PrintWriter)object).println("entityShadows:" + this.bN);
                }
                StringBuilder stringBuilder = new StringBuilder();
                String string = "mainHand:";
                if (arrstring != null) {
                    stringBuilder = stringBuilder.append(string);
                    string = this.aR == net.minecraft.ar.b.LEFT ? "left" : "right";
                }
                ((PrintWriter)object).println(stringBuilder.append(string).toString());
                ((PrintWriter)object).println("attackIndicator:" + this.bm);
                ((PrintWriter)object).println("showSubtitles:" + this.a4);
                ((PrintWriter)object).println("realmsNotifications:" + this.ai);
                ((PrintWriter)object).println("enableWeakAttacks:" + this.aV);
                ((PrintWriter)object).println("autoJump:" + this.ag);
                ((PrintWriter)object).println("narrator:" + this.w);
                ((PrintWriter)object).println("tutorialStep:" + this.bB.a());
                for (d d10 : this.ad) {
                    if (arrstring != null) {
                        if (cq.cL.b()) {
                            Object object3;
                            String string2 = "key_" + d10.f() + ":" + d10.e();
                            Object object4 = cq.d(d10, cq.cL, new Object[0]);
                            ((PrintWriter)object).println(object4 != (object3 = cq.a(cq.bD)) ? string2 + ":" + object4 : string2);
                            if (arrstring != null) continue;
                        }
                        ((PrintWriter)object).println("key_" + d10.f() + ":" + d10.e());
                        if (arrstring != null) continue;
                    }
                    break block23;
                }
                for (ay ay2 : net.minecraft.ar.ay.values()) {
                    ((PrintWriter)object).println("soundCategory_" + ay2.b() + ":" + this.a(ay2));
                    if (arrstring != null) {
                        if (arrstring != null) continue;
                    }
                    break block23;
                }
                for (net.minecraft.i.a a10 : net.minecraft.i.a.values()) {
                    ((PrintWriter)object).println("modelPart_" + a10.c() + ":" + this.bq.contains((Object)a10));
                    if (arrstring != null && arrstring != null) continue;
                    break;
                }
            }
            catch (Exception exception) {
                f.error("Failed to save options", (Throwable)exception);
            }
            finally {
                IOUtils.closeQuietly((Writer)object);
            }
            this.h();
            this.k();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private float a(String string) {
        String string2;
        block6: {
            boolean bl2;
            block5: {
                String[] arrstring = net.minecraft.client.l.c.m();
                bl2 = "true".equals(string);
                if (arrstring == null) break block5;
                if (bl2) {
                    return 1.0f;
                }
                string2 = "false";
                if (arrstring == null) break block6;
                bl2 = string2.equals(string);
            }
            if (bl2) {
                return 0.0f;
            }
            string2 = string;
        }
        float f10 = Float.parseFloat(string2);
        return f10;
    }

    private String d(f f10) {
        String[] arrstring;
        String string;
        block211: {
            String string2;
            block210: {
                string = net.minecraft.client.D.h.a(f10.d(), new Object[0]) + ": ";
                arrstring = net.minecraft.client.l.c.m();
                string2 = string;
                if (arrstring == null) break block210;
                if (string2 != null) break block211;
                string2 = f10.d();
            }
            string = string2;
        }
        f f11 = f10;
        f f12 = net.minecraft.client.l.f.RENDER_DISTANCE;
        if (arrstring != null) {
            if (f11 == f12) {
                int n2 = (int)this.b(f10);
                String string3 = net.minecraft.client.D.h.a("of.options.renderDistance.tiny", new Object[0]);
                int n3 = 2;
                int n4 = n2;
                int n5 = 4;
                if (arrstring != null) {
                    if (n4 >= n5) {
                        string3 = net.minecraft.client.D.h.a("of.options.renderDistance.short", new Object[0]);
                        n3 = 4;
                    }
                    n4 = n2;
                    n5 = 8;
                }
                if (arrstring != null) {
                    if (n4 >= n5) {
                        string3 = net.minecraft.client.D.h.a("of.options.renderDistance.normal", new Object[0]);
                        n3 = 8;
                    }
                    n4 = n2;
                    n5 = 16;
                }
                if (arrstring != null) {
                    if (n4 >= n5) {
                        string3 = net.minecraft.client.D.h.a("of.options.renderDistance.far", new Object[0]);
                        n3 = 16;
                    }
                    n4 = n2;
                    n5 = 32;
                }
                if (arrstring != null) {
                    if (n4 >= n5) {
                        string3 = gl.a("of.options.renderDistance.extreme");
                        n3 = 32;
                    }
                    n4 = this.bf;
                    n5 = n3;
                }
                int n6 = n4 - n5;
                String string4 = string3;
                if (n6 > 0) {
                    string4 = string3 + "+";
                }
                return string + n2 + " " + string4 + "";
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.FOG_FANCY;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                switch (this.i) {
                    case 1: {
                        return string + gl.a();
                    }
                    case 2: {
                        return string + gl.c();
                    }
                    case 3: {
                        return string + gl.f();
                    }
                }
                return string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.FOG_START;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return string + this.an;
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.MIPMAP_TYPE;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                switch (this.b6) {
                    case 0: {
                        return string + gl.a("of.options.mipmap.nearest");
                    }
                    case 1: {
                        return string + gl.a("of.options.mipmap.linear");
                    }
                    case 2: {
                        return string + gl.a("of.options.mipmap.bilinear");
                    }
                    case 3: {
                        return string + gl.a("of.options.mipmap.trilinear");
                    }
                }
                return string + "of.options.mipmap.nearest";
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.SMOOTH_FPS;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.be ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.SMOOTH_WORLD;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.R ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.CLOUDS;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                switch (this.o) {
                    case 1: {
                        return string + gl.a();
                    }
                    case 2: {
                        return string + gl.c();
                    }
                    case 3: {
                        return string + gl.f();
                    }
                }
                return string + gl.b();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.TREES;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                switch (this.D) {
                    case 1: {
                        return string + gl.a();
                    }
                    case 2: {
                        return string + gl.c();
                    }
                    default: {
                        return string + gl.b();
                    }
                    case 4: 
                }
                return string + gl.a("of.general.smart");
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.DROPPED_ITEMS;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                switch (this.a9) {
                    case 1: {
                        return string + gl.a();
                    }
                    case 2: {
                        return string + gl.c();
                    }
                }
                return string + gl.b();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.RAIN;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                switch (this.af) {
                    case 1: {
                        return string + gl.a();
                    }
                    case 2: {
                        return string + gl.c();
                    }
                    case 3: {
                        return string + gl.f();
                    }
                }
                return string + gl.b();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.ANIMATED_WATER;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                switch (this.bV) {
                    case 1: {
                        return string + gl.a("of.options.animation.dynamic");
                    }
                    case 2: {
                        return string + gl.f();
                    }
                }
                return string + gl.e();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.ANIMATED_LAVA;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                switch (this.ce) {
                    case 1: {
                        return string + gl.a("of.options.animation.dynamic");
                    }
                    case 2: {
                        return string + gl.f();
                    }
                }
                return string + gl.e();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.ANIMATED_FIRE;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.Z ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.ANIMATED_PORTAL;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.bs ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.ANIMATED_REDSTONE;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.au ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.ANIMATED_EXPLOSION;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.ap ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.ANIMATED_FLAME;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.p ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.ANIMATED_SMOKE;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.am ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.VOID_PARTICLES;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.z ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.WATER_PARTICLES;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.bQ ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.PORTAL_PARTICLES;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.bh ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.POTION_PARTICLES;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.aB ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.FIREWORK_PARTICLES;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.bw ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.DRIPPING_WATER_LAVA;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.by ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.ANIMATED_TERRAIN;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.a1 ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.ANIMATED_TEXTURES;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.s ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.RAIN_SPLASH;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.aH ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.LAGOMETER;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.V ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.SHOW_FPS;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.a5 ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.AUTOSAVE_TICKS;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                int n7 = this.az;
                int n8 = 40;
                if (arrstring != null) {
                    if (n7 <= n8) {
                        return string + gl.a("of.options.save.default");
                    }
                    n7 = this.az;
                    n8 = 400;
                }
                if (arrstring != null) {
                    if (n7 <= n8) {
                        return string + gl.a("of.options.save.20s");
                    }
                    n7 = this.az;
                    n8 = 4000;
                }
                return n7 <= n8 ? string + gl.a("of.options.save.3min") : string + gl.a("of.options.save.30min");
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.BETTER_GRASS;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                switch (this.e) {
                    case 1: {
                        return string + gl.a();
                    }
                    case 2: {
                        return string + gl.c();
                    }
                }
                return string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.CONNECTED_TEXTURES;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                switch (this.J) {
                    case 1: {
                        return string + gl.a();
                    }
                    case 2: {
                        return string + gl.c();
                    }
                }
                return string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.WEATHER;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.u ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.SKY;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.M ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.STARS;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.cd ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.SUN_MOON;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.I ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.VIGNETTE;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                switch (this.bp) {
                    case 1: {
                        return string + gl.a();
                    }
                    case 2: {
                        return string + gl.c();
                    }
                }
                return string + gl.b();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.CHUNK_UPDATES;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return string + this.Y;
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.CHUNK_UPDATES_DYNAMIC;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.aE ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.TIME;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                int n9 = this.b;
                int n10 = 1;
                if (arrstring != null) {
                    if (n9 == n10) {
                        return string + gl.a("of.options.time.dayOnly");
                    }
                    n9 = this.b;
                    n10 = 2;
                }
                return n9 == n10 ? string + gl.a("of.options.time.nightOnly") : string + gl.b();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.CLEAR_WATER;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.aY ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.AA_LEVEL;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                String string5 = "";
                int n11 = this.a;
                if (arrstring != null) {
                    if (n11 != fU.ak()) {
                        string5 = " (" + gl.a("of.general.restart") + ")";
                    }
                    n11 = this.a;
                }
                return n11 == 0 ? string + gl.f() + string5 : string + this.a + string5;
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.AF_LEVEL;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.n == 1 ? string + gl.f() : string + this.n;
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.PROFILER;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.ca ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.BETTER_SNOW;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.bj ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.SWAMP_COLORS;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.a3 ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.RANDOM_MOBS;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.S ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.SMOOTH_BIOMES;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.al ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.CUSTOM_FONTS;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.N ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.CUSTOM_COLORS;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.aX ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.CUSTOM_SKY;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.aF ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.SHOW_CAPES;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.bi ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.CUSTOM_ITEMS;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.bT ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.NATURAL_TEXTURES;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.a7 ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.FAST_MATH;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.aa ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.FAST_RENDER;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.as ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.TRANSLUCENT_BLOCKS;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                int n12 = this.H;
                int n13 = 1;
                if (arrstring != null) {
                    if (n12 == n13) {
                        return string + gl.a();
                    }
                    n12 = this.H;
                    n13 = 2;
                }
                return n12 == n13 ? string + gl.c() : string + gl.b();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.LAZY_CHUNK_LOADING;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.E ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.DYNAMIC_FOV;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.aJ ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.ALTERNATE_BLOCKS;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.aI ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.DYNAMIC_LIGHTS;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                int n14 = net.minecraft.client.l.c.c(this.aN, x);
                return string + net.minecraft.client.l.c.a(K, n14);
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.SCREENSHOT_SIZE;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.b2 <= 1 ? string + gl.b() : string + this.b2 + "x";
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.CUSTOM_ENTITY_MODELS;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.h ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.CUSTOM_GUIS;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.aO ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.FULLSCREEN_MODE;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                String string6 = this.l;
                if (arrstring != null) {
                    string6 = string6.equals("Default") ? string + gl.b() : string + this.l;
                }
                return string6;
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.HELD_ITEM_TOOLTIPS;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.bP ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.ADVANCED_TOOLTIPS;
        }
        if (arrstring != null) {
            if (f11 == f12) {
                return this.aP ? string + gl.e() : string + gl.f();
            }
            f11 = f10;
            f12 = net.minecraft.client.l.f.FRAMERATE_LIMIT;
        }
        if (f11 == f12) {
            float f13 = this.b(f10);
            float f14 = f13 - 0.0f;
            float f15 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
            if (arrstring != null) {
                if (f15 == false) {
                    return string + gl.a("of.options.framerateLimit.vsync");
                }
                float f16 = f13 - net.minecraft.client.l.f.a(f10);
                f15 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
            }
            return f15 == false ? string + net.minecraft.client.D.h.a("options.framerateLimit.max", new Object[0]) : string + (int)f13 + " fps";
        }
        return null;
    }

    public void g() {
        Display.setVSyncEnabled((boolean)this.br);
    }

    private void d() {
        block3: {
            Object object;
            block4: {
                boolean bl2;
                block2: {
                    String[] arrstring = net.minecraft.client.l.c.m();
                    bl2 = cq.M.c();
                    if (arrstring == null) break block2;
                    if (!bl2) break block3;
                    object = cq.dD;
                    if (arrstring == null) break block4;
                    bl2 = ((ak)object).b();
                }
                if (!bl2) break block3;
                object = cq.a(cq.M);
            }
            Object object2 = object;
            cq.d(this.aW, cq.dD, object2);
            cq.d(this.C, cq.dD, object2);
            cq.d(this.O, cq.dD, object2);
            cq.d(this.G, cq.dD, object2);
            cq.d(this.v, cq.dD, object2);
            cq.d(this.bc, cq.dD, object2);
            cq.d(this.cc, cq.dD, object2);
            cq.d(this.bb, cq.dD, object2);
            cq.d(this.bI, cq.dD, object2);
            cq.d(this.aK, cq.dD, object2);
            cq.d(this.y, cq.dD, object2);
            cq.d(this.bO, cq.dD, object2);
            cq.d(this.aq, cq.dD, object2);
            cq.d(this.bA, cq.dD, object2);
        }
    }

    public void a(net.minecraft.i.a a10, boolean bl2) {
        block2: {
            boolean bl3;
            block3: {
                String[] arrstring = net.minecraft.client.l.c.m();
                bl3 = bl2;
                if (arrstring == null) break block2;
                if (!bl3) break block3;
                this.bq.add(a10);
                if (arrstring != null) break block2;
            }
            bl3 = this.bq.remove((Object)a10);
        }
        this.k();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String a(int n2) {
        String string;
        String[] arrstring = net.minecraft.client.l.c.m();
        int n3 = n2;
        if (arrstring != null) {
            if (n3 < 0) {
                switch (n2) {
                    case -100: {
                        return net.minecraft.client.D.h.a("key.mouse.left", new Object[0]);
                    }
                    case -99: {
                        return net.minecraft.client.D.h.a("key.mouse.right", new Object[0]);
                    }
                    case -98: {
                        return net.minecraft.client.D.h.a("key.mouse.middle", new Object[0]);
                    }
                }
                return net.minecraft.client.D.h.a("key.mouseButton", n2 + 101);
            }
            n3 = n2;
        }
        if (arrstring != null) {
            if (n3 >= 256) {
                string = String.format("%c", Character.valueOf((char)(n2 - 256))).toUpperCase();
                return string;
            }
            n3 = n2;
        }
        string = Keyboard.getKeyName((int)n3);
        return string;
    }

    private static int c(int n2, int[] arrn) {
        int n3;
        block3: {
            String[] arrstring = net.minecraft.client.l.c.m();
            for (int i2 = 0; i2 < arrn.length; ++i2) {
                n3 = arrn[i2];
                if (arrstring != null) {
                    int n4;
                    if (arrstring != null) {
                        if (n3 != n2) continue;
                        n4 = i2;
                    }
                    return n4;
                }
                break block3;
            }
            n3 = -1;
        }
        return n3;
    }

    public Set<net.minecraft.i.a> c() {
        return ImmutableSet.copyOf(this.bq);
    }

    public void h() {
        try {
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter((OutputStream)new FileOutputStream(this.q), StandardCharsets.UTF_8));
            printWriter.println("ofRenderDistanceChunks:" + this.bf);
            printWriter.println("ofFogType:" + this.i);
            printWriter.println("ofFogStart:" + this.an);
            printWriter.println("ofMipmapType:" + this.b6);
            printWriter.println("ofOcclusionFancy:" + this.bF);
            printWriter.println("ofSmoothFps:" + this.be);
            printWriter.println("ofSmoothWorld:" + this.R);
            printWriter.println("ofAoLevel:" + this.aG);
            printWriter.println("ofClouds:" + this.o);
            printWriter.println("ofCloudsHeight:" + this.ak);
            printWriter.println("ofTrees:" + this.D);
            printWriter.println("ofDroppedItems:" + this.a9);
            printWriter.println("ofRain:" + this.af);
            printWriter.println("ofAnimatedWater:" + this.bV);
            printWriter.println("ofAnimatedLava:" + this.ce);
            printWriter.println("ofAnimatedFire:" + this.Z);
            printWriter.println("ofAnimatedPortal:" + this.bs);
            printWriter.println("ofAnimatedRedstone:" + this.au);
            printWriter.println("ofAnimatedExplosion:" + this.ap);
            printWriter.println("ofAnimatedFlame:" + this.p);
            printWriter.println("ofAnimatedSmoke:" + this.am);
            printWriter.println("ofVoidParticles:" + this.z);
            printWriter.println("ofWaterParticles:" + this.bQ);
            printWriter.println("ofPortalParticles:" + this.bh);
            printWriter.println("ofPotionParticles:" + this.aB);
            printWriter.println("ofFireworkParticles:" + this.bw);
            printWriter.println("ofDrippingWaterLava:" + this.by);
            printWriter.println("ofAnimatedTerrain:" + this.a1);
            printWriter.println("ofAnimatedTextures:" + this.s);
            printWriter.println("ofRainSplash:" + this.aH);
            printWriter.println("ofLagometer:" + this.V);
            printWriter.println("ofShowFps:" + this.a5);
            printWriter.println("ofAutoSaveTicks:" + this.az);
            printWriter.println("ofBetterGrass:" + this.e);
            printWriter.println("ofConnectedTextures:" + this.J);
            printWriter.println("ofWeather:" + this.u);
            printWriter.println("ofSky:" + this.M);
            printWriter.println("ofStars:" + this.cd);
            printWriter.println("ofSunMoon:" + this.I);
            printWriter.println("ofVignette:" + this.bp);
            printWriter.println("ofChunkUpdates:" + this.Y);
            printWriter.println("ofChunkUpdatesDynamic:" + this.aE);
            printWriter.println("ofTime:" + this.b);
            printWriter.println("ofClearWater:" + this.aY);
            printWriter.println("ofAaLevel:" + this.a);
            printWriter.println("ofAfLevel:" + this.n);
            printWriter.println("ofProfiler:" + this.ca);
            printWriter.println("ofBetterSnow:" + this.bj);
            printWriter.println("ofSwampColors:" + this.a3);
            printWriter.println("ofRandomMobs:" + this.S);
            printWriter.println("ofSmoothBiomes:" + this.al);
            printWriter.println("ofCustomFonts:" + this.N);
            printWriter.println("ofCustomColors:" + this.aX);
            printWriter.println("ofCustomItems:" + this.bT);
            printWriter.println("ofCustomSky:" + this.aF);
            printWriter.println("ofShowCapes:" + this.bi);
            printWriter.println("ofNaturalTextures:" + this.a7);
            printWriter.println("ofLazyChunkLoading:" + this.E);
            printWriter.println("ofDynamicFov:" + this.aJ);
            printWriter.println("ofAlternateBlocks:" + this.aI);
            printWriter.println("ofDynamicLights:" + this.aN);
            printWriter.println("ofScreenshotSize:" + this.b2);
            printWriter.println("ofCustomEntityModels:" + this.h);
            printWriter.println("ofCustomGuis:" + this.aO);
            printWriter.println("ofFullscreenMode:" + this.l);
            printWriter.println("ofFastMath:" + this.aa);
            printWriter.println("ofFastRender:" + this.as);
            printWriter.println("ofTranslucentBlocks:" + this.H);
            printWriter.println("key_" + this.ax.f() + ":" + this.ax.e());
            printWriter.close();
        }
        catch (Exception exception) {
            fU.h("Failed to save options");
            exception.printStackTrace();
        }
    }

    public void j() {
        this.bf = 8;
        this.X = true;
        this.aD = false;
        this.bo = (int)net.minecraft.client.l.f.FRAMERATE_LIMIT.a();
        this.br = false;
        this.g();
        this.c = 4;
        this.aC = true;
        this.A = 2;
        this.bn = 2;
        this.bR = 70.0f;
        this.aj = 0.0f;
        this.b7 = 0;
        this.bC = 0;
        this.bP = true;
        this.bz = false;
        this.bZ = false;
        this.i = 1;
        this.an = 0.8f;
        this.b6 = 0;
        this.bF = false;
        this.be = false;
        fU.t();
        this.R = fU.G();
        this.E = fU.G();
        this.aa = false;
        this.as = false;
        this.H = 0;
        this.aJ = true;
        this.aI = true;
        this.aN = 3;
        this.b2 = 1;
        this.h = true;
        this.aO = true;
        this.aG = 1.0f;
        this.a = 0;
        this.n = 1;
        this.o = 0;
        this.ak = 0.0f;
        this.D = 0;
        this.af = 0;
        this.e = 3;
        this.az = 4000;
        this.V = false;
        this.a5 = false;
        this.ca = false;
        this.u = true;
        this.M = true;
        this.cd = true;
        this.I = true;
        this.bp = 0;
        this.Y = 1;
        this.aE = false;
        this.b = 0;
        this.aY = false;
        this.bj = false;
        this.l = "Default";
        this.a3 = true;
        this.S = true;
        this.al = true;
        this.N = true;
        this.aX = true;
        this.bT = true;
        this.aF = true;
        this.bi = true;
        this.J = 2;
        this.a7 = false;
        this.bV = 0;
        this.ce = 0;
        this.Z = true;
        this.bs = true;
        this.au = true;
        this.ap = true;
        this.p = true;
        this.am = true;
        this.z = true;
        this.bQ = true;
        this.aH = true;
        this.bh = true;
        this.aB = true;
        this.bw = true;
        this.by = true;
        this.a1 = true;
        this.s = true;
        cS.d(cS.di);
        cS.bl = 0;
        cS.d();
        cS.A();
        this.n();
        this.bk.af();
        this.e();
    }

    static {
        aU = 2;
        ao = 1;
        aS = 0;
        aL = 2;
        r = 1;
        b0 = 4;
        bx = 0;
        a0 = 3;
        F = "Default";
        f = LogManager.getLogger();
        k = new Gson();
        bD = new e();
        av = Splitter.on((char)':');
        bY = new String[]{"options.guiScale.auto", "options.guiScale.small", "options.guiScale.normal", "options.guiScale.large"};
        bL = new String[]{"options.particles.all", "options.particles.decreased", "options.particles.minimal"};
        W = new String[]{"options.ao.off", "options.ao.min", "options.ao.max"};
        bX = new String[]{"options.off", "options.clouds.fast", "options.clouds.fancy"};
        net.minecraft.client.l.c.b(new String[4]);
        bG = new String[]{"options.off", "options.attack.crosshair", "options.attack.hotbar"};
        a_ = new String[]{"options.narrator.off", "options.narrator.all", "options.narrator.chat", "options.narrator.system"};
        U = new int[]{0, 1, 4, 2};
        x = new int[]{3, 1, 2};
        K = new String[]{"options.off", "options.graphics.fast", "options.graphics.fancy"};
    }

    private void n() {
        c c10;
        block4: {
            block5: {
                String[] arrstring = net.minecraft.client.l.c.m();
                c10 = this;
                if (arrstring == null) break block4;
                if (!c10.bk.n()) break block5;
                c10 = this;
                if (arrstring == null) break block4;
                if (c10.bk.ae() != null) {
                    fU.c = true;
                }
            }
            c10 = this;
        }
        gR.a(c10, this.bk.e);
    }

    public void o() {
        block140: {
            String[] arrstring = net.minecraft.client.l.c.m();
            try {
                Object object;
                r r2;
                block139: {
                    c c10 = this;
                    if (arrstring != null) {
                        if (!c10.ac.exists()) {
                            return;
                        }
                        c10 = this;
                    }
                    c10.ab.clear();
                    List list = IOUtils.readLines((InputStream)new FileInputStream(this.ac), (Charset)StandardCharsets.UTF_8);
                    r2 = new r();
                    for (String string : list) {
                        try {
                            object = av.omitEmptyStrings().limit(2).split((CharSequence)string).iterator();
                            r2.a((String)object.next(), (String)object.next());
                            if (arrstring == null) break block139;
                        }
                        catch (Exception exception) {
                            f.warn("Skipping bad option: {}", (Object)string);
                        }
                        if (arrstring != null) continue;
                    }
                    r2 = this.a(r2);
                }
                Iterator<Object> iterator = r2.d().iterator();
                block7: while (true) {
                    boolean bl2 = iterator.hasNext();
                    block8: while (bl2) {
                        String string;
                        string = (String)iterator.next();
                        object = r2.j(string);
                        try {
                            d d10;
                            int n2;
                            block163: {
                                block164: {
                                    block165: {
                                        block160: {
                                            block161: {
                                                block162: {
                                                    block154: {
                                                        block155: {
                                                            block158: {
                                                                block159: {
                                                                    block156: {
                                                                        block157: {
                                                                            block148: {
                                                                                block149: {
                                                                                    block152: {
                                                                                        block153: {
                                                                                            block150: {
                                                                                                block151: {
                                                                                                    block143: {
                                                                                                        block144: {
                                                                                                            block147: {
                                                                                                                boolean bl3;
                                                                                                                block145: {
                                                                                                                    block146: {
                                                                                                                        block141: {
                                                                                                                            block142: {
                                                                                                                                if (arrstring == null) break block140;
                                                                                                                                n2 = "mouseSensitivity".equals(string);
                                                                                                                                if (arrstring != null) {
                                                                                                                                    if (n2 != 0) {
                                                                                                                                        this.bv = this.a((String)object);
                                                                                                                                    }
                                                                                                                                    n2 = "fov".equals(string);
                                                                                                                                }
                                                                                                                                if (arrstring != null) {
                                                                                                                                    if (n2 != 0) {
                                                                                                                                        this.bR = this.a((String)object) * 40.0f + 70.0f;
                                                                                                                                    }
                                                                                                                                    n2 = "gamma".equals(string);
                                                                                                                                }
                                                                                                                                if (arrstring != null) {
                                                                                                                                    if (n2 != 0) {
                                                                                                                                        this.aj = this.a((String)object);
                                                                                                                                    }
                                                                                                                                    n2 = "saturation".equals(string);
                                                                                                                                }
                                                                                                                                if (arrstring != null) {
                                                                                                                                    if (n2 != 0) {
                                                                                                                                        this.bS = this.a((String)object);
                                                                                                                                    }
                                                                                                                                    n2 = "invertYMouse".equals(string);
                                                                                                                                }
                                                                                                                                if (arrstring != null) {
                                                                                                                                    if (n2 != 0) {
                                                                                                                                        this.B = "true".equals(object);
                                                                                                                                    }
                                                                                                                                    n2 = "renderDistance".equals(string);
                                                                                                                                }
                                                                                                                                if (arrstring != null) {
                                                                                                                                    if (n2 != 0) {
                                                                                                                                        this.bf = Integer.parseInt((String)object);
                                                                                                                                    }
                                                                                                                                    n2 = "guiScale".equals(string);
                                                                                                                                }
                                                                                                                                if (arrstring != null) {
                                                                                                                                    if (n2 != 0) {
                                                                                                                                        this.b7 = Integer.parseInt((String)object);
                                                                                                                                    }
                                                                                                                                    n2 = "particles".equals(string);
                                                                                                                                }
                                                                                                                                if (arrstring != null) {
                                                                                                                                    if (n2 != 0) {
                                                                                                                                        this.bC = Integer.parseInt((String)object);
                                                                                                                                    }
                                                                                                                                    n2 = "bobView".equals(string);
                                                                                                                                }
                                                                                                                                if (arrstring != null) {
                                                                                                                                    if (n2 != 0) {
                                                                                                                                        this.X = "true".equals(object);
                                                                                                                                    }
                                                                                                                                    n2 = "anaglyph3d".equals(string);
                                                                                                                                }
                                                                                                                                if (arrstring != null) {
                                                                                                                                    if (n2 != 0) {
                                                                                                                                        this.aD = "true".equals(object);
                                                                                                                                    }
                                                                                                                                    n2 = "maxFps".equals(string);
                                                                                                                                }
                                                                                                                                if (arrstring == null) break block141;
                                                                                                                                if (n2 == 0) break block142;
                                                                                                                                this.bo = Integer.parseInt((String)object);
                                                                                                                                n2 = this.br;
                                                                                                                                if (arrstring != null) {
                                                                                                                                    if (n2 != 0) {
                                                                                                                                        this.bo = (int)net.minecraft.client.l.f.FRAMERATE_LIMIT.a();
                                                                                                                                    }
                                                                                                                                    n2 = this.bo;
                                                                                                                                }
                                                                                                                                if (arrstring == null) break block141;
                                                                                                                                if (n2 <= 0) {
                                                                                                                                    this.bo = (int)net.minecraft.client.l.f.FRAMERATE_LIMIT.a();
                                                                                                                                }
                                                                                                                            }
                                                                                                                            n2 = "fboEnable".equals(string);
                                                                                                                        }
                                                                                                                        if (arrstring != null) {
                                                                                                                            if (n2 != 0) {
                                                                                                                                this.bt = "true".equals(object);
                                                                                                                            }
                                                                                                                            n2 = "difficulty".equals(string);
                                                                                                                        }
                                                                                                                        if (arrstring != null) {
                                                                                                                            if (n2 != 0) {
                                                                                                                                this.bH = net.minecraft.ah.e.a(Integer.parseInt((String)object));
                                                                                                                            }
                                                                                                                            n2 = "fancyGraphics".equals(string);
                                                                                                                        }
                                                                                                                        if (arrstring != null) {
                                                                                                                            if (n2 != 0) {
                                                                                                                                this.aC = "true".equals(object);
                                                                                                                                this.b();
                                                                                                                            }
                                                                                                                            n2 = "tutorialStep".equals(string);
                                                                                                                        }
                                                                                                                        if (arrstring != null) {
                                                                                                                            if (n2 != 0) {
                                                                                                                                this.bB = net.minecraft.client.H.f.a((String)object);
                                                                                                                            }
                                                                                                                            n2 = "ao".equals(string);
                                                                                                                        }
                                                                                                                        if (arrstring == null) break block143;
                                                                                                                        if (n2 == 0) break block144;
                                                                                                                        bl3 = "true".equals(object);
                                                                                                                        if (arrstring == null) break block145;
                                                                                                                        if (!bl3) break block146;
                                                                                                                        this.A = 2;
                                                                                                                        if (arrstring != null) break block144;
                                                                                                                    }
                                                                                                                    bl3 = "false".equals(object);
                                                                                                                }
                                                                                                                if (!bl3) break block147;
                                                                                                                this.A = 0;
                                                                                                                if (arrstring != null) break block144;
                                                                                                            }
                                                                                                            this.A = Integer.parseInt((String)object);
                                                                                                        }
                                                                                                        n2 = "renderClouds".equals(string) ? 1 : 0;
                                                                                                    }
                                                                                                    if (arrstring == null) break block148;
                                                                                                    if (n2 == 0) break block149;
                                                                                                    n2 = "true".equals(object) ? 1 : 0;
                                                                                                    if (arrstring == null) break block150;
                                                                                                    if (n2 == 0) break block151;
                                                                                                    this.bn = 2;
                                                                                                    if (arrstring != null) break block149;
                                                                                                }
                                                                                                n2 = "false".equals(object) ? 1 : 0;
                                                                                            }
                                                                                            if (arrstring == null) break block152;
                                                                                            if (n2 == 0) break block153;
                                                                                            this.bn = 0;
                                                                                            if (arrstring != null) break block149;
                                                                                        }
                                                                                        n2 = "fast".equals(object) ? 1 : 0;
                                                                                    }
                                                                                    if (arrstring == null) break block148;
                                                                                    if (n2 != 0) {
                                                                                        this.bn = 1;
                                                                                    }
                                                                                }
                                                                                n2 = "attackIndicator".equals(string) ? 1 : 0;
                                                                            }
                                                                            if (arrstring == null) break block154;
                                                                            if (n2 == 0) break block155;
                                                                            n2 = "0".equals(object) ? 1 : 0;
                                                                            if (arrstring == null) break block156;
                                                                            if (n2 == 0) break block157;
                                                                            this.bm = 0;
                                                                            if (arrstring != null) break block155;
                                                                        }
                                                                        n2 = "1".equals(object) ? 1 : 0;
                                                                    }
                                                                    if (arrstring == null) break block158;
                                                                    if (n2 == 0) break block159;
                                                                    this.bm = 1;
                                                                    if (arrstring != null) break block155;
                                                                }
                                                                n2 = "2".equals(object) ? 1 : 0;
                                                            }
                                                            if (arrstring == null) break block154;
                                                            if (n2 != 0) {
                                                                this.bm = 2;
                                                            }
                                                        }
                                                        n2 = "resourcePacks".equals(string) ? 1 : 0;
                                                    }
                                                    if (arrstring == null) break block160;
                                                    if (n2 == 0) break block161;
                                                    this.bJ = (List)net.minecraft.ar.aG.a(k, (String)object, bD);
                                                    c c11 = this;
                                                    if (arrstring == null) break block162;
                                                    if (c11.bJ != null) break block161;
                                                    c11 = this;
                                                }
                                                c11.bJ = Lists.newArrayList();
                                            }
                                            n2 = "incompatibleResourcePacks".equals(string) ? 1 : 0;
                                        }
                                        if (arrstring == null) break block163;
                                        if (n2 == 0) break block164;
                                        this.T = (List)net.minecraft.ar.aG.a(k, (String)object, bD);
                                        c c12 = this;
                                        if (arrstring == null) break block165;
                                        if (c12.T != null) break block164;
                                        c12 = this;
                                    }
                                    c12.T = Lists.newArrayList();
                                }
                                n2 = "lastServer".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.b8 = object;
                                }
                                n2 = "lang".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.bM = object;
                                }
                                n2 = "chatVisibility".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.bd = net.minecraft.i.b.a(Integer.parseInt((String)object));
                                }
                                n2 = "chatColors".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.b1 = "true".equals(object);
                                }
                                n2 = "chatLinks".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.bg = "true".equals(object);
                                }
                                n2 = "chatLinksPrompt".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.ae = "true".equals(object);
                                }
                                n2 = "chatOpacity".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.b_ = this.a((String)object);
                                }
                                n2 = "snooperEnabled".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.a8 = "true".equals(object);
                                }
                                n2 = "fullscreen".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.b5 = "true".equals(object);
                                }
                                n2 = "enableVsync".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.br = "true".equals(object);
                                    c c13 = this;
                                    if (arrstring != null) {
                                        if (c13.br) {
                                            this.bo = (int)net.minecraft.client.l.f.FRAMERATE_LIMIT.a();
                                        }
                                        c13 = this;
                                    }
                                    c13.g();
                                }
                                n2 = "useVbo".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.bz = "true".equals(object);
                                }
                                n2 = "hideServerAddress".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.ar = "true".equals(object);
                                }
                                n2 = "advancedItemTooltips".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.aP = "true".equals(object);
                                }
                                n2 = "pauseOnLostFocus".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.ay = "true".equals(object);
                                }
                                n2 = "touchscreen".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.aZ = "true".equals(object);
                                }
                                n2 = "overrideHeight".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.g = Integer.parseInt((String)object);
                                }
                                n2 = "overrideWidth".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.a2 = Integer.parseInt((String)object);
                                }
                                n2 = "heldItemTooltips".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.bP = "true".equals(object);
                                }
                                n2 = "chatHeightFocused".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.aQ = this.a((String)object);
                                }
                                n2 = "chatHeightUnfocused".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.at = this.a((String)object);
                                }
                                n2 = "chatScale".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.ah = this.a((String)object);
                                }
                                n2 = "chatWidth".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.m = this.a((String)object);
                                }
                                n2 = "mipmapLevels".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.c = Integer.parseInt((String)object);
                                }
                                n2 = "forceUnicodeFont".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.bZ = "true".equals(object);
                                }
                                n2 = "reducedDebugInfo".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.aw = "true".equals(object);
                                }
                                n2 = "useNativeTransport".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.aA = "true".equals(object);
                                }
                                n2 = "entityShadows".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.bN = "true".equals(object);
                                }
                                n2 = "mainHand".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.aR = "left".equals(object) ? net.minecraft.ar.b.LEFT : net.minecraft.ar.b.RIGHT;
                                }
                                n2 = "showSubtitles".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.a4 = "true".equals(object);
                                }
                                n2 = "realmsNotifications".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.ai = "true".equals(object);
                                }
                                n2 = "enableWeakAttacks".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.aV = "true".equals(object);
                                }
                                n2 = "autoJump".equals(string) ? 1 : 0;
                            }
                            if (arrstring != null) {
                                if (n2 != 0) {
                                    this.ag = "true".equals(object);
                                }
                                n2 = "narrator".equals(string) ? 1 : 0;
                            }
                            if (n2 != 0) {
                                this.w = Integer.parseInt((String)object);
                            }
                            Object[] arrobject = this.ad;
                            int n3 = arrobject.length;
                            int n4 = 0;
                            while (n4 < n3) {
                                block166: {
                                    block167: {
                                        block169: {
                                            Object object2;
                                            Object object3;
                                            block170: {
                                                block171: {
                                                    int n5;
                                                    block168: {
                                                        d10 = arrobject[n4];
                                                        if (arrstring == null) break block166;
                                                        bl2 = string.equals("key_" + d10.f());
                                                        if (arrstring == null) continue block8;
                                                        if (!bl2) break block167;
                                                        n5 = cq.F.b();
                                                        if (arrstring == null) break block168;
                                                        if (n5 == 0) break block169;
                                                        object3 = object;
                                                        if (arrstring == null) break block170;
                                                        n5 = ((String)object3).indexOf(58);
                                                    }
                                                    if (n5 == -1) break block171;
                                                    object2 = ((String)object).split(":");
                                                    Object object4 = cq.d(cq.F, object2[1]);
                                                    cq.d(d10, cq.dy, object4, Integer.parseInt(object2[0]));
                                                    if (arrstring != null) break block167;
                                                }
                                                object3 = cq.a(cq.bD);
                                            }
                                            object2 = object3;
                                            cq.d(d10, cq.dy, object2, Integer.parseInt((String)object));
                                            if (arrstring != null) break block167;
                                        }
                                        d10.a(Integer.parseInt((String)object));
                                    }
                                    ++n4;
                                }
                                if (arrstring != null) continue;
                            }
                            arrobject = net.minecraft.ar.ay.values();
                            n3 = arrobject.length;
                            n4 = 0;
                            while (n4 < n3) {
                                d10 = arrobject[n4];
                                if (arrstring != null) {
                                    bl2 = string.equals("soundCategory_" + ((ay)((Object)d10)).b());
                                    if (arrstring == null) continue block8;
                                    if (bl2) {
                                        this.ab.put((ay)((Object)d10), Float.valueOf(this.a((String)object)));
                                    }
                                    ++n4;
                                }
                                if (arrstring != null) continue;
                            }
                            arrobject = net.minecraft.i.a.values();
                            n3 = arrobject.length;
                            n4 = 0;
                            while (n4 < n3) {
                                d10 = arrobject[n4];
                                if (arrstring != null) {
                                    bl2 = string.equals("modelPart_" + ((net.minecraft.i.a)((Object)d10)).c());
                                    if (arrstring == null) continue block8;
                                    if (bl2) {
                                        this.a((net.minecraft.i.a)((Object)d10), "true".equals(object));
                                    }
                                    ++n4;
                                }
                                if (arrstring != null) continue;
                                continue block7;
                            }
                            continue block7;
                        }
                        catch (Exception exception) {
                            f.warn("Skipping bad option: {}:{}", (Object)string, object);
                            exception.printStackTrace();
                        }
                        if (arrstring != null) continue block7;
                    }
                    break;
                }
                net.minecraft.client.l.d.i();
            }
            catch (Exception exception) {
                f.error("Failed to load options", (Throwable)exception);
            }
        }
        this.l();
    }

    public static String[] m() {
        return j;
    }

    public void f() {
        block3: {
            block2: {
                String[] arrstring = net.minecraft.client.l.c.m();
                c c10 = this;
                if (arrstring == null) break block2;
                if (!c10.a6) break block3;
                this.bk.A();
                c10 = this;
            }
            c10.a6 = false;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public float a(ay ay2) {
        String[] arrstring = net.minecraft.client.l.c.m();
        Map<ay, Float> map = this.ab;
        ay ay3 = ay2;
        if (arrstring != null) {
            if (!map.containsKey((Object)ay3)) return 1.0f;
            map = this.ab;
            ay3 = ay2;
        }
        float f10 = map.get((Object)ay3).floatValue();
        return f10;
    }

    public void a(f f10, float f11) {
        block27: {
            f f12;
            f f13;
            block24: {
                block25: {
                    String[] arrstring;
                    block26: {
                        String[] arrstring2 = net.minecraft.client.l.c.m();
                        this.b(f10, f11);
                        arrstring = arrstring2;
                        f f12 = f10;
                        f12 = net.minecraft.client.l.f.SENSITIVITY;
                        if (arrstring != null) {
                            if (f13 == f12) {
                                this.bv = f11;
                            }
                            f f12 = f10;
                            f12 = net.minecraft.client.l.f.FOV;
                        }
                        if (arrstring != null) {
                            if (f13 == f12) {
                                this.bR = f11;
                            }
                            f f12 = f10;
                            f12 = net.minecraft.client.l.f.GAMMA;
                        }
                        if (arrstring != null) {
                            if (f13 == f12) {
                                this.aj = f11;
                            }
                            f f12 = f10;
                            f12 = net.minecraft.client.l.f.FRAMERATE_LIMIT;
                        }
                        if (arrstring != null) {
                            if (f13 == f12) {
                                this.bo = (int)f11;
                                this.br = false;
                                c c10 = this;
                                if (arrstring != null) {
                                    if (c10.bo <= 0) {
                                        this.bo = (int)net.minecraft.client.l.f.FRAMERATE_LIMIT.a();
                                        this.br = true;
                                    }
                                    c10 = this;
                                }
                                c10.g();
                            }
                            f f12 = f10;
                            f12 = net.minecraft.client.l.f.CHAT_OPACITY;
                        }
                        if (arrstring != null) {
                            if (f13 == f12) {
                                this.b_ = f11;
                                this.bk.n.f().c();
                            }
                            f f12 = f10;
                            f12 = net.minecraft.client.l.f.CHAT_HEIGHT_FOCUSED;
                        }
                        if (arrstring != null) {
                            if (f13 == f12) {
                                this.aQ = f11;
                                this.bk.n.f().c();
                            }
                            f f12 = f10;
                            f12 = net.minecraft.client.l.f.CHAT_HEIGHT_UNFOCUSED;
                        }
                        if (arrstring != null) {
                            if (f13 == f12) {
                                this.at = f11;
                                this.bk.n.f().c();
                            }
                            f f12 = f10;
                            f12 = net.minecraft.client.l.f.CHAT_WIDTH;
                        }
                        if (arrstring != null) {
                            if (f13 == f12) {
                                this.m = f11;
                                this.bk.n.f().c();
                            }
                            f f12 = f10;
                            f12 = net.minecraft.client.l.f.CHAT_SCALE;
                        }
                        if (arrstring != null) {
                            if (f13 == f12) {
                                this.ah = f11;
                                this.bk.n.f().c();
                            }
                            f f12 = f10;
                            f12 = net.minecraft.client.l.f.MIPMAP_LEVELS;
                        }
                        if (arrstring == null) break block24;
                        if (f13 != f12) break block25;
                        int n2 = this.c;
                        this.c = (int)f11;
                        if (arrstring == null) break block26;
                        if ((float)n2 == f11) break block25;
                        this.bk.an().a(this.c);
                        this.bk.aN().b(net.minecraft.client.j.j.x);
                    }
                    j j2 = this.bk.an();
                    boolean bl2 = this.c;
                    if (arrstring != null) {
                        bl2 = bl2 > false;
                    }
                    j2.b(false, bl2);
                    this.bk.A();
                }
                f f12 = f10;
                f12 = net.minecraft.client.l.f.RENDER_DISTANCE;
            }
            if (f13 != f12) break block27;
            this.bf = (int)f11;
            this.bk.a2.t();
        }
    }

    public void a(boolean n2) {
        int n3;
        String[] arrstring = net.minecraft.client.l.c.m();
        int n4 = n2;
        if (arrstring != null) {
            n4 = n4 != 0 ? 0 : 2;
        }
        this.bV = n3 = n4;
        this.ce = n3;
        this.Z = n2;
        this.bs = n2;
        this.au = n2;
        this.ap = n2;
        this.p = n2;
        this.am = n2;
        this.z = n2;
        this.bQ = n2;
        this.aH = n2;
        this.bh = n2;
        this.aB = n2;
        this.bw = n2;
        int n5 = n2;
        if (arrstring != null) {
            n5 = n5 != 0 ? 0 : 2;
        }
        this.bC = n5;
        this.by = n2;
        this.a1 = n2;
        this.s = n2;
    }

    public c(Q q2, File file) {
        String[] arrstring;
        block6: {
            block5: {
                int n2;
                block4: {
                    this.bv = 0.5f;
                    this.bf = -1;
                    this.X = true;
                    this.bt = true;
                    this.bo = 120;
                    this.bn = 2;
                    this.aC = true;
                    this.A = 2;
                    this.bJ = Lists.newArrayList();
                    this.T = Lists.newArrayList();
                    this.bd = net.minecraft.i.b.FULL;
                    this.b1 = true;
                    this.bg = true;
                    this.ae = true;
                    this.b_ = 1.0f;
                    this.a8 = true;
                    this.br = true;
                    this.bz = true;
                    this.ay = true;
                    this.bq = Sets.newHashSet((Object[])net.minecraft.i.a.values());
                    this.aR = net.minecraft.ar.b.RIGHT;
                    this.bP = true;
                    this.ah = 1.0f;
                    this.m = 1.0f;
                    this.at = 0.44366196f;
                    this.aQ = 1.0f;
                    this.c = 4;
                    this.ab = Maps.newEnumMap(ay.class);
                    this.aA = true;
                    this.bN = true;
                    this.bm = 1;
                    this.ai = true;
                    this.ag = true;
                    this.bB = net.minecraft.client.H.f.MOVEMENT;
                    this.aW = new d("key.forward", 17, "key.categories.movement");
                    this.C = new d("key.left", 30, "key.categories.movement");
                    this.O = new d("key.back", 31, "key.categories.movement");
                    this.G = new d("key.right", 32, "key.categories.movement");
                    this.v = new d("key.jump", 57, "key.categories.movement");
                    this.bc = new d("key.sneak", 42, "key.categories.movement");
                    this.cc = new d("key.sprint", 29, "key.categories.movement");
                    this.bW = new d("key.inventory", 18, "key.categories.inventory");
                    this.bA = new d("key.swapHands", 33, "key.categories.inventory");
                    this.bU = new d("key.drop", 16, "key.categories.inventory");
                    this.aM = new d("key.use", -99, "key.categories.gameplay");
                    this.bb = new d("key.attack", -100, "key.categories.gameplay");
                    this.aT = new d("key.pickItem", -98, "key.categories.gameplay");
                    this.bI = new d("key.chat", 20, "key.categories.multiplayer");
                    this.aK = new d("key.playerlist", 15, "key.categories.multiplayer");
                    this.y = new d("key.command", 53, "key.categories.multiplayer");
                    this.b4 = new d("key.screenshot", 60, "key.categories.misc");
                    this.bO = new d("key.togglePerspective", 63, "key.categories.misc");
                    this.aq = new d("key.smoothCamera", 0, "key.categories.misc");
                    this.Q = new d("key.fullscreen", 87, "key.categories.misc");
                    this.t = new d("key.spectatorOutlines", 0, "key.categories.misc");
                    this.bu = new d("key.advancements", 38, "key.categories.misc");
                    this.b3 = new d[]{new d("key.hotbar.1", 2, "key.categories.inventory"), new d("key.hotbar.2", 3, "key.categories.inventory"), new d("key.hotbar.3", 4, "key.categories.inventory"), new d("key.hotbar.4", 5, "key.categories.inventory"), new d("key.hotbar.5", 6, "key.categories.inventory"), new d("key.hotbar.6", 7, "key.categories.inventory"), new d("key.hotbar.7", 8, "key.categories.inventory"), new d("key.hotbar.8", 9, "key.categories.inventory"), new d("key.hotbar.9", 10, "key.categories.inventory")};
                    this.bl = new d("key.saveToolbarActivator", 46, "key.categories.creative");
                    this.b9 = new d("key.loadToolbarActivator", 45, "key.categories.creative");
                    this.i = 1;
                    this.an = 0.8f;
                    this.b6 = 0;
                    this.bF = false;
                    this.be = false;
                    this.R = fU.G();
                    this.E = fU.G();
                    this.aG = 1.0f;
                    this.a = 0;
                    this.n = 1;
                    arrstring = net.minecraft.client.l.c.m();
                    this.o = 0;
                    this.ak = 0.0f;
                    this.D = 0;
                    this.af = 0;
                    this.a9 = 0;
                    this.e = 3;
                    this.az = 4000;
                    this.V = false;
                    this.ca = false;
                    this.a5 = false;
                    this.u = true;
                    this.M = true;
                    this.cd = true;
                    this.I = true;
                    this.bp = 0;
                    this.Y = 1;
                    this.aE = false;
                    this.b = 0;
                    this.aY = false;
                    this.bj = false;
                    this.l = "Default";
                    this.a3 = true;
                    this.S = true;
                    this.al = true;
                    this.N = true;
                    this.aX = true;
                    this.aF = true;
                    this.bi = true;
                    this.J = 2;
                    this.bT = true;
                    this.a7 = false;
                    this.aa = false;
                    this.as = false;
                    this.H = 0;
                    this.aJ = true;
                    this.aI = true;
                    this.aN = 3;
                    this.h = true;
                    this.aO = true;
                    this.b2 = 1;
                    this.bV = 0;
                    this.ce = 0;
                    this.Z = true;
                    this.bs = true;
                    this.au = true;
                    this.ap = true;
                    this.p = true;
                    this.am = true;
                    this.z = true;
                    this.bQ = true;
                    this.aH = true;
                    this.bh = true;
                    this.aB = true;
                    this.bw = true;
                    this.by = true;
                    this.a1 = true;
                    this.s = true;
                    this.a6 = false;
                    this.d();
                    this.ad = (d[])ArrayUtils.addAll((Object[])new d[]{this.bb, this.aM, this.aW, this.C, this.O, this.G, this.v, this.bc, this.cc, this.bU, this.bW, this.bI, this.aK, this.aT, this.y, this.b4, this.bO, this.aq, this.Q, this.t, this.bA, this.bl, this.b9, this.bu}, (Object[])this.b3);
                    this.bH = net.minecraft.ah.e.NORMAL;
                    this.b8 = "";
                    this.bR = 70.0f;
                    this.bM = "en_us";
                    this.bk = q2;
                    this.ac = new File(file, "options.txt");
                    n2 = q2.x();
                    if (arrstring == null) break block4;
                    if (n2 == 0) break block5;
                    long l2 = Runtime.getRuntime().maxMemory() - 1000000000L;
                    n2 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
                }
                if (n2 < 0) break block5;
                net.minecraft.client.l.f.RENDER_DISTANCE.a(32.0f);
                if (arrstring != null) break block6;
                net.minecraft.k.m.b(!net.minecraft.k.m.c());
            }
            net.minecraft.client.l.f.RENDER_DISTANCE.a(16.0f);
        }
        int n3 = q2.x();
        if (arrstring != null) {
            n3 = n3 != 0 ? 12 : 8;
        }
        this.bf = n3;
        this.q = new File(file, "optionsof.txt");
        this.bo = (int)net.minecraft.client.l.f.FRAMERATE_LIMIT.a();
        this.ax = new d("of.key.zoom", 46, "key.categories.misc");
        this.ad = (d[])ArrayUtils.add((Object[])this.ad, (Object)this.ax);
        net.minecraft.client.l.f.RENDER_DISTANCE.a(32.0f);
        this.bf = 8;
        this.o();
        fU.a(this);
    }

    public int a() {
        String[] arrstring = net.minecraft.client.l.c.m();
        int n2 = this.bf;
        if (arrstring != null) {
            n2 = n2 >= 4 ? this.bn : 0;
        }
        return n2;
    }
}

