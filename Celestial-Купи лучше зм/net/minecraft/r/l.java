/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.r;

import net.minecraft.P.r;
import net.minecraft.av.a;
import net.minecraft.r.m;

public class l
implements a {
    private static final /* synthetic */ String[] a;

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        a = new String[128];
        l.a[0] = "minecraft:water";
        l.a[1] = "minecraft:regeneration";
        l.a[2] = "minecraft:swiftness";
        l.a[3] = "minecraft:fire_resistance";
        l.a[4] = "minecraft:poison";
        l.a[5] = "minecraft:healing";
        l.a[6] = "minecraft:night_vision";
        l.a[7] = null;
        l.a[8] = "minecraft:weakness";
        l.a[9] = "minecraft:strength";
        l.a[10] = "minecraft:slowness";
        l.a[11] = "minecraft:leaping";
        l.a[12] = "minecraft:harming";
        l.a[13] = "minecraft:water_breathing";
        l.a[14] = "minecraft:invisibility";
        l.a[15] = null;
        l.a[16] = "minecraft:awkward";
        l.a[17] = "minecraft:regeneration";
        l.a[18] = "minecraft:swiftness";
        l.a[19] = "minecraft:fire_resistance";
        l.a[20] = "minecraft:poison";
        l.a[21] = "minecraft:healing";
        l.a[22] = "minecraft:night_vision";
        l.a[23] = null;
        l.a[24] = "minecraft:weakness";
        l.a[25] = "minecraft:strength";
        l.a[26] = "minecraft:slowness";
        l.a[27] = "minecraft:leaping";
        l.a[28] = "minecraft:harming";
        l.a[29] = "minecraft:water_breathing";
        l.a[30] = "minecraft:invisibility";
        l.a[31] = null;
        l.a[32] = "minecraft:thick";
        l.a[33] = "minecraft:strong_regeneration";
        l.a[34] = "minecraft:strong_swiftness";
        l.a[35] = "minecraft:fire_resistance";
        l.a[36] = "minecraft:strong_poison";
        l.a[37] = "minecraft:strong_healing";
        l.a[38] = "minecraft:night_vision";
        l.a[39] = null;
        l.a[40] = "minecraft:weakness";
        l.a[41] = "minecraft:strong_strength";
        l.a[42] = "minecraft:slowness";
        l.a[43] = "minecraft:strong_leaping";
        l.a[44] = "minecraft:strong_harming";
        l.a[45] = "minecraft:water_breathing";
        l.a[46] = "minecraft:invisibility";
        l.a[47] = null;
        l.a[48] = null;
        l.a[49] = "minecraft:strong_regeneration";
        l.a[50] = "minecraft:strong_swiftness";
        l.a[51] = "minecraft:fire_resistance";
        l.a[52] = "minecraft:strong_poison";
        l.a[53] = "minecraft:strong_healing";
        l.a[54] = "minecraft:night_vision";
        l.a[55] = null;
        l.a[56] = "minecraft:weakness";
        l.a[57] = "minecraft:strong_strength";
        l.a[58] = "minecraft:slowness";
        l.a[59] = "minecraft:strong_leaping";
        l.a[60] = "minecraft:strong_harming";
        l.a[61] = "minecraft:water_breathing";
        l.a[62] = "minecraft:invisibility";
        l.a[63] = null;
        l.a[64] = "minecraft:mundane";
        l.a[65] = "minecraft:long_regeneration";
        l.a[66] = "minecraft:long_swiftness";
        l.a[67] = "minecraft:long_fire_resistance";
        l.a[68] = "minecraft:long_poison";
        l.a[69] = "minecraft:healing";
        l.a[70] = "minecraft:long_night_vision";
        l.a[71] = null;
        l.a[72] = "minecraft:long_weakness";
        l.a[73] = "minecraft:long_strength";
        l.a[74] = "minecraft:long_slowness";
        l.a[75] = "minecraft:long_leaping";
        l.a[76] = "minecraft:harming";
        l.a[77] = "minecraft:long_water_breathing";
        l.a[78] = "minecraft:long_invisibility";
        l.a[79] = null;
        l.a[80] = "minecraft:awkward";
        l.a[81] = "minecraft:long_regeneration";
        l.a[82] = "minecraft:long_swiftness";
        l.a[83] = "minecraft:long_fire_resistance";
        l.a[84] = "minecraft:long_poison";
        l.a[85] = "minecraft:healing";
        l.a[86] = "minecraft:long_night_vision";
        l.a[87] = null;
        l.a[88] = "minecraft:long_weakness";
        l.a[89] = "minecraft:long_strength";
        l.a[90] = "minecraft:long_slowness";
        l.a[91] = "minecraft:long_leaping";
        l.a[92] = "minecraft:harming";
        l.a[93] = "minecraft:long_water_breathing";
        l.a[94] = "minecraft:long_invisibility";
        l.a[95] = null;
        l.a[96] = "minecraft:thick";
        l.a[97] = "minecraft:regeneration";
        l.a[98] = "minecraft:swiftness";
        l.a[99] = "minecraft:long_fire_resistance";
        l.a[100] = "minecraft:poison";
        l.a[101] = "minecraft:strong_healing";
        l.a[102] = "minecraft:long_night_vision";
        l.a[103] = null;
        l.a[104] = "minecraft:long_weakness";
        l.a[105] = "minecraft:strength";
        l.a[106] = "minecraft:long_slowness";
        l.a[107] = "minecraft:leaping";
        l.a[108] = "minecraft:strong_harming";
        l.a[109] = "minecraft:long_water_breathing";
        l.a[110] = "minecraft:long_invisibility";
        l.a[111] = null;
        l.a[112] = null;
        l.a[113] = "minecraft:regeneration";
        l.a[114] = "minecraft:swiftness";
        l.a[115] = "minecraft:long_fire_resistance";
        l.a[116] = "minecraft:poison";
        l.a[117] = "minecraft:strong_healing";
        l.a[118] = "minecraft:long_night_vision";
        l.a[119] = null;
        l.a[120] = "minecraft:long_weakness";
        l.a[121] = "minecraft:strength";
        l.a[122] = "minecraft:long_slowness";
        l.a[123] = "minecraft:leaping";
        l.a[124] = "minecraft:strong_harming";
        l.a[125] = "minecraft:long_water_breathing";
        l.a[126] = "minecraft:long_invisibility";
        l.a[127] = null;
    }

    @Override
    public int a() {
        return 102;
    }

    @Override
    public r a(r r2) {
        block5: {
            int n2;
            block6: {
                int n3;
                block7: {
                    String string;
                    String string2 = m.b();
                    if (!"minecraft:potion".equals(r2.j("id"))) break block5;
                    r r3 = r2.h("tag");
                    n3 = r2.q("Damage");
                    n2 = r3.a("Potion", 8);
                    if (string2 != null) break block6;
                    if (n2 != 0) break block7;
                    String string3 = string = a[n3 & 0x7F];
                    if (string2 == null) {
                        string3 = string3 == null ? "minecraft:water" : string;
                    }
                    r3.a("Potion", string3);
                    r2.a("tag", r3);
                    n2 = n3 & 0x4000;
                    if (string2 != null) break block6;
                    if (n2 == 16384) {
                        r2.a("id", "minecraft:splash_potion");
                    }
                }
                n2 = n3;
            }
            if (n2 == 0) break block5;
            r2.a("Damage", (short)0);
        }
        return r2;
    }
}

