/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.C.K;
import net.minecraft.Q.a6;
import net.minecraft.ar.a3;
import net.minecraft.ar.ay;
import net.minecraft.client.q.c;
import net.minecraft.d.t;
import net.minecraft.k.m;
import net.minecraft.u.E;
import net.minecraft.u.h;
import net.minecraft.w.au;

public class ce
extends bE {
    @cL
    public void a(fz fz2) {
        block3: {
            c c10;
            block5: {
                block6: {
                    a6 a62;
                    m[] arrm;
                    block4: {
                        a6 a63;
                        K k2;
                        block2: {
                            arrm = h.b();
                            k2 = fz2.a();
                            if (arrm != null) break block2;
                            if (!(k2 instanceof a6)) break block3;
                            k2 = fz2.a();
                        }
                        a62 = a63 = (a6)k2;
                        if (arrm != null) break block4;
                        if (a62.g() != ay.NEUTRAL) break block3;
                        a62 = a63;
                    }
                    if (a62.e() != E.hL) break block3;
                    c10 = ce.c.s;
                    if (arrm != null) break block5;
                    if (c10.av().w() instanceof au) break block6;
                    c10 = ce.c.s;
                    if (arrm != null) break block5;
                    if (!(c10.b().w() instanceof au)) break block3;
                }
                ce.c.s.c9.a(new t(a3.MAIN_HAND));
                ce.c.s.b(a3.MAIN_HAND);
                ce.c.s.c9.a(new t(a3.MAIN_HAND));
                c10 = ce.c.s;
            }
            c10.b(a3.MAIN_HAND);
        }
    }

    public ce() {
        super("AutoFish", a5.World);
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

