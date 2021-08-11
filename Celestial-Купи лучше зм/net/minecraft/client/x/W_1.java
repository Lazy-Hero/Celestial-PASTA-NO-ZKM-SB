/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.x;

import java.util.List;
import net.minecraft.client.x.P;
import net.minecraft.client.x.S;

public class W {
    private final /* synthetic */ List<S> a;

    public W(List<S> list) {
        this.a = list;
    }

    public boolean equals(Object object) {
        String[] arrstring = P.o();
        Object object2 = this;
        if (arrstring == null) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        boolean bl2 = object2 instanceof W;
        if (arrstring == null) {
            if (bl2) {
                W w2 = (W)object;
                return this.a.equals(w2.a);
            }
            bl2 = false;
        }
        return bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public List<S> a() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}

