/*
 * Decompiled with CFR 0.150.
 */
public class bV
extends bE {
    public static /* synthetic */ hH k;
    public static /* synthetic */ hH m;
    public static /* synthetic */ hH l;

    public bV() {
        super("ClickGui", a5.Hud);
        k = new hH("Particles", this, false);
        cj.b.f.b(k);
        l = new hH("Blur", this, false);
        cj.b.f.b(l);
        m = new hH("ScrollInversion", this, true);
        cj.b.f.b(m);
        this.a(54);
    }

    @Override
    public void d() {
        super.d();
        c.a(cj.b.l);
        this.e();
    }
}

