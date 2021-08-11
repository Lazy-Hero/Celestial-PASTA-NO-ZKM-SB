/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
import net.minecraft.ar.a3;
import net.minecraft.d.I;
import net.minecraft.d.t;
import net.minecraft.k.k;
import net.minecraft.u.h;
import net.minecraft.w.d;
import org.lwjgl.input.Mouse;

public class bI
extends bE {
    @cL
    public void a(fR fR2) {
        block7: {
            int n2;
            String string;
            block6: {
                string = k.b();
                int n3 = Mouse.isButtonDown((int)2);
                if (string == null) break block6;
                if (n3 == 0) break block7;
                n3 = n2 = 0;
            }
            while (n2 < 9) {
                d d10 = bI.c.s.cB.a(n2);
                if (string != null) {
                    if (d10.w() == h.o) {
                        bI.c.s.c9.a(new I(n2));
                        bI.c.s.c9.a(new t(a3.MAIN_HAND));
                        bI.c.s.c9.a(new I(bI.c.s.cB.a));
                    }
                    ++n2;
                }
                if (string != null) continue;
            }
        }
    }

    public bI() {
        super("MiddleClickPearl", a5.Player);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public void m() {
        bI.c.s.c9.a(new I(bI.c.s.cB.a));
        super.m();
    }
}

