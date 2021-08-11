/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.D;

import net.minecraft.D.a;
import net.minecraft.D.d;

public class n
implements a {
    private final /* synthetic */ String o;

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public d c() {
        return d.INTEGER;
    }

    public n(String string) {
        this.o = string;
        a.i.put(string, this);
    }

    @Override
    public String a() {
        return this.o;
    }
}

