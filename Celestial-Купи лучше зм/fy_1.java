/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.k.m;

public class fy
extends fe {
    private /* synthetic */ float d;
    public static /* synthetic */ float m;
    public static /* synthetic */ float c;
    private /* synthetic */ float f;
    public static /* synthetic */ float l;
    private /* synthetic */ boolean h;
    private /* synthetic */ double e;
    public static /* synthetic */ boolean p;
    public static /* synthetic */ float i;
    private /* synthetic */ boolean o;
    private final /* synthetic */ boolean n;
    private /* synthetic */ double g;
    private /* synthetic */ boolean k;
    private /* synthetic */ double j;

    public boolean b() {
        return this.h;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public void d(boolean bl2) {
        this.h = bl2;
    }

    public boolean j() {
        return this.n;
    }

    public boolean f() {
        boolean bl2 = fR.d();
        boolean bl3 = this.n;
        if (!bl2) {
            bl3 = !bl3;
        }
        return bl3;
    }

    public float l() {
        return this.f;
    }

    public boolean k() {
        return this.k;
    }

    public fy() {
        l = i;
        m = c;
        i = this.f;
        c = this.d;
        p = this.h;
        this.n = false;
    }

    public float e() {
        return this.d;
    }

    public double c() {
        return this.e;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean d() {
        double d10 = this.f - this.f;
        boolean bl2 = fR.g();
        double d11 = this.d - this.d;
        double d12 = Math.abs(d10) - 0.0;
        double d13 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
        if (!bl2) return (boolean)d13;
        if (d13 == false) {
            double d14 = Math.abs(d11) - 0.0;
            d13 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
            if (!bl2) return (boolean)d13;
            if (d13 == false) {
                d13 = 0.0;
                return (boolean)d13;
            }
        }
        d13 = 1.0;
        return (boolean)d13;
    }

    public double g() {
        return this.j;
    }

    public void b(float f10) {
        this.d = f10;
    }

    public void e(boolean bl2) {
        this.o = bl2;
    }

    public double h() {
        return this.g;
    }

    public void c(boolean bl2) {
        this.k = bl2;
    }

    public fy(double d10, double d11, double d12, float f10, float f11, boolean bl2, boolean bl3) {
        this.j = d11;
        this.e = d10;
        this.g = d12;
        this.n = true;
        this.f = f10;
        this.d = f11;
        this.k = bl3;
        boolean bl4 = fR.d();
        this.h = bl2;
        if (bl4) {
            net.minecraft.k.m.b(!net.minecraft.k.m.d());
        }
    }

    public void b(double d10) {
        this.g = d10;
    }

    public void c(double d10) {
        this.e = d10;
    }

    public void b(boolean bl2) {
        this.k = bl2;
    }

    public void a(double d10) {
        this.j = d10;
    }

    public void a(float f10) {
        this.f = f10;
    }

    public boolean i() {
        return this.o;
    }
}

