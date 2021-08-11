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
import net.minecraft.M.C;
import net.minecraft.M.az;
import net.minecraft.M.t;
import net.minecraft.W.K;
import net.minecraft.Z.c;
import net.minecraft.Z.i;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.aO;
import net.minecraft.ae.a;
import net.minecraft.ar.v;
import net.minecraft.b.e;
import net.minecraft.i.k;

public class aW
implements aO<C> {
    private static final /* synthetic */ v b;
    private final /* synthetic */ Map<a4, az> a;

    @Override
    public v a() {
        return b;
    }

    @Override
    public void b(a4 a42, aG<C> aG2) {
        az az2 = this.a.get(a42);
        int n2 = t.b();
        az az3 = az2;
        if (n2 == 0) {
            if (az3 == null) {
                az2 = new az(a42);
                this.a.put(a42, az2);
            }
            az3 = az2;
        }
        az3.a(aG2);
    }

    @Override
    public C a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        Object object;
        K k2 = null;
        int n2 = t.c();
        if (jsonObject.has("block")) {
            object = new v(net.minecraft.ar.aG.f(jsonObject, "block"));
            e<v, K> e10 = K.h;
            v v2 = object;
            if (n2 != 0) {
                if (e10.a(v2) == false) {
                    throw new JsonSyntaxException("Unknown block type '" + object + "'");
                }
                e10 = K.h;
                v2 = object;
            }
            k2 = e10.a(v2);
        }
        object = null;
        if (jsonObject.has("state")) {
            K k3 = k2;
            if (n2 != 0) {
                if (k3 == null) {
                    throw new JsonSyntaxException("Can't define block state without a specific block type");
                }
                k3 = k2;
            }
            c c10 = k3.i();
            for (Map.Entry entry : net.minecraft.ar.aG.l(jsonObject, "state").entrySet()) {
                String string;
                Optional<?> optional;
                a<?> a10;
                a<Object> a11 = a10 = c10.a((String)entry.getKey());
                if (n2 != 0) {
                    if (a11 == null) {
                        throw new JsonSyntaxException("Unknown block state property '" + (String)entry.getKey() + "' for block '" + K.h.b(k2) + "'");
                    }
                    a11 = entry.getValue();
                }
                if (!(optional = a10.a(string = net.minecraft.ar.aG.e((JsonElement)a11, (String)entry.getKey()))).isPresent()) {
                    throw new JsonSyntaxException("Invalid block state value '" + string + "' for property '" + (String)entry.getKey() + "' on block '" + K.h.b(k2) + "'");
                }
                Object object2 = object;
                if (n2 != 0) {
                    if (object2 == null) {
                        object = Maps.newHashMap();
                    }
                    object2 = object.put(a10, optional.get());
                }
                if (n2 != 0) continue;
            }
        }
        return new C(k2, (Map<a<?>, Object>)object);
    }

    @Override
    public void a(a4 a42, aG<C> aG2) {
        block5: {
            az az2;
            int n2;
            block4: {
                az az3 = this.a.get(a42);
                n2 = t.b();
                az2 = az3;
                if (n2 != 0) break block4;
                if (az2 == null) break block5;
                az3.b(aG2);
                az2 = az3;
            }
            if (n2 == 0 && az2.a()) {
                az2 = this.a.remove(a42);
            }
        }
    }

    public aW() {
        this.a = Maps.newHashMap();
    }

    private static JsonSyntaxException a(JsonSyntaxException jsonSyntaxException) {
        return jsonSyntaxException;
    }

    static v b() {
        return b;
    }

    public void a(k k2, i i2) {
        block3: {
            az az2;
            block2: {
                az az3 = this.a.get(k2.Y());
                int n2 = t.c();
                az2 = az3;
                if (n2 == 0) break block2;
                if (az2 == null) break block3;
                az2 = az3;
            }
            az2.a(i2);
        }
    }

    static {
        b = new v("enter_block");
    }

    @Override
    public void a(a4 a42) {
        this.a.remove(a42);
    }
}

