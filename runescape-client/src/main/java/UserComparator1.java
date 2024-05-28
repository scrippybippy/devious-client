import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vq")
@Implements("UserComparator1")
public class UserComparator1 implements Comparator {
	@ObfuscatedName("ak")
	@Export("reversed")
	final boolean reversed;

	public UserComparator1(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lsg;Lsg;I)I",
		garbageValue = "580704417"
	)
	@Export("compare_bridged")
	int compare_bridged(User var1, User var2) {
		return this.reversed ? var1.compareTo_user(var2) : var2.compareTo_user(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((User)var1, (User)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
