/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import net.minecraft.client.Q;
import net.minecraft.k.l;
import net.minecraft.k.m;

public class fl
extends e8 {
    private /* synthetic */ float l;
    private /* synthetic */ boolean k;
    private /* synthetic */ float m;
    private /* synthetic */ int n;

    public fl(hH hH2, eb eb2, int n2, int n3, int n4, int n5) {
        super(eb2, n2, n3, n4, n5);
        this.k = false;
        this.n = 120;
        this.l = 0.0f;
        this.m = 0.0f;
        this.d = hH2;
    }

    @Override
    public void b(int n2, int n3, int n4) {
        block3: {
            int n5;
            block2: {
                String string = net.minecraft.k.l.b();
                fl fl2 = this;
                n5 = n2;
                if (string == null) break block2;
                if (!fl2.a(n5, n3)) break block3;
                fl2 = this;
                n5 = 1;
            }
            fl2.k = n5;
        }
    }

    @Override
    public void a(int n2, int n3, int n4) {
        this.k = false;
    }

    @Override
    public void b(int n2, int n3) {
        int n4;
        String string;
        hH hH2;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        eb eb2;
        block15: {
            fl fl2;
            block16: {
                int n10;
                block13: {
                    String string2;
                    block14: {
                        double d10;
                        double d11;
                        double d12;
                        block12: {
                            fl fl3;
                            block8: {
                                block9: {
                                    double d13;
                                    block10: {
                                        block11: {
                                            eb2 = this.e();
                                            n9 = eb2.d() + this.a();
                                            n8 = eb2.e() + this.g() + -1;
                                            n7 = this.a(n2, n3);
                                            n6 = this.b();
                                            n5 = this.c();
                                            hH2 = this.d;
                                            d12 = hH2.u();
                                            d11 = hH2.b();
                                            string2 = net.minecraft.k.l.b();
                                            fl3 = this;
                                            if (string2 == null) break block8;
                                            if (!fl3.k) break block9;
                                            hH2.a(this.a((double)(n2 - n9) * (d11 - d12) / (double)n5 + d12, hH2.g()));
                                            double d14 = hH2.f() - d11;
                                            d13 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                                            if (string2 == null) break block10;
                                            if (d13 <= 0) break block11;
                                            hH2.a(d11);
                                            if (string2 != null) break block9;
                                            net.minecraft.k.m.b(!net.minecraft.k.m.c());
                                        }
                                        d10 = hH2.f();
                                        if (string2 == null) break block12;
                                        double d15 = d10 - d12;
                                        d13 = d15 == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1);
                                    }
                                    if (d13 < 0) {
                                        hH2.a(d12);
                                    }
                                }
                                fl3 = this;
                            }
                            d10 = fl3.a(hH2.f(), hH2.g());
                        }
                        double d16 = d10;
                        string = String.valueOf(d16);
                        n4 = Color.WHITE.getRGB();
                        double d17 = (hH2.f() - d12) / (d11 - d12);
                        this.m = n.a(this.m, (float)d17, 0.0f);
                        n10 = n7;
                        if (string2 == null) break block13;
                        if (n10 == 0) break block14;
                        fl2 = this;
                        if (string2 == null) break block15;
                        if (fl2.n >= 200) break block16;
                        this.n += 5;
                        if (string2 != null) break block16;
                    }
                    fl2 = this;
                    if (string2 == null) break block15;
                    n10 = fl2.n;
                }
                if (n10 > 120) {
                    this.n -= 5;
                }
            }
            fl2 = this;
        }
        fl2.l = n.a(this.l, n7 != 0 ? 2.3f : 2.0f, 0.0f);
        dJ.b(n9 + 3, (float)n8 + (float)n6 - 5.0f + -1.0f, n9 + (n5 - 3), n8 + n6 - 2, new Color(45, 44, 44).getRGB());
        dJ.b(n9 + 4, n8 + n6 - 5, (float)n9 + ((float)n5 * this.m - 4.0f), n8 + n6 - 3, eb2.e.b(), eb2.e.a());
        Q.P().aK.c(hH2.a(), (float)n9 + 2.0f, (float)n8 + (float)n6 / this.l - 4.0f, n4);
        Q.P().aK.c(string, n9 + n5 - Q.P().aK.b(string) - 3, (float)n8 + (float)n6 / this.l - 4.0f, n4);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    private double a(double d10, double d11) {
        double d12 = (double)Math.round(d10 / d11) * d11;
        BigDecimal bigDecimal = new BigDecimal(d12);
        bigDecimal = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }
}

