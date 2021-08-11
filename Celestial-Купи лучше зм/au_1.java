/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public class au
extends U
implements Serializable {
    static final /* synthetic */ long serialVersionUID = -7031930069184524614L;

    public au(U u2) {
        super(u2);
    }

    public final float a() {
        return (float)Math.sqrt(this.c * this.c + this.a * this.a + this.b * this.b);
    }

    public final void a(au au2, au au3) {
        float f10 = au2.a * au3.b - au2.b * au3.a;
        float f11 = au3.c * au2.b - au3.b * au2.c;
        this.b = au2.c * au3.a - au2.a * au3.c;
        this.c = f10;
        this.a = f11;
    }

    public final void e() {
        float f10 = (float)(1.0 / Math.sqrt(this.c * this.c + this.a * this.a + this.b * this.b));
        this.c *= f10;
        this.a *= f10;
        this.b *= f10;
    }

    public au(q q2) {
        super(q2);
    }

    public au(float[] arrf) {
        super(arrf);
    }

    public final float a(au au2) {
        return this.c * au2.c + this.a * au2.a + this.b * au2.b;
    }

    public final float c(au au2) {
        double d10;
        block6: {
            double d11;
            double d12;
            block5: {
                d12 = this.a(au2) / (this.a() * au2.a());
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

    public final void b(au au2) {
        float f10 = (float)(1.0 / Math.sqrt(au2.c * au2.c + au2.a * au2.a + au2.b * au2.b));
        this.c = au2.c * f10;
        this.a = au2.a * f10;
        this.b = au2.b * f10;
    }

    public au() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public au(float f10, float f11, float f12) {
        super(f10, f11, f12);
    }

    public final float d() {
        return this.c * this.c + this.a * this.a + this.b * this.b;
    }

    public au(o o2) {
        super(o2);
    }

    public au(au au2) {
        super(au2);
    }
}

