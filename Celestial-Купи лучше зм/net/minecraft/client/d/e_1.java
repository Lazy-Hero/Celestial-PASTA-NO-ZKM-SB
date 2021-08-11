/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.D;

import java.util.List;
import net.minecraft.client.D.E;
import net.minecraft.client.D.h;
import net.minecraft.client.b.ai;

class e
implements ai {
    final /* synthetic */ int b;
    final /* synthetic */ E a;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(boolean bl2, int n2) {
        block3: {
            block2: {
                List<E> list = this.a.e.a(this.a);
                boolean bl3 = h.c();
                this.a.a.a(this.a.e);
                boolean bl4 = bl2;
                if (!bl3) break block2;
                if (!bl4) break block3;
                bl4 = list.remove(this.a);
            }
            this.a.e.b().add(this.b, this.a);
        }
    }

    e(E e10, int n2) {
        this.a = e10;
        this.b = n2;
    }
}

