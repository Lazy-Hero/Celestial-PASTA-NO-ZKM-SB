/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.a;

import com.mojang.authlib.GameProfile;
import java.util.Date;
import net.minecraft.a.n;
import net.minecraft.a.o;

class i {
    private final /* synthetic */ GameProfile b;
    final /* synthetic */ o a;
    private final /* synthetic */ Date c;

    private i(o o2, GameProfile gameProfile, Date date) {
        this.a = o2;
        this.b = gameProfile;
        this.c = date;
    }

    i(o o2, GameProfile gameProfile, Date date, n n2) {
        this(o2, gameProfile, date);
    }

    public GameProfile a() {
        return this.b;
    }

    public Date b() {
        return this.c;
    }

    static Date a(i i2) {
        return i2.c;
    }
}

