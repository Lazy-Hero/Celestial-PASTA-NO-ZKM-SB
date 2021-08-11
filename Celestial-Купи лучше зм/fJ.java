/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.G.c;
import net.minecraft.k.h;

public class fJ
extends c {
    /* synthetic */ float[] g;
    private static final /* synthetic */ fJ h;
    /* synthetic */ float[] j;
    /* synthetic */ float[] i;
    /* synthetic */ int k;
    /* synthetic */ float[][] f;

    private void c(float[] arrf) {
        this.a(this.f[this.k++], arrf);
    }

    private void a(float[] arrf, float[] arrf2, float[] arrf3, float[] arrf4) {
        this.a(this.j, arrf2, arrf3);
        this.a(arrf, this.j, arrf4);
        this.a(arrf);
        float f10 = (float)this.b(arrf2, arrf3);
        float f11 = (float)this.b(arrf, arrf3);
        float f12 = this.a(arrf[0], arrf[1], arrf[2], arrf3[0] * f11, arrf3[1] * f11, arrf3[2] * f11);
        float f13 = this.a(arrf2[0], arrf2[1], arrf2[2], arrf3[0] * f10, arrf3[1] * f10, arrf3[2] * f10);
        float f14 = f12 / f13;
        float f15 = (float)this.b(arrf, arrf2);
        float f16 = this.a(arrf[0], arrf[1], arrf[2], arrf2[0] * f15, arrf2[1] * f15, arrf2[2] * f15);
        float f17 = this.a(arrf3[0], arrf3[1], arrf3[2], arrf2[0] * f10, arrf2[1] * f10, arrf2[2] * f10);
        float f18 = f16 / f17;
        arrf[3] = arrf2[3] * f14 + arrf3[3] * f18;
    }

    public void a() {
        block73: {
            float f10;
            float f11;
            String string;
            float f12;
            float f13;
            float[] arrf;
            block74: {
                float f14;
                block72: {
                    float f15;
                    block70: {
                        float f16;
                        block71: {
                            float f17;
                            block68: {
                                float f18;
                                block69: {
                                    block66: {
                                        float f19;
                                        block67: {
                                            block64: {
                                                float f20;
                                                block65: {
                                                    block62: {
                                                        float f21;
                                                        block63: {
                                                            float[] arrf2 = this.e;
                                                            float[] arrf3 = this.a;
                                                            float[] arrf4 = this.b;
                                                            String string2 = dB.i();
                                                            System.arraycopy(cS.bk, 0, arrf2, 0, 16);
                                                            System.arraycopy(cS.cl, 0, arrf3, 0, 16);
                                                            cc.a(arrf4, arrf3, arrf2);
                                                            this.a(this.d[0], arrf4[3] - arrf4[0], arrf4[7] - arrf4[4], arrf4[11] - arrf4[8], arrf4[15] - arrf4[12]);
                                                            this.a(this.d[1], arrf4[3] + arrf4[0], arrf4[7] + arrf4[4], arrf4[11] + arrf4[8], arrf4[15] + arrf4[12]);
                                                            this.a(this.d[2], arrf4[3] + arrf4[1], arrf4[7] + arrf4[5], arrf4[11] + arrf4[9], arrf4[15] + arrf4[13]);
                                                            this.a(this.d[3], arrf4[3] - arrf4[1], arrf4[7] - arrf4[5], arrf4[11] - arrf4[9], arrf4[15] - arrf4[13]);
                                                            this.a(this.d[4], arrf4[3] - arrf4[2], arrf4[7] - arrf4[6], arrf4[11] - arrf4[10], arrf4[15] - arrf4[14]);
                                                            this.a(this.d[5], arrf4[3] + arrf4[2], arrf4[7] + arrf4[6], arrf4[11] + arrf4[10], arrf4[15] + arrf4[14]);
                                                            arrf = cS.aq;
                                                            f14 = (float)this.b(this.d[0], arrf);
                                                            f13 = (float)this.b(this.d[1], arrf);
                                                            f12 = (float)this.b(this.d[2], arrf);
                                                            string = string2;
                                                            f11 = (float)this.b(this.d[3], arrf);
                                                            f17 = (float)this.b(this.d[4], arrf);
                                                            f15 = (float)this.b(this.d[5], arrf);
                                                            this.k = 0;
                                                            float f22 = f14 - 0.0f;
                                                            f10 = f22 == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1);
                                                            if (string == null) break block62;
                                                            if (f10 < 0) break block63;
                                                            this.a(this.f[this.k++], this.d[0]);
                                                            float f23 = f14 - 0.0f;
                                                            f10 = f23 == 0.0f ? 0 : (f23 > 0.0f ? 1 : -1);
                                                            if (string == null) break block62;
                                                            if (f10 <= 0) break block63;
                                                            float f24 = f12 - 0.0f;
                                                            f10 = f24 == 0.0f ? 0 : (f24 < 0.0f ? -1 : 1);
                                                            if (string != null) {
                                                                float f25;
                                                                if (f10 < 0) {
                                                                    this.a(this.f[this.k++], this.d[0], this.d[2], arrf);
                                                                }
                                                                f10 = (f25 = f11 - 0.0f) == 0.0f ? 0 : (f25 < 0.0f ? -1 : 1);
                                                            }
                                                            if (string != null) {
                                                                float f26;
                                                                if (f10 < 0) {
                                                                    this.a(this.f[this.k++], this.d[0], this.d[3], arrf);
                                                                }
                                                                f10 = (f26 = f17 - 0.0f) == 0.0f ? 0 : (f26 < 0.0f ? -1 : 1);
                                                            }
                                                            if (string != null) {
                                                                float f27;
                                                                if (f10 < 0) {
                                                                    this.a(this.f[this.k++], this.d[0], this.d[4], arrf);
                                                                }
                                                                f10 = (f27 = f15 - 0.0f) == 0.0f ? 0 : (f27 < 0.0f ? -1 : 1);
                                                            }
                                                            if (string == null) break block62;
                                                            if (f10 < 0) {
                                                                this.a(this.f[this.k++], this.d[0], this.d[5], arrf);
                                                            }
                                                        }
                                                        f10 = (f21 = f13 - 0.0f) == 0.0f ? 0 : (f21 > 0.0f ? 1 : -1);
                                                    }
                                                    if (string == null) break block64;
                                                    if (f10 < 0) break block65;
                                                    this.a(this.f[this.k++], this.d[1]);
                                                    float f28 = f13 - 0.0f;
                                                    f10 = f28 == 0.0f ? 0 : (f28 > 0.0f ? 1 : -1);
                                                    if (string == null) break block64;
                                                    if (f10 <= 0) break block65;
                                                    float f29 = f12 - 0.0f;
                                                    f10 = f29 == 0.0f ? 0 : (f29 < 0.0f ? -1 : 1);
                                                    if (string != null) {
                                                        float f30;
                                                        if (f10 < 0) {
                                                            this.a(this.f[this.k++], this.d[1], this.d[2], arrf);
                                                        }
                                                        f10 = (f30 = f11 - 0.0f) == 0.0f ? 0 : (f30 < 0.0f ? -1 : 1);
                                                    }
                                                    if (string != null) {
                                                        float f31;
                                                        if (f10 < 0) {
                                                            this.a(this.f[this.k++], this.d[1], this.d[3], arrf);
                                                        }
                                                        f10 = (f31 = f17 - 0.0f) == 0.0f ? 0 : (f31 < 0.0f ? -1 : 1);
                                                    }
                                                    if (string != null) {
                                                        float f32;
                                                        if (f10 < 0) {
                                                            this.a(this.f[this.k++], this.d[1], this.d[4], arrf);
                                                        }
                                                        f10 = (f32 = f15 - 0.0f) == 0.0f ? 0 : (f32 < 0.0f ? -1 : 1);
                                                    }
                                                    if (string == null) break block64;
                                                    if (f10 < 0) {
                                                        this.a(this.f[this.k++], this.d[1], this.d[5], arrf);
                                                    }
                                                }
                                                f10 = (f20 = f12 - 0.0f) == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1);
                                            }
                                            if (string == null) break block66;
                                            if (f10 < 0) break block67;
                                            this.a(this.f[this.k++], this.d[2]);
                                            float f33 = f12 - 0.0f;
                                            f10 = f33 == 0.0f ? 0 : (f33 > 0.0f ? 1 : -1);
                                            if (string == null) break block66;
                                            if (f10 <= 0) break block67;
                                            float f34 = f14 - 0.0f;
                                            f10 = f34 == 0.0f ? 0 : (f34 < 0.0f ? -1 : 1);
                                            if (string != null) {
                                                float f35;
                                                if (f10 < 0) {
                                                    this.a(this.f[this.k++], this.d[2], this.d[0], arrf);
                                                }
                                                f10 = (f35 = f13 - 0.0f) == 0.0f ? 0 : (f35 < 0.0f ? -1 : 1);
                                            }
                                            if (string != null) {
                                                float f36;
                                                if (f10 < 0) {
                                                    this.a(this.f[this.k++], this.d[2], this.d[1], arrf);
                                                }
                                                f10 = (f36 = f17 - 0.0f) == 0.0f ? 0 : (f36 < 0.0f ? -1 : 1);
                                            }
                                            if (string != null) {
                                                float f37;
                                                if (f10 < 0) {
                                                    this.a(this.f[this.k++], this.d[2], this.d[4], arrf);
                                                }
                                                f10 = (f37 = f15 - 0.0f) == 0.0f ? 0 : (f37 < 0.0f ? -1 : 1);
                                            }
                                            if (string == null) break block66;
                                            if (f10 < 0) {
                                                this.a(this.f[this.k++], this.d[2], this.d[5], arrf);
                                            }
                                        }
                                        f10 = (f19 = f11 - 0.0f) == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
                                    }
                                    if (string == null) break block68;
                                    if (f10 < 0) break block69;
                                    this.a(this.f[this.k++], this.d[3]);
                                    float f38 = f11 - 0.0f;
                                    f10 = f38 == 0.0f ? 0 : (f38 > 0.0f ? 1 : -1);
                                    if (string == null) break block68;
                                    if (f10 <= 0) break block69;
                                    float f39 = f14 - 0.0f;
                                    f10 = f39 == 0.0f ? 0 : (f39 < 0.0f ? -1 : 1);
                                    if (string != null) {
                                        float f40;
                                        if (f10 < 0) {
                                            this.a(this.f[this.k++], this.d[3], this.d[0], arrf);
                                        }
                                        f10 = (f40 = f13 - 0.0f) == 0.0f ? 0 : (f40 < 0.0f ? -1 : 1);
                                    }
                                    if (string != null) {
                                        float f41;
                                        if (f10 < 0) {
                                            this.a(this.f[this.k++], this.d[3], this.d[1], arrf);
                                        }
                                        f10 = (f41 = f17 - 0.0f) == 0.0f ? 0 : (f41 < 0.0f ? -1 : 1);
                                    }
                                    if (string != null) {
                                        float f42;
                                        if (f10 < 0) {
                                            this.a(this.f[this.k++], this.d[3], this.d[4], arrf);
                                        }
                                        f10 = (f42 = f15 - 0.0f) == 0.0f ? 0 : (f42 < 0.0f ? -1 : 1);
                                    }
                                    if (string == null) break block68;
                                    if (f10 < 0) {
                                        this.a(this.f[this.k++], this.d[3], this.d[5], arrf);
                                    }
                                }
                                f10 = (f18 = f17 - 0.0f) == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
                            }
                            if (string == null) break block70;
                            if (f10 < 0) break block71;
                            this.a(this.f[this.k++], this.d[4]);
                            float f43 = f17 - 0.0f;
                            f10 = f43 == 0.0f ? 0 : (f43 > 0.0f ? 1 : -1);
                            if (string == null) break block70;
                            if (f10 <= 0) break block71;
                            float f44 = f14 - 0.0f;
                            f10 = f44 == 0.0f ? 0 : (f44 < 0.0f ? -1 : 1);
                            if (string != null) {
                                float f45;
                                if (f10 < 0) {
                                    this.a(this.f[this.k++], this.d[4], this.d[0], arrf);
                                }
                                f10 = (f45 = f13 - 0.0f) == 0.0f ? 0 : (f45 < 0.0f ? -1 : 1);
                            }
                            if (string != null) {
                                float f46;
                                if (f10 < 0) {
                                    this.a(this.f[this.k++], this.d[4], this.d[1], arrf);
                                }
                                f10 = (f46 = f12 - 0.0f) == 0.0f ? 0 : (f46 < 0.0f ? -1 : 1);
                            }
                            if (string != null) {
                                float f47;
                                if (f10 < 0) {
                                    this.a(this.f[this.k++], this.d[4], this.d[2], arrf);
                                }
                                f10 = (f47 = f11 - 0.0f) == 0.0f ? 0 : (f47 < 0.0f ? -1 : 1);
                            }
                            if (string == null) break block70;
                            if (f10 < 0) {
                                this.a(this.f[this.k++], this.d[4], this.d[3], arrf);
                            }
                        }
                        f10 = (f16 = f15 - 0.0f) == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                    }
                    if (string == null) break block72;
                    if (f10 < 0) break block73;
                    this.a(this.f[this.k++], this.d[5]);
                    float f48 = f15 - 0.0f;
                    f10 = f48 == 0.0f ? 0 : (f48 > 0.0f ? 1 : -1);
                }
                if (string == null) break block74;
                if (f10 <= 0) break block73;
                float f49 = f14 - 0.0f;
                f10 = f49 == 0.0f ? 0 : (f49 < 0.0f ? -1 : 1);
            }
            if (string != null) {
                float f50;
                if (f10 < 0) {
                    this.a(this.f[this.k++], this.d[5], this.d[0], arrf);
                }
                f10 = (f50 = f13 - 0.0f) == 0.0f ? 0 : (f50 < 0.0f ? -1 : 1);
            }
            if (string != null) {
                float f51;
                if (f10 < 0) {
                    this.a(this.f[this.k++], this.d[5], this.d[1], arrf);
                }
                f10 = (f51 = f12 - 0.0f) == 0.0f ? 0 : (f51 < 0.0f ? -1 : 1);
            }
            if (string != null) {
                float f52;
                if (f10 < 0) {
                    this.a(this.f[this.k++], this.d[5], this.d[2], arrf);
                }
                f10 = (f52 = f11 - 0.0f) == 0.0f ? 0 : (f52 < 0.0f ? -1 : 1);
            }
            if (f10 < 0) {
                this.a(this.f[this.k++], this.d[5], this.d[3], arrf);
            }
        }
    }

    static {
        h = new fJ();
    }

    private double b(float[] arrf, float[] arrf2) {
        return (double)arrf[0] * (double)arrf2[0] + (double)arrf[1] * (double)arrf2[1] + (double)arrf[2] * (double)arrf2[2];
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public fJ() {
        this.g = new float[6];
        this.f = new float[10][4];
        this.i = new float[16];
        this.j = new float[4];
    }

    private void b(float[] arrf) {
        float f10 = net.minecraft.k.h.a(arrf[0] * arrf[0] + arrf[1] * arrf[1] + arrf[2] * arrf[2]);
        arrf[0] = arrf[0] / f10;
        arrf[1] = arrf[1] / f10;
        arrf[2] = arrf[2] / f10;
        arrf[3] = arrf[3] / f10;
    }

    public static c b() {
        h.a();
        return h;
    }

    private float a(float f10, float f11, float f12, float f13, float f14, float f15) {
        return this.a(f10 - f13, f11 - f14, f12 - f15);
    }

    private float a(float f10, float f11, float f12) {
        return (float)Math.sqrt(f10 * f10 + f11 * f11 + f12 * f12);
    }

    private void a(float[] arrf, float f10, float f11, float f12, float f13) {
        float f14 = (float)Math.sqrt(f10 * f10 + f11 * f11 + f12 * f12);
        arrf[0] = f10 / f14;
        arrf[1] = f11 / f14;
        arrf[2] = f12 / f14;
        arrf[3] = f13 / f14;
    }

    private void a(float[] arrf, float[] arrf2, float[] arrf3) {
        arrf[0] = arrf2[1] * arrf3[2] - arrf2[2] * arrf3[1];
        arrf[1] = arrf2[2] * arrf3[0] - arrf2[0] * arrf3[2];
        arrf[2] = arrf2[0] * arrf3[1] - arrf2[1] * arrf3[0];
    }

    private void a(float[] arrf, float[] arrf2) {
        arrf[0] = arrf2[0];
        arrf[1] = arrf2[1];
        arrf[2] = arrf2[2];
        arrf[3] = arrf2[3];
    }

    private void a(float[] arrf) {
        float f10 = net.minecraft.k.h.a(arrf[0] * arrf[0] + arrf[1] * arrf[1] + arrf[2] * arrf[2]);
        String string = dB.i();
        if (string != null) {
            if (f10 == 0.0f) {
                f10 = 1.0f;
            }
            arrf[0] = arrf[0] / f10;
            arrf[1] = arrf[1] / f10;
            arrf[2] = arrf[2] / f10;
        }
    }

    @Override
    public boolean a(double d10, double d11, double d12, double d13, double d14, double d15) {
        int n2;
        block3: {
            int n3 = 0;
            String string = dB.i();
            while (n3 < this.k) {
                block4: {
                    block5: {
                        double d16;
                        block12: {
                            block11: {
                                float[] arrf;
                                block10: {
                                    block9: {
                                        block8: {
                                            block7: {
                                                block6: {
                                                    arrf = this.f[n3];
                                                    if (string == null) break block4;
                                                    double d17 = this.a(arrf, d10, d11, d12) - 0.0;
                                                    n2 = d17 == 0.0 ? 0 : (d17 < 0.0 ? -1 : 1);
                                                    if (string == null) break block3;
                                                    if (n2 > 0) break block5;
                                                    double d18 = this.a(arrf, d13, d11, d12) - 0.0;
                                                    d16 = d18 == 0.0 ? 0 : (d18 < 0.0 ? -1 : 1);
                                                    if (string == null) break block6;
                                                    if (d16 > 0) break block5;
                                                    double d19 = this.a(arrf, d10, d14, d12) - 0.0;
                                                    d16 = d19 == 0.0 ? 0 : (d19 < 0.0 ? -1 : 1);
                                                }
                                                if (string == null) break block7;
                                                if (d16 > 0) break block5;
                                                double d20 = this.a(arrf, d13, d14, d12) - 0.0;
                                                d16 = d20 == 0.0 ? 0 : (d20 < 0.0 ? -1 : 1);
                                            }
                                            if (string == null) break block8;
                                            if (d16 > 0) break block5;
                                            double d21 = this.a(arrf, d10, d11, d15) - 0.0;
                                            d16 = d21 == 0.0 ? 0 : (d21 < 0.0 ? -1 : 1);
                                        }
                                        if (string == null) break block9;
                                        if (d16 > 0) break block5;
                                        double d22 = this.a(arrf, d13, d11, d15) - 0.0;
                                        d16 = d22 == 0.0 ? 0 : (d22 < 0.0 ? -1 : 1);
                                    }
                                    if (string == null) break block10;
                                    if (d16 > 0) break block5;
                                    double d23 = this.a(arrf, d10, d14, d15) - 0.0;
                                    d16 = d23 == 0.0 ? 0 : (d23 < 0.0 ? -1 : 1);
                                }
                                if (string == null) break block11;
                                if (d16 > 0) break block5;
                                double d24 = this.a(arrf, d13, d14, d15) - 0.0;
                                d16 = d24 == 0.0 ? 0 : (d24 < 0.0 ? -1 : 1);
                            }
                            if (string == null) break block12;
                            if (d16 > 0) break block5;
                            d16 = 0.0;
                        }
                        return (boolean)d16;
                    }
                    ++n3;
                }
                if (string != null) continue;
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    private double a(float[] arrf, double d10, double d11, double d12) {
        return (double)arrf[0] * d10 + (double)arrf[1] * d11 + (double)arrf[2] * d12 + (double)arrf[3];
    }
}

