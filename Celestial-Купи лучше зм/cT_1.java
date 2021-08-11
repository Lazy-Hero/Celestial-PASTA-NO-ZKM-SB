/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.U.x;
import net.minecraft.client.q.b;
import net.minecraft.k.m;
import net.minecraft.u.h;

public class cT
extends bE {
    private /* synthetic */ double m;
    private /* synthetic */ float n;
    public /* synthetic */ hH o;
    private /* synthetic */ double q;
    private /* synthetic */ float l;
    private /* synthetic */ float p;
    private /* synthetic */ double k;

    @Override
    public void d() {
        this.q = cT.c.s.a;
        this.m = cT.c.s.aF;
        this.k = cT.c.s.ax;
        cT.c.s.K = true;
        b b10 = new b(cT.c.e, cT.c.s.m());
        b10.p(cT.c.s);
        b10.aF -= 0.0;
        b10.a1 = cT.c.s.a1;
        cT.c.e.a(-69, (x)b10);
        super.d();
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @cL
    public void a(fq fq2) {
        fq2.a(true);
    }

    @Override
    public void m() {
        cT.c.s.cw.e = false;
        m[] arrm = h.b();
        cT.c.s.cw.a(this.n);
        cT.c.s.at = this.l;
        cT.c.s.e = this.p;
        cT.c.s.K = false;
        cT.c.a2.d();
        cT.c.s.K = false;
        cT.c.s.b(this.q, this.m, this.k, cT.c.s.e, cT.c.s.at);
        cT.c.e.b(-69);
        Object var2_2 = null;
        cT.c.s.d = 0.0;
        cT.c.s.aq = 0.0;
        super.m();
        if (arrm != null) {
            net.minecraft.k.m.b(!net.minecraft.k.m.d());
        }
    }

    @cL
    public void a(fS fS2) {
        cT.c.s.K = true;
        cT.c.s.A = false;
        cT.c.s.cw.a((float)this.o.f());
        cT.c.s.cw.e = true;
    }

    @cL
    public void a(fD fD2) {
        fD2.a(true);
    }

    public cT() {
        super("FreeCam", a5.World);
        this.o = new hH("Speed", this, 0.1, 0.01, 10.0, 0.1);
        cj.b.f.b(this.o);
    }
}

