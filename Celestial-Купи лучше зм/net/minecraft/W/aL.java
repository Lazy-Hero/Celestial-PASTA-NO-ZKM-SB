/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.aQ;
import net.minecraft.W.ac;
import net.minecraft.W.ap;
import net.minecraft.W.cL;
import net.minecraft.W.cU;
import net.minecraft.W.cp;
import net.minecraft.W.d_;
import net.minecraft.Z.i;
import net.minecraft.ad.a;
import net.minecraft.ae.c;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.ae;
import net.minecraft.ar.h;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.d;

public class aL
extends aQ {
    protected static final /* synthetic */ k G;
    public static final /* synthetic */ c A;
    protected static final /* synthetic */ k F;
    private final /* synthetic */ boolean H;
    protected static final /* synthetic */ k E;
    protected static final /* synthetic */ k C;
    protected static final /* synthetic */ k D;
    protected static final /* synthetic */ k B;

    @Override
    public i a(i i2, h h2) {
        return i2.a(h2.b(i2.b(z)));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public static aA a(int n2) {
        int n3 = n2 & 7;
        boolean bl2 = cL.b();
        int n4 = n3;
        if (!bl2) {
            if (n4 > 5) {
                return null;
            }
            n4 = n3;
        }
        aA aA2 = aA.a(n4);
        return aA2;
    }

    @Override
    public boolean n(i i2) {
        boolean bl2 = cL.b();
        boolean bl3 = i2.b(A);
        if (!bl2) {
            bl3 = !bl3;
        }
        return bl3;
    }

    private boolean a(z z2, n n2, aA aA2, boolean n3) {
        boolean bl2;
        block25: {
            block24: {
                boolean n4;
                n n5;
                i[] arri;
                int n6;
                List<n> list;
                boolean bl3;
                block23: {
                    n n7;
                    i i2;
                    Object object;
                    ArrayList arrayList;
                    block22: {
                        int n8;
                        aA aA3;
                        ArrayList arrayList2;
                        block21: {
                            ArrayList arrayList3;
                            block20: {
                                net.minecraft.Z.g g10;
                                bl3 = cL.b();
                                boolean bl4 = n3;
                                if (!bl3 && !bl4) {
                                    bl4 = z2.v(n2.a(aA2));
                                }
                                net.minecraft.Z.g g11 = g10 = new net.minecraft.Z.g(z2, n2, aA2, n3);
                                if (!bl3) {
                                    if (!g11.c()) {
                                        return false;
                                    }
                                    g11 = g10;
                                }
                                list = g11.b();
                                arrayList2 = Lists.newArrayList();
                                for (int i3 = 0; i3 < list.size(); ++i3) {
                                    n n10 = list.get(i3);
                                    arrayList3 = arrayList2;
                                    if (!bl3) {
                                        arrayList3.add(z2.d(n10).c((t)z2, n10));
                                        if (!bl3) continue;
                                    }
                                    break block20;
                                }
                                arrayList3 = g10.a();
                            }
                            arrayList = arrayList3;
                            n6 = list.size() + arrayList.size();
                            arri = new i[n6];
                            aA3 = n3 ? aA2 : aA2.h();
                            for (n8 = arrayList.size() - 1; n8 >= 0; --n8) {
                                object = (n)arrayList.get(n8);
                                i2 = z2.d((n)object);
                                i2.b().a(z2, (n)object, i2, 0);
                                z2.a((n)object, g.bf.d(), 4);
                                arri[--n6] = i2;
                                if (!bl3) {
                                    if (!bl3) continue;
                                }
                                break block21;
                            }
                            n8 = list.size() - 1;
                        }
                        while (n8 >= 0) {
                            object = list.get(n8);
                            i2 = z2.d((n)object);
                            z2.a((n)object, g.bf.d(), 2);
                            n7 = ((n)object).a(aA3);
                            if (!bl3) {
                                object = n7;
                                z2.a((n)object, g.cS.d().a(z, aA2), 4);
                                z2.b((n)object, ap.a((i)arrayList2.get(n8), aA2, n3, false));
                                arri[--n6] = i2;
                                --n8;
                                if (!bl3) continue;
                            }
                            break block22;
                        }
                        n7 = n2.a(aA2);
                    }
                    n5 = n7;
                    boolean bl5 = n3;
                    if (!bl3) {
                        if (bl5) {
                            object = this.H ? cU.STICKY : cU.DEFAULT;
                            i2 = g.bi.d().a(ac.z, aA2).a(ac.B, object);
                            i i4 = g.cS.d().a(ap.z, aA2).a(ap.A, this.H ? cU.STICKY : cU.DEFAULT);
                            z2.a(n5, i4, 4);
                            z2.b(n5, ap.a(i2, aA2, true, true));
                        }
                        bl5 = n4 = arrayList.size() - 1;
                    }
                    while (n4 >= false) {
                        z2.a((n)arrayList.get((int)n4), arri[n6++].b(), false);
                        n4 -= 1;
                        if (!bl3) {
                            if (!bl3) continue;
                        }
                        break block23;
                    }
                    n4 = list.size() - 1;
                }
                while (n4 >= false) {
                    z2.a(list.get((int)n4), arri[n6++].b(), false);
                    n4 -= 1;
                    if (!bl3) {
                        if (!bl3) continue;
                    }
                    break block24;
                }
                bl2 = n3;
                if (bl3) break block25;
                if (bl2) {
                    z2.a(n5, (K)g.bi, false);
                }
            }
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public boolean i(i i2) {
        boolean bl2 = cL.b();
        boolean bl3 = i2.b(A);
        if (!bl2) {
            bl3 = !bl3 || i2.b(z) == aA.DOWN;
        }
        return bl3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public i a(i i2, ae ae2) {
        return i2.a(z, ae2.a(i2.b(z)));
    }

    private void c(z z2, n n2, i i2) {
        block3: {
            boolean bl2;
            aA aA2;
            block4: {
                boolean bl3;
                block1: {
                    boolean bl4;
                    block2: {
                        aA2 = i2.b(z);
                        bl3 = cL.e();
                        bl2 = bl4 = this.b(z2, n2, aA2);
                        if (!bl3) break block1;
                        if (!bl2) break block2;
                        bl2 = i2.b(A);
                        if (!bl3) break block1;
                        if (bl2) break block2;
                        if (!new net.minecraft.Z.g(z2, n2, aA2, true).c()) break block3;
                        z2.a(n2, this, 0, aA2.f());
                        if (bl3) break block3;
                    }
                    bl2 = bl4;
                }
                if (!bl3) break block4;
                if (bl2) break block3;
                bl2 = i2.b(A);
            }
            if (bl2) {
                z2.a(n2, this, 1, aA2.f());
            }
        }
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        block0: {
            if (z2.C) break block0;
            this.c(z2, n2, i2);
        }
    }

    @Override
    public k a(i i2, t t2, n n2) {
        block10: {
            int n3;
            block9: {
                boolean bl2 = cL.e();
                n3 = i2.b(A).booleanValue();
                if (!bl2) break block9;
                if (n3 == 0) break block10;
                n3 = cp.b[i2.b(z).ordinal()];
            }
            switch (n3) {
                case 1: {
                    return G;
                }
                default: {
                    return F;
                }
                case 3: {
                    return D;
                }
                case 4: {
                    return B;
                }
                case 5: {
                    return C;
                }
                case 6: 
            }
            return E;
        }
        return k;
    }

    static {
        A = net.minecraft.ae.c.a("extended");
        E = new k(0.0, 0.0, 0.0, 0.75, 1.0, 1.0);
        C = new k(0.25, 0.0, 0.0, 1.0, 1.0, 1.0);
        B = new k(0.0, 0.0, 0.0, 1.0, 1.0, 0.75);
        D = new k(0.0, 0.0, 0.25, 1.0, 1.0, 1.0);
        F = new k(0.0, 0.0, 0.0, 1.0, 0.75, 1.0);
        G = new k(0.0, 0.25, 0.0, 1.0, 1.0, 1.0);
    }

    @Override
    public i c(int n2) {
        boolean bl2 = cL.b();
        i i2 = this.d().a(z, aL.a(n2));
        boolean bl3 = n2 & 8;
        if (!bl2) {
            bl3 = bl3 > false;
        }
        return i2.a(A, bl3);
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean a(i var1_1, z var2_2, n var3_3, int var4_4, int var5_5) {
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
    public void a(z z2, n n2, i i2, B b10, d d10) {
        block0: {
            z2.a(n2, i2.a(z, aA.a(n2, b10)), 2);
            if (z2.C) break block0;
            this.c(z2, n2, i2);
        }
    }

    @Override
    public i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        return this.d().a(z, aA.a(n2, b10)).a(A, false);
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    private boolean b(z z2, n n2, aA aA2) {
        int n3;
        boolean bl2;
        Object object;
        block8: {
            boolean bl3;
            block12: {
                object = aA.values();
                bl2 = cL.e();
                int n4 = ((aA[])object).length;
                n3 = 0;
                while (n3 < n4) {
                    block9: {
                        block10: {
                            boolean bl4;
                            block11: {
                                aA aA3 = object[n3];
                                if (!bl2) break block8;
                                if (!bl2) break block9;
                                if (aA3 == aA2) break block10;
                                bl4 = z2.c(n2.a(aA3), aA3);
                                if (!bl2) break block11;
                                if (!bl4) break block10;
                                bl4 = true;
                            }
                            return bl4;
                        }
                        ++n3;
                    }
                    if (bl2) continue;
                }
                bl3 = z2.c(n2, aA.DOWN);
                if (!bl2) break block12;
                if (!bl3) break block8;
                bl3 = true;
            }
            return bl3;
        }
        object = n2.a();
        aA[] arraA = aA.values();
        n3 = arraA.length;
        int n5 = 0;
        while (n5 < n3) {
            block13: {
                block14: {
                    boolean bl5;
                    block15: {
                        aA aA4 = arraA[n5];
                        if (!bl2) break block13;
                        if (aA4 == aA.DOWN) break block14;
                        bl5 = z2.c(((n)object).a(aA4), aA4);
                        if (!bl2) break block15;
                        if (!bl5) break block14;
                        bl5 = true;
                    }
                    return bl5;
                }
                ++n5;
            }
            if (bl2) continue;
        }
        return false;
    }

    public aL(boolean bl2) {
        super(net.minecraft.ac.c.y);
        this.h(this.e.a().a(z, aA.NORTH).a(A, false));
        this.H = bl2;
        this.a(d_.i);
        this.c(0.5f);
        this.a(net.minecraft.ad.a.p);
    }

    @Override
    public void b(z z2, n n2, i i2) {
        block2: {
            z z3;
            block1: {
                boolean bl2 = cL.b();
                z3 = z2;
                if (bl2) break block1;
                if (z3.C) break block2;
                z3 = z2;
            }
            if (z3.b(n2) == null) {
                this.c(z2, n2, i2);
            }
        }
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z, A);
    }

    @Override
    public void a(i i2, z z2, n n2, k k2, List<k> list, @Nullable x x2, boolean bl2) {
        aL.a(n2, k2, list, i2.f(z2, n2));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public net.minecraft.Z.d a(t t2, i i2, n n2, aA aA2) {
        net.minecraft.Z.d d10;
        block5: {
            Object object;
            block4: {
                i2 = this.e(i2, t2, n2);
                boolean bl2 = cL.e();
                object = i2.b(z);
                if (!bl2) break block4;
                if (object == aA2.h()) break block5;
                object = i2.b(A);
            }
            if (((Boolean)object).booleanValue()) {
                d10 = net.minecraft.Z.d.UNDEFINED;
                return d10;
            }
        }
        d10 = net.minecraft.Z.d.SOLID;
        return d10;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static boolean a(i var0, z var1_1, n var2_2, aA var3_3, boolean var4_4, aA var5_5) {
        block16: {
            var7_6 = var0.b();
            var6_7 = cL.e();
            if (var7_6 == g.bP) {
                return false;
            }
            v0 = var1_1.O().a(var2_2);
            if (var6_7) {
                if (v0 == 0) {
                    return false;
                }
                v0 = var2_2.b();
            }
            if (var6_7 == false) return (boolean)v0;
            if (v0 < 0) return (boolean)0;
            if (var3_3 == aA.DOWN) {
                v0 = var2_2.b();
                if (var6_7 == false) return (boolean)v0;
                if (v0 == 0) return (boolean)0;
            }
            v1 = var2_2.b();
            if (var6_7 == false) return (boolean)v1;
            if (v1 > var1_1.i() - 1) return (boolean)0;
            if (var3_3 == aA.UP) {
                v1 = var2_2.b();
                if (var6_7 == false) return (boolean)v1;
                if (v1 == var1_1.i() - 1) return (boolean)0;
            }
            v2 = var7_6;
            v3 = g.cr;
            if (!var6_7) break block16;
            if (v2 == v3) ** GOTO lbl-1000
            v2 = var7_6;
            v3 = g.M;
        }
        if (v2 == v3) ** GOTO lbl-1000
        cfr_temp_0 = var0.b(var1_1, var2_2) - -1.0f;
        v4 = cfr_temp_0 == 0.0f ? false : (cfr_temp_0 > 0.0f ? true : BADBOOL -1);
        if (var6_7) {
            if (v4 == false) {
                return false;
            }
            v4 = cp.a[var0.q().ordinal()];
        }
        if (var6_7 == false) return (boolean)v4;
        switch (v4) {
            case 1: {
                v4 = (float)false;
                return (boolean)v4;
            }
            case 2: {
                return var4_4;
            }
            case 3: {
                if (var3_3 != var5_5) return false;
                return true;
            }
        }
        if (!var6_7) lbl-1000:
        // 3 sources

        {
            v5 = var0.b(aL.A);
            if (var6_7) {
                if (v5) {
                    return false;
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v5 = var7_6.e();
        }
        if (var6_7 == false) return v5;
        if (v5 != false) return false;
        return true;
    }

    @Override
    public int d(i i2) {
        int n2 = 0;
        boolean bl2 = cL.b();
        n2 |= i2.b(z).f();
        int n3 = i2.b(A).booleanValue();
        if (!bl2) {
            if (n3 != 0) {
                n2 |= 8;
            }
            n3 = n2;
        }
        return n3;
    }
}

