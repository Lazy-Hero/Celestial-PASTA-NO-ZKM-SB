/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.j;

import java.awt.image.BufferedImage;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.IntBuffer;
import javax.imageio.ImageIO;
import net.minecraft.client.D.t;
import net.minecraft.client.Q;
import net.minecraft.client.a.aZ;
import net.minecraft.client.a.v;
import net.minecraft.client.j.f;
import net.minecraft.client.j.u;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class p {
    private static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] e;
    private static final /* synthetic */ Logger d;
    private static final /* synthetic */ float[] a;
    public static final /* synthetic */ f b;
    private static final /* synthetic */ IntBuffer f;

    public static void a(int n2, int n3, int n4) {
        p.a(n2, 0, n3, n4);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static void b(int[] arrn, int n2, int n3) {
        int[] arrn2 = new int[n2];
        boolean bl2 = u.c();
        int n4 = n3 / 2;
        for (int i2 = 0; i2 < n4; ++i2) {
            System.arraycopy(arrn, i2 * n2, arrn2, 0, n2);
            System.arraycopy(arrn, (n3 - 1 - i2) * n2, arrn, i2 * n2, n2);
            System.arraycopy(arrn2, 0, arrn, (n3 - 1 - i2) * n2, n2);
            if (!bl2) continue;
        }
    }

    private static int a(int n2, int n3, int n4, int n5, int n6) {
        float f10 = p.b(n2 >> n6);
        float f11 = p.b(n3 >> n6);
        float f12 = p.b(n4 >> n6);
        float f13 = p.b(n5 >> n6);
        float f14 = (float)((double)((float)Math.pow((double)(f10 + f11 + f12 + f13) * 0.25, 0.45454545454545453)));
        return (int)((double)f14 * 255.0);
    }

    public static void a(int[][] arrn, int n2, int n3, int n4, int n5, boolean bl2, boolean bl3) {
        boolean bl4 = u.c();
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            int[] arrn2 = arrn[i2];
            boolean bl5 = arrn.length;
            if (!bl4) {
                bl5 = bl5 > true;
            }
            p.a(i2, arrn2, n2 >> i2, n3 >> i2, n4 >> i2, n5 >> i2, bl2, bl3, bl5);
            if (!bl4) continue;
        }
    }

    private static void a(int[] arrn, int n2) {
        p.a(arrn, 0, n2);
    }

    public static int a(int n2, BufferedImage bufferedImage, int n3, int n4, boolean bl2, boolean bl3) {
        p.a(n2);
        p.a(bufferedImage, n3, n4, bl2, bl3);
        return n2;
    }

    static void a(int n2) {
        v.t(n2);
    }

    public static void a(boolean bl2, boolean bl3) {
        if (bl2) {
            v.c(3553, 10241, bl3 ? 9987 : 9729);
            v.c(3553, 10240, 9729);
        } else {
            int n2 = fU.be();
            v.c(3553, 10241, bl3 ? n2 : 9728);
            v.c(3553, 10240, 9728);
        }
    }

    public static int a(int n2, BufferedImage bufferedImage) {
        return p.a(n2, bufferedImage, false, false);
    }

    public static int[] a(int[] arrn) {
        int[] arrn2 = new int[arrn.length];
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            arrn2[i2] = p.d(arrn[i2]);
        }
        return arrn2;
    }

    public static void c(int n2) {
        v.v(n2);
    }

    private static int a(int n2, int n3, int n4, int n5, boolean bl2) {
        return eF.a(n2, n3, n4, n5);
    }

    static {
        int n2;
        d = LogManager.getLogger();
        f = aZ.b(0x400000);
        b = new f(16, 16);
        e = b.a();
        int n3 = -16777216;
        int n4 = -524040;
        int[] arrn = new int[]{-524040, -524040, -524040, -524040, -524040, -524040, -524040, -524040};
        int[] arrn2 = new int[]{-16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216};
        int n5 = arrn.length;
        for (n2 = 0; n2 < 16; ++n2) {
            System.arraycopy(n2 < n5 ? arrn : arrn2, 0, e, 16 * n2, n5);
            System.arraycopy(n2 < n5 ? arrn2 : arrn, 0, e, 16 * n2 + n5, n5);
        }
        b.d();
        a = new float[256];
        for (n2 = 0; n2 < a.length; ++n2) {
            p.a[n2] = (float)Math.pow((float)n2 / 255.0f, 2.2);
        }
        c = new int[4];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int[] a(t t2, net.minecraft.ar.v v2) throws IOException {
        Object var4_10;
        net.minecraft.client.D.v v3 = null;
        boolean bl2 = u.d();
        try {
            block9: {
                int[] arrn;
                BufferedImage bufferedImage;
                BufferedImage bufferedImage2;
                block8: {
                    v3 = t2.a(v2);
                    bufferedImage = bufferedImage2 = p.a(v3.c());
                    if (!bl2) break block8;
                    if (bufferedImage == null) break block9;
                    bufferedImage = bufferedImage2;
                }
                int n2 = bufferedImage.getWidth();
                int n3 = bufferedImage2.getHeight();
                int[] arrn2 = new int[n2 * n3];
                bufferedImage2.getRGB(0, 0, n2, n3, arrn2, 0, n2);
                int[] arrn3 = arrn = arrn2;
                return arrn3;
            }
            var4_10 = null;
        }
        finally {
            IOUtils.closeQuietly((Closeable)v3);
        }
        return var4_10;
    }

    public static int[][] a(int n2, int n3, int[][] arrn) {
        Object object;
        block10: {
            int[][] arrarrn;
            block12: {
                int n4;
                int n5;
                boolean bl2;
                boolean bl3;
                block9: {
                    arrarrn = new int[n2 + 1][];
                    bl3 = u.d();
                    object = arrarrn;
                    if (!bl3) break block10;
                    object[0] = arrn[0];
                    if (n2 <= 0) break block12;
                    bl2 = false;
                    for (n5 = 0; n5 < arrn.length; ++n5) {
                        n4 = arrn[0][n5] >> 24;
                        if (bl3) {
                            if (bl3) {
                                if (n4 != 0) continue;
                                boolean bl4 = bl2 = true;
                            }
                            if (bl3) break;
                            if (bl3) continue;
                        }
                        break block9;
                    }
                    n4 = 1;
                }
                n5 = n4;
                block1: while (true) {
                    int n6 = n5;
                    block2: while (n6 <= n2) {
                        block15: {
                            int[] arrn2;
                            block13: {
                                block14: {
                                    object = arrn;
                                    if (!bl3) break block10;
                                    arrn2 = object[n5];
                                    if (!bl3) break block13;
                                    if (arrn2 == null) break block14;
                                    arrarrn[n5] = arrn[n5];
                                    if (bl3) break block15;
                                }
                                arrn2 = arrarrn[n5 - 1];
                            }
                            int[] arrn3 = arrn2;
                            int[] arrn4 = new int[arrn3.length >> 2];
                            int n7 = n3 >> n5;
                            int n8 = arrn4.length / n7;
                            int n9 = n7 << 1;
                            int n10 = 0;
                            while (n10 < n7) {
                                block11: {
                                    n6 = 0;
                                    if (!bl3) continue block2;
                                    for (int i2 = v2037238; i2 < n8; ++i2) {
                                        int n11 = 2 * (n10 + i2 * n9);
                                        arrn4[n10 + i2 * n7] = p.a(arrn3[n11 + 0], arrn3[n11 + 1], arrn3[n11 + 0 + n9], arrn3[n11 + 1 + n9], bl2);
                                        if (bl3) {
                                            if (bl3) continue;
                                        }
                                        break block11;
                                    }
                                    ++n10;
                                }
                                if (bl3) continue;
                            }
                            arrarrn[n5] = arrn4;
                        }
                        ++n5;
                        if (bl3) continue block1;
                    }
                    break;
                }
            }
            object = arrarrn;
        }
        return object;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(int n2, int n3, int n4, int n5) {
        Class class_ = p.class;
        if (cq.dd.c()) {
            class_ = cq.dd.b();
        }
        Class class_2 = class_;
        synchronized (class_2) {
            p.c(n2);
            p.a(n2);
        }
        if (n3 >= 0) {
            v.c(3553, 33085, n3);
            v.c(3553, 33082, 0);
            v.c(3553, 33083, n3);
            v.b(3553, 34049, 0.0f);
        }
        for (int i2 = 0; i2 <= n3; ++i2) {
            v.a(3553, i2, 6408, n4 >> i2, n5 >> i2, 0, 32993, 33639, null);
        }
    }

    private static void a(int[] arrn, int n2, int n3) {
        int[] arrn2 = arrn;
        if (Q.P().ac.aD) {
            arrn2 = p.a(arrn);
        }
        f.clear();
        f.put(arrn2, n2, n3);
        f.position(0).limit(n3);
    }

    public static int d(int n2) {
        int n3 = n2 >> 24 & 0xFF;
        int n4 = n2 >> 16 & 0xFF;
        int n5 = n2 >> 8 & 0xFF;
        int n6 = n2 & 0xFF;
        int n7 = (n4 * 30 + n5 * 59 + n6 * 11) / 100;
        int n8 = (n4 * 30 + n5 * 70) / 100;
        int n9 = (n4 * 30 + n6 * 70) / 100;
        return n3 << 24 | n7 << 16 | n8 << 8 | n9;
    }

    public static void a(boolean bl2) {
        if (bl2) {
            v.c(3553, 10242, 33071);
            v.c(3553, 10243, 33071);
        } else {
            v.c(3553, 10242, 10497);
            v.c(3553, 10243, 10497);
        }
    }

    public static int a(int n2, BufferedImage bufferedImage, boolean bl2, boolean bl3) {
        p.a(n2, bufferedImage.getWidth(), bufferedImage.getHeight());
        return p.a(n2, bufferedImage, 0, 0, bl2, bl3);
    }

    private static float b(int n2) {
        return a[n2 & 0xFF];
    }

    private static void a(int n2, int[] arrn, int n3, int n4, int n5, int n6, boolean bl2, boolean bl3, boolean bl4) {
        int n7;
        int n8 = 0x400000 / n3;
        p.a(bl2, bl4);
        p.a(bl3);
        for (int i2 = 0; i2 < n3 * n4; i2 += n3 * n7) {
            int n9 = i2 / n3;
            n7 = Math.min(n8, n4 - n9);
            int n10 = n3 * n7;
            p.a(arrn, i2, n10);
            v.b(3553, n2, n5, n6 + n9, n3, n7, 32993, 33639, f);
        }
    }

    public static int a() {
        return v.b();
    }

    private static void a(BufferedImage bufferedImage, int n2, int n3, boolean bl2, boolean bl3) {
        int n4 = bufferedImage.getWidth();
        boolean bl4 = u.c();
        int n5 = bufferedImage.getHeight();
        int n6 = 0x400000 / n4;
        int[] arrn = new int[n6 * n4];
        p.b(bl2);
        p.a(bl3);
        for (int i2 = 0; i2 < n4 * n5; i2 += n4 * n6) {
            int n7 = i2 / n4;
            int n8 = Math.min(n6, n5 - n7);
            int n9 = n4 * n8;
            bufferedImage.getRGB(0, n7, n4, n8, arrn, 0, n4);
            p.a(arrn, n9);
            v.b(3553, 0, n2, n3 + n7, n4, n8, 32993, 33639, f);
            if (!bl4) continue;
        }
    }

    public static void a(int n2, int[] arrn, int n3, int n4) {
        p.a(n2);
        p.a(0, arrn, n3, n4, 0, 0, false, false, false);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static BufferedImage a(InputStream var0) throws IOException {
        var1_1 = u.c();
        v0 = var0;
        if (var1_1) ** GOTO lbl8
        if (v0 == null) {
            return null;
        }
        try {
            v0 = var0;
lbl8:
            // 2 sources

            var2_2 = ImageIO.read(v0);
            return var2_2;
        }
        finally {
            IOUtils.closeQuietly((InputStream)var0);
        }
    }

    private static void b(boolean bl2) {
        p.a(bl2, false);
    }
}

