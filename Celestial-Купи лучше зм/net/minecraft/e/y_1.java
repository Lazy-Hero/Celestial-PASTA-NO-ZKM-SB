/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.E;

import net.minecraft.E.s;

public class y
extends s {
    public y(String string, Object ... arrobject) {
        super(string, arrobject);
    }

    public y() {
        this("commands.generic.snytax", new Object[0]);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}

