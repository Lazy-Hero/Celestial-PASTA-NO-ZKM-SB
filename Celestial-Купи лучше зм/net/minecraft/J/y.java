/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.J;

import java.util.List;
import net.minecraft.B.u;
import net.minecraft.J.j;
import net.minecraft.J.t;
import net.minecraft.J.w;
import net.minecraft.N.R;
import net.minecraft.N.s;
import net.minecraft.P.r;
import net.minecraft.U.x;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.a3;
import net.minecraft.ar.e;
import net.minecraft.av.b;
import net.minecraft.i.h;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.k;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class y
extends w
implements s {
    private /* synthetic */ int a7;
    private final /* synthetic */ n a6;
    private /* synthetic */ boolean a5;

    public static void b(b b10) {
        net.minecraft.J.w.b(b10, y.class);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public void l(boolean bl2) {
        this.a5 = bl2;
    }

    public y(z z2, double d10, double d11, double d12) {
        super(z2, d10, d11, d12);
        this.a5 = true;
        this.a7 = -1;
        this.a6 = net.minecraft.k.n.o;
    }

    @Override
    public net.minecraft.B.n a(h h2, net.minecraft.i.j j2) {
        return new u(h2, this, j2);
    }

    @Override
    public int e() {
        return 5;
    }

    public void f(int n2) {
        this.a7 = n2;
    }

    public boolean m() {
        int n2 = net.minecraft.J.j.c();
        boolean bl2 = this.a7;
        if (n2 == 0) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    @Override
    public j o() {
        return net.minecraft.J.j.HOPPER;
    }

    @Override
    protected void f(r r2) {
        super.f(r2);
        r2.b("TransferCooldown", this.a7);
        r2.a("Enabled", this.a5);
    }

    @Override
    public void a(G g10) {
        block3: {
            y y2;
            block2: {
                int n2 = net.minecraft.J.j.c();
                super.a(g10);
                int n3 = n2;
                y2 = this;
                if (n3 != 0) break block2;
                if (!y2.aG.M().c("doEntityDrops")) break block3;
                y2 = this;
            }
            y2.a(net.minecraft.w.k.b(net.minecraft.u.g.ac), 1, 0.0f);
        }
    }

    @Override
    public int g() {
        return 1;
    }

    @Override
    public boolean a(net.minecraft.i.j j2, a3 a32) {
        int n2 = net.minecraft.J.j.d();
        boolean bl2 = this.aG.C;
        if (n2 != 0) {
            if (!bl2) {
                j2.a(this);
            }
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public String a() {
        return "minecraft:hopper";
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void a(r var1_1) {
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

    public boolean k() {
        int n2 = net.minecraft.J.j.c();
        y y2 = this;
        if (n2 == 0) {
            if (R.a(y2)) {
                return true;
            }
            y2 = this;
        }
        List<x> list = y2.aG.a(t.class, this.m().a(0.25, 0.0, 0.25), net.minecraft.ar.e.b);
        boolean bl2 = list.isEmpty();
        if (n2 == 0) {
            if (!bl2) {
                R.a(null, this, (t)list.get(0));
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public void ae() {
        block5: {
            y y2;
            block11: {
                boolean bl2;
                block10: {
                    int n2;
                    block9: {
                        block8: {
                            block7: {
                                boolean bl3;
                                block6: {
                                    block4: {
                                        int n3 = net.minecraft.J.j.c();
                                        super.ae();
                                        n2 = n3;
                                        bl3 = this.aG.C;
                                        if (n2 != 0) break block4;
                                        if (bl3) break block5;
                                        bl3 = this.aL();
                                    }
                                    if (n2 != 0) break block6;
                                    if (!bl3) break block5;
                                    bl3 = this.l();
                                }
                                if (!bl3) break block5;
                                n n4 = new n(this);
                                if (n2 != 0) break block7;
                                if (!n4.equals(this.a6)) break block8;
                                --this.a7;
                            }
                            if (n2 == 0) break block9;
                        }
                        this.f(0);
                    }
                    bl2 = this.m();
                    if (n2 != 0) break block10;
                    if (bl2) break block5;
                    this.f(0);
                    y2 = this;
                    if (n2 != 0) break block11;
                    bl2 = y2.k();
                }
                if (!bl2) break block5;
                this.f(4);
                y2 = this;
            }
            y2.b();
        }
    }

    @Override
    public i n() {
        return net.minecraft.u.g.ac.d();
    }

    @Override
    public double a() {
        return this.ax;
    }

    @Override
    public double e() {
        return this.a;
    }

    public y(z z2) {
        super(z2);
        this.a5 = true;
        this.a7 = -1;
        this.a6 = net.minecraft.k.n.o;
    }

    public boolean l() {
        return this.a5;
    }

    @Override
    public void a(int n2, int n3, int n4, boolean bl2) {
        block1: {
            boolean bl3;
            int n5 = net.minecraft.J.j.d();
            boolean bl4 = bl2;
            if (n5 != 0) {
                bl4 = bl3 = !bl4;
            }
            if (bl3 == this.l()) break block1;
            this.l(bl3);
        }
    }

    @Override
    public z d() {
        return this.aG;
    }

    @Override
    public double b() {
        return this.aF + 0.5;
    }
}

