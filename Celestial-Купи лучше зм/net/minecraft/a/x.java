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
import net.minecraft.a.g;
import net.minecraft.a.k;
import net.minecraft.a.t;

public class x
extends t<GameProfile, g> {
    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public GameProfile a(String string) {
        Iterator iterator = this.c().values().iterator();
        boolean bl2 = k.q();
        while (iterator.hasNext()) {
            block4: {
                String string2;
                block3: {
                    g g10 = (g)iterator.next();
                    string2 = string;
                    if (bl2) break block3;
                    if (!string2.equalsIgnoreCase(((GameProfile)g10.a()).getName())) break block4;
                    string2 = g10.a();
                }
                return (GameProfile)string2;
            }
            if (!bl2) continue;
        }
        return null;
    }

    @Override
    protected String a(GameProfile gameProfile) {
        return gameProfile.getId().toString();
    }

    @Override
    public String[] e() {
        String[] arrstring;
        block2: {
            String[] arrstring2 = new String[this.c().size()];
            boolean bl2 = k.t();
            int n2 = 0;
            for (g g10 : this.c().values()) {
                arrstring = arrstring2;
                if (bl2) {
                    arrstring[n2++] = ((GameProfile)g10.a()).getName();
                    if (bl2) continue;
                }
                break block2;
            }
            arrstring = arrstring2;
        }
        return arrstring;
    }

    @Override
    protected b<GameProfile> a(JsonObject jsonObject) {
        return new g(jsonObject);
    }

    public x(File file) {
        super(file);
    }
}

