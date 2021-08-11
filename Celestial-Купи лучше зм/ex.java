/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.Q;
import net.minecraft.k.m;

public class ex {
    private /* synthetic */ double b;
    private /* synthetic */ double a;

    public void a(double d10, double d11, double d12) {
        this.b = n.a(d10, this.b, d12);
        this.a = n.a(d11, this.a, d12);
    }

    public ex(float f10, float f11) {
        this.b = f10;
        this.a = f11;
    }

    public void b(double d10, double d11, double d12) {
        this.b = n.a((float)d10, (float)this.b, (long)d12, (float)d12);
        this.a = n.a((float)d11, (float)this.a, (long)d12, (float)d12);
    }

    public double b() {
        return this.b;
    }

    public double a() {
        return this.a;
    }

    public void a(double d10) {
        this.b = d10;
    }

    public void a(float f10, float f11, float f12, float f13) {
        int n2 = (int)(Math.abs((double)f10 - this.b) * (double)f12);
        int n3 = (int)(Math.abs((double)f11 - this.a) * (double)f13);
        boolean bl2 = n.b();
        this.b = n.a(f10, (float)this.b, (long)Q.o, n2);
        this.a = n.a(f11, (float)this.a, (long)Q.o, n3);
        if (!bl2) {
            m.b(!m.c());
        }
    }

    public void b(double d10) {
        this.a = d10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

