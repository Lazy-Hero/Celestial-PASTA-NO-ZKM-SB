/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public class aq
extends aR
implements Serializable {
    static final /* synthetic */ long serialVersionUID = 8572646365302599857L;

    public final double b(aq aq2) {
        return this.b * aq2.b + this.a * aq2.a;
    }

    public final double c() {
        return Math.sqrt(this.b * this.b + this.a * this.a);
    }

    public aq(double d10, double d11) {
        super(d10, d11);
    }

    public aq() {
    }

    public aq(double[] arrd) {
        super(arrd);
    }

    public aq(aq aq2) {
        super(aq2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public aq(A a10) {
        super(a10);
    }

    public aq(aR aR2) {
        super(aR2);
    }

    public final double d() {
        return this.b * this.b + this.a * this.a;
    }

    public final void a() {
        double d10 = 1.0 / Math.sqrt(this.b * this.b + this.a * this.a);
        this.b *= d10;
        this.a *= d10;
    }

    public final void a(aq aq2) {
        double d10 = 1.0 / Math.sqrt(aq2.b * aq2.b + aq2.a * aq2.a);
        this.b = aq2.b * d10;
        this.a = aq2.a * d10;
    }

    public final double c(aq aq2) {
        double d10;
        block6: {
            double d11;
            double d12;
            block5: {
                d12 = this.b(aq2) / (this.c() * aq2.c());
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

    public aq(x x2) {
        super(x2);
    }
}

