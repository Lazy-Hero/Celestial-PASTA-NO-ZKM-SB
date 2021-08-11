/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.N;

import javax.annotation.Nullable;
import net.minecraft.E.aS;
import net.minecraft.N.g;
import net.minecraft.N.j;
import net.minecraft.N.k;
import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.Q.ag;
import net.minecraft.W.K;
import net.minecraft.W.a0;
import net.minecraft.Z.i;
import net.minecraft.k.m;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class B
extends y {
    private /* synthetic */ boolean i;
    private /* synthetic */ boolean j;
    private /* synthetic */ boolean k;
    private final /* synthetic */ j m;
    private /* synthetic */ boolean l;

    public boolean c() {
        return this.i;
    }

    @Override
    @Nullable
    public ag k() {
        block3: {
            B b10;
            block2: {
                m[] arrm = net.minecraft.N.j.f();
                b10 = this;
                if (arrm != null) break block2;
                if (!b10.j()) break block3;
                this.b(false);
                b10 = this;
            }
            r r2 = b10.a(new r());
            return new ag(this.d, 2, r2);
        }
        return null;
    }

    public aS f() {
        return this.m.b();
    }

    public void b(boolean bl2) {
        this.l = bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean b() {
        return this.j;
    }

    public g e() {
        K k2 = this.l();
        m[] arrm = net.minecraft.N.j.f();
        K k3 = k2;
        K k4 = net.minecraft.u.g.de;
        if (arrm == null) {
            if (k3 == k4) {
                return g.REDSTONE;
            }
            k3 = k2;
            k4 = net.minecraft.u.g.aS;
        }
        if (arrm == null) {
            if (k3 == k4) {
                return g.AUTO;
            }
            k3 = k2;
            k4 = net.minecraft.u.g.bZ;
        }
        return k3 == k4 ? g.SEQUENCE : g.REDSTONE;
    }

    @Override
    public r a(r r2) {
        super.a(r2);
        this.m.b(r2);
        r2.a("powered", this.i());
        r2.a("conditionMet", this.c());
        r2.a("auto", this.b());
        return r2;
    }

    public boolean j() {
        return this.l;
    }

    /*
     * Exception decompiling
     */
    public boolean g() {
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

    public void c(boolean bl2) {
        this.k = bl2;
    }

    @Override
    public void o() {
        this.c = null;
        super.o();
    }

    public j k() {
        return this.m;
    }

    public void a(boolean bl2) {
        block3: {
            K k2;
            block8: {
                B b10;
                m[] arrm;
                block7: {
                    block6: {
                        block5: {
                            boolean bl3;
                            block4: {
                                block2: {
                                    boolean bl4 = this.j;
                                    arrm = net.minecraft.N.j.f();
                                    this.j = bl2;
                                    bl3 = bl4;
                                    if (arrm != null) break block2;
                                    if (bl3) break block3;
                                    bl3 = bl2;
                                }
                                if (arrm != null) break block4;
                                if (!bl3) break block3;
                                b10 = this;
                                if (arrm != null) break block5;
                                bl3 = b10.k;
                            }
                            if (bl3) break block3;
                            b10 = this;
                        }
                        if (arrm != null) break block6;
                        if (b10.a == null) break block3;
                        b10 = this;
                    }
                    if (arrm != null) break block7;
                    if (b10.e() == g.SEQUENCE) break block3;
                    b10 = this;
                }
                k2 = b10.l();
                boolean bl5 = k2 instanceof a0;
                if (arrm != null) break block8;
                if (!bl5) break block3;
                bl5 = this.g();
            }
            this.a.a(this.d, k2, k2.a(this.a));
        }
    }

    @Override
    public void c(r r2) {
        super.c(r2);
        this.m.a(r2);
        this.k = r2.f("powered");
        this.i = r2.f("conditionMet");
        this.a(r2.f("auto"));
    }

    public B() {
        this.m = new k(this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean d() {
        i i2 = this.a.d(this.j());
        m[] arrm = net.minecraft.N.j.f();
        boolean bl2 = i2.b() instanceof a0;
        if (arrm == null) {
            if (!bl2) return false;
            bl2 = i2.b(a0.z);
        }
        if (arrm != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public boolean n() {
        return true;
    }

    public boolean i() {
        return this.k;
    }
}

