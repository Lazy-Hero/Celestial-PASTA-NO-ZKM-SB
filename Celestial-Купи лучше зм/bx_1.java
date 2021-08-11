/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import net.minecraft.Q.c;
import net.minecraft.ag.C;

public class bx
extends bE {
    private final /* synthetic */ hH k;
    private /* synthetic */ long l;

    @cL
    public void a(fz fz2) {
        block3: {
            fz fz3;
            block2: {
                String[] arrstring = C.f();
                fz3 = fz2;
                if (arrstring != null) break block2;
                if (!(fz3.a() instanceof c)) break block3;
                fz3 = fz2;
            }
            fz3.a(true);
        }
    }

    public bx() {
        super("Ambience", a5.Visuals);
        this.l = 0L;
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Day");
        arrayList.add("Night");
        arrayList.add("Morning");
        arrayList.add("Sunset");
        arrayList.add("Spin");
        cj.b.f.b(new hH("Ambience Mode", (bE)this, "Night", arrayList));
        this.k = new hH("TimeSpin Speed", this, 20.0, 0.1, 1000.0, 1.0);
        cj.b.f.b(this.k);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @cL
    public void a(fb fb2) {
        block3: {
            boolean bl2;
            block8: {
                String string;
                block9: {
                    String[] arrstring;
                    block6: {
                        block7: {
                            block4: {
                                block5: {
                                    block1: {
                                        block2: {
                                            string = cj.b.f.a("Ambience Mode").m();
                                            arrstring = C.f();
                                            bl2 = string.equalsIgnoreCase("Spin");
                                            if (arrstring != null) break block1;
                                            if (!bl2) break block2;
                                            bx.c.e.b(this.l);
                                            this.l += this.k.e();
                                            if (arrstring == null) break block3;
                                        }
                                        bl2 = string.equalsIgnoreCase("Day");
                                    }
                                    if (arrstring != null) break block4;
                                    if (!bl2) break block5;
                                    bx.c.e.b(5000L);
                                    if (arrstring == null) break block3;
                                }
                                bl2 = string.equalsIgnoreCase("Night");
                            }
                            if (arrstring != null) break block6;
                            if (!bl2) break block7;
                            bx.c.e.b(17000L);
                            if (arrstring == null) break block3;
                        }
                        bl2 = string.equalsIgnoreCase("Morning");
                    }
                    if (arrstring != null) break block8;
                    if (!bl2) break block9;
                    bx.c.e.b(0L);
                    if (arrstring == null) break block3;
                }
                bl2 = string.equalsIgnoreCase("Sunset");
            }
            if (bl2) {
                bx.c.e.b(13000L);
            }
        }
    }
}

