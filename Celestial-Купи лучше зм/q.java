/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public class q
extends o
implements Serializable {
    static final /* synthetic */ long serialVersionUID = 3761969948420550442L;

    public final double a() {
        return Math.sqrt(this.c * this.c + this.b * this.b + this.a * this.a);
    }

    public final double c(q q2) {
        double d10;
        block6: {
            double d11;
            double d12;
            block5: {
                d12 = this.a(q2) / (this.a() * q2.a());
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

    public final void b(q q2) {
        double d10 = 1.0 / Math.sqrt(q2.c * q2.c + q2.b * q2.b + q2.a * q2.a);
        this.c = q2.c * d10;
        this.b = q2.b * d10;
        this.a = q2.a * d10;
    }

    public q(au au2) {
        super(au2);
    }

    public q(o o2) {
        super(o2);
    }

    public final void b() {
        double d10 = 1.0 / Math.sqrt(this.c * this.c + this.b * this.b + this.a * this.a);
        this.c *= d10;
        this.b *= d10;
        this.a *= d10;
    }

    public final double e() {
        return this.c * this.c + this.b * this.b + this.a * this.a;
    }

    public q(U u2) {
        super(u2);
    }

    public q(double[] arrd) {
        super(arrd);
    }

    public final double a(q q2) {
        return this.c * q2.c + this.b * q2.b + this.a * q2.a;
    }

    public final void a(q q2, q q3) {
        double d10 = q2.b * q3.a - q2.a * q3.b;
        double d11 = q3.c * q2.a - q3.a * q2.c;
        this.a = q2.c * q3.b - q2.b * q3.c;
        this.c = d10;
        this.b = d11;
    }

    public q() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public q(q q2) {
        super(q2);
    }

    public q(double d10, double d11, double d12) {
        super(d10, d11, d12);
    }
}

