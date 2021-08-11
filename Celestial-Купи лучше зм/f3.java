/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.C.K;
import net.minecraft.C.W;

public class f3
extends fe {
    private final /* synthetic */ boolean d;
    private /* synthetic */ K c;

    public f3(K k2, boolean bl2) {
        this.c = k2;
        this.d = bl2;
    }

    public void a(K<? extends W> k2) {
        this.c = k2;
    }

    public K d() {
        return this.c;
    }

    public boolean c() {
        boolean bl2 = fR.d();
        boolean bl3 = this.d;
        if (!bl2) {
            bl3 = !bl3;
        }
        return bl3;
    }

    public boolean b() {
        return this.d;
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

