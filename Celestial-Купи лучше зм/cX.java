/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.ag.C;
import net.minecraft.client.a.v;

public class cX
extends bE {
    public /* synthetic */ hH l;
    public /* synthetic */ hH k;

    private static gP b(gP gP2) {
        return gP2;
    }

    @cL
    public void a(gm gm2) {
        block2: {
            block1: {
                String[] arrstring;
                block0: {
                    arrstring = C.f();
                    if (arrstring != null) break block0;
                    if (!gm2.b()) break block1;
                    v.b(-this.l.f(), this.k.f(), 1.0);
                }
                if (arrstring == null) break block2;
            }
            v.b(this.l.f(), -this.k.f(), 1.0);
        }
    }

    public cX() {
        super("Scoreboard", a5.Visuals);
        cj.b.f.b(new hH("NoScoreBoard", this, false));
        this.l = new hH("Scoreboard X", this, 0.0, -1000.0, 1000.0, 1.0);
        cj.b.f.b(this.l);
        this.k = new hH("Scoreboard Y", this, 0.0, -500.0, 500.0, 1.0);
        cj.b.f.b(this.k);
    }
}

