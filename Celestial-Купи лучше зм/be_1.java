/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.C.K;
import net.minecraft.ac.c;
import net.minecraft.d.G;
import net.minecraft.d.g;

public class be
extends bE {
    @cL
    public void a(f3 f32) {
        block2: {
            g g10;
            K k2;
            block1: {
                int[] arrn = net.minecraft.ac.c.i();
                k2 = f32.d();
                if (arrn == null) break block1;
                if (!(k2 instanceof g)) break block2;
                k2 = f32.d();
            }
            if ((g10 = (g)k2).b() == G.ATTACK && cj.b.g.c(be.c.ao.e.g())) {
                f32.a(true);
            }
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public be() {
        super("NoDamageTeam", a5.Combat);
    }
}

