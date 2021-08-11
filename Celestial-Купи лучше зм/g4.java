/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public class g4
extends gS
implements Serializable {
    static final /* synthetic */ long serialVersionUID = 7577479888820201099L;
    static final /* synthetic */ double e = 1.0E-12;
    static final /* synthetic */ double g = 1.57079632679;
    static final /* synthetic */ double f = 1.0E-30;

    public final void b(g4 g42, g4 g43) {
        block4: {
            g4 g44;
            block2: {
                block3: {
                    int n2 = ae.g();
                    g44 = this;
                    if (n2 != 0) break block2;
                    if (g44 == g42) break block3;
                    g44 = this;
                    if (n2 != 0) break block2;
                    if (g44 == g43) break block3;
                    this.d = g42.d * g43.d - g42.c * g43.c - g42.a * g43.a - g42.b * g43.b;
                    this.c = g42.d * g43.c + g43.d * g42.c + g42.a * g43.b - g42.b * g43.a;
                    this.a = g42.d * g43.a + g43.d * g42.a - g42.c * g43.b + g42.b * g43.c;
                    this.b = g42.d * g43.b + g43.d * g42.b + g42.c * g43.a - g42.a * g43.c;
                    if (n2 == 0) break block4;
                }
                g44 = g42;
            }
            double d10 = g44.d * g43.d - g42.c * g43.c - g42.a * g43.a - g42.b * g43.b;
            double d11 = g42.d * g43.c + g43.d * g42.c + g42.a * g43.b - g42.b * g43.a;
            double d12 = g42.d * g43.a + g43.d * g42.a - g42.c * g43.b + g42.b * g43.c;
            this.b = g42.d * g43.b + g43.d * g42.b + g42.c * g43.a - g42.a * g43.c;
            this.d = d10;
            this.c = d11;
            this.a = d12;
        }
    }

    public final void a(em em2) {
        block4: {
            double d10;
            double d11;
            double d12;
            block2: {
                block3: {
                    d12 = Math.sqrt(em2.d * em2.d + em2.b * em2.b + em2.e * em2.e);
                    int n2 = ae.f();
                    d11 = d12;
                    d10 = 1.0E-12;
                    if (n2 == 0) break block2;
                    if (!(d11 < d10)) break block3;
                    this.d = 0.0;
                    this.c = 0.0;
                    this.a = 0.0;
                    this.b = 0.0;
                    if (n2 != 0) break block4;
                }
                d12 = 1.0 / d12;
                d11 = em2.a;
                d10 = 2.0;
            }
            double d13 = Math.sin(d11 / d10);
            this.d = Math.cos(em2.a / 2.0);
            this.c = em2.d * d12 * d13;
            this.a = em2.b * d12 * d13;
            this.b = em2.e * d12 * d13;
        }
    }

    public final void b(g4 g42) {
        this.c = -g42.c;
        this.a = -g42.a;
        this.b = -g42.b;
        this.d = g42.d;
    }

    public final void a() {
        this.c = -this.c;
        this.a = -this.a;
        this.b = -this.b;
    }

    public final void a(g4 g42, g4 g43) {
        g4 g44 = new g4(g43);
        g44.b();
        this.b(g42, g44);
    }

    public g4(ae ae2) {
        double d10 = 1.0 / Math.sqrt(ae2.c * ae2.c + ae2.a * ae2.a + ae2.b * ae2.b + ae2.d * ae2.d);
        this.c = (double)ae2.c * d10;
        this.a = (double)ae2.a * d10;
        this.b = (double)ae2.b * d10;
        this.d = (double)ae2.d * d10;
    }

    public final void c() {
        block4: {
            block2: {
                block3: {
                    double d10 = this.c * this.c + this.a * this.a + this.b * this.b + this.d * this.d;
                    int n2 = ae.f();
                    if (n2 == 0) break block2;
                    if (!(d10 > 0.0)) break block3;
                    d10 = 1.0 / Math.sqrt(d10);
                    this.c *= d10;
                    this.a *= d10;
                    this.b *= d10;
                    this.d *= d10;
                    if (n2 != 0) break block4;
                }
                this.c = 0.0;
                this.a = 0.0;
                this.b = 0.0;
            }
            this.d = 0.0;
        }
    }

    public final void a(g4 g42) {
        g4 g43 = new g4(g42);
        g43.b();
        this.c(g43);
    }

    public final void a(dc dc2) {
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
                                            d11 = 0.25 * ((double)(dc2.j + dc2.g + dc2.i) + 1.0);
                                            n2 = ae.g();
                                            if (n2 != 0) break block7;
                                            if (!(d11 >= 0.0)) break block8;
                                            double d13 = d11 - 1.0E-30;
                                            d12 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                                            if (n2 != 0) break block9;
                                            if (d12 >= 0) {
                                                this.d = Math.sqrt(d11);
                                                d11 = 0.25 / this.d;
                                                this.c = (double)(dc2.e - dc2.h) * d11;
                                                this.a = (double)(dc2.a - dc2.f) * d11;
                                                this.b = (double)(dc2.c - dc2.d) * d11;
                                                return;
                                            }
                                            break block10;
                                        }
                                        this.d = 0.0;
                                        this.c = 0.0;
                                        this.a = 0.0;
                                        this.b = 1.0;
                                    }
                                    return;
                                }
                                this.d = 0.0;
                                d11 = -0.5 * (double)(dc2.g + dc2.i);
                                if (n2 != 0) break block11;
                                double d14 = d11 - 0.0;
                                d12 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                            }
                            if (d12 < 0) break block12;
                            double d15 = d11 - 1.0E-30;
                            d10 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                            if (n2 != 0) break block13;
                            if (d10 >= 0) {
                                this.c = Math.sqrt(d11);
                                d11 = 0.5 / this.c;
                                this.a = (double)dc2.c * d11;
                                this.b = (double)dc2.f * d11;
                                return;
                            }
                            break block14;
                        }
                        this.c = 0.0;
                        this.a = 0.0;
                        this.b = 1.0;
                    }
                    return;
                }
                this.c = 0.0;
                d11 = 0.5 * (1.0 - (double)dc2.i);
                if (n2 != 0) break block15;
                double d16 = d11 - 1.0E-30;
                d10 = d16 == 0.0 ? 0 : (d16 > 0.0 ? 1 : -1);
            }
            if (d10 >= 0) {
                this.a = Math.sqrt(d11);
                this.b = (double)dc2.e / (2.0 * this.a);
            }
            this.a = 0.0;
            this.b = 1.0;
        }
    }

    public final void d(g4 g42) {
        block4: {
            block2: {
                block3: {
                    double d10 = g42.c * g42.c + g42.a * g42.a + g42.b * g42.b + g42.d * g42.d;
                    int n2 = ae.f();
                    if (n2 == 0) break block2;
                    if (!(d10 > 0.0)) break block3;
                    d10 = 1.0 / Math.sqrt(d10);
                    this.c = d10 * g42.c;
                    this.a = d10 * g42.a;
                    this.b = d10 * g42.b;
                    this.d = d10 * g42.d;
                    if (n2 != 0) break block4;
                }
                this.c = 0.0;
                this.a = 0.0;
                this.b = 0.0;
            }
            this.d = 0.0;
        }
    }

    public final void a(eG eG2) {
        block4: {
            double d10;
            double d11;
            double d12;
            block2: {
                block3: {
                    d12 = Math.sqrt(eG2.e * eG2.e + eG2.d * eG2.d + eG2.c * eG2.c);
                    int n2 = ae.f();
                    d11 = d12;
                    d10 = 1.0E-12;
                    if (n2 == 0) break block2;
                    if (!(d11 < d10)) break block3;
                    this.d = 0.0;
                    this.c = 0.0;
                    this.a = 0.0;
                    this.b = 0.0;
                    if (n2 != 0) break block4;
                }
                d11 = eG2.a;
                d10 = 2.0;
            }
            double d13 = Math.sin(d11 / d10);
            d12 = 1.0 / d12;
            this.d = Math.cos((double)eG2.a / 2.0);
            this.c = (double)eG2.e * d12 * d13;
            this.a = (double)eG2.d * d12 * d13;
            this.b = (double)eG2.c * d12 * d13;
        }
    }

    public g4(ao ao2) {
        super(ao2);
    }

    public final void c(g4 g42) {
        double d10 = this.d * g42.d - this.c * g42.c - this.a * g42.a - this.b * g42.b;
        double d11 = this.d * g42.c + g42.d * this.c + this.a * g42.b - this.b * g42.a;
        double d12 = this.d * g42.a + g42.d * this.a - this.c * g42.b + this.b * g42.c;
        this.b = this.d * g42.b + g42.d * this.b + this.c * g42.a - this.a * g42.c;
        this.d = d10;
        this.c = d11;
        this.a = d12;
    }

    public g4(double[] arrd) {
        double d10 = 1.0 / Math.sqrt(arrd[0] * arrd[0] + arrd[1] * arrd[1] + arrd[2] * arrd[2] + arrd[3] * arrd[3]);
        this.c = arrd[0] * d10;
        this.a = arrd[1] * d10;
        this.b = arrd[2] * d10;
        this.d = arrd[3] * d10;
    }

    public final void a(g4 g42, double d10) {
        double d11;
        double d12;
        block7: {
            double d13;
            double d14;
            block5: {
                block6: {
                    double d15;
                    int n2;
                    double d16;
                    block4: {
                        d16 = this.c * g42.c + this.a * g42.a + this.b * g42.b + this.d * g42.d;
                        n2 = ae.g();
                        double d17 = d16 - 0.0;
                        d15 = d17 == 0.0 ? 0 : (d17 < 0.0 ? -1 : 1);
                        if (n2 != 0) break block4;
                        if (d15 < 0) {
                            g42.c = -g42.c;
                            g42.a = -g42.a;
                            g42.b = -g42.b;
                            g42.d = -g42.d;
                            d16 = -d16;
                        }
                        d14 = 1.0 - d16;
                        d13 = 1.0E-12;
                        if (n2 != 0) break block5;
                        double d18 = d14 - d13;
                        d15 = d18 == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
                    }
                    if (d15 <= 0) break block6;
                    double d19 = Math.acos(d16);
                    double d20 = Math.sin(d19);
                    d12 = Math.sin((1.0 - d10) * d19) / d20;
                    d11 = Math.sin(d10 * d19) / d20;
                    if (n2 == 0) break block7;
                }
                d14 = 1.0;
                d13 = d10;
            }
            d12 = d14 - d13;
            d11 = d10;
        }
        this.d = d12 * this.d + d11 * g42.d;
        this.c = d12 * this.c + d11 * g42.c;
        this.a = d12 * this.a + d11 * g42.a;
        this.b = d12 * this.b + d11 * g42.b;
    }

    public g4(gS gS2) {
        double d10 = 1.0 / Math.sqrt(gS2.c * gS2.c + gS2.a * gS2.a + gS2.b * gS2.b + gS2.d * gS2.d);
        this.c = gS2.c * d10;
        this.a = gS2.a * d10;
        this.b = gS2.b * d10;
        this.d = gS2.d * d10;
    }

    public final void a(g4 g42, g4 g43, double d10) {
        double d11;
        double d12;
        block7: {
            double d13;
            double d14;
            block5: {
                block6: {
                    double d15;
                    int n2;
                    double d16;
                    block4: {
                        d16 = g43.c * g42.c + g43.a * g42.a + g43.b * g42.b + g43.d * g42.d;
                        n2 = ae.g();
                        double d17 = d16 - 0.0;
                        d15 = d17 == 0.0 ? 0 : (d17 < 0.0 ? -1 : 1);
                        if (n2 != 0) break block4;
                        if (d15 < 0) {
                            g42.c = -g42.c;
                            g42.a = -g42.a;
                            g42.b = -g42.b;
                            g42.d = -g42.d;
                            d16 = -d16;
                        }
                        d14 = 1.0 - d16;
                        d13 = 1.0E-12;
                        if (n2 != 0) break block5;
                        double d18 = d14 - d13;
                        d15 = d18 == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
                    }
                    if (d15 <= 0) break block6;
                    double d19 = Math.acos(d16);
                    double d20 = Math.sin(d19);
                    d12 = Math.sin((1.0 - d10) * d19) / d20;
                    d11 = Math.sin(d10 * d19) / d20;
                    if (n2 == 0) break block7;
                }
                d14 = 1.0;
                d13 = d10;
            }
            d12 = d14 - d13;
            d11 = d10;
        }
        this.d = d12 * g42.d + d11 * g43.d;
        this.c = d12 * g42.c + d11 * g43.c;
        this.a = d12 * g42.a + d11 * g43.a;
        this.b = d12 * g42.b + d11 * g43.b;
    }

    public final void a(dU dU2) {
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
                                            d11 = 0.25 * (double)(dU2.l + dU2.d + dU2.m + dU2.h);
                                            n2 = ae.g();
                                            if (n2 != 0) break block7;
                                            if (!(d11 >= 0.0)) break block8;
                                            double d13 = d11 - 1.0E-30;
                                            d12 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                                            if (n2 != 0) break block9;
                                            if (d12 >= 0) {
                                                this.d = Math.sqrt(d11);
                                                d11 = 0.25 / this.d;
                                                this.c = (double)(dU2.k - dU2.f) * d11;
                                                this.a = (double)(dU2.g - dU2.e) * d11;
                                                this.b = (double)(dU2.a - dU2.i) * d11;
                                                return;
                                            }
                                            break block10;
                                        }
                                        this.d = 0.0;
                                        this.c = 0.0;
                                        this.a = 0.0;
                                        this.b = 1.0;
                                    }
                                    return;
                                }
                                this.d = 0.0;
                                d11 = -0.5 * (double)(dU2.d + dU2.m);
                                if (n2 != 0) break block11;
                                double d14 = d11 - 0.0;
                                d12 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                            }
                            if (d12 < 0) break block12;
                            double d15 = d11 - 1.0E-30;
                            d10 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                            if (n2 != 0) break block13;
                            if (d10 >= 0) {
                                this.c = Math.sqrt(d11);
                                d11 = 1.0 / (2.0 * this.c);
                                this.a = (double)dU2.a * d11;
                                this.b = (double)dU2.e * d11;
                                return;
                            }
                            break block14;
                        }
                        this.c = 0.0;
                        this.a = 0.0;
                        this.b = 1.0;
                    }
                    return;
                }
                this.c = 0.0;
                d11 = 0.5 * (1.0 - (double)dU2.m);
                if (n2 != 0) break block15;
                double d16 = d11 - 1.0E-30;
                d10 = d16 == 0.0 ? 0 : (d16 > 0.0 ? 1 : -1);
            }
            if (d10 >= 0) {
                this.a = Math.sqrt(d11);
                this.b = (double)dU2.k / (2.0 * this.a);
                return;
            }
            this.a = 0.0;
            this.b = 1.0;
        }
    }

    public g4(double d10, double d11, double d12, double d13) {
        double d14 = 1.0 / Math.sqrt(d10 * d10 + d11 * d11 + d12 * d12 + d13 * d13);
        this.c = d10 * d14;
        this.a = d11 * d14;
        this.b = d12 * d14;
        this.d = d13 * d14;
    }

    public final void e(g4 g42) {
        double d10 = 1.0 / (g42.d * g42.d + g42.c * g42.c + g42.a * g42.a + g42.b * g42.b);
        this.d = d10 * g42.d;
        this.c = -d10 * g42.c;
        this.a = -d10 * g42.a;
        this.b = -d10 * g42.b;
    }

    public g4() {
    }

    public g4(g4 g42) {
        super(g42);
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
                                                this.d = Math.sqrt(d11);
                                                d11 = 0.25 / this.d;
                                                this.c = (gY2.b - gY2.c) * d11;
                                                this.a = (gY2.i - gY2.g) * d11;
                                                this.b = (gY2.f - gY2.j) * d11;
                                                return;
                                            }
                                            break block10;
                                        }
                                        this.d = 0.0;
                                        this.c = 0.0;
                                        this.a = 0.0;
                                        this.b = 1.0;
                                    }
                                    return;
                                }
                                this.d = 0.0;
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
                                this.c = Math.sqrt(d11);
                                d11 = 0.5 / this.c;
                                this.a = gY2.f * d11;
                                this.b = gY2.g * d11;
                                return;
                            }
                            break block14;
                        }
                        this.c = 0.0;
                        this.a = 0.0;
                        this.b = 1.0;
                    }
                    return;
                }
                this.c = 0.0;
                d11 = 0.5 * (1.0 - gY2.e);
                if (n2 != 0) break block15;
                double d16 = d11 - 1.0E-30;
                d10 = d16 == 0.0 ? 0 : (d16 > 0.0 ? 1 : -1);
            }
            if (d10 >= 0) {
                this.a = Math.sqrt(d11);
                this.b = gY2.b / (2.0 * this.a);
                return;
            }
            this.a = 0.0;
            this.b = 1.0;
        }
    }

    public final void b() {
        double d10 = 1.0 / (this.d * this.d + this.c * this.c + this.a * this.a + this.b * this.b);
        this.d *= d10;
        this.c *= -d10;
        this.a *= -d10;
        this.b *= -d10;
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
                                                this.d = Math.sqrt(d11);
                                                d11 = 0.25 / this.d;
                                                this.c = (dA2.i - dA2.g) * d11;
                                                this.a = (dA2.m - dA2.k) * d11;
                                                this.b = (dA2.b - dA2.f) * d11;
                                                return;
                                            }
                                            break block10;
                                        }
                                        this.d = 0.0;
                                        this.c = 0.0;
                                        this.a = 0.0;
                                        this.b = 1.0;
                                    }
                                    return;
                                }
                                this.d = 0.0;
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
                                this.c = Math.sqrt(d11);
                                d11 = 0.5 / this.c;
                                this.a = dA2.b * d11;
                                this.b = dA2.k * d11;
                                return;
                            }
                            break block14;
                        }
                        this.c = 0.0;
                        this.a = 0.0;
                        this.b = 1.0;
                    }
                    return;
                }
                this.c = 0.0;
                d11 = 0.5 * (1.0 - dA2.h);
                if (n2 == 0) break block15;
                double d16 = d11 - 1.0E-30;
                d10 = d16 == 0.0 ? 0 : (d16 > 0.0 ? 1 : -1);
            }
            if (d10 >= 0) {
                this.a = Math.sqrt(d11);
                this.b = dA2.i / (2.0 * this.a);
                return;
            }
            this.a = 0.0;
            this.b = 1.0;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

