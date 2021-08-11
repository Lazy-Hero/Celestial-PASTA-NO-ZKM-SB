/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;
import javax.imageio.ImageIO;
import net.minecraft.ar.v;
import net.minecraft.client.D.a;
import net.minecraft.client.l.c;

public class g8 {
    private static /* synthetic */ dE[] a;

    public static dE a(Properties properties, v v2) {
        String string;
        block11: {
            block12: {
                block14: {
                    byte[] arrby;
                    int n2;
                    int n3;
                    int n4;
                    int n5;
                    String string2;
                    String string3;
                    String string4;
                    block18: {
                        block17: {
                            int n6;
                            block16: {
                                block15: {
                                    block13: {
                                        string4 = properties.getProperty("from");
                                        string3 = properties.getProperty("to");
                                        string2 = K.d();
                                        n5 = fU.b(properties.getProperty("x"), -1);
                                        n4 = fU.b(properties.getProperty("y"), -1);
                                        n3 = fU.b(properties.getProperty("w"), -1);
                                        n2 = fU.b(properties.getProperty("h"), -1);
                                        string = string4;
                                        if (string2 != null) break block11;
                                        if (string == null) break block12;
                                        string = string3;
                                        if (string2 != null) break block11;
                                        if (string == null) break block12;
                                        n6 = n5;
                                        if (string2 != null) break block13;
                                        if (n6 < 0) break block14;
                                        n6 = n4;
                                    }
                                    if (string2 != null) break block15;
                                    if (n6 < 0) break block14;
                                    n6 = n3;
                                }
                                if (string2 != null) break block16;
                                if (n6 < 0) break block14;
                                n6 = n2;
                            }
                            if (n6 < 0) break block14;
                            string4 = string4.trim();
                            string3 = string3.trim();
                            String string5 = fp.a(v2.a());
                            string4 = fp.a(string4, string5);
                            string3 = fp.a(string3, string5);
                            byte[] arrby2 = arrby = g8.a(string4, n3);
                            if (string2 == null) {
                                if (arrby2 == null) {
                                    fU.h("TextureAnimation: Source texture not found: " + string3);
                                    return null;
                                }
                                arrby2 = arrby;
                            }
                            int n7 = arrby2.length / 4;
                            int n8 = n7 / (n3 * n2);
                            int n9 = n8 * n3 * n2;
                            if (string2 != null) break block17;
                            if (n7 == n9) break block18;
                            fU.h("TextureAnimation: Source texture has invalid number of frames: " + string4 + ", frames: " + (float)n7 / (float)(n3 * n2));
                        }
                        return null;
                    }
                    v v3 = new v(string3);
                    try {
                        InputStream inputStream;
                        InputStream inputStream2 = inputStream = fU.a(v3);
                        if (string2 == null) {
                            if (inputStream2 == null) {
                                fU.h("TextureAnimation: Target texture not found: " + string3);
                                return null;
                            }
                            inputStream2 = inputStream;
                        }
                        BufferedImage bufferedImage = g8.a(inputStream2);
                        if (string2 == null) {
                            if (n5 + n3 <= bufferedImage.getWidth() && n4 + n2 <= bufferedImage.getHeight()) {
                                dE dE2 = new dE(string4, arrby, string3, v3, n5, n4, n3, n2, properties, 1);
                                return dE2;
                            }
                            fU.h("TextureAnimation: Animation coordinates are outside the target texture: " + string3);
                        }
                        return null;
                    }
                    catch (IOException iOException) {
                        fU.h("TextureAnimation: Target texture not found: " + string3);
                        return null;
                    }
                }
                fU.h("TextureAnimation: Invalid coordinates");
                return null;
            }
            string = "TextureAnimation: Source or target texture not specified";
        }
        fU.h(string);
        return null;
    }

    public static dE[] a(a[] arra) {
        dE[] arrdE;
        block4: {
            ArrayList<dE> arrayList = new ArrayList<dE>();
            String string = K.d();
            int n2 = 0;
            while (n2 < arra.length) {
                a a10 = arra[n2];
                dE[] arrdE2 = g8.a(a10);
                if (string == null) {
                    arrdE = arrdE2;
                    if (string != null) break block4;
                    if (arrdE != null) {
                        arrayList.addAll(Arrays.asList(arrdE2));
                    }
                    ++n2;
                }
                if (string == null) continue;
            }
            arrdE = arrayList.toArray(new dE[arrayList.size()]);
        }
        dE[] arrdE3 = arrdE;
        return arrdE3;
    }

    public static byte[] a(String string, int n2) {
        byte[] arrby = g8.b(string, n2);
        String string2 = K.d();
        byte[] arrby2 = arrby;
        if (string2 == null) {
            if (arrby2 == null) {
                arrby = g8.b("/anim" + string, n2);
            }
            arrby2 = arrby;
        }
        return arrby2;
    }

    public static dE[] a(a a10) {
        Object[] arrobject;
        block8: {
            String[] arrstring = ci.a(a10, "mcpatcher/anim/", ".properties", null);
            String string = K.d();
            if (arrstring.length <= 0) {
                return null;
            }
            ArrayList<dE> arrayList = new ArrayList<dE>();
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                arrobject = arrstring;
                if (string != null) break block8;
                String string2 = arrobject[i2];
                fU.b("Texture animation: " + string2);
                try {
                    dE dE2;
                    block10: {
                        block9: {
                            v v2 = new v(string2);
                            InputStream inputStream = a10.a(v2);
                            Properties properties = new Properties();
                            properties.load(inputStream);
                            dE2 = g8.a(properties, v2);
                            if (dE2 == null) continue;
                            v v3 = new v(dE2.c());
                            if (string != null) break block9;
                            if (fU.c(v3) == a10) break block10;
                            fU.b("Skipped: " + string2 + ", target texture not loaded from same resource pack");
                        }
                        if (string == null) continue;
                    }
                    arrayList.add(dE2);
                    continue;
                }
                catch (FileNotFoundException fileNotFoundException) {
                    fU.h("File not found: " + fileNotFoundException.getMessage());
                    continue;
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
                if (string == null) continue;
            }
            arrobject = arrayList.toArray(new dE[arrayList.size()]);
        }
        dE[] arrdE = (dE[])arrobject;
        return arrdE;
    }

    public static BufferedImage a(BufferedImage bufferedImage, int n2, int n3) {
        BufferedImage bufferedImage2 = new BufferedImage(n2, n3, 2);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.drawImage(bufferedImage, 0, 0, n2, n3, null);
        return bufferedImage2;
    }

    private static byte[] b(String string, int n2) {
        c c10 = fU.a();
        String string2 = K.d();
        try {
            int n3;
            BufferedImage bufferedImage;
            block14: {
                block15: {
                    InputStream inputStream;
                    v v2 = new v(string);
                    InputStream inputStream2 = inputStream = fU.a(v2);
                    if (string2 == null) {
                        if (inputStream2 == null) {
                            return null;
                        }
                        inputStream2 = inputStream;
                    }
                    bufferedImage = g8.a(inputStream2);
                    inputStream.close();
                    if (bufferedImage == null) {
                        return null;
                    }
                    n3 = n2;
                    if (string2 != null) break block14;
                    if (n3 <= 0) break block15;
                    n3 = bufferedImage.getWidth();
                    if (string2 != null) break block14;
                    if (n3 != n2) {
                        double d10 = bufferedImage.getHeight() / bufferedImage.getWidth();
                        int n4 = (int)((double)n2 * d10);
                        bufferedImage = g8.a(bufferedImage, n2, n4);
                    }
                }
                n3 = bufferedImage.getWidth();
            }
            int n5 = n3;
            int n6 = bufferedImage.getHeight();
            int[] arrn = new int[n5 * n6];
            byte[] arrby = new byte[n5 * n6 * 4];
            bufferedImage.getRGB(0, 0, n5, n6, arrn, 0, n5);
            int n7 = 0;
            while (n7 < arrn.length) {
                block16: {
                    int n8;
                    int n9;
                    int n10;
                    int n11;
                    block17: {
                        int n12;
                        block18: {
                            n11 = arrn[n7] >> 24 & 0xFF;
                            n10 = arrn[n7] >> 16 & 0xFF;
                            n9 = arrn[n7] >> 8 & 0xFF;
                            n8 = arrn[n7] & 0xFF;
                            if (string2 != null) break block16;
                            if (c10 == null) break block17;
                            n12 = c10.aD;
                            if (string2 != null) break block18;
                            if (n12 == 0) break block17;
                            n12 = (n10 * 30 + n9 * 59 + n8 * 11) / 100;
                        }
                        int n13 = n12;
                        int n14 = (n10 * 30 + n9 * 70) / 100;
                        int n15 = (n10 * 30 + n8 * 70) / 100;
                        n10 = n13;
                        n9 = n14;
                        n8 = n15;
                    }
                    arrby[n7 * 4 + 0] = (byte)n10;
                    arrby[n7 * 4 + 1] = (byte)n9;
                    arrby[n7 * 4 + 2] = (byte)n8;
                    arrby[n7 * 4 + 3] = (byte)n11;
                    ++n7;
                }
                if (string2 == null) continue;
            }
            return arrby;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return null;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public static void c() {
        block0: {
            a = null;
            a[] arra = fU.bf();
            a = g8.a(arra);
            if (!fU.aC()) break block0;
            g8.a();
        }
    }

    static {
        a = null;
    }

    public static void b() {
        a = null;
    }

    public static void a() {
        String string = K.d();
        if (a != null) {
            for (int i2 = 0; i2 < a.length; ++i2) {
                dE dE2 = a[i2];
                dE2.e();
                if (string == null) continue;
            }
        }
    }

    public static void d() {
        block0: {
            if (a == null || !fU.aC()) break block0;
            g8.a();
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static BufferedImage a(InputStream inputStream) throws IOException {
        BufferedImage bufferedImage = ImageIO.read(inputStream);
        inputStream.close();
        return bufferedImage;
    }
}

