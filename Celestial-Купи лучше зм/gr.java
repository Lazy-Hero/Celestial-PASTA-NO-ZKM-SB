/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.A.h;
import net.minecraft.Z.i;
import net.minecraft.ah.t;
import net.minecraft.k.n;

final class gr
implements m {
    @Override
    public boolean a() {
        return false;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    gr() {
    }

    @Override
    public int a(i i2, t t2, n n2) {
        String string;
        h h2;
        block5: {
            fj fj2;
            block4: {
                h2 = fa.a(t2, n2);
                string = K.d();
                fj2 = fa.b();
                if (string != null) break block4;
                if (fj2 == null) break block5;
                fj2 = fa.b();
            }
            return fj2.b(h2, n2);
        }
        int n3 = cq.b_.b();
        if (string == null) {
            n3 = n3 != 0 ? cq.c(h2, cq.b_, new Object[0]) : h2.h();
        }
        return n3;
    }
}

