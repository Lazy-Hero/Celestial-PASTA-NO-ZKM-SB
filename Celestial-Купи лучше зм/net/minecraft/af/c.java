/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.Futures
 *  com.mojang.authlib.GameProfileRepository
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.af;

import com.google.common.util.concurrent.Futures;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.io.File;
import java.io.IOException;
import net.minecraft.E.az;
import net.minecraft.a.o;
import net.minecraft.af.a;
import net.minecraft.af.b;
import net.minecraft.af.d;
import net.minecraft.af.e;
import net.minecraft.af.f;
import net.minecraft.ah.A;
import net.minecraft.ah.B;
import net.minecraft.ah.C;
import net.minecraft.ah.K;
import net.minecraft.ah.L;
import net.minecraft.ah.j;
import net.minecraft.ah.s;
import net.minecraft.ar.O;
import net.minecraft.aw.w;
import net.minecraft.client.E.k;
import net.minecraft.client.E.l;
import net.minecraft.client.Q;
import net.minecraft.k.m;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class c
extends net.minecraft.R.b {
    private /* synthetic */ boolean ag;
    private static /* synthetic */ int ak;
    private final /* synthetic */ Q ah;
    private /* synthetic */ boolean ae;
    private static final /* synthetic */ Logger ai;
    private final /* synthetic */ K aj;
    private /* synthetic */ k af;

    static Q a(c c10) {
        return c10.ah;
    }

    @Override
    public boolean c() {
        return Q.P().c();
    }

    @Override
    public int r() {
        return 4;
    }

    public static int a() {
        int n2 = c.c();
        if (n2 == 0) {
            return 16;
        }
        return 0;
    }

    @Override
    public boolean y() {
        return false;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void ap() {
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

    @Override
    public boolean P() {
        return true;
    }

    static {
        ai = LogManager.getLogger();
        c.c(117);
    }

    @Override
    public s X() {
        return this.aj.d();
    }

    @Override
    public boolean as() {
        return this.aj.a();
    }

    @Override
    public File Y() {
        return this.ah.aJ;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public String a(s s2, boolean bl2) {
        int n2 = c.c();
        try {
            int n3;
            block11: {
                int n4;
                block10: {
                    n3 = -1;
                    try {
                        n3 = O.b();
                    }
                    catch (IOException iOException) {
                        // empty catch block
                    }
                    n4 = n3;
                    if (n2 == 0) break block10;
                    if (n4 > 0) break block11;
                    n4 = 25564;
                }
                n3 = n4;
            }
            this.l().a(null, n3);
            ai.info("Started on {}", (Object)n3);
            this.ae = true;
            this.af = new k(this.aj(), n3 + "");
            this.af.start();
            this.O().a(s2);
            this.O().d(bl2);
            int n5 = bl2;
            if (n2 != 0) {
                n5 = n5 != 0 ? 4 : 0;
            }
            this.ah.s.l(n5);
            return n3 + "";
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public boolean h() {
        return true;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public net.minecraft.ah.e G() {
        net.minecraft.ah.e e10;
        int n2 = c.a();
        l l2 = this.ah.e;
        if (n2 == 0) {
            if (l2 == null) {
                e10 = this.ah.ac.bH;
                return e10;
            }
            l2 = this.ah.e;
        }
        e10 = l2.b().o();
        return e10;
    }

    @Override
    public void e(boolean bl2) {
        super.e(bl2);
    }

    @Override
    public void a(s s2) {
        super.a(s2);
        this.O().a(s2);
    }

    @Override
    public void aw() {
        block3: {
            k k2;
            block2: {
                int n2 = c.a();
                super.aw();
                int n3 = n2;
                k2 = this.af;
                if (n3 != 0) break block2;
                if (k2 == null) break block3;
                k2 = this.af;
            }
            k2.interrupt();
            this.af = null;
        }
    }

    public static void c(int n2) {
        ak = n2;
    }

    public static int c() {
        return ak;
    }

    @Override
    public void b(net.minecraft.c.f f10) {
        this.ah.b(f10);
    }

    @Override
    public void b(net.minecraft.aq.d d10) {
        super.b(d10);
        d10.b("snooper_partner", this.ah.h().g());
    }

    @Override
    public az aq() {
        return new f(this);
    }

    @Override
    public net.minecraft.c.f a(net.minecraft.c.f f10) {
        f10 = super.a(f10);
        f10.a().a("Type", new a(this));
        f10.a().a("Is Modded", new e(this));
        return f10;
    }

    public boolean g() {
        return this.ae;
    }

    public c(Q q2, String string, String string2, K k2, YggdrasilAuthenticationService yggdrasilAuthenticationService, MinecraftSessionService minecraftSessionService, GameProfileRepository gameProfileRepository, o o2) {
        block1: {
            int n2 = c.a();
            super(new File(q2.aJ, "saves"), q2.au(), q2.ai(), yggdrasilAuthenticationService, minecraftSessionService, gameProfileRepository, o2);
            int n3 = n2;
            this.g(q2.aR().b());
            this.h(string);
            this.d(string2);
            this.h(q2.q());
            c c10 = this;
            K k3 = k2;
            if (n3 == 0) {
                c10.c(k3.h());
                this.b(256);
                this.a(new b(this));
                this.ah = q2;
                c10 = this;
                k3 = c10.aj = this.n() ? net.minecraft.ah.B.ai : k2;
            }
            if (m.d()) break block1;
            c.c(++n3);
        }
    }

    @Override
    public void a(net.minecraft.ah.e e10) {
        block3: {
            l l2;
            block2: {
                int n2 = c.c();
                super.a(e10);
                int n3 = n2;
                l2 = this.ah.e;
                if (n3 == 0) break block2;
                if (l2 == null) break block3;
                l2 = this.ah.e;
            }
            l2.b().a(e10);
        }
    }

    @Override
    public void a(String string, String string2, long l2, L l3, String string3) {
        c c10;
        block50: {
            block38: {
                int n2;
                block33: {
                    w w2;
                    net.minecraft.aw.b b10;
                    block41: {
                        w w3;
                        block39: {
                            block40: {
                                block34: {
                                    block35: {
                                        block37: {
                                            c c11;
                                            block36: {
                                                A a10;
                                                block32: {
                                                    Integer[] arrinteger;
                                                    int n3 = c.a();
                                                    this.e(string);
                                                    n2 = n3;
                                                    b10 = this.A().a(string, true);
                                                    this.a(this.Z(), b10);
                                                    w2 = b10.c();
                                                    if (n2 != 0) break block34;
                                                    if (!cq.b.c()) break block35;
                                                    a10 = this.n() ? (A)new B(this, b10, w2, 0, this.J).x() : (A)new fg(this, b10, w2, 0, this.J).x();
                                                    a10.a(this.aj);
                                                    Integer[] arrinteger2 = arrinteger = (Integer[])cq.d(cq.a6, new Object[0]);
                                                    int n4 = arrinteger.length;
                                                    for (int i2 = 0; i2 < n4; ++i2) {
                                                        int n5 = arrinteger2[i2];
                                                        if (n2 == 0) {
                                                            A a11 = n5 == 0 ? a10 : (A)new C((net.minecraft.R.b)this, b10, n5, a10, this.J).x();
                                                            a11.a(new j(this, a11));
                                                            boolean bl2 = this.av();
                                                            if (n2 == 0) {
                                                                if (!bl2) {
                                                                    a11.b().a(this.X());
                                                                }
                                                                bl2 = cq.dA.c();
                                                            }
                                                            if (n2 != 0 || !bl2) continue;
                                                            bl2 = cq.b(cq.bv, a11);
                                                            if (n2 == 0) continue;
                                                            m.b(!m.d());
                                                            break;
                                                        }
                                                        break block32;
                                                    }
                                                    c11 = this;
                                                    if (n2 != 0) break block36;
                                                    c11.O().a(new A[]{a10});
                                                }
                                                if (a10.b().o() != null) break block37;
                                                c11 = this;
                                            }
                                            c11.a(this.ah.ac.bH);
                                        }
                                        if (n2 == 0) break block38;
                                    }
                                    this.S = new A[3];
                                    this.Z = new long[this.S.length][100];
                                    this.a(this.Z(), b10);
                                }
                                w3 = w2;
                                if (n2 != 0) break block39;
                                if (w3 != null) break block40;
                                w2 = new w(this.aj, string2);
                                if (n2 == 0) break block41;
                            }
                            w3 = w2;
                        }
                        w3.a(string2);
                    }
                    for (int i3 = 0; i3 < this.S.length; ++i3) {
                        block49: {
                            int n6;
                            block45: {
                                block48: {
                                    block46: {
                                        c c12;
                                        block47: {
                                            int n7;
                                            block44: {
                                                block43: {
                                                    int n8;
                                                    block42: {
                                                        n6 = 0;
                                                        if (n2 != 0) break block33;
                                                        n7 = i3;
                                                        n8 = 1;
                                                        if (n2 != 0) break block42;
                                                        if (n7 == n8) {
                                                            n6 = -1;
                                                        }
                                                        n7 = i3;
                                                        if (n2 != 0) break block43;
                                                        n8 = 2;
                                                    }
                                                    if (n7 == n8) {
                                                        n6 = 1;
                                                    }
                                                    n7 = i3;
                                                }
                                                if (n2 != 0) break block44;
                                                if (n7 != 0) break block45;
                                                c12 = this;
                                                if (n2 != 0) break block46;
                                                n7 = c12.n() ? 1 : 0;
                                            }
                                            if (n7 == 0) break block47;
                                            this.S[i3] = (A)new B(this, b10, w2, n6, this.J).x();
                                            if (n2 == 0) break block48;
                                        }
                                        c12 = this;
                                    }
                                    c12.S[i3] = (A)new fg(this, b10, w2, n6, this.J).x();
                                }
                                this.S[i3].a(this.aj);
                                if (n2 == 0) break block49;
                            }
                            this.S[i3] = (A)new C((net.minecraft.R.b)this, b10, n6, this.S[0], this.J).x();
                        }
                        this.S[i3].a(new j(this, this.S[i3]));
                        if (n2 == 0) continue;
                    }
                    this.O().a(this.S);
                }
                c10 = this;
                if (n2 != 0) break block50;
                if (c10.S[0].b().o() == null) {
                    this.a(this.ah.ac.bH);
                }
            }
            c10 = this;
        }
        c10.ab();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean f() throws IOException {
        c.ai.info("Starting integrated minecraft server version 1.12.2");
        v0 = c.c();
        this.g(true);
        this.d(true);
        this.b(true);
        this.a(true);
        this.f(true);
        c.ai.info("Generating keypair");
        this.a(net.minecraft.ar.B.a());
        var1_1 = v0;
        v1 = cq.cV.b();
        if (var1_1 != 0) {
            if (v1) {
                var2_2 = cq.d(cq.a2, new Object[0]);
                v1 = cq.g(var2_2, cq.cV, new Object[]{this});
                if (var1_1 != 0) {
                    if (!v1) {
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                this.a(this.Z(), this.I(), this.aj.e(), this.aj.i(), this.aj.c());
                this.b(this.aa() + " - " + this.S[0].b().p());
                v1 = cq.dw.b();
            }
        }
        if (var1_1 == 0) return v1;
        if (v1 == false) return true;
        var2_2 = cq.d(cq.a2, new Object[0]);
        v2 = cq.dw.a();
        if (var1_1 != 0) {
            if (v2 == Boolean.TYPE) {
                return cq.g(var2_2, cq.dw, new Object[]{this});
            }
            v2 = var2_2;
        }
        cq.b(v2, cq.dw, new Object[]{this});
        return true;
    }

    @Override
    public void B() {
        block8: {
            k k2;
            block7: {
                c c10;
                int n2;
                block6: {
                    block4: {
                        Object object;
                        block5: {
                            n2 = c.c();
                            object = cq.bX;
                            if (n2 == 0) break block4;
                            if (!((aI)object).c()) break block5;
                            c10 = this;
                            if (n2 == 0) break block6;
                            if (!c10.K()) break block4;
                        }
                        object = Futures.getUnchecked(this.a(new d(this)));
                    }
                    super.B();
                    c10 = this;
                }
                k2 = c10.af;
                if (n2 == 0) break block7;
                if (k2 == null) break block8;
                k2 = this.af;
            }
            k2.interrupt();
            this.af = null;
        }
    }

    @Override
    public boolean J() {
        return false;
    }

    @Override
    public boolean j() {
        return false;
    }

    @Override
    public boolean M() {
        return true;
    }
}

