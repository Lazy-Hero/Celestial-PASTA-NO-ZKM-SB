/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.util.UUIDTypeAdapter
 */
package net.minecraft.ar;

import com.mojang.authlib.GameProfile;
import com.mojang.util.UUIDTypeAdapter;
import java.util.UUID;
import net.minecraft.ar.am;

public class k {
    private final /* synthetic */ String a;
    private final /* synthetic */ am c;
    private final /* synthetic */ String d;
    private final /* synthetic */ String b;

    public String b() {
        return this.b;
    }

    public GameProfile c() {
        try {
            UUID uUID = UUIDTypeAdapter.fromString((String)this.a());
            return new GameProfile(uUID, this.b());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return new GameProfile(null, this.b());
        }
    }

    public String d() {
        return "token:" + this.a + ":" + this.d;
    }

    public k(String string, String string2, String string3, String string4) {
        this.b = string;
        this.d = string2;
        this.a = string3;
        this.c = am.a(string4);
    }

    public String a() {
        return this.d;
    }

    public String e() {
        return this.a;
    }
}

