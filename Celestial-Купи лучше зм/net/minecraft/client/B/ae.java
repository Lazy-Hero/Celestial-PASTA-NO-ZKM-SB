/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.b;

import com.google.common.collect.Lists;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;
import net.minecraft.at.l;
import net.minecraft.client.a.G;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.o;
import net.minecraft.client.a.v;
import net.minecraft.client.b.L;
import net.minecraft.client.b.q;
import net.minecraft.client.y.b;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ae
extends L {
    private static final /* synthetic */ net.minecraft.ar.v y;
    private final /* synthetic */ Runnable D;
    private static final /* synthetic */ net.minecraft.ar.v z;
    private final /* synthetic */ boolean F;
    private /* synthetic */ float G;
    private /* synthetic */ List<String> A;
    private static final /* synthetic */ net.minecraft.ar.v H;
    private /* synthetic */ int B;
    private /* synthetic */ float E;
    private static final /* synthetic */ Logger C;

    @Override
    public boolean i() {
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void r() {
        var1_1 = q.b();
        v0 = this;
        if (var1_1 != null) {
            if (v0.A != null) return;
            v0 = this;
        }
        v0.A = Lists.newArrayList();
        var2_2 = null;
        try {
            block14: {
                block16: {
                    block15: {
                        var3_3 = "" + (Object)net.minecraft.at.l.WHITE + (Object)net.minecraft.at.l.OBFUSCATED + (Object)net.minecraft.at.l.GREEN + (Object)net.minecraft.at.l.AQUA;
                        var4_5 = 274;
                        v1 = this;
                        if (var1_1 == null) break block15;
                        if (!v1.F) break block16;
                        v1 = this;
                    }
                    var2_2 = v1.m.O().a(new net.minecraft.ar.v("texts/end.txt"));
                    var5_6 = var2_2.c();
                    var6_7 = new BufferedReader(new InputStreamReader(var5_6, StandardCharsets.UTF_8));
                    var7_8 = new Random(8124371L);
                    while ((var8_9 = var6_7.readLine()) != null) {
                        v2 = var8_9.replaceAll("PLAYERNAME", this.m.aR().b());
                        if (var1_1 != null) {
                            block13: {
                                var8_9 = v2;
                                while (var8_9.contains(var3_3)) {
                                    var11_13 = var8_9.indexOf(var3_3);
                                    var9_10 = var8_9.substring(0, var11_13);
                                    var10_12 = var8_9.substring(var11_13 + var3_3.length());
                                    var8_9 = var9_10 + (Object)net.minecraft.at.l.WHITE + (Object)net.minecraft.at.l.OBFUSCATED + "XXXXXXXX".substring(0, var7_8.nextInt(4) + 3) + var10_12;
                                    if (var1_1 != null) {
                                        if (var1_1 != null) continue;
                                    }
                                    break block13;
                                }
                                this.A.addAll(this.m.a6.c(var8_9, 274));
                                this.A.add("");
                            }
                            if (var1_1 != null) continue;
                        }
                        ** GOTO lbl52
                    }
                    var5_6.close();
                    for (var9_11 = 0; var9_11 < 8; ++var9_11) {
                        this.A.add("");
                        if (var1_1 != null) {
                            if (var1_1 != null) continue;
                        }
                        break block14;
                    }
                }
                var5_6 = this.m.O().a(new net.minecraft.ar.v("texts/credits.txt")).c();
            }
            var6_7 = new BufferedReader(new InputStreamReader(var5_6, StandardCharsets.UTF_8));
            do {
                v2 = var7_8 = var6_7.readLine();
lbl52:
                // 2 sources

                if (v2 == null) break;
                var7_8 = var7_8.replaceAll("PLAYERNAME", this.m.aR().b());
                var7_8 = var7_8.replaceAll("\t", "    ");
                this.A.addAll(this.m.a6.c((String)var7_8, 274));
                this.A.add("");
                if (var1_1 == null) return;
            } while (var1_1 != null);
            var5_6.close();
            this.B = this.A.size() * 12;
            IOUtils.closeQuietly((Closeable)var2_2);
            return;
        }
        catch (Exception var3_4) {
            ae.C.error("Couldn't load credits", (Throwable)var3_4);
            return;
        }
        finally {
            IOUtils.closeQuietly(var2_2);
        }
    }

    @Override
    protected void a(char c10, int n2) throws IOException {
        block0: {
            if (n2 != 1) break block0;
            this.a();
        }
    }

    private void a() {
        this.D.run();
        this.m.a((L)null);
    }

    @Override
    public void a(int n2, int n3, float f10) {
        int n4;
        int n5;
        I i2;
        W w2;
        block8: {
            this.b(n2, n3, f10);
            w2 = W.c();
            i2 = w2.b();
            int n6 = 274;
            int n7 = h / 2 - 137;
            int n8 = w + 50;
            this.G += f10;
            float f11 = -this.G * this.E;
            net.minecraft.client.a.v.M();
            String[] arrstring = q.b();
            net.minecraft.client.a.v.b(0.0f, f11, 0.0f);
            this.m.aN().b(H);
            net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
            net.minecraft.client.a.v.e();
            this.a(n7, n8, 0, 0, 155, 44);
            this.a(n7 + 155, n8, 0, 45, 155, 44);
            this.m.aN().b(z);
            String[] arrstring2 = arrstring;
            ae.a(n7 + 88, n8 + 37, 0.0f, 0.0f, 98.0f, 14.0f, 128.0f, 16.0f);
            net.minecraft.client.a.v.v();
            int n9 = n8 + 100;
            for (n5 = 0; n5 < this.A.size(); ++n5) {
                block12: {
                    int n10;
                    String string;
                    block13: {
                        float f12;
                        block11: {
                            block9: {
                                float f13;
                                block10: {
                                    n4 = n5;
                                    if (arrstring2 == null) break block8;
                                    if (arrstring2 == null) break block9;
                                    if (n4 != this.A.size() - 1) break block10;
                                    float f14 = (float)n9 + f11 - (float)(w / 2 - 6);
                                    float f15 = f14 - 0.0f;
                                    f12 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
                                    if (arrstring2 == null) break block9;
                                    if (f12 < 0) {
                                        net.minecraft.client.a.v.b(0.0f, -f14, 0.0f);
                                    }
                                }
                                f12 = (f13 = (float)n9 + f11 + 12.0f + 8.0f - 0.0f) == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                            }
                            if (arrstring2 == null) break block11;
                            if (f12 <= 0) break block12;
                            float f16 = (float)n9 + f11 - (float)w;
                            f12 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                        }
                        if (f12 >= 0) break block12;
                        string = this.A.get(n5);
                        n10 = string.startsWith("[C]");
                        if (arrstring2 == null) break block12;
                        if (n10 == 0) break block13;
                        this.v.c(string.substring(3), n7 + (274 - this.v.e(string.substring(3))) / 2, n9, 0xFFFFFF);
                        if (arrstring2 != null) break block12;
                    }
                    this.v.s.setSeed((long)((float)((long)n5 * 4238972211L) + this.G / 4.0f));
                    n10 = this.v.c(string, n7, n9, 0xFFFFFF);
                }
                n9 += 12;
                if (arrstring2 != null) continue;
            }
            net.minecraft.client.a.v.B();
            this.m.aN().b(y);
            net.minecraft.client.a.v.a();
            net.minecraft.client.a.v.a(o.ZERO, net.minecraft.client.a.G.ONE_MINUS_SRC_COLOR);
            n5 = h;
            n4 = w;
        }
        int n11 = n4;
        i2.a(7, b.t);
        i2.c(0.0, (double)n11, (double)c).a(0.0, 1.0).a(1.0f, 1.0f, 1.0f, 1.0f).d();
        i2.c((double)n5, (double)n11, (double)c).a(1.0, 1.0).a(1.0f, 1.0f, 1.0f, 1.0f).d();
        i2.c((double)n5, 0.0, (double)c).a(1.0, 0.0).a(1.0f, 1.0f, 1.0f, 1.0f).d();
        i2.c(0.0, 0.0, (double)c).a(0.0, 0.0).a(1.0f, 1.0f, 1.0f, 1.0f).d();
        w2.a();
        net.minecraft.client.a.v.f();
        super.a(n2, n3, f10);
    }

    static {
        C = LogManager.getLogger();
        H = new net.minecraft.ar.v("textures/gui/title/minecraft.png");
        z = new net.minecraft.ar.v("textures/gui/title/edition.png");
        y = new net.minecraft.ar.v("textures/misc/vignette.png");
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private void b(int n2, int n3, float f10) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int n4;
        I i2;
        W w2;
        block6: {
            float f16;
            block5: {
                w2 = W.c();
                String[] arrstring = q.b();
                i2 = w2.b();
                this.m.aN().b(q.f);
                i2.a(7, b.t);
                n4 = h;
                f15 = -this.G * 0.5f * this.E;
                f14 = (float)w - this.G * 0.5f * this.E;
                float f17 = 0.015625f;
                f13 = this.G * 0.02f;
                float f18 = (float)(this.B + w + w + 24) / this.E;
                float f19 = (f18 - 20.0f - this.G) * 0.005f;
                String[] arrstring2 = arrstring;
                f16 = f19 == f13 ? 0 : (f19 < f13 ? -1 : 1);
                if (arrstring2 == null) break block5;
                if (f16 < 0) {
                    f13 = f19;
                }
                f12 = f13;
                f11 = 1.0f;
                if (arrstring2 == null) break block6;
                float f20 = f12 - f11;
                f16 = f20 == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1);
            }
            if (f16 > 0) {
                f13 = 1.0f;
            }
            f13 *= f13;
            f12 = f13 * 96.0f;
            f11 = 255.0f;
        }
        f13 = f12 / f11;
        i2.c(0.0, (double)w, (double)c).a(0.0, f15 * 0.015625f).a(f13, f13, f13, 1.0f).d();
        i2.c((double)n4, (double)w, (double)c).a((float)n4 * 0.015625f, f15 * 0.015625f).a(f13, f13, f13, 1.0f).d();
        i2.c((double)n4, 0.0, (double)c).a((float)n4 * 0.015625f, f14 * 0.015625f).a(f13, f13, f13, 1.0f).d();
        i2.c(0.0, 0.0, (double)c).a(0.0, f14 * 0.015625f).a(f13, f13, f13, 1.0f).d();
        w2.a();
    }

    @Override
    public void e() {
        block3: {
            ae ae2;
            block2: {
                String[] arrstring = q.b();
                this.m.av().c();
                String[] arrstring2 = arrstring;
                this.m.p().c();
                float f10 = (float)(this.B + w + w + 24) / this.E;
                ae2 = this;
                if (arrstring2 == null) break block2;
                if (!(ae2.G > f10)) break block3;
                ae2 = this;
            }
            ae2.a();
        }
    }

    public ae(boolean bl2, Runnable runnable) {
        block3: {
            block2: {
                String[] arrstring = q.b();
                String[] arrstring2 = arrstring;
                this.E = 0.5f;
                this.F = bl2;
                ae ae2 = this;
                if (arrstring2 == null) break block2;
                ae2.D = runnable;
                if (bl2) break block3;
                ae2 = this;
            }
            ae2.E = 0.75f;
        }
    }
}

