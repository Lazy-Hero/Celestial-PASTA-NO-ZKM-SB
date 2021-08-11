/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public class ah
extends aR
implements Serializable {
    static final /* synthetic */ long serialVersionUID = 1133748791492571954L;

    public final double a(ah ah2) {
        return Math.abs(this.b - ah2.b) + Math.abs(this.a - ah2.a);
    }

    public ah(ah ah2) {
        super(ah2);
    }

    public ah(double d10, double d11) {
        super(d10, d11);
    }

    public final double c(ah ah2) {
        double d10 = this.b - ah2.b;
        double d11 = this.a - ah2.a;
        return Math.sqrt(d10 * d10 + d11 * d11);
    }

    public final double b(ah ah2) {
        return Math.max(Math.abs(this.b - ah2.b), Math.abs(this.a - ah2.a));
    }

    public ah() {
    }

    public ah(x x2) {
        super(x2);
    }

    public ah(y y2) {
        super(y2);
    }

    public ah(aR aR2) {
        super(aR2);
    }

    public final double d(ah ah2) {
        double d10 = this.b - ah2.b;
        double d11 = this.a - ah2.a;
        return d10 * d10 + d11 * d11;
    }

    public ah(double[] arrd) {
        super(arrd);
    }
}

