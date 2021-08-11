/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL15
 */
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.imageio.ImageIO;
import net.minecraft.client.Q;
import net.minecraft.client.a.v;
import org.lwjgl.BufferUtils;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;

public class cU {
    private static final /* synthetic */ Random c;
    public static /* synthetic */ List<Integer> b;
    public static /* synthetic */ List<Integer> a;

    public static int a(int n2, File file, int n3, int n4) throws IOException {
        cU.a(n2, ImageIO.read(file), n3, n4);
        return n2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static Color g() {
        return cU.a(1000, 0.6f);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static int e() {
        int n2;
        block11: {
            int n3;
            block12: {
                int n4;
                int n5;
                int[] arrn;
                block8: {
                    block7: {
                        int n6;
                        n3 = 1;
                        arrn = dv.b();
                        int n7 = Q.P().ap();
                        int n8 = n6 = Q.P().ac.b7;
                        boolean bl2 = true;
                        do {
                            block10: {
                                block9: {
                                    if (!bl2 || (bl2 = false)) break block9;
                                    if (arrn == null) break block10;
                                    if (n8 == 0) {
                                        n6 = 1000;
                                    }
                                }
                                n8 = n3;
                            }
                            if (n8 >= n6) break;
                            n2 = Q.P().P / (n3 + 1);
                            if (arrn == null) break block7;
                            n5 = 320;
                            if (arrn == null) break block8;
                            if (n2 < n5) break;
                            n2 = Q.P().aT / (n3 + 1);
                            if (arrn == null) break block7;
                            if (n2 < 240) break;
                            ++n3;
                        } while (arrn != null);
                        n2 = n7;
                    }
                    if (arrn == null) break block11;
                    if (n2 == 0) break block12;
                    n4 = n3;
                    n5 = 2;
                }
                n2 = n4 % n5;
                if (arrn == null) break block11;
                if (n2 == 0) break block12;
                n2 = n3--;
                if (arrn == null) break block11;
                if (n2 != 1) {
                    // empty if block
                }
            }
            n2 = n3;
        }
        return n2;
    }

    public static int a() {
        return Q.P().P / cU.e();
    }

    public static void a(int[] arrn) {
        cU.b(arrn[0], arrn[1], arrn[0] + arrn[2], arrn[1] + arrn[3]);
    }

    public static void a(Color color) {
        v.b((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f);
    }

    public static int c() {
        return Q.P().aT / cU.e();
    }

    static {
        c = new Random();
        a = new ArrayList<Integer>();
        b = new ArrayList<Integer>();
    }

    public static void b() {
        int n2;
        Iterator<Integer> iterator;
        int[] arrn;
        block3: {
            int[] arrn2 = dv.b();
            GL15.glBindBuffer((int)34962, (int)0);
            arrn = arrn2;
            GL11.glBindTexture((int)3553, (int)0);
            iterator = a.iterator();
            while (iterator.hasNext()) {
                n2 = iterator.next();
                GL15.glDeleteBuffers((int)n2);
                if (arrn != null) {
                    if (arrn != null) continue;
                }
                break block3;
            }
            iterator = b.iterator();
        }
        while (iterator.hasNext()) {
            n2 = iterator.next();
            GL11.glDeleteTextures((int)n2);
            if (arrn != null) continue;
        }
    }

    public static int d() {
        int n2 = GL15.glGenBuffers();
        a.add(n2);
        GL15.glBindBuffer((int)34962, (int)n2);
        return n2;
    }

    public static void a(int n2) {
        v.b((float)(n2 >> 16 & 0xFF) / 255.0f, (float)(n2 >> 8 & 0xFF) / 255.0f, (float)(n2 & 0xFF) / 255.0f, (float)(n2 >> 24 & 0xFF) / 255.0f);
    }

    public static int f() {
        return cU.c() - Mouse.getY() * cU.c() / Q.P().P - 1;
    }

    public static int i() {
        int n2 = GL11.glGenTextures();
        b.add(n2);
        return n2;
    }

    public static void b(float f10, float f11, float f12, float f13) {
        int n2 = cU.e();
        GL11.glScissor((int)((int)(f10 * (float)n2)), (int)((int)((float)Q.P().aT - f13 * (float)n2)), (int)((int)((f12 - f10) * (float)n2)), (int)((int)((f13 - f11) * (float)n2)));
    }

    public static int a(int n2, BufferedImage bufferedImage, int n3, int n4) {
        int n5;
        block3: {
            int[] arrn = new int[bufferedImage.getWidth() * bufferedImage.getHeight()];
            int[] arrn2 = dv.b();
            bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), arrn, 0, bufferedImage.getWidth());
            ByteBuffer byteBuffer = BufferUtils.createByteBuffer((int)(bufferedImage.getWidth() * bufferedImage.getHeight() * 4));
            int[] arrn3 = arrn2;
            int n6 = 0;
            while (n6 < bufferedImage.getHeight()) {
                block4: {
                    n5 = 0;
                    if (arrn3 == null) break block3;
                    for (int i2 = v998944; i2 < bufferedImage.getWidth(); ++i2) {
                        int n7 = arrn[n6 * bufferedImage.getWidth() + i2];
                        byteBuffer.put((byte)(n7 >> 16 & 0xFF));
                        byteBuffer.put((byte)(n7 >> 8 & 0xFF));
                        byteBuffer.put((byte)(n7 & 0xFF));
                        byteBuffer.put((byte)(n7 >> 24 & 0xFF));
                        if (arrn3 != null) {
                            if (arrn3 != null) continue;
                        }
                        break block4;
                    }
                    ++n6;
                }
                if (arrn3 != null) continue;
            }
            byteBuffer.flip();
            cU.a(n2, bufferedImage.getWidth(), bufferedImage.getHeight(), byteBuffer, n3, n4);
            n5 = n2;
        }
        return n5;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        int[] arrn = dv.b();
        int n8 = n6;
        int n9 = n2;
        if (arrn != null) {
            if (n8 < n9) return 0 != 0;
            n8 = n6;
            n9 = n2 + n4;
        }
        if (arrn != null) {
            if (n8 > n9) return 0 != 0;
            n8 = n7;
            n9 = n3;
        }
        if (arrn != null) {
            if (n8 < n9) return 0 != 0;
            n8 = n7;
            if (arrn == null) return n8 != 0;
            n9 = n3 + n5;
        }
        if (n8 >= n9) return 0 != 0;
        return 1 != 0;
    }

    public static int a(int n2, int n3, int n4, ByteBuffer byteBuffer, int n5, int n6) {
        GL11.glBindTexture((int)3553, (int)n2);
        GL11.glTexParameteri((int)3553, (int)10241, (int)n5);
        GL11.glTexParameteri((int)3553, (int)10240, (int)n5);
        GL11.glTexParameteri((int)3553, (int)10242, (int)n6);
        GL11.glTexParameteri((int)3553, (int)10243, (int)n6);
        GL11.glPixelStorei((int)3317, (int)1);
        GL11.glTexImage2D((int)3553, (int)0, (int)32856, (int)n3, (int)n4, (int)0, (int)6408, (int)5121, (ByteBuffer)byteBuffer);
        GL11.glBindTexture((int)3553, (int)0);
        return n2;
    }

    public static int h() {
        return Mouse.getX() * cU.a() / Q.P().P;
    }

    public static Color a(int n2, float f10) {
        float f11 = c.nextFloat();
        float f12 = (c.nextInt(n2) + n2) / n2 + n2;
        return cU.a(f11, f12, f10);
    }

    public static void a(float f10, float f11, float f12, float f13) {
        v.b(f10, f11, f12, f13);
    }

    public static Color a(float f10, float f11, float f12) {
        return Color.getHSBColor(f10, f11, f12);
    }
}

