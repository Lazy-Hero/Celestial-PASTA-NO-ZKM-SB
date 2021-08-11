/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.at;

import net.minecraft.at.h;

public class p
extends IllegalArgumentException {
    public p(h h2, int n2) {
        super(String.format("Invalid index %d requested for %s", n2, h2));
    }

    public p(h h2, String string) {
        super(String.format("Error parsing: %s: %s", h2, string));
    }

    public p(h h2, Throwable throwable) {
        super(String.format("Error while parsing: %s", h2), throwable);
    }
}

