/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public class at
extends ae
implements Serializable {
    static final /* synthetic */ long serialVersionUID = 4643134103185764459L;

    public at(U u2) {
        super(u2.c, u2.a, u2.b, 1.0f);
    }

    public final float e(at at2) {
        float f10 = Math.max(Math.abs(this.c - at2.c), Math.abs(this.a - at2.a));
        float f11 = Math.max(Math.abs(this.b - at2.b), Math.abs(this.d - at2.d));
        return Math.max(f10, f11);
    }

    public at(float[] arrf) {
        super(arrf);
    }

    public final float a(at at2) {
        float f10 = this.c - at2.c;
        float f11 = this.a - at2.a;
        float f12 = this.b - at2.b;
        float f13 = this.d - at2.d;
        return (float)Math.sqrt(f10 * f10 + f11 * f11 + f12 * f12 + f13 * f13);
    }

    public at() {
    }

    public final void a(U u2) {
        this.c = u2.c;
        this.a = u2.a;
        this.b = u2.b;
        this.d = 1.0f;
    }

    public final void c(at at2) {
        float f10 = 1.0f / at2.d;
        this.c = at2.c * f10;
        this.a = at2.a * f10;
        this.b = at2.b * f10;
        this.d = 1.0f;
    }

    public final float b(at at2) {
        float f10 = this.c - at2.c;
        float f11 = this.a - at2.a;
        float f12 = this.b - at2.b;
        float f13 = this.d - at2.d;
        return f10 * f10 + f11 * f11 + f12 * f12 + f13 * f13;
    }

    public at(gS gS2) {
        super(gS2);
    }

    public final float d(at at2) {
        return Math.abs(this.c - at2.c) + Math.abs(this.a - at2.a) + Math.abs(this.b - at2.b) + Math.abs(this.d - at2.d);
    }

    public at(ae ae2) {
        super(ae2);
    }

    public at(float f10, float f11, float f12, float f13) {
        super(f10, f11, f12, f13);
    }

    public at(g5 g52) {
        super(g52);
    }

    public at(at at2) {
        super(at2);
    }
}

