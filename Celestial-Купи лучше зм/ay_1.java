/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.Z.i;
import net.minecraft.ah.t;
import net.minecraft.k.n;
import net.minecraft.u.d;

final class ay
implements m {
    ay() {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public int a(i var1_1, t var2_2, n var3_3) {
        var5_4 = fa.a(var2_2, var3_3);
        var4_5 = K.d();
        if (fa.a() != null) {
            v0 = var5_4;
            if (var4_5 == null) {
                if (v0 == d.n) {
                    v1 = fa.a().b(var5_4, var3_3);
                    return v1;
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v0 = var5_4;
        }
        v1 = v0.b(var3_3);
        return v1;
    }

    @Override
    public boolean a() {
        return false;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

