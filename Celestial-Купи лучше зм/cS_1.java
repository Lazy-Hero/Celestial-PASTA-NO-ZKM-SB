/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.IOUtils
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.ARBShaderObjects
 *  org.lwjgl.opengl.ARBVertexShader
 *  org.lwjgl.opengl.ContextCapabilities
 *  org.lwjgl.opengl.EXTFramebufferObject
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL20
 *  org.lwjgl.opengl.GL30
 *  org.lwjgl.opengl.GLContext
 *  org.lwjgl.util.glu.GLU
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Pattern;
import net.minecraft.N.y;
import net.minecraft.W.K;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.at.g;
import net.minecraft.client.Q;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.a0;
import net.minecraft.client.a.ag;
import net.minecraft.client.a.as;
import net.minecraft.client.a.v;
import net.minecraft.client.a.x;
import net.minecraft.client.l.c;
import net.minecraft.client.r.u;
import net.minecraft.client.w.j;
import net.minecraft.client.y.b;
import net.minecraft.k.l;
import net.minecraft.w.d;
import net.minecraft.w.k;
import org.apache.commons.io.IOUtils;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.ARBVertexShader;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.GLU;

public class cS {
    private static /* synthetic */ aj[] bs;
    private static final /* synthetic */ boolean bn;
    public static /* synthetic */ int cQ;
    public static /* synthetic */ boolean bJ;
    static /* synthetic */ File b_;
    static /* synthetic */ fK cq;
    private static final /* synthetic */ Pattern cL;
    public static final /* synthetic */ int bZ;
    private static /* synthetic */ z ar;
    static final /* synthetic */ FloatBuffer ca;
    public static final /* synthetic */ boolean dI;
    public static /* synthetic */ boolean ec;
    public static /* synthetic */ aF cw;
    public static final /* synthetic */ int R;
    private static final /* synthetic */ int[] bt;
    static final /* synthetic */ float[] bk;
    public static /* synthetic */ int dA;
    static /* synthetic */ long cF;
    public static /* synthetic */ aF a;
    static /* synthetic */ long cr;
    public static /* synthetic */ boolean dn;
    public static final /* synthetic */ int[] H;
    static /* synthetic */ double u;
    public static final /* synthetic */ int bW;
    public static final /* synthetic */ int F;
    public static final /* synthetic */ int[] dt;
    private static /* synthetic */ String aW;
    static /* synthetic */ boolean ds;
    static /* synthetic */ Map<K, Integer> O;
    public static final /* synthetic */ int bv;
    static /* synthetic */ File W;
    static final /* synthetic */ FloatBuffer T;
    public static /* synthetic */ boolean dj;
    private static /* synthetic */ String ah;
    public static /* synthetic */ aF dw;
    static /* synthetic */ float aC;
    public static final /* synthetic */ int b;
    static /* synthetic */ float bC;
    public static final /* synthetic */ int d1;
    static /* synthetic */ double au;
    static final /* synthetic */ int cB;
    public static /* synthetic */ boolean cZ;
    public static /* synthetic */ boolean cC;
    static final /* synthetic */ FloatBuffer c6;
    static /* synthetic */ int aA;
    public static final /* synthetic */ int dy;
    public static final /* synthetic */ int dC;
    static /* synthetic */ float cm;
    static /* synthetic */ File aX;
    private static final /* synthetic */ String[] c0;
    static /* synthetic */ int a4;
    private static final /* synthetic */ float[] da;
    static /* synthetic */ float cu;
    private static /* synthetic */ Map<String, String> b9;
    static final /* synthetic */ FloatBuffer d7;
    static /* synthetic */ double q;
    static /* synthetic */ float av;
    public static /* synthetic */ boolean ap;
    public static /* synthetic */ boolean ck;
    public static /* synthetic */ aF dd;
    public static /* synthetic */ aF ao;
    static final /* synthetic */ FloatBuffer ed;
    static final /* synthetic */ IntBuffer bF;
    static /* synthetic */ float[] X;
    public static final /* synthetic */ int c7;
    static /* synthetic */ String b2;
    static /* synthetic */ boolean bB;
    public static /* synthetic */ int c9;
    public static /* synthetic */ boolean[] du;
    public static /* synthetic */ boolean cc;
    private static final /* synthetic */ int al;
    static final /* synthetic */ float[] br;
    static /* synthetic */ int dZ;
    public static /* synthetic */ aF d0;
    static /* synthetic */ boolean dE;
    public static final /* synthetic */ int dv;
    static /* synthetic */ float cn;
    static /* synthetic */ Map<String, g2> aF;
    static /* synthetic */ float[] aq;
    public static /* synthetic */ int bw;
    public static /* synthetic */ boolean P;
    public static final /* synthetic */ int cJ;
    private static /* synthetic */ boolean cO;
    public static final /* synthetic */ int d5;
    static /* synthetic */ boolean dK;
    public static /* synthetic */ int[] v;
    public static /* synthetic */ int ea;
    public static /* synthetic */ Properties bI;
    public static /* synthetic */ aF dX;
    static final /* synthetic */ FloatBuffer cy;
    private static final /* synthetic */ String[] a6;
    public static /* synthetic */ float dL;
    static /* synthetic */ IntBuffer cg;
    private static final /* synthetic */ String[] dM;
    static /* synthetic */ aC[] Y;
    public static /* synthetic */ aF bQ;
    static /* synthetic */ int bo;
    static /* synthetic */ float[] ct;
    private static /* synthetic */ boolean d6;
    static /* synthetic */ int ei;
    public static /* synthetic */ e7 aU;
    private static final /* synthetic */ int[] M;
    private static final /* synthetic */ ByteBuffer eb;
    public static final /* synthetic */ int cj;
    public static final /* synthetic */ int dz;
    static /* synthetic */ double cA;
    static /* synthetic */ int a_;
    public static /* synthetic */ float d8;
    static /* synthetic */ long d4;
    static final /* synthetic */ int a1;
    private static final /* synthetic */ boolean[] aj;
    public static /* synthetic */ boolean c_;
    public static /* synthetic */ float aK;
    public static /* synthetic */ boolean c;
    public static /* synthetic */ Properties az;
    private static /* synthetic */ String de;
    public static /* synthetic */ aF bu;
    static final /* synthetic */ int aJ;
    static /* synthetic */ float bq;
    public static final /* synthetic */ int bS;
    static /* synthetic */ int cD;
    public static /* synthetic */ float dh;
    static /* synthetic */ double a9;
    static final /* synthetic */ IntBuffer bc;
    public static /* synthetic */ int[] V;
    static /* synthetic */ String I;
    public static /* synthetic */ String b4;
    public static /* synthetic */ int dV;
    static /* synthetic */ float aP;
    public static final /* synthetic */ int bG;
    public static /* synthetic */ float at;
    static /* synthetic */ int L;
    private static final /* synthetic */ int[] bb;
    static /* synthetic */ Q a2;
    static final /* synthetic */ IntBuffer aH;
    public static final /* synthetic */ String[] cY;
    static /* synthetic */ int c3;
    public static final /* synthetic */ int aY;
    static final /* synthetic */ FloatBuffer dl;
    static /* synthetic */ File aa;
    static final /* synthetic */ boolean[][] t;
    static /* synthetic */ long be;
    public static final /* synthetic */ int bp;
    static /* synthetic */ float[] Q;
    static final /* synthetic */ IntBuffer dx;
    public static /* synthetic */ boolean l;
    static /* synthetic */ String aL;
    public static /* synthetic */ int ci;
    static /* synthetic */ long aN;
    static /* synthetic */ String dR;
    static /* synthetic */ float cS;
    static /* synthetic */ Set<String> b6;
    public static /* synthetic */ boolean[] dm;
    public static /* synthetic */ boolean E;
    private static /* synthetic */ boolean dp;
    private static /* synthetic */ int ai;
    static final /* synthetic */ float[] bd;
    static /* synthetic */ float[] bh;
    static final /* synthetic */ IntBuffer[] dS;
    public static /* synthetic */ boolean a7;
    public static /* synthetic */ boolean x;
    public static final /* synthetic */ int cf;
    private static final /* synthetic */ int[] b3;
    public static /* synthetic */ int cN;
    static final /* synthetic */ IntBuffer ad;
    private static final /* synthetic */ String cR;
    public static final /* synthetic */ int d2;
    public static /* synthetic */ float an;
    public static /* synthetic */ int ae;
    static final /* synthetic */ IntBuffer ek;
    static final /* synthetic */ float[] cl;
    static /* synthetic */ float e;
    static /* synthetic */ int dN;
    private static /* synthetic */ int B;
    public static final /* synthetic */ int eh;
    public static /* synthetic */ boolean ee;
    static /* synthetic */ IntBuffer[] c1;
    public static final /* synthetic */ int m;
    static final /* synthetic */ FloatBuffer dW;
    public static /* synthetic */ int bl;
    public static /* synthetic */ boolean cW;
    public static /* synthetic */ boolean cX;
    static /* synthetic */ float af;
    static /* synthetic */ dB[] b7;
    public static /* synthetic */ int dG;
    private static final /* synthetic */ List<Integer> g;
    public static /* synthetic */ float cp;
    public static final /* synthetic */ String[] ax;
    public static /* synthetic */ boolean ba;
    static /* synthetic */ float bO;
    static /* synthetic */ int bX;
    public static final /* synthetic */ int ay;
    static /* synthetic */ float b0;
    private static /* synthetic */ int dT;
    static /* synthetic */ int bz;
    static /* synthetic */ float bN;
    public static final /* synthetic */ int bP;
    public static /* synthetic */ int bf;
    public static final /* synthetic */ int cK;
    static /* synthetic */ boolean aI;
    public static /* synthetic */ float J;
    static /* synthetic */ float eg;
    static /* synthetic */ int dr;
    private static /* synthetic */ int N;
    static /* synthetic */ boolean cx;
    public static /* synthetic */ boolean[] dP;
    public static /* synthetic */ eX bj;
    public static final /* synthetic */ int bT;
    public static /* synthetic */ float c8;
    static /* synthetic */ float dU;
    public static /* synthetic */ int aG;
    public static final /* synthetic */ int am;
    static /* synthetic */ long r;
    static /* synthetic */ float[] aM;
    public static final /* synthetic */ int f;
    public static final /* synthetic */ int aR;
    private static final /* synthetic */ String[] a3;
    static final /* synthetic */ int[] bE;
    static final /* synthetic */ IntBuffer dq;
    public static final /* synthetic */ int bR;
    static /* synthetic */ int dH;
    static final /* synthetic */ IntBuffer aS;
    static final /* synthetic */ int[] aZ;
    public static /* synthetic */ boolean o;
    public static /* synthetic */ boolean cb;
    static final /* synthetic */ float[] p;
    public static /* synthetic */ float as;
    static final /* synthetic */ IntBuffer dB;
    static final /* synthetic */ int[] dF;
    static /* synthetic */ int ab;
    public static /* synthetic */ aF cz;
    static final /* synthetic */ float[] bL;
    static final /* synthetic */ float[] dk;
    public static /* synthetic */ String a0;
    public static /* synthetic */ net.minecraft.client.j.d dY;
    static /* synthetic */ boolean d3;
    static /* synthetic */ float d_;
    static final /* synthetic */ IntBuffer b1;
    public static /* synthetic */ float bY;
    public static /* synthetic */ int co;
    static final /* synthetic */ IntBuffer h;
    static /* synthetic */ int by;
    public static /* synthetic */ float bK;
    public static /* synthetic */ int dc;
    static final /* synthetic */ float[] C;
    public static /* synthetic */ boolean cE;
    private static /* synthetic */ int dO;
    static /* synthetic */ double cU;
    public static /* synthetic */ float bm;
    public static /* synthetic */ String di;
    private static final /* synthetic */ int[] cM;
    public static /* synthetic */ boolean db;
    public static /* synthetic */ float bM;
    static final /* synthetic */ IntBuffer dJ;
    private static /* synthetic */ boolean y;
    static /* synthetic */ int df;
    public static /* synthetic */ int cP;
    private static /* synthetic */ boolean a5;
    private static final /* synthetic */ boolean G;
    static /* synthetic */ boolean n;
    public static /* synthetic */ boolean[] aE;
    static /* synthetic */ int cH;
    public static /* synthetic */ boolean aT;
    public static final /* synthetic */ int cV;
    public static /* synthetic */ float cd;
    static final /* synthetic */ FloatBuffer cT;
    public static final /* synthetic */ int j;
    private static final /* synthetic */ int A;
    public static final /* synthetic */ int S;
    static /* synthetic */ float[] aV;
    static /* synthetic */ float[] bV;
    static final /* synthetic */ FloatBuffer dD;
    static final /* synthetic */ int dQ;
    public static /* synthetic */ int bA;
    public static /* synthetic */ aX ak;
    private static /* synthetic */ boolean aB;
    private static final /* synthetic */ String[] cG;
    public static /* synthetic */ boolean[] z;
    private static final /* synthetic */ int ce;
    public static /* synthetic */ boolean d9;
    public static /* synthetic */ float c4;
    static /* synthetic */ int bH;
    public static /* synthetic */ aF D;
    public static /* synthetic */ boolean aw;
    public static final /* synthetic */ int bD;
    static /* synthetic */ float i;
    static /* synthetic */ float aD;
    static /* synthetic */ x bi;
    static /* synthetic */ int ac;
    public static /* synthetic */ ContextCapabilities ej;
    public static /* synthetic */ aF Z;
    public static /* synthetic */ aF k;
    public static /* synthetic */ boolean ag;
    public static final /* synthetic */ int aQ;
    public static /* synthetic */ String s;
    private static final /* synthetic */ int bU;
    public static final /* synthetic */ int dg;
    private static /* synthetic */ bu K;
    static /* synthetic */ float b5;
    public static /* synthetic */ eX U;
    static final /* synthetic */ int c2;
    public static /* synthetic */ int b8;
    static /* synthetic */ float a8;
    public static /* synthetic */ boolean aO;
    static /* synthetic */ float cv;
    private static /* synthetic */ aj[] c5;
    public static /* synthetic */ int bx;
    static /* synthetic */ int[] ef;
    public static /* synthetic */ aF bg;
    static /* synthetic */ int ch;
    static /* synthetic */ float cs;
    static final /* synthetic */ FloatBuffer cI;
    static /* synthetic */ float w;
    static final /* synthetic */ FloatBuffer d;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void X() {
        block111: {
            block110: {
                block74: {
                    block73: {
                        block107: {
                            block72: {
                                block71: {
                                    block81: {
                                        block80: {
                                            block79: {
                                                block78: {
                                                    block76: {
                                                        block77: {
                                                            var0 = dB.i();
                                                            v0 = cS.aw;
                                                            if (var0 == null) break block76;
                                                            if (v0) break block77;
                                                            cS.aw = true;
                                                            var1_1 = true;
                                                            if (var0 != null) break block78;
                                                        }
                                                        v0 = false;
                                                    }
                                                    var1_1 = v0;
                                                }
                                                v1 = cS.ap;
                                                if (var0 != null) {
                                                    if (v1 != 0) return;
                                                    v1 = cS.a("Shaders.init pre");
                                                }
                                                if (cS.w() != null) {
                                                    // empty if block
                                                }
                                                v2 = cS.ej.OpenGL20;
                                                if (var0 != null) {
                                                    if (!v2) {
                                                        cS.k("No OpenGL 2.0");
                                                    }
                                                    v2 = cS.ej.GL_EXT_framebuffer_object;
                                                }
                                                if (var0 != null) {
                                                    if (!v2) {
                                                        cS.k("No EXT_framebuffer_object");
                                                    }
                                                    cS.dx.position(0).limit(8);
                                                    cS.ad.position(0).limit(16);
                                                    cS.dB.position(0).limit(3);
                                                    cS.b1.position(0).limit(8);
                                                    cS.h.position(0).limit(2);
                                                    cS.aS.position(0).limit(8);
                                                    cS.bX = 4;
                                                    cS.bo = 1;
                                                    cS.ac = 0;
                                                    cS.ei = 0;
                                                    cS.a_ = 1;
                                                    cS.df = 1;
                                                    Arrays.fill(cS.cM, 6408);
                                                    Arrays.fill(cS.aj, true);
                                                    Arrays.fill(cS.aE, false);
                                                    Arrays.fill(cS.du, false);
                                                    Arrays.fill(cS.z, false);
                                                    Arrays.fill(cS.dP, false);
                                                    Arrays.fill(cS.dm, false);
                                                    cS.cx = false;
                                                    cS.dp = false;
                                                    cS.bm = 0.0f;
                                                    cS.an = 2.0f;
                                                    cS.bq = -1.0f;
                                                    cS.as = -1.0f;
                                                    cS.a7 = false;
                                                    cS.c = false;
                                                    cS.cZ = false;
                                                    cS.ba = false;
                                                    cS.d3 = false;
                                                    v2 = false;
                                                }
                                                cS.dE = v2;
                                                cS.am();
                                                var2_2 = ds.a(cS.Y, cS.b7, false);
                                                var3_3 = "";
                                                v3 = cS.ar;
                                                if (var0 == null) break block79;
                                                if (v3 == null) break block80;
                                                v3 = cS.ar;
                                            }
                                            var4_4 = v3.D.r().a();
                                            v4 = cS.g.contains(var4_4);
                                            if (var0 == null) break block81;
                                            if (v4) {
                                                var3_3 = "world" + var4_4 + "/";
                                            }
                                        }
                                        v4 = cS.bn;
                                    }
                                    if (var0 != null) {
                                        if (v4) {
                                            cS.a(new File(cS.aX, "debug"));
                                        }
                                        v4 = false;
                                    }
                                    for (var4_4 = (int)((v959651) ? 1 : 0); var4_4 < 33; ++var4_4) {
                                        block83: {
                                            block82: {
                                                var5_5 = cS.cG[var4_4];
                                                v5 = var5_5.equals("");
                                                if (var0 == null) break block71;
                                                if (var0 != null) {
                                                    if (v5 != 0) {
                                                        cS.bt[var4_4] = 0;
                                                        cS.ef[var4_4] = 0;
                                                        cS.a6[var4_4] = null;
                                                        cS.a3[var4_4] = null;
                                                        cS.M[var4_4] = 0;
                                                        if (var0 != null) continue;
                                                    }
                                                    cS.ah = null;
                                                    cS.aW = null;
                                                    v6 = false;
                                                }
                                                cS.dT = v6;
                                                var6_7 = var3_3 + var5_5;
                                                v7 = var2_2;
                                                if (var0 == null) break block82;
                                                if (v7 == null) break block83;
                                                v7 = var2_2;
                                            }
                                            if (v7.c(var6_7)) {
                                                fC.b("Program disabled: " + var6_7);
                                                var5_5 = "<disabled>";
                                                var6_7 = var3_3 + var5_5;
                                            }
                                        }
                                        var7_10 = "/shaders/" + var6_7;
                                        var8_11 = cS.a(var4_4, (String)var7_10 + ".vsh", (String)var7_10 + ".fsh");
                                        if (var0 != null) {
                                            if (var8_11 > 0) {
                                                fC.b("Program loaded: " + var6_7);
                                            }
                                            cS.ef[var4_4] = cS.bt[var4_4] = var8_11;
                                        }
                                        cS.a6[var4_4] = var8_11 != 0 ? cS.ah : null;
                                        cS.a3[var4_4] = var8_11 != 0 ? cS.aW : null;
                                        v8 = var8_11;
                                        if (var0 != null) {
                                            v8 = v8 != 0 ? cS.dT : 0;
                                        }
                                        cS.M[var4_4] = v8;
                                        if (var0 != null) continue;
                                    }
                                    var4_4 = GL11.glGetInteger((int)34852);
                                    new HashMap<K, V>();
                                    v5 = 0;
                                }
                                var5_6 = v5;
                                block1: while (true) {
                                    v9 = var5_6;
                                    v10 = 33;
                                    block2: while (v9 < v10) {
                                        block86: {
                                            block104: {
                                                block106: {
                                                    block105: {
                                                        block103: {
                                                            block90: {
                                                                block92: {
                                                                    block91: {
                                                                        block88: {
                                                                            block89: {
                                                                                block87: {
                                                                                    block84: {
                                                                                        block85: {
                                                                                            Arrays.fill(cS.t[var5_6], false);
                                                                                            v11 = var5_6;
                                                                                            if (var0 == null) break block84;
                                                                                            v12 = 29;
                                                                                            if (var0 == null) ** GOTO lbl283
                                                                                            if (v11 != v12) break block85;
                                                                                            cS.c1[var5_6] = null;
                                                                                            if (var0 != null) break block86;
                                                                                        }
                                                                                        v11 = cS.ef[var5_6];
                                                                                    }
                                                                                    if (var0 == null) break block87;
                                                                                    if (v11 != 0) break block88;
                                                                                    v11 = var5_6;
                                                                                }
                                                                                if (v11 != 30) break block89;
                                                                                cS.c1[var5_6] = cS.bc;
                                                                                if (var0 != null) break block86;
                                                                            }
                                                                            cS.c1[var5_6] = cS.bF;
                                                                            if (var0 != null) break block86;
                                                                        }
                                                                        if ((var6_7 = cS.a6[var5_6]) == null) break block90;
                                                                        var7_10 = cS.dS[var5_6];
                                                                        v13 = var8_11 = var6_7.length();
                                                                        v14 = cS.df;
                                                                        if (var0 == null) break block91;
                                                                        if (v13 > v14) {
                                                                            cS.df = var8_11;
                                                                        }
                                                                        v13 = var8_11;
                                                                        if (var0 == null) break block92;
                                                                        v14 = var4_4;
                                                                    }
                                                                    if (v13 > v14) {
                                                                        var8_11 = var4_4;
                                                                    }
                                                                    cS.c1[var5_6] = var7_10;
                                                                    var7_10.limit(var8_11);
                                                                    v13 = var9_12 = 0;
                                                                }
                                                                while (var9_12 < var8_11) {
                                                                    block93: {
                                                                        block94: {
                                                                            block102: {
                                                                                block101: {
                                                                                    block95: {
                                                                                        block96: {
                                                                                            block100: {
                                                                                                block99: {
                                                                                                    block98: {
                                                                                                        block97: {
                                                                                                            var10_13 = 0;
                                                                                                            if (var0 == null) break block93;
                                                                                                            v9 = var6_7.length();
                                                                                                            v10 = var9_12;
                                                                                                            if (var0 == null) continue block2;
                                                                                                            if (v9 <= v10) break block94;
                                                                                                            var11_14 = var6_7.charAt(var9_12) - 48;
                                                                                                            v15 = var5_6;
                                                                                                            if (var0 == null) break block95;
                                                                                                            if (v15 == 30) break block96;
                                                                                                            v16 = var11_14;
                                                                                                            if (var0 == null) break block97;
                                                                                                            if (v16 < 0) break block94;
                                                                                                            v16 = var11_14;
                                                                                                        }
                                                                                                        v17 = 7;
                                                                                                        if (var0 == null) break block98;
                                                                                                        if (v16 > v17) break block94;
                                                                                                        cS.t[var5_6][var11_14] = true;
                                                                                                        var10_13 = var11_14 + 36064;
                                                                                                        v16 = var11_14;
                                                                                                        v17 = cS.a_;
                                                                                                    }
                                                                                                    if (var0 == null) break block99;
                                                                                                    if (v16 > v17) {
                                                                                                        cS.a_ = var11_14;
                                                                                                    }
                                                                                                    v16 = var11_14;
                                                                                                    if (var0 == null) break block100;
                                                                                                    v17 = cS.bX;
                                                                                                }
                                                                                                if (v16 <= v17) break block94;
                                                                                                v16 = cS.bX = var11_14;
                                                                                            }
                                                                                            if (var0 != null) break block94;
                                                                                        }
                                                                                        v15 = var11_14;
                                                                                    }
                                                                                    if (var0 == null) break block101;
                                                                                    if (v15 < 0) break block94;
                                                                                    v15 = var11_14;
                                                                                }
                                                                                v18 = 1;
                                                                                if (var0 == null) break block102;
                                                                                if (v15 > v18) break block94;
                                                                                var10_13 = var11_14 + 36064;
                                                                                if (var0 == null) break block93;
                                                                                v15 = var11_14;
                                                                                v18 = cS.ac;
                                                                            }
                                                                            if (v15 > v18) {
                                                                                cS.ac = var11_14;
                                                                            }
                                                                        }
                                                                        var7_10.put(var9_12, var10_13);
                                                                        ++var9_12;
                                                                    }
                                                                    if (var0 != null) continue;
                                                                }
                                                                if (var0 != null) break block86;
                                                            }
                                                            v19 = var5_6;
                                                            v20 = 30;
                                                            if (var0 == null) break block103;
                                                            if (v19 == v20) break block104;
                                                            v19 = var5_6;
                                                            v20 = 31;
                                                        }
                                                        if (var0 == null) break block105;
                                                        if (v19 == v20) break block104;
                                                        v19 = var5_6;
                                                        if (var0 == null) break block106;
                                                        v20 = 32;
                                                    }
                                                    if (v19 == v20) break block104;
                                                    cS.c1[var5_6] = cS.dx;
                                                    v19 = cS.bX;
                                                }
                                                cS.df = v19;
                                                Arrays.fill(cS.t[var5_6], 0, cS.bX, true);
                                                if (var0 != null) break block86;
                                            }
                                            cS.c1[var5_6] = cS.b1;
                                        }
                                        ++var5_6;
                                        if (var0 != null) continue block1;
                                    }
                                    break;
                                }
                                cS.a_ = cS.bX;
                                v21 = cS.ei;
                                if (var0 != null) {
                                    v21 = v21 > 0 ? 1 : 0;
                                }
                                cS.ch = v21;
                                v22 = cS.ei;
                                if (var0 != null) {
                                    v22 = v22 > 0 ? 1 : 0;
                                }
                                cS.db = v22;
                                fC.b("usedColorBuffers: " + cS.bX);
                                fC.b("usedDepthBuffers: " + cS.bo);
                                fC.b("usedShadowColorBuffers: " + cS.ac);
                                fC.b("usedShadowDepthBuffers: " + cS.ei);
                                fC.b("usedColorAttachs: " + cS.a_);
                                fC.b("usedDrawBuffers: " + cS.df);
                                cS.dx.position(0).limit(cS.df);
                                cS.ad.position(0).limit(cS.bX * 2);
                                var5_6 = 0;
                                do {
                                    v23 = var5_6;
                                    v12 = cS.df;
lbl283:
                                    // 2 sources

                                    if (v23 >= v12) break;
                                    cS.dx.put(var5_6, 36064 + var5_6);
                                    ++var5_6;
                                    if (var0 == null) break block72;
                                } while (var0 != null);
                                v24 = cS.df;
                                if (var0 == null) break block107;
                                if (v24 > var4_4) {
                                    cS.k("[Shaders] Error: Not enough draw buffers, needed: " + cS.df + ", available: " + var4_4);
                                }
                                cS.b1.position(0).limit(cS.ac);
                            }
                            v24 = var5_6 = 0;
                        }
                        while (var5_6 < cS.ac) {
                            cS.b1.put(var5_6, 36064 + var5_6);
                            ++var5_6;
                            if (var0 != null) {
                                if (var0 != null) continue;
                            }
                            break block73;
                        }
                        var5_6 = 0;
                    }
                    while (var5_6 < 33) {
                        block109: {
                            block108: {
                                block75: {
                                    v25 = var5_6;
                                    if (var0 == null) break block74;
                                    var6_9 = v25;
                                    while (cS.ef[var6_9] == 0) {
                                        v26 = cS.bb[var6_9];
                                        v27 = var6_9;
                                        if (var0 != null && var0 != null) {
                                            if (v26 == v27) break;
                                            var6_9 = cS.bb[var6_9];
                                            if (var0 != null) continue;
                                        }
                                        break block75;
                                    }
                                    v26 = var6_9;
                                    v27 = var5_6;
                                }
                                if (var0 == null) break block108;
                                if (v26 == v27) break block109;
                                v26 = var5_6;
                                v27 = 30;
                            }
                            if (v26 != v27) {
                                cS.ef[var5_6] = cS.ef[var6_9];
                                cS.a6[var5_6] = cS.a6[var6_9];
                                cS.c1[var5_6] = cS.c1[var6_9];
                            }
                        }
                        ++var5_6;
                        if (var0 != null) continue;
                    }
                    cS.aC();
                    cS.aF();
                    v25 = cS.dp ? 1 : 0;
                }
                if (v25 != 0) {
                    cS.aQ();
                }
                v28 = cS.dY;
                if (var0 == null) break block110;
                if (v28 != null) break block111;
                v28 = s.b();
            }
            cS.dY = v28;
        }
        net.minecraft.client.a.v.M();
        net.minecraft.client.a.v.a(-90.0f, 0.0f, 1.0f, 0.0f);
        cS.e();
        cS.ab();
        net.minecraft.client.a.v.B();
        cS.ap = true;
        cS.P();
        cS.k();
        if (!var1_1) {
            // empty if block
        }
        cS.a("Shaders.init");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static int h(String var0) {
        block107: {
            var2_1 = ARBShaderObjects.glCreateShaderObjectARB((int)35632);
            var1_2 = dB.i();
            v0 = var2_1;
            if (var1_2 == null) return v0;
            if (v0 == 0) {
                return 0;
            }
            var3_3 = new StringBuilder(131072);
            var4_4 = null;
            try {
                var4_4 = new BufferedReader(new InputStreamReader(cS.cq.a(var0)));
            }
            catch (Exception var5_5) {
                ARBShaderObjects.glDeleteObjectARB((int)var2_1);
                return 0;
            }
            var5_6 = cS.a(cS.b7);
            var6_7 = new ArrayList<String>();
            v1 = var4_4;
            if (var1_2 == null) ** GOTO lbl22
            if (v1 == null) break block107;
            try {
                v1 = var4_4 = gi.a(var4_4, var0, cS.cq, 0, var6_7, 0);
lbl22:
                // 2 sources

                do {
                    block122: {
                        block123: {
                            block124: {
                                block125: {
                                    block126: {
                                        block127: {
                                            block129: {
                                                block130: {
                                                    block131: {
                                                        block132: {
                                                            block152: {
                                                                block150: {
                                                                    block151: {
                                                                        block149: {
                                                                            block145: {
                                                                                block146: {
                                                                                    block148: {
                                                                                        block147: {
                                                                                            block141: {
                                                                                                block142: {
                                                                                                    block144: {
                                                                                                        block143: {
                                                                                                            block137: {
                                                                                                                block138: {
                                                                                                                    block140: {
                                                                                                                        block139: {
                                                                                                                            block133: {
                                                                                                                                block134: {
                                                                                                                                    block135: {
                                                                                                                                        block136: {
                                                                                                                                            block128: {
                                                                                                                                                block108: {
                                                                                                                                                    block109: {
                                                                                                                                                        block112: {
                                                                                                                                                            block120: {
                                                                                                                                                                block121: {
                                                                                                                                                                    block117: {
                                                                                                                                                                        block119: {
                                                                                                                                                                            block118: {
                                                                                                                                                                                block115: {
                                                                                                                                                                                    block116: {
                                                                                                                                                                                        block113: {
                                                                                                                                                                                            block114: {
                                                                                                                                                                                                block110: {
                                                                                                                                                                                                    block111: {
                                                                                                                                                                                                        if ((var7_8 = var4_4.readLine()) == null) {
                                                                                                                                                                                                            var4_4.close();
                                                                                                                                                                                                            if (var1_2 != null) {
                                                                                                                                                                                                                if (var1_2 != null) break block107;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                            var7_8 = cS.a(var7_8, var5_6);
                                                                                                                                                                                                            var3_3.append(var7_8).append('\n');
                                                                                                                                                                                                        }
                                                                                                                                                                                                        v2 = var8_10 = a9.f(var7_8);
                                                                                                                                                                                                        if (var1_2 != null) {
                                                                                                                                                                                                            if (v2 == null) continue;
                                                                                                                                                                                                            v2 = var8_10;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        v3 = v2.a();
                                                                                                                                                                                                        if (var1_2 == null) break block108;
                                                                                                                                                                                                        if (v3 == 0) break block109;
                                                                                                                                                                                                        var9_11 = var8_10.g();
                                                                                                                                                                                                        v4 = a9.b(var9_11);
                                                                                                                                                                                                        if (var1_2 == null) break block110;
                                                                                                                                                                                                        if (v4 < 0) break block111;
                                                                                                                                                                                                        cS.ei = Math.max(cS.ei, var10_13 + 1);
                                                                                                                                                                                                        if (var1_2 != null) break block112;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    v4 = var10_13 = a9.c(var9_11);
                                                                                                                                                                                                }
                                                                                                                                                                                                if (var1_2 == null) break block113;
                                                                                                                                                                                                if (v4 < 0) break block114;
                                                                                                                                                                                                cS.ac = Math.max(cS.ac, var10_13 + 1);
                                                                                                                                                                                                if (var1_2 != null) break block112;
                                                                                                                                                                                            }
                                                                                                                                                                                            v4 = var10_13 = a9.e(var9_11);
                                                                                                                                                                                        }
                                                                                                                                                                                        if (var1_2 == null) break block115;
                                                                                                                                                                                        if (v4 < 0) break block116;
                                                                                                                                                                                        cS.bo = Math.max(cS.bo, var10_13 + 1);
                                                                                                                                                                                        if (var1_2 != null) break block112;
                                                                                                                                                                                    }
                                                                                                                                                                                    v4 = var9_11.equals("gdepth") ? 1 : 0;
                                                                                                                                                                                }
                                                                                                                                                                                if (var1_2 == null) break block117;
                                                                                                                                                                                if (v4 == 0) break block118;
                                                                                                                                                                                v4 = cS.cM[1];
                                                                                                                                                                                v5 = 6408;
                                                                                                                                                                                if (var1_2 == null) break block119;
                                                                                                                                                                                if (v4 != v5) break block118;
                                                                                                                                                                                cS.cM[1] = 34836;
                                                                                                                                                                                if (var1_2 != null) break block112;
                                                                                                                                                                            }
                                                                                                                                                                            v6 = a9.d(var9_11);
                                                                                                                                                                            v5 = v6;
                                                                                                                                                                            v4 = v6;
                                                                                                                                                                        }
                                                                                                                                                                        var10_13 = v5;
                                                                                                                                                                    }
                                                                                                                                                                    if (var1_2 == null) break block120;
                                                                                                                                                                    if (v4 < 0) break block121;
                                                                                                                                                                    cS.bX = Math.max(cS.bX, var10_13 + 1);
                                                                                                                                                                    if (var1_2 != null) break block112;
                                                                                                                                                                }
                                                                                                                                                                v4 = var9_11.equals("centerDepthSmooth") ? 1 : 0;
                                                                                                                                                            }
                                                                                                                                                            if (var1_2 != null && v4 != 0) {
                                                                                                                                                                cS.cx = 1;
                                                                                                                                                                v4 = cS.cx ? 1 : 0;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        if (var1_2 != null) continue;
                                                                                                                                                    }
                                                                                                                                                    v3 = var8_10.a("shadowMapResolution");
                                                                                                                                                }
                                                                                                                                                if (var1_2 == null) break block122;
                                                                                                                                                if (v3 != 0) break block123;
                                                                                                                                                v3 = var8_10.c("SHADOWRES");
                                                                                                                                                if (var1_2 == null) break block122;
                                                                                                                                                if (v3 != 0) break block123;
                                                                                                                                                v7 = var8_10.d("shadowMapFov");
                                                                                                                                                if (var1_2 == null) break block124;
                                                                                                                                                if (v7) break block125;
                                                                                                                                                v7 = var8_10.c("SHADOWFOV");
                                                                                                                                                if (var1_2 == null) break block124;
                                                                                                                                                if (v7) break block125;
                                                                                                                                                v8 = var8_10.d("shadowDistance");
                                                                                                                                                if (var1_2 == null) break block126;
                                                                                                                                                if (v8) break block127;
                                                                                                                                                v8 = var8_10.c("SHADOWHPL");
                                                                                                                                                if (var1_2 == null) break block126;
                                                                                                                                                if (v8) break block127;
                                                                                                                                                v9 = var8_10.d("shadowDistanceRenderMul");
                                                                                                                                                if (var1_2 != null) {
                                                                                                                                                    if (v9) {
                                                                                                                                                        cS.bq = var8_10.f();
                                                                                                                                                        fC.b("Shadow distance render mul: " + cS.bq);
                                                                                                                                                        if (var1_2 != null) continue;
                                                                                                                                                    }
                                                                                                                                                    v9 = var8_10.d("shadowIntervalSize");
                                                                                                                                                }
                                                                                                                                                if (var1_2 != null) {
                                                                                                                                                    if (v9) {
                                                                                                                                                        cS.an = var8_10.f();
                                                                                                                                                        fC.b("Shadow map interval size: " + cS.an);
                                                                                                                                                        if (var1_2 != null) continue;
                                                                                                                                                    }
                                                                                                                                                    v9 = var8_10.a("generateShadowMipmap", true);
                                                                                                                                                }
                                                                                                                                                if (var1_2 != null) {
                                                                                                                                                    if (v9) {
                                                                                                                                                        Arrays.fill(cS.du, true);
                                                                                                                                                        fC.b("Generate shadow mipmap");
                                                                                                                                                        if (var1_2 != null) continue;
                                                                                                                                                    }
                                                                                                                                                    v9 = var8_10.a("generateShadowColorMipmap", true);
                                                                                                                                                }
                                                                                                                                                if (var1_2 != null) {
                                                                                                                                                    if (v9) {
                                                                                                                                                        Arrays.fill(cS.dP, true);
                                                                                                                                                        fC.b("Generate shadow color mipmap");
                                                                                                                                                        if (var1_2 != null) continue;
                                                                                                                                                    }
                                                                                                                                                    v9 = var8_10.a("shadowHardwareFiltering", true);
                                                                                                                                                }
                                                                                                                                                if (var1_2 != null) {
                                                                                                                                                    if (v9) {
                                                                                                                                                        Arrays.fill(cS.aE, true);
                                                                                                                                                        fC.b("Hardware shadow filtering enabled.");
                                                                                                                                                        if (var1_2 != null) continue;
                                                                                                                                                    }
                                                                                                                                                    v9 = var8_10.a("shadowHardwareFiltering0", true);
                                                                                                                                                }
                                                                                                                                                if (var1_2 != null) {
                                                                                                                                                    if (v9) {
                                                                                                                                                        cS.aE[0] = true;
                                                                                                                                                        fC.b("shadowHardwareFiltering0");
                                                                                                                                                        if (var1_2 != null) continue;
                                                                                                                                                    }
                                                                                                                                                    v9 = var8_10.a("shadowHardwareFiltering1", true);
                                                                                                                                                }
                                                                                                                                                if (var1_2 != null) {
                                                                                                                                                    if (v9) {
                                                                                                                                                        cS.aE[1] = true;
                                                                                                                                                        fC.b("shadowHardwareFiltering1");
                                                                                                                                                        if (var1_2 != null) continue;
                                                                                                                                                    }
                                                                                                                                                    v9 = var8_10.a("shadowtex0Mipmap", "shadowtexMipmap", true);
                                                                                                                                                }
                                                                                                                                                if (var1_2 != null) {
                                                                                                                                                    if (v9) {
                                                                                                                                                        cS.du[0] = true;
                                                                                                                                                        fC.b("shadowtex0Mipmap");
                                                                                                                                                        if (var1_2 != null) continue;
                                                                                                                                                    }
                                                                                                                                                    v9 = var8_10.a("shadowtex1Mipmap", true);
                                                                                                                                                }
                                                                                                                                                if (var1_2 != null) {
                                                                                                                                                    if (v9) {
                                                                                                                                                        cS.du[1] = true;
                                                                                                                                                        fC.b("shadowtex1Mipmap");
                                                                                                                                                        if (var1_2 != null) continue;
                                                                                                                                                    }
                                                                                                                                                    v9 = var8_10.a("shadowcolor0Mipmap", "shadowColor0Mipmap", true);
                                                                                                                                                }
                                                                                                                                                if (var1_2 != null) {
                                                                                                                                                    if (v9) {
                                                                                                                                                        cS.dP[0] = true;
                                                                                                                                                        fC.b("shadowcolor0Mipmap");
                                                                                                                                                        if (var1_2 != null) continue;
                                                                                                                                                    }
                                                                                                                                                    v9 = var8_10.a("shadowcolor1Mipmap", "shadowColor1Mipmap", true);
                                                                                                                                                }
                                                                                                                                                if (var1_2 != null) {
                                                                                                                                                    if (v9) {
                                                                                                                                                        cS.dP[1] = true;
                                                                                                                                                        fC.b("shadowcolor1Mipmap");
                                                                                                                                                        if (var1_2 != null) continue;
                                                                                                                                                    }
                                                                                                                                                    v9 = var8_10.a("shadowtex0Nearest", "shadowtexNearest", "shadow0MinMagNearest", true);
                                                                                                                                                }
                                                                                                                                                if (var1_2 != null) {
                                                                                                                                                    if (v9) {
                                                                                                                                                        cS.z[0] = true;
                                                                                                                                                        fC.b("shadowtex0Nearest");
                                                                                                                                                        if (var1_2 != null) continue;
                                                                                                                                                    }
                                                                                                                                                    v9 = var8_10.a("shadowtex1Nearest", "shadow1MinMagNearest", true);
                                                                                                                                                }
                                                                                                                                                if (var1_2 != null) {
                                                                                                                                                    if (v9) {
                                                                                                                                                        cS.z[1] = true;
                                                                                                                                                        fC.b("shadowtex1Nearest");
                                                                                                                                                        if (var1_2 != null) continue;
                                                                                                                                                    }
                                                                                                                                                    v9 = var8_10.a("shadowcolor0Nearest", "shadowColor0Nearest", "shadowColor0MinMagNearest", true);
                                                                                                                                                }
                                                                                                                                                if (var1_2 != null) {
                                                                                                                                                    if (v9) {
                                                                                                                                                        cS.dm[0] = true;
                                                                                                                                                        fC.b("shadowcolor0Nearest");
                                                                                                                                                        if (var1_2 != null) continue;
                                                                                                                                                    }
                                                                                                                                                    v9 = var8_10.a("shadowcolor1Nearest", "shadowColor1Nearest", "shadowColor1MinMagNearest", true);
                                                                                                                                                }
                                                                                                                                                if (var1_2 == null) break block128;
                                                                                                                                                if (v9) {
                                                                                                                                                    cS.dm[1] = true;
                                                                                                                                                    fC.b("shadowcolor1Nearest");
                                                                                                                                                    if (var1_2 != null) continue;
                                                                                                                                                }
                                                                                                                                                v10 = var8_10;
                                                                                                                                                if (var1_2 == null) break block129;
                                                                                                                                                v9 = v10.d("wetnessHalflife");
                                                                                                                                            }
                                                                                                                                            if (v9) break block130;
                                                                                                                                            v10 = var8_10;
                                                                                                                                            if (var1_2 == null) break block129;
                                                                                                                                            if (v10.c("WETNESSHL")) break block130;
                                                                                                                                            v11 = var8_10;
                                                                                                                                            if (var1_2 == null) break block131;
                                                                                                                                            if (v11.d("drynessHalflife")) break block132;
                                                                                                                                            v11 = var8_10;
                                                                                                                                            if (var1_2 == null) break block131;
                                                                                                                                            if (v11.c("DRYNESSHL")) break block132;
                                                                                                                                            v12 = var8_10.d("eyeBrightnessHalflife");
                                                                                                                                            if (var1_2 != null) {
                                                                                                                                                if (v12) {
                                                                                                                                                    cS.J = var8_10.f();
                                                                                                                                                    fC.b("Eye brightness halflife: " + cS.J);
                                                                                                                                                    if (var1_2 != null) continue;
                                                                                                                                                }
                                                                                                                                                v12 = var8_10.d("centerDepthHalflife");
                                                                                                                                            }
                                                                                                                                            if (var1_2 != null) {
                                                                                                                                                if (v12) {
                                                                                                                                                    cS.cv = var8_10.f();
                                                                                                                                                    fC.b("Center depth halflife: " + cS.cv);
                                                                                                                                                    if (var1_2 != null) continue;
                                                                                                                                                }
                                                                                                                                                v12 = var8_10.d("sunPathRotation");
                                                                                                                                            }
                                                                                                                                            if (var1_2 != null) {
                                                                                                                                                if (v12) {
                                                                                                                                                    cS.bm = var8_10.f();
                                                                                                                                                    fC.b("Sun path rotation: " + cS.bm);
                                                                                                                                                    if (var1_2 != null) continue;
                                                                                                                                                }
                                                                                                                                                v12 = var8_10.d("ambientOcclusionLevel");
                                                                                                                                            }
                                                                                                                                            if (var1_2 != null) {
                                                                                                                                                if (v12) {
                                                                                                                                                    cS.as = fU.a(var8_10.f(), 0.0f, 1.0f);
                                                                                                                                                    fC.b("AO Level: " + cS.as);
                                                                                                                                                    if (var1_2 != null) continue;
                                                                                                                                                }
                                                                                                                                                v12 = var8_10.a("superSamplingLevel");
                                                                                                                                            }
                                                                                                                                            if (var1_2 == null) break block133;
                                                                                                                                            if (!v12) break block134;
                                                                                                                                            v13 = var9_12 = var8_10.d();
                                                                                                                                            if (var1_2 == null) break block135;
                                                                                                                                            if (v13 <= 1) break block136;
                                                                                                                                            fC.b("Super sampling level: " + var9_12 + "x");
                                                                                                                                            cS.a4 = var9_12;
                                                                                                                                            if (var1_2 != null) break block135;
                                                                                                                                        }
                                                                                                                                        v13 = cS.a4 = 1;
                                                                                                                                    }
                                                                                                                                    if (var1_2 != null) continue;
                                                                                                                                }
                                                                                                                                v12 = var8_10.a("noiseTextureResolution");
                                                                                                                            }
                                                                                                                            if (var1_2 != null) {
                                                                                                                                if (v12) {
                                                                                                                                    cS.ai = var8_10.d();
                                                                                                                                    cS.dp = true;
                                                                                                                                    fC.b("Noise texture enabled");
                                                                                                                                    fC.b("Noise texture resolution: " + cS.ai);
                                                                                                                                    if (var1_2 != null) continue;
                                                                                                                                }
                                                                                                                                v12 = var8_10.b("Format");
                                                                                                                            }
                                                                                                                            if (var1_2 == null) break block137;
                                                                                                                            if (!v12) break block138;
                                                                                                                            var9_11 = dQ.g(var8_10.g(), "Format");
                                                                                                                            var10_14 = var8_10.i();
                                                                                                                            var11_17 = cS.n(var9_11);
                                                                                                                            var12_18 = cS.l(var10_14);
                                                                                                                            v14 = var11_17;
                                                                                                                            if (var1_2 == null) break block139;
                                                                                                                            if (v14 < 0) break block140;
                                                                                                                            v14 = var12_18;
                                                                                                                        }
                                                                                                                        if (v14 != 0) {
                                                                                                                            cS.cM[var11_17] = var12_18;
                                                                                                                            fC.b("%s format: %s", new Object[]{var9_11, var10_14});
                                                                                                                        }
                                                                                                                    }
                                                                                                                    if (var1_2 != null) continue;
                                                                                                                }
                                                                                                                v12 = var8_10.b("Clear", false);
                                                                                                            }
                                                                                                            if (var1_2 == null) break block141;
                                                                                                            if (!v12) break block142;
                                                                                                            v15 = var0;
                                                                                                            if (var1_2 != null) {
                                                                                                                if (!a9.g(v15)) continue;
                                                                                                                v15 = dQ.g(var8_10.g(), "Clear");
                                                                                                            }
                                                                                                            var9_11 = v15;
                                                                                                            var10_15 = cS.n(var9_11);
                                                                                                            if (var1_2 == null) break block143;
                                                                                                            if (var10_15 < 0) break block144;
                                                                                                            cS.aj[var10_15] = false;
                                                                                                        }
                                                                                                        fC.b("%s clear disabled", new Object[]{var9_11});
                                                                                                    }
                                                                                                    if (var1_2 != null) continue;
                                                                                                }
                                                                                                v12 = var8_10.b("GAUX4FORMAT", "RGBA32F");
                                                                                            }
                                                                                            if (var1_2 != null) {
                                                                                                if (v12) {
                                                                                                    cS.cM[7] = 34836;
                                                                                                    fC.b("gaux4 format : RGB32AF");
                                                                                                    if (var1_2 != null) continue;
                                                                                                }
                                                                                                v12 = var8_10.b("GAUX4FORMAT", "RGB32F");
                                                                                            }
                                                                                            if (var1_2 != null) {
                                                                                                if (v12) {
                                                                                                    cS.cM[7] = 34837;
                                                                                                    fC.b("gaux4 format : RGB32F");
                                                                                                    if (var1_2 != null) continue;
                                                                                                }
                                                                                                v12 = var8_10.b("GAUX4FORMAT", "RGB16");
                                                                                            }
                                                                                            if (var1_2 != null) {
                                                                                                if (v12) {
                                                                                                    cS.cM[7] = 32852;
                                                                                                    fC.b("gaux4 format : RGB16");
                                                                                                    if (var1_2 != null) continue;
                                                                                                }
                                                                                                v12 = var8_10.b("MipmapEnabled", true);
                                                                                            }
                                                                                            if (var1_2 == null) break block145;
                                                                                            if (!v12) break block146;
                                                                                            v16 = var0;
                                                                                            if (var1_2 != null) {
                                                                                                if (!a9.g(v16)) {
                                                                                                    v16 = var0;
                                                                                                    if (var1_2 != null) {
                                                                                                        if (!a9.h(v16)) continue;
                                                                                                    }
                                                                                                } else {
                                                                                                    v16 = dQ.g(var8_10.g(), "MipmapEnabled");
                                                                                                }
                                                                                            }
                                                                                            var9_11 = v16;
                                                                                            v17 = var10_16 = cS.n(var9_11);
                                                                                            if (var1_2 == null) break block147;
                                                                                            if (v17 < 0) break block148;
                                                                                            v17 = cS.dT | 1 << var10_16;
                                                                                        }
                                                                                        cS.dT = v17;
                                                                                        fC.b("%s mipmap enabled", new Object[]{var9_11});
                                                                                    }
                                                                                    if (var1_2 != null) continue;
                                                                                }
                                                                                v18 = var8_10;
                                                                                if (var1_2 == null) break block149;
                                                                                v12 = v18.c("DRAWBUFFERS");
                                                                            }
                                                                            if (!v12) continue;
                                                                            v18 = var8_10;
                                                                        }
                                                                        v19 = var9_11 = v18.i();
                                                                        if (var1_2 == null) break block150;
                                                                        if (!a9.a(v19)) break block151;
                                                                        cS.ah = var9_11;
                                                                        if (var1_2 != null) break block152;
                                                                    }
                                                                    v19 = "Invalid draw buffers: " + var9_11;
                                                                }
                                                                fC.c(v19);
                                                            }
                                                            if (var1_2 != null) continue;
                                                        }
                                                        v11 = var8_10;
                                                    }
                                                    cS.c8 = v11.f();
                                                    fC.b("Dryness halflife: " + cS.c8);
                                                    if (var1_2 != null) continue;
                                                }
                                                v10 = var8_10;
                                            }
                                            cS.aK = v10.f();
                                            fC.b("Wetness halflife: " + cS.aK);
                                            if (var1_2 != null) continue;
                                        }
                                        cS.cs = var8_10.f();
                                        v8 = true;
                                    }
                                    cS.ds = v8;
                                    fC.b("Shadow map distance: " + cS.cs);
                                    if (var1_2 != null) continue;
                                }
                                cS.aP = var8_10.f();
                                v7 = false;
                            }
                            cS.ds = v7;
                            fC.b("Shadow map field of view: " + cS.aP);
                            if (var1_2 != null) continue;
                        }
                        cS.c3 = cS.dH = var8_10.d();
                        v3 = Math.round((float)cS.c3 * cS.dL);
                    }
                    cS.dN = v3 ? 1 : 0;
                    fC.b("Shadow map resolution: " + cS.c3);
                } while (var1_2 != null);
            }
            catch (Exception var7_9) {
                fC.d("Couldn't read " + var0 + "!");
                var7_9.printStackTrace();
                ARBShaderObjects.glDeleteObjectARB((int)var2_1);
                return 0;
            }
        }
        v20 = cS.bn;
        if (var1_2 != null) {
            if (v20 != 0) {
                cS.c(var0, var3_3.toString());
            }
            ARBShaderObjects.glShaderSourceARB((int)var2_1, (CharSequence)var3_3);
            ARBShaderObjects.glCompileShaderARB((int)var2_1);
            v20 = GL20.glGetShaderi((int)var2_1, (int)35713);
        }
        if (var1_2 == null) return v20;
        if (v20 != 1) {
            fC.d("Error compiling fragment shader: " + var0);
        }
        cS.a(var2_1, var0, var6_7);
        v20 = var2_1;
        return v20;
    }

    public static void q() {
        block6: {
            int n2;
            String string;
            block5: {
                string = dB.i();
                n2 = dn;
                if (string == null) break block5;
                if (n2 != 0) break block6;
                n2 = bo;
            }
            int n3 = 3;
            if (string != null) {
                if (n2 >= n3) {
                    net.minecraft.client.a.v.u(33996);
                    GL11.glCopyTexSubImage2D((int)3553, (int)0, (int)0, (int)0, (int)0, (int)0, (int)cQ, (int)bw);
                    net.minecraft.client.a.v.u(33984);
                }
                net.minecraft.client.a.v.t();
                net.minecraft.client.a.v.a();
                n2 = 770;
                n3 = 771;
            }
            net.minecraft.client.a.v.f(n2, n3);
            net.minecraft.client.a.v.e();
            cS.a(20);
        }
    }

    private static void aQ() {
        block2: {
            String string = dB.i();
            bu bu2 = K;
            if (string != null) {
                if (bu2 == null && de != null) {
                    K = cS.a(15, de);
                }
                bu2 = K;
            }
            if (bu2 != null) break block2;
            K = new ej(ai, ai);
        }
    }

    public static void a(boolean bl2, boolean bl3) {
        d6 = bl2;
        aB = bl3;
    }

    private static int l(String string) {
        int n2;
        block4: {
            string = string.trim();
            int n3 = 0;
            String string2 = dB.i();
            while (n3 < c0.length) {
                String string3 = c0[n3];
                if (string2 != null) {
                    n2 = string.equals(string3) ? 1 : 0;
                    if (string2 == null) break block4;
                    if (n2 != 0) {
                        return b3[n3];
                    }
                    ++n3;
                }
                if (string2 != null) continue;
            }
            n2 = 0;
        }
        return n2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static int f(String var0) {
        block21: {
            var2_1 = ARBShaderObjects.glCreateShaderObjectARB((int)35633);
            var1_2 = dB.i();
            v0 = var2_1;
            if (var1_2 == null) return v0;
            if (v0 == 0) {
                return 0;
            }
            var3_3 = new StringBuilder(131072);
            var4_4 = null;
            try {
                var4_4 = new BufferedReader(new InputStreamReader(cS.cq.a(var0)));
            }
            catch (Exception var5_5) {
                ARBShaderObjects.glDeleteObjectARB((int)var2_1);
                return 0;
            }
            var5_6 = cS.a(cS.b7);
            var6_7 = new ArrayList<String>();
            v1 = var4_4;
            if (var1_2 == null) ** GOTO lbl22
            if (v1 == null) break block21;
            try {
                v1 = var4_4 = gi.a(var4_4, var0, cS.cq, 0, var6_7, 0);
lbl22:
                // 2 sources

                do {
                    if ((var7_8 = var4_4.readLine()) == null) {
                        var4_4.close();
                        if (var1_2 != null) {
                            if (var1_2 != null) break;
                        }
                    } else {
                        var7_8 = cS.a(var7_8, var5_6);
                        var3_3.append(var7_8).append('\n');
                    }
                    v2 = var7_8.matches("attribute [_a-zA-Z0-9]+ mc_Entity.*");
                    if (var1_2 != null) {
                        if (v2) {
                            cS.a7 = true;
                            cS.l = true;
                            if (var1_2 != null) continue;
                        }
                        v2 = var7_8.matches("attribute [_a-zA-Z0-9]+ mc_midTexCoord.*");
                    }
                    if (var1_2 != null) {
                        if (v2) {
                            cS.c = true;
                            cS.cc = true;
                            if (var1_2 != null) continue;
                        }
                        v2 = var7_8.matches(".*gl_MultiTexCoord3.*");
                    }
                    if (var1_2 != null) {
                        if (v2) {
                            cS.cZ = true;
                            if (var1_2 != null) continue;
                        }
                        v2 = var7_8.matches("attribute [_a-zA-Z0-9]+ at_tangent.*");
                    }
                    if (var1_2 == null || !v2) continue;
                    cS.ba = true;
                    v2 = cS.d9 = true;
                } while (var1_2 != null);
            }
            catch (Exception var7_9) {
                fC.d("Couldn't read " + var0 + "!");
                var7_9.printStackTrace();
                ARBShaderObjects.glDeleteObjectARB((int)var2_1);
                return 0;
            }
        }
        v3 = cS.bn;
        if (var1_2 != null) {
            if (v3 != 0) {
                cS.c(var0, var3_3.toString());
            }
            ARBShaderObjects.glShaderSourceARB((int)var2_1, (CharSequence)var3_3);
            ARBShaderObjects.glCompileShaderARB((int)var2_1);
            v3 = GL20.glGetShaderi((int)var2_1, (int)35713);
        }
        if (var1_2 == null) return v3;
        if (v3 != 1) {
            fC.d("Error compiling vertex shader: " + var0);
        }
        cS.a(var2_1, var0, var6_7);
        v3 = var2_1;
        return v3;
    }

    public static void az() {
        cS.a(2);
    }

    public static void g() {
        block4: {
            int n2;
            block5: {
                block6: {
                    String string;
                    block2: {
                        block3: {
                            string = dB.i();
                            n2 = cW;
                            if (string == null) break block2;
                            if (n2 == 0) break block3;
                            cS.a(4);
                            if (string != null) break block4;
                        }
                        n2 = bf;
                    }
                    if (string == null) break block5;
                    if (n2 == 2) break block6;
                    n2 = bf;
                    if (string == null) break block5;
                    if (n2 != 3) break block4;
                }
                n2 = 1;
            }
            cS.a(n2);
        }
    }

    public static void c(int n2, int n3) {
        block2: {
            int n4;
            block1: {
                String string = dB.i();
                GL11.glFogi((int)n2, (int)n3);
                String string2 = string;
                n4 = n2;
                if (string2 == null) break block1;
                if (n4 != 2917) break block2;
                ea = n3;
                n4 = bB ? 1 : 0;
            }
            if (n4 != 0) {
                cS.b("fogMode", ea);
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean W() {
        String string = dB.i();
        boolean bl2 = y;
        if (string != null) {
            if (!bl2) return false;
            bl2 = cO;
        }
        if (string == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public static void aw() {
        block5: {
            int n2;
            String string;
            block4: {
                string = dB.i();
                n2 = dj;
                if (string == null) break block4;
                if (n2 == 0) break block5;
                cS.a("endBlockEntities");
                n2 = aI ? 1 : 0;
            }
            if (string != null) {
                n2 = n2 != 0 ? 3 : 2;
            }
            cS.a(n2);
            s.b(dY.a());
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void C() {
        block43: {
            int n2;
            int n3;
            String string;
            block40: {
                block39: {
                    block48: {
                        int n4;
                        block38: {
                            int n5;
                            block46: {
                                int n6;
                                block47: {
                                    block37: {
                                        block44: {
                                            int n7;
                                            block45: {
                                                block42: {
                                                    string = dB.i();
                                                    n7 = dn;
                                                    if (string == null) break block42;
                                                    if (n7 != 0) break block43;
                                                    cS.a("pre-renderCompositeFinal");
                                                    GL11.glPushMatrix();
                                                    GL11.glLoadIdentity();
                                                    GL11.glMatrixMode((int)5889);
                                                    GL11.glPushMatrix();
                                                    GL11.glLoadIdentity();
                                                    GL11.glOrtho((double)0.0, (double)1.0, (double)0.0, (double)1.0, (double)0.0, (double)1.0);
                                                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                                                    net.minecraft.client.a.v.x();
                                                    net.minecraft.client.a.v.v();
                                                    net.minecraft.client.a.v.f();
                                                    net.minecraft.client.a.v.t();
                                                    net.minecraft.client.a.v.o(519);
                                                    net.minecraft.client.a.v.a(false);
                                                    net.minecraft.client.a.v.y();
                                                    n7 = ei;
                                                }
                                                if (string == null) break block44;
                                                if (n7 < 1) break block45;
                                                net.minecraft.client.a.v.u(33988);
                                                net.minecraft.client.a.v.t(h.get(0));
                                                n7 = ei;
                                                if (string == null) break block44;
                                                if (n7 >= 2) {
                                                    net.minecraft.client.a.v.u(33989);
                                                    net.minecraft.client.a.v.t(h.get(1));
                                                }
                                            }
                                            n7 = n5 = 0;
                                        }
                                        while (n5 < bX) {
                                            net.minecraft.client.a.v.u(33984 + dF[n5]);
                                            net.minecraft.client.a.v.t(bE[n5]);
                                            ++n5;
                                            if (string != null) {
                                                if (string != null) continue;
                                            }
                                            break block37;
                                        }
                                        net.minecraft.client.a.v.u(33990);
                                        net.minecraft.client.a.v.t(dB.get(0));
                                    }
                                    n6 = bo;
                                    if (string == null) break block46;
                                    if (n6 < 2) break block47;
                                    net.minecraft.client.a.v.u(33995);
                                    net.minecraft.client.a.v.t(dB.get(1));
                                    n6 = bo;
                                    if (string == null) break block46;
                                    if (n6 >= 3) {
                                        net.minecraft.client.a.v.u(33996);
                                        net.minecraft.client.a.v.t(dB.get(2));
                                    }
                                }
                                n6 = n5 = 0;
                            }
                            while (n5 < ac) {
                                net.minecraft.client.a.v.u(33997 + n5);
                                net.minecraft.client.a.v.t(aS.get(n5));
                                ++n5;
                                if (string != null) {
                                    if (string != null) continue;
                                }
                                break block38;
                            }
                            n4 = dp;
                            if (string == null) break block48;
                            if (n4 != 0) {
                                net.minecraft.client.a.v.u(33984 + K.a());
                                net.minecraft.client.a.v.t(K.b());
                                GL11.glTexParameteri((int)3553, (int)10242, (int)10497);
                                GL11.glTexParameteri((int)3553, (int)10243, (int)10497);
                                GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
                                GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
                            }
                            cS.b(bs);
                            net.minecraft.client.a.v.u(33984);
                            n5 = 1;
                        }
                        n4 = n3 = 0;
                    }
                    while (n3 < bX) {
                        EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)(36064 + n3), (int)3553, (int)bE[8 + n3], (int)0);
                        ++n3;
                        if (string != null) {
                            if (string != null) continue;
                        }
                        break block39;
                    }
                    EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)36096, (int)3553, (int)dB.get(0), (int)0);
                    GL20.glDrawBuffers((IntBuffer)dx);
                    cS.a("pre-composite");
                }
                for (n3 = 0; n3 < 8; ++n3) {
                    int n8;
                    block41: {
                        void var3_3;
                        int n9;
                        n2 = ef[21 + n3];
                        if (string == null) break block40;
                        if (string != null) {
                            if (n2 == 0) continue;
                            cS.a(21 + n3);
                            cS.a(cG[21 + n3]);
                            n9 = dO;
                        }
                        if (string != null) {
                            if (n9 != 0) {
                                cS.ah();
                            }
                            cS.j();
                            n9 = var3_3 = 0;
                        }
                        while (var3_3 < bX) {
                            block50: {
                                int n10;
                                block49: {
                                    n8 = t[21 + n3][var3_3];
                                    if (string == null) break block41;
                                    if (string == null) break block49;
                                    if (n8 == 0) break block50;
                                    n10 = aZ[var3_3];
                                }
                                void var4_4 = n10;
                                int n11 = cS.aZ[var3_3] = 8 - var4_4;
                                net.minecraft.client.a.v.u(33984 + dF[var3_3]);
                                net.minecraft.client.a.v.t(bE[n11 + var3_3]);
                                EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)(36064 + var3_3), (int)3553, (int)bE[var4_4 + var3_3], (int)0);
                            }
                            ++var3_3;
                            if (string != null) continue;
                        }
                        n8 = 33984;
                    }
                    net.minecraft.client.a.v.u(n8);
                    if (string != null) continue;
                }
                cS.a("composite");
                cE = false;
                a2.ao().a(true);
                net.minecraft.client.a.as.a(net.minecraft.client.a.as.f, net.minecraft.client.a.as.D, 3553, cS.a2.ao().d, 0);
                GL11.glViewport((int)0, (int)0, (int)cS.a2.P, (int)cS.a2.aT);
                n2 = net.minecraft.client.a.x.S ? 1 : 0;
            }
            if (string != null) {
                if (n2 != 0) {
                    int n12 = net.minecraft.client.a.x.u;
                    if (string != null) {
                        n12 = n12 != 0 ? 1 : 0;
                    }
                    int n13 = n3 = n12;
                    if (string != null) {
                        n13 = n13 == 0 ? 1 : 0;
                    }
                    int n14 = n3;
                    if (string != null) {
                        n14 = n14 == 0 ? 1 : 0;
                    }
                    net.minecraft.client.a.v.a(n3 != 0, n13 != 0, n14 != 0, true);
                }
                net.minecraft.client.a.v.a(true);
                GL11.glClearColor((float)eg, (float)dU, (float)aD, (float)1.0f);
                GL11.glClear((int)16640);
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                net.minecraft.client.a.v.x();
                net.minecraft.client.a.v.v();
                net.minecraft.client.a.v.f();
                net.minecraft.client.a.v.t();
                net.minecraft.client.a.v.o(519);
                net.minecraft.client.a.v.a(false);
                cS.a("pre-final");
                cS.a(29);
                cS.a("final");
                n2 = dO;
            }
            if (string != null) {
                if (n2 != 0) {
                    cS.ah();
                }
                cS.j();
                cS.a("renderCompositeFinal");
                P = true;
                net.minecraft.client.a.v.j();
                net.minecraft.client.a.v.x();
                net.minecraft.client.a.v.e();
                net.minecraft.client.a.v.a();
                net.minecraft.client.a.v.o(515);
                net.minecraft.client.a.v.a(true);
                GL11.glPopMatrix();
                GL11.glMatrixMode((int)5888);
                GL11.glPopMatrix();
                n2 = 0;
            }
            cS.a(n2);
        }
    }

    public static void d(int n2) {
        GL11.glEnable((int)n2);
        cS.Q();
    }

    public static void aK() {
        bB = false;
        cS.b("fogMode", 0);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static void af() {
        cS.b9 = new HashMap<String, String>();
        var0 = dB.i();
        if (cS.E == false) return;
        var1_1 = new ArrayList<String>();
        var2_2 = "/shaders/lang/";
        var3_3 = "en_US";
        var4_4 = ".lang";
        v0 = var1_1;
        if (var0 == null) ** GOTO lbl17
        v0.add(var2_2 + var3_3 + var4_4);
        if (!fU.a().bM.equals(var3_3)) {
            var1_1.add(var2_2 + fU.a().bM + var4_4);
        }
        try {
            v0 = var1_1;
lbl17:
            // 2 sources

            var5_5 = v0.iterator();
            do lbl-1000:
            // 3 sources

            {
                if (var5_5.hasNext() == false) return;
                var6_7 = (String)var5_5.next();
                var7_8 = cS.cq.a(var6_7);
                if (var0 == null) return;
                if (var7_8 == null) continue;
                var8_9 = new Properties();
                gl.a(var7_8, var8_9);
                var7_8.close();
                for (Object var10_11 : var8_9.keySet()) {
                    var11_12 = var8_9.getProperty((String)var10_11);
                    cS.b9.put((String)var10_11, var11_12);
                    if (var0 == null) ** GOTO lbl-1000
                    if (var0 != null) continue;
                }
            } while (var0 != null);
            return;
        }
        catch (IOException var5_6) {
            var5_6.printStackTrace();
        }
    }

    public static void y() {
        cS.a("beginUpdateChunks1");
        String string = dB.i();
        cS.g("beginUpdateChunks1");
        String string2 = string;
        int n2 = dn;
        if (string2 != null) {
            if (n2 == 0) {
                cS.a(7);
            }
            cS.a("beginUpdateChunks2");
            n2 = cS.g("beginUpdateChunks2");
        }
    }

    public static void at() {
        cS.a("pre endHand");
        cS.g("pre endHand");
        GL11.glMatrixMode((int)5889);
        GL11.glPopMatrix();
        GL11.glMatrixMode((int)5888);
        GL11.glPopMatrix();
        net.minecraft.client.a.v.f(770, 771);
        cS.a("endHand");
    }

    public static void aU() {
        cS.a(3);
    }

    public static void ar() {
        block3: {
            int n2;
            int n3;
            block4: {
                String string;
                block2: {
                    string = dB.i();
                    n3 = dj;
                    if (string == null) break block2;
                    if (n3 == 0) break block3;
                    n3 = ef[18];
                }
                n2 = ef[0];
                if (string == null) break block4;
                if (n3 == n2) break block3;
                cS.a(18);
                net.minecraft.client.a.v.e();
                net.minecraft.client.a.v.a(516, 0.0f);
                n3 = 770;
                n2 = 771;
            }
            net.minecraft.client.a.v.f(n3, n2);
        }
    }

    public static void z() {
        block3: {
            double d10;
            double d11;
            block2: {
                String string = dB.i();
                d11 = cd;
                d10 = 1.0;
                if (string == null) break block2;
                if (d11 == d10) break block3;
                d11 = 1.0;
                d10 = 1.0;
            }
            GL11.glScaled((double)d11, (double)d10, (double)cd);
        }
    }

    private static boolean a(d d10) {
        net.minecraft.ar.aC aC2;
        K k2;
        k k3;
        String string = dB.i();
        d d11 = d10;
        if (string != null) {
            if (d11 == null) {
                return false;
            }
            d11 = d10;
        }
        k k4 = k3 = d11.w();
        if (string != null) {
            if (k4 == null) {
                return false;
            }
            k4 = k3;
        }
        if (string != null) {
            if (!(k4 instanceof net.minecraft.w.s)) {
                return false;
            }
            k4 = k3;
        }
        net.minecraft.w.s s2 = (net.minecraft.w.s)k4;
        K k5 = k2 = s2.a();
        if (string != null) {
            if (k5 == null) {
                return false;
            }
            k5 = k2;
        }
        return (aC2 = k5.p()) == net.minecraft.ar.aC.TRANSLUCENT;
    }

    public static void b(boolean bl2, boolean bl3) {
        y = bl2;
        cO = bl3;
    }

    public static void ai() {
        cS.O();
        GL11.glColor3f((float)bY, (float)at, (float)d8);
        cS.aq();
        GL11.glColor3f((float)e, (float)af, (float)cu);
    }

    /*
     * Exception decompiling
     */
    public static void a(Q var0, float var1_1, long var2_2) {
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

    public static void J() {
        block3: {
            int n2;
            block2: {
                String string = dB.i();
                n2 = dj;
                if (string == null) break block2;
                if (n2 == 0) break block3;
                n2 = 14;
            }
            cS.a(n2);
        }
    }

    public static void ah() {
        block5: {
            int n2;
            block3: {
                int n3;
                String string;
                block4: {
                    string = dB.i();
                    int n4 = x;
                    if (string == null) break block4;
                    if (n4 == 0) break block5;
                    n4 = n3 = 0;
                }
                while (n3 < bX) {
                    block7: {
                        int n5;
                        block6: {
                            n2 = dO & 1 << n3;
                            if (string == null) break block3;
                            if (string == null) break block6;
                            if (n2 == 0) break block7;
                            net.minecraft.client.a.v.u(33984 + dF[n3]);
                            GL11.glTexParameteri((int)3553, (int)10241, (int)9987);
                            n5 = 3553;
                        }
                        GL30.glGenerateMipmap((int)n5);
                    }
                    ++n3;
                    if (string != null) continue;
                }
                n2 = 33984;
            }
            net.minecraft.client.a.v.u(n2);
        }
    }

    public static void I() {
        cS.a(3);
    }

    private static void a(z z2) {
        block3: {
            block7: {
                boolean bl2;
                block6: {
                    z z3;
                    String string;
                    block5: {
                        z z4;
                        block4: {
                            z z5;
                            block2: {
                                string = dB.i();
                                z5 = ar;
                                if (string == null) break block2;
                                if (z5 == z2) break block3;
                                z5 = ar;
                            }
                            z4 = z5;
                            ar = z2;
                            z3 = z4;
                            if (string == null) break block4;
                            if (z3 == null) break block3;
                            z3 = z2;
                        }
                        if (string == null) break block5;
                        if (z3 == null) break block3;
                        z3 = z4;
                    }
                    int n2 = z3.D.r().a();
                    int n3 = z2.D.r().a();
                    boolean bl3 = g.contains(n2);
                    boolean bl4 = g.contains(n3);
                    bl2 = bl3;
                    if (string == null) break block6;
                    if (bl2) break block7;
                    bl2 = bl4;
                }
                if (!bl2) break block3;
            }
            cS.d();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static int b(int var0, String var1_1) {
        var2_2 = dB.i();
        v0 = var0;
        if (var2_2 != null) {
            if (v0 == 0) {
                v1 = var1_1.equals("texture");
                if (var2_2 != null) {
                    if (v1 != 0) {
                        return 0;
                    }
                    v1 = var1_1.equals("lightmap");
                }
                if (var2_2 != null) {
                    if (v1 != 0) {
                        return 1;
                    }
                    v1 = var1_1.equals("normals");
                }
                if (var2_2 != null) {
                    if (v1 != 0) {
                        return 2;
                    }
                    v1 = var1_1.equals("specular");
                }
                if (var2_2 != null) {
                    if (v1 != 0) {
                        return 3;
                    }
                    v1 = var1_1.equals("shadowtex0") ? 1 : 0;
                }
                if (var2_2 == null) return v1;
                if (v1 != 0) return 4;
                v2 = var1_1.equals("watershadow");
                if (var2_2 != null) {
                    if (v2 != 0) {
                        return 4;
                    }
                    v2 = var1_1.equals("shadow");
                }
                if (var2_2 != null) {
                    if (v2 != 0) {
                        v3 = cS.d3;
                        if (var2_2 == null) return v3;
                        if (v3 == 0) return 4;
                        return 5;
                    }
                    v2 = var1_1.equals("shadowtex1");
                }
                if (var2_2 != null) {
                    if (v2 != 0) {
                        return 5;
                    }
                    v2 = var1_1.equals("depthtex0");
                }
                if (var2_2 != null) {
                    if (v2 != 0) {
                        return 6;
                    }
                    v2 = var1_1.equals("gaux1");
                }
                if (var2_2 != null) {
                    if (v2 != 0) {
                        return 7;
                    }
                    v2 = var1_1.equals("gaux2");
                }
                if (var2_2 != null) {
                    if (v2 != 0) {
                        return 8;
                    }
                    v2 = var1_1.equals("gaux3");
                }
                if (var2_2 != null) {
                    if (v2 != 0) {
                        return 9;
                    }
                    v2 = var1_1.equals("gaux4");
                }
                if (var2_2 != null) {
                    if (v2 != 0) {
                        return 10;
                    }
                    v2 = var1_1.equals("depthtex1");
                }
                if (var2_2 != null) {
                    if (v2 != 0) {
                        return 12;
                    }
                    v2 = var1_1.equals("shadowcolor0") ? 1 : 0;
                }
                if (var2_2 == null) return v2;
                if (v2 != 0) return 13;
                v0 = var1_1.equals("shadowcolor") ? 1 : 0;
                if (var2_2 != null) {
                    if (v0 != 0) {
                        return 13;
                    }
                    v0 = var1_1.equals("shadowcolor1") ? 1 : 0;
                }
                if (var2_2 != null) {
                    if (v0 != 0) {
                        return 14;
                    }
                    v0 = var1_1.equals("noisetex") ? 1 : 0;
                }
                if (var2_2 != null) {
                    if (v0 != 0) {
                        return 15;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var0;
            }
        }
        if (var2_2 == null) return v0;
        if (v0 != 1) return -1;
        v4 = var1_1.equals("colortex0");
        if (var2_2 == null) return v4;
        if (v4 != 0) return 0;
        v5 = var1_1.equals("colortex0");
        if (var2_2 != null) {
            if (v5 != 0) {
                return 0;
            }
            v5 = var1_1.equals("colortex1") ? 1 : 0;
        }
        if (var2_2 == null) return v5;
        if (v5 != 0) return 1;
        v6 = var1_1.equals("gdepth");
        if (var2_2 != null) {
            if (v6 != 0) {
                return 1;
            }
            v6 = var1_1.equals("colortex2") ? 1 : 0;
        }
        if (var2_2 == null) return v6;
        if (v6 != 0) return 2;
        v7 = var1_1.equals("gnormal");
        if (var2_2 != null) {
            if (v7 != 0) {
                return 2;
            }
            v7 = var1_1.equals("colortex3") ? 1 : 0;
        }
        if (var2_2 == null) return v7;
        if (v7 != 0) return 3;
        v8 = var1_1.equals("composite");
        if (var2_2 != null) {
            if (v8 != 0) {
                return 3;
            }
            v8 = var1_1.equals("shadowtex0") ? 1 : 0;
        }
        if (var2_2 == null) return v8;
        if (v8 != 0) return 4;
        v9 = var1_1.equals("watershadow");
        if (var2_2 != null) {
            if (v9 != 0) {
                return 4;
            }
            v9 = var1_1.equals("shadow");
        }
        if (var2_2 != null) {
            if (v9 != 0) {
                v10 = cS.d3;
                if (var2_2 == null) return v10;
                if (v10 == 0) return 4;
                return 5;
            }
            v9 = var1_1.equals("shadowtex1");
        }
        if (var2_2 != null) {
            if (v9 != 0) {
                return 5;
            }
            v9 = var1_1.equals("depthtex0") ? 1 : 0;
        }
        if (var2_2 == null) return v9;
        if (v9 != 0) return 6;
        v11 = var1_1.equals("gdepthtex");
        if (var2_2 != null) {
            if (v11 != 0) {
                return 6;
            }
            v11 = var1_1.equals("colortex4") ? 1 : 0;
        }
        if (var2_2 == null) return v11;
        if (v11 != 0) return 7;
        v12 = var1_1.equals("gaux1");
        if (var2_2 != null) {
            if (v12 != 0) {
                return 7;
            }
            v12 = var1_1.equals("colortex5") ? 1 : 0;
        }
        if (var2_2 == null) return v12;
        if (v12 != 0) return 8;
        v13 = var1_1.equals("gaux2");
        if (var2_2 != null) {
            if (v13 != 0) {
                return 8;
            }
            v13 = var1_1.equals("colortex6") ? 1 : 0;
        }
        if (var2_2 == null) return v13;
        if (v13 != 0) return 9;
        v14 = var1_1.equals("gaux3");
        if (var2_2 != null) {
            if (v14 != 0) {
                return 9;
            }
            v14 = var1_1.equals("colortex7") ? 1 : 0;
        }
        if (var2_2 == null) return v14;
        if (v14 != 0) return 10;
        v15 = var1_1.equals("gaux4");
        if (var2_2 != null) {
            if (v15 != 0) {
                return 10;
            }
            v15 = var1_1.equals("depthtex1");
        }
        if (var2_2 != null) {
            if (v15 != 0) {
                return 11;
            }
            v15 = var1_1.equals("depthtex2");
        }
        if (var2_2 != null) {
            if (v15 != 0) {
                return 12;
            }
            v15 = var1_1.equals("shadowcolor0") ? 1 : 0;
        }
        if (var2_2 == null) return v15;
        if (v15 != 0) return 13;
        v0 = var1_1.equals("shadowcolor") ? 1 : 0;
        if (var2_2 != null) {
            if (v0 != 0) {
                return 13;
            }
            v0 = var1_1.equals("shadowcolor1") ? 1 : 0;
        }
        if (var2_2 != null) {
            if (v0 != 0) {
                return 14;
            }
            v0 = var1_1.equals("noisetex") ? 1 : 0;
        }
        if (var2_2 == null) return v0;
        if (v0 == 0) return -1;
        return 15;
    }

    public static void n(int n2) {
        block6: {
            int n3;
            int n4;
            block4: {
                block5: {
                    String string = dB.i();
                    GL11.glDisable((int)n2);
                    String string2 = string;
                    n4 = n2;
                    n3 = 3553;
                    if (string2 == null) break block4;
                    if (n4 != n3) break block5;
                    cS.g();
                    if (string2 != null) break block6;
                }
                n4 = n2;
                n3 = 2912;
            }
            if (n4 == n3) {
                cS.aK();
            }
        }
    }

    public static void d(String string) {
        aL = string;
        bI.setProperty(cx.SHADER_PACK.c(), string);
        cS.ay();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(a3 a32) {
        String string = dB.i();
        a3 a33 = a32;
        a3 a34 = net.minecraft.ar.a3.MAIN_HAND;
        if (string != null) {
            if (a33 == a34) {
                boolean bl2 = d6;
                if (string == null) return bl2;
                if (bl2) {
                    return true;
                }
            }
            a33 = a32;
            a34 = net.minecraft.ar.a3.OFF_HAND;
        }
        if (a33 != a34) return false;
        boolean bl3 = aB;
        if (string == null) return bl3;
        if (!bl3) return false;
        return true;
    }

    public static void D() {
        block4: {
            boolean bl2;
            String string;
            block3: {
                string = dB.i();
                bl2 = dK;
                if (string == null) break block3;
                if (!bl2) break block4;
                bl2 = false;
            }
            dK = bl2;
            fC.b("Reset model renderers");
            Iterator<net.minecraft.client.r.b> iterator = a2.aQ().c().values().iterator();
            while (iterator.hasNext()) {
                block6: {
                    net.minecraft.client.r.b b10;
                    block5: {
                        net.minecraft.client.r.b b11;
                        b10 = b11 = iterator.next();
                        if (string == null) break block5;
                        if (!(b10 instanceof u)) break block6;
                        b10 = b11;
                    }
                    u u2 = (u)b10;
                    cS.a(u2.b());
                }
                if (string != null) continue;
            }
        }
    }

    private static aj[] a(Properties properties, int n2) {
        ArrayList<aj> arrayList;
        aj[] arraj;
        ArrayList<aj> arrayList2;
        block14: {
            int n3;
            block9: {
                String string = "texture." + dM[n2] + ".";
                Set<Object> set = properties.keySet();
                arrayList2 = new ArrayList<aj>();
                arraj = set.iterator();
                String string2 = dB.i();
                while (arraj.hasNext()) {
                    block11: {
                        aj aj2;
                        int n4;
                        String string3;
                        block12: {
                            int n5;
                            block13: {
                                String string4;
                                String string5;
                                String string6;
                                block10: {
                                    Object object = arraj.next();
                                    string5 = string6 = (String)object;
                                    string4 = string;
                                    if (string2 == null) break block10;
                                    n3 = string5.startsWith(string4) ? 1 : 0;
                                    if (string2 == null) break block9;
                                    if (n3 == 0) break block11;
                                    string5 = string6;
                                    string4 = string;
                                }
                                String string7 = string5.substring(string4.length());
                                string3 = properties.getProperty(string6).trim();
                                n4 = n5 = cS.b(n2, string7);
                                if (string2 == null) break block12;
                                if (n4 >= 0) break block13;
                                fC.c("Invalid texture name: " + string6);
                                if (string2 != null) break block11;
                            }
                            n4 = n5;
                        }
                        if ((aj2 = cS.a(n4, string3)) != null) {
                            arrayList2.add(aj2);
                        }
                    }
                    if (string2 != null) continue;
                }
                arrayList = arrayList2;
                if (string2 == null) break block14;
                n3 = arrayList.size();
            }
            if (n3 <= 0) {
                return null;
            }
            arrayList = arrayList2;
        }
        arraj = arrayList.toArray(new aj[arrayList2.size()]);
        return arraj;
    }

    public static boolean B() {
        String string = dB.i();
        boolean bl2 = Z.a();
        if (string != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public static void N() {
        net.minecraft.client.a.v.y();
        net.minecraft.client.a.v.f();
    }

    public static void aT() {
        block3: {
            int n2;
            block4: {
                String string;
                block2: {
                    string = dB.i();
                    n2 = dj;
                    if (string == null) break block2;
                    if (n2 == 0) break block3;
                    n2 = ef[18];
                }
                if (string == null) break block4;
                if (n2 == ef[0]) break block3;
                n2 = 16;
            }
            cS.a(n2);
            net.minecraft.client.a.v.v();
        }
    }

    public static void aM() {
        cS.af();
    }

    private static void b(String string) {
        cS.a2.n.f().a(new g(string));
    }

    private static IntBuffer b(IntBuffer intBuffer) {
        IntBuffer intBuffer2;
        block2: {
            int n2 = intBuffer.limit();
            String string = dB.i();
            for (int i2 = intBuffer.position(); i2 < n2; ++i2) {
                intBuffer2 = intBuffer.put(i2, 0);
                if (string != null) {
                    if (string != null) continue;
                }
                break block2;
            }
            intBuffer2 = intBuffer;
        }
        return intBuffer2;
    }

    public static void g(int n2) {
        cS.v[++cS.ae * 2] = n2 & 0xFFFF;
        cS.v[cS.ae * 2 + 1] = 0;
    }

    public static void M() {
        net.minecraft.client.a.v.f();
        cS.a(3);
    }

    public static void o(int n2) {
        GL11.glEnable((int)n2);
        cS.ak();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String a(cx cx2) {
        String string = dB.i();
        int n2 = dI.b[cx2.ordinal()];
        if (string == null) return Integer.toString(n2);
        switch (n2) {
            case 1: {
                n2 = bl;
                return Integer.toString(n2);
            }
            case 2: {
                return Boolean.toString(o);
            }
            case 3: {
                return Boolean.toString(aT);
            }
            case 4: {
                return Float.toString(cp);
            }
            case 5: {
                return Float.toString(dL);
            }
            case 6: {
                return Float.toString(cd);
            }
            case 7: {
                return Boolean.toString(bJ);
            }
            case 8: {
                return bg.d();
            }
            case 9: {
                return ao.d();
            }
            case 10: {
                return aL;
            }
            case 11: {
                return Boolean.toString(cX);
            }
            case 12: {
                return Boolean.toString(c_);
            }
            case 13: {
                return Integer.toString(bx);
            }
            case 14: {
                return Integer.toString(dG);
            }
            case 15: {
                return Integer.toString(co);
            }
            case 16: {
                return Integer.toString(ci);
            }
            case 17: {
                return Integer.toString(ci);
            }
            case 18: {
                return Integer.toString(ci);
            }
        }
        throw new IllegalArgumentException("Unknown option: " + (Object)((Object)cx2));
    }

    public static void Q() {
        bB = true;
        cS.b("fogMode", ea);
    }

    public static void O() {
        FloatBuffer floatBuffer = cy;
        floatBuffer.clear();
        GL11.glGetFloat((int)2982, (FloatBuffer)floatBuffer);
        floatBuffer.get(da, 0, 16);
        cc.b(Q, da, X);
        cS.a("upPosition", Q[0], Q[1], Q[2]);
    }

    private static dB[] a(Map<String, g2> map, dB[] arrdB) {
        dB[] arrdB2;
        block10: {
            Object object;
            Object object2;
            HashSet<String> hashSet = new HashSet<String>();
            Object object3 = map.keySet().iterator();
            String string = dB.i();
            while (object3.hasNext()) {
                String string2 = object3.next();
                Object object4 = map.get(string2);
                block1: while (true) {
                    object2 = object4;
                    object = ((g2)object2).a();
                    int n2 = 0;
                    while (n2 < ((dB[])object).length) {
                        dB dB2 = object[n2];
                        if (string != null) {
                            object4 = dB2;
                            if (string == null) continue block1;
                            if (object4 != null) {
                                hashSet.add(dB2.l());
                            }
                            ++n2;
                        }
                        if (string != null) continue;
                    }
                    break;
                }
                if (string != null) continue;
            }
            object3 = new ArrayList();
            int n3 = 0;
            while (n3 < arrdB.length) {
                block11: {
                    block12: {
                        arrdB2 = arrdB;
                        if (string == null) break block10;
                        object2 = arrdB2[n3];
                        if (string == null) break block11;
                        if (!((dB)object2).a()) break block12;
                        object = ((dB)object2).l();
                        if (string == null) break block11;
                        if (!hashSet.contains(object)) {
                            object3.add(object2);
                        }
                    }
                    ++n3;
                }
                if (string != null) continue;
            }
            arrdB2 = object3.toArray(new dB[object3.size()]);
        }
        dB[] arrdB3 = arrdB2;
        return arrdB3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean b() {
        String string = dB.i();
        boolean bl2 = D.c();
        if (string == null) return bl2;
        if (bl2) return true;
        bl2 = D.b();
        if (string == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public static dB[] u() {
        return b7;
    }

    public static String b(String string, String string2) {
        String string3 = b9.get(string);
        String string4 = dB.i();
        String string5 = string3;
        if (string4 != null) {
            string5 = string5 == null ? string2 : string3;
        }
        return string5;
    }

    public static void Z() {
        block3: {
            int n2;
            block2: {
                String string = dB.i();
                n2 = dj;
                if (string == null) break block2;
                if (n2 == 0) break block3;
                n2 = 13;
            }
            cS.a(n2);
        }
    }

    public static void H() {
        try {
            Class<?> class_ = Class.forName("shadersmod.transform.SMCClassTransformer");
        }
        catch (Throwable throwable) {
            return;
        }
        throw new RuntimeException("Shaders Mod detected. Please remove it, OptiFine has built-in support for shaders.");
    }

    public static void a(float f10, float f11, float f12, float f13) {
        block2: {
            boolean bl2;
            block1: {
                String string = dB.i();
                bl2 = dj;
                if (string == null) break block1;
                if (!bl2) break block2;
                bl2 = dn;
            }
            if (!bl2) {
                aU.a(f10, f11, f12, f13);
            }
        }
    }

    public static void aI() {
        block3: {
            int n2;
            block2: {
                String string = dB.i();
                n2 = dj;
                if (string == null) break block2;
                if (n2 == 0) break block3;
                n2 = 1;
            }
            cS.a(n2);
        }
    }

    private static void K() {
        block7: {
            fK fK2;
            String string;
            block8: {
                String string2 = dB.i();
                ak.b();
                a.b();
                D.b();
                dw.b();
                d0.b();
                Z.b();
                bQ.b();
                bu.b();
                cw.b();
                dX.b();
                cz.b();
                dd.b();
                k.b();
                T.a();
                string = string2;
                fK2 = cq;
                if (string == null) break block8;
                if (fK2 == null) break block7;
                fK2 = cq;
            }
            T.a(fK2);
            String string3 = "/shaders/shaders.properties";
            try {
                InputStream inputStream = cq.a(string3);
                if (inputStream == null) {
                    return;
                }
                g0 g02 = new g0();
                g02.load(inputStream);
                inputStream.close();
                ak.b(g02);
                a.b(g02);
                D.b(g02);
                dw.b(g02);
                d0.b(g02);
                Z.b(g02);
                bQ.b(g02);
                cw.b(g02);
                bu.b(g02);
                dX.b(g02);
                cz.b(g02);
                dd.b(g02);
                boolean bl2 = k.b(g02);
                if (string != null) {
                    b6 = gi.a(g02, b7);
                    Y = gi.b(g02, b7);
                    aF = gi.a(g02, Y, b7);
                    c5 = cS.a(g02, 0);
                    bs = cS.a(g02, 1);
                    de = g02.getProperty("texture.noise");
                    if (de == null) break block7;
                    bl2 = true;
                }
                dp = bl2;
            }
            catch (IOException iOException) {
                fU.h("[Shaders] Error reading: " + string3);
            }
        }
    }

    public static void b(boolean bl2) {
        a5 = bl2;
    }

    public static void a(String string, int n2, int n3) {
        block3: {
            int n4;
            block2: {
                int n5 = ef[bf];
                String string2 = dB.i();
                n4 = n5;
                if (string2 == null) break block2;
                if (n4 == 0) break block3;
                n4 = ARBShaderObjects.glGetUniformLocationARB((int)n5, (CharSequence)string);
            }
            int n6 = n4;
            ARBShaderObjects.glUniform2iARB((int)n6, (int)n2, (int)n3);
            cS.a(cG[bf], string);
        }
    }

    private static boolean c(int n2, String string) {
        int n3;
        block2: {
            block3: {
                byte[] arrby;
                block5: {
                    block4: {
                        int n4;
                        String string2 = dB.i();
                        IntBuffer intBuffer = BufferUtils.createIntBuffer((int)1);
                        ARBShaderObjects.glGetObjectParameterARB((int)n2, (int)35716, (IntBuffer)intBuffer);
                        String string3 = string2;
                        n3 = n4 = intBuffer.get();
                        if (string3 == null) break block2;
                        if (n3 <= 1) break block3;
                        ByteBuffer byteBuffer = BufferUtils.createByteBuffer((int)n4);
                        intBuffer.flip();
                        ARBShaderObjects.glGetInfoLogARB((int)n2, (IntBuffer)intBuffer, (ByteBuffer)byteBuffer);
                        arrby = new byte[n4];
                        byteBuffer.get(arrby);
                        byte[] arrby2 = arrby;
                        int n5 = n4 - 1;
                        if (string3 == null) break block4;
                        if (arrby2[n5] != 0) break block5;
                        arrby2 = arrby;
                        n5 = n4 - 1;
                    }
                    arrby2[n5] = 10;
                }
                String string4 = new String(arrby);
                fC.b("Info log: " + string + "\n" + string4);
                return false;
            }
            n3 = 1;
        }
        return n3 != 0;
    }

    public static void a(j j2) {
        block4: {
            j j3;
            String string;
            block3: {
                string = dB.i();
                j3 = j2;
                if (string == null) break block3;
                if (j3 == null) break block4;
                j3 = j2;
            }
            Iterator<net.minecraft.client.w.c> iterator = j3.b.iterator();
            while (iterator.hasNext()) {
                block6: {
                    net.minecraft.client.w.c c10;
                    block5: {
                        net.minecraft.client.w.c c11;
                        c10 = c11 = iterator.next();
                        if (string == null) break block5;
                        if (!(c10 instanceof net.minecraft.client.w.c)) break block6;
                        c10 = c11;
                    }
                    cS.a(c10);
                }
                if (string != null) continue;
            }
        }
    }

    public static void a(Q q2) {
        String string = dB.i();
        cS.H();
        String string2 = string;
        a2 = q2;
        q2 = net.minecraft.client.Q.P();
        ej = GLContext.getCapabilities();
        b4 = GL11.glGetString((int)7938);
        a0 = GL11.glGetString((int)7936);
        s = GL11.glGetString((int)7937);
        fC.b("ShadersMod version: 2.4.12");
        fC.b("OpenGL Version: " + b4);
        fC.b("Vendor: " + a0);
        fC.b("Renderer: " + s);
        StringBuilder stringBuilder = new StringBuilder();
        String string3 = "Capabilities: ";
        if (string2 != null) {
            stringBuilder = stringBuilder.append(string3);
            string3 = cS.ej.OpenGL20 ? " 2.0 " : " - ";
        }
        fC.b(stringBuilder.append(string3).append(cS.ej.OpenGL21 ? " 2.1 " : " - ").append(cS.ej.OpenGL30 ? " 3.0 " : " - ").append(cS.ej.OpenGL32 ? " 3.2 " : " - ").append(cS.ej.OpenGL40 ? " 4.0 " : " - ").toString());
        fC.b("GL_MAX_DRAW_BUFFERS: " + GL11.glGetInteger((int)34852));
        fC.b("GL_MAX_COLOR_ATTACHMENTS_EXT: " + GL11.glGetInteger((int)36063));
        fC.b("GL_MAX_TEXTURE_IMAGE_UNITS: " + GL11.glGetInteger((int)34930));
        x = cS.ej.OpenGL30;
        cS.l();
    }

    public static boolean h() {
        return a5;
    }

    public static void b(y y2) {
        block3: {
            int n2;
            block2: {
                String string = dB.i();
                n2 = dj;
                if (string == null) break block2;
                if (n2 == 0) break block3;
                cS.a("nextBlockEntity");
                n2 = 13;
            }
            cS.a(n2);
            cS.a(y2);
        }
    }

    public static void a(K k2) {
        int n2 = k2.b(k2.d()).ordinal();
        cS.v[++cS.ae * 2] = net.minecraft.W.K.h.c(k2) & 0xFFFF | n2 << 16;
        cS.v[cS.ae * 2 + 1] = 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static InputStream m(String string) {
        String string2 = dB.i();
        fK fK2 = cq;
        if (string2 != null) {
            if (fK2 == null) {
                return null;
            }
            fK2 = cq;
        }
        InputStream inputStream = fK2.a(string);
        return inputStream;
    }

    public static void a(IntBuffer intBuffer) {
        block6: {
            IntBuffer intBuffer2;
            block5: {
                String string = dB.i();
                intBuffer2 = intBuffer;
                if (string != null) {
                    if (intBuffer2 == null) {
                        intBuffer = bc;
                    }
                    intBuffer2 = cg;
                }
                if (string == null) break block5;
                if (intBuffer2 == intBuffer) break block6;
                cg = intBuffer;
                intBuffer2 = intBuffer;
            }
            GL20.glDrawBuffers((IntBuffer)intBuffer2);
        }
    }

    public static void aP() {
        block2: {
            boolean bl2;
            block1: {
                String string = dB.i();
                bl2 = dj;
                if (string == null) break block1;
                if (!bl2) break block2;
                s.a(dY);
                bl2 = dn;
            }
            if (!bl2) {
                cS.a(bF);
            }
        }
    }

    public static int l(int n2) {
        ea = n2;
        return n2;
    }

    public static void c(d d10) {
        ck = cS.a(d10);
    }

    public static void E() {
        block3: {
            int n2;
            block4: {
                String string;
                block2: {
                    string = dB.i();
                    n2 = dn;
                    if (string == null) break block2;
                    if (n2 != 0) break block3;
                    n2 = cx;
                }
                if (string == null) break block4;
                if (n2 == 0) break block3;
                cI.clear();
                n2 = cQ / 2;
            }
            GL11.glReadPixels((int)n2, (int)(bw / 2), (int)1, (int)1, (int)6402, (int)5126, (FloatBuffer)cI);
            b5 = cI.get(0);
            float f10 = (float)d4 * 0.01f;
            float f11 = (float)Math.exp(Math.log(0.5) * (double)f10 / (double)cv);
            d_ = d_ * f11 + b5 * (1.0f - f11);
        }
    }

    public static void m() {
        block2: {
            boolean bl2;
            block1: {
                String string = dB.i();
                bl2 = dj;
                if (string == null) break block1;
                if (!bl2) break block2;
                bl2 = dn;
            }
            if (!bl2) {
                cS.a(c1[16]);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void aj() {
        block14: {
            block17: {
                String string;
                block16: {
                    int n2;
                    int n3;
                    block15: {
                        block12: {
                            void var2_2;
                            block11: {
                                int n4;
                                int n5;
                                block13: {
                                    string = dB.i();
                                    n5 = ei;
                                    if (string == null) break block13;
                                    if (n5 == 0) break block14;
                                    n5 = bz;
                                }
                                if (string != null) {
                                    if (n5 != 0) {
                                        EXTFramebufferObject.glDeleteFramebuffersEXT((int)bz);
                                        net.minecraft.client.a.v.a(h);
                                        net.minecraft.client.a.v.a(aS);
                                    }
                                    bz = EXTFramebufferObject.glGenFramebuffersEXT();
                                    EXTFramebufferObject.glBindFramebufferEXT((int)36160, (int)bz);
                                    GL11.glDrawBuffer((int)0);
                                    GL11.glReadBuffer((int)0);
                                    GL11.glGenTextures((IntBuffer)((IntBuffer)h.clear().limit(ei)));
                                    GL11.glGenTextures((IntBuffer)((IntBuffer)aS.clear().limit(ac)));
                                    h.position(0);
                                    aS.position(0);
                                    n5 = n3 = 0;
                                }
                                while (n3 < ei) {
                                    net.minecraft.client.a.v.t(h.get(n3));
                                    GL11.glTexParameterf((int)3553, (int)10242, (float)10496.0f);
                                    GL11.glTexParameterf((int)3553, (int)10243, (float)10496.0f);
                                    n4 = z[n3];
                                    if (string != null) {
                                        int n6;
                                        if (string != null) {
                                            n6 = n4 != 0 ? 9728 : 9729;
                                        }
                                        var2_2 = n6;
                                        GL11.glTexParameteri((int)3553, (int)10241, (int)var2_2);
                                        GL11.glTexParameteri((int)3553, (int)10240, (int)var2_2);
                                        int n7 = aE[n3];
                                        if (string != null) {
                                            if (n7 != 0) {
                                                GL11.glTexParameteri((int)3553, (int)34892, (int)34894);
                                            }
                                            n7 = 3553;
                                        }
                                        GL11.glTexImage2D((int)n7, (int)0, (int)6402, (int)dN, (int)L, (int)0, (int)6402, (int)5126, (FloatBuffer)null);
                                        ++n3;
                                        if (string != null) continue;
                                    }
                                    break block11;
                                }
                                EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)36096, (int)3553, (int)h.get(0), (int)0);
                                cS.a("FT sd");
                                n4 = n3 = 0;
                            }
                            while (n3 < ac) {
                                net.minecraft.client.a.v.t(aS.get(n3));
                                GL11.glTexParameterf((int)3553, (int)10242, (float)10496.0f);
                                GL11.glTexParameterf((int)3553, (int)10243, (float)10496.0f);
                                n2 = dm[n3];
                                if (string != null) {
                                    int n8;
                                    if (string != null) {
                                        n8 = n2 != 0 ? 9728 : 9729;
                                    }
                                    var2_2 = n8;
                                    GL11.glTexParameteri((int)3553, (int)10241, (int)var2_2);
                                    GL11.glTexParameteri((int)3553, (int)10240, (int)var2_2);
                                    GL11.glTexImage2D((int)3553, (int)0, (int)6408, (int)dN, (int)L, (int)0, (int)32993, (int)33639, (ByteBuffer)null);
                                    EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)(36064 + n3), (int)3553, (int)aS.get(n3), (int)0);
                                    cS.a("FT sc");
                                    ++n3;
                                    if (string != null) continue;
                                }
                                break block12;
                            }
                            net.minecraft.client.a.v.t(0);
                            n2 = ac;
                        }
                        if (string == null) break block15;
                        if (n2 > 0) {
                            GL20.glDrawBuffers((IntBuffer)b1);
                        }
                        n3 = EXTFramebufferObject.glCheckFramebufferStatusEXT((int)36160);
                        if (string == null) break block16;
                        n2 = n3;
                    }
                    if (n2 == 36053) break block17;
                    cS.k("[Shaders] Error: Failed creating shadow framebuffer! (Status " + n3 + ")");
                }
                if (string != null) break block14;
            }
            fC.b("Shadow framebuffer created.");
        }
    }

    private static ByteBuffer j(int n2) {
        ByteBuffer byteBuffer = eb;
        int n3 = byteBuffer.limit();
        byteBuffer.position(n3).limit(n3 + n2);
        return byteBuffer.slice();
    }

    public static void Y() {
    }

    public static void aB() {
        block5: {
            int n2;
            String string;
            block4: {
                string = dB.i();
                n2 = dj;
                if (string == null) break block4;
                if (n2 == 0) break block5;
                n2 = aI;
            }
            if (string != null) {
                n2 = n2 != 0 ? 3 : 2;
            }
            cS.a(n2);
        }
    }

    public static boolean aN() {
        String string = dB.i();
        boolean bl2 = bQ.a();
        if (string != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public static void k() {
        ++c9;
        dK = true;
        fC.b("Reset world renderers");
        cS.a2.a2.d();
    }

    public static void G() {
        block7: {
            int n2;
            String string;
            block5: {
                block6: {
                    string = dB.i();
                    n2 = dn;
                    if (string == null) break block5;
                    if (n2 == 0) break block6;
                    cS.a("shadow endRender");
                    if (string != null) break block7;
                }
                n2 = P;
            }
            if (string != null) {
                if (n2 == 0) {
                    cS.C();
                }
                dj = false;
                net.minecraft.client.a.v.a(true, true, true, true);
                cS.a(0);
                net.minecraft.client.a.a0.a();
                n2 = cS.a("endRender end");
            }
        }
    }

    public static boolean a(net.minecraft.ar.aC aC2) {
        String string = dB.i();
        boolean bl2 = dI.a[aC2.ordinal()];
        if (string != null) {
            switch (bl2) {
                case 1: {
                    return dX.b();
                }
                case 2: {
                    return cz.b();
                }
                case 3: {
                    return dd.b();
                }
                case 4: {
                    return k.b();
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean ao() {
        String string = dB.i();
        boolean bl2 = d6;
        if (string != null) {
            if (bl2) return false;
            bl2 = aB;
        }
        if (string == null) return bl2;
        if (bl2) return false;
        return true;
    }

    public static void aE() {
        block3: {
            int n2;
            block2: {
                String string = dB.i();
                n2 = dj;
                if (string == null) break block2;
                if (n2 == 0) break block3;
                n2 = 3;
            }
            cS.a(n2);
        }
    }

    public static void aJ() {
        block3: {
            int n2;
            block2: {
                aI = false;
                String string = dB.i();
                n2 = bf;
                if (string == null) break block2;
                if (n2 != 3) break block3;
                n2 = 2;
            }
            cS.a(n2);
        }
    }

    public static void n() {
        cW = true;
        bB = true;
        cS.a(dx);
        cS.a(5);
        cS.b(-2, 0);
    }

    public static boolean i() {
        String string = dB.i();
        boolean bl2 = cw.a();
        if (string != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    private static void aC() {
        B = cS.a2.P;
        N = cS.a2.aT;
        cQ = Math.round((float)B * cp);
        bw = Math.round((float)N * cp);
        cS.aL();
    }

    private static dB[] b(dB[] arrdB) {
        dB[] arrdB2;
        block4: {
            ArrayList<dB> arrayList = new ArrayList<dB>();
            String string = dB.i();
            int n2 = 0;
            while (n2 < arrdB.length) {
                arrdB2 = arrdB;
                if (string != null) {
                    dB dB2 = arrdB2[n2];
                    if (string != null) {
                        if (dB2.a()) {
                            arrayList.add(dB2);
                        }
                        ++n2;
                    }
                    if (string != null) continue;
                }
                break block4;
            }
            arrdB2 = arrayList.toArray(new dB[arrayList.size()]);
        }
        dB[] arrdB3 = arrdB2;
        return arrdB3;
    }

    private static void aL() {
        block19: {
            block18: {
                String string;
                block17: {
                    int n2;
                    int n3;
                    int n4;
                    block15: {
                        block16: {
                            block14: {
                                block13: {
                                    block12: {
                                        block11: {
                                            string = dB.i();
                                            int n5 = by;
                                            if (string != null) {
                                                if (n5 != 0) {
                                                    EXTFramebufferObject.glDeleteFramebuffersEXT((int)by);
                                                    net.minecraft.client.a.v.a(dB);
                                                    net.minecraft.client.a.v.a(ad);
                                                }
                                                by = EXTFramebufferObject.glGenFramebuffersEXT();
                                                GL11.glGenTextures((IntBuffer)((IntBuffer)dB.clear().limit(bo)));
                                                GL11.glGenTextures((IntBuffer)((IntBuffer)ad.clear().limit(16)));
                                                dB.position(0);
                                                ad.position(0);
                                                ad.get(bE).position(0);
                                                EXTFramebufferObject.glBindFramebufferEXT((int)36160, (int)by);
                                                GL20.glDrawBuffers((int)0);
                                                GL11.glReadBuffer((int)0);
                                                n5 = n4 = 0;
                                            }
                                            while (n4 < bo) {
                                                net.minecraft.client.a.v.t(dB.get(n4));
                                                GL11.glTexParameteri((int)3553, (int)10242, (int)10496);
                                                GL11.glTexParameteri((int)3553, (int)10243, (int)10496);
                                                GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
                                                GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
                                                GL11.glTexParameteri((int)3553, (int)34891, (int)6409);
                                                GL11.glTexImage2D((int)3553, (int)0, (int)6402, (int)cQ, (int)bw, (int)0, (int)6402, (int)5126, (FloatBuffer)null);
                                                ++n4;
                                                if (string != null) {
                                                    if (string != null) continue;
                                                }
                                                break block11;
                                            }
                                            EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)36096, (int)3553, (int)dB.get(0), (int)0);
                                            GL20.glDrawBuffers((IntBuffer)dx);
                                            GL11.glReadBuffer((int)0);
                                            cS.a("FT d");
                                        }
                                        for (n4 = 0; n4 < bX; ++n4) {
                                            net.minecraft.client.a.v.t(bE[n4]);
                                            GL11.glTexParameteri((int)3553, (int)10242, (int)10496);
                                            GL11.glTexParameteri((int)3553, (int)10243, (int)10496);
                                            GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
                                            GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
                                            GL11.glTexImage2D((int)3553, (int)0, (int)cM[n4], (int)cQ, (int)bw, (int)0, (int)32993, (int)33639, (ByteBuffer)null);
                                            EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)(36064 + n4), (int)3553, (int)bE[n4], (int)0);
                                            cS.a("FT c");
                                            if (string != null) {
                                                if (string != null) continue;
                                            }
                                            break block12;
                                        }
                                        n4 = 0;
                                    }
                                    while (n4 < bX) {
                                        net.minecraft.client.a.v.t(bE[8 + n4]);
                                        GL11.glTexParameteri((int)3553, (int)10242, (int)10496);
                                        GL11.glTexParameteri((int)3553, (int)10243, (int)10496);
                                        GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
                                        GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
                                        GL11.glTexImage2D((int)3553, (int)0, (int)cM[n4], (int)cQ, (int)bw, (int)0, (int)32993, (int)33639, (ByteBuffer)null);
                                        cS.a("FT ca");
                                        ++n4;
                                        if (string != null) {
                                            if (string != null) continue;
                                        }
                                        break block13;
                                    }
                                    n4 = EXTFramebufferObject.glCheckFramebufferStatusEXT((int)36160);
                                }
                                n3 = n4;
                                n2 = 36058;
                                if (string == null) break block15;
                                if (n3 != n2) break block16;
                                cS.k("[Shaders] Error: Failed framebuffer incomplete formats");
                                for (int i2 = 0; i2 < bX; ++i2) {
                                    net.minecraft.client.a.v.t(ad.get(i2));
                                    GL11.glTexImage2D((int)3553, (int)0, (int)6408, (int)cQ, (int)bw, (int)0, (int)32993, (int)33639, (ByteBuffer)null);
                                    EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)(36064 + i2), (int)3553, (int)ad.get(i2), (int)0);
                                    cS.a("FT c");
                                    if (string != null) {
                                        if (string != null) continue;
                                    }
                                    break block14;
                                }
                                n4 = EXTFramebufferObject.glCheckFramebufferStatusEXT((int)36160);
                            }
                            n3 = n4;
                            n2 = 36053;
                            if (string == null) break block15;
                            if (n3 == n2) {
                                fC.b("complete");
                            }
                        }
                        net.minecraft.client.a.v.t(0);
                        if (string == null) break block17;
                        n3 = n4;
                        n2 = 36053;
                    }
                    if (n3 == n2) break block18;
                    cS.k("[Shaders] Error: Failed creating framebuffer! (Status " + n4 + ")");
                }
                if (string != null) break block19;
            }
            fC.b("Framebuffer created.");
        }
    }

    public static boolean au() {
        return y;
    }

    private static void a(aj[] arraj) {
        String string = dB.i();
        if (arraj != null) {
            for (int i2 = 0; i2 < arraj.length; ++i2) {
                aj aj2 = arraj[i2];
                aj2.c();
                if (string != null) continue;
            }
        }
    }

    public static boolean aA() {
        return ck;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static float F() {
        String string = dB.i();
        float f10 = bq;
        float f11 = 0.0f;
        if (string != null) {
            if (f10 < f11) {
                return -1.0f;
            }
            f10 = cs;
            f11 = bq;
        }
        float f12 = f10 * f11;
        return f12;
    }

    public static void b(int n2) {
        GL11.glDisable((int)n2);
        cS.g();
    }

    public static void aS() {
        block3: {
            int n2;
            block2: {
                String string = dB.i();
                n2 = dj;
                if (string == null) break block2;
                if (n2 == 0) break block3;
                cS.a("beginBlockEntities");
                n2 = 13;
            }
            cS.a(n2);
        }
    }

    public static void av() {
        cW = false;
        String string = dB.i();
        cS.a(dx);
        int n2 = aI;
        if (string != null) {
            n2 = n2 != 0 ? 3 : 2;
        }
        cS.a(n2);
        cS.aH();
    }

    public static void a(net.minecraft.client.w.c c10) {
        String string = dB.i();
        c10.e();
        String string2 = string;
        if (c10.D != null) {
            int n2 = c10.D.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                cS.a(c10.D.get(i2));
                if (string2 != null) continue;
            }
        }
    }

    private static int a(int n2, String string, String string2) {
        int n3;
        block20: {
            int n4;
            block21: {
                int n5;
                int n6;
                int n7;
                int n8;
                String string3;
                block22: {
                    block23: {
                        cS.a("pre setupProgram");
                        String string4 = dB.i();
                        n4 = ARBShaderObjects.glCreateProgramObjectARB();
                        cS.a("create");
                        string3 = string4;
                        n3 = n4;
                        if (string3 == null) break block20;
                        if (n3 == 0) break block21;
                        l = false;
                        cc = false;
                        d9 = false;
                        n8 = cS.f(string);
                        n7 = cS.h(string2);
                        cS.a("create");
                        n6 = n8;
                        if (string3 == null) break block22;
                        if (n6 != 0) break block23;
                        n6 = n7;
                        if (string3 == null) break block22;
                        if (n6 != 0) break block23;
                        ARBShaderObjects.glDeleteObjectARB((int)n4);
                        n4 = 0;
                        if (string3 != null) break block21;
                    }
                    n6 = n8;
                }
                if (string3 != null) {
                    if (n6 != 0) {
                        ARBShaderObjects.glAttachObjectARB((int)n4, (int)n8);
                        cS.a("attach");
                    }
                    n6 = n7;
                }
                if (string3 != null) {
                    if (n6 != 0) {
                        ARBShaderObjects.glAttachObjectARB((int)n4, (int)n7);
                        cS.a("attach");
                    }
                    n6 = l ? 1 : 0;
                }
                if (string3 != null) {
                    if (n6 != 0) {
                        ARBVertexShader.glBindAttribLocationARB((int)n4, (int)dA, (CharSequence)"mc_Entity");
                        cS.a("mc_Entity");
                    }
                    n6 = cc ? 1 : 0;
                }
                if (string3 != null) {
                    if (n6 != 0) {
                        ARBVertexShader.glBindAttribLocationARB((int)n4, (int)b8, (CharSequence)"mc_midTexCoord");
                        cS.a("mc_midTexCoord");
                    }
                    n6 = d9 ? 1 : 0;
                }
                if (string3 != null) {
                    if (n6 != 0) {
                        ARBVertexShader.glBindAttribLocationARB((int)n4, (int)cP, (CharSequence)"at_tangent");
                        cS.a("at_tangent");
                    }
                    ARBShaderObjects.glLinkProgramARB((int)n4);
                    n6 = GL20.glGetProgrami((int)n4, (int)35714);
                }
                if (string3 != null) {
                    if (n6 != 1) {
                        fC.d("Error linking program: " + n4);
                    }
                    cS.c(n4, string + ", " + string2);
                    n6 = n8;
                }
                if (string3 != null) {
                    if (n6 != 0) {
                        ARBShaderObjects.glDetachObjectARB((int)n4, (int)n8);
                        ARBShaderObjects.glDeleteObjectARB((int)n8);
                    }
                    n6 = n7;
                }
                if (string3 != null) {
                    if (n6 != 0) {
                        ARBShaderObjects.glDetachObjectARB((int)n4, (int)n7);
                        ARBShaderObjects.glDeleteObjectARB((int)n7);
                    }
                    cS.ef[n2] = n4;
                    cS.a(n2);
                    ARBShaderObjects.glValidateProgramARB((int)n4);
                    cS.a(0);
                    cS.c(n4, string + ", " + string2);
                    n6 = GL20.glGetProgrami((int)n4, (int)35715);
                }
                n3 = n5 = n6;
                if (string3 == null) break block20;
                if (n3 != 1) {
                    String string5 = "\"";
                    cS.k("[Shaders] Error: Invalid program " + string5 + cG[n2] + string5);
                    ARBShaderObjects.glDeleteObjectARB((int)n4);
                    n4 = 0;
                }
            }
            n3 = n4;
        }
        return n3;
    }

    private static String a(String string, dB[] arrdB) {
        block7: {
            String string2;
            block5: {
                int n2;
                String string3;
                block8: {
                    dB[] arrdB2;
                    block6: {
                        string3 = dB.i();
                        arrdB2 = arrdB;
                        if (string3 == null) break block6;
                        if (arrdB2 == null) break block7;
                        arrdB2 = arrdB;
                    }
                    int n3 = arrdB2.length;
                    if (string3 == null) break block8;
                    if (n3 <= 0) break block7;
                    n3 = n2 = 0;
                }
                while (n2 < arrdB.length) {
                    dB dB2 = arrdB[n2];
                    string2 = dB2.l();
                    if (string3 != null) {
                        String string4 = string2;
                        if (string3 != null) {
                            if (dB2.h(string)) {
                                string = dB2.g();
                                if (string3 != null) break;
                            }
                            ++n2;
                        }
                        if (string3 != null) continue;
                    }
                    break block5;
                }
                string2 = string;
            }
            return string2;
        }
        return string;
    }

    public static void a(l l2) {
        e = (float)l2.e;
        af = (float)l2.d;
        cu = (float)l2.b;
        cS.a("skyColor", e, af, cu);
    }

    public static int a(String string, String string2) {
        int n2 = GL11.glGetError();
        String string3 = dB.i();
        int n3 = n2;
        if (string3 != null) {
            if (n3 != 0) {
                System.err.format("GL error 0x%04x: %s at %s %s\n", n2, GLU.gluErrorString((int)n2), string, string2);
            }
            n3 = n2;
        }
        return n3;
    }

    private static void aF() {
        ec = false;
        dN = Math.round((float)c3 * dL);
        L = Math.round((float)dH * dL);
        cS.aj();
    }

    static ArrayList ag() {
        ArrayList<String> arrayList;
        block10: {
            String string = dB.i();
            arrayList = new ArrayList<String>();
            arrayList.add(di);
            arrayList.add(dR);
            String string2 = string;
            try {
                File file = aX;
                if (string2 != null) {
                    if (!file.exists()) {
                        aX.mkdir();
                    }
                    file = aX;
                }
                File[] arrfile = file.listFiles();
                for (int i2 = 0; i2 < arrfile.length; ++i2) {
                    boolean bl2;
                    String string3;
                    block11: {
                        File file2;
                        block12: {
                            block14: {
                                boolean bl3;
                                block13: {
                                    file2 = arrfile[i2];
                                    string3 = file2.getName();
                                    if (string2 == null) break block10;
                                    bl2 = file2.isDirectory();
                                    if (string2 == null) break block11;
                                    if (!bl2) break block12;
                                    File file3 = new File(file2, "shaders");
                                    bl3 = file3.exists();
                                    if (string2 == null) break block13;
                                    if (!bl3) break block14;
                                    bl3 = file3.isDirectory();
                                }
                                if (string2 != null && bl3) {
                                    bl3 = arrayList.add(string3);
                                }
                            }
                            if (string2 != null) continue;
                        }
                        bl2 = file2.isFile();
                    }
                    if (string2 != null) {
                        if (!bl2) continue;
                        bl2 = string3.toLowerCase().endsWith(".zip");
                    }
                    if (string2 == null || !bl2) continue;
                    bl2 = arrayList.add(string3);
                    if (string2 != null) continue;
                    break;
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return arrayList;
    }

    private static IntBuffer c(int n2) {
        ByteBuffer byteBuffer = eb;
        int n3 = byteBuffer.limit();
        byteBuffer.position(n3).limit(n3 + n2 * 4);
        return byteBuffer.asIntBuffer();
    }

    public static void r() {
        cS.a(1);
    }

    public static void ab() {
        FloatBuffer floatBuffer = cy;
        String string = dB.i();
        floatBuffer.clear();
        GL11.glGetFloat((int)2982, (FloatBuffer)floatBuffer);
        floatBuffer.get(da, 0, 16);
        cc.b(ct, da, aM);
        float[] arrf = bh;
        if (string != null) {
            cc.b(arrf, da, bV);
            arrf = i == cn ? ct : bh;
        }
        System.arraycopy(arrf, 0, aV, 0, 3);
        cS.a("sunPosition", ct[0], ct[1], ct[2]);
        cS.a("moonPosition", bh[0], bh[1], bh[2]);
        cS.a("shadowLightPosition", aV[0], aV[1], aV[2]);
        cS.a("postCelestialRotate");
    }

    public static void b(d d10) {
        aO = cS.a(d10);
    }

    public static boolean i(String string) {
        int n2;
        String string2 = dB.i();
        String string3 = string;
        if (string2 != null) {
            if (string3 == null) {
                return false;
            }
            string3 = string;
        }
        int n3 = string3.length();
        if (string2 != null) {
            if (n3 <= 0) {
                return false;
            }
            n3 = string.lastIndexOf("/");
        }
        int n4 = n2 = n3;
        if (string2 != null) {
            if (n4 >= 0) {
                string = string.substring(n2 + 1);
            }
            n4 = Arrays.asList(cG).contains(string);
        }
        return n4 != 0;
    }

    private static void c(String string, String string2) {
        try {
            File file = new File(aX, "debug/" + string);
            file.getParentFile().mkdirs();
            fU.a(file, string2);
        }
        catch (IOException iOException) {
            fU.h("Error saving: " + string);
            iOException.printStackTrace();
        }
    }

    private static FloatBuffer i(int n2) {
        ByteBuffer byteBuffer = eb;
        int n3 = byteBuffer.limit();
        byteBuffer.position(n3).limit(n3 + n2 * 4);
        return byteBuffer.asFloatBuffer();
    }

    private static IntBuffer[] a(int n2, int n3) {
        IntBuffer[] arrintBuffer = new IntBuffer[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrintBuffer[i2] = cS.c(n3);
        }
        return arrintBuffer;
    }

    public static boolean x() {
        return cO;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aG() {
        String string = dB.i();
        boolean bl2 = bg.c();
        if (string != null) {
            if (!bl2) {
                return bg.b();
            }
            bl2 = a.c();
        }
        if (string == null) return bl2;
        if (bl2) return true;
        bl2 = a.b();
        if (string == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static Properties a(fK fK2) throws IOException {
        Properties properties;
        block5: {
            boolean bl2;
            File file;
            block6: {
                String string;
                block4: {
                    properties = new Properties();
                    string = dB.i();
                    String string2 = I + "/" + fK2.b() + ".txt";
                    file = new File(net.minecraft.client.Q.P().aJ, string2);
                    bl2 = file.exists();
                    if (string == null) break block4;
                    if (!bl2) break block5;
                    bl2 = file.isFile();
                }
                if (string == null) break block6;
                if (!bl2) break block5;
                bl2 = file.canRead();
            }
            if (bl2) {
                FileInputStream fileInputStream = new FileInputStream(file);
                properties.load(fileInputStream);
                fileInputStream.close();
                return properties;
            }
        }
        return properties;
    }

    public static void aH() {
        cS.v[cS.ae * 2] = 0;
        cS.v[cS.ae * 2 + 1] = 0;
        --ae;
    }

    public static void ak() {
        block6: {
            int n2;
            String string;
            block7: {
                block4: {
                    block5: {
                        string = dB.i();
                        n2 = cW;
                        if (string == null) break block4;
                        if (n2 == 0) break block5;
                        cS.a(5);
                        if (string != null) break block6;
                    }
                    n2 = bf;
                }
                if (string == null) break block7;
                if (n2 != 1) break block6;
                n2 = aI ? 1 : 0;
            }
            if (string != null) {
                n2 = n2 != 0 ? 3 : 2;
            }
            cS.a(n2);
        }
    }

    public static void s() {
        String string = dB.i();
        cS.a("endUpdateChunks1");
        String string2 = string;
        cS.g("endUpdateChunks1");
        int n2 = dn;
        if (string2 != null) {
            if (n2 == 0) {
                cS.a(7);
            }
            cS.a("endUpdateChunks2");
            n2 = cS.g("endUpdateChunks2");
        }
    }

    public static void f() {
        cS.aK();
        String string = dB.i();
        cS.aH();
        String string2 = string;
        int n2 = aI;
        if (string2 != null) {
            n2 = n2 != 0 ? 3 : 2;
        }
        cS.a(n2);
    }

    public static void l() {
        block13: {
            Object object;
            String string = dB.i();
            fC.b("Load ShadersMod configuration.");
            String string2 = string;
            try {
                boolean bl2 = aX.exists();
                if (string2 != null) {
                    if (!bl2) {
                        bl2 = aX.mkdir();
                    }
                }
            }
            catch (Exception exception) {
                fC.d("Failed to open the shaderpacks directory: " + aX);
            }
            bI = new g0();
            bI.setProperty(cx.SHADER_PACK.c(), "");
            boolean bl3 = W.exists();
            if (string2 != null) {
                if (bl3) {
                    try {
                        object = new FileReader(W);
                        bI.load((Reader)object);
                        ((InputStreamReader)object).close();
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                bl3 = W.exists();
            }
            if (!bl3) {
                try {
                    cS.A();
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            object = cx.values();
            for (int i2 = 0; i2 < ((cx[])object).length; ++i2) {
                cx cx2 = object[i2];
                String string3 = cx2.c();
                String string4 = cx2.b();
                String string5 = bI.getProperty(string3, string4);
                cS.a(cx2, string5);
                if (string2 != null) {
                    if (string2 != null) continue;
                }
                break block13;
            }
            cS.ay();
        }
    }

    public static void a(net.minecraft.U.x x2) {
        block3: {
            int n2;
            block2: {
                String string = dB.i();
                n2 = dj;
                if (string == null) break block2;
                if (n2 == 0) break block3;
                n2 = 16;
            }
            cS.a(n2);
            cS.b(x2);
        }
    }

    public static boolean aO() {
        String string = dB.i();
        boolean bl2 = d0.a();
        if (string != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    private static void a(dB[] arrdB, fK fK2) {
        block9: {
            Properties properties = new Properties();
            String string = dB.i();
            if (string != null) {
                if (b7 != null) {
                    int n2 = 0;
                    while (n2 < arrdB.length) {
                        dB dB2 = arrdB[n2];
                        if (string != null) {
                            if (string != null) {
                                if (dB2.b()) {
                                    Object object = dB2;
                                    if (string != null && ((dB)object).q()) {
                                        object = properties.setProperty(dB2.l(), dB2.k());
                                    }
                                }
                                ++n2;
                            }
                            if (string != null) continue;
                        }
                        break block9;
                    }
                }
                try {
                    cS.a(fK2, properties);
                }
                catch (IOException iOException) {
                    fU.h("[Shaders] Error saving configuration for " + cq.b());
                    iOException.printStackTrace();
                }
            }
        }
    }

    static {
        al = 1;
        bD = 12;
        aQ = 19;
        aY = 28;
        ce = 2196;
        am = 1;
        aR = 25;
        ay = 8;
        cJ = 3;
        A = 0;
        bG = 13;
        cf = 20;
        bU = 0;
        d1 = 4;
        j = 6;
        f = 21;
        m = 32;
        R = 33;
        bS = 2;
        dI = true;
        cj = 2;
        c2 = 3;
        S = 24;
        c7 = 30;
        d5 = 15;
        cB = 8;
        F = 29;
        b = 9;
        G = true;
        bT = 7;
        bW = 3;
        bZ = 17;
        dQ = 8;
        dC = 10;
        dy = 31;
        bP = 18;
        d2 = 16;
        cV = 22;
        dz = 0;
        bR = 23;
        bp = 27;
        aJ = 8;
        bv = 8;
        a1 = 2;
        dg = 11;
        eh = 14;
        dv = 5;
        cK = 26;
        aw = false;
        ap = false;
        x = false;
        ag = false;
        c9 = 0;
        dK = false;
        B = 0;
        N = 0;
        cQ = 0;
        bw = 0;
        dj = false;
        cW = false;
        P = false;
        cE = false;
        dn = false;
        ee = false;
        aO = false;
        ck = false;
        ct = new float[4];
        bh = new float[4];
        aV = new float[4];
        Q = new float[4];
        aq = new float[4];
        X = new float[]{0.0f, 100.0f, 0.0f, 0.0f};
        aM = new float[]{0.0f, 100.0f, 0.0f, 0.0f};
        bV = new float[]{0.0f, -100.0f, 0.0f, 0.0f};
        da = new float[16];
        be = 0L;
        cF = 0L;
        cr = 0L;
        b0 = 0.0f;
        cn = 0.0f;
        i = 0.0f;
        aA = 0;
        r = 0L;
        aN = 0L;
        d4 = 0L;
        cD = 0;
        av = 0.0f;
        a8 = 0.0f;
        cH = 0;
        cS = 0.0f;
        bO = 0.0f;
        aK = 600.0f;
        c8 = 200.0f;
        J = 10.0f;
        n = false;
        dr = 0;
        bH = 0;
        aC = 0.0f;
        cm = 0.0f;
        bC = 0.0f;
        b5 = 0.0f;
        d_ = 0.0f;
        cv = 1.0f;
        cx = false;
        a4 = 1;
        w = 0.0f;
        bN = 0.0f;
        dE = false;
        aI = false;
        bB = true;
        dA = 10;
        b8 = 11;
        cP = 12;
        a7 = false;
        c = false;
        cZ = false;
        ba = false;
        l = false;
        cc = false;
        d9 = false;
        dc = 0;
        bA = 0;
        aU = new e7("entityColor");
        bj = new eX("entityId");
        U = new eX("blockEntityId");
        ch = 0;
        ec = false;
        dN = 1024;
        L = 1024;
        c3 = 1024;
        dH = 1024;
        aP = 90.0f;
        cs = 160.0f;
        ds = true;
        bq = -1.0f;
        dZ = 0;
        db = false;
        d3 = false;
        bX = 0;
        bo = 0;
        ac = 0;
        ei = 0;
        a_ = 0;
        df = 0;
        by = 0;
        bz = 0;
        cM = new int[8];
        aj = new boolean[8];
        bf = 0;
        cG = new String[]{"", "gbuffers_basic", "gbuffers_textured", "gbuffers_textured_lit", "gbuffers_skybasic", "gbuffers_skytextured", "gbuffers_clouds", "gbuffers_terrain", "gbuffers_terrain_solid", "gbuffers_terrain_cutout_mip", "gbuffers_terrain_cutout", "gbuffers_damagedblock", "gbuffers_water", "gbuffers_block", "gbuffers_beaconbeam", "gbuffers_item", "gbuffers_entities", "gbuffers_armor_glint", "gbuffers_spidereyes", "gbuffers_hand", "gbuffers_weather", "composite", "composite1", "composite2", "composite3", "composite4", "composite5", "composite6", "composite7", "final", "shadow", "shadow_solid", "shadow_cutout"};
        bb = new int[]{0, 0, 1, 2, 1, 2, 2, 3, 7, 7, 7, 7, 7, 7, 2, 3, 3, 2, 2, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 30, 30};
        ef = new int[33];
        bt = new int[33];
        a6 = new String[33];
        ah = null;
        c1 = new IntBuffer[33];
        cg = null;
        a3 = new String[33];
        aW = null;
        cR = null;
        M = new int[33];
        dT = 0;
        dO = 0;
        az = null;
        bI = null;
        dY = null;
        cb = false;
        aE = new boolean[2];
        du = new boolean[2];
        z = new boolean[2];
        dP = new boolean[8];
        dm = new boolean[8];
        cX = false;
        bJ = false;
        cd = 0.125f;
        cp = 1.0f;
        dL = 1.0f;
        bx = 0;
        dG = 0;
        co = 0;
        ci = 0;
        cN = 0;
        dV = 0;
        c_ = true;
        o = true;
        aT = true;
        ao = new aF("oldLighting", "Classic Lighting", 0);
        bg = new aF("oldHandLight", "Old Hand Light", 0);
        bl = 0;
        cY = new String[]{"Nearest", "Nearest-Nearest", "Nearest-Linear"};
        ax = new String[]{"Nearest", "Linear"};
        dt = new int[]{9728, 9984, 9986};
        H = new int[]{9728, 9729};
        cq = null;
        E = false;
        di = "OFF";
        dR = "(internal)";
        I = "shaderpacks";
        b2 = "optionsshaders.txt";
        b7 = null;
        b6 = null;
        Y = null;
        aF = null;
        ak = new aX("clouds", "Clouds", 0);
        dw = new aF("oldLighting", "Classic Lighting", 0);
        a = new aF("oldHandLight", "Old Hand Light", 0);
        D = new aF("dynamicHandLight", "Dynamic Hand Light", 0);
        d0 = new aF("shadowTranslucent", "Shadow Translucent", 0);
        Z = new aF("underwaterOverlay", "Underwater Overlay", 0);
        bQ = new aF("sun", "Sun", 0);
        bu = new aF("moon", "Moon", 0);
        cw = new aF("vignette", "Vignette", 0);
        dX = new aF("backFace.solid", "Back-face Solid", 0);
        cz = new aF("backFace.cutout", "Back-face Cutout", 0);
        dd = new aF("backFace.cutoutMipped", "Back-face Cutout Mipped", 0);
        k = new aF("backFace.translucent", "Back-face Translucent", 0);
        b9 = new HashMap<String, String>();
        ar = null;
        g = new ArrayList<Integer>();
        c5 = null;
        bs = null;
        de = null;
        dM = new String[]{"gbuffers", "composite"};
        bn = System.getProperty("shaders.debug.save", "false").equals("true");
        bK = 0.5f;
        c4 = 0.6f;
        bM = 0.8f;
        as = -1.0f;
        bm = 0.0f;
        dh = 0.0f;
        ea = 0;
        an = 2.0f;
        aG = 16;
        V = new int[2];
        dp = false;
        ai = 256;
        bE = new int[16];
        aZ = new int[8];
        dF = new int[]{0, 1, 2, 3, 7, 8, 9, 10};
        t = new boolean[33][8];
        eb = (ByteBuffer)BufferUtils.createByteBuffer((int)2196).limit(0);
        bk = new float[16];
        bL = new float[16];
        cl = new float[16];
        C = new float[16];
        br = new float[16];
        bd = new float[16];
        dk = new float[16];
        p = new float[16];
        cT = cS.i(16);
        d7 = cS.i(16);
        ca = cS.i(16);
        c6 = cS.i(16);
        d = cS.i(16);
        dl = cS.i(16);
        dD = cS.i(16);
        dW = cS.i(16);
        ed = cS.i(16);
        T = cS.i(16);
        cy = cS.i(16);
        cI = cS.i(16);
        ad = cS.c(16);
        dB = cS.c(3);
        aS = cS.c(8);
        h = cS.c(2);
        dx = cS.c(8);
        b1 = cS.c(8);
        bc = cS.c(8);
        dJ = cS.c(8);
        dq = cS.c(8);
        aH = cS.c(8);
        ek = cS.c(8);
        bF = cS.c(8);
        dS = cS.a(33, 8);
        c0 = new String[]{"R8", "RG8", "RGB8", "RGBA8", "R8_SNORM", "RG8_SNORM", "RGB8_SNORM", "RGBA8_SNORM", "R16", "RG16", "RGB16", "RGBA16", "R16_SNORM", "RG16_SNORM", "RGB16_SNORM", "RGBA16_SNORM", "R16F", "RG16F", "RGB16F", "RGBA16F", "R32F", "RG32F", "RGB32F", "RGBA32F", "R32I", "RG32I", "RGB32I", "RGBA32I", "R32UI", "RG32UI", "RGB32UI", "RGBA32UI", "R3_G3_B2", "RGB5_A1", "RGB10_A2", "R11F_G11F_B10F", "RGB9_E5"};
        b3 = new int[]{33321, 33323, 32849, 32856, 36756, 36757, 36758, 36759, 33322, 33324, 32852, 32859, 36760, 36761, 36762, 36763, 33325, 33327, 34843, 34842, 33326, 33328, 34837, 34836, 33333, 33339, 36227, 36226, 33334, 33340, 36209, 36208, 10768, 32855, 32857, 35898, 35901};
        cL = Pattern.compile("\\s*([\\w:]+)\\s*=\\s*([-]?\\d+)\\s*");
        v = new int[32];
        ae = 0;
        aa = new File(net.minecraft.client.Q.P().aJ, "shaders");
        aX = new File(net.minecraft.client.Q.P().aJ, I);
        W = new File(net.minecraft.client.Q.P().aJ, b2);
        bc.limit(0);
        bF.put(36064).position(0).limit(1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean j(String string) {
        String string2 = dB.i();
        Set<String> set = b6;
        if (string2 != null) {
            if (set == null) return false;
            set = b6;
        }
        boolean bl2 = set.contains(string);
        if (string2 == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static dB[] S() {
        String string = dB.i();
        try {
            dB[] arrdB;
            block7: {
                dB[] arrdB2 = gi.a(cq, cG, g);
                Properties properties = cS.a(cq);
                int n2 = 0;
                while (n2 < arrdB2.length) {
                    block8: {
                        block9: {
                            arrdB = arrdB2;
                            if (string == null) break block7;
                            dB dB2 = arrdB[n2];
                            String string2 = properties.getProperty(dB2.l());
                            if (string == null) break block8;
                            if (string2 == null) break block9;
                            dB2.h();
                            if (string == null) break block8;
                            if (!dB2.d(string2)) {
                                fU.h("[Shaders] Invalid value, option: " + dB2.l() + ", value: " + string2);
                            }
                        }
                        ++n2;
                    }
                    if (string != null) continue;
                }
                arrdB = arrdB2;
            }
            return arrdB;
        }
        catch (IOException iOException) {
            fU.h("[Shaders] Error reading configuration for " + cq.b());
            iOException.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(c c10) {
        int n2;
        block6: {
            String string;
            block5: {
                string = dB.i();
                n2 = E;
                if (string != null) {
                    if (n2 == 0) {
                        return true;
                    }
                    cS.a("shouldRenderClouds");
                    n2 = dn;
                }
                if (string == null) break block5;
                if (n2 != 0) break block6;
                n2 = c10.bn;
            }
            if (string == null) return n2 != 0;
            if (n2 <= 0) return 0 != 0;
            return 1 != 0;
        }
        n2 = bJ;
        return n2 != 0;
    }

    public static int g(String string) {
        int n2 = EXTFramebufferObject.glCheckFramebufferStatusEXT((int)36160);
        String string2 = dB.i();
        int n3 = n2;
        if (string2 != null) {
            if (n3 != 36053) {
                System.err.format("FramebufferStatus 0x%04X at %s\n", n2, string);
            }
            n3 = n2;
        }
        return n3;
    }

    public static void d() {
        block22: {
            block24: {
                bu bu2;
                block23: {
                    int n2;
                    String string;
                    block20: {
                        int n3;
                        block21: {
                            string = dB.i();
                            int n4 = ap;
                            if (string == null) break block21;
                            if (n4 == 0) break block22;
                            cS.a("Shaders.uninit pre");
                            n4 = n3 = 0;
                        }
                        while (n3 < 33) {
                            int[] arrn = bt;
                            int n5 = n3;
                            if (string != null) {
                                n2 = arrn[n5];
                                if (string == null) break block20;
                                if (n2 != 0) {
                                    ARBShaderObjects.glDeleteObjectARB((int)bt[n3]);
                                    cS.a("del programRef");
                                }
                                cS.bt[n3] = 0;
                                cS.ef[n3] = 0;
                                cS.a6[n3] = null;
                                cS.c1[n3] = null;
                                arrn = M;
                                n5 = n3;
                            }
                            arrn[n5] = 0;
                            ++n3;
                            if (string != null) continue;
                        }
                        n2 = by;
                    }
                    if (string != null) {
                        if (n2 != 0) {
                            EXTFramebufferObject.glDeleteFramebuffersEXT((int)by);
                            by = 0;
                            cS.a("del dfb");
                        }
                        n2 = bz;
                    }
                    if (string != null && n2 != 0) {
                        EXTFramebufferObject.glDeleteFramebuffersEXT((int)bz);
                        bz = 0;
                        n2 = cS.a("del sfb");
                    }
                    IntBuffer intBuffer = dB;
                    if (string != null) {
                        if (intBuffer != null) {
                            net.minecraft.client.a.v.a(dB);
                            cS.b(dB);
                            cS.a("del dfbDepthTextures");
                        }
                        intBuffer = ad;
                    }
                    if (string != null) {
                        if (intBuffer != null) {
                            net.minecraft.client.a.v.a(ad);
                            cS.b(ad);
                            cS.a("del dfbTextures");
                        }
                        intBuffer = h;
                    }
                    if (string != null) {
                        if (intBuffer != null) {
                            net.minecraft.client.a.v.a(h);
                            cS.b(h);
                            cS.a("del shadow depth");
                        }
                        intBuffer = aS;
                    }
                    if (string != null) {
                        if (intBuffer != null) {
                            net.minecraft.client.a.v.a(aS);
                            cS.b(aS);
                            cS.a("del shadow color");
                        }
                        intBuffer = dx;
                    }
                    if (string != null && intBuffer != null) {
                        intBuffer = cS.b(dx);
                    }
                    bu2 = K;
                    if (string == null) break block23;
                    if (bu2 == null) break block24;
                    bu2 = K;
                }
                bu2.c();
                K = null;
            }
            fC.b("Uninit");
            ch = 0;
            db = false;
            ap = false;
            cS.a("Shaders.uninit");
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static aj a(int var0, String var1_1) {
        var2_2 = dB.i();
        v0 = var1_1;
        if (var2_2 != null) {
            if (v0 == null) {
                return null;
            }
            v0 = var1_1 = var1_1.trim();
        }
        if (var2_2 == null) ** GOTO lbl12
        if (v0.indexOf(46) < 0) {
            var1_1 = var1_1 + ".png";
        }
        try {
            v0 = "shaders/" + dQ.f(var1_1, "/");
lbl12:
            // 2 sources

            var3_3 = v0;
            v1 = var4_5 = cS.cq.a(var3_3);
            if (var2_2 != null) {
                if (v1 == null) {
                    fC.c("Texture not found: " + var1_1);
                    return null;
                }
                v1 = var4_5;
            }
            IOUtils.closeQuietly((InputStream)v1);
            var5_6 = new cg(var3_3);
            var5_6.a(cS.a2.O());
            return new aj(var0, var3_3, var5_6);
        }
        catch (IOException var3_4) {
            fC.c("Error loading texture: " + var1_1);
            fC.c("" + var3_4.getClass().getName() + ": " + var3_4.getMessage());
            return null;
        }
    }

    public static void an() {
        bB = true;
        cS.b(-3, 0);
        cS.a(6);
    }

    public static void a(String string, float f10) {
        block3: {
            int n2;
            block2: {
                int n3 = ef[bf];
                String string2 = dB.i();
                n2 = n3;
                if (string2 == null) break block2;
                if (n2 == 0) break block3;
                n2 = ARBShaderObjects.glGetUniformLocationARB((int)n3, (CharSequence)string);
            }
            int n4 = n2;
            ARBShaderObjects.glUniform1fARB((int)n4, (float)f10);
            cS.a(cG[bf], string);
        }
    }

    public static void a(int n2, float f10, long l2) {
        String string = dB.i();
        int n3 = dn;
        if (string != null && n3 == 0) {
            EXTFramebufferObject.glBindFramebufferEXT((int)36160, (int)by);
            GL11.glViewport((int)0, (int)0, (int)cQ, (int)bw);
            cg = null;
            s.b(dY.a());
            cS.a(2);
            n3 = cS.a("end beginRenderPass");
        }
    }

    public static void b(net.minecraft.U.x x2) {
        block3: {
            int n2;
            block5: {
                String string;
                block4: {
                    block2: {
                        string = dB.i();
                        n2 = dj;
                        if (string == null) break block2;
                        if (n2 == 0) break block3;
                        n2 = dn;
                    }
                    if (string == null) break block4;
                    if (n2 != 0) break block3;
                    n2 = bj.c();
                }
                if (string == null) break block5;
                if (n2 == 0) break block3;
                n2 = fA.a(x2);
            }
            int n3 = n2;
            bj.b(n3);
        }
    }

    static void ae() {
    }

    public static void a(y y2) {
        block5: {
            boolean bl2;
            block6: {
                String string;
                block4: {
                    string = dB.i();
                    bl2 = dj;
                    if (string == null) break block4;
                    if (!bl2) break block5;
                    bl2 = dn;
                }
                if (string == null) break block6;
                if (bl2) break block5;
                bl2 = U.c();
            }
            if (bl2) {
                K k2 = y2.l();
                int n2 = net.minecraft.W.K.b(k2);
                U.b(n2);
            }
        }
    }

    public static void b(int n2, int n3) {
        cS.v[++cS.ae * 2] = n2 & 0xFFFF | n3 << 16;
        cS.v[cS.ae * 2 + 1] = 0;
    }

    public static void ac() {
        GL11.glMatrixMode((int)5888);
        GL11.glPushMatrix();
        GL11.glMatrixMode((int)5889);
        GL11.glPushMatrix();
        GL11.glMatrixMode((int)5888);
        cS.a(19);
        cS.a("beginHand");
        cS.g("beginHand");
    }

    public static void U() {
        block3: {
            int n2;
            block2: {
                aI = true;
                String string = dB.i();
                n2 = bf;
                if (string == null) break block2;
                if (n2 != 2) break block3;
                n2 = 3;
            }
            cS.a(n2);
        }
    }

    public static void a(String string, float f10, float f11, float f12) {
        block3: {
            int n2;
            block2: {
                int n3 = ef[bf];
                String string2 = dB.i();
                n2 = n3;
                if (string2 == null) break block2;
                if (n2 == 0) break block3;
                n2 = ARBShaderObjects.glGetUniformLocationARB((int)n3, (CharSequence)string);
            }
            int n4 = n2;
            ARBShaderObjects.glUniform3fARB((int)n4, (float)f10, (float)f11, (float)f12);
            cS.a(cG[bf], string);
        }
    }

    public static int h(int n2) {
        cS.v[cS.ae * 2] = v[ae * 2] & 0xFFFF | n2 << 16;
        return n2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void a(int var0) {
        block55: {
            block56: {
                block57: {
                    block54: {
                        block53: {
                            block52: {
                                block51: {
                                    block50: {
                                        v0 = dB.i();
                                        cS.a("pre-useProgram");
                                        var1_1 = v0;
                                        v1 = cS.dn;
                                        if (var1_1 != null) {
                                            if (v1 != 0) {
                                                var0 = 30;
                                                v1 = cS.ef[30];
                                                if (var1_1 != null) {
                                                    if (v1 == 0) {
                                                        cS.cb = false;
                                                        return;
                                                    } else {
                                                        ** GOTO lbl-1000
                                                    }
                                                }
                                            } else lbl-1000:
                                            // 3 sources

                                            {
                                                v1 = cS.bf;
                                            }
                                        }
                                        if (var1_1 != null) {
                                            if (v1 == var0) return;
                                            cS.bf = var0;
                                            ARBShaderObjects.glUseProgramObjectARB((int)cS.ef[var0]);
                                            v1 = cS.ef[var0];
                                        }
                                        if (var1_1 != null) {
                                            if (v1 == 0) {
                                                cS.cb = false;
                                                if (var1_1 != null) return;
                                            }
                                            v1 = cS.a("useProgram ", cS.cG[var0]);
                                        }
                                        if (v1 != 0) {
                                            cS.ef[var0] = 0;
                                        }
                                        var2_2 = cS.c1[var0];
                                        v2 = cS.cE;
                                        if (var1_1 == null) break block50;
                                        if (v2 != 0) {
                                            cS.a(var2_2);
                                            cS.a(cS.cG[var0], " draw buffers = ", cS.a6[var0]);
                                        }
                                        cS.dO = cS.M[var0];
                                        cS.aU.a(cS.ef[cS.bf]);
                                        cS.bj.a(cS.ef[cS.bf]);
                                        cS.U.a(cS.ef[cS.bf]);
                                        if (var1_1 == null) ** GOTO lbl112
                                        v2 = var0;
                                    }
                                    switch (v2 ? 1 : 0) {
                                        case 1: 
                                        case 2: 
                                        case 3: 
                                        case 4: 
                                        case 5: 
                                        case 6: 
                                        case 7: 
                                        case 8: 
                                        case 9: 
                                        case 10: 
                                        case 11: 
                                        case 12: 
                                        case 13: 
                                        case 16: 
                                        case 18: 
                                        case 19: 
                                        case 20: {
                                            cS.cb = true;
                                            cS.b("texture", 0);
                                            cS.b("lightmap", 1);
                                            cS.b("normals", 2);
                                            cS.b("specular", 3);
                                            v3 = cS.d3;
                                            if (var1_1 != null) {
                                                v3 = v3 != 0 ? 5 : 4;
                                            }
                                            cS.b("shadow", v3);
                                            cS.b("watershadow", 4);
                                            cS.b("shadowtex0", 4);
                                            cS.b("shadowtex1", 5);
                                            cS.b("depthtex0", 6);
                                            if (var1_1 != null) {
                                                if (cS.c5 != null) {
                                                    cS.b("gaux1", 7);
                                                    cS.b("gaux2", 8);
                                                    cS.b("gaux3", 9);
                                                    cS.b("gaux4", 10);
                                                }
                                                cS.b("depthtex1", 12);
                                                cS.b("shadowcolor", 13);
                                                cS.b("shadowcolor0", 13);
                                                cS.b("shadowcolor1", 14);
                                                cS.b("noisetex", 15);
                                            }
                                            if (var1_1 != null) break;
                                        }
                                        default: {
                                            cS.cb = false;
                                            if (var1_1 != null) break;
                                        }
                                        case 21: 
                                        case 22: 
                                        case 23: 
                                        case 24: 
                                        case 25: 
                                        case 26: 
                                        case 27: 
                                        case 28: 
                                        case 29: {
                                            cS.cb = false;
                                            cS.b("gcolor", 0);
                                            cS.b("gdepth", 1);
                                            cS.b("gnormal", 2);
                                            cS.b("composite", 3);
                                            cS.b("gaux1", 7);
                                            cS.b("gaux2", 8);
                                            cS.b("gaux3", 9);
                                            cS.b("gaux4", 10);
                                            cS.b("colortex0", 0);
                                            cS.b("colortex1", 1);
                                            cS.b("colortex2", 2);
                                            cS.b("colortex3", 3);
                                            cS.b("colortex4", 7);
                                            cS.b("colortex5", 8);
                                            cS.b("colortex6", 9);
                                            cS.b("colortex7", 10);
                                            v4 = cS.d3;
                                            if (var1_1 != null) {
                                                v4 = v4 != 0 ? 5 : 4;
                                            }
                                            cS.b("shadow", v4);
                                            cS.b("watershadow", 4);
                                            cS.b("shadowtex0", 4);
                                            cS.b("shadowtex1", 5);
                                            cS.b("gdepthtex", 6);
                                            cS.b("depthtex0", 6);
                                            cS.b("depthtex1", 11);
                                            cS.b("depthtex2", 12);
                                            cS.b("shadowcolor", 13);
                                            cS.b("shadowcolor0", 13);
                                            cS.b("shadowcolor1", 14);
                                            cS.b("noisetex", 15);
                                            if (var1_1 != null) break;
                                        }
                                        case 30: 
                                        case 31: 
                                        case 32: {
                                            cS.b("tex", 0);
                                            cS.b("texture", 0);
                                            cS.b("lightmap", 1);
                                            cS.b("normals", 2);
                                            cS.b("specular", 3);
lbl112:
                                            // 2 sources

                                            v5 = cS.d3;
                                            if (var1_1 != null) {
                                                v5 = v5 != 0 ? 5 : 4;
                                            }
                                            cS.b("shadow", v5);
                                            cS.b("watershadow", 4);
                                            cS.b("shadowtex0", 4);
                                            cS.b("shadowtex1", 5);
                                            if (var1_1 != null) {
                                                if (cS.c5 != null) {
                                                    cS.b("gaux1", 7);
                                                    cS.b("gaux2", 8);
                                                    cS.b("gaux3", 9);
                                                    cS.b("gaux4", 10);
                                                }
                                                cS.b("shadowcolor", 13);
                                                cS.b("shadowcolor0", 13);
                                                cS.b("shadowcolor1", 14);
                                            }
                                            cS.b("noisetex", 15);
                                        }
                                    }
                                    v6 = cS.a2.s;
                                    if (var1_1 == null) ** GOTO lbl133
                                    if (v6 != null) {
                                        v6 = cS.a2.s;
lbl133:
                                        // 2 sources

                                        v7 = v6.av();
                                    } else {
                                        v7 = null;
                                    }
                                    v8 = var3_3 = v7;
                                    if (var1_1 == null) ** GOTO lbl140
                                    if (v8 != null) {
                                        v8 = var3_3;
lbl140:
                                        // 2 sources

                                        v9 = v8.w();
                                    } else {
                                        v9 = null;
                                    }
                                    var4_4 = v9;
                                    var5_5 = -1;
                                    var6_6 = null;
                                    v10 = var4_4;
                                    if (var1_1 == null) break block51;
                                    if (v10 == null) break block52;
                                    var5_5 = net.minecraft.w.k.q.c(var4_4);
                                    v10 = net.minecraft.W.K.h.a((net.minecraft.ar.v)var5_5);
                                }
                                var6_6 = (K)v10;
                            }
                            v11 = var6_6;
                            if (var1_1 == null) ** GOTO lbl158
                            if (v11 != null) {
                                v11 = var6_6;
lbl158:
                                // 2 sources

                                v12 = v11.t(var6_6.d());
                            } else {
                                v12 = 0;
                            }
                            var7_7 = v12;
                            v13 = cS.a2.s;
                            if (var1_1 == null) ** GOTO lbl166
                            if (v13 != null) {
                                v13 = cS.a2.s;
lbl166:
                                // 2 sources

                                v14 = v13.b();
                            } else {
                                v14 = null;
                            }
                            v15 = var8_8 = v14;
                            if (var1_1 == null) ** GOTO lbl173
                            if (v15 != null) {
                                v15 = var8_8;
lbl173:
                                // 2 sources

                                v16 = v15.w();
                            } else {
                                v16 = null;
                            }
                            var9_9 = v16;
                            var10_10 = -1;
                            var11_11 = null;
                            v17 = var9_9;
                            if (var1_1 == null) break block53;
                            if (v17 == null) break block54;
                            var10_10 = net.minecraft.w.k.q.c(var9_9);
                            v17 = net.minecraft.W.K.h.a((net.minecraft.ar.v)var10_10);
                        }
                        var11_11 = (K)v17;
                    }
                    v18 = var11_11;
                    if (var1_1 == null) ** GOTO lbl191
                    if (v18 != null) {
                        v18 = var11_11;
lbl191:
                        // 2 sources

                        v19 = v18.t(var11_11.d());
                    } else {
                        v19 = var12_12 = 0;
                    }
                    if (var1_1 == null) break block55;
                    if (!cS.aG()) break block56;
                    v20 = var12_12;
                    if (var1_1 == null) break block57;
                    if (v20 <= var7_7) break block56;
                    var5_5 = var10_10;
                    v20 = var12_12;
                }
                var7_7 = v20;
            }
            cS.b("heldItemId", var5_5);
            cS.b("heldBlockLightValue", var7_7);
            cS.b("heldItemId2", var10_10);
            cS.b("heldBlockLightValue2", var12_12);
        }
        v21 = cS.bB;
        if (var1_1 != null) {
            v21 = v21 != 0 ? cS.ea : 0;
        }
        cS.b("fogMode", v21);
        cS.a("fogColor", cS.bY, cS.at, cS.d8);
        cS.a("skyColor", cS.e, cS.af, cS.cu);
        cS.b("worldTime", (int)(cS.be % 24000L));
        cS.b("worldDay", (int)(cS.be / 24000L));
        cS.b("moonPhase", cS.aA);
        cS.b("frameCounter", cS.cD);
        cS.a("frameTime", cS.av);
        cS.a("frameTimeCounter", cS.a8);
        cS.a("sunAngle", cS.cn);
        cS.a("shadowAngle", cS.i);
        cS.a("rainStrength", cS.cS);
        cS.a("aspectRatio", (float)cS.cQ / (float)cS.bw);
        cS.a("viewWidth", (float)cS.cQ);
        cS.a("viewHeight", (float)cS.bw);
        cS.a("near", 0.05f);
        cS.a("far", (float)(cS.a2.ac.bf * 16));
        cS.a("sunPosition", cS.ct[0], cS.ct[1], cS.ct[2]);
        cS.a("moonPosition", cS.bh[0], cS.bh[1], cS.bh[2]);
        cS.a("shadowLightPosition", cS.aV[0], cS.aV[1], cS.aV[2]);
        cS.a("upPosition", cS.Q[0], cS.Q[1], cS.Q[2]);
        cS.a("previousCameraPosition", (float)cS.q, (float)cS.u, (float)cS.cU);
        cS.a("cameraPosition", (float)cS.cA, (float)cS.a9, (float)cS.au);
        cS.a("gbufferModelView", false, cS.ca);
        cS.a("gbufferModelViewInverse", false, cS.c6);
        cS.a("gbufferPreviousProjection", false, cS.ed);
        cS.a("gbufferProjection", false, cS.cT);
        cS.a("gbufferProjectionInverse", false, cS.d7);
        cS.a("gbufferPreviousModelView", false, cS.T);
        if (var1_1 != null) {
            if (cS.ei > 0) {
                cS.a("shadowProjection", false, cS.d);
                cS.a("shadowProjectionInverse", false, cS.dl);
                cS.a("shadowModelView", false, cS.dD);
                cS.a("shadowModelViewInverse", false, cS.dW);
            }
            cS.a("wetness", cS.bO);
            cS.a("eyeAltitude", cS.bC);
            cS.a("eyeBrightness", cS.bH & 65535, cS.bH >> 16);
            cS.a("eyeBrightnessSmooth", Math.round(cS.aC), Math.round(cS.cm));
            cS.a("terrainTextureSize", cS.V[0], cS.V[1]);
            cS.b("terrainIconSize", cS.aG);
            cS.b("isEyeInWater", cS.dr);
            cS.a("nightVision", cS.w);
            cS.a("blindness", cS.bN);
            cS.a("screenBrightness", cS.a2.ac.aj);
        }
        v22 = cS.a2.ac.cb;
        if (var1_1 != null) {
            v22 = v22 != 0 ? 1 : 0;
        }
        cS.b("hideGUI", v22);
        cS.a("centerDepthSmooth", cS.d_);
        cS.a("atlasSize", cS.dc, cS.bA);
        cS.a("useProgram ", cS.cG[var0]);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int a(String string, int n2) {
        int n3;
        g2 g22;
        String string2 = dB.i();
        String string3 = string;
        if (string2 != null) {
            string3 = string3 != null ? "screen." + string : "screen";
        }
        String string4 = string3;
        Object object = aF;
        if (string2 != null) {
            if (object == null) {
                return n2;
            }
            object = aF.get(string4);
        }
        g2 g23 = g22 = (g2)object;
        if (string2 != null) {
            if (g23 == null) {
                n3 = n2;
                return n3;
            }
            g23 = g22;
        }
        n3 = g23.c();
        return n3;
    }

    public static dB[] e(String string) {
        dB[] arrdB;
        block10: {
            g2 g22;
            Object[] arrobject = (dB[])b7.clone();
            String string2 = dB.i();
            if (aF == null) {
                if (Y != null) {
                    d8 d82 = new d8(Y, (dB[])arrobject);
                    arrobject = (dB[])fU.a(arrobject, d82, 0);
                }
                arrobject = cS.b((dB[])arrobject);
                return arrobject;
            }
            String string3 = string;
            if (string2 != null) {
                string3 = string3 != null ? "screen." + string : "screen";
            }
            String string4 = string3;
            g2 g23 = g22 = aF.get(string4);
            if (string2 != null) {
                if (g23 == null) {
                    return new dB[0];
                }
                g23 = g22;
            }
            dB[] arrdB2 = g23.a();
            ArrayList<dB> arrayList = new ArrayList<dB>();
            for (int i2 = 0; i2 < arrdB2.length; ++i2) {
                arrdB = arrdB2;
                if (string2 != null) {
                    dB dB2;
                    dB dB3 = dB2 = arrdB[i2];
                    if (string2 != null) {
                        if (dB3 == null) {
                            arrayList.add(null);
                            if (string2 != null) continue;
                        }
                        dB3 = dB2;
                    }
                    boolean bl2 = dB3 instanceof eu;
                    if (string2 == null) continue;
                    if (bl2) {
                        dB[] arrdB3 = cS.a(aF, (dB[])arrobject);
                        arrayList.addAll(Arrays.asList(arrdB3));
                        if (string2 != null) continue;
                    }
                    bl2 = arrayList.add(dB2);
                    if (string2 != null) continue;
                }
                break block10;
            }
            arrdB = arrayList.toArray(new dB[arrayList.size()]);
        }
        dB[] arrdB4 = arrdB;
        return arrdB4;
    }

    public static void A() {
        String string = dB.i();
        fC.b("Save ShadersMod configuration.");
        String string2 = string;
        if (bI == null) {
            bI = new g0();
        }
        cx[] arrcx = cx.values();
        for (int i2 = 0; i2 < arrcx.length; ++i2) {
            cx cx2 = arrcx[i2];
            String string3 = cx2.c();
            String string4 = cS.a(cx2);
            bI.setProperty(string3, string4);
            if (string2 != null) continue;
        }
        try {
            FileWriter fileWriter = new FileWriter(W);
            bI.store(fileWriter, null);
            fileWriter.close();
        }
        catch (Exception exception) {
            fC.d("Error saving configuration: " + exception.getClass().getName() + ": " + exception.getMessage());
        }
    }

    public static dB[] a(dB[] arrdB) {
        dB[] arrdB2;
        block5: {
            ArrayList<dB> arrayList = new ArrayList<dB>();
            String string = dB.i();
            int n2 = 0;
            while (n2 < arrdB.length) {
                arrdB2 = arrdB;
                if (string != null) {
                    dB dB2 = arrdB2[n2];
                    if (string != null) {
                        if (dB2.q()) {
                            boolean bl2 = dB2.b();
                            if (string != null && bl2) {
                                bl2 = arrayList.add(dB2);
                            }
                        }
                        ++n2;
                    }
                    if (string != null) continue;
                }
                break block5;
            }
            arrdB2 = arrayList.toArray(new dB[arrayList.size()]);
        }
        dB[] arrdB3 = arrdB2;
        return arrdB3;
    }

    public static void R() {
        cS.a(16);
    }

    public static int aR() {
        return v[ae * 2];
    }

    public static void c() {
        cS.a(b7, cq);
    }

    public static boolean aD() {
        return aO;
    }

    private static boolean a(int n2, String string, List<String> list) {
        String string2;
        block4: {
            int n3;
            IntBuffer intBuffer = BufferUtils.createIntBuffer((int)1);
            int n4 = GL20.glGetShaderi((int)n2, (int)35716);
            String string3 = dB.i();
            int n5 = n4;
            if (string3 != null) {
                if (n5 <= 1) {
                    return true;
                }
                n5 = n3 = 0;
            }
            while (n3 < list.size()) {
                String string4 = list.get(n3);
                string2 = "File: " + (n3 + 1) + " = " + string4;
                if (string3 != null) {
                    fC.b(string2);
                    ++n3;
                    if (string3 != null) continue;
                }
                break block4;
            }
            string2 = GL20.glGetShaderInfoLog((int)n2, (int)n4);
        }
        String string5 = string2;
        fC.b("Shader info log: " + string + "\n" + string5);
        return false;
    }

    public static void b(String string, int n2) {
        block3: {
            int n3;
            block2: {
                int n4 = ef[bf];
                String string2 = dB.i();
                n3 = n4;
                if (string2 == null) break block2;
                if (n3 == 0) break block3;
                n3 = ARBShaderObjects.glGetUniformLocationARB((int)n4, (CharSequence)string);
            }
            int n5 = n3;
            ARBShaderObjects.glUniform1iARB((int)n5, (int)n2);
            cS.a(cG[bf], string);
        }
    }

    private static void a(fK fK2, Properties properties) throws IOException {
        block4: {
            File file;
            block3: {
                String string;
                block2: {
                    String string2 = I + "/" + fK2.b() + ".txt";
                    file = new File(net.minecraft.client.Q.P().aJ, string2);
                    string = dB.i();
                    boolean bl2 = properties.isEmpty();
                    if (string == null) break block2;
                    if (!bl2) break block3;
                    bl2 = file.delete();
                }
                if (string != null) break block4;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            properties.store(fileOutputStream, null);
            fileOutputStream.flush();
            fileOutputStream.close();
        }
    }

    public static int T() {
        return v[ae * 2 + 1];
    }

    public static void aq() {
        I i2 = net.minecraft.client.a.W.c().b();
        float f10 = cS.a2.ac.bf * 16;
        double d10 = (double)f10 * 0.9238;
        double d11 = (double)f10 * 0.3826;
        double d12 = -d11;
        double d13 = -d10;
        double d14 = 16.0;
        double d15 = -a9;
        i2.a(7, net.minecraft.client.y.b.k);
        i2.c(d12, d15, d13).d();
        i2.c(d12, d14, d13).d();
        i2.c(d13, d14, d12).d();
        i2.c(d13, d15, d12).d();
        i2.c(d13, d15, d12).d();
        i2.c(d13, d14, d12).d();
        i2.c(d13, d14, d11).d();
        i2.c(d13, d15, d11).d();
        i2.c(d13, d15, d11).d();
        i2.c(d13, d14, d11).d();
        i2.c(d12, d14, d11).d();
        i2.c(d12, d15, d11).d();
        i2.c(d12, d15, d11).d();
        i2.c(d12, d14, d11).d();
        i2.c(d11, d14, d10).d();
        i2.c(d11, d15, d10).d();
        i2.c(d11, d15, d10).d();
        i2.c(d11, d14, d10).d();
        i2.c(d10, d14, d11).d();
        i2.c(d10, d15, d11).d();
        i2.c(d10, d15, d11).d();
        i2.c(d10, d14, d11).d();
        i2.c(d10, d14, d12).d();
        i2.c(d10, d15, d12).d();
        i2.c(d10, d15, d12).d();
        i2.c(d10, d14, d12).d();
        i2.c(d11, d14, d13).d();
        i2.c(d11, d15, d13).d();
        i2.c(d11, d15, d13).d();
        i2.c(d11, d14, d13).d();
        i2.c(d12, d14, d13).d();
        i2.c(d12, d15, d13).d();
        net.minecraft.client.a.W.c().a();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int n(String string) {
        String string2 = dB.i();
        int n2 = string.equals("colortex0");
        if (string2 == null) return n2;
        if (n2 != 0) return 0;
        n2 = string.equals("gcolor") ? 1 : 0;
        if (string2 == null) return n2;
        if (n2 != 0) return 0;
        int n3 = string.equals("colortex1");
        if (string2 == null) return n3;
        if (n3 != 0) return 1;
        n3 = string.equals("gdepth") ? 1 : 0;
        if (string2 == null) return n3;
        if (n3 != 0) return 1;
        int n4 = string.equals("colortex2");
        if (string2 == null) return n4;
        if (n4 != 0) return 2;
        n4 = string.equals("gnormal") ? 1 : 0;
        if (string2 == null) return n4;
        if (n4 != 0) return 2;
        int n5 = string.equals("colortex3");
        if (string2 == null) return n5;
        if (n5 != 0) return 3;
        n5 = string.equals("composite") ? 1 : 0;
        if (string2 == null) return n5;
        if (n5 != 0) return 3;
        int n6 = string.equals("colortex4");
        if (string2 == null) return n6;
        if (n6 != 0) return 4;
        n6 = string.equals("gaux1") ? 1 : 0;
        if (string2 == null) return n6;
        if (n6 != 0) return 4;
        int n7 = string.equals("colortex5");
        if (string2 == null) return n7;
        if (n7 != 0) return 5;
        n7 = string.equals("gaux2") ? 1 : 0;
        if (string2 == null) return n7;
        if (n7 != 0) return 5;
        int n8 = string.equals("colortex6");
        if (string2 == null) return n8;
        if (n8 != 0) return 6;
        n8 = string.equals("gaux3") ? 1 : 0;
        if (string2 == null) return n8;
        if (n8 != 0) return 6;
        int n9 = string.equals("colortex7");
        if (string2 != null) {
            if (n9 != 0) return 7;
            n9 = string.equals("gaux4") ? 1 : 0;
        }
        if (string2 == null) return n9;
        if (n9 != 0) return 7;
        return -1;
    }

    public static void ap() {
        block6: {
            boolean bl2;
            String string;
            block5: {
                string = dB.i();
                bl2 = dj;
                if (string == null) break block5;
                if (!bl2) break block6;
                bl2 = dn;
            }
            if (bl2) {
                // empty if block
            }
            int n2 = aI;
            if (string != null) {
                n2 = n2 != 0 ? 3 : 2;
            }
            cS.a(n2);
        }
    }

    public static void ay() {
        block42: {
            block43: {
                boolean bl2;
                block40: {
                    String string;
                    block41: {
                        boolean bl3;
                        boolean bl4;
                        block39: {
                            block38: {
                                block30: {
                                    String string2;
                                    block37: {
                                        block36: {
                                            boolean bl5;
                                            block35: {
                                                block34: {
                                                    boolean bl6;
                                                    block33: {
                                                        block32: {
                                                            boolean bl7;
                                                            block31: {
                                                                bl4 = E;
                                                                bl3 = cS.p();
                                                                string = dB.i();
                                                                boolean bl8 = false;
                                                                if (string != null) {
                                                                    E = bl8;
                                                                    if (cq != null) {
                                                                        cq.a();
                                                                        cq = null;
                                                                        b9.clear();
                                                                        g.clear();
                                                                        b7 = null;
                                                                        b6 = null;
                                                                        Y = null;
                                                                        aF = null;
                                                                        ak.b();
                                                                        a.b();
                                                                        D.b();
                                                                        dw.b();
                                                                        cS.al();
                                                                        de = null;
                                                                    }
                                                                    bl8 = false;
                                                                }
                                                                bl6 = bl8;
                                                                bl7 = fU.m();
                                                                if (string != null) {
                                                                    if (bl7) {
                                                                        fC.b("Shaders can not be loaded, Antialiasing is enabled: " + fU.ak() + "x");
                                                                        bl6 = true;
                                                                    }
                                                                    bl7 = fU.az();
                                                                }
                                                                if (string != null) {
                                                                    if (bl7) {
                                                                        fC.b("Shaders can not be loaded, Anisotropic Filtering is enabled: " + fU.bh() + "x");
                                                                        bl6 = true;
                                                                    }
                                                                    bl7 = fU.aw();
                                                                }
                                                                if (string == null) break block31;
                                                                if (!bl7) break block32;
                                                                fC.b("Shaders can not be loaded, Fast Render is enabled.");
                                                                bl7 = true;
                                                            }
                                                            bl6 = bl7;
                                                        }
                                                        string2 = bI.getProperty(cx.SHADER_PACK.c(), dR);
                                                        bl5 = string2.isEmpty();
                                                        if (string == null) break block33;
                                                        if (bl5) break block30;
                                                        bl5 = string2.equals(di);
                                                    }
                                                    if (string == null) break block34;
                                                    if (bl5) break block30;
                                                    bl5 = bl6;
                                                }
                                                if (string == null) break block35;
                                                if (bl5) break block30;
                                                bl5 = string2.equals(dR);
                                            }
                                            if (string == null) break block36;
                                            if (!bl5) break block37;
                                            cq = new ff();
                                            bl5 = E = true;
                                        }
                                        if (string != null) break block30;
                                    }
                                    try {
                                        File file = new File(aX, string2);
                                        boolean bl9 = file.isDirectory();
                                        if (string != null) {
                                            if (bl9) {
                                                cq = new fF(string2, file);
                                                E = true;
                                                if (string != null) break block30;
                                            }
                                            bl9 = file.isFile();
                                        }
                                        if (string != null) {
                                            if (!bl9) break block30;
                                            bl9 = string2.toLowerCase().endsWith(".zip");
                                        }
                                        if (string != null) {
                                            if (!bl9) break block30;
                                            cq = new G(string2, file);
                                            bl9 = true;
                                        }
                                        E = bl9;
                                    }
                                    catch (Exception exception) {
                                        // empty catch block
                                    }
                                }
                                if (cq == null) break block38;
                                fC.b("Loaded shaderpack: " + cS.w());
                                if (string != null) break block39;
                            }
                            fC.b("No shaderpack loaded.");
                            cq = new dj();
                        }
                        cS.af();
                        cS.V();
                        b7 = cS.S();
                        cS.K();
                        boolean bl10 = E;
                        if (string != null) {
                            bl10 = bl10 != bl4;
                        }
                        boolean bl11 = bl10;
                        boolean bl12 = cS.p();
                        if (string != null) {
                            bl12 = bl12 != bl3;
                        }
                        boolean bl13 = bl12;
                        bl2 = bl11;
                        if (string == null) break block40;
                        if (bl2) break block41;
                        bl2 = bl13;
                        if (string == null) break block40;
                        if (!bl2) break block42;
                    }
                    net.minecraft.client.y.b.a();
                    if (string == null) break block43;
                    bl2 = cq.dI.c();
                }
                if (bl2) {
                    cq.av.a(null);
                    cq.ej.a(null);
                }
                cS.am();
            }
            a2.A();
        }
    }

    public static void e(int n2) {
        block6: {
            int n3;
            int n4;
            block4: {
                block5: {
                    String string = dB.i();
                    GL11.glEnable((int)n2);
                    String string2 = string;
                    n4 = n2;
                    n3 = 3553;
                    if (string2 == null) break block4;
                    if (n4 != n3) break block5;
                    cS.ak();
                    if (string2 != null) break block6;
                }
                n4 = n2;
                n3 = 2912;
            }
            if (n4 == n3) {
                cS.Q();
            }
        }
    }

    public static void aa() {
        block8: {
            int n2;
            int n3;
            int n4;
            String string;
            block9: {
                block10: {
                    string = dB.i();
                    n4 = dn;
                    if (string == null) break block9;
                    if (n4 == 0) break block10;
                    cS.a("shadow clear pre");
                    EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)36096, (int)3553, (int)h.get(0), (int)0);
                    GL11.glClearColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                    GL20.glDrawBuffers((IntBuffer)c1[30]);
                    cS.g("shadow clear");
                    GL11.glClear((int)16640);
                    cS.a("shadow clear");
                    if (string != null) break block8;
                }
                cS.a("clear pre");
                n4 = aj[0];
            }
            if (string != null) {
                if (n4 != 0) {
                    GL20.glDrawBuffers((int)36064);
                    GL11.glClear((int)16384);
                }
                n4 = aj[1];
            }
            if (string != null) {
                if (n4 != 0) {
                    GL20.glDrawBuffers((int)36065);
                    GL11.glClearColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                    GL11.glClear((int)16384);
                }
                n4 = n3 = 2;
            }
            while (n3 < bX) {
                block12: {
                    int n5;
                    block11: {
                        n2 = aj[n3];
                        if (string == null) break block8;
                        if (string == null) break block11;
                        if (n2 == 0) break block12;
                        GL20.glDrawBuffers((int)(36064 + n3));
                        GL11.glClearColor((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
                        n5 = 16384;
                    }
                    GL11.glClear((int)n5);
                }
                ++n3;
                if (string != null) continue;
            }
            cS.a(dx);
            cS.g("clear");
            n2 = cS.a("clear");
        }
    }

    public static void e() {
        GL11.glRotatef((float)(bm * 1.0f), (float)0.0f, (float)0.0f, (float)1.0f);
        cS.a("preCelestialRotate");
    }

    public static void ad() {
        bl += 2;
        String string = dB.i();
        int n2 = bl = bl / 2 * 2;
        int n3 = 4;
        if (string != null) {
            if (n2 > n3) {
                bl = 0;
            }
            n2 = bl;
            n3 = 0;
        }
        bl = fU.a(n2, n3, 4);
    }

    private static void a(File file) {
        block7: {
            File[] arrfile;
            File file2;
            String string;
            block8: {
                boolean bl2;
                block6: {
                    string = dB.i();
                    bl2 = file.exists();
                    if (string == null) break block6;
                    if (!bl2) break block7;
                    file2 = file;
                    if (string == null) break block8;
                    bl2 = file2.isDirectory();
                }
                if (!bl2) break block7;
                file2 = file;
            }
            if ((arrfile = file2.listFiles()) != null) {
                for (int i2 = 0; i2 < arrfile.length; ++i2) {
                    File file3 = arrfile[i2];
                    boolean bl3 = file3.isDirectory();
                    if (string == null) continue;
                    if (bl3) {
                        cS.a(file3);
                    }
                    bl3 = file3.delete();
                    if (string != null) continue;
                }
            }
        }
    }

    public static void a(float f10, float f11, float f12) {
        bY = f10;
        at = f11;
        d8 = f12;
    }

    private static String a(boolean bl2) {
        return bl2 ? "Y" : "N";
    }

    public static void b(float f10, float f11, float f12, float f13) {
        net.minecraft.client.a.v.c(f10, f11, f12, f13);
        eg = f10;
        dU = f11;
        aD = f12;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static void P() {
        block16: {
            block15: {
                cS.O = new IdentityHashMap<K, Integer>(300);
                var0 = dB.i();
                if (cS.O.isEmpty()) {
                    for (Object var2_2 : net.minecraft.W.K.h.a()) {
                        var3_5 = net.minecraft.W.K.h.a((net.minecraft.ar.v)var2_2);
                        var4_7 = net.minecraft.W.K.h.c((K)var3_5);
                        cS.O.put((K)var3_5, var4_7);
                        if (var0 != null) continue;
                    }
                }
                var1_1 = null;
                try {
                    var1_1 = new BufferedReader(new InputStreamReader(cS.cq.a("/mc_Entity_x.txt")));
                }
                catch (Exception var2_3) {
                    // empty catch block
                }
                v0 = var1_1;
                if (var0 == null) break block16;
                if (v0 == null) break block15;
                try {
                    while ((var2_2 = var1_1.readLine()) != null) {
                        block22: {
                            block18: {
                                block21: {
                                    block20: {
                                        block19: {
                                            block17: {
                                                var3_5 = cS.cL.matcher((CharSequence)var2_2);
                                                if (var0 == null) break block15;
                                                v1 = var3_5;
                                                if (var0 == null) break block17;
                                                if (!v1.matches()) break block18;
                                                v1 = var3_5;
                                            }
                                            var4_8 = v1.group(1);
                                            var5_9 = var3_5.group(2);
                                            var6_10 = Integer.parseInt(var5_9);
                                            var7_11 = net.minecraft.W.K.d(var4_8);
                                            v2 = var7_11;
                                            if (var0 == null) break block19;
                                            if (v2 == null) break block20;
                                            v2 = cS.O.put(var7_11, var6_10);
                                        }
                                        if (var0 != null) break block21;
                                    }
                                    fC.a("Unknown block name %s", new Object[]{var4_8});
                                }
                                if (var0 != null) break block22;
                            }
                            fC.a("unmatched %s\n", new Object[]{var2_2});
                        }
                        if (var0 != null) continue;
                        break;
                    }
                }
                catch (Exception var3_6) {
                    fC.c("Error parsing mc_Entity_x.txt");
                }
            }
            v0 = var1_1;
        }
        if (var0 == null) ** GOTO lbl57
        if (v0 == null) return;
        try {
            v0 = var1_1;
lbl57:
            // 2 sources

            v0.close();
            return;
        }
        catch (Exception var2_4) {
            // empty catch block
        }
    }

    public static int a(String string, String string2, String string3) {
        int n2 = GL11.glGetError();
        String string4 = dB.i();
        int n3 = n2;
        if (string4 != null) {
            if (n3 != 0) {
                System.err.format("GL error 0x%04x: %s at %s %s %s\n", n2, GLU.gluErrorString((int)n2), string, string2, string3);
            }
            n3 = n2;
        }
        return n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean p() {
        String string = dB.i();
        boolean bl2 = ao.c();
        if (string != null) {
            if (!bl2) {
                return ao.b();
            }
            bl2 = dw.c();
        }
        if (string == null) return bl2;
        if (bl2) return true;
        bl2 = dw.b();
        if (string == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public static void as() {
        block3: {
            int n2;
            block2: {
                String string = dB.i();
                n2 = dj;
                if (string == null) break block2;
                if (n2 == 0) break block3;
                n2 = 16;
            }
            cS.a(n2);
            cS.D();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void a(float var0) {
        block15: {
            block16: {
                block14: {
                    block13: {
                        block12: {
                            var2_1 = cS.a2.Z();
                            var3_2 = var2_1.am + (var2_1.a - var2_1.am) * (double)var0;
                            var5_3 = var2_1.af + (var2_1.aF - var2_1.af) * (double)var0;
                            var7_4 = var2_1.n + (var2_1.ax - var2_1.n) * (double)var0;
                            cS.cA = var3_2;
                            cS.a9 = var5_3;
                            cS.au = var7_4;
                            var1_5 = dB.i();
                            GL11.glGetFloat((int)2983, (FloatBuffer)((FloatBuffer)cS.cT.position(0)));
                            cc.a((FloatBuffer)cS.d7.position(0), (FloatBuffer)cS.cT.position(0), cS.bL, cS.bk);
                            cS.cT.position(0);
                            cS.d7.position(0);
                            GL11.glGetFloat((int)2982, (FloatBuffer)((FloatBuffer)cS.ca.position(0)));
                            cc.a((FloatBuffer)cS.c6.position(0), (FloatBuffer)cS.ca.position(0), cS.C, cS.cl);
                            cS.ca.position(0);
                            cS.c6.position(0);
                            GL11.glViewport((int)0, (int)0, (int)cS.dN, (int)cS.L);
                            GL11.glMatrixMode((int)5889);
                            GL11.glLoadIdentity();
                            if (var1_5 == null) break block12;
                            if (!cS.ds) break block13;
                            GL11.glOrtho((double)(-cS.cs), (double)cS.cs, (double)(-cS.cs), (double)cS.cs, (double)0.05000000074505806, (double)256.0);
                        }
                        if (var1_5 != null) break block14;
                    }
                    GLU.gluPerspective((float)cS.aP, (float)((float)cS.dN / (float)cS.L), (float)0.05f, (float)256.0f);
                }
                GL11.glMatrixMode((int)5888);
                GL11.glLoadIdentity();
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-100.0f);
                GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                v0 = cS.b0 = cS.a2.e.h(var0);
                v1 = 0.75f;
                if (var1_5 == null) ** GOTO lbl44
                if (v0 < v1) {
                    v2 = cS.b0 + 0.25f;
                } else {
                    v0 = cS.b0;
                    v1 = 0.75f;
lbl44:
                    // 2 sources

                    v2 = v0 - v1;
                }
                cS.cn = v2;
                var9_6 = cS.b0 * -360.0f;
                v3 = cS.dh;
                v4 = 0.0f;
                if (var1_5 == null) ** GOTO lbl53
                if (v3 > v4) {
                    v3 = var9_6 % cS.dh;
                    v4 = cS.dh * 0.5f;
lbl53:
                    // 2 sources

                    v5 = v3 - v4;
                } else {
                    v5 = 0.0f;
                }
                var10_7 = v5;
                v6 = cS.cn;
                if (var1_5 == null) break block15;
                if (!((double)v6 <= 0.5)) break block16;
                GL11.glRotatef((float)(var9_6 - var10_7), (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)cS.bm, (float)1.0f, (float)0.0f, (float)0.0f);
                cS.i = cS.cn;
                if (var1_5 != null) break block15;
            }
            GL11.glRotatef((float)(var9_6 + 180.0f - var10_7), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)cS.bm, (float)1.0f, (float)0.0f, (float)0.0f);
            v6 = cS.i = cS.cn - 0.5f;
        }
        if (cS.ds) {
            var11_8 = cS.an;
            var12_9 = var11_8 / 2.0f;
            GL11.glTranslatef((float)((float)var3_2 % var11_8 - var12_9), (float)((float)var5_3 % var11_8 - var12_9), (float)((float)var7_4 % var11_8 - var12_9));
        }
        var11_8 = cS.cn * 6.2831855f;
        var12_9 = (float)Math.cos(var11_8);
        var13_10 = (float)Math.sin(var11_8);
        var14_11 = cS.bm * 6.2831855f;
        var15_12 = var12_9;
        var16_13 = var13_10 * (float)Math.cos(var14_11);
        var17_14 = var13_10 * (float)Math.sin(var14_11);
        cfr_temp_0 = (double)cS.cn - 0.5;
        v7 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
        if (var1_5 == null) return;
        if (v7 > 0) {
            var15_12 = -var12_9;
            var16_13 = -var16_13;
            var17_14 = -var17_14;
        }
        cS.aq[0] = var15_12;
        cS.aq[1] = var16_13;
        cS.aq[2] = var17_14;
        cS.aq[3] = 0.0f;
        GL11.glGetFloat((int)2983, (FloatBuffer)((FloatBuffer)cS.d.position(0)));
        cc.a((FloatBuffer)cS.dl.position(0), (FloatBuffer)cS.d.position(0), cS.bd, cS.br);
        cS.d.position(0);
        cS.dl.position(0);
        GL11.glGetFloat((int)2982, (FloatBuffer)((FloatBuffer)cS.dD.position(0)));
        cc.a((FloatBuffer)cS.dW.position(0), (FloatBuffer)cS.dD.position(0), cS.p, cS.dk);
        cS.dD.position(0);
        cS.dW.position(0);
        cS.a("gbufferProjection", false, cS.cT);
        cS.a("gbufferProjectionInverse", false, cS.d7);
        cS.a("gbufferPreviousProjection", false, cS.ed);
        cS.a("gbufferModelView", false, cS.ca);
        cS.a("gbufferModelViewInverse", false, cS.c6);
        cS.a("gbufferPreviousModelView", false, cS.T);
        cS.a("shadowProjection", false, cS.d);
        cS.a("shadowProjectionInverse", false, cS.dl);
        cS.a("shadowModelView", false, cS.dD);
        cS.a("shadowModelViewInverse", false, cS.dW);
        cS.a2.ac.L = 1;
        v7 = cS.a("setCamera");
    }

    public static void v() {
        ec = true;
    }

    private static void k(String string) {
        fC.d(string);
        cS.a2.n.f().a(new g(string));
    }

    public static void a(String string, IntBuffer intBuffer) {
        block2: {
            String string2 = dB.i();
            StringBuilder stringBuilder = new StringBuilder(128);
            stringBuilder.append(string).append(" [pos ").append(intBuffer.position()).append(" lim ").append(intBuffer.limit()).append(" cap ").append(intBuffer.capacity()).append(" :");
            int n2 = intBuffer.limit();
            String string3 = string2;
            for (int i2 = 0; i2 < n2; ++i2) {
                stringBuilder.append(" ").append(intBuffer.get(i2));
                if (string3 != null) {
                    if (string3 != null) continue;
                }
                break block2;
            }
            stringBuilder.append("]");
            fC.b(stringBuilder.toString());
        }
    }

    public static void L() {
        block3: {
            int n2;
            int n3;
            block2: {
                String string = dB.i();
                n3 = bo;
                n2 = 2;
                if (string == null) break block2;
                if (n3 < n2) break block3;
                net.minecraft.client.a.v.u(33995);
                cS.a("pre copy depth");
                n3 = 3553;
                n2 = 0;
            }
            GL11.glCopyTexSubImage2D((int)n3, (int)n2, (int)0, (int)0, (int)0, (int)0, (int)cQ, (int)bw);
            cS.a("copy depth");
            net.minecraft.client.a.v.u(33984);
        }
        s.b(dY.a());
    }

    private static void b(aj[] arraj) {
        String string = dB.i();
        if (arraj != null) {
            for (int i2 = 0; i2 < arraj.length; ++i2) {
                aj aj2 = arraj[i2];
                net.minecraft.client.a.v.u(33984 + aj2.a());
                net.minecraft.client.j.d d10 = aj2.a();
                net.minecraft.client.a.v.t(d10.c());
                if (string != null) continue;
            }
        }
    }

    public static boolean t() {
        String string = dB.i();
        boolean bl2 = bu.a();
        if (string != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public static void o() {
        N = 0;
    }

    public static void a() {
        cS.a2.an.c();
    }

    static String k(int n2) {
        String string = Integer.toString(n2);
        return Integer.parseInt(string.substring(1, 3)) + "." + Integer.parseInt(string.substring(3, 5)) + "." + Integer.parseInt(string.substring(5));
    }

    private static void al() {
        cS.a(c5);
        cS.a(bs);
        c5 = null;
        bs = null;
    }

    public static void j() {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glBegin((int)7);
        GL11.glTexCoord2f((float)0.0f, (float)0.0f);
        GL11.glVertex3f((float)0.0f, (float)0.0f, (float)0.0f);
        GL11.glTexCoord2f((float)1.0f, (float)0.0f);
        GL11.glVertex3f((float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glTexCoord2f((float)1.0f, (float)1.0f);
        GL11.glVertex3f((float)1.0f, (float)1.0f, (float)0.0f);
        GL11.glTexCoord2f((float)0.0f, (float)1.0f);
        GL11.glVertex3f((float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glEnd();
    }

    public static void m(int n2) {
        GL11.glDisable((int)n2);
        cS.aK();
    }

    public static void a(String string, boolean bl2, FloatBuffer floatBuffer) {
        int n2 = ef[bf];
        if (n2 != 0 && floatBuffer != null) {
            int n3 = ARBShaderObjects.glGetUniformLocationARB((int)n2, (CharSequence)string);
            ARBShaderObjects.glUniformMatrix4ARB((int)n3, (boolean)bl2, (FloatBuffer)floatBuffer);
            cS.a(cG[bf], string);
        }
    }

    public static void ax() {
        block3: {
            boolean bl2;
            block4: {
                block5: {
                    String string;
                    block2: {
                        string = dB.i();
                        bl2 = dj;
                        if (string == null) break block2;
                        if (!bl2) break block3;
                        bl2 = dn;
                    }
                    if (string == null) break block4;
                    if (bl2) break block5;
                    cS.a(12);
                    net.minecraft.client.a.v.a();
                    net.minecraft.client.a.v.a(true);
                    if (string != null) break block3;
                }
                bl2 = true;
            }
            net.minecraft.client.a.v.a(bl2);
        }
    }

    public static int a(String string) {
        int n2;
        block2: {
            int n3;
            block3: {
                block5: {
                    int n4;
                    String string2;
                    block4: {
                        int n5;
                        n3 = GL11.glGetError();
                        string2 = dB.i();
                        n2 = n3;
                        if (string2 == null) break block2;
                        if (n2 == 0) break block3;
                        n2 = n5 = 0;
                        if (string2 == null) break block2;
                        if (n2 != 0) break block3;
                        n4 = n3;
                        if (string2 == null) break block4;
                        if (n4 != 1286) break block5;
                        n4 = EXTFramebufferObject.glCheckFramebufferStatusEXT((int)36160);
                    }
                    int n6 = n4;
                    System.err.format("GL error 0x%04X: %s (Fb status 0x%04X) at %s\n", n3, GLU.gluErrorString((int)n3), n6, string);
                    if (string2 != null) break block3;
                }
                System.err.format("GL error 0x%04X: %s at %s\n", n3, GLU.gluErrorString((int)n3), string);
            }
            n2 = n3;
        }
        return n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String w() {
        String string = dB.i();
        fK fK2 = cq;
        if (string != null) {
            if (fK2 == null) {
                return null;
            }
            fK2 = cq;
        }
        if (string != null) {
            if (fK2 instanceof dj) {
                return null;
            }
            fK2 = cq;
        }
        String string2 = fK2.b();
        return string2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static void a(cx var0, String var1_1) {
        block23: {
            block22: {
                var2_2 = dB.i();
                v0 = var1_1;
                if (var2_2 == null) break block22;
                if (v0 != null) break block23;
                v0 = var0.b();
            }
            var1_1 = v0;
        }
        v1 = dI.b[var0.ordinal()];
        if (var2_2 == null) ** GOTO lbl14
        switch (v1) {
            case 1: {
                v1 = fU.b(var1_1, 0);
lbl14:
                // 2 sources

                cS.bl = v1;
                if (var2_2 != null) return;
            }
            case 2: {
                cS.o = fU.a(var1_1, true);
                if (var2_2 != null) return;
            }
            case 3: {
                cS.aT = fU.a(var1_1, true);
                if (var2_2 != null) return;
            }
            case 4: {
                cS.cp = fU.a(var1_1, 1.0f);
                if (var2_2 != null) return;
            }
            case 5: {
                cS.dL = fU.a(var1_1, 1.0f);
                if (var2_2 != null) return;
            }
            case 6: {
                cS.cd = fU.a(var1_1, 0.125f);
                if (var2_2 != null) return;
            }
            case 7: {
                cS.bJ = fU.a(var1_1, true);
                if (var2_2 != null) return;
            }
            case 8: {
                cS.bg.a(var1_1);
                if (var2_2 != null) return;
            }
            case 9: {
                cS.ao.a(var1_1);
                if (var2_2 != null) return;
            }
            case 10: {
                cS.aL = var1_1;
                if (var2_2 != null) return;
            }
            case 11: {
                cS.cX = fU.a(var1_1, true);
                if (var2_2 != null) return;
            }
            case 12: {
                cS.c_ = fU.a(var1_1, true);
                if (var2_2 != null) return;
            }
            case 13: {
                cS.bx = fU.b(var1_1, 0);
                if (var2_2 != null) return;
            }
            case 14: {
                cS.dG = fU.b(var1_1, 0);
                if (var2_2 != null) return;
            }
            case 15: {
                cS.co = fU.b(var1_1, 0);
                if (var2_2 != null) return;
            }
            case 16: {
                cS.ci = fU.b(var1_1, 0);
                if (var2_2 != null) return;
            }
            case 17: {
                cS.ci = fU.b(var1_1, 0);
                if (var2_2 != null) return;
            }
            case 18: {
                cS.ci = fU.b(var1_1, 0);
                if (var2_2 != null) return;
            }
        }
        throw new IllegalArgumentException("Unknown option: " + (Object)var0);
    }

    private static void V() {
        block10: {
            List<Integer> list;
            block9: {
                int n2;
                block8: {
                    String string = dB.i();
                    g.clear();
                    String string2 = string;
                    int n3 = -128;
                    while (n3 <= 128) {
                        String string3 = "/shaders/world" + n3;
                        if (string2 != null) {
                            n2 = cq.b(string3) ? 1 : 0;
                            if (string2 == null) break block8;
                            if (n2 != 0) {
                                g.add(n3);
                            }
                            ++n3;
                        }
                        if (string2 != null) continue;
                    }
                    list = g;
                    if (string2 == null) break block9;
                    n2 = list.size();
                }
                if (n2 <= 0) break block10;
                list = g;
            }
            Object[] arrobject = list.toArray(new Integer[g.size()]);
            fU.b("[Shaders] Worlds: " + fU.a(arrobject));
        }
    }

    public static void a(ag ag2) {
        block0: {
            net.minecraft.client.a.v.a(ag2);
            if (!bB) break block0;
            cS.b("fogMode", ag2.capabilityId);
        }
    }

    public static void a(int n2, int n3, int n4, int n5) {
        block2: {
            int n6;
            block3: {
                String string = dB.i();
                net.minecraft.client.a.v.a(true, true, true, true);
                String string2 = string;
                n6 = dn;
                if (string2 == null) break block2;
                if (n6 == 0) break block3;
                GL11.glViewport((int)0, (int)0, (int)dN, (int)L);
                if (string2 != null) break block2;
            }
            GL11.glViewport((int)0, (int)0, (int)cQ, (int)bw);
            EXTFramebufferObject.glBindFramebufferEXT((int)36160, (int)by);
            cE = true;
            net.minecraft.client.a.v.c();
            net.minecraft.client.a.v.t();
            cS.a(bc);
            cS.a(2);
            n6 = cS.a("beginRenderPass");
        }
    }

    public static void b(float f10) {
        net.minecraft.U.x x2 = a2.Z();
        double d10 = x2.am + (x2.a - x2.am) * (double)f10;
        double d11 = x2.af + (x2.aF - x2.af) * (double)f10;
        double d12 = x2.n + (x2.ax - x2.n) * (double)f10;
        cA = d10;
        a9 = d11;
        au = d12;
        GL11.glGetFloat((int)2983, (FloatBuffer)((FloatBuffer)cT.position(0)));
        cc.a((FloatBuffer)d7.position(0), (FloatBuffer)cT.position(0), bL, bk);
        cT.position(0);
        d7.position(0);
        GL11.glGetFloat((int)2982, (FloatBuffer)((FloatBuffer)ca.position(0)));
        cc.a((FloatBuffer)c6.position(0), (FloatBuffer)ca.position(0), C, cl);
        ca.position(0);
        c6.position(0);
        cS.a("setCamera");
    }

    public static dB c(String string) {
        return ds.a(string, b7);
    }

    public static void am() {
        block1: {
            block0: {
                String string = dB.i();
                if (!cS.p()) break block0;
                bK = 0.5f;
                c4 = 0.6f;
                bM = 0.8f;
                if (string != null) break block1;
            }
            bK = 1.0f;
            c4 = 1.0f;
            bM = 1.0f;
        }
    }

    public static int f(int n2) {
        cS.v[cS.ae * 2 + 1] = v[ae * 2 + 1] & 0xFFFF0000 | n2 & 0xFFFF;
        return n2;
    }
}

