/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.C.K;
import net.minecraft.Q.J;
import net.minecraft.k.k;

public class bf
extends bE {
    public bf() {
        super("NoServerRotation", a5.Player);
    }

    @cL
    public void a(fz fz2) {
        block3: {
            K k2;
            block2: {
                String string = k.b();
                k2 = fz2.a();
                if (string == null) break block2;
                if (!(k2 instanceof J)) break block3;
                k2 = fz2.a();
            }
            J j2 = (J)k2;
            j2.f = bf.c.s.e;
            j2.c = bf.c.s.at;
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

