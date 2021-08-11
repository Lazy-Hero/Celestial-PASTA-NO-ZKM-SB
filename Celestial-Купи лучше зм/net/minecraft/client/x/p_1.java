/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 */
package net.minecraft.client.x;

import com.google.common.collect.ComparisonChain;
import net.minecraft.ar.w;
import net.minecraft.client.x.Y;

class p
extends w
implements Comparable<p> {
    protected final /* synthetic */ Y b;

    public int a(p p2) {
        return ComparisonChain.start().compare(p2.a, this.a).result();
    }

    public p(Y y2, int n2) {
        super(n2);
        this.b = y2;
    }

    public String toString() {
        return "MyWeighedRandomItem{weight=" + this.a + ", model=" + this.b + '}';
    }
}

