/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.E;

import net.minecraft.E.s;

public class v
extends s {
    public v(String string, Object ... arrobject) {
        super(string, arrobject);
    }

    public v() {
        this("commands.generic.blockstate.invalid", new Object[0]);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}

