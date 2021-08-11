/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public class g5
extends gS
implements Serializable {
    static final /* synthetic */ long serialVersionUID = 1733471895962736949L;

    public g5(gS gS2) {
        super(gS2);
    }

    public g5(double[] arrd) {
        super(arrd);
    }

    public final double d(g5 g52) {
        return Math.abs(this.c - g52.c) + Math.abs(this.a - g52.a) + Math.abs(this.b - g52.b) + Math.abs(this.d - g52.d);
    }

    public final double a(g5 g52) {
        double d10 = Math.max(Math.abs(this.c - g52.c), Math.abs(this.a - g52.a));
        double d11 = Math.max(Math.abs(this.b - g52.b), Math.abs(this.d - g52.d));
        return Math.max(d10, d11);
    }

    public g5(g5 g52) {
        super(g52);
    }

    public g5() {
    }

    public final double b(g5 g52) {
        double d10 = this.c - g52.c;
        double d11 = this.a - g52.a;
        double d12 = this.b - g52.b;
        double d13 = this.d - g52.d;
        return Math.sqrt(d10 * d10 + d11 * d11 + d12 * d12 + d13 * d13);
    }

    public g5(o o2) {
        super(o2.c, o2.b, o2.a, 1.0);
    }

    public g5(at at2) {
        super(at2);
    }

    public final double c(g5 g52) {
        double d10 = this.c - g52.c;
        double d11 = this.a - g52.a;
        double d12 = this.b - g52.b;
        double d13 = this.d - g52.d;
        return d10 * d10 + d11 * d11 + d12 * d12 + d13 * d13;
    }

    public g5(ae ae2) {
        super(ae2);
    }

    public final void e(g5 g52) {
        double d10 = 1.0 / g52.d;
        this.c = g52.c * d10;
        this.a = g52.a * d10;
        this.b = g52.b * d10;
        this.d = 1.0;
    }

    public g5(double d10, double d11, double d12, double d13) {
        super(d10, d11, d12, d13);
    }

    public final void a(o o2) {
        this.c = o2.c;
        this.a = o2.b;
        this.b = o2.a;
        this.d = 1.0;
    }
}

