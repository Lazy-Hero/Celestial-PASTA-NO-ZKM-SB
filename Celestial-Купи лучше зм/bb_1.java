/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.a.v;

public class bb
extends bE {
    public bb() {
        super("Timer", a5.Movement);
        cj.b.f.b(new hH("Timer", this, 1.0, 0.1, 10.0, 0.1));
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @cL
    public void a(fb fb2) {
        String string = v.A();
        bb bb2 = this;
        if (string != null) {
            if (!bb2.i()) {
                return;
            }
            bb2 = this;
        }
        bb2.b("" + cj.b.f.a("Timer").r());
        bb.c.a8.d = cj.b.f.a("Timer").r();
    }

    @Override
    public void m() {
        super.m();
        bb.c.a8.d = 1.0f;
    }
}

