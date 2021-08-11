/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.ac.c;
import net.minecraft.ar.a3;
import net.minecraft.d.F;
import net.minecraft.d.r;
import net.minecraft.d.t;
import net.minecraft.k.n;
import net.minecraft.w.H;

public class b7
extends bE {
    private final /* synthetic */ hH k;

    private static gP b(gP gP2) {
        return gP2;
    }

    @cL
    public void a(fb fb2) {
        block3: {
            net.minecraft.client.q.c c10;
            block5: {
                int n2;
                block4: {
                    int[] arrn;
                    block2: {
                        arrn = net.minecraft.ac.c.i();
                        n2 = b7.c.s.cB.k().w() instanceof H;
                        if (arrn == null) break block2;
                        if (n2 == 0) break block3;
                        n2 = b7.c.s.aq() ? 1 : 0;
                    }
                    if (arrn == null) break block4;
                    if (n2 == 0) break block3;
                    c10 = b7.c.s;
                    if (arrn == null) break block5;
                    float f10 = (float)c10.v() - this.k.r();
                    n2 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                }
                if (n2 < 0) break block3;
                b7.c.s.c9.a(new F(r.RELEASE_USE_ITEM, n.o, b7.c.s.K()));
                b7.c.s.c9.a(new t(a3.MAIN_HAND));
                c10 = b7.c.s;
            }
            c10.ap();
        }
    }

    public b7() {
        super("FastBow", a5.Combat);
        this.k = new hH("Bow Ticks", this, 1.5, 1.5, 10.0, 0.5);
        cj.b.f.b(this.k);
    }
}

