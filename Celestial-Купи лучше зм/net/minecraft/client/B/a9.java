/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.lwjgl.input.Keyboard
 */
package net.minecraft.client.b;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import net.minecraft.aA.t;
import net.minecraft.ar.v;
import net.minecraft.client.D.h;
import net.minecraft.client.b.L;
import net.minecraft.client.b.T;
import net.minecraft.client.b.aj;
import net.minecraft.client.b.aq;
import net.minecraft.client.b.bC;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import org.lwjgl.input.Keyboard;

public class a9
extends L {
    private /* synthetic */ String E;
    private /* synthetic */ bC B;
    private /* synthetic */ s C;
    private static final /* synthetic */ List<aj> z;
    protected /* synthetic */ String A;
    private /* synthetic */ String y;
    private /* synthetic */ aq F;
    private final /* synthetic */ T D;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean c() {
        String[] arrstring = q.b();
        int n2 = this.B.x;
        int n3 = -1;
        if (arrstring != null) {
            if (n2 > n3) {
                n2 = this.B.x;
                if (arrstring == null) return n2 != 0;
                if (n2 < z.size()) return 1 != 0;
            }
            n2 = this.F.n().length();
            if (arrstring == null) return n2 != 0;
            n3 = 1;
        }
        if (n2 <= n3) return 0 != 0;
        return 1 != 0;
    }

    public void a() {
        this.C.h = this.c();
    }

    static aq a(a9 a92) {
        return a92.F;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public a9(T t2) {
        this.A = "Customize World Presets";
        this.D = t2;
    }

    @Override
    public void a(int n2, int n3, float f10) {
        this.n();
        this.B.b(n2, n3, f10);
        this.b(this.v, this.A, h / 2, 8, 0xFFFFFF);
        this.a(this.v, this.y, 50, 30, 0xA0A0A0);
        this.a(this.v, this.E, 50, 70, 0xA0A0A0);
        this.F.d();
        super.a(n2, n3, f10);
    }

    static bC b(a9 a92) {
        return a92.B;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    protected void a(s var1_1) throws IOException {
        var2_2 = q.b();
        if (var2_2 == null) ** GOTO lbl7
        switch (var1_1.g) {
            case 0: {
                this.D.a(this.F.n());
                this.m.a(this.D);
lbl7:
                // 2 sources

                if (var2_2 != null) return;
            }
            case 1: {
                this.m.a(this.D);
                return;
            }
        }
    }

    @Override
    public void h() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    @Override
    public void e() {
        this.F.i();
        super.e();
    }

    static {
        z = Lists.newArrayList();
        t t2 = net.minecraft.aA.t.a("{ \"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":5000.0, \"mainNoiseScaleY\":1000.0, \"mainNoiseScaleZ\":5000.0, \"baseSize\":8.5, \"stretchY\":8.0, \"biomeDepthWeight\":2.0, \"biomeDepthOffset\":0.5, \"biomeScaleWeight\":2.0, \"biomeScaleOffset\":0.375, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":255 }");
        v v2 = new v("textures/gui/presets/water.png");
        z.add(new aj(net.minecraft.client.D.h.a("createWorld.customize.custom.preset.waterWorld", new Object[0]), v2, t2));
        t2 = net.minecraft.aA.t.a("{\"coordinateScale\":3000.0, \"heightScale\":6000.0, \"upperLimitScale\":250.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":10.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }");
        v2 = new v("textures/gui/presets/isles.png");
        z.add(new aj(net.minecraft.client.D.h.a("createWorld.customize.custom.preset.isleLand", new Object[0]), v2, t2));
        t2 = net.minecraft.aA.t.a("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":5000.0, \"mainNoiseScaleY\":1000.0, \"mainNoiseScaleZ\":5000.0, \"baseSize\":8.5, \"stretchY\":5.0, \"biomeDepthWeight\":2.0, \"biomeDepthOffset\":1.0, \"biomeScaleWeight\":4.0, \"biomeScaleOffset\":1.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }");
        v2 = new v("textures/gui/presets/delight.png");
        z.add(new aj(net.minecraft.client.D.h.a("createWorld.customize.custom.preset.caveDelight", new Object[0]), v2, t2));
        t2 = net.minecraft.aA.t.a("{\"coordinateScale\":738.41864, \"heightScale\":157.69133, \"upperLimitScale\":801.4267, \"lowerLimitScale\":1254.1643, \"depthNoiseScaleX\":374.93652, \"depthNoiseScaleZ\":288.65228, \"depthNoiseScaleExponent\":1.2092624, \"mainNoiseScaleX\":1355.9908, \"mainNoiseScaleY\":745.5343, \"mainNoiseScaleZ\":1183.464, \"baseSize\":1.8758626, \"stretchY\":1.7137525, \"biomeDepthWeight\":1.7553768, \"biomeDepthOffset\":3.4701107, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":2.535211, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }");
        v2 = new v("textures/gui/presets/madness.png");
        z.add(new aj(net.minecraft.client.D.h.a("createWorld.customize.custom.preset.mountains", new Object[0]), v2, t2));
        t2 = net.minecraft.aA.t.a("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":1000.0, \"mainNoiseScaleY\":3000.0, \"mainNoiseScaleZ\":1000.0, \"baseSize\":8.5, \"stretchY\":10.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":20 }");
        v2 = new v("textures/gui/presets/drought.png");
        z.add(new aj(net.minecraft.client.D.h.a("createWorld.customize.custom.preset.drought", new Object[0]), v2, t2));
        t2 = net.minecraft.aA.t.a("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":2.0, \"lowerLimitScale\":64.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":12.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":6 }");
        v2 = new v("textures/gui/presets/chaos.png");
        z.add(new aj(net.minecraft.client.D.h.a("createWorld.customize.custom.preset.caveChaos", new Object[0]), v2, t2));
        t2 = net.minecraft.aA.t.a("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":12.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":true, \"seaLevel\":40 }");
        v2 = new v("textures/gui/presets/luck.png");
        z.add(new aj(net.minecraft.client.D.h.a("createWorld.customize.custom.preset.goodLuck", new Object[0]), v2, t2));
    }

    @Override
    public void k() throws IOException {
        super.k();
        this.B.f();
    }

    @Override
    protected void a(char c10, int n2) throws IOException {
        block3: {
            a9 a92;
            block2: {
                String[] arrstring = q.b();
                a92 = this;
                if (arrstring == null) break block2;
                if (a92.F.a(c10, n2)) break block3;
                a92 = this;
            }
            super.a(c10, n2);
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) throws IOException {
        this.F.a(n2, n3, n4);
        super.a(n2, n3, n4);
    }

    static List b() {
        return z;
    }

    @Override
    public void r() {
        this.t.clear();
        Keyboard.enableRepeatEvents((boolean)true);
        this.A = net.minecraft.client.D.h.a("createWorld.customize.custom.presets.title", new Object[0]);
        this.y = net.minecraft.client.D.h.a("createWorld.customize.presets.share", new Object[0]);
        this.E = net.minecraft.client.D.h.a("createWorld.customize.presets.list", new Object[0]);
        this.F = new aq(2, this.v, 50, 40, h - 100, 20);
        this.B = new bC(this);
        this.F.b(2000);
        this.F.a(this.D.c());
        this.C = this.b(new s(0, h / 2 - 102, w - 27, 100, 20, net.minecraft.client.D.h.a("createWorld.customize.presets.select", new Object[0])));
        this.t.add(new s(1, h / 2 + 3, w - 27, 100, 20, net.minecraft.client.D.h.a("gui.cancel", new Object[0])));
        this.a();
    }
}

