/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.awt.Font;
import net.minecraft.client.a.v;
import net.minecraft.client.b.a5;
import net.minecraft.client.j.f;
import org.lwjgl.opengl.GL11;

public class gu
extends f8 {
    protected /* synthetic */ f k;
    protected /* synthetic */ a[] n;
    protected /* synthetic */ a[] m;
    private final /* synthetic */ int[] p;
    protected /* synthetic */ f j;
    protected /* synthetic */ a[] o;
    protected /* synthetic */ f l;

    public float f(String string, double d10, double d11, int n2) {
        return this.a(string, d10, d11, n2, false);
    }

    public gu(Font font, boolean bl2, boolean bl3) {
        super(font, bl2, bl3);
        this.p = new int[32];
        this.n = new a[256];
        this.o = new a[256];
        this.m = new a[256];
        this.b();
        this.a();
    }

    public static void a(String string, gu gu2, float f10, float f11, int n2) {
        gu2.f(string, (double)f10 + 0.5, f11, 0);
        gu2.f(string, (double)f10 - 0.5, f11, 0);
        gu2.f(string, f10, (double)f11 + 0.5, 0);
        gu2.f(string, f10, (double)f11 - 0.5, 0);
        gu2.a(string, f10, f11, n2);
    }

    public float a(String string, double d10, double d11, int n2) {
        this.a(string, d10 - (double)((float)this.b(string) / 2.0f) + 0.45, d11 + 0.5, n2, true);
        return this.f(string, d10 - (double)((float)this.b(string) / 2.0f), d11, n2);
    }

    public static void a(String string, a5 a52, float f10, float f11, int n2) {
        a52.b(string, f10 + 1.0f, f11, 0);
        a52.b(string, f10 - 1.0f, f11, 0);
        a52.b(string, f10, f11 + 1.0f, 0);
        a52.b(string, f10, f11 - 1.0f, 0);
        a52.b(string, f10, f11, n2);
    }

    public float d(String string, double d10, double d11, int n2) {
        float f10 = this.a(string, d10 + 0.5, d11 + 0.5, n2, true);
        return Math.max(f10, this.a(string, d10, d11, n2, false));
    }

    public float b(String string, float f10, float f11, int n2) {
        return this.a(string, f10 - (float)this.b(string) / 2.0f, f11, n2);
    }

    @Override
    public void a(boolean bl2) {
        super.a(bl2);
        this.a();
    }

    private void a(double d10, double d11, double d12, double d13, float f10) {
        GL11.glDisable((int)3553);
        GL11.glLineWidth((float)f10);
        GL11.glBegin((int)1);
        GL11.glVertex2d((double)d10, (double)d11);
        GL11.glVertex2d((double)d12, (double)d13);
        GL11.glEnd();
        GL11.glEnable((int)3553);
    }

    public float d(String string, float f10, float f11, int n2) {
        this.a(string, (double)(f10 - (float)this.b(string) / 2.0f) + 0.45, (double)f11 + 0.5, n2, true);
        return this.a(string, f10 - (float)this.b(string) / 2.0f, f11, n2);
    }

    public static void a(String string, gu gu2, float f10, float f11, int n2, boolean bl2, float f12) {
        v.M();
        v.d(f12, f12, f12);
        gu2.a(string, (double)f10, (double)f11, n2, bl2);
        v.B();
    }

    public void c(String string, double d10, double d11, int n2) {
        this.f(string, d10 - 0.5, d11, 0);
        this.f(string, d10 + 0.5, d11, 0);
        this.f(string, d10, d11 - 0.5, 0);
        this.f(string, d10, d11 + 0.5, 0);
        this.f(string, d10, d11, n2);
    }

    public float e(String string, double d10, double d11, int n2) {
        return this.f(string, d10 - (double)((float)this.b(string) / 2.0f), d11, n2);
    }

    private void b() {
        String[] arrstring = f8.d();
        for (int i2 = 0; i2 < 32; ++i2) {
            int n2;
            int n3;
            int n4;
            block7: {
                int n5;
                int n6;
                block6: {
                    int n7 = (i2 >> 3 & 1) * 85;
                    n4 = (i2 >> 2 & 1) * 170 + n7;
                    n3 = (i2 >> 1 & 1) * 170 + n7;
                    n2 = (i2 & 1) * 170 + n7;
                    n6 = i2;
                    n5 = 6;
                    if (arrstring != null) {
                        if (n6 == n5) {
                            n4 += 85;
                        }
                        n6 = i2;
                        n5 = 16;
                    }
                    if (arrstring == null) break block6;
                    if (n6 < n5) break block7;
                    n4 /= 4;
                    n3 /= 4;
                    n6 = n2;
                    n5 = 4;
                }
                n2 = n6 / n5;
            }
            this.p[i2] = (n4 & 0xFF) << 16 | (n3 & 0xFF) << 8 | n2 & 0xFF;
            if (arrstring != null) continue;
        }
    }

    public void a(a5 a52, String string, float f10, float f11, int n2) {
        a52.b(string, f10 - 0.5f, f11, 0);
        a52.b(string, f10 + 0.5f, f11, 0);
        a52.b(string, f10, f11 - 0.5f, 0);
        a52.b(string, f10, f11 + 0.5f, 0);
        a52.b(string, f10, f11, n2);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public float c(String string, float f10, float f11, int n2) {
        float f12 = this.a(string, (double)f10 + 0.5, (double)f11 + 0.5, n2, true);
        return Math.max(f12, this.a(string, (double)f10, (double)f11, n2, false));
    }

    public void b(String string, double d10, double d11, int n2) {
        this.e(string, d10 - 0.5, d11, 0);
        this.e(string, d10 + 0.5, d11, 0);
        this.e(string, d10, d11 - 0.5, 0);
        this.e(string, d10, d11 + 0.5, 0);
        this.e(string, d10, d11, n2);
    }

    @Override
    public int b(String string) {
        int n2;
        block6: {
            String[] arrstring = f8.d();
            if (string == null) {
                return 0;
            }
            int n3 = 0;
            a[] arra = this.c;
            boolean bl2 = false;
            int n4 = 0;
            int n5 = string.length();
            for (int i2 = 0; i2 < n5; ++i2) {
                int n6;
                int n7;
                block7: {
                    block8: {
                        block11: {
                            int n8;
                            block20: {
                                int n9;
                                block16: {
                                    int n10;
                                    block17: {
                                        block18: {
                                            block19: {
                                                block12: {
                                                    block13: {
                                                        block14: {
                                                            block15: {
                                                                block9: {
                                                                    block10: {
                                                                        n7 = string.charAt(i2);
                                                                        n2 = String.valueOf((char)n7).equals("\u00a7") ? 1 : 0;
                                                                        if (arrstring == null) break block6;
                                                                        if (arrstring == null) break block7;
                                                                        if (n2 == 0) break block8;
                                                                        n8 = n10 = "0123456789abcdefklmnor".indexOf(n7);
                                                                        n9 = 16;
                                                                        if (arrstring == null) break block9;
                                                                        if (n8 >= n9) break block10;
                                                                        bl2 = false;
                                                                        n4 = 0;
                                                                        if (arrstring != null) break block11;
                                                                    }
                                                                    n8 = n10;
                                                                    n9 = 17;
                                                                }
                                                                if (arrstring == null) break block12;
                                                                if (n8 != n9) break block13;
                                                                bl2 = true;
                                                                if (arrstring == null) break block14;
                                                                if (n4 == 0) break block15;
                                                                arra = this.m;
                                                                if (arrstring != null) break block11;
                                                            }
                                                            arra = this.n;
                                                        }
                                                        if (arrstring != null) break block11;
                                                    }
                                                    n8 = n10;
                                                    n9 = 20;
                                                }
                                                if (arrstring == null) break block16;
                                                if (n8 != n9) break block17;
                                                n4 = 1;
                                                if (arrstring == null) break block18;
                                                if (!bl2) break block19;
                                                arra = this.m;
                                                if (arrstring != null) break block11;
                                            }
                                            arra = this.o;
                                        }
                                        if (arrstring != null) break block11;
                                    }
                                    n8 = n10;
                                    if (arrstring == null) break block20;
                                    n9 = 21;
                                }
                                if (n8 != n9) break block11;
                                bl2 = false;
                                n8 = 0;
                            }
                            n4 = n8;
                            arra = this.c;
                        }
                        ++i2;
                        if (arrstring != null) continue;
                    }
                    n6 = n7;
                }
                int n11 = arra.length;
                if (arrstring != null) {
                    if (n6 >= n11) continue;
                    n6 = n3;
                    n11 = arra[n7].a - 8 + this.a;
                }
                n3 = n6 + n11;
                if (arrstring != null) continue;
            }
            n2 = n3 / 2;
        }
        return n2;
    }

    public float a(String string, float f10, float f11, int n2) {
        return this.a(string, (double)f10, (double)f11, n2, false);
    }

    private void a() {
        this.k = this.a(this.e.deriveFont(1), this.h, this.i, this.n);
        this.l = this.a(this.e.deriveFont(2), this.h, this.i, this.o);
        this.j = this.a(this.e.deriveFont(3), this.h, this.i, this.m);
    }

    @Override
    public void a(Font font) {
        super.a(font);
        this.a();
    }

    public float a(String string, double d10, double d11, int n2, boolean bl2) {
        block22: {
            String[] arrstring;
            block24: {
                int n3;
                block23: {
                    d10 -= 1.0;
                    arrstring = f8.d();
                    if (string == null) {
                        return 0.0f;
                    }
                    int n4 = n2;
                    int n5 = 0x20FFFFFF;
                    if (arrstring != null) {
                        if (n4 == n5) {
                            n2 = 0xFFFFFF;
                        }
                        n4 = n2;
                        n5 = -67108864;
                    }
                    n3 = n4 & n5;
                    if (arrstring != null) {
                        if (n3 == 0) {
                            n2 |= 0xFF000000;
                        }
                        n3 = bl2 ? 1 : 0;
                    }
                    if (arrstring == null) break block23;
                    if (n3 == 0) break block24;
                    n3 = (n2 & 0xFCFCFC) >> 2 | n2 & new Color(20, 20, 20, 200).getRGB();
                }
                n2 = n3;
            }
            a[] arra = this.c;
            float f10 = (float)(n2 >> 24 & 0xFF) / 255.0f;
            int n6 = 0;
            int n7 = 0;
            char c10 = '\u0000';
            char c11 = '\u0000';
            d10 *= 2.0;
            d11 = (d11 - 3.0) * 2.0;
            GL11.glPushMatrix();
            v.a(0.5, 0.5, 0.5);
            v.a();
            v.f(770, 771);
            v.b((float)(n2 >> 16 & 0xFF) / 255.0f, (float)(n2 >> 8 & 0xFF) / 255.0f, (float)(n2 & 0xFF) / 255.0f, f10);
            int n8 = string.length();
            v.x();
            v.t(this.f.c());
            GL11.glBindTexture((int)3553, (int)this.f.c());
            for (int i2 = 0; i2 < n8; ++i2) {
                char c12;
                char c13;
                block25: {
                    block26: {
                        block29: {
                            int n9;
                            int n10;
                            block42: {
                                block38: {
                                    int n11;
                                    block39: {
                                        int n12;
                                        block40: {
                                            block41: {
                                                block36: {
                                                    block37: {
                                                        block34: {
                                                            block35: {
                                                                block30: {
                                                                    block31: {
                                                                        int n13;
                                                                        block32: {
                                                                            block33: {
                                                                                block27: {
                                                                                    block28: {
                                                                                        c13 = string.charAt(i2);
                                                                                        if (arrstring == null) break block22;
                                                                                        c12 = String.valueOf(c13).equals("\u00a7");
                                                                                        if (arrstring == null) break block25;
                                                                                        if (c12 == '\u0000') break block26;
                                                                                        n11 = 21;
                                                                                        try {
                                                                                            n11 = "0123456789abcdefklmnor".indexOf(string.charAt(i2 + 1));
                                                                                        }
                                                                                        catch (Exception exception) {
                                                                                            exception.printStackTrace();
                                                                                        }
                                                                                        n10 = n11;
                                                                                        n9 = 16;
                                                                                        if (arrstring == null) break block27;
                                                                                        if (n10 >= n9) break block28;
                                                                                        n6 = 0;
                                                                                        n7 = 0;
                                                                                        c11 = '\u0000';
                                                                                        c10 = '\u0000';
                                                                                        v.t(this.f.c());
                                                                                        arra = this.c;
                                                                                        int n14 = n11;
                                                                                        if (arrstring != null) {
                                                                                            if (n14 < 0) {
                                                                                                n11 = 15;
                                                                                            }
                                                                                            n14 = bl2 ? 1 : 0;
                                                                                        }
                                                                                        if (arrstring != null) {
                                                                                            if (n14 != 0) {
                                                                                                n11 += 16;
                                                                                            }
                                                                                            n14 = this.p[n11];
                                                                                        }
                                                                                        int n15 = n14;
                                                                                        v.b((float)(n15 >> 16 & 0xFF) / 255.0f, (float)(n15 >> 8 & 0xFF) / 255.0f, (float)(n15 & 0xFF) / 255.0f, f10);
                                                                                        if (arrstring != null) break block29;
                                                                                    }
                                                                                    n10 = n11;
                                                                                    n9 = 17;
                                                                                }
                                                                                if (arrstring == null) break block30;
                                                                                if (n10 != n9) break block31;
                                                                                n6 = 1;
                                                                                n13 = n7;
                                                                                if (arrstring == null) break block32;
                                                                                if (n13 == 0) break block33;
                                                                                v.t(this.j.c());
                                                                                arra = this.m;
                                                                                if (arrstring != null) break block29;
                                                                            }
                                                                            n13 = this.k.c();
                                                                        }
                                                                        v.t(n13);
                                                                        arra = this.n;
                                                                        if (arrstring != null) break block29;
                                                                    }
                                                                    n10 = n11;
                                                                    n9 = 18;
                                                                }
                                                                if (arrstring == null) break block34;
                                                                if (n10 != n9) break block35;
                                                                c10 = '\u0001';
                                                                if (arrstring != null) break block29;
                                                            }
                                                            n10 = n11;
                                                            n9 = 19;
                                                        }
                                                        if (arrstring == null) break block36;
                                                        if (n10 != n9) break block37;
                                                        c11 = '\u0001';
                                                        if (arrstring != null) break block29;
                                                    }
                                                    n10 = n11;
                                                    n9 = 20;
                                                }
                                                if (arrstring == null) break block38;
                                                if (n10 != n9) break block39;
                                                n7 = 1;
                                                n12 = n6;
                                                if (arrstring == null) break block40;
                                                if (n12 == 0) break block41;
                                                v.t(this.j.c());
                                                arra = this.m;
                                                if (arrstring != null) break block29;
                                            }
                                            n12 = this.l.c();
                                        }
                                        v.t(n12);
                                        arra = this.o;
                                        if (arrstring != null) break block29;
                                    }
                                    n10 = n11;
                                    n9 = 21;
                                }
                                if (arrstring == null) break block42;
                                if (n10 != n9) break block29;
                                n6 = 0;
                                n7 = 0;
                                c11 = '\u0000';
                                c10 = '\u0000';
                                n10 = n2 >> 16;
                                n9 = 255;
                            }
                            v.b((float)(n10 & n9) / 255.0f, (float)(n2 >> 8 & 0xFF) / 255.0f, (float)(n2 & 0xFF) / 255.0f, f10);
                            v.t(this.f.c());
                            arra = this.c;
                        }
                        ++i2;
                        if (arrstring != null) continue;
                    }
                    c12 = c13;
                }
                if (arrstring != null) {
                    if (c12 >= arra.length) continue;
                    GL11.glBegin((int)4);
                    this.a(arra, c13, (float)d10, (float)d11);
                    GL11.glEnd();
                    c12 = c10;
                }
                if (arrstring != null) {
                    if (c12 != '\u0000') {
                        this.a(d10, d11 + (double)((float)arra[c13].b / 2.0f), d10 + (double)arra[c13].a - 8.0, d11 + (double)((float)arra[c13].b / 2.0f), 1.0f);
                    }
                    c12 = c11;
                }
                if (c12 != '\u0000') {
                    this.a(d10, d11 + (double)arra[c13].b - 2.0, d10 + (double)arra[c13].a - 8.0, d11 + (double)arra[c13].b - 2.0, 1.0f);
                }
                d10 += (double)(arra[c13].a - 8 + this.a);
                if (arrstring != null) continue;
            }
            GL11.glPopMatrix();
        }
        return (float)d10 / 2.0f;
    }

    @Override
    public void b(boolean bl2) {
        super.b(bl2);
        this.a();
    }
}

