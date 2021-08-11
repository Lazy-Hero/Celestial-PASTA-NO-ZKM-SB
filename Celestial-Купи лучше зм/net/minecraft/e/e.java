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
import net.minecraft.ah.t;
import net.minecraft.e.a;
import net.minecraft.e.d;
import net.minecraft.e.f;
import net.minecraft.e.i;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.u.g;

public class e
extends d {
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
                    int n8 = net.minecraft.e.i.n();
                    n n9 = new n(c10);
                    a a13 = this.a(t2, n2, n3, n4, n5, n6, n7, bl2, bl3, enumSet, a12, n9);
                    if (n8 != 0) {
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
                        if (n8 != 0) {
                            float f12;
                            if (n8 != 0) {
                                if (f10 < 0) {
                                    return a14;
                                }
                                float f13 = c10.a(a14) - c10.a(a11);
                                f12 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                            }
                            if (f12 >= 0) {
                                a11 = a14;
                            }
                            if (n8 != 0) continue;
                        }
                        break block12;
                    }
                    a10 = a12;
                    if (n8 == 0) break block13;
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
        block8: {
            block9: {
                block10: {
                    block15: {
                        block14: {
                            block13: {
                                block11: {
                                    block12: {
                                        var6_5 = this.b(var1_1, var2_2, var3_3, var4_4);
                                        var5_6 = net.minecraft.e.i.g();
                                        v0 = var6_5;
                                        if (var5_6 != 0) return v0;
                                        if (v0 != net.minecraft.e.a.OPEN || var3_3 < 1) break block8;
                                        var7_7 = var1_1.d(new n(var2_2, var3_3 - 1, var4_4)).b();
                                        v1 = var8_8 = this.b(var1_1, var2_2, var3_3 - 1, var4_4);
                                        if (var5_6 != 0) break block9;
                                        if (v1 == net.minecraft.e.a.DAMAGE_FIRE || var7_7 == net.minecraft.u.g.bR) break block10;
                                        v1 = var8_8;
                                        if (var5_6 != 0) break block9;
                                        if (v1 == net.minecraft.e.a.LAVA) break block10;
                                        v2 = var8_8;
                                        v3 = net.minecraft.e.a.DAMAGE_CACTUS;
                                        if (var5_6 != 0) break block11;
                                        if (v2 != v3) break block12;
                                        var6_5 = net.minecraft.e.a.DAMAGE_CACTUS;
                                        if (var5_6 == 0) break block8;
                                    }
                                    v2 = var8_8;
                                    v3 = net.minecraft.e.a.WALKABLE;
                                }
                                if (var5_6 != 0) break block13;
                                if (v2 == v3) ** GOTO lbl-1000
                                v2 = var8_8;
                                v3 = net.minecraft.e.a.OPEN;
                            }
                            if (var5_6 != 0) break block14;
                            if (v2 == v3) ** GOTO lbl-1000
                            v2 = var8_8;
                            if (var5_6 != 0) break block15;
                            v3 = net.minecraft.e.a.WATER;
                        }
                        ** if (v2 == v3) goto lbl-1000
lbl-1000:
                        // 1 sources

                        {
                            v2 = net.minecraft.e.a.WALKABLE;
                            ** GOTO lbl39
                        }
lbl-1000:
                        // 3 sources

                        {
                            v2 = var6_5 = net.minecraft.e.a.OPEN;
                        }
                    }
                    if (var5_6 == 0) break block8;
                }
                v1 = net.minecraft.e.a.DAMAGE_FIRE;
            }
            var6_5 = v1;
        }
        v0 = var6_5 = this.a(var1_1, var2_2, var3_3, var4_4, var6_5);
        return v0;
    }

    private a b(C c10, int n2, int n3, int n4) {
        return this.a(this.f, n2, n3, n4, c10, this.d, this.c, this.h, this.e(), this.d());
    }

    @Override
    public void a(t t2, C c10) {
        super.a(t2, c10);
        this.j = c10.a(net.minecraft.e.a.WATER);
    }

    private a b(C c10, n n2) {
        return this.b(c10, n2.e(), n2.b(), n2.a());
    }

    @Override
    public void a() {
        this.i.a(net.minecraft.e.a.WATER, this.j);
        super.a();
    }

    @Override
    public f a(double d10, double d11, double d12) {
        return super.a(net.minecraft.k.h.f(d10), net.minecraft.k.h.f(d11), net.minecraft.k.h.f(d12));
    }

    @Override
    public f b() {
        e e10;
        n n2;
        int n3;
        block9: {
            block13: {
                Object object;
                int n4;
                block12: {
                    int n5;
                    block10: {
                        block11: {
                            n4 = net.minecraft.e.i.g();
                            n5 = this.c();
                            if (n4 != 0) break block10;
                            if (n5 == 0) break block11;
                            n5 = this.i.aj();
                            if (n4 != 0) break block10;
                            if (n5 == 0) break block11;
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
                            if (n4 == 0) break block12;
                        }
                        n5 = net.minecraft.k.h.f(this.i.m().b + 0.5);
                    }
                    n3 = n5;
                }
                n2 = new n(this.i);
                object = this.b(this.i, n2.e(), n3, n2.a());
                e10 = this;
                if (n4 != 0) break block9;
                if (!(e10.i.a((a)((Object)object)) < 0.0f)) break block13;
                HashSet hashSet = Sets.newHashSet();
                hashSet.add(new n(this.i.m().e, (double)n3, this.i.m().d));
                hashSet.add(new n(this.i.m().e, (double)n3, this.i.m().g));
                hashSet.add(new n(this.i.m().f, (double)n3, this.i.m().d));
                hashSet.add(new n(this.i.m().f, (double)n3, this.i.m().g));
                for (n n6 : hashSet) {
                    block15: {
                        e e11;
                        block14: {
                            a a10 = this.b(this.i, n6);
                            e10 = this;
                            if (n4 != 0) break block9;
                            if (n4 != 0) break block14;
                            if (!(e10.i.a(a10) >= 0.0f)) break block15;
                            e11 = this;
                        }
                        return super.a(n6.e(), n6.b(), n6.a());
                    }
                    if (n4 == 0) continue;
                }
            }
            e10 = this;
        }
        return super.a(n2.e(), n3, n2.a());
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

    /*
     * Enabled aggressive block sorting
     */
    @Override
    @Nullable
    protected f a(int n2, int n3, int n4) {
        f f10;
        f f11;
        block11: {
            a a10;
            a a11;
            block10: {
                int n5;
                a a12;
                block9: {
                    block8: {
                        f11 = null;
                        a12 = this.b(this.i, n2, n3, n4);
                        float f12 = this.i.a(a12);
                        n5 = net.minecraft.e.i.g();
                        if (!(f12 >= 0.0f)) break block8;
                        f11 = super.a(n2, n3, n4);
                        f11.b = a12;
                        f11.e = Math.max(f11.e, f12);
                        a11 = a12;
                        a10 = net.minecraft.e.a.WALKABLE;
                        if (n5 != 0) break block9;
                        if (a11 == a10) {
                            f11.e += 1.0f;
                        }
                    }
                    a11 = a12;
                    a10 = net.minecraft.e.a.OPEN;
                }
                if (n5 != 0) break block10;
                if (a11 == a10) break block11;
                a11 = a12;
                a10 = net.minecraft.e.a.WALKABLE;
            }
            if (a11 != a10) {
                f10 = f11;
                return f10;
            }
        }
        f10 = f11;
        return f10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

