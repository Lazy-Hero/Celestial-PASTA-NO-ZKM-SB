/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.D;

import java.io.Closeable;
import java.io.InputStream;
import javax.annotation.Nullable;
import net.minecraft.client.v.l;

public interface v
extends Closeable {
    @Nullable
    public <T extends l> T a(String var1);

    public boolean a();

    public String d();

    public InputStream c();

    public net.minecraft.ar.v b();
}

