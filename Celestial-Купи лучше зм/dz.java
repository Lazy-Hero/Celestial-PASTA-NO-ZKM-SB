/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.RandomStringUtils
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.client.D.h;
import net.minecraft.client.E.a;
import net.minecraft.client.E.e;
import net.minecraft.client.a.v;
import net.minecraft.client.b.L;
import net.minecraft.client.b.a1;
import net.minecraft.client.b.aq;
import net.minecraft.client.b.av;
import net.minecraft.client.b.l;
import net.minecraft.client.b.s;
import net.minecraft.k.m;
import org.apache.commons.lang3.RandomStringUtils;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class dz
extends L {
    private /* synthetic */ g_ D;
    private /* synthetic */ double y;
    private /* synthetic */ aq G;
    private /* synthetic */ dX F;
    public /* synthetic */ String A;
    private /* synthetic */ dX C;
    public /* synthetic */ fQ E;
    private /* synthetic */ dX z;
    public static final /* synthetic */ ac B;

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(int var1_1, int var2_2, float var3_3) {
        block34: {
            block35: {
                block36: {
                    block37: {
                        var5_4 = new l(this.m);
                        var4_5 = fQ.e();
                        dJ.a(0.0, 0.0, dz.h, dz.w, 0.5, new Color(22, 22, 22, 255).getRGB(), new Color(60, 60, 60, 255).getRGB(), true);
                        v0 = Mouse.hasWheel();
                        if (var4_5 == 0) break block34;
                        if (v0 == 0) break block35;
                        v0 = var6_6 = Mouse.getDWheel();
                        if (var4_5 == 0) break block36;
                        if (v0 >= 0) break block37;
                        this.y += 26.0;
                        cfr_temp_0 = this.y - 0.0;
                        v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                        if (var4_5 == 0) break block34;
                        if (v0 >= 0) break block35;
                        this.y = 0.0;
                        if (var4_5 != 0) break block35;
                        net.minecraft.k.m.b(net.minecraft.k.m.c() == false);
                    }
                    v0 = var6_6;
                }
                if (var4_5 == 0) break block34;
                if (v0 <= 0) break block35;
                this.y -= 26.0;
                cfr_temp_1 = this.y - 0.0;
                v0 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                if (var4_5 == 0) break block34;
                if (v0 < 0) {
                    this.y = 0.0;
                }
            }
            v0 = dz.h;
        }
        dJ.a((float)v0 / 2.0f - 5.0f, 31.0, dz.h - 10, dz.w - 50, 2.0, new Color(10, 10, 10, 255).getRGB(), new Color(32, 32, 32, 255).getRGB());
        var6_7 = this.v;
        v1 = new StringBuilder();
        v2 = "Name: ";
        if (var4_5 != 0) {
            v1 = v1.append(v2);
            v2 = cj.b.i.a(ch.class).i() != false ? "Protected" : this.m.l.b();
        }
        var7_8 = v1.append(v2).toString();
        this.m.ax.c((Object)net.minecraft.at.l.GRAY + "~ User Info ~", 15.0f, 75.0f, -1);
        this.m.ax.c(var7_8, 10.0f, 87.0f, 0xDDDDDD);
        this.m.ax.c("Account Status: " + (Object)net.minecraft.at.l.GREEN + "Working", 10.0f, 98.0f, 0xDDDDDD);
        dJ.b(this.m.ax.b("Account Status: Working") + 12, this.m.ax.a("Account Status: Working") + 89, 9.0, this.m.ax.a("Account Status: Working") + 100, a0.a(255, 30));
        dJ.b(this.m.ax.b(var7_8) + 12, this.m.ax.a(var7_8) + 78, 9.0, this.m.ax.a(var7_8) + 89, a0.a(255, 30));
        dJ.a(82.0, 82.0, 82.0, 12.0, 3.0, -1, -1);
        net.minecraft.client.a.v.M();
        dJ.a(new net.minecraft.ar.v("celestial/info.png"), 13.0f, 8.0f, 64.0f, 64.0f, Color.white);
        net.minecraft.client.a.v.f();
        net.minecraft.client.a.v.B();
        this.m.ax.b("Account Manager - " + ek.b.size() + " alts", (float)dz.h / 2.0f, 10.0f, -1);
        v3 = this.D;
        if (var4_5 == 0) ** GOTO lbl61
        if (v3 == null) {
            v4 = this.A;
        } else {
            v3 = this.D;
lbl61:
            // 2 sources

            v4 = v3.a();
        }
        this.m.ax.b(v4, (float)dz.h / 2.0f, 20.0f, -1);
        GL11.glPushMatrix();
        this.a(0.0f, 33.0f, (float)dz.h, (float)(dz.w - 50));
        GL11.glEnable((int)3089);
        var8_9 = 38;
        var9_10 = 0;
        var10_11 = this.a().iterator();
        while (true) {
            block59: {
                block63: {
                    block64: {
                        block61: {
                            block62: {
                                block56: {
                                    block60: {
                                        block57: {
                                            block58: {
                                                block55: {
                                                    block53: {
                                                        block54: {
                                                            block52: {
                                                                block50: {
                                                                    block51: {
                                                                        block49: {
                                                                            block40: {
                                                                                block38: {
                                                                                    block48: {
                                                                                        block47: {
                                                                                            block46: {
                                                                                                block45: {
                                                                                                    block43: {
                                                                                                        block44: {
                                                                                                            block42: {
                                                                                                                block39: {
                                                                                                                    block41: {
                                                                                                                        if (var10_11.hasNext()) break block38;
                                                                                                                        GL11.glDisable((int)3089);
                                                                                                                        GL11.glPopMatrix();
                                                                                                                        super.a(var1_1, var2_2, var3_3);
                                                                                                                        v5 = this;
                                                                                                                        if (var4_5 == 0) break block39;
                                                                                                                        v6 = v5.E;
                                                                                                                        if (var4_5 == 0) break block40;
                                                                                                                        if (v6 != null) break block41;
                                                                                                                        this.F.h = false;
                                                                                                                        this.z.h = false;
                                                                                                                        this.C.h = false;
                                                                                                                        if (var4_5 != 0) break block42;
                                                                                                                    }
                                                                                                                    this.F.h = true;
                                                                                                                    this.z.h = true;
                                                                                                                    v5 = this;
                                                                                                                }
                                                                                                                v5.C.h = true;
                                                                                                            }
                                                                                                            v7 = Keyboard.isKeyDown((int)200);
                                                                                                            if (var4_5 == 0) break block43;
                                                                                                            if (v7 == 0) break block44;
                                                                                                            this.y -= 26.0;
                                                                                                            if (var4_5 != 0) break block45;
                                                                                                        }
                                                                                                        v7 = Keyboard.isKeyDown((int)208);
                                                                                                    }
                                                                                                    if (var4_5 == 0) break block46;
                                                                                                    if (v7 != 0) {
                                                                                                        this.y += 26.0;
                                                                                                    }
                                                                                                }
                                                                                                v7 = (cfr_temp_2 = this.y - 0.0) == 0.0 ? 0 : (cfr_temp_2 < 0.0 ? -1 : 1);
                                                                                            }
                                                                                            if (var4_5 != 0) {
                                                                                                if (v7 < 0) {
                                                                                                    this.y = 0.0;
                                                                                                }
                                                                                                this.G.d();
                                                                                                v7 = this.G.n().isEmpty() ? 1 : 0;
                                                                                            }
                                                                                            if (var4_5 == 0) break block47;
                                                                                            if (v7 == 0) return;
                                                                                            v8 = this;
                                                                                            if (var4_5 == 0) break block48;
                                                                                            v7 = v8.G.b() ? 1 : 0;
                                                                                        }
                                                                                        if (v7 != 0) return;
                                                                                        v8 = this;
                                                                                    }
                                                                                    v8.a(this.m.a6, "Search Alt", dz.h / 2 + 125, dz.w - 18, a0.a(180));
                                                                                    return;
                                                                                }
                                                                                v6 = var10_11.next();
                                                                            }
                                                                            var11_12 = v6;
                                                                            v9 = this.a(var8_9);
                                                                            if (var4_5 == 0) break block49;
                                                                            if (!v9) continue;
                                                                            ++var9_10;
                                                                            v10 = var11_12.b();
                                                                            if (var4_5 == 0) break block50;
                                                                            v9 = v10.equals("");
                                                                        }
                                                                        if (!v9) break block51;
                                                                        var12_13 = var11_12.c();
                                                                        if (var4_5 != 0) break block52;
                                                                    }
                                                                    v10 = var11_12.b();
                                                                }
                                                                var12_13 = v10;
                                                            }
                                                            v11 = var12_13.equalsIgnoreCase(this.m.l.b());
                                                            if (var4_5 != 0) {
                                                                if (v11) {
                                                                    var12_13 = "\u00a7n" + var12_13;
                                                                }
                                                                v11 = var11_12.a().equals((Object)d9.Banned);
                                                            }
                                                            if (var4_5 == 0) ** GOTO lbl151
                                                            if (v11) {
                                                                v12 = "\u00a7c";
                                                            } else {
                                                                v11 = var11_12.a().equals((Object)d9.NotWorking);
lbl151:
                                                                // 2 sources

                                                                v12 = v11 != false ? "\u00a7m" : "";
                                                            }
                                                            var13_14 = v12;
                                                            var12_13 = var13_14 + var12_13;
                                                            v13 = var11_12.f();
                                                            v14 = "";
                                                            if (var4_5 == 0) break block53;
                                                            if (!v13.equals(v14)) break block54;
                                                            var14_15 = "\u00a7cCracked";
                                                            if (var4_5 != 0) break block55;
                                                        }
                                                        v13 = var11_12.f();
                                                        v14 = ".";
                                                    }
                                                    var14_15 = v13.replaceAll(v14, "*");
                                                }
                                                if (var11_12 == this.E) break block56;
                                                v15 = this.a((double)var1_1, (double)var2_2, (double)var8_9 - this.y);
                                                if (var4_5 == 0) break block57;
                                                if (v15 == 0) break block58;
                                                v15 = Mouse.isButtonDown((int)0);
                                                if (var4_5 == 0) break block57;
                                                if (v15 == 0) break block58;
                                                dJ.a((float)dz.h / 2.0f, (double)var8_9 - this.y - 4.0, dz.h - 52, (double)var8_9 - this.y + 20.0, 1.0, -a0.a(195, 50), -2146101995);
                                                if (var4_5 != 0) break block59;
                                            }
                                            v15 = this.a((double)var1_1, (double)var2_2, (double)var8_9 - this.y) ? 1 : 0;
                                        }
                                        if (var4_5 == 0) break block60;
                                        if (v15 == 0) break block59;
                                        v15 = dz.h;
                                    }
                                    dJ.a((float)v15 / 2.0f, (double)var8_9 - this.y - 4.0, dz.h - 52, (double)var8_9 - this.y + 20.0, 1.0, a0.a(195, 50), -2145180893);
                                    if (var4_5 != 0) break block59;
                                }
                                v16 = this.a((double)var1_1, (double)var2_2, (double)var8_9 - this.y);
                                if (var4_5 == 0) break block61;
                                if (v16 == 0) break block62;
                                v16 = Mouse.isButtonDown((int)0) ? 1 : 0;
                                if (var4_5 == 0) break block61;
                                if (v16 == 0) break block62;
                                dJ.a((float)dz.h / 2.0f, (double)var8_9 - this.y - 4.0, dz.h - 77, (double)var8_9 - this.y + 20.0, 1.0, a0.a(195, 50), -2142943931);
                                if (var4_5 != 0) break block59;
                            }
                            v16 = this.a((double)var1_1, (double)var2_2, (double)var8_9 - this.y) ? 1 : 0;
                        }
                        if (var4_5 == 0) break block63;
                        if (v16 == 0) break block64;
                        dJ.a((float)dz.h / 2.0f, (double)var8_9 - this.y - 4.0, dz.h - 77, (double)var8_9 - this.y + 20.0, 1.0, a0.a(195, 50), -2142088622);
                        if (var4_5 != 0) break block59;
                    }
                    v16 = dz.h;
                }
                dJ.a((float)v16 / 2.0f, (double)var8_9 - this.y - 4.0, dz.h - 77, (double)var8_9 - this.y + 20.0, 1.0, a0.a(195, 50), -2144259791);
            }
            var15_16 = "\u00a77" + var9_10 + ". \u00a7f";
            v17 = new StringBuilder();
            v18 = var15_16;
            if (var4_5 != 0) {
                v17 = v17.append(v18);
                v18 = cj.b.i.a(ch.class).i() != false ? "Protected" : var12_13;
            }
            this.m.ax.e(v17.append(v18).toString(), (double)dz.h / 1.5, (double)var8_9 - this.y, -1);
            this.m.ax.e((var11_12.a().equals((Object)d9.NotWorking) != false ? "\u00a7m" : "") + var14_15, (double)dz.h / 1.5, (double)var8_9 - this.y + 10.0, a0.a(110));
            var8_9 += 26;
        }
    }

    @Override
    public void r() {
        block0: {
            this.G = new aq(this.a, this.m.a6, h / 2 + 116, w - 22, 72, 16);
            this.F = new dX(1, h / 2 - 122, w - 48, 100, 20, "Login");
            this.t.add(this.F);
            this.z = new dX(2, h / 2 - 40, w - 24, 70, 20, "Remove");
            this.t.add(this.z);
            this.t.add(new dX(3, h / 2 + 4 + 86, w - 48, 100, 20, "Add"));
            this.t.add(new dX(4, h / 2 - 16, w - 48, 100, 20, "Direct Login"));
            this.t.add(new dX(5, h / 2 - 122, w - 24, 78, 20, "Random"));
            this.C = new dX(6, h / 2 + 38, w - 24, 70, 20, "Edit");
            this.t.add(this.C);
            int n2 = fQ.e();
            this.t.add(new dX(7, h / 2 - 190, w - 24, 60, 20, "Back"));
            this.t.add(new dX(8, h / 2 - 190, w - 48, 60, 20, "Refresh"));
            this.t.add(new dX(8931, h / 2 + 195, w - 48, 100, 20, "MultiPlayer"));
            this.F.h = false;
            this.z.h = false;
            this.C.h = false;
            int n3 = n2;
            if (net.minecraft.k.m.d()) break block0;
            fQ.b(++n3);
        }
    }

    @Override
    public void a(s s2) {
        int n2 = fQ.d();
        switch (s2.g) {
            case 0: {
                if (n2 == 0) break;
            }
            case 1: {
                this.D = new g_(this.E);
                this.D.start();
                if (n2 == 0) break;
            }
            case 2: {
                dz dz2 = this;
                if (n2 == 0) {
                    if (dz2.D != null) {
                        this.D = null;
                    }
                    ek.b.remove(this.E);
                    dz2 = this;
                }
                dz2.A = "\u00a7aRemoved.";
                try {
                    cj.c().a(c3.class).b();
                }
                catch (Exception exception) {
                    // empty catch block
                }
                this.E = null;
                if (n2 == 0) break;
            }
            case 3: {
                this.m.a(new dh(this));
                if (n2 == 0) break;
            }
            case 4: {
                this.m.a(new dq(this));
                if (n2 == 0) break;
            }
            case 5: {
                Random random = new Random();
                this.D = new g_(new fQ("CelestialUser" + RandomStringUtils.randomNumeric((int)1) + RandomStringUtils.randomAlphabetic((int)2), ""));
                this.D.start();
                if (n2 == 0) break;
            }
            case 6: {
                this.m.a(new d0(this));
                if (n2 == 0) break;
            }
            case 7: {
                this.m.a(new a1());
                if (n2 == 0) break;
            }
            case 8: {
                try {
                    ek.b.clear();
                    cj.c().a(c3.class).e();
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
                this.A = "\u00a7bRefreshed!";
                if (n2 == 0) break;
            }
            case 1919: {
                this.m.a(new d_(this));
                if (n2 == 0) break;
            }
            case 8931: {
                this.m.a(new av(this));
                if (n2 == 0) break;
            }
            case 4545: {
                this.m.a(new e(this, this.m, new a(net.minecraft.client.D.h.a("selectServer.defaultName", new Object[0]), "", false)));
                break;
            }
        }
    }

    static {
        B = new ac();
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void a(int var1_1, int var2_2, int var3_3) {
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
    private boolean a(double d10, double d11, double d12) {
        double d13;
        block5: {
            int n2;
            block11: {
                block10: {
                    block9: {
                        block8: {
                            block7: {
                                block6: {
                                    block4: {
                                        n2 = fQ.e();
                                        double d14 = d10 - (double)(h / 2);
                                        d13 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                                        if (n2 == 0) break block4;
                                        if (d13 < 0) break block5;
                                        double d15 = d11 - (d12 - 4.0);
                                        d13 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                                    }
                                    if (n2 == 0) break block6;
                                    if (d13 < 0) break block5;
                                    double d16 = d10 - (double)(h - 77);
                                    d13 = d16 == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
                                }
                                if (n2 == 0) break block7;
                                if (d13 > 0) break block5;
                                double d17 = d11 - (d12 + 20.0);
                                d13 = d17 == 0.0 ? 0 : (d17 < 0.0 ? -1 : 1);
                            }
                            if (n2 == 0) break block8;
                            if (d13 > 0) break block5;
                            double d18 = d10 - 0.0;
                            d13 = d18 == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
                        }
                        if (n2 == 0) break block9;
                        if (d13 < 0) break block5;
                        double d19 = d11 - 33.0;
                        d13 = d19 == 0.0 ? 0 : (d19 > 0.0 ? 1 : -1);
                    }
                    if (n2 == 0) break block10;
                    if (d13 < 0) break block5;
                    double d20 = d10 - (double)h;
                    d13 = d20 == 0.0 ? 0 : (d20 < 0.0 ? -1 : 1);
                }
                if (n2 == 0) break block11;
                if (d13 > 0) break block5;
                double d21 = d11 - (double)(w - 50);
                d13 = d21 == 0.0 ? 0 : (d21 < 0.0 ? -1 : 1);
            }
            if (n2 == 0) return (boolean)d13;
            if (d13 <= 0) {
                d13 = 1.0;
                return (boolean)d13;
            }
        }
        d13 = 0.0;
        return (boolean)d13;
    }

    private List<fQ> a() {
        ArrayList<fQ> arrayList = new ArrayList<fQ>();
        int n2 = fQ.e();
        Iterator iterator = ek.b.iterator();
        while (true) {
            ArrayList<fQ> arrayList2;
            if (!iterator.hasNext()) {
                arrayList2 = arrayList;
                if (n2 != 0) {
                    return arrayList2;
                }
            } else {
                arrayList2 = iterator.next();
            }
            fQ fQ2 = (fQ)((Object)arrayList2);
            boolean bl2 = this.G.n().isEmpty();
            if (n2 == 0) continue;
            if (!bl2) {
                bl2 = fQ2.b().toLowerCase().contains(this.G.n().toLowerCase());
                if (n2 == 0) continue;
                if (!bl2) {
                    bl2 = fQ2.c().toLowerCase().contains(this.G.n().toLowerCase());
                    if (n2 == 0) continue;
                    if (!bl2) continue;
                }
            }
            bl2 = arrayList.add(fQ2);
        }
    }

    private boolean a(int n2) {
        int n3 = fQ.e();
        double d10 = (double)n2 - this.y - (double)(w - 50);
        double d11 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
        if (n3 != 0) {
            d11 = d11 <= 0 ? 1.0 : 0.0;
        }
        return (boolean)d11;
    }

    private void a(float f10, float f11, float f12, float f13) {
        l l2 = new l(this.m);
        int n2 = net.minecraft.client.b.l.c();
        GL11.glScissor((int)((int)(f10 * (float)n2)), (int)((int)(((float)l2.a() - f13) * (float)n2)), (int)((int)((f12 - f10) * (float)n2)), (int)((int)((f13 - f11) * (float)n2)));
    }

    public dz() {
        this.E = null;
        this.A = (Object)((Object)net.minecraft.at.l.GRAY) + "Alts...";
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    protected void a(char var1_1, int var2_2) {
        block6: {
            block4: {
                block5: {
                    v0 = fQ.e();
                    this.G.a(var1_1, var2_2);
                    var3_3 = v0;
                    v1 = var1_1;
                    if (var3_3 == 0) break block4;
                    if (v1 == '\t') break block5;
                    v1 = var1_1;
                    if (var3_3 == 0) break block4;
                    if (v1 != '\r') break block6;
                }
                v2 = this;
                if (var3_3 == 0) ** GOTO lbl24
                v1 = (char)(v2.G.b() ? 1 : 0);
            }
            if (v1 != '\u0000') {
                v3 = this.G.b();
                if (var3_3 != 0) {
                    v3 = v3 == false;
                }
                this.G.c(v3);
            }
        }
        try {
            v2 = this;
lbl24:
            // 2 sources

            super.a(var1_1, var2_2);
            return;
        }
        catch (IOException var4_4) {
            var4_4.printStackTrace();
        }
    }
}

