/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.W.D;
import net.minecraft.W.E;
import net.minecraft.W.G;
import net.minecraft.W.K;
import net.minecraft.W.bF;
import net.minecraft.W.cL;
import net.minecraft.W.dR;
import net.minecraft.Z.i;
import net.minecraft.ac.a;
import net.minecraft.ac.b;
import net.minecraft.ae.c;
import net.minecraft.ae.d;
import net.minecraft.ae.e;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.ar.ae;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.u.h;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aB
extends K {
    public static final /* synthetic */ c E;
    public static final /* synthetic */ e z;
    protected static final /* synthetic */ k G;
    public static final /* synthetic */ c B;
    protected static final /* synthetic */ k F;
    public static final /* synthetic */ d<E> C;
    public static final /* synthetic */ d<G> D;
    protected static final /* synthetic */ k A;
    protected static final /* synthetic */ k H;

    @Override
    public b m(i i2) {
        return net.minecraft.ac.b.DESTROY;
    }

    private int a() {
        return this.y == net.minecraft.ac.c.D ? 1011 : 1012;
    }

    public void a(z z2, n n2, boolean n3) {
        block5: {
            n n4;
            boolean bl2;
            block7: {
                i i2;
                i i3;
                block6: {
                    i i4;
                    i i5;
                    block4: {
                        i5 = z2.d(n2);
                        bl2 = cL.b();
                        i4 = i5;
                        if (bl2) break block4;
                        if (i4.b() != this) break block5;
                        i4 = i5;
                    }
                    n4 = i4.b(D) == net.minecraft.W.G.LOWER ? n2 : n2.k();
                    i2 = i3 = n2 == n4 ? i5 : z2.d(n4);
                    if (bl2) break block6;
                    if (i2.b() != this) break block5;
                    i2 = i3;
                }
                boolean bl3 = i2.b(E);
                if (bl2) break block7;
                if (bl3 == n3) break block5;
                bl3 = z2.a(n4, i3.a(E, n3 != 0), 10);
            }
            z2.b(n4, n2);
            int n5 = n3;
            if (!bl2) {
                n5 = n5 != 0 ? this.b() : this.a();
            }
            z2.a(null, n5, n2, 0);
        }
    }

    @Override
    public String n() {
        return net.minecraft.ab.a.a((this.k() + ".name").replaceAll("tile", "item"));
    }

    /*
     * Exception decompiling
     */
    @Override
    public void a(i var1_1, z var2_2, n var3_3, K var4_4, n var5_5) {
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

    protected static boolean b(int n2) {
        boolean bl2 = cL.e();
        boolean bl3 = n2 & 4;
        if (bl2) {
            bl3 = bl3;
        }
        return bl3;
    }

    @Override
    public i a(i i2, net.minecraft.ar.h h2) {
        return h2 == net.minecraft.ar.h.NONE ? i2 : i2.a(h2.b(i2.b(z))).a(C);
    }

    private net.minecraft.w.k c() {
        boolean bl2 = cL.e();
        aB aB2 = this;
        aB aB3 = g.bL;
        if (bl2) {
            if (aB2 == aB3) {
                return net.minecraft.u.h.cA;
            }
            aB2 = this;
            aB3 = g.bT;
        }
        if (bl2) {
            if (aB2 == aB3) {
                return net.minecraft.u.h.bd;
            }
            aB2 = this;
            aB3 = g.cV;
        }
        if (bl2) {
            if (aB2 == aB3) {
                return net.minecraft.u.h.ao;
            }
            aB2 = this;
            aB3 = g.c;
        }
        if (bl2) {
            if (aB2 == aB3) {
                return net.minecraft.u.h.cD;
            }
            aB2 = this;
            aB3 = g.cl;
        }
        if (bl2) {
            if (aB2 == aB3) {
                return net.minecraft.u.h.ax;
            }
            aB2 = this;
            aB3 = g.p;
        }
        return aB2 == aB3 ? net.minecraft.u.h.cb : net.minecraft.u.h.Q;
    }

    @Override
    public net.minecraft.w.d c(z z2, n n2, i i2) {
        return new net.minecraft.w.d(this.c());
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private int b() {
        return this.y == net.minecraft.ac.c.D ? 1005 : 1006;
    }

    @Override
    public aC p() {
        return aC.CUTOUT;
    }

    @Override
    public boolean a(t t2, n n2) {
        return aB.b(aB.d(t2, n2));
    }

    protected static int a(int n2) {
        return n2 & 7;
    }

    @Override
    public i c(int n2) {
        i i2;
        boolean bl2 = cL.e();
        if ((n2 & 8) > 0) {
            i i3 = this.d().a(D, net.minecraft.W.G.UPPER).a(C, (n2 & 1) > 0 ? net.minecraft.W.E.RIGHT : net.minecraft.W.E.LEFT);
            boolean bl3 = n2 & 2;
            if (bl2) {
                bl3 = bl3 > false;
            }
            i2 = i3.a(B, bl3);
        } else {
            i i4 = this.d().a(D, net.minecraft.W.G.LOWER).a(z, aA.b(n2 & 3).d());
            boolean bl4 = n2 & 4;
            if (bl2) {
                bl4 = bl4 > false;
            }
            i2 = i4.a(E, bl4);
        }
        return i2;
    }

    public static boolean c(t t2, n n2) {
        return aB.b(aB.d(t2, n2));
    }

    @Override
    public void a(z z2, n n2, i i2, j j2) {
        block14: {
            i i3;
            boolean bl2;
            n n3;
            block13: {
                G g10;
                G g11;
                block11: {
                    block12: {
                        block10: {
                            n n4 = n2.k();
                            n3 = n2.a();
                            bl2 = cL.b();
                            if (!j2.cw.g) break block10;
                            g11 = i2.b(D);
                            g10 = net.minecraft.W.G.UPPER;
                            if (bl2) break block11;
                            if (g11 != g10) break block10;
                            i3 = z2.d(n4);
                            if (bl2) break block12;
                            if (i3.b() == this) {
                                z2.v(n4);
                            }
                        }
                        i3 = i2;
                    }
                    if (bl2) break block13;
                    g11 = i3.b(D);
                    g10 = net.minecraft.W.G.LOWER;
                }
                if (g11 != g10) break block14;
                i3 = z2.d(n3);
            }
            if (i3.b() == this) {
                boolean bl3 = j2.cw.g;
                if (!bl2) {
                    if (bl3) {
                        z2.v(n2);
                    }
                    bl3 = z2.v(n3);
                }
            }
        }
    }

    protected aB(net.minecraft.ac.c c10) {
        super(c10);
        this.h(this.e.a().a(z, aA.NORTH).a(E, false).a(C, net.minecraft.W.E.LEFT).a(B, false).a(D, net.minecraft.W.G.LOWER));
    }

    public static int d(t t2, n n2) {
        i i2 = t2.d(n2);
        int n3 = i2.b().d(i2);
        int n4 = aB.d(n3);
        boolean bl2 = cL.b();
        i i3 = t2.d(n2.k());
        int n5 = i3.b().d(i3);
        int n6 = n4;
        if (!bl2) {
            n6 = n6 != 0 ? n5 : n3;
        }
        int n7 = n6;
        i i4 = t2.d(n2.a());
        int n8 = i4.b().d(i4);
        int n9 = n4;
        if (!bl2) {
            n9 = n9 != 0 ? n3 : n8;
        }
        int n10 = n9;
        int n11 = n10 & 1;
        if (!bl2) {
            n11 = n11 != 0 ? 1 : 0;
        }
        int n12 = n11;
        int n13 = n10 & 2;
        if (!bl2) {
            n13 = n13 != 0 ? 1 : 0;
        }
        int n14 = n13;
        int n15 = aB.a(n7);
        int n16 = n4;
        if (!bl2) {
            n16 = n16 != 0 ? 8 : 0;
        }
        int n17 = n15 | n16;
        int n18 = n12;
        if (!bl2) {
            n18 = n18 != 0 ? 16 : 0;
        }
        int n19 = n17 | n18;
        int n20 = n14;
        if (!bl2) {
            n20 = n20 != 0 ? 32 : 0;
        }
        return n19 | n20;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public i a(i i2, ae ae2) {
        i i3;
        boolean bl2 = cL.b();
        i i4 = i2;
        if (!bl2) {
            if (i4.b(D) != net.minecraft.W.G.LOWER) {
                i3 = i2;
                return i3;
            }
            i4 = i2;
        }
        i3 = i4.a(z, ae2.a(i2.b(z)));
        return i3;
    }

    @Override
    public a f(i i2, t t2, n n2) {
        boolean bl2 = cL.e();
        K k2 = i2.b();
        aB aB2 = g.bL;
        if (bl2) {
            if (k2 == aB2) {
                return net.minecraft.ac.a.D;
            }
            k2 = i2.b();
            aB2 = g.aJ;
        }
        if (bl2) {
            if (k2 == aB2) {
                return net.minecraft.W.D.OAK.a();
            }
            k2 = i2.b();
            aB2 = g.bT;
        }
        if (bl2) {
            if (k2 == aB2) {
                return net.minecraft.W.D.SPRUCE.a();
            }
            k2 = i2.b();
            aB2 = g.cV;
        }
        if (bl2) {
            if (k2 == aB2) {
                return net.minecraft.W.D.BIRCH.a();
            }
            k2 = i2.b();
            aB2 = g.c;
        }
        if (bl2) {
            if (k2 == aB2) {
                return net.minecraft.W.D.JUNGLE.a();
            }
            k2 = i2.b();
            aB2 = g.cl;
        }
        if (bl2) {
            if (k2 == aB2) {
                return net.minecraft.W.D.ACACIA.a();
            }
            k2 = i2.b();
            aB2 = g.p;
        }
        return k2 == aB2 ? net.minecraft.W.D.DARK_OAK.a() : super.f(i2, t2, n2);
    }

    @Override
    public int d(i i2) {
        int n2;
        block8: {
            int n3;
            block9: {
                Object object;
                boolean bl2;
                block6: {
                    block7: {
                        n3 = 0;
                        bl2 = cL.e();
                        object = i2.b(D);
                        if (!bl2) break block6;
                        if (object != net.minecraft.W.G.UPPER) break block7;
                        n3 |= 8;
                        Object object2 = i2.b(C);
                        if (bl2) {
                            if (object2 == net.minecraft.W.E.RIGHT) {
                                n3 |= 1;
                            }
                            object2 = i2.b(B);
                        }
                        n2 = ((Boolean)object2).booleanValue() ? 1 : 0;
                        if (!bl2) break block8;
                        if (n2 == 0) break block9;
                        n3 |= 2;
                        if (bl2) break block9;
                    }
                    n3 |= i2.b(z).l().k();
                    object = i2.b(E);
                }
                n2 = ((Boolean)object).booleanValue();
                if (!bl2) break block8;
                if (n2 != 0) {
                    n3 |= 4;
                }
            }
            n2 = n3;
        }
        return n2;
    }

    static {
        z = bF.z;
        E = net.minecraft.ae.c.a("open");
        C = d.a("hinge", E.class);
        B = net.minecraft.ae.c.a("powered");
        D = d.a("half", G.class);
        G = new k(0.0, 0.0, 0.0, 1.0, 1.0, 0.1875);
        F = new k(0.0, 0.0, 0.8125, 1.0, 1.0, 1.0);
        A = new k(0.8125, 0.0, 0.0, 1.0, 1.0, 1.0);
        H = new k(0.0, 0.0, 0.0, 0.1875, 1.0, 1.0);
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, D, z, E, C, B);
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    public static aA c(int n2) {
        return aA.b(n2 & 3).d();
    }

    @Override
    public net.minecraft.w.k a(i i2, Random random, int n2) {
        return i2.b(D) == net.minecraft.W.G.UPPER ? net.minecraft.u.h.v : this.c();
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, n n2) {
        boolean bl2 = cL.e();
        boolean bl3 = n2.b();
        if (bl2) {
            if (bl3 >= BADBOOL 255) {
                return false;
            }
            bl3 = z2.d(n2.k()).d();
        }
        if (bl2) {
            if (!bl3) return false;
            bl3 = super.a(z2, n2);
        }
        if (bl2) {
            if (!bl3) return false;
            bl3 = super.a(z2, n2.a());
        }
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public k a(i i2, t t2, n n2) {
        k k2;
        i2 = i2.c(t2, n2);
        boolean bl2 = cL.b();
        aA aA2 = i2.b(z);
        int n3 = i2.b(E).booleanValue();
        if (!bl2) {
            n3 = n3 == 0 ? 1 : 0;
        }
        int n4 = n3;
        int n5 = i2.b(C) == net.minecraft.W.E.RIGHT ? 1 : 0;
        int n6 = dR.a[aA2.ordinal()];
        if (!bl2) {
            switch (n6) {
                default: {
                    k k3;
                    int n7 = n4;
                    if (!bl2) {
                        if (n7 != 0) {
                            k3 = H;
                            return k3;
                        }
                        n7 = n5;
                    }
                    if (n7 != 0) {
                        k3 = F;
                        return k3;
                    }
                    k3 = G;
                    return k3;
                }
                case 2: {
                    k k4;
                    int n8 = n4;
                    if (!bl2) {
                        if (n8 != 0) {
                            k4 = G;
                            return k4;
                        }
                        n8 = n5;
                    }
                    if (n8 != 0) {
                        k4 = H;
                        return k4;
                    }
                    k4 = A;
                    return k4;
                }
                case 3: {
                    k k5;
                    int n9 = n4;
                    if (!bl2) {
                        if (n9 != 0) {
                            k5 = A;
                            return k5;
                        }
                        n9 = n5;
                    }
                    if (n9 != 0) {
                        k5 = G;
                        return k5;
                    }
                    k5 = F;
                    return k5;
                }
                case 4: 
            }
            n6 = n4;
        }
        if (!bl2) {
            if (n6 != 0) {
                k2 = F;
                return k2;
            }
            n6 = n5;
        }
        if (n6 != 0) {
            k2 = A;
            return k2;
        }
        k2 = H;
        return k2;
    }

    @Override
    public i e(i i2, t t2, n n2) {
        i i3;
        block8: {
            block7: {
                i i4;
                i i5;
                boolean bl2;
                block5: {
                    block6: {
                        bl2 = cL.e();
                        i5 = i2;
                        if (!bl2) break block5;
                        if (i5.b(D) != net.minecraft.W.G.LOWER) break block6;
                        i i6 = i4 = t2.d(n2.a());
                        if (bl2 && i6.b() == this) {
                            i6 = i2 = i2.a(C, i4.b(C)).a(B, i4.b(B));
                        }
                        if (bl2) break block7;
                    }
                    i5 = t2.d(n2.k());
                }
                i3 = i4 = i5;
                if (!bl2) break block8;
                if (i3.b() == this) {
                    i2 = i2.a(z, i4.b(z)).a(E, i4.b(E));
                }
            }
            i3 = i2;
        }
        return i3;
    }

    @Override
    public net.minecraft.Z.d a(t t2, i i2, n n2, aA aA2) {
        return net.minecraft.Z.d.UNDEFINED;
    }

    @Override
    public boolean a(z z2, n n2, i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        i i3;
        boolean bl2 = cL.e();
        if (this.y == net.minecraft.ac.c.D) {
            return false;
        }
        n n3 = i2.b(D) == net.minecraft.W.G.LOWER ? n2 : n2.k();
        i i4 = i3 = n2.equals(n3) ? i2 : z2.d(n3);
        if (bl2) {
            if (i4.b() != this) {
                return false;
            }
            i4 = i3.a(E);
        }
        i2 = i4;
        z2.a(n3, i2, 10);
        z2.b(n3, n2);
        int n4 = i2.b(E).booleanValue();
        if (bl2) {
            n4 = n4 != 0 ? this.b() : this.a();
        }
        z2.a(j2, n4, n2, 0);
        return true;
    }

    public static aA a(t t2, n n2) {
        return aB.c(aB.d(t2, n2));
    }

    protected static boolean d(int n2) {
        boolean bl2 = cL.b();
        boolean bl3 = n2 & 8;
        if (!bl2) {
            bl3 = bl3;
        }
        return bl3;
    }
}

