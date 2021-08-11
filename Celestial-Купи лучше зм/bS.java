/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.a.v;

public class bS
extends bE {
    public static /* synthetic */ hH k;
    /* synthetic */ ef l;

    @cL
    public void a(fR fR2) {
        block3: {
            ef ef2;
            block5: {
                boolean bl2;
                block4: {
                    String string;
                    block2: {
                        String string2 = v.A();
                        this.b("" + k.r());
                        string = string2;
                        bl2 = bS.c.s.F();
                        if (string == null) break block2;
                        if (!bl2) break block3;
                        bl2 = bS.c.s.aE;
                    }
                    if (string == null) break block4;
                    if (!bl2) break block3;
                    ef2 = this.l;
                    if (string == null) break block5;
                    bl2 = ef2.a(k.r() * 100.0f);
                }
                if (!bl2) break block3;
                fR2.b(true);
                bS.c.s.A = true;
                bS.c.s.aH();
                ef2 = this.l;
            }
            ef2.d();
        }
    }

    public bS() {
        super("WallClimb", a5.Movement);
        this.l = new ef();
        k = new hH("Climb Ticks", this, 1.0, 0.5, 5.0, 0.5);
        cj.b.f.b(k);
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

