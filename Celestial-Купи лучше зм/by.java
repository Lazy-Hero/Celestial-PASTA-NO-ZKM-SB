/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;

public class by
extends bE {
    public static /* synthetic */ hH k;

    public by() {
        super("Client Font", a5.Hud);
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Comfortaa");
        arrayList.add("SF UI");
        arrayList.add("Verdana");
        arrayList.add("RobotoLight");
        arrayList.add("RobotoRegular");
        arrayList.add("Lato");
        cj.b.f.b(new hH("FontList", (bE)this, "Comfortaa", arrayList));
        k = new hH("Minecraft Font", this, false);
        cj.b.f.b(k);
    }

    @Override
    public void d() {
        this.e();
        super.d();
    }
}

