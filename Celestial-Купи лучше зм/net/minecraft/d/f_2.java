/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.D;

import net.minecraft.D.a;
import net.minecraft.D.d;
import net.minecraft.at.l;

public class f
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

    @Override
    public String a() {
        return this.o;
    }

    public f(String string, l l2) {
        this.o = string + l2.b();
        a.i.put(this.o, this);
    }
}

