/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import net.minecraft.client.Q;
import net.minecraft.k.k;

public class bL
extends bE {
    private static gP b(gP gP2) {
        return gP2;
    }

    @cL
    public void a(f9 f92) {
        block7: {
            boolean bl2;
            block13: {
                String string;
                block11: {
                    block12: {
                        Q q2;
                        boolean bl3;
                        block9: {
                            block10: {
                                block8: {
                                    block6: {
                                        String string2 = cj.b.f.a("NoWeb Mode").m();
                                        String string3 = k.b();
                                        this.b(string2);
                                        string = string3;
                                        bl3 = this.i();
                                        if (string == null) break block6;
                                        if (!bl3) break block7;
                                        bl3 = string2.equalsIgnoreCase("Matrix");
                                    }
                                    if (string == null) break block8;
                                    if (!bl3) break block7;
                                    bl3 = bL.c.s.A;
                                }
                                if (string == null) break block9;
                                if (!bl3) break block10;
                                bl3 = bL.c.s.aa;
                                if (string == null) break block9;
                                if (!bl3) break block10;
                                bL.c.s.aa = true;
                                if (string != null) break block11;
                            }
                            q2 = c;
                            if (string == null) break block12;
                            bl3 = q2.ac.v.b();
                        }
                        if (bl3) {
                            return;
                        }
                        q2 = c;
                    }
                    q2.s.aa = false;
                }
                bl2 = bL.c.s.aa;
                if (string == null) break block13;
                if (!bl2) break block7;
                bl2 = bL.c.ac.bc.b();
            }
            if (!bl2) {
                hC.a(f92, 0.483);
            }
        }
    }

    public bL() {
        super("NoWeb", a5.Player);
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Matrix");
        cj.b.f.b(new hH("NoWeb Mode", (bE)this, "Matrix", arrayList));
    }

    @Override
    public void m() {
        bL.c.a8.d = 1.0f;
        super.m();
    }
}

