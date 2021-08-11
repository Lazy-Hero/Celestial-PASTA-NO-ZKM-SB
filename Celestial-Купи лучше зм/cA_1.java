/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.Objects;
import net.minecraft.K.b;
import net.minecraft.K.j;
import net.minecraft.ag.C;

public class cA
extends bE {
    public cA() {
        super("FullBright", a5.Visuals);
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Gamma");
        arrayList.add("Potion");
        cj.b.f.b(new hH("FullBright Mode", (bE)this, "Gamma", arrayList));
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public void m() {
        super.m();
        cA.c.ac.aj = 0.1f;
        cA.c.s.d(Objects.requireNonNull(b.a(16)));
    }

    @cL
    public void a(fb fb2) {
        block1: {
            boolean bl2;
            block2: {
                String string;
                block3: {
                    String[] arrstring = C.f();
                    if (!this.i()) break block1;
                    string = cj.b.f.a("FullBright Mode").m();
                    bl2 = string.equalsIgnoreCase("Gamma");
                    if (arrstring != null) break block2;
                    if (!bl2) break block3;
                    cA.c.s.d(Objects.requireNonNull(b.a(16)));
                    cA.c.ac.aj = 1000.0f;
                    if (arrstring == null) break block1;
                }
                bl2 = string.equalsIgnoreCase("Potion");
            }
            if (bl2) {
                cA.c.s.b(new j(Objects.requireNonNull(b.a(16)), 817, 1));
            }
        }
    }
}

