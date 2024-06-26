import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bu")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	static Fonts field236;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 568504197
	)
	@Export("id")
	int id;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2002955959
	)
	@Export("size")
	int size;
	@ObfuscatedName("ag")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("ak")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("ap")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("an")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("aj")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("av")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lvf;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) {
			var2 = (RunException)var0;
			var2.message = var2.message + ' ' + var1;
		} else {
			var2 = new RunException(var0, var1);
		}

		return var2;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "961864563"
	)
	static int method713(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Strings.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var9 = TextureProvider.worldListStart();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var9 = World.getNextWorldListWorld();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
					var7 = null;

					for (var8 = 0; var8 < World.World_count; ++var8) {
						if (var3 == class357.World_worlds[var8].id) {
							var7 = class357.World_worlds[var8];
							break;
						}
					}

					if (var7 != null) {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					class130.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1] == 1;
					var8 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 3] == 1;
					class171.sortWorldList(var3, var10, var8, var6);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							class130.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
							var5 = ApproximateRouteStrategy.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = class76.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class76.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							class130.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
							var5 = ApproximateRouteStrategy.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = HttpRequest.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = HttpRequest.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							class130.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
							var5 = ApproximateRouteStrategy.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = class164.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class164.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							class130.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
							var5 = ApproximateRouteStrategy.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = Client.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.clientType;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--class337.Interpreter_stringStackSize;
							--class130.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--class337.Interpreter_stringStackSize;
							--class130.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.field506;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
					if (var3 >= 0 && var3 < World.World_count) {
						var7 = class357.World_worlds[var3];
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				}
			}
		}
	}
}
