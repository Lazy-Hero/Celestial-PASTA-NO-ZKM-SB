/*
 * Decompiled with CFR 0.150.
 */
public enum cx {
    ANTIALIASING("of.options.shaders.ANTIALIASING", "antialiasingLevel", "0"),
    NORMAL_MAP("of.options.shaders.NORMAL_MAP", "normalMapEnabled", "true"),
    SPECULAR_MAP("of.options.shaders.SPECULAR_MAP", "specularMapEnabled", "true"),
    RENDER_RES_MUL("of.options.shaders.RENDER_RES_MUL", "renderResMul", "1.0"),
    SHADOW_RES_MUL("of.options.shaders.SHADOW_RES_MUL", "shadowResMul", "1.0"),
    HAND_DEPTH_MUL("of.options.shaders.HAND_DEPTH_MUL", "handDepthMul", "0.125"),
    CLOUD_SHADOW("of.options.shaders.CLOUD_SHADOW", "cloudShadow", "true"),
    OLD_HAND_LIGHT("of.options.shaders.OLD_HAND_LIGHT", "oldHandLight", "default"),
    OLD_LIGHTING("of.options.shaders.OLD_LIGHTING", "oldLighting", "default"),
    SHADER_PACK("of.options.shaders.SHADER_PACK", "shaderPack", ""),
    TWEAK_BLOCK_DAMAGE("of.options.shaders.TWEAK_BLOCK_DAMAGE", "tweakBlockDamage", "false"),
    SHADOW_CLIP_FRUSTRUM("of.options.shaders.SHADOW_CLIP_FRUSTRUM", "shadowClipFrustrum", "true"),
    TEX_MIN_FIL_B("of.options.shaders.TEX_MIN_FIL_B", "TexMinFilB", "0"),
    TEX_MIN_FIL_N("of.options.shaders.TEX_MIN_FIL_N", "TexMinFilN", "0"),
    TEX_MIN_FIL_S("of.options.shaders.TEX_MIN_FIL_S", "TexMinFilS", "0"),
    TEX_MAG_FIL_B("of.options.shaders.TEX_MAG_FIL_B", "TexMagFilB", "0"),
    TEX_MAG_FIL_N("of.options.shaders.TEX_MAG_FIL_N", "TexMagFilN", "0"),
    TEX_MAG_FIL_S("of.options.shaders.TEX_MAG_FIL_S", "TexMagFilS", "0");

    private /* synthetic */ String b;
    private /* synthetic */ String c;
    private /* synthetic */ String d;

    private cx(String string2, String string3, String string4) {
        this.d = null;
        this.b = null;
        this.c = null;
        this.d = string2;
        this.b = string3;
        this.c = string4;
    }

    public String b() {
        return this.c;
    }

    public String a() {
        return this.d;
    }

    public String c() {
        return this.b;
    }
}

