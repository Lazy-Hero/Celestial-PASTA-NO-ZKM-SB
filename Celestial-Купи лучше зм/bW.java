/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.a.v;
import net.minecraft.client.q.c;

public class bW
extends bE {
    /* synthetic */ hH k;

    private static gP b(gP gP2) {
        return gP2;
    }

    @cL
    public void a(fb fb2) {
        block8: {
            float f10;
            block14: {
                boolean bl2;
                block13: {
                    String string;
                    block11: {
                        block12: {
                            block10: {
                                block9: {
                                    c c10;
                                    block7: {
                                        string = v.A();
                                        c10 = bW.c.s;
                                        if (string == null) break block7;
                                        if (!c10.aK()) break block8;
                                        c10 = bW.c.s;
                                    }
                                    c10.b(0.0, 0.0, 0.0);
                                    f10 = this.k.r();
                                    bl2 = bW.c.ac.bc.b();
                                    if (string != null) {
                                        if (bl2) {
                                            bW.c.s.G = -f10;
                                        }
                                        bl2 = bW.c.ac.v.b();
                                    }
                                    if (string != null) {
                                        if (bl2) {
                                            bW.c.s.G = f10;
                                        }
                                        bl2 = bW.c.ac.aW.b();
                                    }
                                    if (string == null) break block9;
                                    if (bl2) break block10;
                                    bl2 = bW.c.ac.C.b();
                                }
                                if (string == null) break block11;
                                if (!bl2) break block12;
                            }
                            hC.a((double)f10);
                        }
                        bl2 = bW.c.ac.O.b();
                    }
                    if (string == null) break block13;
                    if (bl2) break block14;
                    bl2 = bW.c.ac.G.b();
                }
                if (!bl2) break block8;
            }
            hC.a((double)f10);
        }
    }

    public bW() {
        super("ElytraFly", a5.Movement);
        this.k = new hH("Speed", this, 2.0, 0.5, 20.0, 0.1);
        cj.b.f.b(this.k);
    }

    @Override
    public void m() {
        bW.c.s.cw.e = false;
        String string = v.A();
        bW.c.s.cw.a(0.05f);
        if (string != null) {
            if (!bW.c.s.cw.g) {
                bW.c.s.cw.d = false;
            }
            super.m();
        }
    }
}

