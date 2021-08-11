/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.W.K;
import net.minecraft.W.bq;
import net.minecraft.ac.c;
import net.minecraft.client.a.v;
import net.minecraft.k.n;

public class b5
extends bE {
    private final /* synthetic */ hH k;

    public b5() {
        super("WaterLeave", a5.Movement);
        this.k = new hH("Leave Motion", this, 10.0, 0.5, 10.0, 0.5f, b5::lambda$new$0);
        cj.b.f.b(this.k);
    }

    private static Boolean lambda$new$0() {
        return true;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @cL
    public void a(fR fR2) {
        block9: {
            block14: {
                net.minecraft.client.q.c c10;
                int n2;
                block12: {
                    String string;
                    block13: {
                        block10: {
                            float f10;
                            block11: {
                                block8: {
                                    n n3 = new n(b5.c.s.a, b5.c.s.aF - 0.1, b5.c.s.ax);
                                    string = v.A();
                                    K k2 = b5.c.e.d(n3).b();
                                    n2 = k2 instanceof bq;
                                    if (string == null) break block8;
                                    if (n2 == 0) break block9;
                                    n2 = fs.a(b5.c.s.m(), 0.0f, K::o) ? 1 : 0;
                                }
                                if (string == null) break block10;
                                if (n2 == 0) break block11;
                                n2 = b5.c.s.a(net.minecraft.ac.c.A) ? 1 : 0;
                                if (string == null) break block10;
                                if (n2 != 0) {
                                    b5.c.s.G = 0.08;
                                }
                            }
                            n2 = (f10 = b5.c.s.an - 0.0f) == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                        }
                        if (string == null) break block12;
                        if (n2 <= 0) break block13;
                        n2 = b5.c.s.H % 2;
                        if (string == null) break block12;
                        if (n2 != 0) break block13;
                        double d10 = b5.c.s.G - 0.0;
                        n2 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                        if (string == null) break block12;
                        if (n2 < 0) {
                            b5.c.s.G = this.k.f();
                        }
                    }
                    c10 = b5.c.s;
                    if (string == null) break block14;
                    n2 = c10.F() ? 1 : 0;
                }
                if (n2 == 0) break block9;
                b5.c.s.aq = 0.0;
                c10 = b5.c.s;
            }
            c10.d = 0.0;
        }
    }
}

