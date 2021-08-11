/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 */
package net.minecraft.aA;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import net.minecraft.aA.h;
import net.minecraft.aA.t;
import net.minecraft.ar.aG;
import net.minecraft.k.m;
import net.minecraft.u.d;

public class f
implements JsonDeserializer<t>,
JsonSerializer<t> {
    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public t a(JsonElement var1_1, Type var2_2, JsonDeserializationContext var3_3) throws JsonParseException {
        block9: {
            block10: {
                var5_4 = var1_1.getAsJsonObject();
                var4_5 = h.a();
                var6_6 = new t();
                var6_6.L = aG.a(var5_4, "coordinateScale", var6_6.L);
                var6_6.I = aG.a(var5_4, "heightScale", var6_6.I);
                var6_6.S = aG.a(var5_4, "lowerLimitScale", var6_6.S);
                var6_6.Z = aG.a(var5_4, "upperLimitScale", var6_6.Z);
                var6_6.l = aG.a(var5_4, "depthNoiseScaleX", var6_6.l);
                var6_6.ak = aG.a(var5_4, "depthNoiseScaleZ", var6_6.ak);
                var6_6.aB = aG.a(var5_4, "depthNoiseScaleExponent", var6_6.aB);
                var6_6.R = aG.a(var5_4, "mainNoiseScaleX", var6_6.R);
                var6_6.aw = aG.a(var5_4, "mainNoiseScaleY", var6_6.aw);
                var6_6.ac = aG.a(var5_4, "mainNoiseScaleZ", var6_6.ac);
                var6_6.M = aG.a(var5_4, "baseSize", var6_6.M);
                var6_6.v = aG.a(var5_4, "stretchY", var6_6.v);
                var6_6.J = aG.a(var5_4, "biomeDepthWeight", var6_6.J);
                var6_6.ab = aG.a(var5_4, "biomeDepthOffset", var6_6.ab);
                var6_6.D = aG.a(var5_4, "biomeScaleWeight", var6_6.D);
                var6_6.aa = aG.a(var5_4, "biomeScaleOffset", var6_6.aa);
                var6_6.ah = aG.a(var5_4, "seaLevel", var6_6.ah);
                var6_6.f = aG.a(var5_4, "useCaves", var6_6.f);
                var6_6.K = aG.a(var5_4, "useDungeons", var6_6.K);
                var6_6.Y = aG.a(var5_4, "dungeonChance", var6_6.Y);
                var6_6.ar = aG.a(var5_4, "useStrongholds", var6_6.ar);
                var6_6.O = aG.a(var5_4, "useVillages", var6_6.O);
                var6_6.Q = aG.a(var5_4, "useMineShafts", var6_6.Q);
                var6_6.aA = aG.a(var5_4, "useTemples", var6_6.aA);
                var6_6.h = aG.a(var5_4, "useMonuments", var6_6.h);
                var6_6.ao = aG.a(var5_4, "useMansions", var6_6.ao);
                var6_6.p = aG.a(var5_4, "useRavines", var6_6.p);
                var6_6.am = aG.a(var5_4, "useWaterLakes", var6_6.am);
                var6_6.ad = aG.a(var5_4, "waterLakeChance", var6_6.ad);
                var6_6.W = aG.a(var5_4, "useLavaLakes", var6_6.W);
                var6_6.a = aG.a(var5_4, "lavaLakeChance", var6_6.a);
                var6_6.c = aG.a(var5_4, "useLavaOceans", var6_6.c);
                var6_6.j = aG.a(var5_4, "fixedBiome", var6_6.j);
                v0 = var6_6;
                if (var4_5) break block9;
                if (v0.j >= 38) break block10;
                v0 = var6_6;
                if (var4_5) break block9;
                if (v0.j < -1) break block10;
                v1 = var6_6;
                if (var4_5) ** GOTO lbl104
                if (v1.j < net.minecraft.A.h.b(d.R)) ** GOTO lbl58
                var6_6.j += 2;
                if (!var4_5) ** GOTO lbl58
            }
            v0 = var6_6;
        }
        try {
            v0.j = -1;
lbl58:
            // 3 sources

            var6_6.B = aG.a(var5_4, "biomeSize", var6_6.B);
            var6_6.r = aG.a(var5_4, "riverSize", var6_6.r);
            var6_6.i = aG.a(var5_4, "dirtSize", var6_6.i);
            var6_6.X = aG.a(var5_4, "dirtCount", var6_6.X);
            var6_6.az = aG.a(var5_4, "dirtMinHeight", var6_6.az);
            var6_6.s = aG.a(var5_4, "dirtMaxHeight", var6_6.s);
            var6_6.d = aG.a(var5_4, "gravelSize", var6_6.d);
            var6_6.q = aG.a(var5_4, "gravelCount", var6_6.q);
            var6_6.ai = aG.a(var5_4, "gravelMinHeight", var6_6.ai);
            var6_6.ay = aG.a(var5_4, "gravelMaxHeight", var6_6.ay);
            var6_6.E = aG.a(var5_4, "graniteSize", var6_6.E);
            var6_6.w = aG.a(var5_4, "graniteCount", var6_6.w);
            var6_6.o = aG.a(var5_4, "graniteMinHeight", var6_6.o);
            var6_6.ag = aG.a(var5_4, "graniteMaxHeight", var6_6.ag);
            var6_6.al = aG.a(var5_4, "dioriteSize", var6_6.al);
            var6_6.V = aG.a(var5_4, "dioriteCount", var6_6.V);
            var6_6.G = aG.a(var5_4, "dioriteMinHeight", var6_6.G);
            var6_6.U = aG.a(var5_4, "dioriteMaxHeight", var6_6.U);
            var6_6.aj = aG.a(var5_4, "andesiteSize", var6_6.aj);
            var6_6.t = aG.a(var5_4, "andesiteCount", var6_6.t);
            var6_6.u = aG.a(var5_4, "andesiteMinHeight", var6_6.u);
            var6_6.g = aG.a(var5_4, "andesiteMaxHeight", var6_6.g);
            var6_6.ax = aG.a(var5_4, "coalSize", var6_6.ax);
            var6_6.F = aG.a(var5_4, "coalCount", var6_6.F);
            var6_6.av = aG.a(var5_4, "coalMinHeight", var6_6.av);
            var6_6.k = aG.a(var5_4, "coalMaxHeight", var6_6.k);
            var6_6.N = aG.a(var5_4, "ironSize", var6_6.N);
            var6_6.ap = aG.a(var5_4, "ironCount", var6_6.ap);
            var6_6.as = aG.a(var5_4, "ironMinHeight", var6_6.as);
            var6_6.P = aG.a(var5_4, "ironMaxHeight", var6_6.P);
            var6_6.m = aG.a(var5_4, "goldSize", var6_6.m);
            var6_6.at = aG.a(var5_4, "goldCount", var6_6.at);
            var6_6.n = aG.a(var5_4, "goldMinHeight", var6_6.n);
            var6_6.au = aG.a(var5_4, "goldMaxHeight", var6_6.au);
            var6_6.e = aG.a(var5_4, "redstoneSize", var6_6.e);
            var6_6.y = aG.a(var5_4, "redstoneCount", var6_6.y);
            var6_6.af = aG.a(var5_4, "redstoneMinHeight", var6_6.af);
            var6_6.C = aG.a(var5_4, "redstoneMaxHeight", var6_6.C);
            var6_6.ae = aG.a(var5_4, "diamondSize", var6_6.ae);
            var6_6.T = aG.a(var5_4, "diamondCount", var6_6.T);
            var6_6.x = aG.a(var5_4, "diamondMinHeight", var6_6.x);
            var6_6.aq = aG.a(var5_4, "diamondMaxHeight", var6_6.aq);
            var6_6.an = aG.a(var5_4, "lapisSize", var6_6.an);
            var6_6.H = aG.a(var5_4, "lapisCount", var6_6.H);
            var6_6.b = aG.a(var5_4, "lapisCenterHeight", var6_6.b);
            v1 = var6_6;
lbl104:
            // 2 sources

            v1.A = aG.a(var5_4, "lapisSpread", var6_6.A);
            return var6_6;
        }
        catch (Exception var7_7) {
            // empty catch block
        }
        return var6_6;
    }

    public JsonElement a(t t2, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("coordinateScale", (Number)Float.valueOf(t2.L));
        boolean bl2 = h.b();
        jsonObject.addProperty("heightScale", (Number)Float.valueOf(t2.I));
        jsonObject.addProperty("lowerLimitScale", (Number)Float.valueOf(t2.S));
        jsonObject.addProperty("upperLimitScale", (Number)Float.valueOf(t2.Z));
        jsonObject.addProperty("depthNoiseScaleX", (Number)Float.valueOf(t2.l));
        jsonObject.addProperty("depthNoiseScaleZ", (Number)Float.valueOf(t2.ak));
        jsonObject.addProperty("depthNoiseScaleExponent", (Number)Float.valueOf(t2.aB));
        jsonObject.addProperty("mainNoiseScaleX", (Number)Float.valueOf(t2.R));
        jsonObject.addProperty("mainNoiseScaleY", (Number)Float.valueOf(t2.aw));
        jsonObject.addProperty("mainNoiseScaleZ", (Number)Float.valueOf(t2.ac));
        jsonObject.addProperty("baseSize", (Number)Float.valueOf(t2.M));
        jsonObject.addProperty("stretchY", (Number)Float.valueOf(t2.v));
        jsonObject.addProperty("biomeDepthWeight", (Number)Float.valueOf(t2.J));
        jsonObject.addProperty("biomeDepthOffset", (Number)Float.valueOf(t2.ab));
        jsonObject.addProperty("biomeScaleWeight", (Number)Float.valueOf(t2.D));
        jsonObject.addProperty("biomeScaleOffset", (Number)Float.valueOf(t2.aa));
        boolean bl3 = bl2;
        jsonObject.addProperty("seaLevel", (Number)t2.ah);
        jsonObject.addProperty("useCaves", Boolean.valueOf(t2.f));
        jsonObject.addProperty("useDungeons", Boolean.valueOf(t2.K));
        jsonObject.addProperty("dungeonChance", (Number)t2.Y);
        jsonObject.addProperty("useStrongholds", Boolean.valueOf(t2.ar));
        jsonObject.addProperty("useVillages", Boolean.valueOf(t2.O));
        jsonObject.addProperty("useMineShafts", Boolean.valueOf(t2.Q));
        jsonObject.addProperty("useTemples", Boolean.valueOf(t2.aA));
        jsonObject.addProperty("useMonuments", Boolean.valueOf(t2.h));
        jsonObject.addProperty("useMansions", Boolean.valueOf(t2.ao));
        jsonObject.addProperty("useRavines", Boolean.valueOf(t2.p));
        jsonObject.addProperty("useWaterLakes", Boolean.valueOf(t2.am));
        jsonObject.addProperty("waterLakeChance", (Number)t2.ad);
        jsonObject.addProperty("useLavaLakes", Boolean.valueOf(t2.W));
        jsonObject.addProperty("lavaLakeChance", (Number)t2.a);
        jsonObject.addProperty("useLavaOceans", Boolean.valueOf(t2.c));
        jsonObject.addProperty("fixedBiome", (Number)t2.j);
        jsonObject.addProperty("biomeSize", (Number)t2.B);
        jsonObject.addProperty("riverSize", (Number)t2.r);
        jsonObject.addProperty("dirtSize", (Number)t2.i);
        jsonObject.addProperty("dirtCount", (Number)t2.X);
        jsonObject.addProperty("dirtMinHeight", (Number)t2.az);
        jsonObject.addProperty("dirtMaxHeight", (Number)t2.s);
        jsonObject.addProperty("gravelSize", (Number)t2.d);
        jsonObject.addProperty("gravelCount", (Number)t2.q);
        jsonObject.addProperty("gravelMinHeight", (Number)t2.ai);
        jsonObject.addProperty("gravelMaxHeight", (Number)t2.ay);
        jsonObject.addProperty("graniteSize", (Number)t2.E);
        jsonObject.addProperty("graniteCount", (Number)t2.w);
        jsonObject.addProperty("graniteMinHeight", (Number)t2.o);
        jsonObject.addProperty("graniteMaxHeight", (Number)t2.ag);
        jsonObject.addProperty("dioriteSize", (Number)t2.al);
        jsonObject.addProperty("dioriteCount", (Number)t2.V);
        jsonObject.addProperty("dioriteMinHeight", (Number)t2.G);
        jsonObject.addProperty("dioriteMaxHeight", (Number)t2.U);
        jsonObject.addProperty("andesiteSize", (Number)t2.aj);
        jsonObject.addProperty("andesiteCount", (Number)t2.t);
        jsonObject.addProperty("andesiteMinHeight", (Number)t2.u);
        jsonObject.addProperty("andesiteMaxHeight", (Number)t2.g);
        jsonObject.addProperty("coalSize", (Number)t2.ax);
        jsonObject.addProperty("coalCount", (Number)t2.F);
        jsonObject.addProperty("coalMinHeight", (Number)t2.av);
        jsonObject.addProperty("coalMaxHeight", (Number)t2.k);
        jsonObject.addProperty("ironSize", (Number)t2.N);
        jsonObject.addProperty("ironCount", (Number)t2.ap);
        jsonObject.addProperty("ironMinHeight", (Number)t2.as);
        jsonObject.addProperty("ironMaxHeight", (Number)t2.P);
        jsonObject.addProperty("goldSize", (Number)t2.m);
        jsonObject.addProperty("goldCount", (Number)t2.at);
        jsonObject.addProperty("goldMinHeight", (Number)t2.n);
        jsonObject.addProperty("goldMaxHeight", (Number)t2.au);
        jsonObject.addProperty("redstoneSize", (Number)t2.e);
        jsonObject.addProperty("redstoneCount", (Number)t2.y);
        jsonObject.addProperty("redstoneMinHeight", (Number)t2.af);
        jsonObject.addProperty("redstoneMaxHeight", (Number)t2.C);
        jsonObject.addProperty("diamondSize", (Number)t2.ae);
        jsonObject.addProperty("diamondCount", (Number)t2.T);
        jsonObject.addProperty("diamondMinHeight", (Number)t2.x);
        jsonObject.addProperty("diamondMaxHeight", (Number)t2.aq);
        jsonObject.addProperty("lapisSize", (Number)t2.an);
        jsonObject.addProperty("lapisCount", (Number)t2.H);
        jsonObject.addProperty("lapisCenterHeight", (Number)t2.b);
        jsonObject.addProperty("lapisSpread", (Number)t2.A);
        if (!m.d()) {
            h.b(!bl3);
        }
        return jsonObject;
    }
}

