/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.D;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.ar.v;
import net.minecraft.client.v.l;
import net.minecraft.client.v.o;

public interface a {
    public Set<String> a();

    public BufferedImage c() throws IOException;

    public boolean b(v var1);

    public InputStream a(v var1) throws IOException;

    public String b();

    @Nullable
    public <T extends l> T a(o var1, String var2) throws IOException;
}

