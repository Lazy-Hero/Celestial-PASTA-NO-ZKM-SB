/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import net.minecraft.C.K;
import net.minecraft.Q.J;
import net.minecraft.ac.c;
import net.minecraft.d.A;
import net.minecraft.d.p;

public class bH
extends bE {
    /* synthetic */ int q;
    /* synthetic */ double[] p;
    /* synthetic */ int m;
    /* synthetic */ int n;
    private final /* synthetic */ hH k;
    /* synthetic */ ef o;
    /* synthetic */ ef l;

    @cL
    public void a(fb fb2) {
        String string = cj.b.f.a("Criticals Mode").m();
        this.b(string);
        ++this.q;
    }

    @cL
    public void a(fz fz2) {
        block4: {
            short s2;
            block5: {
                K k2;
                int[] arrn;
                block3: {
                    boolean bl2;
                    K k3;
                    block2: {
                        k3 = fz2.a();
                        arrn = net.minecraft.ac.c.i();
                        bl2 = k3 instanceof J;
                        if (arrn == null) break block2;
                        if (bl2) {
                            this.m = 0;
                        }
                        k2 = k3;
                        if (arrn == null) break block3;
                        bl2 = k2 instanceof p;
                    }
                    if (!bl2) break block4;
                    k2 = k3;
                }
                p p2 = (p)k2;
                short s3 = p2.b();
                short s4 = p2.c();
                s2 = s3;
                if (arrn == null) break block5;
                if (s2 == 0) break block4;
                s2 = s4;
            }
            if (s2 == 0) {
                ++this.n;
            }
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public bH() {
        super("Criticals", a5.Combat);
        this.o = new ef();
        this.l = new ef();
        this.q = 0;
        this.p = new double[]{0.4100000000000002, 0.01099999999999924};
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("NCP");
        arrayList.add("Packet");
        cj.b.f.b(new hH("Criticals Mode", (bE)this, "Packet", arrayList));
        this.k = new hH("Mini-Jump", this, false);
        cj.b.f.b(this.k);
    }

    @cL
    public void a(ft ft2) {
        block9: {
            block8: {
                bH bH2;
                int[] arrn;
                block15: {
                    boolean bl2;
                    double d10;
                    double d11;
                    double d12;
                    block14: {
                        block13: {
                            block12: {
                                block10: {
                                    String string;
                                    block11: {
                                        string = cj.b.f.a("Criticals Mode").m();
                                        arrn = net.minecraft.ac.c.i();
                                        if (bn.l == null || !cj.b.i.a(bn.class).i()) break block9;
                                        d12 = bH.c.s.a;
                                        d11 = bH.c.s.aF;
                                        d10 = bH.c.s.ax;
                                        bl2 = string.equalsIgnoreCase("Packet");
                                        if (arrn == null) break block10;
                                        if (!bl2) break block11;
                                        if (this.k.l()) {
                                            bH.c.s.g(d12, d11 + 0.04, d10);
                                        }
                                        bH.c.s.c9.a(new A(d12, d11 + 0.11, d10, false));
                                        bH.c.s.c9.a(new A(d12, d11 + 0.1100013579, d10, false));
                                        bH.c.s.c9.a(new A(d12, d11 + 1.3579E-6, d10, false));
                                        bH.c.s.h(ft2.a());
                                        if (arrn != null) break block9;
                                    }
                                    bl2 = string.equalsIgnoreCase("NCP");
                                }
                                if (arrn == null) break block12;
                                if (!bl2) break block9;
                                bl2 = this.l.a(800.0);
                            }
                            if (arrn == null) break block13;
                            if (!bl2) break block9;
                            bl2 = bH.c.s.A;
                        }
                        if (arrn == null) break block14;
                        if (!bl2) break block9;
                        bH2 = this;
                        if (arrn == null) break block15;
                        bl2 = bH2.k.l();
                    }
                    if (bl2) {
                        bH.c.s.g(d12, d11 + 0.04, d10);
                    }
                    bH2 = this;
                }
                for (double d13 : bH2.p) {
                    bH.c.s.c9.a(new A(bH.c.s.a, bH.c.s.aF + d13, bH.c.s.ax, false));
                    if (arrn != null) {
                        if (arrn != null) continue;
                    }
                    break block8;
                }
                bH.c.s.h(ft2.a());
            }
            this.l.d();
        }
    }

    @cL
    public void a(w w2) {
        block3: {
            block4: {
                bH bH2;
                boolean bl2;
                block2: {
                    int[] arrn = net.minecraft.ac.c.i();
                    bl2 = w2.a();
                    if (arrn == null) break block2;
                    if (bl2) break block3;
                    bH2 = this;
                    if (arrn == null) break block4;
                    bH2.o.d();
                    bl2 = bH.c.s.aE;
                }
                if (bl2) break block3;
                bH2 = this;
            }
            bH2.m = 0;
        }
    }
}

