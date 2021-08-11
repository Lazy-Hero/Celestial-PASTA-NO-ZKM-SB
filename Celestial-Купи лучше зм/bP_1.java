/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import net.minecraft.client.Q;
import net.minecraft.client.q.c;
import net.minecraft.d.z;
import net.minecraft.k.k;

public class bP
extends bE {
    @cL
    public void a(fR fR2) {
        block14: {
            int n2;
            String string;
            block15: {
                block11: {
                    String string2;
                    block12: {
                        c c10;
                        block13: {
                            block10: {
                                block9: {
                                    Q q2;
                                    block8: {
                                        string = k.b();
                                        q2 = c;
                                        if (string == null) break block8;
                                        if (q2.s == null) break block9;
                                        q2 = c;
                                    }
                                    if (q2.e != null) break block10;
                                }
                                return;
                            }
                            string2 = cj.b.f.a("NoFall Mode").m();
                            this.b(string2);
                            n2 = string2.equalsIgnoreCase("Vanilla");
                            if (string == null) break block11;
                            if (n2 == 0) break block12;
                            c10 = bP.c.s;
                            if (string == null) break block13;
                            if (!(c10.an > 2.0f)) break block14;
                            c10 = bP.c.s;
                        }
                        c10.c9.a(new z(true));
                        if (string != null) break block14;
                    }
                    n2 = string2.equalsIgnoreCase("Matrix") ? 1 : 0;
                }
                if (string == null) break block15;
                if (n2 == 0) break block14;
                float f10 = bP.c.s.an - 4.0f;
                n2 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
            }
            if (n2 >= 0) {
                boolean bl2 = bP.c.s.H % 2;
                if (string != null) {
                    bl2 = bl2;
                }
                fR2.b(bl2);
                bP.c.s.an = 0.0f;
            }
        }
    }

    public bP() {
        super("NoFall", a5.Player);
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Vanilla");
        arrayList.add("Matrix");
        cj.b.f.b(new hH("NoFall Mode", (bE)this, "Vanilla", arrayList));
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

