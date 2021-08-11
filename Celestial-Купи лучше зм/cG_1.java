/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.k.m;
import net.minecraft.u.h;

public class cG
extends bE {
    @cL
    public void a(fO fO2) {
        m[] arrm = h.b();
        fO fO3 = fO2;
        if (arrm == null) {
            if (fO3.a().startsWith("/")) {
                return;
            }
            fO3 = fO2;
        }
        fO3.c = fO2.c + " | " + cj.e;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public cG() {
        super("ChatAppend", a5.World);
    }
}

