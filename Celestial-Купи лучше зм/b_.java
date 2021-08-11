/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.a.v;
import net.minecraft.d.A;

public class b_
extends bE {
    public b_() {
        super("OldPositionTeleport", a5.Movement);
    }

    @Override
    public void m() {
        b_.c.s.c9.a(new A(b_.c.s.a, b_.c.s.aF + 0.5, b_.c.s.ax, false));
        super.m();
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @cL
    public void a(fR fR2) {
        String string = v.A();
        if (string != null) {
            if (!this.i()) {
                return;
            }
            fR2.b(false);
        }
    }
}

