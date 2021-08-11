/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GLContext
 */
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import net.minecraft.ar.v;
import net.minecraft.client.D.f;
import net.minecraft.client.D.t;
import net.minecraft.client.D.x;
import net.minecraft.client.Q;
import net.minecraft.client.a.aZ;
import net.minecraft.client.j.c;
import net.minecraft.client.j.d;
import net.minecraft.client.j.i;
import net.minecraft.client.j.j;
import net.minecraft.k.h;
import net.p;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;

public class fp {
    public static /* synthetic */ c aa;
    public static /* synthetic */ c E;
    public static final /* synthetic */ String aE;
    public static /* synthetic */ c M;
    public static final /* synthetic */ String X;
    public static /* synthetic */ c D;
    public static final /* synthetic */ String ax;
    public static /* synthetic */ c Y;
    public static final /* synthetic */ String V;
    public static final /* synthetic */ String C;
    public static /* synthetic */ c as;
    public static final /* synthetic */ String ae;
    public static final /* synthetic */ String r;
    public static final /* synthetic */ String o;
    public static final /* synthetic */ String k;
    public static final /* synthetic */ String j;
    public static /* synthetic */ c s;
    public static /* synthetic */ c J;
    public static final /* synthetic */ String ay;
    public static final /* synthetic */ String c;
    public static final /* synthetic */ String d;
    public static final /* synthetic */ String w;
    public static /* synthetic */ c K;
    public static final /* synthetic */ String at;
    public static final /* synthetic */ String ah;
    public static final /* synthetic */ String x;
    public static final /* synthetic */ String az;
    public static final /* synthetic */ String u;
    public static final /* synthetic */ String Z;
    public static final /* synthetic */ String ar;
    public static final /* synthetic */ String S;
    public static final /* synthetic */ String I;
    public static final /* synthetic */ String h;
    public static final /* synthetic */ String ag;
    public static final /* synthetic */ String m;
    public static final /* synthetic */ String af;
    public static final /* synthetic */ String ab;
    public static final /* synthetic */ String O;
    public static final /* synthetic */ String aG;
    public static final /* synthetic */ String ak;
    public static /* synthetic */ c e;
    public static final /* synthetic */ String an;
    public static /* synthetic */ c P;
    public static final /* synthetic */ String a;
    public static /* synthetic */ c am;
    public static final /* synthetic */ String l;
    public static /* synthetic */ c ai;
    public static final /* synthetic */ String aF;
    public static /* synthetic */ c f;
    public static final /* synthetic */ String L;
    public static /* synthetic */ c N;
    public static final /* synthetic */ String ac;
    public static final /* synthetic */ String v;
    public static final /* synthetic */ String T;
    public static final /* synthetic */ String t;
    public static /* synthetic */ c y;
    public static final /* synthetic */ String q;
    public static final /* synthetic */ String au;
    public static final /* synthetic */ String i;
    public static final /* synthetic */ String U;
    public static final /* synthetic */ String av;
    public static final /* synthetic */ String aB;
    public static final /* synthetic */ String R;
    public static final /* synthetic */ String ad;
    public static final /* synthetic */ String A;
    public static /* synthetic */ c ao;
    public static final /* synthetic */ String G;
    public static final /* synthetic */ String aH;
    public static final /* synthetic */ String g;
    public static final /* synthetic */ String ap;
    public static final /* synthetic */ String B;
    public static final /* synthetic */ String n;
    public static final /* synthetic */ String p;
    public static final /* synthetic */ String aq;
    public static /* synthetic */ c aj;
    public static final /* synthetic */ String aw;
    public static final /* synthetic */ String F;
    public static final /* synthetic */ String aD;
    public static final /* synthetic */ String aC;
    public static final /* synthetic */ String aA;
    public static final /* synthetic */ String Q;
    public static final /* synthetic */ String b;
    public static final /* synthetic */ String z;
    public static final /* synthetic */ String W;
    private static final /* synthetic */ IntBuffer H;
    public static final /* synthetic */ String al;

    public static String a(String string) {
        int n2 = string.lastIndexOf(47);
        return n2 < 0 ? "" : string.substring(0, n2);
    }

    public static void a(t t2) {
        block3: {
            block2: {
                String string = K.d();
                if (string != null) break block2;
                if (fp.e() == null) break block3;
                aS.b();
                g8.b();
                fp.c();
                aO.a();
                aB.a();
                cP.b();
                g8.c();
                fa.e();
                aS.a();
                ab.a();
                b1.c();
                net.p.a();
                cS.aM();
                gl.d();
                fU.f();
                cB.a();
                l.c();
                eO.a();
            }
            fU.o().a();
        }
    }

    public static void d() {
        block3: {
            int n2;
            block2: {
                String string = K.d();
                n2 = GLContext.getCapabilities().GL_EXT_texture_filter_anisotropic;
                if (string != null) break block2;
                if (n2 == 0) break block3;
                n2 = 34047;
            }
            float f10 = GL11.glGetFloat((int)n2);
            float f11 = fU.bh();
            f11 = Math.min(f11, f10);
            GL11.glTexParameterf((int)3553, (int)34046, (float)f11);
        }
    }

    public static BufferedImage a(BufferedImage bufferedImage, int n2) {
        int n3;
        int n4;
        String string = K.d();
        BufferedImage bufferedImage2 = bufferedImage;
        if (string == null) {
            if (bufferedImage2 == null) {
                return bufferedImage;
            }
            bufferedImage2 = bufferedImage;
        }
        if ((n4 = fp.b(n3 = bufferedImage2.getWidth(), n2)) == n3) {
            return bufferedImage;
        }
        BufferedImage bufferedImage3 = fp.b(bufferedImage, n4);
        return bufferedImage3;
    }

    public static int e(int n2) {
        int n3;
        block2: {
            int n4 = 1;
            int n5 = 0;
            String string = K.d();
            while (n4 < n2) {
                n3 = n4 * 2;
                if (string == null) {
                    n4 = n3;
                    ++n5;
                    if (string == null) continue;
                }
                break block2;
            }
            n3 = n5;
        }
        return n3;
    }

    public static int d(int n2) {
        int n3;
        block2: {
            int n4 = 1;
            String string = K.d();
            for (int i2 = 0; i2 < n2; ++i2) {
                n3 = n4 * 2;
                if (string == null) {
                    n4 = n3;
                    if (string == null) continue;
                }
                break block2;
            }
            n3 = n4;
        }
        return n3;
    }

    public static void a(c c10) {
        int[][] arrn = c10.f(0);
        String string = K.d();
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            int[] arrn2;
            block4: {
                block3: {
                    arrn2 = arrn[i2];
                    if (string != null) break block3;
                    if (arrn2 != null) break block4;
                    fU.b("" + i2 + ": " + arrn2);
                }
                if (string == null) continue;
            }
            fU.b("" + i2 + ": " + arrn2.length);
            if (string == null) continue;
        }
    }

    public static void a() {
        Object object;
        Object object2;
        block3: {
            t t2;
            block2: {
                t t3 = fU.ba();
                String string = K.d();
                t2 = t3;
                if (string != null) break block2;
                if (!(t2 instanceof f)) break block3;
                t2 = t3;
            }
            object2 = (f)t2;
            object = new cY();
            object2.a((x)object);
        }
        object2 = new eo();
        object = new v("optifine/TickableTextures");
        fU.o().a((v)object, (net.minecraft.client.j.v)object2);
    }

    public static int b(int n2, int n3) {
        int n4 = Math.max(n2, n3);
        n4 = net.minecraft.k.h.e(n4);
        return n4;
    }

    public static int[] a(c c10, int n2, int n3) {
        block6: {
            int[][] arrn;
            block7: {
                int[][] arrn2;
                String string;
                block5: {
                    List<int[][]> list = c10.k();
                    string = K.d();
                    Object object = list;
                    if (string == null) {
                        if (object.size() <= n2) {
                            return null;
                        }
                        object = list.get(n2);
                    }
                    arrn = arrn2 = (int[][])object;
                    if (string != null) break block5;
                    if (arrn == null) break block6;
                    arrn = arrn2;
                }
                if (string != null) break block7;
                if (arrn.length <= n3) break block6;
                arrn = arrn2;
            }
            int[] arrn3 = arrn[n3];
            return arrn3;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static BufferedImage a(String string, BufferedImage bufferedImage) {
        BufferedImage bufferedImage2;
        block6: {
            int n2;
            String string2;
            block4: {
                block5: {
                    string2 = K.d();
                    n2 = string.startsWith("/mob/zombie");
                    if (string2 != null) break block4;
                    if (n2 != 0) break block5;
                    n2 = string.startsWith("/mob/pigzombie") ? 1 : 0;
                    if (string2 != null) break block4;
                    if (n2 == 0) break block6;
                }
                n2 = bufferedImage.getWidth();
            }
            int n3 = n2;
            bufferedImage2 = bufferedImage;
            if (string2 != null) return bufferedImage2;
            int n4 = bufferedImage2.getHeight();
            if (n3 == n4 * 2) {
                BufferedImage bufferedImage3 = new BufferedImage(n3, n4 * 2, 2);
                Graphics2D graphics2D = bufferedImage3.createGraphics();
                graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                graphics2D.drawImage(bufferedImage, 0, 0, n3, n4, null);
                return bufferedImage3;
            }
        }
        bufferedImage2 = bufferedImage;
        return bufferedImage2;
    }

    public static int b() {
        int n2;
        block4: {
            int n3 = 65536;
            String string = K.d();
            while (n3 > 0) {
                int n4;
                net.minecraft.client.a.v.a(32868, 0, 6408, n3, n3, 0, 6408, 5121, null);
                int n5 = GL11.glGetError();
                n2 = n4 = net.minecraft.client.a.v.a(32868, 0, 4096);
                if (string == null) {
                    if (string == null) {
                        if (n2 != 0) {
                            return n3;
                        }
                        int n6 = n3 = n3 >> 1;
                    }
                    if (string == null) continue;
                }
                break block4;
            }
            n2 = -1;
        }
        return n2;
    }

    public static boolean c(int n2) {
        int n3 = net.minecraft.k.h.e(n2);
        String string = K.d();
        int n4 = n3;
        if (string == null) {
            n4 = n4 == n2 ? 1 : 0;
        }
        return n4 != 0;
    }

    public static String a(String string, String string2) {
        String string3;
        block17: {
            boolean bl2;
            String string4;
            block16: {
                String string5;
                String string6;
                block15: {
                    boolean bl3;
                    block14: {
                        String string7 = "assets/minecraft/";
                        string6 = K.d();
                        bl3 = string.startsWith(string7);
                        if (string6 == null) {
                            if (bl3) {
                                string = string.substring(string7.length());
                                return string;
                            }
                            bl3 = string.startsWith("./");
                        }
                        if (string6 != null) break block14;
                        if (bl3) {
                            string = string.substring(2);
                            String string8 = string2;
                            if (string6 == null) {
                                if (!string8.endsWith("/")) {
                                    string2 = string2 + "/";
                                }
                                string8 = string = string2 + string;
                            }
                            return string8;
                        }
                        string5 = string;
                        if (string6 != null) break block15;
                        bl3 = string5.startsWith("/~");
                    }
                    if (bl3) {
                        string = string.substring(1);
                    }
                    string5 = "mcpatcher/";
                }
                string4 = string5;
                bl2 = string.startsWith("~/");
                if (string6 != null) break block16;
                if (bl2) {
                    string = string.substring(2);
                    string = string4 + string;
                    return string;
                }
                string3 = string;
                if (string6 != null) break block17;
                bl2 = string3.startsWith("/");
            }
            if (bl2) {
                string = string4 + string.substring(1);
                return string;
            }
            string3 = string;
        }
        return string3;
    }

    static {
        ac = "coal_ore";
        v = "log_big_oak";
        V = "stone";
        l = "leaves_oak";
        at = "mycelium_top";
        Z = "dirt";
        G = "leaves_jungle";
        C = "glowstone";
        B = "log_spruce";
        i = "sand";
        ay = "log_acacia";
        aE = "redstone_lamp_on";
        b = "portal";
        m = "stone_slab_side";
        X = "log_oak_top";
        ar = "snow";
        O = "redstone_ore";
        al = "grass_side_overlay";
        ax = "fire_layer_1";
        p = "water_flow";
        aD = "bedrock";
        A = "obsidian";
        j = "soul_sand";
        r = "glass_pane_top";
        an = "log_big_oak_top";
        Q = "coarse_dirt";
        T = "leaves_spruce";
        aq = "minecraft:items/";
        a = "grass_side";
        aF = "lapis_ore";
        R = "leaves_big_oak";
        ae = "farmland_wet";
        g = "fire_layer_0";
        ah = "log_birch";
        k = "log_jungle";
        aC = "log_birch_top";
        I = "redstone_lamp_off";
        aw = "netherrack";
        ak = "grass_top";
        u = "clay";
        F = "iron_ore";
        ap = "leaves_birch";
        o = "sandstone_bottom";
        ag = "gold_ore";
        aH = "mycelium_side";
        S = "lava_still";
        x = "end_stone";
        W = "log_jungle_top";
        L = "clock";
        aB = "leaves_acacia";
        h = "compass";
        d = "stone_slab_top";
        w = "log_acacia_top";
        av = "water_still";
        aG = "minecraft:blocks/";
        ad = "grass_side_snowed";
        U = "diamond_ore";
        az = "glass";
        au = "leaves_spruce";
        t = "sandstone_top";
        n = "lava_flow";
        z = "log_oak";
        c = "gravel";
        q = "farmland_dry";
        af = "log_spruce_top";
        ab = "leaves_spruce_opaque";
        aA = "cactus_side";
        H = aZ.b(256);
    }

    public static int a(int n2) {
        int n3;
        block2: {
            int n4 = 1;
            String string = K.d();
            while (n4 < n2) {
                n3 = n4 * 2;
                if (string == null) {
                    n4 = n3;
                    if (string == null) continue;
                }
                break block2;
            }
            n3 = n4;
        }
        return n3;
    }

    public static int a(int n2, int n3) {
        int n4;
        block4: {
            int n5;
            String string = K.d();
            int n6 = n2;
            if (string == null) {
                if (n6 >= n3) {
                    return n2;
                }
                n6 = n5 = n2;
            }
            while (n5 < n3) {
                n4 = n5 * 2;
                if (string == null) {
                    n5 = n4;
                    if (string == null) continue;
                }
                break block4;
            }
            n4 = n5;
        }
        return n4;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static Dimension a(InputStream inputStream, String string) {
        block7: {
            Dimension dimension;
            Iterator<ImageReader> iterator = ImageIO.getImageReadersBySuffix(string);
            String string2 = K.d();
            while (true) {
                Object object = iterator;
                if (string2 == null) {
                    if (!object.hasNext()) break block7;
                    object = iterator.next();
                }
                ImageReader imageReader = (ImageReader)object;
                try {
                    ImageInputStream imageInputStream = ImageIO.createImageInputStream(inputStream);
                    imageReader.setInput(imageInputStream);
                    int n2 = imageReader.getWidth(imageReader.getMinIndex());
                    int n3 = imageReader.getHeight(imageReader.getMinIndex());
                    dimension = new Dimension(n2, n3);
                    break;
                }
                catch (IOException iOException) {}
                continue;
                finally {
                    imageReader.dispose();
                    continue;
                }
                break;
            }
            return dimension;
        }
        return null;
    }

    public static j e() {
        return net.minecraft.client.Q.P().an();
    }

    public static void a(String string, int n2, int n3, int n4, int n5) {
        File file;
        int n6;
        String string2;
        block9: {
            block11: {
                File file2;
                block10: {
                    File file3;
                    fp.b(n2);
                    String string3 = K.d();
                    GL11.glPixelStorei((int)3333, (int)1);
                    GL11.glPixelStorei((int)3317, (int)1);
                    string2 = string3;
                    File file4 = new File(string);
                    file2 = file3 = file4.getParentFile();
                    if (string2 != null) break block10;
                    if (file2 == null) break block11;
                    file2 = file3;
                }
                file2.mkdirs();
            }
            for (n6 = 0; n6 < 16; ++n6) {
                file = new File(string + "_" + n6 + ".png");
                file.delete();
                if (string2 == null) {
                    if (string2 == null) continue;
                }
                break block9;
            }
            n6 = 0;
        }
        while (n6 <= n3) {
            file = new File(string + "_" + n6 + ".png");
            int n7 = n4 >> n6;
            int n8 = n5 >> n6;
            int n9 = n7 * n8;
            IntBuffer intBuffer = BufferUtils.createIntBuffer((int)n9);
            int[] arrn = new int[n9];
            GL11.glGetTexImage((int)3553, (int)n6, (int)32993, (int)33639, (IntBuffer)intBuffer);
            intBuffer.get(arrn);
            BufferedImage bufferedImage = new BufferedImage(n7, n8, 2);
            bufferedImage.setRGB(0, 0, n7, n8, arrn, 0, n7);
            try {
                ImageIO.write((RenderedImage)bufferedImage, "png", file);
                fU.b("Exported: " + file);
            }
            catch (Exception exception) {
                fU.h("Error writing: " + file);
                fU.h("" + exception.getClass().getName() + ": " + exception.getMessage());
            }
            ++n6;
            if (string2 == null) continue;
        }
    }

    public static d a(v v2) {
        block5: {
            d d10;
            block4: {
                d d11 = fU.o().a(v2);
                String string = K.d();
                d10 = d11;
                if (string != null) break block4;
                if (d10 == null) break block5;
                d10 = d11;
            }
            return d10;
        }
        if (!fU.b(v2)) {
            return null;
        }
        i i2 = new i(v2);
        fU.o().a(v2, i2);
        return i2;
    }

    public static void c() {
        j j2 = fp.e();
        if (j2 != null) {
            String string = "minecraft:blocks/";
            N = j2.d(string + "grass_top");
            s = j2.d(string + "grass_side");
            aj = j2.d(string + "grass_side_overlay");
            J = j2.d(string + "snow");
            E = j2.d(string + "grass_side_snowed");
            f = j2.d(string + "mycelium_side");
            M = j2.d(string + "mycelium_top");
            D = j2.d(string + "water_still");
            ai = j2.d(string + "water_flow");
            Y = j2.d(string + "lava_still");
            aa = j2.d(string + "lava_flow");
            e = j2.d(string + "fire_layer_0");
            am = j2.d(string + "fire_layer_1");
            y = j2.d(string + "portal");
            K = j2.d(string + "glass");
            ao = j2.d(string + "glass_pane_top");
            String string2 = "minecraft:items/";
            as = j2.d(string2 + "compass");
            P = j2.d(string2 + "clock");
        }
    }

    public static void b(int n2) {
        net.minecraft.client.a.v.t(n2);
    }

    public static v a(v v2, String string) {
        String string2;
        String string3;
        String string4 = K.d();
        String string5 = v2.c();
        if (string4 == null) {
            if (!string5.equals("minecraft")) {
                return v2;
            }
            string5 = v2.a();
        }
        if ((string3 = fp.a(string2 = string5, string)) != string2) {
            v2 = new v(v2.c(), string3);
        }
        return v2;
    }

    public static void a(c c10, int n2) {
        block8: {
            ArrayList<int[][]> arrayList;
            int n3 = c10.f();
            int n4 = c10.b();
            String string = K.d();
            if (c10.o() < 1) {
                arrayList = new ArrayList<int[][]>();
                int[][] arrarrn = new int[n2 + 1][];
                int[] arrn = new int[n3 * n4];
                arrarrn[0] = arrn;
                arrayList.add(arrarrn);
                c10.a(arrayList);
            }
            arrayList = new ArrayList();
            int n5 = c10.o();
            for (int i2 = 0; i2 < n5; ++i2) {
                int n6;
                int n7;
                int[] arrn;
                block13: {
                    block14: {
                        int n8;
                        block16: {
                            int n9;
                            block15: {
                                block11: {
                                    block12: {
                                        int[] arrn2;
                                        block9: {
                                            block10: {
                                                arrn = fp.a(c10, i2, 0);
                                                if (string != null) break block8;
                                                arrn2 = arrn;
                                                if (string != null) break block9;
                                                if (arrn2 == null) break block10;
                                                n7 = arrn.length;
                                                n6 = 1;
                                                if (string != null) break block11;
                                                if (n7 >= n6) break block12;
                                            }
                                            arrn2 = new int[n3 * n4];
                                        }
                                        arrn = arrn2;
                                    }
                                    n7 = arrn.length;
                                    n6 = n3 * n4;
                                }
                                if (string != null) break block13;
                                if (n7 == n6) break block14;
                                n8 = (int)Math.round(Math.sqrt(arrn.length));
                                n9 = n8 * n8;
                                if (string != null) break block15;
                                if (n9 == arrn.length) break block16;
                                arrn = new int[1];
                                n9 = 1;
                            }
                            n8 = n9;
                        }
                        BufferedImage bufferedImage = new BufferedImage(n8, n8, 2);
                        bufferedImage.setRGB(0, 0, n8, n8, arrn, 0, n8);
                        BufferedImage bufferedImage2 = fp.b(bufferedImage, n3);
                        int[] arrn3 = new int[n3 * n4];
                        bufferedImage2.getRGB(0, 0, n3, n4, arrn3, 0, n3);
                        arrn = arrn3;
                    }
                    n7 = n2;
                    n6 = 1;
                }
                int[][] arrarrn = new int[n7 + n6][];
                arrarrn[0] = arrn;
                arrayList.add(arrarrn);
                if (string == null) continue;
            }
            c10.a(arrayList);
            c10.e(n2);
        }
    }

    public static BufferedImage b(BufferedImage bufferedImage, int n2) {
        BufferedImage bufferedImage2;
        block4: {
            int n3;
            Object object;
            Graphics2D graphics2D;
            int n4;
            block5: {
                block3: {
                    int n5;
                    int n6;
                    String string;
                    block2: {
                        int n7 = bufferedImage.getWidth();
                        int n8 = bufferedImage.getHeight();
                        string = K.d();
                        n4 = n8 * n2 / n7;
                        bufferedImage2 = new BufferedImage(n2, n4, 2);
                        graphics2D = bufferedImage2.createGraphics();
                        object = RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR;
                        n6 = n2;
                        n5 = n7;
                        if (string != null) break block2;
                        if (n6 < n5) break block3;
                        n6 = n2;
                        n5 = n7;
                    }
                    n3 = n6 % n5;
                    if (string != null) break block4;
                    if (n3 == 0) break block5;
                }
                object = RenderingHints.VALUE_INTERPOLATION_BILINEAR;
            }
            graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, object);
            n3 = graphics2D.drawImage(bufferedImage, 0, 0, n2, n4, null) ? 1 : 0;
        }
        return bufferedImage2;
    }
}

