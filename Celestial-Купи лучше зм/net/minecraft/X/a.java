/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.X;

import com.mojang.authlib.GameProfile;
import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.al.b;

public class a
implements K<b> {
    private /* synthetic */ GameProfile c;
    private static /* synthetic */ int[] b;

    @Override
    public void b(m m2) throws IOException {
        m2.a(this.c.getName());
    }

    @Override
    public void a(m m2) throws IOException {
        this.c = new GameProfile(null, m2.c(16));
    }

    public static int[] b() {
        return b;
    }

    public a(GameProfile gameProfile) {
        this.c = gameProfile;
    }

    @Override
    public void a(b b10) {
        b10.a(this);
    }

    static {
        if (a.b() != null) {
            a.b(new int[5]);
        }
    }

    public a() {
    }

    public static void b(int[] arrn) {
        b = arrn;
    }

    public GameProfile c() {
        return this.c;
    }
}

