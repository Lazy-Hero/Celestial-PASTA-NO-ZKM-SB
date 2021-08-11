/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.j;

import javax.annotation.Nullable;
import net.minecraft.j.c;
import net.minecraft.j.f;
import net.minecraft.k.m;

public abstract class d
implements c {
    private /* synthetic */ boolean a;
    private final /* synthetic */ double c;
    private final /* synthetic */ c b;
    private final /* synthetic */ String d;

    @Override
    @Nullable
    public c a() {
        return this.b;
    }

    protected d(@Nullable c c10, String string, double d10) {
        this.b = c10;
        this.d = string;
        this.c = d10;
        if (string == null) {
            throw new IllegalArgumentException("Name cannot be null!");
        }
    }

    public d a(boolean bl2) {
        this.a = bl2;
        return this;
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    @Override
    public String c() {
        return this.d;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        m[] arrm = f.b();
        boolean bl2 = object instanceof c;
        if (arrm != null) {
            if (!bl2) return false;
            bl2 = this.d.equals(((c)object).c());
        }
        if (arrm == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public double d() {
        return this.c;
    }

    @Override
    public boolean b() {
        return this.a;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}

