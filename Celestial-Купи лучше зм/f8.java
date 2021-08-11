/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import net.minecraft.client.j.f;
import net.minecraft.k.m;
import org.lwjgl.opengl.GL11;

public class f8 {
    protected /* synthetic */ a[] c;
    protected /* synthetic */ f f;
    protected /* synthetic */ boolean i;
    protected /* synthetic */ Font e;
    private final /* synthetic */ float d = 512.0f;
    private static /* synthetic */ String[] g;
    protected /* synthetic */ int b;
    protected /* synthetic */ int a;
    protected /* synthetic */ boolean h;

    public void a(Font font) {
        this.e = font;
        this.f = this.a(font, this.h, this.i, this.c);
    }

    protected f a(Font font, boolean bl2, boolean bl3, a[] arra) {
        BufferedImage bufferedImage = this.b(font, bl2, bl3, arra);
        try {
            return new f(bufferedImage);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public Font b() {
        return this.e;
    }

    public static String[] d() {
        return g;
    }

    public void a(a[] arra, char c10, float f10, float f11) throws ArrayIndexOutOfBoundsException {
        try {
            this.a(f10, f11, arra[c10].a, arra[c10].b, arra[c10].e, arra[c10].d, arra[c10].a, arra[c10].b);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public f8(Font font, boolean bl2, boolean bl3) {
        this.d = 512.0f;
        this.c = new a[167];
        this.b = -1;
        this.a = 0;
        this.e = font;
        this.h = bl2;
        this.i = bl3;
        this.f = this.a(font, bl2, bl3, this.c);
    }

    public int a(String string) {
        return this.c();
    }

    protected void a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float f18 = f14 / 512.0f;
        float f19 = f15 / 512.0f;
        String[] arrstring = f8.d();
        float f20 = f16 / 512.0f;
        float f21 = f17 / 512.0f;
        GL11.glTexCoord2f((float)(f18 + f20), (float)f19);
        String[] arrstring2 = arrstring;
        GL11.glVertex2d((double)(f10 + f12), (double)f11);
        GL11.glTexCoord2f((float)f18, (float)f19);
        GL11.glVertex2d((double)f10, (double)f11);
        GL11.glTexCoord2f((float)f18, (float)(f19 + f21));
        GL11.glVertex2d((double)f10, (double)(f11 + f13));
        GL11.glTexCoord2f((float)f18, (float)(f19 + f21));
        GL11.glVertex2d((double)f10, (double)(f11 + f13));
        GL11.glTexCoord2f((float)(f18 + f20), (float)(f19 + f21));
        GL11.glVertex2d((double)(f10 + f12), (double)(f11 + f13));
        GL11.glTexCoord2f((float)(f18 + f20), (float)f19);
        GL11.glVertex2d((double)(f10 + f12), (double)f11);
        if (arrstring2 == null) {
            m.b(!m.d());
        }
    }

    public void b(boolean bl2) {
        block3: {
            block2: {
                String[] arrstring = f8.d();
                f8 f82 = this;
                if (arrstring == null) break block2;
                if (f82.i == bl2) break block3;
                this.i = bl2;
                f82 = this;
            }
            f82.f = this.a(this.e, this.h, bl2, this.c);
        }
    }

    static {
        if (f8.d() == null) {
            f8.b(new String[1]);
        }
    }

    private static ArrayIndexOutOfBoundsException a(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        return arrayIndexOutOfBoundsException;
    }

    protected BufferedImage b(Font font, boolean bl2, boolean bl3, a[] arra) {
        BufferedImage bufferedImage;
        block7: {
            int n2 = 512;
            String[] arrstring = f8.d();
            bufferedImage = new BufferedImage(n2, n2, 2);
            Graphics2D graphics2D = (Graphics2D)bufferedImage.getGraphics();
            graphics2D.setFont(font);
            String[] arrstring2 = arrstring;
            graphics2D.setColor(new Color(255, 255, 255, 0));
            graphics2D.fillRect(0, 0, n2, n2);
            graphics2D.setColor(Color.WHITE);
            graphics2D.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, bl3 ? RenderingHints.VALUE_FRACTIONALMETRICS_ON : RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
            graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, bl2 ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
            graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, bl2 ? RenderingHints.VALUE_ANTIALIAS_ON : RenderingHints.VALUE_ANTIALIAS_OFF);
            FontMetrics fontMetrics = graphics2D.getFontMetrics();
            int n3 = 0;
            int n4 = 0;
            int n5 = 1;
            for (int i2 = 0; i2 < arra.length; ++i2) {
                char c10 = (char)i2;
                a a10 = new a(this);
                Rectangle2D rectangle2D = fontMetrics.getStringBounds(String.valueOf(c10), graphics2D);
                a10.a = rectangle2D.getBounds().width + 8;
                a10.b = rectangle2D.getBounds().height;
                int n6 = n4 + a10.a;
                int n7 = n2;
                if (arrstring2 != null) {
                    if (n6 >= n7) {
                        n4 = 0;
                        n5 += n3;
                        n3 = 0;
                    }
                    n6 = a10.b;
                    n7 = n3;
                }
                if (arrstring2 != null) {
                    if (n6 > n7) {
                        n3 = a10.b;
                    }
                    a10.e = n4;
                    a10.d = n5;
                    n6 = a10.b;
                    n7 = this.b;
                }
                if (arrstring2 != null) {
                    if (n6 > n7) {
                        this.b = a10.b;
                    }
                    arra[i2] = a10;
                    graphics2D.drawString(String.valueOf(c10), n4 + 2, n5 + fontMetrics.getAscent());
                    n6 = n4;
                    n7 = a10.a;
                }
                n4 = n6 + n7;
                if (arrstring2 != null) continue;
            }
            if (!m.c()) break block7;
            f8.b(new String[4]);
        }
        return bufferedImage;
    }

    public static void b(String[] arrstring) {
        g = arrstring;
    }

    public int b(String string) {
        int n2;
        int n3;
        block4: {
            int n4 = 0;
            char[] arrc = string.toCharArray();
            int n5 = arrc.length;
            String[] arrstring = f8.d();
            int n6 = 0;
            while (n6 < n5) {
                int n7 = arrc[n6];
                if (arrstring != null) {
                    n3 = n7;
                    n2 = this.c.length;
                    if (arrstring == null) break block4;
                    if (n3 < n2) {
                        n4 += this.c[n7].a - 8 + this.a;
                    }
                    ++n6;
                }
                if (arrstring != null) continue;
            }
            n3 = n4;
            n2 = 2;
        }
        return n3 / n2;
    }

    public boolean a() {
        return this.h;
    }

    public int c() {
        return (this.b - 8) / 2;
    }

    public void a(boolean bl2) {
        block3: {
            block2: {
                String[] arrstring = f8.d();
                f8 f82 = this;
                if (arrstring == null) break block2;
                if (f82.h == bl2) break block3;
                this.h = bl2;
                f82 = this;
            }
            f82.f = this.a(this.e, bl2, this.i, this.c);
        }
    }
}

