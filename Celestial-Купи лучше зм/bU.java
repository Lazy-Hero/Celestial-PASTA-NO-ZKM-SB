/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.Q;
import net.minecraft.client.q.c;
import net.minecraft.k.k;

public class bU
extends bE {
    public bU() {
        super("NoClip", a5.Player);
    }

    @cL
    public void a(fS fS2) {
        block5: {
            block8: {
                block7: {
                    Q q2;
                    boolean bl2;
                    block6: {
                        String string;
                        block4: {
                            string = k.b();
                            c c10 = bU.c.s;
                            if (string == null) break block4;
                            if (c10 == null) break block5;
                            bU.c.s.K = true;
                            bU.c.s.G *= 0.0;
                            c10 = bU.c.s;
                        }
                        c10.cw.e = false;
                        bl2 = bU.c.ac.v.b();
                        if (string == null) break block6;
                        if (bl2) {
                            bU.c.s.G += 0.5;
                        }
                        q2 = c;
                        if (string == null) break block7;
                        bl2 = q2.ac.bc.b();
                    }
                    if (!bl2) break block8;
                    q2 = c;
                }
                q2.s.G -= 0.5;
            }
            fS2.a(true);
        }
    }

    @cL
    public void a(fD fD2) {
        fD2.a(true);
    }

    @cL
    public void a(fq fq2) {
        fq2.a(true);
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

