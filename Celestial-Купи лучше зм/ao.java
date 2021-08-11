/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public class ao
extends ae
implements Serializable {
    static final /* synthetic */ double g = 1.0E-30;
    static final /* synthetic */ double f = 1.0E-6;
    static final /* synthetic */ double h = 1.57079632679;
    static final /* synthetic */ long serialVersionUID = 2675933778405442383L;

    public ao(float[] arrf) {
        float f10 = (float)(1.0 / Math.sqrt(arrf[0] * arrf[0] + arrf[1] * arrf[1] + arrf[2] * arrf[2] + arrf[3] * arrf[3]));
        this.c = arrf[0] * f10;
        this.a = arrf[1] * f10;
        this.b = arrf[2] * f10;
        this.d = arrf[3] * f10;
    }

    public final void a(eG eG2) {
        block4: {
            double d10;
            double d11;
            float f10;
            block2: {
                block3: {
                    f10 = (float)Math.sqrt(eG2.e * eG2.e + eG2.d * eG2.d + eG2.c * eG2.c);
                    int n2 = ae.f();
                    d11 = f10;
                    d10 = 1.0E-6;
                    if (n2 == 0) break block2;
                    if (!(d11 < d10)) break block3;
                    this.d = 0.0f;
                    this.c = 0.0f;
                    this.a = 0.0f;
                    this.b = 0.0f;
                    if (n2 != 0) break block4;
                }
                f10 = 1.0f / f10;
                d11 = eG2.a;
                d10 = 2.0;
            }
            float f11 = (float)Math.sin(d11 / d10);
            this.d = (float)Math.cos((double)eG2.a / 2.0);
            this.c = eG2.e * f10 * f11;
            this.a = eG2.d * f10 * f11;
            this.b = eG2.c * f10 * f11;
        }
    }

    public final void b() {
        this.c = -this.c;
        this.a = -this.a;
        this.b = -this.b;
    }

    public ao(gS gS2) {
        double d10 = 1.0 / Math.sqrt(gS2.c * gS2.c + gS2.a * gS2.a + gS2.b * gS2.b + gS2.d * gS2.d);
        this.c = (float)(gS2.c * d10);
        this.a = (float)(gS2.a * d10);
        this.b = (float)(gS2.b * d10);
        this.d = (float)(gS2.d * d10);
    }

    public final void a(ao ao2, float f10) {
        double d10;
        double d11;
        block7: {
            double d12;
            double d13;
            block5: {
                block6: {
                    double d14;
                    int n2;
                    double d15;
                    block4: {
                        d15 = this.c * ao2.c + this.a * ao2.a + this.b * ao2.b + this.d * ao2.d;
                        n2 = ae.f();
                        double d16 = d15 - 0.0;
                        d14 = d16 == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
                        if (n2 == 0) break block4;
                        if (d14 < 0) {
                            ao2.c = -ao2.c;
                            ao2.a = -ao2.a;
                            ao2.b = -ao2.b;
                            ao2.d = -ao2.d;
                            d15 = -d15;
                        }
                        d13 = 1.0 - d15;
                        d12 = 1.0E-6;
                        if (n2 == 0) break block5;
                        double d17 = d13 - d12;
                        d14 = d17 == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
                    }
                    if (d14 <= 0) break block6;
                    double d18 = Math.acos(d15);
                    double d19 = Math.sin(d18);
                    d11 = Math.sin((1.0 - (double)f10) * d18) / d19;
                    d10 = Math.sin((double)f10 * d18) / d19;
                    if (n2 != 0) break block7;
                }
                d13 = 1.0;
                d12 = f10;
            }
            d11 = d13 - d12;
            d10 = f10;
        }
        this.d = (float)(d11 * (double)this.d + d10 * (double)ao2.d);
        this.c = (float)(d11 * (double)this.c + d10 * (double)ao2.c);
        this.a = (float)(d11 * (double)this.a + d10 * (double)ao2.a);
        this.b = (float)(d11 * (double)this.b + d10 * (double)ao2.b);
    }

    public final void a(dU dU2) {
        block15: {
            double d10;
            float f10;
            block13: {
                int n2;
                block14: {
                    block11: {
                        block12: {
                            double d11;
                            block9: {
                                block10: {
                                    block7: {
                                        block8: {
                                            f10 = 0.25f * (dU2.l + dU2.d + dU2.m + dU2.h);
                                            n2 = ae.g();
                                            if (n2 != 0) break block7;
                                            if (!(f10 >= 0.0f)) break block8;
                                            double d12 = (double)f10 - 1.0E-30;
                                            d11 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                                            if (n2 != 0) break block9;
                                            if (d11 >= 0) {
                                                this.d = (float)Math.sqrt(f10);
                                                f10 = 0.25f / this.d;
                                                this.c = (dU2.k - dU2.f) * f10;
                                                this.a = (dU2.g - dU2.e) * f10;
                                                this.b = (dU2.a - dU2.i) * f10;
                                                return;
                                            }
                                            break block10;
                                        }
                                        this.d = 0.0f;
                                        this.c = 0.0f;
                                        this.a = 0.0f;
                                        this.b = 1.0f;
                                    }
                                    return;
                                }
                                this.d = 0.0f;
                                f10 = -0.5f * (dU2.d + dU2.m);
                                if (n2 != 0) break block11;
                                float f11 = f10 - 0.0f;
                                d11 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                            }
                            if (d11 < 0) break block12;
                            double d13 = (double)f10 - 1.0E-30;
                            d10 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                            if (n2 != 0) break block13;
                            if (d10 >= 0) {
                                this.c = (float)Math.sqrt(f10);
                                f10 = 1.0f / (2.0f * this.c);
                                this.a = dU2.a * f10;
                                this.b = dU2.e * f10;
                                return;
                            }
                            break block14;
                        }
                        this.c = 0.0f;
                        this.a = 0.0f;
                        this.b = 1.0f;
                    }
                    return;
                }
                this.c = 0.0f;
                f10 = 0.5f * (1.0f - dU2.m);
                if (n2 != 0) break block15;
                double d14 = (double)f10 - 1.0E-30;
                d10 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
            }
            if (d10 >= 0) {
                this.a = (float)Math.sqrt(f10);
                this.b = dU2.k / (2.0f * this.a);
                return;
            }
            this.a = 0.0f;
            this.b = 1.0f;
        }
    }

    public final void d(ao ao2) {
        ao ao3 = new ao(ao2);
        ao3.c();
        this.b(ao3);
    }

    public final void a(dc dc2) {
        block15: {
            double d10;
            float f10;
            block13: {
                int n2;
                block14: {
                    block11: {
                        block12: {
                            double d11;
                            block9: {
                                block10: {
                                    block7: {
                                        block8: {
                                            f10 = 0.25f * (dc2.j + dc2.g + dc2.i + 1.0f);
                                            n2 = ae.g();
                                            if (n2 != 0) break block7;
                                            if (!(f10 >= 0.0f)) break block8;
                                            double d12 = (double)f10 - 1.0E-30;
                                            d11 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                                            if (n2 != 0) break block9;
                                            if (d11 >= 0) {
                                                this.d = (float)Math.sqrt(f10);
                                                f10 = 0.25f / this.d;
                                                this.c = (dc2.e - dc2.h) * f10;
                                                this.a = (dc2.a - dc2.f) * f10;
                                                this.b = (dc2.c - dc2.d) * f10;
                                                return;
                                            }
                                            break block10;
                                        }
                                        this.d = 0.0f;
                                        this.c = 0.0f;
                                        this.a = 0.0f;
                                        this.b = 1.0f;
                                    }
                                    return;
                                }
                                this.d = 0.0f;
                                f10 = -0.5f * (dc2.g + dc2.i);
                                if (n2 != 0) break block11;
                                float f11 = f10 - 0.0f;
                                d11 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                            }
                            if (d11 < 0) break block12;
                            double d13 = (double)f10 - 1.0E-30;
                            d10 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                            if (n2 != 0) break block13;
                            if (d10 >= 0) {
                                this.c = (float)Math.sqrt(f10);
                                f10 = 0.5f / this.c;
                                this.a = dc2.c * f10;
                                this.b = dc2.f * f10;
                                return;
                            }
                            break block14;
                        }
                        this.c = 0.0f;
                        this.a = 0.0f;
                        this.b = 1.0f;
                    }
                    return;
                }
                this.c = 0.0f;
                f10 = 0.5f * (1.0f - dc2.i);
                if (n2 != 0) break block15;
                double d14 = (double)f10 - 1.0E-30;
                d10 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
            }
            if (d10 >= 0) {
                this.a = (float)Math.sqrt(f10);
                this.b = dc2.e / (2.0f * this.a);
                return;
            }
            this.a = 0.0f;
            this.b = 1.0f;
        }
    }

    public ao() {
    }

    public final void b(ao ao2, ao ao3) {
        block4: {
            ao ao4;
            block2: {
                block3: {
                    int n2 = ae.g();
                    ao4 = this;
                    if (n2 != 0) break block2;
                    if (ao4 == ao2) break block3;
                    ao4 = this;
                    if (n2 != 0) break block2;
                    if (ao4 == ao3) break block3;
                    this.d = ao2.d * ao3.d - ao2.c * ao3.c - ao2.a * ao3.a - ao2.b * ao3.b;
                    this.c = ao2.d * ao3.c + ao3.d * ao2.c + ao2.a * ao3.b - ao2.b * ao3.a;
                    this.a = ao2.d * ao3.a + ao3.d * ao2.a - ao2.c * ao3.b + ao2.b * ao3.c;
                    this.b = ao2.d * ao3.b + ao3.d * ao2.b + ao2.c * ao3.a - ao2.a * ao3.c;
                    if (n2 == 0) break block4;
                }
                ao4 = ao2;
            }
            float f10 = ao4.d * ao3.d - ao2.c * ao3.c - ao2.a * ao3.a - ao2.b * ao3.b;
            float f11 = ao2.d * ao3.c + ao3.d * ao2.c + ao2.a * ao3.b - ao2.b * ao3.a;
            float f12 = ao2.d * ao3.a + ao3.d * ao2.a - ao2.c * ao3.b + ao2.b * ao3.c;
            this.b = ao2.d * ao3.b + ao3.d * ao2.b + ao2.c * ao3.a - ao2.a * ao3.c;
            this.d = f10;
            this.c = f11;
            this.a = f12;
        }
    }

    public ao(ao ao2) {
        super(ao2);
    }

    public final void a(em em2) {
        block4: {
            double d10;
            double d11;
            float f10;
            block2: {
                block3: {
                    f10 = (float)(1.0 / Math.sqrt(em2.d * em2.d + em2.b * em2.b + em2.e * em2.e));
                    int n2 = ae.g();
                    d11 = f10;
                    d10 = 1.0E-6;
                    if (n2 != 0) break block2;
                    if (!(d11 < d10)) break block3;
                    this.d = 0.0f;
                    this.c = 0.0f;
                    this.a = 0.0f;
                    this.b = 0.0f;
                    if (n2 == 0) break block4;
                }
                f10 = 1.0f / f10;
                d11 = em2.a;
                d10 = 2.0;
            }
            float f11 = (float)Math.sin(d11 / d10);
            this.d = (float)Math.cos(em2.a / 2.0);
            this.c = (float)em2.d * f10 * f11;
            this.a = (float)em2.b * f10 * f11;
            this.b = (float)em2.e * f10 * f11;
        }
    }

    public ao(ae ae2) {
        float f10 = (float)(1.0 / Math.sqrt(ae2.c * ae2.c + ae2.a * ae2.a + ae2.b * ae2.b + ae2.d * ae2.d));
        this.c = ae2.c * f10;
        this.a = ae2.a * f10;
        this.b = ae2.b * f10;
        this.d = ae2.d * f10;
    }

    public ao(float f10, float f11, float f12, float f13) {
        float f14 = (float)(1.0 / Math.sqrt(f10 * f10 + f11 * f11 + f12 * f12 + f13 * f13));
        this.c = f10 * f14;
        this.a = f11 * f14;
        this.b = f12 * f14;
        this.d = f13 * f14;
    }

    public final void a(ao ao2, ao ao3) {
        ao ao4 = new ao(ao3);
        ao4.c();
        this.b(ao2, ao4);
    }

    public final void b(ao ao2) {
        float f10 = this.d * ao2.d - this.c * ao2.c - this.a * ao2.a - this.b * ao2.b;
        float f11 = this.d * ao2.c + ao2.d * this.c + this.a * ao2.b - this.b * ao2.a;
        float f12 = this.d * ao2.a + ao2.d * this.a - this.c * ao2.b + this.b * ao2.c;
        this.b = this.d * ao2.b + ao2.d * this.b + this.c * ao2.a - this.a * ao2.c;
        this.d = f10;
        this.c = f11;
        this.a = f12;
    }

    public final void a(gY gY2) {
        block15: {
            double d10;
            double d11;
            block13: {
                int n2;
                block14: {
                    block11: {
                        block12: {
                            double d12;
                            block9: {
                                block10: {
                                    block7: {
                                        block8: {
                                            d11 = 0.25 * (gY2.h + gY2.d + gY2.e + 1.0);
                                            n2 = ae.g();
                                            if (n2 != 0) break block7;
                                            if (!(d11 >= 0.0)) break block8;
                                            double d13 = d11 - 1.0E-30;
                                            d12 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                                            if (n2 != 0) break block9;
                                            if (d12 >= 0) {
                                                this.d = (float)Math.sqrt(d11);
                                                d11 = 0.25 / (double)this.d;
                                                this.c = (float)((gY2.b - gY2.c) * d11);
                                                this.a = (float)((gY2.i - gY2.g) * d11);
                                                this.b = (float)((gY2.f - gY2.j) * d11);
                                                return;
                                            }
                                            break block10;
                                        }
                                        this.d = 0.0f;
                                        this.c = 0.0f;
                                        this.a = 0.0f;
                                        this.b = 1.0f;
                                    }
                                    return;
                                }
                                this.d = 0.0f;
                                d11 = -0.5 * (gY2.d + gY2.e);
                                if (n2 != 0) break block11;
                                double d14 = d11 - 0.0;
                                d12 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                            }
                            if (d12 < 0) break block12;
                            double d15 = d11 - 1.0E-30;
                            d10 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                            if (n2 != 0) break block13;
                            if (d10 >= 0) {
                                this.c = (float)Math.sqrt(d11);
                                d11 = 0.5 / (double)this.c;
                                this.a = (float)(gY2.f * d11);
                                this.b = (float)(gY2.g * d11);
                                return;
                            }
                            break block14;
                        }
                        this.c = 0.0f;
                        this.a = 0.0f;
                        this.b = 1.0f;
                    }
                    return;
                }
                this.c = 0.0f;
                d11 = 0.5 * (1.0 - gY2.e);
                if (n2 != 0) break block15;
                double d16 = d11 - 1.0E-30;
                d10 = d16 == 0.0 ? 0 : (d16 > 0.0 ? 1 : -1);
            }
            if (d10 >= 0) {
                this.a = (float)Math.sqrt(d11);
                this.b = (float)(gY2.b / (2.0 * (double)this.a));
                return;
            }
            this.a = 0.0f;
            this.b = 1.0f;
        }
    }

    public final void c(ao ao2) {
        this.c = -ao2.c;
        this.a = -ao2.a;
        this.b = -ao2.b;
        this.d = ao2.d;
    }

    public final void a(ao ao2) {
        block4: {
            block2: {
                block3: {
                    float f10 = ao2.c * ao2.c + ao2.a * ao2.a + ao2.b * ao2.b + ao2.d * ao2.d;
                    int n2 = ae.f();
                    if (n2 == 0) break block2;
                    if (!(f10 > 0.0f)) break block3;
                    f10 = 1.0f / (float)Math.sqrt(f10);
                    this.c = f10 * ao2.c;
                    this.a = f10 * ao2.a;
                    this.b = f10 * ao2.b;
                    this.d = f10 * ao2.d;
                    if (n2 != 0) break block4;
                }
                this.c = 0.0f;
                this.a = 0.0f;
                this.b = 0.0f;
            }
            this.d = 0.0f;
        }
    }

    public final void d() {
        block4: {
            block2: {
                block3: {
                    float f10 = this.c * this.c + this.a * this.a + this.b * this.b + this.d * this.d;
                    int n2 = ae.f();
                    if (n2 == 0) break block2;
                    if (!(f10 > 0.0f)) break block3;
                    f10 = 1.0f / (float)Math.sqrt(f10);
                    this.c *= f10;
                    this.a *= f10;
                    this.b *= f10;
                    this.d *= f10;
                    if (n2 != 0) break block4;
                }
                this.c = 0.0f;
                this.a = 0.0f;
                this.b = 0.0f;
            }
            this.d = 0.0f;
        }
    }

    public final void c() {
        float f10 = 1.0f / (this.d * this.d + this.c * this.c + this.a * this.a + this.b * this.b);
        this.d *= f10;
        this.c *= -f10;
        this.a *= -f10;
        this.b *= -f10;
    }

    public ao(g4 g42) {
        super(g42);
    }

    public final void a(dA dA2) {
        block15: {
            double d10;
            double d11;
            block13: {
                int n2;
                block14: {
                    block11: {
                        block12: {
                            double d12;
                            block9: {
                                block10: {
                                    block7: {
                                        block8: {
                                            d11 = 0.25 * (dA2.o + dA2.l + dA2.h + dA2.d);
                                            n2 = ae.f();
                                            if (n2 == 0) break block7;
                                            if (!(d11 >= 0.0)) break block8;
                                            double d13 = d11 - 1.0E-30;
                                            d12 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                                            if (n2 == 0) break block9;
                                            if (d12 >= 0) {
                                                this.d = (float)Math.sqrt(d11);
                                                d11 = 0.25 / (double)this.d;
                                                this.c = (float)((dA2.i - dA2.g) * d11);
                                                this.a = (float)((dA2.m - dA2.k) * d11);
                                                this.b = (float)((dA2.b - dA2.f) * d11);
                                                return;
                                            }
                                            break block10;
                                        }
                                        this.d = 0.0f;
                                        this.c = 0.0f;
                                        this.a = 0.0f;
                                        this.b = 1.0f;
                                    }
                                    return;
                                }
                                this.d = 0.0f;
                                d11 = -0.5 * (dA2.l + dA2.h);
                                if (n2 == 0) break block11;
                                double d14 = d11 - 0.0;
                                d12 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                            }
                            if (d12 < 0) break block12;
                            double d15 = d11 - 1.0E-30;
                            d10 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                            if (n2 == 0) break block13;
                            if (d10 >= 0) {
                                this.c = (float)Math.sqrt(d11);
                                d11 = 0.5 / (double)this.c;
                                this.a = (float)(dA2.b * d11);
                                this.b = (float)(dA2.k * d11);
                                return;
                            }
                            break block14;
                        }
                        this.c = 0.0f;
                        this.a = 0.0f;
                        this.b = 1.0f;
                    }
                    return;
                }
                this.c = 0.0f;
                d11 = 0.5 * (1.0 - dA2.h);
                if (n2 == 0) break block15;
                double d16 = d11 - 1.0E-30;
                d10 = d16 == 0.0 ? 0 : (d16 > 0.0 ? 1 : -1);
            }
            if (d10 >= 0) {
                this.a = (float)Math.sqrt(d11);
                this.b = (float)(dA2.i / (2.0 * (double)this.a));
                return;
            }
            this.a = 0.0f;
            this.b = 1.0f;
        }
    }

    public final void a(ao ao2, ao ao3, float f10) {
        double d10;
        double d11;
        block7: {
            double d12;
            double d13;
            block5: {
                block6: {
                    double d14;
                    int n2;
                    double d15;
                    block4: {
                        d15 = ao3.c * ao2.c + ao3.a * ao2.a + ao3.b * ao2.b + ao3.d * ao2.d;
                        n2 = ae.f();
                        double d16 = d15 - 0.0;
                        d14 = d16 == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
                        if (n2 == 0) break block4;
                        if (d14 < 0) {
                            ao2.c = -ao2.c;
                            ao2.a = -ao2.a;
                            ao2.b = -ao2.b;
                            ao2.d = -ao2.d;
                            d15 = -d15;
                        }
                        d13 = 1.0 - d15;
                        d12 = 1.0E-6;
                        if (n2 == 0) break block5;
                        double d17 = d13 - d12;
                        d14 = d17 == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
                    }
                    if (d14 <= 0) break block6;
                    double d18 = Math.acos(d15);
                    double d19 = Math.sin(d18);
                    d11 = Math.sin((1.0 - (double)f10) * d18) / d19;
                    d10 = Math.sin((double)f10 * d18) / d19;
                    if (n2 != 0) break block7;
                }
                d13 = 1.0;
                d12 = f10;
            }
            d11 = d13 - d12;
            d10 = f10;
        }
        this.d = (float)(d11 * (double)ao2.d + d10 * (double)ao3.d);
        this.c = (float)(d11 * (double)ao2.c + d10 * (double)ao3.c);
        this.a = (float)(d11 * (double)ao2.a + d10 * (double)ao3.a);
        this.b = (float)(d11 * (double)ao2.b + d10 * (double)ao3.b);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public final void e(ao ao2) {
        float f10 = 1.0f / (ao2.d * ao2.d + ao2.c * ao2.c + ao2.a * ao2.a + ao2.b * ao2.b);
        this.d = f10 * ao2.d;
        this.c = -f10 * ao2.c;
        this.a = -f10 * ao2.a;
        this.b = -f10 * ao2.b;
    }
}

