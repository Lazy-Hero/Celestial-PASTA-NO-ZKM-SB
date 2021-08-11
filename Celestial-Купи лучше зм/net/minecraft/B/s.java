/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.B;

import java.util.List;
import java.util.Random;
import net.minecraft.B.D;
import net.minecraft.B.I;
import net.minecraft.B.J;
import net.minecraft.B.a;
import net.minecraft.B.c;
import net.minecraft.B.j;
import net.minecraft.B.n;
import net.minecraft.ah.z;
import net.minecraft.ax.T;
import net.minecraft.ax.f;
import net.minecraft.ax.u;
import net.minecraft.i.h;
import net.minecraft.k.m;
import net.minecraft.u.g;
import net.minecraft.w.bl;
import net.minecraft.w.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class s
extends n {
    public /* synthetic */ int[] k;
    public /* synthetic */ int n;
    public /* synthetic */ int[] p;
    public /* synthetic */ int[] q;
    private final /* synthetic */ Random l;
    public /* synthetic */ a r;
    private final /* synthetic */ net.minecraft.k.n o;
    private final /* synthetic */ z m;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(a var1_1) {
        block38: {
            block39: {
                block37: {
                    block36: {
                        var2_2 = net.minecraft.B.n.b();
                        v0 = var1_1;
                        if (var2_2 != 0) {
                            if (v0 != this.r) return;
                            v0 = var1_1;
                        }
                        var3_3 = v0.a(0);
                        v1 = var3_3.G();
                        if (var2_2 == 0) break block38;
                        if (v1 != 0) break block39;
                        v1 = var3_3.k();
                        if (var2_2 == 0) break block38;
                        if (v1 == 0) break block39;
                        v2 = this.m.C;
                        if (var2_2 != 0) {
                            if (v2 != false) return;
                            v2 = false;
                        }
                        var4_4 = v2 ? 1 : 0;
                        var5_5 = -1;
                        block0: while (true) {
                            v3 = var5_5;
                            block1: while (v3 <= 1) {
                                v4 = -1;
                                if (var2_2 == 0) break block36;
                                for (var6_6 = v1401774; var6_6 <= 1; ++var6_6) {
                                    block41: {
                                        block40: {
                                            v3 = var5_5;
                                            if (var2_2 == 0) continue block1;
                                            if (var2_2 != 0) {
                                                if (v3 == 0) {
                                                    v5 = var6_6;
                                                    if (var2_2 != 0) {
                                                        if (v5 == 0) continue;
                                                    }
                                                } else {
                                                    v5 = this.m.a(this.o.a(var6_6, 0, var5_5)) ? 1 : 0;
                                                }
                                            }
                                            if (var2_2 == 0) break block40;
                                            if (v5 == 0) continue;
                                            v6 = this.m;
                                            v7 = this.o.a(var6_6, 1, var5_5);
                                            if (var2_2 == 0) break block41;
                                            v5 = v6.a(v7) ? 1 : 0;
                                        }
                                        if (v5 == 0) continue;
                                        v6 = this.m;
                                        v7 = this.o.a(var6_6 * 2, 0, var5_5 * 2);
                                    }
                                    v8 = v6.d(v7).b();
                                    v9 = g.c8;
                                    if (var2_2 != 0) {
                                        if (v8 == v9) {
                                            ++var4_4;
                                        }
                                        v8 = this.m.d(this.o.a(var6_6 * 2, 1, var5_5 * 2)).b();
                                        v9 = g.c8;
                                    }
                                    if (v8 == v9) {
                                        ++var4_4;
                                    }
                                    v10 = var6_6;
                                    if (var2_2 != 0) {
                                        if (v10 == 0) continue;
                                        v10 = var5_5;
                                    }
                                    if (v10 == 0) continue;
                                    v11 = this.m.d(this.o.a(var6_6 * 2, 0, var5_5)).b();
                                    v12 = g.c8;
                                    if (var2_2 != 0) {
                                        if (v11 == v12) {
                                            ++var4_4;
                                        }
                                        v11 = this.m.d(this.o.a(var6_6 * 2, 1, var5_5)).b();
                                        v12 = g.c8;
                                    }
                                    if (var2_2 != 0) {
                                        if (v11 == v12) {
                                            ++var4_4;
                                        }
                                        v11 = this.m.d(this.o.a(var6_6, 0, var5_5 * 2)).b();
                                        v12 = g.c8;
                                    }
                                    if (var2_2 != 0) {
                                        if (v11 == v12) {
                                            ++var4_4;
                                        }
                                        v11 = this.m.d(this.o.a(var6_6, 1, var5_5 * 2)).b();
                                        v12 = g.c8;
                                    }
                                    if (v11 != v12) continue;
                                    ++var4_4;
                                    if (var2_2 != 0) continue;
                                }
                                ++var5_5;
                                if (var2_2 != 0) continue block0;
                            }
                            break;
                        }
                        this.l.setSeed(this.n);
                        v4 = var5_5 = 0;
                    }
                    while (var5_5 < 3) {
                        block42: {
                            this.p[var5_5] = T.a(this.l, var5_5, var4_4, var3_3);
                            this.q[var5_5] = -1;
                            this.k[var5_5] = -1;
                            if (var2_2 == 0) break block42;
                            v13 = this.p[var5_5];
                            v14 = var5_5 + 1;
                            if (var2_2 == 0) ** GOTO lbl102
                            if (v13 < v14) {
                                this.p[var5_5] = 0;
                            }
                            ++var5_5;
                        }
                        if (var2_2 != 0) continue;
                    }
                    var5_5 = 0;
                    do {
                        block44: {
                            block45: {
                                block43: {
                                    v13 = var5_5;
                                    v14 = 3;
lbl102:
                                    // 2 sources

                                    if (v13 >= v14) break;
                                    v15 = this;
                                    if (var2_2 == 0) break block37;
                                    if (var2_2 == 0) break block43;
                                    if (v15.p[var5_5] <= 0) break block44;
                                    v16 = this;
                                }
                                var6_8 = v16.a(var3_3, var5_5, this.p[var5_5]);
                                if (var2_2 == 0) continue;
                                if (var6_8 == null) break block44;
                                v17 = var6_8;
                                if (var2_2 == 0) break block45;
                                if (v17.isEmpty()) break block44;
                                v17 = var6_8.get(this.l.nextInt(var6_8.size()));
                            }
                            var7_9 = (f)v17;
                            this.q[var5_5] = u.c(var7_9.b);
                            this.k[var5_5] = var7_9.c;
                        }
                        ++var5_5;
                    } while (var2_2 != 0);
                    v15 = this;
                }
                v15.a();
                if (var2_2 != 0) return;
            }
            v1 = 0;
        }
        var4_4 = v1;
        do {
            if (var4_4 >= 3) return;
            this.p[var4_4] = 0;
            this.q[var4_4] = -1;
            this.k[var4_4] = -1;
            ++var4_4;
        } while (var2_2 != 0);
    }

    private List<f> a(d d10, int n2, int n3) {
        List<f> list;
        block5: {
            List<f> list2;
            block4: {
                int n4 = net.minecraft.B.n.c();
                this.l.setSeed(this.n + n2);
                int n5 = n4;
                list2 = T.b(this.l, d10, n3, false);
                if (d10.w() != net.minecraft.u.h.b8) break block4;
                list = list2;
                if (n5 != 0) break block5;
                if (list.size() > 1) {
                    list2.remove(this.l.nextInt(list2.size()));
                }
            }
            list = list2;
        }
        return list;
    }

    @Override
    public void b(net.minecraft.i.j j2) {
        block3: {
            s s2;
            block2: {
                int n2 = net.minecraft.B.n.c();
                super.b(j2);
                int n3 = n2;
                s2 = this;
                if (n3 != 0) break block2;
                if (s2.m.C) break block3;
                s2 = this;
            }
            s2.a(j2, j2.aG, this.r);
        }
    }

    @Override
    public void b(j j2) {
        super.b(j2);
        this.c(j2);
    }

    @Override
    public void a(int n2, int n3) {
        block3: {
            block9: {
                int n4;
                int n5;
                int n6;
                block8: {
                    block6: {
                        block7: {
                            block4: {
                                block5: {
                                    block2: {
                                        block0: {
                                            block1: {
                                                n6 = net.minecraft.B.n.c();
                                                n5 = n2;
                                                if (n6 != 0) break block0;
                                                if (n5 < 0) break block1;
                                                n5 = n2;
                                                n4 = 2;
                                                if (n6 != 0) break block2;
                                                if (n5 > n4) break block1;
                                                this.p[n2] = n3;
                                                if (n6 == 0) break block3;
                                            }
                                            n5 = n2;
                                        }
                                        n4 = 3;
                                    }
                                    if (n6 != 0) break block4;
                                    if (n5 != n4) break block5;
                                    this.n = n3;
                                    if (n6 == 0) break block3;
                                }
                                n5 = n2;
                                n4 = 4;
                            }
                            if (n6 != 0) break block6;
                            if (n5 < n4) break block7;
                            n5 = n2;
                            n4 = 6;
                            if (n6 != 0) break block6;
                            if (n5 > n4) break block7;
                            this.q[n2 - 4] = n3;
                            if (n6 == 0) break block3;
                        }
                        n5 = n2;
                        n4 = 7;
                    }
                    if (n6 != 0) break block8;
                    if (n5 < n4) break block9;
                    n5 = n2;
                    n4 = 9;
                }
                if (n5 > n4) break block9;
                this.k[n2 - 7] = n3;
                if (n6 == 0) break block3;
            }
            super.a(n2, n3);
        }
    }

    public s(h h2, z z2, net.minecraft.k.n n2) {
        int n3;
        int n4;
        block4: {
            int n5;
            this.r = new c(this, "Enchant", true, 2);
            n4 = net.minecraft.B.n.b();
            this.l = new Random();
            this.p = new int[3];
            this.q = new int[]{-1, -1, -1};
            this.k = new int[]{-1, -1, -1};
            this.m = z2;
            this.o = n2;
            this.n = h2.g.X();
            this.a(new I(this, this.r, 0, 15, 47));
            this.a(new J(this, this.r, 1, 35, 47));
            n3 = 0;
            while (n3 < 3) {
                block5: {
                    n5 = 0;
                    if (n4 == 0) break block4;
                    for (int i2 = v1402113; i2 < 9; ++i2) {
                        this.a(new D(h2, i2 + n3 * 9 + 9, 8 + i2 * 18, 84 + n3 * 18));
                        if (n4 != 0) {
                            if (n4 != 0) continue;
                            net.minecraft.k.m.b(!net.minecraft.k.m.d());
                            break;
                        }
                        break block5;
                    }
                    ++n3;
                }
                if (n4 != 0) continue;
            }
            n5 = n3 = 0;
        }
        while (n3 < 9) {
            this.a(new D(h2, n3, 8 + n3 * 18, 142));
            ++n3;
            if (n4 != 0) continue;
        }
    }

    protected void c(j j2) {
        block0: {
            int n2 = net.minecraft.B.n.b();
            j2.a((n)this, 0, this.p[0]);
            int n3 = n2;
            j2.a((n)this, 1, this.p[1]);
            j2.a((n)this, 2, this.p[2]);
            j2.a((n)this, 3, this.n & 0xFFFFFFF0);
            j2.a((n)this, 4, this.q[0]);
            j2.a((n)this, 5, this.q[1]);
            j2.a((n)this, 6, this.q[2]);
            j2.a((n)this, 7, this.k[0]);
            j2.a((n)this, 8, this.k[1]);
            j2.a((n)this, 9, this.k[2]);
            if (net.minecraft.k.m.d()) break block0;
            net.minecraft.B.n.b(++n3);
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean a(net.minecraft.i.j var1_1, int var2_2) {
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
    public void a() {
        int n2 = net.minecraft.B.n.c();
        super.a();
        int n3 = n2;
        for (int i2 = 0; i2 < this.d.size(); ++i2) {
            j j2 = (j)this.d.get(i2);
            this.c(j2);
            if (n3 == 0) continue;
        }
    }

    @Override
    public d b(net.minecraft.i.j j2, int n2) {
        d d10;
        block19: {
            d d11;
            D d12;
            int n3;
            block36: {
                block35: {
                    int n4;
                    block23: {
                        block24: {
                            block33: {
                                block34: {
                                    block31: {
                                        block32: {
                                            block30: {
                                                block29: {
                                                    Object object;
                                                    block27: {
                                                        block28: {
                                                            block26: {
                                                                block25: {
                                                                    block21: {
                                                                        block22: {
                                                                            D d13;
                                                                            block20: {
                                                                                block18: {
                                                                                    d10 = net.minecraft.w.d.m;
                                                                                    n3 = net.minecraft.B.n.c();
                                                                                    d13 = d12 = (D)this.f.get(n2);
                                                                                    if (n3 != 0) break block18;
                                                                                    if (d13 == null) break block19;
                                                                                    d13 = d12;
                                                                                }
                                                                                if (n3 != 0) break block20;
                                                                                if (!d13.b()) break block19;
                                                                                d13 = d12;
                                                                            }
                                                                            d11 = d13.d();
                                                                            d10 = d11.C();
                                                                            n4 = n2;
                                                                            if (n3 != 0) break block21;
                                                                            if (n4 != 0) break block22;
                                                                            n4 = this.a(d11, 2, 38, true) ? 1 : 0;
                                                                            if (n3 != 0) break block23;
                                                                            if (n4 == 0) {
                                                                                return net.minecraft.w.d.m;
                                                                            }
                                                                            break block24;
                                                                        }
                                                                        n4 = n2;
                                                                    }
                                                                    if (n3 != 0) break block25;
                                                                    if (n4 != 1) break block26;
                                                                    n4 = this.a(d11, 2, 38, true) ? 1 : 0;
                                                                }
                                                                if (n3 != 0) break block23;
                                                                if (n4 == 0) {
                                                                    return net.minecraft.w.d.m;
                                                                }
                                                                break block24;
                                                            }
                                                            object = d11.w();
                                                            if (n3 != 0) break block27;
                                                            if (object != net.minecraft.u.h.aL) break block28;
                                                            object = bl.d(d11.d());
                                                            if (n3 != 0) break block27;
                                                            if (object != bl.BLUE) break block28;
                                                            n4 = this.a(d11, 1, 2, true) ? 1 : 0;
                                                            if (n3 != 0) break block23;
                                                            if (n4 == 0) {
                                                                return net.minecraft.w.d.m;
                                                            }
                                                            break block24;
                                                        }
                                                        object = this.f.get(0);
                                                    }
                                                    n4 = ((D)object).b() ? 1 : 0;
                                                    if (n3 != 0) break block29;
                                                    if (n4 != 0) break block30;
                                                    n4 = ((D)this.f.get(0)).d(d11) ? 1 : 0;
                                                }
                                                if (n3 != 0) break block31;
                                                if (n4 != 0) break block32;
                                            }
                                            return net.minecraft.w.d.m;
                                        }
                                        n4 = d11.x() ? 1 : 0;
                                    }
                                    if (n3 != 0) break block33;
                                    if (n4 == 0) break block34;
                                    n4 = d11.t();
                                    if (n3 != 0) break block33;
                                    if (n4 != 1) break block34;
                                    ((D)this.f.get(0)).a(d11.C());
                                    d11.c(0);
                                    if (n3 == 0) break block24;
                                }
                                n4 = d11.G() ? 1 : 0;
                            }
                            if (n3 != 0) break block23;
                            if (n4 == 0) {
                                ((D)this.f.get(0)).a(new d(d11.w(), 1, d11.d()));
                                d11.b(1);
                            }
                        }
                        n4 = d11.G() ? 1 : 0;
                    }
                    if (n4 == 0) break block35;
                    d12.a(net.minecraft.w.d.m);
                    if (n3 == 0) break block36;
                }
                d12.f();
            }
            d d14 = d11;
            if (n3 == 0) {
                if (d14.t() == d10.t()) {
                    return net.minecraft.w.d.m;
                }
                d14 = d12.a(j2, d11);
            }
        }
        return d10;
    }

    public s(h h2, z z2) {
        this(h2, z2, net.minecraft.k.n.o);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int a() {
        d d10 = this.r.a(1);
        int n2 = net.minecraft.B.n.b();
        d d11 = d10;
        if (n2 != 0) {
            if (d11.G()) {
                return 0;
            }
            d11 = d10;
        }
        int n3 = d11.t();
        return n3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(net.minecraft.i.j j2) {
        int n2 = net.minecraft.B.n.b();
        if (this.m.d(this.o).b() != g.bH) {
            return false;
        }
        double d10 = j2.a((double)this.o.e() + 0.5, (double)this.o.b() + 0.5, (double)this.o.a() + 0.5) - 64.0;
        double d11 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
        if (n2 != 0) {
            d11 = d11 <= 0 ? 1.0 : 0.0;
        }
        return (boolean)d11;
    }
}

