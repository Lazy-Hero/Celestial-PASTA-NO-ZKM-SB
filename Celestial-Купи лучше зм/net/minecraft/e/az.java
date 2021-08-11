/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.E;

import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.L;
import net.minecraft.E.M;
import net.minecraft.E.N;
import net.minecraft.E.O;
import net.minecraft.E.P;
import net.minecraft.E.Q;
import net.minecraft.E.R;
import net.minecraft.E.S;
import net.minecraft.E.T;
import net.minecraft.E.U;
import net.minecraft.E.V;
import net.minecraft.E.W;
import net.minecraft.E.X;
import net.minecraft.E.Y;
import net.minecraft.E.Z;
import net.minecraft.E.a1;
import net.minecraft.E.a6;
import net.minecraft.E.a7;
import net.minecraft.E.a9;
import net.minecraft.E.aA;
import net.minecraft.E.aC;
import net.minecraft.E.aD;
import net.minecraft.E.aE;
import net.minecraft.E.aF;
import net.minecraft.E.aG;
import net.minecraft.E.aH;
import net.minecraft.E.aT;
import net.minecraft.E.aV;
import net.minecraft.E.aX;
import net.minecraft.E.aa;
import net.minecraft.E.ae;
import net.minecraft.E.ak;
import net.minecraft.E.al;
import net.minecraft.E.an;
import net.minecraft.E.ao;
import net.minecraft.E.aq;
import net.minecraft.E.at;
import net.minecraft.E.au;
import net.minecraft.E.av;
import net.minecraft.E.aw;
import net.minecraft.E.ay;
import net.minecraft.E.o;
import net.minecraft.E.s;
import net.minecraft.R.b;
import net.minecraft.k.m;
import net.minecraft.s.a;
import net.minecraft.s.c;
import net.minecraft.s.d;
import net.minecraft.s.e;
import net.minecraft.s.f;
import net.minecraft.s.g;
import net.minecraft.s.h;
import net.minecraft.s.i;
import net.minecraft.s.j;
import net.minecraft.s.k;
import net.minecraft.s.l;
import net.minecraft.s.n;
import net.minecraft.s.p;
import net.minecraft.s.q;
import net.minecraft.s.r;
import net.minecraft.s.t;
import net.minecraft.s.u;
import net.minecraft.s.v;
import net.minecraft.s.w;
import net.minecraft.s.x;
import net.minecraft.s.y;

public class az
extends aq
implements o {
    private final /* synthetic */ b d;

    @Override
    protected b a() {
        return this.d;
    }

    public az(b b10) {
        block2: {
            F f10;
            block3: {
                this.d = b10;
                this.a(new aG());
                this.a(new Y());
                this.a(new R());
                this.a(new Z());
                this.a(new av());
                this.a(new ao());
                this.a(new aT());
                this.a(new ay());
                this.a(new ae());
                this.a(new v());
                this.a(new a1());
                this.a(new aA());
                this.a(new aF());
                this.a(new S());
                this.a(new T());
                this.a(new aE());
                this.a(new e());
                this.a(new a7());
                this.a(new aw());
                this.a(new Q());
                this.a(new h());
                this.a(new c());
                this.a(new aH());
                this.a(new net.minecraft.s.s());
                m[] arrm = s.b();
                this.a(new au());
                m[] arrm2 = arrm;
                this.a(new N());
                this.a(new w());
                this.a(new aX());
                this.a(new a6());
                this.a(new q());
                this.a(new V());
                this.a(new aD());
                this.a(new L());
                this.a(new ak());
                this.a(new u());
                this.a(new r());
                this.a(new W());
                this.a(new O());
                this.a(new P());
                this.a(new M());
                this.a(new x());
                this.a(new i());
                this.a(new aV());
                this.a(new at());
                this.a(new U());
                this.a(new an());
                this.a(new al());
                this.a(new a9());
                f10 = this.a(new X());
                if (arrm2 == null) break block2;
                if (!b10.J()) break block3;
                this.a(new j());
                this.a(new d());
                this.a(new t());
                this.a(new n());
                this.a(new net.minecraft.s.o());
                this.a(new p());
                this.a(new a());
                this.a(new k());
                this.a(new net.minecraft.s.b());
                this.a(new f());
                this.a(new l());
                this.a(new aC());
                this.a(new g());
                this.a(new y());
                this.a(new aa());
                if (arrm2 != null) break block2;
                m.b(!m.d());
            }
            f10 = this.a(new net.minecraft.s.m());
        }
        K.a(this);
    }

    /*
     * Exception decompiling
     */
    @Override
    public void a(J var1_1, F var2_2, int var3_3, String var4_4, Object ... var5_5) {
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

    private static gP a(gP gP2) {
        return gP2;
    }
}

