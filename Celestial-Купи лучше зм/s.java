/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 */
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import net.minecraft.client.D.t;
import net.minecraft.client.Q;
import net.minecraft.client.a.v;
import net.minecraft.client.j.c;
import net.minecraft.client.j.d;
import net.minecraft.client.j.e;
import net.minecraft.client.j.f;
import net.minecraft.client.j.h;
import net.minecraft.client.j.j;
import net.minecraft.client.j.p;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class s {
    public static /* synthetic */ c q;
    public static final /* synthetic */ int a;
    public static final /* synthetic */ int e;
    public static /* synthetic */ u n;
    static /* synthetic */ net.minecraft.ar.v l;
    public static /* synthetic */ u c;
    public static final /* synthetic */ int p;
    public static /* synthetic */ int[] i;
    public static /* synthetic */ int d;
    public static /* synthetic */ ByteBuffer b;
    public static /* synthetic */ t j;
    public static /* synthetic */ Map<Integer, u> f;
    static /* synthetic */ int k;
    public static final /* synthetic */ int m;
    public static /* synthetic */ IntBuffer o;
    public static /* synthetic */ j h;
    public static /* synthetic */ String g;

    public static int[] b(int n2, int n3) {
        int[] arrn = new int[n2 * 3];
        Arrays.fill(arrn, 0, n2, n3);
        Arrays.fill(arrn, n2, n2 * 2, -8421377);
        Arrays.fill(arrn, n2 * 2, n2 * 3, 0);
        return arrn;
    }

    public static void a(u u2, int[] arrn, int n2, int n3, int n4, int n5, boolean bl2, boolean bl3) {
        int n6 = n2 * n3;
        String string = dB.i();
        IntBuffer intBuffer = s.c(n6);
        intBuffer.clear();
        intBuffer.put(arrn, 0, n6);
        intBuffer.position(0).limit(n6);
        v.t(u2.b);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10242, (int)10497);
        String string2 = string;
        GL11.glTexParameteri((int)3553, (int)10243, (int)10497);
        GL11.glTexSubImage2D((int)3553, (int)0, (int)n4, (int)n5, (int)n2, (int)n3, (int)32993, (int)33639, (IntBuffer)intBuffer);
        int n7 = arrn.length;
        int n8 = n6 * 3;
        if (string2 != null) {
            if (n7 == n8) {
                intBuffer.clear();
                intBuffer.put(arrn, n6, n6).position(0);
                intBuffer.position(0).limit(n6);
            }
            v.t(u2.c);
            GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
            GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
            GL11.glTexParameteri((int)3553, (int)10242, (int)10497);
            GL11.glTexParameteri((int)3553, (int)10243, (int)10497);
            GL11.glTexSubImage2D((int)3553, (int)0, (int)n4, (int)n5, (int)n2, (int)n3, (int)32993, (int)33639, (IntBuffer)intBuffer);
            n7 = arrn.length;
            n8 = n6 * 3;
        }
        if (string2 != null) {
            if (n7 == n8) {
                intBuffer.clear();
                intBuffer.put(arrn, n6 * 2, n6);
                intBuffer.position(0).limit(n6);
            }
            v.t(u2.a);
            GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
            GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
            GL11.glTexParameteri((int)3553, (int)10242, (int)10497);
            GL11.glTexParameteri((int)3553, (int)10243, (int)10497);
            n7 = 3553;
            n8 = 0;
        }
        GL11.glTexSubImage2D((int)n7, (int)n8, (int)n4, (int)n5, (int)n2, (int)n3, (int)32993, (int)33639, (IntBuffer)intBuffer);
        v.u(33984);
    }

    public static int[][] a(String string, int n2, int n3, int n4, boolean bl2, int n5) {
        int n6;
        String string2;
        int[] arrn;
        Object object;
        block9: {
            int n7;
            block8: {
                BufferedImage bufferedImage;
                BufferedImage bufferedImage2;
                block7: {
                    object = new int[n4][];
                    arrn = new int[n2 * n3];
                    object[0] = arrn;
                    n7 = 0;
                    bufferedImage2 = s.a(h.b(new net.minecraft.ar.v(string)));
                    string2 = dB.i();
                    bufferedImage = bufferedImage2;
                    if (string2 == null) break block7;
                    if (bufferedImage == null) break block8;
                    bufferedImage = bufferedImage2;
                }
                int n8 = bufferedImage.getWidth();
                int n9 = bufferedImage2.getHeight();
                int n10 = bl2;
                if (string2 != null) {
                    n10 = n10 != 0 ? 16 : 0;
                }
                n6 = n8 + n10;
                if (string2 == null) break block9;
                if (n6 == n2) {
                    n7 = 1;
                    bufferedImage2.getRGB(0, 0, n8, n8, arrn, 0, n8);
                }
            }
            n6 = n7;
        }
        if (string2 != null) {
            if (n6 == 0) {
                Arrays.fill(arrn, n5);
            }
            v.t(s.n.a);
            n6 = ((int[][])object).length - 1;
        }
        object = s.a(n6, n2, object);
        return object;
    }

    public static int[][] a(c c10, int[][] arrn, int n2, int n3) {
        boolean bl2 = true;
        return arrn;
    }

    public static IntBuffer c(int n2, int n3) {
        int[] arrn = s.d(n2);
        IntBuffer intBuffer = s.c(n2);
        Arrays.fill(i, 0, n2, n3);
        o.put(i, 0, n2);
        return o;
    }

    public static d b() {
        f f10 = new f(1, 1);
        f10.a()[0] = -1;
        f10.d();
        return f10;
    }

    public static void a(t t2, net.minecraft.ar.v v2, int n2, int n3, int[] arrn, int n4, int n5) {
        block9: {
            int n6;
            block6: {
                n6 = 0;
                String string = dB.i();
                try {
                    int n7;
                    block8: {
                        int n8;
                        BufferedImage bufferedImage;
                        block7: {
                            net.minecraft.client.D.v v3 = t2.a(v2);
                            BufferedImage bufferedImage2 = bufferedImage = ImageIO.read(v3.c());
                            if (string != null) {
                                if (bufferedImage2 == null) break block6;
                                bufferedImage2 = bufferedImage;
                            }
                            n7 = bufferedImage2.getWidth();
                            n8 = n2;
                            if (string == null) break block7;
                            if (n7 != n8) break block6;
                            n7 = bufferedImage.getHeight();
                            if (string == null) break block8;
                            n8 = n3;
                        }
                        if (n7 != n8) break block6;
                        bufferedImage.getRGB(0, 0, n2, n3, arrn, n4, n2);
                        n7 = 1;
                    }
                    n6 = n7;
                }
                catch (IOException iOException) {
                    // empty catch block
                }
            }
            if (n6 != 0) break block9;
            Arrays.fill(arrn, n4, n4 + n2 * n3, n5);
        }
    }

    public static int[][] a(int[][] arrn, int n2, int n3, int n4) {
        Object object;
        block4: {
            int n5 = arrn.length;
            int[][] arrarrn = new int[n5][];
            int n6 = 0;
            String string = dB.i();
            while (n6 < n5) {
                object = arrn;
                if (string != null) {
                    int[] arrn2 = object[n6];
                    if (string != null) {
                        if (arrn2 != null) {
                            int n7 = (n2 >> n6) * (n3 >> n6);
                            int[] arrn3 = new int[n7 * 3];
                            arrarrn[n6] = arrn3;
                            int n8 = arrn2.length / 3;
                            int n9 = n7 * n4;
                            int n10 = 0;
                            System.arraycopy(arrn2, n9, arrn3, n10, n7);
                            System.arraycopy(arrn2, n9 += n8, arrn3, n10 += n7, n7);
                            System.arraycopy(arrn2, n9 += n8, arrn3, n10 += n7, n7);
                        }
                        ++n6;
                    }
                    if (string != null) continue;
                }
                break block4;
            }
            object = arrarrn;
        }
        return object;
    }

    public static int[] e(int n2) {
        int[] arrn = new int[n2 * 3];
        Arrays.fill(arrn, 0, n2, 0);
        Arrays.fill(arrn, n2, n2 * 2, -8421377);
        Arrays.fill(arrn, n2 * 2, n2 * 3, 0);
        return arrn;
    }

    public static void a(int n2, int n3) {
        block3: {
            int n4;
            block4: {
                String string;
                block2: {
                    string = dB.i();
                    n4 = cS.dj;
                    if (string == null) break block2;
                    if (n4 == 0) break block3;
                    n4 = v.H();
                }
                if (string == null) break block4;
                if (n4 != 33984) break block3;
                v.u(33986);
                v.t(n2);
                v.u(33987);
                v.t(n3);
                n4 = 33984;
            }
            v.u(n4);
        }
    }

    public static int a(int n2, int n3, int n4, int n5) {
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        block4: {
            int n12;
            block2: {
                block3: {
                    n11 = n2 >>> 24 & 0xFF;
                    n10 = n3 >>> 24 & 0xFF;
                    n9 = n4 >>> 24 & 0xFF;
                    n8 = n5 >>> 24 & 0xFF;
                    int n13 = n11 + n10 + n9 + n8;
                    n7 = (n13 + 2) / 4;
                    String string = dB.i();
                    n12 = n13;
                    if (string == null) break block2;
                    if (n12 == 0) break block3;
                    n6 = n13;
                    if (string != null) break block4;
                }
                n12 = 4;
            }
            n6 = n12;
            n11 = 1;
            n10 = 1;
            n9 = 1;
            n8 = 1;
        }
        int n14 = (n6 + 1) / 2;
        int n15 = n7 << 24 | ((n2 >>> 16 & 0xFF) * n11 + (n3 >>> 16 & 0xFF) * n10 + (n4 >>> 16 & 0xFF) * n9 + (n5 >>> 16 & 0xFF) * n8 + n14) / n6 << 16 | ((n2 >>> 8 & 0xFF) * n11 + (n3 >>> 8 & 0xFF) * n10 + (n4 >>> 8 & 0xFF) * n9 + (n5 >>> 8 & 0xFF) * n8 + n14) / n6 << 8 | ((n2 >>> 0 & 0xFF) * n11 + (n3 >>> 0 & 0xFF) * n10 + (n4 >>> 0 & 0xFF) * n9 + (n5 >>> 0 & 0xFF) * n8 + n14) / n6 << 0;
        return n15;
    }

    public static void a(u u2, int[] arrn, int n2, int n3, boolean n4, boolean n5) {
        String string = dB.i();
        int n6 = n4;
        if (string != null) {
            n6 = n6 != 0 ? 9729 : 9728;
        }
        int n7 = n6;
        int n8 = n5;
        if (string != null) {
            n8 = n8 != 0 ? 10496 : 10497;
        }
        int n9 = n8;
        int n10 = n2 * n3;
        IntBuffer intBuffer = s.c(n10);
        intBuffer.clear();
        intBuffer.put(arrn, 0, n10).position(0).limit(n10);
        v.t(u2.b);
        GL11.glTexImage2D((int)3553, (int)0, (int)6408, (int)n2, (int)n3, (int)0, (int)32993, (int)33639, (IntBuffer)intBuffer);
        GL11.glTexParameteri((int)3553, (int)10241, (int)n7);
        GL11.glTexParameteri((int)3553, (int)10240, (int)n7);
        GL11.glTexParameteri((int)3553, (int)10242, (int)n9);
        GL11.glTexParameteri((int)3553, (int)10243, (int)n9);
        intBuffer.put(arrn, n10, n10).position(0).limit(n10);
        v.t(u2.c);
        GL11.glTexImage2D((int)3553, (int)0, (int)6408, (int)n2, (int)n3, (int)0, (int)32993, (int)33639, (IntBuffer)intBuffer);
        GL11.glTexParameteri((int)3553, (int)10241, (int)n7);
        GL11.glTexParameteri((int)3553, (int)10240, (int)n7);
        GL11.glTexParameteri((int)3553, (int)10242, (int)n9);
        GL11.glTexParameteri((int)3553, (int)10243, (int)n9);
        intBuffer.put(arrn, n10 * 2, n10).position(0).limit(n10);
        v.t(u2.a);
        GL11.glTexImage2D((int)3553, (int)0, (int)6408, (int)n2, (int)n3, (int)0, (int)32993, (int)33639, (IntBuffer)intBuffer);
        GL11.glTexParameteri((int)3553, (int)10241, (int)n7);
        GL11.glTexParameteri((int)3553, (int)10240, (int)n7);
        GL11.glTexParameteri((int)3553, (int)10242, (int)n9);
        GL11.glTexParameteri((int)3553, (int)10243, (int)n9);
        v.t(u2.b);
    }

    public static int a(int n2, int n3, int n4) {
        int n5 = 255 - n4;
        return ((n2 >>> 24 & 0xFF) * n4 + (n3 >>> 24 & 0xFF) * n5) / 255 << 24 | ((n2 >>> 16 & 0xFF) * n4 + (n3 >>> 16 & 0xFF) * n5) / 255 << 16 | ((n2 >>> 8 & 0xFF) * n4 + (n3 >>> 8 & 0xFF) * n5) / 255 << 8 | ((n2 >>> 0 & 0xFF) * n4 + (n3 >>> 0 & 0xFF) * n5) / 255 << 0;
    }

    static void a() {
        block3: {
            d d10;
            block2: {
                net.minecraft.client.j.u u2 = Q.P().aN();
                d d11 = u2.a(net.minecraft.client.j.j.x);
                String string = dB.i();
                d10 = d11;
                if (string == null) break block2;
                if (d10 == null) break block3;
                d10 = d11;
            }
            u u3 = d10.a();
            v.t(u3.b);
            GL11.glTexParameteri((int)3553, (int)10241, (int)cS.dt[cS.bx]);
            GL11.glTexParameteri((int)3553, (int)10240, (int)cS.H[cS.ci]);
            v.t(u3.c);
            GL11.glTexParameteri((int)3553, (int)10241, (int)cS.dt[cS.dG]);
            GL11.glTexParameteri((int)3553, (int)10240, (int)cS.H[cS.cN]);
            v.t(u3.a);
            GL11.glTexParameteri((int)3553, (int)10241, (int)cS.dt[cS.co]);
            GL11.glTexParameteri((int)3553, (int)10240, (int)cS.H[cS.dV]);
            v.t(0);
        }
    }

    public static void a(int n2, int[] arrn, int n3, int n4, f f10) {
        u u2 = f10.a();
        v.t(u2.b);
        s.a(arrn, n3, n4, 0, 0, 0);
        v.t(u2.c);
        s.a(arrn, n3, n4, 0, 0, 1);
        v.t(u2.a);
        s.a(arrn, n3, n4, 0, 0, 2);
        v.t(u2.b);
    }

    public static void a(int[] arrn, int n2, int n3, int n4, int n5) {
        int n6 = 0;
        String string = dB.i();
        int n7 = n2;
        int n8 = n3;
        int n9 = n4;
        int n10 = n5;
        while (n7 > 0) {
            int n11 = n8;
            if (string != null) {
                if (n11 <= 0) break;
                GL11.glCopyTexSubImage2D((int)3553, (int)n6, (int)n9, (int)n10, (int)0, (int)0, (int)n7, (int)n8);
                ++n6;
                n7 /= 2;
                n8 /= 2;
                n9 /= 2;
                n11 = n10 = n10 / 2;
            }
            if (string != null) continue;
        }
    }

    public static BufferedImage a(net.minecraft.ar.v v2) {
        String string = dB.i();
        try {
            InputStream inputStream;
            net.minecraft.ar.v v3 = v2;
            if (string != null) {
                if (!fU.b(v3)) {
                    return null;
                }
                v3 = v2;
            }
            InputStream inputStream2 = inputStream = fU.a(v3);
            if (string != null) {
                if (inputStream2 == null) {
                    return null;
                }
                inputStream2 = inputStream;
            }
            BufferedImage bufferedImage = ImageIO.read(inputStream2);
            inputStream.close();
            return bufferedImage;
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public static void a(t t2, net.minecraft.ar.v v2, int n2, int n3, int[] arrn) {
        block2: {
            String string = dB.i();
            boolean bl2 = cS.o;
            if (string != null) {
                if (bl2) {
                    s.a(t2, s.a(v2, "n"), n2, n3, arrn, n2 * n3, -8421377);
                }
                bl2 = cS.aT;
            }
            if (!bl2) break block2;
            s.a(t2, s.a(v2, "s"), n2, n3, arrn, n2 * n3 * 2, 0);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static int a(int n2, BufferedImage bufferedImage, boolean bl2, boolean bl3, t t2, net.minecraft.ar.v v2, u u2) {
        int n3 = bufferedImage.getWidth();
        int n4 = bufferedImage.getHeight();
        int n5 = n3 * n4;
        int[] arrn = s.d(n5 * 3);
        bufferedImage.getRGB(0, 0, n3, n4, arrn, 0, n3);
        s.a(t2, v2, n3, n4, arrn);
        s.a(u2, arrn, n3, n4, bl2, bl3);
        return n2;
    }

    public static void b(u u2) {
        s.a(u2.c, u2.a);
    }

    public static void a(e e10, int n2) {
        block3: {
            int n3;
            block4: {
                u u2;
                String string;
                u u3;
                block2: {
                    u3 = e10.e;
                    string = dB.i();
                    u2 = u3;
                    if (string == null) break block2;
                    if (u2 == null) break block3;
                    e10.e = null;
                    f.remove(u3.b);
                    v.v(u3.c);
                    v.v(u3.a);
                    u2 = u3;
                }
                n3 = u2.b;
                if (string == null) break block4;
                if (n3 == n2) break block3;
                fC.c("Error : MultiTexID.base mismatch: " + u3.b + ", texid: " + n2);
                n3 = u3.b;
            }
            v.v(n3);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static boolean a(int[] var0, int var1_1, int var2_2) {
        var4_3 = var1_1 * var2_2;
        var3_4 = dB.i();
        v0 = var0[0] >>> 24;
        if (var3_4 != null) {
            if (v0 == 255) {
                v0 = var0[var4_3 - 1];
                if (var3_4 != null) {
                    if (v0 == 0) {
                        return true;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = 0;
            }
        }
        var5_5 = v0;
        do {
            if (var5_5 >= var4_3) return (boolean)0;
            var6_6 = var0[var5_5] >>> 24;
            if (var3_4 == null) continue;
            v1 = var6_6;
            if (var3_4 == null) return (boolean)v1;
            if (v1 != 0) {
                v2 = var6_6;
                if (var3_4 == null) return (boolean)v2;
                if (v2 != 255) {
                    return (boolean)1;
                }
            }
            ++var5_5;
        } while (var3_4 != null);
        return (boolean)0;
    }

    public static net.minecraft.ar.v a(net.minecraft.ar.v v2, String string) {
        String string2 = v2.a();
        String[] arrstring = string2.split(".png");
        String string3 = arrstring[0];
        return new net.minecraft.ar.v(v2.c(), string3 + "_" + string + ".png");
    }

    public static void a(net.minecraft.client.j.u u2, net.minecraft.ar.v v2) {
        j j2 = (j)u2.a(v2);
        cS.dc = j2.i;
        cS.bA = j2.h;
        n = j2.a();
        s.a(n);
    }

    public static IntBuffer c(int n2) {
        if (o.capacity() < n2) {
            int n3 = s.a(n2);
            b = BufferUtils.createByteBuffer((int)(n3 * 4));
            o = b.asIntBuffer();
        }
        return o;
    }

    static {
        p = 0x100000;
        m = 0;
        e = 0;
        a = -8421377;
        b = BufferUtils.createByteBuffer((int)0x400000);
        o = b.asIntBuffer();
        i = new int[0x100000];
        f = new HashMap<Integer, u>();
        h = null;
        q = null;
        n = null;
        c = null;
        d = 0;
        g = null;
        j = null;
        l = null;
        k = 0;
    }

    public static void a(h h2, t t2, List list) {
        block7: {
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;
            int[] arrn = null;
            String string = dB.i();
            for (Object e10 : list) {
                if (string == null) break block7;
                if (e10 != null) {
                    try {
                        net.minecraft.ar.v v2 = new net.minecraft.ar.v((String)e10);
                        InputStream inputStream = t2.a(v2).c();
                        BufferedImage bufferedImage = ImageIO.read(inputStream);
                        int n5 = n4;
                        if (string != null) {
                            if (n5 == 0) {
                                n2 = bufferedImage.getWidth();
                                n3 = bufferedImage.getHeight();
                                n4 = n2 * n3;
                                arrn = s.b(n4, 0);
                            }
                            n5 = n4 * 3;
                        }
                        int[] arrn2 = s.d(n5);
                        bufferedImage.getRGB(0, 0, n2, n3, arrn2, 0, n2);
                        s.a(t2, v2, n2, n3, arrn2);
                        for (int i2 = 0; i2 < n4; ++i2) {
                            int n6 = arrn2[i2] >>> 24 & 0xFF;
                            arrn[n4 * 0 + i2] = s.a(arrn2[n4 * 0 + i2], arrn[n4 * 0 + i2], n6);
                            arrn[n4 * 1 + i2] = s.a(arrn2[n4 * 1 + i2], arrn[n4 * 1 + i2], n6);
                            arrn[n4 * 2 + i2] = s.a(arrn2[n4 * 2 + i2], arrn[n4 * 2 + i2], n6);
                            if (string != null && string != null) continue;
                            break;
                        }
                    }
                    catch (IOException iOException) {
                        iOException.printStackTrace();
                    }
                }
                if (string != null) continue;
            }
            s.a(h2.a(), arrn, n2, n3, false, false);
        }
    }

    public static int b(int n2) {
        int n3 = 0;
        String string = dB.i();
        int n4 = n2 & 0xFFFF0000;
        if (string != null) {
            if (n4 != 0) {
                n3 += 16;
                n2 >>= 16;
            }
            n4 = n2 & 0xFF00;
        }
        if (string != null) {
            if (n4 != 0) {
                n3 += 8;
                n2 >>= 8;
            }
            n4 = n2 & 0xF0;
        }
        if (string != null) {
            if (n4 != 0) {
                n3 += 4;
                n2 >>= 4;
            }
            n4 = n2 & 6;
        }
        if (string != null) {
            if (n4 != 0) {
                n3 += 2;
                n2 >>= 2;
            }
            n4 = n2 & 2;
        }
        if (string != null) {
            if (n4 != 0) {
                // empty if block
            }
            n4 = ++n3;
        }
        return n4;
    }

    public static void a(int[][] arrn, int n2, int n3, int n4, int n5, boolean bl2, boolean bl3) {
        block9: {
            int n6;
            String string;
            block7: {
                block8: {
                    String string2 = dB.i();
                    net.minecraft.client.j.p.a(arrn, n2, n3, n4, n5, bl2, bl3);
                    string = string2;
                    n6 = cS.o;
                    if (string == null) break block7;
                    if (n6 != 0) break block8;
                    n6 = cS.aT;
                    if (string == null) break block7;
                    if (n6 == 0) break block9;
                }
                n6 = cS.o;
            }
            if (string != null) {
                if (n6 != 0) {
                    v.t(s.n.c);
                    s.a(arrn, n2, n3, n4, n5, 1);
                }
                n6 = cS.aT;
            }
            if (string != null) {
                if (n6 != 0) {
                    v.t(s.n.a);
                    s.a(arrn, n2, n3, n4, n5, 2);
                }
                n6 = s.n.b;
            }
            v.t(n6);
        }
    }

    public static void a(int n2, int n3, int n4, f f10) {
        u u2 = f10.a();
        int[] arrn = f10.a();
        int n5 = n3 * n4;
        Arrays.fill(arrn, n5, n5 * 2, -8421377);
        Arrays.fill(arrn, n5 * 2, n5 * 3, 0);
        net.minecraft.client.j.p.a(u2.b, n3, n4);
        net.minecraft.client.j.p.a(false, false);
        net.minecraft.client.j.p.a(false);
        net.minecraft.client.j.p.a(u2.c, n3, n4);
        net.minecraft.client.j.p.a(false, false);
        net.minecraft.client.j.p.a(false);
        net.minecraft.client.j.p.a(u2.a, n3, n4);
        net.minecraft.client.j.p.a(false, false);
        net.minecraft.client.j.p.a(false);
        v.t(u2.b);
    }

    public static void a(int n2, int n3, int n4, int n5, net.minecraft.client.j.s s2, j j2) {
        u u2;
        fC.b("allocateTextureMap " + n3 + " " + n4 + " " + n5 + " ");
        h = j2;
        j2.i = n4;
        String string = dB.i();
        j2.h = n5;
        n = u2 = s.a(j2);
        net.minecraft.client.j.p.a(u2.b, n3, n4, n5);
        int n6 = cS.o;
        if (string != null) {
            if (n6 != 0) {
                net.minecraft.client.j.p.a(u2.c, n3, n4, n5);
            }
            n6 = cS.aT;
        }
        if (string != null) {
            if (n6 != 0) {
                net.minecraft.client.j.p.a(u2.a, n3, n4, n5);
            }
            n6 = n2;
        }
        v.t(n6);
    }

    public static c a(c c10) {
        q = c10;
        return c10;
    }

    public static net.minecraft.client.D.v a(t t2, net.minecraft.ar.v v2) throws IOException {
        j = t2;
        l = v2;
        return t2.a(v2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void c(int[] var0, int var1_1, int var2_2, int var3_3) {
        Math.min(var2_2, var3_3);
        var5_4 = var1_1;
        var6_5 = var2_2;
        var7_6 = var3_3;
        var8_7 = 0;
        var9_8 = 0;
        var10_9 = 0;
        var4_10 = dB.i();
        var11_11 = 0;
        while (var6_5 > 1) {
            v0 = var7_6;
            if (var4_10 == null) ** GOTO lbl43
            v1 = 1;
            if (var4_10 != null) {
                block10: {
                    if (v0 <= v1) break;
                    var8_7 = var5_4 + var6_5 * var7_6;
                    var9_8 = var6_5 / 2;
                    var10_9 = var7_6 / 2;
                    var12_12 = 0;
                    while (var12_12 < var10_9) {
                        block11: {
                            var13_13 = var8_7 + var12_12 * var9_8;
                            var14_14 = var5_4 + var12_12 * 2 * var6_5;
                            v2 = 0;
                            if (var4_10 == null) break block10;
                            for (var15_15 = v18256; var15_15 < var9_8; ++var15_15) {
                                var0[var13_13 + var15_15] = s.a(var0[var14_14 + var15_15 * 2], var0[var14_14 + var15_15 * 2 + 1], var0[var14_14 + var6_5 + var15_15 * 2], var0[var14_14 + var6_5 + var15_15 * 2 + 1]);
                                if (var4_10 != null) {
                                    if (var4_10 != null) continue;
                                }
                                break block11;
                            }
                            ++var12_12;
                        }
                        if (var4_10 != null) continue;
                    }
                    ++var11_11;
                    var6_5 = var9_8;
                    var7_6 = var10_9;
                    v2 = var5_4 = var8_7;
                }
                if (var4_10 != null) continue;
            }
            ** GOTO lbl48
        }
        block3: do {
            v0 = var11_11;
lbl43:
            // 2 sources

            if (v0 <= 0) return;
            var6_5 = var2_2 >> --var11_11;
            var7_6 = var3_3 >> var11_11;
            v3 = var8_7;
            v1 = var6_5 * var7_6;
lbl48:
            // 2 sources

            var12_12 = var5_4 = v3 - v1;
            var13_13 = 0;
            block4: while (true) {
                v4 = var13_13;
                block5: while (v4 < var7_6) {
                    v5 = 0;
                    if (var4_10 == null) continue block3;
                    for (var14_14 = v18303; var14_14 < var6_5; ++var12_12, ++var14_14) {
                        v6 = var0;
                        v7 = var12_12;
                        if (var4_10 != null) {
                            v4 = v6[v7];
                            if (var4_10 == null) continue block5;
                            if (v4 != 0) continue;
                            v6 = var0;
                            v7 = var12_12;
                        }
                        v6[v7] = var0[var8_7 + var13_13 / 2 * var9_8 + var14_14 / 2] & 0xFFFFFF;
                        if (var4_10 != null) continue;
                    }
                    ++var13_13;
                    if (var4_10 != null) continue block4;
                }
                break;
            }
            var8_7 = var5_4;
            v5 = var9_8 = var6_5;
        } while (var4_10 != null);
    }

    public static void b(int[][] arrn, int n2, int n3, int n4, int n5, boolean bl2, boolean bl3) {
        int[][] arrn2;
        String string = dB.i();
        net.minecraft.client.j.p.a(arrn, n2, n3, n4, n5, bl2, bl3);
        boolean bl4 = false;
        String string2 = string;
        int n6 = cS.o;
        if (string2 != null) {
            if (n6 != 0) {
                arrn2 = s.a(g + "_n", n2, n3, arrn.length, bl4, -8421377);
                v.t(s.n.c);
                net.minecraft.client.j.p.a(arrn2, n2, n3, n4, n5, bl2, bl3);
            }
            n6 = cS.aT;
        }
        if (string2 != null) {
            if (n6 != 0) {
                arrn2 = s.a(g + "_s", n2, n3, arrn.length, bl4, 0);
                v.t(s.n.a);
                net.minecraft.client.j.p.a(arrn2, n2, n3, n4, n5, bl2, bl3);
            }
            n6 = s.n.b;
        }
        v.t(n6);
    }

    public static void a(c c10, int[] arrn) {
    }

    public static void b(int n2, int n3, int n4) {
        int n5;
        block4: {
            block5: {
                String string = dB.i();
                n5 = cS.dj;
                if (string == null) break block4;
                if (n5 == 0) break block5;
                n5 = v.H();
                if (string == null) break block4;
                if (n5 == 33984) {
                    v.u(33986);
                    v.t(n3);
                    v.u(33987);
                    v.t(n4);
                    v.u(33984);
                }
            }
            n5 = n2;
        }
        v.t(n5);
    }

    public static void a(u u2) {
        int n2;
        block8: {
            block9: {
                c = u2;
                String string = dB.i();
                n2 = cS.dj;
                if (string == null) break block8;
                if (n2 == 0) break block9;
                n2 = v.H();
                if (string == null) break block8;
                if (n2 == 33984) {
                    int n3 = cS.o;
                    if (string != null) {
                        if (n3 != 0) {
                            v.u(33986);
                            v.t(u2.c);
                        }
                        n3 = cS.aT;
                    }
                    if (string != null) {
                        if (n3 != 0) {
                            v.u(33987);
                            v.t(u2.a);
                        }
                        n3 = 33984;
                    }
                    v.u(n3);
                }
            }
            n2 = u2.b;
        }
        v.t(n2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void a(int[] var0, int var1_1, int var2_2, int var3_3) {
        Math.min(var2_2, var3_3);
        var5_4 = var1_1;
        var6_5 = var2_2;
        var7_6 = var3_3;
        var8_7 = 0;
        var9_8 = 0;
        var10_9 = 0;
        var11_10 = 0;
        var4_11 = dB.i();
        while (var6_5 > 1) {
            v0 = var7_6;
            if (var4_11 == null) ** GOTO lbl43
            v1 = 1;
            if (var4_11 != null) {
                block10: {
                    if (v0 <= v1) break;
                    var8_7 = var5_4 + var6_5 * var7_6;
                    var9_8 = var6_5 / 2;
                    var10_9 = var7_6 / 2;
                    var12_12 = 0;
                    while (var12_12 < var10_9) {
                        block11: {
                            var13_13 = var8_7 + var12_12 * var9_8;
                            var14_14 = var5_4 + var12_12 * 2 * var6_5;
                            v2 = 0;
                            if (var4_11 == null) break block10;
                            for (var15_15 = v19862; var15_15 < var9_8; ++var15_15) {
                                var0[var13_13 + var15_15] = s.b(var0[var14_14 + var15_15 * 2], var0[var14_14 + var15_15 * 2 + 1], var0[var14_14 + var6_5 + var15_15 * 2], var0[var14_14 + var6_5 + var15_15 * 2 + 1]);
                                if (var4_11 != null) {
                                    if (var4_11 != null) continue;
                                }
                                break block11;
                            }
                            ++var12_12;
                        }
                        if (var4_11 != null) continue;
                    }
                    ++var11_10;
                    var6_5 = var9_8;
                    var7_6 = var10_9;
                    v2 = var5_4 = var8_7;
                }
                if (var4_11 != null) continue;
            }
            ** GOTO lbl48
        }
        block3: do {
            v0 = var11_10;
lbl43:
            // 2 sources

            if (v0 <= 0) return;
            var6_5 = var2_2 >> --var11_10;
            var7_6 = var3_3 >> var11_10;
            v3 = var8_7;
            v1 = var6_5 * var7_6;
lbl48:
            // 2 sources

            var12_12 = var5_4 = v3 - v1;
            var13_13 = 0;
            block4: while (true) {
                v4 = var13_13;
                block5: while (v4 < var7_6) {
                    v5 = 0;
                    if (var4_11 == null) continue block3;
                    for (var14_14 = v19909; var14_14 < var6_5; ++var12_12, ++var14_14) {
                        v6 = var0;
                        v7 = var12_12;
                        if (var4_11 != null) {
                            v4 = v6[v7];
                            if (var4_11 == null) continue block5;
                            if (v4 != 0) continue;
                            v6 = var0;
                            v7 = var12_12;
                        }
                        v6[v7] = var0[var8_7 + var13_13 / 2 * var9_8 + var14_14 / 2] & 0xFFFFFF;
                        if (var4_11 != null) continue;
                    }
                    ++var13_13;
                    if (var4_11 != null) continue block4;
                }
                break;
            }
            var8_7 = var5_4;
            v5 = var9_8 = var6_5;
        } while (var4_11 != null);
    }

    public static int a(int n2) {
        int n3 = n2 - 1;
        n3 |= n3 >> 1;
        n3 |= n3 >> 2;
        n3 |= n3 >> 4;
        n3 |= n3 >> 8;
        n3 |= n3 >> 16;
        return n3 + 1;
    }

    public static void a(int[] arrn, int n2, int n3, int n4, int n5, int n6) {
        block0: {
            int n7 = n2 * n3;
            IntBuffer intBuffer = s.c(n7);
            intBuffer.clear();
            int n8 = n6 * n7;
            if (arrn.length < n8 + n7) break block0;
            intBuffer.put(arrn, n8, n7).position(0).limit(n7);
            GL11.glTexSubImage2D((int)3553, (int)0, (int)n4, (int)n5, (int)n2, (int)n3, (int)32993, (int)33639, (IntBuffer)intBuffer);
            intBuffer.clear();
        }
    }

    public static int[][] a(int n2, int n3, int[][] arrn) {
        int[][] arrn2;
        block6: {
            int n4 = 1;
            String string = dB.i();
            block0: while (true) {
                int n5 = n4;
                block1: while (n5 <= n2) {
                    arrn2 = arrn;
                    if (string == null) break block6;
                    if (arrn2[n4] == null) {
                        int n6 = n3 >> n4;
                        int n7 = n6 * 2;
                        int[] arrn3 = arrn[n4 - 1];
                        arrn[n4] = new int[n6 * n6];
                        int[] arrn4 = arrn[n4];
                        int n8 = 0;
                        while (n8 < n6) {
                            block7: {
                                n5 = 0;
                                if (string == null) continue block1;
                                for (int i2 = v19992; i2 < n6; ++i2) {
                                    int n9 = n8 * 2 * n7 + i2 * 2;
                                    arrn4[n8 * n6 + i2] = s.b(arrn3[n9], arrn3[n9 + 1], arrn3[n9 + n7], arrn3[n9 + n7 + 1]);
                                    if (string != null) {
                                        if (string != null) continue;
                                    }
                                    break block7;
                                }
                                ++n8;
                            }
                            if (string != null) continue;
                        }
                    }
                    ++n4;
                    if (string != null) continue block0;
                }
                break;
            }
            arrn2 = arrn;
        }
        return arrn2;
    }

    public static int b(int n2, int n3, int n4, int n5) {
        int n6 = ((n2 >>> 24 & 0xFF) + (n3 >>> 24 & 0xFF) + (n4 >>> 24 & 0xFF) + (n5 >>> 24 & 0xFF) + 2) / 4 << 24 | ((n2 >>> 16 & 0xFF) + (n3 >>> 16 & 0xFF) + (n4 >>> 16 & 0xFF) + (n5 >>> 16 & 0xFF) + 2) / 4 << 16 | ((n2 >>> 8 & 0xFF) + (n3 >>> 8 & 0xFF) + (n4 >>> 8 & 0xFF) + (n5 >>> 8 & 0xFF) + 2) / 4 << 8 | ((n2 >>> 0 & 0xFF) + (n3 >>> 0 & 0xFF) + (n4 >>> 0 & 0xFF) + (n5 >>> 0 & 0xFF) + 2) / 4 << 0;
        return n6;
    }

    public static String a(String string) {
        g = string;
        return string;
    }

    public static int[] d(int n2) {
        String string = dB.i();
        int[] arrn = i;
        if (string != null) {
            if (arrn == null) {
                i = new int[0x100000];
            }
            arrn = i;
        }
        if (string != null) {
            if (arrn.length < n2) {
                i = new int[s.a(n2)];
            }
            arrn = i;
        }
        return arrn;
    }

    public static void a(int[][] arrn, int n2, int n3, int n4, int n5, int n6) {
        int n7 = n2 * n3;
        IntBuffer intBuffer = s.c(n7);
        int n8 = arrn.length;
        int n9 = 0;
        int n10 = n2;
        int n11 = n3;
        String string = dB.i();
        int n12 = n4;
        int n13 = n5;
        while (n10 > 0) {
            int n14 = n11;
            if (string != null) {
                if (n14 <= 0) break;
                n14 = n9;
            }
            int n15 = n8;
            if (string != null) {
                if (n14 >= n15) break;
                n14 = n10;
                n15 = n11;
            }
            int n16 = n14 * n15;
            int[] arrn2 = arrn[n9];
            intBuffer.clear();
            int n17 = arrn2.length;
            int n18 = n16 * (n6 + 1);
            if (string != null) {
                if (n17 >= n18) {
                    intBuffer.put(arrn2, n16 * n6, n16).position(0).limit(n16);
                    GL11.glTexSubImage2D((int)3553, (int)n9, (int)n12, (int)n13, (int)n10, (int)n11, (int)32993, (int)33639, (IntBuffer)intBuffer);
                }
                n10 >>= 1;
                n11 >>= 1;
                n12 >>= 1;
                n17 = n13;
                n18 = 1;
            }
            n13 = n17 >> n18;
            ++n9;
            if (string != null) continue;
        }
        intBuffer.clear();
    }

    public static void a(d d10) {
        block4: {
            int n2;
            block2: {
                block3: {
                    int n3 = d10.c();
                    String string = dB.i();
                    n2 = d10 instanceof j;
                    if (string == null) break block2;
                    if (n2 == 0) break block3;
                    cS.dc = ((j)d10).i;
                    cS.bA = ((j)d10).h;
                    s.a(d10.a());
                    if (string != null) break block4;
                }
                cS.dc = 0;
                n2 = 0;
            }
            cS.bA = n2;
            s.a(d10.a());
        }
    }

    public static void b(int[] arrn, int n2, int n3, int n4) {
    }

    public static void f(int n2) {
        u u2 = f.get(n2);
        s.a(u2);
    }

    public static int[] a(BufferedImage bufferedImage, int n2, int n3, int n4, int n5, int[] arrn, int n6, int n7) {
        k = n4 * n5;
        bufferedImage.getRGB(n2, n3, n4, n5, arrn, n6, n7);
        s.a(j, l, n4, n5, arrn);
        return arrn;
    }

    public static u a(e e10) {
        u u2 = e10.e;
        if (u2 == null) {
            int n2 = e10.c();
            u2 = f.get(n2);
            if (u2 == null) {
                u2 = new u(n2, GL11.glGenTextures(), GL11.glGenTextures());
                f.put(n2, u2);
            }
            e10.e = u2;
        }
        return u2;
    }
}

