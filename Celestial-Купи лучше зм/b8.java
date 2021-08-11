/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.ag.C;
import net.minecraft.ah.c;

public class b8
extends bE {
    public b8() {
        super("AntiLagMachine", a5.Visuals);
    }

    @cL
    public void a(f4 f42) {
        block2: {
            f4 f43;
            block3: {
                String[] arrstring = C.f();
                if (!this.i()) break block2;
                f43 = f42;
                if (arrstring != null) break block3;
                if (f43.b() != net.minecraft.ah.c.SKY) break block2;
                f43 = f42;
            }
            f43.a(true);
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

