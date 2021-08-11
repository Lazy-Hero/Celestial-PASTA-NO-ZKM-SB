/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import net.minecraft.Q.G;
import net.minecraft.client.Q;
import net.minecraft.client.a.v;
import net.minecraft.client.q.c;

public class b3
extends bE {
    public static /* synthetic */ int k;
    private final /* synthetic */ hH m;
    public /* synthetic */ double l;

    @cL
    public void a(fR fR2) {
        block12: {
            block25: {
                c c10;
                block26: {
                    boolean bl2;
                    String string;
                    block24: {
                        block23: {
                            block13: {
                                String string2;
                                block14: {
                                    block21: {
                                        c c11;
                                        block22: {
                                            double d10;
                                            block19: {
                                                block20: {
                                                    block17: {
                                                        Q q2;
                                                        block18: {
                                                            int n2;
                                                            block15: {
                                                                block16: {
                                                                    string = v.A();
                                                                    if (!this.i()) break block12;
                                                                    string2 = cj.b.f.a("Speed Mode").m();
                                                                    this.b(string2);
                                                                    bl2 = string2.equalsIgnoreCase("Sunrise");
                                                                    if (string == null) break block13;
                                                                    if (!bl2) break block14;
                                                                    n2 = b3.c.s.A;
                                                                    if (string != null) {
                                                                        if (n2 != 0) {
                                                                            b3.c.s.aH();
                                                                        }
                                                                        n2 = this.m.l();
                                                                    }
                                                                    if (string != null) {
                                                                        if (n2 != 0) {
                                                                            hC.c();
                                                                        }
                                                                        b3.c.s.a_ *= 1.04f;
                                                                        double d11 = (double)b3.c.s.an - 0.2;
                                                                        n2 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                                                                    }
                                                                    if (string == null) break block15;
                                                                    if (n2 <= 0) break block16;
                                                                    n2 = b3.c.s.H % 60;
                                                                    if (string == null) break block15;
                                                                    if (n2 > 39) {
                                                                        b3.c.a8.d = b3.c.s.H % 2 == 0 ? 5000.0f : 1.0f;
                                                                    }
                                                                }
                                                                q2 = c;
                                                                if (string == null) break block17;
                                                                float f10 = q2.s.an - 1.0f;
                                                                n2 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                                                            }
                                                            if (n2 > 0) break block18;
                                                            double d10 = (double)b3.c.s.an - 0.1;
                                                            d10 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                                                            if (string == null) break block19;
                                                            if (d10 >= 0) break block20;
                                                        }
                                                        q2 = c;
                                                    }
                                                    q2.a8.d = 1.0f;
                                                }
                                                c11 = b3.c.s;
                                                if (string == null) break block21;
                                                double d10 = c11.G - 0.0;
                                                d10 = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
                                            }
                                            if (d10 <= 0) break block22;
                                            c11 = b3.c.s;
                                            if (string == null) break block21;
                                            if (c11.A) break block22;
                                            b3.c.s.G -= 0.00994;
                                            if (string != null) break block12;
                                        }
                                        c11 = b3.c.s;
                                    }
                                    c11.G -= 0.00995;
                                    if (string != null) break block12;
                                }
                                bl2 = string2.equalsIgnoreCase("Wellmore");
                            }
                            if (string == null) break block23;
                            if (!bl2) break block12;
                            bl2 = this.m.l();
                        }
                        if (string == null) break block24;
                        if (bl2) {
                            hC.c();
                        }
                        c10 = b3.c.s;
                        if (string == null) break block25;
                        bl2 = c10.A;
                    }
                    if (!bl2) break block26;
                    b3.c.s.aH();
                    b3.c.s.cx = 2.0f;
                    b3.c.s.a_ = 2.0f;
                    if (string != null) break block12;
                }
                c10 = b3.c.s;
            }
            c10.G = -20.0;
            b3.c.a8.d = 2.0f;
        }
    }

    @Override
    public void m() {
        b3.c.a8.d = 1.0f;
        b3.c.s.cx = 0.02f;
        super.m();
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @cL
    public void a(fz fz2) {
        block0: {
            String string;
            if (!(fz2.a() instanceof G) || !(string = cj.b.f.a("Speed Mode").m()).equalsIgnoreCase("Sunrise")) break block0;
            fz2.a(true);
        }
    }

    public b3() {
        super("Speed", a5.Movement);
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Sunrise");
        arrayList.add("Wellmore");
        cj.b.f.b(new hH("Speed Mode", (bE)this, "Wellmore", arrayList));
        this.m = new hH("Strafing", this, false);
        cj.b.f.b(this.m);
    }
}

