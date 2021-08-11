/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import net.minecraft.ar.aA;
import net.minecraft.d.F;
import net.minecraft.d.r;
import net.minecraft.d.z;
import net.minecraft.k.n;

public class bg
extends bE {
    @Override
    public void m() {
        bg.c.a8.d = 1.0f;
        super.m();
    }

    @cL
    public void a(fR fR2) {
        block5: {
            int n2;
            int n3;
            block8: {
                int n4;
                block9: {
                    block7: {
                        block6: {
                            String string = cj.b.f.a("FastUse Mode").m();
                            int n5 = bE.l();
                            this.b(string);
                            n3 = n5;
                            n4 = string.equalsIgnoreCase("Vanilla");
                            if (n3 != 0) break block6;
                            if (n4 == 0) break block5;
                            n4 = bg.c.s.Y();
                        }
                        if (n3 != 0) break block7;
                        if (n4 != 16) break block5;
                        n4 = bg.c.s.W() ? 1 : 0;
                    }
                    if (n3 != 0) break block8;
                    if (n4 != 0) break block9;
                    n4 = bg.c.s.aG() ? 1 : 0;
                    if (n3 != 0) break block8;
                    if (n4 == 0) break block5;
                }
                n4 = n2 = 0;
            }
            while (n2 < 21) {
                bg.c.s.c9.a(new z(true));
                ++n2;
                if (n3 == 0) {
                    if (n3 == 0) continue;
                }
                break block5;
            }
            bg.c.s.c9.a(new F(r.RELEASE_USE_ITEM, n.o, aA.DOWN));
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public bg() {
        super("FastUse", a5.Player);
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Vanilla");
        cj.b.f.b(new hH("FastUse Mode", (bE)this, "Vanilla", arrayList));
    }
}

