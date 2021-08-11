/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.k.k;

public class bp
extends bE {
    public /* synthetic */ float k;

    public float a(float f10) {
        this.k += f10;
        return this.k;
    }

    public bp() {
        super("AntiAFK", a5.Player);
        this.k = 0.0f;
        cj.b.f.b(new hH("Send Message", this, true));
    }

    @cL
    public void a(fR fR2) {
        block1: {
            int n2;
            block2: {
                String string = net.minecraft.k.k.b();
                if (bp.c.s.F()) break block1;
                float f10 = gs.a((float)(Math.floor(this.a(1.0f)) + (double)aY.b(1, -4)));
                fR2.a(f10);
                bp.c.s.bf = f10;
                bp.c.s.be = 0.0f;
                bp.c.s.a1 = f10;
                n2 = bp.c.s.H % 500;
                if (string == null) break block2;
                if (n2 != 0) break block1;
                n2 = cj.b.f.a("Send Message").l() ? 1 : 0;
            }
            if (n2 != 0) {
                bp.c.s.b("/homehome");
            }
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

