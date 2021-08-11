/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.v;
import net.minecraft.client.w.c;
import net.minecraft.client.y.b;
import net.minecraft.k.h;
import org.lwjgl.opengl.GL11;

public class gq {
    private /* synthetic */ float a;
    private /* synthetic */ float f;
    private /* synthetic */ int i;
    private /* synthetic */ float c;
    private /* synthetic */ int k;
    private /* synthetic */ int g;
    private /* synthetic */ float j;
    private /* synthetic */ c e;
    private /* synthetic */ int n;
    private /* synthetic */ float h;
    private /* synthetic */ int d;
    private /* synthetic */ float l;
    private /* synthetic */ float b;
    private /* synthetic */ float m;

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(W w2, float f10) {
        gq gq2;
        block6: {
            boolean bl2;
            float f11;
            float f12;
            float f13;
            float f14;
            block5: {
                v.b(this.h * f10, this.m * f10, this.b * f10);
                f14 = this.a;
                String string = K.d();
                f13 = this.l;
                f12 = this.c;
                f11 = this.f;
                bl2 = this.e.A;
                if (string != null) break block5;
                if (bl2) {
                    f14 = this.l;
                    f13 = this.a;
                }
                gq2 = this;
                if (string != null) break block6;
                bl2 = gq2.e.a;
            }
            if (bl2) {
                f12 = this.f;
                f11 = this.c;
            }
            gq.a(w2, f14, f12, f13, f11, this.g, this.k, f10 * (float)this.i, this.e.B, this.e.d);
            gq2 = this;
        }
        v.b(-gq2.h * f10, -this.m * f10, -this.b * f10);
    }

    public static void a(W w2, float f10, float f11, float f12, float f13, int n2, int n3, float f14, float f15, float f16) {
        block13: {
            float f17;
            float f18;
            int n4;
            float f19;
            I i2;
            double d10;
            double d11;
            float f20;
            String string;
            block12: {
                float f21;
                block11: {
                    float f22;
                    float f23;
                    block10: {
                        string = K.d();
                        float f24 = f14;
                        float f25 = 6.25E-4f;
                        if (string == null) {
                            if (f24 < f25) {
                                f14 = 6.25E-4f;
                            }
                            f24 = f12;
                            f25 = f10;
                        }
                        f23 = f24 - f25;
                        f20 = f13 - f11;
                        d11 = net.minecraft.k.h.e(f23) * (f15 / 16.0f);
                        d10 = net.minecraft.k.h.e(f20) * (f16 / 16.0f);
                        i2 = w2.b();
                        GL11.glNormal3f((float)0.0f, (float)0.0f, (float)-1.0f);
                        i2.a(7, net.minecraft.client.y.b.m);
                        i2.c(0.0, d10, 0.0).a(f10, f13).d();
                        i2.c(d11, d10, 0.0).a(f12, f13).d();
                        i2.c(d11, 0.0, 0.0).a(f12, f11).d();
                        i2.c(0.0, 0.0, 0.0).a(f10, f11).d();
                        w2.a();
                        GL11.glNormal3f((float)0.0f, (float)0.0f, (float)1.0f);
                        i2.a(7, net.minecraft.client.y.b.m);
                        i2.c(0.0, 0.0, (double)f14).a(f10, f11).d();
                        i2.c(d11, 0.0, (double)f14).a(f12, f11).d();
                        i2.c(d11, d10, (double)f14).a(f12, f13).d();
                        i2.c(0.0, d10, (double)f14).a(f10, f13).d();
                        w2.a();
                        f22 = 0.5f * f23 / (float)n2;
                        f19 = 0.5f * f20 / (float)n3;
                        GL11.glNormal3f((float)-1.0f, (float)0.0f, (float)0.0f);
                        i2.a(7, net.minecraft.client.y.b.m);
                        for (n4 = 0; n4 < n2; ++n4) {
                            f18 = (float)n4 / (float)n2;
                            f17 = f10 + f23 * f18 + f22;
                            i2.c((double)f18 * d11, d10, (double)f14).a(f17, f13).d();
                            i2.c((double)f18 * d11, d10, 0.0).a(f17, f13).d();
                            i2.c((double)f18 * d11, 0.0, 0.0).a(f17, f11).d();
                            i2.c((double)f18 * d11, 0.0, (double)f14).a(f17, f11).d();
                            if (string == null) {
                                if (string == null) continue;
                            }
                            break block10;
                        }
                        w2.a();
                        GL11.glNormal3f((float)1.0f, (float)0.0f, (float)0.0f);
                        i2.a(7, net.minecraft.client.y.b.m);
                    }
                    for (n4 = 0; n4 < n2; ++n4) {
                        f18 = (float)n4 / (float)n2;
                        f17 = f10 + f23 * f18 + f22;
                        f21 = f18 + 1.0f / (float)n2;
                        i2.c((double)f21 * d11, 0.0, (double)f14).a(f17, f11).d();
                        i2.c((double)f21 * d11, 0.0, 0.0).a(f17, f11).d();
                        i2.c((double)f21 * d11, d10, 0.0).a(f17, f13).d();
                        i2.c((double)f21 * d11, d10, (double)f14).a(f17, f13).d();
                        if (string == null) {
                            if (string == null) continue;
                        }
                        break block11;
                    }
                    w2.a();
                    GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
                    i2.a(7, net.minecraft.client.y.b.m);
                }
                for (n4 = 0; n4 < n3; ++n4) {
                    f18 = (float)n4 / (float)n3;
                    f17 = f11 + f20 * f18 + f19;
                    f21 = f18 + 1.0f / (float)n3;
                    i2.c(0.0, (double)f21 * d10, (double)f14).a(f10, f17).d();
                    i2.c(d11, (double)f21 * d10, (double)f14).a(f12, f17).d();
                    i2.c(d11, (double)f21 * d10, 0.0).a(f12, f17).d();
                    i2.c(0.0, (double)f21 * d10, 0.0).a(f10, f17).d();
                    if (string == null) {
                        if (string == null) continue;
                    }
                    break block12;
                }
                w2.a();
                GL11.glNormal3f((float)0.0f, (float)-1.0f, (float)0.0f);
                i2.a(7, net.minecraft.client.y.b.m);
            }
            for (n4 = 0; n4 < n3; ++n4) {
                f18 = (float)n4 / (float)n3;
                f17 = f11 + f20 * f18 + f19;
                i2.c(d11, (double)f18 * d10, (double)f14).a(f12, f17).d();
                i2.c(0.0, (double)f18 * d10, (double)f14).a(f10, f17).d();
                i2.c(0.0, (double)f18 * d10, 0.0).a(f10, f17).d();
                i2.c(d11, (double)f18 * d10, 0.0).a(f12, f17).d();
                if (string == null) {
                    if (string == null) continue;
                }
                break block13;
            }
            w2.a();
        }
    }

    public gq(c c10, int n2, int n3, float f10, float f11, float f12, int n4, int n5, int n6, float f13) {
        this.e = null;
        this.d = 0;
        this.n = 0;
        this.h = 0.0f;
        this.m = 0.0f;
        this.b = 0.0f;
        this.g = 0;
        this.k = 0;
        this.i = 0;
        this.j = 0.0f;
        this.a = 0.0f;
        this.c = 0.0f;
        this.l = 0.0f;
        this.f = 0.0f;
        this.e = c10;
        this.d = n2;
        this.n = n3;
        this.h = f10;
        this.m = f11;
        this.b = f12;
        this.g = n4;
        this.k = n5;
        this.i = n6;
        this.j = f13;
        this.a = (float)n2 / c10.B;
        this.c = (float)n3 / c10.d;
        this.l = (float)(n2 + n4) / c10.B;
        this.f = (float)(n3 + n5) / c10.d;
    }
}

