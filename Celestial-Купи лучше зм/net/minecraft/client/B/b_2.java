/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.client.b;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.D.e;
import net.minecraft.client.b.G;
import net.minecraft.client.b.q;

class b
implements Predicate<e> {
    final /* synthetic */ G a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable e e10) {
        String[] arrstring = q.b();
        String string = e10.d();
        if (arrstring != null) {
            if (string == null) return false;
            string = e10.d();
        }
        boolean bl2 = string.startsWith("#");
        if (arrstring == null) return bl2;
        if (bl2) return false;
        return true;
    }

    b(G g10) {
        this.a = g10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

