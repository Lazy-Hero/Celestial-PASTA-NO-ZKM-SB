/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.a.v;
import net.minecraft.u.c;

public class b4
extends bE {
    public /* synthetic */ hH l;
    public /* synthetic */ hH k;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @cL
    public void a(fb var1_1) {
        var2_2 = v.A();
        v0 = b4.c.s.c(net.minecraft.u.c.l);
        if (var2_2 != null) {
            if (!v0) {
                v0 = this.l.l();
                if (var2_2 != null) {
                    if (v0) {
                        return;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = b4.c.s.u();
            }
        }
        if (var2_2 != null) {
            if (v0 == false) return;
            v0 = b4.c.s.F();
        }
        if (v0 == false) return;
        hC.a((double)this.k.r());
    }

    public b4() {
        super("WaterSpeed", a5.Movement);
        this.k = new hH("Water Speed", this, 1.0, 0.1, 2.0, 0.01);
        cj.b.f.b(this.k);
        this.l = new hH("Speed Potion Check", this, false);
        cj.b.f.b(this.l);
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

