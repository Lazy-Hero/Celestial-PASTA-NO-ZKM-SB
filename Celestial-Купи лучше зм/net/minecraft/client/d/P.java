/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.D;

import java.io.File;
import java.io.FileNotFoundException;

public class P
extends FileNotFoundException {
    public P(File file, String string) {
        super(String.format("'%s' in ResourcePack '%s'", string, file));
    }
}

