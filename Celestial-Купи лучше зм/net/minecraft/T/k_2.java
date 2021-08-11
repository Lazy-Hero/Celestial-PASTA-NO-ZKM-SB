/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.t;

import java.io.File;
import java.io.FilenameFilter;
import net.minecraft.t.g;

class k
implements FilenameFilter {
    final /* synthetic */ g a;

    k(g g10) {
        this.a = g10;
    }

    @Override
    public boolean accept(File file, String string) {
        return string.endsWith(".mcr");
    }
}

