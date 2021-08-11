/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;
import net.minecraft.ar.v;
import net.minecraft.k.l;

public class f1
extends e8 {
    public /* synthetic */ boolean p;
    private /* synthetic */ boolean m;
    public /* synthetic */ float l;
    private /* synthetic */ int o;
    public /* synthetic */ boolean k;
    private final /* synthetic */ ef q;
    public /* synthetic */ float n;

    public f1(hH hH2, eb eb2, int n2, int n3, int n4, int n5) {
        super(eb2, n2, n3, n4, n5);
        this.d = hH2;
        this.n = 0.0f;
        this.o = 0;
        this.l = 0.0f;
        this.q = new ef();
        this.k = false;
        this.m = false;
        this.p = false;
    }

    @Override
    public void b(int n2, int n3) {
        f1 f12;
        block10: {
            block11: {
                float f10;
                String string;
                block16: {
                    float f11;
                    block14: {
                        float[] arrf;
                        block15: {
                            float f13;
                            float f14;
                            block13: {
                                float f15;
                                block12: {
                                    eb eb2 = this.e();
                                    int n4 = eb2.d() + this.a();
                                    int n5 = eb2.e() + this.g() - 4;
                                    float f16 = (float)n4 + 4.0f;
                                    float f17 = (float)n5 + 8.0f;
                                    net.minecraft.client.a.v.M();
                                    net.minecraft.client.a.v.f();
                                    dJ.a(new v("celestial/picker.png"), f16 - 3.0f, f17, 98.0f, 10.5f, Color.white);
                                    String string2 = net.minecraft.k.l.b();
                                    f1.c.aK.c(this.d.a(), (double)(n4 + 6), (double)(f17 + 3.5f), -1);
                                    string = string2;
                                    dJ.b((float)n4 + this.l - 2.0f + 2.0f, (float)n5 + 6.5f, (float)n4 + this.l + 5.0f - 0.5f, (float)((double)n5 + this.g / 2.0 + 10.5), Color.BLACK.getRGB());
                                    dJ.b((float)n4 + this.l - 2.0f + 3.0f, (float)n5 + 7.5f, (float)n4 + this.l + 5.0f - 1.5f, (float)((double)n5 + this.g / 2.0 + 9.5), Color.WHITE.getRGB());
                                    net.minecraft.client.a.v.B();
                                    f12 = this;
                                    if (string == null) break block10;
                                    if (!f12.m) break block11;
                                    n3 -= n5;
                                    this.l = n2 -= n4;
                                    float f18 = this.l - 98.0f;
                                    f15 = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
                                    if (string == null) break block12;
                                    if (f15 >= 0) {
                                        this.l = 98.0f;
                                        return;
                                    }
                                    f14 = this.l;
                                    f13 = -2.0f;
                                    if (string == null) break block13;
                                    float f19 = f14 - f13;
                                    f15 = f19 == 0.0f ? 0 : (f19 < 0.0f ? -1 : 1);
                                }
                                if (f15 <= 0) {
                                    this.l = -2.0f;
                                    return;
                                }
                                f14 = this.n;
                                f13 = 1.0f;
                            }
                            arrf = f1.a(f14, f13, 1.0f);
                            float f20 = this.l - 97.0f;
                            f11 = f20 == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1);
                            if (string == null) break block14;
                            if (f11 < 0) break block15;
                            f10 = new Color(255, 255, 255).getRGB();
                            if (string != null) break block16;
                        }
                        f11 = new Color(arrf[0], arrf[1], arrf[2]).getRGB();
                    }
                    f10 = f11;
                }
                f1 f13 = this;
                if (string != null) {
                    if (f13.l <= -1.0f) {
                        f10 = Color.BLACK.getRGB();
                    }
                    this.n = f1.a(n2, 0.0f, (float)this.a, 0.0f, 360.0f);
                    f13 = this;
                }
                f13.d.a((int)f10);
            }
            f12 = this;
        }
        super.b(n2, n3);
    }

    public static float a(float f10, float f11, float f12, float f13, float f14) {
        return (f10 - f11) / (f12 - f11) * (f14 - f13) + f13;
    }

    public static float[] a(float f10, float f11, float f12) {
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        block15: {
            float f18;
            block6: {
                float f19;
                String string;
                float f20;
                float f21;
                block13: {
                    block14: {
                        block11: {
                            float f22;
                            block12: {
                                block9: {
                                    float f23;
                                    block10: {
                                        block7: {
                                            float f24;
                                            block8: {
                                                block4: {
                                                    float f25;
                                                    block5: {
                                                        f18 = f12 * f11;
                                                        f21 = f10 / 60.0f;
                                                        f20 = f18 * (1.0f - Math.abs(f21 % 2.0f - 1.0f));
                                                        f17 = 0.0f;
                                                        f16 = 0.0f;
                                                        f15 = 0.0f;
                                                        string = net.minecraft.k.l.b();
                                                        float f26 = f21 - 0.0f;
                                                        f19 = f26 == 0.0f ? 0 : (f26 > 0.0f ? 1 : -1);
                                                        if (string == null) break block4;
                                                        if (f19 < 0) break block5;
                                                        float f27 = f21 - 1.0f;
                                                        f19 = f27 == 0.0f ? 0 : (f27 < 0.0f ? -1 : 1);
                                                        if (string == null) break block4;
                                                        if (f19 > 0) break block5;
                                                        f17 = f18;
                                                        f16 = f20;
                                                        f15 = 0.0f;
                                                        if (string != null) break block6;
                                                    }
                                                    f19 = (f25 = f21 - 1.0f) == 0.0f ? 0 : (f25 > 0.0f ? 1 : -1);
                                                }
                                                if (string == null) break block7;
                                                if (f19 < 0) break block8;
                                                float f28 = f21 - 2.0f;
                                                f19 = f28 == 0.0f ? 0 : (f28 < 0.0f ? -1 : 1);
                                                if (string == null) break block7;
                                                if (f19 > 0) break block8;
                                                f17 = f20;
                                                f16 = f18;
                                                f15 = 0.0f;
                                                if (string != null) break block6;
                                            }
                                            f19 = (f24 = f21 - 2.0f) == 0.0f ? 0 : (f24 > 0.0f ? 1 : -1);
                                        }
                                        if (string == null) break block9;
                                        if (f19 < 0) break block10;
                                        float f29 = f21 - 3.0f;
                                        f19 = f29 == 0.0f ? 0 : (f29 < 0.0f ? -1 : 1);
                                        if (string == null) break block9;
                                        if (f19 > 0) break block10;
                                        f17 = 0.0f;
                                        f16 = f18;
                                        f15 = f20;
                                        if (string != null) break block6;
                                    }
                                    f19 = (f23 = f21 - 3.0f) == 0.0f ? 0 : (f23 > 0.0f ? 1 : -1);
                                }
                                if (string == null) break block11;
                                if (f19 < 0) break block12;
                                float f30 = f21 - 4.0f;
                                f19 = f30 == 0.0f ? 0 : (f30 < 0.0f ? -1 : 1);
                                if (string == null) break block11;
                                if (f19 > 0) break block12;
                                f17 = 0.0f;
                                f16 = f20;
                                f15 = f18;
                                if (string != null) break block6;
                            }
                            f19 = (f22 = f21 - 4.0f) == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1);
                        }
                        if (string == null) break block13;
                        if (f19 < 0) break block14;
                        float f31 = f21 - 5.0f;
                        f19 = f31 == 0.0f ? 0 : (f31 < 0.0f ? -1 : 1);
                        if (string == null) break block13;
                        if (f19 > 0) break block14;
                        f17 = f20;
                        f16 = 0.0f;
                        f15 = f18;
                        if (string != null) break block6;
                    }
                    f14 = f21;
                    f13 = 5.0f;
                    if (string == null) break block15;
                    float f32 = f14 - f13;
                    f19 = f32 == 0.0f ? 0 : (f32 > 0.0f ? 1 : -1);
                }
                if (f19 < 0) break block6;
                f14 = f21;
                f13 = 6.0f;
                if (string == null) break block15;
                if (f14 <= f13) {
                    f17 = f18;
                    f16 = 0.0f;
                    f15 = f20;
                }
            }
            f14 = f12;
            f13 = f18;
        }
        float f33 = f14 - f13;
        float f34 = f17 + f33;
        float f35 = f16 + f33;
        float f36 = f15 + f33;
        return new float[]{f34, f35, f36};
    }

    @Override
    public void c(int n2, int n3) {
        super.c(n2, n3);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public void b(int n2, int n3, int n4) {
        int n5;
        int n6;
        f1 f12;
        block17: {
            block18: {
                block16: {
                    int n7;
                    String string;
                    block15: {
                        block13: {
                            block14: {
                                string = net.minecraft.k.l.b();
                                n7 = this.a(n2, (int)((float)n3 - (float)((int)this.g) / 4.0f));
                                if (string == null) break block13;
                                if (n7 == 0) break block14;
                                n7 = n4;
                                if (string == null) break block13;
                                if (n7 != 0) break block14;
                                n7 = this.q.a(350.0) ? 1 : 0;
                                if (string != null) {
                                    if (n7 != 0) {
                                        this.o = 0;
                                        this.q.d();
                                    }
                                    n7 = ++this.o;
                                }
                                if (string == null) break block13;
                                if (n7 > 1) {
                                    f1 f13 = this;
                                    if (string != null) {
                                        if (f13.d.v()) {
                                            boolean bl2 = this.p;
                                            if (string != null) {
                                                bl2 = !bl2;
                                            }
                                            this.p = bl2;
                                        }
                                        f13 = this;
                                    }
                                    f13.o = 0;
                                }
                            }
                            n7 = n4;
                        }
                        if (string == null) break block15;
                        if (n7 != 0) break block16;
                        f12 = this;
                        n6 = n2;
                        n5 = (int)((float)n3 - (float)((int)this.g) / 4.0f);
                        if (string == null) break block17;
                        n7 = f12.a(n6, n5) ? 1 : 0;
                    }
                    if (n7 == 0) break block16;
                    f12 = this;
                    if (string == null) break block18;
                    if (f12.d.v()) {
                        this.m = true;
                    }
                }
                f12 = this;
            }
            n6 = n2;
            n5 = n3;
        }
        super.b(n6, n5, n4);
    }

    @Override
    public void a(int n2, int n3, int n4) {
        this.m = false;
        super.a(n2, n3, n4);
    }
}

