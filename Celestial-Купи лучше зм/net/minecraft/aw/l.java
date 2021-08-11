/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.aw;

import javax.annotation.Nullable;
import net.minecraft.aw.k;
import net.minecraft.aw.r;

public class l
extends k {
    @Override
    public int a(String string) {
        return 0;
    }

    @Override
    public void b() {
    }

    public l() {
        super(null);
    }

    @Override
    @Nullable
    public r a(Class<? extends r> class_, String string) {
        return (r)this.c.get(string);
    }

    @Override
    public void a(String string, r r2) {
        this.c.put(string, r2);
    }
}

