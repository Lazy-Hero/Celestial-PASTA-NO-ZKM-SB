/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.k;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.UUID;
import net.minecraft.k.m;
import net.minecraft.k.n;

public class h {
    private static final /* synthetic */ int[] r;
    public static final /* synthetic */ float p = (float)Math.PI * 2;
    public static /* synthetic */ boolean j;
    public static final /* synthetic */ float o;
    public static final /* synthetic */ float m = 1.5707964f;
    private static final /* synthetic */ float n = (float)Math.PI * 2;
    public static final /* synthetic */ float u = (float)Math.PI / 180;
    private static final /* synthetic */ int i;
    private static final /* synthetic */ double d;
    private static final /* synthetic */ float[] f;
    private static final /* synthetic */ double[] a;
    private static final /* synthetic */ int b;
    private static /* synthetic */ String g;
    private static final /* synthetic */ float[] k;
    private static final /* synthetic */ float l = 651.8986f;
    private static final /* synthetic */ int c;
    public static final /* synthetic */ float e = (float)Math.PI;
    private static final /* synthetic */ Random h;
    private static final /* synthetic */ float t = 360.0f;
    private static final /* synthetic */ double[] q;
    private static final /* synthetic */ float s = 11.377778f;

    public static double c(double d10, double d11, double d12) {
        return (d10 - d11) / (d12 - d11);
    }

    public static int g(int n2) {
        return n2 >= 0 ? n2 : -n2;
    }

    public static int a(int n2) {
        n2 ^= n2 >>> 16;
        n2 *= -2048144789;
        n2 ^= n2 >>> 13;
        n2 *= -1028477387;
        n2 ^= n2 >>> 16;
        return n2;
    }

    public static double b(double d10) {
        double d11;
        block6: {
            double d12;
            block5: {
                boolean bl2 = net.minecraft.k.n.e();
                double d13 = (d10 %= 360.0) - 180.0;
                d12 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                if (bl2) break block5;
                if (d12 >= 0) {
                    d10 -= 360.0;
                }
                d11 = d10;
                if (bl2) break block6;
                double d14 = d11 - -180.0;
                d12 = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
            }
            if (d12 < 0) {
                d10 += 360.0;
            }
            d11 = d10;
        }
        return d11;
    }

    public static int c(double d10) {
        return (int)(d10 + 1024.0) - 1024;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int d(double d10) {
        double d11;
        boolean bl2 = net.minecraft.k.n.e();
        double d12 = d10;
        double d13 = 0.0;
        if (!bl2) {
            if (d12 >= d13) {
                d11 = d10;
                return (int)d11;
            }
            d12 = -d10;
            d13 = 1.0;
        }
        d11 = d12 + d13;
        return (int)d11;
    }

    public static double a(long[] arrl) {
        long l2;
        block2: {
            long l3 = 0L;
            long[] arrl2 = arrl;
            int n2 = arrl2.length;
            boolean bl2 = net.minecraft.k.n.e();
            for (int i2 = 0; i2 < n2; ++i2) {
                long l4 = arrl2[i2];
                l2 = l3 + l4;
                if (!bl2) {
                    l3 = l2;
                    if (!bl2) continue;
                }
                break block2;
            }
            l2 = l3;
        }
        return (double)l2 / (double)arrl.length;
    }

    public static int a(int n2, int n3) {
        int n4 = (n2 & 0xFF0000) >> 16;
        int n5 = (n3 & 0xFF0000) >> 16;
        int n6 = (n2 & 0xFF00) >> 8;
        int n7 = (n3 & 0xFF00) >> 8;
        int n8 = (n2 & 0xFF) >> 0;
        int n9 = (n3 & 0xFF) >> 0;
        int n10 = (int)((float)n4 * (float)n5 / 255.0f);
        int n11 = (int)((float)n6 * (float)n7 / 255.0f);
        int n12 = (int)((float)n8 * (float)n9 / 255.0f);
        return n2 & 0xFF000000 | n10 << 16 | n11 << 8 | n12;
    }

    public static int i(double d10) {
        int n2 = (int)d10;
        return d10 > (double)n2 ? n2 + 1 : n2;
    }

    public static double a(String string, double d10, double d11) {
        return Math.max(d11, net.minecraft.k.h.a(string, d10));
    }

    public static double h(double d10) {
        double d11 = 0.5 * d10;
        long l2 = Double.doubleToRawLongBits(d10);
        l2 = 6910469410427058090L - (l2 >> 1);
        d10 = Double.longBitsToDouble(l2);
        d10 *= 1.5 - d11 * d10 * d10;
        return d10;
    }

    public static int d(float f10) {
        int n2 = (int)f10;
        boolean bl2 = net.minecraft.k.n.e();
        float f11 = f10 - (float)n2;
        float f12 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        if (!bl2) {
            f12 = f12 < 0 ? (float)(n2 - 1) : (float)n2;
        }
        return (int)f12;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static double a(Random random, double d10, double d11) {
        double d12;
        boolean bl2 = net.minecraft.k.n.g();
        double d13 = d10;
        double d14 = d11;
        if (bl2) {
            if (d13 >= d14) {
                d12 = d10;
                return d12;
            }
            d13 = random.nextDouble() * (d11 - d10);
            d14 = d10;
        }
        d12 = d13 + d14;
        return d12;
    }

    static {
        int n2;
        c = 12;
        i = 4095;
        b = 4096;
        o = net.minecraft.k.h.a(2.0f);
        f = new float[4096];
        j = false;
        net.minecraft.k.h.b(null);
        k = new float[65536];
        h = new Random();
        for (n2 = 0; n2 < 65536; ++n2) {
            net.minecraft.k.h.k[n2] = (float)Math.sin((double)n2 * Math.PI * 2.0 / 65536.0);
        }
        for (n2 = 0; n2 < 4096; ++n2) {
            net.minecraft.k.h.f[n2] = (float)Math.sin(((float)n2 + 0.5f) / 4096.0f * ((float)Math.PI * 2));
        }
        for (n2 = 0; n2 < 360; n2 += 90) {
            net.minecraft.k.h.f[(int)((float)n2 * 11.377778f) & 4095] = (float)Math.sin((float)n2 * ((float)Math.PI / 180));
        }
        r = new int[]{0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9};
        d = Double.longBitsToDouble(4805340802404319232L);
        q = new double[257];
        a = new double[257];
        for (n2 = 0; n2 < 257; ++n2) {
            double d10 = (double)n2 / 256.0;
            double d11 = Math.asin(d10);
            net.minecraft.k.h.a[n2] = Math.cos(d11);
            net.minecraft.k.h.q[n2] = d11;
        }
    }

    public static float b(float f10) {
        float f11;
        block6: {
            float f12;
            block5: {
                boolean bl2 = net.minecraft.k.n.g();
                float f13 = (f10 %= 360.0f) - 180.0f;
                f12 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                if (!bl2) break block5;
                if (f12 >= 0) {
                    f10 -= 360.0f;
                }
                f11 = f10;
                if (!bl2) break block6;
                float f14 = f11 - -180.0f;
                f12 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
            }
            if (f12 < 0) {
                f10 += 360.0f;
            }
            f11 = f10;
        }
        return f11;
    }

    public static int b(float f10, float f11, float f12) {
        float f13;
        float f14;
        float f15;
        int n2 = (int)(f10 * 6.0f) % 6;
        float f16 = f10 * 6.0f - (float)n2;
        boolean bl2 = net.minecraft.k.n.g();
        float f17 = f12 * (1.0f - f11);
        float f18 = f12 * (1.0f - f16 * f11);
        float f19 = f12 * (1.0f - (1.0f - f16) * f11);
        switch (n2) {
            case 0: {
                f15 = f12;
                f14 = f19;
                f13 = f17;
                if (bl2) break;
            }
            case 1: {
                f15 = f18;
                f14 = f12;
                f13 = f17;
                if (bl2) break;
            }
            case 2: {
                f15 = f17;
                f14 = f12;
                f13 = f19;
                if (bl2) break;
            }
            case 3: {
                f15 = f17;
                f14 = f18;
                f13 = f12;
                if (bl2) break;
            }
            case 4: {
                f15 = f19;
                f14 = f17;
                f13 = f12;
                if (bl2) break;
            }
            case 5: {
                f15 = f12;
                f14 = f17;
                f13 = f18;
                if (bl2) break;
            }
            default: {
                throw new RuntimeException("Something went wrong when converting from HSV to RGB. Input was " + f10 + ", " + f11 + ", " + f12);
            }
        }
        int n3 = net.minecraft.k.h.c((int)(f15 * 255.0f), 0, 255);
        int n4 = net.minecraft.k.h.c((int)(f14 * 255.0f), 0, 255);
        int n5 = net.minecraft.k.h.c((int)(f13 * 255.0f), 0, 255);
        if (net.minecraft.k.m.c()) {
            net.minecraft.k.n.a(!bl2);
        }
        return n3 << 16 | n4 << 8 | n5;
    }

    public static int c(int n2, int n3) {
        return (n2 % n3 + n3) % n3;
    }

    public static int b(int n2) {
        int n3;
        block6: {
            int n4;
            block5: {
                boolean bl2 = net.minecraft.k.n.e();
                n3 = n2 %= 360;
                n4 = 180;
                if (bl2) break block5;
                if (n3 >= n4) {
                    n2 -= 360;
                }
                n3 = n2;
                if (bl2) break block6;
                n4 = -180;
            }
            if (n3 < n4) {
                n2 += 360;
            }
            n3 = n2;
        }
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int a(Random random, int n2, int n3) {
        int n4;
        boolean bl2 = net.minecraft.k.n.e();
        int n5 = n2;
        int n6 = n3;
        if (!bl2) {
            if (n5 >= n6) {
                n4 = n2;
                return n4;
            }
            n5 = random.nextInt(n3 - n2 + 1);
            n6 = n2;
        }
        n4 = n5 + n6;
        return n4;
    }

    public static int c(int n2) {
        return net.minecraft.k.h.f(n2) - (net.minecraft.k.h.d(n2) ? 0 : 1);
    }

    public static double a(double d10, double d11) {
        double d12;
        int n2;
        int n3;
        int n4;
        double d13 = d11 * d11 + d10 * d10;
        boolean bl2 = net.minecraft.k.n.g();
        int n5 = Double.isNaN(d13);
        if (bl2) {
            if (n5 != 0) {
                return Double.NaN;
            }
            double d14 = d10 - 0.0;
            n5 = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
        }
        if (bl2) {
            n5 = n5 < 0 ? 1 : 0;
        }
        int n6 = n4 = n5;
        if (bl2) {
            double d15;
            if (n6 != 0) {
                d10 = -d10;
            }
            n6 = (d15 = d11 - 0.0) == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1);
        }
        if (bl2) {
            n6 = n6 < 0 ? 1 : 0;
        }
        int n7 = n3 = n6;
        if (bl2) {
            if (n7 != 0) {
                d11 = -d11;
            }
            n7 = d10 == d11 ? 0 : (d10 > d11 ? 1 : -1);
        }
        if (bl2) {
            n7 = n2 = n7 > 0 ? 1 : 0;
        }
        if (n2 != 0) {
            d12 = d11;
            d11 = d10;
            d10 = d12;
        }
        d12 = net.minecraft.k.h.h(d13);
        double d16 = d + (d10 *= d12);
        int n8 = (int)Double.doubleToRawLongBits(d16);
        double d17 = q[n8];
        double d18 = a[n8];
        double d19 = d16 - d;
        double d20 = d10 * d18 - (d11 *= d12) * d19;
        double d21 = (6.0 + d20 * d20) * d20 * 0.16666666666666666;
        double d22 = d17 + d21;
        int n9 = n2;
        if (bl2) {
            if (n9 != 0) {
                d22 = 1.5707963267948966 - d22;
            }
            n9 = n3;
        }
        if (bl2) {
            if (n9 != 0) {
                d22 = Math.PI - d22;
            }
            n9 = n4;
        }
        if (n9 != 0) {
            d22 = -d22;
        }
        return d22;
    }

    public static UUID a(Random random) {
        long l2 = random.nextLong() & 0xFFFFFFFFFFFF0FFFL | 0x4000L;
        long l3 = random.nextLong() & 0x3FFFFFFFFFFFFFFFL | Long.MIN_VALUE;
        return new UUID(l2, l3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int d(int n2, int n3) {
        int n4;
        int n5;
        boolean bl2 = net.minecraft.k.n.e();
        int n6 = n3;
        if (!bl2) {
            if (n6 == 0) {
                return 0;
            }
            n6 = n2;
        }
        if (!bl2) {
            if (n6 == 0) {
                return n3;
            }
            n6 = n2;
        }
        if (!bl2) {
            if (n6 < 0) {
                n3 *= -1;
            }
            n6 = n2 % n3;
        }
        int n7 = n5 = n6;
        if (!bl2) {
            if (n7 == 0) {
                n4 = n2;
                return n4;
            }
            n7 = n2 + n3;
        }
        n4 = n7 - n5;
        return n4;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static float e(float f10) {
        float f11;
        boolean bl2 = net.minecraft.k.n.g();
        float f12 = f10;
        if (bl2) {
            if (f12 >= 0.0f) {
                f11 = f10;
                return f11;
            }
            f12 = f10;
        }
        f11 = -f12;
        return f11;
    }

    public static int b(int n2, int n3, int n4) {
        int n5 = (n2 << 8) + n3;
        n5 = (n5 << 8) + n4;
        return n5;
    }

    public static double a(String string, double d10) {
        try {
            return Double.parseDouble(string);
        }
        catch (Throwable throwable) {
            return d10;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int b(int n2, int n3) {
        int n4;
        boolean bl2 = net.minecraft.k.n.g();
        int n5 = n2;
        if (bl2) {
            if (n5 < 0) {
                n4 = -((-n2 - 1) / n3) - 1;
                return n4;
            }
            n5 = n2;
        }
        n4 = n5 / n3;
        return n4;
    }

    public static float e(double d10) {
        return (float)Math.sqrt(d10);
    }

    public static float a(float f10, float f11) {
        return (f10 % f11 + f11) % f11;
    }

    public static int a(String string, int n2, int n3) {
        return Math.max(n3, net.minecraft.k.h.a(string, n2));
    }

    public static float g(float f10) {
        return j ? f[(int)(f10 * 651.8986f) & 0xFFF] : k[(int)(f10 * 10430.378f) & 0xFFFF];
    }

    public static long a(int n2, int n3, int n4) {
        long l2 = (long)(n2 * 3129871) ^ (long)n4 * 116129781L ^ (long)n3;
        l2 = l2 * l2 * 42317861L + l2 * 11L;
        return l2;
    }

    public static long a(m m2) {
        return net.minecraft.k.h.a(m2.e(), m2.b(), m2.a());
    }

    public static int a(float f10, float f11, float f12) {
        return net.minecraft.k.h.b(net.minecraft.k.h.d(f10 * 255.0f), net.minecraft.k.h.d(f11 * 255.0f), net.minecraft.k.h.d(f12 * 255.0f));
    }

    public static UUID a() {
        return net.minecraft.k.h.a(h);
    }

    public static int f(int n2) {
        n2 = net.minecraft.k.h.d(n2) ? n2 : net.minecraft.k.h.e(n2);
        return r[(int)((long)n2 * 125613361L >> 27) & 0x1F];
    }

    public static String b() {
        return g;
    }

    public static int c(int n2, int n3, int n4) {
        int n5;
        block5: {
            int n6;
            block4: {
                boolean bl2 = net.minecraft.k.n.e();
                n5 = n2;
                n6 = n3;
                if (bl2) break block4;
                if (n5 < n6) {
                    return n3;
                }
                n5 = n2;
                if (bl2) break block5;
                n6 = n4;
            }
            n5 = n5 > n6 ? n4 : n2;
        }
        return n5;
    }

    public static double a(double d10) {
        return d10 - Math.floor(d10);
    }

    public static double c(double d10, double d11) {
        return (d10 % d11 + d11) % d11;
    }

    public static float c(float f10, float f11, float f12) {
        float f13;
        block5: {
            float f14;
            block4: {
                boolean bl2 = net.minecraft.k.n.e();
                f14 = f10 == f11 ? 0 : (f10 < f11 ? -1 : 1);
                if (bl2) break block4;
                if (f14 < 0) {
                    return f11;
                }
                f13 = f10;
                if (bl2) break block5;
                float f15 = f13 - f12;
                f14 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
            }
            f13 = f14 > 0 ? f12 : f10;
        }
        return f13;
    }

    public static float c(float f10) {
        return j ? f[(int)((f10 + 1.5707964f) * 651.8986f) & 0xFFF] : k[(int)(f10 * 10430.378f + 16384.0f) & 0xFFFF];
    }

    /*
     * Enabled aggressive block sorting
     */
    public static float a(Random random, float f10, float f11) {
        float f12;
        boolean bl2 = net.minecraft.k.n.e();
        float f13 = f10;
        float f14 = f11;
        if (!bl2) {
            if (f13 >= f14) {
                f12 = f10;
                return f12;
            }
            f13 = random.nextFloat() * (f11 - f10);
            f14 = f10;
        }
        f12 = f13 + f14;
        return f12;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static double a(double d10, double d11, double d12) {
        double d13;
        double d14;
        double d15;
        block6: {
            double d16;
            block5: {
                boolean bl2 = net.minecraft.k.n.e();
                double d17 = d12 - 0.0;
                d16 = d17 == 0.0 ? 0 : (d17 < 0.0 ? -1 : 1);
                if (bl2) break block5;
                if (d16 < 0) {
                    return d10;
                }
                d15 = d12;
                d14 = 1.0;
                if (bl2) break block6;
                double d18 = d15 - d14;
                d16 = d18 == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
            }
            if (d16 > 0) {
                d13 = d11;
                return d13;
            }
            d15 = d10;
            d14 = (d11 - d10) * d12;
        }
        d13 = d15 + d14;
        return d13;
    }

    public static int e(int n2) {
        int n3 = n2 - 1;
        n3 |= n3 >> 1;
        n3 |= n3 >> 2;
        n3 |= n3 >> 4;
        n3 |= n3 >> 8;
        n3 |= n3 >> 16;
        return n3 + 1;
    }

    public static boolean b(float f10, float f11) {
        boolean bl2 = net.minecraft.k.n.g();
        float f12 = net.minecraft.k.h.e(f11 - f10) - 1.0E-5f;
        float f13 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
        if (bl2) {
            f13 = f13 < 0 ? 1.0f : 0.0f;
        }
        return (boolean)f13;
    }

    public static double b(double d10, double d11, double d12) {
        double d13;
        block5: {
            double d14;
            block4: {
                boolean bl2 = net.minecraft.k.n.g();
                d14 = d10 == d11 ? 0 : (d10 < d11 ? -1 : 1);
                if (!bl2) break block4;
                if (d14 < 0) {
                    return d11;
                }
                d13 = d10;
                if (!bl2) break block5;
                double d15 = d13 - d12;
                d14 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
            }
            d13 = d14 > 0 ? d12 : d10;
        }
        return d13;
    }

    public static void b(String string) {
        g = string;
    }

    public static int f(double d10) {
        int n2 = (int)d10;
        boolean bl2 = net.minecraft.k.n.e();
        double d11 = d10 - (double)n2;
        double d12 = d11 == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
        if (!bl2) {
            d12 = d12 < 0 ? (double)(n2 - 1) : (double)n2;
        }
        return (int)d12;
    }

    public static int a(String string, int n2) {
        try {
            return Integer.parseInt(string);
        }
        catch (Throwable throwable) {
            return n2;
        }
    }

    public static double b(double d10, double d11) {
        double d12;
        block7: {
            double d13;
            block6: {
                boolean bl2 = net.minecraft.k.n.e();
                double d14 = d10 - 0.0;
                d13 = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
                if (!bl2) {
                    double d15;
                    if (d13 < 0) {
                        d10 = -d10;
                    }
                    d13 = (d15 = d11 - 0.0) == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1);
                }
                if (bl2) break block6;
                if (d13 < 0) {
                    d11 = -d11;
                }
                d12 = d10;
                if (bl2) break block7;
                double d16 = d12 - d11;
                d13 = d16 == 0.0 ? 0 : (d16 > 0.0 ? 1 : -1);
            }
            d12 = d13 > 0 ? d10 : d11;
        }
        return d12;
    }

    public static int f(float f10) {
        int n2 = (int)f10;
        return f10 > (float)n2 ? n2 + 1 : n2;
    }

    private static boolean d(int n2) {
        return n2 != 0 && (n2 & n2 - 1) == 0;
    }

    public static double a(double d10, int n2) {
        return new BigDecimal(d10).setScale(n2, RoundingMode.HALF_EVEN).doubleValue();
    }

    public static long g(double d10) {
        long l2 = (long)d10;
        return d10 < (double)l2 ? l2 - 1L : l2;
    }

    public static float a(float f10) {
        return (float)Math.sqrt(f10);
    }
}

