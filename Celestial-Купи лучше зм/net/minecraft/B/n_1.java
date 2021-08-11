/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 */
package net.minecraft.B;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.B.D;
import net.minecraft.B.a;
import net.minecraft.B.h;
import net.minecraft.B.j;
import net.minecraft.B.l;
import net.minecraft.B.m;
import net.minecraft.N.y;
import net.minecraft.Q.aZ;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.az.t;
import net.minecraft.i.k;
import net.minecraft.w.d;

public abstract class n {
    private final /* synthetic */ Set<net.minecraft.i.j> i;
    private /* synthetic */ int h;
    public /* synthetic */ int b;
    private static /* synthetic */ int g;
    private final /* synthetic */ Set<D> j;
    private /* synthetic */ int e;
    protected /* synthetic */ List<j> d;
    public /* synthetic */ List<D> f;
    private /* synthetic */ short a;
    public /* synthetic */ a2<d> c;

    @Nullable
    public D a(a a10, int n2) {
        int n3 = 0;
        int n4 = n.c();
        while (n3 < this.f.size()) {
            D d10 = this.f.get(n3);
            if (n4 == 0) {
                if (d10.a(a10, n2)) {
                    return d10;
                }
                ++n3;
            }
            if (n4 == 0) continue;
        }
        return null;
    }

    protected void a(z z2, net.minecraft.i.j j2, m m2, l l2) {
        block2: {
            k k2;
            d d10;
            block8: {
                k k3;
                block3: {
                    block4: {
                        net.minecraft.az.k k4;
                        block5: {
                            net.minecraft.az.k k5;
                            block6: {
                                boolean bl2;
                                block7: {
                                    int n2 = n.b();
                                    if (z2.C) break block2;
                                    k3 = (k)j2;
                                    d10 = net.minecraft.w.d.m;
                                    k5 = t.a(m2, z2);
                                    if (n2 == 0) break block3;
                                    if (k5 == null) break block4;
                                    k4 = k5;
                                    if (n2 == 0) break block5;
                                    if (k4.b()) break block6;
                                    bl2 = z2.M().c("doLimitedCrafting");
                                    if (n2 == 0) break block7;
                                    if (!bl2) break block6;
                                    k2 = k3;
                                    if (n2 == 0) break block8;
                                    bl2 = k2.G().f(k5);
                                }
                                if (!bl2) break block4;
                            }
                            l2.a(k5);
                            k4 = k5;
                        }
                        d10 = k4.a(m2);
                    }
                    l2.a(0, d10);
                }
                k2 = k3;
            }
            k2.cD.a(new aZ(this.b, 0, d10));
        }
    }

    public static int d(int n2) {
        return n2 >> 2 & 3;
    }

    public void b(j j2) {
        int n2 = n.c();
        boolean bl2 = this.d.contains(j2);
        if (n2 == 0) {
            if (bl2) {
                throw new IllegalArgumentException("Listener already listening");
            }
            bl2 = this.d.add(j2);
        }
        j2.a(this, this.e());
        this.a();
    }

    public static int a(@Nullable y y2) {
        int n2 = n.b();
        int n3 = y2 instanceof a;
        if (n2 != 0) {
            n3 = n3 != 0 ? n.b((a)((Object)y2)) : 0;
        }
        return n3;
    }

    public void a(int n2, d d10) {
        this.a(n2).a(d10);
    }

    public static int b(int n2, int n3) {
        return n2 & 3 | (n3 & 3) << 2;
    }

    public void a(int n2, int n3) {
    }

    public n() {
        this.c = a2.a();
        this.f = Lists.newArrayList();
        this.h = -1;
        this.j = Sets.newHashSet();
        this.d = Lists.newArrayList();
        this.i = Sets.newHashSet();
    }

    public static int c() {
        int n2 = n.b();
        if (n2 == 0) {
            return 50;
        }
        return 0;
    }

    public void a(a a10) {
        this.a();
    }

    public a2<d> e() {
        a2<d> a22;
        block2: {
            a2<d> a23 = a2.a();
            int n2 = n.c();
            for (int i2 = 0; i2 < this.f.size(); ++i2) {
                a22 = a23;
                if (n2 == 0) {
                    a22.add(this.f.get(i2).d());
                    if (n2 == 0) continue;
                }
                break block2;
            }
            a22 = a23;
        }
        return a22;
    }

    /*
     * Enabled aggressive block sorting
     */
    public d b(net.minecraft.i.j j2, int n2) {
        d d10;
        D d11 = this.f.get(n2);
        int n3 = n.c();
        D d12 = d11;
        if (n3 == 0) {
            if (d12 == null) {
                d10 = net.minecraft.w.d.m;
                return d10;
            }
            d12 = d11;
        }
        d10 = d12.d();
        return d10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a() {
        var2_1 = 0;
        var1_2 = n.b();
        block0: do {
            block4: {
                if (var2_1 >= this.f.size()) return;
                var3_3 = this.f.get(var2_1).d();
                var4_4 = this.c.get(var2_1);
                if (var1_2 == 0) continue;
                if (net.minecraft.w.d.a(var4_4, var3_3)) break block4;
                v0 = var3_3;
                if (var1_2 == 0) ** GOTO lbl15
                if (v0.G()) {
                    v1 = net.minecraft.w.d.m;
                } else {
                    v0 = var3_3;
lbl15:
                    // 2 sources

                    v1 = v0.C();
                }
                var4_4 = v1;
                this.c.set(var2_1, var4_4);
                for (var5_5 = 0; var5_5 < this.d.size(); ++var5_5) {
                    this.d.get(var5_5).a(this, var2_1, var4_4);
                    if (var1_2 == 0) continue block0;
                    if (var1_2 != 0) continue;
                }
            }
            ++var2_1;
        } while (var1_2 != 0);
    }

    public static int b() {
        return g;
    }

    public boolean b(D d10) {
        return true;
    }

    protected D a(D d10) {
        d10.d = this.f.size();
        this.f.add(d10);
        this.c.add(net.minecraft.w.d.m);
        return d10;
    }

    public static void b(int n2) {
        g = n2;
    }

    public void a(j j2) {
        this.d.remove(j2);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public void a(net.minecraft.i.j j2, boolean bl2) {
        block2: {
            boolean bl3;
            block3: {
                int n2 = n.b();
                bl3 = bl2;
                if (n2 == 0) break block2;
                if (!bl3) break block3;
                this.i.remove(j2);
                if (n2 != 0) break block2;
            }
            bl3 = this.i.add(j2);
        }
    }

    protected void a(net.minecraft.i.j j2, z z2, a a10) {
        block7: {
            int n2;
            int n3;
            block10: {
                int n4;
                block11: {
                    block8: {
                        int n5;
                        block9: {
                            n3 = n.b();
                            n5 = j2.aL();
                            if (n3 == 0) break block8;
                            if (n5 == 0) break block9;
                            n4 = j2 instanceof k;
                            if (n3 == 0) break block10;
                            if (n4 == 0) break block11;
                            n4 = ((k)j2).d() ? 1 : 0;
                            if (n3 == 0) break block10;
                            if (n4 == 0) break block11;
                        }
                        n5 = n2 = 0;
                    }
                    while (n2 < a10.e()) {
                        j2.a(a10.b(n2), false);
                        ++n2;
                        if (n3 != 0) {
                            if (n3 != 0) continue;
                        }
                        break block7;
                    }
                    if (n3 != 0) break block7;
                }
                n4 = n2 = 0;
            }
            while (n2 < a10.e()) {
                j2.cB.a(z2, a10.b(n2));
                ++n2;
                if (n3 != 0) continue;
            }
        }
    }

    /*
     * Exception decompiling
     */
    public static boolean a(@Nullable D var0, d var1_1, boolean var2_2) {
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

    public short a(net.minecraft.i.h h2) {
        this.a = (short)(this.a + 1);
        return this.a;
    }

    public boolean a(d d10, D d11) {
        return true;
    }

    public void b(net.minecraft.i.j j2) {
        block3: {
            net.minecraft.i.h h2;
            block2: {
                net.minecraft.i.h h3 = j2.cB;
                int n2 = n.c();
                h2 = h3;
                if (n2 != 0) break block2;
                if (h2.h().G()) break block3;
                j2.a(h3.h(), false);
                h2 = h3;
            }
            h2.e(net.minecraft.w.d.m);
        }
    }

    static {
        if (n.b() == 0) {
            n.b(105);
        }
    }

    public static void a(Set<D> set, int n2, d d10, int n3) {
        int n4 = n.c();
        if (n4 == 0) {
            switch (n2) {
                case 0: {
                    d10.c(net.minecraft.k.h.d((float)d10.t() / (float)set.size()));
                    if (n4 == 0) break;
                }
                case 1: {
                    d10.c(1);
                    if (n4 == 0) break;
                }
                case 2: {
                    d10.c(d10.w().a());
                    break;
                }
            }
            d10.g(n3);
        }
    }

    public boolean a(net.minecraft.i.j j2, int n2) {
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public d a(int var1_1, int var2_2, h var3_3, net.minecraft.i.j var4_4) {
        block70: {
            block171: {
                block174: {
                    block173: {
                        block172: {
                            block164: {
                                block165: {
                                    block168: {
                                        block170: {
                                            block169: {
                                                block167: {
                                                    block166: {
                                                        block157: {
                                                            block158: {
                                                                block162: {
                                                                    block163: {
                                                                        block161: {
                                                                            block160: {
                                                                                block159: {
                                                                                    block138: {
                                                                                        block139: {
                                                                                            block143: {
                                                                                                block155: {
                                                                                                    block156: {
                                                                                                        block154: {
                                                                                                            block153: {
                                                                                                                block147: {
                                                                                                                    block148: {
                                                                                                                        block152: {
                                                                                                                            block150: {
                                                                                                                                block151: {
                                                                                                                                    block149: {
                                                                                                                                        block144: {
                                                                                                                                            block145: {
                                                                                                                                                block146: {
                                                                                                                                                    block141: {
                                                                                                                                                        block142: {
                                                                                                                                                            block140: {
                                                                                                                                                                block105: {
                                                                                                                                                                    block106: {
                                                                                                                                                                        block114: {
                                                                                                                                                                            block119: {
                                                                                                                                                                                block118: {
                                                                                                                                                                                    block137: {
                                                                                                                                                                                        block136: {
                                                                                                                                                                                            block135: {
                                                                                                                                                                                                block133: {
                                                                                                                                                                                                    block134: {
                                                                                                                                                                                                        block132: {
                                                                                                                                                                                                            block131: {
                                                                                                                                                                                                                block124: {
                                                                                                                                                                                                                    block127: {
                                                                                                                                                                                                                        block128: {
                                                                                                                                                                                                                            block125: {
                                                                                                                                                                                                                                block126: {
                                                                                                                                                                                                                                    block130: {
                                                                                                                                                                                                                                        block129: {
                                                                                                                                                                                                                                            block120: {
                                                                                                                                                                                                                                                block121: {
                                                                                                                                                                                                                                                    block122: {
                                                                                                                                                                                                                                                        block123: {
                                                                                                                                                                                                                                                            block115: {
                                                                                                                                                                                                                                                                block116: {
                                                                                                                                                                                                                                                                    block117: {
                                                                                                                                                                                                                                                                        block113: {
                                                                                                                                                                                                                                                                            block112: {
                                                                                                                                                                                                                                                                                block111: {
                                                                                                                                                                                                                                                                                    block110: {
                                                                                                                                                                                                                                                                                        block109: {
                                                                                                                                                                                                                                                                                            block107: {
                                                                                                                                                                                                                                                                                                block108: {
                                                                                                                                                                                                                                                                                                    block104: {
                                                                                                                                                                                                                                                                                                        block103: {
                                                                                                                                                                                                                                                                                                            block102: {
                                                                                                                                                                                                                                                                                                                block101: {
                                                                                                                                                                                                                                                                                                                    block71: {
                                                                                                                                                                                                                                                                                                                        block76: {
                                                                                                                                                                                                                                                                                                                            block91: {
                                                                                                                                                                                                                                                                                                                                block92: {
                                                                                                                                                                                                                                                                                                                                    block93: {
                                                                                                                                                                                                                                                                                                                                        block94: {
                                                                                                                                                                                                                                                                                                                                            block69: {
                                                                                                                                                                                                                                                                                                                                                block83: {
                                                                                                                                                                                                                                                                                                                                                    block84: {
                                                                                                                                                                                                                                                                                                                                                        block86: {
                                                                                                                                                                                                                                                                                                                                                            block89: {
                                                                                                                                                                                                                                                                                                                                                                block90: {
                                                                                                                                                                                                                                                                                                                                                                    block88: {
                                                                                                                                                                                                                                                                                                                                                                        block87: {
                                                                                                                                                                                                                                                                                                                                                                            block85: {
                                                                                                                                                                                                                                                                                                                                                                                block79: {
                                                                                                                                                                                                                                                                                                                                                                                    block80: {
                                                                                                                                                                                                                                                                                                                                                                                        block81: {
                                                                                                                                                                                                                                                                                                                                                                                            block82: {
                                                                                                                                                                                                                                                                                                                                                                                                block77: {
                                                                                                                                                                                                                                                                                                                                                                                                    block78: {
                                                                                                                                                                                                                                                                                                                                                                                                        block74: {
                                                                                                                                                                                                                                                                                                                                                                                                            block75: {
                                                                                                                                                                                                                                                                                                                                                                                                                block72: {
                                                                                                                                                                                                                                                                                                                                                                                                                    block73: {
                                                                                                                                                                                                                                                                                                                                                                                                                        var6_5 = net.minecraft.w.d.m;
                                                                                                                                                                                                                                                                                                                                                                                                                        var5_6 = n.c();
                                                                                                                                                                                                                                                                                                                                                                                                                        var7_7 = var4_4.cB;
                                                                                                                                                                                                                                                                                                                                                                                                                        if (var3_3 != net.minecraft.B.h.QUICK_CRAFT) break block71;
                                                                                                                                                                                                                                                                                                                                                                                                                        var8_8 = this.e;
                                                                                                                                                                                                                                                                                                                                                                                                                        this.e = n.c(var2_2);
                                                                                                                                                                                                                                                                                                                                                                                                                        v0 = var8_8;
                                                                                                                                                                                                                                                                                                                                                                                                                        v1 = 1;
                                                                                                                                                                                                                                                                                                                                                                                                                        if (var5_6 != 0) break block72;
                                                                                                                                                                                                                                                                                                                                                                                                                        if (v0 != v1) break block73;
                                                                                                                                                                                                                                                                                                                                                                                                                        v0 = this.e;
                                                                                                                                                                                                                                                                                                                                                                                                                        if (var5_6 != 0) break block74;
                                                                                                                                                                                                                                                                                                                                                                                                                        if (v0 == 2) break block75;
                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                    v0 = var8_8;
                                                                                                                                                                                                                                                                                                                                                                                                                    if (var5_6 != 0) break block74;
                                                                                                                                                                                                                                                                                                                                                                                                                    v1 = this.e;
                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                if (v0 == v1) break block75;
                                                                                                                                                                                                                                                                                                                                                                                                                this.d();
                                                                                                                                                                                                                                                                                                                                                                                                                if (var5_6 == 0) break block76;
                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                            v0 = var7_7.h().G() ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                        if (var5_6 != 0) break block77;
                                                                                                                                                                                                                                                                                                                                                                                                        if (v0 == 0) break block78;
                                                                                                                                                                                                                                                                                                                                                                                                        this.d();
                                                                                                                                                                                                                                                                                                                                                                                                        if (var5_6 == 0) break block76;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    v0 = this.e;
                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                if (var5_6 != 0) break block79;
                                                                                                                                                                                                                                                                                                                                                                                                if (v0 != 0) break block80;
                                                                                                                                                                                                                                                                                                                                                                                                this.h = n.d(var2_2);
                                                                                                                                                                                                                                                                                                                                                                                                v2 = this;
                                                                                                                                                                                                                                                                                                                                                                                                if (var5_6 != 0) break block81;
                                                                                                                                                                                                                                                                                                                                                                                                if (!n.a(v2.h, var4_4)) break block82;
                                                                                                                                                                                                                                                                                                                                                                                                this.e = 1;
                                                                                                                                                                                                                                                                                                                                                                                                this.j.clear();
                                                                                                                                                                                                                                                                                                                                                                                                if (var5_6 == 0) break block76;
                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                            v2 = this;
                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                        v2.d();
                                                                                                                                                                                                                                                                                                                                                                                        if (var5_6 == 0) break block76;
                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                    v0 = this.e;
                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                v3 = 1;
                                                                                                                                                                                                                                                                                                                                                                                if (var5_6 != 0) break block83;
                                                                                                                                                                                                                                                                                                                                                                                if (v0 != v3) break block84;
                                                                                                                                                                                                                                                                                                                                                                                var9_15 = this.f.get(var1_1);
                                                                                                                                                                                                                                                                                                                                                                                var10_16 = var7_7.h();
                                                                                                                                                                                                                                                                                                                                                                                v4 = var9_15;
                                                                                                                                                                                                                                                                                                                                                                                if (var5_6 != 0) break block85;
                                                                                                                                                                                                                                                                                                                                                                                if (v4 == null) break block86;
                                                                                                                                                                                                                                                                                                                                                                                v4 = var9_15;
                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                            v5 = n.a((D)v4, var10_16, true);
                                                                                                                                                                                                                                                                                                                                                                            if (var5_6 != 0) break block87;
                                                                                                                                                                                                                                                                                                                                                                            if (v5 == 0) break block86;
                                                                                                                                                                                                                                                                                                                                                                            v5 = var9_15.d(var10_16);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        if (var5_6 != 0) break block88;
                                                                                                                                                                                                                                                                                                                                                                        if (v5 == 0) break block86;
                                                                                                                                                                                                                                                                                                                                                                        v5 = this.h;
                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                    if (var5_6 != 0) break block89;
                                                                                                                                                                                                                                                                                                                                                                    if (v5 == 2) break block90;
                                                                                                                                                                                                                                                                                                                                                                    v5 = var10_16.t();
                                                                                                                                                                                                                                                                                                                                                                    if (var5_6 != 0) break block89;
                                                                                                                                                                                                                                                                                                                                                                    if (v5 <= this.j.size()) break block86;
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                v5 = this.b((D)var9_15) ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                            if (var5_6 == 0 && v5 != 0) {
                                                                                                                                                                                                                                                                                                                                                                v5 = this.j.add((D)var9_15) ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                        if (var5_6 == 0) break block76;
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                    v6 = this;
                                                                                                                                                                                                                                                                                                                                                    if (var5_6 != 0) break block91;
                                                                                                                                                                                                                                                                                                                                                    v0 = v6.e;
                                                                                                                                                                                                                                                                                                                                                    v3 = 2;
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                if (v0 != v3) break block92;
                                                                                                                                                                                                                                                                                                                                                v7 = this;
                                                                                                                                                                                                                                                                                                                                                if (var5_6 != 0) break block93;
                                                                                                                                                                                                                                                                                                                                                if (v7.j.isEmpty()) break block94;
                                                                                                                                                                                                                                                                                                                                                var9_15 = var7_7.h().C();
                                                                                                                                                                                                                                                                                                                                                var10_17 = var7_7.h().t();
                                                                                                                                                                                                                                                                                                                                                for (D var12_27 : this.j) {
                                                                                                                                                                                                                                                                                                                                                    block96: {
                                                                                                                                                                                                                                                                                                                                                        block99: {
                                                                                                                                                                                                                                                                                                                                                            block100: {
                                                                                                                                                                                                                                                                                                                                                                block98: {
                                                                                                                                                                                                                                                                                                                                                                    block97: {
                                                                                                                                                                                                                                                                                                                                                                        block95: {
                                                                                                                                                                                                                                                                                                                                                                            var13_29 = var7_7.h();
                                                                                                                                                                                                                                                                                                                                                                            if (var5_6 != 0) break block69;
                                                                                                                                                                                                                                                                                                                                                                            v8 = var12_27;
                                                                                                                                                                                                                                                                                                                                                                            if (var5_6 != 0) break block95;
                                                                                                                                                                                                                                                                                                                                                                            if (v8 == null) break block96;
                                                                                                                                                                                                                                                                                                                                                                            v8 = var12_27;
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        v9 = n.a(v8, var13_29, true);
                                                                                                                                                                                                                                                                                                                                                                        if (var5_6 != 0) break block97;
                                                                                                                                                                                                                                                                                                                                                                        if (v9 == 0) break block96;
                                                                                                                                                                                                                                                                                                                                                                        v9 = var12_27.d(var13_29);
                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                    if (var5_6 != 0) break block98;
                                                                                                                                                                                                                                                                                                                                                                    if (v9 == 0) break block96;
                                                                                                                                                                                                                                                                                                                                                                    v9 = this.h;
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                if (var5_6 != 0) break block99;
                                                                                                                                                                                                                                                                                                                                                                if (v9 == 2) break block100;
                                                                                                                                                                                                                                                                                                                                                                v9 = var13_29.t();
                                                                                                                                                                                                                                                                                                                                                                if (var5_6 != 0) break block99;
                                                                                                                                                                                                                                                                                                                                                                if (v9 < this.j.size()) break block96;
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                            v9 = this.b(var12_27) ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                        if (v9 != 0) {
                                                                                                                                                                                                                                                                                                                                                            var14_31 = var9_15.C();
                                                                                                                                                                                                                                                                                                                                                            v10 = var12_27.b();
                                                                                                                                                                                                                                                                                                                                                            if (var5_6 == 0) {
                                                                                                                                                                                                                                                                                                                                                                v10 = v10 != 0 ? var12_27.d().t() : 0;
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                            var15_32 = v10;
                                                                                                                                                                                                                                                                                                                                                            n.a(this.j, this.h, (d)var14_31, var15_32);
                                                                                                                                                                                                                                                                                                                                                            var16_34 = Math.min(var14_31.f(), var12_27.c((d)var14_31));
                                                                                                                                                                                                                                                                                                                                                            v11 = var14_31.t();
                                                                                                                                                                                                                                                                                                                                                            v12 = var16_34;
                                                                                                                                                                                                                                                                                                                                                            if (var5_6 == 0) {
                                                                                                                                                                                                                                                                                                                                                                if (v11 > v12) {
                                                                                                                                                                                                                                                                                                                                                                    var14_31.c(var16_34);
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                v11 = var10_17;
                                                                                                                                                                                                                                                                                                                                                                v12 = var14_31.t() - var15_32;
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                            var10_17 = v11 - v12;
                                                                                                                                                                                                                                                                                                                                                            var12_27.a((d)var14_31);
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                    if (var5_6 == 0) continue;
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                var9_15.c(var10_17);
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                            var7_7.e((d)var9_15);
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                        v7 = this;
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                    v7.d();
                                                                                                                                                                                                                                                                                                                                    if (var5_6 == 0) break block76;
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                v6 = this;
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            v6.d();
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        if (var5_6 == 0) break block70;
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                    v13 = this;
                                                                                                                                                                                                                                                                                                                    if (var5_6 != 0) break block101;
                                                                                                                                                                                                                                                                                                                    if (v13.e == 0) break block102;
                                                                                                                                                                                                                                                                                                                    v13 = this;
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                v13.d();
                                                                                                                                                                                                                                                                                                                if (var5_6 == 0) break block70;
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                            v14 = var3_3;
                                                                                                                                                                                                                                                                                                            v15 = net.minecraft.B.h.PICKUP;
                                                                                                                                                                                                                                                                                                            if (var5_6 != 0) break block103;
                                                                                                                                                                                                                                                                                                            if (v14 == v15) break block104;
                                                                                                                                                                                                                                                                                                            v14 = var3_3;
                                                                                                                                                                                                                                                                                                            v15 = net.minecraft.B.h.QUICK_MOVE;
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        if (var5_6 != 0) break block105;
                                                                                                                                                                                                                                                                                                        if (v14 != v15) break block106;
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                    v16 = var2_2;
                                                                                                                                                                                                                                                                                                    if (var5_6 != 0) break block107;
                                                                                                                                                                                                                                                                                                    if (v16 == 0) break block108;
                                                                                                                                                                                                                                                                                                    v16 = var2_2;
                                                                                                                                                                                                                                                                                                    v17 = 1;
                                                                                                                                                                                                                                                                                                    if (var5_6 != 0) break block109;
                                                                                                                                                                                                                                                                                                    if (v16 != v17) break block106;
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                v16 = var1_1;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            if (var5_6 != 0) break block110;
                                                                                                                                                                                                                                                                                            v17 = -999;
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        if (v16 != v17) break block111;
                                                                                                                                                                                                                                                                                        v18 = var7_7.h();
                                                                                                                                                                                                                                                                                        if (var5_6 != 0) return v18;
                                                                                                                                                                                                                                                                                        v16 = v18.G() ? 1 : 0;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    if (v16 != 0) break block70;
                                                                                                                                                                                                                                                                                    v19 = var2_2;
                                                                                                                                                                                                                                                                                    if (var5_6 == 0) {
                                                                                                                                                                                                                                                                                        if (v19 == 0) {
                                                                                                                                                                                                                                                                                            var4_4.a(var7_7.h(), true);
                                                                                                                                                                                                                                                                                            var7_7.e(net.minecraft.w.d.m);
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        v19 = var2_2;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    if (v19 != 1) break block70;
                                                                                                                                                                                                                                                                                    var4_4.a(var7_7.h().d(1), true);
                                                                                                                                                                                                                                                                                    if (var5_6 == 0) break block70;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                if (var3_3 != net.minecraft.B.h.QUICK_MOVE) break block112;
                                                                                                                                                                                                                                                                                if (var1_1 < 0) {
                                                                                                                                                                                                                                                                                    return net.minecraft.w.d.m;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                v20 = var8_9 = this.f.get(var1_1);
                                                                                                                                                                                                                                                                                if (var5_6 == 0) {
                                                                                                                                                                                                                                                                                    if (v20 == null) return net.minecraft.w.d.m;
                                                                                                                                                                                                                                                                                    v20 = var8_9;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                if (!v20.a(var4_4)) {
                                                                                                                                                                                                                                                                                    return net.minecraft.w.d.m;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                var9_15 = this.b(var4_4, var1_1);
                                                                                                                                                                                                                                                                                while (!var9_15.G()) {
                                                                                                                                                                                                                                                                                    v18 = var8_9.d();
                                                                                                                                                                                                                                                                                    if (var5_6 != 0) return v18;
                                                                                                                                                                                                                                                                                    if (var5_6 == 0) {
                                                                                                                                                                                                                                                                                        if (!net.minecraft.w.d.c(v18, (d)var9_15)) break;
                                                                                                                                                                                                                                                                                        var6_5 = var9_15.C();
                                                                                                                                                                                                                                                                                        v21 = var9_15 = this.b(var4_4, var1_1);
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    if (var5_6 == 0) continue;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                if (var5_6 == 0) break block70;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            if (var1_1 < 0) {
                                                                                                                                                                                                                                                                                return net.minecraft.w.d.m;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            v22 = var8_10 = this.f.get(var1_1);
                                                                                                                                                                                                                                                                            if (var5_6 != 0) break block113;
                                                                                                                                                                                                                                                                            if (v22 == null) break block114;
                                                                                                                                                                                                                                                                            v22 = var8_10;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        var9_15 = v22.d();
                                                                                                                                                                                                                                                                        var10_16 = var7_7.h();
                                                                                                                                                                                                                                                                        v23 = var9_15.G();
                                                                                                                                                                                                                                                                        if (var5_6 == 0) {
                                                                                                                                                                                                                                                                            if (!v23) {
                                                                                                                                                                                                                                                                                var6_5 = var9_15.C();
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            v23 = var9_15.G();
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        if (var5_6 != 0) break block115;
                                                                                                                                                                                                                                                                        if (!v23) break block116;
                                                                                                                                                                                                                                                                        v24 = var10_16.G();
                                                                                                                                                                                                                                                                        if (var5_6 != 0) break block117;
                                                                                                                                                                                                                                                                        if (v24) break block118;
                                                                                                                                                                                                                                                                        v25 = var8_10;
                                                                                                                                                                                                                                                                        if (var5_6 != 0) break block119;
                                                                                                                                                                                                                                                                        v24 = v25.d(var10_16);
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    if (!v24) break block118;
                                                                                                                                                                                                                                                                    v26 = var2_2;
                                                                                                                                                                                                                                                                    if (var5_6 == 0) {
                                                                                                                                                                                                                                                                        v26 = var11_20 = v26 == 0 ? var10_16.t() : 1;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    if (var5_6 == 0) {
                                                                                                                                                                                                                                                                        if (var11_20 > var8_10.c(var10_16)) {
                                                                                                                                                                                                                                                                            var11_20 = var8_10.c(var10_16);
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        var8_10.a(var10_16.d(var11_20));
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    if (var5_6 == 0) break block118;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                v25 = var8_10;
                                                                                                                                                                                                                                                                if (var5_6 != 0) break block119;
                                                                                                                                                                                                                                                                v23 = v25.a(var4_4);
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            if (!v23) break block118;
                                                                                                                                                                                                                                                            v27 = var10_16.G();
                                                                                                                                                                                                                                                            if (var5_6 != 0) break block120;
                                                                                                                                                                                                                                                            if (!v27) break block121;
                                                                                                                                                                                                                                                            v28 = var9_15.G();
                                                                                                                                                                                                                                                            if (var5_6 != 0) break block122;
                                                                                                                                                                                                                                                            if (v28 == 0) break block123;
                                                                                                                                                                                                                                                            var8_10.a(net.minecraft.w.d.m);
                                                                                                                                                                                                                                                            var7_7.e(net.minecraft.w.d.m);
                                                                                                                                                                                                                                                            if (var5_6 == 0) break block118;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        v28 = var2_2;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    if (var5_6 != 0) ** GOTO lbl275
                                                                                                                                                                                                                                                    if (v28 == 0) {
                                                                                                                                                                                                                                                        v29 = var9_15.t();
                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                        v28 = var9_15.t() + 1;
lbl275:
                                                                                                                                                                                                                                                        // 2 sources

                                                                                                                                                                                                                                                        v29 = v28 / 2;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    var11_21 = v29;
                                                                                                                                                                                                                                                    var7_7.e(var8_10.b(var11_21));
                                                                                                                                                                                                                                                    v30 = var9_15;
                                                                                                                                                                                                                                                    if (var5_6 == 0) {
                                                                                                                                                                                                                                                        if (v30.G()) {
                                                                                                                                                                                                                                                            var8_10.a(net.minecraft.w.d.m);
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        v30 = var8_10.a(var4_4, var7_7.h());
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    if (var5_6 == 0) break block118;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                v27 = var8_10.d(var10_16);
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            if (!v27) break block124;
                                                                                                                                                                                                                                            v31 = var9_15;
                                                                                                                                                                                                                                            if (var5_6 != 0) break block125;
                                                                                                                                                                                                                                            if (v31.w() != var10_16.w()) break block126;
                                                                                                                                                                                                                                            v32 = var9_15.d();
                                                                                                                                                                                                                                            v33 = var10_16.d();
                                                                                                                                                                                                                                            if (var5_6 != 0) break block127;
                                                                                                                                                                                                                                            if (v32 != v33) break block126;
                                                                                                                                                                                                                                            v32 = net.minecraft.w.d.b((d)var9_15, var10_16) ? 1 : 0;
                                                                                                                                                                                                                                            if (var5_6 != 0) break block128;
                                                                                                                                                                                                                                            if (v32 == 0) break block126;
                                                                                                                                                                                                                                            v34 = var2_2;
                                                                                                                                                                                                                                            if (var5_6 == 0) {
                                                                                                                                                                                                                                                v34 = v34 == 0 ? var10_16.t() : 1;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            v35 = var11_22 = v34;
                                                                                                                                                                                                                                            v36 = var8_10.c(var10_16) - var9_15.t();
                                                                                                                                                                                                                                            if (var5_6 == 0) {
                                                                                                                                                                                                                                                if (v35 > v36) {
                                                                                                                                                                                                                                                    var11_22 = var8_10.c(var10_16) - var9_15.t();
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                v35 = var11_22;
                                                                                                                                                                                                                                                v36 = var10_16.f() - var9_15.t();
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            if (var5_6 != 0) break block129;
                                                                                                                                                                                                                                            if (v35 <= v36) break block130;
                                                                                                                                                                                                                                            v35 = var10_16.f();
                                                                                                                                                                                                                                            v36 = var9_15.t();
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        var11_22 = v35 - v36;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    var10_16.b(var11_22);
                                                                                                                                                                                                                                    var9_15.g(var11_22);
                                                                                                                                                                                                                                    if (var5_6 == 0) break block118;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                v31 = var10_16;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            v32 = v31.t();
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        v33 = var8_10.c(var10_16);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    if (v32 > v33) break block118;
                                                                                                                                                                                                                    var8_10.a(var10_16);
                                                                                                                                                                                                                    var7_7.e((d)var9_15);
                                                                                                                                                                                                                    if (var5_6 == 0) break block118;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                v37 = var9_15;
                                                                                                                                                                                                                if (var5_6 != 0) break block131;
                                                                                                                                                                                                                if (v37.w() != var10_16.w()) break block118;
                                                                                                                                                                                                                v37 = var10_16;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            v38 = v37.f();
                                                                                                                                                                                                            if (var5_6 != 0) break block132;
                                                                                                                                                                                                            if (v38 <= 1) break block118;
                                                                                                                                                                                                            v38 = var9_15.z() ? 1 : 0;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        if (var5_6 != 0) break block133;
                                                                                                                                                                                                        if (v38 == 0) break block134;
                                                                                                                                                                                                        v38 = var9_15.d();
                                                                                                                                                                                                        if (var5_6 != 0) break block133;
                                                                                                                                                                                                        if (v38 != var10_16.d()) break block118;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    v38 = net.minecraft.w.d.b((d)var9_15, var10_16) ? 1 : 0;
                                                                                                                                                                                                }
                                                                                                                                                                                                if (var5_6 != 0) break block135;
                                                                                                                                                                                                if (v38 == 0) break block118;
                                                                                                                                                                                                v38 = var9_15.G() ? 1 : 0;
                                                                                                                                                                                            }
                                                                                                                                                                                            if (var5_6 != 0) break block136;
                                                                                                                                                                                            if (v38 != 0) break block118;
                                                                                                                                                                                            v38 = var9_15.t();
                                                                                                                                                                                        }
                                                                                                                                                                                        var11_23 = v38;
                                                                                                                                                                                        v39 = var11_23 + var10_16.t();
                                                                                                                                                                                        if (var5_6 != 0) break block137;
                                                                                                                                                                                        if (v39 > var10_16.f()) break block118;
                                                                                                                                                                                        var10_16.g(var11_23);
                                                                                                                                                                                        v40 = var9_15 = var8_10.b(var11_23);
                                                                                                                                                                                        if (var5_6 != 0) break block118;
                                                                                                                                                                                        v39 = v40.G() ? 1 : 0;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (v39 != 0) {
                                                                                                                                                                                        var8_10.a(net.minecraft.w.d.m);
                                                                                                                                                                                    }
                                                                                                                                                                                    v40 = var8_10.a(var4_4, var7_7.h());
                                                                                                                                                                                }
                                                                                                                                                                                v25 = var8_10;
                                                                                                                                                                            }
                                                                                                                                                                            v25.f();
                                                                                                                                                                        }
                                                                                                                                                                        if (var5_6 == 0) break block70;
                                                                                                                                                                    }
                                                                                                                                                                    v14 = var3_3;
                                                                                                                                                                    v15 = net.minecraft.B.h.SWAP;
                                                                                                                                                                }
                                                                                                                                                                if (var5_6 != 0) break block138;
                                                                                                                                                                if (v14 != v15) break block139;
                                                                                                                                                                v41 = var2_2;
                                                                                                                                                                if (var5_6 != 0) break block140;
                                                                                                                                                                if (v41 < 0) break block139;
                                                                                                                                                                v41 = var2_2;
                                                                                                                                                            }
                                                                                                                                                            if (v41 >= 9) break block139;
                                                                                                                                                            var8_11 = this.f.get(var1_1);
                                                                                                                                                            var9_15 = var7_7.a(var2_2);
                                                                                                                                                            var10_16 = var8_11.d();
                                                                                                                                                            v42 = var9_15.G();
                                                                                                                                                            if (var5_6 != 0) break block141;
                                                                                                                                                            if (v42 == 0) break block142;
                                                                                                                                                            v42 = var10_16.G();
                                                                                                                                                            if (var5_6 != 0) break block141;
                                                                                                                                                            if (v42 != 0) break block143;
                                                                                                                                                        }
                                                                                                                                                        v42 = var9_15.G();
                                                                                                                                                    }
                                                                                                                                                    if (var5_6 != 0) break block144;
                                                                                                                                                    if (v42 == 0) break block145;
                                                                                                                                                    v43 = var8_11;
                                                                                                                                                    v44 = var4_4;
                                                                                                                                                    if (var5_6 != 0) break block146;
                                                                                                                                                    if (!v43.a(v44)) break block143;
                                                                                                                                                    var7_7.a(var2_2, var10_16);
                                                                                                                                                    var8_11.a(var10_16.t());
                                                                                                                                                    var8_11.a(net.minecraft.w.d.m);
                                                                                                                                                    v43 = var8_11;
                                                                                                                                                    v44 = var4_4;
                                                                                                                                                }
                                                                                                                                                v43.a(v44, var10_16);
                                                                                                                                                if (var5_6 == 0) break block143;
                                                                                                                                            }
                                                                                                                                            v42 = var10_16.G();
                                                                                                                                        }
                                                                                                                                        if (var5_6 != 0) break block147;
                                                                                                                                        if (v42 == 0) break block148;
                                                                                                                                        v45 = var8_11.d((d)var9_15);
                                                                                                                                        if (var5_6 != 0) break block149;
                                                                                                                                        if (v45 == 0) break block143;
                                                                                                                                        v45 = var11_24 = var8_11.c((d)var9_15);
                                                                                                                                    }
                                                                                                                                    if (var5_6 != 0) break block150;
                                                                                                                                    if (var9_15.t() <= var11_24) break block151;
                                                                                                                                    var8_11.a(var9_15.d(var11_24));
                                                                                                                                    if (var5_6 == 0) break block152;
                                                                                                                                }
                                                                                                                                var8_11.a((d)var9_15);
                                                                                                                            }
                                                                                                                            var7_7.a(var2_2, net.minecraft.w.d.m);
                                                                                                                        }
                                                                                                                        if (var5_6 == 0) break block143;
                                                                                                                    }
                                                                                                                    v42 = var8_11.a(var4_4);
                                                                                                                }
                                                                                                                if (var5_6 != 0) break block153;
                                                                                                                if (v42 == 0) break block143;
                                                                                                                v42 = var8_11.d((d)var9_15);
                                                                                                            }
                                                                                                            if (var5_6 != 0) break block154;
                                                                                                            if (v42 == 0) break block143;
                                                                                                            v42 = var8_11.c((d)var9_15);
                                                                                                        }
                                                                                                        var11_25 = v42;
                                                                                                        v46 = var9_15;
                                                                                                        if (var5_6 != 0) break block143;
                                                                                                        if (v46.t() <= var11_25) break block155;
                                                                                                        var8_11.a(var9_15.d(var11_25));
                                                                                                        var8_11.a(var4_4, var10_16);
                                                                                                        if (var5_6 != 0) break block156;
                                                                                                        if (var7_7.b(var10_16)) break block143;
                                                                                                        var4_4.a(var10_16, true);
                                                                                                    }
                                                                                                    if (var5_6 == 0) break block143;
                                                                                                }
                                                                                                var8_11.a((d)var9_15);
                                                                                                var7_7.a(var2_2, var10_16);
                                                                                                v46 = var8_11.a(var4_4, var10_16);
                                                                                            }
                                                                                            if (var5_6 == 0) break block70;
                                                                                        }
                                                                                        v14 = var3_3;
                                                                                        v15 = net.minecraft.B.h.CLONE;
                                                                                    }
                                                                                    if (var5_6 != 0) break block157;
                                                                                    if (v14 != v15) break block158;
                                                                                    v47 = var4_4.cw.g;
                                                                                    if (var5_6 != 0) break block159;
                                                                                    if (v47 == 0) break block158;
                                                                                    v47 = var7_7.h().G() ? 1 : 0;
                                                                                }
                                                                                if (var5_6 != 0) break block160;
                                                                                if (v47 == 0) break block158;
                                                                                v47 = var1_1;
                                                                            }
                                                                            if (v47 < 0) break block158;
                                                                            v48 = var8_12 = this.f.get(var1_1);
                                                                            if (var5_6 != 0) break block161;
                                                                            if (v48 == null) break block162;
                                                                            v48 = var8_12;
                                                                        }
                                                                        if (var5_6 != 0) break block163;
                                                                        if (!v48.b()) break block162;
                                                                        v48 = var8_12;
                                                                    }
                                                                    var9_15 = v48.d().C();
                                                                    var9_15.c(var9_15.f());
                                                                    var7_7.e((d)var9_15);
                                                                }
                                                                if (var5_6 == 0) break block70;
                                                            }
                                                            v14 = var3_3;
                                                            v15 = net.minecraft.B.h.THROW;
                                                        }
                                                        if (var5_6 != 0) break block164;
                                                        if (v14 != v15) break block165;
                                                        v49 = var7_7.h().G();
                                                        if (var5_6 != 0) break block166;
                                                        if (v49 == 0) break block165;
                                                        v49 = var1_1;
                                                    }
                                                    if (v49 < 0) break block165;
                                                    v50 = var8_13 = this.f.get(var1_1);
                                                    if (var5_6 != 0) break block167;
                                                    if (v50 == null) break block168;
                                                    v50 = var8_13;
                                                }
                                                v51 = v50.b();
                                                if (var5_6 != 0) break block169;
                                                if (!v51) break block168;
                                                v52 = var8_13;
                                                if (var5_6 != 0) break block170;
                                                v51 = v52.a(var4_4);
                                            }
                                            if (!v51) break block168;
                                            v52 = var8_13;
                                        }
                                        v53 = var2_2;
                                        if (var5_6 == 0) {
                                            v53 = v53 == 0 ? 1 : var8_13.d().t();
                                        }
                                        var9_15 = v52.b(v53);
                                        var8_13.a(var4_4, (d)var9_15);
                                        var4_4.a((d)var9_15, true);
                                    }
                                    if (var5_6 == 0) break block70;
                                }
                                v14 = var3_3;
                                v15 = net.minecraft.B.h.PICKUP_ALL;
                            }
                            if (v14 != v15 || var1_1 < 0) break block70;
                            var8_14 = this.f.get(var1_1);
                            var9_15 = var7_7.h();
                            if (var9_15.G()) break block171;
                            v54 = var8_14;
                            if (var5_6 != 0) break block172;
                            if (v54 == null) break block173;
                            v54 = var8_14;
                        }
                        v55 = v54.b();
                        if (var5_6 != 0) break block174;
                        if (v55 == 0) break block173;
                        v55 = var8_14.a(var4_4) ? 1 : 0;
                        if (var5_6 != 0) break block174;
                        if (v55 != 0) break block171;
                    }
                    v55 = var2_2;
                }
                if (var5_6 != 0) ** GOTO lbl557
                if (v55 == 0) {
                    v56 = 0;
                } else {
                    v55 = this.f.size();
lbl557:
                    // 2 sources

                    v56 = v55 - 1;
                }
                var10_18 = v56;
                v57 = var2_2;
                if (var5_6 == 0) {
                    v57 = v57 == 0 ? 1 : -1;
                }
                var11_26 = v57;
                var12_28 = 0;
                block2: while (true) {
                    v58 = var12_28;
                    v59 = 2;
                    block3: while (v58 < v59) {
                        if (var5_6 != 0) break block70;
                        var13_30 = var10_18;
                        while (var13_30 >= 0) {
                            block177: {
                                block181: {
                                    block178: {
                                        block179: {
                                            block180: {
                                                block176: {
                                                    block175: {
                                                        v58 = var13_30;
                                                        v59 = this.f.size();
                                                        if (var5_6 != 0) continue block3;
                                                        if (var5_6 != 0) break block175;
                                                        if (v58 >= v59) break;
                                                        v60 = var9_15;
                                                        if (var5_6 != 0) break block176;
                                                        v61 = v60.t();
                                                        v62 = var9_15.f();
                                                    }
                                                    if (v61 >= v62) break;
                                                    v60 = this.f.get(var13_30);
                                                }
                                                var14_31 = (D)v60;
                                                v63 = var14_31.b();
                                                if (var5_6 != 0) break block177;
                                                if (v63 == 0) break block178;
                                                v63 = n.a((D)var14_31, (d)var9_15, true) ? 1 : 0;
                                                if (var5_6 != 0) break block177;
                                                if (v63 == 0) break block178;
                                                v63 = var14_31.a(var4_4) ? 1 : 0;
                                                if (var5_6 != 0) break block177;
                                                if (v63 == 0) break block178;
                                                v63 = this.a((d)var9_15, (D)var14_31) ? 1 : 0;
                                                if (var5_6 != 0) break block177;
                                                if (v63 == 0) break block178;
                                                var15_33 = var14_31.d();
                                                v64 = var12_28;
                                                if (var5_6 != 0) break block179;
                                                if (v64 != 0) break block180;
                                                v65 = var15_33.t();
                                                v66 = var15_33.f();
                                                if (var5_6 != 0) break block181;
                                                if (v65 == v66) break block178;
                                            }
                                            v64 = Math.min(var9_15.f() - var9_15.t(), var15_33.t());
                                        }
                                        var16_34 = v64;
                                        var17_35 = var14_31.b(var16_34);
                                        var9_15.g(var16_34);
                                        v67 = var17_35;
                                        if (var5_6 == 0) {
                                            if (v67.G()) {
                                                var14_31.a(net.minecraft.w.d.m);
                                            }
                                            v67 = var14_31.a(var4_4, var17_35);
                                        }
                                    }
                                    v65 = var13_30;
                                    v66 = var11_26;
                                }
                                v63 = v65 + v66;
                            }
                            var13_30 = v63 ? 1 : 0;
                            if (var5_6 == 0) continue;
                        }
                        ++var12_28;
                        if (var5_6 == 0) continue block2;
                    }
                    break;
                }
            }
            this.a();
        }
        v18 = var6_5;
        return v18;
    }

    public static int b(@Nullable a a10) {
        int n2;
        int n3;
        int n4;
        block6: {
            n4 = n.c();
            if (a10 == null) {
                return 0;
            }
            n3 = 0;
            float f10 = 0.0f;
            int n5 = 0;
            while (n5 < a10.e()) {
                d d10 = a10.a(n5);
                if (n4 == 0) {
                    n2 = d10.G();
                    if (n4 != 0) break block6;
                    if (n2 == 0) {
                        f10 += (float)d10.t() / (float)Math.min(a10.c(), d10.f());
                        ++n3;
                    }
                    ++n5;
                }
                if (n4 == 0) continue;
            }
            n2 = net.minecraft.k.h.d((f10 /= (float)a10.e()) * 14.0f);
        }
        int n6 = n3;
        if (n4 == 0) {
            n6 = n6 > 0 ? 1 : 0;
        }
        return n2 + n6;
    }

    protected void d() {
        this.e = 0;
        this.j.clear();
    }

    public void a(List<d> list) {
        int n2 = n.b();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            this.a(i2).a(list.get(i2));
            if (n2 != 0) continue;
        }
    }

    public boolean c(net.minecraft.i.j j2) {
        int n2 = n.c();
        boolean bl2 = this.i.contains(j2);
        if (n2 == 0) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public D a(int n2) {
        return this.f.get(n2);
    }

    public static int c(int n2) {
        return n2 & 3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(int n2, net.minecraft.i.j j2) {
        int n3;
        int n4;
        block7: {
            int n5;
            block6: {
                n4 = n.b();
                n3 = n2;
                if (n4 != 0) {
                    if (n3 == 0) {
                        return true;
                    }
                    n3 = n2;
                }
                n5 = 1;
                if (n4 == 0) break block6;
                if (n3 == n5) {
                    return true;
                }
                n3 = n2;
                if (n4 == 0) break block7;
                n5 = 2;
            }
            if (n3 != n5) return 0 != 0;
            n3 = j2.cw.g;
        }
        if (n4 == 0) return n3 != 0;
        if (n3 == 0) return 0 != 0;
        return 1 != 0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected boolean a(d var1_1, int var2_2, int var3_3, boolean var4_4) {
        block37: {
            block38: {
                block39: {
                    block26: {
                        block27: {
                            var6_5 = 0;
                            var5_6 = n.b();
                            var7_7 = var2_2;
                            v0 = var4_4;
                            if (var5_6 != 0) {
                                if (v0 != 0) {
                                    var7_7 = var3_3 - 1;
                                }
                                v0 = var1_1.p() ? 1 : 0;
                            }
                            if (var5_6 == 0) break block26;
                            if (v0 == 0) break block27;
                            while (!var1_1.G()) {
                                block36: {
                                    block35: {
                                        block28: {
                                            block29: {
                                                block33: {
                                                    block34: {
                                                        block31: {
                                                            block32: {
                                                                block30: {
                                                                    v0 = var4_4;
                                                                    if (var5_6 == 0) break block26;
                                                                    if (var5_6 == 0) ** GOTO lbl20
                                                                    if (v0 != 0) {
                                                                        if (var7_7 < var2_2) {
                                                                            if (var5_6 != 0) break;
                                                                        }
                                                                    } else {
                                                                        v1 = var7_7;
lbl20:
                                                                        // 2 sources

                                                                        if (v1 >= var3_3 && var5_6 != 0) break;
                                                                    }
                                                                    var8_8 = this.f.get(var7_7);
                                                                    var9_9 = var8_8.d();
                                                                    v2 = var9_9.G();
                                                                    if (var5_6 == 0) break block28;
                                                                    if (v2 != 0) break block29;
                                                                    v3 = var9_9;
                                                                    if (var5_6 == 0) break block30;
                                                                    if (v3.w() != var1_1.w()) break block29;
                                                                    v3 = var1_1;
                                                                }
                                                                v2 = v3.z() ? 1 : 0;
                                                                if (var5_6 == 0) break block31;
                                                                if (v2 == 0) break block32;
                                                                v2 = var1_1.d();
                                                                if (var5_6 == 0) break block28;
                                                                if (v2 != var9_9.d()) break block29;
                                                            }
                                                            v2 = net.minecraft.w.d.b(var1_1, var9_9) ? 1 : 0;
                                                        }
                                                        if (var5_6 == 0) break block28;
                                                        if (v2 == 0) break block29;
                                                        v2 = var10_10 = var9_9.t() + var1_1.t();
                                                        v4 = var1_1.f();
                                                        if (var5_6 == 0) break block33;
                                                        if (v2 > v4) break block34;
                                                        var1_1.c(0);
                                                        var9_9.c(var10_10);
                                                        var8_8.f();
                                                        var6_5 = 1;
                                                        if (var5_6 != 0) break block29;
                                                    }
                                                    v2 = var9_9.t();
                                                    if (var5_6 == 0) break block28;
                                                    v4 = var1_1.f();
                                                }
                                                if (v2 < v4) {
                                                    var1_1.b(var1_1.f() - var9_9.t());
                                                    var9_9.c(var1_1.f());
                                                    var8_8.f();
                                                    var6_5 = 1;
                                                }
                                            }
                                            v2 = var4_4;
                                        }
                                        if (v2 == 0) break block35;
                                        --var7_7;
                                        if (var5_6 != 0) break block36;
                                    }
                                    ++var7_7;
                                }
                                if (var5_6 != 0) continue;
                            }
                        }
                        v0 = var1_1.G() ? 1 : 0;
                    }
                    if (var5_6 == 0) return (boolean)v0;
                    if (v0 != 0) break block37;
                    v5 = var4_4;
                    if (var5_6 == 0) break block38;
                    if (v5 == 0) break block39;
                    var7_7 = var3_3 - 1;
                    if (var5_6 != 0) break block38;
                }
                v5 = var7_7 = var2_2;
            }
            do {
                block43: {
                    block44: {
                        block46: {
                            block45: {
                                block42: {
                                    block41: {
                                        block40: {
                                            if (var4_4 == 0) break block40;
                                            v6 = var7_7;
                                            v7 = var2_2;
                                            if (var5_6 == 0) break block41;
                                            if (v6 < v7) {
                                                if (var5_6 != 0) break;
                                            }
                                            break block42;
                                        }
                                        v6 = var7_7;
                                        v7 = var3_3;
                                    }
                                    if (v6 >= v7 && var5_6 != 0) break;
                                }
                                var8_8 = this.f.get(var7_7);
                                var9_9 = var8_8.d();
                                v8 = var9_9.G();
                                if (var5_6 == 0) break block43;
                                if (v8 == 0) break block44;
                                v8 = var8_8.d(var1_1) ? 1 : 0;
                                if (var5_6 == 0) break block43;
                                if (v8 == 0) break block44;
                                if (var1_1.t() <= var8_8.a()) break block45;
                                var8_8.a(var1_1.d(var8_8.a()));
                                if (var5_6 != 0) break block46;
                            }
                            var8_8.a(var1_1.d(var1_1.t()));
                        }
                        var8_8.f();
                        var6_5 = 1;
                        if (var5_6 != 0) break;
                    }
                    v8 = var4_4;
                }
                if (v8 != 0) {
                    --var7_7;
                    if (var5_6 != 0) continue;
                }
                ++var7_7;
            } while (var5_6 != 0);
        }
        v0 = var6_5;
        return (boolean)v0;
    }

    public abstract boolean a(net.minecraft.i.j var1);
}

