/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.io.Files
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonParseException
 *  com.mojang.authlib.Agent
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.GameProfileRepository
 *  com.mojang.authlib.ProfileLookupCallback
 *  javax.annotation.Nullable
 *  org.apache.commons.io.IOUtils
 */
package net.minecraft.a;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.ProfileLookupCallback;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.a.B;
import net.minecraft.a.E;
import net.minecraft.a.i;
import net.minecraft.a.k;
import net.minecraft.a.n;
import net.minecraft.ar.aG;
import net.minecraft.i.j;
import org.apache.commons.io.IOUtils;

public class o {
    private final /* synthetic */ Deque<GameProfile> d;
    protected final /* synthetic */ Gson f;
    private static final /* synthetic */ ParameterizedType h;
    private final /* synthetic */ File a;
    public static final /* synthetic */ SimpleDateFormat c;
    private final /* synthetic */ Map<String, i> e;
    private static /* synthetic */ boolean g;
    private final /* synthetic */ GameProfileRepository b;
    private final /* synthetic */ Map<UUID, i> i;

    public o(GameProfileRepository gameProfileRepository, File file) {
        this.e = Maps.newHashMap();
        this.i = Maps.newHashMap();
        this.d = Lists.newLinkedList();
        this.b = gameProfileRepository;
        this.a = file;
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeHierarchyAdapter(i.class, (Object)new B(this, null));
        this.f = gsonBuilder.create();
        this.b();
    }

    static {
        c = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
        h = new n();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static boolean a() {
        return g;
    }

    private List<i> a(int n2) {
        ArrayList arrayList = Lists.newArrayList();
        Iterator iterator = Lists.newArrayList((Iterator)Iterators.limit(this.d.iterator(), (int)n2)).iterator();
        boolean bl2 = k.t();
        while (iterator.hasNext()) {
            GameProfile gameProfile = (GameProfile)iterator.next();
            i i2 = this.b(gameProfile.getId());
            if (i2 != null) {
                arrayList.add(i2);
            }
            if (bl2) continue;
        }
        return arrayList;
    }

    public String[] c() {
        ArrayList arrayList = Lists.newArrayList(this.e.keySet());
        return arrayList.toArray(new String[arrayList.size()]);
    }

    private static GameProfile a(GameProfileRepository gameProfileRepository, String string) {
        GameProfile gameProfile;
        block5: {
            GameProfile[] arrgameProfile;
            block4: {
                arrgameProfile = new GameProfile[1];
                E e10 = new E(arrgameProfile);
                boolean bl2 = k.q();
                gameProfileRepository.findProfilesByNames(new String[]{string}, Agent.MINECRAFT, (ProfileLookupCallback)e10);
                if (o.a()) break block4;
                gameProfile = arrgameProfile[0];
                if (bl2) break block5;
                if (gameProfile == null) {
                    UUID uUID = j.a(new GameProfile(null, string));
                    GameProfile gameProfile2 = new GameProfile(uUID, string);
                    e10.onProfileLookupSucceeded(gameProfile2);
                }
            }
            gameProfile = arrgameProfile[0];
        }
        return gameProfile;
    }

    private i b(UUID uUID) {
        i i2 = this.i.get(uUID);
        boolean bl2 = k.q();
        i i3 = i2;
        if (!bl2) {
            if (i3 != null) {
                GameProfile gameProfile = i2.a();
                this.d.remove((Object)gameProfile);
                this.d.addFirst(gameProfile);
            }
            i3 = i2;
        }
        return i3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public GameProfile a(String string) {
        i i2;
        boolean bl2;
        block15: {
            block14: {
                GameProfile gameProfile;
                String string2;
                block13: {
                    i i3;
                    block12: {
                        block9: {
                            block10: {
                                block11: {
                                    string2 = string.toLowerCase(Locale.ROOT);
                                    bl2 = k.t();
                                    i3 = i2 = this.e.get(string2);
                                    if (!bl2) break block9;
                                    if (i3 == null) break block10;
                                    long l2 = new Date().getTime() - net.minecraft.a.i.a(i2).getTime();
                                    long l3 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
                                    if (!bl2) break block11;
                                    if (l3 < 0) break block10;
                                    this.i.remove(i2.a().getId());
                                    this.e.remove(i2.a().getName().toLowerCase(Locale.ROOT));
                                    l3 = (long)this.d.remove((Object)i2.a());
                                }
                                i2 = null;
                            }
                            i3 = i2;
                        }
                        if (!bl2) break block12;
                        if (i3 == null) break block13;
                        i3 = i2;
                    }
                    gameProfile = i3.a();
                    this.d.remove((Object)gameProfile);
                    this.d.addFirst(gameProfile);
                    if (bl2) break block14;
                }
                gameProfile = o.a(this.b, string2);
                if (!bl2) break block15;
                if (gameProfile != null) {
                    this.a(gameProfile);
                    i2 = this.e.get(string2);
                }
            }
            this.d();
        }
        i i4 = i2;
        if (bl2) {
            if (i4 == null) {
                return null;
            }
            i4 = i2;
        }
        GameProfile gameProfile = i4.a();
        return gameProfile;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b() {
        block7: {
            BufferedReader bufferedReader;
            block8: {
                bufferedReader = null;
                boolean bl2 = k.t();
                try {
                    bufferedReader = Files.newReader((File)this.a, (Charset)StandardCharsets.UTF_8);
                    List list = (List)aG.a(this.f, (Reader)bufferedReader, (Type)h);
                    this.e.clear();
                    this.i.clear();
                    this.d.clear();
                    if (!bl2) break block7;
                    if (list == null) break block8;
                    for (i i2 : Lists.reverse((List)list)) {
                        if (bl2) {
                            if (i2 != null) {
                                this.a(i2.a(), i2.b());
                            }
                            if (bl2) continue;
                        }
                    }
                }
                catch (FileNotFoundException fileNotFoundException) {
                    IOUtils.closeQuietly(bufferedReader);
                }
                catch (JsonParseException jsonParseException) {
                    IOUtils.closeQuietly(bufferedReader);
                }
                catch (Throwable throwable) {
                    IOUtils.closeQuietly(bufferedReader);
                    throw throwable;
                }
            }
            IOUtils.closeQuietly((Reader)bufferedReader);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public GameProfile a(UUID uUID) {
        i i2 = this.i.get(uUID);
        boolean bl2 = k.t();
        i i3 = i2;
        if (bl2) {
            if (i3 == null) {
                return null;
            }
            i3 = i2;
        }
        GameProfile gameProfile = i3.a();
        return gameProfile;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void d() {
        String string = this.f.toJson(this.a(1000));
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = Files.newWriter((File)this.a, (Charset)StandardCharsets.UTF_8);
            bufferedWriter.write(string);
        }
        catch (FileNotFoundException fileNotFoundException) {
            IOUtils.closeQuietly(bufferedWriter);
        }
        catch (IOException iOException) {
            IOUtils.closeQuietly(bufferedWriter);
            return;
        }
        catch (Throwable throwable) {
            IOUtils.closeQuietly(bufferedWriter);
            throw throwable;
        }
        IOUtils.closeQuietly((Writer)bufferedWriter);
        return;
    }

    public void a(GameProfile gameProfile) {
        this.a(gameProfile, null);
    }

    private void a(GameProfile gameProfile, Date date) {
        Object object;
        UUID uUID = gameProfile.getId();
        boolean bl2 = k.t();
        if (date == null) {
            object = Calendar.getInstance();
            ((Calendar)object).setTime(new Date());
            ((Calendar)object).add(2, 1);
            date = ((Calendar)object).getTime();
        }
        object = gameProfile.getName().toLowerCase(Locale.ROOT);
        i i2 = new i(this, gameProfile, date, null);
        Map<UUID, i> map = this.i;
        UUID uUID2 = uUID;
        if (bl2) {
            if (map.containsKey(uUID2)) {
                i i3 = this.i.get(uUID);
                this.e.remove(i3.a().getName().toLowerCase(Locale.ROOT));
                this.d.remove((Object)gameProfile);
            }
            this.e.put(gameProfile.getName().toLowerCase(Locale.ROOT), i2);
            map = this.i;
            uUID2 = uUID;
        }
        map.put(uUID2, i2);
        this.d.addFirst(gameProfile);
        this.d();
    }

    public static void a(boolean bl2) {
        g = bl2;
    }
}

