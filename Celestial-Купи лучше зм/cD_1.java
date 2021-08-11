/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.Q.J;
import net.minecraft.k.m;
import net.minecraft.u.h;

public class cD
extends bE {
    public /* synthetic */ boolean k;

    public void c(String string) {
        gd.a("Module", "Disabling " + string + " due to lag back", 2, gD.WARNING);
    }

    public cD() {
        super("LagBack", a5.World);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @cL
    public void a(fz fz2) {
        block6: {
            bE bE2;
            block19: {
                boolean bl2;
                block17: {
                    m[] arrm;
                    block18: {
                        block15: {
                            block16: {
                                block13: {
                                    block14: {
                                        block11: {
                                            block12: {
                                                block9: {
                                                    block10: {
                                                        block7: {
                                                            block8: {
                                                                block5: {
                                                                    arrm = h.b();
                                                                    bl2 = this.i();
                                                                    if (arrm == null) {
                                                                        if (!bl2) {
                                                                            return;
                                                                        }
                                                                        bl2 = fz2.a() instanceof J;
                                                                    }
                                                                    if (arrm != null) break block5;
                                                                    if (!bl2) break block6;
                                                                    bl2 = cj.b.i.a(b3.class).i();
                                                                }
                                                                if (arrm != null) break block7;
                                                                if (!bl2) break block8;
                                                                this.c("Speed");
                                                                cj.b.i.a(b3.class).e();
                                                                if (arrm == null) break block6;
                                                            }
                                                            bl2 = cj.b.i.a(bR.class).i();
                                                        }
                                                        if (arrm != null) break block9;
                                                        if (!bl2) break block10;
                                                        this.c("Fly");
                                                        cj.b.i.a(bR.class).e();
                                                        if (arrm == null) break block6;
                                                    }
                                                    bl2 = cj.b.i.a(bt.class).i();
                                                }
                                                if (arrm != null) break block11;
                                                if (!bl2 || bn.l == null) break block12;
                                                this.c("TargetStrafe");
                                                cj.b.i.a(bt.class).e();
                                                if (arrm == null) break block6;
                                            }
                                            bl2 = cj.b.i.a(bL.class).i();
                                        }
                                        if (arrm != null) break block13;
                                        if (!bl2) break block14;
                                        bl2 = cD.c.s.aa;
                                        if (arrm != null) break block13;
                                        if (!bl2) break block14;
                                        this.c("NoWeb");
                                        cj.b.i.a(bL.class).e();
                                        if (arrm == null) break block6;
                                    }
                                    bl2 = cj.b.i.a(bq.class).i();
                                }
                                if (arrm != null) break block15;
                                if (!bl2) break block16;
                                bl2 = cD.c.s.u();
                                if (arrm != null) break block15;
                                if (!bl2) break block16;
                                this.c("Jesus");
                                cj.b.i.a(bq.class).e();
                                if (arrm == null) break block6;
                            }
                            bl2 = cj.b.i.a(bb.class).i();
                        }
                        if (arrm != null) break block17;
                        if (!bl2) break block18;
                        this.c("Timer");
                        cj.b.i.a(bb.class).e();
                        if (arrm == null) break block6;
                    }
                    bE2 = cj.b.i.a(b5.class);
                    if (arrm != null) break block19;
                    bl2 = bE2.i();
                }
                if (!bl2) break block6;
                this.c("WaterLeave");
                bE2 = cj.b.i.a(b5.class);
            }
            bE2.e();
        }
    }
}

