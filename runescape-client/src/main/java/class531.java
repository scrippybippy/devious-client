import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uv")
final class class531 implements class530 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lvp;I)V",
		garbageValue = "50536898"
	)
	public void vmethod9425(Object var1, Buffer var2) {
		this.method9388((Integer)var1, var2);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)Ljava/lang/Object;",
		garbageValue = "25"
	)
	public Object vmethod9426(Buffer var1) {
		return var1.readInt();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lvp;I)V",
		garbageValue = "-347601509"
	)
	void method9388(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}
}
