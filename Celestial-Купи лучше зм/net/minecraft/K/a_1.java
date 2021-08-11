/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.k;

import java.util.Iterator;
import net.minecraft.k.o;
import net.minecraft.k.u;

final class a
implements Iterable<o> {
    final /* synthetic */ int f;
    final /* synthetic */ int c;
    final /* synthetic */ int a;
    final /* synthetic */ int e;
    final /* synthetic */ int d;
    final /* synthetic */ int b;

    @Override
    public Iterator<o> iterator() {
        return new u(this);
    }

    a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a = n2;
        this.f = n3;
        this.c = n4;
        this.b = n5;
        this.d = n6;
        this.e = n7;
    }
}

