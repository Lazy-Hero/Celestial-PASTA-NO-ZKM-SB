/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.U;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.J.B;
import net.minecraft.J.C;
import net.minecraft.J.D;
import net.minecraft.J.E;
import net.minecraft.J.j;
import net.minecraft.J.l;
import net.minecraft.J.n;
import net.minecraft.J.o;
import net.minecraft.J.p;
import net.minecraft.J.s;
import net.minecraft.J.t;
import net.minecraft.P.r;
import net.minecraft.T.a0;
import net.minecraft.T.a2;
import net.minecraft.T.a3;
import net.minecraft.T.a4;
import net.minecraft.T.a5;
import net.minecraft.T.aD;
import net.minecraft.T.aF;
import net.minecraft.T.aH;
import net.minecraft.T.aN;
import net.minecraft.T.aO;
import net.minecraft.T.aR;
import net.minecraft.T.aS;
import net.minecraft.T.aT;
import net.minecraft.T.aW;
import net.minecraft.T.aX;
import net.minecraft.T.aZ;
import net.minecraft.T.a_;
import net.minecraft.T.ab;
import net.minecraft.T.ad;
import net.minecraft.T.ag;
import net.minecraft.T.ah;
import net.minecraft.T.ai;
import net.minecraft.T.ak;
import net.minecraft.T.am;
import net.minecraft.T.an;
import net.minecraft.T.ao;
import net.minecraft.T.aq;
import net.minecraft.T.ay;
import net.minecraft.T.az;
import net.minecraft.U.A;
import net.minecraft.U.M;
import net.minecraft.U.q;
import net.minecraft.U.x;
import net.minecraft.U.y;
import net.minecraft.ag.F;
import net.minecraft.ag.G;
import net.minecraft.ag.H;
import net.minecraft.ag.I;
import net.minecraft.ag.J;
import net.minecraft.ag.K;
import net.minecraft.ag.L;
import net.minecraft.ag.N;
import net.minecraft.ag.O;
import net.minecraft.ag.P;
import net.minecraft.ag.Q;
import net.minecraft.ag.S;
import net.minecraft.ag.U;
import net.minecraft.ag.V;
import net.minecraft.ag.W;
import net.minecraft.ag.Y;
import net.minecraft.ag.au;
import net.minecraft.ah.z;
import net.minecraft.an.b;
import net.minecraft.ar.v;
import net.minecraft.h.c;
import net.minecraft.h.d;
import net.minecraft.k.m;
import net.minecraft.z.g;
import net.minecraft.z.i;
import net.minecraft.z.k;
import net.minecraft.z.u;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class h {
    private static final /* synthetic */ Logger d;
    public static final /* synthetic */ v b;
    private static final /* synthetic */ List<String> f;
    public static final /* synthetic */ net.minecraft.b.d<v, Class<? extends x>> a;
    public static final /* synthetic */ Set<v> c;
    private static final /* synthetic */ v e;
    public static final /* synthetic */ Map<v, q> g;

    @Nullable
    public static Class<? extends x> a(String string) {
        return a.a(new v(string));
    }

    @Nullable
    public static x a(r r2, z z2) {
        x x2;
        block4: {
            x x3;
            block2: {
                block3: {
                    v v2 = new v(r2.j("id"));
                    x2 = h.a(v2, z2);
                    int[] arrn = M.b();
                    x3 = x2;
                    if (arrn == null) break block2;
                    if (x3 != null) break block3;
                    d.warn("Skipping Entity with id {}", (Object)v2);
                    if (arrn != null) break block4;
                }
                x3 = x2;
            }
            x3.d(r2);
        }
        return x2;
    }

    @Nullable
    public static x a(int n2, z z2) {
        return h.a(h.a(n2), z2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public static x a(@Nullable Class<? extends x> class_, z z2) {
        int[] arrn = M.b();
        Object object = class_;
        if (arrn == null) return (x)object;
        if (object == null) {
            return null;
        }
        try {
            object = class_.getConstructor(z.class).newInstance(z2);
            return (x)object;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public static String a() {
        StringBuilder stringBuilder;
        block2: {
            stringBuilder = new StringBuilder();
            int[] arrn = M.b();
            for (v v2 : h.b()) {
                stringBuilder.append(v2).append(", ");
                if (arrn != null) {
                    if (arrn != null) continue;
                }
                break block2;
            }
            stringBuilder.append(e);
        }
        return stringBuilder.toString();
    }

    private static void a(int n2, String string, Class<? extends x> class_, String string2) {
        block5: {
            int[] arrn = M.b();
            try {
                class_.getConstructor(z.class);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                throw new RuntimeException("Invalid class " + class_ + " no constructor taking " + z.class.getName());
            }
            if ((class_.getModifiers() & 0x400) == 1024) {
                throw new RuntimeException("Invalid abstract class " + class_);
            }
            v v2 = new v(string);
            a.a(n2, v2, class_);
            c.add(v2);
            while (f.size() <= n2) {
                f.add(null);
                if (arrn != null) {
                    if (arrn != null) continue;
                }
                break block5;
            }
            f.set(n2, string2);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(x x2, v v2) {
        v v3 = h.a(x2.getClass());
        int[] arrn = M.b();
        v v4 = v3;
        if (arrn == null) return v4.equals(v2);
        if (v4 != null) {
            v4 = v3;
            return v4.equals(v2);
        }
        boolean bl2 = x2 instanceof net.minecraft.i.j;
        if (arrn != null) {
            if (bl2) {
                return e.equals(v2);
            }
            bl2 = x2 instanceof b;
        }
        if (arrn != null) {
            if (!bl2) return false;
            bl2 = b.equals(v2);
        }
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Nullable
    public static x a(v v2, z z2) {
        return h.a(a.a(v2), z2);
    }

    @Nullable
    public static Class<? extends x> a(int n2) {
        return a.a((v)n2);
    }

    public static Set<v> b() {
        return c;
    }

    protected static q a(String string, int n2, int n3) {
        v v2 = new v(string);
        return g.put(v2, new q(v2, n2, n3));
    }

    @Nullable
    public static String b(x x2) {
        int n2 = a.c(x2.getClass());
        return n2 == -1 ? null : f.get(n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean b(v v2) {
        int[] arrn = M.b();
        boolean bl2 = e.equals(v2);
        if (arrn == null) return bl2;
        if (bl2) return true;
        bl2 = h.b().contains(v2);
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Nullable
    public static v a(Class<? extends x> class_) {
        return a.b(class_);
    }

    @Nullable
    public static v a(x x2) {
        return h.a(x2.getClass());
    }

    static {
        b = new v("lightning_bolt");
        e = new v("player");
        d = LogManager.getLogger();
        a = new net.minecraft.b.d();
        g = Maps.newLinkedHashMap();
        c = Sets.newHashSet();
        f = Lists.newArrayList();
    }

    public static void c() {
        h.a(1, "item", t.class, "Item");
        h.a(2, "xp_orb", E.class, "XPOrb");
        h.a(3, "area_effect_cloud", y.class, "AreaEffectCloud");
        h.a(4, "elder_guardian", a_.class, "ElderGuardian");
        h.a(5, "wither_skeleton", a2.class, "WitherSkeleton");
        h.a(6, "stray", ak.class, "Stray");
        h.a(7, "egg", net.minecraft.z.s.class, "ThrownEgg");
        h.a(8, "leash_knot", A.class, "LeashKnot");
        h.a(9, "painting", net.minecraft.J.m.class, "Painting");
        h.a(10, "arrow", net.minecraft.z.h.class, "Arrow");
        h.a(11, "snowball", u.class, "Snowball");
        h.a(12, "fireball", net.minecraft.z.l.class, "Fireball");
        h.a(13, "small_fireball", net.minecraft.z.m.class, "SmallFireball");
        h.a(14, "ender_pearl", net.minecraft.J.F.class, "ThrownEnderpearl");
        h.a(15, "eye_of_ender_signal", net.minecraft.J.q.class, "EyeOfEnderSignal");
        h.a(16, "potion", net.minecraft.z.t.class, "ThrownPotion");
        h.a(17, "xp_bottle", net.minecraft.J.G.class, "ThrownExpBottle");
        h.a(18, "item_frame", l.class, "ItemFrame");
        int[] arrn = M.b();
        h.a(19, "wither_skull", net.minecraft.z.n.class, "WitherSkull");
        h.a(20, "tnt", D.class, "PrimedTnt");
        h.a(21, "falling_block", net.minecraft.J.r.class, "FallingSand");
        h.a(22, "fireworks_rocket", s.class, "FireworksRocketEntity");
        h.a(23, "husk", aO.class, "Husk");
        h.a(24, "spectral_arrow", g.class, "SpectralArrow");
        h.a(25, "shulker_bullet", net.minecraft.z.q.class, "ShulkerBullet");
        h.a(26, "dragon_fireball", k.class, "DragonFireball");
        h.a(27, "zombie_villager", ag.class, "ZombieVillager");
        h.a(28, "skeleton_horse", J.class, "SkeletonHorse");
        h.a(29, "zombie_horse", K.class, "ZombieHorse");
        h.a(30, "armor_stand", n.class, "ArmorStand");
        h.a(31, "donkey", F.class, "Donkey");
        h.a(32, "mule", H.class, "Mule");
        h.a(33, "evocation_fangs", i.class, "EvocationFangs");
        h.a(34, "evocation_illager", ao.class, "EvocationIllager");
        h.a(35, "vex", aS.class, "Vex");
        h.a(36, "vindication_illager", aT.class, "VindicationIllager");
        h.a(37, "illusion_illager", aD.class, "IllusionIllager");
        h.a(40, "commandblock_minecart", net.minecraft.J.v.class, j.COMMAND_BLOCK.e());
        h.a(41, "boat", o.class, "Boat");
        h.a(42, "minecart", net.minecraft.J.z.class, j.RIDEABLE.e());
        h.a(43, "chest_minecart", net.minecraft.J.x.class, j.CHEST.e());
        h.a(44, "furnace_minecart", net.minecraft.J.A.class, j.FURNACE.e());
        h.a(45, "tnt_minecart", C.class, j.TNT.e());
        h.a(46, "hopper_minecart", net.minecraft.J.y.class, j.HOPPER.e());
        int[] arrn2 = arrn;
        h.a(47, "spawner_minecart", B.class, j.SPAWNER.e());
        h.a(50, "creeper", aR.class, "Creeper");
        h.a(51, "skeleton", ay.class, "Skeleton");
        h.a(52, "spider", am.class, "Spider");
        h.a(53, "giant", az.class, "Giant");
        h.a(54, "zombie", a4.class, "Zombie");
        h.a(55, "slime", ai.class, "Slime");
        h.a(56, "ghast", aZ.class, "Ghast");
        h.a(57, "zombie_pigman", aN.class, "PigZombie");
        h.a(58, "enderman", ah.class, "Enderman");
        h.a(59, "cave_spider", ab.class, "CaveSpider");
        h.a(60, "silverfish", a3.class, "Silverfish");
        h.a(61, "blaze", aW.class, "Blaze");
        h.a(62, "magma_cube", ad.class, "LavaSlime");
        h.a(63, "ender_dragon", d.class, "EnderDragon");
        h.a(64, "wither", c.class, "WitherBoss");
        h.a(65, "bat", Y.class, "Bat");
        h.a(66, "witch", a5.class, "Witch");
        h.a(67, "endermite", aq.class, "Endermite");
        h.a(68, "guardian", a0.class, "Guardian");
        h.a(69, "shulker", aF.class, "Shulker");
        h.a(90, "pig", O.class, "Pig");
        h.a(91, "sheep", Q.class, "Sheep");
        h.a(92, "cow", net.minecraft.ag.M.class, "Cow");
        h.a(93, "chicken", L.class, "Chicken");
        h.a(94, "squid", au.class, "Squid");
        h.a(95, "wolf", V.class, "Wolf");
        h.a(96, "mooshroom", N.class, "MushroomCow");
        h.a(97, "snowman", an.class, "SnowMan");
        h.a(98, "ocelot", S.class, "Ozelot");
        h.a(99, "villager_golem", aX.class, "VillagerGolem");
        h.a(100, "horse", I.class, "Horse");
        h.a(101, "rabbit", P.class, "Rabbit");
        h.a(102, "polar_bear", aH.class, "PolarBear");
        h.a(103, "llama", G.class, "Llama");
        h.a(104, "llama_spit", net.minecraft.z.p.class, "LlamaSpit");
        h.a(105, "parrot", U.class, "Parrot");
        h.a(120, "villager", W.class, "Villager");
        h.a(200, "ender_crystal", p.class, "EnderCrystal");
        h.a("bat", 4996656, 986895);
        h.a("blaze", 16167425, 16775294);
        h.a("cave_spider", 803406, 11013646);
        h.a("chicken", 0xA1A1A1, 0xFF0000);
        h.a("cow", 4470310, 0xA1A1A1);
        h.a("creeper", 894731, 0);
        h.a("donkey", 5457209, 8811878);
        h.a("elder_guardian", 13552826, 7632531);
        h.a("enderman", 0x161616, 0);
        h.a("endermite", 0x161616, 0x6E6E6E);
        h.a("evocation_illager", 0x959B9B, 1973274);
        h.a("ghast", 0xF9F9F9, 0xBCBCBC);
        h.a("guardian", 5931634, 15826224);
        h.a("horse", 12623485, 0xEEE500);
        h.a("husk", 7958625, 15125652);
        h.a("llama", 12623485, 10051392);
        h.a("magma_cube", 0x340000, 0xFCFC00);
        h.a("mooshroom", 10489616, 0xB7B7B7);
        h.a("mule", 1769984, 5321501);
        h.a("ocelot", 15720061, 5653556);
        h.a("parrot", 894731, 0xFF0000);
        h.a("pig", 15771042, 14377823);
        h.a("polar_bear", 0xF2F2F2, 0x959590);
        h.a("rabbit", 10051392, 7555121);
        h.a("sheep", 0xE7E7E7, 0xFFB5B5);
        h.a("shulker", 9725844, 5060690);
        h.a("silverfish", 0x6E6E6E, 0x303030);
        h.a("skeleton", 0xC1C1C1, 0x494949);
        h.a("skeleton_horse", 6842447, 15066584);
        h.a("slime", 5349438, 8306542);
        h.a("spider", 3419431, 11013646);
        h.a("squid", 2243405, 7375001);
        h.a("stray", 0x617677, 0xDDEAEA);
        h.a("vex", 8032420, 15265265);
        h.a("villager", 5651507, 12422002);
        h.a("vindication_illager", 0x959B9B, 2580065);
        h.a("witch", 0x340000, 5349438);
        h.a("wither_skeleton", 0x141414, 0x474D4D);
        h.a("wolf", 0xD7D3D3, 13545366);
        h.a("zombie", 44975, 7969893);
        h.a("zombie_horse", 3232308, 9945732);
        h.a("zombie_pigman", 15373203, 5009705);
        h.a("zombie_villager", 5651507, 7969893);
        c.add(b);
        if (arrn2 == null) {
            m.b(!m.c());
        }
    }

    @Nullable
    public static String a(@Nullable v v2) {
        int n2 = a.c(a.a(v2));
        return n2 == -1 ? null : f.get(n2);
    }
}

