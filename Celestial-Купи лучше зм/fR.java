/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.Q;
import net.minecraft.k.m;

public class fR
extends fe {
    private static /* synthetic */ boolean i;
    public /* synthetic */ double f;
    private /* synthetic */ float d;
    private /* synthetic */ float c;
    private /* synthetic */ boolean h;
    public /* synthetic */ double g;
    public /* synthetic */ double e;

    public void c(double d10) {
        this.g = d10;
    }

    public void b(boolean bl2) {
        this.h = bl2;
    }

    public static boolean d() {
        return i;
    }

    public double b() {
        return this.e;
    }

    public void c(float f10) {
        this.d = f10;
        Q.P().s.e = f10;
    }

    public double e() {
        return this.f;
    }

    public double i() {
        return this.g;
    }

    public void a(float f10) {
        this.d = f10;
        Q.P().s.a1 = f10;
        Q.P().s.bf = f10;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public static void c(boolean bl2) {
        i = bl2;
    }

    public fR(float f10, float f11, boolean bl2, double d10, double d11, double d12) {
        this.d = f10;
        this.c = f11;
        this.h = bl2;
        this.e = d10;
        this.f = d11;
        this.g = d12;
        boolean bl3 = fR.d();
        if (!m.d()) {
            fR.c(!bl3);
        }
    }

    public float a() {
        return this.d;
    }

    public boolean f() {
        return this.h;
    }

    public float j() {
        return this.c;
    }

    static {
        if (!fR.g()) {
            fR.c(true);
        }
    }

    public void a(double d10) {
        this.f = d10;
    }

    public static boolean g() {
        boolean bl2 = fR.d();
        return !bl2;
    }

    public void b(double d10) {
        this.e = d10;
    }

    public boolean h() {
        return this.h;
    }

    public void b(float f10) {
        this.c = f10;
        Q.P().s.be = f10;
    }
}

