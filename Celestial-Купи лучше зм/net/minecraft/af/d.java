/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.af;

import com.google.common.collect.Lists;
import java.util.Iterator;
import net.minecraft.af.c;
import net.minecraft.i.k;

class d
implements Runnable {
    final /* synthetic */ c a;

    d(c c10) {
        this.a = c10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void run() {
        Iterator iterator = Lists.newArrayList(this.a.O().u()).iterator();
        int n2 = c.c();
        while (iterator.hasNext()) {
            k k2 = (k)iterator.next();
            if (!k2.u().equals(c.a((c)this.a).s.u())) {
                this.a.O().g(k2);
            }
            if (n2 != 0) continue;
        }
    }
}

