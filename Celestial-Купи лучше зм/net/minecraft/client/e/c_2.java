/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.E;

import net.minecraft.at.h;
import net.minecraft.at.k;

public enum c {
    ENABLED("enabled"),
    DISABLED("disabled"),
    PROMPT("prompt");

    private final /* synthetic */ k b;

    public k a() {
        return this.b;
    }

    private c(String string2) {
        this.b = new h("addServer.resourcePack." + string2, new Object[0]);
    }
}

