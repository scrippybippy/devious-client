import java.util.Date;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
public class class348 {
	@ObfuscatedName("az")
	public static final short[] field3729;
	@ObfuscatedName("ah")
	public static final short[][] field3728;
	@ObfuscatedName("af")
	public static final short[] field3727;
	@ObfuscatedName("at")
	public static final short[][] field3726;

	static {
		field3729 = new short[]{6798, 8741, 25238, 4626, 4550};
		field3728 = new short[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010, -22122, 937, 8130, -13422, 30385}, {8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 17050, 0, 127, -31821, -17991}};
		field3727 = new short[]{-10304, 9104, -1, -1, -1};
		field3726 = new short[][]{{6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002, -22116, 945, 8144, -13414, 30389}, {9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019}, new short[0], new short[0], new short[0]};
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-91"
	)
	static void method6643() {
		Tiles.Tiles_underlays = null;
		AccessFile.Tiles_overlays = null;
		Tiles.Tiles_shapes = null;
		Tiles.field1028 = null;
		class168.field1833 = null;
		TextureProvider.Tiles_underlays2 = null;
		class306.field3195 = null;
		World.Tiles_hue = null;
		WorldMapLabelSize.Tiles_saturation = null;
		class539.Tiles_lightness = null;
		Tiles.Tiles_hueMultiplier = null;
		class384.field4473 = null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;I)Z",
		garbageValue = "981035788"
	)
	static boolean method6644(Date var0) {
		Date var1 = class528.method9191();
		return var0.after(var1);
	}
}
