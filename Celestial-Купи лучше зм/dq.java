/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import java.awt.Color;
import java.io.IOException;
import net.minecraft.at.l;
import net.minecraft.client.b.L;
import net.minecraft.client.b.aq;
import net.minecraft.client.b.s;
import org.lwjgl.input.Keyboard;

public final class dq
extends L {
    private /* synthetic */ g_ A;
    private /* synthetic */ db z;
    private final /* synthetic */ L B;
    private /* synthetic */ aq y;

    @Override
    protected void a(int n2, int n3, int n4) {
        try {
            super.a(n2, n3, n4);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        this.y.a(n2, n3, n4);
        this.z.a(n2, n3, n4);
    }

    @Override
    public void h() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    @Override
    public void e() {
        this.y.i();
        this.z.l();
    }

    @Override
    protected void a(char n2, int n3) {
        block15: {
            int n4;
            int n5;
            block10: {
                int n6;
                block11: {
                    db db2;
                    block14: {
                        aq aq2;
                        block12: {
                            block13: {
                                n6 = fQ.d();
                                try {
                                    super.a((char)n2, n3);
                                }
                                catch (IOException iOException) {
                                    iOException.printStackTrace();
                                }
                                n5 = n2;
                                n4 = 9;
                                if (n6 != 0) break block10;
                                if (n5 != n4) break block11;
                                aq2 = this.y;
                                if (n6 != 0) break block12;
                                if (aq2.b()) break block13;
                                db2 = this.z;
                                if (n6 != 0) break block14;
                                if (db2.c()) break block13;
                                this.y.c(true);
                                if (n6 == 0) break block11;
                            }
                            aq2 = this.y;
                        }
                        aq2.c(this.z.c());
                        db2 = this.z;
                    }
                    boolean bl2 = this.y.b();
                    if (n6 == 0) {
                        bl2 = !bl2;
                    }
                    db2.b(bl2);
                }
                n5 = n2;
                if (n6 != 0) break block15;
                n4 = 13;
            }
            if (n5 == n4) {
                this.a((s)this.t.get(0));
            }
            this.y.a((char)n2, n3);
            n5 = this.z.a((char)n2, n3) ? 1 : 0;
        }
    }

    public dq(L l2) {
        this.B = l2;
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void a(s var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [9[CASE], 6[SWITCH]], but top level block is 5[TRYBLOCK]
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:429)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:478)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:728)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:806)
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
    @Override
    public void a(int var1_1, int var2_2, float var3_3) {
        block9: {
            block10: {
                block7: {
                    block8: {
                        dJ.a(0.0, 0.0, dq.h, dq.w, 0.5, new Color(22, 22, 22, 255).getRGB(), new Color(60, 60, 60, 255).getRGB(), true);
                        this.y.d();
                        v0 = fQ.d();
                        this.z.h();
                        var4_4 = v0;
                        this.m.ax.b("Alt Login", (float)dq.h / 2.0f, 20.0f, -1);
                        v1 = this.A;
                        if (var4_4 != 0) ** GOTO lbl14
                        if (v1 == null) {
                            v2 = (Object)net.minecraft.at.l.GRAY + "Alts...";
                        } else {
                            v1 = this.A;
lbl14:
                            // 2 sources

                            v2 = v1.a();
                        }
                        this.m.ax.b(v2, (float)dq.h / 2.0f, 29.0f, -1);
                        v3 = this.y.n().isEmpty();
                        if (var4_4 != 0) break block7;
                        if (!v3) break block8;
                        v3 = this.y.b();
                        if (var4_4 != 0) break block7;
                        if (!v3) {
                            this.a(this.m.a6, "Username / E-Mail", dq.h / 2 - 96, 66, -7829368);
                        }
                    }
                    v4 = this;
                    if (var4_4 != 0) break block9;
                    v3 = v4.z.a().isEmpty();
                }
                if (!v3) break block10;
                v4 = this;
                if (var4_4 != 0) break block9;
                if (!v4.z.c()) {
                    this.a(this.m.a6, "Password", dq.h / 2 - 96, 106, -7829368);
                }
            }
            v4 = this;
        }
        super.a(var1_1, var2_2, var3_3);
    }

    private static Throwable b(Throwable throwable) {
        return throwable;
    }

    @Override
    public void r() {
        int n2 = w / 4 + 24;
        this.t.add(new dX(0, h / 2 - 100, n2 + 72 + 12, "Login"));
        this.t.add(new dX(1, h / 2 - 100, n2 + 72 + 12 + 24, "Back"));
        this.t.add(new dX(2, h / 2 - 100, n2 + 72 + 12 - 24, "Import user:pass"));
        this.y = new aq(n2, this.m.a6, h / 2 - 100, 60, 200, 20);
        this.z = new db(this.m.a6, h / 2 - 100, 100, 200, 20);
        this.y.c(true);
        Keyboard.enableRepeatEvents((boolean)true);
    }
}

