/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import net.minecraft.client.Q;
import net.minecraft.client.a.v;

public class bR
extends bE {
    private final /* synthetic */ hH k;

    @cL
    public void a(fR fR2) {
        block6: {
            block13: {
                Q q2;
                boolean bl2;
                block11: {
                    String string;
                    block12: {
                        block9: {
                            block10: {
                                block8: {
                                    block2: {
                                        String string2;
                                        block3: {
                                            block7: {
                                                Q q3;
                                                boolean bl3;
                                                block4: {
                                                    block5: {
                                                        string2 = cj.b.f.a("Fly Mode").m();
                                                        string = v.A();
                                                        this.b(string2);
                                                        bl2 = string2.equalsIgnoreCase("Vanilla");
                                                        if (string == null) break block2;
                                                        if (!bl2) break block3;
                                                        bR.c.s.cw.e = true;
                                                        hC.a((double)this.k.r());
                                                        bl3 = bR.c.ac.bc.b();
                                                        if (string == null) break block4;
                                                        if (!bl3) break block5;
                                                        bR.c.s.G -= 0.1;
                                                        if (string != null) break block6;
                                                    }
                                                    q3 = c;
                                                    if (string == null) break block7;
                                                    bl3 = q3.ac.v.b();
                                                }
                                                if (!bl3) break block6;
                                                q3 = c;
                                            }
                                            q3.s.G += 0.1;
                                            if (string != null) break block6;
                                        }
                                        bl2 = string2.equalsIgnoreCase("Wellmore");
                                    }
                                    if (string == null) break block8;
                                    if (!bl2) break block6;
                                    bl2 = bR.c.s.A;
                                }
                                if (string == null) break block9;
                                if (!bl2) break block10;
                                bR.c.s.aH();
                                if (string != null) break block6;
                            }
                            bR.c.s.aq = 0.0;
                            bR.c.s.d = 0.0;
                            bR.c.s.G = -0.01;
                            hC.a((double)this.k.r());
                            bR.c.s.cx = 0.3f;
                            bl2 = bR.c.ac.bc.b();
                        }
                        if (string == null) break block11;
                        if (!bl2) break block12;
                        bR.c.s.G -= 0.6;
                        if (string != null) break block6;
                    }
                    q2 = c;
                    if (string == null) break block13;
                    bl2 = q2.ac.v.b();
                }
                if (!bl2) break block6;
                q2 = c;
            }
            q2.s.G += 0.6;
        }
    }

    @Override
    public void m() {
        block3: {
            block2: {
                String string = v.A();
                super.m();
                bR.c.s.cx = 0.02f;
                bR.c.a8.d = 1.0f;
                bR.c.s.cw.e = false;
                String string2 = string;
                String string3 = cj.b.f.a("Fly Mode").m();
                if (string2 == null) break block2;
                if (!string3.equalsIgnoreCase("Wellmore")) break block3;
                bR.c.s.d = 0.0;
            }
            bR.c.s.aq = 0.0;
        }
    }

    public bR() {
        super("Fly", a5.Movement);
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Vanilla");
        arrayList.add("Wellmore");
        cj.b.f.b(new hH("Fly Mode", (bE)this, "Vanilla", arrayList));
        this.k = new hH("Fly Speed", this, 5.0, 0.1, 15.0, 0.1);
        cj.b.f.b(this.k);
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

