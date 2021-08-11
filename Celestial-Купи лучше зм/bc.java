/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.C.K;
import net.minecraft.d.q;
import net.minecraft.k.k;

public class bc
extends bE {
    public bc() {
        super("XCarry", a5.Player);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @cL
    public void a(f3 f32) {
        block3: {
            K k2;
            block2: {
                String string = k.b();
                k2 = f32.d();
                if (string == null) break block2;
                if (!(k2 instanceof q)) break block3;
                k2 = f32.d();
            }
            q q2 = (q)k2;
            f32.a(true);
        }
    }
}

