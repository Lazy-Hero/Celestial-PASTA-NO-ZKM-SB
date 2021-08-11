/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.E;

import net.minecraft.E.s;

public class x
extends s {
    public x(String string) {
        super(string, new Object[0]);
    }

    public x(String string, Object ... arrobject) {
        super(string, arrobject);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}

