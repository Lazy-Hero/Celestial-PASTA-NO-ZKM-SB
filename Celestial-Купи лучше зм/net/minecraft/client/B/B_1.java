/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.client.b.s;
import net.minecraft.client.l.f;

public class B
extends s {
    private final /* synthetic */ f s;

    public B(int n2, int n3, int n4, f f10, String string) {
        super(n2, n3, n4, 150, 20, string);
        this.s = f10;
    }

    public B(int n2, int n3, int n4, String string) {
        this(n2, n3, n4, null, string);
    }

    public f b() {
        return this.s;
    }
}

