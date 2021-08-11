/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.realmsclient.gui.ChatFormatting
 */
import com.mojang.realmsclient.gui.ChatFormatting;
import java.awt.Color;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.ToDoubleFunction;
import net.minecraft.K.b;
import net.minecraft.K.j;
import net.minecraft.U.E;
import net.minecraft.client.D.h;
import net.minecraft.client.Q;
import net.minecraft.client.a.v;
import net.minecraft.client.b.M;
import net.minecraft.client.b.l;
import net.minecraft.client.b.q;
import net.minecraft.k.m;

public class bk
extends bE {
    public /* synthetic */ ef o;
    public static /* synthetic */ float p;
    public static /* synthetic */ float n;
    public static /* synthetic */ String k;
    /* synthetic */ l q;
    /* synthetic */ float l;

    /*
     * Exception decompiling
     */
    public static void a(l var0) {
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

    public bk() {
        super("HUD", a5.Hud);
        this.o = new ef();
        this.l = 0.0f;
        this.q = new l(c);
    }

    private int c() {
        return 1;
    }

    static {
        k = "NeverHook";
        p = 0.0f;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void b(l var0) {
        block30: {
            block29: {
                var2_1 = new l(bk.c);
                var3_2 = 21;
                var4_3 = 14;
                var5_4 = 16;
                var1_5 = E.y();
                var6_6 = bk.c.s.az();
                v0 = var6_6.isEmpty();
                if (!var1_5) {
                    if (v0 != 0) return;
                    v.b(1.0f, 1.0f, 1.0f, 1.0f);
                    v.y();
                    v0 = 23;
                }
                var7_7 = v0;
                v1 = var6_6.size();
                v2 = 5;
                if (var1_5) break block29;
                if (v1 <= v2) break block30;
                v1 = 132;
                v2 = var6_6.size() - 1;
            }
            var7_7 = v1 / v2;
        }
        var8_8 = new ArrayList<j>(bk.c.s.az());
        var8_8.sort(Comparator.comparingDouble((ToDoubleFunction<j>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$onRenderPotionStatus$0(net.minecraft.K.j ), (Lnet/minecraft/K/j;)D)()));
        var9_9 = (float)var2_1.a() / 2.5f;
        var10_10 = var8_8.iterator();
        do {
            block47: {
                block45: {
                    block46: {
                        block44: {
                            block41: {
                                block42: {
                                    block43: {
                                        block39: {
                                            block40: {
                                                block38: {
                                                    block35: {
                                                        block36: {
                                                            block37: {
                                                                block33: {
                                                                    block34: {
                                                                        block32: {
                                                                            block31: {
                                                                                if (var10_10.hasNext() == false) return;
                                                                                var11_11 = (j)var10_10.next();
                                                                                var12_12 = b.a(fa.b(var11_11.j()));
                                                                                v.b(1.0f, 1.0f, 1.0f, 1.0f);
                                                                                v3 = bk.m;
                                                                                if (var1_5) break block31;
                                                                                if (!v3) {
                                                                                    v4 = var12_12;
                                                                                    if (!var1_5) {
                                                                                        if (v4 == null) {
                                                                                            throw new AssertionError();
                                                                                        } else {
                                                                                            ** GOTO lbl-1000
                                                                                        }
                                                                                    }
                                                                                } else lbl-1000:
                                                                                // 3 sources

                                                                                {
                                                                                    v4 = var12_12;
                                                                                }
                                                                                if (var1_5) break block32;
                                                                                v3 = v4.d();
                                                                            }
                                                                            if (v3) {
                                                                                bk.c.aN().b(new net.minecraft.ar.v("textures/gui/container/inventory.png"));
                                                                                var13_14 = var12_12.j();
                                                                                net.minecraft.client.b.q.a(var3_2 - 20, var9_9 + (float)var5_4 - (float)var4_3, var13_14 % 8 * 18, 198 + var13_14 / 8 * 18, 18, 18);
                                                                            }
                                                                            v4 = var12_12;
                                                                        }
                                                                        var13_13 = h.a(v4.i(), new Object[0]);
                                                                        v5 = var11_11.h();
                                                                        v6 = 1;
                                                                        if (var1_5) break block33;
                                                                        if (v5 != v6) break block34;
                                                                        var13_13 = var13_13 + " " + h.a("enchantment.level.2", new Object[0]);
                                                                        if (!var1_5) break block35;
                                                                    }
                                                                    v5 = var11_11.h();
                                                                    v6 = 2;
                                                                }
                                                                if (var1_5) break block36;
                                                                if (v5 != v6) break block37;
                                                                var13_13 = var13_13 + " " + h.a("enchantment.level.3", new Object[0]);
                                                                if (!var1_5) break block35;
                                                            }
                                                            v5 = var11_11.h();
                                                            if (var1_5) break block38;
                                                            v6 = 3;
                                                        }
                                                        if (v5 == v6) {
                                                            var13_13 = var13_13 + " " + h.a("enchantment.level.4", new Object[0]);
                                                        }
                                                    }
                                                    v5 = -1;
                                                }
                                                var14_15 = v5;
                                                v7 = var11_11.e();
                                                v8 = 200;
                                                if (var1_5) break block39;
                                                if (v7 >= v8) break block40;
                                                var14_15 = new Color(215, 59, 59).getRGB();
                                                if (!var1_5) break block41;
                                            }
                                            v7 = var11_11.e();
                                            v8 = 400;
                                        }
                                        if (var1_5) break block42;
                                        if (v7 >= v8) break block43;
                                        var14_15 = new Color(231, 143, 32).getRGB();
                                        if (!var1_5) break block41;
                                    }
                                    v9 = var11_11;
                                    if (var1_5) break block44;
                                    v7 = v9.e();
                                    v8 = 400;
                                }
                                if (v7 > v8) {
                                    var14_15 = new Color(172, 171, 171).getRGB();
                                }
                            }
                            v9 = var11_11;
                        }
                        var15_16 = b.a(v9);
                        if (var1_5) break block45;
                        if (!by.k.l()) break block46;
                        gu.a(var13_13, bk.c.a6, (float)var3_2, var9_9 + (float)var5_4 - (float)var4_3, -1);
                        gu.a(var15_16, bk.c.a6, (float)var3_2, var9_9 + (float)(var5_4 + 10) - (float)var4_3, var14_15);
                        if (!var1_5) break block47;
                    }
                    gu.a(var13_13, cj.g(), (float)var3_2, var9_9 + (float)var5_4 - (float)var4_3, -1);
                }
                gu.a(var15_16, cj.g(), (float)var3_2, var9_9 + (float)(var5_4 + 10) - (float)var4_3, var14_15);
            }
            var5_4 += var7_7;
        } while (!var1_5);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static Integer lambda$onRenderArrayList$1(bE bE2) {
        int n2;
        boolean bl2 = E.y();
        int n3 = by.k.l();
        if (!bl2) {
            if (n3 == 0) {
                n2 = -cj.g().b(bE2.c());
                return n2;
            }
            n3 = bk.c.a6.e(bE2.c());
        }
        n2 = -n3;
        return n2;
    }

    @cL
    public void a(fn fn2) {
        block8: {
            float f10;
            block7: {
                int n2;
                block6: {
                    boolean bl2 = E.f();
                    float f11 = bk.c.aO instanceof M ? 15.0f : 0.0f;
                    float f12 = n - f11;
                    n2 = Double.isFinite(n -= f12 / (float)Math.max(1, Q.aL()) * 10.0f);
                    if (bl2) {
                        float f13;
                        if (n2 == 0) {
                            n = 0.0f;
                        }
                        n2 = (f13 = n - 15.0f) == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                    }
                    if (!bl2) break block6;
                    if (n2 > 0) {
                        n = 15.0f;
                    }
                    f10 = n;
                    if (!bl2) break block7;
                    float f14 = f10 - 0.0f;
                    n2 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                }
                if (n2 >= 0) break block8;
                f10 = 0.0f;
            }
            n = f10;
        }
        this.b();
        this.f();
        bk.b(fn2.a());
    }

    private static double lambda$onRenderPotionStatus$0(j j2) {
        return bk.c.a6.e(Objects.requireNonNull(b.a(fa.b(j2.j()))).i());
    }

    private int a() {
        return this.q.a() - 19;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void b() {
        block9: {
            block7: {
                block8: {
                    var1_1 = E.f();
                    v0 = bk.c.y();
                    if (!var1_1) break block7;
                    if (!v0) break block8;
                    var2_2 = "localhost";
                    if (var1_1) break block9;
                }
                v0 = bk.m;
            }
            if (!v0) {
                v1 = bk.c.s();
                if (var1_1) {
                    if (v1 == null) {
                        throw new AssertionError();
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v1 = bk.c.s();
            }
            var2_2 = v1.h.toLowerCase();
        }
        var3_3 = "vk.com/celestial | Celestial | " + var2_2 + " | Fps " + Q.aL() + " | Ping " + Objects.requireNonNull(bk.c.ar()).a(bk.c.s.u()).n();
        var4_4 = bk.c.ax.b(var3_3) + 6;
        dJ.b(1.0, 2.0, var4_4, 1.0, cj.h().getRGB());
        dJ.b(1.0, 1.0, var4_4, 11.0, new Color(23, 23, 23, 190).getRGB());
        bk.c.ax.c(var3_3, 2.0f, 3.0f, -1);
    }

    private static bE a(ArrayList<bE> arrayList, int n2) {
        int n3 = n2;
        boolean bl2 = E.y();
        while (n3 < arrayList.size()) {
            block3: {
                block4: {
                    bE bE2;
                    block7: {
                        boolean bl3;
                        bE bE3;
                        block6: {
                            block5: {
                                bE3 = arrayList.get(n3);
                                if (bl2) break block3;
                                if (!bE3.i()) break block4;
                                bl3 = bE3.g;
                                if (bl2) break block5;
                                if (!bl3) break block4;
                                bl3 = bE3.c().equals("ClickGui");
                            }
                            if (bl2) break block6;
                            if (bl3) break block4;
                            bE2 = bE3;
                            if (bl2) break block7;
                            bl3 = bE2.g;
                        }
                        if (!bl3) break block4;
                        bE2 = bE3;
                    }
                    return bE2;
                }
                ++n3;
            }
            if (!bl2) continue;
        }
        return null;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public void f() {
        String string = String.format("%.2f " + (Object)ChatFormatting.WHITE + "blocks/sec", Float.valueOf(hC.d() * 20.0f * bk.c.a8.d));
        String string2 = "" + Q.aL();
        String string3 = "" + Math.round(bk.c.s.a);
        String string4 = "" + Math.round(bk.c.s.aF);
        String string5 = "" + Math.round(bk.c.s.ax);
        bk.c.m.c("X: ", this.c(), this.a(), cj.h().getRGB());
        bk.c.m.c(string3, this.c() + 10, this.a(), -1);
        bk.c.m.c("Y: ", this.c() + 30 + bk.c.m.b(string3) - 17, this.a(), cj.h().getRGB());
        bk.c.m.c(string4, this.c() + 40 + bk.c.m.b(string3) - 17, this.a(), -1);
        bk.c.m.c("Z: ", this.c() + 66 + bk.c.m.b(string3) - 23 + bk.c.m.b(string4) - 17, this.a(), cj.h().getRGB());
        bk.c.m.c(string5, this.c() + 76 + bk.c.m.b(string3) - 23 + bk.c.m.b(string4) - 17, this.a(), -1);
        bk.c.m.c("FPS: ", this.c(), this.a() + 11, cj.h().getRGB());
        boolean bl2 = E.f();
        bk.c.m.c(string2, this.c() + 22, this.a() + 11, -1);
        bk.c.m.c(string, this.c() + bk.c.m.b(string2) + 25, this.a() + 11, cj.h().getRGB());
        boolean bl3 = bl2;
        if (!bl3) {
            net.minecraft.k.m.b(!net.minecraft.k.m.c());
        }
    }
}

