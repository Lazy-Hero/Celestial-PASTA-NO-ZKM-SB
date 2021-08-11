/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public class y
extends x
implements Serializable {
    static final /* synthetic */ long serialVersionUID = -4801347926528714435L;

    public final float c(y y2) {
        return Math.abs(this.b - y2.b) + Math.abs(this.a - y2.a);
    }

    public y(ah ah2) {
        super(ah2);
    }

    public final float a(y y2) {
        float f10 = this.b - y2.b;
        float f11 = this.a - y2.a;
        return (float)Math.sqrt(f10 * f10 + f11 * f11);
    }

    public y(x x2) {
        super(x2);
    }

    public y(float f10, float f11) {
        super(f10, f11);
    }

    public y() {
    }

    public y(y y2) {
        super(y2);
    }

    public y(aR aR2) {
        super(aR2);
    }

    public final float b(y y2) {
        float f10 = this.b - y2.b;
        float f11 = this.a - y2.a;
        return f10 * f10 + f11 * f11;
    }

    public y(float[] arrf) {
        super(arrf);
    }

    public final float d(y y2) {
        return Math.max(Math.abs(this.b - y2.b), Math.abs(this.a - y2.a));
    }
}

