/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.a;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.util.Iterator;
import net.minecraft.a.b;
import net.minecraft.a.f;
import net.minecraft.a.k;
import net.minecraft.a.t;

public class w
extends t<GameProfile, f> {
    @Override
    public String[] e() {
        String[] arrstring;
        block2: {
            String[] arrstring2 = new String[this.c().size()];
            int n2 = 0;
            Iterator iterator = this.c().values().iterator();
            boolean bl2 = k.q();
            while (iterator.hasNext()) {
                f f10 = (f)iterator.next();
                arrstring = arrstring2;
                if (!bl2) {
                    arrstring[n2++] = ((GameProfile)f10.a()).getName();
                    if (!bl2) continue;
                }
                break block2;
            }
            arrstring = arrstring2;
        }
        return arrstring;
    }

    @Override
    protected b<GameProfile> a(JsonObject jsonObject) {
        return new f(jsonObject);
    }

    public w(File file) {
        super(file);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int b(GameProfile gameProfile) {
        f f10 = (f)this.a(gameProfile);
        boolean bl2 = k.q();
        f f11 = f10;
        if (!bl2) {
            if (f11 == null) return 0;
            f11 = f10;
        }
        int n2 = f11.b();
        return n2;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    protected String a(GameProfile gameProfile) {
        return gameProfile.getId().toString();
    }

    @Override
    public GameProfile a(String string) {
        Iterator iterator = this.c().values().iterator();
        boolean bl2 = k.q();
        while (iterator.hasNext()) {
            block4: {
                String string2;
                block3: {
                    f f10 = (f)iterator.next();
                    string2 = string;
                    if (bl2) break block3;
                    if (!string2.equalsIgnoreCase(((GameProfile)f10.a()).getName())) break block4;
                    string2 = f10.a();
                }
                return (GameProfile)string2;
            }
            if (!bl2) continue;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean c(GameProfile gameProfile) {
        f f10 = (f)this.a(gameProfile);
        boolean bl2 = k.q();
        f f11 = f10;
        if (!bl2) {
            if (f11 == null) return false;
            f11 = f10;
        }
        boolean bl3 = f11.a();
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }
}

