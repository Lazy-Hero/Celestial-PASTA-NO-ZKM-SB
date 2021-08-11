/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import net.minecraft.client.a.v;
import net.minecraft.k.m;

public class bq
extends bE {
    public /* synthetic */ hH l;
    public /* synthetic */ hH k;

    @cL
    public void a(fR fR2) {
        block5: {
            double d10;
            block9: {
                int n2;
                block8: {
                    String string;
                    block7: {
                        block2: {
                            String string2;
                            block3: {
                                double d11;
                                block6: {
                                    int n3;
                                    block4: {
                                        string2 = cj.b.f.a("Jesus Mode").m();
                                        String string3 = v.A();
                                        this.b(string2);
                                        string = string3;
                                        n2 = string2.equalsIgnoreCase("MiniJump");
                                        if (string == null) break block2;
                                        if (n2 == 0) break block3;
                                        n3 = bq.c.s.aj();
                                        if (string == null) break block4;
                                        if (n3 == 0) break block5;
                                        d11 = bq.c.s.G;
                                        if (string == null) break block6;
                                        double d12 = d11 - 0.0;
                                        n3 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                                    }
                                    if (n3 >= 0) break block5;
                                    bq.c.s.aH();
                                    d11 = 0.3;
                                }
                                hC.a(d11);
                                if (string != null) break block5;
                            }
                            n2 = string2.equalsIgnoreCase("Matrix Boost");
                        }
                        if (string == null) break block7;
                        if (n2 == 0) break block5;
                        n2 = bq.c.s.u() ? 1 : 0;
                    }
                    if (string == null) break block8;
                    if (n2 == 0) break block5;
                    d10 = bq.c.s.G;
                    if (string == null) break block9;
                    double d13 = d10 - 0.0;
                    n2 = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
                }
                if (n2 >= 0) break block5;
                bq.c.s.G = this.k.r();
                d10 = this.l.r();
            }
            hC.a(d10);
        }
    }

    public bq() {
        String string = v.A();
        super("Jesus", a5.Movement);
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("MiniJump");
        String string2 = string;
        arrayList.add("Matrix Boost");
        cj.b.f.b(new hH("Jesus Mode", (bE)this, "MiniJump", arrayList));
        this.l = new hH("Boost", this, 1.0, 0.1, 1.5, 0.1);
        cj.b.f.b(this.l);
        this.k = new hH("Motion Up", this, 0.32, 0.3, 0.5, 0.01);
        cj.b.f.b(this.k);
        if (string2 == null) {
            m.b(!m.c());
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

