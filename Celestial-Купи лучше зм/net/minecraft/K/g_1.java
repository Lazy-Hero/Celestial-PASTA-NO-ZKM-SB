/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.k;

import java.util.Iterator;
import net.minecraft.k.b;
import net.minecraft.k.n;

final class g
implements Iterable<n> {
    final /* synthetic */ int c;
    final /* synthetic */ int f;
    final /* synthetic */ int b;
    final /* synthetic */ int a;
    final /* synthetic */ int d;
    final /* synthetic */ int e;

    @Override
    public Iterator<n> iterator() {
        return new b(this);
    }

    g(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.e = n2;
        this.a = n3;
        this.d = n4;
        this.b = n5;
        this.f = n6;
        this.c = n7;
    }
}

