/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.main;

import java.io.File;
import javax.annotation.Nullable;
import net.minecraft.client.D.c;
import net.minecraft.client.D.d;

public class h {
    public final /* synthetic */ File d;
    public final /* synthetic */ File b;
    public final /* synthetic */ String a;
    public final /* synthetic */ File c;

    public c a() {
        return this.a == null ? new d(this.c) : new c(this.c, this.a);
    }

    public h(File file, File file2, File file3, @Nullable String string) {
        this.d = file;
        this.b = file2;
        this.c = file3;
        this.a = string;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

