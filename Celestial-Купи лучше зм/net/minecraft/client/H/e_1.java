/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet
 *  it.unimi.dsi.fastutil.objects.ObjectSet
 *  javax.annotation.Nullable
 *  org.lwjgl.input.Keyboard
 */
package net.minecraft.client.h;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.annotation.Nullable;
import net.minecraft.B.D;
import net.minecraft.ad.a;
import net.minecraft.az.r;
import net.minecraft.client.Q;
import net.minecraft.client.a.a0;
import net.minecraft.client.a.v;
import net.minecraft.client.b.L;
import net.minecraft.client.b.aq;
import net.minecraft.client.b.q;
import net.minecraft.client.b.w;
import net.minecraft.client.h.b;
import net.minecraft.client.h.g;
import net.minecraft.client.h.h;
import net.minecraft.client.h.i;
import net.minecraft.client.h.j;
import net.minecraft.client.h.k;
import net.minecraft.client.l.c;
import net.minecraft.d.o;
import net.minecraft.k.m;
import net.minecraft.w.d;
import org.lwjgl.input.Keyboard;

public class e
extends q
implements i {
    private /* synthetic */ b n;
    private final /* synthetic */ h k;
    private /* synthetic */ int j;
    private /* synthetic */ net.minecraft.B.m p;
    private /* synthetic */ aq g;
    private /* synthetic */ int h;
    private /* synthetic */ net.minecraft.l.i m;
    private final /* synthetic */ List<b> s;
    private /* synthetic */ w o;
    private /* synthetic */ Q i;
    private final /* synthetic */ net.minecraft.client.B.d l;
    private /* synthetic */ int t;
    protected static final /* synthetic */ net.minecraft.ar.v q;
    private final /* synthetic */ j u;
    private /* synthetic */ int r;
    private /* synthetic */ String a;

    /*
     * Exception decompiling
     */
    private void a(String var1_1) {
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

    private void i() {
        int n2 = (this.j - 147) / 2 - this.t - 30;
        int n3 = (this.h - 166) / 2 + 3;
        int n4 = 27;
        String[] arrstring = net.minecraft.client.h.k.d();
        int n5 = 0;
        for (b b10 : this.s) {
            block5: {
                b b11;
                block6: {
                    block4: {
                        block3: {
                            a a10 = b10.c();
                            if (arrstring == null) break block3;
                            if (a10 != net.minecraft.ad.a.b) break block4;
                            b10.l = true;
                            b10.c(n2, n3 + 27 * n5++);
                        }
                        if (arrstring != null) break block5;
                    }
                    b11 = b10;
                    if (arrstring == null) break block6;
                    if (!b11.b()) break block5;
                    b10.c(n2, n3 + 27 * n5++);
                    b11 = b10;
                }
                b11.a(this.i);
            }
            if (arrstring != null) continue;
        }
    }

    public void a(@Nullable D d10) {
        block3: {
            e e10;
            block5: {
                int n2;
                block4: {
                    D d11;
                    String[] arrstring;
                    block2: {
                        arrstring = net.minecraft.client.h.k.d();
                        d11 = d10;
                        if (arrstring == null) break block2;
                        if (d11 == null) break block3;
                        d11 = d10;
                    }
                    n2 = d11.d;
                    if (arrstring == null) break block4;
                    if (n2 > 9) break block3;
                    this.u.b();
                    e10 = this;
                    if (arrstring == null) break block5;
                    n2 = e10.d() ? 1 : 0;
                }
                if (n2 == 0) break block3;
                e10 = this;
            }
            e10.c();
        }
    }

    private static boolean lambda$func_193003_g$4(k k2) {
        String[] arrstring = net.minecraft.client.h.k.d();
        boolean bl2 = k2.c();
        if (arrstring != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public void g() {
        String[] arrstring = net.minecraft.client.h.k.d();
        boolean bl2 = this.d();
        if (arrstring != null) {
            bl2 = !bl2;
        }
        this.a(bl2);
    }

    @Override
    public void a(List<net.minecraft.az.k> list) {
        Iterator<net.minecraft.az.k> iterator = list.iterator();
        String[] arrstring = net.minecraft.client.h.k.d();
        while (iterator.hasNext()) {
            net.minecraft.az.k k2 = iterator.next();
            this.i.s.a(k2);
            if (arrstring != null) continue;
        }
    }

    public void a(int n2, int n3, float f10) {
        block5: {
            block3: {
                int n4;
                String[] arrstring;
                block4: {
                    arrstring = net.minecraft.client.h.k.d();
                    n4 = this.d();
                    if (arrstring == null) break block4;
                    if (n4 == 0) break block5;
                    a0.b();
                    v.y();
                    v.M();
                    v.b(0.0f, 0.0f, 100.0f);
                    this.i.aN().b(q);
                    v.b(1.0f, 1.0f, 1.0f, 1.0f);
                    n4 = (this.j - 147) / 2 - this.t;
                }
                int n5 = n4;
                int n6 = (this.h - 166) / 2;
                this.a(n5, n6, 1, 1, 147, 166);
                this.g.d();
                a0.a();
                for (b b10 : this.s) {
                    b10.a(this.i, n2, n3, f10);
                    if (arrstring != null) {
                        if (arrstring != null) continue;
                    }
                    break block3;
                }
                this.o.a(this.i, n2, n3, f10);
                this.k.a(n5, n6, n2, n3, f10);
            }
            v.B();
        }
    }

    private void e() {
        block3: {
            net.minecraft.client.o.j j2;
            block2: {
                String[] arrstring = net.minecraft.client.h.k.d();
                j2 = this.i.ar();
                if (arrstring == null) break block2;
                if (j2 == null) break block3;
                j2 = this.i.ar();
            }
            j2.a(new o(this.d(), this.m.b()));
        }
    }

    public void d(int n2, int n3, int n4, int n5) {
        block5: {
            e e10;
            block6: {
                block7: {
                    boolean bl2;
                    String[] arrstring;
                    block4: {
                        arrstring = net.minecraft.client.h.k.d();
                        bl2 = this.d();
                        if (arrstring == null) break block4;
                        if (!bl2) break block5;
                        this.k.a(n4, n5);
                        e10 = this;
                        if (arrstring == null) break block6;
                        bl2 = e10.o.c();
                    }
                    if (!bl2) break block7;
                    String string = net.minecraft.client.D.h.a(this.o.a() ? "gui.recipebook.toggleRecipes.craftable" : "gui.recipebook.toggleRecipes.all", new Object[0]);
                    e10 = this;
                    if (arrstring == null) break block6;
                    if (e10.i.aO != null) {
                        this.i.aO.a(string, n4, n5);
                    }
                }
                e10 = this;
            }
            e10.c(n2, n3, n4, n5);
        }
    }

    private static boolean lambda$func_193003_g$3(ObjectSet objectSet, k k2) {
        String[] arrstring = net.minecraft.client.h.k.d();
        boolean bl2 = objectSet.contains((Object)k2);
        if (arrstring != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean a(int var1_1, int var2_2, int var3_3) {
        block21: {
            block20: {
                var4_4 = net.minecraft.client.h.k.d();
                v0 = this.d();
                if (var4_4 == null) return v0;
                if (v0 == false) return false;
                v0 = this.i.s.ae();
                if (var4_4 == null) return v0;
                if (v0 != false) return false;
                v1 = this.k.a(var1_1, var2_2, var3_3, (this.j - 147) / 2 - this.t, (this.h - 166) / 2, 147, 166);
                if (var4_4 != null) {
                    if (v1 != 0) {
                        var5_5 = this.k.a();
                        var6_8 = this.k.d();
                        if (var5_5 == null) return (boolean)1;
                        v2 = var6_8;
                        if (var4_4 != null) {
                            if (v2 == null) return (boolean)1;
                            v2 = var6_8;
                        }
                        v3 = v2.b(var5_5);
                        if (var4_4 != null) {
                            if (v3 == 0) {
                                v4 = this.u;
                                if (var4_4 != null) {
                                    if (v4.c() == var5_5) {
                                        return false;
                                    } else {
                                        ** GOTO lbl-1000
                                    }
                                }
                            } else lbl-1000:
                            // 3 sources

                            {
                                v4 = this.u;
                            }
                            v4.b();
                            this.i.aW.a(this.i.s.cm.b, var5_5, L.o(), this.i.s);
                            v3 = this.f() ? 1 : 0;
                        }
                        if (var4_4 == null) return (boolean)v3;
                        if (v3 != 0) return (boolean)1;
                        v3 = var3_3;
                        if (var4_4 == null) return (boolean)v3;
                        if (v3 != 0) return (boolean)1;
                        this.a(false);
                        return (boolean)1;
                    }
                    v1 = var3_3;
                }
                if (var4_4 != null) {
                    if (v1 != 0) {
                        return false;
                    }
                    v1 = this.g.a(var1_1, var2_2, var3_3) ? 1 : 0;
                }
                if (var4_4 == null) break block20;
                if (v1 != 0) {
                    return true;
                }
                v5 = this;
                if (var4_4 == null) break block21;
                v1 = v5.o.a(this.i, var1_1, var2_2) ? 1 : 0;
            }
            if (v1 != 0) {
                v6 = this.m.b();
                if (var4_4 != null) {
                    v6 = v6 == false;
                }
                var5_6 = v6;
                this.m.a(var5_6);
                this.o.a(var5_6);
                this.o.a(this.i.p());
                this.e();
                this.b(false);
                return true;
            }
            v5 = this;
        }
        var5_7 = v5.s.iterator();
        do {
            if (var5_7.hasNext() == false) return false;
            v7 = var6_9 = var5_7.next();
            if (var4_4 != null) {
                v8 = v7.a(this.i, var1_1, var2_2);
                if (var4_4 == null) return v8;
                if (!v8) continue;
                v7 = this.n;
            }
            if (var4_4 != null) {
                if (v7 == var6_9) return true;
                var6_9.a(this.i.p());
                this.n.a(false);
                v7 = this.n = var6_9;
            }
            v7.a(true);
            this.b(true);
            return true;
        } while (var4_4 != null);
        return false;
    }

    private void b(boolean bl2) {
        e e10;
        ArrayList arrayList;
        block6: {
            boolean bl3;
            block5: {
                String[] arrstring = net.minecraft.client.h.k.d();
                List<k> list = net.minecraft.client.B.j.e.get(this.n.c());
                list.forEach(this::lambda$func_193003_g$0);
                arrayList = Lists.newArrayList(list);
                String[] arrstring2 = arrstring;
                arrayList.removeIf(e::lambda$func_193003_g$1);
                arrayList.removeIf(e::lambda$func_193003_g$2);
                String string = this.g.n();
                bl3 = string.isEmpty();
                if (arrstring2 == null) break block5;
                if (!bl3) {
                    ObjectLinkedOpenHashSet objectLinkedOpenHashSet = new ObjectLinkedOpenHashSet(this.i.a(net.minecraft.client.B.m.c).a(string.toLowerCase(Locale.ROOT)));
                    arrayList.removeIf(arg_0 -> e.lambda$func_193003_g$3((ObjectSet)objectLinkedOpenHashSet, arg_0));
                }
                e10 = this;
                if (arrstring2 == null) break block6;
                bl3 = e10.m.b();
            }
            if (bl3) {
                arrayList.removeIf(e::lambda$func_193003_g$4);
            }
            e10 = this;
        }
        e10.k.a(arrayList, bl2);
    }

    private static boolean lambda$func_193003_g$2(k k2) {
        String[] arrstring = net.minecraft.client.h.k.d();
        boolean bl2 = k2.f();
        if (arrstring != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public e() {
        this.u = new j();
        this.s = Lists.newArrayList((Object[])new b[]{new b(0, net.minecraft.ad.a.b), new b(0, net.minecraft.ad.a.d), new b(0, net.minecraft.ad.a.r), new b(0, net.minecraft.ad.a.n), new b(0, net.minecraft.ad.a.p)});
        this.a = "";
        this.k = new h();
        this.l = new net.minecraft.client.B.d();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean a(int var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6) {
        block21: {
            block20: {
                block19: {
                    block18: {
                        block17: {
                            var7_7 = net.minecraft.client.h.k.d();
                            v0 = this.d();
                            if (var7_7 != null) {
                                if (v0 == 0) {
                                    return true;
                                }
                                v0 = var1_1;
                            }
                            if (var7_7 == null) break block17;
                            if (v0 < var3_3) ** GOTO lbl-1000
                            v0 = var2_2;
                            if (var7_7 == null) break block17;
                            if (v0 < var4_4) ** GOTO lbl-1000
                            v0 = var1_1;
                            if (var7_7 != null) {
                                if (v0 < var3_3 + var5_5) {
                                    v0 = var2_2;
                                    if (var7_7 != null) {
                                        ** if (v0 < var4_4 + var6_6) goto lbl-1000
                                    } else {
                                        ** GOTO lbl20
                                    }
                                } else {
                                    ** GOTO lbl19
                                }
                            }
                            break block17;
lbl19:
                            // 2 sources

                            ** GOTO lbl-1000
lbl20:
                            // 2 sources

                            break block17;
lbl-1000:
                            // 4 sources

                            {
                                v0 = 1;
                                ** GOTO lbl24
                            }
lbl-1000:
                            // 1 sources

                            {
                                v0 = 0;
                            }
                        }
                        var8_8 = v0;
                        v1 = var3_3 - 147;
                        v2 = var1_1;
                        if (var7_7 == null) break block18;
                        if (v1 >= v2) ** GOTO lbl-1000
                        v1 = var1_1;
                        v2 = var3_3;
                    }
                    if (var7_7 == null) break block19;
                    if (v1 >= v2) ** GOTO lbl-1000
                    v1 = var4_4;
                    v2 = var2_2;
                }
                if (var7_7 == null) break block20;
                if (v1 >= v2) ** GOTO lbl-1000
                v1 = var2_2;
                if (var7_7 == null) break block21;
                v2 = var4_4 + var6_6;
            }
            ** if (v1 >= v2) goto lbl-1000
lbl-1000:
            // 1 sources

            {
                v1 = true;
                ** GOTO lbl49
            }
lbl-1000:
            // 4 sources

            {
                v1 = false;
            }
        }
        var9_9 = v1;
        v3 = var8_8;
        if (var7_7 != null) {
            if (v3 == false) return false;
            v3 = var9_9;
        }
        if (var7_7 != null) {
            if (v3 != false) return false;
            v3 = this.n.a(this.i, var1_1, var2_2);
        }
        if (var7_7 == null) return v3;
        if (v3 != false) return false;
        return true;
    }

    public boolean d() {
        return this.m.a();
    }

    public void b() {
        block3: {
            block4: {
                e e10;
                int n2;
                block2: {
                    String[] arrstring = net.minecraft.client.h.k.d();
                    n2 = this.d();
                    if (arrstring == null) break block2;
                    if (n2 == 0) break block3;
                    e10 = this;
                    if (arrstring == null) break block4;
                    n2 = e10.r;
                }
                if (n2 == this.i.s.cB.d()) break block3;
                this.c();
                e10 = this;
            }
            e10.r = this.i.s.cB.d();
        }
    }

    private void a(boolean bl2) {
        String[] arrstring = net.minecraft.client.h.k.d();
        this.m.b(bl2);
        String[] arrstring2 = arrstring;
        if (arrstring2 != null) {
            if (!bl2) {
                this.k.e();
            }
            this.e();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean a(char var1_1, int var2_2) {
        block10: {
            block11: {
                var3_3 = net.minecraft.client.h.k.d();
                v0 = this.d();
                if (var3_3 == null) return v0;
                if (v0 == false) return false;
                v0 = this.i.s.ae();
                if (var3_3 == null) return v0;
                if (v0 != false) return false;
                v1 = var2_2;
                if (var3_3 != null) {
                    if (v1) {
                        v1 = this.f();
                        if (var3_3 != null) {
                            if (!v1) {
                                this.a(false);
                                return true;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v1 = net.minecraft.client.l.c.a(this.i.ac.bI);
                    }
                }
                if (var3_3 == null) break block10;
                if (!v1) break block11;
                v1 = this.g.b();
                if (var3_3 == null) break block10;
                if (!v1) {
                    this.g.c(true);
                    if (var3_3 != null) return false;
                }
            }
            v1 = this.g.a(var1_1, var2_2);
        }
        if (var3_3 == null) return v1;
        if (v1 == false) return false;
        var4_4 = this.g.n().toLowerCase(Locale.ROOT);
        this.a(var4_4);
        v2 = var4_4.equals(this.a);
        if (var3_3 == null) return v2;
        if (v2 != false) return true;
        this.b(false);
        this.a = var4_4;
        return true;
    }

    public void a(boolean n2, net.minecraft.B.m m2) {
        block1: {
            String[] arrstring = net.minecraft.client.h.k.d();
            int n3 = n2;
            if (arrstring != null) {
                n3 = n3 != 0 ? 0 : 86;
            }
            this.t = n3;
            int n4 = (this.j - 147) / 2 - this.t;
            int n5 = (this.h - 166) / 2;
            this.l.d();
            this.i.s.cB.a(this.l, false);
            m2.a(this.l);
            this.g = new aq(0, this.i.a6, n4 + 25, n5 + 14, 80, this.i.a6.p + 5);
            this.g.b(50);
            this.g.d(false);
            this.g.e(true);
            this.g.c(0xFFFFFF);
            this.k.a(this.i, n4, n5);
            this.k.a(this);
            this.o = new w(0, n4 + 110, n5 + 12, 26, 16, this.m.b());
            this.o.a(152, 41, 28, 18, q);
            this.b(false);
            this.i();
            if (!net.minecraft.k.m.c()) break block1;
            net.minecraft.client.h.k.b(new String[1]);
        }
    }

    public void a(net.minecraft.az.k k2, List<D> list) {
        String[] arrstring = net.minecraft.client.h.k.d();
        d d10 = k2.d();
        this.u.a(k2);
        String[] arrstring2 = arrstring;
        this.u.a(net.minecraft.az.r.a(d10), list.get((int)0).a, list.get((int)0).b);
        int n2 = this.p.d();
        int n3 = this.p.b();
        int n4 = k2 instanceof net.minecraft.az.i;
        if (arrstring2 != null) {
            n4 = n4 != 0 ? ((net.minecraft.az.i)k2).c() : n2;
        }
        int n5 = n4;
        int n6 = 1;
        Iterator iterator = k2.c().iterator();
        for (int i2 = 0; i2 < n3; ++i2) {
            int n7;
            block9: {
                int n8 = 0;
                while (n8 < n5) {
                    Iterator iterator2 = iterator;
                    if (arrstring2 != null) {
                        n7 = iterator2.hasNext() ? 1 : 0;
                        if (arrstring2 == null) break block9;
                        if (n7 == 0) {
                            return;
                        }
                        iterator2 = iterator.next();
                    }
                    r r2 = (r)((Object)iterator2);
                    if (arrstring2 != null) {
                        if (r2 != net.minecraft.az.r.a) {
                            D d11 = list.get(n6);
                            this.u.a(r2, d11.a, d11.b);
                        }
                        ++n6;
                        ++n8;
                    }
                    if (arrstring2 != null) continue;
                }
                n7 = n5;
            }
            int n9 = n2;
            if (arrstring2 != null) {
                if (n7 >= n9) continue;
                n7 = n6;
                n9 = n2 - n5;
            }
            n6 = n7 + n9;
            if (arrstring2 != null) continue;
        }
    }

    public void a() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    static {
        q = new net.minecraft.ar.v("textures/gui/recipe_book.png");
    }

    public void h() {
        block3: {
            e e10;
            block2: {
                String[] arrstring = net.minecraft.client.h.k.d();
                this.i();
                String[] arrstring2 = arrstring;
                e10 = this;
                if (arrstring2 == null) break block2;
                if (!e10.d()) break block3;
                e10 = this;
            }
            e10.b(false);
        }
    }

    public void a(int n2, int n3, boolean bl2, float f10) {
        this.u.a(this.i, n2, n3, bl2, f10);
    }

    private void lambda$func_193003_g$0(k k2) {
        k2.a(this.l, this.p.d(), this.p.b(), this.m);
    }

    private boolean f() {
        String[] arrstring = net.minecraft.client.h.k.d();
        boolean bl2 = this.t;
        if (arrstring != null) {
            bl2 = bl2;
        }
        return bl2;
    }

    public int a(boolean bl2, int n2, int n3) {
        int n4;
        block4: {
            int n5;
            block2: {
                block3: {
                    String[] arrstring = net.minecraft.client.h.k.d();
                    n5 = this.d();
                    if (arrstring == null) break block2;
                    if (n5 == 0) break block3;
                    n5 = bl2;
                    if (arrstring == null) break block2;
                    if (n5 != 0) break block3;
                    n4 = 177 + (n2 - n3 - 200) / 2;
                    if (arrstring != null) break block4;
                }
                n5 = (n2 - n3) / 2;
            }
            n4 = n5;
        }
        return n4;
    }

    public void a(int n2, int n3, Q q2, boolean bl2, net.minecraft.B.m m2) {
        this.i = q2;
        this.j = n2;
        this.h = n3;
        this.p = m2;
        this.m = q2.s.G();
        this.r = q2.s.cB.d();
        this.n = this.s.get(0);
        String[] arrstring = net.minecraft.client.h.k.d();
        this.n.a(true);
        boolean bl3 = this.d();
        if (arrstring != null) {
            if (bl3) {
                this.a(bl2, m2);
            }
            bl3 = true;
        }
        Keyboard.enableRepeatEvents((boolean)bl3);
    }

    private static boolean lambda$func_193003_g$1(k k2) {
        String[] arrstring = net.minecraft.client.h.k.d();
        boolean bl2 = k2.e();
        if (arrstring != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private void c(int n2, int n3, int n4, int n5) {
        block8: {
            L l2;
            d d10;
            block13: {
                d10 = null;
                String[] arrstring = net.minecraft.client.h.k.d();
                int n6 = 0;
                while (n6 < this.u.a()) {
                    block9: {
                        block10: {
                            int n7;
                            int n8;
                            g g10;
                            block12: {
                                int n9;
                                block11: {
                                    g10 = this.u.a(n6);
                                    int n10 = g10.b() + n2;
                                    n9 = g10.a() + n3;
                                    if (arrstring == null) break block8;
                                    if (arrstring == null) break block9;
                                    if (n4 < n10) break block10;
                                    n8 = n5;
                                    n7 = n9;
                                    if (arrstring == null) break block11;
                                    if (n8 < n7) break block10;
                                    n8 = n4;
                                    n7 = n10 + 16;
                                }
                                if (arrstring == null) break block12;
                                if (n8 >= n7) break block10;
                                n8 = n5;
                                n7 = n9 + 16;
                            }
                            if (n8 < n7) {
                                d10 = g10.c();
                            }
                        }
                        ++n6;
                    }
                    if (arrstring != null) continue;
                }
                if (d10 == null) break block8;
                l2 = this.i.aO;
                if (arrstring == null) break block13;
                if (l2 == null) break block8;
                l2 = this.i.aO;
            }
            l2.a(this.i.aO.a(d10), n4, n5);
        }
    }

    private void c() {
        this.l.d();
        this.i.s.cB.a(this.l, false);
        this.p.a(this.l);
        this.b(false);
    }
}

