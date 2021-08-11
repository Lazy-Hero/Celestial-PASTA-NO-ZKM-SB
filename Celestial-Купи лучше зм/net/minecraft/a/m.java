/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.Agent
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.ProfileLookupCallback
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.a;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;
import net.minecraft.R.b;
import net.minecraft.a.k;
import net.minecraft.a.r;
import net.minecraft.a.y;
import net.minecraft.ar.aD;
import net.minecraft.i.j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class m {
    public static final /* synthetic */ File d;
    public static final /* synthetic */ File e;
    public static final /* synthetic */ File c;
    private static final /* synthetic */ Logger a;
    public static final /* synthetic */ File b;

    static {
        a = LogManager.getLogger();
        d = new File("banned-ips.txt");
        c = new File("banned-players.txt");
        b = new File("ops.txt");
        e = new File("white-list.txt");
    }

    private static void a(b b10, Collection<String> collection, ProfileLookupCallback profileLookupCallback) {
        block5: {
            boolean bl2;
            String[] arrstring;
            block4: {
                b b11;
                block3: {
                    arrstring = (String[])Iterators.toArray((Iterator)Iterators.filter(collection.iterator(), (Predicate)new r()), String.class);
                    bl2 = k.q();
                    b11 = b10;
                    if (bl2) break block3;
                    if (!b11.ah()) break block4;
                    b11 = b10;
                }
                b11.ac().findProfilesByNames(arrstring, Agent.MINECRAFT, profileLookupCallback);
                if (!bl2) break block5;
            }
            for (String string : arrstring) {
                UUID uUID = j.a(new GameProfile(null, string));
                GameProfile gameProfile = new GameProfile(uUID, string);
                profileLookupCallback.onProfileLookupSucceeded(gameProfile);
                if (!bl2) continue;
            }
        }
    }

    static Logger a() {
        return a;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String a(b b10, String string) {
        String string2;
        block7: {
            boolean bl2;
            block9: {
                GameProfile gameProfile;
                GameProfile gameProfile2;
                block8: {
                    bl2 = k.t();
                    string2 = string;
                    if (!bl2) return string2;
                    if (aD.a(string2)) break block7;
                    string2 = string;
                    if (!bl2) return string2;
                    if (string2.length() > 16) break block7;
                    gameProfile = gameProfile2 = b10.au().a(string);
                    if (!bl2) break block8;
                    if (gameProfile == null) break block9;
                    gameProfile = gameProfile2;
                }
                UUID uUID = gameProfile.getId();
                if (!bl2) return uUID.toString();
                if (uUID != null) {
                    uUID = gameProfile2.getId();
                    return uUID.toString();
                }
            }
            boolean bl3 = b10.av();
            if (bl2) {
                if (bl3) return j.a(new GameProfile(null, string)).toString();
                bl3 = b10.ah();
            }
            if (!bl3) return j.a(new GameProfile(null, string)).toString();
            ArrayList arrayList = Lists.newArrayList();
            y y2 = new y(b10, arrayList);
            m.a(b10, Lists.newArrayList((Object[])new String[]{string}), y2);
            ArrayList arrayList2 = arrayList;
            if (bl2) {
                if (arrayList2.isEmpty()) return "";
                arrayList2 = arrayList.get(0);
            }
            UUID uUID = ((GameProfile)arrayList2).getId();
            if (bl2) {
                if (uUID == null) return "";
                uUID = ((GameProfile)arrayList.get(0)).getId();
            }
            String string3 = uUID.toString();
            return string3;
        }
        string2 = string;
        return string2;
    }
}

