/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.x;

import java.util.Iterator;
import java.util.Set;
import net.minecraft.ar.v;
import net.minecraft.client.j.c;
import net.minecraft.client.j.j;
import net.minecraft.client.j.r;
import net.minecraft.client.x.J;
import net.minecraft.client.x.P;

class al
implements r {
    final /* synthetic */ J b;
    final /* synthetic */ Set a;

    @Override
    public void a(j j2) {
        Iterator iterator = this.a.iterator();
        String[] arrstring = P.o();
        while (iterator.hasNext()) {
            v v2 = (v)iterator.next();
            c c10 = j2.c(v2);
            J.a(this.b).put(v2, c10);
            if (arrstring == null) continue;
        }
    }

    al(J j2, Set set) {
        this.b = j2;
        this.a = set;
    }
}

