/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.J;

import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.J.A;
import net.minecraft.J.B;
import net.minecraft.J.C;
import net.minecraft.J.c;
import net.minecraft.J.j;
import net.minecraft.J.v;
import net.minecraft.J.x;
import net.minecraft.J.y;
import net.minecraft.J.z;
import net.minecraft.P.r;
import net.minecraft.T.aX;
import net.minecraft.W.K;
import net.minecraft.W.bp;
import net.minecraft.W.br;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ah.f;
import net.minecraft.ar.G;
import net.minecraft.ar.aA;
import net.minecraft.ar.e;
import net.minecraft.av.b;
import net.minecraft.k.h;
import net.minecraft.k.k;
import net.minecraft.k.l;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class u
extends net.minecraft.U.x
implements f {
    private /* synthetic */ double a0;
    private /* synthetic */ double aL;
    private static final /* synthetic */ net.minecraft.q.r<Integer> aW;
    private /* synthetic */ double aX;
    private static final /* synthetic */ net.minecraft.q.r<Float> aO;
    private /* synthetic */ double aN;
    private /* synthetic */ double aR;
    private /* synthetic */ boolean aY;
    private /* synthetic */ double aP;
    private static final /* synthetic */ net.minecraft.q.r<Boolean> aV;
    private /* synthetic */ int aS;
    private /* synthetic */ double aM;
    private static final /* synthetic */ net.minecraft.q.r<Integer> aZ;
    private static final /* synthetic */ int[][][] aQ;
    private static final /* synthetic */ net.minecraft.q.r<Integer> aU;
    private /* synthetic */ double aT;
    private static final /* synthetic */ net.minecraft.q.r<Integer> aK;

    @Override
    public double o() {
        return 0.0;
    }

    @Override
    public k aF() {
        k k2 = this.m();
        return this.j() ? k2.a((double)Math.abs(this.b()) / 16.0) : k2;
    }

    public u(net.minecraft.ah.z z2, double d10, double d11, double d12) {
        this(z2);
        this.g(d10, d11, d12);
        this.aq = 0.0;
        this.G = 0.0;
        this.d = 0.0;
        this.N = d10;
        this.L = d11;
        this.k = d12;
    }

    public void b(i i2) {
        this.E().b(aK, net.minecraft.W.K.l(i2));
        this.a(true);
    }

    protected void i() {
        block4: {
            block2: {
                u u2;
                block3: {
                    int n2 = net.minecraft.J.j.c();
                    u2 = this;
                    if (n2 != 0) break block2;
                    if (!u2.aU()) break block3;
                    this.aq *= (double)0.997f;
                    this.G *= 0.0;
                    this.d *= (double)0.997f;
                    if (n2 == 0) break block4;
                }
                this.aq *= (double)0.96f;
                this.G *= 0.0;
                u2 = this;
            }
            u2.d *= (double)0.96f;
        }
    }

    @Override
    public void g(double d10, double d11, double d12) {
        this.a = d10;
        this.aF = d11;
        this.ax = d12;
        float f10 = this.ad / 2.0f;
        float f11 = this.aD;
        this.a(new k(d10 - (double)f10, d11, d12 - (double)f10, d10 + (double)f10, d11 + (double)f11, d12 + (double)f10));
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean a(G var1_1, float var2_2) {
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

    public abstract j o();

    public void b(float f10) {
        this.ap.b(aO, Float.valueOf(f10));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public aA b() {
        aA aA2;
        int n2 = net.minecraft.J.j.d();
        u u2 = this;
        if (n2 != 0) {
            if (u2.aY) {
                aA2 = this.K().h().l();
                return aA2;
            }
            u2 = this;
        }
        aA2 = u2.K().l();
        return aA2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int b() {
        int n2;
        int n3 = net.minecraft.J.j.c();
        Object object = this;
        if (n3 == 0) {
            if (!((u)object).j()) {
                n2 = this.g();
                return n2;
            }
            object = this.E().b(aZ);
        }
        n2 = (Integer)object;
        return n2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    protected void a(r var1_1) {
        block8: {
            block6: {
                block7: {
                    var2_2 = net.minecraft.J.j.c();
                    v0 = var1_1.f("CustomDisplayTile");
                    if (var2_2 == 0) {
                        if (v0 == 0) return;
                        v0 = var1_1.a("DisplayTile", 8) ? 1 : 0;
                    }
                    if (var2_2 != 0) break block6;
                    if (v0 == 0) break block7;
                    var3_3 = net.minecraft.W.K.d(var1_1.j("DisplayTile"));
                    if (var2_2 == 0) break block8;
                }
                v0 = var1_1.m("DisplayTile");
            }
            var3_3 = net.minecraft.W.K.b(v0);
        }
        var4_4 = var1_1.m("DisplayData");
        v1 = var3_3;
        if (var2_2 != 0) ** GOTO lbl22
        if (v1 == null) {
            v2 = net.minecraft.u.g.bf.d();
        } else {
            v1 = var3_3;
lbl22:
            // 2 sources

            v2 = v1.c(var4_4);
        }
        this.b(v2);
        this.b(var1_1.m("DisplayOffset"));
    }

    public static u a(net.minecraft.ah.z z2, double d10, double d11, double d12, j j2) {
        switch (j2) {
            case CHEST: {
                return new x(z2, d10, d11, d12);
            }
            case FURNACE: {
                return new A(z2, d10, d11, d12);
            }
            case TNT: {
                return new C(z2, d10, d11, d12);
            }
            case SPAWNER: {
                return new B(z2, d10, d11, d12);
            }
            case HOPPER: {
                return new y(z2, d10, d11, d12);
            }
            case COMMAND_BLOCK: {
                return new v(z2, d10, d11, d12);
            }
        }
        return new z(z2, d10, d11, d12);
    }

    @Override
    public void a(double d10, double d11, double d12, float f10, float f11, int n2, boolean bl2) {
        this.aM = d10;
        this.aN = d11;
        this.aR = d12;
        this.aT = f10;
        this.aX = f11;
        this.aS = n2 + 2;
        this.aq = this.a0;
        this.G = this.aL;
        this.d = this.aP;
    }

    @Override
    public void b(double d10, double d11, double d12) {
        this.aq = d10;
        this.G = d11;
        this.d = d12;
        this.a0 = this.aq;
        this.aL = this.G;
        this.aP = this.d;
    }

    public float m() {
        return this.ap.b(aO).floatValue();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected void a(n var1_1, i var2_2) {
        block83: {
            block82: {
                block78: {
                    block79: {
                        block81: {
                            block80: {
                                block77: {
                                    block76: {
                                        block74: {
                                            block75: {
                                                block72: {
                                                    block73: {
                                                        block70: {
                                                            block71: {
                                                                block69: {
                                                                    block68: {
                                                                        block66: {
                                                                            block67: {
                                                                                block64: {
                                                                                    block65: {
                                                                                        block61: {
                                                                                            block62: {
                                                                                                block63: {
                                                                                                    block59: {
                                                                                                        block60: {
                                                                                                            block55: {
                                                                                                                block56: {
                                                                                                                    block57: {
                                                                                                                        block58: {
                                                                                                                            block53: {
                                                                                                                                block54: {
                                                                                                                                    block52: {
                                                                                                                                        block51: {
                                                                                                                                            block50: {
                                                                                                                                                this.an = 0.0f;
                                                                                                                                                var4_3 = this.a(this.a, this.aF, this.ax);
                                                                                                                                                this.aF = var1_1.b();
                                                                                                                                                var3_4 = net.minecraft.J.j.d();
                                                                                                                                                var5_5 = 0;
                                                                                                                                                var6_6 = 0;
                                                                                                                                                var7_7 = (bp)var2_2.b();
                                                                                                                                                if (var3_4 == 0) break block50;
                                                                                                                                                if (var7_7 != net.minecraft.u.g.w) break block51;
                                                                                                                                                var5_5 = var2_2.b(br.C).booleanValue();
                                                                                                                                            }
                                                                                                                                            v0 = var5_5;
                                                                                                                                            if (var3_4 != 0) {
                                                                                                                                                v0 = v0 == 0 ? 1 : 0;
                                                                                                                                            }
                                                                                                                                            var6_6 = v0;
                                                                                                                                        }
                                                                                                                                        var8_8 = 0.0078125;
                                                                                                                                        var10_9 = var2_2.b(var7_7.a());
                                                                                                                                        if (var3_4 == 0) ** GOTO lbl24
                                                                                                                                        switch (c.b[var10_9.ordinal()]) {
                                                                                                                                            case 1: {
                                                                                                                                                this.aq -= 0.0078125;
                                                                                                                                                this.aF += 1.0;
lbl24:
                                                                                                                                                // 2 sources

                                                                                                                                                if (var3_4 != 0) break;
                                                                                                                                                net.minecraft.k.m.b(net.minecraft.k.m.c() == false);
                                                                                                                                            }
                                                                                                                                            case 2: {
                                                                                                                                                this.aq += 0.0078125;
                                                                                                                                                this.aF += 1.0;
                                                                                                                                                if (var3_4 != 0) break;
                                                                                                                                            }
                                                                                                                                            case 3: {
                                                                                                                                                this.d += 0.0078125;
                                                                                                                                                this.aF += 1.0;
                                                                                                                                                if (var3_4 != 0) break;
                                                                                                                                            }
                                                                                                                                            case 4: {
                                                                                                                                                this.d -= 0.0078125;
                                                                                                                                                this.aF += 1.0;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        var11_10 = net.minecraft.J.u.aQ[var10_9.d()];
                                                                                                                                        var12_11 = var11_10[1][0] - var11_10[0][0];
                                                                                                                                        var14_12 = var11_10[1][2] - var11_10[0][2];
                                                                                                                                        var16_13 = Math.sqrt(var12_11 * var12_11 + var14_12 * var14_12);
                                                                                                                                        v1 = var18_14 = this.aq * var12_11 + this.d * var14_12;
                                                                                                                                        v2 = 0.0;
                                                                                                                                        if (var3_4 != 0) {
                                                                                                                                            if (v1 < v2) {
                                                                                                                                                var12_11 = -var12_11;
                                                                                                                                                var14_12 = -var14_12;
                                                                                                                                            }
                                                                                                                                            v1 = this.aq * this.aq;
                                                                                                                                            v2 = this.d * this.d;
                                                                                                                                        }
                                                                                                                                        var20_15 = Math.sqrt(v1 + v2);
                                                                                                                                        cfr_temp_0 = var20_15 - 2.0;
                                                                                                                                        v3 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                                                                                                                        if (var3_4 == 0) break block52;
                                                                                                                                        if (v3 > 0) {
                                                                                                                                            var20_15 = 2.0;
                                                                                                                                        }
                                                                                                                                        this.aq = var20_15 * var12_11 / var16_13;
                                                                                                                                        this.d = var20_15 * var14_12 / var16_13;
                                                                                                                                        v4 = this.j();
                                                                                                                                        if (var3_4 == 0) ** GOTO lbl66
                                                                                                                                        v3 = (double)v4.isEmpty();
                                                                                                                                    }
                                                                                                                                    if (v3 != false) {
                                                                                                                                        v5 = null;
                                                                                                                                    } else {
                                                                                                                                        v4 = this.j().get(0);
lbl66:
                                                                                                                                        // 2 sources

                                                                                                                                        v5 = v4;
                                                                                                                                    }
                                                                                                                                    var22_16 = v5;
                                                                                                                                    v6 = var22_16 instanceof net.minecraft.U.B;
                                                                                                                                    if (var3_4 == 0) break block53;
                                                                                                                                    if (v6 == 0) break block54;
                                                                                                                                    var23_17 = ((net.minecraft.U.B)var22_16).bU;
                                                                                                                                    cfr_temp_1 = var23_17 - 0.0;
                                                                                                                                    v6 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                                                                                                                    if (var3_4 == 0) break block53;
                                                                                                                                    if (v6 <= 0) break block54;
                                                                                                                                    var25_18 = -Math.sin(var22_16.e * 0.017453292f);
                                                                                                                                    var27_19 = Math.cos(var22_16.e * 0.017453292f);
                                                                                                                                    var29_20 = this.aq * this.aq + this.d * this.d;
                                                                                                                                    cfr_temp_2 = var29_20 - 0.01;
                                                                                                                                    v6 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 < 0.0 ? -1 : 1);
                                                                                                                                    if (var3_4 == 0) break block53;
                                                                                                                                    if (v6 < 0) {
                                                                                                                                        this.aq += var25_18 * 0.1;
                                                                                                                                        this.d += var27_19 * 0.1;
                                                                                                                                        var6_6 = 0;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                v6 = var6_6;
                                                                                                                            }
                                                                                                                            if (var3_4 == 0) break block55;
                                                                                                                            if (v6 == 0) break block56;
                                                                                                                            var23_17 = Math.sqrt(this.aq * this.aq + this.d * this.d);
                                                                                                                            if (var3_4 == 0) break block57;
                                                                                                                            if (!(var23_17 < 0.03)) break block58;
                                                                                                                            this.aq *= 0.0;
                                                                                                                            this.G *= 0.0;
                                                                                                                            this.d *= 0.0;
                                                                                                                            if (var3_4 != 0) break block56;
                                                                                                                        }
                                                                                                                        this.aq *= 0.5;
                                                                                                                        this.G *= 0.0;
                                                                                                                    }
                                                                                                                    this.d *= 0.5;
                                                                                                                }
                                                                                                                v6 = var1_1.e();
                                                                                                            }
                                                                                                            var23_17 = (double)v6 + 0.5 + (double)var11_10[0][0] * 0.5;
                                                                                                            var25_18 = (double)var1_1.a() + 0.5 + (double)var11_10[0][2] * 0.5;
                                                                                                            var27_19 = (double)var1_1.e() + 0.5 + (double)var11_10[1][0] * 0.5;
                                                                                                            var29_20 = (double)var1_1.a() + 0.5 + (double)var11_10[1][2] * 0.5;
                                                                                                            var12_11 = var27_19 - var23_17;
                                                                                                            var14_12 = var29_20 - var25_18;
                                                                                                            cfr_temp_3 = var12_11 - 0.0;
                                                                                                            v7 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 > 0.0 ? 1 : -1);
                                                                                                            if (var3_4 == 0) break block59;
                                                                                                            if (v7 != false) break block60;
                                                                                                            this.a = (double)var1_1.e() + 0.5;
                                                                                                            var31_21 = this.ax - (double)var1_1.a();
                                                                                                            if (var3_4 != 0) break block61;
                                                                                                        }
                                                                                                        v8 = var14_12;
                                                                                                        v9 = 0.0;
                                                                                                        if (var3_4 == 0) break block62;
                                                                                                        cfr_temp_4 = v8 - v9;
                                                                                                        v7 = cfr_temp_4 == 0.0 ? 0 : (cfr_temp_4 > 0.0 ? 1 : -1);
                                                                                                    }
                                                                                                    if (v7 != false) break block63;
                                                                                                    this.ax = (double)var1_1.a() + 0.5;
                                                                                                    var31_21 = this.a - (double)var1_1.e();
                                                                                                    if (var3_4 != 0) break block61;
                                                                                                }
                                                                                                v8 = this.a;
                                                                                                v9 = var23_17;
                                                                                            }
                                                                                            var33_22 = v8 - v9;
                                                                                            var35_23 = this.ax - var25_18;
                                                                                            var31_21 = (var33_22 * var12_11 + var35_23 * var14_12) * 2.0;
                                                                                        }
                                                                                        this.a = var23_17 + var12_11 * var31_21;
                                                                                        this.ax = var25_18 + var14_12 * var31_21;
                                                                                        this.g(this.a, this.aF, this.ax);
                                                                                        var33_22 = this.aq;
                                                                                        var35_23 = this.d;
                                                                                        v10 = this;
                                                                                        if (var3_4 != 0) {
                                                                                            if (v10.aU()) {
                                                                                                var33_22 *= 0.75;
                                                                                                var35_23 *= 0.75;
                                                                                            }
                                                                                            v10 = this;
                                                                                        }
                                                                                        var37_24 = v10.k();
                                                                                        var33_22 = h.b(var33_22, -var37_24, var37_24);
                                                                                        var35_23 = h.b(var35_23, -var37_24, var37_24);
                                                                                        this.a(net.minecraft.U.c.SELF, var33_22, 0.0, var35_23);
                                                                                        v11 = var11_10[0][1];
                                                                                        if (var3_4 == 0) break block64;
                                                                                        if (v11 == 0) break block65;
                                                                                        v11 = h.f(this.a) - var1_1.e();
                                                                                        if (var3_4 == 0) break block64;
                                                                                        if (v11 != var11_10[0][0]) break block65;
                                                                                        v11 = h.f(this.ax) - var1_1.a();
                                                                                        if (var3_4 == 0) break block64;
                                                                                        if (v11 != var11_10[0][2]) break block65;
                                                                                        this.g(this.a, this.aF + (double)var11_10[0][1], this.ax);
                                                                                        if (var3_4 != 0) break block66;
                                                                                    }
                                                                                    v11 = var11_10[1][1];
                                                                                }
                                                                                if (var3_4 == 0) break block67;
                                                                                if (v11 == 0) break block66;
                                                                                v12 = this;
                                                                                if (var3_4 == 0) break block68;
                                                                                v11 = h.f(v12.a) - var1_1.e();
                                                                            }
                                                                            if (v11 != var11_10[1][0]) break block66;
                                                                            v12 = this;
                                                                            if (var3_4 == 0) break block68;
                                                                            if (h.f(v12.ax) - var1_1.a() == var11_10[1][2]) {
                                                                                this.g(this.a, this.aF + (double)var11_10[1][1], this.ax);
                                                                            }
                                                                        }
                                                                        this.i();
                                                                        v12 = this;
                                                                    }
                                                                    v13 = var39_25 = v12.a(this.a, this.aF, this.ax);
                                                                    if (var3_4 == 0) break block69;
                                                                    if (v13 == null) break block70;
                                                                    v13 = var4_3;
                                                                }
                                                                if (var3_4 == 0) break block71;
                                                                if (v13 == null) break block70;
                                                                v13 = var4_3;
                                                            }
                                                            var40_26 = (v13.d - var39_25.d) * 0.05;
                                                            v14 = this;
                                                            if (var3_4 != 0) {
                                                                var20_15 = Math.sqrt(v14.aq * this.aq + this.d * this.d);
                                                                if (var20_15 > 0.0) {
                                                                    this.aq = this.aq / var20_15 * (var20_15 + var40_26);
                                                                    this.d = this.d / var20_15 * (var20_15 + var40_26);
                                                                }
                                                                v14 = this;
                                                            }
                                                            v14.g(this.a, var39_25.d, this.ax);
                                                        }
                                                        var40_27 = h.f(this.a);
                                                        var41_28 = h.f(this.ax);
                                                        if (var3_4 == 0) break block72;
                                                        if (var40_27 != var1_1.e()) break block73;
                                                        v15 = var41_28;
                                                        if (var3_4 == 0) break block74;
                                                        if (v15 == var1_1.a()) break block75;
                                                    }
                                                    var20_15 = Math.sqrt(this.aq * this.aq + this.d * this.d);
                                                    this.aq = var20_15 * (double)(var40_27 - var1_1.e());
                                                }
                                                this.d = var20_15 * (double)(var41_28 - var1_1.a());
                                            }
                                            v15 = var5_5;
                                        }
                                        if (v15 == 0) return;
                                        v16 = var42_29 = Math.sqrt(this.aq * this.aq + this.d * this.d);
                                        if (var3_4 == 0) break block76;
                                        if (!(v16 > 0.01)) break block77;
                                        v16 = 0.06;
                                    }
                                    var44_30 = v16;
                                    this.aq += this.aq / var42_29 * 0.06;
                                    this.d += this.d / var42_29 * 0.06;
                                    if (var3_4 != 0) return;
                                }
                                v17 = var10_9;
                                v18 = cL.EAST_WEST;
                                if (var3_4 == 0) break block78;
                                if (v17 != v18) break block79;
                                v19 = this.aG.d(var1_1.b()).r();
                                if (var3_4 == 0) break block80;
                                if (v19) {
                                    this.aq = 0.02;
                                    if (var3_4 != 0) return;
                                }
                                v20 = this;
                                if (var3_4 == 0) break block81;
                                v19 = v20.aG.d(var1_1.m()).r();
                            }
                            if (v19 == false) return;
                            v20 = this;
                        }
                        v20.aq = -0.02;
                        if (var3_4 != 0) return;
                    }
                    v17 = var10_9;
                    v18 = cL.NORTH_SOUTH;
                }
                if (v17 != v18) return;
                v21 = this.aG.d(var1_1.i()).r();
                if (var3_4 == 0) break block82;
                if (v21) {
                    this.d = 0.02;
                    if (var3_4 != 0) return;
                }
                v22 = this;
                if (var3_4 == 0) break block83;
                v21 = v22.aG.d(var1_1.j()).r();
            }
            if (v21 == false) return;
            v22 = this;
        }
        v22.d = -0.02;
    }

    protected void h() {
        block6: {
            block5: {
                u u2;
                boolean bl2;
                block4: {
                    double d10 = this.k();
                    int n2 = net.minecraft.J.j.d();
                    this.aq = h.b(this.aq, -d10, d10);
                    this.d = h.b(this.d, -d10, d10);
                    bl2 = this.A;
                    if (n2 == 0) break block4;
                    if (bl2) {
                        this.aq *= 0.5;
                        this.G *= 0.5;
                        this.d *= 0.5;
                    }
                    this.a(net.minecraft.U.c.SELF, this.aq, this.G, this.d);
                    u2 = this;
                    if (n2 == 0) break block5;
                    bl2 = u2.A;
                }
                if (bl2) break block6;
                this.aq *= (double)0.95f;
                this.G *= (double)0.95f;
                u2 = this;
            }
            u2.d *= (double)0.95f;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    protected void f(r var1_1) {
        var2_2 = net.minecraft.J.j.d();
        v0 = this;
        if (var2_2 != 0) {
            if (v0.j() == false) return;
            var1_1.a("CustomDisplayTile", true);
            v0 = this;
        }
        var3_3 = v0.c();
        v1 = var4_4 = net.minecraft.W.K.h.b(var3_3.b());
        if (var2_2 == 0) ** GOTO lbl14
        if (v1 == null) {
            v2 = "";
        } else {
            v1 = var4_4;
lbl14:
            // 2 sources

            v2 = v1.toString();
        }
        var1_1.a("DisplayTile", v2);
        var1_1.b("DisplayData", var3_3.b().d(var3_3));
        var1_1.b("DisplayOffset", this.b());
    }

    static {
        aU = net.minecraft.q.m.a(u.class, net.minecraft.q.h.n);
        aW = net.minecraft.q.m.a(u.class, net.minecraft.q.h.n);
        aO = net.minecraft.q.m.a(u.class, net.minecraft.q.h.k);
        aK = net.minecraft.q.m.a(u.class, net.minecraft.q.h.n);
        aZ = net.minecraft.q.m.a(u.class, net.minecraft.q.h.n);
        aV = net.minecraft.q.m.a(u.class, net.minecraft.q.h.g);
        aQ = new int[][][]{new int[][]{{0, 0, -1}, {0, 0, 1}}, new int[][]{{-1, 0, 0}, {1, 0, 0}}, new int[][]{{-1, -1, 0}, {1, 0, 0}}, new int[][]{{-1, 0, 0}, {1, -1, 0}}, new int[][]{{0, 0, -1}, {0, -1, 1}}, new int[][]{{0, -1, -1}, {0, 0, 1}}, new int[][]{{0, 0, 1}, {1, 0, 0}}, new int[][]{{0, 0, 1}, {-1, 0, 0}}, new int[][]{{0, 0, -1}, {-1, 0, 0}}, new int[][]{{0, 0, -1}, {1, 0, 0}}};
    }

    public boolean j() {
        return this.E().b(aV);
    }

    @Nullable
    public l a(double d10, double d11, double d12, double d13) {
        block9: {
            block14: {
                double d14;
                block17: {
                    int n2;
                    int n3;
                    int[][] arrn;
                    block16: {
                        int n4;
                        int n5;
                        block15: {
                            int n6;
                            block12: {
                                block13: {
                                    cL cL2;
                                    block11: {
                                        int n7;
                                        block10: {
                                            i i2;
                                            i i3;
                                            int n8;
                                            block8: {
                                                n6 = h.f(d10);
                                                n8 = h.f(d11);
                                                n5 = net.minecraft.J.j.c();
                                                n4 = h.f(d12);
                                                net.minecraft.ah.z z2 = this.aG;
                                                n n9 = new n(n6, n8 - 1, n4);
                                                if (n5 == 0) {
                                                    if (bp.b(z2, n9)) {
                                                        --n8;
                                                    }
                                                    z2 = this.aG;
                                                    n9 = new n(n6, n8, n4);
                                                }
                                                i2 = i3 = z2.d(n9);
                                                if (n5 != 0) break block8;
                                                if (!bp.a(i2)) break block9;
                                                i2 = i3;
                                            }
                                            cL2 = i2.b(((bp)i3.b()).a());
                                            d11 = n8;
                                            n7 = cL2.c();
                                            if (n5 != 0) break block10;
                                            if (n7 == 0) break block11;
                                            n7 = n8 + 1;
                                        }
                                        d11 = n7;
                                    }
                                    arrn = aQ[cL2.d()];
                                    double d15 = arrn[1][0] - arrn[0][0];
                                    double d16 = arrn[1][2] - arrn[0][2];
                                    double d17 = Math.sqrt(d15 * d15 + d16 * d16);
                                    d10 += (d15 /= d17) * d13;
                                    d12 += (d16 /= d17) * d13;
                                    n3 = arrn[0][1];
                                    if (n5 != 0) break block12;
                                    if (n3 == 0) break block13;
                                    n3 = h.f(d10) - n6;
                                    if (n5 != 0) break block12;
                                    if (n3 != arrn[0][0]) break block13;
                                    n3 = h.f(d12) - n4;
                                    if (n5 != 0) break block12;
                                    if (n3 != arrn[0][2]) break block13;
                                    d11 += (double)arrn[0][1];
                                    if (n5 == 0) break block14;
                                }
                                n3 = arrn[1][1];
                            }
                            if (n5 != 0) break block15;
                            if (n3 == 0) break block14;
                            n3 = h.f(d10) - n6;
                        }
                        n2 = arrn[1][0];
                        if (n5 != 0) break block16;
                        if (n3 != n2) break block14;
                        d14 = d12;
                        if (n5 != 0) break block17;
                        n3 = h.f(d14) - n4;
                        n2 = arrn[1][2];
                    }
                    if (n3 != n2) break block14;
                    d14 = d11 + (double)arrn[1][1];
                }
                d11 = d14;
            }
            return this.a(d10, d11, d12);
        }
        return null;
    }

    public void a(G g10) {
        int n2 = net.minecraft.J.j.d();
        this.a();
        int n3 = n2;
        if (this.aG.M().c("doEntityDrops")) {
            d d10 = new d(net.minecraft.u.h.q, 1);
            u u2 = this;
            if (n3 != 0) {
                if (u2.g()) {
                    d10.d(this.aB());
                }
                u2 = this;
            }
            u2.a(d10, 0.0f);
        }
    }

    public void e(int n2) {
        this.ap.b(aU, n2);
    }

    @Override
    public boolean M() {
        int n2 = net.minecraft.J.j.d();
        boolean bl2 = this.P;
        if (n2 != 0) {
            bl2 = !bl2;
        }
        return bl2;
    }

    @Override
    protected void ab() {
        this.ap.c(aU, 0);
        this.ap.c(aW, 1);
        this.ap.c(aO, Float.valueOf(0.0f));
        this.ap.c(aK, 0);
        this.ap.c(aZ, 6);
        this.ap.c(aV, false);
    }

    public int g() {
        return 6;
    }

    public void a(int n2, int n3, int n4, boolean bl2) {
    }

    @Override
    public void aT() {
        this.a(-this.d());
        this.e(10);
        this.b(this.m() + this.m() * 10.0f);
    }

    public u(net.minecraft.ah.z z2) {
        super(z2);
        this.az = true;
        this.c(0.98f, 0.7f);
    }

    public static void a(b b10, Class<?> class_) {
    }

    @Nullable
    public l a(double d10, double d11, double d12) {
        block10: {
            block18: {
                double d13;
                double d14;
                block17: {
                    double d15;
                    block16: {
                        double d16;
                        double d17;
                        double d18;
                        double d19;
                        double d20;
                        double d21;
                        double d22;
                        int n2;
                        block13: {
                            double d23;
                            double d24;
                            block14: {
                                block15: {
                                    double d25;
                                    int n3;
                                    block11: {
                                        block12: {
                                            i i2;
                                            i i3;
                                            int n4;
                                            int n5;
                                            block9: {
                                                n3 = h.f(d10);
                                                n5 = h.f(d11);
                                                n4 = h.f(d12);
                                                n2 = net.minecraft.J.j.d();
                                                net.minecraft.ah.z z2 = this.aG;
                                                n n6 = new n(n3, n5 - 1, n4);
                                                if (n2 != 0) {
                                                    if (bp.b(z2, n6)) {
                                                        --n5;
                                                    }
                                                    z2 = this.aG;
                                                    n6 = new n(n3, n5, n4);
                                                }
                                                i2 = i3 = z2.d(n6);
                                                if (n2 == 0) break block9;
                                                if (!bp.a(i2)) break block10;
                                                i2 = i3;
                                            }
                                            cL cL2 = i2.b(((bp)i3.b()).a());
                                            int[][] arrn = aQ[cL2.d()];
                                            d22 = (double)n3 + 0.5 + (double)arrn[0][0] * 0.5;
                                            d21 = (double)n5 + 0.0625 + (double)arrn[0][1] * 0.5;
                                            d20 = (double)n4 + 0.5 + (double)arrn[0][2] * 0.5;
                                            double d26 = (double)n3 + 0.5 + (double)arrn[1][0] * 0.5;
                                            double d27 = (double)n5 + 0.0625 + (double)arrn[1][1] * 0.5;
                                            double d28 = (double)n4 + 0.5 + (double)arrn[1][2] * 0.5;
                                            d19 = d26 - d22;
                                            d18 = (d27 - d21) * 2.0;
                                            d17 = d28 - d20;
                                            double d29 = d19 - 0.0;
                                            d25 = d29 == 0.0 ? 0 : (d29 > 0.0 ? 1 : -1);
                                            if (n2 == 0) break block11;
                                            if (d25 != false) break block12;
                                            d16 = d12 - (double)n4;
                                            if (n2 != 0) break block13;
                                        }
                                        d24 = d17;
                                        d23 = 0.0;
                                        if (n2 == 0) break block14;
                                        double d30 = d24 - d23;
                                        d25 = d30 == 0.0 ? 0 : (d30 > 0.0 ? 1 : -1);
                                    }
                                    if (d25 != false) break block15;
                                    d16 = d10 - (double)n3;
                                    if (n2 != 0) break block13;
                                }
                                d24 = d10;
                                d23 = d22;
                            }
                            double d31 = d24 - d23;
                            double d32 = d12 - d20;
                            d16 = (d31 * d19 + d32 * d17) * 2.0;
                        }
                        d10 = d22 + d19 * d16;
                        d11 = d21 + d18 * d16;
                        d12 = d20 + d17 * d16;
                        double d33 = d18 - 0.0;
                        d15 = d33 == 0.0 ? 0 : (d33 < 0.0 ? -1 : 1);
                        if (n2 == 0) break block16;
                        if (d15 < 0) {
                            d11 += 1.0;
                        }
                        d14 = d18;
                        d13 = 0.0;
                        if (n2 == 0) break block17;
                        double d34 = d14 - d13;
                        d15 = d34 == 0.0 ? 0 : (d34 > 0.0 ? 1 : -1);
                    }
                    if (d15 <= 0) break block18;
                    d14 = d11;
                    d13 = 0.5;
                }
                d11 = d14 + d13;
            }
            return new l(d10, d11, d12);
        }
        return null;
    }

    public int f() {
        return this.ap.b(aU);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    @Nullable
    public k az() {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public i c() {
        i i2;
        int n2 = net.minecraft.J.j.c();
        int n3 = this.j();
        if (n2 == 0) {
            if (n3 == 0) {
                i2 = this.n();
                return i2;
            }
            n3 = this.E().b(aK);
        }
        i2 = net.minecraft.W.K.a(n3);
        return i2;
    }

    public int d() {
        return this.ap.b(aW);
    }

    public void b(int n2) {
        this.E().b(aZ, n2);
        this.a(true);
    }

    public void a(int n2) {
        this.ap.b(aW, n2);
    }

    public i n() {
        return net.minecraft.u.g.bf.d();
    }

    @Override
    public void n(net.minecraft.U.x x2) {
        block10: {
            net.minecraft.U.x x3;
            double d10;
            double d11;
            block16: {
                block17: {
                    int n2;
                    block20: {
                        net.minecraft.U.x x4;
                        double d12;
                        double d13;
                        block21: {
                            block22: {
                                j j2;
                                j j3;
                                block18: {
                                    block19: {
                                        double d14;
                                        double d15;
                                        block15: {
                                            double d16;
                                            double d17;
                                            block14: {
                                                double d18;
                                                net.minecraft.U.x x5;
                                                block13: {
                                                    boolean bl2;
                                                    block12: {
                                                        block11: {
                                                            block9: {
                                                                n2 = net.minecraft.J.j.c();
                                                                bl2 = this.aG.C;
                                                                if (n2 != 0) break block9;
                                                                if (bl2) break block10;
                                                                bl2 = x2.K;
                                                            }
                                                            if (n2 != 0) break block11;
                                                            if (bl2) break block10;
                                                            bl2 = this.K;
                                                        }
                                                        if (n2 != 0) break block12;
                                                        if (bl2) break block10;
                                                        x5 = this;
                                                        if (n2 != 0) break block13;
                                                        bl2 = x5.l(x2);
                                                    }
                                                    if (bl2) break block10;
                                                    x5 = x2;
                                                }
                                                d11 = x5.a - this.a;
                                                d10 = x2.ax - this.ax;
                                                d17 = d18 = d11 * d11 + d10 * d10;
                                                d16 = 1.0E-4f;
                                                if (n2 != 0) break block14;
                                                if (!(d17 >= d16)) break block10;
                                                d18 = h.e(d18);
                                                d11 /= d18;
                                                d10 /= d18;
                                                d17 = 1.0;
                                                d16 = d18;
                                            }
                                            double d19 = d17 / d16;
                                            double d20 = d19 - 1.0;
                                            d15 = d20 == 0.0 ? 0 : (d20 > 0.0 ? 1 : -1);
                                            if (n2 != 0) break block15;
                                            if (d15 > 0) {
                                                d19 = 1.0;
                                            }
                                            d11 *= d19;
                                            d10 *= d19;
                                            d11 *= (double)0.1f;
                                            d10 *= (double)0.1f;
                                            d11 *= (double)(1.0f - this.x);
                                            d10 *= (double)(1.0f - this.x);
                                            d11 *= 0.5;
                                            d10 *= 0.5;
                                            x3 = x2;
                                            if (n2 != 0) break block16;
                                            d15 = (double)(x3 instanceof u);
                                        }
                                        if (d15 == false) break block17;
                                        double d21 = x2.a - this.a;
                                        double d22 = x2.ax - this.ax;
                                        l l2 = new l(d21, 0.0, d22).d();
                                        l l3 = new l(h.c(this.e * ((float)Math.PI / 180)), 0.0, h.g(this.e * ((float)Math.PI / 180))).d();
                                        double d23 = d14 = Math.abs(l2.g(l3));
                                        double d24 = 0.8f;
                                        if (n2 == 0) {
                                            if (d23 < d24) {
                                                return;
                                            }
                                            d23 = x2.aq;
                                            d24 = this.aq;
                                        }
                                        d13 = d23 + d24;
                                        d12 = x2.d + this.d;
                                        j3 = ((u)x2).o();
                                        j2 = net.minecraft.J.j.FURNACE;
                                        if (n2 != 0) break block18;
                                        if (j3 != j2) break block19;
                                        j3 = this.o();
                                        j2 = net.minecraft.J.j.FURNACE;
                                        if (n2 != 0) break block18;
                                        if (j3 == j2) break block19;
                                        this.aq *= (double)0.2f;
                                        this.d *= (double)0.2f;
                                        this.h(x2.aq - d11, 0.0, x2.d - d10);
                                        x2.aq *= (double)0.95f;
                                        x2.d *= (double)0.95f;
                                        if (n2 == 0) break block20;
                                    }
                                    x4 = (u)x2;
                                    if (n2 != 0) break block21;
                                    j3 = x4.o();
                                    j2 = net.minecraft.J.j.FURNACE;
                                }
                                if (j3 == j2) break block22;
                                x4 = this;
                                if (n2 != 0) break block21;
                                if (x4.o() != net.minecraft.J.j.FURNACE) break block22;
                                x2.aq *= (double)0.2f;
                                x2.d *= (double)0.2f;
                                x2.h(this.aq + d11, 0.0, this.d + d10);
                                this.aq *= (double)0.95f;
                                this.d *= (double)0.95f;
                                if (n2 == 0) break block20;
                            }
                            this.aq *= (double)0.2f;
                            this.d *= (double)0.2f;
                            this.h((d13 /= 2.0) - d11, 0.0, (d12 /= 2.0) - d10);
                            x2.aq *= (double)0.2f;
                            x2.d *= (double)0.2f;
                            x4 = x2;
                        }
                        x4.h(d13 + d11, 0.0, d12 + d10);
                    }
                    if (n2 == 0) break block10;
                }
                this.h(-d11, 0.0, -d10);
                x3 = x2;
            }
            x3.h(d11 / 4.0, 0.0, d10 / 4.0);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    @Nullable
    public k k(net.minecraft.U.x x2) {
        int n2 = net.minecraft.J.j.d();
        net.minecraft.U.x x3 = x2;
        if (n2 != 0) {
            if (!x3.aY()) return null;
            x3 = x2;
        }
        k k2 = x3.m();
        return k2;
    }

    @Override
    protected boolean h() {
        return false;
    }

    @Override
    public void ae() {
        block38: {
            boolean bl2;
            block72: {
                u u2;
                int n2;
                block65: {
                    block66: {
                        block68: {
                            int n3;
                            List<net.minecraft.U.x> list;
                            block67: {
                                block64: {
                                    block63: {
                                        double d10;
                                        block60: {
                                            u u3;
                                            double d11;
                                            block62: {
                                                block61: {
                                                    block58: {
                                                        block59: {
                                                            block57: {
                                                                i i2;
                                                                i i3;
                                                                int n4;
                                                                int n5;
                                                                int n6;
                                                                block56: {
                                                                    int n7;
                                                                    block52: {
                                                                        block53: {
                                                                            u u4;
                                                                            block54: {
                                                                                block55: {
                                                                                    block39: {
                                                                                        block40: {
                                                                                            u u5;
                                                                                            block51: {
                                                                                                int n8;
                                                                                                block43: {
                                                                                                    block44: {
                                                                                                        block41: {
                                                                                                            block42: {
                                                                                                                block47: {
                                                                                                                    int n9;
                                                                                                                    u u6;
                                                                                                                    block45: {
                                                                                                                        block46: {
                                                                                                                            int n10;
                                                                                                                            block50: {
                                                                                                                                int n11;
                                                                                                                                block48: {
                                                                                                                                    block49: {
                                                                                                                                        n2 = net.minecraft.J.j.c();
                                                                                                                                        n7 = this.f();
                                                                                                                                        if (n2 == 0) {
                                                                                                                                            float f10;
                                                                                                                                            if (n7 > 0) {
                                                                                                                                                this.e(this.f() - 1);
                                                                                                                                            }
                                                                                                                                            n7 = (f10 = this.m() - 0.0f) == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                                                                                                                                        }
                                                                                                                                        if (n2 == 0) {
                                                                                                                                            double d12;
                                                                                                                                            if (n7 > 0) {
                                                                                                                                                this.b(this.m() - 1.0f);
                                                                                                                                            }
                                                                                                                                            n7 = (d12 = this.aF - -64.0) == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                                                                                                                                        }
                                                                                                                                        if (n2 == 0) {
                                                                                                                                            if (n7 < 0) {
                                                                                                                                                this.ac();
                                                                                                                                            }
                                                                                                                                            n7 = this.aG.C ? 1 : 0;
                                                                                                                                        }
                                                                                                                                        if (n2 != 0) break block39;
                                                                                                                                        if (n7 != 0) break block40;
                                                                                                                                        n7 = this.aG instanceof net.minecraft.ah.A;
                                                                                                                                        if (n2 != 0) break block39;
                                                                                                                                        if (n7 == 0) break block40;
                                                                                                                                        this.aG.H.b("portal");
                                                                                                                                        net.minecraft.R.b b10 = this.aG.H();
                                                                                                                                        n6 = this.am();
                                                                                                                                        n8 = this.aH;
                                                                                                                                        if (n2 != 0) break block41;
                                                                                                                                        if (n8 == 0) break block42;
                                                                                                                                        n8 = b10.an() ? 1 : 0;
                                                                                                                                        if (n2 != 0) break block43;
                                                                                                                                        if (n8 == 0) break block44;
                                                                                                                                        u6 = this;
                                                                                                                                        if (n2 != 0) break block45;
                                                                                                                                        if (u6.N()) break block46;
                                                                                                                                        u u7 = this;
                                                                                                                                        u6 = u7;
                                                                                                                                        n9 = u7.U;
                                                                                                                                        if (n2 != 0) break block47;
                                                                                                                                        u6.U = n9 + 1;
                                                                                                                                        if (n9 < n6) break block46;
                                                                                                                                        this.U = n6;
                                                                                                                                        this.aw = this.F();
                                                                                                                                        n11 = this.aG.D.r().a();
                                                                                                                                        if (n2 != 0) break block48;
                                                                                                                                        if (n11 != -1) break block49;
                                                                                                                                        n10 = 0;
                                                                                                                                        if (n2 == 0) break block50;
                                                                                                                                    }
                                                                                                                                    n11 = -1;
                                                                                                                                }
                                                                                                                                n10 = n11;
                                                                                                                            }
                                                                                                                            this.e(n10);
                                                                                                                        }
                                                                                                                        u6 = this;
                                                                                                                    }
                                                                                                                    n9 = u6.aH = 0;
                                                                                                                }
                                                                                                                if (n2 == 0) break block44;
                                                                                                            }
                                                                                                            n8 = this.U;
                                                                                                        }
                                                                                                        if (n2 == 0) {
                                                                                                            if (n8 > 0) {
                                                                                                                this.U -= 4;
                                                                                                            }
                                                                                                            n8 = this.U;
                                                                                                        }
                                                                                                        if (n2 != 0) break block43;
                                                                                                        if (n8 < 0) {
                                                                                                            this.U = 0;
                                                                                                        }
                                                                                                    }
                                                                                                    u5 = this;
                                                                                                    if (n2 != 0) break block51;
                                                                                                    n8 = u5.aw;
                                                                                                }
                                                                                                if (n8 > 0) {
                                                                                                    --this.aw;
                                                                                                }
                                                                                                u5 = this;
                                                                                            }
                                                                                            u5.aG.H.c();
                                                                                        }
                                                                                        n7 = this.aG.C ? 1 : 0;
                                                                                    }
                                                                                    if (n2 != 0) break block52;
                                                                                    if (n7 == 0) break block53;
                                                                                    u4 = this;
                                                                                    if (n2 != 0) break block54;
                                                                                    if (u4.aS <= 0) break block55;
                                                                                    double d13 = this.a + (this.aM - this.a) / (double)this.aS;
                                                                                    double d14 = this.aF + (this.aN - this.aF) / (double)this.aS;
                                                                                    double d15 = this.ax + (this.aR - this.ax) / (double)this.aS;
                                                                                    double d16 = h.b(this.aT - (double)this.e);
                                                                                    this.e = (float)((double)this.e + d16 / (double)this.aS);
                                                                                    this.at = (float)((double)this.at + (this.aX - (double)this.at) / (double)this.aS);
                                                                                    --this.aS;
                                                                                    this.g(d13, d14, d15);
                                                                                    this.e(this.e, this.at);
                                                                                    if (n2 == 0) break block38;
                                                                                }
                                                                                this.g(this.a, this.aF, this.ax);
                                                                                u4 = this;
                                                                            }
                                                                            u4.e(this.e, this.at);
                                                                            if (n2 == 0) break block38;
                                                                        }
                                                                        this.N = this.a;
                                                                        this.L = this.aF;
                                                                        this.k = this.ax;
                                                                        n7 = this.aI() ? 1 : 0;
                                                                    }
                                                                    if (n2 == 0) {
                                                                        if (n7 == 0) {
                                                                            this.G -= (double)0.04f;
                                                                        }
                                                                        n7 = h.f(this.a);
                                                                    }
                                                                    if (bp.b(this.aG, new n(n5 = n7, (n6 = h.f(this.aF)) - 1, n4 = h.f(this.ax)))) {
                                                                        --n6;
                                                                    }
                                                                    n n12 = new n(n5, n6, n4);
                                                                    i2 = i3 = this.aG.d(n12);
                                                                    if (n2 != 0) break block56;
                                                                    if (!bp.a(i2)) break block57;
                                                                    this.a(n12, i3);
                                                                    if (n2 != 0) break block58;
                                                                    i2 = i3;
                                                                }
                                                                if (i2.b() != net.minecraft.u.g.az) break block59;
                                                                this.a(n5, n6, n4, i3.b(br.C));
                                                                if (n2 == 0) break block59;
                                                            }
                                                            this.h();
                                                        }
                                                        this.C();
                                                        this.at = 0.0f;
                                                    }
                                                    double d17 = this.N - this.a;
                                                    double d18 = this.k - this.ax;
                                                    d11 = d17 * d17 + d18 * d18;
                                                    if (n2 != 0) break block60;
                                                    if (!(d11 > 0.001)) break block61;
                                                    this.e = (float)(h.a(d18, d17) * 180.0 / Math.PI);
                                                    u3 = this;
                                                    if (n2 != 0) break block62;
                                                    if (u3.aY) {
                                                        this.e += 180.0f;
                                                    }
                                                }
                                                u3 = this;
                                            }
                                            d11 = d10 = (double)h.b(u3.e - this.ak);
                                        }
                                        if (n2 != 0) break block63;
                                        if (!(d10 < -170.0) && !(d10 >= 170.0)) break block64;
                                        this.e += 180.0f;
                                    }
                                    boolean bl3 = this.aY;
                                    if (n2 == 0) {
                                        bl3 = !bl3;
                                    }
                                    this.aY = bl3;
                                }
                                this.e(this.e, this.at);
                                u2 = this;
                                if (n2 != 0) break block65;
                                if (u2.o() != net.minecraft.J.j.RIDEABLE) break block66;
                                u2 = this;
                                if (n2 != 0) break block65;
                                if (!(u2.aq * this.aq + this.d * this.d > 0.01)) break block66;
                                list = this.aG.a((net.minecraft.U.x)this, this.m().a((double)0.2f, 0.0, 0.2f), net.minecraft.ar.e.b(this));
                                int n13 = list.isEmpty();
                                if (n2 != 0) break block67;
                                if (n13 != 0) break block68;
                                n13 = n3 = 0;
                            }
                            while (n3 < list.size()) {
                                block71: {
                                    net.minecraft.U.x x2;
                                    block69: {
                                        net.minecraft.U.x x3;
                                        block70: {
                                            x2 = x3 = (net.minecraft.U.x)list.get(n3);
                                            if (n2 != 0) break block69;
                                            bl2 = x2 instanceof net.minecraft.i.j;
                                            if (n2 != 0) break block38;
                                            if (bl2) break block70;
                                            x2 = x3;
                                            if (n2 != 0) break block69;
                                            if (x2 instanceof aX) break block70;
                                            x2 = x3;
                                            if (n2 != 0) break block69;
                                            if (x2 instanceof u) break block70;
                                            x2 = this;
                                            if (n2 != 0) break block69;
                                            if (x2.aU()) break block70;
                                            x2 = x3;
                                            if (n2 != 0) break block69;
                                            if (x2.N()) break block70;
                                            x3.h(this);
                                            if (n2 == 0) break block71;
                                        }
                                        x2 = x3;
                                    }
                                    x2.n(this);
                                }
                                ++n3;
                                if (n2 == 0) continue;
                            }
                        }
                        if (n2 == 0) break block72;
                    }
                    u2 = this;
                }
                for (net.minecraft.U.x x4 : u2.aG.b((net.minecraft.U.x)this, this.m().a((double)0.2f, 0.0, 0.2f))) {
                    block74: {
                        net.minecraft.U.x x5;
                        block76: {
                            boolean bl4;
                            block75: {
                                block73: {
                                    bl2 = this.l(x4);
                                    if (n2 != 0) break block38;
                                    if (n2 != 0) break block73;
                                    if (bl2) break block74;
                                    bl4 = x4.aY();
                                }
                                if (n2 != 0) break block75;
                                if (!bl4) break block74;
                                x5 = x4;
                                if (n2 != 0) break block76;
                                bl4 = x5 instanceof u;
                            }
                            if (!bl4) break block74;
                            x5 = x4;
                        }
                        x5.n(this);
                    }
                    if (n2 == 0) continue;
                }
            }
            bl2 = this.t();
        }
    }

    protected double k() {
        return 0.4;
    }

    public void a(boolean bl2) {
        this.E().b(aV, bl2);
    }

    @Override
    public boolean aY() {
        return true;
    }
}

