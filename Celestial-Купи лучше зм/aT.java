/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public class aT
extends ae
implements Serializable {
    static final /* synthetic */ long serialVersionUID = 8749319902347760659L;

    public final void b() {
        float f10 = (float)(1.0 / Math.sqrt(this.c * this.c + this.a * this.a + this.b * this.b + this.d * this.d));
        this.c *= f10;
        this.a *= f10;
        this.b *= f10;
        this.d *= f10;
    }

    public aT() {
    }

    public aT(float[] arrf) {
        super(arrf);
    }

    public final float a() {
        return (float)Math.sqrt(this.c * this.c + this.a * this.a + this.b * this.b + this.d * this.d);
    }

    public aT(aT aT2) {
        super(aT2);
    }

    public aT(U u2) {
        super(u2.c, u2.a, u2.b, 0.0f);
    }

    public aT(gS gS2) {
        super(gS2);
    }

    public final float a(aT aT2) {
        return this.c * aT2.c + this.a * aT2.a + this.b * aT2.b + this.d * aT2.d;
    }

    public aT(float f10, float f11, float f12, float f13) {
        super(f10, f11, f12, f13);
    }

    public final void b(aT aT2) {
        float f10 = (float)(1.0 / Math.sqrt(aT2.c * aT2.c + aT2.a * aT2.a + aT2.b * aT2.b + aT2.d * aT2.d));
        this.c = aT2.c * f10;
        this.a = aT2.a * f10;
        this.b = aT2.b * f10;
        this.d = aT2.d * f10;
    }

    public final float c(aT aT2) {
        double d10;
        block6: {
            double d11;
            double d12;
            block5: {
                d12 = this.a(aT2) / (this.a() * aT2.a());
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
        return (float)d10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public final void a(U u2) {
        this.c = u2.c;
        this.a = u2.a;
        this.b = u2.b;
        this.d = 0.0f;
    }

    public final float f() {
        return this.c * this.c + this.a * this.a + this.b * this.b + this.d * this.d;
    }

    public aT(ae ae2) {
        super(ae2);
    }

    public aT(gO gO2) {
        super(gO2);
    }
}

