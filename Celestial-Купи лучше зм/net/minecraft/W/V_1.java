/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.LoadingCache
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import com.google.common.cache.LoadingCache;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.T.aN;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.R;
import net.minecraft.W.c4;
import net.minecraft.W.cL;
import net.minecraft.W.m;
import net.minecraft.Z.f;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ae.d;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.Q;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.ar.aH;
import net.minecraft.ar.ae;
import net.minecraft.ar.ay;
import net.minecraft.au.h;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.E;
import net.minecraft.u.g;
import net.minecraft.w.aG;

public class V
extends R {
    public static final /* synthetic */ d<Q> C;
    protected static final /* synthetic */ k A;
    protected static final /* synthetic */ k D;
    protected static final /* synthetic */ k B;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public i a(i var1_1, ae var2_2) {
        var3_3 = cL.b();
        v0 = net.minecraft.W.m.b[var2_2.ordinal()];
        if (var3_3) ** GOTO lbl7
        switch (v0) {
            case 1: 
            case 2: {
                v0 = net.minecraft.W.m.a[var1_1.b(V.C).ordinal()];
lbl7:
                // 2 sources

                switch (v0) {
                    case 1: {
                        return var1_1.a(V.C, Q.Z);
                    }
                    case 3: {
                        return var1_1.a(V.C, Q.X);
                    }
                }
                return var1_1;
            }
        }
        return var1_1;
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        block8: {
            int n4;
            block9: {
                c4 c42;
                Q q2;
                Q q3;
                boolean bl2;
                block4: {
                    Q q4;
                    block5: {
                        block6: {
                            int n5;
                            block7: {
                                q4 = i2.b(C);
                                bl2 = cL.e();
                                q3 = q4;
                                q2 = Q.X;
                                if (!bl2) break block4;
                                if (q3 != q2) break block5;
                                c42 = new c4(z2, n2, Q.X);
                                n5 = c42.b();
                                if (!bl2) break block6;
                                if (n5 == 0) break block7;
                                n5 = c4.a(c42);
                                if (!bl2 || n5 >= c4.c(c42) * c4.b(c42)) break block6;
                            }
                            n5 = z2.a(n2, g.bf.d()) ? 1 : 0;
                        }
                        if (bl2) break block8;
                    }
                    q3 = q4;
                    q2 = Q.Z;
                }
                if (q3 != q2) break block8;
                c42 = new c4(z2, n2, Q.Z);
                n4 = c42.b();
                if (!bl2) break block8;
                if (n4 == 0) break block9;
                n4 = c4.a(c42);
                if (!bl2 || n4 >= c4.c(c42) * c4.b(c42)) break block8;
            }
            n4 = z2.a(n2, g.bf.d()) ? 1 : 0;
        }
    }

    public V() {
        super(net.minecraft.ac.c.Q, false);
        this.h(this.e.a().a(C, Q.X));
        this.a(true);
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        block8: {
            x x2;
            block13: {
                z z3;
                n n3;
                boolean bl2;
                block12: {
                    int n4;
                    block11: {
                        block6: {
                            int n5;
                            block10: {
                                block9: {
                                    block7: {
                                        boolean bl3 = cL.e();
                                        super.a(z2, n2, i2, random);
                                        bl2 = bl3;
                                        n5 = z2.D.s();
                                        if (!bl2) break block7;
                                        if (n5 == 0) break block8;
                                        n5 = z2.M().c("doMobSpawning");
                                    }
                                    if (!bl2) break block9;
                                    if (n5 == 0) break block8;
                                    n5 = random.nextInt(2000);
                                }
                                if (!bl2) break block10;
                                if (n5 >= z2.g().a()) break block8;
                                n5 = n2.b();
                            }
                            int n6 = n5;
                            n3 = n2;
                            while (!z2.d(n3).d()) {
                                n4 = n3.b();
                                if (bl2 && bl2) {
                                    if (n4 <= 0) break;
                                    n3 = n3.k();
                                    if (bl2) continue;
                                }
                                break block6;
                            }
                            n4 = n6;
                        }
                        if (!bl2) break block11;
                        if (n4 <= 0) break block8;
                        z3 = z2;
                        if (!bl2) break block12;
                        n4 = z3.d(n3.a()).r() ? 1 : 0;
                    }
                    if (n4 != 0) break block8;
                    z3 = z2;
                }
                x x3 = x2 = aG.a(z3, net.minecraft.U.h.a(aN.class), (double)n3.e() + 0.5, (double)n3.b() + 1.1, (double)n3.a() + 0.5);
                if (!bl2) break block13;
                if (x3 == null) break block8;
                x3 = x2;
            }
            x3.aw = x2.F();
        }
    }

    @Override
    public k a(i i2, t t2, n n2) {
        switch (i2.b(C)) {
            case X: {
                return B;
            }
            default: {
                return D;
            }
            case Z: 
        }
        return A;
    }

    @Override
    public void a(i i2, z z2, n n2, Random random) {
        int n3;
        boolean bl2 = cL.e();
        int n4 = random.nextInt(100);
        if (bl2) {
            if (n4 == 0) {
                z2.a((double)n2.e() + 0.5, (double)n2.b() + 0.5, (double)n2.a() + 0.5, E.f6, ay.BLOCKS, 0.5f, random.nextFloat() * 0.4f + 0.8f, false);
            }
            n4 = n3 = 0;
        }
        while (n3 < 4) {
            double d10;
            double d11;
            double d12;
            double d13;
            double d14;
            double d15;
            block8: {
                int n5;
                block6: {
                    block7: {
                        d15 = (float)n2.e() + random.nextFloat();
                        d14 = (float)n2.b() + random.nextFloat();
                        d13 = (float)n2.a() + random.nextFloat();
                        d12 = ((double)random.nextFloat() - 0.5) * 0.5;
                        d11 = ((double)random.nextFloat() - 0.5) * 0.5;
                        d10 = ((double)random.nextFloat() - 0.5) * 0.5;
                        n5 = random.nextInt(2) * 2 - 1;
                        if (!bl2) break block6;
                        if (z2.d(n2.b()).b() == this || z2.d(n2.m()).b() == this) break block7;
                        d15 = (double)n2.e() + 0.5 + 0.25 * (double)n5;
                        d12 = random.nextFloat() * 2.0f * (float)n5;
                        if (bl2) break block8;
                    }
                    d13 = (double)n2.a() + 0.5 + 0.25 * (double)n5;
                }
                d10 = random.nextFloat() * 2.0f * (float)n5;
            }
            z2.a(aH.PORTAL, d15, d14, d13, d12, d11, d10, new int[0]);
            ++n3;
            if (bl2) continue;
        }
    }

    @Override
    public net.minecraft.w.d c(z z2, n n2, i i2) {
        return net.minecraft.w.d.m;
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, C);
    }

    static {
        C = d.a((String)"axis", Q.class, (Enum[])new Q[]{Q.X, Q.Z});
        B = new k(0.0, 0.0, 0.375, 1.0, 1.0, 0.625);
        A = new k(0.375, 0.0, 0.0, 0.625, 1.0, 1.0);
        D = new k(0.375, 0.0, 0.375, 0.625, 1.0, 0.625);
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean b(i var1_1, t var2_2, n var3_3, aA var4_4) {
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
    @Nullable
    public k c(i i2, t t2, n n2) {
        return a;
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public i c(int n2) {
        return this.d().a(C, (n2 & 3) == 2 ? Q.Z : Q.X);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(z z2, n n2, i i2, x x2) {
        block3: {
            x x3;
            block5: {
                boolean bl2;
                block4: {
                    boolean bl3;
                    block2: {
                        bl3 = cL.e();
                        bl2 = x2.N();
                        if (!bl3) break block2;
                        if (bl2) break block3;
                        bl2 = x2.aU();
                    }
                    if (!bl3) break block4;
                    if (bl2) break block3;
                    x3 = x2;
                    if (!bl3) break block5;
                    bl2 = x3.A();
                }
                if (!bl2) break block3;
                x3 = x2;
            }
            x3.a(n2);
        }
    }

    @Override
    public int d(i i2) {
        return V.a(i2.b(C));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean b(z var1_1, n var2_2) {
        var4_3 = new c4(var1_1, var2_2, Q.X);
        var3_4 = cL.e();
        v0 = var4_3;
        if (var3_4) {
            if (v0.b()) {
                v0 = var4_3;
                if (var3_4) {
                    if (c4.a(v0) == 0) {
                        var4_3.c();
                        return true;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = new c4(var1_1, var2_2, Q.Z);
            }
        }
        var5_5 = v0;
        v1 = var5_5.b();
        if (var3_4 == false) return (boolean)v1;
        if (v1 == 0) return (boolean)0;
        v1 = c4.a(var5_5);
        if (var3_4 == false) return (boolean)v1;
        if (v1 != 0) return (boolean)0;
        var5_5.c();
        return true;
    }

    @Override
    public net.minecraft.Z.d a(t t2, i i2, n n2, aA aA2) {
        return net.minecraft.Z.d.UNDEFINED;
    }

    public static int a(Q q2) {
        boolean bl2 = cL.b();
        Q q3 = q2;
        Q q4 = Q.X;
        if (!bl2) {
            if (q3 == q4) {
                return 1;
            }
            q3 = q2;
            q4 = Q.Z;
        }
        return q3 == q4 ? 2 : 0;
    }

    @Override
    public aC p() {
        return aC.TRANSLUCENT;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    public h a(z z2, n n2) {
        Object object;
        net.minecraft.ar.R r2;
        int n3;
        Object object2;
        n n4;
        aA aA2;
        int[] arrn;
        LoadingCache<n, f> loadingCache;
        c4 c42;
        boolean bl2;
        Q q2;
        block14: {
            q2 = Q.Z;
            bl2 = cL.b();
            c42 = new c4(z2, n2, Q.X);
            loadingCache = net.minecraft.au.d.a(z2, true);
            int n5 = c42.b();
            if (!bl2) {
                if (n5 == 0) {
                    q2 = Q.X;
                    c42 = new c4(z2, n2, Q.Z);
                }
                n5 = c42.b();
            }
            if (!bl2) {
                if (n5 == 0) {
                    return new h(n2, aA.NORTH, aA.UP, loadingCache, 1, 1, 1);
                }
                n5 = net.minecraft.ar.R.values().length;
            }
            arrn = new int[n5];
            aA2 = c4.d(c42).d();
            n4 = c4.e(c42).c(c42.a() - 1);
            object2 = net.minecraft.ar.R.values();
            int n6 = ((net.minecraft.ar.R[])object2).length;
            n3 = 0;
            block0: while (true) {
                int n7 = n3;
                block1: while (n7 < n6) {
                    r2 = object2[n3];
                    if (bl2) break block14;
                    net.minecraft.ar.R r3 = r2;
                    object = new h(aA2.o() == r3 ? n4 : n4.a(c4.d(c42), c42.e() - 1), aA.a(r3, q2), aA.UP, loadingCache, c42.e(), c42.a(), 1);
                    int n8 = 0;
                    while (n8 < c42.e()) {
                        block15: {
                            n7 = 0;
                            if (bl2) continue block1;
                            int n9 = n7;
                            while (n9 < c42.a()) {
                                f f10 = ((h)object).a(n8, n9, 1);
                                if (!bl2) {
                                    if (!bl2) {
                                        if (f10.b() != null && f10.b().o() != net.minecraft.ac.c.A) {
                                            int n10 = r3.ordinal();
                                            arrn[n10] = arrn[n10] + 1;
                                        }
                                        ++n9;
                                    }
                                    if (!bl2) continue;
                                }
                                break block15;
                            }
                            ++n8;
                        }
                        if (!bl2) continue;
                    }
                    ++n3;
                    if (!bl2) continue block0;
                }
                break;
            }
            r2 = net.minecraft.ar.R.POSITIVE;
        }
        object2 = r2;
        net.minecraft.ar.R[] arrr = net.minecraft.ar.R.values();
        n3 = arrr.length;
        int n11 = 0;
        while (n11 < n3) {
            object = arrr[n11];
            if (!bl2) {
                if (arrn[((Enum)object).ordinal()] < arrn[object2.ordinal()]) {
                    object2 = object;
                }
                ++n11;
            }
            if (!bl2) continue;
        }
        return new h(aA2.o() == object2 ? n4 : n4.a(c4.d(c42), c42.e() - 1), aA.a((net.minecraft.ar.R)((Object)object2), q2), aA.UP, loadingCache, c42.e(), c42.a(), 1);
    }
}

