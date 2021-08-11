/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.l;

import net.minecraft.client.l.c;
import net.minecraft.k.h;

public enum f {
    INVERT_MOUSE("options.invertMouse", false, true),
    SENSITIVITY("options.sensitivity", true, false),
    FOV("options.fov", true, false, 30.0f, 110.0f, 1.0f),
    GAMMA("options.gamma", true, false),
    SATURATION("options.saturation", true, false),
    RENDER_DISTANCE("options.renderDistance", true, false, 2.0f, 16.0f, 1.0f),
    VIEW_BOBBING("options.viewBobbing", false, true),
    ANAGLYPH("options.anaglyph", false, true),
    FRAMERATE_LIMIT("options.framerateLimit", true, false, 0.0f, 260.0f, 5.0f),
    FBO_ENABLE("options.fboEnable", false, true),
    RENDER_CLOUDS("options.renderClouds", false, false),
    GRAPHICS("options.graphics", false, false),
    AMBIENT_OCCLUSION("options.ao", false, false),
    GUI_SCALE("options.guiScale", false, false),
    PARTICLES("options.particles", false, false),
    CHAT_VISIBILITY("options.chat.visibility", false, false),
    CHAT_COLOR("options.chat.color", false, true),
    CHAT_LINKS("options.chat.links", false, true),
    CHAT_OPACITY("options.chat.opacity", true, false),
    CHAT_LINKS_PROMPT("options.chat.links.prompt", false, true),
    SNOOPER_ENABLED("options.snooper", false, true),
    USE_FULLSCREEN("options.fullscreen", false, true),
    ENABLE_VSYNC("options.vsync", false, true),
    USE_VBO("options.vbo", false, true),
    TOUCHSCREEN("options.touchscreen", false, true),
    CHAT_SCALE("options.chat.scale", true, false),
    CHAT_WIDTH("options.chat.width", true, false),
    CHAT_HEIGHT_FOCUSED("options.chat.height.focused", true, false),
    CHAT_HEIGHT_UNFOCUSED("options.chat.height.unfocused", true, false),
    MIPMAP_LEVELS("options.mipmapLevels", true, false, 0.0f, 4.0f, 1.0f),
    FORCE_UNICODE_FONT("options.forceUnicodeFont", false, true),
    REDUCED_DEBUG_INFO("options.reducedDebugInfo", false, true),
    ENTITY_SHADOWS("options.entityShadows", false, true),
    MAIN_HAND("options.mainHand", false, false),
    ATTACK_INDICATOR("options.attackIndicator", false, false),
    ENABLE_WEAK_ATTACKS("options.enableWeakAttacks", false, true),
    SHOW_SUBTITLES("options.showSubtitles", false, true),
    REALMS_NOTIFICATIONS("options.realmsNotifications", false, true),
    AUTO_JUMP("options.autoJump", false, true),
    NARRATOR("options.narrator", false, false),
    FOG_FANCY("of.options.FOG_FANCY", false, false),
    FOG_START("of.options.FOG_START", false, false),
    MIPMAP_TYPE("of.options.MIPMAP_TYPE", true, false, 0.0f, 3.0f, 1.0f),
    SMOOTH_FPS("of.options.SMOOTH_FPS", false, false),
    CLOUDS("of.options.CLOUDS", false, false),
    CLOUD_HEIGHT("of.options.CLOUD_HEIGHT", true, false),
    TREES("of.options.TREES", false, false),
    RAIN("of.options.RAIN", false, false),
    ANIMATED_WATER("of.options.ANIMATED_WATER", false, false),
    ANIMATED_LAVA("of.options.ANIMATED_LAVA", false, false),
    ANIMATED_FIRE("of.options.ANIMATED_FIRE", false, false),
    ANIMATED_PORTAL("of.options.ANIMATED_PORTAL", false, false),
    AO_LEVEL("of.options.AO_LEVEL", true, false),
    LAGOMETER("of.options.LAGOMETER", false, false),
    SHOW_FPS("of.options.SHOW_FPS", false, false),
    AUTOSAVE_TICKS("of.options.AUTOSAVE_TICKS", false, false),
    BETTER_GRASS("of.options.BETTER_GRASS", false, false),
    ANIMATED_REDSTONE("of.options.ANIMATED_REDSTONE", false, false),
    ANIMATED_EXPLOSION("of.options.ANIMATED_EXPLOSION", false, false),
    ANIMATED_FLAME("of.options.ANIMATED_FLAME", false, false),
    ANIMATED_SMOKE("of.options.ANIMATED_SMOKE", false, false),
    WEATHER("of.options.WEATHER", false, false),
    SKY("of.options.SKY", false, false),
    STARS("of.options.STARS", false, false),
    SUN_MOON("of.options.SUN_MOON", false, false),
    VIGNETTE("of.options.VIGNETTE", false, false),
    CHUNK_UPDATES("of.options.CHUNK_UPDATES", false, false),
    CHUNK_UPDATES_DYNAMIC("of.options.CHUNK_UPDATES_DYNAMIC", false, false),
    TIME("of.options.TIME", false, false),
    CLEAR_WATER("of.options.CLEAR_WATER", false, false),
    SMOOTH_WORLD("of.options.SMOOTH_WORLD", false, false),
    VOID_PARTICLES("of.options.VOID_PARTICLES", false, false),
    WATER_PARTICLES("of.options.WATER_PARTICLES", false, false),
    RAIN_SPLASH("of.options.RAIN_SPLASH", false, false),
    PORTAL_PARTICLES("of.options.PORTAL_PARTICLES", false, false),
    POTION_PARTICLES("of.options.POTION_PARTICLES", false, false),
    FIREWORK_PARTICLES("of.options.FIREWORK_PARTICLES", false, false),
    PROFILER("of.options.PROFILER", false, false),
    DRIPPING_WATER_LAVA("of.options.DRIPPING_WATER_LAVA", false, false),
    BETTER_SNOW("of.options.BETTER_SNOW", false, false),
    FULLSCREEN_MODE("of.options.FULLSCREEN_MODE", true, false, 0.0f, fU.c().length, 1.0f),
    ANIMATED_TERRAIN("of.options.ANIMATED_TERRAIN", false, false),
    SWAMP_COLORS("of.options.SWAMP_COLORS", false, false),
    RANDOM_MOBS("of.options.RANDOM_MOBS", false, false),
    SMOOTH_BIOMES("of.options.SMOOTH_BIOMES", false, false),
    CUSTOM_FONTS("of.options.CUSTOM_FONTS", false, false),
    CUSTOM_COLORS("of.options.CUSTOM_COLORS", false, false),
    SHOW_CAPES("of.options.SHOW_CAPES", false, false),
    CONNECTED_TEXTURES("of.options.CONNECTED_TEXTURES", false, false),
    CUSTOM_ITEMS("of.options.CUSTOM_ITEMS", false, false),
    AA_LEVEL("of.options.AA_LEVEL", true, false, 0.0f, 16.0f, 1.0f),
    AF_LEVEL("of.options.AF_LEVEL", true, false, 1.0f, 16.0f, 1.0f),
    ANIMATED_TEXTURES("of.options.ANIMATED_TEXTURES", false, false),
    NATURAL_TEXTURES("of.options.NATURAL_TEXTURES", false, false),
    HELD_ITEM_TOOLTIPS("of.options.HELD_ITEM_TOOLTIPS", false, false),
    DROPPED_ITEMS("of.options.DROPPED_ITEMS", false, false),
    LAZY_CHUNK_LOADING("of.options.LAZY_CHUNK_LOADING", false, false),
    CUSTOM_SKY("of.options.CUSTOM_SKY", false, false),
    FAST_MATH("of.options.FAST_MATH", false, false),
    FAST_RENDER("of.options.FAST_RENDER", false, false),
    TRANSLUCENT_BLOCKS("of.options.TRANSLUCENT_BLOCKS", false, false),
    DYNAMIC_FOV("of.options.DYNAMIC_FOV", false, false),
    DYNAMIC_LIGHTS("of.options.DYNAMIC_LIGHTS", false, false),
    ALTERNATE_BLOCKS("of.options.ALTERNATE_BLOCKS", false, false),
    CUSTOM_ENTITY_MODELS("of.options.CUSTOM_ENTITY_MODELS", false, false),
    ADVANCED_TOOLTIPS("of.options.ADVANCED_TOOLTIPS", false, false),
    SCREENSHOT_SIZE("of.options.SCREENSHOT_SIZE", false, false),
    CUSTOM_GUIS("of.options.CUSTOM_GUIS", false, false);

    private final /* synthetic */ boolean e;
    private final /* synthetic */ String c;
    private final /* synthetic */ float d;
    private final /* synthetic */ boolean a;
    private final /* synthetic */ float b;
    private /* synthetic */ float f;

    private float d(float f10) {
        String[] arrstring = net.minecraft.client.l.c.m();
        float f11 = this.b;
        if (arrstring != null) {
            if (f11 > 0.0f) {
                f10 = this.b * (float)Math.round(f10 / this.b);
            }
            f11 = f10;
        }
        return f11;
    }

    public float a() {
        return this.f;
    }

    public float c() {
        return this.d;
    }

    public int e() {
        return this.ordinal();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(float f10) {
        this.f = f10;
    }

    static float b(f f10) {
        return f10.d;
    }

    public boolean b() {
        return this.e;
    }

    public String d() {
        return this.c;
    }

    private f(String string2, boolean bl2, boolean bl3, float f10, float f11, float f12) {
        this.c = string2;
        this.a = bl2;
        this.e = bl3;
        this.d = f10;
        this.f = f11;
        this.b = f12;
    }

    static float a(f f10) {
        return f10.f;
    }

    public float e(float f10) {
        return h.c((this.c(f10) - this.d) / (this.f - this.d), 0.0f, 1.0f);
    }

    public boolean f() {
        return this.a;
    }

    private f(String string2, boolean bl2, boolean bl3) {
        this(string2, bl2, bl3, 0.0f, 1.0f, 0.0f);
    }

    public float b(float f10) {
        return this.c(this.d + (this.f - this.d) * h.c(f10, 0.0f, 1.0f));
    }

    public static f a(int n2) {
        f[] arrf = net.minecraft.client.l.f.values();
        int n3 = arrf.length;
        int n4 = 0;
        String[] arrstring = net.minecraft.client.l.c.m();
        while (n4 < n3) {
            f f10 = arrf[n4];
            if (arrstring != null) {
                if (f10.e() == n2) {
                    return f10;
                }
                ++n4;
            }
            if (arrstring != null) continue;
        }
        return null;
    }

    public float c(float f10) {
        f10 = this.d(f10);
        return h.c(f10, this.d, this.f);
    }
}

