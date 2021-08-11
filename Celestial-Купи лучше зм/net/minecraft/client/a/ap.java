/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
package net.minecraft.client.a;

import net.minecraft.c.k;
import net.minecraft.client.a.x;
import org.lwjgl.input.Mouse;

class ap
implements k<String> {
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ x a;

    ap(x x2, int n2, int n3) {
        this.a = x2;
        this.b = n2;
        this.c = n3;
    }

    public String a() throws Exception {
        return String.format("Scaled: (%d, %d). Absolute: (%d, %d)", this.b, this.c, Mouse.getX(), Mouse.getY());
    }
}

