/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public class X
extends U
implements Serializable {
    static final /* synthetic */ long serialVersionUID = -8689337816398030143L;

    public final void a(at at2) {
        float f10 = 1.0f / at2.d;
        this.c = at2.c * f10;
        this.a = at2.a * f10;
        this.b = at2.b * f10;
    }

    public X(o o2) {
        super(o2);
    }

    public final float a(X x2) {
        return Math.abs(this.c - x2.c) + Math.abs(this.a - x2.a) + Math.abs(this.b - x2.b);
    }

    public X(float[] arrf) {
        super(arrf);
    }

    public final float d(X x2) {
        float f10 = this.c - x2.c;
        float f11 = this.a - x2.a;
        float f12 = this.b - x2.b;
        return (float)Math.sqrt(f10 * f10 + f11 * f11 + f12 * f12);
    }

    public final float b(X x2) {
        float f10 = this.c - x2.c;
        float f11 = this.a - x2.a;
        float f12 = this.b - x2.b;
        return f10 * f10 + f11 * f11 + f12 * f12;
    }

    public X(U u2) {
        super(u2);
    }

    public X(X x2) {
        super(x2);
    }

    public final float c(X x2) {
        float f10 = Math.max(Math.abs(this.c - x2.c), Math.abs(this.a - x2.a));
        return Math.max(f10, Math.abs(this.b - x2.b));
    }

    public X(float f10, float f11, float f12) {
        super(f10, f11, f12);
    }

    public X() {
    }

    public X(p p2) {
        super(p2);
    }
}

