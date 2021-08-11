/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public class gO
extends gS
implements Serializable {
    static final /* synthetic */ long serialVersionUID = 3938123424117448700L;

    public final double h() {
        return this.c * this.c + this.a * this.a + this.b * this.b + this.d * this.d;
    }

    public gO() {
    }

    public final double e() {
        return Math.sqrt(this.c * this.c + this.a * this.a + this.b * this.b + this.d * this.d);
    }

    public gO(aT aT2) {
        super(aT2);
    }

    public final double c(gO gO2) {
        return this.c * gO2.c + this.a * gO2.a + this.b * gO2.b + this.d * gO2.d;
    }

    public final void a(o o2) {
        this.c = o2.c;
        this.a = o2.b;
        this.b = o2.a;
        this.d = 0.0;
    }

    public gO(ae ae2) {
        super(ae2);
    }

    public final double a(gO gO2) {
        double d10;
        block6: {
            double d11;
            double d12;
            block5: {
                d12 = this.c(gO2) / (this.e() * gO2.e());
                int n2 = ae.f();
                double d13 = d12 - -1.0;
                d11 = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
                if (n2 == 0) break block5;
                if (d11 < 0) {
                    d12 = -1.0;
                }
                d10 = d12;
                if (n2 == 0) break block6;
                double d14 = d10 - 1.0;
                d11 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
            }
            if (d11 > 0) {
                d12 = 1.0;
            }
            d10 = Math.acos(d12);
        }
        return d10;
    }

    public gO(o o2) {
        super(o2.c, o2.b, o2.a, 0.0);
    }

    public final void g() {
        double d10 = 1.0 / Math.sqrt(this.c * this.c + this.a * this.a + this.b * this.b + this.d * this.d);
        this.c *= d10;
        this.a *= d10;
        this.b *= d10;
        this.d *= d10;
    }

    public final void b(gO gO2) {
        double d10 = 1.0 / Math.sqrt(gO2.c * gO2.c + gO2.a * gO2.a + gO2.b * gO2.b + gO2.d * gO2.d);
        this.c = gO2.c * d10;
        this.a = gO2.a * d10;
        this.b = gO2.b * d10;
        this.d = gO2.d * d10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public gO(gO gO2) {
        super(gO2);
    }

    public gO(double[] arrd) {
        super(arrd);
    }

    public gO(gS gS2) {
        super(gS2);
    }

    public gO(double d10, double d11, double d12, double d13) {
        super(d10, d11, d12, d13);
    }
}

