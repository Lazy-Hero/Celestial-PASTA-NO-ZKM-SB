/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.Z.i;
import net.minecraft.ah.t;
import net.minecraft.k.n;

final class eK
implements m {
    eK() {
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public int a(i i2, t t2, n n2) {
        int n3;
        String string = K.d();
        fj fj2 = fa.d();
        if (string == null) {
            if (fj2 == null) {
                n3 = net.minecraft.ah.m.c();
                return n3;
            }
            fj2 = fa.d();
        }
        n3 = fj2.a(t2, n2);
        return n3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a() {
        return fa.d() == null;
    }
}

