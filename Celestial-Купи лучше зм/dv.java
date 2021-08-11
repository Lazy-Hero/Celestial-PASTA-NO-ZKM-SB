/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.client.Q;
import net.minecraft.client.a.v;
import net.minecraft.client.b.l;
import net.minecraft.k.m;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class dv {
    private static /* synthetic */ int[] b;
    public /* synthetic */ float a;
    public /* synthetic */ float d;
    public /* synthetic */ CopyOnWriteArrayList<h7> c;

    public static void a(double d10, double d11, float f10, int n2) {
        block3: {
            block2: {
                float f11 = (float)(n2 >> 24 & 0xFF) / 255.0f;
                float f12 = (float)(n2 >> 16 & 0xFF) / 255.0f;
                float f13 = (float)(n2 >> 8 & 0xFF) / 255.0f;
                float f14 = (float)(n2 & 0xFF) / 255.0f;
                int[] arrn = dv.b();
                GL11.glColor4f((float)f12, (float)f13, (float)f14, (float)f11);
                GL11.glBegin((int)9);
                for (int i2 = 0; i2 <= 360; ++i2) {
                    GL11.glVertex2d((double)(d10 + Math.sin((double)i2 * 3.141526 / 180.0) * (double)f10), (double)(d11 + Math.cos((double)i2 * 3.141526 / 180.0) * (double)f10));
                    if (arrn != null) {
                        if (arrn != null) continue;
                    }
                    break block2;
                }
                GL11.glEnd();
            }
            if (!m.c()) break block3;
            dv.b(new int[5]);
        }
    }

    public static int[] b() {
        return b;
    }

    public static void b(int[] arrn) {
        b = arrn;
    }

    public dv() {
        this.c = Lists.newCopyOnWriteArrayList();
    }

    public void a(float f10, float f11) {
        block9: {
            int n2;
            v.a();
            int[] arrn = dv.b();
            v.v();
            v.b(1.0f, 1.0f, 1.0f, 1.0f);
            l l2 = new l(Q.P());
            float f12 = 0.0f;
            int[] arrn2 = arrn;
            float f13 = 0.0f;
            while ((float)this.c.size() < (float)l2.e() / 8.0f) {
                this.c.add(new h7(l2, new Random().nextFloat() + 1.0f, new Random().nextFloat() * 5.0f + 5.0f));
                if (arrn2 != null) continue;
                m.b(!m.d());
                break;
            }
            ArrayList arrayList = Lists.newArrayList();
            int n3 = 52;
            int n4 = -570425345;
            for (h7 h72 : this.c) {
                block15: {
                    int n5;
                    block16: {
                        double d10;
                        double d11;
                        block10: {
                            block11: {
                                block14: {
                                    block13: {
                                        h7 h73;
                                        float f14;
                                        block12: {
                                            d11 = (double)h72.d + Math.sin(h72.e / 2.0f) * 50.0 + (double)(-f12 / 5.0f * (float)Mouse.getX());
                                            d10 = h72.e * h72.a * h72.e / 10.0f + -f13 / 5.0f;
                                            double d12 = d10 - (double)l2.a();
                                            n2 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                                            if (arrn2 == null) break block9;
                                            if (arrn2 == null) break block10;
                                            if (n2 >= 0) break block11;
                                            float f15 = h72.f - (float)n3;
                                            f14 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
                                            if (arrn2 == null) break block12;
                                            if (f14 < 0) {
                                                h72.f += 2.0f;
                                            }
                                            h73 = h72;
                                            if (arrn2 == null) break block13;
                                            float f16 = h73.f - (float)n3;
                                            f14 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                                        }
                                        if (f14 <= 0) break block14;
                                        h73 = h72;
                                    }
                                    h73.f = n3;
                                }
                                v.a();
                                this.a(d11, d10, h72.b * h72.f / (float)n3, n4, n4);
                            }
                            h72.e = (float)((double)h72.e + 0.025);
                            double d13 = d10 - (double)l2.a();
                            n5 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                        }
                        if (arrn2 == null) break block15;
                        if (n5 > 0) break block16;
                        double d14 = d10 - 0.0;
                        n5 = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
                        if (arrn2 == null) break block15;
                        if (n5 < 0) break block16;
                        double d15 = d11 - (double)l2.e();
                        n5 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                        if (arrn2 == null) break block15;
                        if (n5 > 0) break block16;
                        double d16 = d11 - 0.0;
                        n5 = d16 == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
                        if (arrn2 == null || n5 >= 0) break block15;
                    }
                    n5 = arrayList.add(h72);
                }
                if (arrn2 != null) continue;
            }
            n2 = this.c.removeAll(arrayList);
        }
        v.b(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        v.a();
        v.v();
        this.d = Mouse.getX();
        this.a = Mouse.getY();
    }

    static {
        if (dv.b() == null) {
            dv.b(new int[4]);
        }
    }

    public static void a(int n2) {
        float f10 = (float)(n2 >> 24 & 0xFF) / 255.0f;
        float f11 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f12 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f13 = (float)(n2 & 0xFF) / 255.0f;
        int[] arrn = dv.b();
        float f14 = f10;
        if (arrn != null) {
            f14 = f14 == 0.0f ? 1.0f : f10;
        }
        GL11.glColor4f((float)f11, (float)f12, (float)f13, (float)f14);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(double d10, double d11, float f10, int n2, int n3) {
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glPushMatrix();
        GL11.glScalef((float)0.1f, (float)0.1f, (float)0.1f);
        dv.a(d10 * 10.0, d11 * 10.0, f10 * 10.0f, n3);
        GL11.glScalef((float)10.0f, (float)10.0f, (float)10.0f);
        GL11.glPopMatrix();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
    }
}

