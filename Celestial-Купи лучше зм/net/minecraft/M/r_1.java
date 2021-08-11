/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 */
package net.minecraft.M;

import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import java.util.Map;
import net.minecraft.M.O;
import net.minecraft.M.al;
import net.minecraft.M.av;
import net.minecraft.M.t;
import net.minecraft.U.x;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.aO;
import net.minecraft.ar.v;
import net.minecraft.i.k;

public class r
implements aO<O> {
    private static final /* synthetic */ v a;
    private final /* synthetic */ Map<a4, av> b;

    private static gP a(gP gP2) {
        return gP2;
    }

    public r() {
        this.b = Maps.newHashMap();
    }

    public void a(k k2, x x2) {
        block3: {
            av av2;
            block2: {
                av av3 = this.b.get(k2.Y());
                int n2 = t.b();
                av2 = av3;
                if (n2 != 0) break block2;
                if (av2 == null) break block3;
                av2 = av3;
            }
            av2.a(k2, x2);
        }
    }

    @Override
    public void b(a4 a42, aG<O> aG2) {
        av av2 = this.b.get(a42);
        int n2 = t.b();
        av av3 = av2;
        if (n2 == 0) {
            if (av3 == null) {
                av2 = new av(a42);
                this.b.put(a42, av2);
            }
            av3 = av2;
        }
        av3.b(aG2);
    }

    static v b() {
        return a;
    }

    static {
        a = new v("summoned_entity");
    }

    @Override
    public O a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        al al2 = al.a(jsonObject.get("entity"));
        return new O(al2);
    }

    @Override
    public void a(a4 a42) {
        this.b.remove(a42);
    }

    @Override
    public void a(a4 a42, aG<O> aG2) {
        block5: {
            av av2;
            int n2;
            block4: {
                av av3 = this.b.get(a42);
                n2 = t.c();
                av2 = av3;
                if (n2 == 0) break block4;
                if (av2 == null) break block5;
                av3.a(aG2);
                av2 = av3;
            }
            if (n2 != 0 && av2.a()) {
                av2 = this.b.remove(a42);
            }
        }
    }

    @Override
    public v a() {
        return a;
    }
}

