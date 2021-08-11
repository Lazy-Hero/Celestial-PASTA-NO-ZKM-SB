/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.k.m;

public abstract class L
implements ei,
du {
    private final /* synthetic */ byte a;

    private static gP a(gP gP2) {
        return gP2;
    }

    protected L(byte by2) {
        int n2 = fe.b();
        this.a = by2;
        int n3 = n2;
        if (n3 == 0) {
            m.b(!m.c());
        }
    }

    @Override
    public byte a() {
        return this.a;
    }
}

