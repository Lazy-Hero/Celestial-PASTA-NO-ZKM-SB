/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public class A
extends x
implements Serializable {
    static final /* synthetic */ long serialVersionUID = -2168194326883512320L;

    public final float a(A a10) {
        double d10;
        block6: {
            double d11;
            double d12;
            block5: {
                d12 = this.b(a10) / (this.c() * a10.c());
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

    public A(float f10, float f11) {
        super(f10, f11);
    }

    public A(x x2) {
        super(x2);
    }

    public A(A a10) {
        super(a10);
    }

    public final float c() {
        return (float)Math.sqrt(this.b * this.b + this.a * this.a);
    }

    public A() {
    }

    public A(aR aR2) {
        super(aR2);
    }

    public final float d() {
        return this.b * this.b + this.a * this.a;
    }

    public A(aq aq2) {
        super(aq2);
    }

    public final float b(A a10) {
        return this.b * a10.b + this.a * a10.a;
    }

    public final void e() {
        float f10 = (float)(1.0 / Math.sqrt(this.b * this.b + this.a * this.a));
        this.b *= f10;
        this.a *= f10;
    }

    public final void c(A a10) {
        float f10 = (float)(1.0 / Math.sqrt(a10.b * a10.b + a10.a * a10.a));
        this.b = a10.b * f10;
        this.a = a10.a * f10;
    }

    public A(float[] arrf) {
        super(arrf);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

