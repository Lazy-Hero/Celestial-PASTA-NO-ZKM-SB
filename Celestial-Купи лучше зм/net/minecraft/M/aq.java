/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Optional
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSyntaxException
 */
package net.minecraft.M;

import com.google.common.base.Optional;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Map;
import net.minecraft.M.K;
import net.minecraft.M.Z;
import net.minecraft.M.a0;
import net.minecraft.M.aw;
import net.minecraft.M.t;
import net.minecraft.Z.c;
import net.minecraft.Z.i;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.aO;
import net.minecraft.ae.a;
import net.minecraft.ar.v;
import net.minecraft.b.e;
import net.minecraft.i.k;
import net.minecraft.k.n;
import net.minecraft.w.d;

public class aq
implements aO<K> {
    private static final /* synthetic */ v a;
    private final /* synthetic */ Map<a4, aw> b;

    @Override
    public void a(a4 a42, aG<K> aG2) {
        block5: {
            aw aw2;
            int n2;
            block4: {
                aw aw3 = this.b.get(a42);
                n2 = t.c();
                aw2 = aw3;
                if (n2 == 0) break block4;
                if (aw2 == null) break block5;
                aw3.b(aG2);
                aw2 = aw3;
            }
            if (n2 != 0 && aw2.a()) {
                aw2 = this.b.remove(a42);
            }
        }
    }

    public void a(k k2, n n2, d d10) {
        block3: {
            aw aw2;
            i i2;
            block2: {
                i2 = k2.aG.d(n2);
                aw aw3 = this.b.get(k2.Y());
                int n3 = t.c();
                aw2 = aw3;
                if (n3 == 0) break block2;
                if (aw2 == null) break block3;
                aw2 = aw3;
            }
            aw2.a(i2, n2, k2.n(), d10);
        }
    }

    static {
        a = new v("placed_block");
    }

    public aq() {
        this.b = Maps.newHashMap();
    }

    @Override
    public K a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        Object object;
        Object object2;
        net.minecraft.W.K k2 = null;
        int n2 = t.c();
        if (jsonObject.has("block")) {
            object2 = new v(net.minecraft.ar.aG.f(jsonObject, "block"));
            e<v, net.minecraft.W.K> e10 = net.minecraft.W.K.h;
            v v2 = object2;
            if (n2 != 0) {
                if (e10.a(v2) == false) {
                    throw new JsonSyntaxException("Unknown block type '" + object2 + "'");
                }
                e10 = net.minecraft.W.K.h;
                v2 = object2;
            }
            k2 = e10.a(v2);
        }
        object2 = null;
        if (jsonObject.has("state")) {
            net.minecraft.W.K k3 = k2;
            if (n2 != 0) {
                if (k3 == null) {
                    throw new JsonSyntaxException("Can't define block state without a specific block type");
                }
                k3 = k2;
            }
            object = k3.i();
            for (Map.Entry entry : net.minecraft.ar.aG.l(jsonObject, "state").entrySet()) {
                String string;
                Optional<?> optional;
                a<?> a10;
                a<Object> a11 = a10 = ((c)object).a((String)entry.getKey());
                if (n2 != 0) {
                    if (a11 == null) {
                        throw new JsonSyntaxException("Unknown block state property '" + (String)entry.getKey() + "' for block '" + net.minecraft.W.K.h.b(k2) + "'");
                    }
                    a11 = entry.getValue();
                }
                if (!(optional = a10.a(string = net.minecraft.ar.aG.e((JsonElement)a11, (String)entry.getKey()))).isPresent()) {
                    throw new JsonSyntaxException("Invalid block state value '" + string + "' for property '" + (String)entry.getKey() + "' on block '" + net.minecraft.W.K.h.b(k2) + "'");
                }
                Object object3 = object2;
                if (n2 != 0) {
                    if (object3 == null) {
                        object2 = Maps.newHashMap();
                    }
                    object3 = object2.put(a10, optional.get());
                }
                if (n2 != 0) continue;
            }
        }
        object = Z.a(jsonObject.get("location"));
        a0 a02 = a0.a(jsonObject.get("item"));
        return new K(k2, (Map<a<?>, Object>)object2, (Z)object, a02);
    }

    static v b() {
        return a;
    }

    private static JsonSyntaxException a(JsonSyntaxException jsonSyntaxException) {
        return jsonSyntaxException;
    }

    @Override
    public void b(a4 a42, aG<K> aG2) {
        aw aw2 = this.b.get(a42);
        int n2 = t.b();
        aw aw3 = aw2;
        if (n2 == 0) {
            if (aw3 == null) {
                aw2 = new aw(a42);
                this.b.put(a42, aw2);
            }
            aw3 = aw2;
        }
        aw3.a(aG2);
    }

    @Override
    public void a(a4 a42) {
        this.b.remove(a42);
    }

    @Override
    public v a() {
        return a;
    }
}

