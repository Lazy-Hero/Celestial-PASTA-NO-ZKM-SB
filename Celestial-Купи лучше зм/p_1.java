/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public class p
extends o
implements Serializable {
    static final /* synthetic */ long serialVersionUID = 5718062286069042927L;

    public final void a(g5 g52) {
        double d10 = 1.0 / g52.d;
        this.c = g52.c * d10;
        this.b = g52.a * d10;
        this.a = g52.b * d10;
    }

    public p() {
    }

    public final double c(p p2) {
        return Math.abs(this.c - p2.c) + Math.abs(this.b - p2.b) + Math.abs(this.a - p2.a);
    }

    public p(U u2) {
        super(u2);
    }

    public final double b(p p2) {
        double d10 = this.c - p2.c;
        double d11 = this.b - p2.b;
        double d12 = this.a - p2.a;
        return Math.sqrt(d10 * d10 + d11 * d11 + d12 * d12);
    }

    public p(double d10, double d11, double d12) {
        super(d10, d11, d12);
    }

    public p(double[] arrd) {
        super(arrd);
    }

    public p(o o2) {
        super(o2);
    }

    public final double a(p p2) {
        double d10 = this.c - p2.c;
        double d11 = this.b - p2.b;
        double d12 = this.a - p2.a;
        return d10 * d10 + d11 * d11 + d12 * d12;
    }

    public final double d(p p2) {
        double d10 = Math.max(Math.abs(this.c - p2.c), Math.abs(this.b - p2.b));
        return Math.max(d10, Math.abs(this.a - p2.a));
    }

    public p(X x2) {
        super(x2);
    }

    public p(p p2) {
        super(p2);
    }
}

