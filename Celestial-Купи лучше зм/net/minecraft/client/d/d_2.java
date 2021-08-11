/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.D;

import java.io.File;
import net.minecraft.ar.v;
import net.minecraft.client.D.c;

public class d
extends c {
    private final /* synthetic */ File c;

    public d(File file) {
        this.c = file;
    }

    @Override
    public File b(v v2) {
        return new File(this.c, v2.toString().replace(':', '/'));
    }

    @Override
    public File a() {
        return new File(this.c, "pack.mcmeta");
    }
}

