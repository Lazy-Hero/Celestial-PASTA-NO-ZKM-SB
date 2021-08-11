/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.E;

import net.minecraft.E.s;

public class u
extends s {
    public u(String string) {
        this("commands.generic.entity.notFound", string);
    }

    public u(String string, Object ... arrobject) {
        super(string, arrobject);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}

