/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.b.Y;

public class bN
extends bE {
    public bN() {
        super("DeathCoords", a5.World);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @cL
    public void a(fb fb2) {
        block2: {
            float f10;
            block3: {
                int n2;
                block1: {
                    n2 = bE.l();
                    float f11 = bN.c.s.V() - 0.0f;
                    f10 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                    if (n2 != 0) break block1;
                    if (f10 > 0) break block2;
                    f10 = (float)(bN.c.aO instanceof Y);
                }
                if (n2 != 0) break block3;
                if (f10 == false) break block2;
                f10 = bN.c.s.f().e();
            }
            float f12 = f10;
            int n3 = bN.c.s.f().b();
            int n4 = bN.c.s.f().a();
            if (bN.c.s.H % 8 == 0) {
                cp.a("Death Coords: X: " + (int)f12 + " Y: " + n3 + " Z: " + n4);
            }
        }
    }
}

