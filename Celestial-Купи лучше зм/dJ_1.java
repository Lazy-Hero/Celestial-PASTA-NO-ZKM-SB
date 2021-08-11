/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import net.minecraft.U.x;
import net.minecraft.client.G.a;
import net.minecraft.client.a.G;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.as;
import net.minecraft.client.a.o;
import net.minecraft.client.a.v;
import net.minecraft.client.b.q;
import net.minecraft.client.y.b;
import net.minecraft.k.k;
import net.minecraft.k.l;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.w.d;
import org.lwjgl.opengl.GL11;

public class dJ
implements ag {
    private static final /* synthetic */ double f = Math.PI * 2;
    protected static /* synthetic */ float e;
    private static final /* synthetic */ a g;

    public static void a(net.minecraft.ar.v v2, float f10, float f11, float f12, float f13, Color color) {
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glEnable((int)3042);
        GL11.glDepthMask((boolean)false);
        as.c(770, 771, 1, 0);
        v.b((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f);
        b.aN().b(v2);
        q.a(f10, f11, 0.0f, 0.0f, f12, f13, f12, f13);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)2929);
        GL11.glDisable((int)2848);
    }

    public static void b(int n2) {
        float f10 = (float)(n2 & 0xFF) / 255.0f;
        float f11 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f12 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f13 = (float)(n2 >> 24 & 0xFF) / 255.0f;
        v.b(f10, f11, f12, f13);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(x x2) {
        String string = a0.b();
        boolean bl2 = dJ.b(x2.m());
        if (string != null) return bl2;
        if (bl2) return true;
        bl2 = x2.Z;
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public static double a(double d10, double d11, double d12) {
        return d11 + (d10 - d11) * d12;
    }

    public static void a(n n2, double d10, double d11, double d12) {
        double d13 = (double)n2.e() - dJ.b.aQ().i;
        double d14 = (double)n2.b() - dJ.b.aQ().k;
        double d15 = (double)n2.a() - dJ.b.aQ().g;
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)3042);
        GL11.glLineWidth((float)1.0f);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glColor4d((double)d10, (double)d11, (double)d12, (double)0.5);
        dJ.a(new k(d13, d14, d15, d13 + 1.0, d14 + 1.0, d15 + 1.0));
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
    }

    public static void a(double d10, double d11, double d12, double d13, int n2, double d14) {
        dJ.a(d10, d11, d12, d11, (float)d14, n2);
        dJ.a(d12, d11, d12, d13, (float)d14, n2);
        dJ.a(d10, d13, d12, d13, (float)d14, n2);
        dJ.a(d10, d13, d10, d11, (float)d14, n2);
    }

    public static void a(k k2, float f10, float f11, float f12, float f13) {
        W w2 = W.c();
        I i2 = w2.b();
        i2.a(7, b.m);
        i2.c(k2.e, k2.b, k2.d).a(f10, f11, f12, f13).d();
        i2.c(k2.e, k2.a, k2.d).a(f10, f11, f12, f13).d();
        i2.c(k2.f, k2.b, k2.d).a(f10, f11, f12, f13).d();
        String string = a0.b();
        i2.c(k2.f, k2.a, k2.d).a(f10, f11, f12, f13).d();
        i2.c(k2.f, k2.b, k2.g).a(f10, f11, f12, f13).d();
        i2.c(k2.f, k2.a, k2.g).a(f10, f11, f12, f13).d();
        i2.c(k2.e, k2.b, k2.g).a(f10, f11, f12, f13).d();
        i2.c(k2.e, k2.a, k2.g).a(f10, f11, f12, f13).d();
        w2.a();
        i2.a(7, b.m);
        i2.c(k2.f, k2.a, k2.d).a(f10, f11, f12, f13).d();
        i2.c(k2.f, k2.b, k2.d).a(f10, f11, f12, f13).d();
        i2.c(k2.e, k2.a, k2.d).a(f10, f11, f12, f13).d();
        i2.c(k2.e, k2.b, k2.d).a(f10, f11, f12, f13).d();
        i2.c(k2.e, k2.a, k2.g).a(f10, f11, f12, f13).d();
        i2.c(k2.e, k2.b, k2.g).a(f10, f11, f12, f13).d();
        i2.c(k2.f, k2.a, k2.g).a(f10, f11, f12, f13).d();
        i2.c(k2.f, k2.b, k2.g).a(f10, f11, f12, f13).d();
        w2.a();
        i2.a(7, b.m);
        i2.c(k2.e, k2.a, k2.d).a(f10, f11, f12, f13).d();
        i2.c(k2.f, k2.a, k2.d).a(f10, f11, f12, f13).d();
        i2.c(k2.f, k2.a, k2.g).a(f10, f11, f12, f13).d();
        i2.c(k2.e, k2.a, k2.g).a(f10, f11, f12, f13).d();
        i2.c(k2.e, k2.a, k2.d).a(f10, f11, f12, f13).d();
        i2.c(k2.e, k2.a, k2.g).a(f10, f11, f12, f13).d();
        i2.c(k2.f, k2.a, k2.g).a(f10, f11, f12, f13).d();
        i2.c(k2.f, k2.a, k2.d).a(f10, f11, f12, f13).d();
        w2.a();
        i2.a(7, b.m);
        i2.c(k2.e, k2.b, k2.d).a(f10, f11, f12, f13).d();
        i2.c(k2.f, k2.b, k2.d).a(f10, f11, f12, f13).d();
        i2.c(k2.f, k2.b, k2.g).a(f10, f11, f12, f13).d();
        i2.c(k2.e, k2.b, k2.g).a(f10, f11, f12, f13).d();
        i2.c(k2.e, k2.b, k2.d).a(f10, f11, f12, f13).d();
        i2.c(k2.e, k2.b, k2.g).a(f10, f11, f12, f13).d();
        i2.c(k2.f, k2.b, k2.g).a(f10, f11, f12, f13).d();
        i2.c(k2.f, k2.b, k2.d).a(f10, f11, f12, f13).d();
        w2.a();
        i2.a(7, b.m);
        i2.c(k2.e, k2.b, k2.d).a(f10, f11, f12, f13).d();
        i2.c(k2.e, k2.a, k2.d).a(f10, f11, f12, f13).d();
        i2.c(k2.e, k2.b, k2.g).a(f10, f11, f12, f13).d();
        i2.c(k2.e, k2.a, k2.g).a(f10, f11, f12, f13).d();
        i2.c(k2.f, k2.b, k2.g).a(f10, f11, f12, f13).d();
        i2.c(k2.f, k2.a, k2.g).a(f10, f11, f12, f13).d();
        String string2 = string;
        i2.c(k2.f, k2.b, k2.d).a(f10, f11, f12, f13).d();
        i2.c(k2.f, k2.a, k2.d).a(f10, f11, f12, f13).d();
        w2.a();
        i2.a(7, b.m);
        i2.c(k2.e, k2.a, k2.g).a(f10, f11, f12, f13).d();
        i2.c(k2.e, k2.b, k2.g).a(f10, f11, f12, f13).d();
        i2.c(k2.e, k2.a, k2.d).a(f10, f11, f12, f13).d();
        i2.c(k2.e, k2.b, k2.d).a(f10, f11, f12, f13).d();
        i2.c(k2.f, k2.a, k2.d).a(f10, f11, f12, f13).d();
        i2.c(k2.f, k2.b, k2.d).a(f10, f11, f12, f13).d();
        i2.c(k2.f, k2.a, k2.g).a(f10, f11, f12, f13).d();
        i2.c(k2.f, k2.b, k2.g).a(f10, f11, f12, f13).d();
        w2.a();
        if (string2 != null) {
            m.b(!m.c());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean a(double d10, double d11, double d12, double d13, int n2, int n3) {
        double d14;
        block5: {
            String string;
            block7: {
                block6: {
                    block4: {
                        string = a0.b();
                        double d15 = (double)n2 - d10;
                        d14 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                        if (string != null) break block4;
                        if (d14 <= 0) break block5;
                        double d16 = (double)n3 - d11;
                        d14 = d16 == 0.0 ? 0 : (d16 > 0.0 ? 1 : -1);
                    }
                    if (string != null) break block6;
                    if (d14 <= 0) break block5;
                    double d17 = (double)n2 - d12;
                    d14 = d17 == 0.0 ? 0 : (d17 < 0.0 ? -1 : 1);
                }
                if (string != null) break block7;
                if (d14 >= 0) break block5;
                double d18 = (double)n3 - d13;
                d14 = d18 == 0.0 ? 0 : (d18 < 0.0 ? -1 : 1);
            }
            if (string != null) return (boolean)d14;
            if (d14 < 0) {
                d14 = 1.0;
                return (boolean)d14;
            }
        }
        d14 = 0.0;
        return (boolean)d14;
    }

    public static void a(int n2) {
        GL11.glColor4ub((byte)((byte)(n2 >> 16 & 0xFF)), (byte)((byte)(n2 >> 8 & 0xFF)), (byte)((byte)(n2 & 0xFF)), (byte)((byte)(n2 >> 24 & 0xFF)));
    }

    public static void a(float f10, float f11, float f12, double d10) {
        net.minecraft.client.b.l l2 = new net.minecraft.client.b.l(b);
        int n2 = net.minecraft.client.b.l.c();
        GL11.glScissor((int)((int)(f10 * (float)n2)), (int)((int)(((double)l2.a() - d10) * (double)n2)), (int)((int)((f12 - f10) * (float)n2)), (int)((int)((d10 - (double)f11) * (double)n2)));
    }

    public static void a(double d10, double d11, double d12, double d13, double d14, int n2, int n3) {
        dJ.b(d10, d11, d12, d13, n3);
        dJ.a(d10, d11, d12, d13, n2, d14);
    }

    private static boolean b(k k2) {
        x x2 = b.Z();
        g.a(x2.a, x2.aF, x2.ax);
        return g.a(k2);
    }

    static {
        g = new a();
    }

    public static void a(x x2, float f10, Color color) {
        double d10;
        double d11;
        double d12;
        block4: {
            int n2;
            block2: {
                block3: {
                    boolean bl2 = dJ.b.ac.X;
                    dJ.b.ac.X = false;
                    String string = a0.b();
                    dJ.b.Y.a(f10, 2);
                    dJ.b.ac.X = bl2;
                    GL11.glPushMatrix();
                    String string2 = string;
                    GL11.glEnable((int)2848);
                    GL11.glDisable((int)2929);
                    GL11.glDisable((int)3553);
                    GL11.glDisable((int)2896);
                    GL11.glDepthMask((boolean)false);
                    GL11.glBlendFunc((int)770, (int)771);
                    GL11.glEnable((int)3042);
                    GL11.glLineWidth((float)1.5f);
                    d12 = x2.am + (x2.a - x2.am) * (double)f10 - dJ.b.aQ().m;
                    d11 = x2.af + (x2.aF - x2.af) * (double)f10 - dJ.b.aQ().u;
                    d10 = x2.n + (x2.ax - x2.n) * (double)f10 - dJ.b.aQ().j;
                    n2 = cj.b.g.c(x2.g());
                    if (string2 != null) break block2;
                    if (n2 == 0) break block3;
                    n2 = cF.m.l() ? 1 : 0;
                    if (string2 != null) break block2;
                    if (n2 == 0) break block3;
                    GL11.glColor4f((float)0.0f, (float)255.0f, (float)0.0f, (float)255.0f);
                    if (string2 == null) break block4;
                }
                n2 = color.getRed();
            }
            GL11.glColor4f((float)((float)n2 / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
        }
        l l2 = new l(0.0, 0.0, 1.0);
        l2 = l2.a((float)(-Math.toRadians(dJ.b.s.at)));
        l l3 = l2.b(-((float)Math.toRadians(dJ.b.s.e)));
        GL11.glBegin((int)2);
        GL11.glVertex3d((double)l3.e, (double)((double)dJ.b.s.l() + l3.d), (double)l3.b);
        GL11.glVertex3d((double)d12, (double)(d11 + 1.1), (double)d10);
        GL11.glEnd();
        GL11.glDisable((int)3042);
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDisable((int)2848);
        GL11.glPopMatrix();
    }

    public static void b(double d10, double d11, double d12, double d13, int n2, int n3) {
        float f10 = (float)(n2 >> 24 & 0xFF) / 255.0f;
        float f11 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f12 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f13 = (float)(n2 & 0xFF) / 255.0f;
        float f14 = (float)(n3 >> 24 & 0xFF) / 255.0f;
        float f15 = (float)(n3 >> 16 & 0xFF) / 255.0f;
        float f16 = (float)(n3 >> 8 & 0xFF) / 255.0f;
        float f17 = (float)(n3 & 0xFF) / 255.0f;
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glShadeModel((int)7425);
        GL11.glPushMatrix();
        GL11.glBegin((int)7);
        GL11.glColor4f((float)f11, (float)f12, (float)f13, (float)f10);
        GL11.glVertex2d((double)d10, (double)d11);
        GL11.glVertex2d((double)d10, (double)d13);
        GL11.glColor4f((float)f15, (float)f16, (float)f17, (float)f14);
        GL11.glVertex2d((double)d12, (double)d13);
        GL11.glVertex2d((double)d12, (double)d11);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
    }

    public static void a(k k2) {
        block0: {
            W w2 = W.c();
            String string = a0.b();
            I i2 = w2.b();
            i2.a(3, b.k);
            i2.c(k2.e, k2.b, k2.d).d();
            i2.c(k2.f, k2.b, k2.d).d();
            i2.c(k2.f, k2.b, k2.g).d();
            i2.c(k2.e, k2.b, k2.g).d();
            i2.c(k2.e, k2.b, k2.d).d();
            w2.a();
            i2.a(3, b.k);
            i2.c(k2.e, k2.a, k2.d).d();
            String string2 = string;
            i2.c(k2.f, k2.a, k2.d).d();
            i2.c(k2.f, k2.a, k2.g).d();
            i2.c(k2.e, k2.a, k2.g).d();
            i2.c(k2.e, k2.a, k2.d).d();
            w2.a();
            i2.a(1, b.k);
            i2.c(k2.e, k2.b, k2.d).d();
            i2.c(k2.e, k2.a, k2.d).d();
            i2.c(k2.f, k2.b, k2.d).d();
            i2.c(k2.f, k2.a, k2.d).d();
            i2.c(k2.f, k2.b, k2.g).d();
            i2.c(k2.f, k2.a, k2.g).d();
            i2.c(k2.e, k2.b, k2.g).d();
            i2.c(k2.e, k2.a, k2.g).d();
            w2.a();
            if (!m.c()) break block0;
            a0.b("T9FTu");
        }
    }

    public static void a(double d10, double d11, double d12, double d13, double d14, int n2, int n3, boolean bl2) {
        dJ.b(d10 - (!bl2 ? d14 : 0.0), d11 - (!bl2 ? d14 : 0.0), d12 + (!bl2 ? d14 : 0.0), d13 + (!bl2 ? d14 : 0.0), n3);
        dJ.b(d10 + (bl2 ? d14 : 0.0), d11 + (bl2 ? d14 : 0.0), d12 - (bl2 ? d14 : 0.0), d13 - (bl2 ? d14 : 0.0), n2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void a(d d10, int n2, int n3) {
        v.a();
        v.e(770, 771, 1, 0);
        v.t();
        net.minecraft.client.a.a0.b();
        b.Y().a(d10, n2, n3);
        b.Y().a(dJ.b.a6, d10, n2, n3);
        net.minecraft.client.a.a0.a();
        v.b(1.0f, 1.0f, 1.0f, 1.0f);
        v.n();
    }

    public static void a(float f10, float f11, double d10, double d11, int n2) {
        GL11.glEnable((int)3042);
        GL11.glEnable((int)2848);
        dJ.b(f10, f11, d10, d11, n2);
        GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        dJ.b(f10 * 2.0f - 1.0f, f11 * 2.0f, f10 * 2.0f, d11 * 2.0 - 1.0, n2);
        dJ.b(f10 * 2.0f, f11 * 2.0f - 1.0f, d10 * 2.0, f11 * 2.0f, n2);
        dJ.b(d10 * 2.0, f11 * 2.0f, d10 * 2.0 + 1.0, d11 * 2.0 - 1.0, n2);
        dJ.b(f10 * 2.0f, d11 * 2.0 - 1.0, d10 * 2.0, d11 * 2.0, n2);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
        GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
    }

    public static void a(double d10, double d11, double d12, double d13, int n2) {
        dJ.b(d10, d11, d10 + d12, d11 + d13, n2);
    }

    public static void a(n n2, Color color, double d10, double d11) {
        int n3;
        block4: {
            block5: {
                double d12 = (double)n2.e() - dJ.b.aQ().i;
                double d13 = (double)n2.b() - dJ.b.aQ().k;
                double d14 = (double)n2.a() - dJ.b.aQ().g;
                String string = a0.b();
                GL11.glPushMatrix();
                String string2 = string;
                GL11.glBlendFunc((int)770, (int)771);
                GL11.glEnable((int)3042);
                GL11.glLineWidth((float)2.0f);
                GL11.glDisable((int)3553);
                GL11.glDisable((int)2929);
                GL11.glDepthMask((boolean)false);
                v.b((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, 0.15f);
                dJ.a(new k(d12, d13, d14, d12 + d11, d13 + 1.0, d14 + d10), 0.0f, 0.0f, 0.0f, 0.0f);
                n3 = cj.b.i.a(c1.class).i();
                if (string2 != null) break block4;
                if (n3 == 0) break block5;
                n3 = c1.s.l() ? 1 : 0;
                if (string2 != null) break block4;
                if (n3 != 0) {
                    v.b(0.0f, 0.0f, 0.0f, 0.5f);
                    dJ.a(new k(d12, d13, d14, d12 + d11, d13 + 1.0, d14 + d10));
                }
            }
            GL11.glLineWidth((float)2.0f);
            GL11.glEnable((int)3553);
            GL11.glEnable((int)2929);
            GL11.glDepthMask((boolean)true);
            n3 = 3042;
        }
        GL11.glDisable((int)n3);
        GL11.glPopMatrix();
    }

    public static void a(x x2, float f10, float f11, float f12, float f13) {
        double d10 = dJ.a(x2.a, x2.am, dJ.b.a8.i);
        double d11 = dJ.a(x2.aF, x2.af, dJ.b.a8.i);
        double d12 = dJ.a(x2.ax, x2.n, dJ.b.a8.i);
        GL11.glPushMatrix();
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)3042);
        GL11.glLineWidth((float)2.0f);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        dJ.a(new k(x2.aF().e - 0.05 - d10 + (d10 - net.minecraft.client.F.b.l), x2.aF().b - d11 + (d11 - net.minecraft.client.F.b.r), x2.aF().d - 0.05 - d12 + (d12 - net.minecraft.client.F.b.j), x2.aF().f + 0.05 - x2.a + (x2.a - net.minecraft.client.F.b.l), x2.aF().a + 0.1 - x2.aF + (x2.aF - net.minecraft.client.F.b.r), x2.aF().g + 0.05 - x2.ax + (x2.ax - net.minecraft.client.F.b.j)), 0.0f, 0.0f, 0.0f, 0.0f);
        GL11.glLineWidth((float)2.0f);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    public static void a(double d10, double d11, double d12, double d13, float f10, int n2) {
        float f11 = (float)(n2 >> 24 & 0xFF) / 255.0f;
        float f12 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f13 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f14 = (float)(n2 & 0xFF) / 255.0f;
        v.a();
        v.L();
        v.e(770, 771, 1, 0);
        v.b(f12, f13, f14, f11);
        GL11.glPushMatrix();
        GL11.glLineWidth((float)f10);
        GL11.glBegin((int)3);
        GL11.glVertex2d((double)d10, (double)d11);
        GL11.glVertex2d((double)d12, (double)d13);
        GL11.glEnd();
        GL11.glLineWidth((float)1.0f);
        GL11.glPopMatrix();
        v.x();
        v.f();
        v.b(1.0f, 1.0f, 1.0f, 1.0f);
    }

    public static void a(float f10, float f11, float f12, float f13, int n2, int n3) {
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glShadeModel((int)7425);
        GL11.glPushMatrix();
        GL11.glBegin((int)7);
        dJ.c(n2);
        GL11.glVertex2f((float)f10, (float)(f11 + f13));
        GL11.glVertex2f((float)(f10 + f12), (float)(f11 + f13));
        dJ.c(n3);
        GL11.glVertex2f((float)(f10 + f12), (float)f11);
        GL11.glVertex2f((float)f10, (float)f11);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
        GL11.glShadeModel((int)7424);
    }

    public static void b(double d10, double d11, double d12, double d13, int n2) {
        double d14;
        String string = a0.b();
        double d15 = d10 == d12 ? 0 : (d10 < d12 ? -1 : 1);
        if (string == null) {
            if (d15 < 0) {
                d14 = d10;
                d10 = d12;
                d12 = d14;
            }
            d15 = d11 == d13 ? 0 : (d11 < d13 ? -1 : 1);
        }
        if (string == null) {
            if (d15 < 0) {
                d14 = d11;
                d11 = d13;
                d13 = d14;
            }
            d15 = n2 >> 24 & 0xFF;
        }
        float f10 = (float)d15 / 255.0f;
        float f11 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f12 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f13 = (float)(n2 & 0xFF) / 255.0f;
        W w2 = W.c();
        I i2 = w2.b();
        v.a();
        v.L();
        v.a(o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA, o.ONE, G.ZERO);
        v.b(f11, f12, f13, f10);
        i2.a(7, b.k);
        i2.c(d10, d13, 0.0).d();
        i2.c(d12, d13, 0.0).d();
        i2.c(d12, d11, 0.0).d();
        i2.c(d10, d11, 0.0).d();
        w2.a();
        v.x();
        v.f();
    }

    public static void c(int n2) {
        float f10 = (float)(n2 >> 24 & 0xFF) / 255.0f;
        float f11 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f12 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f13 = (float)(n2 & 0xFF) / 255.0f;
        GL11.glColor4f((float)f11, (float)f12, (float)f13, (float)f10);
    }

    public static void a(double d10, double d11, double d12, double d13, Color color, Color color2) {
        dJ.b(d10, d11, d10 + d12, d11 + d13, color.getRGB());
        int n2 = color2.getRGB();
        dJ.b(d10 - 1.0, d11, d10, d11 + d13, n2);
        dJ.b(d10 + d12, d11, d10 + d12 + 1.0, d11 + d13, n2);
        dJ.b(d10 - 1.0, d11 - 1.0, d10 + d12 + 1.0, d11, n2);
        dJ.b(d10 - 1.0, d11 + d13, d10 + d12 + 1.0, d11 + d13 + 1.0, n2);
    }
}

