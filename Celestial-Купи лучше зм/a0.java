/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;
import java.util.regex.Pattern;

public class a0 {
    public static /* synthetic */ Pattern c;
    private static /* synthetic */ String b;

    public static Color a(Color color, Color color2, double d10) {
        double d11 = d10 / 4.0 % 1.0;
        float f10 = aY.b((float)Math.sin(Math.PI * 6 * d11) / 2.0f + 0.5f, 0.0f, 1.0f);
        return new Color(aY.a((float)color.getRed() / 255.0f, (float)color2.getRed() / 255.0f, f10), aY.a((float)color.getGreen() / 255.0f, (float)color2.getGreen() / 255.0f, f10), aY.a((float)color.getBlue() / 255.0f, (float)color2.getBlue() / 255.0f, f10));
    }

    public static String b() {
        return b;
    }

    public static Color a(int n2, float f10, float f11) {
        double d10 = Math.ceil((System.currentTimeMillis() + (long)n2) / 16L);
        return Color.getHSBColor((float)((d10 %= 360.0) / 360.0), f10, f11);
    }

    public static int b(int n2, float f10, float f11) {
        double d10 = Math.ceil((System.currentTimeMillis() + (long)n2) / 16L);
        return Color.getHSBColor((float)((d10 %= 360.0) / 360.0), f10, f11).getRGB();
    }

    public static void b(String string) {
        b = string;
    }

    static {
        c = Pattern.compile("(?i)" + String.valueOf("&") + "[0-9A-FK-OR]");
        a0.b(null);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static int a(int n2, int n3) {
        return a0.a(n2, n2, n2, n3);
    }

    public static int a(int n2, int n3, int n4) {
        return a0.a(n2, n3, n4, 255);
    }

    public static Color a(Color color, int n2) {
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), n2);
    }

    public static Color b(int n2, int n3) {
        float f10;
        String string;
        block4: {
            float f11 = 2900.0f;
            string = a0.b();
            for (f10 = (float)(System.currentTimeMillis() % (long)((int)f11)) + (float)((n3 - n2) * 9); f10 > f11; f10 -= f11) {
                if (string == null) {
                    if (string == null) continue;
                }
                break block4;
            }
            f10 /= f11;
        }
        float f12 = f10;
        if (string == null) {
            if ((double)f12 > 0.5) {
                f10 = 0.5f - (f10 - 0.5f);
            }
            f12 = f10 + 0.5f;
        }
        f10 = f12;
        return new Color(f10, 0.5f, 1.0f);
    }

    public static int c(int n2, int n3) {
        double d10;
        float f10;
        String string;
        block4: {
            float f11 = bT.r.r() * 1000.0f;
            string = a0.b();
            for (f10 = (float)(System.currentTimeMillis() % (long)((int)f11) + (long)(n2 - n3) * 9L); f10 > f11; f10 -= f11) {
                if (string == null) {
                    if (string == null) continue;
                }
                break block4;
            }
            f10 /= f11;
        }
        double d11 = (d10 = (double)f10 - 0.5) == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
        if (string == null) {
            if (d11 > 0) {
                f10 = 0.5f - (f10 - 0.5f);
            }
            d11 = Color.HSBtoRGB(f10 += 0.5f, 0.6f, 1.0f);
        }
        return (int)d11;
    }

    public static int a(int n2) {
        return a0.a(n2, n2, n2, 255);
    }

    public static String a(String string) {
        return c.matcher(string).replaceAll("");
    }

    public static int a(Color color) {
        return a0.a(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
    }

    public static Color b(Color color, Color color2, double d10) {
        int n2;
        double d11;
        String string = a0.b();
        double d12 = d10;
        double d13 = 1.0;
        if (string == null) {
            if (d12 > d13) {
                d11 = d10 % 1.0;
                n2 = (int)d10;
                d10 = n2 % 2 == 0 ? d11 : 1.0 - d11;
            }
            d12 = 1.0;
            d13 = d10;
        }
        d11 = d12 - d13;
        n2 = (int)((double)color.getRed() * d11 + (double)color2.getRed() * d10);
        int n3 = (int)((double)color.getGreen() * d11 + (double)color2.getGreen() * d10);
        int n4 = (int)((double)color.getBlue() * d11 + (double)color2.getBlue() * d10);
        return new Color(n2, n3, n4);
    }

    public static int a(int n2, int n3, int n4, int n5) {
        int n6 = 0;
        n6 |= n5 << 24;
        n6 |= n2 << 16;
        n6 |= n3 << 8;
        return n6 |= n4;
    }
}

