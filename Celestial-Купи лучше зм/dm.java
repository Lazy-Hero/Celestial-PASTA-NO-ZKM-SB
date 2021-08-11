/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.Sys
 */
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.Iterator;
import net.minecraft.client.D.h;
import net.minecraft.client.Q;
import net.minecraft.client.b.L;
import net.minecraft.client.b.s;
import net.minecraft.client.l.c;
import org.lwjgl.Sys;

public class dm
extends L {
    private static final /* synthetic */ String[] I;
    private static final /* synthetic */ float[] E;
    private static final /* synthetic */ String[] B;
    public static final /* synthetic */ int C;
    private /* synthetic */ h9 z;
    private static final /* synthetic */ float[] G;
    public static final /* synthetic */ int H;
    protected /* synthetic */ String F;
    private /* synthetic */ int D;
    public static final /* synthetic */ int K;
    public static final /* synthetic */ int y;
    protected /* synthetic */ L A;
    public static final /* synthetic */ int J;
    private /* synthetic */ boolean L;

    @Override
    public void k() throws IOException {
        super.k();
        this.z.f();
    }

    @Override
    public void a(int n2, int n3, float f10) {
        block7: {
            String string;
            block6: {
                String string2;
                block5: {
                    String string3 = dB.i();
                    this.n();
                    string2 = string3;
                    this.z.b(n2, n3, f10);
                    dm dm2 = this;
                    if (string2 != null) {
                        if (dm2.D <= 0) {
                            this.z.a();
                            this.D += 20;
                        }
                        dm2 = this;
                    }
                    dm2.b(this.v, this.F + " ", h / 2, 15, 0xFFFFFF);
                    string = "OpenGL: " + cS.b4 + ", " + cS.a0 + ", " + cS.s;
                    int n4 = this.v.e(string);
                    if (string2 == null) break block5;
                    if (n4 >= h - 5) break block6;
                    this.b(this.v, string, h / 2, w - 40, 0x808080);
                }
                if (string2 != null) break block7;
            }
            this.a(this.v, string, 5, w - 40, 0x808080);
        }
        super.a(n2, n3, f10);
    }

    public Q b() {
        return this.m;
    }

    @Override
    public void e() {
        super.e();
        --this.D;
    }

    public static int c() {
        String string = System.getProperty("os.name").toLowerCase();
        String string2 = dB.i();
        int n2 = string.contains("win");
        if (string2 != null) {
            if (n2 != 0) {
                return 1;
            }
            n2 = string.contains("mac");
        }
        if (string2 != null) {
            if (n2 != 0) {
                return 2;
            }
            n2 = string.contains("solaris");
        }
        if (string2 != null) {
            if (n2 != 0) {
                return 3;
            }
            n2 = string.contains("sunos");
        }
        if (string2 != null) {
            if (n2 != 0) {
                return 3;
            }
            n2 = string.contains("linux");
        }
        if (string2 != null) {
            if (n2 != 0) {
                return 4;
            }
            n2 = string.contains("unix");
        }
        if (string2 != null) {
            n2 = n2 != 0 ? 4 : 0;
        }
        return n2;
    }

    @Override
    public void h() {
        block0: {
            super.h();
            if (this.L) break block0;
            cS.A();
        }
    }

    public static String a(float f10) {
        return dm.a(f10, G, I);
    }

    public static String b(float f10) {
        return dm.a(f10, E, B);
    }

    public static String a(int n2) {
        String string = dB.i();
        int n3 = n2;
        int n4 = 2;
        if (string != null) {
            if (n3 == n4) {
                return "FXAA 2x";
            }
            n3 = n2;
            n4 = 4;
        }
        return n3 == n4 ? "FXAA 4x" : gl.f();
    }

    public void a(String string, int n2, int n3, int n4) {
        this.b(this.v, string, n2, n3, n4);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    protected void a(s var1_1) {
        block51: {
            block52: {
                block53: {
                    var2_2 = dB.i();
                    v0 = var1_1.h;
                    if (var2_2 != null) {
                        if (v0 == 0) return;
                        v0 = var1_1 instanceof dn;
                    }
                    if (var2_2 == null) break block51;
                    if (v0 == 0) break block52;
                    var3_3 = (dn)var1_1;
                    if (var2_2 == null) break block53;
                    switch (d.a[var3_3.b().ordinal()]) {
                        case 1: {
                            cS.ad();
                            cS.d();
                            if (var2_2 != null) break;
                        }
                        case 2: {
                            v1 = cS.o;
                            if (var2_2 != null) {
                                v1 = v1 == false;
                            }
                            cS.o = v1;
                            cS.d();
                            this.m.A();
                            if (var2_2 != null) break;
                        }
                        case 3: {
                            v2 = cS.aT;
                            if (var2_2 != null) {
                                v2 = v2 == false;
                            }
                            cS.aT = v2;
                            cS.d();
                            this.m.A();
                            if (var2_2 != null) break;
                        }
                        case 4: {
                            var4_5 = cS.cp;
                            var5_11 = dm.G;
                            var6_13 = dm.I;
                            var7_14 = dm.a(var4_5, var5_11);
                            v3 = dm.o();
                            if (var2_2 == null) ** GOTO lbl49
                            if (v3 == 0) ** GOTO lbl46
                            --var7_14;
                            if (var2_2 == null) ** GOTO lbl54
                            if (var7_14 >= 0) ** GOTO lbl51
                            var7_14 = var5_11.length - 1;
                            if (var2_2 != null) ** GOTO lbl51
lbl46:
                            // 2 sources

                            ++var7_14;
                            if (var2_2 == null) ** GOTO lbl54
                            v3 = var7_14;
lbl49:
                            // 2 sources

                            if (v3 >= var5_11.length) {
                                var7_14 = 0;
                            }
lbl51:
                            // 5 sources

                            cS.cp = var5_11[var7_14];
                            cS.d();
                            cS.o();
lbl54:
                            // 3 sources

                            if (var2_2 != null) break;
                        }
                        case 5: {
                            var8_15 = cS.dL;
                            var9_16 = dm.G;
                            var10_17 = dm.I;
                            var11_18 = dm.a(var8_15, var9_16);
                            v4 = dm.o();
                            if (var2_2 == null) ** GOTO lbl71
                            if (v4 == 0) ** GOTO lbl68
                            --var11_18;
                            if (var2_2 == null) ** GOTO lbl76
                            if (var11_18 >= 0) ** GOTO lbl73
                            var11_18 = var9_16.length - 1;
                            if (var2_2 != null) ** GOTO lbl73
lbl68:
                            // 2 sources

                            ++var11_18;
                            if (var2_2 == null) ** GOTO lbl76
                            v4 = var11_18;
lbl71:
                            // 2 sources

                            if (v4 >= var9_16.length) {
                                var11_18 = 0;
                            }
lbl73:
                            // 5 sources

                            cS.dL = var9_16[var11_18];
                            cS.d();
                            cS.v();
lbl76:
                            // 3 sources

                            if (var2_2 != null) break;
                        }
                        case 6: {
                            var12_19 = cS.cd;
                            var13_20 = dm.E;
                            var14_21 = dm.B;
                            var15_22 = dm.a(var12_19, var13_20);
                            v5 = dm.o();
                            if (var2_2 == null) ** GOTO lbl93
                            if (v5 == 0) ** GOTO lbl90
                            --var15_22;
                            if (var2_2 == null) ** GOTO lbl97
                            if (var15_22 >= 0) ** GOTO lbl95
                            var15_22 = var13_20.length - 1;
                            if (var2_2 != null) ** GOTO lbl95
lbl90:
                            // 2 sources

                            ++var15_22;
                            if (var2_2 == null) ** GOTO lbl97
                            v5 = var15_22;
lbl93:
                            // 2 sources

                            if (v5 >= var13_20.length) {
                                var15_22 = 0;
                            }
lbl95:
                            // 5 sources

                            cS.cd = var13_20[var15_22];
                            cS.d();
lbl97:
                            // 3 sources

                            if (var2_2 != null) break;
                        }
                        case 7: {
                            cS.bg.g();
                            cS.d();
                            if (var2_2 != null) break;
                        }
                        case 8: {
                            cS.ao.g();
                            cS.am();
                            cS.d();
                            this.m.A();
                            if (var2_2 != null) break;
                        }
                        case 9: {
                            v6 = cS.cX;
                            if (var2_2 != null) {
                                v6 = cS.cX = v6 == false;
                            }
                            if (var2_2 != null) break;
                        }
                        case 10: {
                            v7 = cS.bJ;
                            if (var2_2 != null) {
                                v7 = cS.bJ = v7 == false;
                            }
                            if (var2_2 != null) break;
                        }
                        case 11: {
                            cS.dG = cS.co = (cS.bx = (cS.bx + 1) % 3);
                            var1_1.m = "Tex Min: " + cS.cY[cS.bx];
                            s.a();
                            if (var2_2 != null) break;
                        }
                        case 12: {
                            cS.cN = (cS.cN + 1) % 2;
                            var1_1.m = "Tex_n Mag: " + cS.ax[cS.cN];
                            s.a();
                            if (var2_2 != null) break;
                        }
                        case 13: {
                            cS.dV = (cS.dV + 1) % 2;
                            var1_1.m = "Tex_s Mag: " + cS.ax[cS.dV];
                            s.a();
                            if (var2_2 != null) break;
                        }
                        case 14: {
                            v8 = cS.c_;
                            if (var2_2 != null) {
                                v8 = v8 == false;
                            }
                            cS.c_ = v8;
                            var1_1.m = "ShadowClipFrustrum: " + dm.a(cS.c_);
                            s.a();
                            break;
                        }
                    }
                    var3_3.a();
                }
                if (var2_2 != null) return;
            }
            v0 = var1_1.g;
        }
        if (var2_2 == null) ** GOTO lbl152
        switch (v0) {
            case 201: {
                v0 = dm.c();
lbl152:
                // 2 sources

                if (var2_2 != null) {
                    switch (v0) {
                        case 1: {
                            var3_3 = String.format("cmd.exe /C start \"Open file\" \"%s\"", new Object[]{cS.aX.getAbsolutePath()});
                            try {
                                Runtime.getRuntime().exec((String)var3_3);
                                return;
                            }
                            catch (IOException var4_6) {
                                var4_6.printStackTrace();
                                if (var2_2 != null) break;
                            }
                        }
                        case 2: {
                            try {
                                Runtime.getRuntime().exec(new String[]{"/usr/bin/open", cS.aX.getAbsolutePath()});
                                return;
                            }
                            catch (IOException var4_7) {
                                var4_7.printStackTrace();
                                break;
                            }
                        }
                    }
                    v0 = 0;
                }
                var3_4 = v0;
                try {
                    var4_8 = Class.forName("java.awt.Desktop");
                    var5_12 = var4_8.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
                    var4_8.getMethod("browse", new Class[]{URI.class}).invoke(var5_12, new Object[]{new File(this.m.aJ, cS.I).toURI()});
                }
                catch (Throwable var4_9) {
                    var4_9.printStackTrace();
                    var3_4 = 1;
                }
                v9 = var3_4;
                if (var2_2 != null) {
                    if (v9 == 0) return;
                    fU.b("Opening via system class!");
                    v9 = Sys.openURL((String)("file://" + cS.aX.getAbsolutePath())) ? 1 : 0;
                }
                if (var2_2 != null) return;
            }
            case 202: {
                new File(cS.aa, "current.cfg");
                cS.A();
                this.L = true;
                this.m.a(this.A);
                if (var2_2 != null) return;
            }
            case 203: {
                var4_10 = new dW(this, fU.a());
                fU.aX().a(var4_10);
                if (var2_2 != null) return;
            }
        }
        this.z.a(var1_1);
    }

    public void a() {
        boolean bl2 = fU.ag();
        Iterator iterator = this.t.iterator();
        String string = dB.i();
        while (iterator.hasNext()) {
            block4: {
                block6: {
                    s s2;
                    int n2;
                    int n3;
                    s s3;
                    block5: {
                        block3: {
                            s3 = (s)iterator.next();
                            n3 = s3.g;
                            n2 = 201;
                            if (string == null) break block3;
                            if (n3 == n2) break block4;
                            n3 = s3.g;
                            n2 = 202;
                        }
                        if (string == null) break block5;
                        if (n3 == n2) break block4;
                        s2 = s3;
                        if (string == null) break block6;
                        n3 = s2.g;
                        n2 = cx.ANTIALIASING.ordinal();
                    }
                    if (n3 == n2) break block4;
                    s2 = s3;
                }
                s2.h = bl2;
            }
            if (string != null) continue;
        }
    }

    @Override
    public void r() {
        this.F = net.minecraft.client.D.h.a("of.options.shadersTitle", new Object[0]);
        if (cS.bI == null) {
            cS.l();
        }
        int n2 = 120;
        int n3 = 20;
        int n4 = h - n2 - 10;
        int n5 = 30;
        int n6 = 20;
        int n7 = h - n2 - 20;
        this.z = new h9(this, n7, w, n5, w - 50, 16);
        this.z.a(7, 8);
        this.t.add(new dn(cx.ANTIALIASING, n4, 0 * n6 + n5, n2, n3));
        this.t.add(new dn(cx.NORMAL_MAP, n4, 1 * n6 + n5, n2, n3));
        this.t.add(new dn(cx.SPECULAR_MAP, n4, 2 * n6 + n5, n2, n3));
        this.t.add(new dn(cx.RENDER_RES_MUL, n4, 3 * n6 + n5, n2, n3));
        this.t.add(new dn(cx.SHADOW_RES_MUL, n4, 4 * n6 + n5, n2, n3));
        this.t.add(new dn(cx.HAND_DEPTH_MUL, n4, 5 * n6 + n5, n2, n3));
        this.t.add(new dn(cx.OLD_HAND_LIGHT, n4, 6 * n6 + n5, n2, n3));
        this.t.add(new dn(cx.OLD_LIGHTING, n4, 7 * n6 + n5, n2, n3));
        int n8 = Math.min(150, n7 / 2 - 10);
        this.t.add(new s(201, n7 / 4 - n8 / 2, w - 25, n8, n3, gl.a("of.options.shaders.shadersFolder")));
        this.t.add(new s(202, n7 / 4 * 3 - n8 / 2, w - 25, n8, n3, net.minecraft.client.D.h.a("gui.done", new Object[0])));
        this.t.add(new s(203, n4, w - 25, n2, n3, gl.a("of.options.shaders.shaderOptions")));
        this.a();
    }

    static {
        K = 0;
        J = 3;
        y = 1;
        H = 4;
        C = 2;
        G = new float[]{0.5f, 0.70710677f, 1.0f, 1.4142135f, 2.0f};
        I = new String[]{"0.5x", "0.7x", "1x", "1.5x", "2x"};
        E = new float[]{0.0625f, 0.125f, 0.25f};
        B = new String[]{"0.5x", "1x", "2x"};
    }

    public static String a(boolean bl2) {
        String string = gl.e();
        String string2 = gl.f();
        return bl2 ? string : string2;
    }

    public static String a(float f10, float[] arrf, String[] arrstring) {
        int n2 = dm.a(f10, arrf);
        return arrstring[n2];
    }

    public static int a(float f10, float[] arrf) {
        int n2;
        block4: {
            int n3 = 0;
            String string = dB.i();
            while (n3 < arrf.length) {
                float f11 = arrf[n3];
                if (string != null) {
                    n2 = f11 == f10 ? 0 : (f11 > f10 ? 1 : -1);
                    if (string == null) break block4;
                    if (n2 >= 0) {
                        return n3;
                    }
                    ++n3;
                }
                if (string != null) continue;
            }
            n2 = arrf.length - 1;
        }
        return n2;
    }

    public dm(L l2, c c10) {
        this.F = "Shaders";
        this.D = -1;
        this.L = false;
        this.A = l2;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

