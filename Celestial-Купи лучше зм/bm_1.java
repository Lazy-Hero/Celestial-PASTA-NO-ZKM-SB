/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import net.minecraft.client.a.v;
import net.minecraft.d.A;
import net.minecraft.k.m;

public class bm
extends bE {
    public /* synthetic */ hH o;
    public static /* synthetic */ ef n;
    /* synthetic */ boolean l;
    private final /* synthetic */ hH m;
    public static /* synthetic */ ef k;

    public bm() {
        block0: {
            String string = v.A();
            super("Step", a5.Movement);
            String string2 = string;
            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList.add("Motion");
            cj.b.f.b(new hH("Step Mode", (bE)this, "Motion", arrayList));
            this.o = new hH("Height", this, 1.5, 1.0, 10.0, 0.1);
            cj.b.f.b(this.o);
            this.m = new hH("Step Delay", this, 0.1, 0.0, 1.0, 0.1);
            cj.b.f.b(this.m);
            if (!net.minecraft.k.m.c()) break block0;
            v.b("Pcedvc");
        }
    }

    void a() {
        double d10 = bm.c.s.a;
        double d11 = bm.c.s.ax;
        double d12 = bm.c.s.aF;
        double d13 = 0.42;
        bm.c.s.c9.a(new A(d10, d12 + d13, d11, false));
    }

    static {
        k = new ef();
        n = new ef();
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public void m() {
        bm.c.s.aI = 0.625f;
        bm.c.a8.d = 1.0f;
        super.m();
    }

    @cL
    public void a(w w2) {
        block12: {
            double d10;
            double d11;
            String string;
            float f10;
            block17: {
                double d12;
                String string2;
                block14: {
                    boolean bl2;
                    double d13;
                    block16: {
                        float f11;
                        block15: {
                            block13: {
                                block11: {
                                    string2 = cj.b.f.a("Step Mode").m();
                                    this.b(string2);
                                    f11 = this.m.r() * 1000.0f;
                                    d13 = this.o.f();
                                    f10 = 0.37f;
                                    string = v.A();
                                    bl2 = this.l;
                                    if (string != null) {
                                        if (bl2) {
                                            this.l = false;
                                            bm.c.a8.d = 1.0f;
                                        }
                                        bl2 = bm.c.s.u();
                                    }
                                    if (string == null) break block11;
                                    if (bl2) break block12;
                                    bl2 = w2.a();
                                }
                                if (string == null) break block13;
                                if (!bl2) break block14;
                                bl2 = bm.c.s.B;
                            }
                            if (string == null) break block15;
                            if (!bl2) break block12;
                            bl2 = bm.c.ac.v.h();
                        }
                        if (string == null) break block16;
                        if (bl2) break block12;
                        bl2 = n.a(f11);
                    }
                    if (!bl2) break block12;
                    w2.b(d13);
                    w2.a(true);
                    if (string != null) break block12;
                }
                d11 = bm.c.s.m().b - bm.c.s.aF;
                double d14 = d11 - 0.625;
                double d15 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                if (string != null) {
                    d15 = d15 >= 0 ? 1.0 : 0.0;
                }
                d10 = d12 = d15;
                if (string != null) {
                    if (d10 != false) {
                        k.d();
                        n.d();
                    }
                    d10 = (double)string2.equalsIgnoreCase("Motion");
                }
                if (string == null) break block17;
                if (d10 == false) break block12;
                d10 = d12;
            }
            if (d10 != false) {
                bm.c.a8.d = f10 - (d11 >= 1.0 ? Math.abs(1.0f - (float)d11) * (f10 * 0.7f) : 0.0f);
                if (string != null) {
                    if (bm.c.a8.d <= 0.05f) {
                        bm.c.a8.d = 0.05f;
                    }
                    this.l = true;
                }
                this.a();
            }
        }
    }
}

