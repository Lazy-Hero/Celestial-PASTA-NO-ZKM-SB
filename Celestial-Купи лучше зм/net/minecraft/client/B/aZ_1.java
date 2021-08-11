/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.b;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.minecraft.at.l;
import net.minecraft.aw.b;
import net.minecraft.aw.c;
import net.minecraft.aw.w;
import net.minecraft.aw.z;
import net.minecraft.client.D.h;
import net.minecraft.client.Q;
import net.minecraft.client.a.v;
import net.minecraft.client.b.R;
import net.minecraft.client.b.aG;
import net.minecraft.client.b.aJ;
import net.minecraft.client.b.aX;
import net.minecraft.client.b.ag;
import net.minecraft.client.b.ao;
import net.minecraft.client.b.at;
import net.minecraft.client.b.bw;
import net.minecraft.client.b.p;
import net.minecraft.client.b.q;
import net.minecraft.client.e.y;
import net.minecraft.client.j.f;
import net.minecraft.u.E;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class aZ
implements aJ {
    private final /* synthetic */ bw g;
    private static final /* synthetic */ Logger c;
    private final /* synthetic */ net.minecraft.ar.v e;
    private final /* synthetic */ c f;
    private static final /* synthetic */ net.minecraft.ar.v i;
    private /* synthetic */ f a;
    private /* synthetic */ long d;
    private final /* synthetic */ Q k;
    private static final /* synthetic */ net.minecraft.ar.v h;
    private /* synthetic */ File j;
    private static final /* synthetic */ DateFormat b;
    private final /* synthetic */ at l;

    private void e() {
        block3: {
            Q q2;
            block2: {
                String[] arrstring = q.b();
                this.k.p().c(y.a(E.bN, 1.0f));
                String[] arrstring2 = arrstring;
                q2 = this.k;
                if (arrstring2 == null) break block2;
                if (!q2.e().b(this.f.a())) break block3;
                q2 = this.k;
            }
            q2.a(this.f.a(), this.f.c(), null);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(int var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6, int var7_7, boolean var8_8, float var9_9) {
        block31: {
            block32: {
                block34: {
                    block33: {
                        block29: {
                            block30: {
                                block23: {
                                    block27: {
                                        block28: {
                                            block26: {
                                                block25: {
                                                    block24: {
                                                        block21: {
                                                            block22: {
                                                                var11_10 = this.f.c();
                                                                var10_11 = q.b();
                                                                var12_12 = this.f.a() + " (" + aZ.b.format(new Date(this.f.f())) + ")";
                                                                var13_13 = "";
                                                                v0 = StringUtils.isEmpty((CharSequence)var11_10);
                                                                if (var10_11 != null) {
                                                                    if (v0) {
                                                                        var11_10 = net.minecraft.client.D.h.a("selectWorld.world", new Object[0]) + " " + (var1_1 + 1);
                                                                    }
                                                                    v0 = this.f.i();
                                                                }
                                                                if (var10_11 == null) break block21;
                                                                if (!v0) break block22;
                                                                var13_13 = net.minecraft.client.D.h.a("selectWorld.conversion", new Object[0]) + " " + var13_13;
                                                                if (var10_11 != null) break block23;
                                                            }
                                                            var13_13 = net.minecraft.client.D.h.a("gameMode." + this.f.h().a(), new Object[0]);
                                                            v0 = this.f.e();
                                                        }
                                                        if (var10_11 == null) break block24;
                                                        if (v0) {
                                                            var13_13 = (Object)net.minecraft.at.l.DARK_RED + net.minecraft.client.D.h.a("gameMode.hardcore", new Object[0]) + (Object)net.minecraft.at.l.RESET;
                                                        }
                                                        v1 = this.f;
                                                        if (var10_11 == null) break block25;
                                                        v0 = v1.d();
                                                    }
                                                    if (v0) {
                                                        var13_13 = var13_13 + ", " + net.minecraft.client.D.h.a("selectWorld.cheats", new Object[0]);
                                                    }
                                                    v1 = this.f;
                                                }
                                                var14_14 = v1.g();
                                                v2 = this.f.b();
                                                if (var10_11 == null) break block26;
                                                if (!v2) break block27;
                                                v2 = this.f.k();
                                            }
                                            if (!v2) break block28;
                                            var13_13 = var13_13 + ", " + net.minecraft.client.D.h.a("selectWorld.version", new Object[0]) + " " + (Object)net.minecraft.at.l.RED + var14_14 + (Object)net.minecraft.at.l.RESET;
                                            if (var10_11 != null) break block23;
                                        }
                                        var13_13 = var13_13 + ", " + net.minecraft.client.D.h.a("selectWorld.version", new Object[0]) + " " + (Object)net.minecraft.at.l.ITALIC + var14_14 + (Object)net.minecraft.at.l.RESET;
                                        if (var10_11 != null) break block23;
                                    }
                                    var13_13 = var13_13 + ", " + net.minecraft.client.D.h.a("selectWorld.version", new Object[0]) + " " + var14_14;
                                }
                                this.k.a6.b(var11_10, var2_2 + 32 + 3, var3_3 + 1, 0xFFFFFF);
                                this.k.a6.b(var12_12, var2_2 + 32 + 3, var3_3 + this.k.a6.p + 3, 0x808080);
                                this.k.a6.b(var13_13, var2_2 + 32 + 3, var3_3 + this.k.a6.p + this.k.a6.p + 3, 0x808080);
                                v.b(1.0f, 1.0f, 1.0f, 1.0f);
                                v3 = this.k.aN();
                                v4 = this;
                                if (var10_11 == null) ** GOTO lbl56
                                if (v4.a != null) {
                                    v4 = this;
lbl56:
                                    // 2 sources

                                    v5 = v4.e;
                                } else {
                                    v5 = aZ.h;
                                }
                                v3.b(v5);
                                v.a();
                                q.a(var2_2, var3_3, 0.0f, 0.0f, 32.0f, 32.0f, 32.0f, 32.0f);
                                v.f();
                                v6 = this.k.ac.aZ;
                                if (var10_11 == null) break block29;
                                if (v6 != 0) break block30;
                                v6 = var8_8;
                                if (var10_11 == null) break block29;
                                if (v6 == 0) return;
                            }
                            this.k.aN().b(aZ.i);
                            q.a(var2_2, var3_3, var2_2 + 32, var3_3 + 32, -1601138544);
                            v.b(1.0f, 1.0f, 1.0f, 1.0f);
                            v6 = var6_6 - var2_2;
                        }
                        v7 = var14_15 = v6;
                        if (var10_11 != null) {
                            v7 = v7 < 32 ? 32 : 0;
                        }
                        var15_16 = v7;
                        v8 = this.f.b();
                        if (var10_11 == null) break block31;
                        if (v8 == 0) break block32;
                        q.a(var2_2, var3_3, 32.0f, var15_16, 32.0f, 32.0f, 256.0f, 256.0f);
                        v9 = this.f.k();
                        if (var10_11 == null) break block33;
                        if (v9 != 0) {
                            q.a(var2_2, var3_3, 96.0f, var15_16, 32.0f, 32.0f, 256.0f, 256.0f);
                            if (var10_11 != null) {
                                if (var14_15 >= 32) return;
                                this.l.a((Object)net.minecraft.at.l.RED + net.minecraft.client.D.h.a("selectWorld.tooltip.fromNewerVersion1", new Object[0]) + "\n" + (Object)net.minecraft.at.l.RED + net.minecraft.client.D.h.a("selectWorld.tooltip.fromNewerVersion2", new Object[0]));
                            }
                            if (var10_11 != null) return;
                        }
                        q.a(var2_2, var3_3, 64.0f, var15_16, 32.0f, 32.0f, 256.0f, 256.0f);
                        if (var10_11 == null) break block34;
                        v9 = var14_15;
                    }
                    if (v9 >= 32) return;
                    this.l.a((Object)net.minecraft.at.l.GOLD + net.minecraft.client.D.h.a("selectWorld.tooltip.snapshot1", new Object[0]) + "\n" + (Object)net.minecraft.at.l.GOLD + net.minecraft.client.D.h.a("selectWorld.tooltip.snapshot2", new Object[0]));
                }
                if (var10_11 != null) return;
            }
            v8 = var2_2;
        }
        q.a(v8, var3_3, 0.0f, var15_16, 32.0f, 32.0f, 256.0f, 256.0f);
    }

    @Override
    public void a(int n2, int n3, int n4, float f10) {
    }

    static Q c(aZ aZ2) {
        return aZ2.k;
    }

    public void b() {
        block4: {
            aZ aZ2;
            block2: {
                block3: {
                    String[] arrstring = q.b();
                    aZ2 = this;
                    if (arrstring == null) break block2;
                    if (!aZ2.f.k()) break block3;
                    this.k.a(new ao(new p(this), net.minecraft.client.D.h.a("selectWorld.versionQuestion", new Object[0]), net.minecraft.client.D.h.a("selectWorld.versionWarning", this.f.g()), net.minecraft.client.D.h.a("selectWorld.versionJoinButton", new Object[0]), net.minecraft.client.D.h.a("gui.cancel", new Object[0]), 0));
                    if (arrstring != null) break block4;
                }
                aZ2 = this;
            }
            aZ2.e();
        }
    }

    public void d() {
        this.k.a(new aG(this.l, this.f.a()));
    }

    static c e(aZ aZ2) {
        return aZ2.f;
    }

    static at a(aZ aZ2) {
        return aZ2.l;
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    static {
        c = LogManager.getLogger();
        b = new SimpleDateFormat();
        h = new net.minecraft.ar.v("textures/misc/unknown_server.png");
        i = new net.minecraft.ar.v("textures/gui/world_selection.png");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(int var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6) {
        v0 = q.b();
        this.g.a(var1_1);
        var7_7 = v0;
        v1 = var5_5;
        if (var7_7 != null) {
            if (v1 <= 32) {
                v1 = var5_5;
                if (var7_7 != null) {
                    if (v1 < 32) {
                        this.b();
                        return true;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v1 = (cfr_temp_0 = Q.aj() - this.d - 250L) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
            }
        }
        if (var7_7 == null) return (boolean)v1;
        if (v1 < 0) {
            this.b();
            return true;
        }
        this.d = Q.aj();
        return (boolean)0;
    }

    public void a() {
        block3: {
            R r2;
            block2: {
                String[] arrstring = q.b();
                this.k.a(new aX());
                String[] arrstring2 = arrstring;
                r2 = new R(this.l);
                b b10 = this.k.e().a(this.f.a(), false);
                w w2 = b10.c();
                b10.e();
                if (arrstring2 == null) break block2;
                if (w2 == null) break block3;
                r2.a(w2);
            }
            this.k.a(r2);
        }
    }

    /*
     * Exception decompiling
     */
    private void f() {
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

    static bw b(aZ aZ2) {
        return aZ2.g;
    }

    public void c() {
        this.k.a(new ao(new ag(this), net.minecraft.client.D.h.a("selectWorld.deleteQuestion", new Object[0]), "'" + this.f.c() + "' " + net.minecraft.client.D.h.a("selectWorld.deleteWarning", new Object[0]), net.minecraft.client.D.h.a("selectWorld.deleteButton", new Object[0]), net.minecraft.client.D.h.a("gui.cancel", new Object[0]), 0));
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public aZ(bw bw2, c c10, z z2) {
        String[] arrstring = q.b();
        this.g = bw2;
        String[] arrstring2 = arrstring;
        this.l = bw2.a();
        this.f = c10;
        this.k = Q.P();
        this.e = new net.minecraft.ar.v("worlds/" + c10.a() + "/icon");
        this.j = z2.b(c10.a(), "icon.png");
        aZ aZ2 = this;
        if (arrstring2 != null) {
            if (!aZ2.j.isFile()) {
                this.j = null;
            }
            aZ2 = this;
        }
        aZ2.f();
    }

    static void d(aZ aZ2) {
        aZ2.e();
    }
}

