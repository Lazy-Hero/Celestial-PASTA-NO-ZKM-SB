/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.ag.C;
import net.minecraft.ar.b;
import net.minecraft.client.a.v;

public class cn
extends bE {
    public static /* synthetic */ hH m;
    public static /* synthetic */ hH l;
    public static /* synthetic */ hH k;
    public static /* synthetic */ hH n;
    public static /* synthetic */ hH p;
    public static /* synthetic */ hH o;

    public cn() {
        super("ViewModel", a5.Visuals);
        n = new hH("RightX", this, 0.0, -2.0, 2.0, 0.1f);
        o = new hH("RightY", this, 0.2f, -2.0, 2.0, 0.1f);
        m = new hH("RightZ", this, 0.2f, -2.0, 2.0, 0.1f);
        k = new hH("LeftX", this, 0.0, -2.0, 2.0, 0.1f);
        p = new hH("LeftY", this, 0.2f, -2.0, 2.0, 0.1f);
        l = new hH("LeftZ", this, 0.2f, -2.0, 2.0, 0.1f);
        this.a(n, o, m, k, p, l);
    }

    @cL
    public void a(gn gn2) {
        block2: {
            String[] arrstring = C.f();
            b b10 = gn2.a();
            b b11 = b.RIGHT;
            if (arrstring == null) {
                if (b10 == b11) {
                    v.b(n.f(), o.f(), m.f());
                }
                b10 = gn2.a();
                b11 = b.LEFT;
            }
            if (b10 != b11) break block2;
            v.b(-k.f(), p.f(), l.f());
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

