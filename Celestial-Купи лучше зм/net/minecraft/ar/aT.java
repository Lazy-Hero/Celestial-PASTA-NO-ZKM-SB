/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.BufferUtils
 */
package net.minecraft.ar;

import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.nio.IntBuffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import net.minecraft.I.a;
import net.minecraft.I.d;
import net.minecraft.ar.v;
import net.minecraft.at.g;
import net.minecraft.at.h;
import net.minecraft.at.k;
import net.minecraft.client.Q;
import net.minecraft.client.a.as;
import net.minecraft.client.a.x;
import net.minecraft.client.b.l;
import net.minecraft.client.j.p;
import net.minecraft.client.s.b;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;

public class aT {
    private static /* synthetic */ int[] a;
    private static final /* synthetic */ Logger b;
    private static /* synthetic */ IntBuffer d;
    private static final /* synthetic */ DateFormat c;

    private static Exception a(Exception exception) {
        return exception;
    }

    private static void a() {
        block3: {
            x x2;
            Q q2;
            block2: {
                int n2 = v.d();
                q2 = Q.P();
                q2.ao().a(q2.P, q2.aT);
                int n3 = n2;
                x2 = q2.Y;
                if (n3 == 0) break block2;
                if (x2 == null) break block3;
                x2 = q2.Y;
            }
            x2.a(q2.P, q2.aT);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static k a(File var0, @Nullable String var1_1, int var2_2, int var3_3, b var4_4) {
        block21: {
            block20: {
                block25: {
                    block24: {
                        block19: {
                            block18: {
                                block23: {
                                    block17: {
                                        var5_5 = v.b();
                                        try {
                                            block22: {
                                                var6_6 = new File(var0, "screenshots");
                                                var6_6.mkdir();
                                                var7_8 = Q.P();
                                                var8_9 = fU.a().b7;
                                                var9_10 = new l(var7_8);
                                                var10_11 = l.c();
                                                var11_12 = fU.F();
                                                v0 = as.c();
                                                if (var5_5 != 0) break block22;
                                                if (v0 == 0) ** GOTO lbl25
                                                v0 = var11_12;
                                            }
                                            if (var5_5 != 0) break block17;
                                            if (v0 <= 1) ** GOTO lbl25
                                            v0 = 1;
                                        }
                                        catch (Exception var6_7) {
                                            aT.b.warn("Couldn't save screenshot", (Throwable)var6_7);
                                            return new h("screenshot.failure", new Object[]{var6_7.getMessage()});
                                        }
                                    }
                                    break block23;
lbl25:
                                    // 2 sources

                                    v0 = 0;
                                }
                                v1 = var12_13 = v0;
                                if (var5_5 != 0) ** GOTO lbl40
                                if (v1 == 0) break block18;
                                fU.a().b7 = var10_11 * var11_12;
                                aT.a(var2_2 * var11_12, var3_3 * var11_12);
                                net.minecraft.client.a.v.M();
                                net.minecraft.client.a.v.h(16640);
                                var7_8.ao().a(true);
                                var7_8.Y.b(var7_8.aD(), System.nanoTime());
                            }
                            v1 = var2_2;
lbl40:
                            // 2 sources

                            var13_14 = aT.a(v1, var3_3, var4_4);
                            v2 = var12_13;
                            if (var5_5 != 0) break block19;
                            if (v2 == 0) ** GOTO lbl52
                            var7_8.ao().a();
                            net.minecraft.client.a.v.B();
                            fU.a().b7 = var8_9;
                            v2 = var2_2;
                        }
                        aT.a(v2, var3_3);
lbl52:
                        // 2 sources

                        if (var1_1 != null) break block24;
                        var14_15 = aT.a(var6_6);
                        if (var5_5 == 0) break block25;
                    }
                    var14_15 = new File(var6_6, var1_1);
                }
                var14_15 = var14_15.getCanonicalFile();
                var15_16 = null;
                v3 = cq.cw;
                if (var5_5 != 0) break block20;
                if (!v3.b()) ** GOTO lbl78
                v3 = cq.d(cq.cw, new Object[]{var13_14, var14_15});
            }
            v4 = var15_16 = v3;
            v5 = cq.dY;
            v6 = new Object[]{};
            if (var5_5 != 0) ** GOTO lbl77
            if (!cq.g((Object)v4, v5, v6)) ** GOTO lbl74
            return (k)cq.d((Object)var15_16, cq.bM, new Object[0]);
lbl74:
            // 1 sources

            v4 = var15_16;
            v5 = cq.ed;
            v6 = new Object[]{};
lbl77:
            // 2 sources

            var14_15 = (File)cq.d((Object)v4, v5, v6);
lbl78:
            // 2 sources

            ImageIO.write((RenderedImage)var13_14, "png", var14_15);
            var16_17 = new g(var14_15.getName());
            var16_17.e().a(new d(net.minecraft.I.a.OPEN_FILE, var14_15.getAbsolutePath()));
            var16_17.e().b(true);
            v7 = var15_16;
            if (var5_5 != 0) break block21;
            if (v7 == null) return new h("screenshot.success", new Object[]{var16_17});
            v7 = cq.d((Object)var15_16, cq.b2, new Object[0]);
        }
        v8 = var17_18 = (k)v7;
        if (var5_5 != 0) return v8;
        if (v8 == null) return new h("screenshot.success", new Object[]{var16_17});
        v8 = var17_18;
        return v8;
    }

    public static BufferedImage a(int n2, int n3, b b10) {
        block14: {
            int n4;
            block12: {
                block13: {
                    int n5;
                    int n6;
                    int n7;
                    block10: {
                        block11: {
                            IntBuffer intBuffer;
                            int n8;
                            block8: {
                                block9: {
                                    n7 = v.d();
                                    int n9 = as.c();
                                    if (n7 != 0) {
                                        if (n9 != 0) {
                                            n2 = b10.g;
                                            n3 = b10.b;
                                        }
                                        n9 = n2 * n3;
                                    }
                                    n8 = n9;
                                    intBuffer = d;
                                    if (n7 == 0) break block8;
                                    if (intBuffer == null) break block9;
                                    int n5 = d.capacity();
                                    n5 = n8;
                                    if (n7 == 0) break block10;
                                    if (n6 >= n5) break block11;
                                }
                                intBuffer = BufferUtils.createIntBuffer((int)n8);
                            }
                            d = intBuffer;
                            a = new int[n8];
                        }
                        net.minecraft.client.a.v.c(3333, 1);
                        int n5 = 3317;
                        n5 = 1;
                    }
                    net.minecraft.client.a.v.c(n6, n5);
                    d.clear();
                    n4 = as.c();
                    if (n7 == 0) break block12;
                    if (n4 == 0) break block13;
                    net.minecraft.client.a.v.t(b10.d);
                    net.minecraft.client.a.v.a(3553, 0, 32993, 33639, d);
                    if (n7 != 0) break block14;
                }
                n4 = 0;
            }
            net.minecraft.client.a.v.a(n4, 0, n2, n3, 32993, 33639, d);
        }
        d.get(a);
        p.b(a, n2, n3);
        BufferedImage bufferedImage = new BufferedImage(n2, n3, 1);
        bufferedImage.setRGB(0, 0, n2, n3, a, 0, n2);
        return bufferedImage;
    }

    public static k a(File file, int n2, int n3, b b10) {
        return aT.a(file, null, n2, n3, b10);
    }

    private static File a(File file) {
        String string = c.format(new Date());
        int n2 = v.d();
        int n3 = 1;
        while (true) {
            File file2 = new File(file, string + (n3 == 1 ? "" : "_" + n3) + ".png");
            if (n2 == 0) continue;
            if (!file2.exists()) {
                return file2;
            }
            ++n3;
        }
    }

    private static void a(int n2, int n3) {
        Q q2 = Q.P();
        q2.P = Math.max(1, n2);
        int n4 = v.d();
        q2.aT = Math.max(1, n3);
        if (n4 != 0) {
            if (q2.aO != null) {
                l l2 = new l(q2);
                q2.aO.b(q2, l2.e(), l2.a());
            }
            aT.a();
        }
    }

    static {
        b = LogManager.getLogger();
        c = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
    }
}

