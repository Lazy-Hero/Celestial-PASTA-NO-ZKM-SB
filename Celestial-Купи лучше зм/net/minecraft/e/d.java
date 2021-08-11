/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 */
package net.minecraft.e;

import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.HashSet;
import javax.annotation.Nullable;
import net.minecraft.U.C;
import net.minecraft.W.K;
import net.minecraft.W.aB;
import net.minecraft.W.bA;
import net.minecraft.W.bG;
import net.minecraft.W.bp;
import net.minecraft.W.ch;
import net.minecraft.ac.c;
import net.minecraft.ah.t;
import net.minecraft.ar.aA;
import net.minecraft.e.a;
import net.minecraft.e.b;
import net.minecraft.e.f;
import net.minecraft.e.i;
import net.minecraft.k.h;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.k.p;
import net.minecraft.u.g;

public class d
extends b {
    protected /* synthetic */ float j;

    @Override
    public f a(double d10, double d11, double d12) {
        return this.a(net.minecraft.k.h.f(d10), net.minecraft.k.h.f(d11), net.minecraft.k.h.f(d12));
    }

    /*
     * Exception decompiling
     */
    @Override
    public int a(f[] var1_1, f var2_2, f var3_3, float var4_4) {
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
    public void a(t t2, C c10) {
        super.a(t2, c10);
        this.j = c10.a(net.minecraft.e.a.WATER);
    }

    @Override
    public f b() {
        d d10;
        n n2;
        int n3;
        block17: {
            block23: {
                Object object;
                int n4;
                block20: {
                    int n5;
                    block16: {
                        block22: {
                            block21: {
                                int n6;
                                block18: {
                                    block19: {
                                        n4 = net.minecraft.e.i.g();
                                        n6 = this.c();
                                        if (n4 != 0) break block18;
                                        if (n6 == 0) break block19;
                                        n6 = this.i.aj();
                                        if (n4 != 0) break block18;
                                        if (n6 == 0) break block19;
                                        n3 = (int)this.i.m().b;
                                        n2 = new o(net.minecraft.k.h.f(this.i.a), n3, net.minecraft.k.h.f(this.i.ax));
                                        object = this.f.d(n2).b();
                                        do {
                                            Object object2;
                                            if (object != net.minecraft.u.g.cL) {
                                                object2 = object;
                                                if (n4 != 0 || n4 != 0) continue;
                                                if (object2 != net.minecraft.u.g.bQ) break;
                                            }
                                            ((o)n2).a(net.minecraft.k.h.f(this.i.a), ++n3, net.minecraft.k.h.f(this.i.ax));
                                            object2 = object = this.f.d(n2).b();
                                        } while (n4 == 0);
                                        if (n4 == 0) break block20;
                                    }
                                    n6 = this.i.A;
                                }
                                if (n4 != 0) break block21;
                                if (n6 == 0) break block22;
                                n6 = n3 = net.minecraft.k.h.f(this.i.m().b + 0.5);
                            }
                            if (n4 == 0) break block20;
                        }
                        n2 = new n(this.i);
                        do {
                            if (this.f.d(n2).o() != net.minecraft.ac.c.A) {
                                n5 = this.f.d(n2).b().a(this.f, n2) ? 1 : 0;
                                if (n4 == 0) {
                                    if (n4 == 0) {
                                        if (n5 == 0) break;
                                    }
                                    break block16;
                                }
                            } else {
                                n5 = n2.b();
                            }
                            if (n4 != 0) break block16;
                            if (n5 <= 0) break;
                            n2 = n2.k();
                        } while (n4 == 0);
                        n5 = n2.a().b();
                    }
                    n3 = n5;
                }
                n2 = new n(this.i);
                object = this.a(this.i, n2.e(), n3, n2.a());
                d10 = this;
                if (n4 != 0) break block17;
                if (!(d10.i.a((a)((Object)object)) < 0.0f)) break block23;
                HashSet hashSet = Sets.newHashSet();
                hashSet.add(new n(this.i.m().e, (double)n3, this.i.m().d));
                hashSet.add(new n(this.i.m().e, (double)n3, this.i.m().g));
                hashSet.add(new n(this.i.m().f, (double)n3, this.i.m().d));
                hashSet.add(new n(this.i.m().f, (double)n3, this.i.m().g));
                for (n n7 : hashSet) {
                    block25: {
                        d d11;
                        block24: {
                            a a10 = this.a(this.i, n7);
                            d10 = this;
                            if (n4 != 0) break block17;
                            if (n4 != 0) break block24;
                            if (!(d10.i.a(a10) >= 0.0f)) break block25;
                            d11 = this;
                        }
                        return d11.a(n7.e(), n7.b(), n7.a());
                    }
                    if (n4 == 0) continue;
                }
            }
            d10 = this;
        }
        return d10.a(n2.e(), n3, n2.a());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    private f a(int n2, int n3, int n4, int n5, double d10, aA aA2) {
        float f10;
        a a10;
        a a11;
        double d11;
        float f11;
        a a12;
        int n6;
        f f12;
        block20: {
            block19: {
                float f13;
                n n7;
                block24: {
                    float f14;
                    block23: {
                        block22: {
                            f f15;
                            block21: {
                                f12 = null;
                                n6 = net.minecraft.e.i.n();
                                n7 = new n(n2, n3, n4);
                                n n8 = n7.k();
                                double d12 = (double)n3 - (1.0 - this.f.d((n)n8).f((t)this.f, (n)n8).a);
                                if (d12 - d10 > 1.125) {
                                    return null;
                                }
                                a12 = this.a(this.i, n2, n3, n4);
                                f11 = this.i.a(a12);
                                d11 = (double)this.i.ad / 2.0;
                                if (f11 >= 0.0f) {
                                    f12 = this.a(n2, n3, n4);
                                    f12.b = a12;
                                    f12.e = Math.max(f12.e, f11);
                                }
                                if (a12 == net.minecraft.e.a.WALKABLE) {
                                    return f12;
                                }
                                if (f12 != null || n5 <= 0) break block19;
                                a11 = a12;
                                a10 = net.minecraft.e.a.FENCE;
                                if (n6 == 0) break block20;
                                if (a11 == a10) break block19;
                                a11 = a12;
                                a10 = net.minecraft.e.a.TRAPDOOR;
                                if (n6 == 0) break block20;
                                if (a11 == a10) break block19;
                                f15 = f12 = this.a(n2, n3 + 1, n4, n5 - 1, d10, aA2);
                                if (n6 == 0) break block21;
                                if (f15 == null) break block19;
                                f15 = f12;
                            }
                            a11 = f15.b;
                            a10 = net.minecraft.e.a.OPEN;
                            if (n6 == 0) break block22;
                            if (a11 == a10) break block23;
                            a11 = f12.b;
                            a10 = net.minecraft.e.a.WALKABLE;
                        }
                        if (n6 == 0) break block20;
                        if (a11 != a10) break block19;
                    }
                    f13 = (f14 = this.i.ad - 1.0f) == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                    if (n6 == 0) break block24;
                    if (f13 >= 0) break block19;
                    f13 = n2 - aA2.r();
                }
                double d13 = (double)f13 + 0.5;
                double d14 = (double)(n4 - aA2.i()) + 0.5;
                k k2 = new k(d13 - d11, (double)n3 + 0.001, d14 - d11, d13 + d11, (float)n3 + this.i.aD, d14 + d11);
                k k3 = this.f.d(n7).f(this.f, n7);
                k k4 = k2.d(0.0, k3.a - 0.002, 0.0);
                if (this.i.aG.d(k4)) {
                    f12 = null;
                }
            }
            a11 = a12;
            a10 = net.minecraft.e.a.OPEN;
        }
        if (a11 != a10) return f12;
        k k5 = new k((double)n2 - d11 + 0.5, (double)n3 + 0.001, (double)n4 - d11 + 0.5, (double)n2 + d11 + 0.5, (float)n3 + this.i.aD, (double)n4 + d11 + 0.5);
        int n9 = this.i.aG.d(k5);
        if (n6 != 0) {
            if (n9 != 0) {
                return null;
            }
            float f16 = this.i.ad - 1.0f;
            n9 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
        }
        if (n6 != 0) {
            if (n9 >= 0) {
                a a13 = this.a(this.i, n2, n3 - 1, n4);
                if (n6 == 0) return f12;
                if (a13 == net.minecraft.e.a.BLOCKED) {
                    f12 = this.a(n2, n3, n4);
                    f12.b = net.minecraft.e.a.WALKABLE;
                    f12.e = Math.max(f12.e, f11);
                    return f12;
                }
            }
            n9 = 0;
        }
        int n10 = n9;
        do {
            float f17;
            float f18;
            block26: {
                block25: {
                    if (n3 <= 0) return f12;
                    if (a12 != net.minecraft.e.a.OPEN) return f12;
                    --n3;
                    if (n6 == 0) break block25;
                    if (n10++ >= this.i.au()) {
                        return null;
                    }
                    a12 = this.a(this.i, n2, n3, n4);
                    f18 = this.i.a(a12);
                    if (n6 == 0) break block26;
                    f11 = f18;
                }
                if (a12 != net.minecraft.e.a.OPEN) {
                    float f19 = f11 - 0.0f;
                    f10 = f19 == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
                    if (n6 == 0) continue;
                    if (f10 >= 0) {
                        f12 = this.a(n2, n3, n4);
                        f12.b = a12;
                        f12.e = Math.max(f12.e, f11);
                        if (n6 != 0) return f12;
                    }
                }
                f18 = f11;
            }
            f10 = (f17 = f18 - 0.0f) == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
        } while (f10 >= 0);
        f f20 = null;
        if (n6 == 0) return f20;
        return f20;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected a b(t var1_1, int var2_2, int var3_3, int var4_4) {
        block40: {
            block39: {
                block38: {
                    block37: {
                        var6_5 = new n(var2_2, var3_3, var4_4);
                        var7_6 = var1_1.d(var6_5);
                        var5_7 = net.minecraft.e.i.g();
                        var8_8 = var7_6.b();
                        var9_9 = var7_6.o();
                        if (var9_9 == net.minecraft.ac.c.A) {
                            return net.minecraft.e.a.OPEN;
                        }
                        v0 = var8_8;
                        v1 = net.minecraft.u.g.cI;
                        if (var5_7 == 0) {
                            if (v0 == v1) return net.minecraft.e.a.TRAPDOOR;
                            v0 = var8_8;
                            v1 = net.minecraft.u.g.bV;
                        }
                        if (var5_7 != 0) break block37;
                        if (v0 == v1) return net.minecraft.e.a.TRAPDOOR;
                        v0 = var8_8;
                        if (var5_7 != 0) break block38;
                        v1 = net.minecraft.u.g.c_;
                    }
                    if (v0 == v1) return net.minecraft.e.a.TRAPDOOR;
                    v0 = var8_8;
                }
                if (var5_7 == 0) {
                    if (v0 == net.minecraft.u.g.C) {
                        return net.minecraft.e.a.DAMAGE_FIRE;
                    }
                    v0 = var8_8;
                }
                if (var5_7 == 0) {
                    if (v0 == net.minecraft.u.g.aA) {
                        return net.minecraft.e.a.DAMAGE_CACTUS;
                    }
                    v0 = var8_8;
                }
                v2 = v0 instanceof aB;
                if (var5_7 == 0) {
                    if (v2 && var9_9 == net.minecraft.ac.c.k) {
                        v2 = var7_6.b(aB.E);
                        if (var5_7 == 0) {
                            if (!v2) {
                                return net.minecraft.e.a.DOOR_WOOD_CLOSED;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v2 = var8_8 instanceof aB;
                    }
                }
                if (var5_7 == 0) {
                    if (v2 && var9_9 == net.minecraft.ac.c.D) {
                        v2 = var7_6.b(aB.E);
                        if (var5_7 == 0) {
                            if (!v2) {
                                return net.minecraft.e.a.DOOR_IRON_CLOSED;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v2 = var8_8 instanceof aB;
                    }
                }
                if (var5_7 == 0) {
                    if (v2) {
                        v2 = var7_6.b(aB.E);
                        if (var5_7 == 0) {
                            if (v2) {
                                return net.minecraft.e.a.DOOR_OPEN;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v2 = var8_8 instanceof bp;
                    }
                }
                if (var5_7 == 0) {
                    if (v2) {
                        return net.minecraft.e.a.RAIL;
                    }
                    v2 = var8_8 instanceof bA;
                }
                if (var5_7 == 0) {
                    if (v2 != false) return net.minecraft.e.a.FENCE;
                    v2 = var8_8 instanceof ch;
                }
                if (var5_7 == 0) {
                    if (v2 != false) return net.minecraft.e.a.FENCE;
                    v2 = var8_8 instanceof bG;
                }
                if (var5_7 != 0) break block39;
                if (!v2) break block40;
                v2 = var7_6.b(bG.C);
            }
            if (v2 == false) return net.minecraft.e.a.FENCE;
        }
        v3 = var9_9;
        v4 = net.minecraft.ac.c.L;
        if (var5_7 == 0) {
            if (v3 == v4) {
                return net.minecraft.e.a.WATER;
            }
            v3 = var9_9;
            v4 = net.minecraft.ac.c.g;
        }
        if (v3 == v4) {
            return net.minecraft.e.a.LAVA;
        }
        if (var8_8.a(var1_1, var6_5)) {
            v5 = net.minecraft.e.a.OPEN;
            return v5;
        }
        v5 = net.minecraft.e.a.BLOCKED;
        return v5;
    }

    private a a(C c10, n n2) {
        return this.a(c10, n2.e(), n2.b(), n2.a());
    }

    public a a(t t2, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2, boolean bl3, EnumSet<a> enumSet, a a10, n n8) {
        a a11;
        block17: {
            int n9 = 0;
            int n10 = net.minecraft.e.i.g();
            block0: while (true) {
                int n11 = n9;
                block1: while (n11 < n5) {
                    for (int i2 = 0; i2 < n6; ++i2) {
                        n11 = 0;
                        if (n10 != 0) continue block1;
                        for (int i3 = v1604638; i3 < n7; ++i3) {
                            int n12;
                            a a12;
                            block22: {
                                block21: {
                                    a a13;
                                    a a14;
                                    block18: {
                                        block19: {
                                            boolean bl4;
                                            block20: {
                                                int n13 = n9 + n2;
                                                int n14 = i2 + n3;
                                                int n15 = i3 + n4;
                                                a11 = a12 = this.a(t2, n13, n14, n15);
                                                if (n10 != 0) break block17;
                                                a14 = net.minecraft.e.a.DOOR_WOOD_CLOSED;
                                                if (n10 != 0) break block18;
                                                if (a11 != a14) break block19;
                                                bl4 = bl2;
                                                if (n10 != 0) break block20;
                                                if (!bl4) break block19;
                                                bl4 = bl3;
                                            }
                                            if (bl4) {
                                                a12 = net.minecraft.e.a.WALKABLE;
                                            }
                                        }
                                        a13 = a12;
                                        a14 = net.minecraft.e.a.DOOR_OPEN;
                                    }
                                    if (n10 == 0) {
                                        if (a13 == a14 && !bl3) {
                                            a12 = net.minecraft.e.a.BLOCKED;
                                        }
                                        a13 = a12;
                                        a14 = net.minecraft.e.a.RAIL;
                                    }
                                    if (a13 != a14) break block21;
                                    n12 = t2.d(n8).b() instanceof bp;
                                    if (n10 != 0) break block22;
                                    if (n12 != 0) break block21;
                                    n12 = t2.d(n8.k()).b() instanceof bp;
                                    if (n10 != 0) break block22;
                                    if (n12 == 0) {
                                        a12 = net.minecraft.e.a.FENCE;
                                    }
                                }
                                n12 = n9;
                            }
                            if (n10 != 0) continue;
                            if (n12 == 0) {
                                n12 = i2;
                                if (n10 != 0) continue;
                                if (n12 == 0) {
                                    n12 = i3;
                                    if (n10 != 0) continue;
                                    if (n12 == 0) {
                                        a10 = a12;
                                    }
                                }
                            }
                            n12 = enumSet.add(a12) ? 1 : 0;
                            if (n10 == 0) continue;
                        }
                        if (n10 == 0) continue;
                    }
                    ++n9;
                    if (n10 == 0) continue block0;
                }
                break;
            }
            a11 = a10;
        }
        return a11;
    }

    @Override
    public a a(t t2, int n2, int n3, int n4, C c10, int n5, int n6, int n7, boolean bl2, boolean bl3) {
        a a10;
        block13: {
            a a11;
            block14: {
                float f10;
                block12: {
                    EnumSet<a> enumSet = EnumSet.noneOf(a.class);
                    a a12 = net.minecraft.e.a.BLOCKED;
                    double d10 = (double)c10.ad / 2.0;
                    int n8 = net.minecraft.e.i.g();
                    n n9 = new n(c10);
                    a a13 = this.a(t2, n2, n3, n4, n5, n6, n7, bl2, bl3, enumSet, a12, n9);
                    if (n8 == 0) {
                        a12 = a13;
                        if (enumSet.contains((Object)net.minecraft.e.a.FENCE)) {
                            return net.minecraft.e.a.FENCE;
                        }
                        a13 = net.minecraft.e.a.BLOCKED;
                    }
                    a11 = a13;
                    for (a a14 : enumSet) {
                        float f11 = c10.a(a14) - 0.0f;
                        f10 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                        if (n8 == 0) {
                            float f12;
                            if (n8 == 0) {
                                if (f10 < 0) {
                                    return a14;
                                }
                                float f13 = c10.a(a14) - c10.a(a11);
                                f12 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                            }
                            if (f12 >= 0) {
                                a11 = a14;
                            }
                            if (n8 == 0) continue;
                        }
                        break block12;
                    }
                    a10 = a12;
                    if (n8 != 0) break block13;
                    if (a10 != net.minecraft.e.a.OPEN) break block14;
                    float f14 = c10.a(a11) - 0.0f;
                    f10 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                }
                if (f10 == false) {
                    return net.minecraft.e.a.OPEN;
                }
            }
            a10 = a11;
        }
        return a10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public a a(t var1_1, int var2_2, int var3_3, int var4_4) {
        block9: {
            block15: {
                block14: {
                    block13: {
                        block12: {
                            block11: {
                                block10: {
                                    var6_5 = this.b(var1_1, var2_2, var3_3, var4_4);
                                    var5_6 = net.minecraft.e.i.n();
                                    v0 = var6_5;
                                    if (var5_6 == 0) return v0;
                                    if (v0 != net.minecraft.e.a.OPEN || var3_3 < 1) break block9;
                                    var7_7 = var1_1.d(new n(var2_2, var3_3 - 1, var4_4)).b();
                                    v1 = var8_8 = this.b(var1_1, var2_2, var3_3 - 1, var4_4);
                                    v2 = net.minecraft.e.a.WALKABLE;
                                    if (var5_6 == 0) break block10;
                                    if (v1 == v2) ** GOTO lbl-1000
                                    v1 = var8_8;
                                    v2 = net.minecraft.e.a.OPEN;
                                }
                                if (var5_6 == 0) break block11;
                                if (v1 == v2) ** GOTO lbl-1000
                                v1 = var8_8;
                                v2 = net.minecraft.e.a.WATER;
                            }
                            if (var5_6 == 0) break block12;
                            if (v1 == v2) ** GOTO lbl-1000
                            v1 = var8_8;
                            if (var5_6 == 0) break block13;
                            v2 = net.minecraft.e.a.LAVA;
                        }
                        ** if (v1 == v2) goto lbl-1000
lbl-1000:
                        // 1 sources

                        {
                            v1 = net.minecraft.e.a.WALKABLE;
                            ** GOTO lbl30
                        }
lbl-1000:
                        // 4 sources

                        {
                            v1 = net.minecraft.e.a.OPEN;
                        }
                    }
                    var6_5 = v1;
                    v3 = var8_8;
                    if (var5_6 == 0) break block14;
                    if (v3 != net.minecraft.e.a.DAMAGE_FIRE && var7_7 != net.minecraft.u.g.bR) break block15;
                    v3 = net.minecraft.e.a.DAMAGE_FIRE;
                }
                var6_5 = v3;
            }
            v0 = var8_8;
            if (var5_6 == 0) return v0;
            if (v0 == net.minecraft.e.a.DAMAGE_CACTUS) {
                var6_5 = net.minecraft.e.a.DAMAGE_CACTUS;
            }
        }
        v0 = var6_5 = this.a(var1_1, var2_2, var3_3, var4_4, var6_5);
        return v0;
    }

    private static gP c(gP gP2) {
        return gP2;
    }

    private a a(C c10, int n2, int n3, int n4) {
        return this.a(this.f, n2, n3, n4, c10, this.d, this.c, this.h, this.e(), this.d());
    }

    @Override
    public void a() {
        this.i.a(net.minecraft.e.a.WATER, this.j);
        super.a();
    }

    public a a(t t2, int n2, int n3, int n4, a a10) {
        a a11;
        block9: {
            block8: {
                p p2;
                block10: {
                    p2 = p.a();
                    int n5 = net.minecraft.e.i.n();
                    a11 = a10;
                    if (n5 == 0) break block9;
                    if (a11 != net.minecraft.e.a.WALKABLE) break block10;
                    int n6 = -1;
                    block0: while (true) {
                        int n7 = n6;
                        block1: while (n7 <= 1) {
                            if (n5 == 0) break block8;
                            for (int i2 = -1; i2 <= 1; ++i2) {
                                K k2;
                                block12: {
                                    int n8;
                                    block11: {
                                        n7 = n6;
                                        if (n5 == 0) continue block1;
                                        if (n5 == 0) break block11;
                                        if (n7 != 0) break block12;
                                        n8 = i2;
                                    }
                                    if (n8 == false) continue;
                                }
                                K k3 = k2 = t2.d(p2.a(n6 + n2, n3, i2 + n4)).b();
                                if (n5 != 0) {
                                    if (k3 == net.minecraft.u.g.aA) {
                                        a10 = net.minecraft.e.a.DANGER_CACTUS;
                                        if (n5 != 0) continue;
                                    }
                                    k3 = k2;
                                }
                                if (k3 != net.minecraft.u.g.C) continue;
                                a10 = net.minecraft.e.a.DANGER_FIRE;
                                if (n5 != 0) continue;
                            }
                            ++n6;
                            if (n5 != 0) continue block0;
                        }
                        break;
                    }
                }
                p2.b();
            }
            a11 = a10;
        }
        return a11;
    }
}

