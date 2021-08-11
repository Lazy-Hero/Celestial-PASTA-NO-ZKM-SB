/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.U.x;
import net.minecraft.ac.c;

public class bX
extends bE {
    public static /* synthetic */ hH k;

    public bX() {
        super("HitBox", a5.Combat);
        k = new hH("Expand", this, 0.2, 0.01, 2.0, 0.01);
        cj.b.f.b(k);
    }

    public static float a(x x2) {
        block4: {
            block3: {
                boolean bl2;
                block2: {
                    int[] arrn = net.minecraft.ac.c.i();
                    bl2 = x2.equals(bX.c.s);
                    if (arrn == null) break block2;
                    if (bl2) break block3;
                    bl2 = cj.b.i.a(bX.class).i();
                }
                if (bl2) break block4;
            }
            return 0.0f;
        }
        return k.r();
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @cL
    public void a(fb fb2) {
        this.b("" + aY.a(k.r(), 1));
    }
}

