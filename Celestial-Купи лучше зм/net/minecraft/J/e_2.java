/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.j;

import javax.annotation.Nullable;
import net.minecraft.j.c;
import net.minecraft.j.d;
import net.minecraft.k.h;

public class e
extends d {
    private /* synthetic */ String e;
    private final /* synthetic */ double f;
    private final /* synthetic */ double g;

    private static IllegalArgumentException b(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    @Override
    public double a(double d10) {
        d10 = h.b(d10, this.f, this.g);
        return d10;
    }

    public e a(String string) {
        this.e = string;
        return this;
    }

    public String a() {
        return this.e;
    }

    public e(@Nullable c c10, String string, double d10, double d11, double d12) {
        super(c10, string, d10);
        this.f = d11;
        this.g = d12;
        if (d11 > d12) {
            throw new IllegalArgumentException("Minimum value cannot be bigger than maximum value!");
        }
        if (d10 < d11) {
            throw new IllegalArgumentException("Default value cannot be lower than minimum value!");
        }
        if (d10 > d12) {
            throw new IllegalArgumentException("Default value cannot be bigger than maximum value!");
        }
    }
}

