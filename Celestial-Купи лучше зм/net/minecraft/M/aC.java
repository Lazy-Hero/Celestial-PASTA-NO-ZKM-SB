/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  javax.annotation.Nullable
 */
package net.minecraft.M;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import javax.annotation.Nullable;
import net.minecraft.M.al;
import net.minecraft.M.t;
import net.minecraft.ar.G;
import net.minecraft.ar.aG;
import net.minecraft.i.k;
import net.minecraft.k.m;

public class aC {
    private final /* synthetic */ Boolean j;
    private final /* synthetic */ al b;
    public static /* synthetic */ aC c;
    private final /* synthetic */ Boolean d;
    private final /* synthetic */ Boolean f;
    private final /* synthetic */ Boolean a;
    private final /* synthetic */ Boolean e;
    private final /* synthetic */ Boolean h;
    private final /* synthetic */ al i;
    private final /* synthetic */ Boolean g;

    public aC(@Nullable Boolean bl2, @Nullable Boolean bl3, @Nullable Boolean bl4, @Nullable Boolean bl5, @Nullable Boolean bl6, @Nullable Boolean bl7, @Nullable Boolean bl8, al al2, al al3) {
        this.f = bl2;
        this.e = bl3;
        this.a = bl4;
        this.g = bl5;
        this.h = bl6;
        this.d = bl7;
        this.j = bl8;
        int n2 = t.b();
        this.i = al2;
        this.b = al3;
        if (n2 != 0) {
            m.b(!m.c());
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    private static Boolean a(JsonObject jsonObject, String string) {
        int n2 = t.c();
        boolean bl2 = jsonObject.has(string);
        if (n2 != 0) {
            if (!bl2) return null;
            bl2 = aG.c(jsonObject, string);
        }
        Boolean bl3 = bl2;
        return bl3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static aC a(@Nullable JsonElement jsonElement) {
        block3: {
            JsonElement jsonElement2;
            block4: {
                int n2;
                block2: {
                    n2 = t.c();
                    jsonElement2 = jsonElement;
                    if (n2 == 0) break block2;
                    if (jsonElement2 == null) break block3;
                    jsonElement2 = jsonElement;
                }
                if (n2 == 0) break block4;
                if (jsonElement2.isJsonNull()) break block3;
                jsonElement2 = jsonElement;
            }
            JsonObject jsonObject = aG.b(jsonElement2, "damage type");
            Boolean bl2 = aC.a(jsonObject, "is_projectile");
            Boolean bl3 = aC.a(jsonObject, "is_explosion");
            Boolean bl4 = aC.a(jsonObject, "bypasses_armor");
            Boolean bl5 = aC.a(jsonObject, "bypasses_invulnerability");
            Boolean bl6 = aC.a(jsonObject, "bypasses_magic");
            Boolean bl7 = aC.a(jsonObject, "is_fire");
            Boolean bl8 = aC.a(jsonObject, "is_magic");
            al al2 = al.a(jsonObject.get("direct_entity"));
            al al3 = al.a(jsonObject.get("source_entity"));
            return new aC(bl2, bl3, bl4, bl5, bl6, bl7, bl8, al2, al3);
        }
        return c;
    }

    public aC() {
        this.f = null;
        this.e = null;
        this.a = null;
        this.g = null;
        this.h = null;
        this.d = null;
        this.j = null;
        this.i = al.d;
        this.b = al.d;
    }

    static {
        c = new aC();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean a(k var1_1, G var2_2) {
        block34: {
            block35: {
                var3_3 = t.b();
                v0 = this;
                if (var3_3 == 0) {
                    if (v0 == aC.c) {
                        return true;
                    }
                    v0 = this;
                }
                v1 = v0.f;
                if (var3_3 == 0) {
                    if (v1 != null) {
                        v1 = this.f;
                        if (var3_3 == 0) {
                            if (v1.booleanValue() != var2_2.o()) {
                                return false;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v1 = this.e;
                    }
                }
                if (var3_3 == 0) {
                    if (v1 != null) {
                        v1 = this.e;
                        if (var3_3 == 0) {
                            if (v1.booleanValue() != var2_2.j()) {
                                return false;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v1 = this.a;
                    }
                }
                if (var3_3 == 0) {
                    if (v1 != null) {
                        v1 = this.a;
                        if (var3_3 == 0) {
                            if (v1.booleanValue() != var2_2.f()) {
                                return false;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v1 = this.g;
                    }
                }
                if (var3_3 == 0) {
                    if (v1 != null) {
                        v1 = this.g;
                        if (var3_3 == 0) {
                            if (v1.booleanValue() != var2_2.b()) {
                                return false;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v1 = this.h;
                    }
                }
                if (var3_3 == 0) {
                    if (v1 != null) {
                        v1 = this.h;
                        if (var3_3 == 0) {
                            if (v1.booleanValue() != var2_2.l()) {
                                return false;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v1 = this.d;
                    }
                }
                if (var3_3 != 0) break block34;
                if (v1 == null) break block35;
                v1 = this.d;
                if (var3_3 == 0) {
                    if (v1.booleanValue() != var2_2.n()) {
                        return false;
                    } else {
                        ** GOTO lbl55
                    }
                }
                break block34;
            }
            v2 = this;
            if (var3_3 != 0) ** GOTO lbl67
            v1 = v2.j;
        }
        if (v1 != null) {
            v3 = this.j;
            if (var3_3 == 0) {
                if (v3 != var2_2.a()) {
                    return false;
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v2 = this;
lbl67:
            // 2 sources

            v3 = v2.i.a(var1_1, var2_2.q());
        }
        if (var3_3 != 0) return v3;
        if (!v3) {
            return false;
        }
        v3 = this.b.a(var1_1, var2_2.h());
        return v3;
    }
}

